void setup() {
	size(500, 500);
}

void draw() {
	background(0);
	noStroke();
	
	for(int x = 0; x < 100; x++)
		for(int y = 0; y < 100; y++) {
			fill(lerpColor(color(0, mouseX/2, mouseY/2), color(mouseX/2, y*2, mouseY/2), x/100));
			rect(x * 5, y * 5, 5, 5);
		}
}