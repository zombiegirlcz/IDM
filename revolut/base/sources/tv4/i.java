package tv4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f274703a;

    public i(String planId) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        this.f274703a = planId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f274703a, ((i) obj2).f274703a);
    }

    public final int hashCode() {
        return this.f274703a.hashCode();
    }
}
