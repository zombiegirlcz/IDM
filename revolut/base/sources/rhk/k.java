package rhk;

/* JADX INFO: loaded from: classes11.dex */
public final class k extends gim.c {
    public com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_change.b u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_change.b f254523w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f254524x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_change.b bVar, gim.c cVar) {
        super(cVar);
        this.f254523w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f254524x |= Integer.MIN_VALUE;
        return com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_change.b.J2(this.f254523w, null, null, this);
    }
}
