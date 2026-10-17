package com.onfido.android.sdk.capture.common.di;

import com.onfido.android.sdk.capture.OnfidoConfig;
import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.android.sdk.capture.internal.ui.countryselection.SupportedDocumentsRepository;
import com.onfido.javax.inject.Provider;
import el.b;
import n14.e;

/* JADX INFO: loaded from: classes17.dex */
public final class SdkModule_ProvideSupportedDocumentsRepository$onfido_capture_sdk_core_releaseFactory implements b {
    private final SdkModule module;
    private final Provider onfidoConfigProvider;
    private final Provider remoteConfigProvider;
    private final Provider remoteSupportedDocumentsRepositoryProvider;
    private final Provider supportedDocumentsRepositoryProvider;
    private final Provider workflowSupportedDocumentsRepositoryProvider;

    public SdkModule_ProvideSupportedDocumentsRepository$onfido_capture_sdk_core_releaseFactory(SdkModule sdkModule, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.module = sdkModule;
        this.supportedDocumentsRepositoryProvider = provider;
        this.workflowSupportedDocumentsRepositoryProvider = provider2;
        this.remoteSupportedDocumentsRepositoryProvider = provider3;
        this.remoteConfigProvider = provider4;
        this.onfidoConfigProvider = provider5;
    }

    public static SdkModule_ProvideSupportedDocumentsRepository$onfido_capture_sdk_core_releaseFactory create(SdkModule sdkModule, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new SdkModule_ProvideSupportedDocumentsRepository$onfido_capture_sdk_core_releaseFactory(sdkModule, provider, provider2, provider3, provider4, provider5);
    }

    public static SupportedDocumentsRepository provideSupportedDocumentsRepository$onfido_capture_sdk_core_release(SdkModule sdkModule, Provider provider, Provider provider2, Provider provider3, OnfidoRemoteConfig onfidoRemoteConfig, OnfidoConfig onfidoConfig) {
        SupportedDocumentsRepository supportedDocumentsRepositoryProvideSupportedDocumentsRepository$onfido_capture_sdk_core_release = sdkModule.provideSupportedDocumentsRepository$onfido_capture_sdk_core_release(provider, provider2, provider3, onfidoRemoteConfig, onfidoConfig);
        e.g(supportedDocumentsRepositoryProvideSupportedDocumentsRepository$onfido_capture_sdk_core_release);
        return supportedDocumentsRepositoryProvideSupportedDocumentsRepository$onfido_capture_sdk_core_release;
    }

    @Override // com.onfido.javax.inject.Provider
    public SupportedDocumentsRepository get() {
        return provideSupportedDocumentsRepository$onfido_capture_sdk_core_release(this.module, this.supportedDocumentsRepositoryProvider, this.workflowSupportedDocumentsRepositoryProvider, this.remoteSupportedDocumentsRepositoryProvider, (OnfidoRemoteConfig) this.remoteConfigProvider.get(), (OnfidoConfig) this.onfidoConfigProvider.get());
    }
}
