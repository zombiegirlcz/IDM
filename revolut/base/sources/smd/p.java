package smd;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.spending_analytics.impl.ui.budget.category_budgets.CategoryBudgetsController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class p extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CategoryBudgetsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(CategoryBudgetsController categoryBudgetsController, Continuation continuation) {
        super(2, continuation);
        this.v = categoryBudgetsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        p pVar = new p(this.v, continuation);
        pVar.u = obj2;
        return pVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((p) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        if (Intrinsics.f(model.f52708a, "CATEGORY_BUDGETS_CATEGORIES_HEADER")) {
            u uVarR2 = this.v.R2();
            uVarR2.l1().M0(new rmd.c(uVarR2.o.f87510a));
        }
        return Unit.f186387a;
    }
}
