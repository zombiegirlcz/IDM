package com.onfido.android.sdk.capture.ui.camera.liveness.challenges.loading;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import ch.qos.logback.core.CoreConstants;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.common.SdkController;
import com.onfido.android.sdk.capture.databinding.OnfidoLivenessChallengesLoadingBinding;
import com.onfido.android.sdk.capture.internal.util.annotation.InternalOnfidoApi;
import com.onfido.android.sdk.capture.ui.camera.liveness.challenges.LivenessChallengesViewModel;
import com.onfido.android.sdk.capture.ui.camera.liveness.challenges.loading.LivenessChallengesLoadingErrorView;
import com.onfido.android.sdk.capture.ui.camera.liveness.challenges.loading.LivenessChallengesLoadingPresenter;
import com.onfido.android.sdk.capture.ui.widget.LoadingView;
import com.onfido.android.sdk.capture.utils.ContextUtilsKt;
import com.onfido.android.sdk.capture.utils.ViewExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rim.d;

/* JADX INFO: loaded from: classes17.dex */
@InternalOnfidoApi
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002'(B%\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0006\u0010\u0019\u001a\u00020\u001aJ\b\u0010\u001b\u001a\u00020\u001aH\u0016J\b\u0010\u001c\u001a\u00020\u001aH\u0016J\u0010\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u0010H\u0016J\b\u0010\u001f\u001a\u00020\u001aH\u0016J\u000e\u0010 \u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020#H\u0016J\u000e\u0010$\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020&R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u00020\u00148\u0000@\u0000X\u0081.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006)"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/loading/LivenessChallengesLoadingView;", "Landroid/widget/RelativeLayout;", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/loading/LivenessChallengesLoadingPresenter$View;", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/loading/LivenessChallengesLoadingErrorView$Listener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/onfido/android/sdk/capture/databinding/OnfidoLivenessChallengesLoadingBinding;", "listener", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/loading/LivenessChallengesLoadingView$Listener;", "loadingAnnouncement", "", "getLoadingAnnouncement", "()Ljava/lang/String;", "presenter", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/loading/LivenessChallengesLoadingPresenter;", "getPresenter$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/loading/LivenessChallengesLoadingPresenter;", "setPresenter$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/loading/LivenessChallengesLoadingPresenter;)V", "fetchChallenges", "", "onChallengesErrorBackPressed", "onChallengesReloadButtonPressed", "onInvalidCertificate", "message", "onTokenExpired", "setListener", "setScreenState", "state", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/loading/LivenessChallengesLoadingView$ScreenState;", "setTopLimit", "limit", "", "Listener", "ScreenState", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LivenessChallengesLoadingView extends RelativeLayout implements LivenessChallengesLoadingPresenter.View, LivenessChallengesLoadingErrorView.Listener {

    @NotNull
    private final OnfidoLivenessChallengesLoadingBinding binding;
    private Listener listener;
    public LivenessChallengesLoadingPresenter presenter;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u0003H&¨\u0006\u000b"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/loading/LivenessChallengesLoadingView$Listener;", "", "onChallengeLoadingViewStateChanged", "", "screenState", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/loading/LivenessChallengesLoadingView$ScreenState;", "onChallengesErrorBackPressed", "onInvalidCertificateDetected", "message", "", "onTokenExpired", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Listener {
        void onChallengeLoadingViewStateChanged(@NotNull ScreenState screenState);

        void onChallengesErrorBackPressed();

        void onInvalidCertificateDetected(@NotNull String message);

        void onTokenExpired();
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/loading/LivenessChallengesLoadingView$ScreenState;", "", "()V", "Error", "Loading", "Success", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/loading/LivenessChallengesLoadingView$ScreenState$Error;", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/loading/LivenessChallengesLoadingView$ScreenState$Loading;", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/loading/LivenessChallengesLoadingView$ScreenState$Success;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class ScreenState {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/loading/LivenessChallengesLoadingView$ScreenState$Error;", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/loading/LivenessChallengesLoadingView$ScreenState;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Error extends ScreenState {

            @NotNull
            public static final Error INSTANCE = new Error();

            private Error() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/loading/LivenessChallengesLoadingView$ScreenState$Loading;", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/loading/LivenessChallengesLoadingView$ScreenState;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Loading extends ScreenState {

            @NotNull
            public static final Loading INSTANCE = new Loading();

            private Loading() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/loading/LivenessChallengesLoadingView$ScreenState$Success;", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/loading/LivenessChallengesLoadingView$ScreenState;", "livenessChallengesViewModel", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/LivenessChallengesViewModel;", "(Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/LivenessChallengesViewModel;)V", "getLivenessChallengesViewModel", "()Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/LivenessChallengesViewModel;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Success extends ScreenState {

            @NotNull
            private final LivenessChallengesViewModel livenessChallengesViewModel;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(@NotNull LivenessChallengesViewModel livenessChallengesViewModel) {
                super(null);
                Intrinsics.checkNotNullParameter(livenessChallengesViewModel, "livenessChallengesViewModel");
                this.livenessChallengesViewModel = livenessChallengesViewModel;
            }

            public static /* synthetic */ Success copy$default(Success success, LivenessChallengesViewModel livenessChallengesViewModel, int i, Object obj2) {
                if ((i & 1) != 0) {
                    livenessChallengesViewModel = success.livenessChallengesViewModel;
                }
                return success.copy(livenessChallengesViewModel);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final LivenessChallengesViewModel getLivenessChallengesViewModel() {
                return this.livenessChallengesViewModel;
            }

            @NotNull
            public final Success copy(@NotNull LivenessChallengesViewModel livenessChallengesViewModel) {
                Intrinsics.checkNotNullParameter(livenessChallengesViewModel, "livenessChallengesViewModel");
                return new Success(livenessChallengesViewModel);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && Intrinsics.f(this.livenessChallengesViewModel, ((Success) other).livenessChallengesViewModel);
            }

            @NotNull
            public final LivenessChallengesViewModel getLivenessChallengesViewModel() {
                return this.livenessChallengesViewModel;
            }

            public int hashCode() {
                return this.livenessChallengesViewModel.hashCode();
            }

            @NotNull
            public String toString() {
                return "Success(livenessChallengesViewModel=" + this.livenessChallengesViewModel + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }

        private ScreenState() {
        }

        public /* synthetic */ ScreenState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LivenessChallengesLoadingView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void fetchChallenges() {
        getPresenter$onfido_capture_sdk_core_release().fetchChallenges();
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.liveness.challenges.loading.LivenessChallengesLoadingPresenter.View
    @NotNull
    public String getLoadingAnnouncement() {
        String string = getContext().getString(R.string.onfido_generic_loading);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @NotNull
    public final LivenessChallengesLoadingPresenter getPresenter$onfido_capture_sdk_core_release() {
        LivenessChallengesLoadingPresenter livenessChallengesLoadingPresenter = this.presenter;
        if (livenessChallengesLoadingPresenter != null) {
            return livenessChallengesLoadingPresenter;
        }
        Intrinsics.r("presenter");
        throw null;
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.liveness.challenges.loading.LivenessChallengesLoadingErrorView.Listener
    public void onChallengesErrorBackPressed() {
        Listener listener = this.listener;
        if (listener != null) {
            listener.onChallengesErrorBackPressed();
        }
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.liveness.challenges.loading.LivenessChallengesLoadingErrorView.Listener
    public void onChallengesReloadButtonPressed() {
        getPresenter$onfido_capture_sdk_core_release().fetchChallenges();
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.liveness.challenges.loading.LivenessChallengesLoadingPresenter.View
    public void onInvalidCertificate(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Listener listener = this.listener;
        if (listener != null) {
            listener.onInvalidCertificateDetected(message);
        }
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.liveness.challenges.loading.LivenessChallengesLoadingPresenter.View
    public void onTokenExpired() {
        Listener listener = this.listener;
        if (listener != null) {
            listener.onTokenExpired();
        }
    }

    public final void setListener(@NotNull Listener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listener = listener;
    }

    public final void setPresenter$onfido_capture_sdk_core_release(@NotNull LivenessChallengesLoadingPresenter livenessChallengesLoadingPresenter) {
        Intrinsics.checkNotNullParameter(livenessChallengesLoadingPresenter, "<set-?>");
        this.presenter = livenessChallengesLoadingPresenter;
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.liveness.challenges.loading.LivenessChallengesLoadingPresenter.View
    public void setScreenState(@NotNull ScreenState state) {
        Listener listener;
        Intrinsics.checkNotNullParameter(state, "state");
        if (state instanceof ScreenState.Loading) {
            LivenessChallengesLoadingErrorView errorView = this.binding.errorView;
            Intrinsics.checkNotNullExpressionValue(errorView, "errorView");
            ViewExtensionsKt.toGone$default(errorView, false, 1, null);
            LoadingView loadingView = this.binding.loadingView;
            Intrinsics.checkNotNullExpressionValue(loadingView, "loadingView");
            ViewExtensionsKt.toVisible$default(loadingView, false, 1, null);
            listener = this.listener;
            if (listener == null) {
                return;
            }
        } else if (state instanceof ScreenState.Success) {
            LoadingView loadingView2 = this.binding.loadingView;
            Intrinsics.checkNotNullExpressionValue(loadingView2, "loadingView");
            ViewExtensionsKt.toInvisible$default(loadingView2, false, 1, null);
            listener = this.listener;
            if (listener == null) {
                return;
            }
        } else {
            if (!(state instanceof ScreenState.Error)) {
                return;
            }
            LoadingView loadingView3 = this.binding.loadingView;
            Intrinsics.checkNotNullExpressionValue(loadingView3, "loadingView");
            ViewExtensionsKt.toInvisible$default(loadingView3, false, 1, null);
            LivenessChallengesLoadingErrorView errorView2 = this.binding.errorView;
            Intrinsics.checkNotNullExpressionValue(errorView2, "errorView");
            ViewExtensionsKt.toVisible$default(errorView2, false, 1, null);
            listener = this.listener;
            if (listener == null) {
                return;
            }
        }
        listener.onChallengeLoadingViewStateChanged(state);
    }

    public final void setTopLimit(float limit) {
        LoadingView loadingView = this.binding.loadingView;
        Intrinsics.checkNotNullExpressionValue(loadingView, "loadingView");
        ViewGroup.LayoutParams layoutParams = loadingView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        }
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        float bottom = getBottom() - limit;
        Intrinsics.checkNotNullExpressionValue(getContext(), "getContext(...)");
        layoutParams2.bottomMargin = d.c((bottom - (ContextUtilsKt.dimen(r5, R.dimen.onfido_loading_view_max_circle_width) / 2.0f)) / 2.0f);
        loadingView.setLayoutParams(layoutParams2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LivenessChallengesLoadingView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivenessChallengesLoadingView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        OnfidoLivenessChallengesLoadingBinding onfidoLivenessChallengesLoadingBindingInflate = OnfidoLivenessChallengesLoadingBinding.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(onfidoLivenessChallengesLoadingBindingInflate, "inflate(...)");
        this.binding = onfidoLivenessChallengesLoadingBindingInflate;
        SdkController.getSdkComponent$default(SdkController.INSTANCE.getInstance(), context, null, 2, null).inject$onfido_capture_sdk_core_release(this);
        getPresenter$onfido_capture_sdk_core_release().attachView(this);
        onfidoLivenessChallengesLoadingBindingInflate.errorView.setListener(this);
    }

    public /* synthetic */ LivenessChallengesLoadingView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
