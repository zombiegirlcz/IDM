package uul;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends gim.c {
    public com.revolut.trading.orders.ui.invest.placement.wrapper_flow.b u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.trading.orders.ui.invest.placement.wrapper_flow.b f283247w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f283248x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.revolut.trading.orders.ui.invest.placement.wrapper_flow.b bVar, gim.c cVar) {
        super(cVar);
        this.f283247w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f283248x |= Integer.MIN_VALUE;
        return com.revolut.trading.orders.ui.invest.placement.wrapper_flow.b.J2(this.f283247w, null, this);
    }
}
