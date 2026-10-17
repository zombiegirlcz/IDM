package androidx.camera.camera2.pipe.config;

import android.content.Context;
import android.hardware.camera2.CameraManager;
import e4m.e;
import vc.s;

/* JADX INFO: loaded from: classes15.dex */
public abstract class CameraPipeModule_Companion_ProvideCameraManagerFactory implements e {
    public static CameraManager provideCameraManager(Context context) {
        CameraManager cameraManagerProvideCameraManager = CameraPipeModule.INSTANCE.provideCameraManager(context);
        s.k(cameraManagerProvideCameraManager);
        return cameraManagerProvideCameraManager;
    }
}
