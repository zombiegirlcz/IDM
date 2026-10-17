package androidx.camera.camera2.pipe.config;

import android.content.Context;
import androidx.camera.featurecombinationquery.CameraDeviceSetupCompatFactory;
import e4m.e;
import vc.s;

/* JADX INFO: loaded from: classes15.dex */
public abstract class CameraPipeModule_Companion_ProvideCameraDeviceSetupCompatFactoryFactory implements e {
    public static CameraDeviceSetupCompatFactory provideCameraDeviceSetupCompatFactory(Context context) {
        CameraDeviceSetupCompatFactory cameraDeviceSetupCompatFactoryProvideCameraDeviceSetupCompatFactory = CameraPipeModule.INSTANCE.provideCameraDeviceSetupCompatFactory(context);
        s.k(cameraDeviceSetupCompatFactoryProvideCameraDeviceSetupCompatFactory);
        return cameraDeviceSetupCompatFactoryProvideCameraDeviceSetupCompatFactory;
    }
}
