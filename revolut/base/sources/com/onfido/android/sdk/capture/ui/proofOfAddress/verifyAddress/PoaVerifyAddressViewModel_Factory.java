package com.onfido.android.sdk.capture.ui.proofOfAddress.verifyAddress;

import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.ScreenTracker;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class PoaVerifyAddressViewModel_Factory implements b {
    private final Provider screenTrackerProvider;

    public PoaVerifyAddressViewModel_Factory(Provider provider) {
        this.screenTrackerProvider = provider;
    }

    public static PoaVerifyAddressViewModel_Factory create(Provider provider) {
        return new PoaVerifyAddressViewModel_Factory(provider);
    }

    public static PoaVerifyAddressViewModel newInstance(ScreenTracker screenTracker) {
        return new PoaVerifyAddressViewModel(screenTracker);
    }

    @Override // com.onfido.javax.inject.Provider
    public PoaVerifyAddressViewModel get() {
        return newInstance((ScreenTracker) this.screenTrackerProvider.get());
    }
}
