package com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.claims;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_car.impl.data.model.Answer;
import com.revolut.feature.insurance_car.impl.data.model.Survey;
import com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.claims.ClaimsFlowContract$Step;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.survey.claims_details.ClaimsDetailsScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.survey.claims_details.ClaimsDetailsScreenContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import q97.p1;
import sp7.d;
import tl7.f;
import zhm.d0;
import zhm.f0;
import zhm.p;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends g implements qm7.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ClaimsFlowContract$InputData f75447t;
    public final f u;
    public final ClaimsFlowContract$Step.ClaimsCount v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ClaimsFlowContract$State f75448w;

    public b(ClaimsFlowContract$InputData inputData, f bottomDialog) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(bottomDialog, "bottomDialog");
        this.f75447t = inputData;
        this.u = bottomDialog;
        this.v = ClaimsFlowContract$Step.ClaimsCount.f75444a;
        this.f75448w = ClaimsFlowContract$State.f75443a;
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        ClaimsFlowContract$Step step = (ClaimsFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof ClaimsFlowContract$Step.ClaimsCount) {
            final int i = 0;
            return d.b(new TextLocalisedClause(R$string.car_insurance_question_claims_and_accidents_title, null, null, 14), p.c(Answer.ClaimsState.values()), null, null, new Function1(this) { // from class: qm7.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.claims.b f247777b;

                {
                    this.f247777b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    List list;
                    List listC;
                    Answer.ClaimsState claimsState = (Answer.ClaimsState) obj2;
                    switch (i) {
                        case 0:
                            Intrinsics.checkNotNullParameter(claimsState, "claimsState");
                            int i2 = d.f247778a[claimsState.ordinal()];
                            com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.claims.b bVar = this.f247777b;
                            if (i2 == 1) {
                                bVar.G2(new b(new Survey.Claims(claimsState, f0.f322471a)));
                            } else if (i2 == 2 || i2 == 3) {
                                int i3 = xl7.d.i(claimsState);
                                Survey.Claims claims = bVar.f75447t.f75442a;
                                if (claims == null || (list = claims.f75318b) == null) {
                                    list = f0.f322471a;
                                }
                                bVar.Y1(new ClaimsDetailsScreen(new ClaimsDetailsScreenContract$InputData(i3, list)), ModalDestination.Style.POPUP.f98311a, new qce.a(bVar, claimsState, 22));
                            } else if (i2 == 4) {
                                f.R(bVar.u, R$string.car_insurance_question_claims_and_accidents_declinature_warning_title, R$string.car_insurance_question_claims_and_accidents_declinature_warning_subtitle, null, Integer.valueOf(R$string.car_insurance_common_continue), Integer.valueOf(R$string.car_insurance_question_claims_and_accidents_declinature_warning_secondary_action_button_title), null, new qba.b(bVar, claimsState, 16), new p1(bVar, 12), 36);
                            } else {
                                if (i2 != 5) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                bVar.E2(ClaimsFlowContract$Step.WindscreenClaimsCount.f75445a, true, null, false);
                            }
                            return Unit.f186387a;
                        default:
                            Intrinsics.checkNotNullParameter(claimsState, "claimsState");
                            Survey.Claims.Details details = new Survey.Claims.Details(null, Answer.ClaimType.WINDSCREEN, null, null);
                            int i5 = d.f247778a[claimsState.ordinal()];
                            if (i5 != 1) {
                                if (i5 == 2) {
                                    listC = u.c(details);
                                } else if (i5 == 3) {
                                    listC = v.k(details, details);
                                } else if (i5 == 4) {
                                    listC = f0.f322471a;
                                } else if (i5 != 5) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                this.f247777b.G2(new b(new Survey.Claims(claimsState, listC)));
                                return Unit.f186387a;
                            }
                            throw new IllegalStateException(("selected value not possible " + claimsState).toString());
                    }
                }
            }, 12);
        }
        if (!(step instanceof ClaimsFlowContract$Step.WindscreenClaimsCount)) {
            throw new NoWhenBranchMatchedException();
        }
        final int i2 = 1;
        return d.b(new TextLocalisedClause(R$string.car_insurance_question_claims_and_accidents_window_title, null, null, 14), d0.A0(d0.A0(p.c(Answer.ClaimsState.values()), Answer.ClaimsState.WINDSCREEN_ONLY), Answer.ClaimsState.NO_CLAIMS), null, null, new Function1(this) { // from class: qm7.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.claims.b f247777b;

            {
                this.f247777b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                List list;
                List listC;
                Answer.ClaimsState claimsState = (Answer.ClaimsState) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(claimsState, "claimsState");
                        int i22 = d.f247778a[claimsState.ordinal()];
                        com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.claims.b bVar = this.f247777b;
                        if (i22 == 1) {
                            bVar.G2(new b(new Survey.Claims(claimsState, f0.f322471a)));
                        } else if (i22 == 2 || i22 == 3) {
                            int i3 = xl7.d.i(claimsState);
                            Survey.Claims claims = bVar.f75447t.f75442a;
                            if (claims == null || (list = claims.f75318b) == null) {
                                list = f0.f322471a;
                            }
                            bVar.Y1(new ClaimsDetailsScreen(new ClaimsDetailsScreenContract$InputData(i3, list)), ModalDestination.Style.POPUP.f98311a, new qce.a(bVar, claimsState, 22));
                        } else if (i22 == 4) {
                            f.R(bVar.u, R$string.car_insurance_question_claims_and_accidents_declinature_warning_title, R$string.car_insurance_question_claims_and_accidents_declinature_warning_subtitle, null, Integer.valueOf(R$string.car_insurance_common_continue), Integer.valueOf(R$string.car_insurance_question_claims_and_accidents_declinature_warning_secondary_action_button_title), null, new qba.b(bVar, claimsState, 16), new p1(bVar, 12), 36);
                        } else {
                            if (i22 != 5) {
                                throw new NoWhenBranchMatchedException();
                            }
                            bVar.E2(ClaimsFlowContract$Step.WindscreenClaimsCount.f75445a, true, null, false);
                        }
                        return Unit.f186387a;
                    default:
                        Intrinsics.checkNotNullParameter(claimsState, "claimsState");
                        Survey.Claims.Details details = new Survey.Claims.Details(null, Answer.ClaimType.WINDSCREEN, null, null);
                        int i5 = d.f247778a[claimsState.ordinal()];
                        if (i5 != 1) {
                            if (i5 == 2) {
                                listC = u.c(details);
                            } else if (i5 == 3) {
                                listC = v.k(details, details);
                            } else if (i5 == 4) {
                                listC = f0.f322471a;
                            } else if (i5 != 5) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f247777b.G2(new b(new Survey.Claims(claimsState, listC)));
                            return Unit.f186387a;
                        }
                        throw new IllegalStateException(("selected value not possible " + claimsState).toString());
                }
            }
        }, 12);
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.f75448w;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.v;
    }
}
