package com.revolut.camerakit.vision_framework.generated;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes16.dex */
public abstract class DocImageQuality {

    public static final class CppProxy extends DocImageQuality {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j2) {
            if (j2 == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j2;
        }

        public static native DocImageQuality create(String str, DocImageQualityConfig docImageQualityConfig);

        private native void nativeDestroy(long j2);

        private native DocImageQualityResult native_validate(long j2, VisionImage visionImage);

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

        @Override // com.revolut.camerakit.vision_framework.generated.DocImageQuality
        public DocImageQualityResult validate(VisionImage visionImage) {
            return native_validate(this.nativeRef, visionImage);
        }
    }

    public static DocImageQuality create(String str, DocImageQualityConfig docImageQualityConfig) {
        return CppProxy.create(str, docImageQualityConfig);
    }

    public abstract DocImageQualityResult validate(VisionImage visionImage);
}
