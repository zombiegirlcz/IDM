package hs4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154991a;

    public h(String planId) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        this.f154991a = planId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f154991a, ((h) obj2).f154991a);
    }

    public final int hashCode() {
        return this.f154991a.hashCode();
    }
}
