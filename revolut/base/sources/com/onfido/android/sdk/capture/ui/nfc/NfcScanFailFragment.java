package com.onfido.android.sdk.capture.ui.nfc;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import ap0.f;
import com.onfido.android.sdk.capture.DocumentType;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.common.SdkController;
import com.onfido.android.sdk.capture.databinding.OnfidoFragmentNfcScanFailBinding;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.ScreenTracker;
import com.onfido.android.sdk.capture.ui.camera.view.PlaybackControlsVideoPlayerView;
import com.onfido.android.sdk.capture.ui.nfc.NfcFailedScreen;
import com.onfido.android.sdk.capture.ui.widget.OnfidoButton;
import com.onfido.android.sdk.capture.utils.ViewExtensionsKt;
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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0003J\b\u0010\u0016\u001a\u00020\u0015H\u0003J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u000e\u001a\u00020\u000f8\u0000@\u0000X\u0081.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/nfc/NfcScanFailFragment;", "Landroidx/fragment/app/Fragment;", "()V", "documentType", "Lcom/onfido/android/sdk/capture/DocumentType;", "getDocumentType", "()Lcom/onfido/android/sdk/capture/DocumentType;", "documentType$delegate", "Lkotlin/Lazy;", "nfcViewModel", "Lcom/onfido/android/sdk/capture/ui/nfc/NfcHostViewModel;", "getNfcViewModel", "()Lcom/onfido/android/sdk/capture/ui/nfc/NfcHostViewModel;", "nfcViewModel$delegate", "screenTracker", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/ScreenTracker;", "getScreenTracker$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/ScreenTracker;", "setScreenTracker$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/ScreenTracker;)V", "getErrorTitleRes", "", "getPrimaryActionRes", "onStart", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class NfcScanFailFragment extends Fragment {

    /* JADX INFO: renamed from: documentType$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy documentType;

    /* JADX INFO: renamed from: nfcViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy nfcViewModel;
    public ScreenTracker screenTracker;

    @NotNull
    private static final String SECONDARY_ACTION_KEY = "secondary_action_key";

    @NotNull
    private static final String FAILURE_REASON_KEY = "failure_reason_key";

    @NotNull
    private static final String ERROR_STATE_KEY = "error_state_key";

    @NotNull
    private static final String DOCUMENT_TYPE_KEY = "document_type_key";

    @NotNull
    private static final String PRIMARY_ACTION_KEY = "primary_action_key";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J2\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/nfc/NfcScanFailFragment$Companion;", "", "()V", "DOCUMENT_TYPE_KEY", "", "ERROR_STATE_KEY", "FAILURE_REASON_KEY", "PRIMARY_ACTION_KEY", "SECONDARY_ACTION_KEY", "createInstance", "Lcom/onfido/android/sdk/capture/ui/nfc/NfcScanFailFragment;", "documentType", "Lcom/onfido/android/sdk/capture/DocumentType;", "failureReason", "errorState", "Lcom/onfido/android/sdk/capture/ui/nfc/NfcFailedScreen$ErrorState;", "primaryAction", "Lcom/onfido/android/sdk/capture/ui/nfc/NfcFailedScreen$Actions;", "secondaryAction", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ NfcScanFailFragment createInstance$default(Companion companion, DocumentType documentType, String str, NfcFailedScreen.ErrorState errorState, NfcFailedScreen.Actions actions, NfcFailedScreen.Actions actions2, int i, Object obj2) {
            if ((i & 2) != 0) {
                str = "";
            }
            return companion.createInstance(documentType, str, errorState, actions, actions2);
        }

        @NotNull
        public final NfcScanFailFragment createInstance(DocumentType documentType, @NotNull String failureReason, @NotNull NfcFailedScreen.ErrorState errorState, @NotNull NfcFailedScreen.Actions primaryAction, @NotNull NfcFailedScreen.Actions secondaryAction) {
            Intrinsics.checkNotNullParameter(failureReason, "failureReason");
            Intrinsics.checkNotNullParameter(errorState, "errorState");
            Intrinsics.checkNotNullParameter(primaryAction, "primaryAction");
            Intrinsics.checkNotNullParameter(secondaryAction, "secondaryAction");
            NfcScanFailFragment nfcScanFailFragment = new NfcScanFailFragment();
            nfcScanFailFragment.setArguments(BundleKt.bundleOf(new Pair("document_type_key", documentType), new Pair("failure_reason_key", failureReason), new Pair("error_state_key", errorState), new Pair("primary_action_key", primaryAction), new Pair("secondary_action_key", secondaryAction)));
            return nfcScanFailFragment;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[NfcFailedScreen.Actions.Primary.values().length];
            try {
                iArr[NfcFailedScreen.Actions.Primary.Retry.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NfcFailedScreen.Actions.Primary.DifferentDocument.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[NfcFailedScreen.Actions.Secondary.values().length];
            try {
                iArr2[NfcFailedScreen.Actions.Secondary.Skip.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[NfcFailedScreen.Actions.Secondary.Exit.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public NfcScanFailFragment() {
        super(R.layout.onfido_fragment_nfc_scan_fail);
        Lazy lazyC = j.c(k.NONE, new NfcScanFailFragment$special$$inlined$viewModels$default$1(new NfcScanFailFragment$nfcViewModel$2(this)));
        this.nfcViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, o0.f186429a.b(NfcHostViewModel.class), new NfcScanFailFragment$special$$inlined$viewModels$default$2(lazyC), new NfcScanFailFragment$special$$inlined$viewModels$default$3(null, lazyC), new NfcScanFailFragment$special$$inlined$viewModels$default$4(this, lazyC));
        this.documentType = j.b(new NfcScanFailFragment$documentType$2(this));
    }

    private final DocumentType getDocumentType() {
        return (DocumentType) this.documentType.getValue();
    }

    private final int getErrorTitleRes() {
        return getDocumentType() == DocumentType.PASSPORT ? R.string.onfido_nfc_fail_passport_title : R.string.onfido_nfc_fail_card_title;
    }

    private final NfcHostViewModel getNfcViewModel() {
        return (NfcHostViewModel) this.nfcViewModel.getValue();
    }

    private final int getPrimaryActionRes() {
        return getDocumentType() == DocumentType.PASSPORT ? R.string.onfido_nfc_fail_passport_button_primary : R.string.onfido_nfc_fail_button_primary_card;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$3$lambda$0(NfcFailedScreen.Actions.Primary primaryAction, NfcScanFailFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(primaryAction, "$primaryAction");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int i = WhenMappings.$EnumSwitchMapping$0[primaryAction.ordinal()];
        if (i == 1) {
            this$0.getNfcViewModel().onRetryNfcClicked();
        } else {
            if (i != 2) {
                return;
            }
            this$0.getNfcViewModel().goToDocumentSelection();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$3$lambda$1(NfcFailedScreen.Actions.Secondary secondaryAction, NfcScanFailFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(secondaryAction, "$secondaryAction");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int i = WhenMappings.$EnumSwitchMapping$1[secondaryAction.ordinal()];
        if (i == 1) {
            this$0.getNfcViewModel().onSkipNfcScanAtRetryClicked();
        } else {
            if (i != 2) {
                return;
            }
            this$0.getNfcViewModel().exitFlowAtRetryClicked();
        }
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
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("failure_reason_key") : null;
        if (string == null) {
            string = "";
        }
        getScreenTracker$onfido_capture_sdk_core_release().trackNfcReadError$onfido_capture_sdk_core_release(string, getNfcViewModel().getExpectedNfcFlowType(), getNfcViewModel().getNfcOptions());
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        SdkController companion = SdkController.INSTANCE.getInstance();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        SdkController.getSdkComponent$default(companion, contextRequireContext, null, 2, null).inject$onfido_capture_sdk_core_release(this);
        super.onViewCreated(view, savedInstanceState);
        Parcelable parcelable = requireArguments().getParcelable("primary_action_key");
        Intrinsics.i(parcelable, "null cannot be cast to non-null type com.onfido.android.sdk.capture.ui.nfc.NfcFailedScreen.Actions.Primary");
        NfcFailedScreen.Actions.Primary primary = (NfcFailedScreen.Actions.Primary) parcelable;
        Parcelable parcelable2 = requireArguments().getParcelable("secondary_action_key");
        Intrinsics.i(parcelable2, "null cannot be cast to non-null type com.onfido.android.sdk.capture.ui.nfc.NfcFailedScreen.Actions.Secondary");
        NfcFailedScreen.Actions.Secondary secondary = (NfcFailedScreen.Actions.Secondary) parcelable2;
        OnfidoFragmentNfcScanFailBinding onfidoFragmentNfcScanFailBindingBind = OnfidoFragmentNfcScanFailBinding.bind(view);
        onfidoFragmentNfcScanFailBindingBind.primaryAction.setText$onfido_capture_sdk_core_release(primary.getTitle());
        if (secondary.getTitle() != 0) {
            onfidoFragmentNfcScanFailBindingBind.secondaryAction.setText$onfido_capture_sdk_core_release(secondary.getTitle());
        }
        OnfidoButton secondaryAction = onfidoFragmentNfcScanFailBindingBind.secondaryAction;
        Intrinsics.checkNotNullExpressionValue(secondaryAction, "secondaryAction");
        secondaryAction.setVisibility(secondary.getVisible() ? 0 : 8);
        onfidoFragmentNfcScanFailBindingBind.primaryAction.setText$onfido_capture_sdk_core_release(getPrimaryActionRes());
        onfidoFragmentNfcScanFailBindingBind.primaryAction.setOnClickListener(new f(primary, this, 9));
        onfidoFragmentNfcScanFailBindingBind.secondaryAction.setOnClickListener(new f(secondary, this, 10));
        onfidoFragmentNfcScanFailBindingBind.title.setText(getErrorTitleRes());
        LinearLayout stepsContainer = onfidoFragmentNfcScanFailBindingBind.stepsContainer;
        Intrinsics.checkNotNullExpressionValue(stepsContainer, "stepsContainer");
        ViewExtensionsKt.setInstructions(stepsContainer, getNfcViewModel().getFailureInstructions());
        PlaybackControlsVideoPlayerView playbackControlsVideoPlayerView = onfidoFragmentNfcScanFailBindingBind.videoView;
        Intrinsics.h(playbackControlsVideoPlayerView);
        ViewExtensionsKt.toVisible$default(playbackControlsVideoPlayerView, false, 1, null);
        playbackControlsVideoPlayerView.setLoading(false);
        playbackControlsVideoPlayerView.setVideoUrl(getNfcViewModel().getInstructionVideoPath(true));
    }

    public final void setScreenTracker$onfido_capture_sdk_core_release(@NotNull ScreenTracker screenTracker) {
        Intrinsics.checkNotNullParameter(screenTracker, "<set-?>");
        this.screenTracker = screenTracker;
    }
}
