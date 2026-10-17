package com.onfido.android.sdk.capture.common.di.network;

import com.onfido.android.sdk.capture.document.supported.data.remote.datasource.SupportedDocumentsApi;
import com.onfido.api.client.OnfidoFetcher;
import com.onfido.javax.inject.Provider;
import el.b;
import n14.e;

/* JADX INFO: loaded from: classes17.dex */
public final class NetworkModule_ProvideSupportedDocumentsApi$onfido_capture_sdk_core_releaseFactory implements b {
    private final Provider onfidoFetcherProvider;

    public NetworkModule_ProvideSupportedDocumentsApi$onfido_capture_sdk_core_releaseFactory(Provider provider) {
        this.onfidoFetcherProvider = provider;
    }

    public static NetworkModule_ProvideSupportedDocumentsApi$onfido_capture_sdk_core_releaseFactory create(Provider provider) {
        return new NetworkModule_ProvideSupportedDocumentsApi$onfido_capture_sdk_core_releaseFactory(provider);
    }

    public static SupportedDocumentsApi provideSupportedDocumentsApi$onfido_capture_sdk_core_release(OnfidoFetcher onfidoFetcher) {
        SupportedDocumentsApi supportedDocumentsApiProvideSupportedDocumentsApi$onfido_capture_sdk_core_release = NetworkModule.INSTANCE.provideSupportedDocumentsApi$onfido_capture_sdk_core_release(onfidoFetcher);
        e.g(supportedDocumentsApiProvideSupportedDocumentsApi$onfido_capture_sdk_core_release);
        return supportedDocumentsApiProvideSupportedDocumentsApi$onfido_capture_sdk_core_release;
    }

    @Override // com.onfido.javax.inject.Provider
    public SupportedDocumentsApi get() {
        return provideSupportedDocumentsApi$onfido_capture_sdk_core_release((OnfidoFetcher) this.onfidoFetcherProvider.get());
    }
}
