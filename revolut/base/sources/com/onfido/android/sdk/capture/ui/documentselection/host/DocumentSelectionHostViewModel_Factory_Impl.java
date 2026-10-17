package com.onfido.android.sdk.capture.ui.documentselection.host;

import androidx.lifecycle.SavedStateHandle;
import com.onfido.android.sdk.capture.ui.documentselection.host.DocumentSelectionHostViewModel;
import com.onfido.javax.inject.Provider;
import el.c;

/* JADX INFO: loaded from: classes17.dex */
public final class DocumentSelectionHostViewModel_Factory_Impl implements DocumentSelectionHostViewModel.Factory {
    private final C2133DocumentSelectionHostViewModel_Factory delegateFactory;

    public DocumentSelectionHostViewModel_Factory_Impl(C2133DocumentSelectionHostViewModel_Factory c2133DocumentSelectionHostViewModel_Factory) {
        this.delegateFactory = c2133DocumentSelectionHostViewModel_Factory;
    }

    @Override // com.onfido.android.sdk.capture.ui.documentselection.host.DocumentSelectionHostViewModel.Factory
    public DocumentSelectionHostViewModel create(SavedStateHandle savedStateHandle) {
        return this.delegateFactory.get(savedStateHandle);
    }

    public static Provider create(C2133DocumentSelectionHostViewModel_Factory c2133DocumentSelectionHostViewModel_Factory) {
        return new c(new DocumentSelectionHostViewModel_Factory_Impl(c2133DocumentSelectionHostViewModel_Factory));
    }
}
