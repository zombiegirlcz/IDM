package androidx.camera.camera2.config;

import android.content.Context;
import e4m.e;
import vc.s;

/* JADX INFO: loaded from: classes13.dex */
public abstract class CameraAppConfig_ProvideContextFactory implements e {
    public static Context provideContext(CameraAppConfig cameraAppConfig) {
        Context context = cameraAppConfig.getContext();
        s.k(context);
        return context;
    }
}
