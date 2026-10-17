package rth;

import com.revolut.shared.feature.workflow.engine.api.models.EligibilityStep;
import com.revolut.shared.feature.workflow.engine.api.models.WorkflowStepNavigation;

/* JADX INFO: loaded from: classes10.dex */
public final class h extends gim.c {
    public final /* synthetic */ j A;
    public int B;
    public EligibilityStep u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public EligibilityStep.Workflow f257247w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public WorkflowStepNavigation f257248x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f257249y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, gim.c cVar) {
        super(cVar);
        this.A = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return this.A.l(null, null, null, null, null, this);
    }
}
