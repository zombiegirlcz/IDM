package androidx.camera.camera2.pipe.config;

import androidx.camera.camera2.pipe.graph.StreamGraphImpl;
import e4m.e;
import vc.s;

/* JADX INFO: loaded from: classes15.dex */
public abstract class Camera2ControllerConfig_ProvideStreamGraphFactory implements e {
    public static StreamGraphImpl provideStreamGraph(Camera2ControllerConfig camera2ControllerConfig) {
        StreamGraphImpl streamGraphImplProvideStreamGraph = camera2ControllerConfig.provideStreamGraph();
        s.k(streamGraphImplProvideStreamGraph);
        return streamGraphImplProvideStreamGraph;
    }
}
