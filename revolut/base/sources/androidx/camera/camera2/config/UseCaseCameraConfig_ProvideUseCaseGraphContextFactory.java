package androidx.camera.camera2.config;

import androidx.camera.camera2.adapter.CameraStateAdapter;
import e4m.e;
import vc.s;

/* JADX INFO: loaded from: classes13.dex */
public abstract class UseCaseCameraConfig_ProvideUseCaseGraphContextFactory implements e {
    public static UseCaseGraphContext provideUseCaseGraphContext(UseCaseCameraConfig useCaseCameraConfig, CameraStateAdapter cameraStateAdapter) {
        UseCaseGraphContext useCaseGraphContextProvideUseCaseGraphContext = useCaseCameraConfig.provideUseCaseGraphContext(cameraStateAdapter);
        s.k(useCaseGraphContextProvideUseCaseGraphContext);
        return useCaseGraphContextProvideUseCaseGraphContext;
    }
}
