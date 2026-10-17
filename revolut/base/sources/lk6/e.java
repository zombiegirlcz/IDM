package lk6;

import com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.OpenBankingBrazilPayment;
import com.revolut.feature.external_accounts.impl.ui.brazil.payment_confirmation.screen.payment.OpenBankingBrPaymentScreen;
import java.time.LocalDate;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.h0;
import zhm.q0;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ OpenBankingBrPaymentScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(OpenBankingBrPaymentScreen openBankingBrPaymentScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = openBankingBrPaymentScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.v, continuation, 0);
            default:
                return new e(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LocalDate localDate;
        int i = this.u;
        OpenBankingBrPaymentScreen openBankingBrPaymentScreen = this.v;
        Map mapC = null;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                b0 b0Var = (b0) openBankingBrPaymentScreen.d();
                i iVar = (i) ((j2) b0Var.u.f22677a).getValue();
                OpenBankingBrazilPayment openBankingBrazilPayment = (OpenBankingBrazilPayment) iVar.f196243a.getContent();
                if (openBankingBrazilPayment == null) {
                    IllegalStateException illegalStateException = new IllegalStateException("paymentData not loaded once authorize payment clicked");
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                } else {
                    OpenBankingBrazilPayment.EditableMoneyField editableMoneyField = iVar.d;
                    OpenBankingBrazilPayment.EditableMoneyField editableMoneyField2 = iVar.e;
                    OpenBankingBrazilPayment.EditableDateField editableDateField = iVar.f;
                    String str = openBankingBrazilPayment.f72394a;
                    String str2 = openBankingBrazilPayment.i.f73116b;
                    Boolean bool = iVar.f196245c;
                    aim.f builder = new aim.f();
                    if (editableMoneyField != null) {
                        builder.put(editableMoneyField.f72402a, editableMoneyField.d);
                    }
                    if (editableMoneyField2 != null) {
                        builder.put(editableMoneyField2.f72402a, editableMoneyField2.d);
                    }
                    Unit unit = Unit.f186387a;
                    Intrinsics.checkNotNullParameter(builder, "builder");
                    aim.f fVarB = builder.b();
                    aim.f fVar = fVarB.isEmpty() ? null : fVarB;
                    if (editableDateField != null && (localDate = editableDateField.f72401b) != null) {
                        mapC = q0.c(new Pair(editableDateField.f72400a, localDate));
                    }
                    b0Var.C2(new m(str, str2, bool, fVar, mapC));
                }
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                b0 b0Var2 = (b0) openBankingBrPaymentScreen.d();
                OpenBankingBrazilPayment openBankingBrazilPayment2 = (OpenBankingBrazilPayment) ((i) ((j2) b0Var2.u.f22677a).getValue()).f196243a.getContent();
                if (openBankingBrazilPayment2 == null) {
                    IllegalStateException illegalStateException2 = new IllegalStateException("paymentData not loaded once reject payment clicked");
                    h0 h0Var2 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
                } else {
                    b0Var2.C2(new o(openBankingBrazilPayment2.f72394a, openBankingBrazilPayment2.i.f73116b));
                }
                break;
        }
        return Unit.f186387a;
    }
}
