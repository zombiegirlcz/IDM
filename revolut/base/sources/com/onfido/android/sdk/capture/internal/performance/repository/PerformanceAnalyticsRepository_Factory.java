package com.onfido.android.sdk.capture.internal.performance.repository;

import com.onfido.android.sdk.capture.internal.analytics.inhouse.OnfidoAnalyticsMapper;
import com.onfido.android.sdk.capture.network.error.ErrorHandler;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class PerformanceAnalyticsRepository_Factory implements b {
    private final Provider errorHandlerProvider;
    private final Provider onfidoAnalyticsMapperProvider;
    private final Provider performanceAnalyticsApiProvider;

    public PerformanceAnalyticsRepository_Factory(Provider provider, Provider provider2, Provider provider3) {
        this.performanceAnalyticsApiProvider = provider;
        this.onfidoAnalyticsMapperProvider = provider2;
        this.errorHandlerProvider = provider3;
    }

    public static PerformanceAnalyticsRepository_Factory create(Provider provider, Provider provider2, Provider provider3) {
        return new PerformanceAnalyticsRepository_Factory(provider, provider2, provider3);
    }

    public static PerformanceAnalyticsRepository newInstance(PerformanceAnalyticsApi performanceAnalyticsApi, OnfidoAnalyticsMapper onfidoAnalyticsMapper, ErrorHandler errorHandler) {
        return new PerformanceAnalyticsRepository(performanceAnalyticsApi, onfidoAnalyticsMapper, errorHandler);
    }

    @Override // com.onfido.javax.inject.Provider
    public PerformanceAnalyticsRepository get() {
        return newInstance((PerformanceAnalyticsApi) this.performanceAnalyticsApiProvider.get(), (OnfidoAnalyticsMapper) this.onfidoAnalyticsMapperProvider.get(), (ErrorHandler) this.errorHandlerProvider.get());
    }
}
