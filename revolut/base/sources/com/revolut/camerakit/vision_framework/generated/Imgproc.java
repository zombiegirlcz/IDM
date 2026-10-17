package com.revolut.camerakit.vision_framework.generated;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes16.dex */
public abstract class Imgproc {

    public static final class CppProxy extends Imgproc {
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j2) {
            if (j2 == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j2;
        }

        public static native void calcHist(ArrayList<Mat> arrayList, ArrayList<Integer> arrayList2, Mat mat, Mat mat2, ArrayList<Integer> arrayList3, ArrayList<Float> arrayList4);

        public static native int colorRgb2gray();

        public static native void cvtColor(Mat mat, Mat mat2, int i);

        public static native void gaussianBlur(Mat mat, Mat mat2, Size size, double d);

        public static native void laplacian(Mat mat, Mat mat2, int i);

        public static native void matchTemplate(Mat mat, Mat mat2, Mat mat3, int i);

        private native void nativeDestroy(long j2);

        public static native void resize(Mat mat, Mat mat2, Size size);

        public static native void sobel(Mat mat, Mat mat2, int i, int i2, int i3);

        public static native int tmCcoeffNormed();

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

    public static void calcHist(ArrayList<Mat> arrayList, ArrayList<Integer> arrayList2, Mat mat, Mat mat2, ArrayList<Integer> arrayList3, ArrayList<Float> arrayList4) {
        CppProxy.calcHist(arrayList, arrayList2, mat, mat2, arrayList3, arrayList4);
    }

    public static int colorRgb2gray() {
        return CppProxy.colorRgb2gray();
    }

    public static void cvtColor(Mat mat, Mat mat2, int i) {
        CppProxy.cvtColor(mat, mat2, i);
    }

    public static void gaussianBlur(Mat mat, Mat mat2, Size size, double d) {
        CppProxy.gaussianBlur(mat, mat2, size, d);
    }

    public static void laplacian(Mat mat, Mat mat2, int i) {
        CppProxy.laplacian(mat, mat2, i);
    }

    public static void matchTemplate(Mat mat, Mat mat2, Mat mat3, int i) {
        CppProxy.matchTemplate(mat, mat2, mat3, i);
    }

    public static void resize(Mat mat, Mat mat2, Size size) {
        CppProxy.resize(mat, mat2, size);
    }

    public static void sobel(Mat mat, Mat mat2, int i, int i2, int i3) {
        CppProxy.sobel(mat, mat2, i, i2, i3);
    }

    public static int tmCcoeffNormed() {
        return CppProxy.tmCcoeffNormed();
    }
}
