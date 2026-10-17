package com.onfido.android.sdk.capture.common.di;

import android.os.ResultReceiver;
import com.onfido.android.sdk.capture.OnfidoConfig;
import com.onfido.android.sdk.capture.config.EnterpriseConfig;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.InhouseAnalyticsRepository;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.OnfidoAnalytics;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.mappers.PublicEventMapper;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.utils.EventCache;
import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.javax.inject.Provider;
import el.b;
import n14.e;

/* JADX INFO: loaded from: classes17.dex */
public final class SdkModule_ProvideOnfidoAnalytics$onfido_capture_sdk_core_releaseFactory implements b {
    private final Provider analyticsRepositoryProvider;
    private final Provider enterpriseConfigProvider;
    private final Provider eventCacheProvider;
    private final SdkModule module;
    private final Provider onfidoAnalyticsEventListenerProvider;
    private final Provider onfidoConfigProvider;
    private final Provider publicEventMapperProvider;
    private final Provider remoteConfigProvider;
    private final Provider schedulersProvider;

    public SdkModule_ProvideOnfidoAnalytics$onfido_capture_sdk_core_releaseFactory(SdkModule sdkModule, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8) {
        this.module = sdkModule;
        this.analyticsRepositoryProvider = provider;
        this.onfidoConfigProvider = provider2;
        this.schedulersProvider = provider3;
        this.eventCacheProvider = provider4;
        this.enterpriseConfigProvider = provider5;
        this.remoteConfigProvider = provider6;
        this.publicEventMapperProvider = provider7;
        this.onfidoAnalyticsEventListenerProvider = provider8;
    }

    public static SdkModule_ProvideOnfidoAnalytics$onfido_capture_sdk_core_releaseFactory create(SdkModule sdkModule, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8) {
        return new SdkModule_ProvideOnfidoAnalytics$onfido_capture_sdk_core_releaseFactory(sdkModule, provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static OnfidoAnalytics provideOnfidoAnalytics$onfido_capture_sdk_core_release(SdkModule sdkModule, InhouseAnalyticsRepository inhouseAnalyticsRepository, OnfidoConfig onfidoConfig, SchedulersProvider schedulersProvider, EventCache eventCache, EnterpriseConfig enterpriseConfig, OnfidoRemoteConfig onfidoRemoteConfig, PublicEventMapper publicEventMapper, ResultReceiver resultReceiver) {
        OnfidoAnalytics onfidoAnalyticsProvideOnfidoAnalytics$onfido_capture_sdk_core_release = sdkModule.provideOnfidoAnalytics$onfido_capture_sdk_core_release(inhouseAnalyticsRepository, onfidoConfig, schedulersProvider, eventCache, enterpriseConfig, onfidoRemoteConfig, publicEventMapper, resultReceiver);
        e.g(onfidoAnalyticsProvideOnfidoAnalytics$onfido_capture_sdk_core_release);
        return onfidoAnalyticsProvideOnfidoAnalytics$onfido_capture_sdk_core_release;
    }

    @Override // com.onfido.javax.inject.Provider
    public OnfidoAnalytics get() {
        return provideOnfidoAnalytics$onfido_capture_sdk_core_release(this.module, (InhouseAnalyticsRepository) this.analyticsRepositoryProvider.get(), (OnfidoConfig) this.onfidoConfigProvider.get(), (SchedulersProvider) this.schedulersProvider.get(), (EventCache) this.eventCacheProvider.get(), (EnterpriseConfig) this.enterpriseConfigProvider.get(), (OnfidoRemoteConfig) this.remoteConfigProvider.get(), (PublicEventMapper) this.publicEventMapperProvider.get(), (ResultReceiver) this.onfidoAnalyticsEventListenerProvider.get());
    }
}
