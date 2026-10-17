package com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers;

import com.onfido.android.sdk.capture.internal.analytics.inhouse.OnfidoAnalytics;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class ScreenTracker_Factory implements b {
    private final Provider onfidoAnalyticsProvider;

    public ScreenTracker_Factory(Provider provider) {
        this.onfidoAnalyticsProvider = provider;
    }

    public static ScreenTracker_Factory create(Provider provider) {
        return new ScreenTracker_Factory(provider);
    }

    public static ScreenTracker newInstance(OnfidoAnalytics onfidoAnalytics) {
        return new ScreenTracker(onfidoAnalytics);
    }

    @Override // com.onfido.javax.inject.Provider
    public ScreenTracker get() {
        return newInstance((OnfidoAnalytics) this.onfidoAnalyticsProvider.get());
    }
}
