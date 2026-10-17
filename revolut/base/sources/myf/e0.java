package myf;

import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceLocation;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e0 extends f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f210471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TravelExperienceLocation f210472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TravelExperienceLocation f210473c;

    public e0(List items, TravelExperienceLocation travelExperienceLocation, TravelExperienceLocation travelExperienceLocation2) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f210471a = items;
        this.f210472b = travelExperienceLocation;
        this.f210473c = travelExperienceLocation2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return Intrinsics.f(this.f210471a, e0Var.f210471a) && Intrinsics.f(this.f210472b, e0Var.f210472b) && Intrinsics.f(this.f210473c, e0Var.f210473c);
    }

    public final int hashCode() {
        int iHashCode = this.f210471a.hashCode() * 31;
        TravelExperienceLocation travelExperienceLocation = this.f210472b;
        int iHashCode2 = (iHashCode + (travelExperienceLocation == null ? 0 : travelExperienceLocation.hashCode())) * 31;
        TravelExperienceLocation travelExperienceLocation2 = this.f210473c;
        return iHashCode2 + (travelExperienceLocation2 != null ? travelExperienceLocation2.hashCode() : 0);
    }
}
