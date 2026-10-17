package com.onfido.android.sdk.capture.ui;

import com.onfido.android.sdk.capture.OnfidoConfig;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.OnfidoAnalytics;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.FlowTracker;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.WaitingScreenTracker;
import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.android.sdk.capture.internal.nfc.NfcInteractor;
import com.onfido.android.sdk.capture.internal.performance.AggregatedPerformanceAnalytics;
import com.onfido.android.sdk.capture.ui.OnfidoPresenter;
import com.onfido.dagger.MembersInjector;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class OnfidoActivity_MembersInjector implements MembersInjector {
    private final Provider flowTrackerProvider;
    private final Provider nfcInteractorProvider;
    private final Provider onfidoAnalyticsProvider;
    private final Provider onfidoConfigProvider;
    private final Provider performanceAnalyticsProvider;
    private final Provider presenterFactoryProvider;
    private final Provider remoteConfigProvider;
    private final Provider waitingScreenTrackerProvider;

    public OnfidoActivity_MembersInjector(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8) {
        this.performanceAnalyticsProvider = provider;
        this.onfidoConfigProvider = provider2;
        this.waitingScreenTrackerProvider = provider3;
        this.remoteConfigProvider = provider4;
        this.flowTrackerProvider = provider5;
        this.presenterFactoryProvider = provider6;
        this.nfcInteractorProvider = provider7;
        this.onfidoAnalyticsProvider = provider8;
    }

    public static MembersInjector create(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8) {
        return new OnfidoActivity_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static void injectNfcInteractor(OnfidoActivity onfidoActivity, NfcInteractor nfcInteractor) {
        onfidoActivity.nfcInteractor = nfcInteractor;
    }

    public static void injectOnfidoAnalytics(OnfidoActivity onfidoActivity, OnfidoAnalytics onfidoAnalytics) {
        onfidoActivity.onfidoAnalytics = onfidoAnalytics;
    }

    public static void injectPresenterFactory(OnfidoActivity onfidoActivity, OnfidoPresenter.Factory factory) {
        onfidoActivity.presenterFactory = factory;
    }

    public void injectMembers(OnfidoActivity onfidoActivity) {
        BaseActivity_MembersInjector.injectPerformanceAnalytics(onfidoActivity, (AggregatedPerformanceAnalytics) this.performanceAnalyticsProvider.get());
        BaseActivity_MembersInjector.injectOnfidoConfig(onfidoActivity, (OnfidoConfig) this.onfidoConfigProvider.get());
        BaseActivity_MembersInjector.injectWaitingScreenTracker(onfidoActivity, (WaitingScreenTracker) this.waitingScreenTrackerProvider.get());
        BaseActivity_MembersInjector.injectRemoteConfig(onfidoActivity, (OnfidoRemoteConfig) this.remoteConfigProvider.get());
        BaseActivity_MembersInjector.injectFlowTracker(onfidoActivity, (FlowTracker) this.flowTrackerProvider.get());
        injectPresenterFactory(onfidoActivity, (OnfidoPresenter.Factory) this.presenterFactoryProvider.get());
        injectNfcInteractor(onfidoActivity, (NfcInteractor) this.nfcInteractorProvider.get());
        injectOnfidoAnalytics(onfidoActivity, (OnfidoAnalytics) this.onfidoAnalyticsProvider.get());
    }
}
