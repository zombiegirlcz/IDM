package jk4;

import cli.y;
import com.revolut.feature.credit.autopay.models.repayment.RepaymentSource;
import com.revolut.feature.credit.autopay.ui.screen.amount.input.InputAmountScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ InputAmountScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(InputAmountScreen inputAmountScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = inputAmountScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            default:
                return new d(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        InputAmountScreen inputAmountScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.credit.autopay.ui.screen.amount.input.b) inputAmountScreen.e3()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.credit.autopay.ui.screen.amount.input.b bVar = (com.revolut.feature.credit.autopay.ui.screen.amount.input.b) inputAmountScreen.e3();
                y yVar = bVar.f68613t;
                bVar.C2(new h(((g) ((j2) yVar.f22677a).getValue()).f175071b, (RepaymentSource) ((g) ((j2) yVar.f22677a).getValue()).f175070a.getContent()));
                break;
        }
        return Unit.f186387a;
    }
}
