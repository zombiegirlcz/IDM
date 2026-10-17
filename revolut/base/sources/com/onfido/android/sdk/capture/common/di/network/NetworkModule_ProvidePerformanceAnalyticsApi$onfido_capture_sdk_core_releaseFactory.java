package com.onfido.android.sdk.capture.common.di.network;

import com.onfido.android.sdk.capture.internal.performance.repository.PerformanceAnalyticsApi;
import com.onfido.api.client.OnfidoFetcher;
import com.onfido.javax.inject.Provider;
import el.b;
import n14.e;

/* JADX INFO: loaded from: classes17.dex */
public final class NetworkModule_ProvidePerformanceAnalyticsApi$onfido_capture_sdk_core_releaseFactory implements b {
    private final Provider onfidoFetcherProvider;

    public NetworkModule_ProvidePerformanceAnalyticsApi$onfido_capture_sdk_core_releaseFactory(Provider provider) {
        this.onfidoFetcherProvider = provider;
    }

    public static NetworkModule_ProvidePerformanceAnalyticsApi$onfido_capture_sdk_core_releaseFactory create(Provider provider) {
        return new NetworkModule_ProvidePerformanceAnalyticsApi$onfido_capture_sdk_core_releaseFactory(provider);
    }

    public static PerformanceAnalyticsApi providePerformanceAnalyticsApi$onfido_capture_sdk_core_release(OnfidoFetcher onfidoFetcher) {
        PerformanceAnalyticsApi performanceAnalyticsApiProvidePerformanceAnalyticsApi$onfido_capture_sdk_core_release = NetworkModule.INSTANCE.providePerformanceAnalyticsApi$onfido_capture_sdk_core_release(onfidoFetcher);
        e.g(performanceAnalyticsApiProvidePerformanceAnalyticsApi$onfido_capture_sdk_core_release);
        return performanceAnalyticsApiProvidePerformanceAnalyticsApi$onfido_capture_sdk_core_release;
    }

    @Override // com.onfido.javax.inject.Provider
    public PerformanceAnalyticsApi get() {
        return providePerformanceAnalyticsApi$onfido_capture_sdk_core_release((OnfidoFetcher) this.onfidoFetcherProvider.get());
    }
}
