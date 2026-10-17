package lbf;

import ip0.v7;
import java.time.Period;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f193666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Period f193667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f193668c;
    public final d d;
    public final e e;

    public b(c code, Period period, dj0.d fee2, d dVar, e eVar) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(fee2, "fee");
        this.f193666a = code;
        this.f193667b = period;
        this.f193668c = fee2;
        this.d = dVar;
        this.e = eVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f193666a == bVar.f193666a && Intrinsics.f(this.f193667b, bVar.f193667b) && Intrinsics.f(this.f193668c, bVar.f193668c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e);
    }

    public final int hashCode() {
        int iC = v7.c((this.f193667b.hashCode() + (this.f193666a.hashCode() * 31)) * 31, 31, this.f193668c);
        d dVar = this.d;
        int iHashCode = (iC + (dVar == null ? 0 : dVar.hashCode())) * 31;
        e eVar = this.e;
        return iHashCode + (eVar != null ? eVar.hashCode() : 0);
    }
}
