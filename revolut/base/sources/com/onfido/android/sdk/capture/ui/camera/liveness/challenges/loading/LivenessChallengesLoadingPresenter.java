package com.onfido.android.sdk.capture.ui.camera.liveness.challenges.loading;

import com.onfido.android.sdk.capture.internal.service.AnnouncementService;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.android.sdk.capture.ui.camera.liveness.challenges.LivenessChallengesRepository;
import com.onfido.android.sdk.capture.ui.camera.liveness.challenges.LivenessChallengesViewModel;
import com.onfido.android.sdk.capture.ui.camera.liveness.challenges.loading.LivenessChallengesLoadingView;
import com.onfido.android.sdk.capture.utils.RxExtensionsKt;
import com.onfido.api.client.exception.TokenExpiredException;
import igm.g;
import igm.o;
import igm.p;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tgm.h;
import zhm.d0;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 '2\u00020\u0001:\u0002'(B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J'\u0010\u0014\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00120\u00120\r*\b\u0012\u0004\u0012\u00020\u00120\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010\fJ\r\u0010\u001f\u001a\u00020\n¢\u0006\u0004\b\u001f\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010&¨\u0006)"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/loading/LivenessChallengesLoadingPresenter;", "", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/LivenessChallengesRepository;", "repository", "Lcom/onfido/android/sdk/capture/internal/service/AnnouncementService;", "announcementService", "Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;", "schedulersProvider", "<init>", "(Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/LivenessChallengesRepository;Lcom/onfido/android/sdk/capture/internal/service/AnnouncementService;Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;)V", "", "fetchFromApi", "()V", "Lio/reactivex/rxjava3/core/Observable;", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/LivenessChallengesViewModel;", "minimumExecutionTimerObservable", "()Lio/reactivex/rxjava3/core/Observable;", "fetchChallengeObservable", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/loading/LivenessChallengesLoadingView$ScreenState;", "kotlin.jvm.PlatformType", "announceWhenLoading", "(Lio/reactivex/rxjava3/core/Observable;)Lio/reactivex/rxjava3/core/Observable;", "", "throwable", "handleError", "(Ljava/lang/Throwable;)V", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/loading/LivenessChallengesLoadingPresenter$View;", "view", "attachView", "(Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/loading/LivenessChallengesLoadingPresenter$View;)V", "fetchChallenges", "stop", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/LivenessChallengesRepository;", "Lcom/onfido/android/sdk/capture/internal/service/AnnouncementService;", "Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "compositeDisposable", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/loading/LivenessChallengesLoadingPresenter$View;", "Companion", "View", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LivenessChallengesLoadingPresenter {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final long LIVENESS_CHALLENGES_FETCH_TIMEOUT_MS = 5000;
    private static final long MINIMUM_EXECUTION_TIME_MS = 1000;

    @NotNull
    private final AnnouncementService announcementService;

    @NotNull
    private final CompositeDisposable compositeDisposable;

    @NotNull
    private final LivenessChallengesRepository repository;

    @NotNull
    private final SchedulersProvider schedulersProvider;
    private View view;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/loading/LivenessChallengesLoadingPresenter$Companion;", "", "()V", "LIVENESS_CHALLENGES_FETCH_TIMEOUT_MS", "", "MINIMUM_EXECUTION_TIME_MS", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0007H&J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\r"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/loading/LivenessChallengesLoadingPresenter$View;", "", "loadingAnnouncement", "", "getLoadingAnnouncement", "()Ljava/lang/String;", "onInvalidCertificate", "", "message", "onTokenExpired", "setScreenState", "state", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/loading/LivenessChallengesLoadingView$ScreenState;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface View {
        @NotNull
        String getLoadingAnnouncement();

        void onInvalidCertificate(@NotNull String message);

        void onTokenExpired();

        void setScreenState(@NotNull LivenessChallengesLoadingView.ScreenState state);
    }

    public LivenessChallengesLoadingPresenter(@NotNull LivenessChallengesRepository repository, @NotNull AnnouncementService announcementService, @NotNull SchedulersProvider schedulersProvider) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(announcementService, "announcementService");
        Intrinsics.checkNotNullParameter(schedulersProvider, "schedulersProvider");
        this.repository = repository;
        this.announcementService = announcementService;
        this.schedulersProvider = schedulersProvider;
        this.compositeDisposable = new CompositeDisposable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Observable announceWhenLoading(Observable observable) {
        Observable observableCast = observable.filter(new p() { // from class: com.onfido.android.sdk.capture.ui.camera.liveness.challenges.loading.LivenessChallengesLoadingPresenter$announceWhenLoading$$inlined$filterIsInstance$1
            @Override // igm.p
            public final boolean test(@NotNull Object it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8 instanceof LivenessChallengesLoadingView.ScreenState.Loading;
            }
        }).cast(LivenessChallengesLoadingView.ScreenState.Loading.class);
        Intrinsics.checkNotNullExpressionValue(observableCast, "cast(...)");
        Observable observableK = observableCast.switchMapCompletable(new o() { // from class: com.onfido.android.sdk.capture.ui.camera.liveness.challenges.loading.LivenessChallengesLoadingPresenter.announceWhenLoading.1
            @Override // igm.o
            @NotNull
            public final CompletableSource apply(@NotNull LivenessChallengesLoadingView.ScreenState.Loading it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
                AnnouncementService announcementService = LivenessChallengesLoadingPresenter.this.announcementService;
                View view = LivenessChallengesLoadingPresenter.this.view;
                if (view != null) {
                    return AnnouncementService.announceString$default(announcementService, new String[]{view.getLoadingAnnouncement()}, false, 2, (Object) null);
                }
                Intrinsics.r("view");
                throw null;
            }
        }).k();
        Intrinsics.checkNotNullExpressionValue(observableK, "toObservable(...)");
        return observableK;
    }

    private final Observable fetchChallengeObservable() {
        Single<LivenessChallengesViewModel> single = this.repository.get();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Scheduler timer = this.schedulersProvider.getTimer();
        single.getClass();
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(timer, "scheduler is null");
        Observable observableL = new h(single, timer).l();
        Intrinsics.checkNotNullExpressionValue(observableL, "toObservable(...)");
        return observableL;
    }

    private final void fetchFromApi() {
        CompositeDisposable compositeDisposable = this.compositeDisposable;
        Observable map = Observable.concatArrayEagerDelayError(minimumExecutionTimerObservable(), fetchChallengeObservable()).map(new o() { // from class: com.onfido.android.sdk.capture.ui.camera.liveness.challenges.loading.LivenessChallengesLoadingPresenter.fetchFromApi.1
            @Override // igm.o
            @NotNull
            public final LivenessChallengesLoadingView.ScreenState.Success apply(@NotNull LivenessChallengesViewModel p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return new LivenessChallengesLoadingView.ScreenState.Success(p0);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableCast = map.cast(LivenessChallengesLoadingView.ScreenState.class);
        Intrinsics.checkNotNullExpressionValue(observableCast, "cast(...)");
        Observable observablePublish = observableCast.startWithItem(LivenessChallengesLoadingView.ScreenState.Loading.INSTANCE).subscribeOn(this.schedulersProvider.getIo()).observeOn(this.schedulersProvider.getUi()).publish(new o() { // from class: com.onfido.android.sdk.capture.ui.camera.liveness.challenges.loading.LivenessChallengesLoadingPresenter.fetchFromApi.2
            @Override // igm.o
            @NotNull
            public final ObservableSource apply(@NotNull Observable shared) {
                Intrinsics.checkNotNullParameter(shared, "shared");
                return Observable.mergeDelayError(shared, LivenessChallengesLoadingPresenter.this.announceWhenLoading(shared));
            }
        });
        final View view = this.view;
        if (view == null) {
            Intrinsics.r("view");
            throw null;
        }
        Disposable disposableSubscribe = observablePublish.subscribe(new g() { // from class: com.onfido.android.sdk.capture.ui.camera.liveness.challenges.loading.LivenessChallengesLoadingPresenter.fetchFromApi.3
            @Override // igm.g
            public final void accept(@NotNull LivenessChallengesLoadingView.ScreenState p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                view.setScreenState(p0);
            }
        }, new g() { // from class: com.onfido.android.sdk.capture.ui.camera.liveness.challenges.loading.LivenessChallengesLoadingPresenter.fetchFromApi.4
            @Override // igm.g
            public final void accept(@NotNull Throwable throwable) {
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                if (throwable instanceof CompositeException) {
                    List list = ((CompositeException) throwable).f163118a;
                    Intrinsics.checkNotNullExpressionValue(list, "getExceptions(...)");
                    throwable = (Throwable) d0.d0(list);
                    if (throwable == null) {
                        return;
                    }
                }
                LivenessChallengesLoadingPresenter.this.handleError(throwable);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        RxExtensionsKt.plusAssign(compositeDisposable, disposableSubscribe);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleError(Throwable throwable) {
        if (throwable instanceof TokenExpiredException) {
            View view = this.view;
            if (view != null) {
                view.onTokenExpired();
                return;
            } else {
                Intrinsics.r("view");
                throw null;
            }
        }
        if (!(throwable instanceof SSLPeerUnverifiedException)) {
            View view2 = this.view;
            if (view2 != null) {
                view2.setScreenState(LivenessChallengesLoadingView.ScreenState.Error.INSTANCE);
                return;
            } else {
                Intrinsics.r("view");
                throw null;
            }
        }
        View view3 = this.view;
        if (view3 == null) {
            Intrinsics.r("view");
            throw null;
        }
        String localizedMessage = ((SSLPeerUnverifiedException) throwable).getLocalizedMessage();
        Intrinsics.checkNotNullExpressionValue(localizedMessage, "getLocalizedMessage(...)");
        view3.onInvalidCertificate(localizedMessage);
    }

    private final Observable minimumExecutionTimerObservable() {
        Observable observableK = Observable.timer(1000L, TimeUnit.MILLISECONDS, this.schedulersProvider.getTimer()).ignoreElements().k();
        Intrinsics.checkNotNullExpressionValue(observableK, "toObservable(...)");
        return observableK;
    }

    public final void attachView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
    }

    public final void fetchChallenges() {
        View view = this.view;
        if (view == null) {
            Intrinsics.r("view");
            throw null;
        }
        view.setScreenState(LivenessChallengesLoadingView.ScreenState.Loading.INSTANCE);
        fetchFromApi();
    }

    public final void stop() {
        this.compositeDisposable.d();
    }
}
