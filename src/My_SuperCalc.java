
public class My_SuperCalc  extends Extra_Properties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int A= 2;
		int B= 3;
		int c= (18*2);
		System.out.println("line by line code"        +    c);
		
		My_SuperCalc O = new My_SuperCalc();
		
		O.mul1();
		O.Mul2(1, 2);
		O.mul3();
		O.mul4(4, 1);
		
			
	}
	
	public void mul1() {
		int a= 3;
		int b= 1;
		int d=(a*b);
		System.out.println("without arguments"       +   d);
	}
	
	public int Mul2(int a, int b){
		int P=(a*b);
		System.out.println( "with arguments"        +    P);
		
		return P;
	}
	
	
	

}
