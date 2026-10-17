package sqd;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.review.IncomeSorterReviewController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class a0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ IncomeSorterReviewController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(IncomeSorterReviewController incomeSorterReviewController, Continuation continuation) {
        super(2, continuation);
        this.v = incomeSorterReviewController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        a0 a0Var = new a0(this.v, continuation);
        a0Var.u = obj2;
        return a0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a0) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.review.i iVar = (com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.review.i) this.v.d();
        if (model.u instanceof b) {
            iVar.H2(iVar.z, new sl5.a(iVar, 14));
        } else {
            iVar.getClass();
        }
        return Unit.f186387a;
    }
}
