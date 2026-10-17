package cik;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_claim.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f24560w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_claim.c cVar, gim.c cVar2) {
        super(cVar2);
        this.v = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f24560w |= Integer.MIN_VALUE;
        return com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_claim.c.I2(this.v, null, this);
    }
}
