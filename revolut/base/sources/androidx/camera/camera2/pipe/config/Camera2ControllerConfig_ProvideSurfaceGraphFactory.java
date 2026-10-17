package androidx.camera.camera2.pipe.config;

import androidx.camera.camera2.pipe.SurfaceTracker;
import e4m.e;
import vc.s;

/* JADX INFO: loaded from: classes15.dex */
public abstract class Camera2ControllerConfig_ProvideSurfaceGraphFactory implements e {
    public static SurfaceTracker provideSurfaceGraph(Camera2ControllerConfig camera2ControllerConfig) {
        SurfaceTracker surfaceTracker = camera2ControllerConfig.getSurfaceTracker();
        s.k(surfaceTracker);
        return surfaceTracker;
    }
}
