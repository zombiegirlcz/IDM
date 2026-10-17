package dej;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class n3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f113604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f113605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f113606c;
    public final Long d;
    public final long e;
    public final Long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Instant f113607g;

    public n3(long j2, Long l2, long j3, Long l3, long j5, Long l4, Instant lastUsageDate) {
        Intrinsics.checkNotNullParameter(lastUsageDate, "lastUsageDate");
        this.f113604a = j2;
        this.f113605b = l2;
        this.f113606c = j3;
        this.d = l3;
        this.e = j5;
        this.f = l4;
        this.f113607g = lastUsageDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n3)) {
            return false;
        }
        n3 n3Var = (n3) obj2;
        return this.f113604a == n3Var.f113604a && Intrinsics.f(this.f113605b, n3Var.f113605b) && this.f113606c == n3Var.f113606c && Intrinsics.f(this.d, n3Var.d) && this.e == n3Var.e && Intrinsics.f(this.f, n3Var.f) && Intrinsics.f(this.f113607g, n3Var.f113607g);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f113604a) * 31;
        Long l2 = this.f113605b;
        int iC = a0.d.c((iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.f113606c);
        Long l3 = this.d;
        int iC2 = a0.d.c((iC + (l3 == null ? 0 : l3.hashCode())) * 31, 31, this.e);
        Long l4 = this.f;
        return this.f113607g.hashCode() + ((iC2 + (l4 != null ? l4.hashCode() : 0)) * 31);
    }
}
