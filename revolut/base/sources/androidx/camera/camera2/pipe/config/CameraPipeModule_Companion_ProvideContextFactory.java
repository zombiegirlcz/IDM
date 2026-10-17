package androidx.camera.camera2.pipe.config;

import android.content.Context;
import androidx.camera.camera2.pipe.CameraPipe;
import e4m.e;
import vc.s;

/* JADX INFO: loaded from: classes15.dex */
public abstract class CameraPipeModule_Companion_ProvideContextFactory implements e {
    public static Context provideContext(CameraPipe.Config config) {
        Context contextProvideContext = CameraPipeModule.INSTANCE.provideContext(config);
        s.k(contextProvideContext);
        return contextProvideContext;
    }
}
