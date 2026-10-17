package znd;

/* JADX INFO: loaded from: classes7.dex */
public final class g0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f323755w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.b bVar, gim.c cVar) {
        super(cVar);
        this.v = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f323755w |= Integer.MIN_VALUE;
        return com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.b.I2(this.v, null, null, this);
    }
}
