package k3g;

import com.revolut.feature.travel.experiences.api.models.search.TravelSearchAttraction;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelSearchAttraction f180715a;

    public e(TravelSearchAttraction attraction) {
        Intrinsics.checkNotNullParameter(attraction, "attraction");
        this.f180715a = attraction;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f180715a, ((e) obj2).f180715a);
    }

    public final int hashCode() {
        return this.f180715a.hashCode();
    }
}
