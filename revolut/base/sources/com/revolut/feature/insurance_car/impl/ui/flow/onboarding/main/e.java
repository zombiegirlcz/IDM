package com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main;

import com.revolut.feature.insurance_car.impl.ui.screen.common.benefit_details.BenefitDetailsScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.common.benefit_details.BenefitDetailsScreenContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e extends q implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ln7.e p0 = (ln7.e) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        j jVar = (j) this.receiver;
        jVar.getClass();
        if (!(p0 instanceof ln7.d)) {
            throw new NoWhenBranchMatchedException();
        }
        jVar.Y1(new BenefitDetailsScreen(new BenefitDetailsScreenContract$InputData(((ln7.d) p0).f197111a)), ModalDestination.Style.POPUP.f98311a, new mm7.d(jVar, 3));
        return Unit.f186387a;
    }
}
