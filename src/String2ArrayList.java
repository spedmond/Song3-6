import java.lang.reflect.Array;
import java.util.ArrayList;
public class String2ArrayList
{
    private ArrayList<String> splitString;

    public String2ArrayList()
    {
        splitString = new ArrayList<String>();
    }
    public void splitAndAdd(String str)
    {
        for (int i = 0; i < str.length(); i++) {
            splitString.add(str.substring(i,i+1));
        }
    }

    public String toString()
    {
        return "" + splitString;
    }
}
