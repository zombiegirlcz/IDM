package m1h;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f201496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f201497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f201498c;
    public final boolean d;

    public h(xi0.b transferCurrency, xi0.b sourcePocketCurrency, boolean z, int i) {
        boolean z3 = (i & 8) == 0;
        Intrinsics.checkNotNullParameter(transferCurrency, "transferCurrency");
        Intrinsics.checkNotNullParameter(sourcePocketCurrency, "sourcePocketCurrency");
        this.f201496a = transferCurrency;
        this.f201497b = sourcePocketCurrency;
        this.f201498c = z;
        this.d = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f201496a, hVar.f201496a) && Intrinsics.f(this.f201497b, hVar.f201497b) && this.f201498c == hVar.f201498c && this.d == hVar.d;
    }

    public final int hashCode() {
        return j6.a.c(j6.a.c(h30.l.j(this.f201497b, this.f201496a.hashCode() * 31, 31), 31, this.f201498c), 31, this.d);
    }
}
