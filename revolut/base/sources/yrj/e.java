package yrj;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.overview.BudgetOverviewController;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import urj.n;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ BudgetOverviewController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(BudgetOverviewController budgetOverviewController, Continuation continuation) {
        super(2, continuation);
        this.v = budgetOverviewController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        urj.e eVarE3 = this.v.R2();
        Intrinsics.h(model);
        n nVar = (n) eVarE3;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f52708a, "LIST_ID_CATEGORY_BUDGETS_SUBHEADER")) {
            nVar.M2();
        }
        return Unit.f186387a;
    }
}
