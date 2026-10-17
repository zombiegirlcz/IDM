package androidx.camera.camera2.config;

import androidx.camera.camera2.pipe.CameraPipe;
import e4m.e;
import vc.s;

/* JADX INFO: loaded from: classes13.dex */
public abstract class CameraAppConfig_ProvideCameraPipeFactory implements e {
    public static CameraPipe provideCameraPipe(CameraAppConfig cameraAppConfig) {
        CameraPipe cameraPipe = cameraAppConfig.getCameraPipe();
        s.k(cameraPipe);
        return cameraPipe;
    }
}
