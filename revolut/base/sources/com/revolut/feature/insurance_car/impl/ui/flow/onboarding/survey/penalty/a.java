package com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.penalty;

import a76.c;
import an7.b;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_car.impl.data.model.Answer;
import com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.penalty.PenaltyFlowContract$Step;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import sp7.d;
import tl7.f;
import zhm.p;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends g implements b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f f75467t;
    public final PenaltyFlowContract$Step.PenaltyPoints u;
    public final PenaltyFlowContract$State v;

    public a(f bottomDialog) {
        Intrinsics.checkNotNullParameter(bottomDialog, "bottomDialog");
        this.f75467t = bottomDialog;
        this.u = PenaltyFlowContract$Step.PenaltyPoints.f75466a;
        this.v = PenaltyFlowContract$State.f75465a;
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        PenaltyFlowContract$Step step = (PenaltyFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof PenaltyFlowContract$Step.PenaltyPoints)) {
            throw new NoWhenBranchMatchedException();
        }
        return d.b(new TextLocalisedClause(R$string.car_insurance_question_penalty_points_title, null, null, 14), p.c(Answer.PenaltyPoints.values()), null, new c(0, this, a.class, "handleInfoMenuItem", "handleInfoMenuItem()V", 0, 1), new an7.d(1, 0, a.class, this, "handlePenaltyPointSelected", "handlePenaltyPointSelected(Lcom/revolut/feature/insurance_car/impl/data/model/Answer$PenaltyPoints;)V"), 4);
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
