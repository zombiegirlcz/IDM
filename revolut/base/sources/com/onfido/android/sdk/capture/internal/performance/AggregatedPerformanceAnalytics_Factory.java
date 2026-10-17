package com.onfido.android.sdk.capture.internal.performance;

import android.content.Context;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class AggregatedPerformanceAnalytics_Factory implements b {
    private final Provider contextProvider;
    private final Provider performanceAnalyticsImplProvider;

    public AggregatedPerformanceAnalytics_Factory(Provider provider, Provider provider2) {
        this.performanceAnalyticsImplProvider = provider;
        this.contextProvider = provider2;
    }

    public static AggregatedPerformanceAnalytics_Factory create(Provider provider, Provider provider2) {
        return new AggregatedPerformanceAnalytics_Factory(provider, provider2);
    }

    public static AggregatedPerformanceAnalytics newInstance(PerformanceAnalyticsImpl performanceAnalyticsImpl, Context context) {
        return new AggregatedPerformanceAnalytics(performanceAnalyticsImpl, context);
    }

    @Override // com.onfido.javax.inject.Provider
    public AggregatedPerformanceAnalytics get() {
        return newInstance((PerformanceAnalyticsImpl) this.performanceAnalyticsImplProvider.get(), (Context) this.contextProvider.get());
    }
}
