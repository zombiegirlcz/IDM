package androidx.camera.camera2.config;

import androidx.camera.camera2.impl.UseCaseThreads;
import androidx.camera.core.impl.CameraThreadConfig;
import e4m.e;
import vc.s;

/* JADX INFO: loaded from: classes13.dex */
public abstract class CameraModule_Companion_ProvideUseCaseThreadsFactory implements e {
    public static UseCaseThreads provideUseCaseThreads(CameraConfig cameraConfig, CameraThreadConfig cameraThreadConfig) {
        UseCaseThreads useCaseThreadsProvideUseCaseThreads = CameraModule.INSTANCE.provideUseCaseThreads(cameraConfig, cameraThreadConfig);
        s.k(useCaseThreadsProvideUseCaseThreads);
        return useCaseThreadsProvideUseCaseThreads;
    }
}
