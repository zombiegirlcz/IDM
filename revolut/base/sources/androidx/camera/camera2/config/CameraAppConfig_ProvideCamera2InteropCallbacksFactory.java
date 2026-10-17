package androidx.camera.camera2.config;

import androidx.camera.camera2.impl.CameraInteropStateCallbackRepository;
import e4m.e;
import vc.s;

/* JADX INFO: loaded from: classes13.dex */
public abstract class CameraAppConfig_ProvideCamera2InteropCallbacksFactory implements e {
    public static CameraInteropStateCallbackRepository provideCamera2InteropCallbacks(CameraAppConfig cameraAppConfig) {
        CameraInteropStateCallbackRepository camera2InteropCallbacks = cameraAppConfig.getCamera2InteropCallbacks();
        s.k(camera2InteropCallbacks);
        return camera2InteropCallbacks;
    }
}
