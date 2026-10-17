package androidx.camera.camera2.pipe.config;

import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.core.Threads;
import androidx.camera.camera2.pipe.internal.CameraStatusMonitor;
import e4m.e;
import kotlinx.coroutines.Job;
import phm.a;
import vc.s;

/* JADX INFO: loaded from: classes15.dex */
public abstract class Camera2ControllerModule_Companion_ProvideCameraStatusMonitorFactory implements e {
    public static CameraStatusMonitor provideCameraStatusMonitor(a aVar, Threads threads, CameraGraph.Config config, Job job2) {
        CameraStatusMonitor cameraStatusMonitorProvideCameraStatusMonitor = Camera2ControllerModule.INSTANCE.provideCameraStatusMonitor(aVar, threads, config, job2);
        s.k(cameraStatusMonitorProvideCameraStatusMonitor);
        return cameraStatusMonitorProvideCameraStatusMonitor;
    }
}
