package com.revolut.camerakit.vision_framework.generated;

import android.content.res.AssetManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes16.dex */
public abstract class FaceFakeWrapper {

    public static final class CppProxy extends FaceFakeWrapper {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j2) {
            if (j2 == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j2;
        }

        public static native FaceFakeWrapper create(AssetManager assetManager);

        private native void nativeDestroy(long j2);

        private native boolean native_isSpoof(long j2, VisionImage visionImage, Face face);

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

        @Override // com.revolut.camerakit.vision_framework.generated.FaceFakeWrapper
        public boolean isSpoof(VisionImage visionImage, Face face) {
            return native_isSpoof(this.nativeRef, visionImage, face);
        }
    }

    public static FaceFakeWrapper create(AssetManager assetManager) {
        return CppProxy.create(assetManager);
    }

    public abstract boolean isSpoof(VisionImage visionImage, Face face);
}
