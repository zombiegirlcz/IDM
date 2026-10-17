package eel;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ej0.b f125220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ej0.b f125221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ej0.b f125222c;
    public final ej0.b d;
    public final long e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f125223g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ej0.b f125224h;
    public final ej0.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ej0.b f125225j;

    public b(ej0.b open, ej0.b close, ej0.b high, ej0.b low, long j2, long j3, long j5, ej0.b startClose, ej0.b endClose, ej0.b bVar) {
        Intrinsics.checkNotNullParameter(open, "open");
        Intrinsics.checkNotNullParameter(close, "close");
        Intrinsics.checkNotNullParameter(high, "high");
        Intrinsics.checkNotNullParameter(low, "low");
        Intrinsics.checkNotNullParameter(startClose, "startClose");
        Intrinsics.checkNotNullParameter(endClose, "endClose");
        this.f125220a = open;
        this.f125221b = close;
        this.f125222c = high;
        this.d = low;
        this.e = j2;
        this.f = j3;
        this.f125223g = j5;
        this.f125224h = startClose;
        this.i = endClose;
        this.f125225j = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f125220a, bVar.f125220a) && Intrinsics.f(this.f125221b, bVar.f125221b) && Intrinsics.f(this.f125222c, bVar.f125222c) && Intrinsics.f(this.d, bVar.d) && this.e == bVar.e && this.f == bVar.f && this.f125223g == bVar.f125223g && Intrinsics.f(this.f125224h, bVar.f125224h) && Intrinsics.f(this.i, bVar.i) && Intrinsics.f(this.f125225j, bVar.f125225j);
    }

    public final int hashCode() {
        int iD = org.bouncycastle.jcajce.provider.digest.a.d(this.i, org.bouncycastle.jcajce.provider.digest.a.d(this.f125224h, a0.d.c(a0.d.c(a0.d.c(org.bouncycastle.jcajce.provider.digest.a.d(this.d, org.bouncycastle.jcajce.provider.digest.a.d(this.f125222c, org.bouncycastle.jcajce.provider.digest.a.d(this.f125221b, this.f125220a.hashCode() * 31, 31), 31), 31), 31, this.e), 31, this.f), 31, this.f125223g), 31), 31);
        ej0.b bVar = this.f125225j;
        return iD + (bVar == null ? 0 : bVar.hashCode());
    }
}
