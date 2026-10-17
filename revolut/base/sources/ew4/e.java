package ew4;

import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.feature.credit.card.impl.ui.statement_financing.details.CreditCardStatementFinancingDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CreditCardStatementFinancingDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(CreditCardStatementFinancingDetailsScreen creditCardStatementFinancingDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = creditCardStatementFinancingDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((ActionsView.Item) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ActionsView.Item item = (ActionsView.Item) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        j jVarD3 = this.v.d();
        yx4.a aVar2 = yx4.b.Companion;
        Intrinsics.h(item);
        aVar2.getClass();
        ((com.revolut.feature.credit.card.impl.ui.statement_financing.details.a) jVarD3).I2(yx4.a.a(item));
        return Unit.f186387a;
    }
}
