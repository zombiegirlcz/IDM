package com.onfido.android.sdk.capture.internal.camera.camerax;

import com.onfido.android.sdk.capture.utils.TimeProvider;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class CameraXImageAnalysisUseCase_Factory implements el.b {
    private final Provider timeProvider;

    public CameraXImageAnalysisUseCase_Factory(Provider provider) {
        this.timeProvider = provider;
    }

    public static CameraXImageAnalysisUseCase_Factory create(Provider provider) {
        return new CameraXImageAnalysisUseCase_Factory(provider);
    }

    public static CameraXImageAnalysisUseCase newInstance(TimeProvider timeProvider) {
        return new CameraXImageAnalysisUseCase(timeProvider);
    }

    @Override // com.onfido.javax.inject.Provider
    public CameraXImageAnalysisUseCase get() {
        return newInstance((TimeProvider) this.timeProvider.get());
    }
}
