package wxe;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class q implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f300912a;

    public q(String institutionId) {
        Intrinsics.checkNotNullParameter(institutionId, "institutionId");
        this.f300912a = institutionId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f300912a, ((q) obj2).f300912a);
    }

    public final int hashCode() {
        return this.f300912a.hashCode();
    }
}
