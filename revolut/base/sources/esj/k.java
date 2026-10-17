package esj;

import android.view.View;
import aw0.f4;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.set_overall_budget.SetOverallBudgetScreen;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ View v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ SetOverallBudgetScreen f128976w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(View view, SetOverallBudgetScreen setOverallBudgetScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = view;
        this.f128976w = setOverallBudgetScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new k(this.v, this.f128976w, continuation, 0);
            default:
                return new k(this.v, this.f128976w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((k) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        SetOverallBudgetScreen setOverallBudgetScreen = this.f128976w;
        View view = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                kli.c.c(view, true);
                setOverallBudgetScreen.m2().onBackPressed();
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                kli.c.c(view, true);
                c0 c0Var = (c0) setOverallBudgetScreen.T2();
                w wVar = (w) ((o) c0Var.t2()).f128977a.getContent();
                if (wVar != null) {
                    dj0.d dVar = wVar.f;
                    c0Var.A.b(new f4("AMOUNT_LIST_ID", false));
                    int i2 = a0.f128956b[c0Var.z.f101562a.ordinal()];
                    if (i2 == 1) {
                        c0Var.v2(new p(dVar));
                    } else {
                        if (i2 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c0Var.v2(new t(dVar));
                    }
                }
                return Unit.f186387a;
        }
    }
}
