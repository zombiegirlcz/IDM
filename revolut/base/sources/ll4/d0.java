package ll4;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f196511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f196512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f196513c;
    public final long d;
    public final z e;

    public d0(long j2, long j3, long j5, long j16, z interest) {
        Intrinsics.checkNotNullParameter(interest, "interest");
        this.f196511a = j2;
        this.f196512b = j3;
        this.f196513c = j5;
        this.d = j16;
        this.e = interest;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return this.f196511a == d0Var.f196511a && this.f196512b == d0Var.f196512b && this.f196513c == d0Var.f196513c && this.d == d0Var.d && Intrinsics.f(this.e, d0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + a0.d.c(a0.d.c(a0.d.c(Long.hashCode(this.f196511a) * 31, 31, this.f196512b), 31, this.f196513c), 31, this.d);
    }
}
