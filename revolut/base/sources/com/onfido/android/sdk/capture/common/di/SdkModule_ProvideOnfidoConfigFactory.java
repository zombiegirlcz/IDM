package com.onfido.android.sdk.capture.common.di;

import com.onfido.android.sdk.capture.OnfidoConfig;
import el.b;
import n14.e;

/* JADX INFO: loaded from: classes17.dex */
public final class SdkModule_ProvideOnfidoConfigFactory implements b {
    private final SdkModule module;

    public SdkModule_ProvideOnfidoConfigFactory(SdkModule sdkModule) {
        this.module = sdkModule;
    }

    public static SdkModule_ProvideOnfidoConfigFactory create(SdkModule sdkModule) {
        return new SdkModule_ProvideOnfidoConfigFactory(sdkModule);
    }

    public static OnfidoConfig provideOnfidoConfig(SdkModule sdkModule) {
        OnfidoConfig onfidoConfig = sdkModule.getOnfidoConfig();
        e.g(onfidoConfig);
        return onfidoConfig;
    }

    @Override // com.onfido.javax.inject.Provider
    public OnfidoConfig get() {
        return provideOnfidoConfig(this.module);
    }
}
