package hy;

import com.revolut.camerakit.client.api.models.CameraCaptureSettings;
import com.revolut.camerakit.core.settings.VideoWatermark;
import com.revolut.camerakit.core.settings.WatermarkSettings;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public abstract class f {
    public static final VideoWatermark a(CameraCaptureSettings cameraCaptureSettings) {
        Intrinsics.checkNotNullParameter(cameraCaptureSettings, "<this>");
        boolean z = cameraCaptureSettings instanceof CameraCaptureSettings.Compound;
        VideoWatermark.Disabled disabled = VideoWatermark.Disabled.f50745a;
        if (z) {
            CameraCaptureSettings.Video video = ((CameraCaptureSettings.Compound) cameraCaptureSettings).f50695b;
            WatermarkSettings watermarkSettings = video.i;
            if (!watermarkSettings.f50751a) {
                return disabled;
            }
            String str = video.f;
            if (str != null) {
                return new VideoWatermark.Enabled(str, watermarkSettings.f50752b);
            }
            throw new IllegalArgumentException("Video watermark requires non-null video secret");
        }
        if (!(cameraCaptureSettings instanceof CameraCaptureSettings.Video)) {
            if ((cameraCaptureSettings instanceof CameraCaptureSettings.Photo) || Intrinsics.f(cameraCaptureSettings, CameraCaptureSettings.FaceEmbedding.f50696a) || Intrinsics.f(cameraCaptureSettings, CameraCaptureSettings.CompactSelfie.f50693a)) {
                return disabled;
            }
            throw new NoWhenBranchMatchedException();
        }
        CameraCaptureSettings.Video video2 = (CameraCaptureSettings.Video) cameraCaptureSettings;
        WatermarkSettings watermarkSettings2 = video2.i;
        if (!watermarkSettings2.f50751a) {
            return disabled;
        }
        String str2 = video2.f;
        if (str2 != null) {
            return new VideoWatermark.Enabled(str2, watermarkSettings2.f50752b);
        }
        throw new IllegalArgumentException("Video watermark requires non-null video secret");
    }
}
