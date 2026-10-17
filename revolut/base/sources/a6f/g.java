package a6f;

import alc.n;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f1673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f1674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f1675c;
    public final List d;
    public final n e;

    public g(List allocations, List sectorAllocations, List regionAllocations, List topHoldingAllocations, n portfolio) {
        Intrinsics.checkNotNullParameter(allocations, "allocations");
        Intrinsics.checkNotNullParameter(sectorAllocations, "sectorAllocations");
        Intrinsics.checkNotNullParameter(regionAllocations, "regionAllocations");
        Intrinsics.checkNotNullParameter(topHoldingAllocations, "topHoldingAllocations");
        Intrinsics.checkNotNullParameter(portfolio, "portfolio");
        this.f1673a = allocations;
        this.f1674b = sectorAllocations;
        this.f1675c = regionAllocations;
        this.d = topHoldingAllocations;
        this.e = portfolio;
    }

    @Override // a6f.i
    public final List a() {
        return this.f1673a;
    }

    @Override // a6f.i
    public final List b() {
        return this.f1675c;
    }

    @Override // a6f.i
    public final List c() {
        return this.f1674b;
    }

    @Override // a6f.i
    public final List d() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f1673a, gVar.f1673a) && Intrinsics.f(this.f1674b, gVar.f1674b) && Intrinsics.f(this.f1675c, gVar.f1675c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.d(p.a.d(p.a.d(this.f1673a.hashCode() * 31, 31, this.f1674b), 31, this.f1675c), 31, this.d);
    }
}
