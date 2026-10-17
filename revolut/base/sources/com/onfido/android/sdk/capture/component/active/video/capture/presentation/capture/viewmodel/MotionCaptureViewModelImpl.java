package com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel;

import ch.qos.logback.core.util.a;
import com.onfido.android.sdk.capture.component.active.video.capture.analytics.AvcAnalyticsCaptureStatus;
import com.onfido.android.sdk.capture.component.active.video.capture.analytics.AvcAnalyticsEvent;
import com.onfido.android.sdk.capture.component.active.video.capture.analytics.AvcAnalyticsFaceAlignment;
import com.onfido.android.sdk.capture.component.active.video.capture.data.repository.b;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.MotionCameraController;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector.FaceDetectorAvc;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector.FaceDetectorResult;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.MotionCaptureViewModel;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.headturn.HeadTurnGuidanceViewModel;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.mapper.ToFaceAlignmentFeedbackAccessibilityMapper;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.mapper.ToFaceAlignmentFeedbackMapper;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.mapper.ToFaceAlignmentMapper;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.model.FaceAlignment;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.model.FaceAlignmentFeedback;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.util.AudioFocusHelper;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.util.AvcTimer;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.util.MicAvailabilityHelper;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.OnfidoAnalytics;
import com.onfido.android.sdk.capture.internal.service.AnnouncementService;
import com.onfido.android.sdk.capture.internal.util.OnfidoRectF;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.android.sdk.capture.utils.RxExtensionsKt;
import igm.g;
import igm.o;
import igm.p;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 \u0086\u00012\u00020\u0001:\u0004\u0086\u0001\u0087\u0001Bw\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0001\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020 H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020 H\u0016¢\u0006\u0004\b%\u0010$J\u000f\u0010&\u001a\u00020 H\u0016¢\u0006\u0004\b&\u0010$J\u000f\u0010'\u001a\u00020 H\u0016¢\u0006\u0004\b'\u0010$J\u000f\u0010(\u001a\u00020 H\u0016¢\u0006\u0004\b(\u0010$J\u000f\u0010)\u001a\u00020 H\u0016¢\u0006\u0004\b)\u0010$J\u000f\u0010*\u001a\u00020 H\u0016¢\u0006\u0004\b*\u0010$J\u000f\u0010+\u001a\u00020 H\u0016¢\u0006\u0004\b+\u0010$J\u000f\u0010,\u001a\u00020 H\u0016¢\u0006\u0004\b,\u0010$J\u0017\u00101\u001a\u00020 2\u0006\u0010.\u001a\u00020-H\u0001¢\u0006\u0004\b/\u00100J\u000f\u00102\u001a\u00020 H\u0016¢\u0006\u0004\b2\u0010$J\u000f\u00103\u001a\u00020\u0016H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020 H\u0002¢\u0006\u0004\b5\u0010$J\u000f\u00107\u001a\u000206H\u0002¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020 H\u0002¢\u0006\u0004\b9\u0010$J\u000f\u0010:\u001a\u000206H\u0002¢\u0006\u0004\b:\u00108J\u000f\u0010;\u001a\u00020 H\u0002¢\u0006\u0004\b;\u0010$J\u000f\u0010<\u001a\u00020 H\u0002¢\u0006\u0004\b<\u0010$J\u0017\u0010=\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b=\u0010\"J\u0017\u0010@\u001a\u00020\u00162\u0006\u0010?\u001a\u00020>H\u0002¢\u0006\u0004\b@\u0010AJ\u0017\u0010D\u001a\u00020 2\u0006\u0010C\u001a\u00020BH\u0002¢\u0006\u0004\bD\u0010EJ\u0017\u0010G\u001a\u00020 2\u0006\u0010F\u001a\u00020>H\u0002¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u00020 H\u0002¢\u0006\u0004\bI\u0010$J\u000f\u0010J\u001a\u00020 H\u0002¢\u0006\u0004\bJ\u0010$J\u000f\u0010K\u001a\u00020 H\u0002¢\u0006\u0004\bK\u0010$J\u000f\u0010L\u001a\u000206H\u0002¢\u0006\u0004\bL\u00108J\u000f\u0010M\u001a\u00020 H\u0002¢\u0006\u0004\bM\u0010$J\u000f\u0010N\u001a\u00020 H\u0002¢\u0006\u0004\bN\u0010$J\u000f\u0010O\u001a\u00020 H\u0002¢\u0006\u0004\bO\u0010$J\u000f\u0010P\u001a\u00020 H\u0002¢\u0006\u0004\bP\u0010$J\u0017\u0010Q\u001a\u00020 2\u0006\u0010C\u001a\u00020BH\u0002¢\u0006\u0004\bQ\u0010EJ\u0017\u0010T\u001a\u00020 2\u0006\u0010S\u001a\u00020RH\u0002¢\u0006\u0004\bT\u0010UJ\u0017\u0010X\u001a\u00020 2\u0006\u0010W\u001a\u00020VH\u0002¢\u0006\u0004\bX\u0010YJ\u000f\u0010Z\u001a\u00020\u0016H\u0002¢\u0006\u0004\bZ\u00104J\u000f\u0010[\u001a\u00020\u0016H\u0002¢\u0006\u0004\b[\u00104J\u000f\u0010\\\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\\\u00104J\u000f\u0010]\u001a\u00020\u0016H\u0002¢\u0006\u0004\b]\u00104J\u000f\u0010^\u001a\u00020\u0016H\u0002¢\u0006\u0004\b^\u00104R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010_R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010`R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010cR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010dR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010eR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010fR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010gR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010hR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010iR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010jR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010kR\u0014\u0010m\u001a\u00020l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u0014\u0010o\u001a\u00020l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010nR\u0016\u0010p\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010qR\"\u0010u\u001a\u0010\u0012\f\u0012\n t*\u0004\u0018\u00010s0s0r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010vR \u0010x\u001a\b\u0012\u0004\u0012\u00020s0w8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{R\u001a\u0010}\u001a\b\u0012\u0004\u0012\u00020-0|8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R \u0010.\u001a\b\u0012\u0004\u0012\u00020-0w8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010y\u001a\u0004\b\u007f\u0010{R$\u0010\u0080\u0001\u001a\u0010\u0012\f\u0012\n t*\u0004\u0018\u00010B0B0r8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010vR#\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020B0w8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010y\u001a\u0005\b\u0082\u0001\u0010{R\u001c\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00020B0|8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010~R#\u0010\u0084\u0001\u001a\b\u0012\u0004\u0012\u00020B0w8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0084\u0001\u0010y\u001a\u0005\b\u0085\u0001\u0010{¨\u0006\u0088\u0001"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/viewmodel/MotionCaptureViewModelImpl;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/viewmodel/MotionCaptureViewModel;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/viewmodel/util/AvcTimer;", "faceAlignmentTimer", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/viewmodel/headturn/HeadTurnGuidanceViewModel;", "headTurnGuidanceViewModel", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/viewmodel/mapper/ToFaceAlignmentMapper;", "toFaceAlignmentMapper", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/viewmodel/mapper/ToFaceAlignmentFeedbackMapper;", "toFaceAlignmentFeedbackMapper", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/viewmodel/mapper/ToFaceAlignmentFeedbackAccessibilityMapper;", "toFaceAlignmentFeedbackAccessibilityMapper", "Lcom/onfido/android/sdk/capture/internal/service/AnnouncementService;", "announcementService", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/OnfidoAnalytics;", "analytics", "Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;", "schedulersProvider", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/viewmodel/util/MicAvailabilityHelper;", "micAvailabilityHelper", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/viewmodel/util/AudioFocusHelper;", "audioFocusHelper", "", "audioEnabled", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/MotionCameraController;", "cameraController", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/facedetector/FaceDetectorAvc;", "faceDetector", "<init>", "(Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/viewmodel/util/AvcTimer;Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/viewmodel/headturn/HeadTurnGuidanceViewModel;Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/viewmodel/mapper/ToFaceAlignmentMapper;Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/viewmodel/mapper/ToFaceAlignmentFeedbackMapper;Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/viewmodel/mapper/ToFaceAlignmentFeedbackAccessibilityMapper;Lcom/onfido/android/sdk/capture/internal/service/AnnouncementService;Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/OnfidoAnalytics;Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/viewmodel/util/MicAvailabilityHelper;Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/viewmodel/util/AudioFocusHelper;ZLcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/MotionCameraController;Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/facedetector/FaceDetectorAvc;)V", "Lcom/onfido/android/sdk/capture/internal/util/OnfidoRectF;", "ovalRect", "", "initialize", "(Lcom/onfido/android/sdk/capture/internal/util/OnfidoRectF;)V", "startRecording", "()V", "finishRecording", "completeFlow", "onRecordingTimeoutAlertDialogDismissed", "onRecordingIsTooShortAlertDialogDismissed", "onMicIsNotAvailableAlertDialogDismissed", "onAudioConflictAlertDialogDismissed", "onStop", "onDestroy", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/viewmodel/MotionCaptureViewModel$ViewState;", "viewState", "setViewState$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/viewmodel/MotionCaptureViewModel$ViewState;)V", "setViewState", "trackScreenAnalyticsEvent", "isCompletedState", "()Z", "startFaceNotDetectedFeedbackTimer", "", "getFaceNotDetectedFeedbackTimeout", "()J", "startFaceNotDetectedTransitionTimeoutTimer", "getFaceNotDetectedTransitionTimeout", "observeFaceNotDetected", "handleFaceNotDetected", "observeFaceDetected", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/viewmodel/model/FaceAlignment;", "faceAlignment", "isFaceMisalignedDuringRecording", "(Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/viewmodel/model/FaceAlignment;)Z", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/viewmodel/model/FaceAlignmentFeedback;", "feedback", "emitFaceAlignmentAccessibilityFeedback", "(Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/viewmodel/model/FaceAlignmentFeedback;)V", "it", "handleFaceAlignment", "(Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/viewmodel/model/FaceAlignment;)V", "resetPreviewIfRecordingStartedState", "cancelRecording", "startRecordingTimer", "getAdjustedMaxRecordingTime", "observeHeadTurnCompleted", "observeAudioFocus", "onAlertDialogDismissed", "resetStates", "emitFaceAlignmentFeedback", "Lcom/onfido/android/sdk/capture/component/active/video/capture/analytics/AvcAnalyticsFaceAlignment;", "alignment", "trackFaceAlignmentAnalyticsEvent", "(Lcom/onfido/android/sdk/capture/component/active/video/capture/analytics/AvcAnalyticsFaceAlignment;)V", "Lcom/onfido/android/sdk/capture/component/active/video/capture/analytics/AvcAnalyticsCaptureStatus;", "status", "trackCaptureStatusAnalyticsEvent", "(Lcom/onfido/android/sdk/capture/component/active/video/capture/analytics/AvcAnalyticsCaptureStatus;)V", "isFaceNotPresentState", "isFaceAlignmentState", "isRecordingStartedState", "isRecordingFinishedState", "isDelayStartRecordingState", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/viewmodel/util/AvcTimer;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/viewmodel/headturn/HeadTurnGuidanceViewModel;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/viewmodel/mapper/ToFaceAlignmentMapper;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/viewmodel/mapper/ToFaceAlignmentFeedbackMapper;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/viewmodel/mapper/ToFaceAlignmentFeedbackAccessibilityMapper;", "Lcom/onfido/android/sdk/capture/internal/service/AnnouncementService;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/OnfidoAnalytics;", "Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/viewmodel/util/MicAvailabilityHelper;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/viewmodel/util/AudioFocusHelper;", "Z", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/MotionCameraController;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/facedetector/FaceDetectorAvc;", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "compositeDisposable", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "recordingTimerDisposable", "recordingTime", "J", "Lio/reactivex/rxjava3/subjects/PublishSubject;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/facedetector/FaceDetectorResult$FaceDetected;", "kotlin.jvm.PlatformType", "detectedFaceSubject", "Lio/reactivex/rxjava3/subjects/PublishSubject;", "Lio/reactivex/rxjava3/core/Observable;", "detectedFace", "Lio/reactivex/rxjava3/core/Observable;", "getDetectedFace", "()Lio/reactivex/rxjava3/core/Observable;", "Lio/reactivex/rxjava3/subjects/BehaviorSubject;", "viewStateSubject", "Lio/reactivex/rxjava3/subjects/BehaviorSubject;", "getViewState", "faceAlignmentFeedbackSubject", "faceAlignmentFeedback", "getFaceAlignmentFeedback", "faceAlignmentFeedbackAccessibilitySubject", "faceAlignmentFeedbackAccessibility", "getFaceAlignmentFeedbackAccessibility", "Companion", "Factory", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MotionCaptureViewModelImpl implements MotionCaptureViewModel {
    public static final long MAX_RECORDING_TIME_MILLISECONDS = 15000;
    public static final long MIN_RECORDING_TIME_MILLISECONDS = 1500;
    public static final long TIMER_FACE_NOT_DETECTED_FEEDBACK_MILLISECONDS = 5000;
    public static final long TIMER_FACE_NOT_DETECTED_FEEDBACK_MILLISECONDS_ACCESSIBILITY = 10000;
    public static final long TIMER_FACE_NOT_DETECTED_TIMEOUT_MILLISECONDS = 5000;
    public static final long TIMER_FACE_NOT_DETECTED_TIMEOUT_MILLISECONDS_ACCESSIBILITY = 10000;
    public static final long TIMER_PERIOD_MILLISECONDS = 100;

    @NotNull
    private final OnfidoAnalytics analytics;

    @NotNull
    private final AnnouncementService announcementService;
    private final boolean audioEnabled;

    @NotNull
    private final AudioFocusHelper audioFocusHelper;

    @NotNull
    private final MotionCameraController cameraController;

    @NotNull
    private final CompositeDisposable compositeDisposable;

    @NotNull
    private final Observable detectedFace;

    @NotNull
    private final PublishSubject detectedFaceSubject;

    @NotNull
    private final Observable faceAlignmentFeedback;

    @NotNull
    private final Observable faceAlignmentFeedbackAccessibility;

    @NotNull
    private final BehaviorSubject faceAlignmentFeedbackAccessibilitySubject;

    @NotNull
    private final PublishSubject faceAlignmentFeedbackSubject;

    @NotNull
    private final AvcTimer faceAlignmentTimer;

    @NotNull
    private final FaceDetectorAvc faceDetector;

    @NotNull
    private final HeadTurnGuidanceViewModel headTurnGuidanceViewModel;

    @NotNull
    private final MicAvailabilityHelper micAvailabilityHelper;
    private long recordingTime;

    @NotNull
    private final CompositeDisposable recordingTimerDisposable;

    @NotNull
    private final SchedulersProvider schedulersProvider;

    @NotNull
    private final ToFaceAlignmentFeedbackAccessibilityMapper toFaceAlignmentFeedbackAccessibilityMapper;

    @NotNull
    private final ToFaceAlignmentFeedbackMapper toFaceAlignmentFeedbackMapper;

    @NotNull
    private final ToFaceAlignmentMapper toFaceAlignmentMapper;

    @NotNull
    private final Observable viewState;

    @NotNull
    private final BehaviorSubject viewStateSubject;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/viewmodel/MotionCaptureViewModelImpl$Factory;", "", "create", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/viewmodel/MotionCaptureViewModelImpl;", "audioEnabled", "", "cameraController", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/MotionCameraController;", "faceDetector", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/facedetector/FaceDetectorAvc;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Factory {
        @NotNull
        MotionCaptureViewModelImpl create(boolean audioEnabled, @NotNull MotionCameraController cameraController, @NotNull FaceDetectorAvc faceDetector);
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.MotionCaptureViewModelImpl$startFaceNotDetectedFeedbackTimer$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C19921 extends u implements Function0<Unit> {
        public C19921() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m3686invoke();
            return Unit.f186387a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m3686invoke() {
            MotionCaptureViewModelImpl motionCaptureViewModelImpl = MotionCaptureViewModelImpl.this;
            FaceAlignmentFeedback.FaceNotDetected faceNotDetected = FaceAlignmentFeedback.FaceNotDetected.INSTANCE;
            motionCaptureViewModelImpl.emitFaceAlignmentFeedback(faceNotDetected);
            MotionCaptureViewModelImpl.this.emitFaceAlignmentAccessibilityFeedback(faceNotDetected);
            MotionCaptureViewModelImpl.this.startFaceNotDetectedTransitionTimeoutTimer();
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.MotionCaptureViewModelImpl$startFaceNotDetectedTransitionTimeoutTimer$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C19931 extends u implements Function0<Unit> {
        public C19931() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m3687invoke();
            return Unit.f186387a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m3687invoke() {
            MotionCaptureViewModelImpl.this.setViewState$onfido_capture_sdk_core_release(MotionCaptureViewModel.ViewState.Error.FaceAlignmentTimeout.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.MotionCaptureViewModelImpl$startRecording$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C19941 extends u implements Function0<Unit> {
        public C19941() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m3688invoke();
            return Unit.f186387a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m3688invoke() {
            MotionCaptureViewModelImpl.this.setViewState$onfido_capture_sdk_core_release(MotionCaptureViewModel.ViewState.RecordingStarted.INSTANCE);
            MotionCaptureViewModelImpl.this.startRecordingTimer();
            MotionCaptureViewModelImpl.this.trackCaptureStatusAnalyticsEvent(AvcAnalyticsCaptureStatus.CAPTURE_STARTED);
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.MotionCaptureViewModelImpl$startRecording$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C19952 extends u implements Function0<Unit> {
        public C19952() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m3689invoke();
            return Unit.f186387a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m3689invoke() {
            MotionCaptureViewModelImpl.this.setViewState$onfido_capture_sdk_core_release(MotionCaptureViewModel.ViewState.RecordingFinished.INSTANCE);
            MotionCaptureViewModelImpl.this.trackCaptureStatusAnalyticsEvent(AvcAnalyticsCaptureStatus.CAPTURE_COMPLETED);
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.MotionCaptureViewModelImpl$startRecording$3, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C19963 extends u implements Function1<Throwable, Unit> {
        public C19963() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            invoke((Throwable) obj2);
            return Unit.f186387a;
        }

        public final void invoke(@NotNull Throwable it8) {
            Intrinsics.checkNotNullParameter(it8, "it");
            if (MotionCaptureViewModelImpl.this.isRecordingFinishedState()) {
                MotionCaptureViewModelImpl.this.setViewState$onfido_capture_sdk_core_release(new MotionCaptureViewModel.ViewState.Error.RecordingFailed(it8));
            }
        }
    }

    public MotionCaptureViewModelImpl(@NotNull AvcTimer faceAlignmentTimer, @NotNull HeadTurnGuidanceViewModel headTurnGuidanceViewModel, @NotNull ToFaceAlignmentMapper toFaceAlignmentMapper, @NotNull ToFaceAlignmentFeedbackMapper toFaceAlignmentFeedbackMapper, @NotNull ToFaceAlignmentFeedbackAccessibilityMapper toFaceAlignmentFeedbackAccessibilityMapper, @NotNull AnnouncementService announcementService, @NotNull OnfidoAnalytics analytics, @NotNull SchedulersProvider schedulersProvider, @NotNull MicAvailabilityHelper micAvailabilityHelper, @NotNull AudioFocusHelper audioFocusHelper, boolean z, @NotNull MotionCameraController cameraController, @NotNull FaceDetectorAvc faceDetector) {
        Intrinsics.checkNotNullParameter(faceAlignmentTimer, "faceAlignmentTimer");
        Intrinsics.checkNotNullParameter(headTurnGuidanceViewModel, "headTurnGuidanceViewModel");
        Intrinsics.checkNotNullParameter(toFaceAlignmentMapper, "toFaceAlignmentMapper");
        Intrinsics.checkNotNullParameter(toFaceAlignmentFeedbackMapper, "toFaceAlignmentFeedbackMapper");
        Intrinsics.checkNotNullParameter(toFaceAlignmentFeedbackAccessibilityMapper, "toFaceAlignmentFeedbackAccessibilityMapper");
        Intrinsics.checkNotNullParameter(announcementService, "announcementService");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(schedulersProvider, "schedulersProvider");
        Intrinsics.checkNotNullParameter(micAvailabilityHelper, "micAvailabilityHelper");
        Intrinsics.checkNotNullParameter(audioFocusHelper, "audioFocusHelper");
        Intrinsics.checkNotNullParameter(cameraController, "cameraController");
        Intrinsics.checkNotNullParameter(faceDetector, "faceDetector");
        this.faceAlignmentTimer = faceAlignmentTimer;
        this.headTurnGuidanceViewModel = headTurnGuidanceViewModel;
        this.toFaceAlignmentMapper = toFaceAlignmentMapper;
        this.toFaceAlignmentFeedbackMapper = toFaceAlignmentFeedbackMapper;
        this.toFaceAlignmentFeedbackAccessibilityMapper = toFaceAlignmentFeedbackAccessibilityMapper;
        this.announcementService = announcementService;
        this.analytics = analytics;
        this.schedulersProvider = schedulersProvider;
        this.micAvailabilityHelper = micAvailabilityHelper;
        this.audioFocusHelper = audioFocusHelper;
        this.audioEnabled = z;
        this.cameraController = cameraController;
        this.faceDetector = faceDetector;
        this.compositeDisposable = new CompositeDisposable();
        this.recordingTimerDisposable = new CompositeDisposable();
        PublishSubject publishSubjectN = a.n("create(...)");
        this.detectedFaceSubject = publishSubjectN;
        Observable observableHide = publishSubjectN.hide();
        Intrinsics.checkNotNullExpressionValue(observableHide, "hide(...)");
        this.detectedFace = observableHide;
        BehaviorSubject behaviorSubjectD = BehaviorSubject.d(MotionCaptureViewModel.ViewState.FaceNotPresent.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(behaviorSubjectD, "createDefault(...)");
        this.viewStateSubject = behaviorSubjectD;
        Observable observableDistinctUntilChanged = behaviorSubjectD.hide().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        this.viewState = observableDistinctUntilChanged;
        PublishSubject publishSubjectN2 = a.n("create(...)");
        this.faceAlignmentFeedbackSubject = publishSubjectN2;
        Observable observableDoOnNext = publishSubjectN2.hide().distinctUntilChanged().doOnNext(new g() { // from class: com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.MotionCaptureViewModelImpl$faceAlignmentFeedback$1
            @Override // igm.g
            public final void accept(FaceAlignmentFeedback faceAlignmentFeedback) {
                MotionCaptureViewModelImpl motionCaptureViewModelImpl;
                AvcAnalyticsFaceAlignment avcAnalyticsFaceAlignment;
                if (Intrinsics.f(faceAlignmentFeedback, FaceAlignmentFeedback.MoveBack.INSTANCE)) {
                    motionCaptureViewModelImpl = this.this$0;
                    avcAnalyticsFaceAlignment = AvcAnalyticsFaceAlignment.FACE_TOO_CLOSE;
                } else if (Intrinsics.f(faceAlignmentFeedback, FaceAlignmentFeedback.MoveCloser.INSTANCE)) {
                    motionCaptureViewModelImpl = this.this$0;
                    avcAnalyticsFaceAlignment = AvcAnalyticsFaceAlignment.FACE_TOO_FAR;
                } else if (Intrinsics.f(faceAlignmentFeedback, FaceAlignmentFeedback.FaceNotCentered.INSTANCE)) {
                    motionCaptureViewModelImpl = this.this$0;
                    avcAnalyticsFaceAlignment = AvcAnalyticsFaceAlignment.FACE_NOT_CENTERED;
                } else if (Intrinsics.f(faceAlignmentFeedback, FaceAlignmentFeedback.FaceNotDetected.INSTANCE)) {
                    motionCaptureViewModelImpl = this.this$0;
                    avcAnalyticsFaceAlignment = AvcAnalyticsFaceAlignment.NO_FACE_DETECTED;
                } else {
                    if (!Intrinsics.f(faceAlignmentFeedback, FaceAlignmentFeedback.FaceAligned.INSTANCE)) {
                        return;
                    }
                    motionCaptureViewModelImpl = this.this$0;
                    avcAnalyticsFaceAlignment = AvcAnalyticsFaceAlignment.FACE_ALIGNED;
                }
                motionCaptureViewModelImpl.trackFaceAlignmentAnalyticsEvent(avcAnalyticsFaceAlignment);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableDoOnNext, "doOnNext(...)");
        this.faceAlignmentFeedback = observableDoOnNext;
        BehaviorSubject behaviorSubjectD2 = BehaviorSubject.d(FaceAlignmentFeedback.Idle.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(behaviorSubjectD2, "createDefault(...)");
        this.faceAlignmentFeedbackAccessibilitySubject = behaviorSubjectD2;
        Observable observableDistinctUntilChanged2 = behaviorSubjectD2.hide().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        this.faceAlignmentFeedbackAccessibility = observableDistinctUntilChanged2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelRecording() {
        this.recordingTimerDisposable.d();
        this.audioFocusHelper.abandonAudioFocus();
        this.cameraController.cancelRecording();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void emitFaceAlignmentAccessibilityFeedback(FaceAlignmentFeedback feedback) {
        this.faceAlignmentFeedbackAccessibilitySubject.onNext(feedback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void emitFaceAlignmentFeedback(FaceAlignmentFeedback feedback) {
        this.faceAlignmentFeedbackSubject.onNext(feedback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getAdjustedMaxRecordingTime() {
        return 14000L;
    }

    private final long getFaceNotDetectedFeedbackTimeout() {
        return this.announcementService.isEnabled() ? 10000L : 5000L;
    }

    private final long getFaceNotDetectedTransitionTimeout() {
        return this.announcementService.isEnabled() ? 10000L : 5000L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleFaceAlignment(FaceAlignment it8) {
        MotionCaptureViewModel.ViewState viewState;
        if (isFaceNotPresentState()) {
            this.faceAlignmentTimer.cancel();
        }
        if (it8 instanceof FaceAlignment.FaceCenterIsNotAligned ? true : Intrinsics.f(it8, FaceAlignment.FaceCenterIsAligned.FaceIsTooBig.INSTANCE) ? true : Intrinsics.f(it8, FaceAlignment.FaceCenterIsAligned.FaceIsTooSmall.INSTANCE)) {
            resetPreviewIfRecordingStartedState();
            viewState = MotionCaptureViewModel.ViewState.FaceAlignment.INSTANCE;
        } else {
            if (!Intrinsics.f(it8, FaceAlignment.FaceCenterIsAligned.FaceIsAligned.INSTANCE)) {
                return;
            }
            if (!isFaceNotPresentState() && !isFaceAlignmentState()) {
                return;
            } else {
                viewState = MotionCaptureViewModel.ViewState.DelayStartRecording.INSTANCE;
            }
        }
        setViewState$onfido_capture_sdk_core_release(viewState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleFaceNotDetected() {
        resetPreviewIfRecordingStartedState();
        setViewState$onfido_capture_sdk_core_release(MotionCaptureViewModel.ViewState.FaceNotPresent.INSTANCE);
        FaceAlignmentFeedback.FaceNotDetected faceNotDetected = FaceAlignmentFeedback.FaceNotDetected.INSTANCE;
        emitFaceAlignmentFeedback(faceNotDetected);
        emitFaceAlignmentAccessibilityFeedback(faceNotDetected);
        startFaceNotDetectedTransitionTimeoutTimer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isDelayStartRecordingState() {
        return Intrinsics.f(this.viewStateSubject.e(), MotionCaptureViewModel.ViewState.DelayStartRecording.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isFaceAlignmentState() {
        return Intrinsics.f(this.viewStateSubject.e(), MotionCaptureViewModel.ViewState.FaceAlignment.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isFaceMisalignedDuringRecording(FaceAlignment faceAlignment) {
        if (faceAlignment instanceof FaceAlignment.FaceCenterIsNotAligned ? true : Intrinsics.f(faceAlignment, FaceAlignment.FaceCenterIsAligned.FaceIsTooBig.INSTANCE) ? true : Intrinsics.f(faceAlignment, FaceAlignment.FaceCenterIsAligned.FaceIsTooSmall.INSTANCE)) {
            return isRecordingStartedState();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isFaceNotPresentState() {
        return Intrinsics.f(this.viewStateSubject.e(), MotionCaptureViewModel.ViewState.FaceNotPresent.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isRecordingFinishedState() {
        return Intrinsics.f(this.viewStateSubject.e(), MotionCaptureViewModel.ViewState.RecordingFinished.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isRecordingStartedState() {
        return Intrinsics.f(this.viewStateSubject.e(), MotionCaptureViewModel.ViewState.RecordingStarted.INSTANCE);
    }

    private final void observeAudioFocus() {
        CompositeDisposable compositeDisposable = this.compositeDisposable;
        Disposable disposableSubscribe = this.audioFocusHelper.getFocusLostObservable().observeOn(this.schedulersProvider.getUi()).subscribe(new g() { // from class: com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.MotionCaptureViewModelImpl.observeAudioFocus.1
            @Override // igm.g
            public /* bridge */ /* synthetic */ void accept(Object obj2) {
                accept(((Boolean) obj2).booleanValue());
            }

            public final void accept(boolean z) {
                if (MotionCaptureViewModelImpl.this.isRecordingStartedState()) {
                    MotionCaptureViewModelImpl.this.cancelRecording();
                }
                MotionCaptureViewModelImpl.this.setViewState$onfido_capture_sdk_core_release(MotionCaptureViewModel.ViewState.Error.AudioConflict.INSTANCE);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        RxExtensionsKt.plusAssign(compositeDisposable, disposableSubscribe);
    }

    private final void observeFaceDetected(final OnfidoRectF ovalRect) {
        CompositeDisposable compositeDisposable = this.compositeDisposable;
        Observable observableCast = this.faceDetector.getResultObservable().filter(new p() { // from class: com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.MotionCaptureViewModelImpl$observeFaceDetected$$inlined$filterIsInstance$1
            @Override // igm.p
            public final boolean test(@NotNull Object it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8 instanceof FaceDetectorResult.FaceDetected;
            }
        }).cast(FaceDetectorResult.FaceDetected.class);
        Intrinsics.checkNotNullExpressionValue(observableCast, "cast(...)");
        Disposable disposableSubscribe = observableCast.observeOn(this.schedulersProvider.getUi()).doOnNext(new g() { // from class: com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.MotionCaptureViewModelImpl.observeFaceDetected.1
            @Override // igm.g
            public final void accept(@NotNull FaceDetectorResult.FaceDetected it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
                if (MotionCaptureViewModelImpl.this.isRecordingStartedState()) {
                    MotionCaptureViewModelImpl.this.headTurnGuidanceViewModel.handleFaceRotation(it8.getFaceAngle());
                } else {
                    MotionCaptureViewModelImpl.this.detectedFaceSubject.onNext(it8);
                }
            }
        }).map(new o() { // from class: com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.MotionCaptureViewModelImpl.observeFaceDetected.2
            @Override // igm.o
            @NotNull
            public final FaceAlignment apply(@NotNull FaceDetectorResult.FaceDetected it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
                return MotionCaptureViewModelImpl.this.toFaceAlignmentMapper.map(ovalRect, it8.getFaceRect(), it8.getFaceAngle(), MotionCaptureViewModelImpl.this.isDelayStartRecordingState() || MotionCaptureViewModelImpl.this.isRecordingStartedState());
            }
        }).filter(new p() { // from class: com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.MotionCaptureViewModelImpl.observeFaceDetected.3
            @Override // igm.p
            public final boolean test(@NotNull FaceAlignment it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
                return MotionCaptureViewModelImpl.this.isFaceNotPresentState() || MotionCaptureViewModelImpl.this.isFaceAlignmentState() || MotionCaptureViewModelImpl.this.isDelayStartRecordingState() || MotionCaptureViewModelImpl.this.isRecordingStartedState();
            }
        }).doOnNext(new g() { // from class: com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.MotionCaptureViewModelImpl.observeFaceDetected.4
            @Override // igm.g
            public final void accept(@NotNull FaceAlignment it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
                MotionCaptureViewModelImpl motionCaptureViewModelImpl = MotionCaptureViewModelImpl.this;
                motionCaptureViewModelImpl.emitFaceAlignmentFeedback(motionCaptureViewModelImpl.toFaceAlignmentFeedbackMapper.map(it8));
            }
        }).doOnNext(new g() { // from class: com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.MotionCaptureViewModelImpl.observeFaceDetected.5
            @Override // igm.g
            public final void accept(@NotNull FaceAlignment it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
                if (MotionCaptureViewModelImpl.this.isFaceMisalignedDuringRecording(it8)) {
                    MotionCaptureViewModelImpl.this.emitFaceAlignmentAccessibilityFeedback(FaceAlignmentFeedback.FaceNotCentered.INSTANCE);
                }
                MotionCaptureViewModelImpl motionCaptureViewModelImpl = MotionCaptureViewModelImpl.this;
                motionCaptureViewModelImpl.emitFaceAlignmentAccessibilityFeedback(motionCaptureViewModelImpl.toFaceAlignmentFeedbackAccessibilityMapper.map(it8));
            }
        }).subscribe(new g() { // from class: com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.MotionCaptureViewModelImpl.observeFaceDetected.6
            @Override // igm.g
            public final void accept(@NotNull FaceAlignment p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                MotionCaptureViewModelImpl.this.handleFaceAlignment(p0);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        RxExtensionsKt.plusAssign(compositeDisposable, disposableSubscribe);
    }

    private final void observeFaceNotDetected() {
        CompositeDisposable compositeDisposable = this.compositeDisposable;
        Observable observableDistinctUntilChanged = this.faceDetector.getResultObservable().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        Observable observableCast = observableDistinctUntilChanged.filter(new p() { // from class: com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.MotionCaptureViewModelImpl$observeFaceNotDetected$$inlined$filterIsInstance$1
            @Override // igm.p
            public final boolean test(@NotNull Object it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8 instanceof FaceDetectorResult.FaceNotDetected;
            }
        }).cast(FaceDetectorResult.FaceNotDetected.class);
        Intrinsics.checkNotNullExpressionValue(observableCast, "cast(...)");
        Disposable disposableSubscribe = observableCast.filter(new p() { // from class: com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.MotionCaptureViewModelImpl.observeFaceNotDetected.1
            @Override // igm.p
            public final boolean test(@NotNull FaceDetectorResult.FaceNotDetected it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
                return MotionCaptureViewModelImpl.this.isFaceAlignmentState() || MotionCaptureViewModelImpl.this.isDelayStartRecordingState() || MotionCaptureViewModelImpl.this.isRecordingStartedState();
            }
        }).observeOn(this.schedulersProvider.getUi()).subscribe(new g() { // from class: com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.MotionCaptureViewModelImpl.observeFaceNotDetected.2
            @Override // igm.g
            public final void accept(@NotNull FaceDetectorResult.FaceNotDetected it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
                MotionCaptureViewModelImpl.this.handleFaceNotDetected();
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        RxExtensionsKt.plusAssign(compositeDisposable, disposableSubscribe);
    }

    private final void observeHeadTurnCompleted() {
        CompositeDisposable compositeDisposable = this.compositeDisposable;
        Disposable disposableSubscribe = this.headTurnGuidanceViewModel.getViewState().filter(new p() { // from class: com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.MotionCaptureViewModelImpl.observeHeadTurnCompleted.1
            @Override // igm.p
            public final boolean test(@NotNull HeadTurnGuidanceViewModel.ViewState it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8.isCompleted();
            }
        }).filter(new p() { // from class: com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.MotionCaptureViewModelImpl.observeHeadTurnCompleted.2
            @Override // igm.p
            public final boolean test(@NotNull HeadTurnGuidanceViewModel.ViewState it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
                return MotionCaptureViewModelImpl.this.isRecordingStartedState();
            }
        }).subscribe(new g() { // from class: com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.MotionCaptureViewModelImpl.observeHeadTurnCompleted.3
            @Override // igm.g
            public final void accept(@NotNull HeadTurnGuidanceViewModel.ViewState it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
                if (MotionCaptureViewModelImpl.this.recordingTime >= 1500) {
                    MotionCaptureViewModelImpl.this.recordingTimerDisposable.d();
                    MotionCaptureViewModelImpl.this.setViewState$onfido_capture_sdk_core_release(MotionCaptureViewModel.ViewState.DelayFinishRecording.INSTANCE);
                } else {
                    MotionCaptureViewModelImpl.this.cancelRecording();
                    MotionCaptureViewModelImpl.this.setViewState$onfido_capture_sdk_core_release(MotionCaptureViewModel.ViewState.Error.RecordingIsTooShort.INSTANCE);
                    MotionCaptureViewModelImpl.this.analytics.track(AvcAnalyticsEvent.FaceCaptureErrorTooFast.INSTANCE);
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        RxExtensionsKt.plusAssign(compositeDisposable, disposableSubscribe);
    }

    private final void onAlertDialogDismissed() {
        this.cameraController.reset();
        setViewState$onfido_capture_sdk_core_release(MotionCaptureViewModel.ViewState.FaceAlignment.INSTANCE);
    }

    private final void resetPreviewIfRecordingStartedState() {
        if (isRecordingStartedState()) {
            cancelRecording();
            this.cameraController.reset();
            trackCaptureStatusAnalyticsEvent(AvcAnalyticsCaptureStatus.FACE_LOST);
        }
    }

    private final void resetStates() {
        MotionCaptureViewModel.ViewState viewState;
        MotionCaptureViewModel.ViewState viewState2 = (MotionCaptureViewModel.ViewState) this.viewStateSubject.e();
        if (Intrinsics.f(viewState2, MotionCaptureViewModel.ViewState.FaceAlignment.INSTANCE) ? true : Intrinsics.f(viewState2, MotionCaptureViewModel.ViewState.DelayStartRecording.INSTANCE) ? true : viewState2 instanceof MotionCaptureViewModel.ViewState.Error) {
            viewState = MotionCaptureViewModel.ViewState.FaceNotPresent.INSTANCE;
        } else {
            if (Intrinsics.f(viewState2, MotionCaptureViewModel.ViewState.RecordingStarted.INSTANCE) ? true : Intrinsics.f(viewState2, MotionCaptureViewModel.ViewState.DelayFinishRecording.INSTANCE)) {
                cancelRecording();
                viewState = MotionCaptureViewModel.ViewState.FaceNotPresent.INSTANCE;
            } else if (!Intrinsics.f(viewState2, MotionCaptureViewModel.ViewState.RecordingFinished.INSTANCE)) {
                return;
            } else {
                viewState = MotionCaptureViewModel.ViewState.Completed.INSTANCE;
            }
        }
        setViewState$onfido_capture_sdk_core_release(viewState);
    }

    private final void startFaceNotDetectedFeedbackTimer() {
        if (isFaceNotPresentState()) {
            this.faceAlignmentTimer.start(getFaceNotDetectedFeedbackTimeout(), new C19921());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startFaceNotDetectedTransitionTimeoutTimer() {
        this.faceAlignmentTimer.start(getFaceNotDetectedTransitionTimeout(), new C19931());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startRecordingTimer() {
        CompositeDisposable compositeDisposable = this.recordingTimerDisposable;
        Disposable disposableSubscribe = Observable.interval(100L, TimeUnit.MILLISECONDS, this.schedulersProvider.getTimer()).takeUntil(new p() { // from class: com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.MotionCaptureViewModelImpl.startRecordingTimer.1
            public final boolean test(long j2) {
                return j2 * 100 == MotionCaptureViewModelImpl.this.getAdjustedMaxRecordingTime();
            }

            @Override // igm.p
            public /* bridge */ /* synthetic */ boolean test(Object obj2) {
                return test(((Number) obj2).longValue());
            }
        }).observeOn(this.schedulersProvider.getUi()).doOnNext(new g() { // from class: com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.MotionCaptureViewModelImpl.startRecordingTimer.2
            public final void accept(long j2) {
                MotionCaptureViewModelImpl.this.recordingTime = j2 * 100;
            }

            @Override // igm.g
            public /* bridge */ /* synthetic */ void accept(Object obj2) {
                accept(((Number) obj2).longValue());
            }
        }).doOnComplete(new b(this, 1)).subscribe();
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        RxExtensionsKt.plusAssign(compositeDisposable, disposableSubscribe);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startRecordingTimer$lambda$0(MotionCaptureViewModelImpl this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.cancelRecording();
        this$0.setViewState$onfido_capture_sdk_core_release(MotionCaptureViewModel.ViewState.Error.RecordingTimeout.INSTANCE);
        this$0.analytics.track(AvcAnalyticsEvent.FaceCaptureErrorTimeout.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackCaptureStatusAnalyticsEvent(AvcAnalyticsCaptureStatus status) {
        this.analytics.track(new AvcAnalyticsEvent.FaceCaptureStatus(status.getValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackFaceAlignmentAnalyticsEvent(AvcAnalyticsFaceAlignment alignment) {
        this.analytics.track(new AvcAnalyticsEvent.FaceAlignmentStatus(alignment.getValue()));
    }

    @Override // com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.MotionCaptureViewModel
    public void completeFlow() {
        setViewState$onfido_capture_sdk_core_release(MotionCaptureViewModel.ViewState.Completed.INSTANCE);
    }

    @Override // com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.MotionCaptureViewModel
    public void finishRecording() {
        this.audioFocusHelper.abandonAudioFocus();
        this.cameraController.finishRecording();
    }

    @Override // com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.MotionCaptureViewModel
    @NotNull
    public Observable getDetectedFace() {
        return this.detectedFace;
    }

    @Override // com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.MotionCaptureViewModel
    @NotNull
    public Observable getFaceAlignmentFeedback() {
        return this.faceAlignmentFeedback;
    }

    @Override // com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.MotionCaptureViewModel
    @NotNull
    public Observable getFaceAlignmentFeedbackAccessibility() {
        return this.faceAlignmentFeedbackAccessibility;
    }

    @Override // com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.MotionCaptureViewModel
    @NotNull
    public Observable getViewState() {
        return this.viewState;
    }

    @Override // com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.MotionCaptureViewModel
    public void initialize(@NotNull OnfidoRectF ovalRect) {
        Intrinsics.checkNotNullParameter(ovalRect, "ovalRect");
        startFaceNotDetectedFeedbackTimer();
        observeFaceNotDetected();
        observeFaceDetected(ovalRect);
        observeHeadTurnCompleted();
        observeAudioFocus();
    }

    @Override // com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.MotionCaptureViewModel
    public boolean isCompletedState() {
        return Intrinsics.f(this.viewStateSubject.e(), MotionCaptureViewModel.ViewState.Completed.INSTANCE);
    }

    @Override // com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.MotionCaptureViewModel
    public void onAudioConflictAlertDialogDismissed() {
        onAlertDialogDismissed();
    }

    @Override // com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.MotionCaptureViewModel
    public void onDestroy() {
        this.cameraController.onDestroy();
    }

    @Override // com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.MotionCaptureViewModel
    public void onMicIsNotAvailableAlertDialogDismissed() {
        onAlertDialogDismissed();
    }

    @Override // com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.MotionCaptureViewModel
    public void onRecordingIsTooShortAlertDialogDismissed() {
        onAlertDialogDismissed();
        this.analytics.track(AvcAnalyticsEvent.FaceCaptureErrorTooFastRestartCapture.INSTANCE);
    }

    @Override // com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.MotionCaptureViewModel
    public void onRecordingTimeoutAlertDialogDismissed() {
        onAlertDialogDismissed();
        this.analytics.track(AvcAnalyticsEvent.FaceCaptureErrorTimeoutRestartCapture.INSTANCE);
    }

    @Override // com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.MotionCaptureViewModel
    public void onStop() {
        this.compositeDisposable.d();
        this.faceAlignmentTimer.cancel();
        resetStates();
        this.cameraController.onStop();
    }

    public final void setViewState$onfido_capture_sdk_core_release(@NotNull MotionCaptureViewModel.ViewState viewState) {
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        this.viewStateSubject.onNext(viewState);
    }

    @Override // com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.MotionCaptureViewModel
    public void startRecording() {
        if (this.audioEnabled && !this.micAvailabilityHelper.isMicAvailable()) {
            setViewState$onfido_capture_sdk_core_release(MotionCaptureViewModel.ViewState.Error.MicIsNotAvailable.INSTANCE);
        } else if (!this.audioEnabled || this.announcementService.isEnabled() || this.audioFocusHelper.requestAudioFocusIfPossible()) {
            this.cameraController.startRecording(new C19941(), new C19952(), new C19963());
        } else {
            setViewState$onfido_capture_sdk_core_release(MotionCaptureViewModel.ViewState.Error.AudioConflict.INSTANCE);
        }
    }

    @Override // com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.MotionCaptureViewModel
    public void trackScreenAnalyticsEvent() {
        this.analytics.track(AvcAnalyticsEvent.FaceAlignment.INSTANCE);
    }
}
