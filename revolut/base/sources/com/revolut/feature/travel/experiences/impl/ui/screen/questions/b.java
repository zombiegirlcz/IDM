package com.revolut.feature.travel.experiences.impl.ui.screen.questions;

import aw0.o9;
import b1g.c;
import com.google.common.collect.ImmutableMap;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.travel.experiences.api.models.booking.TravelExperiencesBookingContactDetails;
import com.revolut.feature.travel.experiences.api.models.booking.TravelExperiencesBookingQuestionAnswer;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceBookingQuestion;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceLanguage;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceSelectedLanguage;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperiencesBookingPrerequisiteQuestion;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceVisitorsSelection;
import com.revolut.feature.travel.experiences.impl.ui.screen.questions.TravelExperiencesQuestionsScreenContract$InputData;
import d3g.k;
import d3g.m;
import d3g.n;
import d3g.y;
import e3g.f;
import h1g.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jki.g;
import jki.i;
import jki.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import myf.d;
import myf.e;
import yji.l;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.r0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends g implements n {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f93124p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j60.a f93125q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Map f93126r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f f93127s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e3g.g f93128t;
    public h3g.a u;
    public final k v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v5, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v27, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v34, types: [java.util.ArrayList] */
    public b(p stateMapper, TravelExperiencesQuestionsScreenContract$InputData inputData, c dateTimeFormatter, j60.a bottomExpandableDialogControllerExtension, ImmutableMap dialogItemMappers, f languageBottomDialogMapper, e3g.g guideTypeBottomDialogMapper, h stateHolder) {
        TravelExperienceSelectedLanguage travelExperienceSelectedLanguage;
        k kVar;
        Iterator it8;
        ?? arrayList;
        String string;
        ArrayList arrayList2;
        m mVar;
        ?? arrayList3;
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(dateTimeFormatter, "dateTimeFormatter");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(dialogItemMappers, "dialogItemMappers");
        Intrinsics.checkNotNullParameter(languageBottomDialogMapper, "languageBottomDialogMapper");
        Intrinsics.checkNotNullParameter(guideTypeBottomDialogMapper, "guideTypeBottomDialogMapper");
        Intrinsics.checkNotNullParameter(stateHolder, "stateHolder");
        this.f93124p = dateTimeFormatter;
        this.f93125q = bottomExpandableDialogControllerExtension;
        this.f93126r = dialogItemMappers;
        this.f93127s = languageBottomDialogMapper;
        this.f93128t = guideTypeBottomDialogMapper;
        int i = 10;
        if (inputData instanceof TravelExperiencesQuestionsScreenContract$InputData.VisitorsQuestions) {
            m mVar2 = m.VISITORS;
            myf.a aVarA = stateHolder.a();
            TravelExperiencesQuestionsScreenContract$InputData.VisitorsQuestions visitorsQuestions = (TravelExperiencesQuestionsScreenContract$InputData.VisitorsQuestions) inputData;
            List list = visitorsQuestions.f93121a;
            h0 h0Var = h0.f322473a;
            Intrinsics.checkNotNullParameter(list, "<this>");
            ArrayList<TravelExperienceBookingQuestion> arrayList4 = new ArrayList();
            for (Object obj2 : list) {
                if (((TravelExperienceBookingQuestion) obj2).f92791g == e.VISITOR) {
                    arrayList4.add(obj2);
                }
            }
            TravelExperienceVisitorsSelection travelExperienceVisitorsSelection = visitorsQuestions.f93122b;
            Intrinsics.checkNotNullParameter(travelExperienceVisitorsSelection, "<this>");
            Set setEntrySet = travelExperienceVisitorsSelection.f92916a.entrySet();
            ArrayList arrayList5 = new ArrayList(w.t(setEntrySet, 10));
            Iterator it9 = setEntrySet.iterator();
            while (true) {
                if (!it9.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it9.next();
                myf.b bVar = (myf.b) entry.getKey();
                int iIntValue = ((Number) entry.getValue()).intValue();
                ArrayList arrayList6 = new ArrayList(iIntValue);
                for (int i2 = 0; i2 < iIntValue; i2++) {
                    arrayList6.add(bVar);
                }
                arrayList5.add(arrayList6);
            }
            ArrayList arrayListU = w.u(arrayList5);
            int i3 = 0;
            ArrayList arrayList7 = new ArrayList(w.t(arrayListU, 10));
            Iterator it10 = arrayListU.iterator();
            while (it10.hasNext()) {
                Object next = it10.next();
                int i5 = i3 + 1;
                if (i3 < 0) {
                    v.s();
                    throw null;
                }
                myf.b bVar2 = (myf.b) next;
                Integer numValueOf = Integer.valueOf(i3);
                ArrayList arrayList8 = new ArrayList(w.t(arrayList4, i));
                for (TravelExperienceBookingQuestion travelExperienceBookingQuestion : arrayList4) {
                    Iterator it11 = it10;
                    if (travelExperienceBookingQuestion.f92790c == myf.f.AGE_BAND) {
                        string = bVar2.toString();
                    } else {
                        m70.a.c(t0.f186434a);
                        string = "";
                    }
                    String str = string;
                    TravelExperiencesBookingQuestionAnswer travelExperiencesBookingQuestionAnswer = new TravelExperiencesBookingQuestionAnswer(travelExperienceBookingQuestion, str, null, Integer.valueOf(i3), bVar2);
                    TextClause textClause = new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    int i6 = i3;
                    boolean zIsEmpty = travelExperienceBookingQuestion.f92793j.isEmpty();
                    List list2 = travelExperienceBookingQuestion.e;
                    if (list2 != null) {
                        List list3 = list2;
                        arrayList3 = new ArrayList();
                        for (Object obj3 : list3) {
                            ArrayList arrayList9 = arrayList4;
                            m mVar3 = mVar2;
                            if (((TravelExperienceBookingQuestion.Value) obj3).f92800c.isEmpty()) {
                                arrayList3.add(obj3);
                            }
                            arrayList4 = arrayList9;
                            mVar2 = mVar3;
                        }
                        arrayList2 = arrayList4;
                        mVar = mVar2;
                    } else {
                        arrayList2 = arrayList4;
                        mVar = mVar2;
                        arrayList3 = f0.f322471a;
                    }
                    arrayList8.add(new h3g.a(travelExperiencesBookingQuestionAnswer, textClause, zIsEmpty, arrayList3).c(stateHolder.a().f210459n));
                    i3 = i6;
                    arrayList4 = arrayList2;
                    mVar2 = mVar;
                    it10 = it11;
                }
                arrayList7.add(new h3g.c(bVar2, numValueOf, arrayList8));
                i3 = i5;
                it10 = it10;
                i = 10;
            }
            TravelExperiencesBookingContactDetails.INSTANCE.getClass();
            kVar = new k(mVar2, aVarA, list, h0Var, arrayList7, r0.g(), TravelExperiencesBookingContactDetails.e, null, f0.f322471a);
        } else {
            if (!(inputData instanceof TravelExperiencesQuestionsScreenContract$InputData.BookingQuestions)) {
                throw new NoWhenBranchMatchedException();
            }
            m mVar4 = m.BOOKING;
            myf.a aVarA2 = stateHolder.a();
            TravelExperiencesQuestionsScreenContract$InputData.BookingQuestions bookingQuestions = (TravelExperiencesQuestionsScreenContract$InputData.BookingQuestions) inputData;
            ArrayList arrayList10 = bookingQuestions.f93120c;
            ArrayList arrayList11 = bookingQuestions.f93118a;
            h0 h0Var2 = h0.f322473a;
            ArrayList arrayList12 = new ArrayList();
            for (Object obj4 : arrayList11) {
                if (((TravelExperienceBookingQuestion) obj4).f92791g == e.BOOKING) {
                    arrayList12.add(obj4);
                }
            }
            ArrayList arrayList13 = new ArrayList(w.t(arrayList12, 10));
            Iterator it12 = arrayList12.iterator();
            while (it12.hasNext()) {
                TravelExperienceBookingQuestion travelExperienceBookingQuestion2 = (TravelExperienceBookingQuestion) it12.next();
                t0 t0Var = t0.f186434a;
                m70.a.c(t0Var);
                TravelExperiencesBookingQuestionAnswer travelExperiencesBookingQuestionAnswer2 = new TravelExperiencesBookingQuestionAnswer(travelExperienceBookingQuestion2, "", null, null, null);
                Intrinsics.checkNotNullParameter(t0Var, "<this>");
                TextClause textClause2 = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                boolean zIsEmpty2 = travelExperienceBookingQuestion2.f92793j.isEmpty();
                List list4 = travelExperienceBookingQuestion2.e;
                if (list4 != null) {
                    arrayList = new ArrayList();
                    for (Object obj5 : list4) {
                        Iterator it13 = it12;
                        if (((TravelExperienceBookingQuestion.Value) obj5).f92800c.isEmpty()) {
                            arrayList.add(obj5);
                        }
                        it12 = it13;
                    }
                    it8 = it12;
                } else {
                    it8 = it12;
                    arrayList = f0.f322471a;
                }
                arrayList13.add(new h3g.a(travelExperiencesBookingQuestionAnswer2, textClause2, zIsEmpty2, arrayList).c(stateHolder.a().f210459n));
                it12 = it8;
            }
            List listC = u.c(new h3g.c(null, null, arrayList13));
            TravelExperiencesBookingContactDetails travelExperiencesBookingContactDetails = bookingQuestions.f93119b;
            Map mapG = r0.g();
            if (arrayList10.size() == 1) {
                TravelExperienceLanguage travelExperienceLanguage = (TravelExperienceLanguage) d0.b0(arrayList10);
                String str2 = travelExperienceLanguage.f92823a;
                ArrayList arrayList14 = travelExperienceLanguage.f92825c;
                travelExperienceSelectedLanguage = new TravelExperienceSelectedLanguage(str2, travelExperienceLanguage.f92824b, arrayList14, arrayList14.size() == 1 ? (myf.v) d0.b0(arrayList14) : null);
            } else {
                travelExperienceSelectedLanguage = null;
            }
            kVar = new k(mVar4, aVarA2, arrayList11, h0Var2, listC, mapG, travelExperiencesBookingContactDetails, travelExperienceSelectedLanguage, arrayList10);
        }
        this.v = kVar;
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, rd0.e.b(this.f93125q.E()), null, null, new co7.c(this, null, 19), 3);
    }

    @Override // jki.g
    public final i r2() {
        return this.v;
    }

    public final void y2(Function0 function0, Function1 function1, Function1 function12) {
        boolean z;
        h3g.a aVar;
        Iterator it8;
        boolean z3;
        Iterator it9;
        List list;
        h3g.a aVarA;
        boolean z4;
        Clause textClause;
        h3g.a aVar2;
        boolean z6;
        Iterator it10;
        Function1 function13 = function1;
        List list2 = ((k) t2()).e;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it11 = list2.iterator();
            while (it11.hasNext()) {
                List list3 = ((h3g.c) it11.next()).f149122c;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    Iterator it12 = list3.iterator();
                    while (it12.hasNext()) {
                        if (((Boolean) function13.invoke(it12.next())).booleanValue()) {
                            List list4 = ((k) t2()).e;
                            Map map = ((k) t2()).f;
                            List list5 = ((k) t2()).f111121b.f210459n;
                            TravelExperiencesBookingPrerequisiteQuestion travelExperiencesBookingPrerequisiteQuestion = (TravelExperiencesBookingPrerequisiteQuestion) function0.invoke();
                            LinkedHashMap linkedHashMapZ = r0.z(map);
                            linkedHashMapZ.put(travelExperiencesBookingPrerequisiteQuestion.f92854a, travelExperiencesBookingPrerequisiteQuestion);
                            for (boolean z11 = true; z11; z11 = z) {
                                List list6 = list4;
                                int i = 10;
                                ArrayList arrayList = new ArrayList(w.t(list6, 10));
                                Iterator it13 = list6.iterator();
                                z = false;
                                while (it13.hasNext()) {
                                    h3g.c cVar = (h3g.c) it13.next();
                                    ArrayList arrayList2 = new ArrayList();
                                    List list7 = cVar.f149122c;
                                    ArrayList arrayList3 = new ArrayList(w.t(list7, i));
                                    Iterator it14 = list7.iterator();
                                    int i2 = -1;
                                    int i3 = 0;
                                    while (it14.hasNext()) {
                                        Object next = it14.next();
                                        int i5 = i3 + 1;
                                        if (i3 < 0) {
                                            v.s();
                                            throw null;
                                        }
                                        h3g.a aVar3 = (h3g.a) next;
                                        if (((Boolean) function13.invoke(aVar3)).booleanValue()) {
                                            aVar = (h3g.a) function12.invoke(aVar3);
                                            i2 = i3;
                                        } else {
                                            aVar = aVar3;
                                        }
                                        TravelExperiencesBookingQuestionAnswer travelExperiencesBookingQuestionAnswer = aVar3.f149114a;
                                        List list8 = travelExperiencesBookingQuestionAnswer.f92761a.e;
                                        if (list8 != null) {
                                            ArrayList arrayList4 = new ArrayList();
                                            for (Object obj2 : list8) {
                                                Iterator it15 = it13;
                                                TravelExperienceBookingQuestion.Value value = (TravelExperienceBookingQuestion.Value) obj2;
                                                if (value.f92800c.isEmpty()) {
                                                    z6 = z;
                                                    it10 = it14;
                                                } else {
                                                    List list9 = value.f92800c;
                                                    if (!(list9 instanceof Collection) || !list9.isEmpty()) {
                                                        Iterator it16 = list9.iterator();
                                                        while (it16.hasNext()) {
                                                            TravelExperiencesBookingPrerequisiteQuestion travelExperiencesBookingPrerequisiteQuestion2 = (TravelExperiencesBookingPrerequisiteQuestion) it16.next();
                                                            Iterator it17 = it16;
                                                            String str = travelExperiencesBookingPrerequisiteQuestion2.f92854a;
                                                            z6 = z;
                                                            Object obj3 = travelExperiencesBookingQuestionAnswer.d;
                                                            if (obj3 == null) {
                                                                m70.a.c(t0.f186434a);
                                                                obj3 = "";
                                                            }
                                                            it10 = it14;
                                                            TravelExperiencesBookingPrerequisiteQuestion travelExperiencesBookingPrerequisiteQuestion3 = (TravelExperiencesBookingPrerequisiteQuestion) linkedHashMapZ.get(str + obj3);
                                                            if (!Intrinsics.f(travelExperiencesBookingPrerequisiteQuestion3 != null ? travelExperiencesBookingPrerequisiteQuestion3.f92855b : null, travelExperiencesBookingPrerequisiteQuestion2.f92855b)) {
                                                                it16 = it17;
                                                                z = z6;
                                                                it14 = it10;
                                                            }
                                                        }
                                                    }
                                                    z6 = z;
                                                    it10 = it14;
                                                    it13 = it15;
                                                    z = z6;
                                                    it14 = it10;
                                                }
                                                arrayList4.add(obj2);
                                                it13 = it15;
                                                z = z6;
                                                it14 = it10;
                                            }
                                            it8 = it13;
                                            z3 = z;
                                            it9 = it14;
                                            list = arrayList4;
                                        } else {
                                            it8 = it13;
                                            z3 = z;
                                            it9 = it14;
                                            list = f0.f322471a;
                                        }
                                        h3g.a aVarA2 = h3g.a.a(aVar, null, null, false, list, 7);
                                        TravelExperiencesBookingQuestionAnswer travelExperiencesBookingQuestionAnswer2 = aVarA2.f149114a;
                                        TravelExperienceBookingQuestion travelExperienceBookingQuestion = travelExperiencesBookingQuestionAnswer2.f92761a;
                                        String str2 = travelExperiencesBookingQuestionAnswer2.f92762b;
                                        if (!((com.revolut.feature.travel.experiences.api.models.experience.a.c(travelExperienceBookingQuestion) && travelExperiencesBookingQuestionAnswer2.f92763c == d.LOCATION_REF) || com.revolut.feature.travel.experiences.api.models.experience.a.b(travelExperiencesBookingQuestionAnswer2.f92761a)) || str2.length() <= 0) {
                                            aVarA = aVarA2;
                                            break;
                                        }
                                        List list10 = aVarA2.d;
                                        if (!(list10 instanceof Collection) || !list10.isEmpty()) {
                                            Iterator it18 = list10.iterator();
                                            while (it18.hasNext()) {
                                                if (Intrinsics.f(((TravelExperienceBookingQuestion.Value) it18.next()).f92798a, str2)) {
                                                    aVarA = aVarA2;
                                                    break;
                                                }
                                            }
                                        }
                                        t0 t0Var = t0.f186434a;
                                        m70.a.c(t0Var);
                                        TravelExperiencesBookingQuestionAnswer travelExperiencesBookingQuestionAnswerA = TravelExperiencesBookingQuestionAnswer.a(travelExperiencesBookingQuestionAnswer2, "", null, 25);
                                        Intrinsics.checkNotNullParameter(t0Var, "<this>");
                                        aVarA = h3g.a.a(aVarA2, travelExperiencesBookingQuestionAnswerA, new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, null, 12);
                                        linkedHashMapZ.remove(aVarA.f149114a.b());
                                        TravelExperiencesBookingQuestionAnswer travelExperiencesBookingQuestionAnswerA2 = aVarA.f149114a;
                                        if (travelExperiencesBookingQuestionAnswerA2.f92761a.f92793j.isEmpty()) {
                                            z4 = true;
                                            break;
                                        }
                                        List<TravelExperiencesBookingPrerequisiteQuestion> list11 = travelExperiencesBookingQuestionAnswerA2.f92761a.f92793j;
                                        if (!(list11 instanceof Collection) || !list11.isEmpty()) {
                                            for (TravelExperiencesBookingPrerequisiteQuestion travelExperiencesBookingPrerequisiteQuestion4 : list11) {
                                                String str3 = travelExperiencesBookingPrerequisiteQuestion4.f92854a;
                                                Object obj4 = travelExperiencesBookingQuestionAnswerA2.d;
                                                if (obj4 == null) {
                                                    m70.a.c(t0.f186434a);
                                                    obj4 = "";
                                                }
                                                TravelExperiencesBookingPrerequisiteQuestion travelExperiencesBookingPrerequisiteQuestion5 = (TravelExperiencesBookingPrerequisiteQuestion) linkedHashMapZ.get(str3 + obj4);
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
                                        TravelExperiencesBookingQuestionAnswer travelExperiencesBookingQuestionAnswer3 = travelExperiencesBookingQuestionAnswerA2;
                                        if (z31) {
                                            m70.a.c(t0.f186434a);
                                            textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                                        } else {
                                            textClause = aVarA.f149115b;
                                        }
                                        h3g.a aVarC = h3g.a.a(aVarA, travelExperiencesBookingQuestionAnswer3, textClause, z4, null, 8).c(list5);
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
                                        function13 = function1;
                                        i3 = i5;
                                        it13 = it8;
                                        it14 = it9;
                                    }
                                    Iterator it19 = it13;
                                    boolean z41 = z;
                                    ArrayList arrayListF1 = d0.f1(arrayList3);
                                    if (i2 >= 0) {
                                        arrayListF1.addAll(i2 + 1, arrayList2);
                                    }
                                    arrayList.add(h3g.c.a(cVar, d0.d1(d0.Z(arrayListF1))));
                                    function13 = function1;
                                    it13 = it19;
                                    z = z41;
                                    i = 10;
                                }
                                function13 = function1;
                                list4 = arrayList;
                            }
                            x2(new y(list4, r0.u(linkedHashMapZ), 0));
                            return;
                        }
                        function13 = function1;
                    }
                }
                function13 = function1;
            }
        }
    }
}
