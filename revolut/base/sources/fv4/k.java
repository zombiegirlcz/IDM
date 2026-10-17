package fv4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f138334a;

    public k(String planId) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        this.f138334a = planId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f138334a, ((k) obj2).f138334a);
    }

    public final int hashCode() {
        return this.f138334a.hashCode();
    }
}
