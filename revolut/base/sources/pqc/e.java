package pqc;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.salary_switch.impl.ui.brazil.screen.bank_list.BankListScreen;
import com.revolut.feature.salary_switch.impl.ui.brazil.screen.bank_list.BankListScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ BankListScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(BankListScreen bankListScreen, Continuation continuation) {
        super(2, continuation);
        this.v = bankListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        i iVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.salary_switch.impl.ui.brazil.screen.bank_list.a aVar2 = (com.revolut.feature.salary_switch.impl.ui.brazil.screen.bank_list.a) iVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f52373a, "BANK_LIST_EMPTY_STATE_ID")) {
            oki.h.v2(aVar2.f85284s, BankListScreenContract$ModalStep.BankNotPresent.f85279a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
        return Unit.f186387a;
    }
}
