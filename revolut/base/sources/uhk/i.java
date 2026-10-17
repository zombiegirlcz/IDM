package uhk;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_downgrade.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f280267w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_downgrade.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f280267w |= Integer.MIN_VALUE;
        return com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_downgrade.a.I2(this.v, this);
    }
}
