package pik;

import com.revolut.feature.pricingplans.models.PricingPlanSubscription;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends gim.c {
    public PricingPlanSubscription u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_switch_entry.a f236610w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f236611x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_switch_entry.a aVar, gim.c cVar) {
        super(cVar);
        this.f236610w = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f236611x |= Integer.MIN_VALUE;
        return com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_switch_entry.a.I2(this.f236610w, null, this);
    }
}
