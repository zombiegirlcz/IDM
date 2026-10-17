package com.revolut.feature.insurance_car.impl.ui.flow.policy;

import com.revolut.feature.insurance_car.impl.ui.flow.mta_review.a;
import jli.h;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b extends q implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        com.revolut.feature.insurance_car.impl.ui.flow.mta_review.a p0 = (com.revolut.feature.insurance_car.impl.ui.flow.mta_review.a) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        d dVar = (d) this.receiver;
        dVar.getClass();
        if (Intrinsics.f(p0, a.C0502a.f75388a)) {
            dVar.B2(true);
        } else {
            if (!Intrinsics.f(p0, a.b.f75389a)) {
                throw new NoWhenBranchMatchedException();
            }
            int i = h.f175850a;
        }
        return Unit.f186387a;
    }
}
