package com.revolut.camerakit.vision_framework.generated;

import android.content.res.AssetManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes16.dex */
public abstract class FaceValidatorWrapper {

    public static final class CppProxy extends FaceValidatorWrapper {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j2) {
            if (j2 == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j2;
        }

        public static native FaceValidatorWrapper create(AssetManager assetManager);

        public static native FaceValidatorWrapper createFromFile(String str, FaceImageQualityConfig faceImageQualityConfig);

        private native void nativeDestroy(long j2);

        private native FaceValidatorResult native_validate(long j2, VisionImage visionImage, Face face);

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

        @Override // com.revolut.camerakit.vision_framework.generated.FaceValidatorWrapper
        public FaceValidatorResult validate(VisionImage visionImage, Face face) {
            return native_validate(this.nativeRef, visionImage, face);
        }
    }

    public static FaceValidatorWrapper create(AssetManager assetManager) {
        return CppProxy.create(assetManager);
    }

    public static FaceValidatorWrapper createFromFile(String str, FaceImageQualityConfig faceImageQualityConfig) {
        return CppProxy.createFromFile(str, faceImageQualityConfig);
    }

    public abstract FaceValidatorResult validate(VisionImage visionImage, Face face);
}
