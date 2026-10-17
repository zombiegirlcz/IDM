package q3g;

import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceVisitorsSelection;
import jki.i;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final myf.a f241965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TravelExperienceVisitorsSelection f241966b;

    public d(myf.a experience, TravelExperienceVisitorsSelection visitorsSelection) {
        Intrinsics.checkNotNullParameter(experience, "experience");
        Intrinsics.checkNotNullParameter(visitorsSelection, "visitorsSelection");
        this.f241965a = experience;
        this.f241966b = visitorsSelection;
    }

    public static d a(d dVar, TravelExperienceVisitorsSelection visitorsSelection) {
        myf.a experience = dVar.f241965a;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(experience, "experience");
        Intrinsics.checkNotNullParameter(visitorsSelection, "visitorsSelection");
        return new d(experience, visitorsSelection);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f241965a, dVar.f241965a) && Intrinsics.f(this.f241966b, dVar.f241966b);
    }

    public final int hashCode() {
        return this.f241966b.f92916a.hashCode() + (this.f241965a.hashCode() * 31);
    }
}
