package au6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c1 extends g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sr6.k f9502a;

    public c1(sr6.k query) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.f9502a = query;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c1) && Intrinsics.f(this.f9502a, ((c1) obj2).f9502a);
    }

    public final int hashCode() {
        return this.f9502a.hashCode();
    }
}
