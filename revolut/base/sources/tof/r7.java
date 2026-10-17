package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class r7 extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yvh.f f273029a;

    public r7(yvh.f strategy) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        this.f273029a = strategy;
    }

    public final yvh.f a() {
        return this.f273029a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r7) && this.f273029a == ((r7) obj2).f273029a;
    }

    public final int hashCode() {
        return this.f273029a.hashCode();
    }
}
