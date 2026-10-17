package th1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f271241a;

    public b(String latestSearchQuery) {
        Intrinsics.checkNotNullParameter(latestSearchQuery, "latestSearchQuery");
        this.f271241a = latestSearchQuery;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f271241a, ((b) obj2).f271241a);
    }

    public final int hashCode() {
        return this.f271241a.hashCode();
    }
}
