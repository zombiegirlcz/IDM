package com.onfido.android.sdk.capture.common.di;

import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.api.client.data.SdkConfiguration;
import com.onfido.javax.inject.Provider;
import el.b;
import n14.e;

/* JADX INFO: loaded from: classes17.dex */
public final class SdkModule_ProvideLivenessCaptureSettingsFactory implements b {
    private final SdkModule module;
    private final Provider onfidoRemoteConfigProvider;

    public SdkModule_ProvideLivenessCaptureSettingsFactory(SdkModule sdkModule, Provider provider) {
        this.module = sdkModule;
        this.onfidoRemoteConfigProvider = provider;
    }

    public static SdkModule_ProvideLivenessCaptureSettingsFactory create(SdkModule sdkModule, Provider provider) {
        return new SdkModule_ProvideLivenessCaptureSettingsFactory(sdkModule, provider);
    }

    public static SdkConfiguration.LivenessCapture provideLivenessCaptureSettings(SdkModule sdkModule, OnfidoRemoteConfig onfidoRemoteConfig) {
        SdkConfiguration.LivenessCapture livenessCaptureProvideLivenessCaptureSettings = sdkModule.provideLivenessCaptureSettings(onfidoRemoteConfig);
        e.g(livenessCaptureProvideLivenessCaptureSettings);
        return livenessCaptureProvideLivenessCaptureSettings;
    }

    @Override // com.onfido.javax.inject.Provider
    public SdkConfiguration.LivenessCapture get() {
        return provideLivenessCaptureSettings(this.module, (OnfidoRemoteConfig) this.onfidoRemoteConfigProvider.get());
    }
}
