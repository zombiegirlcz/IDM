package hul;

/* JADX INFO: loaded from: classes12.dex */
public final class l0 extends gim.c {
    public nii.g u;
    public com.revolut.trading.orders.ui.invest.placement.screens.review.o v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f155742w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.trading.orders.ui.invest.placement.screens.review.o f155743x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f155744y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(com.revolut.trading.orders.ui.invest.placement.screens.review.o oVar, gim.c cVar) {
        super(cVar);
        this.f155743x = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f155742w = obj2;
        this.f155744y |= Integer.MIN_VALUE;
        return com.revolut.trading.orders.ui.invest.placement.screens.review.o.L2(this.f155743x, null, this);
    }
}
