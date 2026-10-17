package com.onfido.android.sdk.capture.common.di;

import android.content.Context;
import android.nfc.NfcAdapter;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class SdkCaptureProductionModule_Companion_ProvideNfcAdapterFactory implements b {
    private final Provider contextProvider;

    public SdkCaptureProductionModule_Companion_ProvideNfcAdapterFactory(Provider provider) {
        this.contextProvider = provider;
    }

    public static SdkCaptureProductionModule_Companion_ProvideNfcAdapterFactory create(Provider provider) {
        return new SdkCaptureProductionModule_Companion_ProvideNfcAdapterFactory(provider);
    }

    public static NfcAdapter provideNfcAdapter(Context context) {
        return SdkCaptureProductionModule.INSTANCE.provideNfcAdapter(context);
    }

    @Override // com.onfido.javax.inject.Provider
    public NfcAdapter get() {
        return provideNfcAdapter((Context) this.contextProvider.get());
    }
}
