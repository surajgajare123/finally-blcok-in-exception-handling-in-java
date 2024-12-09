public class Main
{
    public static int greet(){
        int a = 2;
        int b = 0;
        try{
            int c = a/b;
            return c;
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("this is finally block..!");
        }
        return 0;
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		int k = greet();
		System.out.println(k);
	}
}
