package com.revolut.feature.insurance_car.impl.ui.flow.onboarding.car;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_car.impl.data.model.InsurableCar;
import com.revolut.feature.insurance_car.impl.ui.flow.onboarding.car.CarSelectFlowContract$Step;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.car.confirmation.CarConfirmationScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.car.confirmation.CarConfirmationScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.car.manual_input.CarManualInputScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.car.manual_input.CarManualInputScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.car.manual_input.CarManualInputScreenContract$ManualCarInfo;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.car.search.CarSearchScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.car.search.CarSearchScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.survey.binary_questions.BinaryQuestionInfo;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.survey.binary_questions.BinaryQuestionsScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.survey.binary_questions.BinaryQuestionsScreenContract$InputData;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import k65.d;
import kl7.p1;
import km7.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import tl7.f;
import zhm.q0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends g implements km7.b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f f75398t;
    public final CarSelectFlowContract$Step.CarSearch u;
    public final CarSelectFlowContract$State v;

    public b(f bottomDialog) {
        Intrinsics.checkNotNullParameter(bottomDialog, "bottomDialog");
        this.f75398t = bottomDialog;
        this.u = CarSelectFlowContract$Step.CarSearch.f75397a;
        this.v = new CarSelectFlowContract$State(null, null);
    }

    public final void O2(InsurableCar insurableCar) {
        if (!Intrinsics.f(insurableCar.f75232l, Boolean.TRUE)) {
            G2(new c(insurableCar));
            return;
        }
        CarSelectFlowContract$State carSelectFlowContract$State = (CarSelectFlowContract$State) A2().f98429a;
        CarManualInputScreenContract$ManualCarInfo carManualInputScreenContract$ManualCarInfo = carSelectFlowContract$State.f75391a;
        carSelectFlowContract$State.getClass();
        L2(new CarSelectFlowContract$State(carManualInputScreenContract$ManualCarInfo, insurableCar));
        E2(CarSelectFlowContract$Step.CarNctQuestions.f75396a, true, null, false);
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        CarSelectFlowContract$Step step = (CarSelectFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof CarSelectFlowContract$Step.CarSearch) {
            CarSearchScreen carSearchScreen = new CarSearchScreen(new CarSearchScreenContract$InputData(0));
            d dVar = new d(1, this, b.class, "handleCarSearchResult", "handleCarSearchResult(Lcom/revolut/feature/insurance_car/impl/ui/screen/onboarding/car/search/CarSearchScreenContract$OutputData;)V", 0, 20);
            Intrinsics.checkNotNullParameter(dVar, "<set-?>");
            carSearchScreen.H = dVar;
            return carSearchScreen;
        }
        if (step instanceof CarSelectFlowContract$Step.CarManualInput) {
            CarManualInputScreen carManualInputScreen = new CarManualInputScreen(new CarManualInputScreenContract$InputData(((CarSelectFlowContract$Step.CarManualInput) step).f75394a));
            d dVar2 = new d(1, this, b.class, "handleCarManualInputResult", "handleCarManualInputResult(Lcom/revolut/feature/insurance_car/impl/ui/screen/onboarding/car/manual_input/CarManualInputScreenContract$OutputData;)V", 0, 18);
            Intrinsics.checkNotNullParameter(dVar2, "<set-?>");
            carManualInputScreen.H = dVar2;
            return carManualInputScreen;
        }
        if (step instanceof CarSelectFlowContract$Step.CarConfirmation) {
            CarConfirmationScreen carConfirmationScreen = new CarConfirmationScreen(new CarConfirmationScreenContract$InputData(((CarSelectFlowContract$Step.CarConfirmation) step).f75393a));
            a aVar = new a(1, 0, b.class, this, "handleCarConfirmationResult", "handleCarConfirmationResult(Lcom/revolut/feature/insurance_car/impl/ui/screen/onboarding/car/confirmation/CarConfirmationScreenContract$OutputData;)V");
            Intrinsics.checkNotNullParameter(aVar, "<set-?>");
            carConfirmationScreen.H = aVar;
            return carConfirmationScreen;
        }
        if (step instanceof CarSelectFlowContract$Step.CarManualQuestions) {
            List listK = v.k(new BinaryQuestionInfo(p1.CAR_RIGHT_HAND_DRIVE, new TextLocalisedClause(R$string.car_insurance_futher_car_details_question_right_hand_drive, null, null, 14), null), new BinaryQuestionInfo(p1.CAR_HAS_VALID_NCT, new TextLocalisedClause(R$string.car_insurance_futher_car_details_question_nct, null, null, 14), null), new BinaryQuestionInfo(p1.CAR_OWNER, new TextLocalisedClause(R$string.car_insurance_futher_car_details_question_owner_you, null, null, 14), null), new BinaryQuestionInfo(p1.CAR_PRIVATE_TAX_ITEM, new TextLocalisedClause(R$string.car_insurance_futher_car_details_question_not_used_commercially, null, null, 14), null), new BinaryQuestionInfo(p1.CAR_NEVER_LEFT_UK_IE, new TextLocalisedClause(R$string.car_insurance_futher_car_details_question_never_left_uk_ie, null, null, 14), null));
            int i = R$string.car_insurance_futher_car_details_title;
            Integer numValueOf = Integer.valueOf(R$string.car_insurance_futher_car_details_subtitle);
            List list = listK;
            int iB = q0.b(w.t(list, 10));
            LinkedHashMap linkedHashMap = new LinkedHashMap(iB >= 16 ? iB : 16);
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                linkedHashMap.put(((BinaryQuestionInfo) it8.next()).f75629a, Boolean.TRUE);
            }
            BinaryQuestionsScreen binaryQuestionsScreen = new BinaryQuestionsScreen(new BinaryQuestionsScreenContract$InputData(i, numValueOf, listK, linkedHashMap, (List) null, 48));
            d dVar3 = new d(1, this, b.class, "handleCarManualQuestionResult", "handleCarManualQuestionResult(Lcom/revolut/feature/insurance_car/impl/ui/screen/onboarding/survey/binary_questions/BinaryQuestionsScreenContract$OutputData;)V", 0, 19);
            Intrinsics.checkNotNullParameter(dVar3, "<set-?>");
            binaryQuestionsScreen.H = dVar3;
            return binaryQuestionsScreen;
        }
        if (!(step instanceof CarSelectFlowContract$Step.CarNctQuestions)) {
            throw new NoWhenBranchMatchedException();
        }
        List listK2 = v.k(new BinaryQuestionInfo(p1.CAR_ROAD_WORTHY, new TextLocalisedClause(R$string.car_insurance_futher_car_details_question_roadworthy, null, null, 14), null), new BinaryQuestionInfo(p1.CAR_NCT_BOOKED, new TextLocalisedClause(R$string.car_insurance_futher_car_details_question_have_booked_nct, null, null, 14), null));
        int i2 = R$string.car_insurance_futher_car_details_title;
        Integer numValueOf2 = Integer.valueOf(R$string.car_insurance_futher_car_details_subtitle);
        List list2 = listK2;
        int iB2 = q0.b(w.t(list2, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB2 >= 16 ? iB2 : 16);
        Iterator it9 = list2.iterator();
        while (it9.hasNext()) {
            linkedHashMap2.put(((BinaryQuestionInfo) it9.next()).f75629a, Boolean.TRUE);
        }
        BinaryQuestionsScreen binaryQuestionsScreen2 = new BinaryQuestionsScreen(new BinaryQuestionsScreenContract$InputData(i2, numValueOf2, listK2, linkedHashMap2, u.c(IconNavBarMenuItem.Companion.a(IconNavBarMenuItem.INSTANCE, "INFO_MENU_ITEM", new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 124)), 32));
        d dVar4 = new d(1, this, b.class, "handleNCTQuestionResult", "handleNCTQuestionResult(Lcom/revolut/feature/insurance_car/impl/ui/screen/onboarding/survey/binary_questions/BinaryQuestionsScreenContract$OutputData;)V", 0, 21);
        Intrinsics.checkNotNullParameter(dVar4, "<set-?>");
        binaryQuestionsScreen2.H = dVar4;
        return binaryQuestionsScreen2;
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
