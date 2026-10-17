package cab;

import aw0.n6;
import com.revolut.feature.retail.goals.impl.ui.GoalsController;
import com.revolut.feature.retail.goals.impl.ui.GoalsControllerContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import java.time.LocalDate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ GoalsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(GoalsController goalsController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = goalsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            case 1:
                return new c(this.v, continuation, 1);
            default:
                return new c(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((c) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LocalDate localDateI;
        int i = this.u;
        GoalsController goalsController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.retail.goals.impl.ui.a) goalsController.R2()).B2();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.retail.goals.impl.ui.a aVar3 = (com.revolut.feature.retail.goals.impl.ui.a) goalsController.R2();
                Long l2 = ((g) ((j2) aVar3.f82659w.f22677a).getValue()).f22583b;
                LocalDate localDatePlusDays = LocalDate.now().plusDays(1L);
                com.revolut.kompot.navigable.vc.modal.a aVar4 = aVar3.v;
                Intrinsics.h(localDatePlusDays);
                if (l2 == null || (localDateI = oc.c.I(l2.longValue())) == null) {
                    localDateI = localDatePlusDays;
                }
                oki.h.v2(aVar4, new GoalsControllerContract$ModalStep.CalendarPicker(localDatePlusDays, localDateI), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                break;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.retail.goals.impl.ui.a aVar6 = (com.revolut.feature.retail.goals.impl.ui.a) goalsController.R2();
                aVar6.getClass();
                aVar6.l2(new l(aVar6, null, 1), new bwc.i(1, aVar6, com.revolut.feature.retail.goals.impl.ui.a.class, "handleError", "handleError(Ljava/lang/Throwable;)Z", 0, 11));
                break;
        }
        return Unit.f186387a;
    }
}
