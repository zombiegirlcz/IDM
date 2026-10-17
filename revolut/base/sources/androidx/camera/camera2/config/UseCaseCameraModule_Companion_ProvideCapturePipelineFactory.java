package androidx.camera.camera2.config;

import androidx.camera.camera2.impl.CapturePipeline;
import e4m.e;
import phm.a;
import vc.s;

/* JADX INFO: loaded from: classes13.dex */
public abstract class UseCaseCameraModule_Companion_ProvideCapturePipelineFactory implements e {
    public static CapturePipeline provideCapturePipeline(a aVar, a aVar2) {
        CapturePipeline capturePipelineProvideCapturePipeline = UseCaseCameraModule.INSTANCE.provideCapturePipeline(aVar, aVar2);
        s.k(capturePipelineProvideCapturePipeline);
        return capturePipelineProvideCapturePipeline;
    }
}
