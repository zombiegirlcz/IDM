package com.onfido.android.sdk.capture.ui.proofOfAddress.documentDetails;

import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.ScreenTracker;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class PoaDocumentDetailsViewModel_Factory implements b {
    private final Provider screenTrackerProvider;

    public PoaDocumentDetailsViewModel_Factory(Provider provider) {
        this.screenTrackerProvider = provider;
    }

    public static PoaDocumentDetailsViewModel_Factory create(Provider provider) {
        return new PoaDocumentDetailsViewModel_Factory(provider);
    }

    public static PoaDocumentDetailsViewModel newInstance(ScreenTracker screenTracker) {
        return new PoaDocumentDetailsViewModel(screenTracker);
    }

    @Override // com.onfido.javax.inject.Provider
    public PoaDocumentDetailsViewModel get() {
        return newInstance((ScreenTracker) this.screenTrackerProvider.get());
    }
}
