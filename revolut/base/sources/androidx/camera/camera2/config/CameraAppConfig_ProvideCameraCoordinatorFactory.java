package androidx.camera.camera2.config;

import androidx.camera.core.concurrent.CameraCoordinator;
import e4m.e;
import vc.s;

/* JADX INFO: loaded from: classes13.dex */
public abstract class CameraAppConfig_ProvideCameraCoordinatorFactory implements e {
    public static CameraCoordinator provideCameraCoordinator(CameraAppConfig cameraAppConfig) {
        CameraCoordinator cameraCoordinator = cameraAppConfig.getCameraCoordinator();
        s.k(cameraCoordinator);
        return cameraCoordinator;
    }
}
