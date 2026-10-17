package uyh;

import com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class o0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f284384a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bzh.f f284385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature_crypto_order_flow.impl.exchange.d f284386c;

    public /* synthetic */ o0(bzh.f fVar, com.revolut.feature_crypto_order_flow.impl.exchange.d dVar) {
        this.f284385b = fVar;
        this.f284386c = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        CryptoOrderDraft cryptoOrderDraft = (CryptoOrderDraft) obj2;
        switch (this.f284384a) {
            case 0:
                return this.f284386c.f96748s.n(cryptoOrderDraft, ((bzh.d) this.f284385b).f20031a);
            default:
                dj0.d dVarK = pyd.c.k(pyd.c.U(new dj0.d(cryptoOrderDraft.f96694j, cryptoOrderDraft.f96689a.f96683a), ((bzh.e) this.f284385b).f20032a), 100L);
                com.revolut.feature_crypto_order_flow.impl.exchange.d dVar = this.f284386c;
                dVar.u.getClass();
                return dVar.f96748s.n(cryptoOrderDraft, l4i.a.e(dVarK));
        }
    }

    public /* synthetic */ o0(com.revolut.feature_crypto_order_flow.impl.exchange.d dVar, bzh.f fVar) {
        this.f284386c = dVar;
        this.f284385b = fVar;
    }
}
