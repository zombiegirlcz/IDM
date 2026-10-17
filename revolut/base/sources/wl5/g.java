package wl5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f298414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f298415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f298416c;
    public final xi0.b d;
    public final xi0.b e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final yl5.a f298417g;

    public g() {
        this(0);
    }

    public static g a(g gVar, Integer num, Integer num2, xi0.b bVar, xi0.b bVar2, xi0.b bVar3, boolean z, yl5.a aVar, int i) {
        if ((i & 1) != 0) {
            num = gVar.f298414a;
        }
        Integer num3 = num;
        if ((i & 2) != 0) {
            num2 = gVar.f298415b;
        }
        Integer num4 = num2;
        if ((i & 4) != 0) {
            bVar = gVar.f298416c;
        }
        xi0.b bVar4 = bVar;
        if ((i & 8) != 0) {
            bVar2 = gVar.d;
        }
        xi0.b initialCryptoCurrency = bVar2;
        if ((i & 16) != 0) {
            bVar3 = gVar.e;
        }
        xi0.b bVar5 = bVar3;
        if ((i & 32) != 0) {
            z = gVar.f;
        }
        boolean z3 = z;
        if ((i & 64) != 0) {
            aVar = gVar.f298417g;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(initialCryptoCurrency, "initialCryptoCurrency");
        return new g(num3, num4, bVar4, initialCryptoCurrency, bVar5, z3, aVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f298414a, gVar.f298414a) && Intrinsics.f(this.f298415b, gVar.f298415b) && Intrinsics.f(this.f298416c, gVar.f298416c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e) && this.f == gVar.f && this.f298417g == gVar.f298417g;
    }

    public final int hashCode() {
        Integer num = this.f298414a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f298415b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        xi0.b bVar = this.f298416c;
        int iJ = h30.l.j(this.d, (iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31, 31);
        xi0.b bVar2 = this.e;
        int iC = j6.a.c((iJ + (bVar2 == null ? 0 : bVar2.hashCode())) * 31, 31, this.f);
        yl5.a aVar = this.f298417g;
        return iC + (aVar != null ? aVar.hashCode() : 0);
    }

    public g(Integer num, Integer num2, xi0.b bVar, xi0.b initialCryptoCurrency, xi0.b bVar2, boolean z, yl5.a aVar) {
        Intrinsics.checkNotNullParameter(initialCryptoCurrency, "initialCryptoCurrency");
        this.f298414a = num;
        this.f298415b = num2;
        this.f298416c = bVar;
        this.d = initialCryptoCurrency;
        this.e = bVar2;
        this.f = z;
        this.f298417g = aVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i) {
        this(null, null, null, xi0.a.a("BTC"), null, true, null);
        xi0.b.Companion.getClass();
    }
}
