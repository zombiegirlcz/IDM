package com.onfido.android.sdk.capture.internal.performance;

import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.android.sdk.capture.internal.performance.repository.PerformanceAnalyticsNetwork;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class PerformanceAnalyticsImpl_Factory implements b {
    private final Provider performanceAnalyticsNetworkProvider;
    private final Provider remoteConfigProvider;

    public PerformanceAnalyticsImpl_Factory(Provider provider, Provider provider2) {
        this.performanceAnalyticsNetworkProvider = provider;
        this.remoteConfigProvider = provider2;
    }

    public static PerformanceAnalyticsImpl_Factory create(Provider provider, Provider provider2) {
        return new PerformanceAnalyticsImpl_Factory(provider, provider2);
    }

    public static PerformanceAnalyticsImpl newInstance(PerformanceAnalyticsNetwork performanceAnalyticsNetwork, OnfidoRemoteConfig onfidoRemoteConfig) {
        return new PerformanceAnalyticsImpl(performanceAnalyticsNetwork, onfidoRemoteConfig);
    }

    @Override // com.onfido.javax.inject.Provider
    public PerformanceAnalyticsImpl get() {
        return newInstance((PerformanceAnalyticsNetwork) this.performanceAnalyticsNetworkProvider.get(), (OnfidoRemoteConfig) this.remoteConfigProvider.get());
    }
}
