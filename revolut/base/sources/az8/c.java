package az8;

import com.onfido.android.sdk.capture.ExitCode;
import com.onfido.android.sdk.capture.Onfido;
import com.onfido.android.sdk.capture.errors.OnfidoException;
import com.onfido.android.sdk.capture.upload.Captures;
import com.onfido.android.sdk.capture.upload.Document;
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
public final class c implements Onfido.OnfidoResultListener {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OnfidoScreen f11405a;

    public c(ViewController viewController, vw8.a documentScanResourcesProvider) {
        Intrinsics.checkNotNullParameter(viewController, "viewController");
        Intrinsics.checkNotNullParameter(documentScanResourcesProvider, "documentScanResourcesProvider");
        this.f11405a = (OnfidoScreen) viewController;
    }

    @Override // com.onfido.android.sdk.capture.Onfido.OnfidoResultListener
    public final void onError(OnfidoException exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        KycException kycException = new KycException("ONFIDO_EXCEPTION", exception);
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, kycException, h0Var);
        this.f11405a.c3(new yy8.c(new s(t.ERROR, vw8.a.a())));
    }

    @Override // com.onfido.android.sdk.capture.Onfido.OnfidoResultListener
    public final void userCompleted(Captures captures) {
        Intrinsics.checkNotNullParameter(captures, "captures");
        Document document = captures.getDocument();
        OnfidoScreen onfidoScreen = this.f11405a;
        if (document == null || (document.getBack() == null && document.getFront() == null)) {
            onfidoScreen.c3(new yy8.c(new s(t.ERROR, vw8.a.a())));
        } else {
            onfidoScreen.c3(new yy8.c(new s(t.SUCCESS, null)));
        }
    }

    @Override // com.onfido.android.sdk.capture.Onfido.OnfidoResultListener
    public final void userExited(ExitCode exitCode) {
        Intrinsics.checkNotNullParameter(exitCode, "exitCode");
        int i = b.f11404a[exitCode.ordinal()];
        t tVar = (i == 1 || i == 2 || i != 3) ? t.CANCEL : t.SKIP;
        this.f11405a.c3(new yy8.c(new s(tVar, null)));
    }
}
