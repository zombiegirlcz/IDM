package com.onfido.android.sdk.capture.common.di.network;

import com.onfido.android.sdk.capture.analytics.IdentityInteractor;
import com.onfido.android.sdk.capture.internal.token.OnfidoTokenProvider;
import com.onfido.api.client.OnfidoAPI;
import com.onfido.api.client.OnfidoFetcher;
import com.onfido.javax.inject.Provider;
import el.b;
import kotlinx.serialization.json.Json;
import n14.e;

/* JADX INFO: loaded from: classes17.dex */
public final class NetworkModule_ProvideOnfidoAPI$onfido_capture_sdk_core_releaseFactory implements b {
    private final Provider identityInteractorProvider;
    private final Provider jsonProvider;
    private final Provider onfidoFetcherProvider;
    private final Provider tokenProvider;

    public NetworkModule_ProvideOnfidoAPI$onfido_capture_sdk_core_releaseFactory(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.tokenProvider = provider;
        this.onfidoFetcherProvider = provider2;
        this.identityInteractorProvider = provider3;
        this.jsonProvider = provider4;
    }

    public static NetworkModule_ProvideOnfidoAPI$onfido_capture_sdk_core_releaseFactory create(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        return new NetworkModule_ProvideOnfidoAPI$onfido_capture_sdk_core_releaseFactory(provider, provider2, provider3, provider4);
    }

    public static OnfidoAPI provideOnfidoAPI$onfido_capture_sdk_core_release(OnfidoTokenProvider onfidoTokenProvider, OnfidoFetcher onfidoFetcher, IdentityInteractor identityInteractor, Json json) {
        OnfidoAPI onfidoAPIProvideOnfidoAPI$onfido_capture_sdk_core_release = NetworkModule.INSTANCE.provideOnfidoAPI$onfido_capture_sdk_core_release(onfidoTokenProvider, onfidoFetcher, identityInteractor, json);
        e.g(onfidoAPIProvideOnfidoAPI$onfido_capture_sdk_core_release);
        return onfidoAPIProvideOnfidoAPI$onfido_capture_sdk_core_release;
    }

    @Override // com.onfido.javax.inject.Provider
    public OnfidoAPI get() {
        return provideOnfidoAPI$onfido_capture_sdk_core_release((OnfidoTokenProvider) this.tokenProvider.get(), (OnfidoFetcher) this.onfidoFetcherProvider.get(), (IdentityInteractor) this.identityInteractorProvider.get(), (Json) this.jsonProvider.get());
    }
}
