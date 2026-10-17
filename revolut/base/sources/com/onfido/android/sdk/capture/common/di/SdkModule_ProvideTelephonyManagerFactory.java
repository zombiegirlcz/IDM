package com.onfido.android.sdk.capture.common.di;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.onfido.javax.inject.Provider;
import el.b;
import n14.e;

/* JADX INFO: loaded from: classes17.dex */
public final class SdkModule_ProvideTelephonyManagerFactory implements b {
    private final Provider contextProvider;
    private final SdkModule module;

    public SdkModule_ProvideTelephonyManagerFactory(SdkModule sdkModule, Provider provider) {
        this.module = sdkModule;
        this.contextProvider = provider;
    }

    public static SdkModule_ProvideTelephonyManagerFactory create(SdkModule sdkModule, Provider provider) {
        return new SdkModule_ProvideTelephonyManagerFactory(sdkModule, provider);
    }

    public static TelephonyManager provideTelephonyManager(SdkModule sdkModule, Context context) {
        TelephonyManager telephonyManagerProvideTelephonyManager = sdkModule.provideTelephonyManager(context);
        e.g(telephonyManagerProvideTelephonyManager);
        return telephonyManagerProvideTelephonyManager;
    }

    @Override // com.onfido.javax.inject.Provider
    public TelephonyManager get() {
        return provideTelephonyManager(this.module, (Context) this.contextProvider.get());
    }
}
