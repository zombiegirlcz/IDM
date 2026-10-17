package com.onfido.android.sdk.capture.common.di;

import com.onfido.android.sdk.capture.internal.camera.OnfidoImage;
import com.onfido.android.sdk.capture.internal.camera.camerax.FrameSampler;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.javax.inject.Provider;
import el.b;
import n14.e;

/* JADX INFO: loaded from: classes17.dex */
public final class SdkModule_ProvideFrameSampler$onfido_capture_sdk_core_releaseFactory implements b {
    private final SdkModule module;
    private final Provider schedulersProvider;

    public SdkModule_ProvideFrameSampler$onfido_capture_sdk_core_releaseFactory(SdkModule sdkModule, Provider provider) {
        this.module = sdkModule;
        this.schedulersProvider = provider;
    }

    public static SdkModule_ProvideFrameSampler$onfido_capture_sdk_core_releaseFactory create(SdkModule sdkModule, Provider provider) {
        return new SdkModule_ProvideFrameSampler$onfido_capture_sdk_core_releaseFactory(sdkModule, provider);
    }

    public static FrameSampler<OnfidoImage> provideFrameSampler$onfido_capture_sdk_core_release(SdkModule sdkModule, SchedulersProvider schedulersProvider) {
        FrameSampler<OnfidoImage> frameSamplerProvideFrameSampler$onfido_capture_sdk_core_release = sdkModule.provideFrameSampler$onfido_capture_sdk_core_release(schedulersProvider);
        e.g(frameSamplerProvideFrameSampler$onfido_capture_sdk_core_release);
        return frameSamplerProvideFrameSampler$onfido_capture_sdk_core_release;
    }

    @Override // com.onfido.javax.inject.Provider
    public FrameSampler<OnfidoImage> get() {
        return provideFrameSampler$onfido_capture_sdk_core_release(this.module, (SchedulersProvider) this.schedulersProvider.get());
    }
}
