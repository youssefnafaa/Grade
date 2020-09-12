
/*
 * Author : Youssef NAFAA
 * College: Cambrian
 * Date   : September 12/2020
 * Program: Giving the user's name and his grade in float type
 * The result will show the grade in letter 
 */
import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Your Name: ");
		String name = scanner.nextLine();
		float grade = 0f;
		boolean nbrIsValid = true;
		do {
			System.out.print("Enter Your grade: ");
			grade = scanner.nextFloat();
			if (grade < 0) {
				System.out.println("The grade cannot be negative");
				nbrIsValid = false;
				continue;
			}
			if (grade > 100) {
				System.out.println("The grade cannot be > 100");
				nbrIsValid = false;
				continue;
			}
			nbrIsValid = true;
		} while (nbrIsValid == false);

		implementLetterGrade(name, grade);
		scanner.close();
	}

	// Function that will print the name and the letter grade after making
	// tests on the value of the grade

	private static void implementLetterGrade(String name, float grade) {
		float awayToNextLevel = 0;
		char gradeLetter = 'I';
		String phrase = "";
		if (grade >= 80) {
			phrase = "WOW!! Congratulations!!!! ";
			gradeLetter = 'A';
		} else if (grade >= 70 && grade < 80) {
			phrase = "Good Job!!! Keep Going!!";
			gradeLetter = 'B';
			awayToNextLevel = 80 - grade;
		} else if (grade >= 60 && grade < 70) {
			phrase = "Not Bad But Try To Do Better";
			gradeLetter = 'C';
			awayToNextLevel = 70 - grade;
		} else if (grade >= 50 && grade < 60) {
			phrase = "More Effort To Make, Yes You Can!!";
			gradeLetter = 'D';
			awayToNextLevel = 60 - grade;
		} else if (grade >= 0 && grade < 50) {
			phrase = "Never Too Late To Do Well!! But You Have To Take It Seriously!!";
			gradeLetter = 'F';
			awayToNextLevel = 50 - grade;
		}

		System.out.print("Hi " + name + " Your grade Letter is: ");
		System.out.print(gradeLetter);
		System.out.println();
		System.out.println(phrase);
		if (grade < 80)
			System.out.println("You are " + awayToNextLevel + " away to get to the next level");
	}
}
