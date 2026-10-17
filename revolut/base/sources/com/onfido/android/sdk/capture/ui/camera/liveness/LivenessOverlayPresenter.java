package com.onfido.android.sdk.capture.ui.camera.liveness;

import bhm.e;
import cmc.d;
import com.onfido.android.sdk.capture.detector.face.FaceDetectionResult;
import com.onfido.android.sdk.capture.detector.face.FaceDetector;
import com.onfido.android.sdk.capture.internal.service.AnnouncementService;
import com.onfido.android.sdk.capture.internal.service.VibratorService;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.android.sdk.capture.internal.util.logging.Timber;
import com.onfido.android.sdk.capture.ui.camera.liveness.LivenessOverlayPresenter;
import com.onfido.android.sdk.capture.ui.camera.liveness.challenges.MovementType;
import com.onfido.android.sdk.capture.ui.camera.liveness.turn.LivenessProgressManager;
import com.onfido.android.sdk.capture.utils.RxExtensionsKt;
import igm.g;
import igm.o;
import igm.p;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableTransformer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import ogm.c;
import org.jetbrains.annotations.NotNull;
import org.reactivestreams.Publisher;
import pgm.b;
import pgm.b0;
import pgm.d1;
import pgm.i0;
import pgm.m;
import pgm.q;
import pgm.q0;
import pgm.s0;
import pgm.t;
import pgm.x;
import pgm.y;
import ygm.f;
import yhm.j;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u0000  2\u00020\u0001:\u0002 !B/\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u0016J,\u0010\u001b\u001a&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d0\u001cH\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/liveness/LivenessOverlayPresenter;", "", "faceDetector", "Lcom/onfido/android/sdk/capture/detector/face/FaceDetector;", "livenessProgressManager", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/turn/LivenessProgressManager;", "schedulersProvider", "Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;", "vibratorService", "Lcom/onfido/android/sdk/capture/internal/service/VibratorService;", "announcementService", "Lcom/onfido/android/sdk/capture/internal/service/AnnouncementService;", "(Lcom/onfido/android/sdk/capture/detector/face/FaceDetector;Lcom/onfido/android/sdk/capture/ui/camera/liveness/turn/LivenessProgressManager;Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;Lcom/onfido/android/sdk/capture/internal/service/VibratorService;Lcom/onfido/android/sdk/capture/internal/service/AnnouncementService;)V", "compositeSubscription", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "getCompositeSubscription", "()Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "compositeSubscription$delegate", "Lkotlin/Lazy;", "view", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/LivenessOverlayPresenter$View;", "attachView", "", "startFaceTracker", "movementType", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/MovementType;", "stop", "vibrateWhenProgressIsDone", "Lio/reactivex/rxjava3/core/FlowableTransformer;", "Lkotlin/Pair;", "", "", "Companion", "View", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LivenessOverlayPresenter {
    public static final int FACE_TRACKING_SEQUENTIAL_OBSERVATIONS = 2;
    public static final long MAX_AMOUNT_NEGATIVE_FEEDBACKS = 2;
    public static final float MIN_NEGATIVE_PROGRESS_PERCENTAGE_FOR_NOTIFICATION = -0.4f;
    public static final long MIN_TIME_DIFFERENCE_BETWEEN_NEGATIVE_FEEDBACKS_MS = 2000;

    @NotNull
    private final AnnouncementService announcementService;

    /* JADX INFO: renamed from: compositeSubscription$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy compositeSubscription;

    @NotNull
    private final FaceDetector faceDetector;

    @NotNull
    private final LivenessProgressManager livenessProgressManager;

    @NotNull
    private final SchedulersProvider schedulersProvider;

    @NotNull
    private final VibratorService vibratorService;
    private View view;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0007H&J\b\u0010\t\u001a\u00020\u0007H&J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u0007H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u000e"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/liveness/LivenessOverlayPresenter$View;", "", "headTurnDetectedString", "", "getHeadTurnDetectedString", "()Ljava/lang/String;", "onErrorObservingHeadTurnResults", "", "onFullProgressReached", "onHalfOfProgressReached", "onProgress", "progress", "", "onWrongHeadTurn", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface View {
        @NotNull
        String getHeadTurnDetectedString();

        void onErrorObservingHeadTurnResults();

        void onFullProgressReached();

        void onHalfOfProgressReached();

        void onProgress(float progress);

        void onWrongHeadTurn();
    }

    public LivenessOverlayPresenter(@NotNull FaceDetector faceDetector, @NotNull LivenessProgressManager livenessProgressManager, @NotNull SchedulersProvider schedulersProvider, @NotNull VibratorService vibratorService, @NotNull AnnouncementService announcementService) {
        Intrinsics.checkNotNullParameter(faceDetector, "faceDetector");
        Intrinsics.checkNotNullParameter(livenessProgressManager, "livenessProgressManager");
        Intrinsics.checkNotNullParameter(schedulersProvider, "schedulersProvider");
        Intrinsics.checkNotNullParameter(vibratorService, "vibratorService");
        Intrinsics.checkNotNullParameter(announcementService, "announcementService");
        this.faceDetector = faceDetector;
        this.livenessProgressManager = livenessProgressManager;
        this.schedulersProvider = schedulersProvider;
        this.vibratorService = vibratorService;
        this.announcementService = announcementService;
        this.compositeSubscription = j.b(LivenessOverlayPresenter$compositeSubscription$2.INSTANCE);
    }

    private final CompositeDisposable getCompositeSubscription() {
        return (CompositeDisposable) this.compositeSubscription.getValue();
    }

    private final FlowableTransformer vibrateWhenProgressIsDone() {
        return new d(this, 24);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Publisher vibrateWhenProgressIsDone$lambda$0(final LivenessOverlayPresenter this$0, Flowable upstream) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        upstream.getClass();
        b0 b0VarB = new q(upstream).b(new p() { // from class: com.onfido.android.sdk.capture.ui.camera.liveness.LivenessOverlayPresenter$vibrateWhenProgressIsDone$1$1
            @Override // igm.p
            public final boolean test(@NotNull Pair<Float, Boolean> pair) {
                Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
                return ((Number) pair.f186385a).floatValue() == 1.0f && !((Boolean) pair.f186386b).booleanValue();
            }
        });
        o oVar = new o() { // from class: com.onfido.android.sdk.capture.ui.camera.liveness.LivenessOverlayPresenter$vibrateWhenProgressIsDone$1$2
            @Override // igm.o
            @NotNull
            public final CompletableSource apply(@NotNull Pair<Float, Boolean> it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
                Completable completableVibrateForSuccess = this.this$0.vibratorService.vibrateForSuccess();
                AnnouncementService announcementService = this.this$0.announcementService;
                LivenessOverlayPresenter.View view = this.this$0.view;
                if (view == null) {
                    Intrinsics.r("view");
                    throw null;
                }
                Completable completableAnnounceString$default = AnnouncementService.announceString$default(announcementService, new String[]{view.getHeadTurnDetectedString()}, false, 2, (Object) null);
                completableVibrateForSuccess.getClass();
                Objects.requireNonNull(completableAnnounceString$default, "other is null");
                return new c(new CompletableSource[]{completableVibrateForSuccess, completableAnnounceString$default}, 1);
            }
        };
        kgm.j.a(Integer.MAX_VALUE, "maxConcurrency");
        return new b(new i0(b0VarB, oVar), upstream, 2);
    }

    public final void attachView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void startFaceTracker(@NotNull final MovementType movementType) {
        Flowable jVar;
        Flowable qVar;
        Intrinsics.checkNotNullParameter(movementType, "movementType");
        s0 s0VarG = this.faceDetector.getFaceTrackingObservable().g(FaceDetectionResult.FaceDetected.class);
        Intrinsics.checkNotNullExpressionValue(s0VarG, "ofType(...)");
        o oVar = new o() { // from class: com.onfido.android.sdk.capture.ui.camera.liveness.LivenessOverlayPresenter$startFaceTracker$faceTrackingProgressConnectableObservable$1
            @Override // igm.o
            @NotNull
            public final Publisher apply(@NotNull FaceDetectionResult.FaceDetected faceDetectionData) {
                Intrinsics.checkNotNullParameter(faceDetectionData, "faceDetectionData");
                Pair pair = new Pair(Float.valueOf(this.this$0.livenessProgressManager.angleToProgress(faceDetectionData.getFaceAngle(), movementType)), Boolean.valueOf(this.this$0.livenessProgressManager.getIsFirstMovementHalf()));
                int i = Flowable.f163113a;
                return new q0(pair);
            }
        };
        int i = 2;
        kgm.j.a(2, "prefetch");
        int i2 = 1;
        if (s0VarG instanceof e) {
            Object obj2 = ((e) s0VarG).get();
            jVar = obj2 == null ? y.f236178b : new b(obj2, oVar, 1);
        } else {
            jVar = new pgm.j(s0VarG, oVar, f.IMMEDIATE);
        }
        int i3 = Flowable.f163113a;
        kgm.j.a(i3, "bufferSize");
        b bVar = new b(new d1(jVar, i3));
        Intrinsics.checkNotNullExpressionValue(bVar, "autoConnect(...)");
        CompositeDisposable compositeSubscription = getCompositeSubscription();
        t tVar = new t(bVar, new g() { // from class: com.onfido.android.sdk.capture.ui.camera.liveness.LivenessOverlayPresenter.startFaceTracker.1
            @Override // igm.g
            public final void accept(@NotNull Pair<Float, Boolean> pair) {
                Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
                LivenessOverlayPresenter.this.livenessProgressManager.updateStateIfNeeded(((Number) pair.f186385a).floatValue());
            }
        });
        FlowableTransformer flowableTransformerVibrateWhenProgressIsDone = vibrateWhenProgressIsDone();
        Objects.requireNonNull(flowableTransformerVibrateWhenProgressIsDone, "composer is null");
        Publisher publisherA = flowableTransformerVibrateWhenProgressIsDone.a(bVar);
        if (publisherA instanceof Flowable) {
            qVar = (Flowable) publisherA;
        } else {
            Objects.requireNonNull(publisherA, "publisher is null");
            qVar = new ogm.q(publisherA, 4);
        }
        int i5 = 0;
        Disposable disposableI = new ogm.q(new Publisher[]{tVar, qVar}, i).c(kgm.j.f184025a, 2, i3).l(this.schedulersProvider.getIo()).f(this.schedulersProvider.getUi()).i(new g() { // from class: com.onfido.android.sdk.capture.ui.camera.liveness.LivenessOverlayPresenter.startFaceTracker.2
            @Override // igm.g
            public final void accept(@NotNull Pair<Float, Boolean> pair) {
                Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
                float fFloatValue = ((Number) pair.f186385a).floatValue();
                boolean zBooleanValue = ((Boolean) pair.f186386b).booleanValue();
                if (fFloatValue != 1.0f) {
                    View view = LivenessOverlayPresenter.this.view;
                    if (view != null) {
                        view.onProgress(fFloatValue);
                        return;
                    } else {
                        Intrinsics.r("view");
                        throw null;
                    }
                }
                if (zBooleanValue) {
                    View view2 = LivenessOverlayPresenter.this.view;
                    if (view2 != null) {
                        view2.onHalfOfProgressReached();
                        return;
                    } else {
                        Intrinsics.r("view");
                        throw null;
                    }
                }
                View view3 = LivenessOverlayPresenter.this.view;
                if (view3 != null) {
                    view3.onFullProgressReached();
                } else {
                    Intrinsics.r("view");
                    throw null;
                }
            }
        }, new g() { // from class: com.onfido.android.sdk.capture.ui.camera.liveness.LivenessOverlayPresenter.startFaceTracker.3
            @Override // igm.g
            public final void accept(@NotNull Throwable it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
                Timber.INSTANCE.e(LivenessOverlayPresenter.this.getClass().getName(), a10.b.u(new StringBuilder("Error on observing the face angle results: "), it8));
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableI, "subscribe(...)");
        RxExtensionsKt.plusAssign(compositeSubscription, disposableI);
        CompositeDisposable compositeSubscription2 = getCompositeSubscription();
        o oVar2 = new o() { // from class: com.onfido.android.sdk.capture.ui.camera.liveness.LivenessOverlayPresenter.startFaceTracker.4
            @Override // igm.o
            @NotNull
            public final Boolean apply(@NotNull Pair<Float, Boolean> pair) {
                Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
                return Boolean.valueOf(((Number) pair.f186385a).floatValue() < -0.4f);
            }
        };
        Objects.requireNonNull(oVar2, "mapper is null");
        s0 s0Var = new s0(bVar, oVar2, i5);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Scheduler timer = this.schedulersProvider.getTimer();
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(timer, "scheduler is null");
        Disposable disposableI2 = new q(new m(s0Var, timer)).b(new p() { // from class: com.onfido.android.sdk.capture.ui.camera.liveness.LivenessOverlayPresenter.startFaceTracker.5
            public final boolean test(boolean z) {
                return z;
            }

            @Override // igm.p
            public /* bridge */ /* synthetic */ boolean test(Object obj3) {
                return test(((Boolean) obj3).booleanValue());
            }
        }).m(2L).l(this.schedulersProvider.getComputation()).f(this.schedulersProvider.getUi()).c(new o() { // from class: com.onfido.android.sdk.capture.ui.camera.liveness.LivenessOverlayPresenter.startFaceTracker.6
            @Override // igm.o
            public /* bridge */ /* synthetic */ Object apply(Object obj3) {
                return apply(((Boolean) obj3).booleanValue());
            }

            @NotNull
            public final Publisher apply(boolean z) {
                Completable completableVibrateForError = LivenessOverlayPresenter.this.vibratorService.vibrateForError();
                Boolean boolValueOf = Boolean.valueOf(z);
                int i6 = Flowable.f163113a;
                q0 q0Var = new q0(boolValueOf);
                completableVibrateForError.getClass();
                return new b(completableVibrateForError, q0Var, 2);
            }
        }, i3, i3).i(new g() { // from class: com.onfido.android.sdk.capture.ui.camera.liveness.LivenessOverlayPresenter.startFaceTracker.7
            @Override // igm.g
            public /* bridge */ /* synthetic */ void accept(Object obj3) {
                accept(((Boolean) obj3).booleanValue());
            }

            public final void accept(boolean z) {
                View view = LivenessOverlayPresenter.this.view;
                if (view != null) {
                    view.onWrongHeadTurn();
                } else {
                    Intrinsics.r("view");
                    throw null;
                }
            }
        }, new g() { // from class: com.onfido.android.sdk.capture.ui.camera.liveness.LivenessOverlayPresenter.startFaceTracker.8
            @Override // igm.g
            public final void accept(@NotNull Throwable it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
                Timber.INSTANCE.e(LivenessOverlayPresenter.this.getClass().getName(), a10.b.u(new StringBuilder("Error on observing the wrong face turn notifications: "), it8));
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableI2, "subscribe(...)");
        RxExtensionsKt.plusAssign(compositeSubscription2, disposableI2);
        CompositeDisposable compositeSubscription3 = getCompositeSubscription();
        s0 s0VarG2 = this.faceDetector.getFaceTrackingObservable().g(FaceDetectionResult.Error.class);
        Intrinsics.checkNotNullExpressionValue(s0VarG2, "ofType(...)");
        x xVar = new x(s0VarG2);
        Scheduler io2 = this.schedulersProvider.getIo();
        Objects.requireNonNull(io2, "scheduler is null");
        qgm.j jVar2 = new qgm.j(xVar, io2, i2);
        Scheduler ui = this.schedulersProvider.getUi();
        Objects.requireNonNull(ui, "scheduler is null");
        Disposable disposableD = new qgm.j(jVar2, ui, i5).d(new g() { // from class: com.onfido.android.sdk.capture.ui.camera.liveness.LivenessOverlayPresenter.startFaceTracker.9
            @Override // igm.g
            public final void accept(FaceDetectionResult.Error error) {
                View view = LivenessOverlayPresenter.this.view;
                if (view != null) {
                    view.onErrorObservingHeadTurnResults();
                } else {
                    Intrinsics.r("view");
                    throw null;
                }
            }
        }, new g() { // from class: com.onfido.android.sdk.capture.ui.camera.liveness.LivenessOverlayPresenter.startFaceTracker.10
            @Override // igm.g
            public final void accept(@NotNull Throwable it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
                Timber.INSTANCE.e(LivenessOverlayPresenter.this.getClass().getName(), a10.b.u(new StringBuilder("Error on observing the face tracking errors: "), it8));
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableD, "subscribe(...)");
        RxExtensionsKt.plusAssign(compositeSubscription3, disposableD);
    }

    public final void stop() {
        getCompositeSubscription().d();
    }
}
