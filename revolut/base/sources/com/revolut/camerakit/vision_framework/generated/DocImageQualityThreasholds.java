package com.revolut.camerakit.vision_framework.generated;

import ehe.n;

/* JADX INFO: loaded from: classes16.dex */
public final class DocImageQualityThreasholds {
    final float blur;
    final float bright;
    final float dark;
    final float glare;

    public DocImageQualityThreasholds(float f, float f4, float f5, float f6) {
        this.blur = f;
        this.dark = f4;
        this.bright = f5;
        this.glare = f6;
    }

    public float getBlur() {
        return this.blur;
    }

    public float getBright() {
        return this.bright;
    }

    public float getDark() {
        return this.dark;
    }

    public float getGlare() {
        return this.glare;
    }

    public String toString() {
        StringBuilder sb6 = new StringBuilder("DocImageQualityThreasholds{blur=");
        sb6.append(this.blur);
        sb6.append(",dark=");
        sb6.append(this.dark);
        sb6.append(",bright=");
        sb6.append(this.bright);
        sb6.append(",glare=");
        return n.t(this.glare, "}", sb6);
    }
}
