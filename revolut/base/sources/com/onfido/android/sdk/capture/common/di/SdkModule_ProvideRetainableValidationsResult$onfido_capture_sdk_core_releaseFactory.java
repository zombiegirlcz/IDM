package com.onfido.android.sdk.capture.common.di;

import com.onfido.android.sdk.capture.internal.validation.RetainableValidationsResult;
import el.b;
import n14.e;

/* JADX INFO: loaded from: classes17.dex */
public final class SdkModule_ProvideRetainableValidationsResult$onfido_capture_sdk_core_releaseFactory implements b {
    private final SdkModule module;

    public SdkModule_ProvideRetainableValidationsResult$onfido_capture_sdk_core_releaseFactory(SdkModule sdkModule) {
        this.module = sdkModule;
    }

    public static SdkModule_ProvideRetainableValidationsResult$onfido_capture_sdk_core_releaseFactory create(SdkModule sdkModule) {
        return new SdkModule_ProvideRetainableValidationsResult$onfido_capture_sdk_core_releaseFactory(sdkModule);
    }

    public static RetainableValidationsResult provideRetainableValidationsResult$onfido_capture_sdk_core_release(SdkModule sdkModule) {
        RetainableValidationsResult retainableValidationsResultProvideRetainableValidationsResult$onfido_capture_sdk_core_release = sdkModule.provideRetainableValidationsResult$onfido_capture_sdk_core_release();
        e.g(retainableValidationsResultProvideRetainableValidationsResult$onfido_capture_sdk_core_release);
        return retainableValidationsResultProvideRetainableValidationsResult$onfido_capture_sdk_core_release;
    }

    @Override // com.onfido.javax.inject.Provider
    public RetainableValidationsResult get() {
        return provideRetainableValidationsResult$onfido_capture_sdk_core_release(this.module);
    }
}
