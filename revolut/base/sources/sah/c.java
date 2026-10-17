package sah;

import com.revolut.feature.wealth.impl.ui.flows.recurring_transfer_management.RecurringTransferManagementFlowContract$Input;
import com.revolut.feature.wealth.impl.ui.flows.recurring_transfer_management.RecurringTransferManagementFlowContract$State;
import com.revolut.feature.wealth.impl.ui.flows.recurring_transfer_management.RecurringTransferManagementFlowContract$Step;
import com.revolut.feature.wealth.impl.ui.screens.recurring_transfer_details.RecurringDepositDetailsViewController;
import com.revolut.feature.wealth.impl.ui.screens.recurring_transfer_details.RecurringDepositDetailsViewControllerContract$Input;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import dki.s;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import tch.r;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends g implements s {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final RecurringTransferManagementFlowContract$Step f261406t;
    public final RecurringTransferManagementFlowContract$State u;
    public final RecurringTransferManagementFlowContract$Input v;

    public c(RecurringTransferManagementFlowContract$Step initialStep, RecurringTransferManagementFlowContract$State initialState, RecurringTransferManagementFlowContract$Input input) {
        Intrinsics.checkNotNullParameter(initialStep, "initialStep");
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(input, "input");
        this.f261406t = initialStep;
        this.u = initialState;
        this.v = input;
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        RecurringTransferManagementFlowContract$Step step = (RecurringTransferManagementFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (b.f261405b[step.ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        RecurringTransferManagementFlowContract$Input recurringTransferManagementFlowContract$Input = this.v;
        String str = recurringTransferManagementFlowContract$Input.f95562a;
        if (b.f261404a[recurringTransferManagementFlowContract$Input.f95563b.ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        RecurringDepositDetailsViewController recurringDepositDetailsViewController = new RecurringDepositDetailsViewController(new RecurringDepositDetailsViewControllerContract$Input(str, r.ROBO));
        s78.d block = new s78.d(this, 19);
        Intrinsics.checkNotNullParameter(block, "block");
        recurringDepositDetailsViewController.H = block;
        return recurringDepositDetailsViewController;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.u;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.f261406t;
    }
}
