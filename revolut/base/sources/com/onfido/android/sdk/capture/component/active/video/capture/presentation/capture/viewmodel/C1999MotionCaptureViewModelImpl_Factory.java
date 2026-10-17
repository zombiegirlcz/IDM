package com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel;

import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.MotionCameraController;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector.FaceDetectorAvc;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.headturn.HeadTurnGuidanceViewModel;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.mapper.ToFaceAlignmentFeedbackAccessibilityMapper;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.mapper.ToFaceAlignmentFeedbackMapper;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.mapper.ToFaceAlignmentMapper;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.util.AudioFocusHelper;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.util.AvcTimer;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.util.MicAvailabilityHelper;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.OnfidoAnalytics;
import com.onfido.android.sdk.capture.internal.service.AnnouncementService;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.javax.inject.Provider;

/* JADX INFO: renamed from: com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.MotionCaptureViewModelImpl_Factory, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1999MotionCaptureViewModelImpl_Factory {
    private final Provider analyticsProvider;
    private final Provider announcementServiceProvider;
    private final Provider audioFocusHelperProvider;
    private final Provider faceAlignmentTimerProvider;
    private final Provider headTurnGuidanceViewModelProvider;
    private final Provider micAvailabilityHelperProvider;
    private final Provider schedulersProvider;
    private final Provider toFaceAlignmentFeedbackAccessibilityMapperProvider;
    private final Provider toFaceAlignmentFeedbackMapperProvider;
    private final Provider toFaceAlignmentMapperProvider;

    public C1999MotionCaptureViewModelImpl_Factory(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10) {
        this.faceAlignmentTimerProvider = provider;
        this.headTurnGuidanceViewModelProvider = provider2;
        this.toFaceAlignmentMapperProvider = provider3;
        this.toFaceAlignmentFeedbackMapperProvider = provider4;
        this.toFaceAlignmentFeedbackAccessibilityMapperProvider = provider5;
        this.announcementServiceProvider = provider6;
        this.analyticsProvider = provider7;
        this.schedulersProvider = provider8;
        this.micAvailabilityHelperProvider = provider9;
        this.audioFocusHelperProvider = provider10;
    }

    public static C1999MotionCaptureViewModelImpl_Factory create(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10) {
        return new C1999MotionCaptureViewModelImpl_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }

    public static MotionCaptureViewModelImpl newInstance(AvcTimer avcTimer, HeadTurnGuidanceViewModel headTurnGuidanceViewModel, ToFaceAlignmentMapper toFaceAlignmentMapper, ToFaceAlignmentFeedbackMapper toFaceAlignmentFeedbackMapper, ToFaceAlignmentFeedbackAccessibilityMapper toFaceAlignmentFeedbackAccessibilityMapper, AnnouncementService announcementService, OnfidoAnalytics onfidoAnalytics, SchedulersProvider schedulersProvider, MicAvailabilityHelper micAvailabilityHelper, AudioFocusHelper audioFocusHelper, boolean z, MotionCameraController motionCameraController, FaceDetectorAvc faceDetectorAvc) {
        return new MotionCaptureViewModelImpl(avcTimer, headTurnGuidanceViewModel, toFaceAlignmentMapper, toFaceAlignmentFeedbackMapper, toFaceAlignmentFeedbackAccessibilityMapper, announcementService, onfidoAnalytics, schedulersProvider, micAvailabilityHelper, audioFocusHelper, z, motionCameraController, faceDetectorAvc);
    }

    public MotionCaptureViewModelImpl get(boolean z, MotionCameraController motionCameraController, FaceDetectorAvc faceDetectorAvc) {
        return newInstance((AvcTimer) this.faceAlignmentTimerProvider.get(), (HeadTurnGuidanceViewModel) this.headTurnGuidanceViewModelProvider.get(), (ToFaceAlignmentMapper) this.toFaceAlignmentMapperProvider.get(), (ToFaceAlignmentFeedbackMapper) this.toFaceAlignmentFeedbackMapperProvider.get(), (ToFaceAlignmentFeedbackAccessibilityMapper) this.toFaceAlignmentFeedbackAccessibilityMapperProvider.get(), (AnnouncementService) this.announcementServiceProvider.get(), (OnfidoAnalytics) this.analyticsProvider.get(), (SchedulersProvider) this.schedulersProvider.get(), (MicAvailabilityHelper) this.micAvailabilityHelperProvider.get(), (AudioFocusHelper) this.audioFocusHelperProvider.get(), z, motionCameraController, faceDetectorAvc);
    }
}
