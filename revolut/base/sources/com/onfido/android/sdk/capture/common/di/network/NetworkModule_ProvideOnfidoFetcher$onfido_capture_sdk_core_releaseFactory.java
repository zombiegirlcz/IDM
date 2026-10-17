package com.onfido.android.sdk.capture.common.di.network;

import com.onfido.android.sdk.capture.OnfidoConfig;
import com.onfido.android.sdk.capture.analytics.IdentityInteractor;
import com.onfido.android.sdk.capture.internal.token.OnfidoTokenProvider;
import com.onfido.api.client.OnfidoFetcher;
import com.onfido.javax.inject.Provider;
import el.b;
import kotlinx.serialization.json.Json;
import n14.e;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes17.dex */
public final class NetworkModule_ProvideOnfidoFetcher$onfido_capture_sdk_core_releaseFactory implements b {
    private final Provider identityInteractorProvider;
    private final Provider jsonProvider;
    private final Provider okHttpClientProvider;
    private final Provider onfidoConfigProvider;
    private final Provider tokenProvider;

    public NetworkModule_ProvideOnfidoFetcher$onfido_capture_sdk_core_releaseFactory(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.okHttpClientProvider = provider;
        this.tokenProvider = provider2;
        this.onfidoConfigProvider = provider3;
        this.identityInteractorProvider = provider4;
        this.jsonProvider = provider5;
    }

    public static NetworkModule_ProvideOnfidoFetcher$onfido_capture_sdk_core_releaseFactory create(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new NetworkModule_ProvideOnfidoFetcher$onfido_capture_sdk_core_releaseFactory(provider, provider2, provider3, provider4, provider5);
    }

    public static OnfidoFetcher provideOnfidoFetcher$onfido_capture_sdk_core_release(OkHttpClient okHttpClient, OnfidoTokenProvider onfidoTokenProvider, OnfidoConfig onfidoConfig, IdentityInteractor identityInteractor, Json json) {
        OnfidoFetcher onfidoFetcherProvideOnfidoFetcher$onfido_capture_sdk_core_release = NetworkModule.INSTANCE.provideOnfidoFetcher$onfido_capture_sdk_core_release(okHttpClient, onfidoTokenProvider, onfidoConfig, identityInteractor, json);
        e.g(onfidoFetcherProvideOnfidoFetcher$onfido_capture_sdk_core_release);
        return onfidoFetcherProvideOnfidoFetcher$onfido_capture_sdk_core_release;
    }

    @Override // com.onfido.javax.inject.Provider
    public OnfidoFetcher get() {
        return provideOnfidoFetcher$onfido_capture_sdk_core_release((OkHttpClient) this.okHttpClientProvider.get(), (OnfidoTokenProvider) this.tokenProvider.get(), (OnfidoConfig) this.onfidoConfigProvider.get(), (IdentityInteractor) this.identityInteractorProvider.get(), (Json) this.jsonProvider.get());
    }
}
