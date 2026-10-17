package androidx.camera.camera2.pipe.config;

import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.graph.Listener3A;
import androidx.camera.camera2.pipe.internal.FrameDistributor;
import e4m.e;
import java.util.List;
import vc.s;

/* JADX INFO: loaded from: classes15.dex */
public abstract class SharedCameraGraphModules_Companion_ProvideRequestListenersFactory implements e {
    public static List<Request.Listener> provideRequestListeners(CameraGraph.Config config, Listener3A listener3A, FrameDistributor frameDistributor) {
        List<Request.Listener> listProvideRequestListeners = SharedCameraGraphModules.INSTANCE.provideRequestListeners(config, listener3A, frameDistributor);
        s.k(listProvideRequestListeners);
        return listProvideRequestListeners;
    }
}
