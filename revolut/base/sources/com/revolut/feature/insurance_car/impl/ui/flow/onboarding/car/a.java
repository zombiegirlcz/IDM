package com.revolut.feature.insurance_car.impl.ui.flow.onboarding.car;

import com.revolut.feature.insurance_car.impl.ui.flow.onboarding.car.CarSelectFlowContract$Step;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import no7.g;
import no7.h;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a extends q implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        h p0 = (h) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        b bVar = (b) this.receiver;
        bVar.getClass();
        if (p0 instanceof g) {
            bVar.O2(((g) p0).f217936a);
        } else {
            if (!(p0 instanceof h.a)) {
                throw new NoWhenBranchMatchedException();
            }
            bVar.E2(new CarSelectFlowContract$Step.CarManualInput(null), true, null, false);
        }
        return Unit.f186387a;
    }
}
