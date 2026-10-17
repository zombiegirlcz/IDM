package com.onfido.android.sdk.capture.validation;

import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.android.sdk.capture.internal.validation.backend.DefaultBackendValidations;
import com.onfido.android.sdk.capture.internal.validation.backend.IQSValidations;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class BackendDocumentValidationsManager_Factory implements el.b {
    private final Provider defaultValidationsProvider;
    private final Provider iQSValidationsProvider;
    private final Provider onfidoRemoteConfigProvider;

    public BackendDocumentValidationsManager_Factory(Provider provider, Provider provider2, Provider provider3) {
        this.defaultValidationsProvider = provider;
        this.iQSValidationsProvider = provider2;
        this.onfidoRemoteConfigProvider = provider3;
    }

    public static BackendDocumentValidationsManager_Factory create(Provider provider, Provider provider2, Provider provider3) {
        return new BackendDocumentValidationsManager_Factory(provider, provider2, provider3);
    }

    public static BackendDocumentValidationsManager newInstance(DefaultBackendValidations defaultBackendValidations, IQSValidations iQSValidations, OnfidoRemoteConfig onfidoRemoteConfig) {
        return new BackendDocumentValidationsManager(defaultBackendValidations, iQSValidations, onfidoRemoteConfig);
    }

    @Override // com.onfido.javax.inject.Provider
    public BackendDocumentValidationsManager get() {
        return newInstance((DefaultBackendValidations) this.defaultValidationsProvider.get(), (IQSValidations) this.iQSValidationsProvider.get(), (OnfidoRemoteConfig) this.onfidoRemoteConfigProvider.get());
    }
}
