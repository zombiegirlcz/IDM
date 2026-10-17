package com.onfido.android.sdk.capture.core.features.document;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContract;
import com.onfido.android.sdk.capture.DocumentType;
import com.onfido.android.sdk.capture.OnfidoConfig;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.core.config.FailureReason;
import com.onfido.android.sdk.capture.core.config.Flow;
import com.onfido.android.sdk.capture.core.config.FlowFragment;
import com.onfido.android.sdk.capture.core.features.document.DocumentCaptureFlow;
import com.onfido.android.sdk.capture.core.features.face.FaceCaptureFlow;
import com.onfido.android.sdk.capture.document.DocumentPages;
import com.onfido.android.sdk.capture.flow.NfcArguments;
import com.onfido.android.sdk.capture.model.NFCOptions;
import com.onfido.android.sdk.capture.ui.camera.CaptureActivity;
import com.onfido.android.sdk.capture.ui.documentselection.host.DocumentSelectionHostFragment;
import com.onfido.android.sdk.capture.utils.CountryCode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016R\u001c\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/onfido/android/sdk/capture/core/features/document/DocumentCaptureFlowFragment;", "Lcom/onfido/android/sdk/capture/core/config/FlowFragment;", "()V", "onfidoLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/onfido/android/sdk/capture/ui/documentselection/host/DocumentSelectionHostFragment$DocumentSelectionResult$Completed;", "kotlin.jvm.PlatformType", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Launcher", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DocumentCaptureFlowFragment extends FlowFragment {

    @NotNull
    private final ActivityResultLauncher<DocumentSelectionHostFragment.DocumentSelectionResult.Completed> onfidoLauncher;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u001a\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u000e"}, d2 = {"Lcom/onfido/android/sdk/capture/core/features/document/DocumentCaptureFlowFragment$Launcher;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/onfido/android/sdk/capture/ui/documentselection/host/DocumentSelectionHostFragment$DocumentSelectionResult$Completed;", "Lcom/onfido/android/sdk/capture/core/config/Flow$Result;", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "parseResult", "resultCode", "", "intent", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Launcher extends ActivityResultContract<DocumentSelectionHostFragment.DocumentSelectionResult.Completed, Flow.Result> {

        @NotNull
        public static final Launcher INSTANCE = new Launcher();

        private Launcher() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.view.result.contract.ActivityResultContract
        @NotNull
        public Intent createIntent(@NotNull Context context, @NotNull DocumentSelectionHostFragment.DocumentSelectionResult.Completed input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            CaptureActivity.Companion companion = CaptureActivity.INSTANCE;
            DocumentType documentType = input.getDocumentType();
            CountryCode countryCode = input.getCountryCode();
            NfcArguments nfcArguments = new NfcArguments(NFCOptions.Disabled.INSTANCE, null, 2, 0 == true ? 1 : 0);
            DocumentPages genericDocPages = input.getGenericDocPages();
            return CaptureActivity.Companion.createDocumentIntent$default(companion, context, new OnfidoConfig.Builder(context).build(), true, documentType, countryCode, null, nfcArguments, false, input.getGenericDocTitle(), genericDocPages, 128, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.view.result.contract.ActivityResultContract
        @NotNull
        public Flow.Result parseResult(int resultCode, Intent intent) {
            return (resultCode != -1 || intent == null) ? new FaceCaptureFlow.Result.Failed(FailureReason.Canceled.INSTANCE) : new FaceCaptureFlow.Result.Success(CaptureActivity.INSTANCE.getUploadedFileId(intent));
        }
    }

    public DocumentCaptureFlowFragment() {
        super(R.layout.onfido_fragment_document_capture);
        ActivityResultLauncher<DocumentSelectionHostFragment.DocumentSelectionResult.Completed> activityResultLauncherRegisterForActivityResult = registerForActivityResult(Launcher.INSTANCE, new a(this));
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.onfidoLauncher = activityResultLauncherRegisterForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$1(DocumentCaptureFlowFragment this$0, String str, Bundle result) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(str, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(result, "result");
        DocumentSelectionHostFragment.DocumentSelectionResult result2 = DocumentSelectionHostFragment.INSTANCE.getResult(result);
        if (result2 instanceof DocumentSelectionHostFragment.DocumentSelectionResult.Completed) {
            this$0.onfidoLauncher.launch((DocumentSelectionHostFragment.DocumentSelectionResult.Completed) result2);
        } else {
            this$0.finishFlow(new DocumentCaptureFlow.Result.Failed(FailureReason.Canceled.INSTANCE));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onfidoLauncher$lambda$0(DocumentCaptureFlowFragment this$0, Flow.Result result) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.h(result);
        this$0.finishFlow(result);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            DocumentSelectionHostFragment documentSelectionHostFragmentCreateInstance$default = DocumentSelectionHostFragment.Companion.createInstance$default(DocumentSelectionHostFragment.INSTANCE, null, "request", false, false, 8, null);
            getChildFragmentManager().setFragmentResultListener("request", this, new a(this));
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            FragmentTransaction fragmentTransactionBeginTransaction = childFragmentManager.beginTransaction();
            Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "beginTransaction()");
            fragmentTransactionBeginTransaction.setReorderingAllowed(true);
            fragmentTransactionBeginTransaction.replace(R.id.container, documentSelectionHostFragmentCreateInstance$default);
            fragmentTransactionBeginTransaction.commit();
        }
    }
}
