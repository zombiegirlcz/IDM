package androidx.camera.camera2.pipe.config;

import androidx.camera.camera2.pipe.CameraGraphId;
import e4m.e;
import vc.s;

/* JADX INFO: loaded from: classes15.dex */
public abstract class CameraGraphConfigModule_ProvideCameraGraphIdFactory implements e {
    public static CameraGraphId provideCameraGraphId(CameraGraphConfigModule cameraGraphConfigModule) {
        CameraGraphId cameraGraphId = cameraGraphConfigModule.getCameraGraphId();
        s.k(cameraGraphId);
        return cameraGraphId;
    }
}
