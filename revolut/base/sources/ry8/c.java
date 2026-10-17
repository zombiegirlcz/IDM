package ry8;

import com.onfido.android.sdk.capture.ExitCode;
import com.onfido.workflow.OnfidoWorkflow;
import com.revolut.feature.kyc.shared.exception.KycException;
import ihm.j;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import my8.s;
import my8.t;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements OnfidoWorkflow.ResultListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f258260a;

    public c(d dVar) {
        this.f258260a = dVar;
    }

    @Override // com.onfido.workflow.OnfidoWorkflow.ResultListener
    public final void onException(OnfidoWorkflow.WorkflowException exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        KycException kycException = new KycException("ONFIDO_STUDIO_EXCEPTION", exception);
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, kycException, h0Var);
        d dVar = this.f258260a;
        j jVar = dVar.f258265m;
        t tVar = t.ERROR;
        dVar.f258264l.getClass();
        jVar.onNext(new s(tVar, vw8.a.a()));
    }

    @Override // com.onfido.workflow.OnfidoWorkflow.ResultListener
    public final void onUserCompleted() {
        this.f258260a.f258265m.onNext(new s(t.SUCCESS, null));
    }

    @Override // com.onfido.workflow.OnfidoWorkflow.ResultListener
    public final void onUserExited(ExitCode exitCode) {
        Intrinsics.checkNotNullParameter(exitCode, "exitCode");
        this.f258260a.f258265m.onNext(new s(t.CANCEL, null));
    }
}
