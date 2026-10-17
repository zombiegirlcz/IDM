package com.revolut.camerakit.vision_framework.generated;

import ehe.n;

/* JADX INFO: loaded from: classes16.dex */
public final class DocClassifierConfidence {
    final float country;
    final float documentType;
    final float side;
    final float validity;

    public DocClassifierConfidence(float f, float f4, float f5, float f6) {
        this.country = f;
        this.documentType = f4;
        this.side = f5;
        this.validity = f6;
    }

    public float getCountry() {
        return this.country;
    }

    public float getDocumentType() {
        return this.documentType;
    }

    public float getSide() {
        return this.side;
    }

    public float getValidity() {
        return this.validity;
    }

    public String toString() {
        StringBuilder sb6 = new StringBuilder("DocClassifierConfidence{country=");
        sb6.append(this.country);
        sb6.append(",documentType=");
        sb6.append(this.documentType);
        sb6.append(",side=");
        sb6.append(this.side);
        sb6.append(",validity=");
        return n.t(this.validity, "}", sb6);
    }
}
