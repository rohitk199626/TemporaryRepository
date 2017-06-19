import java.io.*;
public class Rohit
{
    public static void main(String[] args) throws IOException
    {
        BufferedInputStream fout = new BufferedInputStream(new FileWriter("a.txt"));
        fout.write(9.3);
        fout.write(2.5);
		System.out.println("Hello java");
    }
}
