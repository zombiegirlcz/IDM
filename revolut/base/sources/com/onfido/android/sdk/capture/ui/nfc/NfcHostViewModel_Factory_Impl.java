package com.onfido.android.sdk.capture.ui.nfc;

import androidx.lifecycle.SavedStateHandle;
import com.onfido.android.sdk.capture.ui.nfc.NfcHostViewModel;
import com.onfido.javax.inject.Provider;
import el.c;

/* JADX INFO: loaded from: classes17.dex */
public final class NfcHostViewModel_Factory_Impl implements NfcHostViewModel.Factory {
    private final C2135NfcHostViewModel_Factory delegateFactory;

    public NfcHostViewModel_Factory_Impl(C2135NfcHostViewModel_Factory c2135NfcHostViewModel_Factory) {
        this.delegateFactory = c2135NfcHostViewModel_Factory;
    }

    @Override // com.onfido.android.sdk.capture.ui.nfc.NfcHostViewModel.Factory
    public NfcHostViewModel create(SavedStateHandle savedStateHandle) {
        return this.delegateFactory.get(savedStateHandle);
    }

    public static Provider create(C2135NfcHostViewModel_Factory c2135NfcHostViewModel_Factory) {
        return new c(new NfcHostViewModel_Factory_Impl(c2135NfcHostViewModel_Factory));
    }
}
