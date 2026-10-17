package com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers;

import com.onfido.android.sdk.capture.internal.analytics.inhouse.OnfidoAnalytics;
import com.onfido.android.sdk.capture.internal.nfc.NfcInteractor;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class CaptureTracker_Factory implements b {
    private final Provider nfcInteractorProvider;
    private final Provider onfidoAnalyticsProvider;

    public CaptureTracker_Factory(Provider provider, Provider provider2) {
        this.onfidoAnalyticsProvider = provider;
        this.nfcInteractorProvider = provider2;
    }

    public static CaptureTracker_Factory create(Provider provider, Provider provider2) {
        return new CaptureTracker_Factory(provider, provider2);
    }

    public static CaptureTracker newInstance(OnfidoAnalytics onfidoAnalytics, NfcInteractor nfcInteractor) {
        return new CaptureTracker(onfidoAnalytics, nfcInteractor);
    }

    @Override // com.onfido.javax.inject.Provider
    public CaptureTracker get() {
        return newInstance((OnfidoAnalytics) this.onfidoAnalyticsProvider.get(), (NfcInteractor) this.nfcInteractorProvider.get());
    }
}
