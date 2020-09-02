/*	
 * 	File:				PrintVertical.java
 * 	Associated Files:	
 * 	Packages Needed:	java.util.Scanner
 * 	Author:            	Michael Ngo (https://github.com/yeeshue99)
 * 	Date Modified:      9/1/2020 by Michael Ngo
 * 	Modified By:        Michael Ngo
 * 
 * 	Purpose:			Take in an input string, then vertically print
                            every character
 */

import java.util.Scanner;

/*
 * Class:				PrintVertical
 * Purpose:				Run the code
 * Methods:				main
 */
public class PrintVertical {
	
	/*
	 * Function:			main 
	 * Params: 				commandLineArguments(String[]) {Not used}
	 * Purpose:				Handle overhead for vertical printing
	 * Returns: 			
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String sentence;
		System.out.print("Please enter a sentence: ");
		sentence = sc.nextLine();
		sc.close();
		System.out.println("\nyour sentence printed vertically is:");
		vertical(sentence);
    }

	/*
	 * Function:			vertical
	 * Params: 				sentence to print out(String)
	 * Purpose:				Prints out a sentence vertically
	 * Returns: 			
	 */
	private static void vertical(String sentence){
		for (char letter : sentence.toCharArray()){
			System.out.println(letter);
		}
	}
}