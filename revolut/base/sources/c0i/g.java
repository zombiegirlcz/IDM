package c0i;

import com.revolut.feature.exchange.models.ExchangeResult;
import com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends gim.c {
    public CryptoOrderDraft u;
    public ExchangeResult.Success v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f20286w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ h f20287x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f20288y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, gim.c cVar) {
        super(cVar);
        this.f20287x = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f20286w = obj2;
        this.f20288y |= Integer.MIN_VALUE;
        return this.f20287x.a(null, this);
    }
}
