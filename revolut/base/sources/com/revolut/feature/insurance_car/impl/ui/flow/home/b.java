package com.revolut.feature.insurance_car.impl.ui.flow.home;

import com.revolut.feature.insurance_car.impl.ui.flow.home.InsuranceCarHomeFlowContract$Step;
import com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.CarOnboardingFlow;
import com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.CarOnboardingFlowContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.flow.policy.CarPolicyFlow;
import com.revolut.feature.insurance_car.impl.ui.flow.policy.CarPolicyFlowContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.home.InsuranceCarHomeScreen;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import eif.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends g implements em7.b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final InsuranceCarHomeFlowContract$Step.Home f75359t = InsuranceCarHomeFlowContract$Step.Home.f75356a;
    public final InsuranceCarHomeFlowContract$State u = InsuranceCarHomeFlowContract$State.f75355a;

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        InsuranceCarHomeFlowContract$Step step = (InsuranceCarHomeFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof InsuranceCarHomeFlowContract$Step.Home) {
            InsuranceCarHomeScreen insuranceCarHomeScreen = new InsuranceCarHomeScreen();
            c cVar = new c(1, this, b.class, "handleHomeScreenResult", "handleHomeScreenResult(Lcom/revolut/feature/insurance_car/impl/ui/screen/home/InsuranceCarHomeScreenContract$OutputData;)V", 0, 9);
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            insuranceCarHomeScreen.H = cVar;
            return insuranceCarHomeScreen;
        }
        if (!(step instanceof InsuranceCarHomeFlowContract$Step.Onboarding)) {
            if (step instanceof InsuranceCarHomeFlowContract$Step.Policy) {
                return new CarPolicyFlow(new CarPolicyFlowContract$InputData(((InsuranceCarHomeFlowContract$Step.Policy) step).f75358a, null));
            }
            throw new NoWhenBranchMatchedException();
        }
        CarOnboardingFlow carOnboardingFlow = new CarOnboardingFlow(new CarOnboardingFlowContract$InputData.Application(((InsuranceCarHomeFlowContract$Step.Onboarding) step).f75357a));
        a aVar = new a(1, 0, b.class, this, "handleOnboardingFlowResult", "handleOnboardingFlowResult(Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/main/CarOnboardingFlowContract$OutputData;)V");
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        carOnboardingFlow.J = aVar;
        return carOnboardingFlow;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.u;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.f75359t;
    }
}
