package nje;

import com.revolut.feature.tab.crypto.impl.portfolio.CryptoPortfolioScreen;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CryptoPortfolioScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CryptoPortfolioScreen cryptoPortfolioScreen, Continuation continuation) {
        super(2, continuation);
        this.v = cryptoPortfolioScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Pair pair = (Pair) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        if (!((Boolean) pair.f186386b).booleanValue()) {
            ((n) ((e) this.v.f89788o0.getValue())).f216473x.f246831b.k(Unit.f186387a);
        }
        return Unit.f186387a;
    }
}
