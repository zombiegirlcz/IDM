package com.revolut.feature.insurance_car.impl.ui.flow.mta;

import com.revolut.feature.insurance_car.impl.ui.flow.mta.MtaFlowContract$Step;
import com.revolut.feature.insurance_car.impl.ui.flow.mta_review.a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a extends q implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        com.revolut.feature.insurance_car.impl.ui.flow.mta_review.a p0 = (com.revolut.feature.insurance_car.impl.ui.flow.mta_review.a) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        b bVar = (b) this.receiver;
        if (p0 instanceof a.C0502a) {
            bVar.I2();
        } else {
            if (!(p0 instanceof a.b)) {
                bVar.getClass();
                throw new NoWhenBranchMatchedException();
            }
            bVar.P2(MtaFlowContract$Step.SelectCar.f75376a);
            bVar.r2();
        }
        return Unit.f186387a;
    }
}
