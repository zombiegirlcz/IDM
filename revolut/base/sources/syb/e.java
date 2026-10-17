package syb;

import com.revolut.feature.rev_points.impl.ui.RevPointsFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.flow.FlowStep;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends i implements Function2 {
    public final /* synthetic */ com.revolut.feature.rev_points.impl.ui.c u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.revolut.feature.rev_points.impl.ui.c cVar, Continuation continuation) {
        super(2, continuation);
        this.u = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        com.revolut.feature.rev_points.impl.ui.c cVar = this.u;
        yki.i iVar = cVar.u;
        FlowStep flowStep = cVar.o.f83735a;
        boolean z = flowStep instanceof RevPointsFlowContract$Step.OpenRelatedTransactionsBottomSheet;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        if (z || (flowStep instanceof RevPointsFlowContract$Step.OpenChallengeDetailsBottomSheet)) {
            h.w2(iVar, flowStep, bottom_dialog);
        } else if (flowStep instanceof RevPointsFlowContract$Step.OpenTransactionDetailsPager) {
            h.z2(iVar, flowStep, ModalDestination.Style.FullscreenPaged.f98310a);
        } else if (flowStep instanceof RevPointsFlowContract$Step) {
            h.t2(cVar, cVar.u, flowStep, true, null, false, 12);
        }
        return Unit.f186387a;
    }
}
