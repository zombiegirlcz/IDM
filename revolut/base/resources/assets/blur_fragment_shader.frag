#extension GL_OES_EGL_image_external : require
precision lowp float;

const float pi = 6.28318530718; // 2 * PI
const float directions = 16.0; // Number of blur rays(directions of samples)
const float quality = 3.0; // Roughly == number of samples
const float blurSize = 16.0; // Blur radius

uniform samplerExternalOES externalTexture;
uniform vec2 u_Resolution;
uniform float u_AnimationFraction;
varying vec2 v_TextCoord;

void main() {
    float size = blurSize * u_AnimationFraction;
    vec2 radius = size / u_Resolution;

    vec4 accumulatedColor = texture2D(externalTexture, v_TextCoord);

    for (float d = 0.0; d < pi; d += pi / directions) {
        for(float i = 1.0 / quality; i <= 1.0; i += 1.0 / quality) {
            accumulatedColor += texture2D(externalTexture, v_TextCoord + vec2(cos(d), sin(d)) * radius * i);
        }
    }

    accumulatedColor /= quality * directions;
    gl_FragColor =  accumulatedColor;
}