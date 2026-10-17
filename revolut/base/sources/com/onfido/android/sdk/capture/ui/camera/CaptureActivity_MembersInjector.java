package com.onfido.android.sdk.capture.ui.camera;

import com.onfido.android.sdk.capture.OnfidoConfig;
import com.onfido.android.sdk.capture.common.cryptography.Cryptography;
import com.onfido.android.sdk.capture.common.cryptography.PayloadHelper;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.FlowTracker;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.WaitingScreenTracker;
import com.onfido.android.sdk.capture.internal.camera.factory.CameraFactory;
import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.android.sdk.capture.internal.performance.AggregatedPerformanceAnalytics;
import com.onfido.android.sdk.capture.internal.performance.trackers.ScreenLoadTracker;
import com.onfido.android.sdk.capture.internal.service.AnnouncementService;
import com.onfido.android.sdk.capture.internal.service.VibratorService;
import com.onfido.android.sdk.capture.internal.util.DispatchersProvider;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.android.sdk.capture.internal.util.environment.EnvironmentIntegrityChecker;
import com.onfido.android.sdk.capture.network.OnfidoApiService;
import com.onfido.android.sdk.capture.ui.BaseActivity_MembersInjector;
import com.onfido.android.sdk.capture.utils.ImageUtils;
import com.onfido.api.client.token.TokenProvider;
import com.onfido.dagger.MembersInjector;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class CaptureActivity_MembersInjector implements MembersInjector {
    private final Provider announcementServiceProvider;
    private final Provider cameraFactoryProvider;
    private final Provider cryptographyProvider;
    private final Provider dispatchersProvider;
    private final Provider environmentIntegrityCheckerProvider;
    private final Provider flowTrackerProvider;
    private final Provider imageUtilsProvider;
    private final Provider onfidoApiServiceProvider;
    private final Provider onfidoConfigProvider;
    private final Provider onfidoRemoteConfigProvider;
    private final Provider payloadHelperProvider;
    private final Provider performanceAnalyticsProvider;
    private final Provider presenterProvider;
    private final Provider remoteConfigProvider;
    private final Provider schedulersProvider;
    private final Provider screenLoadTrackerProvider;
    private final Provider tokenProvider;
    private final Provider vibratorServiceProvider;
    private final Provider waitingScreenTrackerProvider;

    public CaptureActivity_MembersInjector(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, Provider provider14, Provider provider15, Provider provider16, Provider provider17, Provider provider18, Provider provider19) {
        this.performanceAnalyticsProvider = provider;
        this.onfidoConfigProvider = provider2;
        this.waitingScreenTrackerProvider = provider3;
        this.remoteConfigProvider = provider4;
        this.flowTrackerProvider = provider5;
        this.presenterProvider = provider6;
        this.imageUtilsProvider = provider7;
        this.onfidoApiServiceProvider = provider8;
        this.announcementServiceProvider = provider9;
        this.vibratorServiceProvider = provider10;
        this.schedulersProvider = provider11;
        this.screenLoadTrackerProvider = provider12;
        this.onfidoRemoteConfigProvider = provider13;
        this.cryptographyProvider = provider14;
        this.payloadHelperProvider = provider15;
        this.cameraFactoryProvider = provider16;
        this.tokenProvider = provider17;
        this.environmentIntegrityCheckerProvider = provider18;
        this.dispatchersProvider = provider19;
    }

    public static MembersInjector create(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, Provider provider14, Provider provider15, Provider provider16, Provider provider17, Provider provider18, Provider provider19) {
        return new CaptureActivity_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18, provider19);
    }

    public static void injectAnnouncementService(CaptureActivity captureActivity, AnnouncementService announcementService) {
        captureActivity.announcementService = announcementService;
    }

    public static void injectCameraFactory(CaptureActivity captureActivity, CameraFactory cameraFactory) {
        captureActivity.cameraFactory = cameraFactory;
    }

    public static void injectCryptography(CaptureActivity captureActivity, Cryptography cryptography) {
        captureActivity.cryptography = cryptography;
    }

    public static void injectDispatchersProvider(CaptureActivity captureActivity, DispatchersProvider dispatchersProvider) {
        captureActivity.dispatchersProvider = dispatchersProvider;
    }

    public static void injectEnvironmentIntegrityChecker(CaptureActivity captureActivity, EnvironmentIntegrityChecker environmentIntegrityChecker) {
        captureActivity.environmentIntegrityChecker = environmentIntegrityChecker;
    }

    public static void injectImageUtils(CaptureActivity captureActivity, ImageUtils imageUtils) {
        captureActivity.imageUtils = imageUtils;
    }

    public static void injectOnfidoApiService(CaptureActivity captureActivity, OnfidoApiService onfidoApiService) {
        captureActivity.onfidoApiService = onfidoApiService;
    }

    public static void injectOnfidoRemoteConfig(CaptureActivity captureActivity, OnfidoRemoteConfig onfidoRemoteConfig) {
        captureActivity.onfidoRemoteConfig = onfidoRemoteConfig;
    }

    public static void injectPayloadHelper(CaptureActivity captureActivity, PayloadHelper payloadHelper) {
        captureActivity.payloadHelper = payloadHelper;
    }

    public static void injectPresenter(CaptureActivity captureActivity, CapturePresenter capturePresenter) {
        captureActivity.presenter = capturePresenter;
    }

    public static void injectSchedulersProvider(CaptureActivity captureActivity, SchedulersProvider schedulersProvider) {
        captureActivity.schedulersProvider = schedulersProvider;
    }

    public static void injectScreenLoadTracker(CaptureActivity captureActivity, ScreenLoadTracker screenLoadTracker) {
        captureActivity.screenLoadTracker = screenLoadTracker;
    }

    public static void injectTokenProvider(CaptureActivity captureActivity, TokenProvider tokenProvider) {
        captureActivity.tokenProvider = tokenProvider;
    }

    public static void injectVibratorService(CaptureActivity captureActivity, VibratorService vibratorService) {
        captureActivity.vibratorService = vibratorService;
    }

    public void injectMembers(CaptureActivity captureActivity) {
        BaseActivity_MembersInjector.injectPerformanceAnalytics(captureActivity, (AggregatedPerformanceAnalytics) this.performanceAnalyticsProvider.get());
        BaseActivity_MembersInjector.injectOnfidoConfig(captureActivity, (OnfidoConfig) this.onfidoConfigProvider.get());
        BaseActivity_MembersInjector.injectWaitingScreenTracker(captureActivity, (WaitingScreenTracker) this.waitingScreenTrackerProvider.get());
        BaseActivity_MembersInjector.injectRemoteConfig(captureActivity, (OnfidoRemoteConfig) this.remoteConfigProvider.get());
        BaseActivity_MembersInjector.injectFlowTracker(captureActivity, (FlowTracker) this.flowTrackerProvider.get());
        injectPresenter(captureActivity, (CapturePresenter) this.presenterProvider.get());
        injectImageUtils(captureActivity, (ImageUtils) this.imageUtilsProvider.get());
        injectOnfidoApiService(captureActivity, (OnfidoApiService) this.onfidoApiServiceProvider.get());
        injectAnnouncementService(captureActivity, (AnnouncementService) this.announcementServiceProvider.get());
        injectVibratorService(captureActivity, (VibratorService) this.vibratorServiceProvider.get());
        injectSchedulersProvider(captureActivity, (SchedulersProvider) this.schedulersProvider.get());
        injectScreenLoadTracker(captureActivity, (ScreenLoadTracker) this.screenLoadTrackerProvider.get());
        injectOnfidoRemoteConfig(captureActivity, (OnfidoRemoteConfig) this.onfidoRemoteConfigProvider.get());
        injectCryptography(captureActivity, (Cryptography) this.cryptographyProvider.get());
        injectPayloadHelper(captureActivity, (PayloadHelper) this.payloadHelperProvider.get());
        injectCameraFactory(captureActivity, (CameraFactory) this.cameraFactoryProvider.get());
        injectTokenProvider(captureActivity, (TokenProvider) this.tokenProvider.get());
        injectEnvironmentIntegrityChecker(captureActivity, (EnvironmentIntegrityChecker) this.environmentIntegrityCheckerProvider.get());
        injectDispatchersProvider(captureActivity, (DispatchersProvider) this.dispatchersProvider.get());
    }
}
