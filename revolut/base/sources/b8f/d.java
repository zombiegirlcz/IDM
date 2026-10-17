package b8f;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_reveal.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f13228w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_reveal.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f13228w |= Integer.MIN_VALUE;
        return com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_reveal.a.I2(this.v, this);
    }
}
