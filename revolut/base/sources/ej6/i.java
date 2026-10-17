package ej6;

import com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.payment.OpenBankingAuthPaymentScreen;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ OpenBankingAuthPaymentScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(OpenBankingAuthPaymentScreen openBankingAuthPaymentScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = openBankingAuthPaymentScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i(this.v, continuation, 0);
            case 1:
                return new i(this.v, continuation, 1);
            case 2:
                return new i(this.v, continuation, 2);
            default:
                return new i(this.v, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((i) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((i) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((i) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((i) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        OpenBankingAuthPaymentScreen openBankingAuthPaymentScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.payment.d) openBankingAuthPaymentScreen.e3()).C2(o.f126749a);
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.payment.d dVar = (com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.payment.d) openBankingAuthPaymentScreen.e3();
                AccountWrapper accountWrapper = ((l) ((j2) dVar.D.f22677a).getValue()).f126745c;
                if (accountWrapper != null) {
                    dVar.C2(new p(accountWrapper.getPocketId()));
                }
                break;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.payment.d) openBankingAuthPaymentScreen.e3()).C2(q.f126751a);
                break;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.payment.d) openBankingAuthPaymentScreen.e3()).C2(s.f126753a);
                break;
        }
        return Unit.f186387a;
    }
}
