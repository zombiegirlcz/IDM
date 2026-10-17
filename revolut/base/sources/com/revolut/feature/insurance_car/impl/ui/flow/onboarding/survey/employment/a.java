package com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.employment;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_car.impl.data.model.Answer;
import com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.employment.EmploymentFlowContract$Step;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.survey.occupation.OccupationScreen;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import sp7.d;
import um7.b;
import zhm.p;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends g implements b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final EmploymentFlowContract$Step.EmploymentStatus f75457t = EmploymentFlowContract$Step.EmploymentStatus.f75455a;
    public final EmploymentFlowContract$State u = EmploymentFlowContract$State.f75454a;

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        EmploymentFlowContract$Step step = (EmploymentFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof EmploymentFlowContract$Step.EmploymentStatus) {
            return d.b(new TextLocalisedClause(R$string.car_insurance_question_employment_title, null, null, 14), p.c(Answer.EmploymentStatus.values()), null, null, new um7.d(this, 0), 12);
        }
        if (!(step instanceof EmploymentFlowContract$Step.Occupation)) {
            throw new NoWhenBranchMatchedException();
        }
        Answer.EmploymentStatus employmentStatus = ((EmploymentFlowContract$Step.Occupation) step).f75456a;
        OccupationScreen occupationScreen = new OccupationScreen();
        uif.d dVar = new uif.d(employmentStatus, this, 3);
        Intrinsics.checkNotNullParameter(dVar, "<set-?>");
        occupationScreen.H = dVar;
        return occupationScreen;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.u;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.f75457t;
    }
}
