package hui;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class q implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f155689a;

    public q(String passId) {
        Intrinsics.checkNotNullParameter(passId, "passId");
        this.f155689a = passId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f155689a, ((q) obj2).f155689a);
    }

    public final int hashCode() {
        return this.f155689a.hashCode();
    }
}
