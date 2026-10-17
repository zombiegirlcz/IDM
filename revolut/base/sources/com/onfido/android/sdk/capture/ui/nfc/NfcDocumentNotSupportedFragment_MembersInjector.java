package com.onfido.android.sdk.capture.ui.nfc;

import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.ScreenTracker;
import com.onfido.dagger.MembersInjector;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class NfcDocumentNotSupportedFragment_MembersInjector implements MembersInjector {
    private final Provider screenTrackerProvider;

    public NfcDocumentNotSupportedFragment_MembersInjector(Provider provider) {
        this.screenTrackerProvider = provider;
    }

    public static MembersInjector create(Provider provider) {
        return new NfcDocumentNotSupportedFragment_MembersInjector(provider);
    }

    public static void injectScreenTracker(NfcDocumentNotSupportedFragment nfcDocumentNotSupportedFragment, ScreenTracker screenTracker) {
        nfcDocumentNotSupportedFragment.screenTracker = screenTracker;
    }

    public void injectMembers(NfcDocumentNotSupportedFragment nfcDocumentNotSupportedFragment) {
        injectScreenTracker(nfcDocumentNotSupportedFragment, (ScreenTracker) this.screenTrackerProvider.get());
    }
}
