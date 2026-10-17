package com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main;

import com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.CarOnboardingFlowContract$Step;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g extends q implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ip7.h p0 = (ip7.h) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        j jVar = (j) this.receiver;
        if (p0 instanceof ip7.g) {
            jVar.S2(new CarOnboardingFlowContract$Step.ProofOfDrivingNumber(((CarOnboardingFlowContract$State) jVar.A2().f98429a).f75402a.f75166a, ((ip7.g) p0).f167669a));
            return Unit.f186387a;
        }
        jVar.getClass();
        throw new NoWhenBranchMatchedException();
    }
}
