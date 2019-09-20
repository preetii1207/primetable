package com.sample.test.prime;

/**
 * Hello world!
 *
 */
public class PrimeTable {
	public static void main(String[] args) {
		int[] arr = {1,2,3,5,7,11,13,17,23,29};
		printMultiplicationTable(arr);

	}

	private static void printMultiplicationTable(int[] numbers) {
		System.out.print("	");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + "	");
		}
		System.out.println();
		for (int i = 0; i < numbers.length; i++) {
			
			System.out.print(numbers[i] + "	");
			for (int j = 0; j < numbers.length; j++) {
				
				System.out.print(numbers[i] * numbers[j] + "	");
				
			}
			System.out.println();
		}
	}

}
