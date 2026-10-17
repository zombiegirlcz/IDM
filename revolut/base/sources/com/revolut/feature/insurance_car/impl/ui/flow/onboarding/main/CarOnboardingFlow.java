package com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main;

import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import maa.r;
import no.d1;
import ql7.n;
import te0.w;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/main/CarOnboardingFlow;", "Lcom/revolut/kompot/navigable/flow/BaseFlow;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/main/CarOnboardingFlowContract$Step;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/main/CarOnboardingFlowContract$InputData;", "Lmm7/c;", "Lno/d1;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CarOnboardingFlow extends BaseFlow<CarOnboardingFlowContract$Step, CarOnboardingFlowContract$InputData, mm7.c> implements d1 {
    public final boolean P;
    public final Object Q;
    public final Object R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarOnboardingFlow(CarOnboardingFlowContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.P = true;
        this.Q = w.y0(new mhd.b(this, inputData, 7));
        this.R = w.y0(new r(this, 14));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final qji.a Q2() {
        return (n) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // qji.c
    public final qji.b R1() {
        return (n) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final s S2() {
        return (mm7.a) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final void f3(FlowStep flowStep) {
        CarOnboardingFlowContract$Step step = (CarOnboardingFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.P);
    }
}
