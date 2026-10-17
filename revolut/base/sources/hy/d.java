package hy;

import com.revolut.camerakit.client.api.models.CameraCaptureSettings;
import com.revolut.camerakit.core.settings.VideoEncodingBitRate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public abstract class d {
    public static final VideoEncodingBitRate a(CameraCaptureSettings cameraCaptureSettings) {
        Intrinsics.checkNotNullParameter(cameraCaptureSettings, "<this>");
        if (cameraCaptureSettings instanceof CameraCaptureSettings.Compound) {
            return ((CameraCaptureSettings.Compound) cameraCaptureSettings).f50695b.f50703c;
        }
        if (cameraCaptureSettings instanceof CameraCaptureSettings.Video) {
            return ((CameraCaptureSettings.Video) cameraCaptureSettings).f50703c;
        }
        boolean z = cameraCaptureSettings instanceof CameraCaptureSettings.Photo;
        VideoEncodingBitRate.Default r110 = VideoEncodingBitRate.Default.f50741a;
        if (z || Intrinsics.f(cameraCaptureSettings, CameraCaptureSettings.FaceEmbedding.f50696a) || Intrinsics.f(cameraCaptureSettings, CameraCaptureSettings.CompactSelfie.f50693a)) {
            return r110;
        }
        throw new NoWhenBranchMatchedException();
    }
}
