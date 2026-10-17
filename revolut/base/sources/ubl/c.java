package ubl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f278938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f278939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f278940c;

    public c(String portfolioId, long j2, long j3) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        this.f278938a = portfolioId;
        this.f278939b = j2;
        this.f278940c = j3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f278938a, cVar.f278938a) && this.f278939b == cVar.f278939b && this.f278940c == cVar.f278940c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f278940c) + a0.d.c(this.f278938a.hashCode() * 31, 31, this.f278939b);
    }
}
