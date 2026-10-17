package androidx.camera.camera2.pipe.config;

import androidx.camera.camera2.pipe.CameraPipe;
import e4m.e;
import vc.s;

/* JADX INFO: loaded from: classes15.dex */
public abstract class CameraPipeConfigModule_ProvideCameraPipeFlagsFactory implements e {
    public static CameraPipe.Flags provideCameraPipeFlags(CameraPipeConfigModule cameraPipeConfigModule) {
        CameraPipe.Flags flagsProvideCameraPipeFlags = cameraPipeConfigModule.provideCameraPipeFlags();
        s.k(flagsProvideCameraPipeFlags);
        return flagsProvideCameraPipeFlags;
    }
}
