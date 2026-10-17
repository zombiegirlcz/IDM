package com.revolut.camerakit.vision_framework.generated;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes16.dex */
public abstract class Mat {

    public static final class CppProxy extends Mat {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j2) {
            if (j2 == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j2;
        }

        public static native Mat create();

        public static native Mat createMatWithData(int i, int i2, int i3, ByteBuffer byteBuffer);

        public static native Mat createMatWithSize(int i, int i2, int i3);

        public static native Mat createMatWithSizeObject(Size size, int i);

        public static native Mat createSubMat(Mat mat, int i, int i2, int i3, int i5);

        public static native int cv32f();

        public static native int cv32fc1();

        public static native int cv64f();

        public static native int cv8uc1();

        public static native int cv8uc3();

        public static native int cv8uc4();

        private native void nativeDestroy(long j2);

        private native int native_cols(long j2);

        private native void native_convertTo(long j2, Mat mat, int i, double d);

        private native ArrayList<Double> native_getDouble(long j2, int i, int i2);

        private native ArrayList<Float> native_getFloat(long j2, int i, int i2, int i3);

        private native byte[] native_matToArgb8888Bytes(long j2);

        private native int native_put(long j2, int i, int i2, byte[] bArr);

        private native void native_release(long j2);

        private native int native_rows(long j2);

        private native Size native_size(long j2);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.revolut.camerakit.vision_framework.generated.Mat
        public int cols() {
            return native_cols(this.nativeRef);
        }

        @Override // com.revolut.camerakit.vision_framework.generated.Mat
        public void convertTo(Mat mat, int i, double d) {
            native_convertTo(this.nativeRef, mat, i, d);
        }

        public void finalize() throws Throwable {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.revolut.camerakit.vision_framework.generated.Mat
        public ArrayList<Double> getDouble(int i, int i2) {
            return native_getDouble(this.nativeRef, i, i2);
        }

        @Override // com.revolut.camerakit.vision_framework.generated.Mat
        public ArrayList<Float> getFloat(int i, int i2, int i3) {
            return native_getFloat(this.nativeRef, i, i2, i3);
        }

        @Override // com.revolut.camerakit.vision_framework.generated.Mat
        public byte[] matToArgb8888Bytes() {
            return native_matToArgb8888Bytes(this.nativeRef);
        }

        @Override // com.revolut.camerakit.vision_framework.generated.Mat
        public int put(int i, int i2, byte[] bArr) {
            return native_put(this.nativeRef, i, i2, bArr);
        }

        @Override // com.revolut.camerakit.vision_framework.generated.Mat
        public void release() {
            native_release(this.nativeRef);
        }

        @Override // com.revolut.camerakit.vision_framework.generated.Mat
        public int rows() {
            return native_rows(this.nativeRef);
        }

        @Override // com.revolut.camerakit.vision_framework.generated.Mat
        public Size size() {
            return native_size(this.nativeRef);
        }
    }

    public static Mat create() {
        return CppProxy.create();
    }

    public static Mat createMatWithData(int i, int i2, int i3, ByteBuffer byteBuffer) {
        return CppProxy.createMatWithData(i, i2, i3, byteBuffer);
    }

    public static Mat createMatWithSize(int i, int i2, int i3) {
        return CppProxy.createMatWithSize(i, i2, i3);
    }

    public static Mat createMatWithSizeObject(Size size, int i) {
        return CppProxy.createMatWithSizeObject(size, i);
    }

    public static Mat createSubMat(Mat mat, int i, int i2, int i3, int i5) {
        return CppProxy.createSubMat(mat, i, i2, i3, i5);
    }

    public static int cv32f() {
        return CppProxy.cv32f();
    }

    public static int cv32fc1() {
        return CppProxy.cv32fc1();
    }

    public static int cv64f() {
        return CppProxy.cv64f();
    }

    public static int cv8uc1() {
        return CppProxy.cv8uc1();
    }

    public static int cv8uc3() {
        return CppProxy.cv8uc3();
    }

    public static int cv8uc4() {
        return CppProxy.cv8uc4();
    }

    public abstract int cols();

    public abstract void convertTo(Mat mat, int i, double d);

    public abstract ArrayList<Double> getDouble(int i, int i2);

    public abstract ArrayList<Float> getFloat(int i, int i2, int i3);

    public abstract byte[] matToArgb8888Bytes();

    public abstract int put(int i, int i2, byte[] bArr);

    public abstract void release();

    public abstract int rows();

    public abstract Size size();
}
