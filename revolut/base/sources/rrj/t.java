package rrj;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.goals.category_budget.CategoryBudgetScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
public final class t extends gim.i implements Function2 {
    public final /* synthetic */ CategoryBudgetScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(CategoryBudgetScreen categoryBudgetScreen, Continuation continuation) {
        super(2, continuation);
        this.u = categoryBudgetScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new t(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((t) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        o oVar = (o) ((e) this.u.c0.getValue());
        oVar.getClass();
        oVar.n2(new rbh.k(oVar, null, 17), new whi.b(6));
        return Unit.f186387a;
    }
}
