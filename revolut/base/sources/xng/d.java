package xng;

import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.feature.user_declarations.shared.flows.income.screen.IncomeScreen;
import com.revolut.feature.user_declarations.shared.flows.income.screen.IncomeScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ IncomeScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(IncomeScreen incomeScreen, Continuation continuation) {
        super(2, continuation);
        this.u = incomeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CenteredAmountDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.user_declarations.shared.flows.income.screen.b bVar = (com.revolut.feature.user_declarations.shared.flows.income.screen.b) this.u.R2();
        if (((h) ((j2) bVar.f94636t.f22677a).getValue()).f307493g) {
            oki.h.v2(bVar.u, IncomeScreenContract$ModalStep.CurrencyPicker.f94630a, ModalDestination.Style.POPUP.f98311a);
        }
        return Unit.f186387a;
    }
}
