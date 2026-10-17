package er;

import com.revolut.camerakit.client.api.models.CameraCaptureSettings;
import com.revolut.camerakit.client.api.models.PhotoCompressionQuality;
import com.revolut.camerakit.client.api.models.PhotoMaximumResolution;
import com.revolut.camerakit.client.api.models.PhotoTiming;
import com.revolut.camerakit.client.api.models.VideoDuration;
import com.revolut.camerakit.core.settings.WatermarkSettings;
import jr.n0;
import jr.v;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public abstract class i {
    public static final CameraCaptureSettings a(v vVar, n0 n0Var, e cameraCaptureFeatureSettings) {
        Intrinsics.checkNotNullParameter(cameraCaptureFeatureSettings, "cameraCaptureFeatureSettings");
        PhotoTiming.Unspecified unspecified = PhotoTiming.Unspecified.f50732a;
        if (vVar != null && n0Var != null) {
            h.a(vVar.f177851a);
            return new CameraCaptureSettings.Compound(new CameraCaptureSettings.Photo(unspecified, f.a(vVar.f177853c), g.a(vVar.f177852b), vVar.d, vVar.e, cameraCaptureFeatureSettings.d), j.a(n0Var, new VideoDuration.Fixed(n0Var.f177807a), cameraCaptureFeatureSettings));
        }
        if (vVar != null) {
            h.a(vVar.f177851a);
            return new CameraCaptureSettings.Photo(unspecified, f.a(vVar.f177853c), g.a(vVar.f177852b), vVar.d, vVar.e, cameraCaptureFeatureSettings.d);
        }
        if (n0Var == null) {
            CameraCaptureSettings.Photo.INSTANCE.getClass();
            return CameraCaptureSettings.Photo.f50697g;
        }
        CameraCaptureSettings.Photo.INSTANCE.getClass();
        CameraCaptureSettings.Photo photo = CameraCaptureSettings.Photo.f50697g;
        WatermarkSettings watermarkSettings = cameraCaptureFeatureSettings.d;
        PhotoTiming timing = photo.f50698a;
        PhotoCompressionQuality compressionQuality = photo.f50699b;
        PhotoMaximumResolution maximumResolution = photo.f50700c;
        String str = photo.d;
        yw.j compressionType = photo.e;
        Intrinsics.checkNotNullParameter(timing, "timing");
        Intrinsics.checkNotNullParameter(compressionQuality, "compressionQuality");
        Intrinsics.checkNotNullParameter(maximumResolution, "maximumResolution");
        Intrinsics.checkNotNullParameter(compressionType, "compressionType");
        Intrinsics.checkNotNullParameter(watermarkSettings, "watermarkSettings");
        return new CameraCaptureSettings.Compound(new CameraCaptureSettings.Photo(timing, compressionQuality, maximumResolution, str, compressionType, watermarkSettings), j.a(n0Var, new VideoDuration.Fixed(n0Var.f177807a), cameraCaptureFeatureSettings));
    }
}
