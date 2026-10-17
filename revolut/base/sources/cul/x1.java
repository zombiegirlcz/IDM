package cul;

/* JADX INFO: loaded from: classes12.dex */
public final class x1 extends gim.c {
    public com.revolut.trading.orders.ui.invest.placement.screens.edit.e u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.trading.orders.ui.invest.placement.screens.edit.e f109204w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f109205x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar, gim.c cVar) {
        super(cVar);
        this.f109204w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f109205x |= Integer.MIN_VALUE;
        return com.revolut.trading.orders.ui.invest.placement.screens.edit.e.J2(this.f109204w, null, this);
    }
}
