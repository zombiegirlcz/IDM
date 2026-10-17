package com.onfido.android.sdk.capture.component.active.video.capture.presentation.host;

import androidx.lifecycle.SavedStateHandle;
import com.onfido.android.sdk.capture.common.permissions.RuntimePermissionsManager;
import com.onfido.android.sdk.capture.component.active.video.capture.domain.usecase.GetFaceDetectionModuleAvailabilityUseCase;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.OnfidoAnalytics;
import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.android.sdk.capture.internal.navigation.Navigator;
import com.onfido.android.sdk.capture.internal.navigation.navigator.NavigationManagerHolder;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.javax.inject.Provider;

/* JADX INFO: renamed from: com.onfido.android.sdk.capture.component.active.video.capture.presentation.host.MotionHostViewModel_Factory, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C2003MotionHostViewModel_Factory {
    private final Provider analyticsProvider;
    private final Provider getFaceDetectionModuleAvailabilityUseCaseProvider;
    private final Provider navigationManagerHolderProvider;
    private final Provider navigatorProvider;
    private final Provider onfidoRemoteConfigProvider;
    private final Provider runtimePermissionsManagerProvider;
    private final Provider schedulersProvider;

    public C2003MotionHostViewModel_Factory(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        this.navigatorProvider = provider;
        this.navigationManagerHolderProvider = provider2;
        this.runtimePermissionsManagerProvider = provider3;
        this.analyticsProvider = provider4;
        this.onfidoRemoteConfigProvider = provider5;
        this.getFaceDetectionModuleAvailabilityUseCaseProvider = provider6;
        this.schedulersProvider = provider7;
    }

    public static C2003MotionHostViewModel_Factory create(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        return new C2003MotionHostViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static MotionHostViewModel newInstance(Navigator navigator, NavigationManagerHolder navigationManagerHolder, RuntimePermissionsManager runtimePermissionsManager, OnfidoAnalytics onfidoAnalytics, OnfidoRemoteConfig onfidoRemoteConfig, GetFaceDetectionModuleAvailabilityUseCase getFaceDetectionModuleAvailabilityUseCase, SchedulersProvider schedulersProvider, SavedStateHandle savedStateHandle, boolean z, boolean z3) {
        return new MotionHostViewModel(navigator, navigationManagerHolder, runtimePermissionsManager, onfidoAnalytics, onfidoRemoteConfig, getFaceDetectionModuleAvailabilityUseCase, schedulersProvider, savedStateHandle, z, z3);
    }

    public MotionHostViewModel get(SavedStateHandle savedStateHandle, boolean z, boolean z3) {
        return newInstance((Navigator) this.navigatorProvider.get(), (NavigationManagerHolder) this.navigationManagerHolderProvider.get(), (RuntimePermissionsManager) this.runtimePermissionsManagerProvider.get(), (OnfidoAnalytics) this.analyticsProvider.get(), (OnfidoRemoteConfig) this.onfidoRemoteConfigProvider.get(), (GetFaceDetectionModuleAvailabilityUseCase) this.getFaceDetectionModuleAvailabilityUseCaseProvider.get(), (SchedulersProvider) this.schedulersProvider.get(), savedStateHandle, z, z3);
    }
}
