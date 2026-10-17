package jh9;

import aw0.n6;
import cli.y;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.form.amount.FormAmountScreen;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.helpers.models.PaymentData;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import ix6.l0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ FormAmountScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(FormAmountScreen formAmountScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = formAmountScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            case 1:
                return new d(this.v, continuation, 1);
            default:
                return new d(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((d) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        FormAmountScreen formAmountScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((p) formAmountScreen.d()).C2(i.f174168a);
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((p) formAmountScreen.d()).I2();
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                p pVar = (p) formAmountScreen.d();
                y yVar = pVar.v;
                TransferScheduleData transferScheduleData = ((f) ((j2) yVar.f22677a).getValue()).d;
                PaymentData paymentData = ((f) ((j2) yVar.f22677a).getValue()).f174161b;
                if (paymentData != null) {
                    if (transferScheduleData != null) {
                        pVar.l2(new l0(pVar, paymentData, transferScheduleData, (Continuation) null, 16), new yi5.b(26));
                    } else {
                        pVar.I2();
                    }
                }
                break;
        }
        return Unit.f186387a;
    }
}
