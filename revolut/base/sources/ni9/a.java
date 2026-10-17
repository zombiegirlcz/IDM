package ni9;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.feature.pay_later.api.PayLaterApi$Toggles;
import com.revolut.feature.pay_later.api.navigation.OverdueInfoDescriptor;
import com.revolut.feature.pay_later.api.navigation.PayLaterKompotDestination;
import com.revolut.feature.pay_later.api.navigation.PayLaterKompotFeatureConfig;
import com.revolut.feature.pay_later.api.navigation.PaymentScheduleOptionsDescriptor;
import com.revolut.feature.pay_later.api.navigation.RightToCancelDescriptor;
import com.revolut.feature.pay_later.impl.ui.accountdetails.PayLaterAccountDetailsScreen;
import com.revolut.feature.pay_later.impl.ui.activation.ActivationController;
import com.revolut.feature.pay_later.impl.ui.deactivation.PayLaterDeactivationController;
import com.revolut.feature.pay_later.impl.ui.linkedplans.PayLaterLinkedPlansController;
import com.revolut.feature.pay_later.impl.ui.linkedplans.PayLaterLinkedPlansControllerContract$InputData;
import com.revolut.feature.pay_later.impl.ui.overdue_info.OverdueInfoController;
import com.revolut.feature.pay_later.impl.ui.paymentbreakdown.PayLaterPaymentBreakdownScreen;
import com.revolut.feature.pay_later.impl.ui.paymentoptions.flow.PaymentOptionsFlow;
import com.revolut.feature.pay_later.impl.ui.paymentoptions.flow.PaymentOptionsFlowContract$InputData;
import com.revolut.feature.pay_later.impl.ui.plandetails.PayLaterPlanDetailsScreen;
import com.revolut.feature.pay_later.impl.ui.plandetails.PayLaterPlanDetailsScreenContract$InputData;
import com.revolut.feature.pay_later.impl.ui.planprogress.PlanProgressController;
import com.revolut.feature.pay_later.impl.ui.planslist.PayLaterPlansListScreen;
import com.revolut.feature.pay_later.impl.ui.repayamount.PayLaterRepayAmountScreen;
import com.revolut.feature.pay_later.impl.ui.repaymentdetails.PayLaterRepaymentDetailsScreen;
import com.revolut.feature.pay_later.impl.ui.repaymentdetails.PayLaterRepaymentDetailsScreenContract$InputData;
import com.revolut.feature.pay_later.impl.ui.repaymentslist.PayLaterRepaymentsListScreen;
import com.revolut.feature.pay_later.impl.ui.right_to_cancel.flow.RightToCancelFlow;
import com.revolut.feature.pay_later.impl.ui.right_to_cancel.flow.RightToCancelFlowContract$InputData;
import com.revolut.feature.pay_later.impl.ui.selectpayment.PayLaterSelectRepaymentScreen;
import com.revolut.feature.pay_later.impl.ui.selectplan.PayLaterSelectPlanScreen;
import gc0.c;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements ohi.a, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f215661a = 0;

    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof RightToCancelDescriptor) {
            RightToCancelDescriptor rightToCancelDescriptor = (RightToCancelDescriptor) descriptor;
            return rightToCancelDescriptor.a(new RightToCancelFlow(new RightToCancelFlowContract$InputData(rightToCancelDescriptor.getF78847a())));
        }
        if (descriptor instanceof PaymentScheduleOptionsDescriptor) {
            PaymentScheduleOptionsDescriptor paymentScheduleOptionsDescriptor = (PaymentScheduleOptionsDescriptor) descriptor;
            return paymentScheduleOptionsDescriptor.a(new PaymentOptionsFlow(new PaymentOptionsFlowContract$InputData(paymentScheduleOptionsDescriptor.getF78846a())));
        }
        if (descriptor instanceof OverdueInfoDescriptor) {
            return ((OverdueInfoDescriptor) descriptor).a(new OverdueInfoController());
        }
        return null;
    }

    @Override // nte.a
    public final List e() {
        return PayLaterApi$Toggles.a();
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        PayLaterKompotDestination payLaterKompotDestination = destination instanceof PayLaterKompotDestination ? (PayLaterKompotDestination) destination : null;
        if (payLaterKompotDestination == null) {
            return null;
        }
        if (payLaterKompotDestination instanceof PayLaterKompotFeatureConfig.LinkedPlansNavigationDestination) {
            return new PayLaterLinkedPlansController(new PayLaterLinkedPlansControllerContract$InputData(((PayLaterKompotFeatureConfig.LinkedPlansNavigationDestination) payLaterKompotDestination).getF78825a()));
        }
        if (payLaterKompotDestination instanceof PayLaterKompotFeatureConfig.AccountDetailsNavigationDestination) {
            return new PayLaterAccountDetailsScreen();
        }
        if (payLaterKompotDestination instanceof PayLaterKompotFeatureConfig.PlanDetailsNavigationDestination) {
            return new PayLaterPlanDetailsScreen(new PayLaterPlanDetailsScreenContract$InputData(((PayLaterKompotFeatureConfig.PlanDetailsNavigationDestination) payLaterKompotDestination).getF78832b()));
        }
        if (payLaterKompotDestination instanceof PayLaterKompotFeatureConfig.PlansListNavigationDestination) {
            return new PayLaterPlansListScreen();
        }
        if (payLaterKompotDestination instanceof PayLaterKompotFeatureConfig.RepaymentDetailsNavigationDestination) {
            PayLaterKompotFeatureConfig.RepaymentDetailsNavigationDestination repaymentDetailsNavigationDestination = (PayLaterKompotFeatureConfig.RepaymentDetailsNavigationDestination) payLaterKompotDestination;
            return new PayLaterRepaymentDetailsScreen(new PayLaterRepaymentDetailsScreenContract$InputData(repaymentDetailsNavigationDestination.getF78839b(), repaymentDetailsNavigationDestination.getF78840c()));
        }
        if (payLaterKompotDestination instanceof PayLaterKompotFeatureConfig.RepaymentsListNavigationDestination) {
            return new PayLaterRepaymentsListScreen();
        }
        if (payLaterKompotDestination instanceof PayLaterKompotFeatureConfig.SelectRepaymentNavigationDestination) {
            return new PayLaterSelectRepaymentScreen();
        }
        if (payLaterKompotDestination instanceof PayLaterKompotFeatureConfig.SelectPlanNavigationDestination) {
            return new PayLaterSelectPlanScreen();
        }
        if (payLaterKompotDestination instanceof PayLaterKompotFeatureConfig.PartialRepaymentsNavigationDestination) {
            return new PayLaterLinkedPlansController(new PayLaterLinkedPlansControllerContract$InputData(((PayLaterKompotFeatureConfig.PartialRepaymentsNavigationDestination) payLaterKompotDestination).getF78827b()));
        }
        if (payLaterKompotDestination instanceof PayLaterKompotFeatureConfig.RepayAmountNavigationDestination) {
            return new PayLaterRepayAmountScreen();
        }
        if (payLaterKompotDestination instanceof PayLaterKompotFeatureConfig.PaymentBreakdownNavigationDestination) {
            return new PayLaterPaymentBreakdownScreen((PayLaterKompotFeatureConfig.PaymentBreakdownNavigationDestination.InputData) ((PayLaterKompotFeatureConfig.PaymentBreakdownNavigationDestination) payLaterKompotDestination).f98300a);
        }
        if (payLaterKompotDestination instanceof PayLaterKompotFeatureConfig.PlanProgressNavigationDestination) {
            return c.b(new PlanProgressController(((PayLaterKompotFeatureConfig.PlanProgressNavigationDestination) payLaterKompotDestination).getF78834a()), new aab.b(27));
        }
        if (payLaterKompotDestination instanceof PayLaterKompotFeatureConfig.ActivationNavigationDestination) {
            return c.b(new ActivationController(), new aab.b(28));
        }
        if (payLaterKompotDestination instanceof PayLaterKompotFeatureConfig.DeactivationNavigationDestination) {
            return c.b(new PayLaterDeactivationController(), new aab.b(29));
        }
        throw new NoWhenBranchMatchedException();
    }
}
