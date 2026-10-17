package g3g;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.travel.experiences.api.models.booking.TravelExperiencesBookingQuestionAnswer;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceBookingQuestion;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import myf.f;
import yp0.r;
import zhm.f0;
import zhm.u;
import zp0.v;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.c f140294a;

    public c(f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f140294a = uiKitResources;
    }

    public final List a(h3g.a answerWithLabel, boolean z) {
        Intrinsics.checkNotNullParameter(answerWithLabel, "answerWithLabel");
        TravelExperiencesBookingQuestionAnswer travelExperiencesBookingQuestionAnswer = answerWithLabel.f149114a;
        Clause clause = answerWithLabel.f149115b;
        TravelExperienceBookingQuestion travelExperienceBookingQuestion = travelExperiencesBookingQuestionAnswer.f92761a;
        myf.d dVar = travelExperiencesBookingQuestionAnswer.f92763c;
        if (!com.revolut.feature.travel.experiences.api.models.experience.a.a(travelExperienceBookingQuestion)) {
            boolean zE = com.revolut.feature.travel.experiences.api.models.experience.a.e(travelExperienceBookingQuestion);
            TravelExperienceBookingQuestion.Validation validation = travelExperienceBookingQuestion.f;
            f fVar = travelExperienceBookingQuestion.f92790c;
            if (!zE) {
                Intrinsics.checkNotNullParameter(travelExperienceBookingQuestion, "<this>");
                if (fVar != f.TIME && !com.revolut.feature.travel.experiences.api.models.experience.a.b(travelExperienceBookingQuestion) && (!com.revolut.feature.travel.experiences.api.models.experience.a.c(travelExperienceBookingQuestion) || dVar == myf.d.TEXT)) {
                    if (fVar == f.DATE) {
                        String strB = travelExperiencesBookingQuestionAnswer.b();
                        TextClause textClause = new TextClause(travelExperienceBookingQuestion.f92789b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                        String strO = a10.b.o(R.string.inputs_date_error_invalid, null, null, 14, this.f140294a);
                        t0 t0Var = t0.f186434a;
                        m70.a.c(t0Var);
                        Intrinsics.checkNotNullParameter(t0Var, "<this>");
                        InputTextDelegate.Model model = new InputTextDelegate.Model(strB, clause, textClause, null, null, null, null, false, null, false, true, 4, true, 0, true, z, true, null, false, false, 0, false, false, new v(strO), -1294205000, 130559);
                        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                        return u.c(model);
                    }
                    if (!com.revolut.feature.travel.experiences.api.models.experience.a.c(travelExperienceBookingQuestion) || dVar != myf.d.TEXT) {
                        String strB2 = travelExperiencesBookingQuestionAnswer.b();
                        TextClause textClause2 = new TextClause(travelExperienceBookingQuestion.f92789b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                        int i = validation.f92797a;
                        InputTextDelegate.Model model2 = new InputTextDelegate.Model(strB2, clause, textClause2, null, null, null, null, z, Integer.valueOf(i), false, true, fVar == f.NUMBER ? 2 : 1, true, 0, true, z, true, f0.f322471a, false, false, 0, false, false, null, 853229552, 131071);
                        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                        return u.c(model2);
                    }
                    InputTextDelegate.Model modelA = r.a(new InputTextDelegate.Model(travelExperiencesBookingQuestionAnswer.b(), clause, new TextClause(travelExperienceBookingQuestion.f92789b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, z, null, null, false, null, false, false, null, false, false, 0, false, false, null, answerWithLabel, null, null, 0, 0, 0, 0, -67108872, 65023));
                    yp0.b.l(modelA, 0, 0, 0, 0, null, false, 63);
                    InputTextDelegate.Model model3 = new InputTextDelegate.Model(j6.a.q("DEPENDANT_FIELD_", travelExperiencesBookingQuestionAnswer.b()), new TextClause(travelExperiencesBookingQuestionAnswer.f92762b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(travelExperienceBookingQuestion.f92789b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, z, Integer.valueOf(validation.f92797a), false, true, 1, true, 0, true, z, true, f0.f322471a, false, false, 0, false, false, null, 853229552, 131071);
                    yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
                    return zhm.v.k(modelA, model3);
                }
            }
        }
        InputTextDelegate.Model modelA2 = r.a(new InputTextDelegate.Model(travelExperiencesBookingQuestionAnswer.b(), clause, new TextClause(travelExperienceBookingQuestion.f92789b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, z, null, null, false, null, false, false, null, false, false, 0, false, false, null, answerWithLabel, null, null, 0, 0, 0, 0, -67108872, 65023));
        yp0.b.l(modelA2, 0, 0, 0, 0, null, false, 63);
        return u.c(modelA2);
    }
}
