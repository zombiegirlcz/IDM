package va5;

import aii.e;
import aii.g;
import aii.p;
import aii.u;
import com.revolut.feature.credit.post_termination_plan.api.navigation.CreditPostTerminationPlanEntryPoint;
import com.revolut.feature.credit.post_termination_plan.impl.ui.plandetails.PostTerminationPlanDetailsFlow;
import com.revolut.feature.credit.post_termination_plan.impl.ui.plandetails.PostTerminationPlanDetailsFlowContract$InputData;
import com.revolut.feature.credit.post_termination_plan.impl.ui.repay.PostTerminationPlanManualRepaymentController;
import com.revolut.feature.credit.post_termination_plan.impl.ui.repay.PostTerminationPlanManualRepaymentControllerContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import qa5.b;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f287129a;

    public a(b postTerminationExplainerControllerFactory) {
        Intrinsics.checkNotNullParameter(postTerminationExplainerControllerFactory, "postTerminationExplainerControllerFactory");
        this.f287129a = postTerminationExplainerControllerFactory;
    }

    public final ViewController a(CreditPostTerminationPlanEntryPoint creditPostTerminationPlanEntryPoint) {
        if (creditPostTerminationPlanEntryPoint instanceof CreditPostTerminationPlanEntryPoint.Repay) {
            return new PostTerminationPlanManualRepaymentController(new PostTerminationPlanManualRepaymentControllerContract$InputData(((CreditPostTerminationPlanEntryPoint.Repay) creditPostTerminationPlanEntryPoint).f70663b));
        }
        if (creditPostTerminationPlanEntryPoint instanceof CreditPostTerminationPlanEntryPoint.PlanDetailsFlow) {
            CreditPostTerminationPlanEntryPoint.PlanDetailsFlow planDetailsFlow = (CreditPostTerminationPlanEntryPoint.PlanDetailsFlow) creditPostTerminationPlanEntryPoint;
            return new PostTerminationPlanDetailsFlow(new PostTerminationPlanDetailsFlowContract$InputData(planDetailsFlow.f70661b, planDetailsFlow.f70662c));
        }
        if (!(creditPostTerminationPlanEntryPoint instanceof CreditPostTerminationPlanEntryPoint.PlanDetailsExplainer)) {
            throw new NoWhenBranchMatchedException();
        }
        return this.f287129a.a(((CreditPostTerminationPlanEntryPoint.PlanDetailsExplainer) creditPostTerminationPlanEntryPoint).f70660b);
    }

    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        CreditPostTerminationPlanEntryPoint creditPostTerminationPlanEntryPoint = descriptor instanceof CreditPostTerminationPlanEntryPoint ? (CreditPostTerminationPlanEntryPoint) descriptor : null;
        if (creditPostTerminationPlanEntryPoint != null) {
            return creditPostTerminationPlanEntryPoint.a(a(creditPostTerminationPlanEntryPoint));
        }
        return null;
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        CreditPostTerminationPlanEntryPoint creditPostTerminationPlanEntryPoint = destination instanceof CreditPostTerminationPlanEntryPoint ? (CreditPostTerminationPlanEntryPoint) destination : null;
        if (creditPostTerminationPlanEntryPoint != null) {
            return a(creditPostTerminationPlanEntryPoint);
        }
        return null;
    }
}
