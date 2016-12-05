public class SuperArrayIterator{
    private SuperArray sa;
    private int count;

    public SuperArrayIterator(SuperArray soup, int whichEle){
	     sa = soup;
	     count= whichEle;
    }

    public boolean hasNext(){
	if (count < sa.size()){
	    return true;
	}
	return false;
    }


    public void remove(){
	throw new UnsupportedOperationException;
    }
}
