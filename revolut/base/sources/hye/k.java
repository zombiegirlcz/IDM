package hye;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class k extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aue.k f156866a;

    public k(aue.k limit) {
        Intrinsics.checkNotNullParameter(limit, "limit");
        this.f156866a = limit;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f156866a, ((k) obj2).f156866a);
    }

    public final int hashCode() {
        return this.f156866a.hashCode();
    }
}
