package w4i;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature_market_data_impl.ui.breakdown.kompot.screens.transaction.TransactionBreakdownScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TransactionBreakdownScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(TransactionBreakdownScreen transactionBreakdownScreen, Continuation continuation) {
        super(2, continuation);
        this.v = transactionBreakdownScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        b0 b0VarM3 = this.v.R2();
        String listId = model.f53228a;
        Object obj3 = model.u;
        d0 d0Var = (d0) b0VarM3;
        d0Var.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        d0Var.C2(new z(listId, obj3));
        return Unit.f186387a;
    }
}
