package com.revolut.camerakit.vision_framework.generated;

import android.content.res.AssetManager;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes16.dex */
public abstract class FaceExtractorWrapper {

    public static final class CppProxy extends FaceExtractorWrapper {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j2) {
            if (j2 == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j2;
        }

        public static native FaceExtractorWrapper create(AssetManager assetManager);

        public static native FaceExtractorWrapper createBlazeFaceDetectorFromFile(String str);

        public static native FaceExtractorWrapper createFromFile(String str);

        private native void nativeDestroy(long j2);

        private native ArrayList<Face> native_detectFaces(long j2, VisionImage visionImage);

        private native ArrayList<Float> native_extractFaceEmbedding(long j2, VisionImage visionImage);

        private native byte[] native_preprocessFace(long j2, VisionImage visionImage);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.revolut.camerakit.vision_framework.generated.FaceExtractorWrapper
        public ArrayList<Face> detectFaces(VisionImage visionImage) {
            return native_detectFaces(this.nativeRef, visionImage);
        }

        @Override // com.revolut.camerakit.vision_framework.generated.FaceExtractorWrapper
        public ArrayList<Float> extractFaceEmbedding(VisionImage visionImage) {
            return native_extractFaceEmbedding(this.nativeRef, visionImage);
        }

        public void finalize() throws Throwable {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.revolut.camerakit.vision_framework.generated.FaceExtractorWrapper
        public byte[] preprocessFace(VisionImage visionImage) {
            return native_preprocessFace(this.nativeRef, visionImage);
        }
    }

    public static FaceExtractorWrapper create(AssetManager assetManager) {
        return CppProxy.create(assetManager);
    }

    public static FaceExtractorWrapper createBlazeFaceDetectorFromFile(String str) {
        return CppProxy.createBlazeFaceDetectorFromFile(str);
    }

    public static FaceExtractorWrapper createFromFile(String str) {
        return CppProxy.createFromFile(str);
    }

    public abstract ArrayList<Face> detectFaces(VisionImage visionImage);

    public abstract ArrayList<Float> extractFaceEmbedding(VisionImage visionImage);

    public abstract byte[] preprocessFace(VisionImage visionImage);
}
