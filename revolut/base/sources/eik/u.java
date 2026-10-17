package eik;

/* JADX INFO: loaded from: classes11.dex */
public final class u extends gim.c {
    public zm3.l u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_sender.g f126689w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f126690x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_sender.g gVar, gim.c cVar) {
        super(cVar);
        this.f126689w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f126690x |= Integer.MIN_VALUE;
        return this.f126689w.Q2(null, this);
    }
}
