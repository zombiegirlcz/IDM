package d2g;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class q implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lyf.f f110818a;

    public q(lyf.f attraction) {
        Intrinsics.checkNotNullParameter(attraction, "attraction");
        this.f110818a = attraction;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f110818a, ((q) obj2).f110818a);
    }

    public final int hashCode() {
        return this.f110818a.hashCode();
    }
}
