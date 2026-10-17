package androidx.camera.camera2.pipe.config;

import androidx.camera.camera2.pipe.CameraPipe;
import androidx.camera.camera2.pipe.StrictMode;
import e4m.e;
import vc.s;

/* JADX INFO: loaded from: classes15.dex */
public abstract class CameraPipeModule_Companion_ProvideStrictModeFactory implements e {
    public static StrictMode provideStrictMode(CameraPipe.Flags flags) {
        StrictMode strictModeProvideStrictMode = CameraPipeModule.INSTANCE.provideStrictMode(flags);
        s.k(strictModeProvideStrictMode);
        return strictModeProvideStrictMode;
    }
}
