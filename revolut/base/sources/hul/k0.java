package hul;

/* JADX INFO: loaded from: classes12.dex */
public final class k0 extends gim.c {
    public String u;
    public Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f155738w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.trading.orders.ui.invest.placement.screens.review.o f155739x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f155740y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(com.revolut.trading.orders.ui.invest.placement.screens.review.o oVar, gim.c cVar) {
        super(cVar);
        this.f155739x = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f155738w = obj2;
        this.f155740y |= Integer.MIN_VALUE;
        return this.f155739x.N2(this);
    }
}
