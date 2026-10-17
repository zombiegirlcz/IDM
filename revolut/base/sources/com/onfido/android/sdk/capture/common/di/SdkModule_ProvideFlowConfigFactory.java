package com.onfido.android.sdk.capture.common.di;

import com.onfido.android.sdk.FlowConfig;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class SdkModule_ProvideFlowConfigFactory implements b {
    private final SdkModule module;

    public SdkModule_ProvideFlowConfigFactory(SdkModule sdkModule) {
        this.module = sdkModule;
    }

    public static SdkModule_ProvideFlowConfigFactory create(SdkModule sdkModule) {
        return new SdkModule_ProvideFlowConfigFactory(sdkModule);
    }

    public static FlowConfig provideFlowConfig(SdkModule sdkModule) {
        return sdkModule.getFlowConfig();
    }

    @Override // com.onfido.javax.inject.Provider
    public FlowConfig get() {
        return provideFlowConfig(this.module);
    }
}
