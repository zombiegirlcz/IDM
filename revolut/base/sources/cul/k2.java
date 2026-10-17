package cul;

/* JADX INFO: loaded from: classes12.dex */
public final class k2 extends gim.c {
    public u u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.trading.orders.ui.invest.placement.screens.edit.e f109129w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f109130x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar, gim.c cVar) {
        super(cVar);
        this.f109129w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f109130x |= Integer.MIN_VALUE;
        return com.revolut.trading.orders.ui.invest.placement.screens.edit.e.M2(this.f109129w, this);
    }
}
