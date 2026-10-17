package qdk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xck.i f244976a;

    public n0(xck.i reward) {
        Intrinsics.checkNotNullParameter(reward, "reward");
        this.f244976a = reward;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n0) && Intrinsics.f(this.f244976a, ((n0) obj2).f244976a);
    }

    public final int hashCode() {
        return this.f244976a.hashCode();
    }
}
