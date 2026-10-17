package nje;

import com.revolut.core.ui_kit.delegates.HighlightTileDelegate;
import com.revolut.feature.cryptocommodity_invest.api.CryptoInvestFeatureConfig;
import com.revolut.feature.tab.crypto.impl.portfolio.CryptoPortfolioScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CryptoPortfolioScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CryptoPortfolioScreen cryptoPortfolioScreen, Continuation continuation) {
        super(2, continuation);
        this.v = cryptoPortfolioScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((HighlightTileDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        HighlightTileDelegate.Model model = (HighlightTileDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        e eVar = (e) this.v.f89788o0.getValue();
        Intrinsics.h(model);
        n nVar = (n) eVar;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f52438a, "ZERO_FEES_BANNER_LIST_ID")) {
            nVar.C1(u0.c(CryptoInvestFeatureConfig.Invest.f71500a));
        }
        return Unit.f186387a;
    }
}
