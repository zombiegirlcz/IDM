package kl;

import com.onfido.workflow.OnfidoWorkflow;
import io.reactivex.rxjava3.subjects.PublishSubject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class e1 implements igm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c2 f185179a;

    public e1(c2 c2Var) {
        this.f185179a = c2Var;
    }

    @Override // igm.g
    public final void accept(Object obj2) {
        sl.r result = (sl.r) obj2;
        c2 c2Var = this.f185179a;
        PublishSubject publishSubject = c2Var.D;
        Intrinsics.checkNotNullParameter(result, "result");
        OnfidoWorkflow.WorkflowException workflowException = result.f264063a;
        if (workflowException != null) {
            publishSubject.onNext(new ml.i(workflowException));
        } else {
            publishSubject.onNext(new ml.l());
            c2Var.f185157w.trackFlowCompletion();
        }
    }
}
