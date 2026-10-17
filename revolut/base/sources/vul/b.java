package vul;

import com.revolut.feature.trading_orders.api.invest.placement.InvestOrderContract$InputData;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends gim.c {
    public InvestOrderContract$InputData u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f292409w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f292410x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f292409w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f292410x |= Integer.MIN_VALUE;
        return this.f292409w.b(null, this);
    }
}
