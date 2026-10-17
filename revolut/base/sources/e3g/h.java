package e3g;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.travel.experiences.api.models.booking.TravelExperiencesBookingQuestionAnswer;
import com.revolut.retail.common.ui.R$string;
import ip0.cl0;
import java.time.LocalTime;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b1g.c f122267a;

    public h(b1g.c travelExperiencesDateTimeFormatter) {
        Intrinsics.checkNotNullParameter(travelExperiencesDateTimeFormatter, "travelExperiencesDateTimeFormatter");
        this.f122267a = travelExperiencesDateTimeFormatter;
    }

    @Override // e3g.b
    public final h3g.a a(h3g.a answer) {
        Intrinsics.checkNotNullParameter(answer, "answer");
        TravelExperiencesBookingQuestionAnswer travelExperiencesBookingQuestionAnswer = answer.f149114a;
        if (travelExperiencesBookingQuestionAnswer.f92762b.length() != 0) {
            return answer;
        }
        LocalTime time = LocalTime.MIN;
        Intrinsics.h(time);
        b1g.c cVar = this.f122267a;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(time, "time");
        String str = time.format(cVar.d);
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return h3g.a.a(answer, TravelExperiencesBookingQuestionAnswer.a(travelExperiencesBookingQuestionAnswer, str, null, 29), new TextClause(cVar.c(time), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, null, 12);
    }

    @Override // e3g.b
    public final List b(h3g.a answer) {
        Intrinsics.checkNotNullParameter(answer, "answer");
        TravelExperiencesBookingQuestionAnswer travelExperiencesBookingQuestionAnswer = answer.f149114a;
        cl0 cl0Var = new cl0("BOTTOM_DIALOG_TIME_PICKER", travelExperiencesBookingQuestionAnswer.f92762b.length() > 0 ? LocalTime.parse(travelExperiencesBookingQuestionAnswer.f92762b) : null, null, answer, 4);
        yp0.b.l(cl0Var, 0, 0, 0, 0, null, false, 63);
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.common_action_done, null, null, 14);
        int i = R$attr.uikit_dp16;
        return v.k(cl0Var, new LargeActionButtonDelegate.Model("BOTTOM_DIALOG_ACTION_BUTTON", defaultFilledButton, null, textLocalisedClause, false, null, null, i, i, i, i, 496));
    }
}
