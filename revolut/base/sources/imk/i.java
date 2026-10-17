package imk;

import com.revolut.retail.feature.pricing_plans.ui.api.models.PlanHubProductArticle;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends gim.c {
    public PlanHubProductArticle u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.a f162516w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f162517x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.a aVar, gim.c cVar) {
        super(cVar);
        this.f162516w = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f162517x |= Integer.MIN_VALUE;
        return com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.a.a(this.f162516w, null, this);
    }
}
