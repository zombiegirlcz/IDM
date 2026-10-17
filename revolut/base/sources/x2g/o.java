package x2g;

import aw0.o9;
import com.google.common.collect.ImmutableMap;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.travel.experiences.api.models.booking.TravelExperiencesBookingQuestionAnswer;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceBookingQuestion;
import com.revolut.feature.travel.experiences.impl.ui.screen.pickup_details.TravelExperiencesPickupDetailsScreenContract$InputData;
import d3g.g0;
import d3g.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import zhm.f0;
import zhm.h0;
import zhm.r0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class o extends jki.g implements l {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TravelExperiencesPickupDetailsScreenContract$InputData f302564p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final g0 f302565q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j60.a f302566r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Map f302567s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b1g.c f302568t;
    public h3g.a u;
    public final j v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v3, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.util.ArrayList] */
    public o(jki.p stateMapper, TravelExperiencesPickupDetailsScreenContract$InputData inputData, g0 updateAnswerDelegate, j60.a bottomExpandableDialogControllerExtension, ImmutableMap dialogItemMappers, b1g.c dateTimeFormatter, h1g.h stateHolder) {
        ?? arrayList;
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(updateAnswerDelegate, "updateAnswerDelegate");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(dialogItemMappers, "dialogItemMappers");
        Intrinsics.checkNotNullParameter(dateTimeFormatter, "dateTimeFormatter");
        Intrinsics.checkNotNullParameter(stateHolder, "stateHolder");
        this.f302564p = inputData;
        this.f302565q = updateAnswerDelegate;
        this.f302566r = bottomExpandableDialogControllerExtension;
        this.f302567s = dialogItemMappers;
        this.f302568t = dateTimeFormatter;
        myf.a aVarA = stateHolder.a();
        List list = inputData.f93104a;
        h0 h0Var = h0.f322473a;
        ArrayList<TravelExperienceBookingQuestion> arrayList2 = new ArrayList();
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            TravelExperienceBookingQuestion.Category category = ((TravelExperienceBookingQuestion) next).i;
            if (Intrinsics.f(category != null ? category.f92795a : null, "PICKUP")) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
        for (TravelExperienceBookingQuestion travelExperienceBookingQuestion : arrayList2) {
            t0 t0Var = t0.f186434a;
            m70.a.c(t0Var);
            TravelExperiencesBookingQuestionAnswer travelExperiencesBookingQuestionAnswer = new TravelExperiencesBookingQuestionAnswer(travelExperienceBookingQuestion, "", null, null, null);
            Intrinsics.checkNotNullParameter(t0Var, "<this>");
            TextClause textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            boolean zIsEmpty = travelExperienceBookingQuestion.f92793j.isEmpty();
            List list2 = travelExperienceBookingQuestion.e;
            if (list2 != null) {
                arrayList = new ArrayList();
                for (Object obj2 : list2) {
                    if (((TravelExperienceBookingQuestion.Value) obj2).f92800c.isEmpty()) {
                        arrayList.add(obj2);
                    }
                }
            } else {
                arrayList = f0.f322471a;
            }
            arrayList3.add(new h3g.a(travelExperiencesBookingQuestionAnswer, textClause, zIsEmpty, arrayList).c(stateHolder.a().f210459n));
        }
        this.v = new j(aVarA, list, h0Var, u.c(new h3g.c(null, null, arrayList3)), r0.g());
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, rd0.e.b(this.f302566r.E()), null, null, new x0f.g(this, null, 4), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.v;
    }

    public final void y2(Function0 function0, Function1 function1, Function1 function12) {
        List list = ((j) t2()).d;
        if ((list instanceof Collection) && list.isEmpty()) {
            return;
        }
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            List list2 = ((h3g.c) it8.next()).f149122c;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it9 = list2.iterator();
                while (it9.hasNext()) {
                    if (((Boolean) function1.invoke(it9.next())).booleanValue()) {
                        Function1 function13 = function1;
                        Pair pairA = ((d3g.h0) this.f302565q).a(function13, function0, function12, ((j) t2()).d, ((j) t2()).e, ((j) t2()).f302555a);
                        x2(new y((List) pairA.f186385a, (Map) pairA.f186386b, 4));
                        return;
                    }
                }
            }
            function1 = function1;
            function0 = function0;
            function12 = function12;
        }
    }
}
