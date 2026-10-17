package s6f;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.trading.managed_portfolios.impl.ui.details.flow.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f260338w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.revolut.feature.trading.managed_portfolios.impl.ui.details.flow.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f260338w |= Integer.MIN_VALUE;
        return this.v.J2(null, null, this);
    }
}
