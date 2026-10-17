package androidx.camera.camera2.pipe.config;

import androidx.camera.camera2.pipe.CameraPipe;
import e4m.e;
import vc.s;

/* JADX INFO: loaded from: classes15.dex */
public abstract class CameraPipeConfigModule_ProvideCameraInteropConfigFactory implements e {
    public static CameraPipe.CameraInteropConfig provideCameraInteropConfig(CameraPipeConfigModule cameraPipeConfigModule, CameraPipe.Config config) {
        CameraPipe.CameraInteropConfig cameraInteropConfigProvideCameraInteropConfig = cameraPipeConfigModule.provideCameraInteropConfig(config);
        s.k(cameraInteropConfigProvideCameraInteropConfig);
        return cameraInteropConfigProvideCameraInteropConfig;
    }
}
