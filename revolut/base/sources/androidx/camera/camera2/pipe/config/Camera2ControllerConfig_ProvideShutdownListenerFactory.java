package androidx.camera.camera2.pipe.config;

import androidx.camera.camera2.pipe.compat.Camera2CameraController;
import e4m.e;
import vc.s;

/* JADX INFO: loaded from: classes15.dex */
public abstract class Camera2ControllerConfig_ProvideShutdownListenerFactory implements e {
    public static Camera2CameraController.ShutdownListener provideShutdownListener(Camera2ControllerConfig camera2ControllerConfig) {
        Camera2CameraController.ShutdownListener shutdownListener = camera2ControllerConfig.getShutdownListener();
        s.k(shutdownListener);
        return shutdownListener;
    }
}
