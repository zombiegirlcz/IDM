package rth;

import com.revolut.shared.feature.workflow.engine.api.models.EligibilityStep;
import com.revolut.shared.feature.workflow.engine.api.models.WorkflowStepNavigation;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends gim.c {
    public boolean A;
    public long B;
    public /* synthetic */ Object C;
    public final /* synthetic */ j D;
    public int E;
    public EligibilityStep.Workflow u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public WorkflowStepNavigation f257241w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f257242x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f257243y;
    public xi0.a z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j jVar, gim.c cVar) {
        super(cVar);
        this.D = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.C = obj2;
        this.E |= Integer.MIN_VALUE;
        return this.D.i(null, null, null, null, this);
    }
}
