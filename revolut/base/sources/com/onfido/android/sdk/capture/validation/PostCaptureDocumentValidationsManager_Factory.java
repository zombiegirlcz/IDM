package com.onfido.android.sdk.capture.validation;

import com.onfido.android.sdk.capture.analytics.IdentityInteractor;
import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.android.sdk.capture.internal.validation.RetainableValidationsResult;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class PostCaptureDocumentValidationsManager_Factory implements el.b {
    private final Provider barcodeValidationSuspenderProvider;
    private final Provider identityInteractorProvider;
    private final Provider onDeviceValidationTransformerProvider;
    private final Provider onfidoRemoteConfigProvider;
    private final Provider retainableValidationsResultProvider;

    public PostCaptureDocumentValidationsManager_Factory(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.identityInteractorProvider = provider;
        this.onDeviceValidationTransformerProvider = provider2;
        this.retainableValidationsResultProvider = provider3;
        this.barcodeValidationSuspenderProvider = provider4;
        this.onfidoRemoteConfigProvider = provider5;
    }

    public static PostCaptureDocumentValidationsManager_Factory create(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new PostCaptureDocumentValidationsManager_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static PostCaptureDocumentValidationsManager newInstance(IdentityInteractor identityInteractor, OnDeviceValidationTransformer onDeviceValidationTransformer, RetainableValidationsResult retainableValidationsResult, BarcodeValidationSuspender barcodeValidationSuspender, OnfidoRemoteConfig onfidoRemoteConfig) {
        return new PostCaptureDocumentValidationsManager(identityInteractor, onDeviceValidationTransformer, retainableValidationsResult, barcodeValidationSuspender, onfidoRemoteConfig);
    }

    @Override // com.onfido.javax.inject.Provider
    public PostCaptureDocumentValidationsManager get() {
        return newInstance((IdentityInteractor) this.identityInteractorProvider.get(), (OnDeviceValidationTransformer) this.onDeviceValidationTransformerProvider.get(), (RetainableValidationsResult) this.retainableValidationsResultProvider.get(), (BarcodeValidationSuspender) this.barcodeValidationSuspenderProvider.get(), (OnfidoRemoteConfig) this.onfidoRemoteConfigProvider.get());
    }
}
