package vx;

import com.revolut.camerakit.client.api.models.CameraCaptureSettings;
import com.revolut.camerakit.client.api.models.CameraKitClientSettings;
import com.revolut.camerakit.client.api.models.CaptureMode;
import e4m.e;

/* JADX INFO: loaded from: classes16.dex */
public final class c implements e {
    public static CameraKitClientSettings a() {
        b.Companion.getClass();
        CameraCaptureSettings.Photo.INSTANCE.getClass();
        return new CameraKitClientSettings(CameraCaptureSettings.Photo.f50697g, new CaptureMode.AutoCapture(3), false);
    }

    @Override // phm.a
    public final Object get() {
        return a();
    }
}
