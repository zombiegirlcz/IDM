package com.onfido.android.sdk.capture.ui.nfc;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import au0.b2;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.common.SdkController;
import com.onfido.android.sdk.capture.databinding.OnfidoFragmentNfcChipBlockedOptionalBinding;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import org.jetbrains.annotations.NotNull;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/nfc/NfcChipBlockedOptionalFragment;", "Landroidx/fragment/app/Fragment;", "()V", "nfcViewModel", "Lcom/onfido/android/sdk/capture/ui/nfc/NfcHostViewModel;", "getNfcViewModel", "()Lcom/onfido/android/sdk/capture/ui/nfc/NfcHostViewModel;", "nfcViewModel$delegate", "Lkotlin/Lazy;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class NfcChipBlockedOptionalFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: nfcViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy nfcViewModel;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/nfc/NfcChipBlockedOptionalFragment$Companion;", "", "()V", "createInstance", "Lcom/onfido/android/sdk/capture/ui/nfc/NfcChipBlockedOptionalFragment;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final NfcChipBlockedOptionalFragment createInstance() {
            return new NfcChipBlockedOptionalFragment();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public NfcChipBlockedOptionalFragment() {
        super(R.layout.onfido_fragment_nfc_chip_blocked_optional);
        Lazy lazyC = j.c(k.NONE, new NfcChipBlockedOptionalFragment$special$$inlined$viewModels$default$1(new NfcChipBlockedOptionalFragment$nfcViewModel$2(this)));
        this.nfcViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, o0.f186429a.b(NfcHostViewModel.class), new NfcChipBlockedOptionalFragment$special$$inlined$viewModels$default$2(lazyC), new NfcChipBlockedOptionalFragment$special$$inlined$viewModels$default$3(null, lazyC), new NfcChipBlockedOptionalFragment$special$$inlined$viewModels$default$4(this, lazyC));
    }

    @NotNull
    public static final NfcChipBlockedOptionalFragment createInstance() {
        return INSTANCE.createInstance();
    }

    private final NfcHostViewModel getNfcViewModel() {
        return (NfcHostViewModel) this.nfcViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$0(NfcChipBlockedOptionalFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getNfcViewModel().onChipBlockedContinueClicked();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        SdkController companion = SdkController.INSTANCE.getInstance();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        SdkController.getSdkComponent$default(companion, contextRequireContext, null, 2, null).inject$onfido_capture_sdk_core_release(this);
        super.onViewCreated(view, savedInstanceState);
        OnfidoFragmentNfcChipBlockedOptionalBinding onfidoFragmentNfcChipBlockedOptionalBindingBind = OnfidoFragmentNfcChipBlockedOptionalBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(onfidoFragmentNfcChipBlockedOptionalBindingBind, "bind(...)");
        onfidoFragmentNfcChipBlockedOptionalBindingBind.btnContinue.setOnClickListener(new b2(this, 14));
    }
}
