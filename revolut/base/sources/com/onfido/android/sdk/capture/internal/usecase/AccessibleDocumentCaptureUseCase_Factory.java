package com.onfido.android.sdk.capture.internal.usecase;

import android.content.Context;
import com.onfido.android.sdk.capture.internal.service.VibratorService;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.android.sdk.capture.native_detector.NativeDetector;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class AccessibleDocumentCaptureUseCase_Factory implements el.b {
    private final Provider contextProvider;
    private final Provider documentPositionUseCaseProvider;
    private final Provider nativeDetectorProvider;
    private final Provider schedulersProvider;
    private final Provider vibratorServiceProvider;

    public AccessibleDocumentCaptureUseCase_Factory(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.documentPositionUseCaseProvider = provider;
        this.schedulersProvider = provider2;
        this.nativeDetectorProvider = provider3;
        this.vibratorServiceProvider = provider4;
        this.contextProvider = provider5;
    }

    public static AccessibleDocumentCaptureUseCase_Factory create(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new AccessibleDocumentCaptureUseCase_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static AccessibleDocumentCaptureUseCase newInstance(DocumentPositionUseCase documentPositionUseCase, SchedulersProvider schedulersProvider, NativeDetector nativeDetector, VibratorService vibratorService, Context context) {
        return new AccessibleDocumentCaptureUseCase(documentPositionUseCase, schedulersProvider, nativeDetector, vibratorService, context);
    }

    @Override // com.onfido.javax.inject.Provider
    public AccessibleDocumentCaptureUseCase get() {
        return newInstance((DocumentPositionUseCase) this.documentPositionUseCaseProvider.get(), (SchedulersProvider) this.schedulersProvider.get(), (NativeDetector) this.nativeDetectorProvider.get(), (VibratorService) this.vibratorServiceProvider.get(), (Context) this.contextProvider.get());
    }
}
