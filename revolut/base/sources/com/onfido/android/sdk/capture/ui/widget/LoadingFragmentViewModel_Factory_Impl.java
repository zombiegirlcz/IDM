package com.onfido.android.sdk.capture.ui.widget;

import com.onfido.android.sdk.capture.ui.widget.LoadingFragmentViewModel;
import com.onfido.android.sdk.capture.utils.LoadingFragment;
import com.onfido.javax.inject.Provider;
import el.c;

/* JADX INFO: loaded from: classes17.dex */
public final class LoadingFragmentViewModel_Factory_Impl implements LoadingFragmentViewModel.Factory {
    private final C2157LoadingFragmentViewModel_Factory delegateFactory;

    public LoadingFragmentViewModel_Factory_Impl(C2157LoadingFragmentViewModel_Factory c2157LoadingFragmentViewModel_Factory) {
        this.delegateFactory = c2157LoadingFragmentViewModel_Factory;
    }

    @Override // com.onfido.android.sdk.capture.ui.widget.LoadingFragmentViewModel.Factory
    public LoadingFragmentViewModel create(LoadingFragment.Companion.DialogMode dialogMode) {
        return this.delegateFactory.get(dialogMode);
    }

    public static Provider create(C2157LoadingFragmentViewModel_Factory c2157LoadingFragmentViewModel_Factory) {
        return new c(new LoadingFragmentViewModel_Factory_Impl(c2157LoadingFragmentViewModel_Factory));
    }
}
