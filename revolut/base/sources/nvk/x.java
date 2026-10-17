package nvk;

import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.financials_statements.StockFinancialsStatementsPeriodChooserController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class x extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ StockFinancialsStatementsPeriodChooserController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(StockFinancialsStatementsPeriodChooserController stockFinancialsStatementsPeriodChooserController, Continuation continuation) {
        super(2, continuation);
        this.v = stockFinancialsStatementsPeriodChooserController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        x xVar = new x(this.v, continuation);
        xVar.u = obj2;
        return xVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((x) create((SingleChoiceDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SingleChoiceDelegate.Model model = (SingleChoiceDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = model.f;
        uqk.e period = obj3 instanceof uqk.e ? (uqk.e) obj3 : null;
        if (period != null) {
            com.revolut.retail.feature.stockdetails.impl.ui.screens.financials_statements.b bVar = this.v.R;
            bVar.getClass();
            Intrinsics.checkNotNullParameter(period, "period");
            bVar.C2(new w(period));
        }
        return Unit.f186387a;
    }
}
