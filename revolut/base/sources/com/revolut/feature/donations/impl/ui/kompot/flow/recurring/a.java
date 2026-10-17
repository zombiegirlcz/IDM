package com.revolut.feature.donations.impl.ui.kompot.flow.recurring;

import com.revolut.feature.donations.impl.ui.kompot.flow.recurring.CharityRecurringDonationFlowContract$Step;
import com.revolut.feature.donations.impl.ui.kompot.screen.recurring.amount.RecurringDonationAmountScreen;
import com.revolut.feature.donations.impl.ui.kompot.screen.recurring.amount.RecurringDonationAmountScreenContract$InputData;
import com.revolut.feature.donations.impl.ui.kompot.screen.recurring.schedule.RecurringDonationScheduleScreen;
import com.revolut.feature.donations.impl.ui.kompot.screen.recurring.schedule.RecurringDonationScheduleScreenContract$InputData;
import com.revolut.kompot.navigable.flow.EmptyFlowState;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o9h.b;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends g implements ob6.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final CharityRecurringDonationFlowContract$Step.Schedule f72029t;
    public final EmptyFlowState u;

    public a(CharityRecurringDonationFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f72029t = new CharityRecurringDonationFlowContract$Step.Schedule(inputData.f72025a);
        this.u = EmptyFlowState.f98428a;
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        CharityRecurringDonationFlowContract$Step step = (CharityRecurringDonationFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof CharityRecurringDonationFlowContract$Step.Schedule) {
            RecurringDonationScheduleScreen recurringDonationScheduleScreen = new RecurringDonationScheduleScreen(new RecurringDonationScheduleScreenContract$InputData(((CharityRecurringDonationFlowContract$Step.Schedule) step).f72028a));
            o54.a aVar = new o54.a(this, step, 17);
            Intrinsics.checkNotNullParameter(aVar, "<set-?>");
            recurringDonationScheduleScreen.H = aVar;
            return recurringDonationScheduleScreen;
        }
        if (!(step instanceof CharityRecurringDonationFlowContract$Step.AmountInput)) {
            throw new NoWhenBranchMatchedException();
        }
        CharityRecurringDonationFlowContract$Step.AmountInput amountInput = (CharityRecurringDonationFlowContract$Step.AmountInput) step;
        RecurringDonationAmountScreen recurringDonationAmountScreen = new RecurringDonationAmountScreen(new RecurringDonationAmountScreenContract$InputData(amountInput.f72026a, amountInput.f72027b));
        b bVar = new b(this, 5);
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        recurringDonationAmountScreen.H = bVar;
        return recurringDonationAmountScreen;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.u;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.f72029t;
    }
}
