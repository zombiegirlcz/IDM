package pyf;

import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceDatesSelection;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends cam.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TravelExperienceDatesSelection f240824b;

    /* JADX WARN: Illegal instructions before constructor call */
    public c(TravelExperienceDatesSelection datesSelection) {
        e eVar;
        Intrinsics.checkNotNullParameter(datesSelection, "datesSelection");
        if (datesSelection instanceof TravelExperienceDatesSelection.NoDatesSelection) {
            eVar = e.DISABLED;
        } else {
            if (!(datesSelection instanceof TravelExperienceDatesSelection.RangeDateSelection) && !(datesSelection instanceof TravelExperienceDatesSelection.SingleDateSelection)) {
                throw new NoWhenBranchMatchedException();
            }
            eVar = e.ENABLED;
        }
        super(eVar, false);
        this.f240824b = datesSelection;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f240824b, ((c) obj2).f240824b);
    }

    public final int hashCode() {
        return this.f240824b.hashCode();
    }
}
