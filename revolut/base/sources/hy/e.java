package hy;

import com.revolut.camerakit.client.api.models.CameraCaptureSettings;
import com.revolut.camerakit.client.api.models.CameraKitClientSettings;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public abstract class e {
    public static final yw.e a(CameraKitClientSettings cameraKitClientSettings) {
        int i;
        Intrinsics.checkNotNullParameter(cameraKitClientSettings, "<this>");
        CameraCaptureSettings cameraCaptureSettings = cameraKitClientSettings.f50706a;
        if (cameraCaptureSettings instanceof CameraCaptureSettings.Compound) {
            i = ((CameraCaptureSettings.Compound) cameraCaptureSettings).f50695b.f50702b;
        } else if (cameraCaptureSettings instanceof CameraCaptureSettings.Video) {
            i = ((CameraCaptureSettings.Video) cameraCaptureSettings).f50702b;
        } else {
            if (!(cameraCaptureSettings instanceof CameraCaptureSettings.Photo) && !Intrinsics.f(cameraCaptureSettings, CameraCaptureSettings.FaceEmbedding.f50696a) && !Intrinsics.f(cameraCaptureSettings, CameraCaptureSettings.CompactSelfie.f50693a)) {
                throw new NoWhenBranchMatchedException();
            }
            i = 720;
        }
        return i != 480 ? i != 720 ? i != 1080 ? i != 2160 ? yw.e.HD : yw.e.UHD : yw.e.FHD : yw.e.HD : yw.e.SD;
    }
}
