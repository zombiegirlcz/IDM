package eik;

/* JADX INFO: loaded from: classes11.dex */
public final class m extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_sender.g v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f126678w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_sender.g gVar, gim.c cVar) {
        super(cVar);
        this.v = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f126678w |= Integer.MIN_VALUE;
        return this.v.K2(this);
    }
}
