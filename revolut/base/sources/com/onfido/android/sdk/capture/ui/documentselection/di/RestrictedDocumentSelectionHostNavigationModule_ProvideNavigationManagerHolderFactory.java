package com.onfido.android.sdk.capture.ui.documentselection.di;

import com.onfido.android.sdk.capture.internal.navigation.OnfidoNavigation;
import com.onfido.android.sdk.capture.internal.navigation.navigator.NavigationManagerHolder;
import com.onfido.javax.inject.Provider;
import el.b;
import n14.e;

/* JADX INFO: loaded from: classes17.dex */
public final class RestrictedDocumentSelectionHostNavigationModule_ProvideNavigationManagerHolderFactory implements b {
    private final RestrictedDocumentSelectionHostNavigationModule module;
    private final Provider onfidoNavigationProvider;

    public RestrictedDocumentSelectionHostNavigationModule_ProvideNavigationManagerHolderFactory(RestrictedDocumentSelectionHostNavigationModule restrictedDocumentSelectionHostNavigationModule, Provider provider) {
        this.module = restrictedDocumentSelectionHostNavigationModule;
        this.onfidoNavigationProvider = provider;
    }

    public static RestrictedDocumentSelectionHostNavigationModule_ProvideNavigationManagerHolderFactory create(RestrictedDocumentSelectionHostNavigationModule restrictedDocumentSelectionHostNavigationModule, Provider provider) {
        return new RestrictedDocumentSelectionHostNavigationModule_ProvideNavigationManagerHolderFactory(restrictedDocumentSelectionHostNavigationModule, provider);
    }

    public static NavigationManagerHolder provideNavigationManagerHolder(RestrictedDocumentSelectionHostNavigationModule restrictedDocumentSelectionHostNavigationModule, OnfidoNavigation onfidoNavigation) {
        NavigationManagerHolder navigationManagerHolderProvideNavigationManagerHolder = restrictedDocumentSelectionHostNavigationModule.provideNavigationManagerHolder(onfidoNavigation);
        e.g(navigationManagerHolderProvideNavigationManagerHolder);
        return navigationManagerHolderProvideNavigationManagerHolder;
    }

    @Override // com.onfido.javax.inject.Provider
    public NavigationManagerHolder get() {
        return provideNavigationManagerHolder(this.module, (OnfidoNavigation) this.onfidoNavigationProvider.get());
    }
}
