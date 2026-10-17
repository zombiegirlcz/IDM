package cul;

/* JADX INFO: loaded from: classes12.dex */
public final class m2 extends gim.c {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.trading.orders.ui.invest.placement.screens.edit.e f109138w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f109139x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar, gim.c cVar) {
        super(cVar);
        this.f109138w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f109139x |= Integer.MIN_VALUE;
        return this.f109138w.k3(0, this);
    }
}
