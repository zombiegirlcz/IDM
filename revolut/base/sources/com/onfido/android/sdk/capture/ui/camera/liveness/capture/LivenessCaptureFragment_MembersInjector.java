package com.onfido.android.sdk.capture.ui.camera.liveness.capture;

import com.onfido.android.sdk.capture.internal.camera.factory.CameraFactory;
import com.onfido.android.sdk.capture.internal.service.AnnouncementService;
import com.onfido.android.sdk.capture.internal.service.VibratorService;
import com.onfido.android.sdk.capture.utils.ImageUtils;
import com.onfido.dagger.MembersInjector;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class LivenessCaptureFragment_MembersInjector implements MembersInjector {
    private final Provider announcementServiceProvider;
    private final Provider cameraFactoryProvider;
    private final Provider imageUtilsProvider;
    private final Provider vibratorServiceProvider;
    private final Provider viewModelProvider;

    public LivenessCaptureFragment_MembersInjector(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.viewModelProvider = provider;
        this.cameraFactoryProvider = provider2;
        this.announcementServiceProvider = provider3;
        this.vibratorServiceProvider = provider4;
        this.imageUtilsProvider = provider5;
    }

    public static MembersInjector create(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new LivenessCaptureFragment_MembersInjector(provider, provider2, provider3, provider4, provider5);
    }

    public static void injectAnnouncementService(LivenessCaptureFragment livenessCaptureFragment, AnnouncementService announcementService) {
        livenessCaptureFragment.announcementService = announcementService;
    }

    public static void injectCameraFactory(LivenessCaptureFragment livenessCaptureFragment, CameraFactory cameraFactory) {
        livenessCaptureFragment.cameraFactory = cameraFactory;
    }

    public static void injectImageUtils(LivenessCaptureFragment livenessCaptureFragment, ImageUtils imageUtils) {
        livenessCaptureFragment.imageUtils = imageUtils;
    }

    public static void injectVibratorService(LivenessCaptureFragment livenessCaptureFragment, VibratorService vibratorService) {
        livenessCaptureFragment.vibratorService = vibratorService;
    }

    public static void injectViewModelProvider(LivenessCaptureFragment livenessCaptureFragment, Provider provider) {
        livenessCaptureFragment.viewModelProvider = provider;
    }

    public void injectMembers(LivenessCaptureFragment livenessCaptureFragment) {
        injectViewModelProvider(livenessCaptureFragment, this.viewModelProvider);
        injectCameraFactory(livenessCaptureFragment, (CameraFactory) this.cameraFactoryProvider.get());
        injectAnnouncementService(livenessCaptureFragment, (AnnouncementService) this.announcementServiceProvider.get());
        injectVibratorService(livenessCaptureFragment, (VibratorService) this.vibratorServiceProvider.get());
        injectImageUtils(livenessCaptureFragment, (ImageUtils) this.imageUtilsProvider.get());
    }
}
