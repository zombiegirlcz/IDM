package y2e;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f310638a;

    public d(String filterId) {
        Intrinsics.checkNotNullParameter(filterId, "filterId");
        this.f310638a = filterId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f310638a, ((d) obj2).f310638a);
    }

    public final int hashCode() {
        return this.f310638a.hashCode();
    }
}
