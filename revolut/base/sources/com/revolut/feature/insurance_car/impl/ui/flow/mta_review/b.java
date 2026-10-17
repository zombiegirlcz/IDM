package com.revolut.feature.insurance_car.impl.ui.flow.mta_review;

import com.revolut.feature.insurance_car.impl.ui.flow.mta_review.a;
import go7.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b extends q implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        g p0 = (g) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        c cVar = (c) this.receiver;
        cVar.getClass();
        if (Intrinsics.f(p0, g.a.f145095a)) {
            cVar.C2(a.C0502a.f75388a);
        } else {
            if (!Intrinsics.f(p0, g.b.f145096a)) {
                throw new NoWhenBranchMatchedException();
            }
            cVar.C2(a.b.f75389a);
        }
        return Unit.f186387a;
    }
}
