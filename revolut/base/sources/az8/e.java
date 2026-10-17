package az8;

import com.onfido.android.sdk.capture.ExitCode;
import com.onfido.workflow.OnfidoWorkflow;
import com.revolut.feature.kyc.shared.exception.KycException;
import com.revolut.feature.kyc_documents_scan.ui.onfido.OnfidoScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import my8.s;
import my8.t;
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements OnfidoWorkflow.ResultListener {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OnfidoScreen f11406a;

    public e(ViewController viewController, vw8.a documentScanResourcesProvider) {
        Intrinsics.checkNotNullParameter(viewController, "viewController");
        Intrinsics.checkNotNullParameter(documentScanResourcesProvider, "documentScanResourcesProvider");
        this.f11406a = (OnfidoScreen) viewController;
    }

    @Override // com.onfido.workflow.OnfidoWorkflow.ResultListener
    public final void onException(OnfidoWorkflow.WorkflowException exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        KycException kycException = new KycException("ONFIDO_STUDIO_EXCEPTION", exception);
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, kycException, h0Var);
        this.f11406a.c3(new yy8.c(new s(t.ERROR, vw8.a.a())));
    }

    @Override // com.onfido.workflow.OnfidoWorkflow.ResultListener
    public final void onUserCompleted() {
        this.f11406a.c3(new yy8.c(new s(t.SUCCESS, null)));
    }

    @Override // com.onfido.workflow.OnfidoWorkflow.ResultListener
    public final void onUserExited(ExitCode exitCode) {
        Intrinsics.checkNotNullParameter(exitCode, "exitCode");
        this.f11406a.c3(new yy8.c(new s(t.CANCEL, null)));
    }
}
