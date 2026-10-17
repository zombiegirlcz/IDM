package vdh;

import dj0.d;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f287930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f287931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f287932c;
    public final List d;
    public final d e;

    public b(ArrayList allocations, List sectorAllocations, List regionAllocations, List topHoldingAllocations, d dVar) {
        Intrinsics.checkNotNullParameter(allocations, "allocations");
        Intrinsics.checkNotNullParameter(sectorAllocations, "sectorAllocations");
        Intrinsics.checkNotNullParameter(regionAllocations, "regionAllocations");
        Intrinsics.checkNotNullParameter(topHoldingAllocations, "topHoldingAllocations");
        this.f287930a = allocations;
        this.f287931b = sectorAllocations;
        this.f287932c = regionAllocations;
        this.d = topHoldingAllocations;
        this.e = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f287930a.equals(bVar.f287930a) && Intrinsics.f(this.f287931b, bVar.f287931b) && Intrinsics.f(this.f287932c, bVar.f287932c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e);
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.d(p.a.d(this.f287930a.hashCode() * 31, 31, this.f287931b), 31, this.f287932c), 31, this.d);
        d dVar = this.e;
        return iD + (dVar == null ? 0 : dVar.hashCode());
    }
}
