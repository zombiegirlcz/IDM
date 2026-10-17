package com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.licence;

import ang.f;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_car.impl.data.model.Answer;
import com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.licence.LicenceFlowContract$Step;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import sp7.d;
import wk2.x;
import wm7.b;
import zhm.p;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends g implements b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f f75461t;
    public final LicenceFlowContract$Step.LicenceType u;
    public final LicenceFlowContract$State v;

    public a(f userInteractor) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f75461t = userInteractor;
        this.u = LicenceFlowContract$Step.LicenceType.f75460a;
        this.v = LicenceFlowContract$State.f75458a;
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        LicenceFlowContract$Step step = (LicenceFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof LicenceFlowContract$Step.LicenceType) {
            return d.b(new TextLocalisedClause(R$string.car_insurance_question_license_type_title, null, null, 14), p.c(Answer.LicenceType.values()), null, null, new x(this, 13), 12);
        }
        if (!(step instanceof LicenceFlowContract$Step.LicenceDuration)) {
            throw new NoWhenBranchMatchedException();
        }
        Answer.LicenceType licenceType = ((LicenceFlowContract$Step.LicenceDuration) step).f75459a;
        return d.b(new TextLocalisedClause(R$string.car_insurance_question_license_duration_title, null, null, 14), p.c(Answer.LicenceDuration.values()), xl7.d.g(licenceType), null, new wg2.g(licenceType, this, 20), 8);
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.v;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.u;
    }
}
