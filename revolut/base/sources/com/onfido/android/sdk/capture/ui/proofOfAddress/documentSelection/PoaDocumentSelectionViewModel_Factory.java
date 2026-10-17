package com.onfido.android.sdk.capture.ui.proofOfAddress.documentSelection;

import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.ScreenTracker;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class PoaDocumentSelectionViewModel_Factory implements b {
    private final Provider screenTrackerProvider;

    public PoaDocumentSelectionViewModel_Factory(Provider provider) {
        this.screenTrackerProvider = provider;
    }

    public static PoaDocumentSelectionViewModel_Factory create(Provider provider) {
        return new PoaDocumentSelectionViewModel_Factory(provider);
    }

    public static PoaDocumentSelectionViewModel newInstance(ScreenTracker screenTracker) {
        return new PoaDocumentSelectionViewModel(screenTracker);
    }

    @Override // com.onfido.javax.inject.Provider
    public PoaDocumentSelectionViewModel get() {
        return newInstance((ScreenTracker) this.screenTrackerProvider.get());
    }
}
