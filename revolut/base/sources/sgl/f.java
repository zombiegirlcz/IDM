package sgl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f262678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f262679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f262680c;
    public final float d;
    public final e e;
    public final e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f262681g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f262682h;

    public f(String symbol, String ref2, e amount, float f, e eVar, e eVar2, e eVar3, String side) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(side, "side");
        this.f262678a = symbol;
        this.f262679b = ref2;
        this.f262680c = amount;
        this.d = f;
        this.e = eVar;
        this.f = eVar2;
        this.f262681g = eVar3;
        this.f262682h = side;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f262678a, fVar.f262678a) && Intrinsics.f(this.f262679b, fVar.f262679b) && Intrinsics.f(this.f262680c, fVar.f262680c) && Float.compare(this.d, fVar.d) == 0 && Intrinsics.f(this.e, fVar.e) && Intrinsics.f(this.f, fVar.f) && Intrinsics.f(this.f262681g, fVar.f262681g) && Intrinsics.f(this.f262682h, fVar.f262682h);
    }

    public final int hashCode() {
        int iB = m72.b.b(this.d, (this.f262680c.hashCode() + p.a.c(this.f262678a.hashCode() * 31, 31, this.f262679b)) * 31, 31);
        e eVar = this.e;
        int iHashCode = (iB + (eVar == null ? 0 : eVar.hashCode())) * 31;
        e eVar2 = this.f;
        int iHashCode2 = (iHashCode + (eVar2 == null ? 0 : eVar2.hashCode())) * 31;
        e eVar3 = this.f262681g;
        return this.f262682h.hashCode() + ((iHashCode2 + (eVar3 != null ? eVar3.hashCode() : 0)) * 31);
    }
}
