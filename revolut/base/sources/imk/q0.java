package imk;

import com.revolut.data.model.Data;

/* JADX INFO: loaded from: classes11.dex */
public final class q0 extends gim.c {
    public Data u;
    public com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f162541w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.g f162542x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f162543y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.g gVar, gim.c cVar) {
        super(cVar);
        this.f162542x = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f162541w = obj2;
        this.f162543y |= Integer.MIN_VALUE;
        return com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.g.N2(this.f162542x, null, null, null, this);
    }
}
