package androidx.camera.camera2.pipe.config;

import androidx.camera.camera2.pipe.CameraSurfaceManager;
import e4m.e;
import vc.s;

/* JADX INFO: loaded from: classes15.dex */
public abstract class CameraPipeModule_Companion_ProvideCameraSurfaceManagerFactory implements e {
    public static CameraSurfaceManager provideCameraSurfaceManager() {
        CameraSurfaceManager cameraSurfaceManagerProvideCameraSurfaceManager = CameraPipeModule.INSTANCE.provideCameraSurfaceManager();
        s.k(cameraSurfaceManagerProvideCameraSurfaceManager);
        return cameraSurfaceManagerProvideCameraSurfaceManager;
    }
}
