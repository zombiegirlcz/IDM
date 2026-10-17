package com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view;

import com.onfido.android.sdk.capture.common.result.HapticFeedback;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.MotionCameraControllerFactory;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector.FaceDetectorAvcResultMapperTestImpl;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector.MotionFaceDetectorFactory;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.MotionCaptureViewModelImpl;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.headturn.HeadTurnGuidanceViewModel;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.util.AvcTimer;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.OnfidoAnalytics;
import com.onfido.android.sdk.capture.internal.service.AnnouncementService;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.android.sdk.capture.ui.options.MotionCaptureVariantOptions;
import com.onfido.dagger.MembersInjector;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class MotionCaptureFragment_MembersInjector implements MembersInjector {
    private final Provider analyticsProvider;
    private final Provider announcementServiceProvider;
    private final Provider cameraControllerFactoryProvider;
    private final Provider delayStartRecordingTimerProvider;
    private final Provider delayTimerProvider;
    private final Provider faceDetectorAvcResultMapperTestImplProvider;
    private final Provider hapticFeedbackProvider;
    private final Provider headTurnGuidanceViewModelProvider;
    private final Provider motionFaceDetectorFactoryProvider;
    private final Provider motionOptionsProvider;
    private final Provider schedulersProvider;
    private final Provider viewModelFactoryProvider;

    public MotionCaptureFragment_MembersInjector(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12) {
        this.motionOptionsProvider = provider;
        this.cameraControllerFactoryProvider = provider2;
        this.motionFaceDetectorFactoryProvider = provider3;
        this.headTurnGuidanceViewModelProvider = provider4;
        this.schedulersProvider = provider5;
        this.analyticsProvider = provider6;
        this.hapticFeedbackProvider = provider7;
        this.delayStartRecordingTimerProvider = provider8;
        this.delayTimerProvider = provider9;
        this.announcementServiceProvider = provider10;
        this.viewModelFactoryProvider = provider11;
        this.faceDetectorAvcResultMapperTestImplProvider = provider12;
    }

    public static MembersInjector create(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12) {
        return new MotionCaptureFragment_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12);
    }

    public static void injectAnalytics(MotionCaptureFragment motionCaptureFragment, OnfidoAnalytics onfidoAnalytics) {
        motionCaptureFragment.analytics = onfidoAnalytics;
    }

    public static void injectAnnouncementService(MotionCaptureFragment motionCaptureFragment, AnnouncementService announcementService) {
        motionCaptureFragment.announcementService = announcementService;
    }

    public static void injectCameraControllerFactory(MotionCaptureFragment motionCaptureFragment, MotionCameraControllerFactory motionCameraControllerFactory) {
        motionCaptureFragment.cameraControllerFactory = motionCameraControllerFactory;
    }

    public static void injectDelayStartRecordingTimer(MotionCaptureFragment motionCaptureFragment, AvcTimer avcTimer) {
        motionCaptureFragment.delayStartRecordingTimer = avcTimer;
    }

    public static void injectDelayTimer(MotionCaptureFragment motionCaptureFragment, AvcTimer avcTimer) {
        motionCaptureFragment.delayTimer = avcTimer;
    }

    public static void injectFaceDetectorAvcResultMapperTestImpl(MotionCaptureFragment motionCaptureFragment, FaceDetectorAvcResultMapperTestImpl<Object> faceDetectorAvcResultMapperTestImpl) {
        motionCaptureFragment.faceDetectorAvcResultMapperTestImpl = faceDetectorAvcResultMapperTestImpl;
    }

    public static void injectHapticFeedback(MotionCaptureFragment motionCaptureFragment, HapticFeedback hapticFeedback) {
        motionCaptureFragment.hapticFeedback = hapticFeedback;
    }

    public static void injectHeadTurnGuidanceViewModel(MotionCaptureFragment motionCaptureFragment, HeadTurnGuidanceViewModel headTurnGuidanceViewModel) {
        motionCaptureFragment.headTurnGuidanceViewModel = headTurnGuidanceViewModel;
    }

    public static void injectMotionFaceDetectorFactory(MotionCaptureFragment motionCaptureFragment, MotionFaceDetectorFactory motionFaceDetectorFactory) {
        motionCaptureFragment.motionFaceDetectorFactory = motionFaceDetectorFactory;
    }

    public static void injectMotionOptions(MotionCaptureFragment motionCaptureFragment, MotionCaptureVariantOptions motionCaptureVariantOptions) {
        motionCaptureFragment.motionOptions = motionCaptureVariantOptions;
    }

    public static void injectSchedulersProvider(MotionCaptureFragment motionCaptureFragment, SchedulersProvider schedulersProvider) {
        motionCaptureFragment.schedulersProvider = schedulersProvider;
    }

    public static void injectViewModelFactory(MotionCaptureFragment motionCaptureFragment, MotionCaptureViewModelImpl.Factory factory) {
        motionCaptureFragment.viewModelFactory = factory;
    }

    public void injectMembers(MotionCaptureFragment motionCaptureFragment) {
        injectMotionOptions(motionCaptureFragment, (MotionCaptureVariantOptions) this.motionOptionsProvider.get());
        injectCameraControllerFactory(motionCaptureFragment, (MotionCameraControllerFactory) this.cameraControllerFactoryProvider.get());
        injectMotionFaceDetectorFactory(motionCaptureFragment, (MotionFaceDetectorFactory) this.motionFaceDetectorFactoryProvider.get());
        injectHeadTurnGuidanceViewModel(motionCaptureFragment, (HeadTurnGuidanceViewModel) this.headTurnGuidanceViewModelProvider.get());
        injectSchedulersProvider(motionCaptureFragment, (SchedulersProvider) this.schedulersProvider.get());
        injectAnalytics(motionCaptureFragment, (OnfidoAnalytics) this.analyticsProvider.get());
        injectHapticFeedback(motionCaptureFragment, (HapticFeedback) this.hapticFeedbackProvider.get());
        injectDelayStartRecordingTimer(motionCaptureFragment, (AvcTimer) this.delayStartRecordingTimerProvider.get());
        injectDelayTimer(motionCaptureFragment, (AvcTimer) this.delayTimerProvider.get());
        injectAnnouncementService(motionCaptureFragment, (AnnouncementService) this.announcementServiceProvider.get());
        injectViewModelFactory(motionCaptureFragment, (MotionCaptureViewModelImpl.Factory) this.viewModelFactoryProvider.get());
        injectFaceDetectorAvcResultMapperTestImpl(motionCaptureFragment, (FaceDetectorAvcResultMapperTestImpl) this.faceDetectorAvcResultMapperTestImplProvider.get());
    }
}
