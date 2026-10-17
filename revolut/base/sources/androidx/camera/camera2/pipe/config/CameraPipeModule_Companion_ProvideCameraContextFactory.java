package androidx.camera.camera2.pipe.config;

import android.content.Context;
import androidx.camera.camera2.pipe.CameraBackends;
import androidx.camera.camera2.pipe.CameraContext;
import androidx.camera.camera2.pipe.core.Threads;
import e4m.e;
import vc.s;

/* JADX INFO: loaded from: classes15.dex */
public abstract class CameraPipeModule_Companion_ProvideCameraContextFactory implements e {
    public static CameraContext provideCameraContext(Context context, Threads threads, CameraBackends cameraBackends) {
        CameraContext cameraContextProvideCameraContext = CameraPipeModule.INSTANCE.provideCameraContext(context, threads, cameraBackends);
        s.k(cameraContextProvideCameraContext);
        return cameraContextProvideCameraContext;
    }
}
