package com.onfido.android.sdk.capture.internal.performance.trackers;

import com.onfido.android.sdk.capture.internal.performance.AggregatedPerformanceAnalytics;
import com.onfido.android.sdk.capture.utils.TimeProvider;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class ScreenLoadTracker_Factory implements b {
    private final Provider performanceAnalyticsProvider;
    private final Provider timeProvider;

    public ScreenLoadTracker_Factory(Provider provider, Provider provider2) {
        this.performanceAnalyticsProvider = provider;
        this.timeProvider = provider2;
    }

    public static ScreenLoadTracker_Factory create(Provider provider, Provider provider2) {
        return new ScreenLoadTracker_Factory(provider, provider2);
    }

    public static ScreenLoadTracker newInstance(AggregatedPerformanceAnalytics aggregatedPerformanceAnalytics, TimeProvider timeProvider) {
        return new ScreenLoadTracker(aggregatedPerformanceAnalytics, timeProvider);
    }

    @Override // com.onfido.javax.inject.Provider
    public ScreenLoadTracker get() {
        return newInstance((AggregatedPerformanceAnalytics) this.performanceAnalyticsProvider.get(), (TimeProvider) this.timeProvider.get());
    }
}
