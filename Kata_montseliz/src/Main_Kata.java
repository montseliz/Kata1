import java.util.Arrays;

public class Main_Kata {
	
	public static void main(String[] args) {
		int[] arrayRandomNumbers = new int[20];  
		
		for (int i = 0; i < arrayRandomNumbers.length ; i++) {
			arrayRandomNumbers[i] = (int) (Math.random()*100);;   
		}
		
		System.out.println("Array de 20 números aleatories entre 0 i 100: " + Arrays.toString(arrayRandomNumbers));
		
		System.out.println("Array ordenat amb els números parells primer y després els senars: " + listSort(arrayRandomNumbers));
	
	}
	
	public static String listSort (int[] arrayRandomNumbers) {
		int[] arraySort = new int [arrayRandomNumbers.length];
		int indexEven = 0; 
		int indexOdd = arrayRandomNumbers.length-1; 
		
		for (int i = 0; i < arrayRandomNumbers.length; i++) {
			if (arrayRandomNumbers[i] % 2 == 0) {
				arraySort[indexEven] = arrayRandomNumbers[i]; 
				indexEven++; 
			} else {
				arraySort[indexOdd] = arrayRandomNumbers[i]; 
				indexOdd--; 
			}
		}
		return Arrays.toString(arraySort);  
	}
}
