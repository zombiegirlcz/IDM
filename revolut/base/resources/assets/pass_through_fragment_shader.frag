#extension GL_OES_EGL_image_external : require
precision mediump float;

uniform samplerExternalOES externalTexture;
varying vec2 v_TextCoord;

void main() {
    gl_FragColor = texture2D(externalTexture, v_TextCoord);
}
