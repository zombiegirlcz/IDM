package com.onfido.android.sdk.capture.component.active.video.capture.di.host;

import com.onfido.android.sdk.capture.internal.navigation.OnfidoNavigation;
import com.onfido.android.sdk.capture.internal.navigation.navigator.NavigationManagerHolder;
import com.onfido.javax.inject.Provider;
import el.b;
import n14.e;

/* JADX INFO: loaded from: classes17.dex */
public final class NavigationModule_ProvideNavigationManagerHolderFactory implements b {
    private final Provider onfidoNavigationProvider;

    public NavigationModule_ProvideNavigationManagerHolderFactory(Provider provider) {
        this.onfidoNavigationProvider = provider;
    }

    public static NavigationModule_ProvideNavigationManagerHolderFactory create(Provider provider) {
        return new NavigationModule_ProvideNavigationManagerHolderFactory(provider);
    }

    public static NavigationManagerHolder provideNavigationManagerHolder(OnfidoNavigation onfidoNavigation) {
        NavigationManagerHolder navigationManagerHolderProvideNavigationManagerHolder = NavigationModule.INSTANCE.provideNavigationManagerHolder(onfidoNavigation);
        e.g(navigationManagerHolderProvideNavigationManagerHolder);
        return navigationManagerHolderProvideNavigationManagerHolder;
    }

    @Override // com.onfido.javax.inject.Provider
    public NavigationManagerHolder get() {
        return provideNavigationManagerHolder((OnfidoNavigation) this.onfidoNavigationProvider.get());
    }
}
