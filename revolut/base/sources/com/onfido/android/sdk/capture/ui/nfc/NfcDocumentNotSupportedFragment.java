package com.onfido.android.sdk.capture.ui.nfc;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.common.SdkController;
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
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u001a\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\t\u001a\u00020\n8\u0000@\u0000X\u0081.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/nfc/NfcDocumentNotSupportedFragment;", "Landroidx/fragment/app/Fragment;", "()V", "nfcViewModel", "Lcom/onfido/android/sdk/capture/ui/nfc/NfcHostViewModel;", "getNfcViewModel", "()Lcom/onfido/android/sdk/capture/ui/nfc/NfcHostViewModel;", "nfcViewModel$delegate", "Lkotlin/Lazy;", "screenTracker", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/ScreenTracker;", "getScreenTracker$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/ScreenTracker;", "setScreenTracker$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/ScreenTracker;)V", "getPrimaryButtonText", "", "onStart", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class NfcDocumentNotSupportedFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: nfcViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy nfcViewModel;
    public ScreenTracker screenTracker;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/nfc/NfcDocumentNotSupportedFragment$Companion;", "", "()V", "createInstance", "Lcom/onfido/android/sdk/capture/ui/nfc/NfcDocumentNotSupportedFragment;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final NfcDocumentNotSupportedFragment createInstance() {
            return new NfcDocumentNotSupportedFragment();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public NfcDocumentNotSupportedFragment() {
        super(R.layout.onfido_fragment_nfc_document_not_supported);
        Lazy lazyC = j.c(k.NONE, new NfcDocumentNotSupportedFragment$special$$inlined$viewModels$default$1(new NfcDocumentNotSupportedFragment$nfcViewModel$2(this)));
        this.nfcViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, o0.f186429a.b(NfcHostViewModel.class), new NfcDocumentNotSupportedFragment$special$$inlined$viewModels$default$2(lazyC), new NfcDocumentNotSupportedFragment$special$$inlined$viewModels$default$3(null, lazyC), new NfcDocumentNotSupportedFragment$special$$inlined$viewModels$default$4(this, lazyC));
    }

    @NotNull
    public static final NfcDocumentNotSupportedFragment createInstance() {
        return INSTANCE.createInstance();
    }

    private final NfcHostViewModel getNfcViewModel() {
        return (NfcHostViewModel) this.nfcViewModel.getValue();
    }

    private final int getPrimaryButtonText() {
        return getNfcViewModel().getIsOnlyOneDocAvailable() ? R.string.onfido_nfc_scan_error_document_alt_primary_button : R.string.onfido_nfc_scan_error_document_primary_button;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$0(NfcDocumentNotSupportedFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getNfcViewModel().exitFlowAtDocumentNotSupportedClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$2$lambda$1(NfcDocumentNotSupportedFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getNfcViewModel().restartDocumentCapture();
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
    public void onStart() {
        super.onStart();
        getScreenTracker$onfido_capture_sdk_core_release().trackNfcDocumentNotSupported$onfido_capture_sdk_core_release();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        SdkController companion = SdkController.INSTANCE.getInstance();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        SdkController.getSdkComponent$default(companion, contextRequireContext, null, 2, null).inject$onfido_capture_sdk_core_release(this);
        super.onViewCreated(view, savedInstanceState);
        final int i = 0;
        view.findViewById(R.id.btnExit).setOnClickListener(new View.OnClickListener(this) { // from class: com.onfido.android.sdk.capture.ui.nfc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NfcDocumentNotSupportedFragment f50070b;

            {
                this.f50070b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        NfcDocumentNotSupportedFragment.onViewCreated$lambda$0(this.f50070b, view2);
                        break;
                    default:
                        NfcDocumentNotSupportedFragment.onViewCreated$lambda$2$lambda$1(this.f50070b, view2);
                        break;
                }
            }
        });
        OnfidoButton onfidoButton = (OnfidoButton) view.findViewById(R.id.btnPrimary);
        onfidoButton.setText$onfido_capture_sdk_core_release(getPrimaryButtonText());
        final int i2 = 1;
        onfidoButton.setOnClickListener(new View.OnClickListener(this) { // from class: com.onfido.android.sdk.capture.ui.nfc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NfcDocumentNotSupportedFragment f50070b;

            {
                this.f50070b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i2) {
                    case 0:
                        NfcDocumentNotSupportedFragment.onViewCreated$lambda$0(this.f50070b, view2);
                        break;
                    default:
                        NfcDocumentNotSupportedFragment.onViewCreated$lambda$2$lambda$1(this.f50070b, view2);
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
