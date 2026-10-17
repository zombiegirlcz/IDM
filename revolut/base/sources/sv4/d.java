package sv4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f265836a;

    public d(String planId) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        this.f265836a = planId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f265836a, ((d) obj2).f265836a);
    }

    public final int hashCode() {
        return this.f265836a.hashCode();
    }
}
