package com.onfido.android.sdk.capture.internal.analytics.inhouse;

import com.onfido.android.sdk.capture.internal.analytics.inhouse.network.OnfidoAnalyticsApi;
import com.onfido.android.sdk.capture.network.error.ErrorHandler;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class InhouseAnalyticsRepository_Factory implements b {
    private final Provider analyticsApiProvider;
    private final Provider errorHandlerProvider;
    private final Provider onfidoAnalyticsMapperProvider;

    public InhouseAnalyticsRepository_Factory(Provider provider, Provider provider2, Provider provider3) {
        this.analyticsApiProvider = provider;
        this.onfidoAnalyticsMapperProvider = provider2;
        this.errorHandlerProvider = provider3;
    }

    public static InhouseAnalyticsRepository_Factory create(Provider provider, Provider provider2, Provider provider3) {
        return new InhouseAnalyticsRepository_Factory(provider, provider2, provider3);
    }

    public static InhouseAnalyticsRepository newInstance(OnfidoAnalyticsApi onfidoAnalyticsApi, OnfidoAnalyticsMapper onfidoAnalyticsMapper, ErrorHandler errorHandler) {
        return new InhouseAnalyticsRepository(onfidoAnalyticsApi, onfidoAnalyticsMapper, errorHandler);
    }

    @Override // com.onfido.javax.inject.Provider
    public InhouseAnalyticsRepository get() {
        return newInstance((OnfidoAnalyticsApi) this.analyticsApiProvider.get(), (OnfidoAnalyticsMapper) this.onfidoAnalyticsMapperProvider.get(), (ErrorHandler) this.errorHandlerProvider.get());
    }
}
