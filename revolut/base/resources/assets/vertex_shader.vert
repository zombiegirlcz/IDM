uniform mat4 u_TextMatrix;
attribute vec4 a_Position;
attribute vec2 a_TextCoord;
varying vec2 v_TextCoord;

void main() {
    gl_Position = a_Position;
    v_TextCoord = (u_TextMatrix * (vec4(a_TextCoord, 0.0, 1.0))).xy;
}