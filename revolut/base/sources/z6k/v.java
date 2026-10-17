package z6k;

import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.retail.feature.payments.money_request.impl.ui_kompot.details.MoneyRequestDetailsNewScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
public final class v extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ MoneyRequestDetailsNewScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(MoneyRequestDetailsNewScreen moneyRequestDetailsNewScreen, Continuation continuation) {
        super(2, continuation);
        this.v = moneyRequestDetailsNewScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        v vVar = new v(this.v, continuation);
        vVar.u = obj2;
        return vVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((v) create((CellDetailsChevronDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsChevronDelegate.Model model = (CellDetailsChevronDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((com.revolut.retail.feature.payments.money_request.impl.ui_kompot.details.b) this.v.R2()).M2(model.e);
        return Unit.f186387a;
    }
}
