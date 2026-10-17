package cul;

/* JADX INFO: loaded from: classes12.dex */
public final class w1 extends gim.c {
    public k4l.r0 u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.trading.orders.ui.invest.placement.screens.edit.e f109197w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f109198x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar, gim.c cVar) {
        super(cVar);
        this.f109197w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f109198x |= Integer.MIN_VALUE;
        return this.f109197w.d3(null, this);
    }
}
