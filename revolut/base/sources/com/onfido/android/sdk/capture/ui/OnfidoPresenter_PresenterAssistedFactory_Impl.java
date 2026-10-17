package com.onfido.android.sdk.capture.ui;

import com.onfido.android.sdk.capture.OnfidoConfig;
import com.onfido.android.sdk.capture.ui.OnfidoPresenter;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class OnfidoPresenter_PresenterAssistedFactory_Impl implements OnfidoPresenter.PresenterAssistedFactory {
    private final C2026OnfidoPresenter_Factory delegateFactory;

    public OnfidoPresenter_PresenterAssistedFactory_Impl(C2026OnfidoPresenter_Factory c2026OnfidoPresenter_Factory) {
        this.delegateFactory = c2026OnfidoPresenter_Factory;
    }

    @Override // com.onfido.android.sdk.capture.ui.OnfidoPresenter.Factory
    public OnfidoPresenter create(OnfidoConfig onfidoConfig) {
        return this.delegateFactory.get(onfidoConfig);
    }

    public static Provider create(C2026OnfidoPresenter_Factory c2026OnfidoPresenter_Factory) {
        return new el.c(new OnfidoPresenter_PresenterAssistedFactory_Impl(c2026OnfidoPresenter_Factory));
    }
}
