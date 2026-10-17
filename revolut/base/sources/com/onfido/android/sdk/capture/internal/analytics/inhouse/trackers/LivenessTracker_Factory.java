package com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers;

import com.onfido.android.sdk.capture.internal.analytics.inhouse.OnfidoAnalytics;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class LivenessTracker_Factory implements b {
    private final Provider onfidoAnalyticsProvider;

    public LivenessTracker_Factory(Provider provider) {
        this.onfidoAnalyticsProvider = provider;
    }

    public static LivenessTracker_Factory create(Provider provider) {
        return new LivenessTracker_Factory(provider);
    }

    public static LivenessTracker newInstance(OnfidoAnalytics onfidoAnalytics) {
        return new LivenessTracker(onfidoAnalytics);
    }

    @Override // com.onfido.javax.inject.Provider
    public LivenessTracker get() {
        return newInstance((OnfidoAnalytics) this.onfidoAnalyticsProvider.get());
    }
}
