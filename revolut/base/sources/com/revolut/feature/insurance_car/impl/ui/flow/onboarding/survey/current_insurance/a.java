package com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.current_insurance;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_car.impl.data.model.Answer;
import com.revolut.feature.insurance_car.impl.data.model.Survey;
import com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.current_insurance.CurrentInsuranceFlowContract$State;
import com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.current_insurance.CurrentInsuranceFlowContract$Step;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import sm7.b;
import sm7.c;
import sp7.d;
import tl7.f;
import zhm.p;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends g implements b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f f75453t;
    public final CurrentInsuranceFlowContract$Step.InsuranceStatus u;
    public final CurrentInsuranceFlowContract$State v;

    public a(f bottomDialog) {
        Intrinsics.checkNotNullParameter(bottomDialog, "bottomDialog");
        this.f75453t = bottomDialog;
        this.u = CurrentInsuranceFlowContract$Step.InsuranceStatus.f75451a;
        this.v = new CurrentInsuranceFlowContract$State(0);
    }

    public final void O2() {
        G2(new c(new Survey.CurrentInsurance(((CurrentInsuranceFlowContract$State) A2().f98429a).f75449a, ((CurrentInsuranceFlowContract$State) A2().f98429a).f75450b, null)));
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        CurrentInsuranceFlowContract$Step step = (CurrentInsuranceFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof CurrentInsuranceFlowContract$Step.InsuranceStatus) {
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.car_insurance_question_current_insurance_title, null, null, 14);
            Answer.CurrentInsuranceState.INSTANCE.getClass();
            final int i = 0;
            return d.b(textLocalisedClause, v.k(Answer.CurrentInsuranceState.OWN_POLICY, Answer.CurrentInsuranceState.NO_INSURANCE, Answer.CurrentInsuranceState.NAMED_DRIVER), null, null, new Function1(this) { // from class: sm7.d

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.current_insurance.a f264385b;

                {
                    this.f264385b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i) {
                        case 0:
                            Answer.CurrentInsuranceState insuranceState = (Answer.CurrentInsuranceState) obj2;
                            Intrinsics.checkNotNullParameter(insuranceState, "insuranceState");
                            com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.current_insurance.a aVar = this.f264385b;
                            CurrentInsuranceFlowContract$State updateState = (CurrentInsuranceFlowContract$State) aVar.A2().f98429a;
                            Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                            aVar.L2(CurrentInsuranceFlowContract$State.a(updateState, insuranceState, null, 2));
                            if (e.f264386a[insuranceState.ordinal()] == 1) {
                                aVar.O2();
                            } else {
                                aVar.E2(CurrentInsuranceFlowContract$Step.NoClaimsYears.f75452a, true, null, false);
                            }
                            break;
                        default:
                            Answer.NoClaimsDiscount noClaimsDiscount = (Answer.NoClaimsDiscount) obj2;
                            Intrinsics.checkNotNullParameter(noClaimsDiscount, "noClaimsDiscount");
                            com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.current_insurance.a aVar2 = this.f264385b;
                            CurrentInsuranceFlowContract$State updateState2 = (CurrentInsuranceFlowContract$State) aVar2.A2().f98429a;
                            Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                            aVar2.L2(CurrentInsuranceFlowContract$State.a(updateState2, null, noClaimsDiscount, 1));
                            aVar2.O2();
                            break;
                    }
                    return Unit.f186387a;
                }
            }, 12);
        }
        if (!(step instanceof CurrentInsuranceFlowContract$Step.NoClaimsYears)) {
            throw new NoWhenBranchMatchedException();
        }
        Answer.CurrentInsuranceState currentInsuranceState = ((CurrentInsuranceFlowContract$State) A2().f98429a).f75449a;
        Answer.CurrentInsuranceState currentInsuranceState2 = Answer.CurrentInsuranceState.OWN_POLICY;
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(currentInsuranceState == currentInsuranceState2 ? R$string.car_insurance_question_no_claims_years_policy_in_my_name_title : R$string.car_insurance_question_no_claims_years_insured_as_named_driver_or_on_company_car_title, null, null, 14);
        List listC = p.c(Answer.NoClaimsDiscount.values());
        int i2 = ((CurrentInsuranceFlowContract$State) A2().f98429a).f75449a == currentInsuranceState2 ? R$string.car_insurance_question_no_claims_years_policy_in_my_name_subtitle : R$string.car_insurance_question_no_claims_years_insured_as_named_driver_or_on_company_car_subtitle;
        final int i3 = 1;
        return d.a(textLocalisedClause2, listC, new TextLocalisedClause(i2, null, null, 14), new sii.a(this, 4), new Function1(this) { // from class: sm7.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.current_insurance.a f264385b;

            {
                this.f264385b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i3) {
                    case 0:
                        Answer.CurrentInsuranceState insuranceState = (Answer.CurrentInsuranceState) obj2;
                        Intrinsics.checkNotNullParameter(insuranceState, "insuranceState");
                        com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.current_insurance.a aVar = this.f264385b;
                        CurrentInsuranceFlowContract$State updateState = (CurrentInsuranceFlowContract$State) aVar.A2().f98429a;
                        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                        aVar.L2(CurrentInsuranceFlowContract$State.a(updateState, insuranceState, null, 2));
                        if (e.f264386a[insuranceState.ordinal()] == 1) {
                            aVar.O2();
                        } else {
                            aVar.E2(CurrentInsuranceFlowContract$Step.NoClaimsYears.f75452a, true, null, false);
                        }
                        break;
                    default:
                        Answer.NoClaimsDiscount noClaimsDiscount = (Answer.NoClaimsDiscount) obj2;
                        Intrinsics.checkNotNullParameter(noClaimsDiscount, "noClaimsDiscount");
                        com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.current_insurance.a aVar2 = this.f264385b;
                        CurrentInsuranceFlowContract$State updateState2 = (CurrentInsuranceFlowContract$State) aVar2.A2().f98429a;
                        Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                        aVar2.L2(CurrentInsuranceFlowContract$State.a(updateState2, null, noClaimsDiscount, 1));
                        aVar2.O2();
                        break;
                }
                return Unit.f186387a;
            }
        });
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
