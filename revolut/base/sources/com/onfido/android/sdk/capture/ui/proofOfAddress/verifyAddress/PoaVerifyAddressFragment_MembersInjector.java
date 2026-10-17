package com.onfido.android.sdk.capture.ui.proofOfAddress.verifyAddress;

import com.onfido.dagger.MembersInjector;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class PoaVerifyAddressFragment_MembersInjector implements MembersInjector {
    private final Provider poaViewModelProvider;

    public PoaVerifyAddressFragment_MembersInjector(Provider provider) {
        this.poaViewModelProvider = provider;
    }

    public static MembersInjector create(Provider provider) {
        return new PoaVerifyAddressFragment_MembersInjector(provider);
    }

    public static void injectPoaViewModelProvider(PoaVerifyAddressFragment poaVerifyAddressFragment, Provider provider) {
        poaVerifyAddressFragment.poaViewModelProvider = provider;
    }

    public void injectMembers(PoaVerifyAddressFragment poaVerifyAddressFragment) {
        injectPoaViewModelProvider(poaVerifyAddressFragment, this.poaViewModelProvider);
    }
}
