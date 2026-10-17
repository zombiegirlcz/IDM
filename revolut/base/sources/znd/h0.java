package znd;

/* JADX INFO: loaded from: classes7.dex */
public final class h0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f323759w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.b bVar, gim.c cVar) {
        super(cVar);
        this.v = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f323759w |= Integer.MIN_VALUE;
        return this.v.L2(null, this);
    }
}
