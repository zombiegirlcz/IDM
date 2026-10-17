package com.revolut.feature.spending_analytics.impl.ui.budget;

import aii.m;
import aii.n;
import com.revolut.feature.spending_analytics.impl.ui.budget.BudgetFlowContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.budget.BudgetFlowContract$Step;
import com.revolut.kompot.navigable.flow.FlowStep;
import cp5.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import rmd.b;
import rmd.c;
import rmd.f;
import smd.y;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends h implements f {

    @NotNull
    private static final rmd.h Companion = new rmd.h();
    public final y o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f87509p;

    public a(BudgetFlowContract$InputData inputData, y categoryBudgetsUpdatesProvider) {
        FlowStep budgetOverview;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(categoryBudgetsUpdatesProvider, "categoryBudgetsUpdatesProvider");
        this.o = categoryBudgetsUpdatesProvider;
        if (inputData instanceof BudgetFlowContract$InputData.SetupBudget) {
            budgetOverview = new BudgetFlowContract$Step.SetupBudget(((BudgetFlowContract$InputData.SetupBudget) inputData).f87502a);
        } else {
            if (!(inputData instanceof BudgetFlowContract$InputData.ViewBudget)) {
                throw new NoWhenBranchMatchedException();
            }
            budgetOverview = new BudgetFlowContract$Step.BudgetOverview(((BudgetFlowContract$InputData.ViewBudget) inputData).f87503a);
        }
        this.f87509p = d.a(this, budgetOverview, f0.f322471a, new rl8.d(this, 3));
    }

    @Override // yji.l
    public final n o2(m event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof b) {
            h.t2(this, this.f87509p, new BudgetFlowContract$Step.CategoryBudgets(((b) event).f255245b), true, null, false, 12);
            return null;
        }
        if (event instanceof c) {
            h.t2(this, this.f87509p, new BudgetFlowContract$Step.CreateCategory(((c) event).f255246b), true, null, false, 12);
            return null;
        }
        if (!(event instanceof rmd.d)) {
            return super.o2(event);
        }
        h.t2(this, this.f87509p, new BudgetFlowContract$Step.UpcomingPayments(((rmd.d) event).f255247b), true, null, false, 12);
        return null;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f87509p;
    }
}
