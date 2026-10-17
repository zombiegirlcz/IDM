package d8f;

import com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.ManagedPortfolioSelectTemplateScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ ManagedPortfolioSelectTemplateScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(ManagedPortfolioSelectTemplateScreen managedPortfolioSelectTemplateScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = managedPortfolioSelectTemplateScreen;
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

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ManagedPortfolioSelectTemplateScreen managedPortfolioSelectTemplateScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.b) managedPortfolioSelectTemplateScreen.e3()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.b bVar = (com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.b) managedPortfolioSelectTemplateScreen.e3();
                bVar.getClass();
                bVar.n2(new cq6.k(bVar, null, 11), new whi.b(6));
                break;
        }
        return Unit.f186387a;
    }
}
