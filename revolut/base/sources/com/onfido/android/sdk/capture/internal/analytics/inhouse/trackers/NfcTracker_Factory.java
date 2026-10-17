package com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers;

import com.onfido.android.sdk.capture.internal.analytics.inhouse.OnfidoAnalytics;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class NfcTracker_Factory implements b {
    private final Provider onfidoAnalyticsProvider;

    public NfcTracker_Factory(Provider provider) {
        this.onfidoAnalyticsProvider = provider;
    }

    public static NfcTracker_Factory create(Provider provider) {
        return new NfcTracker_Factory(provider);
    }

    public static NfcTracker newInstance(OnfidoAnalytics onfidoAnalytics) {
        return new NfcTracker(onfidoAnalytics);
    }

    @Override // com.onfido.javax.inject.Provider
    public NfcTracker get() {
        return newInstance((OnfidoAnalytics) this.onfidoAnalyticsProvider.get());
    }
}
