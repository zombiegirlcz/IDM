package com.onfido.android.sdk.capture.ui.finalscreen;

import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.ScreenTracker;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class FinalScreenPresenter_Factory implements b {
    private final Provider screenTrackerProvider;

    public FinalScreenPresenter_Factory(Provider provider) {
        this.screenTrackerProvider = provider;
    }

    public static FinalScreenPresenter_Factory create(Provider provider) {
        return new FinalScreenPresenter_Factory(provider);
    }

    public static FinalScreenPresenter newInstance(ScreenTracker screenTracker) {
        return new FinalScreenPresenter(screenTracker);
    }

    @Override // com.onfido.javax.inject.Provider
    public FinalScreenPresenter get() {
        return newInstance((ScreenTracker) this.screenTrackerProvider.get());
    }
}
