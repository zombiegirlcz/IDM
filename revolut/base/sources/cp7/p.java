package cp7;

import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_car.impl.data.model.Answer;
import com.revolut.feature.insurance_car.impl.data.model.ApplicationForm;
import com.revolut.feature.insurance_car.impl.data.model.Survey;
import com.revolut.feature.insurance_car.impl.ui.flow.onboarding.car.CarSelectFlow;
import com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.claims.ClaimsFlow;
import com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.claims.ClaimsFlowContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.claims.a;
import com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.current_insurance.CurrentInsuranceFlow;
import com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.employment.EmploymentFlow;
import com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.licence.LicenceFlow;
import com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.mileage.MileageFlow;
import com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.penalty.PenaltyFlow;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.address.AddressPickerScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.address.AddressPickerScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.date.DateSelectorScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.date.DateSelectorScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.driver.list.AdditionalDriverListScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.driver.list.AdditionalDriverListScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.edit_application.EditApplicationScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.eligibility.EligibilityScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.eligibility.EligibilityScreenContract$InputData;
import com.youTransactor.uCube.rpc.Constants;
import cp7.f;
import java.util.List;
import java.util.Map;
import kl7.n0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.r0;

/* JADX INFO: loaded from: classes4.dex */
public final class p extends jki.g implements h {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ang.f f107905p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final tl7.f f107906q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e f107907r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(jki.p stateMapper, EditApplicationScreenContract$InputData inputData, ang.f userInteractor, tl7.f bottomDialog) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(bottomDialog, "bottomDialog");
        this.f107905p = userInteractor;
        this.f107906q = bottomDialog;
        ApplicationForm applicationForm = inputData.f75583a;
        this.f107907r = new e(applicationForm, applicationForm, null, null, inputData.f75584b);
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, rd0.e.b(nim.a.w(this.f107905p.k(false), new h0() { // from class: cp7.n
            @Override // kotlin.jvm.internal.h0, wim.p
            public final Object get(Object obj2) {
                return ((do3.n) obj2).k;
            }
        })), null, null, new ck7.j(this, null, 10), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f107907r;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void y2(String listId) {
        Survey.CurrentInsurance currentInsurance;
        Intrinsics.checkNotNullParameter(listId, "listId");
        switch (listId.hashCode()) {
            case -1684158306:
                if (listId.equals("ADDRESS_ITEM")) {
                    yji.l.g2(this, new AddressPickerScreen(new AddressPickerScreenContract$InputData(false)), null, null, 3);
                    break;
                }
                break;
            case -1651026847:
                if (listId.equals("LICENCE_ITEM")) {
                    final int i = 0;
                    yji.l.i2(this, new LicenceFlow(), null, new Function1(this) { // from class: cp7.j

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ p f107902b;

                        {
                            this.f107902b = this;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            int i2 = i;
                            p pVar = this.f107902b;
                            switch (i2) {
                                case 0:
                                    wm7.c result = (wm7.c) obj2;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    pVar.x2(new k(result, 7));
                                    return Unit.f186387a;
                                case 1:
                                    km7.c result2 = (km7.c) obj2;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    pVar.x2(new k(result2, 6));
                                    return Unit.f186387a;
                                case 2:
                                    ep7.g result3 = (ep7.g) obj2;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    if (!(result3 instanceof ep7.f)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    pVar.x2(new k(result3, 3));
                                    return Unit.f186387a;
                                case 3:
                                    ap7.g result4 = (ap7.g) obj2;
                                    Intrinsics.checkNotNullParameter(result4, "result");
                                    if (result4 instanceof ap7.e) {
                                        pVar.x2(new k(result4, 2));
                                    } else {
                                        int i3 = jli.h.f175850a;
                                    }
                                    return Unit.f186387a;
                                case 4:
                                    com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.claims.a result5 = (com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.claims.a) obj2;
                                    Intrinsics.checkNotNullParameter(result5, "result");
                                    if (result5 instanceof qm7.b) {
                                        pVar.x2(new k(result5, 4));
                                    } else {
                                        if (!(result5 instanceof a.C0504a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        pVar.v2(f.b.f107895a);
                                    }
                                    return Unit.f186387a;
                                case 5:
                                    um7.c result6 = (um7.c) obj2;
                                    Intrinsics.checkNotNullParameter(result6, "result");
                                    pVar.x2(new k(result6, 0));
                                    return Unit.f186387a;
                                case 6:
                                    sm7.c result7 = (sm7.c) obj2;
                                    Intrinsics.checkNotNullParameter(result7, "result");
                                    pVar.x2(new k(result7, 5));
                                    return Unit.f186387a;
                                case 7:
                                    wo7.f result8 = (wo7.f) obj2;
                                    Intrinsics.checkNotNullParameter(result8, "result");
                                    if (!(result8 instanceof wo7.e)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    pVar.x2(new k(result8, 9));
                                    return Unit.f186387a;
                                case 8:
                                    an7.c result9 = (an7.c) obj2;
                                    Intrinsics.checkNotNullParameter(result9, "result");
                                    pVar.x2(new k(result9, 8));
                                    return Unit.f186387a;
                                default:
                                    ym7.c result10 = (ym7.c) obj2;
                                    Intrinsics.checkNotNullParameter(result10, "result");
                                    pVar.x2(new k(result10, 1));
                                    return Unit.f186387a;
                            }
                        }
                    }, 1);
                    break;
                }
                break;
            case -1521044085:
                if (listId.equals("PENALTIES_ITEM")) {
                    final int i2 = 8;
                    yji.l.i2(this, new PenaltyFlow(), null, new Function1(this) { // from class: cp7.j

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ p f107902b;

                        {
                            this.f107902b = this;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            int i22 = i2;
                            p pVar = this.f107902b;
                            switch (i22) {
                                case 0:
                                    wm7.c result = (wm7.c) obj2;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    pVar.x2(new k(result, 7));
                                    return Unit.f186387a;
                                case 1:
                                    km7.c result2 = (km7.c) obj2;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    pVar.x2(new k(result2, 6));
                                    return Unit.f186387a;
                                case 2:
                                    ep7.g result3 = (ep7.g) obj2;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    if (!(result3 instanceof ep7.f)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    pVar.x2(new k(result3, 3));
                                    return Unit.f186387a;
                                case 3:
                                    ap7.g result4 = (ap7.g) obj2;
                                    Intrinsics.checkNotNullParameter(result4, "result");
                                    if (result4 instanceof ap7.e) {
                                        pVar.x2(new k(result4, 2));
                                    } else {
                                        int i3 = jli.h.f175850a;
                                    }
                                    return Unit.f186387a;
                                case 4:
                                    com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.claims.a result5 = (com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.claims.a) obj2;
                                    Intrinsics.checkNotNullParameter(result5, "result");
                                    if (result5 instanceof qm7.b) {
                                        pVar.x2(new k(result5, 4));
                                    } else {
                                        if (!(result5 instanceof a.C0504a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        pVar.v2(f.b.f107895a);
                                    }
                                    return Unit.f186387a;
                                case 5:
                                    um7.c result6 = (um7.c) obj2;
                                    Intrinsics.checkNotNullParameter(result6, "result");
                                    pVar.x2(new k(result6, 0));
                                    return Unit.f186387a;
                                case 6:
                                    sm7.c result7 = (sm7.c) obj2;
                                    Intrinsics.checkNotNullParameter(result7, "result");
                                    pVar.x2(new k(result7, 5));
                                    return Unit.f186387a;
                                case 7:
                                    wo7.f result8 = (wo7.f) obj2;
                                    Intrinsics.checkNotNullParameter(result8, "result");
                                    if (!(result8 instanceof wo7.e)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    pVar.x2(new k(result8, 9));
                                    return Unit.f186387a;
                                case 8:
                                    an7.c result9 = (an7.c) obj2;
                                    Intrinsics.checkNotNullParameter(result9, "result");
                                    pVar.x2(new k(result9, 8));
                                    return Unit.f186387a;
                                default:
                                    ym7.c result10 = (ym7.c) obj2;
                                    Intrinsics.checkNotNullParameter(result10, "result");
                                    pVar.x2(new k(result10, 1));
                                    return Unit.f186387a;
                            }
                        }
                    }, 1);
                    break;
                }
                break;
            case -995334082:
                if (listId.equals("FOOTER_ITEM_ACTION")) {
                    tl7.f.R(this.f107906q, R$string.car_insurance_edit_application_hints_automated_decision_making_title, R$string.car_insurance_edit_application_hints_automated_decision_making_text, null, null, null, null, null, null, Constants.TAG_FC_SPEED_MODE);
                    break;
                }
                break;
            case -922248824:
                if (listId.equals("MILEAGE_ITEM")) {
                    final int i3 = 9;
                    yji.l.i2(this, new MileageFlow(), null, new Function1(this) { // from class: cp7.j

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ p f107902b;

                        {
                            this.f107902b = this;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            int i22 = i3;
                            p pVar = this.f107902b;
                            switch (i22) {
                                case 0:
                                    wm7.c result = (wm7.c) obj2;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    pVar.x2(new k(result, 7));
                                    return Unit.f186387a;
                                case 1:
                                    km7.c result2 = (km7.c) obj2;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    pVar.x2(new k(result2, 6));
                                    return Unit.f186387a;
                                case 2:
                                    ep7.g result3 = (ep7.g) obj2;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    if (!(result3 instanceof ep7.f)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    pVar.x2(new k(result3, 3));
                                    return Unit.f186387a;
                                case 3:
                                    ap7.g result4 = (ap7.g) obj2;
                                    Intrinsics.checkNotNullParameter(result4, "result");
                                    if (result4 instanceof ap7.e) {
                                        pVar.x2(new k(result4, 2));
                                    } else {
                                        int i32 = jli.h.f175850a;
                                    }
                                    return Unit.f186387a;
                                case 4:
                                    com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.claims.a result5 = (com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.claims.a) obj2;
                                    Intrinsics.checkNotNullParameter(result5, "result");
                                    if (result5 instanceof qm7.b) {
                                        pVar.x2(new k(result5, 4));
                                    } else {
                                        if (!(result5 instanceof a.C0504a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        pVar.v2(f.b.f107895a);
                                    }
                                    return Unit.f186387a;
                                case 5:
                                    um7.c result6 = (um7.c) obj2;
                                    Intrinsics.checkNotNullParameter(result6, "result");
                                    pVar.x2(new k(result6, 0));
                                    return Unit.f186387a;
                                case 6:
                                    sm7.c result7 = (sm7.c) obj2;
                                    Intrinsics.checkNotNullParameter(result7, "result");
                                    pVar.x2(new k(result7, 5));
                                    return Unit.f186387a;
                                case 7:
                                    wo7.f result8 = (wo7.f) obj2;
                                    Intrinsics.checkNotNullParameter(result8, "result");
                                    if (!(result8 instanceof wo7.e)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    pVar.x2(new k(result8, 9));
                                    return Unit.f186387a;
                                case 8:
                                    an7.c result9 = (an7.c) obj2;
                                    Intrinsics.checkNotNullParameter(result9, "result");
                                    pVar.x2(new k(result9, 8));
                                    return Unit.f186387a;
                                default:
                                    ym7.c result10 = (ym7.c) obj2;
                                    Intrinsics.checkNotNullParameter(result10, "result");
                                    pVar.x2(new k(result10, 1));
                                    return Unit.f186387a;
                            }
                        }
                    }, 1);
                    break;
                }
                break;
            case -504901467:
                if (listId.equals("ELIGIBILITY_ITEM")) {
                    Map mapG = ((e) t2()).f107890b.f;
                    if (mapG == null) {
                        mapG = r0.g();
                    }
                    List list = ((e) t2()).f107890b.e;
                    boolean z = !(list == null || list.isEmpty());
                    n0[] n0VarArrValues = n0.values();
                    ApplicationForm applicationForm = ((e) t2()).f107890b;
                    Intrinsics.checkNotNullParameter(applicationForm, "<this>");
                    Survey survey = applicationForm.d;
                    final int i5 = 2;
                    yji.l.g2(this, new EligibilityScreen(new EligibilityScreenContract$InputData(z, false, d8l.d.m(n0VarArrValues, ((survey == null || (currentInsurance = survey.f75316c) == null) ? null : currentInsurance.f75322a) == Answer.CurrentInsuranceState.NO_INSURANCE), mapG)), null, new Function1(this) { // from class: cp7.j

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ p f107902b;

                        {
                            this.f107902b = this;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            int i22 = i5;
                            p pVar = this.f107902b;
                            switch (i22) {
                                case 0:
                                    wm7.c result = (wm7.c) obj2;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    pVar.x2(new k(result, 7));
                                    return Unit.f186387a;
                                case 1:
                                    km7.c result2 = (km7.c) obj2;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    pVar.x2(new k(result2, 6));
                                    return Unit.f186387a;
                                case 2:
                                    ep7.g result3 = (ep7.g) obj2;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    if (!(result3 instanceof ep7.f)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    pVar.x2(new k(result3, 3));
                                    return Unit.f186387a;
                                case 3:
                                    ap7.g result4 = (ap7.g) obj2;
                                    Intrinsics.checkNotNullParameter(result4, "result");
                                    if (result4 instanceof ap7.e) {
                                        pVar.x2(new k(result4, 2));
                                    } else {
                                        int i32 = jli.h.f175850a;
                                    }
                                    return Unit.f186387a;
                                case 4:
                                    com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.claims.a result5 = (com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.claims.a) obj2;
                                    Intrinsics.checkNotNullParameter(result5, "result");
                                    if (result5 instanceof qm7.b) {
                                        pVar.x2(new k(result5, 4));
                                    } else {
                                        if (!(result5 instanceof a.C0504a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        pVar.v2(f.b.f107895a);
                                    }
                                    return Unit.f186387a;
                                case 5:
                                    um7.c result6 = (um7.c) obj2;
                                    Intrinsics.checkNotNullParameter(result6, "result");
                                    pVar.x2(new k(result6, 0));
                                    return Unit.f186387a;
                                case 6:
                                    sm7.c result7 = (sm7.c) obj2;
                                    Intrinsics.checkNotNullParameter(result7, "result");
                                    pVar.x2(new k(result7, 5));
                                    return Unit.f186387a;
                                case 7:
                                    wo7.f result8 = (wo7.f) obj2;
                                    Intrinsics.checkNotNullParameter(result8, "result");
                                    if (!(result8 instanceof wo7.e)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    pVar.x2(new k(result8, 9));
                                    return Unit.f186387a;
                                case 8:
                                    an7.c result9 = (an7.c) obj2;
                                    Intrinsics.checkNotNullParameter(result9, "result");
                                    pVar.x2(new k(result9, 8));
                                    return Unit.f186387a;
                                default:
                                    ym7.c result10 = (ym7.c) obj2;
                                    Intrinsics.checkNotNullParameter(result10, "result");
                                    pVar.x2(new k(result10, 1));
                                    return Unit.f186387a;
                            }
                        }
                    }, 1);
                    break;
                }
                break;
            case 616869766:
                if (listId.equals("EMPLOYMENT_ITEM")) {
                    final int i6 = 5;
                    yji.l.i2(this, new EmploymentFlow(), null, new Function1(this) { // from class: cp7.j

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ p f107902b;

                        {
                            this.f107902b = this;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            int i22 = i6;
                            p pVar = this.f107902b;
                            switch (i22) {
                                case 0:
                                    wm7.c result = (wm7.c) obj2;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    pVar.x2(new k(result, 7));
                                    return Unit.f186387a;
                                case 1:
                                    km7.c result2 = (km7.c) obj2;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    pVar.x2(new k(result2, 6));
                                    return Unit.f186387a;
                                case 2:
                                    ep7.g result3 = (ep7.g) obj2;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    if (!(result3 instanceof ep7.f)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    pVar.x2(new k(result3, 3));
                                    return Unit.f186387a;
                                case 3:
                                    ap7.g result4 = (ap7.g) obj2;
                                    Intrinsics.checkNotNullParameter(result4, "result");
                                    if (result4 instanceof ap7.e) {
                                        pVar.x2(new k(result4, 2));
                                    } else {
                                        int i32 = jli.h.f175850a;
                                    }
                                    return Unit.f186387a;
                                case 4:
                                    com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.claims.a result5 = (com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.claims.a) obj2;
                                    Intrinsics.checkNotNullParameter(result5, "result");
                                    if (result5 instanceof qm7.b) {
                                        pVar.x2(new k(result5, 4));
                                    } else {
                                        if (!(result5 instanceof a.C0504a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        pVar.v2(f.b.f107895a);
                                    }
                                    return Unit.f186387a;
                                case 5:
                                    um7.c result6 = (um7.c) obj2;
                                    Intrinsics.checkNotNullParameter(result6, "result");
                                    pVar.x2(new k(result6, 0));
                                    return Unit.f186387a;
                                case 6:
                                    sm7.c result7 = (sm7.c) obj2;
                                    Intrinsics.checkNotNullParameter(result7, "result");
                                    pVar.x2(new k(result7, 5));
                                    return Unit.f186387a;
                                case 7:
                                    wo7.f result8 = (wo7.f) obj2;
                                    Intrinsics.checkNotNullParameter(result8, "result");
                                    if (!(result8 instanceof wo7.e)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    pVar.x2(new k(result8, 9));
                                    return Unit.f186387a;
                                case 8:
                                    an7.c result9 = (an7.c) obj2;
                                    Intrinsics.checkNotNullParameter(result9, "result");
                                    pVar.x2(new k(result9, 8));
                                    return Unit.f186387a;
                                default:
                                    ym7.c result10 = (ym7.c) obj2;
                                    Intrinsics.checkNotNullParameter(result10, "result");
                                    pVar.x2(new k(result10, 1));
                                    return Unit.f186387a;
                            }
                        }
                    }, 1);
                    break;
                }
                break;
            case 799955134:
                if (listId.equals("CAR_ITEM")) {
                    final int i21 = 1;
                    yji.l.i2(this, new CarSelectFlow(), null, new Function1(this) { // from class: cp7.j

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ p f107902b;

                        {
                            this.f107902b = this;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            int i22 = i21;
                            p pVar = this.f107902b;
                            switch (i22) {
                                case 0:
                                    wm7.c result = (wm7.c) obj2;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    pVar.x2(new k(result, 7));
                                    return Unit.f186387a;
                                case 1:
                                    km7.c result2 = (km7.c) obj2;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    pVar.x2(new k(result2, 6));
                                    return Unit.f186387a;
                                case 2:
                                    ep7.g result3 = (ep7.g) obj2;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    if (!(result3 instanceof ep7.f)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    pVar.x2(new k(result3, 3));
                                    return Unit.f186387a;
                                case 3:
                                    ap7.g result4 = (ap7.g) obj2;
                                    Intrinsics.checkNotNullParameter(result4, "result");
                                    if (result4 instanceof ap7.e) {
                                        pVar.x2(new k(result4, 2));
                                    } else {
                                        int i32 = jli.h.f175850a;
                                    }
                                    return Unit.f186387a;
                                case 4:
                                    com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.claims.a result5 = (com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.claims.a) obj2;
                                    Intrinsics.checkNotNullParameter(result5, "result");
                                    if (result5 instanceof qm7.b) {
                                        pVar.x2(new k(result5, 4));
                                    } else {
                                        if (!(result5 instanceof a.C0504a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        pVar.v2(f.b.f107895a);
                                    }
                                    return Unit.f186387a;
                                case 5:
                                    um7.c result6 = (um7.c) obj2;
                                    Intrinsics.checkNotNullParameter(result6, "result");
                                    pVar.x2(new k(result6, 0));
                                    return Unit.f186387a;
                                case 6:
                                    sm7.c result7 = (sm7.c) obj2;
                                    Intrinsics.checkNotNullParameter(result7, "result");
                                    pVar.x2(new k(result7, 5));
                                    return Unit.f186387a;
                                case 7:
                                    wo7.f result8 = (wo7.f) obj2;
                                    Intrinsics.checkNotNullParameter(result8, "result");
                                    if (!(result8 instanceof wo7.e)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    pVar.x2(new k(result8, 9));
                                    return Unit.f186387a;
                                case 8:
                                    an7.c result9 = (an7.c) obj2;
                                    Intrinsics.checkNotNullParameter(result9, "result");
                                    pVar.x2(new k(result9, 8));
                                    return Unit.f186387a;
                                default:
                                    ym7.c result10 = (ym7.c) obj2;
                                    Intrinsics.checkNotNullParameter(result10, "result");
                                    pVar.x2(new k(result10, 1));
                                    return Unit.f186387a;
                            }
                        }
                    }, 1);
                    break;
                }
                break;
            case 977269439:
                if (listId.equals("ADDITIONAL_DRIVERS_ITEM")) {
                    List list2 = ((e) t2()).f107890b.e;
                    if (list2 == null) {
                        list2 = f0.f322471a;
                    }
                    final int i22 = 3;
                    yji.l.g2(this, new AdditionalDriverListScreen(new AdditionalDriverListScreenContract$InputData(list2, false, true)), null, new Function1(this) { // from class: cp7.j

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ p f107902b;

                        {
                            this.f107902b = this;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            int i222 = i22;
                            p pVar = this.f107902b;
                            switch (i222) {
                                case 0:
                                    wm7.c result = (wm7.c) obj2;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    pVar.x2(new k(result, 7));
                                    return Unit.f186387a;
                                case 1:
                                    km7.c result2 = (km7.c) obj2;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    pVar.x2(new k(result2, 6));
                                    return Unit.f186387a;
                                case 2:
                                    ep7.g result3 = (ep7.g) obj2;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    if (!(result3 instanceof ep7.f)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    pVar.x2(new k(result3, 3));
                                    return Unit.f186387a;
                                case 3:
                                    ap7.g result4 = (ap7.g) obj2;
                                    Intrinsics.checkNotNullParameter(result4, "result");
                                    if (result4 instanceof ap7.e) {
                                        pVar.x2(new k(result4, 2));
                                    } else {
                                        int i32 = jli.h.f175850a;
                                    }
                                    return Unit.f186387a;
                                case 4:
                                    com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.claims.a result5 = (com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.claims.a) obj2;
                                    Intrinsics.checkNotNullParameter(result5, "result");
                                    if (result5 instanceof qm7.b) {
                                        pVar.x2(new k(result5, 4));
                                    } else {
                                        if (!(result5 instanceof a.C0504a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        pVar.v2(f.b.f107895a);
                                    }
                                    return Unit.f186387a;
                                case 5:
                                    um7.c result6 = (um7.c) obj2;
                                    Intrinsics.checkNotNullParameter(result6, "result");
                                    pVar.x2(new k(result6, 0));
                                    return Unit.f186387a;
                                case 6:
                                    sm7.c result7 = (sm7.c) obj2;
                                    Intrinsics.checkNotNullParameter(result7, "result");
                                    pVar.x2(new k(result7, 5));
                                    return Unit.f186387a;
                                case 7:
                                    wo7.f result8 = (wo7.f) obj2;
                                    Intrinsics.checkNotNullParameter(result8, "result");
                                    if (!(result8 instanceof wo7.e)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    pVar.x2(new k(result8, 9));
                                    return Unit.f186387a;
                                case 8:
                                    an7.c result9 = (an7.c) obj2;
                                    Intrinsics.checkNotNullParameter(result9, "result");
                                    pVar.x2(new k(result9, 8));
                                    return Unit.f186387a;
                                default:
                                    ym7.c result10 = (ym7.c) obj2;
                                    Intrinsics.checkNotNullParameter(result10, "result");
                                    pVar.x2(new k(result10, 1));
                                    return Unit.f186387a;
                            }
                        }
                    }, 1);
                    break;
                }
                break;
            case 1048416923:
                if (listId.equals("CLAIMS_ITEM")) {
                    Survey survey2 = ((e) t2()).f107890b.d;
                    ClaimsFlow claimsFlow = new ClaimsFlow(new ClaimsFlowContract$InputData(survey2 != null ? survey2.d : null));
                    final int i32 = 4;
                    yji.l.i2(this, claimsFlow, null, new Function1(this) { // from class: cp7.j

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ p f107902b;

                        {
                            this.f107902b = this;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            int i222 = i32;
                            p pVar = this.f107902b;
                            switch (i222) {
                                case 0:
                                    wm7.c result = (wm7.c) obj2;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    pVar.x2(new k(result, 7));
                                    return Unit.f186387a;
                                case 1:
                                    km7.c result2 = (km7.c) obj2;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    pVar.x2(new k(result2, 6));
                                    return Unit.f186387a;
                                case 2:
                                    ep7.g result3 = (ep7.g) obj2;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    if (!(result3 instanceof ep7.f)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    pVar.x2(new k(result3, 3));
                                    return Unit.f186387a;
                                case 3:
                                    ap7.g result4 = (ap7.g) obj2;
                                    Intrinsics.checkNotNullParameter(result4, "result");
                                    if (result4 instanceof ap7.e) {
                                        pVar.x2(new k(result4, 2));
                                    } else {
                                        int i322 = jli.h.f175850a;
                                    }
                                    return Unit.f186387a;
                                case 4:
                                    com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.claims.a result5 = (com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.claims.a) obj2;
                                    Intrinsics.checkNotNullParameter(result5, "result");
                                    if (result5 instanceof qm7.b) {
                                        pVar.x2(new k(result5, 4));
                                    } else {
                                        if (!(result5 instanceof a.C0504a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        pVar.v2(f.b.f107895a);
                                    }
                                    return Unit.f186387a;
                                case 5:
                                    um7.c result6 = (um7.c) obj2;
                                    Intrinsics.checkNotNullParameter(result6, "result");
                                    pVar.x2(new k(result6, 0));
                                    return Unit.f186387a;
                                case 6:
                                    sm7.c result7 = (sm7.c) obj2;
                                    Intrinsics.checkNotNullParameter(result7, "result");
                                    pVar.x2(new k(result7, 5));
                                    return Unit.f186387a;
                                case 7:
                                    wo7.f result8 = (wo7.f) obj2;
                                    Intrinsics.checkNotNullParameter(result8, "result");
                                    if (!(result8 instanceof wo7.e)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    pVar.x2(new k(result8, 9));
                                    return Unit.f186387a;
                                case 8:
                                    an7.c result9 = (an7.c) obj2;
                                    Intrinsics.checkNotNullParameter(result9, "result");
                                    pVar.x2(new k(result9, 8));
                                    return Unit.f186387a;
                                default:
                                    ym7.c result10 = (ym7.c) obj2;
                                    Intrinsics.checkNotNullParameter(result10, "result");
                                    pVar.x2(new k(result10, 1));
                                    return Unit.f186387a;
                            }
                        }
                    }, 1);
                    break;
                }
                break;
            case 1126285598:
                if (listId.equals("CURRENT_INSURANCE_ITEM")) {
                    final int i33 = 6;
                    yji.l.i2(this, new CurrentInsuranceFlow(), null, new Function1(this) { // from class: cp7.j

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ p f107902b;

                        {
                            this.f107902b = this;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            int i222 = i33;
                            p pVar = this.f107902b;
                            switch (i222) {
                                case 0:
                                    wm7.c result = (wm7.c) obj2;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    pVar.x2(new k(result, 7));
                                    return Unit.f186387a;
                                case 1:
                                    km7.c result2 = (km7.c) obj2;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    pVar.x2(new k(result2, 6));
                                    return Unit.f186387a;
                                case 2:
                                    ep7.g result3 = (ep7.g) obj2;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    if (!(result3 instanceof ep7.f)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    pVar.x2(new k(result3, 3));
                                    return Unit.f186387a;
                                case 3:
                                    ap7.g result4 = (ap7.g) obj2;
                                    Intrinsics.checkNotNullParameter(result4, "result");
                                    if (result4 instanceof ap7.e) {
                                        pVar.x2(new k(result4, 2));
                                    } else {
                                        int i322 = jli.h.f175850a;
                                    }
                                    return Unit.f186387a;
                                case 4:
                                    com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.claims.a result5 = (com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.claims.a) obj2;
                                    Intrinsics.checkNotNullParameter(result5, "result");
                                    if (result5 instanceof qm7.b) {
                                        pVar.x2(new k(result5, 4));
                                    } else {
                                        if (!(result5 instanceof a.C0504a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        pVar.v2(f.b.f107895a);
                                    }
                                    return Unit.f186387a;
                                case 5:
                                    um7.c result6 = (um7.c) obj2;
                                    Intrinsics.checkNotNullParameter(result6, "result");
                                    pVar.x2(new k(result6, 0));
                                    return Unit.f186387a;
                                case 6:
                                    sm7.c result7 = (sm7.c) obj2;
                                    Intrinsics.checkNotNullParameter(result7, "result");
                                    pVar.x2(new k(result7, 5));
                                    return Unit.f186387a;
                                case 7:
                                    wo7.f result8 = (wo7.f) obj2;
                                    Intrinsics.checkNotNullParameter(result8, "result");
                                    if (!(result8 instanceof wo7.e)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    pVar.x2(new k(result8, 9));
                                    return Unit.f186387a;
                                case 8:
                                    an7.c result9 = (an7.c) obj2;
                                    Intrinsics.checkNotNullParameter(result9, "result");
                                    pVar.x2(new k(result9, 8));
                                    return Unit.f186387a;
                                default:
                                    ym7.c result10 = (ym7.c) obj2;
                                    Intrinsics.checkNotNullParameter(result10, "result");
                                    pVar.x2(new k(result10, 1));
                                    return Unit.f186387a;
                            }
                        }
                    }, 1);
                    break;
                }
                break;
            case 1617018183:
                if (listId.equals("START_DATE_ITEM")) {
                    final int i43 = 7;
                    yji.l.g2(this, new DateSelectorScreen(new DateSelectorScreenContract$InputData(((e) t2()).f107890b.f75167b)), null, new Function1(this) { // from class: cp7.j

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ p f107902b;

                        {
                            this.f107902b = this;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            int i222 = i43;
                            p pVar = this.f107902b;
                            switch (i222) {
                                case 0:
                                    wm7.c result = (wm7.c) obj2;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    pVar.x2(new k(result, 7));
                                    return Unit.f186387a;
                                case 1:
                                    km7.c result2 = (km7.c) obj2;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    pVar.x2(new k(result2, 6));
                                    return Unit.f186387a;
                                case 2:
                                    ep7.g result3 = (ep7.g) obj2;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    if (!(result3 instanceof ep7.f)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    pVar.x2(new k(result3, 3));
                                    return Unit.f186387a;
                                case 3:
                                    ap7.g result4 = (ap7.g) obj2;
                                    Intrinsics.checkNotNullParameter(result4, "result");
                                    if (result4 instanceof ap7.e) {
                                        pVar.x2(new k(result4, 2));
                                    } else {
                                        int i322 = jli.h.f175850a;
                                    }
                                    return Unit.f186387a;
                                case 4:
                                    com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.claims.a result5 = (com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.claims.a) obj2;
                                    Intrinsics.checkNotNullParameter(result5, "result");
                                    if (result5 instanceof qm7.b) {
                                        pVar.x2(new k(result5, 4));
                                    } else {
                                        if (!(result5 instanceof a.C0504a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        pVar.v2(f.b.f107895a);
                                    }
                                    return Unit.f186387a;
                                case 5:
                                    um7.c result6 = (um7.c) obj2;
                                    Intrinsics.checkNotNullParameter(result6, "result");
                                    pVar.x2(new k(result6, 0));
                                    return Unit.f186387a;
                                case 6:
                                    sm7.c result7 = (sm7.c) obj2;
                                    Intrinsics.checkNotNullParameter(result7, "result");
                                    pVar.x2(new k(result7, 5));
                                    return Unit.f186387a;
                                case 7:
                                    wo7.f result8 = (wo7.f) obj2;
                                    Intrinsics.checkNotNullParameter(result8, "result");
                                    if (!(result8 instanceof wo7.e)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    pVar.x2(new k(result8, 9));
                                    return Unit.f186387a;
                                case 8:
                                    an7.c result9 = (an7.c) obj2;
                                    Intrinsics.checkNotNullParameter(result9, "result");
                                    pVar.x2(new k(result9, 8));
                                    return Unit.f186387a;
                                default:
                                    ym7.c result10 = (ym7.c) obj2;
                                    Intrinsics.checkNotNullParameter(result10, "result");
                                    pVar.x2(new k(result10, 1));
                                    return Unit.f186387a;
                            }
                        }
                    }, 1);
                    break;
                }
                break;
        }
    }
}
