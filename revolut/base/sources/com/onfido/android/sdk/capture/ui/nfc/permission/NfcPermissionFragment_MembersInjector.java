package com.onfido.android.sdk.capture.ui.nfc.permission;

import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.ScreenTracker;
import com.onfido.dagger.MembersInjector;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class NfcPermissionFragment_MembersInjector implements MembersInjector {
    private final Provider screenTrackerProvider;

    public NfcPermissionFragment_MembersInjector(Provider provider) {
        this.screenTrackerProvider = provider;
    }

    public static MembersInjector create(Provider provider) {
        return new NfcPermissionFragment_MembersInjector(provider);
    }

    public static void injectScreenTracker(NfcPermissionFragment nfcPermissionFragment, ScreenTracker screenTracker) {
        nfcPermissionFragment.screenTracker = screenTracker;
    }

    public void injectMembers(NfcPermissionFragment nfcPermissionFragment) {
        injectScreenTracker(nfcPermissionFragment, (ScreenTracker) this.screenTrackerProvider.get());
    }
}
