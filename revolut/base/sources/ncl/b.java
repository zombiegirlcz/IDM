package ncl;

import a0.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f214238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f214239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f214240c;

    public b(String portfolioId, long j2, long j3) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        this.f214238a = portfolioId;
        this.f214239b = j2;
        this.f214240c = j3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f214238a, bVar.f214238a) && this.f214239b == bVar.f214239b && this.f214240c == bVar.f214240c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f214240c) + d.c(this.f214238a.hashCode() * 31, 31, this.f214239b);
    }
}
