package dlk;

/* JADX INFO: loaded from: classes11.dex */
public final class m extends gim.c {
    public e u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.e f115793w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f115794x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.e eVar, gim.c cVar) {
        super(cVar);
        this.f115793w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f115794x |= Integer.MIN_VALUE;
        return com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.e.J2(this.f115793w, null, this);
    }
}
