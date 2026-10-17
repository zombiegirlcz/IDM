package s3g;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.travel.experiences.api.models.booking.TravelExperiencesBookingQuestionAnswer;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceBookingQuestion;
import com.revolut.feature.travel.experiences.impl.ui.screen.visitor_information.TravelExperiencesVisitorInformationScreenContract$InputData;
import d3g.g0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import zhm.f0;
import zhm.h0;
import zhm.r0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class h extends jki.g implements f {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TravelExperiencesVisitorInformationScreenContract$InputData f259672p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final g0 f259673q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d f259674r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.util.ArrayList] */
    public h(p stateMapper, TravelExperiencesVisitorInformationScreenContract$InputData inputData, h1g.h stateHolder, g0 updateAnswerDelegate) {
        String str;
        ?? arrayList;
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateHolder, "stateHolder");
        Intrinsics.checkNotNullParameter(updateAnswerDelegate, "updateAnswerDelegate");
        this.f259672p = inputData;
        this.f259673q = updateAnswerDelegate;
        myf.a aVarA = stateHolder.a();
        List list = inputData.f93174b;
        h0 h0Var = h0.f322473a;
        ArrayList arrayListA = a1g.a.a(list);
        ArrayList arrayList2 = new ArrayList(w.t(arrayListA, 10));
        Iterator it8 = arrayListA.iterator();
        while (true) {
            Object obj2 = null;
            if (!it8.hasNext()) {
                this.f259674r = new d(aVarA, list, h0Var, u.c(new h3g.c(null, null, arrayList2)), r0.g(), this.f259672p.f93173a);
                return;
            }
            TravelExperienceBookingQuestion travelExperienceBookingQuestion = (TravelExperienceBookingQuestion) it8.next();
            Iterator it9 = inputData.f93175c.iterator();
            while (true) {
                if (!it9.hasNext()) {
                    break;
                }
                Object next = it9.next();
                if (Intrinsics.f(((TravelExperiencesBookingQuestionAnswer) next).f92761a.f92788a, travelExperienceBookingQuestion.f92788a)) {
                    obj2 = next;
                    break;
                }
            }
            TravelExperiencesBookingQuestionAnswer travelExperiencesBookingQuestionAnswer = (TravelExperiencesBookingQuestionAnswer) obj2;
            if (travelExperiencesBookingQuestionAnswer == null || (str = travelExperiencesBookingQuestionAnswer.f92762b) == null) {
                m70.a.c(t0.f186434a);
                str = "";
            }
            String str2 = str;
            TravelExperiencesBookingQuestionAnswer travelExperiencesBookingQuestionAnswer2 = new TravelExperiencesBookingQuestionAnswer(travelExperienceBookingQuestion, str2, null, null, null);
            TextClause textClause = new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            boolean zIsEmpty = travelExperienceBookingQuestion.f92793j.isEmpty();
            List list2 = travelExperienceBookingQuestion.e;
            if (list2 != null) {
                arrayList = new ArrayList();
                for (Object obj3 : list2) {
                    if (((TravelExperienceBookingQuestion.Value) obj3).f92800c.isEmpty()) {
                        arrayList.add(obj3);
                    }
                }
            } else {
                arrayList = f0.f322471a;
            }
            arrayList2.add(new h3g.a(travelExperiencesBookingQuestionAnswer2, textClause, zIsEmpty, arrayList));
        }
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f259674r;
    }
}
