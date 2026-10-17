package dej;

import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;

/* JADX INFO: loaded from: classes11.dex */
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z2 f113496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f113497c;
    public final long d;

    public b1(String simPhoneId, z2 simPhoneState, long j2, long j3) {
        Intrinsics.checkNotNullParameter(simPhoneId, "simPhoneId");
        Intrinsics.checkNotNullParameter(simPhoneState, "simPhoneState");
        this.f113495a = simPhoneId;
        this.f113496b = simPhoneState;
        this.f113497c = j2;
        this.d = j3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj2;
        return Intrinsics.f(this.f113495a, b1Var.f113495a) && this.f113496b == b1Var.f113496b && kotlin.time.b.d(this.f113497c, b1Var.f113497c) && kotlin.time.b.d(this.d, b1Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f113496b.hashCode() + (this.f113495a.hashCode() * 31)) * 31;
        b.Companion companion = kotlin.time.b.INSTANCE;
        return Long.hashCode(this.d) + a0.d.c(iHashCode, 31, this.f113497c);
    }
}
