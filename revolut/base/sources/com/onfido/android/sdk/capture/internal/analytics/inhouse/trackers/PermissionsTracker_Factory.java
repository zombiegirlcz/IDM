package com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers;

import com.onfido.android.sdk.capture.internal.analytics.inhouse.OnfidoAnalytics;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class PermissionsTracker_Factory implements b {
    private final Provider onfidoAnalyticsProvider;

    public PermissionsTracker_Factory(Provider provider) {
        this.onfidoAnalyticsProvider = provider;
    }

    public static PermissionsTracker_Factory create(Provider provider) {
        return new PermissionsTracker_Factory(provider);
    }

    public static PermissionsTracker newInstance(OnfidoAnalytics onfidoAnalytics) {
        return new PermissionsTracker(onfidoAnalytics);
    }

    @Override // com.onfido.javax.inject.Provider
    public PermissionsTracker get() {
        return newInstance((OnfidoAnalytics) this.onfidoAnalyticsProvider.get());
    }
}
