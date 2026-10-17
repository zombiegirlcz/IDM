package androidx.camera.camera2.pipe.config;

import androidx.camera.camera2.pipe.CameraPipe;
import e4m.e;
import vc.s;

/* JADX INFO: loaded from: classes15.dex */
public abstract class CameraPipeConfigModule_ProvideCameraPipeConfigFactory implements e {
    public static CameraPipe.Config provideCameraPipeConfig(CameraPipeConfigModule cameraPipeConfigModule) {
        CameraPipe.Config config = cameraPipeConfigModule.getConfig();
        s.k(config);
        return config;
    }
}
