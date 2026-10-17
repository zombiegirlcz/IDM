package bxg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pwg.q f19691a;

    public k(pwg.q sortOrder) {
        Intrinsics.checkNotNullParameter(sortOrder, "sortOrder");
        this.f19691a = sortOrder;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && this.f19691a == ((k) obj2).f19691a;
    }

    public final int hashCode() {
        return this.f19691a.hashCode();
    }
}
