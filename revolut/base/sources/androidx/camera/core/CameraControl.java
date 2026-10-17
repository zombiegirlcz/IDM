package androidx.camera.core;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes15.dex */
public interface CameraControl {

    public static final class OperationCanceledException extends Exception {
        public OperationCanceledException(String str) {
            super(str);
        }
    }

    ListenableFuture<Void> enableTorch(boolean z);

    ListenableFuture<Integer> setExposureCompensationIndex(int i);

    ListenableFuture<Void> setLinearZoom(float f);

    ListenableFuture<Void> setZoomRatio(float f);

    ListenableFuture<FocusMeteringResult> startFocusAndMetering(FocusMeteringAction focusMeteringAction);
}
