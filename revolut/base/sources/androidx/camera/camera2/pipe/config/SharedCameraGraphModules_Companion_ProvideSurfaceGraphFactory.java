package androidx.camera.camera2.pipe.config;

import androidx.camera.camera2.pipe.CameraSurfaceManager;
import androidx.camera.camera2.pipe.graph.StreamGraphImpl;
import androidx.camera.camera2.pipe.graph.SurfaceGraph;
import e4m.e;
import phm.a;
import vc.s;

/* JADX INFO: loaded from: classes15.dex */
public abstract class SharedCameraGraphModules_Companion_ProvideSurfaceGraphFactory implements e {
    public static SurfaceGraph provideSurfaceGraph(StreamGraphImpl streamGraphImpl, a aVar, CameraSurfaceManager cameraSurfaceManager) {
        SurfaceGraph surfaceGraphProvideSurfaceGraph = SharedCameraGraphModules.INSTANCE.provideSurfaceGraph(streamGraphImpl, aVar, cameraSurfaceManager);
        s.k(surfaceGraphProvideSurfaceGraph);
        return surfaceGraphProvideSurfaceGraph;
    }
}
