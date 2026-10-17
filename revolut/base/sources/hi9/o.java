package hi9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f152571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f152572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f152573c;
    public final long d;
    public final long e;
    public final long f;

    public o(int i, long j2, long j3, long j5, String transactionId, String planId) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(planId, "planId");
        this.f152571a = transactionId;
        this.f152572b = planId;
        this.f152573c = i;
        this.d = j2;
        this.e = j3;
        this.f = j5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f152571a, oVar.f152571a) && Intrinsics.f(this.f152572b, oVar.f152572b) && this.f152573c == oVar.f152573c && this.d == oVar.d && this.e == oVar.e && this.f == oVar.f;
    }

    public final int hashCode() {
        return Long.hashCode(this.f) + a0.d.c(a0.d.c(j6.a.b(this.f152573c, p.a.c(this.f152571a.hashCode() * 31, 31, this.f152572b), 31), 31, this.d), 31, this.e);
    }
}
