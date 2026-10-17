package com.onfido.android.sdk.capture.component.active.video.capture.domain.usecase;

import com.google.android.gms.common.moduleinstall.ModuleInstallClient;
import com.google.mlkit.vision.face.FaceDetector;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class GetFaceDetectionModuleAvailabilityUseCase_Factory implements b {
    private final Provider mlKitFaceDetectorProvider;
    private final Provider moduleInstallClientProvider;

    public GetFaceDetectionModuleAvailabilityUseCase_Factory(Provider provider, Provider provider2) {
        this.moduleInstallClientProvider = provider;
        this.mlKitFaceDetectorProvider = provider2;
    }

    public static GetFaceDetectionModuleAvailabilityUseCase_Factory create(Provider provider, Provider provider2) {
        return new GetFaceDetectionModuleAvailabilityUseCase_Factory(provider, provider2);
    }

    public static GetFaceDetectionModuleAvailabilityUseCase newInstance(ModuleInstallClient moduleInstallClient, FaceDetector faceDetector) {
        return new GetFaceDetectionModuleAvailabilityUseCase(moduleInstallClient, faceDetector);
    }

    @Override // com.onfido.javax.inject.Provider
    public GetFaceDetectionModuleAvailabilityUseCase get() {
        return newInstance((ModuleInstallClient) this.moduleInstallClientProvider.get(), (FaceDetector) this.mlKitFaceDetectorProvider.get());
    }
}
