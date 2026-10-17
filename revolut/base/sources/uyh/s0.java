package uyh;

import com.revolut.core.model.account.AccountId;

/* JADX INFO: loaded from: classes10.dex */
public final class s0 extends gim.c {
    public AccountId u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature_crypto_order_flow.impl.exchange.d f284404w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f284405x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(com.revolut.feature_crypto_order_flow.impl.exchange.d dVar, gim.c cVar) {
        super(cVar);
        this.f284404w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f284405x |= Integer.MIN_VALUE;
        return this.f284404w.R2(null, this, null);
    }
}
