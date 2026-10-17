package vgg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class p implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f289170a;

    public p(String airlineId) {
        Intrinsics.checkNotNullParameter(airlineId, "airlineId");
        this.f289170a = airlineId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f289170a, ((p) obj2).f289170a);
    }

    public final int hashCode() {
        return this.f289170a.hashCode();
    }
}
