package rgk;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends gim.c {
    public p u;
    public c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public com.revolut.retail.feature.pricing_plans.ui.impl.flow.action.b f254207w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f254208x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.flow.action.b f254209y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.revolut.retail.feature.pricing_plans.ui.impl.flow.action.b bVar, gim.c cVar) {
        super(cVar);
        this.f254209y = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f254208x = obj2;
        this.z |= Integer.MIN_VALUE;
        return com.revolut.retail.feature.pricing_plans.ui.impl.flow.action.b.Z2(this.f254209y, null, null, null, this);
    }
}
