package com.onfido.android.sdk.capture.common.di.network;

import com.onfido.android.sdk.capture.internal.analytics.inhouse.network.OnfidoAssetsApi;
import com.onfido.api.client.OnfidoFetcher;
import com.onfido.javax.inject.Provider;
import el.b;
import n14.e;

/* JADX INFO: loaded from: classes17.dex */
public final class NetworkModule_ProvideOnfidoAssetsApi$onfido_capture_sdk_core_releaseFactory implements b {
    private final Provider onfidoFetcherProvider;

    public NetworkModule_ProvideOnfidoAssetsApi$onfido_capture_sdk_core_releaseFactory(Provider provider) {
        this.onfidoFetcherProvider = provider;
    }

    public static NetworkModule_ProvideOnfidoAssetsApi$onfido_capture_sdk_core_releaseFactory create(Provider provider) {
        return new NetworkModule_ProvideOnfidoAssetsApi$onfido_capture_sdk_core_releaseFactory(provider);
    }

    public static OnfidoAssetsApi provideOnfidoAssetsApi$onfido_capture_sdk_core_release(OnfidoFetcher onfidoFetcher) {
        OnfidoAssetsApi onfidoAssetsApiProvideOnfidoAssetsApi$onfido_capture_sdk_core_release = NetworkModule.INSTANCE.provideOnfidoAssetsApi$onfido_capture_sdk_core_release(onfidoFetcher);
        e.g(onfidoAssetsApiProvideOnfidoAssetsApi$onfido_capture_sdk_core_release);
        return onfidoAssetsApiProvideOnfidoAssetsApi$onfido_capture_sdk_core_release;
    }

    @Override // com.onfido.javax.inject.Provider
    public OnfidoAssetsApi get() {
        return provideOnfidoAssetsApi$onfido_capture_sdk_core_release((OnfidoFetcher) this.onfidoFetcherProvider.get());
    }
}
