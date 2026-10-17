package com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers;

import com.onfido.android.sdk.capture.internal.analytics.inhouse.OnfidoAnalytics;
import com.onfido.android.sdk.capture.utils.TimeProvider;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class WaitingScreenTracker_Factory implements b {
    private final Provider onfidoAnalyticsProvider;
    private final Provider timeProvider;

    public WaitingScreenTracker_Factory(Provider provider, Provider provider2) {
        this.onfidoAnalyticsProvider = provider;
        this.timeProvider = provider2;
    }

    public static WaitingScreenTracker_Factory create(Provider provider, Provider provider2) {
        return new WaitingScreenTracker_Factory(provider, provider2);
    }

    public static WaitingScreenTracker newInstance(OnfidoAnalytics onfidoAnalytics, TimeProvider timeProvider) {
        return new WaitingScreenTracker(onfidoAnalytics, timeProvider);
    }

    @Override // com.onfido.javax.inject.Provider
    public WaitingScreenTracker get() {
        return newInstance((OnfidoAnalytics) this.onfidoAnalyticsProvider.get(), (TimeProvider) this.timeProvider.get());
    }
}
