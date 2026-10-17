package brc;

import com.revolut.core.ui_kit.delegates.LabelButtonDelegate;
import com.revolut.feature.salary_switch.impl.ui.brazil.screen.status.SalaryStatusScreen;
import com.revolut.feature.salary_switch.impl.ui.brazil.screen.status.SalaryStatusScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SalaryStatusScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(SalaryStatusScreen salaryStatusScreen, Continuation continuation) {
        super(2, continuation);
        this.v = salaryStatusScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        k kVar = new k(this.v, continuation);
        kVar.u = obj2;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((LabelButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LabelButtonDelegate.Model model = (LabelButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        q qVarD3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.salary_switch.impl.ui.brazil.screen.status.a aVar2 = (com.revolut.feature.salary_switch.impl.ui.brazil.screen.status.a) qVarD3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f52603a, "CANCEL_REQUEST_BUTTON_ID")) {
            oki.h.v2(aVar2.f85307t, SalaryStatusScreenContract$ModalStep.CancelRequest.f85300a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
        return Unit.f186387a;
    }
}
