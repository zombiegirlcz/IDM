package e3g;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.travel.experiences.api.models.booking.TravelExperiencesBookingQuestionAnswer;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w3g.c f122265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f122266b;

    public e(w3g.c measureFormatter, c configuration) {
        Intrinsics.checkNotNullParameter(measureFormatter, "measureFormatter");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f122265a = measureFormatter;
        this.f122266b = configuration;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    @Override // e3g.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final h3g.a a(h3g.a r7) {
        /*
            r6 = this;
            java.lang.String r0 = "answer"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            com.revolut.feature.travel.experiences.api.models.booking.TravelExperiencesBookingQuestionAnswer r0 = r7.f149114a
            com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceBookingQuestion r0 = r0.f92761a
            java.util.List r0 = r0.d
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L38
            r3 = r0
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            boolean r4 = r3 instanceof java.util.Collection
            if (r4 == 0) goto L20
            r4 = r3
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L20
            goto L38
        L20:
            java.util.Iterator r3 = r3.iterator()
        L24:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L38
            java.lang.Object r4 = r3.next()
            com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceBookingQuestion$AnswerUnit r4 = (com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceBookingQuestion.AnswerUnit) r4
            myf.d r4 = r4.f92794a
            myf.d r5 = myf.d.CM
            if (r4 != r5) goto L24
            r3 = r1
            goto L39
        L38:
            r3 = r2
        L39:
            if (r0 == 0) goto L63
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r4 = r0 instanceof java.util.Collection
            if (r4 == 0) goto L4c
            r4 = r0
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L4c
        L4a:
            r1 = r2
            goto L62
        L4c:
            java.util.Iterator r0 = r0.iterator()
        L50:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L4a
            java.lang.Object r4 = r0.next()
            com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceBookingQuestion$AnswerUnit r4 = (com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceBookingQuestion.AnswerUnit) r4
            myf.d r4 = r4.f92794a
            myf.d r5 = myf.d.FT
            if (r4 != r5) goto L50
        L62:
            r2 = r1
        L63:
            r0 = 174(0xae, float:2.44E-43)
            kotlin.Pair r7 = r6.c(r7, r0, r3, r2)
            java.lang.Object r7 = r7.f186386b
            h3g.a r7 = (h3g.a) r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: e3g.e.a(h3g.a):h3g.a");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006b  */
    @Override // e3g.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List b(h3g.a r24) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e3g.e.b(h3g.a):java.util.List");
    }

    public final Pair c(h3g.a aVar, int i, boolean z, boolean z3) {
        Clause compositeClause;
        TextClause textClauseC;
        w3g.c cVar = this.f122265a;
        if (z && !z3) {
            textClauseC = cVar.a(i);
        } else {
            if (!z3 || z) {
                compositeClause = new CompositeClause(v.k(cVar.a(i), new TextClause(" (", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), cVar.c(i), new TextClause(")", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, null, null, 14);
                return new Pair(compositeClause, h3g.a.a(aVar, TravelExperiencesBookingQuestionAnswer.a(aVar.f149114a, String.valueOf(i), myf.d.CM, 25), compositeClause, false, null, 12));
            }
            textClauseC = cVar.c(i);
        }
        compositeClause = textClauseC;
        return new Pair(compositeClause, h3g.a.a(aVar, TravelExperiencesBookingQuestionAnswer.a(aVar.f149114a, String.valueOf(i), myf.d.CM, 25), compositeClause, false, null, 12));
    }
}
