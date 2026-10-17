package zq5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f324369a;

    public d(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.f324369a = query;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f324369a, ((d) obj2).f324369a);
    }

    public final int hashCode() {
        return this.f324369a.hashCode();
    }
}
