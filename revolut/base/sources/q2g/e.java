package q2g;

import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceLocation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelExperienceLocation f241646a;

    public e(TravelExperienceLocation location) {
        Intrinsics.checkNotNullParameter(location, "location");
        this.f241646a = location;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f241646a, ((e) obj2).f241646a);
    }

    public final int hashCode() {
        return this.f241646a.hashCode();
    }
}
