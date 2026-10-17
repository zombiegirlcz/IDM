package dtl;

import com.revolut.retail.trading.core.domain.orders.InvestOrder;

/* JADX INFO: loaded from: classes12.dex */
public final class l extends gim.c {
    public InvestOrder.InvestSecuritiesOrder u;
    public c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f117478w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ m f117479x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f117480y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, gim.c cVar) {
        super(cVar);
        this.f117479x = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f117478w = obj2;
        this.f117480y |= Integer.MIN_VALUE;
        return this.f117479x.c3(null, null, this);
    }
}
