package com.onfido.android.sdk.capture.native_detector;

import android.content.Context;
import androidx.annotation.NonNull;
import com.onfido.android.sdk.capture.edge_detector.EdgeDetectionResults;
import com.onfido.android.sdk.capture.internal.util.annotation.InternalOnfidoApi;
import com.onfido.android.sdk.capture.ui.camera.DocumentDetectionFrame;
import io.reactivex.rxjava3.subjects.PublishSubject;

/* JADX INFO: loaded from: classes17.dex */
@InternalOnfidoApi
public class NativeDetector {
    private static final int ROTATION_MULTIPLIER = 90;
    private static boolean hasNativeLibrary = true;
    private final PublishSubject frameDataSubject = new PublishSubject();

    static {
        try {
            System.loadLibrary("NativeBridge");
        } catch (UnsatisfiedLinkError unused) {
            hasNativeLibrary = false;
        }
    }

    private native void clearEdgesNative();

    private native boolean detectBlurCaptureNative(byte[] bArr, int i, int i2, int i3, int i5, int i6, int i21, int i22);

    private native boolean detectPathReallyExist(String str);

    public void clearEdges() {
        if (hasNativeLibrary()) {
            clearEdgesNative();
        }
    }

    public native boolean detectBlur(byte[] bArr, int i, int i2, int i3, int i5, int i6, int i21, int i22);

    public EdgeDetectionResults detectEdges(@NonNull DocumentDetectionFrame documentDetectionFrame) {
        if (hasNativeLibrary()) {
            return detectEdges(documentDetectionFrame.getYuv(), documentDetectionFrame.getFrameWidth(), documentDetectionFrame.getFrameHeight(), documentDetectionFrame.getOuterFrame().getWidth(), documentDetectionFrame.getOuterFrame().getHeight(), documentDetectionFrame.getOuterFrame().getLeft(), documentDetectionFrame.getOuterFrame().getTop(), documentDetectionFrame.getRotation() * 90);
        }
        return null;
    }

    public native EdgeDetectionResults detectEdges(byte[] bArr, int i, int i2, int i3, int i5, int i6, int i21, int i22);

    public native boolean detectGlare(byte[] bArr, int i, int i2, int i3, int i5, int i6, int i21, int i22);

    public native String[] extractMRZ(byte[] bArr, int i, int i2, int i3, int i5, int i6, int i21, byte[] bArr2, int i22, int i32, int i33, int i43);

    public PublishSubject getFrameData() {
        return this.frameDataSubject;
    }

    public boolean hasNativeLibrary() {
        return hasNativeLibrary;
    }

    public boolean isBlurDetected(@NonNull DocumentDetectionFrame documentDetectionFrame) {
        return hasNativeLibrary() && detectBlur(documentDetectionFrame.getYuv(), documentDetectionFrame.getFrameWidth(), documentDetectionFrame.getFrameHeight(), documentDetectionFrame.getOuterFrame().getWidth(), documentDetectionFrame.getOuterFrame().getHeight(), documentDetectionFrame.getOuterFrame().getLeft(), documentDetectionFrame.getOuterFrame().getTop(), documentDetectionFrame.getRotation() * 90);
    }

    public boolean isBlurDetectedWithRotation(@NonNull DocumentDetectionFrame documentDetectionFrame) {
        return hasNativeLibrary() && detectBlurCaptureNative(documentDetectionFrame.getYuv(), documentDetectionFrame.getFrameWidth(), documentDetectionFrame.getFrameHeight(), documentDetectionFrame.getOuterFrame().getWidth(), documentDetectionFrame.getOuterFrame().getHeight(), documentDetectionFrame.getOuterFrame().getLeft(), documentDetectionFrame.getOuterFrame().getTop(), documentDetectionFrame.getRotation());
    }

    public boolean isGlareDetected(@NonNull DocumentDetectionFrame documentDetectionFrame) {
        return hasNativeLibrary() && detectGlare(documentDetectionFrame.getYuv(), documentDetectionFrame.getFrameWidth(), documentDetectionFrame.getFrameHeight(), documentDetectionFrame.getOuterFrame().getWidth(), documentDetectionFrame.getOuterFrame().getHeight(), documentDetectionFrame.getOuterFrame().getLeft(), documentDetectionFrame.getOuterFrame().getTop(), documentDetectionFrame.getRotation() * 90);
    }

    public boolean isInVirtualEnvironment(Context context) {
        return hasNativeLibrary() && detectPathReallyExist(context.getFilesDir().getAbsolutePath());
    }
}
