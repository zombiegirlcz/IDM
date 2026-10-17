package androidx.camera.camera2.pipe.config;

import android.content.Context;
import androidx.camera.camera2.pipe.CameraBackends;
import androidx.camera.camera2.pipe.CameraPipe;
import androidx.camera.camera2.pipe.core.Threads;
import androidx.camera.camera2.pipe.internal.CameraPipeLifetime;
import e4m.e;
import phm.a;
import vc.s;

/* JADX INFO: loaded from: classes15.dex */
public abstract class CameraPipeModule_Companion_ProvideCameraBackendsFactory implements e {
    public static CameraBackends provideCameraBackends(CameraPipe.Config config, a aVar, Context context, Threads threads, CameraPipeLifetime cameraPipeLifetime) {
        CameraBackends cameraBackendsProvideCameraBackends = CameraPipeModule.INSTANCE.provideCameraBackends(config, aVar, context, threads, cameraPipeLifetime);
        s.k(cameraBackendsProvideCameraBackends);
        return cameraBackendsProvideCameraBackends;
    }
}
