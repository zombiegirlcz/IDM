package j2g;

import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceDatesSelection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelExperienceDatesSelection f170871a;

    public i(TravelExperienceDatesSelection datesSelection) {
        Intrinsics.checkNotNullParameter(datesSelection, "datesSelection");
        this.f170871a = datesSelection;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f170871a, ((i) obj2).f170871a);
    }

    public final int hashCode() {
        return this.f170871a.hashCode();
    }
}
