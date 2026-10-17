package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class l1 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f272904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f272905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f272906c;
    public final xi0.b d;
    public final long e;

    public l1(double d, double d5, xi0.b from, xi0.b to6, long j2) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to6, "to");
        this.f272904a = d;
        this.f272905b = d5;
        this.f272906c = from;
        this.d = to6;
        this.e = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj2;
        return Double.compare(this.f272904a, l1Var.f272904a) == 0 && Double.compare(this.f272905b, l1Var.f272905b) == 0 && Intrinsics.f(this.f272906c, l1Var.f272906c) && Intrinsics.f(this.d, l1Var.d) && this.e == l1Var.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + h30.l.j(this.d, h30.l.j(this.f272906c, m72.b.c(Double.hashCode(this.f272904a) * 31, this.f272905b, 31), 31), 31);
    }
}
