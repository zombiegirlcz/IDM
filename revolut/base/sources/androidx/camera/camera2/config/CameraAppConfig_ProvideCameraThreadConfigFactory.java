package androidx.camera.camera2.config;

import androidx.camera.core.impl.CameraThreadConfig;
import e4m.e;
import vc.s;

/* JADX INFO: loaded from: classes13.dex */
public abstract class CameraAppConfig_ProvideCameraThreadConfigFactory implements e {
    public static CameraThreadConfig provideCameraThreadConfig(CameraAppConfig cameraAppConfig) {
        CameraThreadConfig cameraThreadConfig = cameraAppConfig.getCameraThreadConfig();
        s.k(cameraThreadConfig);
        return cameraThreadConfig;
    }
}
