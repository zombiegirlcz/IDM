package eik;

/* JADX INFO: loaded from: classes11.dex */
public final class l extends gim.c {
    public int u;
    public boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f126675w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_sender.g f126676x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f126677y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_sender.g gVar, gim.c cVar) {
        super(cVar);
        this.f126676x = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f126675w = obj2;
        this.f126677y |= Integer.MIN_VALUE;
        return this.f126676x.J2(0, false, this);
    }
}
