package com.revolut.feature.insurance_car.impl.ui.flow.smart_driving;

import com.revolut.feature.insurance_car.impl.ui.flow.smart_driving.SmartDrivingFlowContract$Step;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.smart_driving.SmartDrivingScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.smart_driving.SmartDrivingScreenContract$InputData;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import eif.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends g implements en7.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final SmartDrivingFlowContract$InputData f75495t;
    public final SmartDrivingFlowContract$Step.DrivingScore u;
    public final SmartDrivingFlowContract$State v;

    public a(SmartDrivingFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f75495t = inputData;
        this.u = SmartDrivingFlowContract$Step.DrivingScore.f75494a;
        this.v = SmartDrivingFlowContract$State.f75493a;
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        SmartDrivingFlowContract$Step step = (SmartDrivingFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof SmartDrivingFlowContract$Step.DrivingScore)) {
            throw new NoWhenBranchMatchedException();
        }
        SmartDrivingScreen smartDrivingScreen = new SmartDrivingScreen(new SmartDrivingScreenContract$InputData(this.f75495t.f75492a));
        c cVar = new c(1, this, a.class, "handleSmartDrivingScreenResult", "handleSmartDrivingScreenResult(Lcom/revolut/feature/insurance_car/impl/ui/screen/policy/smart_driving/SmartDrivingScreenContract$OutputData;)V", 0, 10);
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        smartDrivingScreen.H = cVar;
        return smartDrivingScreen;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.v;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.u;
    }
}
