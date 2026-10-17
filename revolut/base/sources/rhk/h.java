package rhk;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_change.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f254518w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_change.b bVar, gim.c cVar) {
        super(cVar);
        this.v = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f254518w |= Integer.MIN_VALUE;
        return com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_change.b.I2(this.v, null, this);
    }
}
