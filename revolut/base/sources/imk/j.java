package imk;

/* JADX INFO: loaded from: classes11.dex */
public final class j extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f162518w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f162518w |= Integer.MIN_VALUE;
        return this.v.d(null, this);
    }
}
