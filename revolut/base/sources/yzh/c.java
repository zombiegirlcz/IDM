package yzh;

import com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends gim.c {
    public CryptoOrderDraft u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f318108w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f318109x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, gim.c cVar) {
        super(cVar);
        this.f318108w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f318109x |= Integer.MIN_VALUE;
        return this.f318108w.b3(null, this);
    }
}
