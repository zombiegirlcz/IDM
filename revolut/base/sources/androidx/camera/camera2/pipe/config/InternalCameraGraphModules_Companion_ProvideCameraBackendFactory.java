package androidx.camera.camera2.pipe.config;

import androidx.camera.camera2.pipe.CameraBackend;
import androidx.camera.camera2.pipe.CameraBackends;
import androidx.camera.camera2.pipe.CameraContext;
import androidx.camera.camera2.pipe.CameraGraph;
import e4m.e;
import vc.s;

/* JADX INFO: loaded from: classes15.dex */
public abstract class InternalCameraGraphModules_Companion_ProvideCameraBackendFactory implements e {
    public static CameraBackend provideCameraBackend(CameraBackends cameraBackends, CameraGraph.Config config, CameraContext cameraContext) {
        CameraBackend cameraBackendProvideCameraBackend = InternalCameraGraphModules.INSTANCE.provideCameraBackend(cameraBackends, config, cameraContext);
        s.k(cameraBackendProvideCameraBackend);
        return cameraBackendProvideCameraBackend;
    }
}
