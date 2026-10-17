package com.revolut.camerakit.vision_framework.generated;

import j6.a;

/* JADX INFO: loaded from: classes16.dex */
public final class FaceImageQualityConfig {
    final int inputSizeH;
    final int inputSizeW;
    final FaceImageQualityThreasholds threasholds;

    public FaceImageQualityConfig(FaceImageQualityThreasholds faceImageQualityThreasholds, int i, int i2) {
        this.threasholds = faceImageQualityThreasholds;
        this.inputSizeW = i;
        this.inputSizeH = i2;
    }

    public int getInputSizeH() {
        return this.inputSizeH;
    }

    public int getInputSizeW() {
        return this.inputSizeW;
    }

    public FaceImageQualityThreasholds getThreasholds() {
        return this.threasholds;
    }

    public String toString() {
        StringBuilder sb6 = new StringBuilder("FaceImageQualityConfig{threasholds=");
        sb6.append(this.threasholds);
        sb6.append(",inputSizeW=");
        sb6.append(this.inputSizeW);
        sb6.append(",inputSizeH=");
        return a.v(sb6, "}", this.inputSizeH);
    }
}
