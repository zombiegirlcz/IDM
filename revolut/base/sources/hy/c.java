package hy;

import com.revolut.camerakit.client.api.models.CameraCaptureSettings;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public abstract class c {
    public static final boolean a(CameraCaptureSettings cameraCaptureSettings) {
        Intrinsics.checkNotNullParameter(cameraCaptureSettings, "<this>");
        if (cameraCaptureSettings instanceof CameraCaptureSettings.Compound) {
            return ((CameraCaptureSettings.Compound) cameraCaptureSettings).f50695b.d;
        }
        if (cameraCaptureSettings instanceof CameraCaptureSettings.Video) {
            return ((CameraCaptureSettings.Video) cameraCaptureSettings).d;
        }
        if ((cameraCaptureSettings instanceof CameraCaptureSettings.Photo) || Intrinsics.f(cameraCaptureSettings, CameraCaptureSettings.FaceEmbedding.f50696a) || Intrinsics.f(cameraCaptureSettings, CameraCaptureSettings.CompactSelfie.f50693a)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }
}
