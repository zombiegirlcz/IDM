package z6k;

import com.revolut.retail.feature.payments.money_request.impl.ui_kompot.details.MoneyRequestDetailsScreen;
import ip0.w7;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
public final class z extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ MoneyRequestDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(MoneyRequestDetailsScreen moneyRequestDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = moneyRequestDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new z(this.v, continuation, 0);
            default:
                return new z(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((z) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((z) create((w7) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        MoneyRequestDetailsScreen moneyRequestDetailsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                moneyRequestDetailsScreen.m2().onBackPressed();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.retail.feature.payments.money_request.impl.ui_kompot.details.b) moneyRequestDetailsScreen.e3()).N2();
                break;
        }
        return Unit.f186387a;
    }
}
