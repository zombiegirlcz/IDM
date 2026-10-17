package smd;

import com.revolut.core.ui_kit.delegates.DraggableDelegate;
import com.revolut.feature.spending_analytics.impl.ui.budget.category_budgets.CategoryBudgetsController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class o extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CategoryBudgetsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(CategoryBudgetsController categoryBudgetsController, Continuation continuation) {
        super(2, continuation);
        this.v = categoryBudgetsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        o oVar = new o(this.v, continuation);
        oVar.u = obj2;
        return oVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((o) create((DraggableDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        DraggableDelegate.Model model = (DraggableDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = model.f52202l;
        i iVar = obj3 instanceof i ? (i) obj3 : null;
        if (iVar == null) {
            return Unit.f186387a;
        }
        u uVarR2 = this.v.R2();
        String categoryId = iVar.f264420a;
        uVarR2.getClass();
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        uVarR2.H2(uVarR2.u, new sef.j(categoryId, uVarR2));
        return Unit.f186387a;
    }
}
