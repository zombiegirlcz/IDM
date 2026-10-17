package com.onfido.android.sdk.capture.common.di;

import com.onfido.api.client.ErrorParser;
import el.b;
import n14.e;

/* JADX INFO: loaded from: classes17.dex */
public final class SdkModule_ProvideErrorParser$onfido_capture_sdk_core_releaseFactory implements b {
    private final SdkModule module;

    public SdkModule_ProvideErrorParser$onfido_capture_sdk_core_releaseFactory(SdkModule sdkModule) {
        this.module = sdkModule;
    }

    public static SdkModule_ProvideErrorParser$onfido_capture_sdk_core_releaseFactory create(SdkModule sdkModule) {
        return new SdkModule_ProvideErrorParser$onfido_capture_sdk_core_releaseFactory(sdkModule);
    }

    public static ErrorParser provideErrorParser$onfido_capture_sdk_core_release(SdkModule sdkModule) {
        ErrorParser errorParserProvideErrorParser$onfido_capture_sdk_core_release = sdkModule.provideErrorParser$onfido_capture_sdk_core_release();
        e.g(errorParserProvideErrorParser$onfido_capture_sdk_core_release);
        return errorParserProvideErrorParser$onfido_capture_sdk_core_release;
    }

    @Override // com.onfido.javax.inject.Provider
    public ErrorParser get() {
        return provideErrorParser$onfido_capture_sdk_core_release(this.module);
    }
}
