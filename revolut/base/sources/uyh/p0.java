package uyh;

/* JADX INFO: loaded from: classes10.dex */
public final class p0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature_crypto_order_flow.impl.exchange.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f284390w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(com.revolut.feature_crypto_order_flow.impl.exchange.d dVar, gim.c cVar) {
        super(cVar);
        this.v = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f284390w |= Integer.MIN_VALUE;
        return this.v.P2(this);
    }
}
