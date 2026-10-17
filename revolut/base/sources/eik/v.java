package eik;

/* JADX INFO: loaded from: classes11.dex */
public final class v extends gim.c {
    public pck.d u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_sender.g f126691w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f126692x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_sender.g gVar, gim.c cVar) {
        super(cVar);
        this.f126691w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f126692x |= Integer.MIN_VALUE;
        return this.f126691w.R2(null, this);
    }
}
