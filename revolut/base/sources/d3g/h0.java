package d3g;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.travel.experiences.api.models.booking.TravelExperiencesBookingQuestionAnswer;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceBookingQuestion;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperiencesBookingPrerequisiteQuestion;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import zhm.r0;

/* JADX INFO: loaded from: classes9.dex */
public final class h0 implements g0 {
    public final Pair a(Function1 function1, Function0 prerequisiteQuestionProducer, Function1 function12, List list, Map answeredQuestions, myf.a experience) {
        boolean z;
        h3g.a aVar;
        Iterator it8;
        boolean z3;
        List list2;
        h3g.a aVarA;
        boolean z4;
        Clause textClause;
        h3g.a aVar2;
        TravelExperiencesBookingQuestionAnswer travelExperiencesBookingQuestionAnswer;
        boolean z6;
        Function1 predicate = function1;
        Function1 answerModifier = function12;
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Intrinsics.checkNotNullParameter(prerequisiteQuestionProducer, "prerequisiteQuestionProducer");
        Intrinsics.checkNotNullParameter(answerModifier, "answerModifier");
        Object userAnswersList = list;
        Intrinsics.checkNotNullParameter(userAnswersList, "userAnswersList");
        Intrinsics.checkNotNullParameter(answeredQuestions, "answeredQuestions");
        Intrinsics.checkNotNullParameter(experience, "experience");
        TravelExperiencesBookingPrerequisiteQuestion travelExperiencesBookingPrerequisiteQuestion = (TravelExperiencesBookingPrerequisiteQuestion) prerequisiteQuestionProducer.invoke();
        LinkedHashMap linkedHashMapZ = r0.z(answeredQuestions);
        linkedHashMapZ.put(travelExperiencesBookingPrerequisiteQuestion.f92854a, travelExperiencesBookingPrerequisiteQuestion);
        for (boolean z11 = true; z11; z11 = z) {
            Iterable iterable = (Iterable) userAnswersList;
            int i = 10;
            ArrayList arrayList = new ArrayList(zhm.w.t(iterable, 10));
            Iterator it9 = iterable.iterator();
            z = false;
            while (it9.hasNext()) {
                h3g.c cVar = (h3g.c) it9.next();
                ArrayList arrayList2 = new ArrayList();
                List list3 = cVar.f149122c;
                ArrayList arrayList3 = new ArrayList(zhm.w.t(list3, i));
                int i2 = -1;
                int i3 = 0;
                for (Object obj2 : list3) {
                    int i5 = i3 + 1;
                    if (i3 < 0) {
                        zhm.v.s();
                        throw null;
                    }
                    h3g.a aVar3 = (h3g.a) obj2;
                    if (((Boolean) predicate.invoke(aVar3)).booleanValue()) {
                        aVar = (h3g.a) answerModifier.invoke(aVar3);
                        i2 = i3;
                    } else {
                        aVar = aVar3;
                    }
                    TravelExperiencesBookingQuestionAnswer travelExperiencesBookingQuestionAnswer2 = aVar3.f149114a;
                    List list4 = travelExperiencesBookingQuestionAnswer2.f92761a.e;
                    if (list4 != null) {
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj3 : list4) {
                            TravelExperienceBookingQuestion.Value value = (TravelExperienceBookingQuestion.Value) obj3;
                            Iterator it10 = it9;
                            if (value.f92800c.isEmpty()) {
                                travelExperiencesBookingQuestionAnswer = travelExperiencesBookingQuestionAnswer2;
                                z6 = z;
                            } else {
                                List list5 = value.f92800c;
                                if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                                    Iterator it11 = list5.iterator();
                                    while (it11.hasNext()) {
                                        TravelExperiencesBookingPrerequisiteQuestion travelExperiencesBookingPrerequisiteQuestion2 = (TravelExperiencesBookingPrerequisiteQuestion) it11.next();
                                        Iterator it12 = it11;
                                        String str = travelExperiencesBookingPrerequisiteQuestion2.f92854a;
                                        z6 = z;
                                        Object obj4 = travelExperiencesBookingQuestionAnswer2.d;
                                        if (obj4 == null) {
                                            m70.a.c(t0.f186434a);
                                            obj4 = "";
                                        }
                                        travelExperiencesBookingQuestionAnswer = travelExperiencesBookingQuestionAnswer2;
                                        TravelExperiencesBookingPrerequisiteQuestion travelExperiencesBookingPrerequisiteQuestion3 = (TravelExperiencesBookingPrerequisiteQuestion) linkedHashMapZ.get(str + obj4);
                                        if (!Intrinsics.f(travelExperiencesBookingPrerequisiteQuestion3 != null ? travelExperiencesBookingPrerequisiteQuestion3.f92855b : null, travelExperiencesBookingPrerequisiteQuestion2.f92855b)) {
                                            it11 = it12;
                                            travelExperiencesBookingQuestionAnswer2 = travelExperiencesBookingQuestionAnswer;
                                            z = z6;
                                        }
                                    }
                                }
                                travelExperiencesBookingQuestionAnswer = travelExperiencesBookingQuestionAnswer2;
                                z6 = z;
                                travelExperiencesBookingQuestionAnswer2 = travelExperiencesBookingQuestionAnswer;
                                it9 = it10;
                                z = z6;
                            }
                            arrayList4.add(obj3);
                            travelExperiencesBookingQuestionAnswer2 = travelExperiencesBookingQuestionAnswer;
                            it9 = it10;
                            z = z6;
                        }
                        it8 = it9;
                        z3 = z;
                        list2 = arrayList4;
                    } else {
                        it8 = it9;
                        z3 = z;
                        list2 = zhm.f0.f322471a;
                    }
                    h3g.a aVarA2 = h3g.a.a(aVar, null, null, false, list2, 7);
                    TravelExperiencesBookingQuestionAnswer travelExperiencesBookingQuestionAnswer3 = aVarA2.f149114a;
                    TravelExperienceBookingQuestion travelExperienceBookingQuestion = travelExperiencesBookingQuestionAnswer3.f92761a;
                    String str2 = travelExperiencesBookingQuestionAnswer3.f92762b;
                    if (!((com.revolut.feature.travel.experiences.api.models.experience.a.c(travelExperienceBookingQuestion) && travelExperiencesBookingQuestionAnswer3.f92763c == myf.d.LOCATION_REF) || com.revolut.feature.travel.experiences.api.models.experience.a.b(travelExperiencesBookingQuestionAnswer3.f92761a)) || str2.length() <= 0) {
                        aVarA = aVarA2;
                        break;
                    }
                    List list6 = aVarA2.d;
                    if (!(list6 instanceof Collection) || !list6.isEmpty()) {
                        Iterator it13 = list6.iterator();
                        while (it13.hasNext()) {
                            if (Intrinsics.f(((TravelExperienceBookingQuestion.Value) it13.next()).f92798a, str2)) {
                                aVarA = aVarA2;
                                break;
                            }
                        }
                    }
                    t0 t0Var = t0.f186434a;
                    m70.a.c(t0Var);
                    TravelExperiencesBookingQuestionAnswer travelExperiencesBookingQuestionAnswerA = TravelExperiencesBookingQuestionAnswer.a(travelExperiencesBookingQuestionAnswer3, "", null, 25);
                    Intrinsics.checkNotNullParameter(t0Var, "<this>");
                    aVarA = h3g.a.a(aVarA2, travelExperiencesBookingQuestionAnswerA, new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, null, 12);
                    linkedHashMapZ.remove(aVarA.f149114a.b());
                    TravelExperiencesBookingQuestionAnswer travelExperiencesBookingQuestionAnswerA2 = aVarA.f149114a;
                    if (travelExperiencesBookingQuestionAnswerA2.f92761a.f92793j.isEmpty()) {
                        z4 = true;
                        break;
                    }
                    List<TravelExperiencesBookingPrerequisiteQuestion> list7 = travelExperiencesBookingQuestionAnswerA2.f92761a.f92793j;
                    if (!(list7 instanceof Collection) || !list7.isEmpty()) {
                        for (TravelExperiencesBookingPrerequisiteQuestion travelExperiencesBookingPrerequisiteQuestion4 : list7) {
                            String str3 = travelExperiencesBookingPrerequisiteQuestion4.f92854a;
                            Object obj5 = travelExperiencesBookingQuestionAnswerA2.d;
                            if (obj5 == null) {
                                m70.a.c(t0.f186434a);
                                obj5 = "";
                            }
                            TravelExperiencesBookingPrerequisiteQuestion travelExperiencesBookingPrerequisiteQuestion5 = (TravelExperiencesBookingPrerequisiteQuestion) linkedHashMapZ.get(str3 + obj5);
                            if (Intrinsics.f(travelExperiencesBookingPrerequisiteQuestion5 != null ? travelExperiencesBookingPrerequisiteQuestion5.f92855b : null, travelExperiencesBookingPrerequisiteQuestion4.f92855b)) {
                                z4 = true;
                                break;
                            }
                        }
                    }
                    z4 = false;
                    boolean z12 = aVarA.f149116c;
                    boolean z29 = !z12 && z4;
                    boolean z31 = z12 && !z4;
                    if (z31) {
                        m70.a.c(t0.f186434a);
                        travelExperiencesBookingQuestionAnswerA2 = TravelExperiencesBookingQuestionAnswer.a(travelExperiencesBookingQuestionAnswerA2, "", null, 29);
                    }
                    TravelExperiencesBookingQuestionAnswer travelExperiencesBookingQuestionAnswer4 = travelExperiencesBookingQuestionAnswerA2;
                    if (z31) {
                        m70.a.c(t0.f186434a);
                        textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    } else {
                        textClause = aVarA.f149115b;
                    }
                    h3g.a aVarC = h3g.a.a(aVarA, travelExperiencesBookingQuestionAnswer4, textClause, z4, null, 8).c(experience.f210459n);
                    if (z31) {
                        linkedHashMapZ.remove(aVarC.f149114a.b());
                        z = true;
                    } else {
                        z = z3;
                    }
                    if (z29) {
                        arrayList2.add(aVarC);
                        aVar2 = null;
                    } else {
                        aVar2 = aVarC;
                    }
                    arrayList3.add(aVar2);
                    predicate = function1;
                    answerModifier = function12;
                    i3 = i5;
                    it9 = it8;
                }
                Iterator it14 = it9;
                boolean z41 = z;
                ArrayList arrayListF1 = zhm.d0.f1(arrayList3);
                if (i2 >= 0) {
                    arrayListF1.addAll(i2 + 1, arrayList2);
                }
                arrayList.add(h3g.c.a(cVar, zhm.d0.d1(zhm.d0.Z(arrayListF1))));
                predicate = function1;
                answerModifier = function12;
                it9 = it14;
                z = z41;
                i = 10;
            }
            predicate = function1;
            answerModifier = function12;
            userAnswersList = arrayList;
        }
        return new Pair(userAnswersList, r0.u(linkedHashMapZ));
    }
}
