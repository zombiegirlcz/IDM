package sp7;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_car.impl.data.model.Answer;
import com.revolut.feature.picker.legacy.PickerScreen;
import com.revolut.feature.picker.legacy.PickerScreenContract$InputData;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import tx0.j0;
import zhm.f0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d {
    public static final PickerScreen a(TextLocalisedClause title, List answers, Clause clause, Function0 function0, Function1 handleAnswer) {
        List listC;
        int i;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(answers, "answers");
        Intrinsics.checkNotNullParameter(handleAnswer, "handleAnswer");
        List<Answer> list = answers;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (Answer answer : list) {
            Intrinsics.checkNotNullParameter(answer, "<this>");
            Clause clauseD = xl7.d.d(answer);
            Intrinsics.checkNotNullParameter(answer, "<this>");
            TextLocalisedClause textLocalisedClause = null;
            if (answer instanceof Answer.Mileage) {
                int i2 = xl7.c.f306945j[((Answer.Mileage) answer).ordinal()];
                if (i2 == 1) {
                    i = R$string.car_insurance_common_score_very_low;
                } else if (i2 == 2) {
                    i = R$string.car_insurance_common_score_low;
                } else if (i2 == 3) {
                    i = R$string.car_insurance_common_score_average;
                } else if (i2 == 4) {
                    i = R$string.car_insurance_common_score_high;
                } else {
                    if (i2 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = R$string.car_insurance_common_score_very_high;
                }
                textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
            }
            arrayList.add(new e(answer, clauseD, textLocalisedClause));
        }
        c cVar = new c(arrayList);
        if (function0 == null || (listC = u.c(IconNavBarMenuItem.Companion.a(IconNavBarMenuItem.INSTANCE, "HINT_MENU_ITEM", new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 124))) == null) {
            listC = f0.f322471a;
        }
        PickerScreen pickerScreen = new PickerScreen(new PickerScreenContract$InputData(cVar, title, clause, null, false, null, "CarInsuranceOnboardingAnswerPickerInteractor", null, null, null, listC, false, j0.MULTILINE_LARGE, new AnalyticsProduct.Retail(zl7.a.f323191b), null, 121109356));
        bmk.e eVar = new bmk.e(handleAnswer, function0);
        Intrinsics.checkNotNullParameter(eVar, "<set-?>");
        pickerScreen.H = eVar;
        return pickerScreen;
    }

    public static /* synthetic */ PickerScreen b(TextLocalisedClause textLocalisedClause, List list, TextLocalisedClause textLocalisedClause2, a76.c cVar, Function1 function1, int i) {
        if ((i & 4) != 0) {
            textLocalisedClause2 = null;
        }
        if ((i & 8) != 0) {
            cVar = null;
        }
        return a(textLocalisedClause, list, textLocalisedClause2, cVar, function1);
    }
}
