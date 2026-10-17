package y06;

import com.revolut.feature.restricted_access.api.FeatureNotAvailableDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FeatureNotAvailableDestination f310153a;

    public e(FeatureNotAvailableDestination destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f310153a = destination;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f310153a.equals(((e) obj2).f310153a);
    }

    public final int hashCode() {
        return this.f310153a.hashCode();
    }
}
