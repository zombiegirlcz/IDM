package h3g;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.travel.experiences.api.R$string;
import com.revolut.feature.travel.experiences.api.models.booking.TravelExperiencesBookingQuestionAnswer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import myf.d;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelExperiencesBookingQuestionAnswer f149114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f149115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f149116c;
    public final List d;

    public a(TravelExperiencesBookingQuestionAnswer domainAnswer, Clause clause, boolean z, List visibleEnumValues) {
        Intrinsics.checkNotNullParameter(domainAnswer, "domainAnswer");
        Intrinsics.checkNotNullParameter(visibleEnumValues, "visibleEnumValues");
        this.f149114a = domainAnswer;
        this.f149115b = clause;
        this.f149116c = z;
        this.d = visibleEnumValues;
    }

    public static a a(a aVar, TravelExperiencesBookingQuestionAnswer domainAnswer, Clause clause, boolean z, List visibleEnumValues, int i) {
        if ((i & 1) != 0) {
            domainAnswer = aVar.f149114a;
        }
        if ((i & 2) != 0) {
            clause = aVar.f149115b;
        }
        if ((i & 4) != 0) {
            z = aVar.f149116c;
        }
        if ((i & 8) != 0) {
            visibleEnumValues = aVar.d;
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(domainAnswer, "domainAnswer");
        Intrinsics.checkNotNullParameter(visibleEnumValues, "visibleEnumValues");
        return new a(domainAnswer, clause, z, visibleEnumValues);
    }

    public final a b() {
        m70.a.c(t0.f186434a);
        return a(this, TravelExperiencesBookingQuestionAnswer.a(this.f149114a, "", d.TEXT, 25), new TextLocalisedClause(R$string.experiences_location_picker_add_manually, null, null, 14), false, null, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final h3g.a c(java.util.List r15) {
        /*
            r14 = this;
            java.lang.String r0 = "locations"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            com.revolut.feature.travel.experiences.api.models.booking.TravelExperiencesBookingQuestionAnswer r0 = r14.f149114a
            com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceBookingQuestion r1 = r0.f92761a
            boolean r1 = com.revolut.feature.travel.experiences.api.models.experience.a.c(r1)
            if (r1 == 0) goto L28
            boolean r1 = r14.f149116c
            if (r1 == 0) goto L28
            com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceBookingQuestion r1 = r0.f92761a
            boolean r1 = com.revolut.feature.travel.experiences.api.models.experience.a.d(r1)
            java.util.List r2 = r14.d
            if (r1 == 0) goto L2b
            boolean r15 = r2.isEmpty()
            if (r15 == 0) goto L28
            h3g.a r15 = r14.b()
            return r15
        L28:
            r4 = r14
            goto L91
        L2b:
            int r1 = r2.size()
            r3 = 1
            if (r1 != r3) goto L28
            r1 = 0
            java.lang.Object r1 = r2.get(r1)
            com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceBookingQuestion$Value r1 = (com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceBookingQuestion.Value) r1
            java.lang.String r1 = r1.f92798a
            myf.d r2 = myf.d.LOCATION_REF
            r3 = 25
            com.revolut.feature.travel.experiences.api.models.booking.TravelExperiencesBookingQuestionAnswer r5 = com.revolut.feature.travel.experiences.api.models.booking.TravelExperiencesBookingQuestionAnswer.a(r0, r1, r2, r3)
            com.revolut.core.ui_kit.models.TextClause r6 = new com.revolut.core.ui_kit.models.TextClause
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            java.util.Iterator r15 = r15.iterator()
        L4b:
            boolean r0 = r15.hasNext()
            r2 = 0
            if (r0 == 0) goto L62
            java.lang.Object r0 = r15.next()
            r3 = r0
            com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceLocation r3 = (com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceLocation) r3
            java.lang.String r3 = r3.f92826a
            boolean r3 = kotlin.jvm.internal.Intrinsics.f(r3, r1)
            if (r3 == 0) goto L4b
            goto L63
        L62:
            r0 = r2
        L63:
            com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceLocation r0 = (com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceLocation) r0
            if (r0 == 0) goto L7d
            java.lang.String r15 = r0.f92827b
            int r3 = r15.length()
            if (r3 != 0) goto L78
            com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceAddress r15 = r0.f92828c
            if (r15 == 0) goto L77
            java.lang.String r2 = io3.h.b(r15)
        L77:
            r15 = r2
        L78:
            if (r15 != 0) goto L7b
            goto L7d
        L7b:
            r7 = r15
            goto L7e
        L7d:
            r7 = r1
        L7e:
            r12 = 0
            r13 = 126(0x7e, float:1.77E-43)
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r9 = 12
            r7 = 0
            r4 = r14
            h3g.a r15 = a(r4, r5, r6, r7, r8, r9)
            return r15
        L91:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: h3g.a.c(java.util.List):h3g.a");
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f149114a, aVar.f149114a) && Intrinsics.f(this.f149115b, aVar.f149115b) && this.f149116c == aVar.f149116c && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f149114a.hashCode() * 31;
        Clause clause = this.f149115b;
        return this.d.hashCode() + j6.a.c((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.f149116c);
    }
}
