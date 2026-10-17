package jhk;

/* JADX INFO: loaded from: classes11.dex */
public final class q extends gim.c {
    public hha.d u;
    public hha.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public bib.b f174307w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f174308x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_selection.b f174309y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_selection.b bVar, gim.c cVar) {
        super(cVar);
        this.f174309y = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f174308x = obj2;
        this.z |= Integer.MIN_VALUE;
        return com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_selection.b.I2(this.f174309y, null, null, null, this);
    }
}
