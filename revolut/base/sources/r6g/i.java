package r6g;

import aii.r;
import com.revolut.feature.travel.flights.models.domain.search.Passengers;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Passengers f251844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m7g.d f251845b;

    public i(Passengers passengers, m7g.d cabinClass) {
        Intrinsics.checkNotNullParameter(passengers, "passengers");
        Intrinsics.checkNotNullParameter(cabinClass, "cabinClass");
        this.f251844a = passengers;
        this.f251845b = cabinClass;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f251844a, iVar.f251844a) && this.f251845b == iVar.f251845b;
    }

    public final int hashCode() {
        return this.f251845b.hashCode() + (this.f251844a.hashCode() * 31);
    }
}
