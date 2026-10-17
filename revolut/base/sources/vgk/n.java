package vgk;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
public final class n extends gim.c {
    public Function2 u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.d f289207w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f289208x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.d dVar, gim.c cVar) {
        super(cVar);
        this.f289207w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f289208x |= Integer.MIN_VALUE;
        return com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.d.K2(this.f289207w, null, null, null, this);
    }
}
