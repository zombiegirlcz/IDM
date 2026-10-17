package com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main;

import com.revolut.feature.insurance_car.impl.data.model.ApplicationForm;
import com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.CarOnboardingFlowContract$Step;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d extends q implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ap7.g p0 = (ap7.g) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        j jVar = (j) this.receiver;
        if (p0 instanceof ap7.e) {
            jVar.U2(ApplicationForm.a(((CarOnboardingFlowContract$State) jVar.A2().f98429a).f75402a, null, null, null, ((ap7.e) p0).f8104a, null, 1007));
            jVar.E2(CarOnboardingFlowContract$Step.DateSelector.f75411a, true, null, false);
        } else {
            if (!(p0 instanceof ap7.f)) {
                jVar.getClass();
                throw new NoWhenBranchMatchedException();
            }
            jVar.U2(ApplicationForm.a(((CarOnboardingFlowContract$State) jVar.A2().f98429a).f75402a, null, null, null, ((ap7.f) p0).f8105a, null, 1007));
        }
        return Unit.f186387a;
    }
}
