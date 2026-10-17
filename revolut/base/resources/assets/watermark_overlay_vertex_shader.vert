// Vertex of one watermark square, already converted to OpenGL screen coordinates.
attribute vec2 aPosition;

void main() {
    gl_Position = vec4(aPosition, 0.0, 1.0);
}
