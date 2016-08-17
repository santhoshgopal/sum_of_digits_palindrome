import java.io.*;
import java.util.*;
class sum_digit_palin
{
public static void main(String args[])
{
int temp=0;
Scanner in=new Scanner(System.in);
int a=in.nextInt();
int temp1=a;	
while(a>0)
{
int n=a%10;
temp=temp*10+n;
a=a/10;
}
		if(temp1==temp)
		System.out.println("YES ITS PALINDROME");
		else
		System.out.println("NOT PALINDROME");
}


}