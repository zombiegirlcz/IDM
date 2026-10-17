package com.onfido.android.sdk.capture.ui.nfc;

import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.ScreenTracker;
import com.onfido.dagger.MembersInjector;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class NfcChipBlockedFragment_MembersInjector implements MembersInjector {
    private final Provider screenTrackerProvider;

    public NfcChipBlockedFragment_MembersInjector(Provider provider) {
        this.screenTrackerProvider = provider;
    }

    public static MembersInjector create(Provider provider) {
        return new NfcChipBlockedFragment_MembersInjector(provider);
    }

    public static void injectScreenTracker(NfcChipBlockedFragment nfcChipBlockedFragment, ScreenTracker screenTracker) {
        nfcChipBlockedFragment.screenTracker = screenTracker;
    }

    public void injectMembers(NfcChipBlockedFragment nfcChipBlockedFragment) {
        injectScreenTracker(nfcChipBlockedFragment, (ScreenTracker) this.screenTrackerProvider.get());
    }
}
