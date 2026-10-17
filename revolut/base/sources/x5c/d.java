package x5c;

import com.revolut.feature.revolut_x_promo.impl.articles.CryptoExchangeArticleKey;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends gim.c {
    public CryptoExchangeArticleKey u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.revolut_x_promo.impl.ui.revolut_x_launcher.b f302935w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f302936x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.revolut.feature.revolut_x_promo.impl.ui.revolut_x_launcher.b bVar, gim.c cVar) {
        super(cVar);
        this.f302935w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f302936x |= Integer.MIN_VALUE;
        return com.revolut.feature.revolut_x_promo.impl.ui.revolut_x_launcher.b.I2(this.f302935w, this);
    }
}
