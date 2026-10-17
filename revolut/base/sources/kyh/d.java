package kyh;

import h30.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f190900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f190901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f190902c;
    public final boolean d;

    public d(f fVar, xi0.b topCurrency, long j2, boolean z) {
        Intrinsics.checkNotNullParameter(topCurrency, "topCurrency");
        this.f190900a = fVar;
        this.f190901b = topCurrency;
        this.f190902c = j2;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f190900a == dVar.f190900a && Intrinsics.f(this.f190901b, dVar.f190901b) && this.f190902c == dVar.f190902c && this.d == dVar.d;
    }

    public final int hashCode() {
        f fVar = this.f190900a;
        return Boolean.hashCode(this.d) + a0.d.c(l.j(this.f190901b, (fVar == null ? 0 : fVar.hashCode()) * 31, 31), 31, this.f190902c);
    }
}
