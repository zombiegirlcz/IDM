package com.onfido.android.sdk.capture.common.di.network;

import com.onfido.android.sdk.capture.internal.util.logging.network.OnfidoLoggerApi;
import com.onfido.api.client.OnfidoFetcher;
import com.onfido.javax.inject.Provider;
import el.b;
import n14.e;

/* JADX INFO: loaded from: classes17.dex */
public final class NetworkModule_ProvideOnfidoLoggerApi$onfido_capture_sdk_core_releaseFactory implements b {
    private final Provider onfidoFetcherProvider;

    public NetworkModule_ProvideOnfidoLoggerApi$onfido_capture_sdk_core_releaseFactory(Provider provider) {
        this.onfidoFetcherProvider = provider;
    }

    public static NetworkModule_ProvideOnfidoLoggerApi$onfido_capture_sdk_core_releaseFactory create(Provider provider) {
        return new NetworkModule_ProvideOnfidoLoggerApi$onfido_capture_sdk_core_releaseFactory(provider);
    }

    public static OnfidoLoggerApi provideOnfidoLoggerApi$onfido_capture_sdk_core_release(OnfidoFetcher onfidoFetcher) {
        OnfidoLoggerApi onfidoLoggerApiProvideOnfidoLoggerApi$onfido_capture_sdk_core_release = NetworkModule.INSTANCE.provideOnfidoLoggerApi$onfido_capture_sdk_core_release(onfidoFetcher);
        e.g(onfidoLoggerApiProvideOnfidoLoggerApi$onfido_capture_sdk_core_release);
        return onfidoLoggerApiProvideOnfidoLoggerApi$onfido_capture_sdk_core_release;
    }

    @Override // com.onfido.javax.inject.Provider
    public OnfidoLoggerApi get() {
        return provideOnfidoLoggerApi$onfido_capture_sdk_core_release((OnfidoFetcher) this.onfidoFetcherProvider.get());
    }
}
