package androidx.camera.camera2.config;

import androidx.camera.camera2.adapter.ZslControl;
import androidx.camera.camera2.impl.CameraProperties;
import e4m.e;
import vc.s;

/* JADX INFO: loaded from: classes13.dex */
public abstract class CameraModule_Companion_ProvideZslControlFactory implements e {
    public static ZslControl provideZslControl(CameraProperties cameraProperties) {
        ZslControl zslControlProvideZslControl = CameraModule.INSTANCE.provideZslControl(cameraProperties);
        s.k(zslControlProvideZslControl);
        return zslControlProvideZslControl;
    }
}
