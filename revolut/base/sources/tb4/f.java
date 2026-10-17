package tb4;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.summary.SummaryScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.summary.SummaryScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SummaryScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(SummaryScreen summaryScreen, Continuation continuation) {
        super(2, continuation);
        this.v = summaryScreen;
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
        yhm.o.b(obj2);
        n nVarE3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.summary.h hVar = (com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.summary.h) nVarE3;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        if (obj3 instanceof ry3.a) {
            oki.h.v2(hVar.f67751s, new SummaryScreenContract$ModalStep.RemoveDocumentConfirmation((ry3.a) obj3), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        } else {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "SummaryScreenModel", obj3 + " is not supported by onRowDelegateValueIconClicked", null, h0Var);
        }
        return Unit.f186387a;
    }
}
