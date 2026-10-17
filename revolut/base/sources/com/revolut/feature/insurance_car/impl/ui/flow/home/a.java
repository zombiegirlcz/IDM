package com.revolut.feature.insurance_car.impl.ui.flow.home;

import com.revolut.feature.insurance_car.impl.ui.flow.home.InsuranceCarHomeFlowContract$Step;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import mm7.c;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a extends q implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        c p0 = (c) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        b bVar = (b) this.receiver;
        bVar.getClass();
        if (!(p0 instanceof mm7.b)) {
            throw new NoWhenBranchMatchedException();
        }
        bVar.E2(new InsuranceCarHomeFlowContract$Step.Policy(((mm7.b) p0).f207167a), false, null, false);
        return Unit.f186387a;
    }
}
