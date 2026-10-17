package q3g;

import aii.r;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceVisitorsSelection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelExperienceVisitorsSelection f241967a;

    public e(TravelExperienceVisitorsSelection visitorsSelection) {
        Intrinsics.checkNotNullParameter(visitorsSelection, "visitorsSelection");
        this.f241967a = visitorsSelection;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f241967a, ((e) obj2).f241967a);
    }

    public final int hashCode() {
        return this.f241967a.f92916a.hashCode();
    }
}
