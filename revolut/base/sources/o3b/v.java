package o3b;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k4l.n0 f221772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f221773b;

    public v(k4l.n0 strategyType, u strategyInputType) {
        Intrinsics.checkNotNullParameter(strategyType, "strategyType");
        Intrinsics.checkNotNullParameter(strategyInputType, "strategyInputType");
        this.f221772a = strategyType;
        this.f221773b = strategyInputType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return this.f221772a == vVar.f221772a && this.f221773b == vVar.f221773b;
    }

    public final int hashCode() {
        return this.f221773b.hashCode() + (this.f221772a.hashCode() * 31);
    }
}
