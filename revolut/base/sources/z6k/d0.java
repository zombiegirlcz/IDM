package z6k;

import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.retail.feature.payments.money_request.impl.ui_kompot.details.MoneyRequestDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
public final class d0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ MoneyRequestDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(MoneyRequestDetailsScreen moneyRequestDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = moneyRequestDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d0 d0Var = new d0(this.v, continuation);
        d0Var.u = obj2;
        return d0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d0) create((CellDetailsChevronDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsChevronDelegate.Model model = (CellDetailsChevronDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((com.revolut.retail.feature.payments.money_request.impl.ui_kompot.details.b) this.v.d()).M2(model.e);
        return Unit.f186387a;
    }
}
