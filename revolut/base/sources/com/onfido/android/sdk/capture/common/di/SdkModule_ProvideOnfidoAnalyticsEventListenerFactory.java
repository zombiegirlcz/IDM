package com.onfido.android.sdk.capture.common.di;

import android.os.ResultReceiver;
import com.onfido.android.sdk.capture.OnfidoConfig;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class SdkModule_ProvideOnfidoAnalyticsEventListenerFactory implements b {
    private final SdkModule module;
    private final Provider onfidoConfigProvider;

    public SdkModule_ProvideOnfidoAnalyticsEventListenerFactory(SdkModule sdkModule, Provider provider) {
        this.module = sdkModule;
        this.onfidoConfigProvider = provider;
    }

    public static SdkModule_ProvideOnfidoAnalyticsEventListenerFactory create(SdkModule sdkModule, Provider provider) {
        return new SdkModule_ProvideOnfidoAnalyticsEventListenerFactory(sdkModule, provider);
    }

    public static ResultReceiver provideOnfidoAnalyticsEventListener(SdkModule sdkModule, OnfidoConfig onfidoConfig) {
        return sdkModule.provideOnfidoAnalyticsEventListener(onfidoConfig);
    }

    @Override // com.onfido.javax.inject.Provider
    public ResultReceiver get() {
        return provideOnfidoAnalyticsEventListener(this.module, (OnfidoConfig) this.onfidoConfigProvider.get());
    }
}
