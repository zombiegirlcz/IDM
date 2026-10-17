package uyh;

import com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft;

/* JADX INFO: loaded from: classes10.dex */
public final class y extends gim.c {
    public CryptoOrderDraft u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature_crypto_order_flow.impl.exchange.d f284423w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f284424x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.revolut.feature_crypto_order_flow.impl.exchange.d dVar, gim.c cVar) {
        super(cVar);
        this.f284423w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f284424x |= Integer.MIN_VALUE;
        return com.revolut.feature_crypto_order_flow.impl.exchange.d.I2(this.f284423w, null, this);
    }
}
