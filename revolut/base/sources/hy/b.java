package hy;

import com.revolut.camerakit.client.api.models.CameraCaptureSettings;
import com.revolut.camerakit.client.api.models.PhotoMaximumResolution;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import yw.k;
import yw.l;
import yw.m;

/* JADX INFO: loaded from: classes16.dex */
public abstract class b {
    public static final m a(CameraCaptureSettings cameraCaptureSettings) {
        Intrinsics.checkNotNullParameter(cameraCaptureSettings, "<this>");
        boolean z = cameraCaptureSettings instanceof CameraCaptureSettings.Compound;
        l lVar = l.f317245a;
        if (z) {
            PhotoMaximumResolution photoMaximumResolution = ((CameraCaptureSettings.Compound) cameraCaptureSettings).f50694a.f50700c;
            if (photoMaximumResolution instanceof PhotoMaximumResolution.Custom) {
                return new k(((PhotoMaximumResolution.Custom) photoMaximumResolution).f50730a);
            }
            if (photoMaximumResolution instanceof PhotoMaximumResolution.Default) {
                return lVar;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!(cameraCaptureSettings instanceof CameraCaptureSettings.Photo)) {
            if ((cameraCaptureSettings instanceof CameraCaptureSettings.Video) || Intrinsics.f(cameraCaptureSettings, CameraCaptureSettings.FaceEmbedding.f50696a) || Intrinsics.f(cameraCaptureSettings, CameraCaptureSettings.CompactSelfie.f50693a)) {
                return lVar;
            }
            throw new NoWhenBranchMatchedException();
        }
        PhotoMaximumResolution photoMaximumResolution2 = ((CameraCaptureSettings.Photo) cameraCaptureSettings).f50700c;
        if (photoMaximumResolution2 instanceof PhotoMaximumResolution.Custom) {
            return new k(((PhotoMaximumResolution.Custom) photoMaximumResolution2).f50730a);
        }
        if (photoMaximumResolution2 instanceof PhotoMaximumResolution.Default) {
            return lVar;
        }
        throw new NoWhenBranchMatchedException();
    }
}
