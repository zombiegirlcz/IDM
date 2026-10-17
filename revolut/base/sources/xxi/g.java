package xxi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f309540a;

    public g(String queryParam) {
        Intrinsics.checkNotNullParameter(queryParam, "queryParam");
        this.f309540a = queryParam;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f309540a, ((g) obj2).f309540a);
    }

    public final int hashCode() {
        return this.f309540a.hashCode();
    }
}
