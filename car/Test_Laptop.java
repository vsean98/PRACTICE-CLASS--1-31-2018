package car;

public class Test_Laptop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Laptop laptop1=new Laptop("Intel","Windows 10",1998);
		
		System.out.println(laptop1.laptopBrand);
		
		
		
		
		Laptop laptop2=new Laptop("Google","Mac OS",2013); 
		
		System.out.println(laptop2.laptopBrand);
		
		
		laptop2.laptopBrand=("Apple");
		
		System.out.println(laptop2.laptopBrand);
		
		
	}

}
