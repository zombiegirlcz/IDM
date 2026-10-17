package com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_car.impl.data.model.Answer;
import com.revolut.feature.insurance_car.impl.data.model.ApplicationForm;
import com.revolut.feature.insurance_car.impl.data.model.Survey;
import com.revolut.feature.insurance_car.impl.ui.flow.onboarding.car.CarSelectFlow;
import com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.CarOnboardingFlowContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.CarOnboardingFlowContract$Step;
import com.revolut.feature.insurance_car.impl.ui.flow.onboarding.proof_of_driving_number.ProofOfDrivingNumberFlow;
import com.revolut.feature.insurance_car.impl.ui.flow.onboarding.proof_of_driving_number.ProofOfDrivingNumberFlowContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.claims.ClaimsFlow;
import com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.claims.ClaimsFlowContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.current_insurance.CurrentInsuranceFlow;
import com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.employment.EmploymentFlow;
import com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.licence.LicenceFlow;
import com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.mileage.MileageFlow;
import com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.penalty.PenaltyFlow;
import com.revolut.feature.insurance_car.impl.ui.screen.common.benefit_list.BenefitListScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.common.benefit_list.BenefitListScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.address.AddressPickerScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.address.AddressPickerScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.date.DateSelectorScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.date.DateSelectorScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.driver.list.AdditionalDriverListScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.driver.list.AdditionalDriverListScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.edit_application.EditApplicationScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.edit_application.EditApplicationScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.eligibility.EligibilityScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.eligibility.EligibilityScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.plan_options.PlanOptionsScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.plan_options.PlanOptionsScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.plan_selection.MotorPlanSelectorScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.plan_selection.MotorPlanSelectorScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.reservation.ReservationScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.reservation.ReservationScreenContract$InputData;
import com.revolut.feature.insurance_common.ui.screen.documents.DocumentListScreen;
import com.revolut.feature.insurance_common.ui.screen.documents.DocumentListScreenContract$InputData;
import com.revolut.feature.picker.PickerController;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kl7.n0;
import kl7.w1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ll7.u;
import ll7.v;
import mk5.s;
import mlk.a0;
import skm.e0;
import skm.p0;
import wp5.y;
import wsg.n;
import zhm.f0;
import zhm.r0;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends dki.g implements mm7.a {
    public final CarOnboardingFlowContract$Step A;
    public final CarOnboardingFlowContract$State B;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ll7.a f75433t;
    public final u u;
    public final v v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final sf0.h f75434w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final n f75435x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final CarOnboardingFlowContract$InputData f75436y;
    public final aq7.a z;

    public j(ll7.a applicationFormRepository, u planRepository, v policyRepository, sf0.h serverErrorParser, l80.e dateProvider, n walletInteractor, gte.a featureTogglesInteractor, CarOnboardingFlowContract$InputData inputData, i90.b uuidGenerator, aq7.a questionnaireFactory) {
        CarOnboardingFlowContract$Step renewalPlanSelector;
        ApplicationForm applicationForm;
        CarOnboardingFlowContract$Step eligibility;
        Intrinsics.checkNotNullParameter(applicationFormRepository, "applicationFormRepository");
        Intrinsics.checkNotNullParameter(planRepository, "planRepository");
        Intrinsics.checkNotNullParameter(policyRepository, "policyRepository");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(featureTogglesInteractor, "featureTogglesInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(uuidGenerator, "uuidGenerator");
        Intrinsics.checkNotNullParameter(questionnaireFactory, "questionnaireFactory");
        this.f75433t = applicationFormRepository;
        this.u = planRepository;
        this.v = policyRepository;
        this.f75434w = serverErrorParser;
        this.f75435x = walletInteractor;
        this.f75436y = inputData;
        this.z = questionnaireFactory;
        boolean z = inputData instanceof CarOnboardingFlowContract$InputData.Application;
        if (z) {
            ApplicationForm applicationForm2 = ((CarOnboardingFlowContract$InputData.Application) inputData).f75399a;
            if ((applicationForm2 != null ? applicationForm2.f75168c : null) == null) {
                renewalPlanSelector = CarOnboardingFlowContract$Step.CarSelector.f75408a;
            } else {
                Survey survey = applicationForm2.d;
                if (survey == null) {
                    renewalPlanSelector = CarOnboardingFlowContract$Step.AddressPicker.f75406a;
                } else if (survey.f75314a == null) {
                    renewalPlanSelector = CarOnboardingFlowContract$Step.Licence.f75416a;
                } else if (survey.f == null) {
                    renewalPlanSelector = CarOnboardingFlowContract$Step.Mileage.f75417a;
                } else if (survey.f75315b == null) {
                    renewalPlanSelector = CarOnboardingFlowContract$Step.Employment.f75415a;
                } else if (survey.f75316c == null) {
                    renewalPlanSelector = CarOnboardingFlowContract$Step.CurrentInsurance.f75410a;
                } else if (survey.d == null) {
                    renewalPlanSelector = CarOnboardingFlowContract$Step.Claims.f75409a;
                } else if (survey.e == null) {
                    renewalPlanSelector = CarOnboardingFlowContract$Step.Penalties.f75419a;
                } else {
                    LocalDate localDate = applicationForm2.f75167b;
                    if (localDate == null) {
                        List list = applicationForm2.e;
                        eligibility = new CarOnboardingFlowContract$Step.AdditionalDriver(list == null ? f0.f322471a : list);
                    } else if (localDate.isBefore(((l80.f) dateProvider).e())) {
                        renewalPlanSelector = CarOnboardingFlowContract$Step.DateSelector.f75411a;
                    } else {
                        Map map = applicationForm2.f;
                        if (map == null || map.isEmpty()) {
                            List list2 = applicationForm2.e;
                            eligibility = new CarOnboardingFlowContract$Step.Eligibility(!(list2 == null || list2.isEmpty()));
                        } else {
                            eligibility = new CarOnboardingFlowContract$Step.PlanSelector(applicationForm2.f75166a, true, applicationForm2.f75171j);
                        }
                    }
                    renewalPlanSelector = eligibility;
                }
            }
        } else {
            if (!(inputData instanceof CarOnboardingFlowContract$InputData.RenewalPolicy)) {
                throw new NoWhenBranchMatchedException();
            }
            renewalPlanSelector = new CarOnboardingFlowContract$Step.RenewalPlanSelector(((CarOnboardingFlowContract$InputData.RenewalPolicy) inputData).f75400a);
        }
        this.A = renewalPlanSelector;
        if (z) {
            applicationForm = ((CarOnboardingFlowContract$InputData.Application) inputData).f75399a;
        } else {
            if (!(inputData instanceof CarOnboardingFlowContract$InputData.RenewalPolicy)) {
                throw new NoWhenBranchMatchedException();
            }
            applicationForm = ((CarOnboardingFlowContract$InputData.RenewalPolicy) inputData).f75401b;
        }
        if (applicationForm == null) {
            String strU = y.u(uuidGenerator, "toString(...)");
            f0 f0Var = f0.f322471a;
            applicationForm = new ApplicationForm(strU, null, null, null, null, null, f0Var, f0Var, f0Var, true);
        }
        this.B = new CarOnboardingFlowContract$State(applicationForm, null, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object O2(com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.j r7, gim.c r8) {
        /*
            r7.getClass()
            boolean r0 = r8 instanceof mm7.e
            if (r0 == 0) goto L16
            r0 = r8
            mm7.e r0 = (mm7.e) r0
            int r1 = r0.f207170w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f207170w = r1
            goto L1b
        L16:
            mm7.e r0 = new mm7.e
            r0.<init>(r7, r8)
        L1b:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f207170w
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r8)
            goto L62
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            yhm.o.b(r8)
            com.revolut.core.ui_kit.models.TextLocalisedClause r8 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r2 = com.revolut.feature.insurance_car.impl.R$string.car_insurance_plan_selection_loading_title
            r4 = 0
            r5 = 14
            r8.<init>(r2, r4, r4, r5)
            com.revolut.core.ui_kit.models.TextLocalisedClause r2 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r6 = com.revolut.feature.insurance_car.impl.R$string.car_insurance_plan_selection_loading_description
            r2.<init>(r6, r4, r4, r5)
            nii.y0 r8 = vl7.a.c(r8, r2)
            r7.X1(r8)
            com.revolut.kompot.navigable.flow.FlowStateWrapper r8 = r7.A2()
            com.revolut.kompot.navigable.flow.FlowState r8 = r8.f98429a
            com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.CarOnboardingFlowContract$State r8 = (com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.CarOnboardingFlowContract$State) r8
            com.revolut.feature.insurance_car.impl.data.model.ApplicationForm r8 = r8.f75402a
            java.lang.String r8 = r8.f75166a
            r0.f207170w = r3
            java.lang.Object r8 = r7.R2(r8, r0)
            if (r8 != r1) goto L62
            return r1
        L62:
            r7.s1()
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.j.O2(com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.j, gim.c):java.lang.Object");
    }

    public static final CarOnboardingFlowContract$State P2(j jVar) {
        return (CarOnboardingFlowContract$State) jVar.A2().f98429a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0087, code lost:
    
        if (r12.R2(r13, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Q2(com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.j r12, com.revolut.feature.insurance_car.impl.data.model.ApplicationForm r13, gim.c r14) {
        /*
            r12.getClass()
            boolean r0 = r14 instanceof mm7.i
            if (r0 == 0) goto L16
            r0 = r14
            mm7.i r0 = (mm7.i) r0
            int r1 = r0.f207174x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f207174x = r1
            goto L1b
        L16:
            mm7.i r0 = new mm7.i
            r0.<init>(r12, r14)
        L1b:
            java.lang.Object r14 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f207174x
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            yhm.o.b(r14)
            goto L8a
        L2e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L36:
            com.revolut.feature.insurance_car.impl.data.model.ApplicationForm r13 = r0.u
            yhm.o.b(r14)
            goto L7d
        L3c:
            yhm.o.b(r14)
            com.revolut.kompot.navigable.flow.FlowStateWrapper r14 = r12.A2()
            com.revolut.kompot.navigable.flow.FlowState r14 = r14.f98429a
            r6 = r14
            com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.CarOnboardingFlowContract$State r6 = (com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.CarOnboardingFlowContract$State) r6
            java.lang.String r14 = "$this$updateState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r14)
            r10 = 0
            r11 = 14
            r8 = 0
            r9 = 0
            r7 = r13
            com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.CarOnboardingFlowContract$State r13 = com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.CarOnboardingFlowContract$State.a(r6, r7, r8, r9, r10, r11)
            r12.L2(r13)
            com.revolut.core.ui_kit.models.TextLocalisedClause r13 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r14 = com.revolut.feature.insurance_car.impl.R$string.car_insurance_plan_selection_loading_title
            r2 = 14
            r13.<init>(r14, r3, r3, r2)
            com.revolut.core.ui_kit.models.TextLocalisedClause r14 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r6 = com.revolut.feature.insurance_car.impl.R$string.car_insurance_plan_selection_loading_description
            r14.<init>(r6, r3, r3, r2)
            nii.y0 r13 = vl7.a.c(r13, r14)
            r12.X1(r13)
            r0.u = r7
            r0.f207174x = r5
            java.lang.Object r13 = r12.T2(r7, r0)
            if (r13 != r1) goto L7c
            goto L89
        L7c:
            r13 = r7
        L7d:
            java.lang.String r13 = r13.f75166a
            r0.u = r3
            r0.f207174x = r4
            java.lang.Object r13 = r12.R2(r13, r0)
            if (r13 != r1) goto L8a
        L89:
            return r1
        L8a:
            r12.s1()
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.j.Q2(com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.j, com.revolut.feature.insurance_car.impl.data.model.ApplicationForm, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
    
        if (r2.a(r0, r11, true) == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0095, code lost:
    
        if (ll7.v.b(r3, r11, r0) != r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object R2(java.lang.String r11, gim.c r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof mm7.f
            if (r0 == 0) goto L13
            r0 = r12
            mm7.f r0 = (mm7.f) r0
            int r1 = r0.f207171w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f207171w = r1
            goto L18
        L13:
            mm7.f r0 = new mm7.f
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f207171w
            ll7.v r3 = r10.v
            r4 = 5
            r5 = 4
            r6 = 3
            r7 = 2
            com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.CarOnboardingFlowContract$InputData r8 = r10.f75436y
            r9 = 1
            if (r2 == 0) goto L4f
            if (r2 == r9) goto L4b
            if (r2 == r7) goto L47
            if (r2 == r6) goto L43
            if (r2 == r5) goto L3f
            if (r2 != r4) goto L37
            yhm.o.b(r12)
            goto L98
        L37:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3f:
            yhm.o.b(r12)
            goto L8b
        L43:
            yhm.o.b(r12)
            goto L82
        L47:
            yhm.o.b(r12)
            goto L71
        L4b:
            yhm.o.b(r12)
            goto L61
        L4f:
            yhm.o.b(r12)
            boolean r12 = r8 instanceof com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.CarOnboardingFlowContract$InputData.Application
            ll7.u r2 = r10.u
            if (r12 == 0) goto L64
            r0.f207171w = r9
            java.lang.Object r11 = r2.a(r0, r11, r9)
            if (r11 != r1) goto L61
            goto L97
        L61:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        L64:
            boolean r12 = r8 instanceof com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.CarOnboardingFlowContract$InputData.RenewalPolicy
            if (r12 == 0) goto L9b
            r0.f207171w = r7
            java.lang.Object r11 = r2.a(r0, r11, r9)
            if (r11 != r1) goto L71
            goto L97
        L71:
            r11 = r8
            com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.CarOnboardingFlowContract$InputData$RenewalPolicy r11 = (com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.CarOnboardingFlowContract$InputData.RenewalPolicy) r11
            java.lang.String r11 = r11.f75400a
            r0.f207171w = r6
            r12 = r3
            ll7.e0 r12 = (ll7.e0) r12
            java.lang.Object r11 = r12.f(r11, r0)
            if (r11 != r1) goto L82
            goto L97
        L82:
            r0.f207171w = r5
            java.lang.Object r11 = ll7.v.c(r3, r0)
            if (r11 != r1) goto L8b
            goto L97
        L8b:
            com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.CarOnboardingFlowContract$InputData$RenewalPolicy r8 = (com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.CarOnboardingFlowContract$InputData.RenewalPolicy) r8
            java.lang.String r11 = r8.f75400a
            r0.f207171w = r4
            java.lang.Object r11 = ll7.v.b(r3, r11, r0)
            if (r11 != r1) goto L98
        L97:
            return r1
        L98:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        L9b:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.j.R2(java.lang.String, gim.c):java.lang.Object");
    }

    public final void S2(CarOnboardingFlowContract$Step carOnboardingFlowContract$Step) {
        E2(carOnboardingFlowContract$Step, true, null, false);
    }

    public final Object T2(ApplicationForm applicationForm, gim.c cVar) throws Throwable {
        CarOnboardingFlowContract$InputData carOnboardingFlowContract$InputData = this.f75436y;
        boolean z = carOnboardingFlowContract$InputData instanceof CarOnboardingFlowContract$InputData.Application;
        Continuation continuation = null;
        ll7.a aVar = this.f75433t;
        if (z) {
            ll7.h hVar = (ll7.h) aVar;
            hVar.getClass();
            ll7.g gVar = new ll7.g(hVar, applicationForm, continuation, 0);
            p0 p0Var = p0.f264001a;
            Object objJ = e0.J(elm.f.f127540b, gVar, cVar);
            fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
            if (objJ != aVar2) {
                objJ = Unit.f186387a;
            }
            return objJ == aVar2 ? objJ : Unit.f186387a;
        }
        if (!(carOnboardingFlowContract$InputData instanceof CarOnboardingFlowContract$InputData.RenewalPolicy)) {
            throw new NoWhenBranchMatchedException();
        }
        ll7.h hVar2 = (ll7.h) aVar;
        hVar2.getClass();
        ll7.g gVar2 = new ll7.g(hVar2, applicationForm, continuation, 1);
        p0 p0Var2 = p0.f264001a;
        Object objJ2 = e0.J(elm.f.f127540b, gVar2, cVar);
        fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
        if (objJ2 != aVar3) {
            objJ2 = Unit.f186387a;
        }
        return objJ2 == aVar3 ? objJ2 : Unit.f186387a;
    }

    public final void U2(ApplicationForm applicationForm) {
        CarOnboardingFlowContract$State updateState = (CarOnboardingFlowContract$State) A2().f98429a;
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        L2(CarOnboardingFlowContract$State.a(updateState, applicationForm, null, null, null, 14));
        l2(new mhd.p0(this, applicationForm, null, 19), new a0(11));
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        Survey.CurrentInsurance currentInsurance;
        CarOnboardingFlowContract$Step step = (CarOnboardingFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof CarOnboardingFlowContract$Step.CarSelector) {
            CarSelectFlow carSelectFlow = new CarSelectFlow();
            mm7.d dVar = new mm7.d(this, 0);
            Intrinsics.checkNotNullParameter(dVar, "<set-?>");
            carSelectFlow.J = dVar;
            return carSelectFlow;
        }
        if (step instanceof CarOnboardingFlowContract$Step.AddressPicker) {
            AddressPickerScreen addressPickerScreen = new AddressPickerScreen(new AddressPickerScreenContract$InputData(false));
            mm7.h hVar = new mm7.h(1, this, j.class, "handleAddressPickerResult", "handleAddressPickerResult(Lcom/revolut/feature/insurance_car/impl/ui/screen/onboarding/address/AddressPickerScreenContract$OutputData;)V", 0, 2);
            Intrinsics.checkNotNullParameter(hVar, "<set-?>");
            addressPickerScreen.H = hVar;
            return addressPickerScreen;
        }
        if (step instanceof CarOnboardingFlowContract$Step.Licence) {
            LicenceFlow licenceFlow = new LicenceFlow();
            mm7.h hVar2 = new mm7.h(1, this, j.class, "handleLicenceResult", "handleLicenceResult(Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/survey/licence/LicenceFlowContract$OutputData;)V", 0, 8);
            Intrinsics.checkNotNullParameter(hVar2, "<set-?>");
            licenceFlow.J = hVar2;
            return licenceFlow;
        }
        if (step instanceof CarOnboardingFlowContract$Step.Mileage) {
            MileageFlow mileageFlow = new MileageFlow();
            mm7.h hVar3 = new mm7.h(1, this, j.class, "handleMileageResult", "handleMileageResult(Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/survey/mileage/MileageFlowContract$OutputData;)V", 0, 9);
            Intrinsics.checkNotNullParameter(hVar3, "<set-?>");
            mileageFlow.J = hVar3;
            return mileageFlow;
        }
        if (step instanceof CarOnboardingFlowContract$Step.Employment) {
            EmploymentFlow employmentFlow = new EmploymentFlow();
            mm7.h hVar4 = new mm7.h(1, this, j.class, "handleEmploymentResult", "handleEmploymentResult(Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/survey/employment/EmploymentFlowContract$OutputData;)V", 0, 7);
            Intrinsics.checkNotNullParameter(hVar4, "<set-?>");
            employmentFlow.J = hVar4;
            return employmentFlow;
        }
        if (step instanceof CarOnboardingFlowContract$Step.CurrentInsurance) {
            CurrentInsuranceFlow currentInsuranceFlow = new CurrentInsuranceFlow();
            mm7.h hVar5 = new mm7.h(1, this, j.class, "handleCurrentInsuranceResult", "handleCurrentInsuranceResult(Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/survey/current_insurance/CurrentInsuranceFlowContract$OutputData;)V", 0, 4);
            Intrinsics.checkNotNullParameter(hVar5, "<set-?>");
            currentInsuranceFlow.J = hVar5;
            return currentInsuranceFlow;
        }
        Answer.CurrentInsuranceState currentInsuranceState = null;
        currentInsuranceState = null;
        if (step instanceof CarOnboardingFlowContract$Step.Claims) {
            Survey survey = ((CarOnboardingFlowContract$State) A2().f98429a).f75402a.d;
            ClaimsFlow claimsFlow = new ClaimsFlow(new ClaimsFlowContract$InputData(survey != null ? survey.d : null));
            mm7.h hVar6 = new mm7.h(1, this, j.class, "handleClaimsResult", "handleClaimsResult(Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/survey/claims/ClaimsFlowContract$OutputData;)V", 0, 3);
            Intrinsics.checkNotNullParameter(hVar6, "<set-?>");
            claimsFlow.J = hVar6;
            return claimsFlow;
        }
        if (step instanceof CarOnboardingFlowContract$Step.Penalties) {
            PenaltyFlow penaltyFlow = new PenaltyFlow();
            mm7.h hVar7 = new mm7.h(1, this, j.class, "handlePenaltyResult", "handlePenaltyResult(Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/survey/penalty/PenaltyFlowContract$OutputData;)V", 0, 10);
            Intrinsics.checkNotNullParameter(hVar7, "<set-?>");
            penaltyFlow.J = hVar7;
            return penaltyFlow;
        }
        if (step instanceof CarOnboardingFlowContract$Step.AdditionalDriver) {
            AdditionalDriverListScreen additionalDriverListScreen = new AdditionalDriverListScreen(new AdditionalDriverListScreenContract$InputData(((CarOnboardingFlowContract$Step.AdditionalDriver) step).f75405a, true, false));
            d dVar2 = new d(1, 0, j.class, this, "handleAdditionalDriversResult", "handleAdditionalDriversResult(Lcom/revolut/feature/insurance_car/impl/ui/screen/onboarding/driver/list/AdditionalDriverListScreenContract$OutputData;)V");
            Intrinsics.checkNotNullParameter(dVar2, "<set-?>");
            additionalDriverListScreen.H = dVar2;
            return additionalDriverListScreen;
        }
        if (step instanceof CarOnboardingFlowContract$Step.DateSelector) {
            DateSelectorScreen dateSelectorScreen = new DateSelectorScreen(new DateSelectorScreenContract$InputData(null));
            mm7.h hVar8 = new mm7.h(1, this, j.class, "handleDatePickerScreen", "handleDatePickerScreen(Lcom/revolut/feature/insurance_car/impl/ui/screen/onboarding/date/DateSelectorScreenContract$OutputData;)V", 0, 5);
            Intrinsics.checkNotNullParameter(hVar8, "<set-?>");
            dateSelectorScreen.H = hVar8;
            return dateSelectorScreen;
        }
        if (step instanceof CarOnboardingFlowContract$Step.Eligibility) {
            boolean z = ((CarOnboardingFlowContract$Step.Eligibility) step).f75414a;
            Map mapG = ((CarOnboardingFlowContract$State) A2().f98429a).f75402a.f;
            if (mapG == null) {
                mapG = r0.g();
            }
            n0[] n0VarArrValues = n0.values();
            ApplicationForm applicationForm = ((CarOnboardingFlowContract$State) A2().f98429a).f75402a;
            Intrinsics.checkNotNullParameter(applicationForm, "<this>");
            Survey survey2 = applicationForm.d;
            if (survey2 != null && (currentInsurance = survey2.f75316c) != null) {
                currentInsuranceState = currentInsurance.f75322a;
            }
            EligibilityScreen eligibilityScreen = new EligibilityScreen(new EligibilityScreenContract$InputData(z, true, d8l.d.m(n0VarArrValues, currentInsuranceState == Answer.CurrentInsuranceState.NO_INSURANCE), mapG));
            f fVar = new f(1, 0, j.class, this, "handleEligibilityResult", "handleEligibilityResult(Lcom/revolut/feature/insurance_car/impl/ui/screen/onboarding/eligibility/EligibilityScreenContract$OutputData;)V");
            Intrinsics.checkNotNullParameter(fVar, "<set-?>");
            eligibilityScreen.H = fVar;
            return eligibilityScreen;
        }
        if (step instanceof CarOnboardingFlowContract$Step.PlanSelector) {
            CarOnboardingFlowContract$Step.PlanSelector planSelector = (CarOnboardingFlowContract$Step.PlanSelector) step;
            MotorPlanSelectorScreen motorPlanSelectorScreen = new MotorPlanSelectorScreen(new MotorPlanSelectorScreenContract$InputData.Application(planSelector.f75423a, planSelector.f75424b, planSelector.f75425c));
            mm7.h hVar9 = new mm7.h(1, this, j.class, "handlePlanSelectorResult", "handlePlanSelectorResult(Lcom/revolut/feature/insurance_car/impl/ui/screen/onboarding/plan_selection/MotorPlanSelectorScreenContract$OutputData;)V", 0, 11);
            Intrinsics.checkNotNullParameter(hVar9, "<set-?>");
            motorPlanSelectorScreen.H = hVar9;
            return motorPlanSelectorScreen;
        }
        boolean z3 = step instanceof CarOnboardingFlowContract$Step.PlanOptions;
        CarOnboardingFlowContract$InputData carOnboardingFlowContract$InputData = this.f75436y;
        if (z3) {
            CarOnboardingFlowContract$Step.PlanOptions planOptions = (CarOnboardingFlowContract$Step.PlanOptions) step;
            PlanOptionsScreen planOptionsScreen = new PlanOptionsScreen(new PlanOptionsScreenContract$InputData(planOptions.f75420a, planOptions.f75421b, planOptions.f75422c, planOptions.d, carOnboardingFlowContract$InputData instanceof CarOnboardingFlowContract$InputData.RenewalPolicy));
            g gVar = new g(1, 0, j.class, this, "handlePlanOptionsResult", "handlePlanOptionsResult(Lcom/revolut/feature/insurance_car/impl/ui/screen/onboarding/plan_options/PlanOptionsScreenContract$OutputData;)V");
            Intrinsics.checkNotNullParameter(gVar, "<set-?>");
            planOptionsScreen.H = gVar;
            return planOptionsScreen;
        }
        if (step instanceof CarOnboardingFlowContract$Step.ProofOfDrivingNumber) {
            CarOnboardingFlowContract$Step.ProofOfDrivingNumber proofOfDrivingNumber = (CarOnboardingFlowContract$Step.ProofOfDrivingNumber) step;
            ProofOfDrivingNumberFlow proofOfDrivingNumberFlow = new ProofOfDrivingNumberFlow(new ProofOfDrivingNumberFlowContract$InputData(proofOfDrivingNumber.f75426a));
            s block = new s(this, proofOfDrivingNumber, 13);
            Intrinsics.checkNotNullParameter(block, "block");
            proofOfDrivingNumberFlow.H = block;
            return proofOfDrivingNumberFlow;
        }
        if (step instanceof CarOnboardingFlowContract$Step.EditApplication) {
            EditApplicationScreen editApplicationScreen = new EditApplicationScreen(new EditApplicationScreenContract$InputData(((CarOnboardingFlowContract$State) A2().f98429a).f75402a, carOnboardingFlowContract$InputData instanceof CarOnboardingFlowContract$InputData.RenewalPolicy));
            mm7.h hVar10 = new mm7.h(1, this, j.class, "handleEditApplicationResult", "handleEditApplicationResult(Lcom/revolut/feature/insurance_car/impl/ui/screen/onboarding/edit_application/EditApplicationScreenContract$OutputData;)V", 0, 6);
            Intrinsics.checkNotNullParameter(hVar10, "<set-?>");
            editApplicationScreen.H = hVar10;
            return editApplicationScreen;
        }
        if (step instanceof CarOnboardingFlowContract$Step.Reservation) {
            ReservationScreen reservationScreen = new ReservationScreen(new ReservationScreenContract$InputData(((CarOnboardingFlowContract$Step.Reservation) step).f75429a));
            i iVar = new i(1, 0, j.class, this, "handleReservationResult", "handleReservationResult(Lcom/revolut/feature/insurance_car/impl/ui/screen/onboarding/reservation/ReservationScreenContract$OutputData;)V");
            Intrinsics.checkNotNullParameter(iVar, "<set-?>");
            reservationScreen.H = iVar;
            return reservationScreen;
        }
        if (step instanceof CarOnboardingFlowContract$Step.BenefitList) {
            BenefitListScreen benefitListScreen = new BenefitListScreen(new BenefitListScreenContract$InputData(((CarOnboardingFlowContract$Step.BenefitList) step).f75407a));
            e eVar = new e(1, 0, j.class, this, "handleBenefitListResult", "handleBenefitListResult(Lcom/revolut/feature/insurance_car/impl/ui/screen/common/benefit_list/BenefitListScreenContract$OutputData;)V");
            Intrinsics.checkNotNullParameter(eVar, "<set-?>");
            benefitListScreen.H = eVar;
            return benefitListScreen;
        }
        if (step instanceof CarOnboardingFlowContract$Step.DocumentList) {
            ArrayList documents = ((CarOnboardingFlowContract$Step.DocumentList) step).f75412a;
            Intrinsics.checkNotNullParameter(documents, "documents");
            return new DocumentListScreen(new DocumentListScreenContract$InputData.Preloaded(new TextLocalisedClause(R$string.car_insurance_documents_header_title, null, null, 14), new AnalyticsProduct.Retail(zl7.a.f323191b), true, documents));
        }
        if (step instanceof CarOnboardingFlowContract$Step.RenewalPlanSelector) {
            MotorPlanSelectorScreen motorPlanSelectorScreen2 = new MotorPlanSelectorScreen(new MotorPlanSelectorScreenContract$InputData.RenewalPolicy(((CarOnboardingFlowContract$Step.RenewalPlanSelector) step).f75428a, ((CarOnboardingFlowContract$State) A2().f98429a).f75402a));
            mm7.h hVar11 = new mm7.h(1, this, j.class, "handlePlanSelectorResult", "handlePlanSelectorResult(Lcom/revolut/feature/insurance_car/impl/ui/screen/onboarding/plan_selection/MotorPlanSelectorScreenContract$OutputData;)V", 0, 11);
            Intrinsics.checkNotNullParameter(hVar11, "<set-?>");
            motorPlanSelectorScreen2.H = hVar11;
            return motorPlanSelectorScreen2;
        }
        if (!(step instanceof CarOnboardingFlowContract$Step.OptOutRenewalFeedback)) {
            throw new NoWhenBranchMatchedException();
        }
        String str = ((CarOnboardingFlowContract$Step.OptOutRenewalFeedback) step).f75418a;
        PickerController pickerControllerA = this.z.a(str, w1.RENEWAL_DISMISS, new TextLocalisedClause(R$string.car_insurance_questionnaire_renewal_dismiss_title, null, null, 14), new TextLocalisedClause(R$string.car_insurance_questionnaire_renewal_dismiss_subtitle, null, null, 14), new TextLocalisedClause(R$string.car_insurance_questionnaire_renewal_dismiss_action_button_text, null, null, 14));
        s block2 = new s(this, str, 11);
        Intrinsics.checkNotNullParameter(block2, "block");
        pickerControllerA.H = block2;
        return pickerControllerA;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.B;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.A;
    }
}
