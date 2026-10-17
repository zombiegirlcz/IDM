package myf;

import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceLocation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d0 extends f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelExperienceLocation f210469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TravelExperienceLocation f210470b;

    public d0(TravelExperienceLocation departureLocation, TravelExperienceLocation returnLocation) {
        Intrinsics.checkNotNullParameter(departureLocation, "departureLocation");
        Intrinsics.checkNotNullParameter(returnLocation, "returnLocation");
        this.f210469a = departureLocation;
        this.f210470b = returnLocation;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.f210469a, d0Var.f210469a) && Intrinsics.f(this.f210470b, d0Var.f210470b);
    }

    public final int hashCode() {
        return this.f210470b.hashCode() + (this.f210469a.hashCode() * 31);
    }
}
