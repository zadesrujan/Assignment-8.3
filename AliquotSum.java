package sum;
//here we cretaed pacakage as sum which that organizes a set of related classes and interfaces.
public class AliquotSum {

	public static void main(String[] args) {
		//public : it can be called from anywhere.
		//static : doesn't belong to a specific object.
		//void : returns to no value.
		//main : is special because it will start the program.
		// TODO Auto-generated method stub
		int number = 21;  
		// here i have take an integer type of variable to check weather it is perfect number or not 
		 long aliquotSum = findAliquotSum(number);   
		 //here declaring a long data type which is of 8bytes and inserting argument in the method
		
		System.out.println("Aliquot Sum of " + aliquotSum + " is " + aliquotSum + ".");
		//system : is a class in java language pacakge.
		//out : static member of the system class.
		//println : to print what is output.
		     // here  we are applying if & else condition to check the condition
		if(aliquotSum == number){          
			//if aliquotSum equals to number then it prints if condition otherwise it prints else statement
			System.out.println(number + " is a perfect number.");//systemm is used to return code
			//out is a sta//systetic number
			//Println is used to print text and gives output
			//hence it prints the is a perfect number text
		}else{
			System.out.println(number + " is not a perfect number.");//systemm is used to return code
			//system : is a class in java language pacakge.
			//out : static member of the system class.
			//println : to print what is output.
			//hence it prints the is not a perfect number text
		}
		
		                                                        
		System.out.println("Perfect Numbers between 1 to 100 are: ");   
		   //here we are initializing the number between 1 to 100
		for(int i=1; i<=100; i++){
			number = i; 
			//taking number equal to i
			if(findAliquotSum(i) == number){    
				//  it checks the perfect numbers from 1 to 100
				System.out.print(number + " ");
				//system : is a class in java language pacakge.
				//out : static member of the system class.
				//println : to print what is output.
				
			}
		}
	}
                                       
	// here we are implemented the Method for finding the  aliquot sum
	public static long findAliquotSum(int n) {
		int show = 0; 
		// here we have taken integer data type of variable show 

		for (byte i = 1; i <= (n / 2); i++) {  
			//here it checks the condition of a number and adds the sum of divisors   
			if (n % i == 0) {
				//i equal to zero declaring in if loop
				show += i;
				//show plus equal to i
			}
		}
		return show;
		//returning 
	}





	}


