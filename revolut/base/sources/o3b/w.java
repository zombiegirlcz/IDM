package o3b;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k4l.n0 f221774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f221775b;

    public w(k4l.n0 strategyType, s strategyState) {
        Intrinsics.checkNotNullParameter(strategyType, "strategyType");
        Intrinsics.checkNotNullParameter(strategyState, "strategyState");
        this.f221774a = strategyType;
        this.f221775b = strategyState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return this.f221774a == wVar.f221774a && Intrinsics.f(this.f221775b, wVar.f221775b);
    }

    public final int hashCode() {
        return this.f221775b.hashCode() + (this.f221774a.hashCode() * 31);
    }
}
