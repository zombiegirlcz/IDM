package com.revolut.camerakit.vision_framework.generated;

import ehe.n;

/* JADX INFO: loaded from: classes16.dex */
public final class DocCorner {
    final float confidence;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    final float f50943x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    final float f50944y;

    public DocCorner(float f, float f4, float f5) {
        this.f50943x = f;
        this.f50944y = f4;
        this.confidence = f5;
    }

    public float getConfidence() {
        return this.confidence;
    }

    public float getX() {
        return this.f50943x;
    }

    public float getY() {
        return this.f50944y;
    }

    public String toString() {
        StringBuilder sb6 = new StringBuilder("DocCorner{x=");
        sb6.append(this.f50943x);
        sb6.append(",y=");
        sb6.append(this.f50944y);
        sb6.append(",confidence=");
        return n.t(this.confidence, "}", sb6);
    }
}
