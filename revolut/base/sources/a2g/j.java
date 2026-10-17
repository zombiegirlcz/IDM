package a2g;

import com.revolut.feature.travel.experiences.impl.ui.screen.selection.dates.TravelExperiencesDatesSelectionScreenContract$DateAvailabilityStrategy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class j implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final myf.a f840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TravelExperiencesDatesSelectionScreenContract$DateAvailabilityStrategy.OnlyAvailable f841b;

    public j(myf.a experience, TravelExperiencesDatesSelectionScreenContract$DateAvailabilityStrategy.OnlyAvailable datesAvailabilityStrategy) {
        Intrinsics.checkNotNullParameter(experience, "experience");
        Intrinsics.checkNotNullParameter(datesAvailabilityStrategy, "datesAvailabilityStrategy");
        this.f840a = experience;
        this.f841b = datesAvailabilityStrategy;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f840a.equals(jVar.f840a) && this.f841b.equals(jVar.f841b);
    }

    public final int hashCode() {
        return this.f841b.hashCode() + (this.f840a.hashCode() * 31);
    }
}
