package androidx.camera.camera2.pipe.config;

import androidx.camera.camera2.pipe.CameraGraph;
import e4m.e;
import vc.s;

/* JADX INFO: loaded from: classes15.dex */
public abstract class CameraGraphConfigModule_ProvideCameraGraphConfigFactory implements e {
    public static CameraGraph.Config provideCameraGraphConfig(CameraGraphConfigModule cameraGraphConfigModule) {
        CameraGraph.Config config = cameraGraphConfigModule.getConfig();
        s.k(config);
        return config;
    }
}
