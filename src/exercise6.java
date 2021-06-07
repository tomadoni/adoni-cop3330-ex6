/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Tom Adoni
 */
import java.time.Year;
import java.util.Scanner;
class Main {

    public static void main(String[] args) {
	    Scanner kb= new Scanner(System.in);
	    int x=0;
	    int y=0;
		int year = Year.now().getValue();
	    System.out.println("What is your current age?");
	    x=kb.nextInt();
	    System.out.println("At what age would you like to retire?");
	    y=kb.nextInt();
	    System.out.println("You have "+(y-x)+" years left until you can retire.");
	    System.out.println("It's "+year+", so you can retire in "+(year+(y-x)));
    }
}
