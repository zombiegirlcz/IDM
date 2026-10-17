package tb4;

import com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.summary.SummaryScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.summary.SummaryScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import xu3.i0;
import zhm.d0;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ SummaryScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(SummaryScreen summaryScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = summaryScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.v, continuation, 0);
            case 1:
                return new e(this.v, continuation, 1);
            default:
                return new e(this.v, continuation, 2);
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
        whf.p pVar;
        int i = this.u;
        SummaryScreen summaryScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                summaryScreen.m2().onBackPressed();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.summary.h hVar = (com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.summary.h) summaryScreen.R2();
                ry3.b bVar = (ry3.b) zi0.c.I(((i) ((j2) hVar.f67750r.f22677a).getValue()).f269443a);
                i0 i0VarQ1 = hVar.o.f67734a.q1();
                List list = bVar.f258209b;
                if (bVar.f258208a.isEmpty() && (((pVar = bVar.f258210c) == null || pVar.f297646a.isEmpty()) && list.size() == 1 && (d0.b0(list) instanceof av3.j) && i0VarQ1 != null)) {
                    oki.h.v2(hVar.f67751s, new SummaryScreenContract$ModalStep.RevolutOnlyConfirmation(i0VarQ1), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                } else {
                    hVar.I2();
                }
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.summary.h) summaryScreen.R2()).C2(j.f269444a);
                break;
        }
        return Unit.f186387a;
    }
}
