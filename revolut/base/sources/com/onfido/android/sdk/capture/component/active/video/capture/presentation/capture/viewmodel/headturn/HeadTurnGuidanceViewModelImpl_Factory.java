package com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.headturn;

import com.onfido.android.sdk.capture.internal.analytics.inhouse.OnfidoAnalytics;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class HeadTurnGuidanceViewModelImpl_Factory implements b {
    private final Provider analyticsProvider;
    private final Provider schedulersProvider;

    public HeadTurnGuidanceViewModelImpl_Factory(Provider provider, Provider provider2) {
        this.analyticsProvider = provider;
        this.schedulersProvider = provider2;
    }

    public static HeadTurnGuidanceViewModelImpl_Factory create(Provider provider, Provider provider2) {
        return new HeadTurnGuidanceViewModelImpl_Factory(provider, provider2);
    }

    public static HeadTurnGuidanceViewModelImpl newInstance(OnfidoAnalytics onfidoAnalytics, SchedulersProvider schedulersProvider) {
        return new HeadTurnGuidanceViewModelImpl(onfidoAnalytics, schedulersProvider);
    }

    @Override // com.onfido.javax.inject.Provider
    public HeadTurnGuidanceViewModelImpl get() {
        return newInstance((OnfidoAnalytics) this.analyticsProvider.get(), (SchedulersProvider) this.schedulersProvider.get());
    }
}
