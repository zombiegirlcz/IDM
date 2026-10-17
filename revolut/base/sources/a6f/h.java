package a6f;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f1676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f1677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f1678c;
    public final List d;

    public h(List allocations, List sectorAllocations, List regionAllocations, List topHoldingAllocations) {
        Intrinsics.checkNotNullParameter(allocations, "allocations");
        Intrinsics.checkNotNullParameter(sectorAllocations, "sectorAllocations");
        Intrinsics.checkNotNullParameter(regionAllocations, "regionAllocations");
        Intrinsics.checkNotNullParameter(topHoldingAllocations, "topHoldingAllocations");
        this.f1676a = allocations;
        this.f1677b = sectorAllocations;
        this.f1678c = regionAllocations;
        this.d = topHoldingAllocations;
    }

    @Override // a6f.i
    public final List a() {
        return this.f1676a;
    }

    @Override // a6f.i
    public final List b() {
        return this.f1678c;
    }

    @Override // a6f.i
    public final List c() {
        return this.f1677b;
    }

    @Override // a6f.i
    public final List d() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f1676a, hVar.f1676a) && Intrinsics.f(this.f1677b, hVar.f1677b) && Intrinsics.f(this.f1678c, hVar.f1678c) && Intrinsics.f(this.d, hVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.d(p.a.d(this.f1676a.hashCode() * 31, 31, this.f1677b), 31, this.f1678c);
    }
}
