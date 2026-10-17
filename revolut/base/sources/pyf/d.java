package pyf;

import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceVisitorsSelection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends cam.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TravelExperienceVisitorsSelection f240825b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(TravelExperienceVisitorsSelection visitorsSelection) {
        super(visitorsSelection.f92916a.isEmpty() ? e.DISABLED : e.ENABLED, false);
        Intrinsics.checkNotNullParameter(visitorsSelection, "visitorsSelection");
        this.f240825b = visitorsSelection;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f240825b, ((d) obj2).f240825b);
    }

    public final int hashCode() {
        return this.f240825b.f92916a.hashCode();
    }
}
