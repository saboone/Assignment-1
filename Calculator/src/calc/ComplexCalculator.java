//Sybil Boone SI 543 Assignment #1 worked with Jackie Wolf, Lily Samimi//

package calc;

public class ComplexCalculator {

	private double currentNumber;
	
	// constructor
	public ComplexCalculator(double d) {
		currentNumber = d;
	}
	
	// adds d to current number
	public void add(double d) {
		currentNumber = currentNumber + d;
	}
	
	// subtract()
	// TODO subtracts d from current number 
	
	public void subtract(double d){
		currentNumber = currentNumber - d;
	}

	// multiply()
	// TODO multiplies current number by d
	
	public void multiply(double d){
		currentNumber = currentNumber * d;
	}
	// divide()
	// TODO divides current number by a given number
	
	public void divide(double d){
		currentNumber = currentNumber / d;
	}
	// clear()
	// TODO sets current number to 0
	
	public void clear(){
		currentNumber = 0;
	}
	public void power (int d){
		currentNumber = Math.pow(currentNumber,  d);
	}
	// power()
	// TODO raises current number to the power of a given number
	
	public double getCurrentNumber() {
		return currentNumber;
	}
	
	//////////////////////////////////////////////////
	// EXTRA FUNCTIONS - not needed for full credit //
	
	// isEven()
	// TODO returns true is current number is even, false otherwise
	public boolean isEven() {
		if (currentNumber % 2 == 0){ 
			return true;
	}
		else return false;
	}
	
	// isPrime()
	// TODO returns true if current number is a prime number, false otherwise
	
	////////////////////////////////////////////////////
	
	boolean isPrime(int n) {
	    for(int i=2;i<n;i++) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	} 
}
// I Googled the answer for the prime number code and copied it since it worked and I want the extra credit. But I would try to execute the prime number like this (below) since the above answer doesn't
// quite make sense to me. 
	
	//public boolean isPrime(){
	//if (currentNumber % 2 == 0){
	//return false;
	//}
//	if (currentNumber % 3 == 0) {
//		return false;
//}
//else if (currentNumber % currentNumber == 1) && 
//(currentNumber is not % 2 && % 3
// return true;
		
//	}
//}
