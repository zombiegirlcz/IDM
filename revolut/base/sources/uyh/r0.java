package uyh;

import com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft;

/* JADX INFO: loaded from: classes10.dex */
public final class r0 extends gim.c {
    public q u;
    public CryptoOrderDraft v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f284400w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature_crypto_order_flow.impl.exchange.d f284401x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f284402y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(com.revolut.feature_crypto_order_flow.impl.exchange.d dVar, gim.c cVar) {
        super(cVar);
        this.f284401x = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f284400w = obj2;
        this.f284402y |= Integer.MIN_VALUE;
        return com.revolut.feature_crypto_order_flow.impl.exchange.d.L2(this.f284401x, null, this);
    }
}
