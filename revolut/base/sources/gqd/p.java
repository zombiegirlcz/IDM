package gqd;

import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.execution.IncomeSorterExecutionController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class p extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ IncomeSorterExecutionController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(IncomeSorterExecutionController incomeSorterExecutionController, Continuation continuation) {
        super(2, continuation);
        this.v = incomeSorterExecutionController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        p pVar = new p(this.v, continuation);
        pVar.u = obj2;
        return pVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((p) create((CellDetailsChevronDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsChevronDelegate.Model model = (CellDetailsChevronDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = model.e;
        String incomeSorterId = obj3 instanceof String ? (String) obj3 : null;
        if (incomeSorterId != null) {
            v vVar = (v) this.v.d();
            vVar.getClass();
            Intrinsics.checkNotNullParameter(incomeSorterId, "incomeSorterId");
            vVar.l1().M0(new kqd.m(incomeSorterId));
        }
        return Unit.f186387a;
    }
}
