package com.onfido.android.sdk.capture.ui.documentselection.di;

import com.onfido.android.sdk.capture.internal.navigation.OnfidoNavigation;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.javax.inject.Provider;
import el.b;
import n14.e;

/* JADX INFO: loaded from: classes17.dex */
public final class RestrictedDocumentSelectionHostNavigationModule_ProvideOnfidoNavigationFactory implements b {
    private final RestrictedDocumentSelectionHostNavigationModule module;
    private final Provider schedulersProvider;

    public RestrictedDocumentSelectionHostNavigationModule_ProvideOnfidoNavigationFactory(RestrictedDocumentSelectionHostNavigationModule restrictedDocumentSelectionHostNavigationModule, Provider provider) {
        this.module = restrictedDocumentSelectionHostNavigationModule;
        this.schedulersProvider = provider;
    }

    public static RestrictedDocumentSelectionHostNavigationModule_ProvideOnfidoNavigationFactory create(RestrictedDocumentSelectionHostNavigationModule restrictedDocumentSelectionHostNavigationModule, Provider provider) {
        return new RestrictedDocumentSelectionHostNavigationModule_ProvideOnfidoNavigationFactory(restrictedDocumentSelectionHostNavigationModule, provider);
    }

    public static OnfidoNavigation provideOnfidoNavigation(RestrictedDocumentSelectionHostNavigationModule restrictedDocumentSelectionHostNavigationModule, SchedulersProvider schedulersProvider) {
        OnfidoNavigation onfidoNavigationProvideOnfidoNavigation = restrictedDocumentSelectionHostNavigationModule.provideOnfidoNavigation(schedulersProvider);
        e.g(onfidoNavigationProvideOnfidoNavigation);
        return onfidoNavigationProvideOnfidoNavigation;
    }

    @Override // com.onfido.javax.inject.Provider
    public OnfidoNavigation get() {
        return provideOnfidoNavigation(this.module, (SchedulersProvider) this.schedulersProvider.get());
    }
}
