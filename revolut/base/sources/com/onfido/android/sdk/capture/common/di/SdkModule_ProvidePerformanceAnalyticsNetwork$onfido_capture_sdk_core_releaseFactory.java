package com.onfido.android.sdk.capture.common.di;

import android.os.ResultReceiver;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.mappers.PublicEventMapper;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.utils.EventCache;
import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.android.sdk.capture.internal.performance.repository.PerformanceAnalyticsNetwork;
import com.onfido.android.sdk.capture.internal.performance.repository.PerformanceAnalyticsRepository;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.javax.inject.Provider;
import el.b;
import n14.e;

/* JADX INFO: loaded from: classes17.dex */
public final class SdkModule_ProvidePerformanceAnalyticsNetwork$onfido_capture_sdk_core_releaseFactory implements b {
    private final Provider eventCacheProvider;
    private final SdkModule module;
    private final Provider onfidoAnalyticsEventListenerProvider;
    private final Provider performanceAnalyticsRepositoryProvider;
    private final Provider publicEventMapperProvider;
    private final Provider remoteConfigProvider;
    private final Provider schedulersProvider;

    public SdkModule_ProvidePerformanceAnalyticsNetwork$onfido_capture_sdk_core_releaseFactory(SdkModule sdkModule, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        this.module = sdkModule;
        this.performanceAnalyticsRepositoryProvider = provider;
        this.schedulersProvider = provider2;
        this.eventCacheProvider = provider3;
        this.remoteConfigProvider = provider4;
        this.publicEventMapperProvider = provider5;
        this.onfidoAnalyticsEventListenerProvider = provider6;
    }

    public static SdkModule_ProvidePerformanceAnalyticsNetwork$onfido_capture_sdk_core_releaseFactory create(SdkModule sdkModule, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        return new SdkModule_ProvidePerformanceAnalyticsNetwork$onfido_capture_sdk_core_releaseFactory(sdkModule, provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static PerformanceAnalyticsNetwork providePerformanceAnalyticsNetwork$onfido_capture_sdk_core_release(SdkModule sdkModule, PerformanceAnalyticsRepository performanceAnalyticsRepository, SchedulersProvider schedulersProvider, EventCache eventCache, OnfidoRemoteConfig onfidoRemoteConfig, PublicEventMapper publicEventMapper, ResultReceiver resultReceiver) {
        PerformanceAnalyticsNetwork performanceAnalyticsNetworkProvidePerformanceAnalyticsNetwork$onfido_capture_sdk_core_release = sdkModule.providePerformanceAnalyticsNetwork$onfido_capture_sdk_core_release(performanceAnalyticsRepository, schedulersProvider, eventCache, onfidoRemoteConfig, publicEventMapper, resultReceiver);
        e.g(performanceAnalyticsNetworkProvidePerformanceAnalyticsNetwork$onfido_capture_sdk_core_release);
        return performanceAnalyticsNetworkProvidePerformanceAnalyticsNetwork$onfido_capture_sdk_core_release;
    }

    @Override // com.onfido.javax.inject.Provider
    public PerformanceAnalyticsNetwork get() {
        return providePerformanceAnalyticsNetwork$onfido_capture_sdk_core_release(this.module, (PerformanceAnalyticsRepository) this.performanceAnalyticsRepositoryProvider.get(), (SchedulersProvider) this.schedulersProvider.get(), (EventCache) this.eventCacheProvider.get(), (OnfidoRemoteConfig) this.remoteConfigProvider.get(), (PublicEventMapper) this.publicEventMapperProvider.get(), (ResultReceiver) this.onfidoAnalyticsEventListenerProvider.get());
    }
}
