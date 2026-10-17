package hy;

import com.revolut.camerakit.client.api.models.CameraCaptureSettings;
import com.revolut.camerakit.client.api.models.PhotoCompressionQuality;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import yw.j;

/* JADX INFO: loaded from: classes16.dex */
public abstract class a {
    public static final int a(CameraCaptureSettings cameraCaptureSettings) {
        Intrinsics.checkNotNullParameter(cameraCaptureSettings, "<this>");
        if (cameraCaptureSettings instanceof CameraCaptureSettings.Compound) {
            PhotoCompressionQuality photoCompressionQuality = ((CameraCaptureSettings.Compound) cameraCaptureSettings).f50694a.f50699b;
            if (photoCompressionQuality instanceof PhotoCompressionQuality.Custom) {
                return ((PhotoCompressionQuality.Custom) photoCompressionQuality).f50728a;
            }
            if (photoCompressionQuality instanceof PhotoCompressionQuality.Default) {
                return 92;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!(cameraCaptureSettings instanceof CameraCaptureSettings.Photo)) {
            if ((cameraCaptureSettings instanceof CameraCaptureSettings.Video) || Intrinsics.f(cameraCaptureSettings, CameraCaptureSettings.FaceEmbedding.f50696a) || Intrinsics.f(cameraCaptureSettings, CameraCaptureSettings.CompactSelfie.f50693a)) {
                return 92;
            }
            throw new NoWhenBranchMatchedException();
        }
        PhotoCompressionQuality photoCompressionQuality2 = ((CameraCaptureSettings.Photo) cameraCaptureSettings).f50699b;
        if (photoCompressionQuality2 instanceof PhotoCompressionQuality.Custom) {
            return ((PhotoCompressionQuality.Custom) photoCompressionQuality2).f50728a;
        }
        if (photoCompressionQuality2 instanceof PhotoCompressionQuality.Default) {
            return 92;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final j b(CameraCaptureSettings cameraCaptureSettings) {
        Intrinsics.checkNotNullParameter(cameraCaptureSettings, "<this>");
        return cameraCaptureSettings instanceof CameraCaptureSettings.Compound ? ((CameraCaptureSettings.Compound) cameraCaptureSettings).f50694a.e : cameraCaptureSettings instanceof CameraCaptureSettings.Photo ? ((CameraCaptureSettings.Photo) cameraCaptureSettings).e : j.LOSSY;
    }
}
