package qzh;

import com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends gim.c {
    public CryptoOrderDraft u;
    public e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f250635w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e f250636x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f250637y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, gim.c cVar) {
        super(cVar);
        this.f250636x = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f250635w = obj2;
        this.f250637y |= Integer.MIN_VALUE;
        return this.f250636x.b3(null, this);
    }
}
