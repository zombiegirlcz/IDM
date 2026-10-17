package kl;

import com.onfido.workflow.OnfidoWorkflow;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class h1 implements igm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c2 f185184a;

    public h1(c2 c2Var) {
        this.f185184a = c2Var;
    }

    @Override // igm.g
    public final void accept(Object obj2) {
        tl.a it8 = (tl.a) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        c2 c2Var = this.f185184a;
        c2Var.f185157w.trackFlowCancellation();
        c2Var.D.onNext(new ml.i(new OnfidoWorkflow.WorkflowException.WorkflowCaptureCancelledException("Workflow has been exited by the user")));
    }
}
