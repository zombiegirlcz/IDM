package androidx.camera.camera2.pipe.config;

import androidx.camera.camera2.pipe.graph.GraphListener;
import e4m.e;
import vc.s;

/* JADX INFO: loaded from: classes15.dex */
public abstract class Camera2ControllerConfig_ProvideGraphListenerFactory implements e {
    public static GraphListener provideGraphListener(Camera2ControllerConfig camera2ControllerConfig) {
        GraphListener graphListener = camera2ControllerConfig.getGraphListener();
        s.k(graphListener);
        return graphListener;
    }
}
