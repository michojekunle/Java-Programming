package chapterTwo.Exercises;

import java.util.Scanner;

public class DiameterCircumferenceAndAreaOfACircle {
	
	public static void main(String[] args){
	
//
//		Here’s a peek ahead. In this chapter, you
//		learned about integers and the type int. Java can also represent floating-point numbers that contain
//		decimal points, such as 3.14159. Write an application that inputs from the user the radius of a circle
//		as an integer and prints the circle’s diameter, circumference and area using the floating-point value
//		3.14159 for π. Use the techniques shown in Fig. 2.7. [Note: You may also use the predefined constant Math.PI for the value of π. This constant is more precise than the value 3.14159. Class Math
//		is defined in package java.lang. Classes in that package are imported automatically, so you do not
//		need to import class Math to use it.] Use the following formulas (r is the radius):
//		diameter = 2r circumference = 2πr area = πr2
//		Do not store the results of each calculation in a variable. Rather, specify each calculation as the
//		value that will be output in a System.out.printf statement. The values produced by the circumference and area calculations are floating-point numbers. Such values can be output with the format specifier %f in a System.out.printf statement. You’ll learn more about floating-point
//		numbers in Chapter 3.
	
		
		Scanner userInput = new Scanner(System.in);
		
		int radius;
//		int secondInteger;
		
		System.out.print("Enter radius of a circle: ");
		radius = userInput.nextInt();
		
		double diameter = 2 * radius;
		
		double area = 3.14159 * (radius ^ 2);
		
		double circumference = 2 * 3.14159 * radius;
		
		
		
	}
}
