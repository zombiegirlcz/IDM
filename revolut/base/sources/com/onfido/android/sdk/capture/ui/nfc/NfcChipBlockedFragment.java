package com.onfido.android.sdk.capture.ui.nfc;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.common.SdkController;
import com.onfido.android.sdk.capture.databinding.OnfidoFragmentNfcChipBlockedBinding;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.ScreenTracker;
import com.onfido.android.sdk.capture.internal.util.annotation.InternalOnfidoApi;
import com.onfido.android.sdk.capture.ui.widget.OnfidoButton;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import org.jetbrains.annotations.NotNull;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes17.dex */
@InternalOnfidoApi
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\t\u001a\u00020\n8\u0000@\u0000X\u0081.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/nfc/NfcChipBlockedFragment;", "Landroidx/fragment/app/Fragment;", "()V", "nfcViewModel", "Lcom/onfido/android/sdk/capture/ui/nfc/NfcHostViewModel;", "getNfcViewModel", "()Lcom/onfido/android/sdk/capture/ui/nfc/NfcHostViewModel;", "nfcViewModel$delegate", "Lkotlin/Lazy;", "screenTracker", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/ScreenTracker;", "getScreenTracker$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/ScreenTracker;", "setScreenTracker$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/ScreenTracker;)V", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class NfcChipBlockedFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: nfcViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy nfcViewModel;
    public ScreenTracker screenTracker;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/nfc/NfcChipBlockedFragment$Companion;", "", "()V", "createInstance", "Lcom/onfido/android/sdk/capture/ui/nfc/NfcChipBlockedFragment;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final NfcChipBlockedFragment createInstance() {
            return new NfcChipBlockedFragment();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public NfcChipBlockedFragment() {
        super(R.layout.onfido_fragment_nfc_chip_blocked);
        Lazy lazyC = j.c(k.NONE, new NfcChipBlockedFragment$special$$inlined$viewModels$default$1(new NfcChipBlockedFragment$nfcViewModel$2(this)));
        this.nfcViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, o0.f186429a.b(NfcHostViewModel.class), new NfcChipBlockedFragment$special$$inlined$viewModels$default$2(lazyC), new NfcChipBlockedFragment$special$$inlined$viewModels$default$3(null, lazyC), new NfcChipBlockedFragment$special$$inlined$viewModels$default$4(this, lazyC));
    }

    @NotNull
    public static final NfcChipBlockedFragment createInstance() {
        return INSTANCE.createInstance();
    }

    private final NfcHostViewModel getNfcViewModel() {
        return (NfcHostViewModel) this.nfcViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$0(NfcChipBlockedFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getNfcViewModel().onChipBlockedExitClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$2$lambda$1(NfcChipBlockedFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getNfcViewModel().onUnlockChipClicked();
    }

    @NotNull
    public final ScreenTracker getScreenTracker$onfido_capture_sdk_core_release() {
        ScreenTracker screenTracker = this.screenTracker;
        if (screenTracker != null) {
            return screenTracker;
        }
        Intrinsics.r("screenTracker");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        SdkController companion = SdkController.INSTANCE.getInstance();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        SdkController.getSdkComponent$default(companion, contextRequireContext, null, 2, null).inject$onfido_capture_sdk_core_release(this);
        super.onViewCreated(view, savedInstanceState);
        OnfidoFragmentNfcChipBlockedBinding onfidoFragmentNfcChipBlockedBindingBind = OnfidoFragmentNfcChipBlockedBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(onfidoFragmentNfcChipBlockedBindingBind, "bind(...)");
        final int i = 0;
        onfidoFragmentNfcChipBlockedBindingBind.btnExit.setOnClickListener(new View.OnClickListener(this) { // from class: com.onfido.android.sdk.capture.ui.nfc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NfcChipBlockedFragment f50068b;

            {
                this.f50068b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        NfcChipBlockedFragment.onViewCreated$lambda$0(this.f50068b, view2);
                        break;
                    default:
                        NfcChipBlockedFragment.onViewCreated$lambda$2$lambda$1(this.f50068b, view2);
                        break;
                }
            }
        });
        OnfidoButton onfidoButton = onfidoFragmentNfcChipBlockedBindingBind.btnUnlockChip;
        Intrinsics.h(onfidoButton);
        onfidoButton.setVisibility(getNfcViewModel().canUnlockChip() ? 0 : 8);
        onfidoButton.getAppCompatButton().setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.onfido_ic_external_link, 0);
        final int i2 = 1;
        onfidoButton.setOnClickListener(new View.OnClickListener(this) { // from class: com.onfido.android.sdk.capture.ui.nfc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NfcChipBlockedFragment f50068b;

            {
                this.f50068b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i2) {
                    case 0:
                        NfcChipBlockedFragment.onViewCreated$lambda$0(this.f50068b, view2);
                        break;
                    default:
                        NfcChipBlockedFragment.onViewCreated$lambda$2$lambda$1(this.f50068b, view2);
                        break;
                }
            }
        });
    }

    public final void setScreenTracker$onfido_capture_sdk_core_release(@NotNull ScreenTracker screenTracker) {
        Intrinsics.checkNotNullParameter(screenTracker, "<set-?>");
        this.screenTracker = screenTracker;
    }
}
