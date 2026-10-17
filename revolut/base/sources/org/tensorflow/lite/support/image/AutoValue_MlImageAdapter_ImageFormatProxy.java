package org.tensorflow.lite.support.image;

import j6.a;
import org.tensorflow.lite.support.image.MlImageAdapter;

/* JADX INFO: loaded from: classes14.dex */
final class AutoValue_MlImageAdapter_ImageFormatProxy extends MlImageAdapter.ImageFormatProxy {
    private final ColorSpaceType colorSpaceType;
    private final int imageFormat;

    public AutoValue_MlImageAdapter_ImageFormatProxy(ColorSpaceType colorSpaceType, int i) {
        if (colorSpaceType == null) {
            throw new NullPointerException("Null colorSpaceType");
        }
        this.colorSpaceType = colorSpaceType;
        this.imageFormat = i;
    }

    public boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof MlImageAdapter.ImageFormatProxy) {
            MlImageAdapter.ImageFormatProxy imageFormatProxy = (MlImageAdapter.ImageFormatProxy) obj2;
            if (this.colorSpaceType.equals(imageFormatProxy.getColorSpaceType()) && this.imageFormat == imageFormatProxy.getImageFormat()) {
                return true;
            }
        }
        return false;
    }

    @Override // org.tensorflow.lite.support.image.MlImageAdapter.ImageFormatProxy
    public ColorSpaceType getColorSpaceType() {
        return this.colorSpaceType;
    }

    @Override // org.tensorflow.lite.support.image.MlImageAdapter.ImageFormatProxy
    public int getImageFormat() {
        return this.imageFormat;
    }

    public int hashCode() {
        return ((this.colorSpaceType.hashCode() ^ 1000003) * 1000003) ^ this.imageFormat;
    }

    public String toString() {
        StringBuilder sb6 = new StringBuilder("ImageFormatProxy{colorSpaceType=");
        sb6.append(this.colorSpaceType);
        sb6.append(", imageFormat=");
        return a.v(sb6, "}", this.imageFormat);
    }
}
