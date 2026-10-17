package lo;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class g {

    @NotNull
    private static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f197319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f197320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f197321c;
    public final Long d;
    public final Integer e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Instant f197322g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f197323h;

    public g(long j2, long j3, Long l2, Long l3, Integer num, long j5, Instant updatedAt) {
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        this.f197319a = j2;
        this.f197320b = j3;
        this.f197321c = l2;
        this.d = l3;
        this.e = num;
        this.f = j5;
        this.f197322g = updatedAt;
        this.f197323h = (int) ((j2 * 100) / j3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f197319a == gVar.f197319a && this.f197320b == gVar.f197320b && Intrinsics.f(this.f197321c, gVar.f197321c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e) && this.f == gVar.f && Intrinsics.f(this.f197322g, gVar.f197322g);
    }

    public final int hashCode() {
        int iC = a0.d.c(Long.hashCode(this.f197319a) * 31, 31, this.f197320b);
        Long l2 = this.f197321c;
        int iHashCode = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.d;
        int iHashCode2 = (iHashCode + (l3 == null ? 0 : l3.hashCode())) * 31;
        Integer num = this.e;
        return this.f197322g.hashCode() + a0.d.c((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31, 31, this.f);
    }
}
