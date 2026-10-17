package azb;

import com.revolut.feature.rev_points.api.navigation.RevPointsFlowDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPointsFlowDestination f11423a;

    public b(RevPointsFlowDestination destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f11423a = destination;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f11423a.equals(((b) obj2).f11423a);
    }

    public final int hashCode() {
        return this.f11423a.f83493b.hashCode();
    }
}
