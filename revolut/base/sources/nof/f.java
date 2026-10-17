package nof;

import kotlin.jvm.internal.Intrinsics;
import tof.i7;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f218031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f218032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f218033c;
    public final String d;
    public final i7 e;

    public f(int i, dj0.d dVar, dj0.d dVar2, String counterpartyName, i7 filter) {
        Intrinsics.checkNotNullParameter(counterpartyName, "counterpartyName");
        Intrinsics.checkNotNullParameter(filter, "filter");
        this.f218031a = i;
        this.f218032b = dVar;
        this.f218033c = dVar2;
        this.d = counterpartyName;
        this.e = filter;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f218031a == fVar.f218031a && Intrinsics.f(this.f218032b, fVar.f218032b) && Intrinsics.f(this.f218033c, fVar.f218033c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f218031a) * 31;
        dj0.d dVar = this.f218032b;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        dj0.d dVar2 = this.f218033c;
        return this.e.hashCode() + p.a.c((iHashCode2 + (dVar2 != null ? dVar2.hashCode() : 0)) * 31, 31, this.d);
    }
}
