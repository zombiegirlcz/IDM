package knk;

import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$PlanPageLayout$BillingOptionItem;

/* JADX INFO: loaded from: classes11.dex */
public final class k extends gim.c {
    public PlansDashboardLayout$PlanPageLayout$BillingOptionItem u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_single_offer.a f186183w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f186184x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_single_offer.a aVar, gim.c cVar) {
        super(cVar);
        this.f186183w = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f186184x |= Integer.MIN_VALUE;
        return this.f186183w.M2(this);
    }
}
