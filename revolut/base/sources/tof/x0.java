package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class x0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f273152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f273153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f273154c;
    public final long d;
    public final double e;

    public x0(String facilityId, double d, double d5, long j2, double d6) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        this.f273152a = facilityId;
        this.f273153b = d;
        this.f273154c = d5;
        this.d = j2;
        this.e = d6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj2;
        return Intrinsics.f(this.f273152a, x0Var.f273152a) && Double.compare(this.f273153b, x0Var.f273153b) == 0 && Double.compare(this.f273154c, x0Var.f273154c) == 0 && this.d == x0Var.d && Double.compare(this.e, x0Var.e) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.e) + a0.d.c(m72.b.c(m72.b.c(this.f273152a.hashCode() * 31, this.f273153b, 31), this.f273154c, 31), 31, this.d);
    }
}
