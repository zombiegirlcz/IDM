package fmf;

import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.feature.transactions.impl.ui.kompot.details.screen.TransactionDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class d0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TransactionDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(TransactionDetailsScreen transactionDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = transactionDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d0 d0Var = new d0(this.v, continuation);
        d0Var.u = obj2;
        return d0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d0) create((CellDetailsNoteDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsNoteDelegate.Model model = (CellDetailsNoteDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        f0 f0VarE3 = this.v.d();
        n0 n0Var = (n0) f0VarE3;
        n0Var.I2(model.f51877l, model.f51871a);
        return Unit.f186387a;
    }
}
