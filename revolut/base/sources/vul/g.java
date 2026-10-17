package vul;

import com.revolut.feature.trading_orders.api.invest.placement.InvestOrderContract$InputData;

/* JADX INFO: loaded from: classes12.dex */
public final class g extends gim.c {
    public InvestOrderContract$InputData u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f292418w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f292419x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, gim.c cVar) {
        super(cVar);
        this.f292418w = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f292419x |= Integer.MIN_VALUE;
        return this.f292418w.c(null, this);
    }
}
