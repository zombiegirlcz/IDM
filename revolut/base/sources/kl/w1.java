package kl;

import com.onfido.workflow.OnfidoWorkflow;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class w1 implements igm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c2 f185248a;

    public w1(c2 c2Var) {
        this.f185248a = c2Var;
    }

    @Override // igm.g
    public final void accept(Object obj2) {
        sl.w task = (sl.w) obj2;
        Intrinsics.checkNotNullParameter(task, "task");
        this.f185248a.D.onNext(new ml.i(new OnfidoWorkflow.WorkflowException.WorkflowUnsupportedTaskException(j6.a.q("Received unsupported task: ", task.f264072a), task.f264073b)));
    }
}
