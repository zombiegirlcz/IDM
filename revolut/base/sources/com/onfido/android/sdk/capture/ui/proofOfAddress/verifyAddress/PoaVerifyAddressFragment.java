package com.onfido.android.sdk.capture.ui.proofOfAddress.verifyAddress;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import au0.b2;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.ui.BulletStepView;
import com.onfido.android.sdk.capture.ui.BulletedMessageFragment;
import com.onfido.android.sdk.capture.ui.camera.CaptureActivity;
import com.onfido.android.sdk.capture.ui.proofOfAddress.host.PoaFlowController;
import com.onfido.android.sdk.capture.ui.proofOfAddress.host.PoaHostFragment;
import com.onfido.android.sdk.capture.ui.widget.OnfidoButton;
import com.onfido.javax.inject.Provider;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import vim.f;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u001a\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001dH\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\b\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/proofOfAddress/verifyAddress/PoaVerifyAddressFragment;", "Lcom/onfido/android/sdk/capture/ui/BulletedMessageFragment;", "()V", "poaController", "Lcom/onfido/android/sdk/capture/ui/proofOfAddress/host/PoaFlowController;", "getPoaController", "()Lcom/onfido/android/sdk/capture/ui/proofOfAddress/host/PoaFlowController;", "poaController$delegate", "Lkotlin/Lazy;", "poaViewModelProvider", "Lcom/onfido/javax/inject/Provider;", "Lcom/onfido/android/sdk/capture/ui/proofOfAddress/verifyAddress/PoaVerifyAddressViewModel;", "getPoaViewModelProvider", "()Lcom/onfido/javax/inject/Provider;", "setPoaViewModelProvider", "(Lcom/onfido/javax/inject/Provider;)V", "viewModel", "getViewModel", "()Lcom/onfido/android/sdk/capture/ui/proofOfAddress/verifyAddress/PoaVerifyAddressViewModel;", "viewModel$delegate", "onStart", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setCustomStep", "index", "", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PoaVerifyAddressFragment extends BulletedMessageFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int STEP_COUNT = 3;

    /* JADX INFO: renamed from: poaController$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy poaController = j.b(new PoaVerifyAddressFragment$poaController$2(this));
    public Provider poaViewModelProvider;

    /* JADX INFO: renamed from: viewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u000bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/proofOfAddress/verifyAddress/PoaVerifyAddressFragment$Companion;", "", "()V", "STEP_COUNT", "", "createInstance", "Lcom/onfido/android/sdk/capture/ui/BulletedMessageFragment;", "title", "", "subtitle", "bullets", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final BulletedMessageFragment createInstance(@NotNull String title, @NotNull String subtitle, @NotNull List<String> bullets) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(bullets, "bullets");
            PoaVerifyAddressFragment poaVerifyAddressFragment = new PoaVerifyAddressFragment();
            BulletedMessageFragment.setInfo$onfido_capture_sdk_core_release$default(poaVerifyAddressFragment, "", title, subtitle, bullets, true, true, null, null, null, CaptureActivity.RESULT_EXIT_USER_FLOW, null);
            return poaVerifyAddressFragment;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public PoaVerifyAddressFragment() {
        PoaVerifyAddressFragment$viewModel$2 poaVerifyAddressFragment$viewModel$2 = new PoaVerifyAddressFragment$viewModel$2(this);
        Lazy lazyC = j.c(k.NONE, new PoaVerifyAddressFragment$special$$inlined$viewModels$default$2(new PoaVerifyAddressFragment$special$$inlined$viewModels$default$1(this)));
        this.viewModel = FragmentViewModelLazyKt.createViewModelLazy(this, o0.f186429a.b(PoaVerifyAddressViewModel.class), new PoaVerifyAddressFragment$special$$inlined$viewModels$default$3(lazyC), new PoaVerifyAddressFragment$special$$inlined$viewModels$default$4(null, lazyC), poaVerifyAddressFragment$viewModel$2);
    }

    @NotNull
    public static final BulletedMessageFragment createInstance(@NotNull String str, @NotNull String str2, @NotNull List<String> list) {
        return INSTANCE.createInstance(str, str2, list);
    }

    private final PoaFlowController getPoaController() {
        return (PoaFlowController) this.poaController.getValue();
    }

    private final PoaVerifyAddressViewModel getViewModel() {
        return (PoaVerifyAddressViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$2$lambda$1(PoaVerifyAddressFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getPoaController().showPoaCountrySelectionScreen();
    }

    private final void setCustomStep(int index) {
        View childAt = getBinding().stepsContainer.getChildAt(index);
        Intrinsics.i(childAt, "null cannot be cast to non-null type com.onfido.android.sdk.capture.ui.BulletStepView");
        BulletStepView bulletStepView = (BulletStepView) childAt;
        bulletStepView.setStepNumber(index);
        bulletStepView.setHtmlTitle();
    }

    @NotNull
    public final Provider getPoaViewModelProvider() {
        Provider provider = this.poaViewModelProvider;
        if (provider != null) {
            return provider;
        }
        Intrinsics.r("poaViewModelProvider");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        getViewModel().trackPoaVerifyAddress();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        Fragment parentFragment = getParentFragment();
        Intrinsics.i(parentFragment, "null cannot be cast to non-null type com.onfido.android.sdk.capture.ui.proofOfAddress.host.PoaHostFragment");
        ((PoaHostFragment) parentFragment).getPoaComponent$onfido_capture_sdk_core_release().inject(this);
        super.onViewCreated(view, savedInstanceState);
        f it8 = new IntRange(1, 3, 1).iterator();
        while (it8.f289625c) {
            setCustomStep(it8.nextInt());
        }
        OnfidoButton onfidoButton = getBinding().next;
        onfidoButton.setText$onfido_capture_sdk_core_release(R.string.onfido_poa_intro_button_primary);
        onfidoButton.setOnClickListener(new b2(this, 17));
    }

    public final void setPoaViewModelProvider(@NotNull Provider provider) {
        Intrinsics.checkNotNullParameter(provider, "<set-?>");
        this.poaViewModelProvider = provider;
    }
}
