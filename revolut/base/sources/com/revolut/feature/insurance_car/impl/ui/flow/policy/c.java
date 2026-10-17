package com.revolut.feature.insurance_car.impl.ui.flow.policy;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c extends q implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        mm7.c p0 = (mm7.c) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        d dVar = (d) this.receiver;
        if (p0 instanceof mm7.b) {
            dVar.I2();
            return Unit.f186387a;
        }
        dVar.getClass();
        throw new NoWhenBranchMatchedException();
    }
}
