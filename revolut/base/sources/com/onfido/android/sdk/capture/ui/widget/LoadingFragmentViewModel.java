package com.onfido.android.sdk.capture.ui.widget;

import androidx.lifecycle.ViewModel;
import ch.qos.logback.core.CoreConstants;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.WaitingScreenTracker;
import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.android.sdk.capture.internal.util.logging.Timber;
import com.onfido.android.sdk.capture.utils.LoadingFragment;
import com.onfido.android.sdk.capture.utils.RxExtensionsKt;
import com.onfido.android.sdk.workflow.internal.WaitingScreenThreshold;
import igm.g;
import igm.o;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import vkm.q;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0002 !B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002J\b\u0010\u001b\u001a\u00020\u0017H\u0014J\u0006\u0010\u001c\u001a\u00020\u0017J\b\u0010\u001d\u001a\u00020\u0017H\u0002J\b\u0010\u001e\u001a\u00020\u0017H\u0002J\b\u0010\u001f\u001a\u00020\u0017H\u0002R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/onfido/android/sdk/capture/ui/widget/LoadingFragmentViewModel;", "Landroidx/lifecycle/ViewModel;", "remoteConfig", "Lcom/onfido/android/sdk/capture/internal/config/OnfidoRemoteConfig;", "schedulersProvider", "Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;", "waitingScreenTracker", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/WaitingScreenTracker;", "dialogMode", "Lcom/onfido/android/sdk/capture/utils/LoadingFragment$Companion$DialogMode;", "(Lcom/onfido/android/sdk/capture/internal/config/OnfidoRemoteConfig;Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/WaitingScreenTracker;Lcom/onfido/android/sdk/capture/utils/LoadingFragment$Companion$DialogMode;)V", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/onfido/android/sdk/capture/ui/widget/LoadingFragmentViewModel$ViewState;", "getDialogMode", "()Lcom/onfido/android/sdk/capture/utils/LoadingFragment$Companion$DialogMode;", "disposable", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "alternateWaitingMessages", "", "waitingMessages", "", "Lcom/onfido/android/sdk/capture/ui/widget/LoadingFragmentViewModel$ViewState$ShowMessage;", "onCleared", "onDetach", "startCheckingImageQualityMessagesAlternating", "startUploadingMessagesAlternating", "trackWaitingScreenStart", "Factory", "ViewState", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LoadingFragmentViewModel extends ViewModel {

    @NotNull
    private final MutableStateFlow _state;

    @NotNull
    private final LoadingFragment.Companion.DialogMode dialogMode;

    @NotNull
    private final CompositeDisposable disposable;

    @NotNull
    private final OnfidoRemoteConfig remoteConfig;

    @NotNull
    private final SchedulersProvider schedulersProvider;

    @NotNull
    private final StateFlow state;

    @NotNull
    private final WaitingScreenTracker waitingScreenTracker;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bç\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/widget/LoadingFragmentViewModel$Factory;", "", "create", "Lcom/onfido/android/sdk/capture/ui/widget/LoadingFragmentViewModel;", "dialogMode", "Lcom/onfido/android/sdk/capture/utils/LoadingFragment$Companion$DialogMode;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Factory {
        @NotNull
        LoadingFragmentViewModel create(@NotNull LoadingFragment.Companion.DialogMode dialogMode);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/widget/LoadingFragmentViewModel$ViewState;", "", "()V", "ShowMessage", "ShowProgressOnly", "Lcom/onfido/android/sdk/capture/ui/widget/LoadingFragmentViewModel$ViewState$ShowMessage;", "Lcom/onfido/android/sdk/capture/ui/widget/LoadingFragmentViewModel$ViewState$ShowProgressOnly;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class ViewState {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\tJ0\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/widget/LoadingFragmentViewModel$ViewState$ShowMessage;", "Lcom/onfido/android/sdk/capture/ui/widget/LoadingFragmentViewModel$ViewState;", "titleResId", "", "subTitleResId", "delayInMs", "", "(ILjava/lang/Integer;Ljava/lang/Long;)V", "getDelayInMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getSubTitleResId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTitleResId", "()I", "component1", "component2", "component3", "copy", "(ILjava/lang/Integer;Ljava/lang/Long;)Lcom/onfido/android/sdk/capture/ui/widget/LoadingFragmentViewModel$ViewState$ShowMessage;", "equals", "", "other", "", "hashCode", "toString", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ShowMessage extends ViewState {
            private final Long delayInMs;
            private final Integer subTitleResId;
            private final int titleResId;

            public ShowMessage(int i, Integer num, Long l2) {
                super(null);
                this.titleResId = i;
                this.subTitleResId = num;
                this.delayInMs = l2;
            }

            public static /* synthetic */ ShowMessage copy$default(ShowMessage showMessage, int i, Integer num, Long l2, int i2, Object obj2) {
                if ((i2 & 1) != 0) {
                    i = showMessage.titleResId;
                }
                if ((i2 & 2) != 0) {
                    num = showMessage.subTitleResId;
                }
                if ((i2 & 4) != 0) {
                    l2 = showMessage.delayInMs;
                }
                return showMessage.copy(i, num, l2);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final int getTitleResId() {
                return this.titleResId;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final Integer getSubTitleResId() {
                return this.subTitleResId;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final Long getDelayInMs() {
                return this.delayInMs;
            }

            @NotNull
            public final ShowMessage copy(int titleResId, Integer subTitleResId, Long delayInMs) {
                return new ShowMessage(titleResId, subTitleResId, delayInMs);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ShowMessage)) {
                    return false;
                }
                ShowMessage showMessage = (ShowMessage) other;
                return this.titleResId == showMessage.titleResId && Intrinsics.f(this.subTitleResId, showMessage.subTitleResId) && Intrinsics.f(this.delayInMs, showMessage.delayInMs);
            }

            public final Long getDelayInMs() {
                return this.delayInMs;
            }

            public final Integer getSubTitleResId() {
                return this.subTitleResId;
            }

            public final int getTitleResId() {
                return this.titleResId;
            }

            public int hashCode() {
                int iHashCode = Integer.hashCode(this.titleResId) * 31;
                Integer num = this.subTitleResId;
                int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
                Long l2 = this.delayInMs;
                return iHashCode2 + (l2 != null ? l2.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "ShowMessage(titleResId=" + this.titleResId + ", subTitleResId=" + this.subTitleResId + ", delayInMs=" + this.delayInMs + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }

            public /* synthetic */ ShowMessage(int i, Integer num, Long l2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(i, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? null : l2);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/widget/LoadingFragmentViewModel$ViewState$ShowProgressOnly;", "Lcom/onfido/android/sdk/capture/ui/widget/LoadingFragmentViewModel$ViewState;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ShowProgressOnly extends ViewState {

            @NotNull
            public static final ShowProgressOnly INSTANCE = new ShowProgressOnly();

            private ShowProgressOnly() {
                super(null);
            }
        }

        private ViewState() {
        }

        public /* synthetic */ ViewState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public LoadingFragmentViewModel(@NotNull OnfidoRemoteConfig remoteConfig, @NotNull SchedulersProvider schedulersProvider, @NotNull WaitingScreenTracker waitingScreenTracker, @NotNull LoadingFragment.Companion.DialogMode dialogMode) {
        Intrinsics.checkNotNullParameter(remoteConfig, "remoteConfig");
        Intrinsics.checkNotNullParameter(schedulersProvider, "schedulersProvider");
        Intrinsics.checkNotNullParameter(waitingScreenTracker, "waitingScreenTracker");
        Intrinsics.checkNotNullParameter(dialogMode, "dialogMode");
        this.remoteConfig = remoteConfig;
        this.schedulersProvider = schedulersProvider;
        this.waitingScreenTracker = waitingScreenTracker;
        this.dialogMode = dialogMode;
        this.disposable = new CompositeDisposable();
        j2 j2VarC = q.c(ViewState.ShowProgressOnly.INSTANCE);
        this._state = j2VarC;
        this.state = j2VarC;
        if (dialogMode instanceof LoadingFragment.Companion.DialogMode.Loading) {
            j2VarC.g(null, new ViewState.ShowMessage(R.string.onfido_generic_loading, null, null, 6, null));
        } else if (dialogMode instanceof LoadingFragment.Companion.DialogMode.CheckingImageQuality) {
            startCheckingImageQualityMessagesAlternating();
        } else if (dialogMode instanceof LoadingFragment.Companion.DialogMode.Uploading) {
            startUploadingMessagesAlternating();
        }
        trackWaitingScreenStart();
    }

    private final void alternateWaitingMessages(List<ViewState.ShowMessage> waitingMessages) {
        CompositeDisposable compositeDisposable = this.disposable;
        Disposable disposableSubscribe = Observable.fromIterable(waitingMessages).concatMap(new o() { // from class: com.onfido.android.sdk.capture.ui.widget.LoadingFragmentViewModel.alternateWaitingMessages.1
            @Override // igm.o
            @NotNull
            public final ObservableSource apply(@NotNull ViewState.ShowMessage message) {
                Intrinsics.checkNotNullParameter(message, "message");
                Observable observableJust = Observable.just(message);
                Long delayInMs = message.getDelayInMs();
                return observableJust.delay(delayInMs != null ? delayInMs.longValue() : 0L, TimeUnit.MILLISECONDS, LoadingFragmentViewModel.this.schedulersProvider.getSingle());
            }
        }).subscribeOn(this.schedulersProvider.getIo()).observeOn(this.schedulersProvider.getUi()).subscribe(new g() { // from class: com.onfido.android.sdk.capture.ui.widget.LoadingFragmentViewModel.alternateWaitingMessages.2
            @Override // igm.g
            public final void accept(@NotNull ViewState.ShowMessage it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
                LoadingFragmentViewModel.this._state.setValue(it8);
            }
        }, new g() { // from class: com.onfido.android.sdk.capture.ui.widget.LoadingFragmentViewModel.alternateWaitingMessages.3
            @Override // igm.g
            public final void accept(@NotNull Throwable throwable) {
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                Timber.INSTANCE.e(throwable, "Error during subscribing to alternating messages", new Object[0]);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        RxExtensionsKt.plusAssign(compositeDisposable, disposableSubscribe);
    }

    private final void startCheckingImageQualityMessagesAlternating() {
        alternateWaitingMessages(v.k(new ViewState.ShowMessage(R.string.onfido_doc_upload_progress_label, null, null, 6, null), new ViewState.ShowMessage(R.string.onfido_doc_upload_progress_label, Integer.valueOf(R.string.onfido_interactive_task_waiting_subtitle_1), this.remoteConfig.getMediaWaitingScreensTimeThresholds().get(WaitingScreenThreshold.ShortWaiting1.INSTANCE)), new ViewState.ShowMessage(R.string.onfido_doc_upload_progress_label, Integer.valueOf(R.string.onfido_interactive_task_waiting_subtitle_2), this.remoteConfig.getMediaWaitingScreensTimeThresholds().get(WaitingScreenThreshold.ShortWaiting2.INSTANCE)), new ViewState.ShowMessage(R.string.onfido_doc_upload_progress_label, Integer.valueOf(R.string.onfido_interactive_task_waiting_subtitle_1), this.remoteConfig.getMediaWaitingScreensTimeThresholds().get(WaitingScreenThreshold.MediumWaiting1.INSTANCE)), new ViewState.ShowMessage(R.string.onfido_doc_upload_progress_label, Integer.valueOf(R.string.onfido_interactive_task_waiting_subtitle_2), this.remoteConfig.getMediaWaitingScreensTimeThresholds().get(WaitingScreenThreshold.MediumWaiting2.INSTANCE)), new ViewState.ShowMessage(R.string.onfido_doc_upload_progress_label, Integer.valueOf(R.string.onfido_interactive_task_waiting_subtitle_1), this.remoteConfig.getMediaWaitingScreensTimeThresholds().get(WaitingScreenThreshold.LongWaiting1.INSTANCE))));
    }

    private final void startUploadingMessagesAlternating() {
        alternateWaitingMessages(v.k(new ViewState.ShowMessage(R.string.onfido_interactive_task_waiting_title_5, null, null, 6, null), new ViewState.ShowMessage(R.string.onfido_interactive_task_waiting_title_5, Integer.valueOf(R.string.onfido_interactive_task_waiting_subtitle_1), this.remoteConfig.getMediaWaitingScreensTimeThresholds().get(WaitingScreenThreshold.ShortWaiting1.INSTANCE)), new ViewState.ShowMessage(R.string.onfido_interactive_task_waiting_title_5, Integer.valueOf(R.string.onfido_interactive_task_waiting_subtitle_2), this.remoteConfig.getMediaWaitingScreensTimeThresholds().get(WaitingScreenThreshold.ShortWaiting2.INSTANCE)), new ViewState.ShowMessage(R.string.onfido_interactive_task_waiting_title_5, Integer.valueOf(R.string.onfido_interactive_task_waiting_subtitle_1), this.remoteConfig.getMediaWaitingScreensTimeThresholds().get(WaitingScreenThreshold.MediumWaiting1.INSTANCE)), new ViewState.ShowMessage(R.string.onfido_interactive_task_waiting_title_5, Integer.valueOf(R.string.onfido_interactive_task_waiting_subtitle_2), this.remoteConfig.getMediaWaitingScreensTimeThresholds().get(WaitingScreenThreshold.MediumWaiting2.INSTANCE)), new ViewState.ShowMessage(R.string.onfido_interactive_task_waiting_title_5, Integer.valueOf(R.string.onfido_interactive_task_waiting_subtitle_1), this.remoteConfig.getMediaWaitingScreensTimeThresholds().get(WaitingScreenThreshold.LongWaiting1.INSTANCE))));
    }

    private final void trackWaitingScreenStart() {
        this.waitingScreenTracker.trackWaitingScreenStart(this.dialogMode.toTaskType(), this.dialogMode.getReason(), d0.d1(this.remoteConfig.getMediaWaitingScreensTimeThresholds().values()));
    }

    @NotNull
    public final LoadingFragment.Companion.DialogMode getDialogMode() {
        return this.dialogMode;
    }

    @NotNull
    public final StateFlow getState() {
        return this.state;
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        this.disposable.d();
        super.onCleared();
    }

    public final void onDetach() {
        this.waitingScreenTracker.trackWaitingScreenEnded(this.dialogMode.toTaskType(), this.dialogMode.getReason());
        this.disposable.d();
    }
}
