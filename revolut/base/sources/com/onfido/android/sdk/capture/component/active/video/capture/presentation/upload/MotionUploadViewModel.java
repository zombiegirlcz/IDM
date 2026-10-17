package com.onfido.android.sdk.capture.component.active.video.capture.presentation.upload;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import ch.qos.logback.core.CoreConstants;
import com.onfido.android.sdk.capture.common.result.FailureReason;
import com.onfido.android.sdk.capture.component.active.video.capture.analytics.AvcAnalyticsEvent;
import com.onfido.android.sdk.capture.component.active.video.capture.domain.model.ActiveVideoCaptureResult;
import com.onfido.android.sdk.capture.component.active.video.capture.domain.usecase.UploadActiveVideoCaptureUseCase;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.OnfidoAnalytics;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.WaitingScreenTracker;
import com.onfido.android.sdk.capture.internal.model.UploadedArtifact;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.android.sdk.capture.utils.LoadingFragment;
import com.onfido.android.sdk.capture.utils.RxExtensionsKt;
import igm.g;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.io.File;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001bB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0014\u001a\u00020\u0015H\u0014J\u0016\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/upload/MotionUploadViewModel;", "Landroidx/lifecycle/ViewModel;", "uploadActiveVideoCapture", "Lcom/onfido/android/sdk/capture/component/active/video/capture/domain/usecase/UploadActiveVideoCaptureUseCase;", "schedulersProvider", "Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;", "analytics", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/OnfidoAnalytics;", "waitingScreenTracker", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/WaitingScreenTracker;", "(Lcom/onfido/android/sdk/capture/component/active/video/capture/domain/usecase/UploadActiveVideoCaptureUseCase;Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/OnfidoAnalytics;Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/WaitingScreenTracker;)V", "_uploadResult", "Landroidx/lifecycle/MutableLiveData;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/upload/MotionUploadViewModel$UploadResult;", "compositeDisposable", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "uploadResult", "Landroidx/lifecycle/LiveData;", "getUploadResult", "()Landroidx/lifecycle/LiveData;", "onCleared", "", "upload", "videoFile", "Ljava/io/File;", "isAudioEnabled", "", "UploadResult", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MotionUploadViewModel extends ViewModel {

    @NotNull
    private final MutableLiveData<UploadResult> _uploadResult;

    @NotNull
    private final OnfidoAnalytics analytics;

    @NotNull
    private final CompositeDisposable compositeDisposable;

    @NotNull
    private final SchedulersProvider schedulersProvider;

    @NotNull
    private final UploadActiveVideoCaptureUseCase uploadActiveVideoCapture;

    @NotNull
    private final WaitingScreenTracker waitingScreenTracker;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/upload/MotionUploadViewModel$UploadResult;", "", "Failure", "Initial", "Success", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/upload/MotionUploadViewModel$UploadResult$Failure;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/upload/MotionUploadViewModel$UploadResult$Initial;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/upload/MotionUploadViewModel$UploadResult$Success;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface UploadResult {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/upload/MotionUploadViewModel$UploadResult$Failure;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/upload/MotionUploadViewModel$UploadResult;", "reason", "Lcom/onfido/android/sdk/capture/common/result/FailureReason;", "(Lcom/onfido/android/sdk/capture/common/result/FailureReason;)V", "getReason", "()Lcom/onfido/android/sdk/capture/common/result/FailureReason;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Failure implements UploadResult {

            @NotNull
            private final FailureReason reason;

            public Failure(@NotNull FailureReason reason) {
                Intrinsics.checkNotNullParameter(reason, "reason");
                this.reason = reason;
            }

            public static /* synthetic */ Failure copy$default(Failure failure, FailureReason failureReason, int i, Object obj2) {
                if ((i & 1) != 0) {
                    failureReason = failure.reason;
                }
                return failure.copy(failureReason);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final FailureReason getReason() {
                return this.reason;
            }

            @NotNull
            public final Failure copy(@NotNull FailureReason reason) {
                Intrinsics.checkNotNullParameter(reason, "reason");
                return new Failure(reason);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Failure) && Intrinsics.f(this.reason, ((Failure) other).reason);
            }

            @NotNull
            public final FailureReason getReason() {
                return this.reason;
            }

            public int hashCode() {
                return this.reason.hashCode();
            }

            @NotNull
            public String toString() {
                return "Failure(reason=" + this.reason + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/upload/MotionUploadViewModel$UploadResult$Initial;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/upload/MotionUploadViewModel$UploadResult;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Initial implements UploadResult {

            @NotNull
            public static final Initial INSTANCE = new Initial();

            private Initial() {
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/upload/MotionUploadViewModel$UploadResult$Success;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/upload/MotionUploadViewModel$UploadResult;", "uploadArtifact", "Lcom/onfido/android/sdk/capture/internal/model/UploadedArtifact;", "(Lcom/onfido/android/sdk/capture/internal/model/UploadedArtifact;)V", "getUploadArtifact", "()Lcom/onfido/android/sdk/capture/internal/model/UploadedArtifact;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Success implements UploadResult {

            @NotNull
            private final UploadedArtifact uploadArtifact;

            public Success(@NotNull UploadedArtifact uploadArtifact) {
                Intrinsics.checkNotNullParameter(uploadArtifact, "uploadArtifact");
                this.uploadArtifact = uploadArtifact;
            }

            public static /* synthetic */ Success copy$default(Success success, UploadedArtifact uploadedArtifact, int i, Object obj2) {
                if ((i & 1) != 0) {
                    uploadedArtifact = success.uploadArtifact;
                }
                return success.copy(uploadedArtifact);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final UploadedArtifact getUploadArtifact() {
                return this.uploadArtifact;
            }

            @NotNull
            public final Success copy(@NotNull UploadedArtifact uploadArtifact) {
                Intrinsics.checkNotNullParameter(uploadArtifact, "uploadArtifact");
                return new Success(uploadArtifact);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && Intrinsics.f(this.uploadArtifact, ((Success) other).uploadArtifact);
            }

            @NotNull
            public final UploadedArtifact getUploadArtifact() {
                return this.uploadArtifact;
            }

            public int hashCode() {
                return this.uploadArtifact.hashCode();
            }

            @NotNull
            public String toString() {
                return "Success(uploadArtifact=" + this.uploadArtifact + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }
    }

    public MotionUploadViewModel(@NotNull UploadActiveVideoCaptureUseCase uploadActiveVideoCapture, @NotNull SchedulersProvider schedulersProvider, @NotNull OnfidoAnalytics analytics, @NotNull WaitingScreenTracker waitingScreenTracker) {
        Intrinsics.checkNotNullParameter(uploadActiveVideoCapture, "uploadActiveVideoCapture");
        Intrinsics.checkNotNullParameter(schedulersProvider, "schedulersProvider");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(waitingScreenTracker, "waitingScreenTracker");
        this.uploadActiveVideoCapture = uploadActiveVideoCapture;
        this.schedulersProvider = schedulersProvider;
        this.analytics = analytics;
        this.waitingScreenTracker = waitingScreenTracker;
        this._uploadResult = new MutableLiveData<>(UploadResult.Initial.INSTANCE);
        this.compositeDisposable = new CompositeDisposable();
    }

    @NotNull
    public final LiveData<UploadResult> getUploadResult() {
        return this._uploadResult;
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.compositeDisposable.dispose();
    }

    public final void upload(@NotNull File videoFile, boolean isAudioEnabled) {
        Intrinsics.checkNotNullParameter(videoFile, "videoFile");
        this.analytics.track(AvcAnalyticsEvent.Upload.INSTANCE);
        CompositeDisposable compositeDisposable = this.compositeDisposable;
        Disposable disposableI = this.uploadActiveVideoCapture.invoke(videoFile, isAudioEnabled).k(this.schedulersProvider.getIo()).h(this.schedulersProvider.getUi()).i(new g() { // from class: com.onfido.android.sdk.capture.component.active.video.capture.presentation.upload.MotionUploadViewModel.upload.1
            @Override // igm.g
            public final void accept(@NotNull ActiveVideoCaptureResult result) {
                UploadResult failure;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof ActiveVideoCaptureResult.Success) {
                    MotionUploadViewModel.this.analytics.track(AvcAnalyticsEvent.UploadCompleted.INSTANCE);
                    LoadingFragment.Companion.DialogMode.Uploading uploading = new LoadingFragment.Companion.DialogMode.Uploading("UPLOADING_FACE_MOTION");
                    MotionUploadViewModel.this.waitingScreenTracker.trackWaitingScreenCompletion(uploading.toTaskType(), uploading.getReason());
                    failure = new UploadResult.Success(((ActiveVideoCaptureResult.Success) result).getUploadedArtifact());
                } else {
                    if (!(result instanceof ActiveVideoCaptureResult.Error)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    failure = new UploadResult.Failure(((ActiveVideoCaptureResult.Error) result).getReason());
                }
                MotionUploadViewModel.this._uploadResult.postValue(failure);
            }
        }, new g() { // from class: com.onfido.android.sdk.capture.component.active.video.capture.presentation.upload.MotionUploadViewModel.upload.2
            @Override // igm.g
            public final void accept(@NotNull Throwable it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
                MotionUploadViewModel.this._uploadResult.postValue(new UploadResult.Failure(new FailureReason(it8, "HTTP FAILED Exception")));
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableI, "subscribe(...)");
        RxExtensionsKt.plusAssign(compositeDisposable, disposableI);
    }
}
