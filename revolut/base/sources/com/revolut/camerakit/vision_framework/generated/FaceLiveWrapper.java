package com.revolut.camerakit.vision_framework.generated;

import android.content.res.AssetManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes16.dex */
public abstract class FaceLiveWrapper {

    public static final class CppProxy extends FaceLiveWrapper {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j2) {
            if (j2 == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j2;
        }

        public static native FaceLiveWrapper create(AssetManager assetManager);

        private native void nativeDestroy(long j2);

        private native boolean native_isSpoof(long j2, VisionImage visionImage);

        private native byte[] native_preprocessFace(long j2, VisionImage visionImage);

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

        @Override // com.revolut.camerakit.vision_framework.generated.FaceLiveWrapper
        public boolean isSpoof(VisionImage visionImage) {
            return native_isSpoof(this.nativeRef, visionImage);
        }

        @Override // com.revolut.camerakit.vision_framework.generated.FaceLiveWrapper
        public byte[] preprocessFace(VisionImage visionImage) {
            return native_preprocessFace(this.nativeRef, visionImage);
        }
    }

    public static FaceLiveWrapper create(AssetManager assetManager) {
        return CppProxy.create(assetManager);
    }

    public abstract boolean isSpoof(VisionImage visionImage);

    public abstract byte[] preprocessFace(VisionImage visionImage);
}
