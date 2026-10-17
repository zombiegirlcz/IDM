package zh9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f322259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f322260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f322261c;
    public final long d;
    public final long e;
    public final long f;

    public d1(int i, long j2, long j3, long j5, String transactionId, String planId) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(planId, "planId");
        this.f322259a = transactionId;
        this.f322260b = planId;
        this.f322261c = i;
        this.d = j2;
        this.e = j3;
        this.f = j5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj2;
        return Intrinsics.f(this.f322259a, d1Var.f322259a) && Intrinsics.f(this.f322260b, d1Var.f322260b) && this.f322261c == d1Var.f322261c && this.d == d1Var.d && this.e == d1Var.e && this.f == d1Var.f;
    }

    public final int hashCode() {
        return Long.hashCode(this.f) + a0.d.c(a0.d.c(j6.a.b(this.f322261c, p.a.c(this.f322259a.hashCode() * 31, 31, this.f322260b), 31), 31, this.d), 31, this.e);
    }
}
