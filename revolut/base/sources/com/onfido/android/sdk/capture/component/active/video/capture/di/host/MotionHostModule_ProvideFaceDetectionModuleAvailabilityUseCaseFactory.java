package com.onfido.android.sdk.capture.component.active.video.capture.di.host;

import com.google.android.gms.common.moduleinstall.ModuleInstallClient;
import com.google.mlkit.vision.face.FaceDetector;
import com.onfido.android.sdk.capture.component.active.video.capture.domain.usecase.GetFaceDetectionModuleAvailabilityUseCase;
import com.onfido.javax.inject.Provider;
import el.b;
import n14.e;

/* JADX INFO: loaded from: classes17.dex */
public final class MotionHostModule_ProvideFaceDetectionModuleAvailabilityUseCaseFactory implements b {
    private final Provider installClientProvider;
    private final Provider mlKitFaceDetectorProvider;
    private final MotionHostModule module;

    public MotionHostModule_ProvideFaceDetectionModuleAvailabilityUseCaseFactory(MotionHostModule motionHostModule, Provider provider, Provider provider2) {
        this.module = motionHostModule;
        this.installClientProvider = provider;
        this.mlKitFaceDetectorProvider = provider2;
    }

    public static MotionHostModule_ProvideFaceDetectionModuleAvailabilityUseCaseFactory create(MotionHostModule motionHostModule, Provider provider, Provider provider2) {
        return new MotionHostModule_ProvideFaceDetectionModuleAvailabilityUseCaseFactory(motionHostModule, provider, provider2);
    }

    public static GetFaceDetectionModuleAvailabilityUseCase provideFaceDetectionModuleAvailabilityUseCase(MotionHostModule motionHostModule, ModuleInstallClient moduleInstallClient, FaceDetector faceDetector) {
        GetFaceDetectionModuleAvailabilityUseCase getFaceDetectionModuleAvailabilityUseCaseProvideFaceDetectionModuleAvailabilityUseCase = motionHostModule.provideFaceDetectionModuleAvailabilityUseCase(moduleInstallClient, faceDetector);
        e.g(getFaceDetectionModuleAvailabilityUseCaseProvideFaceDetectionModuleAvailabilityUseCase);
        return getFaceDetectionModuleAvailabilityUseCaseProvideFaceDetectionModuleAvailabilityUseCase;
    }

    @Override // com.onfido.javax.inject.Provider
    public GetFaceDetectionModuleAvailabilityUseCase get() {
        return provideFaceDetectionModuleAvailabilityUseCase(this.module, (ModuleInstallClient) this.installClientProvider.get(), (FaceDetector) this.mlKitFaceDetectorProvider.get());
    }
}
