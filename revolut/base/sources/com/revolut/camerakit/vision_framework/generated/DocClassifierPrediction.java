package com.revolut.camerakit.vision_framework.generated;

import j6.a;

/* JADX INFO: loaded from: classes16.dex */
public final class DocClassifierPrediction {
    final String country;
    final String documentType;
    final String side;
    final int validity;

    public DocClassifierPrediction(String str, String str2, String str3, int i) {
        this.country = str;
        this.documentType = str2;
        this.side = str3;
        this.validity = i;
    }

    public String getCountry() {
        return this.country;
    }

    public String getDocumentType() {
        return this.documentType;
    }

    public String getSide() {
        return this.side;
    }

    public int getValidity() {
        return this.validity;
    }

    public String toString() {
        StringBuilder sb6 = new StringBuilder("DocClassifierPrediction{country=");
        sb6.append(this.country);
        sb6.append(",documentType=");
        sb6.append(this.documentType);
        sb6.append(",side=");
        sb6.append(this.side);
        sb6.append(",validity=");
        return a.v(sb6, "}", this.validity);
    }
}
