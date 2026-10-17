package knk;

/* JADX INFO: loaded from: classes11.dex */
public final class j extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_single_offer.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f186182w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_single_offer.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f186182w |= Integer.MIN_VALUE;
        return this.v.K2(null, this);
    }
}
