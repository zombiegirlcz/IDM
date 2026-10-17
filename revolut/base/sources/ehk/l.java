package ehk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class l extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f126220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f126221b;

    public l(String planId, boolean z) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        this.f126220a = planId;
        this.f126221b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f126220a, lVar.f126220a) && this.f126221b == lVar.f126221b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f126221b) + (this.f126220a.hashCode() * 31);
    }
}
