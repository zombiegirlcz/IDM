package ncl;

import a0.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f214235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f214236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f214237c;

    public a(String portfolioId, long j2, long j3) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        this.f214235a = portfolioId;
        this.f214236b = j2;
        this.f214237c = j3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f214235a, aVar.f214235a) && this.f214236b == aVar.f214236b && this.f214237c == aVar.f214237c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f214237c) + d.c(this.f214235a.hashCode() * 31, 31, this.f214236b);
    }
}
