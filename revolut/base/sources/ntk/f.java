package ntk;

import nel.n;

/* JADX INFO: loaded from: classes12.dex */
public final class f extends gim.c {
    public n u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.stockdetails.impl.ui.flows.asset_details.a f219148w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f219149x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.revolut.retail.feature.stockdetails.impl.ui.flows.asset_details.a aVar, gim.c cVar) {
        super(cVar);
        this.f219148w = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f219149x |= Integer.MIN_VALUE;
        return this.f219148w.I2(null, null, this);
    }
}
