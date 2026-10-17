package com.onfido.android.sdk.capture.ui.documentselection.di;

import com.onfido.android.sdk.capture.internal.navigation.Navigator;
import com.onfido.android.sdk.capture.internal.navigation.OnfidoNavigation;
import com.onfido.javax.inject.Provider;
import el.b;
import n14.e;

/* JADX INFO: loaded from: classes17.dex */
public final class RestrictedDocumentSelectionHostNavigationModule_ProvideNavigatorFactory implements b {
    private final RestrictedDocumentSelectionHostNavigationModule module;
    private final Provider onfidoNavigationProvider;

    public RestrictedDocumentSelectionHostNavigationModule_ProvideNavigatorFactory(RestrictedDocumentSelectionHostNavigationModule restrictedDocumentSelectionHostNavigationModule, Provider provider) {
        this.module = restrictedDocumentSelectionHostNavigationModule;
        this.onfidoNavigationProvider = provider;
    }

    public static RestrictedDocumentSelectionHostNavigationModule_ProvideNavigatorFactory create(RestrictedDocumentSelectionHostNavigationModule restrictedDocumentSelectionHostNavigationModule, Provider provider) {
        return new RestrictedDocumentSelectionHostNavigationModule_ProvideNavigatorFactory(restrictedDocumentSelectionHostNavigationModule, provider);
    }

    public static Navigator provideNavigator(RestrictedDocumentSelectionHostNavigationModule restrictedDocumentSelectionHostNavigationModule, OnfidoNavigation onfidoNavigation) {
        Navigator navigatorProvideNavigator = restrictedDocumentSelectionHostNavigationModule.provideNavigator(onfidoNavigation);
        e.g(navigatorProvideNavigator);
        return navigatorProvideNavigator;
    }

    @Override // com.onfido.javax.inject.Provider
    public Navigator get() {
        return provideNavigator(this.module, (OnfidoNavigation) this.onfidoNavigationProvider.get());
    }
}
