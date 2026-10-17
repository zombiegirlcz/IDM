package n3f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f212002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f212003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jo3.b f212004c;
    public final float d;
    public final jo3.b e;
    public final jo3.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jo3.b f212005g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f212006h;

    public a0(String symbol, String ref2, jo3.b amount, float f, jo3.b bVar, jo3.b bVar2, jo3.b bVar3, String side) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(side, "side");
        this.f212002a = symbol;
        this.f212003b = ref2;
        this.f212004c = amount;
        this.d = f;
        this.e = bVar;
        this.f = bVar2;
        this.f212005g = bVar3;
        this.f212006h = side;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f212002a, a0Var.f212002a) && Intrinsics.f(this.f212003b, a0Var.f212003b) && Intrinsics.f(this.f212004c, a0Var.f212004c) && Float.compare(this.d, a0Var.d) == 0 && Intrinsics.f(this.e, a0Var.e) && Intrinsics.f(this.f, a0Var.f) && Intrinsics.f(this.f212005g, a0Var.f212005g) && Intrinsics.f(this.f212006h, a0Var.f212006h);
    }

    public final int hashCode() {
        int iB = m72.b.b(this.d, wp5.y.e(this.f212004c, p.a.c(this.f212002a.hashCode() * 31, 31, this.f212003b), 31), 31);
        jo3.b bVar = this.e;
        int iHashCode = (iB + (bVar == null ? 0 : bVar.hashCode())) * 31;
        jo3.b bVar2 = this.f;
        int iHashCode2 = (iHashCode + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        jo3.b bVar3 = this.f212005g;
        return this.f212006h.hashCode() + ((iHashCode2 + (bVar3 != null ? bVar3.hashCode() : 0)) * 31);
    }
}
