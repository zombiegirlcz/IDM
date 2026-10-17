package jzh;

import com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft;

/* JADX INFO: loaded from: classes10.dex */
public final class t0 extends gim.c {
    public CryptoOrderDraft u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature_crypto_order_flow.impl.order_summary.a f179856w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f179857x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(com.revolut.feature_crypto_order_flow.impl.order_summary.a aVar, gim.c cVar) {
        super(cVar);
        this.f179856w = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f179857x |= Integer.MIN_VALUE;
        return com.revolut.feature_crypto_order_flow.impl.order_summary.a.J2(this.f179856w, this);
    }
}
