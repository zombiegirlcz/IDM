package sv4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f265835a;

    public c(String planId) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        this.f265835a = planId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f265835a, ((c) obj2).f265835a);
    }

    public final int hashCode() {
        return this.f265835a.hashCode();
    }
}
