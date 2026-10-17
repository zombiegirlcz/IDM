package k3g;

import com.revolut.feature.travel.experiences.api.models.search.TravelSearchDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelSearchDestination f180716a;

    public f(TravelSearchDestination destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f180716a = destination;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f180716a, ((f) obj2).f180716a);
    }

    public final int hashCode() {
        return this.f180716a.hashCode();
    }
}
