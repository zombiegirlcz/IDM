package w4i;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.feature_market_data_impl.ui.breakdown.kompot.screens.transaction.TransactionBreakdownScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TransactionBreakdownScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(TransactionBreakdownScreen transactionBreakdownScreen, Continuation continuation) {
        super(2, continuation);
        this.v = transactionBreakdownScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((CellDetailsActionDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsActionDelegate.Model model = (CellDetailsActionDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        b0 b0VarM3 = this.v.R2();
        String listId = model.f51781a;
        d0 d0Var = (d0) b0VarM3;
        d0Var.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "breakdown.price")) {
            d0Var.C2(x.f294597a);
        } else {
            hx7.e.h(new IllegalArgumentException(j6.a.q("Unknown title end image listId ", listId)));
        }
        return Unit.f186387a;
    }
}
