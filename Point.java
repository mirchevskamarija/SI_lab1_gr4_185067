class Point {
	String id
	double x,y;

	//TODO add new variable
	String boja;

	//TODO constructor

	public Point(String id, double x, double y, String boja) {
		this.id = id;
		this.x = x;
		this.y = y;
		this.boja = boja;
	}
	//TODO setters and getters
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public String getBoja() {
		return boja;
	}

	public void setBoja(String boja) {
		this.boja = boja;
	}


	public void move (char xDirection, char yDirection) {
		//TODO
		if(xDirection == 'L')
		{
			x--;
		}
		else if(xDirection == 'R')
		{
			x++;
		}
		if(yDirection == 'U')
		{
			y++;
		}
		else if(yDirection == 'D')
		{
			y--;
		}
	}

	public void draw () {
		//TODO
		System.out.println("Tockata " + id + " e " + x + " edinici na x " + y + " edinici na y");
	}



}

class Canvas{
	List<Canvas> list;

	public Canvas(List<Canvas> list) {
		this.list = list;
	}
	public void addPoint(Point point){
		list.add(point);
	}
	public void removePoint(Point point){
		if(list.indexOf(point) != -1 )
			list.remove(lis.indexOf(point));
	}
	
}