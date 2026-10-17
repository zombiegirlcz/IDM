package androidx.camera.camera2.config;

import androidx.camera.camera2.compat.Camera2CameraControlCompat;
import androidx.camera.camera2.impl.ComboRequestListener;
import androidx.camera.camera2.impl.UseCaseThreads;
import androidx.camera.camera2.interop.Camera2CameraControl;
import e4m.e;
import vc.s;

/* JADX INFO: loaded from: classes13.dex */
public abstract class CameraModule_Companion_ProvideCamera2CameraControlFactory implements e {
    public static Camera2CameraControl provideCamera2CameraControl(Camera2CameraControlCompat camera2CameraControlCompat, UseCaseThreads useCaseThreads, ComboRequestListener comboRequestListener) {
        Camera2CameraControl camera2CameraControlProvideCamera2CameraControl = CameraModule.INSTANCE.provideCamera2CameraControl(camera2CameraControlCompat, useCaseThreads, comboRequestListener);
        s.k(camera2CameraControlProvideCamera2CameraControl);
        return camera2CameraControlProvideCamera2CameraControl;
    }
}
