package androidx.camera.camera2.config;

import androidx.camera.camera2.pipe.CameraDevices;
import androidx.camera.camera2.pipe.CameraPipe;
import e4m.e;
import vc.s;

/* JADX INFO: loaded from: classes13.dex */
public abstract class CameraAppModule_Companion_ProvideCameraDevicesFactory implements e {
    public static CameraDevices provideCameraDevices(CameraPipe cameraPipe) {
        CameraDevices cameraDevicesProvideCameraDevices = CameraAppModule.INSTANCE.provideCameraDevices(cameraPipe);
        s.k(cameraDevicesProvideCameraDevices);
        return cameraDevicesProvideCameraDevices;
    }
}
