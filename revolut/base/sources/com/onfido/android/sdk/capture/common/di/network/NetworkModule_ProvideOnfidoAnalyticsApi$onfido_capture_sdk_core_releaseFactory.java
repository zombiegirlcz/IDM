package com.onfido.android.sdk.capture.common.di.network;

import com.onfido.android.sdk.capture.internal.analytics.inhouse.network.OnfidoAnalyticsApi;
import com.onfido.api.client.OnfidoFetcher;
import com.onfido.javax.inject.Provider;
import el.b;
import n14.e;

/* JADX INFO: loaded from: classes17.dex */
public final class NetworkModule_ProvideOnfidoAnalyticsApi$onfido_capture_sdk_core_releaseFactory implements b {
    private final Provider onfidoFetcherProvider;

    public NetworkModule_ProvideOnfidoAnalyticsApi$onfido_capture_sdk_core_releaseFactory(Provider provider) {
        this.onfidoFetcherProvider = provider;
    }

    public static NetworkModule_ProvideOnfidoAnalyticsApi$onfido_capture_sdk_core_releaseFactory create(Provider provider) {
        return new NetworkModule_ProvideOnfidoAnalyticsApi$onfido_capture_sdk_core_releaseFactory(provider);
    }

    public static OnfidoAnalyticsApi provideOnfidoAnalyticsApi$onfido_capture_sdk_core_release(OnfidoFetcher onfidoFetcher) {
        OnfidoAnalyticsApi onfidoAnalyticsApiProvideOnfidoAnalyticsApi$onfido_capture_sdk_core_release = NetworkModule.INSTANCE.provideOnfidoAnalyticsApi$onfido_capture_sdk_core_release(onfidoFetcher);
        e.g(onfidoAnalyticsApiProvideOnfidoAnalyticsApi$onfido_capture_sdk_core_release);
        return onfidoAnalyticsApiProvideOnfidoAnalyticsApi$onfido_capture_sdk_core_release;
    }

    @Override // com.onfido.javax.inject.Provider
    public OnfidoAnalyticsApi get() {
        return provideOnfidoAnalyticsApi$onfido_capture_sdk_core_release((OnfidoFetcher) this.onfidoFetcherProvider.get());
    }
}
