package com.onfido.android.sdk.capture.ui.proofOfAddress.host;

import com.onfido.android.sdk.capture.OnfidoConfig;
import com.onfido.android.sdk.capture.common.permissions.RuntimePermissionsManager;
import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.android.sdk.capture.ui.proofOfAddress.PoaUtils;
import com.onfido.android.sdk.capture.ui.proofOfAddress.host.PoaHostViewModel;
import com.onfido.android.sdk.capture.utils.ImageUtils;
import com.onfido.dagger.MembersInjector;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class PoaHostFragment_MembersInjector implements MembersInjector {
    private final Provider imageUtilsProvider;
    private final Provider onfidoConfigProvider;
    private final Provider onfidoRemoteConfigProvider;
    private final Provider poaUtilsProvider;
    private final Provider poaViewModelFactoryProvider;
    private final Provider runtimePermissionsManagerProvider;

    public PoaHostFragment_MembersInjector(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        this.poaUtilsProvider = provider;
        this.runtimePermissionsManagerProvider = provider2;
        this.poaViewModelFactoryProvider = provider3;
        this.imageUtilsProvider = provider4;
        this.onfidoConfigProvider = provider5;
        this.onfidoRemoteConfigProvider = provider6;
    }

    public static MembersInjector create(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        return new PoaHostFragment_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static void injectImageUtils(PoaHostFragment poaHostFragment, ImageUtils imageUtils) {
        poaHostFragment.imageUtils = imageUtils;
    }

    public static void injectOnfidoConfig(PoaHostFragment poaHostFragment, OnfidoConfig onfidoConfig) {
        poaHostFragment.onfidoConfig = onfidoConfig;
    }

    public static void injectOnfidoRemoteConfig(PoaHostFragment poaHostFragment, OnfidoRemoteConfig onfidoRemoteConfig) {
        poaHostFragment.onfidoRemoteConfig = onfidoRemoteConfig;
    }

    public static void injectPoaUtils(PoaHostFragment poaHostFragment, PoaUtils poaUtils) {
        poaHostFragment.poaUtils = poaUtils;
    }

    public static void injectPoaViewModelFactory(PoaHostFragment poaHostFragment, PoaHostViewModel.Factory factory) {
        poaHostFragment.poaViewModelFactory = factory;
    }

    public static void injectRuntimePermissionsManager(PoaHostFragment poaHostFragment, RuntimePermissionsManager runtimePermissionsManager) {
        poaHostFragment.runtimePermissionsManager = runtimePermissionsManager;
    }

    public void injectMembers(PoaHostFragment poaHostFragment) {
        injectPoaUtils(poaHostFragment, (PoaUtils) this.poaUtilsProvider.get());
        injectRuntimePermissionsManager(poaHostFragment, (RuntimePermissionsManager) this.runtimePermissionsManagerProvider.get());
        injectPoaViewModelFactory(poaHostFragment, (PoaHostViewModel.Factory) this.poaViewModelFactoryProvider.get());
        injectImageUtils(poaHostFragment, (ImageUtils) this.imageUtilsProvider.get());
        injectOnfidoConfig(poaHostFragment, (OnfidoConfig) this.onfidoConfigProvider.get());
        injectOnfidoRemoteConfig(poaHostFragment, (OnfidoRemoteConfig) this.onfidoRemoteConfigProvider.get());
    }
}
