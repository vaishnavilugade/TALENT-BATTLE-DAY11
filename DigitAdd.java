import java.util.*;
class DigitAdd{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n,temp=0,p;
		System.out.println("Enter number:");
		n=sc.nextInt();
		while(n!=0){
			p=n%10;
			temp=temp+p;
			n=n/10;
			
			}
		
		System.out.println("addition of digits is: "+temp);
	}
}
		

		
			
			