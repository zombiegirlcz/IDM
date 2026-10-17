package au6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d1 extends g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sr6.k f9513a;

    public d1(sr6.k query) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.f9513a = query;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d1) && Intrinsics.f(this.f9513a, ((d1) obj2).f9513a);
    }

    public final int hashCode() {
        return this.f9513a.hashCode();
    }
}
