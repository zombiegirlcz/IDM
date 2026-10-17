package hul;

/* JADX INFO: loaded from: classes12.dex */
public final class d0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.trading.orders.ui.invest.placement.screens.review.o v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f155713w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.revolut.trading.orders.ui.invest.placement.screens.review.o oVar, gim.c cVar) {
        super(cVar);
        this.v = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f155713w |= Integer.MIN_VALUE;
        return com.revolut.trading.orders.ui.invest.placement.screens.review.o.J2(this.v, this);
    }
}
