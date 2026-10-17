package androidx.camera.camera2.config;

import androidx.camera.camera2.adapter.SessionConfigAdapter;
import e4m.e;
import vc.s;

/* JADX INFO: loaded from: classes13.dex */
public abstract class UseCaseCameraConfig_ProvideSessionConfigAdapterFactory implements e {
    public static SessionConfigAdapter provideSessionConfigAdapter(UseCaseCameraConfig useCaseCameraConfig) {
        SessionConfigAdapter sessionConfigAdapter = useCaseCameraConfig.getSessionConfigAdapter();
        s.k(sessionConfigAdapter);
        return sessionConfigAdapter;
    }
}
