package com.onfido.android.sdk.capture.ui.camera.liveness;

import a10.b;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.LivenessTracker;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.android.sdk.capture.internal.util.logging.Timber;
import com.onfido.android.sdk.capture.ui.CaptureType;
import com.onfido.android.sdk.capture.ui.camera.liveness.intro.LivenessIntroVideoRepository;
import com.onfido.android.sdk.capture.ui.camera.liveness.intro.error.LivenessIntroVideoErrorType;
import com.onfido.android.sdk.capture.ui.camera.liveness.intro.error.LivenessIntroVideoIndexEmpty;
import com.onfido.android.sdk.capture.utils.RxExtensionsKt;
import igm.g;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.io.File;
import java.net.SocketTimeoutException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0014B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0002J\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\u0010\u001a\u00020\u000eJ\u0006\u0010\u0011\u001a\u00020\u000eJ\u0006\u0010\u0012\u001a\u00020\u000eJ\u0006\u0010\u0013\u001a\u00020\u000eR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/liveness/LivenessIntroPresenter;", "", "livenessTracker", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/LivenessTracker;", "livenessIntroVideoRepository", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/intro/LivenessIntroVideoRepository;", "schedulersProvider", "Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;", "(Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/LivenessTracker;Lcom/onfido/android/sdk/capture/ui/camera/liveness/intro/LivenessIntroVideoRepository;Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;)V", "compositeDisposable", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "view", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/LivenessIntroPresenter$View;", "fetchIntroVideo", "", "onCreateView", "onNextClicked", "onReloadPressed", "onStart", "onStop", "View", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LivenessIntroPresenter {

    @NotNull
    private final CompositeDisposable compositeDisposable;

    @NotNull
    private final LivenessIntroVideoRepository livenessIntroVideoRepository;

    @NotNull
    private final LivenessTracker livenessTracker;

    @NotNull
    private final SchedulersProvider schedulersProvider;
    private View view;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/liveness/LivenessIntroPresenter$View;", "", "onErrorFetchingLivenessIntroVideo", "", "type", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/intro/error/LivenessIntroVideoErrorType;", "onLivenessIntroVideoAvailable", "filePath", "", "setVideoIntroLoading", "isLoading", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface View {
        void onErrorFetchingLivenessIntroVideo(@NotNull LivenessIntroVideoErrorType type);

        void onLivenessIntroVideoAvailable(@NotNull String filePath);

        void setVideoIntroLoading(boolean isLoading);
    }

    public LivenessIntroPresenter(@NotNull LivenessTracker livenessTracker, @NotNull LivenessIntroVideoRepository livenessIntroVideoRepository, @NotNull SchedulersProvider schedulersProvider) {
        Intrinsics.checkNotNullParameter(livenessTracker, "livenessTracker");
        Intrinsics.checkNotNullParameter(livenessIntroVideoRepository, "livenessIntroVideoRepository");
        Intrinsics.checkNotNullParameter(schedulersProvider, "schedulersProvider");
        this.livenessTracker = livenessTracker;
        this.livenessIntroVideoRepository = livenessIntroVideoRepository;
        this.schedulersProvider = schedulersProvider;
        this.compositeDisposable = new CompositeDisposable();
    }

    private final void fetchIntroVideo() {
        View view = this.view;
        if (view == null) {
            Intrinsics.r("view");
            throw null;
        }
        view.setVideoIntroLoading(true);
        CompositeDisposable compositeDisposable = this.compositeDisposable;
        Disposable disposableI = this.livenessIntroVideoRepository.get().k(this.schedulersProvider.getIo()).h(this.schedulersProvider.getUi()).i(new g() { // from class: com.onfido.android.sdk.capture.ui.camera.liveness.LivenessIntroPresenter.fetchIntroVideo.1
            @Override // igm.g
            public final void accept(@NotNull File it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
                View view2 = LivenessIntroPresenter.this.view;
                if (view2 == null) {
                    Intrinsics.r("view");
                    throw null;
                }
                String path = it8.getPath();
                Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
                view2.onLivenessIntroVideoAvailable(path);
            }
        }, new g() { // from class: com.onfido.android.sdk.capture.ui.camera.liveness.LivenessIntroPresenter.fetchIntroVideo.2
            @Override // igm.g
            public final void accept(@NotNull Throwable throwable) {
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                LivenessIntroVideoErrorType livenessIntroVideoErrorType = throwable instanceof SocketTimeoutException ? LivenessIntroVideoErrorType.TIMEOUT : throwable instanceof LivenessIntroVideoIndexEmpty ? LivenessIntroVideoErrorType.NO_VIDEOS_FOUND : LivenessIntroVideoErrorType.NETWORK;
                View view2 = LivenessIntroPresenter.this.view;
                if (view2 == null) {
                    Intrinsics.r("view");
                    throw null;
                }
                view2.setVideoIntroLoading(false);
                View view3 = LivenessIntroPresenter.this.view;
                if (view3 == null) {
                    Intrinsics.r("view");
                    throw null;
                }
                view3.onErrorFetchingLivenessIntroVideo(livenessIntroVideoErrorType);
                Timber.INSTANCE.e(LivenessIntroPresenter.this.getClass().getName(), b.u(new StringBuilder("Error fetching the liveness intro video: "), throwable));
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableI, "subscribe(...)");
        RxExtensionsKt.plusAssign(compositeDisposable, disposableI);
    }

    public final void onCreateView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
    }

    public final void onNextClicked() {
        this.livenessTracker.trackVideoIntroRecordVideoButtonClicked$onfido_capture_sdk_core_release();
    }

    public final void onReloadPressed() {
        fetchIntroVideo();
    }

    public final void onStart() {
        this.livenessTracker.trackFaceIntro$onfido_capture_sdk_core_release(CaptureType.VIDEO);
        fetchIntroVideo();
    }

    public final void onStop() {
        this.compositeDisposable.d();
    }
}
