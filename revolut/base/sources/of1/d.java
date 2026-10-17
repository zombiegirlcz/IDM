package of1;

import aii.u;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f224679a;

    public d(u destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f224679a = destination;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f224679a, ((d) obj2).f224679a);
    }

    public final int hashCode() {
        return this.f224679a.hashCode();
    }
}
