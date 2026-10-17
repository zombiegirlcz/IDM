package com.onfido.android.sdk.capture.common.di;

import android.content.Context;
import el.b;
import n14.e;

/* JADX INFO: loaded from: classes17.dex */
public final class SdkModule_ProvideSdkContext$onfido_capture_sdk_core_releaseFactory implements b {
    private final SdkModule module;

    public SdkModule_ProvideSdkContext$onfido_capture_sdk_core_releaseFactory(SdkModule sdkModule) {
        this.module = sdkModule;
    }

    public static SdkModule_ProvideSdkContext$onfido_capture_sdk_core_releaseFactory create(SdkModule sdkModule) {
        return new SdkModule_ProvideSdkContext$onfido_capture_sdk_core_releaseFactory(sdkModule);
    }

    public static Context provideSdkContext$onfido_capture_sdk_core_release(SdkModule sdkModule) {
        Context contextProvideSdkContext$onfido_capture_sdk_core_release = sdkModule.provideSdkContext$onfido_capture_sdk_core_release();
        e.g(contextProvideSdkContext$onfido_capture_sdk_core_release);
        return contextProvideSdkContext$onfido_capture_sdk_core_release;
    }

    @Override // com.onfido.javax.inject.Provider
    public Context get() {
        return provideSdkContext$onfido_capture_sdk_core_release(this.module);
    }
}
