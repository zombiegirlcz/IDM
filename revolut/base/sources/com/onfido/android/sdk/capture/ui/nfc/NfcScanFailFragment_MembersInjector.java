package com.onfido.android.sdk.capture.ui.nfc;

import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.ScreenTracker;
import com.onfido.dagger.MembersInjector;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class NfcScanFailFragment_MembersInjector implements MembersInjector {
    private final Provider screenTrackerProvider;

    public NfcScanFailFragment_MembersInjector(Provider provider) {
        this.screenTrackerProvider = provider;
    }

    public static MembersInjector create(Provider provider) {
        return new NfcScanFailFragment_MembersInjector(provider);
    }

    public static void injectScreenTracker(NfcScanFailFragment nfcScanFailFragment, ScreenTracker screenTracker) {
        nfcScanFailFragment.screenTracker = screenTracker;
    }

    public void injectMembers(NfcScanFailFragment nfcScanFailFragment) {
        injectScreenTracker(nfcScanFailFragment, (ScreenTracker) this.screenTrackerProvider.get());
    }
}
