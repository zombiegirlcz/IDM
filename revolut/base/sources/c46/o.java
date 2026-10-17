package c46;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.defi.exchange.impl.ui.exchange_summary.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f21098w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.revolut.feature.defi.exchange.impl.ui.exchange_summary.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f21098w |= Integer.MIN_VALUE;
        return com.revolut.feature.defi.exchange.impl.ui.exchange_summary.a.I2(this.v, this);
    }
}
