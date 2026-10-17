package com.onfido.android.sdk.capture.ui.nfc;

import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.NfcTracker;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.ScreenTracker;
import com.onfido.dagger.MembersInjector;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class NfcDeviceNotSupportedFragment_MembersInjector implements MembersInjector {
    private final Provider nfcTrackerProvider;
    private final Provider screenTrackerProvider;

    public NfcDeviceNotSupportedFragment_MembersInjector(Provider provider, Provider provider2) {
        this.screenTrackerProvider = provider;
        this.nfcTrackerProvider = provider2;
    }

    public static MembersInjector create(Provider provider, Provider provider2) {
        return new NfcDeviceNotSupportedFragment_MembersInjector(provider, provider2);
    }

    public static void injectNfcTracker(NfcDeviceNotSupportedFragment nfcDeviceNotSupportedFragment, NfcTracker nfcTracker) {
        nfcDeviceNotSupportedFragment.nfcTracker = nfcTracker;
    }

    public static void injectScreenTracker(NfcDeviceNotSupportedFragment nfcDeviceNotSupportedFragment, ScreenTracker screenTracker) {
        nfcDeviceNotSupportedFragment.screenTracker = screenTracker;
    }

    public void injectMembers(NfcDeviceNotSupportedFragment nfcDeviceNotSupportedFragment) {
        injectScreenTracker(nfcDeviceNotSupportedFragment, (ScreenTracker) this.screenTrackerProvider.get());
        injectNfcTracker(nfcDeviceNotSupportedFragment, (NfcTracker) this.nfcTrackerProvider.get());
    }
}
