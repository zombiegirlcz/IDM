package com.onfido.android.sdk.capture.component.active.video.capture.di.host;

import com.onfido.android.sdk.capture.internal.navigation.OnfidoNavigation;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.javax.inject.Provider;
import el.b;
import n14.e;

/* JADX INFO: loaded from: classes17.dex */
public final class NavigationModule_ProvideOnfidoNavigationFactory implements b {
    private final Provider schedulersProvider;

    public NavigationModule_ProvideOnfidoNavigationFactory(Provider provider) {
        this.schedulersProvider = provider;
    }

    public static NavigationModule_ProvideOnfidoNavigationFactory create(Provider provider) {
        return new NavigationModule_ProvideOnfidoNavigationFactory(provider);
    }

    public static OnfidoNavigation provideOnfidoNavigation(SchedulersProvider schedulersProvider) {
        OnfidoNavigation onfidoNavigationProvideOnfidoNavigation = NavigationModule.INSTANCE.provideOnfidoNavigation(schedulersProvider);
        e.g(onfidoNavigationProvideOnfidoNavigation);
        return onfidoNavigationProvideOnfidoNavigation;
    }

    @Override // com.onfido.javax.inject.Provider
    public OnfidoNavigation get() {
        return provideOnfidoNavigation((SchedulersProvider) this.schedulersProvider.get());
    }
}
