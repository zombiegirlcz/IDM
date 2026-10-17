package com.onfido.android.sdk.capture.ui;

import com.onfido.android.sdk.capture.OnfidoConfig;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.FlowTracker;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.WaitingScreenTracker;
import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.android.sdk.capture.internal.performance.AggregatedPerformanceAnalytics;
import com.onfido.dagger.MembersInjector;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class BaseActivity_MembersInjector implements MembersInjector {
    private final Provider flowTrackerProvider;
    private final Provider onfidoConfigProvider;
    private final Provider performanceAnalyticsProvider;
    private final Provider remoteConfigProvider;
    private final Provider waitingScreenTrackerProvider;

    public BaseActivity_MembersInjector(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.performanceAnalyticsProvider = provider;
        this.onfidoConfigProvider = provider2;
        this.waitingScreenTrackerProvider = provider3;
        this.remoteConfigProvider = provider4;
        this.flowTrackerProvider = provider5;
    }

    public static MembersInjector create(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new BaseActivity_MembersInjector(provider, provider2, provider3, provider4, provider5);
    }

    public static void injectFlowTracker(BaseActivity baseActivity, FlowTracker flowTracker) {
        baseActivity.flowTracker = flowTracker;
    }

    public static void injectOnfidoConfig(BaseActivity baseActivity, OnfidoConfig onfidoConfig) {
        baseActivity.onfidoConfig = onfidoConfig;
    }

    public static void injectPerformanceAnalytics(BaseActivity baseActivity, AggregatedPerformanceAnalytics aggregatedPerformanceAnalytics) {
        baseActivity.performanceAnalytics = aggregatedPerformanceAnalytics;
    }

    public static void injectRemoteConfig(BaseActivity baseActivity, OnfidoRemoteConfig onfidoRemoteConfig) {
        baseActivity.remoteConfig = onfidoRemoteConfig;
    }

    public static void injectWaitingScreenTracker(BaseActivity baseActivity, WaitingScreenTracker waitingScreenTracker) {
        baseActivity.waitingScreenTracker = waitingScreenTracker;
    }

    public void injectMembers(BaseActivity baseActivity) {
        injectPerformanceAnalytics(baseActivity, (AggregatedPerformanceAnalytics) this.performanceAnalyticsProvider.get());
        injectOnfidoConfig(baseActivity, (OnfidoConfig) this.onfidoConfigProvider.get());
        injectWaitingScreenTracker(baseActivity, (WaitingScreenTracker) this.waitingScreenTrackerProvider.get());
        injectRemoteConfig(baseActivity, (OnfidoRemoteConfig) this.remoteConfigProvider.get());
        injectFlowTracker(baseActivity, (FlowTracker) this.flowTrackerProvider.get());
    }
}
