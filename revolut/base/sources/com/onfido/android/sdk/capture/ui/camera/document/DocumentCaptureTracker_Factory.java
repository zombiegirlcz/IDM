package com.onfido.android.sdk.capture.ui.camera.document;

import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.CaptureTracker;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.NfcTracker;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.WaitingScreenTracker;
import com.onfido.android.sdk.capture.internal.performance.AggregatedPerformanceAnalytics;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class DocumentCaptureTracker_Factory implements b {
    private final Provider captureTrackerProvider;
    private final Provider nfcTrackerProvider;
    private final Provider performanceAnalyticsProvider;
    private final Provider waitingScreenTrackerProvider;

    public DocumentCaptureTracker_Factory(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.captureTrackerProvider = provider;
        this.waitingScreenTrackerProvider = provider2;
        this.nfcTrackerProvider = provider3;
        this.performanceAnalyticsProvider = provider4;
    }

    public static DocumentCaptureTracker_Factory create(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        return new DocumentCaptureTracker_Factory(provider, provider2, provider3, provider4);
    }

    public static DocumentCaptureTracker newInstance(CaptureTracker captureTracker, WaitingScreenTracker waitingScreenTracker, NfcTracker nfcTracker, AggregatedPerformanceAnalytics aggregatedPerformanceAnalytics) {
        return new DocumentCaptureTracker(captureTracker, waitingScreenTracker, nfcTracker, aggregatedPerformanceAnalytics);
    }

    @Override // com.onfido.javax.inject.Provider
    public DocumentCaptureTracker get() {
        return newInstance((CaptureTracker) this.captureTrackerProvider.get(), (WaitingScreenTracker) this.waitingScreenTrackerProvider.get(), (NfcTracker) this.nfcTrackerProvider.get(), (AggregatedPerformanceAnalytics) this.performanceAnalyticsProvider.get());
    }
}
