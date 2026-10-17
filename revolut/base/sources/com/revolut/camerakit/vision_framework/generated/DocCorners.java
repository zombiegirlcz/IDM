package com.revolut.camerakit.vision_framework.generated;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes16.dex */
public abstract class DocCorners {

    public static final class CppProxy extends DocCorners {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j2) {
            if (j2 == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j2;
        }

        public static native DocCorners create(String str);

        private native void nativeDestroy(long j2);

        private native DocCornersResult native_detect(long j2, VisionImage visionImage);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.revolut.camerakit.vision_framework.generated.DocCorners
        public DocCornersResult detect(VisionImage visionImage) {
            return native_detect(this.nativeRef, visionImage);
        }

        public void finalize() throws Throwable {
            _djinni_private_destroy();
            super.finalize();
        }
    }

    public static DocCorners create(String str) {
        return CppProxy.create(str);
    }

    public abstract DocCornersResult detect(VisionImage visionImage);
}
