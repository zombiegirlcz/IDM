package ubl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f278941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f278942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f278943c;

    public d(String portfolioId, long j2, long j3) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        this.f278941a = portfolioId;
        this.f278942b = j2;
        this.f278943c = j3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f278941a, dVar.f278941a) && this.f278942b == dVar.f278942b && this.f278943c == dVar.f278943c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f278943c) + a0.d.c(this.f278941a.hashCode() * 31, 31, this.f278942b);
    }
}
