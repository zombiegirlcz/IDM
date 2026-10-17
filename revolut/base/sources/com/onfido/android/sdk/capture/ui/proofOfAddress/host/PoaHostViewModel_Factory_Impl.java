package com.onfido.android.sdk.capture.ui.proofOfAddress.host;

import androidx.lifecycle.SavedStateHandle;
import com.onfido.android.sdk.capture.ui.proofOfAddress.host.PoaHostViewModel;
import com.onfido.javax.inject.Provider;
import el.c;

/* JADX INFO: loaded from: classes17.dex */
public final class PoaHostViewModel_Factory_Impl implements PoaHostViewModel.Factory {
    private final C2151PoaHostViewModel_Factory delegateFactory;

    public PoaHostViewModel_Factory_Impl(C2151PoaHostViewModel_Factory c2151PoaHostViewModel_Factory) {
        this.delegateFactory = c2151PoaHostViewModel_Factory;
    }

    @Override // com.onfido.android.sdk.capture.ui.proofOfAddress.host.PoaHostViewModel.Factory
    public PoaHostViewModel create(SavedStateHandle savedStateHandle) {
        return this.delegateFactory.get(savedStateHandle);
    }

    public static Provider create(C2151PoaHostViewModel_Factory c2151PoaHostViewModel_Factory) {
        return new c(new PoaHostViewModel_Factory_Impl(c2151PoaHostViewModel_Factory));
    }
}
