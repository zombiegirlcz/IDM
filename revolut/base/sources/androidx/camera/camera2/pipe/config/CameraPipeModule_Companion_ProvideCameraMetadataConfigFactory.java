package androidx.camera.camera2.pipe.config;

import androidx.camera.camera2.pipe.CameraPipe;
import e4m.e;
import vc.s;

/* JADX INFO: loaded from: classes15.dex */
public abstract class CameraPipeModule_Companion_ProvideCameraMetadataConfigFactory implements e {
    public static CameraPipe.CameraMetadataConfig provideCameraMetadataConfig(CameraPipe.Config config) {
        CameraPipe.CameraMetadataConfig cameraMetadataConfigProvideCameraMetadataConfig = CameraPipeModule.INSTANCE.provideCameraMetadataConfig(config);
        s.k(cameraMetadataConfigProvideCameraMetadataConfig);
        return cameraMetadataConfigProvideCameraMetadataConfig;
    }
}
