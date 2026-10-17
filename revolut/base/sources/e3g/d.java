package e3g;

import aw0.o9;
import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.travel.experiences.api.models.booking.TravelExperiencesBookingQuestionAnswer;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceBookingQuestion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements b {
    @Override // e3g.b
    public final h3g.a a(h3g.a answer) {
        Intrinsics.checkNotNullParameter(answer, "answer");
        return answer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v0, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.ArrayList] */
    @Override // e3g.b
    public final List b(h3g.a aVar) {
        ?? arrayList;
        h3g.a answer = aVar;
        Intrinsics.checkNotNullParameter(answer, "answer");
        List list = answer.d;
        TravelExperiencesBookingQuestionAnswer travelExperiencesBookingQuestionAnswer = answer.f149114a;
        int i = -1;
        if (list != null) {
            Iterator it8 = list.iterator();
            int i2 = 0;
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                if (Intrinsics.f(((TravelExperienceBookingQuestion.Value) it8.next()).f92798a, travelExperiencesBookingQuestionAnswer.f92762b)) {
                    i = i2;
                    break;
                }
                i2++;
            }
        }
        int i3 = i;
        if (list != null) {
            List list2 = list;
            arrayList = new ArrayList(w.t(list2, 10));
            int i5 = 0;
            for (Object obj2 : list2) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    v.s();
                    throw null;
                }
                TravelExperienceBookingQuestion.Value value = (TravelExperienceBookingQuestion.Value) obj2;
                arrayList.add(new SingleChoiceDelegate.Model(travelExperiencesBookingQuestionAnswer.b(), new TextClause(value.f92799b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), i5 == i3, null, h3g.a.a(answer, TravelExperiencesBookingQuestionAnswer.a(travelExperiencesBookingQuestionAnswer, value.f92798a, null, 29), new TextClause(value.f92799b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, null, 12), YearClass.CLASS_2008));
                answer = aVar;
                i5 = i6;
            }
        } else {
            arrayList = f0.f322471a;
        }
        ?? r06 = arrayList;
        yp0.b.k(r06, 0, 0, 0, 0, 31);
        return r06;
    }
}
