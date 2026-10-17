package com.onfido.android.sdk.capture.common.di;

import com.onfido.android.sdk.capture.internal.analytics.inhouse.mappers.PublicEventMapper;
import el.b;
import n14.e;

/* JADX INFO: loaded from: classes17.dex */
public final class SdkModule_ProvidePublicEventMapper$onfido_capture_sdk_core_releaseFactory implements b {
    private final SdkModule module;

    public SdkModule_ProvidePublicEventMapper$onfido_capture_sdk_core_releaseFactory(SdkModule sdkModule) {
        this.module = sdkModule;
    }

    public static SdkModule_ProvidePublicEventMapper$onfido_capture_sdk_core_releaseFactory create(SdkModule sdkModule) {
        return new SdkModule_ProvidePublicEventMapper$onfido_capture_sdk_core_releaseFactory(sdkModule);
    }

    public static PublicEventMapper providePublicEventMapper$onfido_capture_sdk_core_release(SdkModule sdkModule) {
        PublicEventMapper publicEventMapperProvidePublicEventMapper$onfido_capture_sdk_core_release = sdkModule.providePublicEventMapper$onfido_capture_sdk_core_release();
        e.g(publicEventMapperProvidePublicEventMapper$onfido_capture_sdk_core_release);
        return publicEventMapperProvidePublicEventMapper$onfido_capture_sdk_core_release;
    }

    @Override // com.onfido.javax.inject.Provider
    public PublicEventMapper get() {
        return providePublicEventMapper$onfido_capture_sdk_core_release(this.module);
    }
}
