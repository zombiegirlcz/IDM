package zqc;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.salary_switch.impl.models.v2.SalarySwitchV2StatusSummary;
import com.revolut.feature.salary_switch.impl.ui.brazil.screen.salary_requests.SalaryRequestsScreen;
import com.revolut.feature.salary_switch.impl.ui.brazil.screen.salary_requests.SalaryRequestsScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SalaryRequestsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(SalaryRequestsScreen salaryRequestsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = salaryRequestsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.salary_switch.impl.ui.brazil.screen.salary_requests.a aVar2 = (com.revolut.feature.salary_switch.impl.ui.brazil.screen.salary_requests.a) hVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (a0.H(model.f53228a, "SALARY_REQUEST_ROW_ID_", false)) {
            Object obj3 = model.u;
            SalarySwitchV2StatusSummary salarySwitchV2StatusSummary = obj3 instanceof SalarySwitchV2StatusSummary ? (SalarySwitchV2StatusSummary) obj3 : null;
            if (salarySwitchV2StatusSummary != null) {
                oki.h.v2(aVar2.f85298r, new SalaryRequestsScreenContract$ModalStep.SalarySwitchStatus(salarySwitchV2StatusSummary.f85260a), ModalDestination.Style.POPUP.f98311a);
            }
        }
        return Unit.f186387a;
    }
}
