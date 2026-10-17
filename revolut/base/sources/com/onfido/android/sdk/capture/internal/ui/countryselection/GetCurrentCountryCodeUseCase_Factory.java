package com.onfido.android.sdk.capture.internal.ui.countryselection;

import android.telephony.TelephonyManager;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class GetCurrentCountryCodeUseCase_Factory implements b {
    private final Provider telephonyManagerProvider;

    public GetCurrentCountryCodeUseCase_Factory(Provider provider) {
        this.telephonyManagerProvider = provider;
    }

    public static GetCurrentCountryCodeUseCase_Factory create(Provider provider) {
        return new GetCurrentCountryCodeUseCase_Factory(provider);
    }

    public static GetCurrentCountryCodeUseCase newInstance(TelephonyManager telephonyManager) {
        return new GetCurrentCountryCodeUseCase(telephonyManager);
    }

    @Override // com.onfido.javax.inject.Provider
    public GetCurrentCountryCodeUseCase get() {
        return newInstance((TelephonyManager) this.telephonyManagerProvider.get());
    }
}
