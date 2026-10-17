package com.onfido.android.sdk.capture.internal.usecase;

import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.android.sdk.capture.internal.validation.RetainableValidationsResult;
import com.onfido.android.sdk.capture.native_detector.NativeDetector;
import com.onfido.android.sdk.capture.validation.BarcodeValidationSuspender;
import com.onfido.android.sdk.capture.validation.OnDeviceValidationTransformer;
import com.onfido.android.sdk.capture.validation.RealTimeDocumentValidationsManager;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class DocumentProcessingUseCase_Factory implements el.b {
    private final Provider barcodeValidationSuspenderProvider;
    private final Provider nativeDetectorProvider;
    private final Provider onDeviceValidationTransformerProvider;
    private final Provider onfidoRemoteConfigProvider;
    private final Provider realTimeDocumentValidationsManagerProvider;
    private final Provider retainableValidationsResultProvider;
    private final Provider schedulersProvider;

    public DocumentProcessingUseCase_Factory(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        this.nativeDetectorProvider = provider;
        this.realTimeDocumentValidationsManagerProvider = provider2;
        this.onDeviceValidationTransformerProvider = provider3;
        this.retainableValidationsResultProvider = provider4;
        this.barcodeValidationSuspenderProvider = provider5;
        this.schedulersProvider = provider6;
        this.onfidoRemoteConfigProvider = provider7;
    }

    public static DocumentProcessingUseCase_Factory create(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        return new DocumentProcessingUseCase_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static DocumentProcessingUseCase newInstance(NativeDetector nativeDetector, RealTimeDocumentValidationsManager realTimeDocumentValidationsManager, OnDeviceValidationTransformer onDeviceValidationTransformer, RetainableValidationsResult retainableValidationsResult, BarcodeValidationSuspender barcodeValidationSuspender, SchedulersProvider schedulersProvider, OnfidoRemoteConfig onfidoRemoteConfig) {
        return new DocumentProcessingUseCase(nativeDetector, realTimeDocumentValidationsManager, onDeviceValidationTransformer, retainableValidationsResult, barcodeValidationSuspender, schedulersProvider, onfidoRemoteConfig);
    }

    @Override // com.onfido.javax.inject.Provider
    public DocumentProcessingUseCase get() {
        return newInstance((NativeDetector) this.nativeDetectorProvider.get(), (RealTimeDocumentValidationsManager) this.realTimeDocumentValidationsManagerProvider.get(), (OnDeviceValidationTransformer) this.onDeviceValidationTransformerProvider.get(), (RetainableValidationsResult) this.retainableValidationsResultProvider.get(), (BarcodeValidationSuspender) this.barcodeValidationSuspenderProvider.get(), (SchedulersProvider) this.schedulersProvider.get(), (OnfidoRemoteConfig) this.onfidoRemoteConfigProvider.get());
    }
}
