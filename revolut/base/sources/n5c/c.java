package n5c;

import com.revolut.feature.revolut_x_promo.impl.articles.CryptoExchangeArticleKey;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import lmg.k;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f212573w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f212574x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public CryptoExchangeArticleKey f212575y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(k kVar, Continuation continuation) {
        super(continuation);
        this.f212573w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f212573w.emit(null, this);
    }
}
