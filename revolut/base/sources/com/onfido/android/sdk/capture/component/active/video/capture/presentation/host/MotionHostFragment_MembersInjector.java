package com.onfido.android.sdk.capture.component.active.video.capture.presentation.host;

import com.onfido.android.sdk.capture.common.permissions.RuntimePermissionsManager;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.host.MotionHostViewModel;
import com.onfido.dagger.MembersInjector;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class MotionHostFragment_MembersInjector implements MembersInjector {
    private final Provider motionHostViewModelFactoryProvider;
    private final Provider runtimePermissionsManagerProvider;

    public MotionHostFragment_MembersInjector(Provider provider, Provider provider2) {
        this.runtimePermissionsManagerProvider = provider;
        this.motionHostViewModelFactoryProvider = provider2;
    }

    public static MembersInjector create(Provider provider, Provider provider2) {
        return new MotionHostFragment_MembersInjector(provider, provider2);
    }

    public static void injectMotionHostViewModelFactory(MotionHostFragment motionHostFragment, MotionHostViewModel.Factory factory) {
        motionHostFragment.motionHostViewModelFactory = factory;
    }

    public static void injectRuntimePermissionsManager(MotionHostFragment motionHostFragment, RuntimePermissionsManager runtimePermissionsManager) {
        motionHostFragment.runtimePermissionsManager = runtimePermissionsManager;
    }

    public void injectMembers(MotionHostFragment motionHostFragment) {
        injectRuntimePermissionsManager(motionHostFragment, (RuntimePermissionsManager) this.runtimePermissionsManagerProvider.get());
        injectMotionHostViewModelFactory(motionHostFragment, (MotionHostViewModel.Factory) this.motionHostViewModelFactoryProvider.get());
    }
}
