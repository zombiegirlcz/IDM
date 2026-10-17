package com.onfido.android.sdk.capture.component.active.video.capture.di.capture;

import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.api.client.data.SdkConfiguration;
import com.onfido.javax.inject.Provider;
import el.b;
import n14.e;

/* JADX INFO: loaded from: classes17.dex */
public final class MotionCaptureModule_Companion_ProvideMotionVideoSettingsFactory implements b {
    private final Provider onfidoRemoteConfigProvider;

    public MotionCaptureModule_Companion_ProvideMotionVideoSettingsFactory(Provider provider) {
        this.onfidoRemoteConfigProvider = provider;
    }

    public static MotionCaptureModule_Companion_ProvideMotionVideoSettingsFactory create(Provider provider) {
        return new MotionCaptureModule_Companion_ProvideMotionVideoSettingsFactory(provider);
    }

    public static SdkConfiguration.MotionCapture.MotionVideoSettings provideMotionVideoSettings(OnfidoRemoteConfig onfidoRemoteConfig) {
        SdkConfiguration.MotionCapture.MotionVideoSettings motionVideoSettingsProvideMotionVideoSettings = MotionCaptureModule.INSTANCE.provideMotionVideoSettings(onfidoRemoteConfig);
        e.g(motionVideoSettingsProvideMotionVideoSettings);
        return motionVideoSettingsProvideMotionVideoSettings;
    }

    @Override // com.onfido.javax.inject.Provider
    public SdkConfiguration.MotionCapture.MotionVideoSettings get() {
        return provideMotionVideoSettings((OnfidoRemoteConfig) this.onfidoRemoteConfigProvider.get());
    }
}
