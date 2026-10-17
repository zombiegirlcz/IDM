package yb0;

import com.revolut.core.backend_flow.impl.ui.transactions.TransactionsSelectionController;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes19.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TransactionsSelectionController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(TransactionsSelectionController transactionsSelectionController, Continuation continuation) {
        super(2, continuation);
        this.v = transactionsSelectionController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        e eVarK3 = this.v.d();
        Intrinsics.h(model);
        i iVar = (i) eVarK3;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.shared.feature.transaction.models.SharedTransaction");
        iVar.M2((v9l.a) obj3);
        iVar.J2();
        return Unit.f186387a;
    }
}
