package hfg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f151859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f151860b;

    public k0(String pollingId, long j2) {
        Intrinsics.checkNotNullParameter(pollingId, "pollingId");
        this.f151859a = pollingId;
        this.f151860b = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj2;
        return Intrinsics.f(this.f151859a, k0Var.f151859a) && this.f151860b == k0Var.f151860b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f151860b) + (this.f151859a.hashCode() * 31);
    }
}
