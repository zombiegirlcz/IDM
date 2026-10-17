package com.onfido.android.sdk.capture.internal.service;

import android.content.Context;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class VibratorService_Factory implements el.b {
    private final Provider contextProvider;

    public VibratorService_Factory(Provider provider) {
        this.contextProvider = provider;
    }

    public static VibratorService_Factory create(Provider provider) {
        return new VibratorService_Factory(provider);
    }

    public static VibratorService newInstance(Context context) {
        return new VibratorService(context);
    }

    @Override // com.onfido.javax.inject.Provider
    public VibratorService get() {
        return newInstance((Context) this.contextProvider.get());
    }
}
