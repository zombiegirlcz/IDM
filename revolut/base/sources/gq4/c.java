package gq4;

import cli.y;
import com.revolut.feature.credit.card.impl.ui.cancellation.repayment.CreditCardTerminatedRepaymentScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CreditCardTerminatedRepaymentScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(CreditCardTerminatedRepaymentScreen creditCardTerminatedRepaymentScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = creditCardTerminatedRepaymentScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            case 1:
                return new c(this.v, continuation, 1);
            default:
                return new c(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CreditCardTerminatedRepaymentScreen creditCardTerminatedRepaymentScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((r) creditCardTerminatedRepaymentScreen.d()).I2();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r rVar = (r) creditCardTerminatedRepaymentScreen.d();
                y yVar = rVar.f145563t;
                g gVar = ((l) yVar.f25025b.c((cli.j) ((j2) yVar.f22677a).getValue())).f145554b;
                e eVar = gVar instanceof e ? (e) gVar : null;
                if (eVar != null) {
                    rVar.n2(new n(eVar.f145546c, rVar, null), new whi.b(6));
                }
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r rVar2 = (r) creditCardTerminatedRepaymentScreen.d();
                y yVar2 = rVar2.f145563t;
                g gVar2 = ((l) yVar2.f25025b.c((cli.j) ((j2) yVar2.f22677a).getValue())).f145555c;
                e eVar2 = gVar2 instanceof e ? (e) gVar2 : null;
                if (eVar2 != null) {
                    rVar2.n2(new n(eVar2.f145546c, rVar2, null), new whi.b(6));
                }
                break;
        }
        return Unit.f186387a;
    }
}
