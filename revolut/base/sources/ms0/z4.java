package ms0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class z4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f208504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f208505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y4 f208506c;
    public final x4 d;
    public final Long e;

    public z4(long j2, long j3, y4 timerSize, x4 timeFormat, Long l2) {
        Intrinsics.checkNotNullParameter(timerSize, "timerSize");
        Intrinsics.checkNotNullParameter(timeFormat, "timeFormat");
        this.f208504a = j2;
        this.f208505b = j3;
        this.f208506c = timerSize;
        this.d = timeFormat;
        this.e = l2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z4)) {
            return false;
        }
        z4 z4Var = (z4) obj2;
        return this.f208504a == z4Var.f208504a && this.f208505b == z4Var.f208505b && this.f208506c == z4Var.f208506c && this.d == z4Var.d && Intrinsics.f(this.e, z4Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.f208506c.hashCode() + a0.d.c(Long.hashCode(this.f208504a) * 31, 31, this.f208505b)) * 31)) * 31;
        Long l2 = this.e;
        return iHashCode + (l2 == null ? 0 : l2.hashCode());
    }

    public /* synthetic */ z4(long j2, long j3) {
        this(j2, j3, y4.LARGE, x4.MINUTES, null);
    }
}
