package questionnaire;

import java.util.Scanner;

public class info {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		String [] names = {"Nobody","Mary", "Peter", "Bob", "Ann"};
		String [] hometown = {"Nowhere", "Little Lamb", "Neverland", "nowhere special", "Normal, IL"};
		String [] food = {"..not sure. Air?", "muffins.","pizza.","burgers.","dry bread with no butter."};
		String reply = "";
		do {
			System.out.println("Welcome to our Java Class! "
		
				+ "Which student would you like to know more about? Enter (1-4):");
				int x = getValidNumberInRange(0, 4);			
				//x = sc.nextInt();
		
		System.out.println("Student " + x + " is " + names[x]+ ". " +
		"What would you like to know? Type \"fav food\" or \"hometown\":");
				reply = readValidString("hometown","fav food");
				
	
		
		if (reply.equalsIgnoreCase("hometown")){
			System.out.println(names[x] + "'s hometown is " + hometown[x]);
		}	else if (reply.equalsIgnoreCase("fav food")){
			System.out.println(names[x] + "'s favorite food is " + food[x]);
		}  System.out.println("Would you like to know more info? Type yes or no:");
			reply = readValidString("yes","no");
		} while (reply.equalsIgnoreCase("yes"));
		System.out.println("Ok bye Felicia!");
	
	} 
	public static int readValidNumero(){
		int x = 0;
	while (!sc.hasNextInt()){
		
		System.out.println("Wow are you serious bro? Try again. Use your numbers:");
		sc.nextLine();
	} 
		x = sc.nextInt();
		sc.nextLine();
		return x;
}

	public static int getValidNumberInRange(int min, int max)
	{
		int input = readValidNumero();
		
		
		while (input < min || input > max)
		{
			System.out.println("Please don't be stupid. Enter from 1 to 4 please:");
			
			input = readValidNumero();
		} return input;
	}

	public static String readValidString(String x, String y){
		String input = sc.nextLine();
		while (!(input.equalsIgnoreCase(x) || input.equalsIgnoreCase(y))){
			
			System.out.println("That data isn't there bruh. Try again:");
			input=sc.nextLine();
		} 
			return input;
	}

}