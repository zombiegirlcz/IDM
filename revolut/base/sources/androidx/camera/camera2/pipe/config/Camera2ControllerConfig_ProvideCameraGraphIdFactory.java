package androidx.camera.camera2.pipe.config;

import androidx.camera.camera2.pipe.CameraGraphId;
import e4m.e;
import vc.s;

/* JADX INFO: loaded from: classes15.dex */
public abstract class Camera2ControllerConfig_ProvideCameraGraphIdFactory implements e {
    public static CameraGraphId provideCameraGraphId(Camera2ControllerConfig camera2ControllerConfig) {
        CameraGraphId graphId = camera2ControllerConfig.getGraphId();
        s.k(graphId);
        return graphId;
    }
}
