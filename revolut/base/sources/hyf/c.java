package hyf;

import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceDatesSelection;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceVisitorsSelection;
import h30.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f156871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f156872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TravelExperienceVisitorsSelection f156873c;
    public final TravelExperienceDatesSelection d;

    public c(String experienceId, xi0.b currency, TravelExperienceVisitorsSelection visitorsSelection, TravelExperienceDatesSelection datesSelection) {
        Intrinsics.checkNotNullParameter(experienceId, "experienceId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(visitorsSelection, "visitorsSelection");
        Intrinsics.checkNotNullParameter(datesSelection, "datesSelection");
        this.f156871a = experienceId;
        this.f156872b = currency;
        this.f156873c = visitorsSelection;
        this.d = datesSelection;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f156871a, cVar.f156871a) && Intrinsics.f(this.f156872b, cVar.f156872b) && Intrinsics.f(this.f156873c, cVar.f156873c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        return Integer.hashCode(2) + j6.a.b(50, (this.d.hashCode() + p.a.e(l.j(this.f156872b, this.f156871a.hashCode() * 31, 31), 31, this.f156873c.f92916a)) * 31, 31);
    }
}
