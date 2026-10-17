package com.onfido.android.sdk.capture.ui.camera.rx;

import com.onfido.android.sdk.capture.document.DocumentConfigurationManager;
import com.onfido.android.sdk.capture.internal.usecase.DocumentProcessingUseCase;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.android.sdk.capture.native_detector.NativeDetector;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class DocumentCaptureDelayTransformer_Factory implements el.b {
    private final Provider documentConfigurationManagerProvider;
    private final Provider documentProcessingUseCaseProvider;
    private final Provider nativeDetectorProvider;
    private final Provider schedulersProvider;

    public DocumentCaptureDelayTransformer_Factory(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.nativeDetectorProvider = provider;
        this.documentConfigurationManagerProvider = provider2;
        this.schedulersProvider = provider3;
        this.documentProcessingUseCaseProvider = provider4;
    }

    public static DocumentCaptureDelayTransformer_Factory create(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        return new DocumentCaptureDelayTransformer_Factory(provider, provider2, provider3, provider4);
    }

    public static DocumentCaptureDelayTransformer newInstance(NativeDetector nativeDetector, DocumentConfigurationManager documentConfigurationManager, SchedulersProvider schedulersProvider, DocumentProcessingUseCase documentProcessingUseCase) {
        return new DocumentCaptureDelayTransformer(nativeDetector, documentConfigurationManager, schedulersProvider, documentProcessingUseCase);
    }

    @Override // com.onfido.javax.inject.Provider
    public DocumentCaptureDelayTransformer get() {
        return newInstance((NativeDetector) this.nativeDetectorProvider.get(), (DocumentConfigurationManager) this.documentConfigurationManagerProvider.get(), (SchedulersProvider) this.schedulersProvider.get(), (DocumentProcessingUseCase) this.documentProcessingUseCaseProvider.get());
    }
}
