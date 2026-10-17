precision mediump float;

// How strongly each watermark square changes the video brightness.
uniform float uDelta;

void main() {
    gl_FragColor = vec4(vec3(uDelta), 0.0);
}
