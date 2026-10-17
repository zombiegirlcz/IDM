package com.onfido.android.sdk.capture.component.active.video.capture.presentation.uploaderror;

import android.os.Bundle;
import android.view.View;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.component.active.video.capture.analytics.AvcAnalyticsEvent;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.host.MotionHostFragment;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.host.MotionHostViewModel;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.host.MotionUploadScreen;
import com.onfido.android.sdk.capture.databinding.OnfidoMotionFragmentUploadErrorBinding;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.OnfidoAnalytics;
import com.onfido.android.sdk.capture.internal.navigation.Navigator;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import org.jetbrains.annotations.NotNull;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u001a\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/uploaderror/MotionUploadErrorFragment;", "Landroidx/fragment/app/Fragment;", "()V", "analytics", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/OnfidoAnalytics;", "getAnalytics", "()Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/OnfidoAnalytics;", "setAnalytics", "(Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/OnfidoAnalytics;)V", "filePath", "", "getFilePath", "()Ljava/lang/String;", "filePath$delegate", "Lkotlin/Lazy;", "motionHostViewModel", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/host/MotionHostViewModel;", "getMotionHostViewModel", "()Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/host/MotionHostViewModel;", "motionHostViewModel$delegate", "attachListeners", "", "binding", "Lcom/onfido/android/sdk/capture/databinding/OnfidoMotionFragmentUploadErrorBinding;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MotionUploadErrorFragment extends Fragment {
    public OnfidoAnalytics analytics;

    /* JADX INFO: renamed from: filePath$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy filePath;

    /* JADX INFO: renamed from: motionHostViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy motionHostViewModel;

    @NotNull
    private static final String KEY_FILE_PATH = "key_file_path";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/uploaderror/MotionUploadErrorFragment$Companion;", "", "()V", "KEY_FILE_PATH", "", "createInstance", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/uploaderror/MotionUploadErrorFragment;", "filePath", "createInstance$onfido_capture_sdk_core_release", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final MotionUploadErrorFragment createInstance$onfido_capture_sdk_core_release(@NotNull String filePath) {
            Intrinsics.checkNotNullParameter(filePath, "filePath");
            MotionUploadErrorFragment motionUploadErrorFragment = new MotionUploadErrorFragment();
            motionUploadErrorFragment.setArguments(BundleKt.bundleOf(new Pair("key_file_path", filePath)));
            return motionUploadErrorFragment;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public MotionUploadErrorFragment() {
        super(R.layout.onfido_motion_fragment_upload_error);
        Lazy lazyC = j.c(k.NONE, new MotionUploadErrorFragment$special$$inlined$viewModels$default$1(new MotionUploadErrorFragment$motionHostViewModel$2(this)));
        this.motionHostViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, o0.f186429a.b(MotionHostViewModel.class), new MotionUploadErrorFragment$special$$inlined$viewModels$default$2(lazyC), new MotionUploadErrorFragment$special$$inlined$viewModels$default$3(null, lazyC), new MotionUploadErrorFragment$special$$inlined$viewModels$default$4(this, lazyC));
        this.filePath = j.b(new MotionUploadErrorFragment$filePath$2(this));
    }

    private final void attachListeners(OnfidoMotionFragmentUploadErrorBinding binding) {
        final int i = 0;
        binding.retryUploadButton.setOnClickListener(new View.OnClickListener(this) { // from class: com.onfido.android.sdk.capture.component.active.video.capture.presentation.uploaderror.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MotionUploadErrorFragment f49903b;

            {
                this.f49903b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        MotionUploadErrorFragment.attachListeners$lambda$2$lambda$0(this.f49903b, view);
                        break;
                    default:
                        MotionUploadErrorFragment.attachListeners$lambda$2$lambda$1(this.f49903b, view);
                        break;
                }
            }
        });
        final int i2 = 1;
        binding.restartRecordingButton.setOnClickListener(new View.OnClickListener(this) { // from class: com.onfido.android.sdk.capture.component.active.video.capture.presentation.uploaderror.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MotionUploadErrorFragment f49903b;

            {
                this.f49903b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        MotionUploadErrorFragment.attachListeners$lambda$2$lambda$0(this.f49903b, view);
                        break;
                    default:
                        MotionUploadErrorFragment.attachListeners$lambda$2$lambda$1(this.f49903b, view);
                        break;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void attachListeners$lambda$2$lambda$0(MotionUploadErrorFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getAnalytics().track(AvcAnalyticsEvent.ConnectionErrorRetryUpload.INSTANCE);
        Navigator navigator = this$0.getMotionHostViewModel().getNavigator();
        String filePath = this$0.getFilePath();
        Intrinsics.checkNotNullExpressionValue(filePath, "<get-filePath>(...)");
        navigator.replace(new MotionUploadScreen(filePath));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void attachListeners$lambda$2$lambda$1(MotionUploadErrorFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getAnalytics().track(AvcAnalyticsEvent.ConnectionErrorRestartRecording.INSTANCE);
        this$0.getMotionHostViewModel().restartCaptureNavigation();
    }

    private final String getFilePath() {
        return (String) this.filePath.getValue();
    }

    private final MotionHostViewModel getMotionHostViewModel() {
        return (MotionHostViewModel) this.motionHostViewModel.getValue();
    }

    @NotNull
    public final OnfidoAnalytics getAnalytics() {
        OnfidoAnalytics onfidoAnalytics = this.analytics;
        if (onfidoAnalytics != null) {
            return onfidoAnalytics;
        }
        Intrinsics.r("analytics");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        Fragment parentFragment = getParentFragment();
        Intrinsics.i(parentFragment, "null cannot be cast to non-null type com.onfido.android.sdk.capture.component.active.video.capture.presentation.host.MotionHostFragment");
        ((MotionHostFragment) parentFragment).getMotionHostComponent$onfido_capture_sdk_core_release().inject(this);
        super.onViewCreated(view, savedInstanceState);
        OnfidoMotionFragmentUploadErrorBinding onfidoMotionFragmentUploadErrorBindingBind = OnfidoMotionFragmentUploadErrorBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(onfidoMotionFragmentUploadErrorBindingBind, "bind(...)");
        attachListeners(onfidoMotionFragmentUploadErrorBindingBind);
        getAnalytics().track(AvcAnalyticsEvent.ConnectionError.INSTANCE);
    }

    public final void setAnalytics(@NotNull OnfidoAnalytics onfidoAnalytics) {
        Intrinsics.checkNotNullParameter(onfidoAnalytics, "<set-?>");
        this.analytics = onfidoAnalytics;
    }
}
