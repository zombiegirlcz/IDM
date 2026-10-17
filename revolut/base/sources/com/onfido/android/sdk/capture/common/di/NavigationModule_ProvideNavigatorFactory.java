package com.onfido.android.sdk.capture.common.di;

import com.onfido.android.sdk.capture.internal.navigation.Navigator;
import com.onfido.android.sdk.capture.internal.navigation.OnfidoNavigation;
import com.onfido.javax.inject.Provider;
import el.b;
import n14.e;

/* JADX INFO: loaded from: classes17.dex */
public final class NavigationModule_ProvideNavigatorFactory implements b {
    private final Provider onfidoNavigationProvider;

    public NavigationModule_ProvideNavigatorFactory(Provider provider) {
        this.onfidoNavigationProvider = provider;
    }

    public static NavigationModule_ProvideNavigatorFactory create(Provider provider) {
        return new NavigationModule_ProvideNavigatorFactory(provider);
    }

    public static Navigator provideNavigator(OnfidoNavigation onfidoNavigation) {
        Navigator navigatorProvideNavigator = NavigationModule.INSTANCE.provideNavigator(onfidoNavigation);
        e.g(navigatorProvideNavigator);
        return navigatorProvideNavigator;
    }

    @Override // com.onfido.javax.inject.Provider
    public Navigator get() {
        return provideNavigator((OnfidoNavigation) this.onfidoNavigationProvider.get());
    }
}
