package com.revolut.camerakit.vision_framework.generated;

import ehe.n;

/* JADX INFO: loaded from: classes16.dex */
public final class FaceImageQualityThreasholds {
    final float blur;
    final float bright;
    final float colorized;
    final float dark;
    final float darkContour;
    final float fraud;
    final float glare;
    final float leftEye;
    final float occluded;
    final float rightEye;
    final float sunglasses;

    public FaceImageQualityThreasholds(float f, float f4, float f5, float f6, float f32, float f35, float f36, float f37, float f41, float f42, float f57) {
        this.dark = f;
        this.darkContour = f4;
        this.bright = f5;
        this.blur = f6;
        this.glare = f32;
        this.colorized = f35;
        this.fraud = f36;
        this.leftEye = f37;
        this.rightEye = f41;
        this.occluded = f42;
        this.sunglasses = f57;
    }

    public float getBlur() {
        return this.blur;
    }

    public float getBright() {
        return this.bright;
    }

    public float getColorized() {
        return this.colorized;
    }

    public float getDark() {
        return this.dark;
    }

    public float getDarkContour() {
        return this.darkContour;
    }

    public float getFraud() {
        return this.fraud;
    }

    public float getGlare() {
        return this.glare;
    }

    public float getLeftEye() {
        return this.leftEye;
    }

    public float getOccluded() {
        return this.occluded;
    }

    public float getRightEye() {
        return this.rightEye;
    }

    public float getSunglasses() {
        return this.sunglasses;
    }

    public String toString() {
        StringBuilder sb6 = new StringBuilder("FaceImageQualityThreasholds{dark=");
        sb6.append(this.dark);
        sb6.append(",darkContour=");
        sb6.append(this.darkContour);
        sb6.append(",bright=");
        sb6.append(this.bright);
        sb6.append(",blur=");
        sb6.append(this.blur);
        sb6.append(",glare=");
        sb6.append(this.glare);
        sb6.append(",colorized=");
        sb6.append(this.colorized);
        sb6.append(",fraud=");
        sb6.append(this.fraud);
        sb6.append(",leftEye=");
        sb6.append(this.leftEye);
        sb6.append(",rightEye=");
        sb6.append(this.rightEye);
        sb6.append(",occluded=");
        sb6.append(this.occluded);
        sb6.append(",sunglasses=");
        return n.t(this.sunglasses, "}", sb6);
    }
}
