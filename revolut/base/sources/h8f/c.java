package h8f;

import com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.intro.PortfolioRevealIntroScreen;
import h8f.h;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ PortfolioRevealIntroScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(PortfolioRevealIntroScreen portfolioRevealIntroScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = portfolioRevealIntroScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        PortfolioRevealIntroScreen portfolioRevealIntroScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                l lVar = (l) ((i) portfolioRevealIntroScreen.N.getValue());
                int i2 = lVar.f150040p;
                if (i2 > 0) {
                    lVar.I2(i2 - 1);
                } else {
                    lVar.B2();
                }
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                l lVar2 = (l) ((i) portfolioRevealIntroScreen.N.getValue());
                if (lVar2.f150040p == v.j(lVar2.o.f91466a)) {
                    lVar2.C2(h.a.f150037a);
                } else {
                    lVar2.I2(lVar2.f150040p + 1);
                }
                break;
        }
        return Unit.f186387a;
    }
}
