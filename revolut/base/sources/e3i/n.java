package e3i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class n extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g3i.a f122305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f122306b;

    public n(g3i.a limitType, long j2) {
        Intrinsics.checkNotNullParameter(limitType, "limitType");
        this.f122305a = limitType;
        this.f122306b = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f122305a == nVar.f122305a && this.f122306b == nVar.f122306b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f122306b) + (this.f122305a.hashCode() * 31);
    }
}
