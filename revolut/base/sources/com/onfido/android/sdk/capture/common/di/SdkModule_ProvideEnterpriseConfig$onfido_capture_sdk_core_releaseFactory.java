package com.onfido.android.sdk.capture.common.di;

import com.onfido.android.sdk.capture.config.EnterpriseConfig;
import el.b;
import n14.e;

/* JADX INFO: loaded from: classes17.dex */
public final class SdkModule_ProvideEnterpriseConfig$onfido_capture_sdk_core_releaseFactory implements b {
    private final SdkModule module;

    public SdkModule_ProvideEnterpriseConfig$onfido_capture_sdk_core_releaseFactory(SdkModule sdkModule) {
        this.module = sdkModule;
    }

    public static SdkModule_ProvideEnterpriseConfig$onfido_capture_sdk_core_releaseFactory create(SdkModule sdkModule) {
        return new SdkModule_ProvideEnterpriseConfig$onfido_capture_sdk_core_releaseFactory(sdkModule);
    }

    public static EnterpriseConfig provideEnterpriseConfig$onfido_capture_sdk_core_release(SdkModule sdkModule) {
        EnterpriseConfig enterpriseConfigProvideEnterpriseConfig$onfido_capture_sdk_core_release = sdkModule.provideEnterpriseConfig$onfido_capture_sdk_core_release();
        e.g(enterpriseConfigProvideEnterpriseConfig$onfido_capture_sdk_core_release);
        return enterpriseConfigProvideEnterpriseConfig$onfido_capture_sdk_core_release;
    }

    @Override // com.onfido.javax.inject.Provider
    public EnterpriseConfig get() {
        return provideEnterpriseConfig$onfido_capture_sdk_core_release(this.module);
    }
}
