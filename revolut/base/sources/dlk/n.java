package dlk;

/* JADX INFO: loaded from: classes11.dex */
public final class n extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f115795w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.e eVar, gim.c cVar) {
        super(cVar);
        this.v = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f115795w |= Integer.MIN_VALUE;
        return com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.e.K2(this.v, this);
    }
}
