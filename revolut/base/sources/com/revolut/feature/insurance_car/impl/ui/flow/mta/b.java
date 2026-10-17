package com.revolut.feature.insurance_car.impl.ui.flow.mta;

import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_car.impl.data.model.AdditionalDriver;
import com.revolut.feature.insurance_car.impl.data.model.MtaAvailabilityContainer;
import com.revolut.feature.insurance_car.impl.data.model.MtaAvailabilityItem;
import com.revolut.feature.insurance_car.impl.data.model.MtaContent;
import com.revolut.feature.insurance_car.impl.data.model.MtaFlowVariant;
import com.revolut.feature.insurance_car.impl.ui.flow.mta.MtaFlowContract$Step;
import com.revolut.feature.insurance_car.impl.ui.flow.mta_review.MtaReviewFlow;
import com.revolut.feature.insurance_car.impl.ui.flow.mta_review.MtaReviewFlowContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.flow.onboarding.car.CarSelectFlow;
import com.revolut.feature.insurance_car.impl.ui.flow.onboarding.proof_of_driving_number.ProofOfDrivingNumberFlow;
import com.revolut.feature.insurance_car.impl.ui.flow.onboarding.proof_of_driving_number.ProofOfDrivingNumberFlowContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.licence.LicenceFlow;
import com.revolut.feature.insurance_car.impl.ui.screen.mta.car_type.MtaCarTypeScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.mta.car_type.MtaCarTypeScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.mta.date.MtaDateSelectorScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.mta.date.MtaDateSelectorScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.mta.driver_type.MtaDriverTypeScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.mta.view_driver.ViewDriverScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.mta.view_driver.ViewDriverScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.driver.details.AdditionalDriverDetailsScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.driver.details.AdditionalDriverDetailsScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.eligibility.EligibilityScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.eligibility.EligibilityScreenContract$InputData;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import d9.t0;
import dki.g;
import g9i.s;
import gbi.c;
import gd3.i;
import gm7.d;
import gm7.e;
import gm7.h;
import java.time.ZonedDateTime;
import kl7.a1;
import kl7.n0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ll7.m;
import zhm.d0;
import zhm.p;
import zhm.r0;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends g implements e {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final MtaFlowContract$InputData f75379t;
    public final m u;
    public final d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final MtaFlowContract$Step f75380w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final MtaFlowContract$State f75381x;

    public b(MtaFlowContract$InputData inputData, m mtaRepository, d mtaCreateHelper) {
        MtaFlowContract$Step mtaFlowContract$Step;
        a1 a1Var;
        boolean z;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(mtaRepository, "mtaRepository");
        Intrinsics.checkNotNullParameter(mtaCreateHelper, "mtaCreateHelper");
        this.f75379t = inputData;
        this.u = mtaRepository;
        this.v = mtaCreateHelper;
        MtaFlowVariant mtaFlowVariant = inputData.f75361b;
        boolean z3 = mtaFlowVariant instanceof MtaFlowVariant.ReplaceCar;
        if (z3) {
            mtaFlowContract$Step = MtaFlowContract$Step.SelectCar.f75376a;
        } else if (mtaFlowVariant instanceof MtaFlowVariant.AddTemporaryCar) {
            mtaFlowContract$Step = MtaFlowContract$Step.CarType.f75368a;
        } else if (mtaFlowVariant instanceof MtaFlowVariant.AddDriver) {
            mtaFlowContract$Step = MtaFlowContract$Step.DriverDetails.f75369a;
        } else if (mtaFlowVariant instanceof MtaFlowVariant.UpdateLicence) {
            mtaFlowContract$Step = MtaFlowContract$Step.Licence.f75372a;
        } else {
            if (!(mtaFlowVariant instanceof MtaFlowVariant.ViewDriver)) {
                throw new NoWhenBranchMatchedException();
            }
            mtaFlowContract$Step = MtaFlowContract$Step.ViewDriver.f75378a;
        }
        this.f75380w = mtaFlowContract$Step;
        boolean z4 = mtaFlowVariant instanceof MtaFlowVariant.AddDriver;
        if (z4) {
            a1Var = a1.ADDITIONAL_DRIVER_ADD;
        } else if (z3) {
            a1Var = a1.VEHICLE_REPLACE;
        } else if (mtaFlowVariant instanceof MtaFlowVariant.AddTemporaryCar) {
            a1Var = a1.VEHICLE_ADD;
        } else if (mtaFlowVariant instanceof MtaFlowVariant.UpdateLicence) {
            a1Var = a1.DRIVING_LICENCE_UPDATE;
        } else {
            if (!(mtaFlowVariant instanceof MtaFlowVariant.ViewDriver)) {
                throw new NoWhenBranchMatchedException();
            }
            a1Var = a1.UNKNOWN;
        }
        if (z4 || z3 || (mtaFlowVariant instanceof MtaFlowVariant.ViewDriver) || (mtaFlowVariant instanceof MtaFlowVariant.UpdateLicence)) {
            z = false;
        } else {
            if (!(mtaFlowVariant instanceof MtaFlowVariant.AddTemporaryCar)) {
                throw new NoWhenBranchMatchedException();
            }
            z = true;
        }
        boolean z6 = z;
        MtaFlowVariant.ViewDriver viewDriver = mtaFlowVariant instanceof MtaFlowVariant.ViewDriver ? (MtaFlowVariant.ViewDriver) mtaFlowVariant : null;
        this.f75381x = new MtaFlowContract$State(a1Var, z6, null, null, null, viewDriver != null ? viewDriver.f75255a : null, null, null, null);
    }

    public final void O2() {
        this.v.b3(new i(this, 27), new h(this, null));
    }

    public final void P2(MtaFlowContract$Step mtaFlowContract$Step) {
        E2(mtaFlowContract$Step, true, null, false);
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        MtaFlowContract$Step step = (MtaFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        boolean z = step instanceof MtaFlowContract$Step.CarType;
        MtaFlowContract$InputData mtaFlowContract$InputData = this.f75379t;
        if (z) {
            MtaCarTypeScreen mtaCarTypeScreen = new MtaCarTypeScreen(new MtaCarTypeScreenContract$InputData(t0.k(mtaFlowContract$InputData.f75362c, a1.VEHICLE_SUBSTITUTE), t0.k(mtaFlowContract$InputData.f75362c, a1.VEHICLE_ADD)));
            s block = new s(1, this, b.class, "handleCarTypeScreenResult", "handleCarTypeScreenResult(Lcom/revolut/feature/insurance_car/impl/ui/screen/mta/car_type/MtaCarTypeScreenContract$OutputData;)V", 0, 18);
            Intrinsics.checkNotNullParameter(block, "block");
            mtaCarTypeScreen.H = block;
            return mtaCarTypeScreen;
        }
        if (step instanceof MtaFlowContract$Step.SelectCar) {
            CarSelectFlow carSelectFlow = new CarSelectFlow();
            s sVar = new s(1, this, b.class, "handleCarSelectResult", "handleCarSelectResult(Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/car/CarSelectFlowContract$OutputData;)V", 0, 17);
            Intrinsics.checkNotNullParameter(sVar, "<set-?>");
            carSelectFlow.J = sVar;
            return carSelectFlow;
        }
        if (step instanceof MtaFlowContract$Step.ViewDriver) {
            AdditionalDriver additionalDriver = ((MtaFlowContract$State) A2().f98429a).f;
            if (additionalDriver == null) {
                throw new IllegalStateException("driver must be present");
            }
            ViewDriverScreen viewDriverScreen = new ViewDriverScreen(new ViewDriverScreenContract$InputData(additionalDriver, mtaFlowContract$InputData.f75362c));
            s block2 = new s(1, this, b.class, "handleViewDriverScreenResult", "handleViewDriverScreenResult(Lcom/revolut/feature/insurance_car/impl/ui/screen/mta/view_driver/ViewDriverScreenContract$OutputData;)V", 0, 24);
            Intrinsics.checkNotNullParameter(block2, "block");
            viewDriverScreen.H = block2;
            return viewDriverScreen;
        }
        if (step instanceof MtaFlowContract$Step.DriverType) {
            MtaDriverTypeScreen mtaDriverTypeScreen = new MtaDriverTypeScreen();
            s block3 = new s(1, this, b.class, "handleDriverTypeScreenResult", "handleDriverTypeScreenResult(Lcom/revolut/feature/insurance_car/impl/ui/screen/mta/driver_type/MtaDriverTypeScreenContract$OutputData;)V", 0, 21);
            Intrinsics.checkNotNullParameter(block3, "block");
            mtaDriverTypeScreen.H = block3;
            return mtaDriverTypeScreen;
        }
        if (step instanceof MtaFlowContract$Step.DriverDetails) {
            AdditionalDriverDetailsScreen additionalDriverDetailsScreen = new AdditionalDriverDetailsScreen(new AdditionalDriverDetailsScreenContract$InputData(null, R$drawable.uikit_icn_24_back_button_arrow));
            s sVar2 = new s(1, this, b.class, "handleDriverDetailsScreenResult", "handleDriverDetailsScreenResult(Lcom/revolut/feature/insurance_car/impl/ui/screen/onboarding/driver/details/AdditionalDriverDetailsScreenContract$OutputData;)V", 0, 20);
            Intrinsics.checkNotNullParameter(sVar2, "<set-?>");
            additionalDriverDetailsScreen.H = sVar2;
            return additionalDriverDetailsScreen;
        }
        if (step instanceof MtaFlowContract$Step.Eligibility) {
            EligibilityScreen eligibilityScreen = new EligibilityScreen(new EligibilityScreenContract$InputData(true, true, d0.A0(p.c(n0.values()), n0.CURRENT_INSURANCE_EXPIRED_30_OR_MORE), r0.g()));
            s sVar3 = new s(1, this, b.class, "handleEligibilityScreenResult", "handleEligibilityScreenResult(Lcom/revolut/feature/insurance_car/impl/ui/screen/onboarding/eligibility/EligibilityScreenContract$OutputData;)V", 0, 22);
            Intrinsics.checkNotNullParameter(sVar3, "<set-?>");
            eligibilityScreen.H = sVar3;
            return eligibilityScreen;
        }
        if (step instanceof MtaFlowContract$Step.Licence) {
            LicenceFlow licenceFlow = new LicenceFlow();
            s sVar4 = new s(1, this, b.class, "handleLicenceResult", "handleLicenceResult(Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/survey/licence/LicenceFlowContract$OutputData;)V", 0, 23);
            Intrinsics.checkNotNullParameter(sVar4, "<set-?>");
            licenceFlow.J = sVar4;
            return licenceFlow;
        }
        if (!(step instanceof MtaFlowContract$Step.SelectDate)) {
            if (step instanceof MtaFlowContract$Step.Review) {
                MtaReviewFlow mtaReviewFlow = new MtaReviewFlow(new MtaReviewFlowContract$InputData(mtaFlowContract$InputData.f75360a, new MtaContent(((MtaFlowContract$State) A2().f98429a).f75363a, ((MtaFlowContract$State) A2().f98429a).e, ((MtaFlowContract$State) A2().f98429a).f, ((MtaFlowContract$State) A2().f98429a).f75367h), ((MtaFlowContract$Step.Review) step).f75375a));
                a block4 = new a(1, 0, b.class, this, "handleReviewFlowResult", "handleReviewFlowResult(Lcom/revolut/feature/insurance_car/impl/ui/flow/mta_review/MtaReviewFlowContract$OutputData;)V");
                Intrinsics.checkNotNullParameter(block4, "block");
                mtaReviewFlow.H = block4;
                return mtaReviewFlow;
            }
            if (!(step instanceof MtaFlowContract$Step.ProofOfDrivingNumber)) {
                throw new NoWhenBranchMatchedException();
            }
            MtaFlowContract$Step.ProofOfDrivingNumber proofOfDrivingNumber = (MtaFlowContract$Step.ProofOfDrivingNumber) step;
            ProofOfDrivingNumberFlow proofOfDrivingNumberFlow = new ProofOfDrivingNumberFlow(new ProofOfDrivingNumberFlowContract$InputData(proofOfDrivingNumber.f75373a));
            c block5 = new c(this, proofOfDrivingNumber, 26);
            Intrinsics.checkNotNullParameter(block5, "block");
            proofOfDrivingNumberFlow.H = block5;
            return proofOfDrivingNumberFlow;
        }
        a1 a1Var = ((MtaFlowContract$State) A2().f98429a).f75363a;
        boolean z3 = ((MtaFlowContract$State) A2().f98429a).f75364b;
        MtaAvailabilityContainer mtaAvailabilityContainer = mtaFlowContract$InputData.f75362c;
        a1 mtaType = ((MtaFlowContract$State) A2().f98429a).f75363a;
        Intrinsics.checkNotNullParameter(mtaAvailabilityContainer, "<this>");
        Intrinsics.checkNotNullParameter(mtaType, "mtaType");
        MtaAvailabilityItem mtaAvailabilityItemD = t0.d(mtaAvailabilityContainer, mtaType);
        ZonedDateTime zonedDateTime = mtaAvailabilityItemD != null ? mtaAvailabilityItemD.d : null;
        a1 mtaType2 = ((MtaFlowContract$State) A2().f98429a).f75363a;
        Intrinsics.checkNotNullParameter(mtaAvailabilityContainer, "<this>");
        Intrinsics.checkNotNullParameter(mtaType2, "mtaType");
        MtaAvailabilityItem mtaAvailabilityItemD2 = t0.d(mtaAvailabilityContainer, mtaType2);
        ZonedDateTime zonedDateTime2 = mtaAvailabilityItemD2 != null ? mtaAvailabilityItemD2.e : null;
        a1 mtaType3 = ((MtaFlowContract$State) A2().f98429a).f75363a;
        Intrinsics.checkNotNullParameter(mtaAvailabilityContainer, "<this>");
        Intrinsics.checkNotNullParameter(mtaType3, "mtaType");
        MtaAvailabilityItem mtaAvailabilityItemD3 = t0.d(mtaAvailabilityContainer, mtaType3);
        MtaDateSelectorScreen mtaDateSelectorScreen = new MtaDateSelectorScreen(new MtaDateSelectorScreenContract$InputData(a1Var, z3, zonedDateTime, zonedDateTime2, mtaAvailabilityItemD3 != null ? mtaAvailabilityItemD3.f : null));
        s sVar5 = new s(1, this, b.class, "handleDateSelectorScreenResult", "handleDateSelectorScreenResult(Lcom/revolut/feature/insurance_car/impl/ui/screen/mta/date/MtaDateSelectorScreenContract$OutputData;)V", 0, 19);
        Intrinsics.checkNotNullParameter(sVar5, "<set-?>");
        mtaDateSelectorScreen.H = sVar5;
        return mtaDateSelectorScreen;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.f75381x;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.f75380w;
    }
}
