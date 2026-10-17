package rth;

import com.revolut.shared.feature.workflow.engine.api.models.WorkflowStepNavigation;

/* JADX INFO: loaded from: classes10.dex */
public final class m extends gim.c {
    public ril.d u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public WorkflowStepNavigation f257257w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f257258x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ o f257259y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o oVar, gim.c cVar) {
        super(cVar);
        this.f257259y = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f257258x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f257259y.b(null, null, this);
    }
}
