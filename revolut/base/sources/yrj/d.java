package yrj;

import cli.y;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.retail.feature.api.budgeting.declaration.BudgetingFeatureConfig$CategoryBudget$Destination;
import com.revolut.retail.feature.api.budgeting.declaration.BudgetingFeatureConfig$UpcomingPayments$Destination;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.overview.BudgetOverviewController;
import gim.i;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.Interval;
import qzi.l;
import urj.n;
import vkm.j2;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ BudgetOverviewController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(BudgetOverviewController budgetOverviewController, Continuation continuation) {
        super(2, continuation);
        this.v = budgetOverviewController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        urj.d dVar;
        AccountId accountId;
        qzi.a aVar;
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        urj.e eVarE3 = this.v.R2();
        Intrinsics.h(model);
        n nVar = (n) eVarE3;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        y yVar = nVar.E;
        j2 j2Var = (j2) yVar.f22677a;
        j2 j2Var2 = (j2) yVar.f22677a;
        AccountId accountId2 = ((urj.a) j2Var.getValue()).f282315c;
        if (accountId2 != null) {
            Object obj3 = model.u;
            String str = model.f53228a;
            if (Intrinsics.f(str, "LIST_ID_ADD_CATEGORY_BUDGET")) {
                nVar.M2();
            } else if (obj3 instanceof trj.a) {
                nVar.C1(new BudgetingFeatureConfig$CategoryBudget$Destination(accountId2, v13.d.t(((trj.a) obj3).f273803a)));
            } else if (Intrinsics.f(str, "SPENDINGS_BANNER_ID")) {
                nVar.C1(new BudgetingFeatureConfig$CategoryBudget$Destination(accountId2, v13.d.u(l.OVERALL)));
            } else {
                if (Intrinsics.f(str, "UPCOMING_SPENDINGS_BANNER_ID")) {
                    Object content = ((urj.a) j2Var2.getValue()).f282313a.getContent();
                    urj.b bVar = content instanceof urj.b ? (urj.b) content : null;
                    if (bVar != null && (aVar = bVar.f282322l) != null) {
                        nVar.C1(new BudgetingFeatureConfig$UpcomingPayments$Destination(new Interval(aVar.e.toDateTimeAtStartOfDay(), aVar.f.toDateTimeAtStartOfDay().plusDays(1).minusMillis(1)), accountId2));
                    }
                } else if (Intrinsics.f(str, "BUDGET_VALUE_ID") && (dVar = (urj.d) ((urj.a) j2Var2.getValue()).f282313a.getContent()) != null && (accountId = ((urj.a) j2Var2.getValue()).f282315c) != null) {
                    if (dVar instanceof urj.b) {
                        nVar.l1().M0(new com.revolut.retail.feature.impl.budgeting.ui.rev10.flow.b(((urj.b) dVar).d, accountId, com.revolut.retail.feature.impl.budgeting.ui.rev10.flow.c.UPDATE_BUDGET));
                    } else {
                        if (!(dVar instanceof urj.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, "GoalsOverviewScreenModel", "Budget state is not available", null, h0Var);
                    }
                }
            }
        }
        return Unit.f186387a;
    }
}
