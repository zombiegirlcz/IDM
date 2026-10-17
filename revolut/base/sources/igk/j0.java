package igk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class j0 implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f161254a;

    public j0(String planId) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        this.f161254a = planId;
    }

    public final String a() {
        return this.f161254a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j0) && Intrinsics.f(this.f161254a, ((j0) obj2).f161254a);
    }

    public final int hashCode() {
        return this.f161254a.hashCode();
    }
}
