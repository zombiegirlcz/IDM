package androidx.camera.camera2.config;

import e4m.e;
import vc.s;

/* JADX INFO: loaded from: classes13.dex */
public abstract class CameraModule_Companion_ProvideCameraIdStringFactory implements e {
    public static String provideCameraIdString(CameraConfig cameraConfig) {
        String strProvideCameraIdString = CameraModule.INSTANCE.provideCameraIdString(cameraConfig);
        s.k(strProvideCameraIdString);
        return strProvideCameraIdString;
    }
}
