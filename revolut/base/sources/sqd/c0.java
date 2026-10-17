package sqd;

import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.models.IncomeSorterDetailsDiff;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.review.IncomeSorterReviewContract$ModalStep;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.review.IncomeSorterReviewContract$ReviewMode;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.review.IncomeSorterReviewController;
import com.revolut.kompot.common.ModalDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class c0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ IncomeSorterReviewController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(IncomeSorterReviewController incomeSorterReviewController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = incomeSorterReviewController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c0(this.v, continuation, 0);
            default:
                return new c0(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c0) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        IncomeSorterReviewController incomeSorterReviewController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                incomeSorterReviewController.m2().onBackPressed();
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.review.i iVar = (com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.review.i) incomeSorterReviewController.d();
                IncomeSorterReviewContract$ReviewMode incomeSorterReviewContract$ReviewMode = iVar.o.f265053g;
                if (incomeSorterReviewContract$ReviewMode instanceof IncomeSorterReviewContract$ReviewMode.Create) {
                    iVar.l2(new com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.review.f(iVar, (IncomeSorterReviewContract$ReviewMode.Create) incomeSorterReviewContract$ReviewMode, null), new yi5.b(26));
                } else if (incomeSorterReviewContract$ReviewMode instanceof IncomeSorterReviewContract$ReviewMode.Update) {
                    iVar.l2(new com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.review.h(iVar, (IncomeSorterReviewContract$ReviewMode.Update) incomeSorterReviewContract$ReviewMode, null), new yi5.b(26));
                } else if (incomeSorterReviewContract$ReviewMode instanceof IncomeSorterReviewContract$ReviewMode.Activate) {
                    iVar.l2(new com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.review.b(iVar, (IncomeSorterReviewContract$ReviewMode.Activate) incomeSorterReviewContract$ReviewMode, null), new yi5.b(26));
                } else {
                    if (!(incomeSorterReviewContract$ReviewMode instanceof IncomeSorterReviewContract$ReviewMode.ManualExecution)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    IncomeSorterReviewContract$ReviewMode.ManualExecution manualExecution = (IncomeSorterReviewContract$ReviewMode.ManualExecution) incomeSorterReviewContract$ReviewMode;
                    IncomeSorterDetailsDiff incomeSorterDetailsDiff = manualExecution.d;
                    String str = manualExecution.f87853c;
                    String str2 = manualExecution.f87851a;
                    if (incomeSorterDetailsDiff.f87768a == null && incomeSorterDetailsDiff.f87769b == null && incomeSorterDetailsDiff.f87770c == null) {
                        iVar.l2(new s56.d0(iVar, incomeSorterDetailsDiff, str2, str, (Object) null, (Continuation) null, 3), new yi5.b(26));
                    } else {
                        oki.h.v2(iVar.A, new IncomeSorterReviewContract$ModalStep.ExecuteSorter(str2, str, incomeSorterDetailsDiff), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                    }
                }
                return Unit.f186387a;
        }
    }
}
