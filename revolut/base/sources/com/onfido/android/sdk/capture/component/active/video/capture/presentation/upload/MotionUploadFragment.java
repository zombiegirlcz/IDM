package com.onfido.android.sdk.capture.component.active.video.capture.presentation.upload;

import android.os.Bundle;
import android.view.View;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.host.AvcUploadErrorScreen;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.host.MotionHostFragment;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.host.MotionHostViewModel;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.upload.MotionUploadViewModel;
import com.onfido.android.sdk.capture.internal.navigation.Navigator;
import com.onfido.android.sdk.capture.ui.BaseFragment;
import com.onfido.android.sdk.capture.utils.LoadingFragment;
import com.onfido.javax.inject.Provider;
import java.io.File;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u001a\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0010\u0010\u0011R$\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00148\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006#"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/upload/MotionUploadFragment;", "Lcom/onfido/android/sdk/capture/ui/BaseFragment;", "()V", "filePath", "", "getFilePath", "()Ljava/lang/String;", "filePath$delegate", "Lkotlin/Lazy;", "motionHostViewModel", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/host/MotionHostViewModel;", "getMotionHostViewModel", "()Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/host/MotionHostViewModel;", "motionHostViewModel$delegate", "viewModel", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/upload/MotionUploadViewModel;", "getViewModel", "()Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/upload/MotionUploadViewModel;", "viewModel$delegate", "viewModelProvider", "Lcom/onfido/javax/inject/Provider;", "getViewModelProvider", "()Lcom/onfido/javax/inject/Provider;", "setViewModelProvider", "(Lcom/onfido/javax/inject/Provider;)V", "onUploadResultChanged", "", "uploadResult", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/upload/MotionUploadViewModel$UploadResult;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MotionUploadFragment extends BaseFragment {

    /* JADX INFO: renamed from: filePath$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy filePath;

    /* JADX INFO: renamed from: motionHostViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy motionHostViewModel;

    /* JADX INFO: renamed from: viewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;
    public Provider viewModelProvider;

    @NotNull
    private static final String KEY_FILE_PATH = "key_file_path";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/upload/MotionUploadFragment$Companion;", "", "()V", "KEY_FILE_PATH", "", "createInstance", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/upload/MotionUploadFragment;", "filePath", "createInstance$onfido_capture_sdk_core_release", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final MotionUploadFragment createInstance$onfido_capture_sdk_core_release(@NotNull String filePath) {
            Intrinsics.checkNotNullParameter(filePath, "filePath");
            MotionUploadFragment motionUploadFragment = new MotionUploadFragment();
            motionUploadFragment.setArguments(BundleKt.bundleOf(new Pair("key_file_path", filePath)));
            return motionUploadFragment;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.component.active.video.capture.presentation.upload.MotionUploadFragment$onViewCreated$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "result", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/upload/MotionUploadViewModel$UploadResult;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends u implements Function1<MotionUploadViewModel.UploadResult, Unit> {
        public AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            invoke((MotionUploadViewModel.UploadResult) obj2);
            return Unit.f186387a;
        }

        public final void invoke(MotionUploadViewModel.UploadResult uploadResult) {
            MotionUploadFragment motionUploadFragment = MotionUploadFragment.this;
            Intrinsics.h(uploadResult);
            motionUploadFragment.onUploadResultChanged(uploadResult);
        }
    }

    public MotionUploadFragment() {
        super(R.layout.onfido_motion_fragment_upload);
        this.filePath = j.b(new MotionUploadFragment$filePath$2(this));
        MotionUploadFragment$viewModel$2 motionUploadFragment$viewModel$2 = new MotionUploadFragment$viewModel$2(this);
        MotionUploadFragment$special$$inlined$viewModels$default$1 motionUploadFragment$special$$inlined$viewModels$default$1 = new MotionUploadFragment$special$$inlined$viewModels$default$1(this);
        k kVar = k.NONE;
        Lazy lazyC = j.c(kVar, new MotionUploadFragment$special$$inlined$viewModels$default$2(motionUploadFragment$special$$inlined$viewModels$default$1));
        p0 p0Var = o0.f186429a;
        this.viewModel = FragmentViewModelLazyKt.createViewModelLazy(this, p0Var.b(MotionUploadViewModel.class), new MotionUploadFragment$special$$inlined$viewModels$default$3(lazyC), new MotionUploadFragment$special$$inlined$viewModels$default$4(null, lazyC), motionUploadFragment$viewModel$2);
        Lazy lazyC2 = j.c(kVar, new MotionUploadFragment$special$$inlined$viewModels$default$6(new MotionUploadFragment$motionHostViewModel$2(this)));
        this.motionHostViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, p0Var.b(MotionHostViewModel.class), new MotionUploadFragment$special$$inlined$viewModels$default$7(lazyC2), new MotionUploadFragment$special$$inlined$viewModels$default$8(null, lazyC2), new MotionUploadFragment$special$$inlined$viewModels$default$9(this, lazyC2));
    }

    private final String getFilePath() {
        return (String) this.filePath.getValue();
    }

    private final MotionHostViewModel getMotionHostViewModel() {
        return (MotionHostViewModel) this.motionHostViewModel.getValue();
    }

    private final MotionUploadViewModel getViewModel() {
        return (MotionUploadViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onUploadResultChanged(MotionUploadViewModel.UploadResult uploadResult) {
        if (uploadResult instanceof MotionUploadViewModel.UploadResult.Success) {
            getMotionHostViewModel().onVideoUploadSuccess(((MotionUploadViewModel.UploadResult.Success) uploadResult).getUploadArtifact());
            dismissLoadingDialog$onfido_capture_sdk_core_release();
        } else if (!(uploadResult instanceof MotionUploadViewModel.UploadResult.Failure)) {
            if (Intrinsics.f(uploadResult, MotionUploadViewModel.UploadResult.Initial.INSTANCE)) {
                showLoadingDialog$onfido_capture_sdk_core_release(new LoadingFragment.Companion.DialogMode.Uploading("UPLOADING_FACE_MOTION"));
            }
        } else {
            Navigator navigator = getMotionHostViewModel().getNavigator();
            String filePath = getFilePath();
            Intrinsics.checkNotNullExpressionValue(filePath, "<get-filePath>(...)");
            navigator.replace(new AvcUploadErrorScreen(filePath));
            dismissLoadingDialog$onfido_capture_sdk_core_release();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$0(Function1 tmp0, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj2);
    }

    @NotNull
    public final Provider getViewModelProvider() {
        Provider provider = this.viewModelProvider;
        if (provider != null) {
            return provider;
        }
        Intrinsics.r("viewModelProvider");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        Fragment parentFragment = getParentFragment();
        Intrinsics.i(parentFragment, "null cannot be cast to non-null type com.onfido.android.sdk.capture.component.active.video.capture.presentation.host.MotionHostFragment");
        ((MotionHostFragment) parentFragment).getMotionHostComponent$onfido_capture_sdk_core_release().inject(this);
        super.onViewCreated(view, savedInstanceState);
        getViewModel().getUploadResult().observe(getViewLifecycleOwner(), new a(0, new AnonymousClass1()));
        getViewModel().upload(new File(getFilePath()), getMotionHostViewModel().getAudioEnabled());
    }

    public final void setViewModelProvider(@NotNull Provider provider) {
        Intrinsics.checkNotNullParameter(provider, "<set-?>");
        this.viewModelProvider = provider;
    }
}
