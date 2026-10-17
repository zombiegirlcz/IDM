package com.revolut.camerakit.vision_framework.generated;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes16.dex */
public abstract class Core {

    public static final class CppProxy extends Core {
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j2) {
            if (j2 == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j2;
        }

        public static native void dct(Mat mat, Mat mat2);

        public static native void magnitude(Mat mat, Mat mat2, Mat mat3);

        public static native double meanFirstChannel(Mat mat);

        public static native void meanStdDev(Mat mat, Mat mat2, Mat mat3);

        private native void nativeDestroy(long j2);

        public static native int normMinmax();

        public static native void normalize(Mat mat, Mat mat2, double d, double d5, int i);

        public static native void rotate(Mat mat, Mat mat2, int i);

        public static native ArrayList<Mat> split(Mat mat);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        public void finalize() throws Throwable {
            _djinni_private_destroy();
            super.finalize();
        }
    }

    public static void dct(Mat mat, Mat mat2) {
        CppProxy.dct(mat, mat2);
    }

    public static void magnitude(Mat mat, Mat mat2, Mat mat3) {
        CppProxy.magnitude(mat, mat2, mat3);
    }

    public static double meanFirstChannel(Mat mat) {
        return CppProxy.meanFirstChannel(mat);
    }

    public static void meanStdDev(Mat mat, Mat mat2, Mat mat3) {
        CppProxy.meanStdDev(mat, mat2, mat3);
    }

    public static int normMinmax() {
        return CppProxy.normMinmax();
    }

    public static void normalize(Mat mat, Mat mat2, double d, double d5, int i) {
        CppProxy.normalize(mat, mat2, d, d5, i);
    }

    public static void rotate(Mat mat, Mat mat2, int i) {
        CppProxy.rotate(mat, mat2, i);
    }

    public static ArrayList<Mat> split(Mat mat) {
        return CppProxy.split(mat);
    }
}
