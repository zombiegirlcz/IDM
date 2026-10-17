package org.tensorflow.lite.support.image;

import a0.d;
import org.tensorflow.lite.support.image.ImageProperties;

/* JADX INFO: loaded from: classes14.dex */
final class AutoValue_ImageProperties extends ImageProperties {
    private final ColorSpaceType colorSpaceType;
    private final int height;
    private final int width;

    public static final class Builder extends ImageProperties.Builder {
        private ColorSpaceType colorSpaceType;
        private Integer height;
        private Integer width;

        @Override // org.tensorflow.lite.support.image.ImageProperties.Builder
        public ImageProperties autoBuild() {
            String strR = this.height == null ? " height" : "";
            if (this.width == null) {
                strR = d.r(strR, " width");
            }
            if (this.colorSpaceType == null) {
                strR = d.r(strR, " colorSpaceType");
            }
            if (strR.isEmpty()) {
                return new AutoValue_ImageProperties(this.height.intValue(), this.width.intValue(), this.colorSpaceType);
            }
            throw new IllegalStateException("Missing required properties:".concat(strR));
        }

        @Override // org.tensorflow.lite.support.image.ImageProperties.Builder
        public ImageProperties.Builder setColorSpaceType(ColorSpaceType colorSpaceType) {
            if (colorSpaceType == null) {
                throw new NullPointerException("Null colorSpaceType");
            }
            this.colorSpaceType = colorSpaceType;
            return this;
        }

        @Override // org.tensorflow.lite.support.image.ImageProperties.Builder
        public ImageProperties.Builder setHeight(int i) {
            this.height = Integer.valueOf(i);
            return this;
        }

        @Override // org.tensorflow.lite.support.image.ImageProperties.Builder
        public ImageProperties.Builder setWidth(int i) {
            this.width = Integer.valueOf(i);
            return this;
        }
    }

    public boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof ImageProperties) {
            ImageProperties imageProperties = (ImageProperties) obj2;
            if (this.height == imageProperties.getHeight() && this.width == imageProperties.getWidth() && this.colorSpaceType.equals(imageProperties.getColorSpaceType())) {
                return true;
            }
        }
        return false;
    }

    @Override // org.tensorflow.lite.support.image.ImageProperties
    public ColorSpaceType getColorSpaceType() {
        return this.colorSpaceType;
    }

    @Override // org.tensorflow.lite.support.image.ImageProperties
    public int getHeight() {
        return this.height;
    }

    @Override // org.tensorflow.lite.support.image.ImageProperties
    public int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return ((((this.height ^ 1000003) * 1000003) ^ this.width) * 1000003) ^ this.colorSpaceType.hashCode();
    }

    public String toString() {
        return "ImageProperties{height=" + this.height + ", width=" + this.width + ", colorSpaceType=" + this.colorSpaceType + "}";
    }

    private AutoValue_ImageProperties(int i, int i2, ColorSpaceType colorSpaceType) {
        this.height = i;
        this.width = i2;
        this.colorSpaceType = colorSpaceType;
    }
}
