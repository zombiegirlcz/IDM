package re2;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f253489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f253490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f253491c;

    public d(dj0.d limit, dj0.d maxLimit, g gVar) {
        Intrinsics.checkNotNullParameter(limit, "limit");
        Intrinsics.checkNotNullParameter(maxLimit, "maxLimit");
        this.f253489a = limit;
        this.f253490b = maxLimit;
        this.f253491c = gVar;
    }

    public static d a(d dVar, dj0.d limit, g gVar, int i) {
        if ((i & 1) != 0) {
            limit = dVar.f253489a;
        }
        dj0.d maxLimit = dVar.f253490b;
        if ((i & 4) != 0) {
            gVar = dVar.f253491c;
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(limit, "limit");
        Intrinsics.checkNotNullParameter(maxLimit, "maxLimit");
        return new d(limit, maxLimit, gVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f253489a, dVar.f253489a) && Intrinsics.f(this.f253490b, dVar.f253490b) && this.f253491c == dVar.f253491c;
    }

    public final int hashCode() {
        int iC = v7.c(this.f253489a.hashCode() * 31, 31, this.f253490b);
        g gVar = this.f253491c;
        return iC + (gVar == null ? 0 : gVar.hashCode());
    }
}
