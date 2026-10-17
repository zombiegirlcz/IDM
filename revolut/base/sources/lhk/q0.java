package lhk;

import com.revolut.feature.pricingplans.models.PricingPlanSubscription;

/* JADX INFO: loaded from: classes11.dex */
public final class q0 extends gim.c {
    public k u;
    public PricingPlanSubscription v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f195370w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ r0 f195371x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f195372y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(r0 r0Var, gim.c cVar) {
        super(cVar);
        this.f195371x = r0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f195370w = obj2;
        this.f195372y |= Integer.MIN_VALUE;
        return this.f195371x.h(null, this);
    }
}
