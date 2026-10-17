package com.onfido.android.sdk.capture.internal.usecase;

import com.onfido.android.sdk.capture.detector.face.FaceDetector;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class FaceProcessingUseCase_Factory implements el.b {
    private final Provider faceDetectorGoogleProvider;
    private final Provider schedulersProvider;

    public FaceProcessingUseCase_Factory(Provider provider, Provider provider2) {
        this.faceDetectorGoogleProvider = provider;
        this.schedulersProvider = provider2;
    }

    public static FaceProcessingUseCase_Factory create(Provider provider, Provider provider2) {
        return new FaceProcessingUseCase_Factory(provider, provider2);
    }

    public static FaceProcessingUseCase newInstance(FaceDetector faceDetector, SchedulersProvider schedulersProvider) {
        return new FaceProcessingUseCase(faceDetector, schedulersProvider);
    }

    @Override // com.onfido.javax.inject.Provider
    public FaceProcessingUseCase get() {
        return newInstance((FaceDetector) this.faceDetectorGoogleProvider.get(), (SchedulersProvider) this.schedulersProvider.get());
    }
}
