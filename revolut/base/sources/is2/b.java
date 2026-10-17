package is2;

import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment.SelectPaymentToBlockScreen;
import imk.p0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ SelectPaymentToBlockScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(SelectPaymentToBlockScreen selectPaymentToBlockScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = selectPaymentToBlockScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.v, continuation, 0);
            default:
                return new b(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        SelectPaymentToBlockScreen selectPaymentToBlockScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                selectPaymentToBlockScreen.m2().onBackPressed();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment.b bVar = (com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment.b) selectPaymentToBlockScreen.T2();
                bVar.getClass();
                bVar.n2(new p0(bVar, null, 3), new whi.b(6));
                break;
        }
        return Unit.f186387a;
    }
}
