package icl;

import a0.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f160299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f160300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ko3.b f160301c;
    public final ko3.b d;
    public final ko3.b e;
    public final ko3.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f160302g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f160303h;
    public final long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ko3.b f160304j;
    public final ko3.b k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ko3.b f160305l;

    public b(String ref2, String period, ko3.b open, ko3.b close, ko3.b high, ko3.b low, long j2, long j3, long j5, ko3.b startClose, ko3.b endClose, ko3.b bVar) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(open, "open");
        Intrinsics.checkNotNullParameter(close, "close");
        Intrinsics.checkNotNullParameter(high, "high");
        Intrinsics.checkNotNullParameter(low, "low");
        Intrinsics.checkNotNullParameter(startClose, "startClose");
        Intrinsics.checkNotNullParameter(endClose, "endClose");
        this.f160299a = ref2;
        this.f160300b = period;
        this.f160301c = open;
        this.d = close;
        this.e = high;
        this.f = low;
        this.f160302g = j2;
        this.f160303h = j3;
        this.i = j5;
        this.f160304j = startClose;
        this.k = endClose;
        this.f160305l = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f160299a, bVar.f160299a) && Intrinsics.f(this.f160300b, bVar.f160300b) && Intrinsics.f(this.f160301c, bVar.f160301c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f) && this.f160302g == bVar.f160302g && this.f160303h == bVar.f160303h && this.i == bVar.i && Intrinsics.f(this.f160304j, bVar.f160304j) && Intrinsics.f(this.k, bVar.k) && Intrinsics.f(this.f160305l, bVar.f160305l);
    }

    public final int hashCode() {
        int iHashCode = (this.k.hashCode() + ((this.f160304j.hashCode() + d.c(d.c(d.c((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.f160301c.hashCode() + p.a.c(this.f160299a.hashCode() * 31, 31, this.f160300b)) * 31)) * 31)) * 31)) * 31, 31, this.f160302g), 31, this.f160303h), 31, this.i)) * 31)) * 31;
        ko3.b bVar = this.f160305l;
        return iHashCode + (bVar == null ? 0 : bVar.hashCode());
    }
}
