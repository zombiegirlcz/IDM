package hul;

import com.revolut.trading.orders.ui.invest.placement.models.InvestOrderDraft;

/* JADX INFO: loaded from: classes12.dex */
public final class m0 extends gim.c {
    public final /* synthetic */ com.revolut.trading.orders.ui.invest.placement.screens.review.o A;
    public int B;
    public nel.n u;
    public bfl.g v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public InvestOrderDraft f155746w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f155747x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f155748y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(com.revolut.trading.orders.ui.invest.placement.screens.review.o oVar, gim.c cVar) {
        super(cVar);
        this.A = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return com.revolut.trading.orders.ui.invest.placement.screens.review.o.M2(this.A, null, this);
    }
}
