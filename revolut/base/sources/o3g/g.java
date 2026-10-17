package o3g;

import aii.r;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceDatesSelection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelExperienceDatesSelection f221810a;

    public g(TravelExperienceDatesSelection datesSelection) {
        Intrinsics.checkNotNullParameter(datesSelection, "datesSelection");
        this.f221810a = datesSelection;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f221810a, ((g) obj2).f221810a);
    }

    public final int hashCode() {
        return this.f221810a.hashCode();
    }
}
