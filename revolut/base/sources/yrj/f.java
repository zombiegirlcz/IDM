package yrj;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.overview.BudgetOverviewController;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import urj.l;
import urj.n;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends i implements Function2 {
    public final /* synthetic */ BudgetOverviewController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(BudgetOverviewController budgetOverviewController, Continuation continuation) {
        super(2, continuation);
        this.u = budgetOverviewController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        n nVar = (n) this.u.R2();
        nVar.getClass();
        nVar.n2(new l(0, null, nVar), new whi.b(6));
        return Unit.f186387a;
    }
}
