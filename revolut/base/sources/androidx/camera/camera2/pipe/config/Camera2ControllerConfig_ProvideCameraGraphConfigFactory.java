package androidx.camera.camera2.pipe.config;

import androidx.camera.camera2.pipe.CameraGraph;
import e4m.e;
import vc.s;

/* JADX INFO: loaded from: classes15.dex */
public abstract class Camera2ControllerConfig_ProvideCameraGraphConfigFactory implements e {
    public static CameraGraph.Config provideCameraGraphConfig(Camera2ControllerConfig camera2ControllerConfig) {
        CameraGraph.Config graphConfig = camera2ControllerConfig.getGraphConfig();
        s.k(graphConfig);
        return graphConfig;
    }
}
