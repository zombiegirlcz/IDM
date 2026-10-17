package z6k;

import com.revolut.retail.feature.payments.money_request.impl.ui_kompot.details.MoneyRequestDetailsNewScreen;
import ip0.w7;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
public final class r extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ MoneyRequestDetailsNewScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(MoneyRequestDetailsNewScreen moneyRequestDetailsNewScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = moneyRequestDetailsNewScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new r(this.v, continuation, 0);
            default:
                return new r(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((r) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((r) create((w7) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        MoneyRequestDetailsNewScreen moneyRequestDetailsNewScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                moneyRequestDetailsNewScreen.m2().onBackPressed();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.retail.feature.payments.money_request.impl.ui_kompot.details.b) moneyRequestDetailsNewScreen.e3()).N2();
                break;
        }
        return Unit.f186387a;
    }
}
