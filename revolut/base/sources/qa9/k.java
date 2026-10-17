package qa9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f243986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t89.c f243987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f243988c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f243989g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t89.g f243990h;
    public final boolean i;

    public k(wi0.b countryCode, t89.c creditTerms, boolean z, boolean z3, boolean z4, boolean z6, boolean z11, t89.g gVar) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(creditTerms, "creditTerms");
        this.f243986a = countryCode;
        this.f243987b = creditTerms;
        this.f243988c = z;
        this.d = z3;
        this.e = z4;
        this.f = z6;
        this.f243989g = z11;
        this.f243990h = gVar;
        this.i = creditTerms.f268862a;
    }

    public static k a(k kVar, wi0.b bVar, boolean z, boolean z3, boolean z4, t89.g gVar, int i) {
        if ((i & 1) != 0) {
            bVar = kVar.f243986a;
        }
        wi0.b countryCode = bVar;
        t89.c creditTerms = kVar.f243987b;
        if ((i & 4) != 0) {
            z = kVar.f243988c;
        }
        boolean z6 = z;
        if ((i & 8) != 0) {
            z3 = kVar.d;
        }
        boolean z11 = z3;
        if ((i & 16) != 0) {
            z4 = kVar.e;
        }
        boolean z12 = z4;
        boolean z29 = (i & 32) != 0 ? kVar.f : true;
        boolean z31 = kVar.f243989g;
        if ((i & 128) != 0) {
            gVar = kVar.f243990h;
        }
        kVar.getClass();
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(creditTerms, "creditTerms");
        return new k(countryCode, creditTerms, z6, z11, z12, z29, z31, gVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f243986a, kVar.f243986a) && Intrinsics.f(this.f243987b, kVar.f243987b) && this.f243988c == kVar.f243988c && this.d == kVar.d && this.e == kVar.e && this.f == kVar.f && this.f243989g == kVar.f243989g && this.f243990h == kVar.f243990h;
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c((this.f243987b.hashCode() + (this.f243986a.f297794a.hashCode() * 31)) * 31, 31, this.f243988c), 31, this.d), 31, this.e), 31, this.f), 31, this.f243989g);
        t89.g gVar = this.f243990h;
        return iC + (gVar == null ? 0 : gVar.hashCode());
    }
}
