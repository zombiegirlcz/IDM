package androidx.camera.camera2.config;

import androidx.camera.core.CameraXConfig;
import e4m.e;
import vc.s;

/* JADX INFO: loaded from: classes13.dex */
public abstract class CameraAppConfig_ProvideCameraXConfigFactory implements e {
    public static CameraXConfig provideCameraXConfig(CameraAppConfig cameraAppConfig) {
        CameraXConfig cameraXConfig = cameraAppConfig.getCameraXConfig();
        s.k(cameraXConfig);
        return cameraXConfig;
    }
}
