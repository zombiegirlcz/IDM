package lhk;

import com.revolut.feature.pricingplans.models.PricingPlanSubscription;

/* JADX INFO: loaded from: classes11.dex */
public final class j0 extends gim.c {
    public PricingPlanSubscription u;
    public PricingPlanSubscription v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f195352w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ r0 f195353x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f195354y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(r0 r0Var, gim.c cVar) {
        super(cVar);
        this.f195353x = r0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f195352w = obj2;
        this.f195354y |= Integer.MIN_VALUE;
        return this.f195353x.a(null, null, this);
    }
}
