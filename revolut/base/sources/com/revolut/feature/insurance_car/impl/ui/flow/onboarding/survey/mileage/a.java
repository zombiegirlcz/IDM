package com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.mileage;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_car.impl.data.model.Answer;
import com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.mileage.MileageFlowContract$Step;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import sp7.d;
import yed.g0;
import ym7.b;
import zhm.p;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends g implements b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final MileageFlowContract$Step.Mileage f75464t = MileageFlowContract$Step.Mileage.f75463a;
    public final MileageFlowContract$State u = MileageFlowContract$State.f75462a;

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        MileageFlowContract$Step step = (MileageFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof MileageFlowContract$Step.Mileage) {
            return d.b(new TextLocalisedClause(R$string.car_insurance_mileage_title, null, null, 14), p.c(Answer.Mileage.values()), null, null, new g0(this, 21), 12);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.u;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.f75464t;
    }
}
