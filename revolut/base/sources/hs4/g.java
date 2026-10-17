package hs4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154990a;

    public g(String planId) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        this.f154990a = planId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f154990a, ((g) obj2).f154990a);
    }

    public final int hashCode() {
        return this.f154990a.hashCode();
    }
}
