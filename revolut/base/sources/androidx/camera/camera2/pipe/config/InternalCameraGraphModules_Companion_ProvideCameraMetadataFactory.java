package androidx.camera.camera2.pipe.config;

import androidx.camera.camera2.pipe.CameraBackend;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.CameraMetadata;
import e4m.e;
import vc.s;

/* JADX INFO: loaded from: classes15.dex */
public abstract class InternalCameraGraphModules_Companion_ProvideCameraMetadataFactory implements e {
    public static CameraMetadata provideCameraMetadata(CameraGraph.Config config, CameraBackend cameraBackend) {
        CameraMetadata cameraMetadataProvideCameraMetadata = InternalCameraGraphModules.INSTANCE.provideCameraMetadata(config, cameraBackend);
        s.k(cameraMetadataProvideCameraMetadata);
        return cameraMetadataProvideCameraMetadata;
    }
}
