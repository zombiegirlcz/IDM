package com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.headturn;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.onfido.android.sdk.capture.component.active.video.capture.analytics.AvcAnalyticsCaptureStatus;
import com.onfido.android.sdk.capture.component.active.video.capture.analytics.AvcAnalyticsEvent;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.headturn.HeadTurnGuidanceViewModel;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.OnfidoAnalytics;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.android.sdk.capture.utils.RxExtensionsKt;
import igm.g;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 52\u00020\u0001:\u00015B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001e\u0010\u0010J\u000f\u0010\u001f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001f\u0010\u001dJ\u000f\u0010 \u001a\u00020\nH\u0016¢\u0006\u0004\b \u0010\u001dJ\u000f\u0010!\u001a\u00020\nH\u0016¢\u0006\u0004\b!\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00120'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R \u0010+\u001a\b\u0012\u0004\u0012\u00020\u00120*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b\u0013\u0010-R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020.0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010)R \u00100\u001a\b\u0012\u0004\u0012\u00020.0*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u0010,\u001a\u0004\b1\u0010-R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020.0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010)R \u00103\u001a\b\u0012\u0004\u0012\u00020.0*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u0010,\u001a\u0004\b4\u0010-¨\u00066"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/viewmodel/headturn/HeadTurnGuidanceViewModelImpl;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/viewmodel/headturn/HeadTurnGuidanceViewModel;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/OnfidoAnalytics;", "analytics", "Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;", "schedulersProvider", "<init>", "(Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/OnfidoAnalytics;Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;)V", "Lcom/onfido/android/sdk/capture/component/active/video/capture/analytics/AvcAnalyticsCaptureStatus;", "status", "", "trackCaptureStatusAnalyticsEvent", "(Lcom/onfido/android/sdk/capture/component/active/video/capture/analytics/AvcAnalyticsCaptureStatus;)V", "", "faceAngle", "handleLeftSideTurn", "(F)V", "handleRightSideTurn", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/viewmodel/headturn/HeadTurnGuidanceViewModel$ViewState;", "getViewState", "()Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/viewmodel/headturn/HeadTurnGuidanceViewModel$ViewState;", "", "isLeftTrackCompleted", "()Z", "isRightTrackCompleted", "rotation", "getHeadTurnProgress", "(F)F", "trackScreenEvent", "()V", "handleFaceRotation", "startHeadTurnTimer", "reset", "onViewDetached", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/OnfidoAnalytics;", "Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "headTurnTimerDisposable", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "Lio/reactivex/rxjava3/subjects/BehaviorSubject;", "viewStateSubject", "Lio/reactivex/rxjava3/subjects/BehaviorSubject;", "Lio/reactivex/rxjava3/core/Observable;", "viewState", "Lio/reactivex/rxjava3/core/Observable;", "()Lio/reactivex/rxjava3/core/Observable;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/viewmodel/headturn/HeadTurnGuidanceViewModel$TrackState;", "leftTrackStateSubject", "leftTrackState", "getLeftTrackState", "rightTrackStateSubject", "rightTrackState", "getRightTrackState", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class HeadTurnGuidanceViewModelImpl implements HeadTurnGuidanceViewModel {
    public static final float MAX_FACE_ANGLE = 25.0f;
    public static final long MAX_HEAD_TURN_TIME_MILLISECONDS = 5000;
    public static final float MIN_FACE_ANGLE = 5.0f;

    @NotNull
    private final OnfidoAnalytics analytics;

    @NotNull
    private final CompositeDisposable headTurnTimerDisposable;

    @NotNull
    private final Observable leftTrackState;

    @NotNull
    private final BehaviorSubject leftTrackStateSubject;

    @NotNull
    private final Observable rightTrackState;

    @NotNull
    private final BehaviorSubject rightTrackStateSubject;

    @NotNull
    private final SchedulersProvider schedulersProvider;

    @NotNull
    private final Observable viewState;

    @NotNull
    private final BehaviorSubject viewStateSubject;

    public HeadTurnGuidanceViewModelImpl(@NotNull OnfidoAnalytics analytics, @NotNull SchedulersProvider schedulersProvider) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(schedulersProvider, "schedulersProvider");
        this.analytics = analytics;
        this.schedulersProvider = schedulersProvider;
        this.headTurnTimerDisposable = new CompositeDisposable();
        BehaviorSubject behaviorSubjectD = BehaviorSubject.d(new HeadTurnGuidanceViewModel.ViewState(false, false));
        Intrinsics.checkNotNullExpressionValue(behaviorSubjectD, "createDefault(...)");
        this.viewStateSubject = behaviorSubjectD;
        Observable observableShare = behaviorSubjectD.hide().distinctUntilChanged().doOnNext(new g() { // from class: com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.headturn.HeadTurnGuidanceViewModelImpl$viewState$1
            @Override // igm.g
            public final void accept(HeadTurnGuidanceViewModel.ViewState viewState) {
                HeadTurnGuidanceViewModelImpl headTurnGuidanceViewModelImpl;
                AvcAnalyticsCaptureStatus avcAnalyticsCaptureStatus;
                if (viewState.getShowHeadTurnAnim()) {
                    headTurnGuidanceViewModelImpl = this.this$0;
                    avcAnalyticsCaptureStatus = AvcAnalyticsCaptureStatus.ANIMATION_DISPLAYED;
                } else {
                    if (!viewState.isCompleted()) {
                        return;
                    }
                    headTurnGuidanceViewModelImpl = this.this$0;
                    avcAnalyticsCaptureStatus = AvcAnalyticsCaptureStatus.HEADTURN_COMPLETED;
                }
                headTurnGuidanceViewModelImpl.trackCaptureStatusAnalyticsEvent(avcAnalyticsCaptureStatus);
            }
        }).share();
        Intrinsics.checkNotNullExpressionValue(observableShare, "share(...)");
        this.viewState = observableShare;
        HeadTurnGuidanceViewModel.TrackState.Reset reset = HeadTurnGuidanceViewModel.TrackState.Reset.INSTANCE;
        BehaviorSubject behaviorSubjectD2 = BehaviorSubject.d(reset);
        Intrinsics.checkNotNullExpressionValue(behaviorSubjectD2, "createDefault(...)");
        this.leftTrackStateSubject = behaviorSubjectD2;
        Observable observableDistinctUntilChanged = behaviorSubjectD2.hide().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        this.leftTrackState = observableDistinctUntilChanged;
        BehaviorSubject behaviorSubjectD3 = BehaviorSubject.d(reset);
        Intrinsics.checkNotNullExpressionValue(behaviorSubjectD3, "createDefault(...)");
        this.rightTrackStateSubject = behaviorSubjectD3;
        Observable observableDistinctUntilChanged2 = behaviorSubjectD3.hide().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        this.rightTrackState = observableDistinctUntilChanged2;
    }

    private final float getHeadTurnProgress(float rotation) {
        return rotation < 5.0f ? BitmapDescriptorFactory.HUE_RED : (rotation - 5.0f) / 20.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HeadTurnGuidanceViewModel.ViewState getViewState() {
        Object objE = this.viewStateSubject.e();
        Intrinsics.h(objE);
        return (HeadTurnGuidanceViewModel.ViewState) objE;
    }

    private final void handleLeftSideTurn(float faceAngle) {
        if (!isLeftTrackCompleted()) {
            if (faceAngle >= 25.0f) {
                this.viewStateSubject.onNext(HeadTurnGuidanceViewModel.ViewState.copy$default(getViewState(), false, false, 1, null));
                this.leftTrackStateSubject.onNext(HeadTurnGuidanceViewModel.TrackState.Completed.INSTANCE);
            } else {
                this.leftTrackStateSubject.onNext(new HeadTurnGuidanceViewModel.TrackState.ProgressUpdated(getHeadTurnProgress(faceAngle)));
            }
        }
        if (isRightTrackCompleted()) {
            return;
        }
        this.rightTrackStateSubject.onNext(HeadTurnGuidanceViewModel.TrackState.Reset.INSTANCE);
    }

    private final void handleRightSideTurn(float faceAngle) {
        if (!isRightTrackCompleted()) {
            if (faceAngle >= 25.0f) {
                this.viewStateSubject.onNext(HeadTurnGuidanceViewModel.ViewState.copy$default(getViewState(), false, false, 1, null));
                this.rightTrackStateSubject.onNext(HeadTurnGuidanceViewModel.TrackState.Completed.INSTANCE);
            } else {
                this.rightTrackStateSubject.onNext(new HeadTurnGuidanceViewModel.TrackState.ProgressUpdated(getHeadTurnProgress(faceAngle)));
            }
        }
        if (isLeftTrackCompleted()) {
            return;
        }
        this.leftTrackStateSubject.onNext(HeadTurnGuidanceViewModel.TrackState.Reset.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isLeftTrackCompleted() {
        return this.leftTrackStateSubject.e() instanceof HeadTurnGuidanceViewModel.TrackState.Completed;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isRightTrackCompleted() {
        return this.rightTrackStateSubject.e() instanceof HeadTurnGuidanceViewModel.TrackState.Completed;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackCaptureStatusAnalyticsEvent(AvcAnalyticsCaptureStatus status) {
        this.analytics.track(new AvcAnalyticsEvent.FaceCaptureStatus(status.getValue()));
    }

    @Override // com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.headturn.HeadTurnGuidanceViewModel
    @NotNull
    public Observable getLeftTrackState() {
        return this.leftTrackState;
    }

    @Override // com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.headturn.HeadTurnGuidanceViewModel
    @NotNull
    public Observable getRightTrackState() {
        return this.rightTrackState;
    }

    @Override // com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.headturn.HeadTurnGuidanceViewModel
    public void handleFaceRotation(float faceAngle) {
        if (isLeftTrackCompleted() && isRightTrackCompleted()) {
            this.viewStateSubject.onNext(new HeadTurnGuidanceViewModel.ViewState(true, false));
        } else if (faceAngle < BitmapDescriptorFactory.HUE_RED) {
            handleLeftSideTurn(Math.abs(faceAngle));
        } else {
            handleRightSideTurn(faceAngle);
        }
    }

    @Override // com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.headturn.HeadTurnGuidanceViewModel
    public void onViewDetached() {
        this.headTurnTimerDisposable.d();
    }

    @Override // com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.headturn.HeadTurnGuidanceViewModel
    public void reset() {
        this.headTurnTimerDisposable.d();
        this.viewStateSubject.onNext(new HeadTurnGuidanceViewModel.ViewState(false, false));
        BehaviorSubject behaviorSubject = this.leftTrackStateSubject;
        HeadTurnGuidanceViewModel.TrackState.Reset reset = HeadTurnGuidanceViewModel.TrackState.Reset.INSTANCE;
        behaviorSubject.onNext(reset);
        this.rightTrackStateSubject.onNext(reset);
    }

    @Override // com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.headturn.HeadTurnGuidanceViewModel
    public void startHeadTurnTimer() {
        this.headTurnTimerDisposable.d();
        CompositeDisposable compositeDisposable = this.headTurnTimerDisposable;
        Disposable disposableSubscribe = Observable.timer(5000L, TimeUnit.MILLISECONDS, this.schedulersProvider.getTimer()).observeOn(this.schedulersProvider.getUi()).subscribe(new g() { // from class: com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.headturn.HeadTurnGuidanceViewModelImpl.startHeadTurnTimer.1
            public final void accept(long j2) {
                if (HeadTurnGuidanceViewModelImpl.this.isLeftTrackCompleted() && HeadTurnGuidanceViewModelImpl.this.isRightTrackCompleted()) {
                    return;
                }
                HeadTurnGuidanceViewModelImpl.this.viewStateSubject.onNext(HeadTurnGuidanceViewModel.ViewState.copy$default(HeadTurnGuidanceViewModelImpl.this.getViewState(), false, true, 1, null));
            }

            @Override // igm.g
            public /* bridge */ /* synthetic */ void accept(Object obj2) {
                accept(((Number) obj2).longValue());
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        RxExtensionsKt.plusAssign(compositeDisposable, disposableSubscribe);
    }

    @Override // com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.headturn.HeadTurnGuidanceViewModel
    public void trackScreenEvent() {
        this.analytics.track(AvcAnalyticsEvent.FaceCapture.INSTANCE);
    }

    @Override // com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.headturn.HeadTurnGuidanceViewModel
    @NotNull
    public Observable getViewState() {
        return this.viewState;
    }
}
