package com.revolut.camerakit.vision_framework.generated;

import ehe.n;
import j6.a;
import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
public final class VisionImage {
    final ImageFormat format;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final int f50947h;
    final byte[] image;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    final int f50948w;

    public VisionImage(byte[] bArr, ImageFormat imageFormat, int i, int i2) {
        this.image = bArr;
        this.format = imageFormat;
        this.f50948w = i;
        this.f50947h = i2;
    }

    public boolean equals(Object obj2) {
        if (!(obj2 instanceof VisionImage)) {
            return false;
        }
        VisionImage visionImage = (VisionImage) obj2;
        return Arrays.equals(this.image, visionImage.image) && this.format == visionImage.format && this.f50948w == visionImage.f50948w && this.f50947h == visionImage.f50947h;
    }

    public ImageFormat getFormat() {
        return this.format;
    }

    public int getH() {
        return this.f50947h;
    }

    public byte[] getImage() {
        return this.image;
    }

    public int getW() {
        return this.f50948w;
    }

    public int hashCode() {
        return ((((this.format.hashCode() + n.b(527, 31, this.image)) * 31) + this.f50948w) * 31) + this.f50947h;
    }

    public String toString() {
        StringBuilder sb6 = new StringBuilder("VisionImage{image=");
        sb6.append(this.image);
        sb6.append(",format=");
        sb6.append(this.format);
        sb6.append(",w=");
        sb6.append(this.f50948w);
        sb6.append(",h=");
        return a.v(sb6, "}", this.f50947h);
    }
}
