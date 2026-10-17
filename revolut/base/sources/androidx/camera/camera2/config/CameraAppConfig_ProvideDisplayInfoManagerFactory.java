package androidx.camera.camera2.config;

import android.content.Context;
import androidx.camera.camera2.impl.DisplayInfoManager;
import e4m.e;
import vc.s;

/* JADX INFO: loaded from: classes13.dex */
public abstract class CameraAppConfig_ProvideDisplayInfoManagerFactory implements e {
    public static DisplayInfoManager provideDisplayInfoManager(CameraAppConfig cameraAppConfig, Context context) {
        DisplayInfoManager displayInfoManagerProvideDisplayInfoManager = cameraAppConfig.provideDisplayInfoManager(context);
        s.k(displayInfoManagerProvideDisplayInfoManager);
        return displayInfoManagerProvideDisplayInfoManager;
    }
}
