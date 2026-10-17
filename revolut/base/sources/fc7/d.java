package fc7;

import aii.u;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f133652a;

    public d(u destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f133652a = destination;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f133652a, ((d) obj2).f133652a);
    }

    public final int hashCode() {
        return this.f133652a.hashCode();
    }
}
