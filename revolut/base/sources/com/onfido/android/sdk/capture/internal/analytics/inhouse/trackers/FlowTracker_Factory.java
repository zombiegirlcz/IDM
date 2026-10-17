package com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers;

import com.onfido.android.sdk.capture.internal.analytics.inhouse.OnfidoAnalytics;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class FlowTracker_Factory implements b {
    private final Provider onfidoAnalyticsProvider;

    public FlowTracker_Factory(Provider provider) {
        this.onfidoAnalyticsProvider = provider;
    }

    public static FlowTracker_Factory create(Provider provider) {
        return new FlowTracker_Factory(provider);
    }

    public static FlowTracker newInstance(OnfidoAnalytics onfidoAnalytics) {
        return new FlowTracker(onfidoAnalytics);
    }

    @Override // com.onfido.javax.inject.Provider
    public FlowTracker get() {
        return newInstance((OnfidoAnalytics) this.onfidoAnalyticsProvider.get());
    }
}
