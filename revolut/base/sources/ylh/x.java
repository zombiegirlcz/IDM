package ylh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class x extends z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f314737a;

    public x(a availablePeriod) {
        Intrinsics.checkNotNullParameter(availablePeriod, "availablePeriod");
        this.f314737a = availablePeriod;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof x) && Intrinsics.f(this.f314737a, ((x) obj2).f314737a);
    }

    public final int hashCode() {
        return this.f314737a.hashCode();
    }
}
