package com.revolut.retail.feature.impl.budgeting.ui.rev10.flow;

import aii.m;
import aii.n;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.impl.budgeting.R$string;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.flow.BudgetingFlowContract$InputData;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.flow.BudgetingFlowContract$Step;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.flow.a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import urj.s;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends h implements prj.b {
    public final BudgetingFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final s f101517p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f101518q;

    public e(BudgetingFlowContract$InputData inputData, s shotDialogProvider) {
        FlowStep createBudgetFlow;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(shotDialogProvider, "shotDialogProvider");
        this.o = inputData;
        this.f101517p = shotDialogProvider;
        if (inputData instanceof BudgetingFlowContract$InputData.ViewBudget) {
            createBudgetFlow = new BudgetingFlowContract$Step.Overview(((BudgetingFlowContract$InputData.ViewBudget) inputData).f101505a);
        } else {
            if (!(inputData instanceof BudgetingFlowContract$InputData.CreateBudget)) {
                throw new NoWhenBranchMatchedException();
            }
            createBudgetFlow = new BudgetingFlowContract$Step.CreateBudgetFlow(((BudgetingFlowContract$InputData.CreateBudget) inputData).f101504a);
        }
        this.f101518q = cp5.d.a(this, createBudgetFlow, f0.f322471a, new pof.e(this, 23));
    }

    @Override // yji.l
    public final n o2(m event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof b) {
            b bVar = (b) event;
            h.t2(this, this.f101518q, new BudgetingFlowContract$Step.EditBudgetFlow(bVar.f101514b, bVar.f101515c, bVar.d), true, null, false, 12);
            return null;
        }
        boolean zF = Intrinsics.f(event, a.b.f101512b);
        yki.a aVar = this.f101518q;
        s sVar = this.f101517p;
        if (zF) {
            sVar.getClass();
            X1(new mii.e("RESET_BUDGET_SHOT_DIALOG_ID", new TextLocalisedClause(R$string.analytics_budgets_reset_shot_dialog_message, null, null, 14), null, 28));
            h.D2(aVar);
            return null;
        }
        boolean zF2 = Intrinsics.f(event, a.C0626a.f101511b);
        BudgetingFlowContract$InputData budgetingFlowContract$InputData = this.o;
        if (zF2) {
            sVar.getClass();
            X1(new mii.e("CREATE_BUDGET_SHOT_DIALOG_ID", new TextLocalisedClause(R$string.analytics_budgets_create_shot_dialog_message, null, null, 14), null, 28));
            h.r2(aVar);
            h.t2(this, this.f101518q, new BudgetingFlowContract$Step.Overview(budgetingFlowContract$InputData.getF101505a()), false, null, false, 12);
            return null;
        }
        if (!Intrinsics.f(event, a.c.f101513b)) {
            return super.o2(event);
        }
        sVar.getClass();
        X1(new mii.e("UPDATE_BUDGET_SHOT_DIALOG_ID", new TextLocalisedClause(R$string.analytics_budgets_update_shot_dialog_message, null, null, 14), null, 28));
        h.r2(aVar);
        h.t2(this, this.f101518q, new BudgetingFlowContract$Step.Overview(budgetingFlowContract$InputData.getF101505a()), false, null, false, 12);
        return null;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f101518q;
    }
}
