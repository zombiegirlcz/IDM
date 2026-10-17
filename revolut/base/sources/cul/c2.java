package cul;

/* JADX INFO: loaded from: classes12.dex */
public final class c2 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.trading.orders.ui.invest.placement.screens.edit.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f109083w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar, gim.c cVar) {
        super(cVar);
        this.v = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f109083w |= Integer.MIN_VALUE;
        return com.revolut.trading.orders.ui.invest.placement.screens.edit.e.L2(this.v, this);
    }
}
