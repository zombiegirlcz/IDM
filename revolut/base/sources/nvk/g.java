package nvk;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.financials_statements.StockFinancialsStatementsController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.z1;

/* JADX INFO: loaded from: classes12.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ StockFinancialsStatementsController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(StockFinancialsStatementsController stockFinancialsStatementsController, Continuation continuation) {
        super(2, continuation);
        this.u = stockFinancialsStatementsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        z1 z1Var = ((com.revolut.retail.feature.stockdetails.impl.ui.screens.financials_statements.a) this.u.R2()).f103972s;
        Unit unit = Unit.f186387a;
        z1Var.k(unit);
        return unit;
    }
}
