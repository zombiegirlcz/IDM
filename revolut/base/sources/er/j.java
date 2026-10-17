package er;

import com.revolut.camerakit.client.api.models.CameraCaptureSettings;
import com.revolut.camerakit.client.api.models.VideoDuration;
import com.revolut.camerakit.core.settings.VideoEncodingBitRate;
import jr.n0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public abstract class j {
    public static final CameraCaptureSettings.Video a(n0 n0Var, VideoDuration duration, e cameraCaptureFeatureSettings) {
        Intrinsics.checkNotNullParameter(n0Var, "<this>");
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(cameraCaptureFeatureSettings, "cameraCaptureFeatureSettings");
        Integer num = n0Var.f177809c;
        return new CameraCaptureSettings.Video(duration, n0Var.f177808b, num == null ? VideoEncodingBitRate.Default.f50741a : new VideoEncodingBitRate.Custom(num.intValue()), n0Var.d, n0Var.e, cameraCaptureFeatureSettings.f128522a, cameraCaptureFeatureSettings.f128523b, cameraCaptureFeatureSettings.f128524c, 16);
    }
}
