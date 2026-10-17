package rrj;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.goals.category_budget.CategoryBudgetScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes11.dex */
public final class u extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CategoryBudgetScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(CategoryBudgetScreen categoryBudgetScreen, Continuation continuation) {
        super(2, continuation);
        this.v = categoryBudgetScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        u uVar = new u(this.v, continuation);
        uVar.u = obj2;
        return uVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((u) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = model.u;
        a3 transaction = obj3 instanceof a3 ? (a3) obj3 : null;
        if (transaction != null) {
            o oVar = (o) ((e) this.v.c0.getValue());
            oVar.getClass();
            Intrinsics.checkNotNullParameter(transaction, "transaction");
            oVar.C1(new BridgeDestination(new FeatureCommand(new TransactionsFeatureConfig.Details(ofm.q.P(transaction), com.revolut.feature.transactions.api.navigation.a.ANALYTICS, null, null, 124))));
        }
        return Unit.f186387a;
    }
}
