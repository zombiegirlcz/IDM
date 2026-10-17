package fv4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class l implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f138335a;

    public l(String planId) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        this.f138335a = planId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f138335a, ((l) obj2).f138335a);
    }

    public final int hashCode() {
        return this.f138335a.hashCode();
    }
}
