package vfb;

import aii.p;
import aii.u;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.retail.salary_account.api.SalaryAccountApi$Toggles$SalaryAccountAvailability;
import com.revolut.feature.retail.salary_account.api.SalaryAccountApi$Toggles$SalaryAccountPhase2;
import com.revolut.feature.retail.salary_account.api.SalaryAccountApi$Toggles$SalaryAccountPhase3;
import com.revolut.feature.retail.salary_account.api.SalaryAccountApi$Toggles$SalarySwitchBot;
import com.revolut.feature.retail.salary_account.api.domain.SalaryAccountDestination$IncomeInsuranceClaim;
import com.revolut.feature.retail.salary_account.api.domain.SalaryAccountDestination$MoveSalary;
import com.revolut.feature.retail.salary_account.api.domain.SalaryAccountDestination$SalaryHub;
import com.revolut.feature.retail.salary_account.api.domain.SalaryAccountDestination$SalaryPromotion;
import com.revolut.feature.retail.salary_account.api.domain.SalaryAccountDestination$SwitchAssistant;
import com.revolut.feature.retail.salary_account.api.navigation.VerifyEmploymentDestination;
import com.revolut.feature.retail.salary_account.impl.flow.ui.SalaryAccountFlow;
import com.revolut.feature.retail.salary_account.impl.flow.ui.SalaryAccountFlowContract$InputData;
import com.revolut.feature.retail.salary_account.impl.salary_promotion.SalaryPromotionController;
import com.revolut.feature.retail.salary_account.impl.salary_promotion.SalaryPromotionControllerContract$InputData;
import com.revolut.feature.retail.salary_account.impl.switch_assistant.flow.SwitchAssistantFlow;
import com.revolut.feature.retail.salary_account.impl.switch_assistant.flow.SwitchAssistantFlowContract$InputData;
import com.revolut.feature.retail.salary_account.impl.work_email.flow.VerifyEmploymentFlow;
import com.revolut.feature.retail.salary_account.impl.work_email.flow.VerifyEmploymentFlowContract$InputData;
import com.revolut.kompot.common.flow.WrapperFlowImpl;
import dki.g;
import gc0.c;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements p, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f288559a;

    public b(ImmutableSet deeplinkGateways) {
        Intrinsics.checkNotNullParameter(deeplinkGateways, "deeplinkGateways");
        this.f288559a = deeplinkGateways;
    }

    public static WrapperFlowImpl a(SwitchAssistantFlowContract$InputData switchAssistantFlowContract$InputData) {
        return c.b(new SwitchAssistantFlow(switchAssistantFlowContract$InputData), new v1c.c(3));
    }

    @Override // nte.a
    public final List e() {
        return v.k(SalaryAccountApi$Toggles$SalaryAccountPhase2.f82946c, SalaryAccountApi$Toggles$SalaryAccountPhase3.f82947c, SalaryAccountApi$Toggles$SalaryAccountAvailability.f82945c, SalaryAccountApi$Toggles$SalarySwitchBot.f82948c);
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (Intrinsics.f(destination, SalaryAccountDestination$SalaryHub.f82951a)) {
            return new SalaryAccountFlow(0);
        }
        if (Intrinsics.f(destination, SalaryAccountDestination$MoveSalary.f82950a)) {
            return new SalaryAccountFlow(SalaryAccountFlowContract$InputData.MoveSalary.f82967a);
        }
        if (Intrinsics.f(destination, SalaryAccountDestination$IncomeInsuranceClaim.f82949a)) {
            return new SalaryAccountFlow(SalaryAccountFlowContract$InputData.IncomeInsuranceClaim.f82966a);
        }
        if (!(destination instanceof SalaryAccountDestination$SwitchAssistant)) {
            if (destination instanceof VerifyEmploymentDestination) {
                VerifyEmploymentDestination verifyEmploymentDestination = (VerifyEmploymentDestination) destination;
                return new VerifyEmploymentFlow(new VerifyEmploymentFlowContract$InputData(verifyEmploymentDestination.f82964a, verifyEmploymentDestination.f82965b));
            }
            if (!(destination instanceof SalaryAccountDestination$SalaryPromotion)) {
                return null;
            }
            SalaryAccountDestination$SalaryPromotion salaryAccountDestination$SalaryPromotion = (SalaryAccountDestination$SalaryPromotion) destination;
            return c.b(new SalaryPromotionController(new SalaryPromotionControllerContract$InputData(salaryAccountDestination$SalaryPromotion.f82952a, salaryAccountDestination$SalaryPromotion.f82953b)), new v1c.c(2));
        }
        SalaryAccountDestination$SwitchAssistant.SwitchAssistantDestination switchAssistantDestination = ((SalaryAccountDestination$SwitchAssistant) destination).f82954a;
        if (Intrinsics.f(switchAssistantDestination, SalaryAccountDestination$SwitchAssistant.SwitchAssistantDestination.Entry.f82956a)) {
            return new SwitchAssistantFlow(0);
        }
        if (Intrinsics.f(switchAssistantDestination, SalaryAccountDestination$SwitchAssistant.SwitchAssistantDestination.OpenEmailApp.f82958a)) {
            return a(SwitchAssistantFlowContract$InputData.OpenEmailApp.f83036a);
        }
        if (Intrinsics.f(switchAssistantDestination, SalaryAccountDestination$SwitchAssistant.SwitchAssistantDestination.PayrollManagerInput.f82959a)) {
            return a(SwitchAssistantFlowContract$InputData.PayrollManagerInput.f83037a);
        }
        if (Intrinsics.f(switchAssistantDestination, SalaryAccountDestination$SwitchAssistant.SwitchAssistantDestination.UpdatePayroll.f82963a)) {
            return a(SwitchAssistantFlowContract$InputData.UpdatePayroll.f83041a);
        }
        if (switchAssistantDestination instanceof SalaryAccountDestination$SwitchAssistant.SwitchAssistantDestination.EnterWorkEmail) {
            return a(new SwitchAssistantFlowContract$InputData.EnterWorkEmail(((SalaryAccountDestination$SwitchAssistant.SwitchAssistantDestination.EnterWorkEmail) switchAssistantDestination).f82955a));
        }
        if (switchAssistantDestination instanceof SalaryAccountDestination$SwitchAssistant.SwitchAssistantDestination.SendFollowUp) {
            return a(new SwitchAssistantFlowContract$InputData.SendFollowUp(((SalaryAccountDestination$SwitchAssistant.SwitchAssistantDestination.SendFollowUp) switchAssistantDestination).f82960a));
        }
        if (switchAssistantDestination instanceof SalaryAccountDestination$SwitchAssistant.SwitchAssistantDestination.MarkCompleted) {
            return a(new SwitchAssistantFlowContract$InputData.MarkCompleted(((SalaryAccountDestination$SwitchAssistant.SwitchAssistantDestination.MarkCompleted) switchAssistantDestination).f82957a));
        }
        if (switchAssistantDestination instanceof SalaryAccountDestination$SwitchAssistant.SwitchAssistantDestination.StartOver) {
            return new SwitchAssistantFlow(new SwitchAssistantFlowContract$InputData.StartOver(((SalaryAccountDestination$SwitchAssistant.SwitchAssistantDestination.StartOver) switchAssistantDestination).f82961a));
        }
        if (Intrinsics.f(switchAssistantDestination, SalaryAccountDestination$SwitchAssistant.SwitchAssistantDestination.Tracker.f82962a)) {
            return a(SwitchAssistantFlowContract$InputData.Tracker.f83040a);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // aii.p
    public final Set h() {
        return this.f288559a;
    }
}
