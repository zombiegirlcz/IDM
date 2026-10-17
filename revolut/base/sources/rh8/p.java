package rh8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class p implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f254364a;

    public p(String juniorId) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        this.f254364a = juniorId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f254364a, ((p) obj2).f254364a);
    }

    public final int hashCode() {
        return this.f254364a.hashCode();
    }
}
