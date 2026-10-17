package hs4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154989a;

    public f(String planId) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        this.f154989a = planId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f154989a, ((f) obj2).f154989a);
    }

    public final int hashCode() {
        return this.f154989a.hashCode();
    }
}
