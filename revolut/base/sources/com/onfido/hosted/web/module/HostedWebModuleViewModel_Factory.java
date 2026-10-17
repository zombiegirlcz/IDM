package com.onfido.hosted.web.module;

import com.onfido.android.sdk.capture.OnfidoConfig;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.OnfidoAnalytics;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.FlowTracker;
import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.javax.inject.Provider;
import kotlinx.serialization.json.Json;

/* JADX INFO: loaded from: classes17.dex */
public final class HostedWebModuleViewModel_Factory implements el.b {
    private final Provider analyticsProvider;
    private final Provider flowTrackerProvider;
    private final Provider onfidoConfigProvider;
    private final Provider parserProvider;
    private final Provider remoteConfigProvider;

    public HostedWebModuleViewModel_Factory(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.onfidoConfigProvider = provider;
        this.parserProvider = provider2;
        this.remoteConfigProvider = provider3;
        this.flowTrackerProvider = provider4;
        this.analyticsProvider = provider5;
    }

    public static HostedWebModuleViewModel_Factory create(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new HostedWebModuleViewModel_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static HostedWebModuleViewModel newInstance(OnfidoConfig onfidoConfig, Json json, OnfidoRemoteConfig onfidoRemoteConfig, FlowTracker flowTracker, OnfidoAnalytics onfidoAnalytics) {
        return new HostedWebModuleViewModel(onfidoConfig, json, onfidoRemoteConfig, flowTracker, onfidoAnalytics);
    }

    @Override // com.onfido.javax.inject.Provider
    public HostedWebModuleViewModel get() {
        return newInstance((OnfidoConfig) this.onfidoConfigProvider.get(), (Json) this.parserProvider.get(), (OnfidoRemoteConfig) this.remoteConfigProvider.get(), (FlowTracker) this.flowTrackerProvider.get(), (OnfidoAnalytics) this.analyticsProvider.get());
    }
}
