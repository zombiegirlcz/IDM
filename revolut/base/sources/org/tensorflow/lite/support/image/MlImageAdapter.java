package org.tensorflow.lite.support.image;

import a0.d;
import nc.a;

/* JADX INFO: loaded from: classes14.dex */
public class MlImageAdapter {

    public static abstract class ImageFormatProxy {
        public static ImageFormatProxy createFromImageFormat(int i) {
            switch (i) {
                case 0:
                case 1:
                case 9:
                    throw new IllegalArgumentException(d.n("Cannot create ColorSpaceType from MlImage format: ", i));
                case 2:
                    return new AutoValue_MlImageAdapter_ImageFormatProxy(ColorSpaceType.RGB, i);
                case 3:
                    return new AutoValue_MlImageAdapter_ImageFormatProxy(ColorSpaceType.NV12, i);
                case 4:
                    return new AutoValue_MlImageAdapter_ImageFormatProxy(ColorSpaceType.NV21, i);
                case 5:
                    return new AutoValue_MlImageAdapter_ImageFormatProxy(ColorSpaceType.YV12, i);
                case 6:
                    return new AutoValue_MlImageAdapter_ImageFormatProxy(ColorSpaceType.YV21, i);
                case 7:
                    return new AutoValue_MlImageAdapter_ImageFormatProxy(ColorSpaceType.YUV_420_888, i);
                case 8:
                    return new AutoValue_MlImageAdapter_ImageFormatProxy(ColorSpaceType.GRAYSCALE, i);
                default:
                    throw new AssertionError(d.n("Illegal @ImageFormat: ", i));
            }
        }

        public abstract ColorSpaceType getColorSpaceType();

        public abstract int getImageFormat();
    }

    private MlImageAdapter() {
    }

    public static ColorSpaceType createColorSpaceTypeFrom(int i) {
        return ImageFormatProxy.createFromImageFormat(i).getColorSpaceType();
    }

    public static TensorImage createTensorImageFrom(a aVar) {
        throw null;
    }
}
