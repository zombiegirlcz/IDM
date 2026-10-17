package d3g;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.travel.experiences.api.R$string;
import com.revolut.feature.travel.experiences.api.models.booking.TravelExperiencesBookingQuestionAnswer;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceBookingQuestion;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes9.dex */
public final class f0 implements jki.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.c f111116a;

    public f0(f01.c uiKitResources, g3g.d bookingDetailsStateMapper) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(bookingDetailsStateMapper, "bookingDetailsStateMapper");
        this.f111116a = uiKitResources;
    }

    public static ListSubheaderDelegate.Model b(TravelExperienceBookingQuestion.Category category) {
        String str = category.f92795a;
        String strQ = j6.a.q("BOOKING_SUBHEADER_CATEGORY_PREFIX_", str);
        Clause textClause = category.f92796b.length() > 0 ? new TextClause(category.f92796b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : Intrinsics.f(str, "PICKUP") ? new TextLocalisedClause(R$string.experiences_additional_details_pickup_details_title, null, null, 14) : Intrinsics.f(str, "PREFERENCES") ? new TextLocalisedClause(R$string.experiences_additional_details_preferences_title, null, null, 14) : null;
        if (textClause != null) {
            return new ListSubheaderDelegate.Model(strQ, (Image) null, textClause, (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x042c A[EDGE_INSN: B:188:0x042c->B:160:0x042c BREAK  A[LOOP:8: B:136:0x03e8->B:189:?]] */
    @Override // jki.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final jki.m a(jki.i r39) {
        /*
            Method dump skipped, instruction units count: 1073
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d3g.f0.a(jki.i):jki.m");
    }

    public final List c(h3g.a aVar, boolean z) {
        TravelExperiencesBookingQuestionAnswer travelExperiencesBookingQuestionAnswer = aVar.f149114a;
        if (!com.revolut.feature.travel.experiences.api.models.experience.a.a(travelExperiencesBookingQuestionAnswer.f92761a)) {
            TravelExperienceBookingQuestion travelExperienceBookingQuestion = travelExperiencesBookingQuestionAnswer.f92761a;
            myf.d dVar = travelExperiencesBookingQuestionAnswer.f92763c;
            TravelExperienceBookingQuestion travelExperienceBookingQuestion2 = travelExperiencesBookingQuestionAnswer.f92761a;
            if (!com.revolut.feature.travel.experiences.api.models.experience.a.e(travelExperienceBookingQuestion)) {
                Intrinsics.checkNotNullParameter(travelExperienceBookingQuestion2, "<this>");
                if (travelExperienceBookingQuestion2.f92790c != myf.f.TIME && !com.revolut.feature.travel.experiences.api.models.experience.a.b(travelExperienceBookingQuestion2) && (!com.revolut.feature.travel.experiences.api.models.experience.a.c(travelExperienceBookingQuestion2) || dVar == myf.d.TEXT)) {
                    if (travelExperienceBookingQuestion2.f92790c == myf.f.DATE) {
                        String strB = travelExperiencesBookingQuestionAnswer.b();
                        Clause clause = aVar.f149115b;
                        TextClause textClause = new TextClause(travelExperienceBookingQuestion2.f92789b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                        String strO = a10.b.o(R.string.inputs_date_error_invalid, null, null, 14, this.f111116a);
                        t0 t0Var = t0.f186434a;
                        m70.a.c(t0Var);
                        Intrinsics.checkNotNullParameter(t0Var, "<this>");
                        InputTextDelegate.Model model = new InputTextDelegate.Model(strB, clause, textClause, null, null, null, null, false, null, false, true, 4, true, 0, true, z, true, null, false, false, 0, false, false, new zp0.v(strO), -1294205000, 130559);
                        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                        return zhm.u.c(model);
                    }
                    if (!com.revolut.feature.travel.experiences.api.models.experience.a.c(travelExperienceBookingQuestion2) || dVar != myf.d.TEXT) {
                        String strB2 = travelExperiencesBookingQuestionAnswer.b();
                        Clause clause2 = aVar.f149115b;
                        TextClause textClause2 = new TextClause(travelExperienceBookingQuestion2.f92789b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                        int i = travelExperienceBookingQuestion2.f.f92797a;
                        InputTextDelegate.Model model2 = new InputTextDelegate.Model(strB2, clause2, textClause2, null, null, null, null, z, Integer.valueOf(i), false, true, travelExperienceBookingQuestion2.f92790c == myf.f.NUMBER ? 2 : 1, true, 0, true, z, true, zhm.f0.f322471a, false, false, 0, false, false, null, 853229552, 131071);
                        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                        return zhm.u.c(model2);
                    }
                    InputTextDelegate.Model modelA = yp0.r.a(new InputTextDelegate.Model(travelExperiencesBookingQuestionAnswer.b(), aVar.f149115b, new TextClause(travelExperienceBookingQuestion2.f92789b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, z, null, null, false, null, false, false, null, false, false, 0, false, false, null, aVar, null, null, 0, 0, 0, 0, -67108872, 65023));
                    yp0.b.l(modelA, 0, 0, 0, 0, null, false, 63);
                    InputTextDelegate.Model model3 = new InputTextDelegate.Model(j6.a.q("DEPENDANT_FIELD_", travelExperiencesBookingQuestionAnswer.b()), new TextClause(travelExperiencesBookingQuestionAnswer.f92762b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(travelExperienceBookingQuestion2.f92789b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, z, Integer.valueOf(travelExperienceBookingQuestion2.f.f92797a), false, true, 1, true, 0, true, z, true, zhm.f0.f322471a, false, false, 0, false, false, null, 853229552, 131071);
                    yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
                    return zhm.v.k(modelA, model3);
                }
            }
        }
        InputTextDelegate.Model modelA2 = yp0.r.a(new InputTextDelegate.Model(travelExperiencesBookingQuestionAnswer.b(), aVar.f149115b, new TextClause(travelExperiencesBookingQuestionAnswer.f92761a.f92789b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, aVar, null, null, 0, 0, 0, 0, -8, 65023));
        yp0.b.l(modelA2, 0, 0, 0, 0, null, false, 63);
        return zhm.u.c(modelA2);
    }
}
