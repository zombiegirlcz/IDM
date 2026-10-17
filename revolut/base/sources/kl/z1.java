package kl;

import com.onfido.hosted.web.module.model.HostedWebModuleFailed;
import com.onfido.workflow.OnfidoWorkflow;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class z1 implements igm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c2 f185257a;

    public z1(c2 c2Var) {
        this.f185257a = c2Var;
    }

    @Override // igm.g
    public final void accept(Object obj2) {
        HostedWebModuleFailed it8 = (HostedWebModuleFailed) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        this.f185257a.D.onNext(new ml.i(new OnfidoWorkflow.WorkflowException.WorkflowUnknownException(it8.getBody(), null, 2, null)));
    }
}
