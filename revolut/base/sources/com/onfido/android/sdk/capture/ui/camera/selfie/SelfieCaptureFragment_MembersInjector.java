package com.onfido.android.sdk.capture.ui.camera.selfie;

import com.onfido.android.sdk.capture.common.permissions.RuntimePermissionsManager;
import com.onfido.android.sdk.capture.internal.camera.factory.CameraFactory;
import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.android.sdk.capture.internal.performance.AggregatedPerformanceAnalytics;
import com.onfido.android.sdk.capture.internal.service.AnnouncementService;
import com.onfido.android.sdk.capture.ui.camera.selfie.SelfieCaptureViewModel;
import com.onfido.android.sdk.capture.utils.ImageUtils;
import com.onfido.dagger.MembersInjector;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class SelfieCaptureFragment_MembersInjector implements MembersInjector {
    private final Provider announcementServiceProvider;
    private final Provider cameraFactoryProvider;
    private final Provider imageUtilsProvider;
    private final Provider onfidoRemoteConfigProvider;
    private final Provider performanceAnalyticsProvider;
    private final Provider permissionsManagerProvider;
    private final Provider viewModelFactoryProvider;

    public SelfieCaptureFragment_MembersInjector(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        this.performanceAnalyticsProvider = provider;
        this.imageUtilsProvider = provider2;
        this.onfidoRemoteConfigProvider = provider3;
        this.viewModelFactoryProvider = provider4;
        this.permissionsManagerProvider = provider5;
        this.announcementServiceProvider = provider6;
        this.cameraFactoryProvider = provider7;
    }

    public static MembersInjector create(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        return new SelfieCaptureFragment_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static void injectAnnouncementService(SelfieCaptureFragment selfieCaptureFragment, AnnouncementService announcementService) {
        selfieCaptureFragment.announcementService = announcementService;
    }

    public static void injectCameraFactory(SelfieCaptureFragment selfieCaptureFragment, CameraFactory cameraFactory) {
        selfieCaptureFragment.cameraFactory = cameraFactory;
    }

    public static void injectImageUtils(SelfieCaptureFragment selfieCaptureFragment, ImageUtils imageUtils) {
        selfieCaptureFragment.imageUtils = imageUtils;
    }

    public static void injectOnfidoRemoteConfig(SelfieCaptureFragment selfieCaptureFragment, OnfidoRemoteConfig onfidoRemoteConfig) {
        selfieCaptureFragment.onfidoRemoteConfig = onfidoRemoteConfig;
    }

    public static void injectPerformanceAnalytics(SelfieCaptureFragment selfieCaptureFragment, AggregatedPerformanceAnalytics aggregatedPerformanceAnalytics) {
        selfieCaptureFragment.performanceAnalytics = aggregatedPerformanceAnalytics;
    }

    public static void injectPermissionsManager(SelfieCaptureFragment selfieCaptureFragment, RuntimePermissionsManager runtimePermissionsManager) {
        selfieCaptureFragment.permissionsManager = runtimePermissionsManager;
    }

    public static void injectViewModelFactory(SelfieCaptureFragment selfieCaptureFragment, SelfieCaptureViewModel.Factory factory) {
        selfieCaptureFragment.viewModelFactory = factory;
    }

    public void injectMembers(SelfieCaptureFragment selfieCaptureFragment) {
        injectPerformanceAnalytics(selfieCaptureFragment, (AggregatedPerformanceAnalytics) this.performanceAnalyticsProvider.get());
        injectImageUtils(selfieCaptureFragment, (ImageUtils) this.imageUtilsProvider.get());
        injectOnfidoRemoteConfig(selfieCaptureFragment, (OnfidoRemoteConfig) this.onfidoRemoteConfigProvider.get());
        injectViewModelFactory(selfieCaptureFragment, (SelfieCaptureViewModel.Factory) this.viewModelFactoryProvider.get());
        injectPermissionsManager(selfieCaptureFragment, (RuntimePermissionsManager) this.permissionsManagerProvider.get());
        injectAnnouncementService(selfieCaptureFragment, (AnnouncementService) this.announcementServiceProvider.get());
        injectCameraFactory(selfieCaptureFragment, (CameraFactory) this.cameraFactoryProvider.get());
    }
}
