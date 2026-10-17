package qn7;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.picker.legacy.PickerScreen;
import com.revolut.feature.picker.legacy.PickerScreenContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import jki.g;
import js7.c;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {
    public static final void a(g gVar, Function1 handleAnswer) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(handleAnswer, "handleAnswer");
        gVar.Y1(new PickerScreen(new PickerScreenContract$InputData(null, new TextLocalisedClause(R$string.car_insurance_question_occupation_search_title, null, null, 14), null, null, false, null, "CarInsuranceOnboardingOccupationSearchPickerInteractor", null, null, null, null, true, null, new AnalyticsProduct.Retail(zl7.a.f323191b), null, 123730937)), ModalDestination.Style.POPUP.f98311a, new c(20, handleAnswer));
    }
}
