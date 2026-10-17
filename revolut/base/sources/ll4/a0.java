package ll4;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f196502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f196503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f196504c;
    public final String d;
    public final long e;
    public final long f;

    public a0(double d, long j2, long j3, String str) {
        this.f196502a = d;
        this.f196503b = j2;
        this.f196504c = j3;
        this.d = str;
        this.e = oi0.d.f(oi0.d.d0(j2), oi0.d.d0(j3));
        LocalDateTime localDateTimeD0 = oi0.d.d0(j2);
        LocalDateTime other = oi0.d.d0(j3);
        Intrinsics.checkNotNullParameter(localDateTimeD0, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        this.f = ChronoUnit.MONTHS.between(localDateTimeD0, other);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Double.compare(this.f196502a, a0Var.f196502a) == 0 && this.f196503b == a0Var.f196503b && this.f196504c == a0Var.f196504c && Intrinsics.f(this.d, a0Var.d);
    }

    public final int hashCode() {
        int iC = a0.d.c(a0.d.c(Double.hashCode(this.f196502a) * 31, 31, this.f196503b), 31, this.f196504c);
        String str = this.d;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
