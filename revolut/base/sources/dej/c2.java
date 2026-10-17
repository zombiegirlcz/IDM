package dej;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f113509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f113510b;

    public c2(Long l2, long j2) {
        this.f113509a = j2;
        this.f113510b = l2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c2)) {
            return false;
        }
        c2 c2Var = (c2) obj2;
        return this.f113509a == c2Var.f113509a && Intrinsics.f(this.f113510b, c2Var.f113510b);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f113509a) * 31;
        Long l2 = this.f113510b;
        return iHashCode + (l2 == null ? 0 : l2.hashCode());
    }
}
