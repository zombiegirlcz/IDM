package vrl;

import com.revolut.retail.trading.core.domain.orders.InvestOrder;

/* JADX INFO: loaded from: classes12.dex */
public final class j extends gim.c {
    public InvestOrder u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f291640w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f291641x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m mVar, gim.c cVar) {
        super(cVar);
        this.f291640w = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f291641x |= Integer.MIN_VALUE;
        return this.f291640w.b(null, this);
    }
}
