package gqd;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.execution.IncomeSorterExecutionController;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;
import zh9.u0;

/* JADX INFO: loaded from: classes7.dex */
public final class q extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ IncomeSorterExecutionController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(IncomeSorterExecutionController incomeSorterExecutionController, Continuation continuation) {
        super(2, continuation);
        this.v = incomeSorterExecutionController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        q qVar = new q(this.v, continuation);
        qVar.u = obj2;
        return qVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((q) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = model.u;
        a3 transaction = obj3 instanceof a3 ? (a3) obj3 : null;
        if (transaction != null) {
            v vVar = (v) this.v.d();
            vVar.getClass();
            Intrinsics.checkNotNullParameter(transaction, "transaction");
            vVar.C1(u0.b(new FeatureCommand(new TransactionsFeatureConfig.Details(new k71.c(transaction.f272581b), null, null, null, 126))));
        }
        return Unit.f186387a;
    }
}
