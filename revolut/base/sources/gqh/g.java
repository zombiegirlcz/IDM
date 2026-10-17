package gqh;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f145734a;

    public g(String createdScreenerId) {
        Intrinsics.checkNotNullParameter(createdScreenerId, "createdScreenerId");
        this.f145734a = createdScreenerId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f145734a, ((g) obj2).f145734a);
    }

    public final int hashCode() {
        return this.f145734a.hashCode();
    }
}
