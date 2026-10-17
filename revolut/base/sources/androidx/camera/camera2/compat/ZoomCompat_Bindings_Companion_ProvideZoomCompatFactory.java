package androidx.camera.camera2.compat;

import androidx.camera.camera2.compat.ZoomCompat;
import androidx.camera.camera2.impl.CameraProperties;
import e4m.e;
import vc.s;

/* JADX INFO: loaded from: classes13.dex */
public abstract class ZoomCompat_Bindings_Companion_ProvideZoomCompatFactory implements e {
    public static ZoomCompat provideZoomCompat(CameraProperties cameraProperties) {
        ZoomCompat zoomCompatProvideZoomCompat = ZoomCompat.Bindings.INSTANCE.provideZoomCompat(cameraProperties);
        s.k(zoomCompatProvideZoomCompat);
        return zoomCompatProvideZoomCompat;
    }
}
