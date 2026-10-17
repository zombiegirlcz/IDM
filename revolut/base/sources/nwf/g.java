package nwf;

import aii.r;
import com.revolut.feature.transport.models.TransportLocation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransportLocation f219864a;

    public g(TransportLocation location) {
        Intrinsics.checkNotNullParameter(location, "location");
        this.f219864a = location;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f219864a, ((g) obj2).f219864a);
    }

    public final int hashCode() {
        return this.f219864a.hashCode();
    }
}
