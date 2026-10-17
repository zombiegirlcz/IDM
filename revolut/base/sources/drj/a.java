package drj;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.retail.feature.api.budgeting.declaration.BudgetingFeatureConfig$CategoryBudget$Destination;
import com.revolut.retail.feature.api.budgeting.declaration.BudgetingFeatureConfig$UpcomingPayments$Destination;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.flow.BudgetingFlow;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.flow.BudgetingFlowContract$InputData;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.goals.category_budget.CategoryBudgetContract$InputData;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.goals.category_budget.CategoryBudgetScreen;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.goals.upcoming_payments.UpcomingPaymentsContract$InputData;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.goals.upcoming_payments.UpcomingPaymentsScreen;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import rzi.c;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        BudgetingFlowContract$InputData createBudget;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof c)) {
            super.c(descriptor);
            return null;
        }
        c cVar = (c) descriptor;
        if (descriptor instanceof rzi.b) {
            createBudget = new BudgetingFlowContract$InputData.ViewBudget(((rzi.b) descriptor).b());
        } else {
            if (!(descriptor instanceof rzi.a)) {
                throw new NoWhenBranchMatchedException();
            }
            createBudget = new BudgetingFlowContract$InputData.CreateBudget(((rzi.a) descriptor).b());
        }
        return cVar.a(new BudgetingFlow(createBudget));
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof BudgetingFeatureConfig$UpcomingPayments$Destination) {
            BudgetingFeatureConfig$UpcomingPayments$Destination budgetingFeatureConfig$UpcomingPayments$Destination = (BudgetingFeatureConfig$UpcomingPayments$Destination) destination;
            return new UpcomingPaymentsScreen(new UpcomingPaymentsContract$InputData(budgetingFeatureConfig$UpcomingPayments$Destination.f99214a, budgetingFeatureConfig$UpcomingPayments$Destination.f99215b));
        }
        if (!(destination instanceof BudgetingFeatureConfig$CategoryBudget$Destination)) {
            return null;
        }
        BudgetingFeatureConfig$CategoryBudget$Destination budgetingFeatureConfig$CategoryBudget$Destination = (BudgetingFeatureConfig$CategoryBudget$Destination) destination;
        return new CategoryBudgetScreen(new CategoryBudgetContract$InputData(budgetingFeatureConfig$CategoryBudget$Destination.f99213b, budgetingFeatureConfig$CategoryBudget$Destination.f99212a));
    }
}
