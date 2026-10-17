package pqc;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.salary_switch.impl.models.v2.PayrollSwitchCounterparty;
import com.revolut.feature.salary_switch.impl.ui.brazil.screen.bank_list.BankListScreen;
import com.revolut.feature.salary_switch.impl.ui.brazil.screen.bank_list.BankListScreenContract$InputData;
import com.revolut.feature.salary_switch.impl.ui.brazil.screen.bank_list.BankListScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ BankListScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(BankListScreen bankListScreen, Continuation continuation) {
        super(2, continuation);
        this.v = bankListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        i iVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.salary_switch.impl.ui.brazil.screen.bank_list.a aVar2 = (com.revolut.feature.salary_switch.impl.ui.brazil.screen.bank_list.a) iVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f53228a;
        if (a0.H(str, "BANK_ROW_ID_", false)) {
            Object obj3 = model.u;
            PayrollSwitchCounterparty payrollSwitchCounterparty = obj3 instanceof PayrollSwitchCounterparty ? (PayrollSwitchCounterparty) obj3 : null;
            if (payrollSwitchCounterparty != null) {
                BankListScreenContract$InputData bankListScreenContract$InputData = aVar2.o;
                aVar2.C2(new h(bankListScreenContract$InputData.f85277a, bankListScreenContract$InputData.f85278b, payrollSwitchCounterparty));
            }
        } else if (str.equals("BANK_NOT_PRESENT_ROW_ID")) {
            oki.h.v2(aVar2.f85284s, BankListScreenContract$ModalStep.BankNotPresent.f85279a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
        return Unit.f186387a;
    }
}
