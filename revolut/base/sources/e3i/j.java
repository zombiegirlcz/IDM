package e3i;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f122298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f122299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g3i.a f122300c;
    public final long d;
    public final xi0.b e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f122301g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k f122302h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f122303j;
    public final xi0.b k;

    public j(long j2, BigDecimal percentage, g3i.a tpslType, long j3, xi0.b currency, int i, l inputType, k kVar, boolean z, boolean z3, xi0.b referencedCurrency) {
        Intrinsics.checkNotNullParameter(percentage, "percentage");
        Intrinsics.checkNotNullParameter(tpslType, "tpslType");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(inputType, "inputType");
        Intrinsics.checkNotNullParameter(referencedCurrency, "referencedCurrency");
        this.f122298a = j2;
        this.f122299b = percentage;
        this.f122300c = tpslType;
        this.d = j3;
        this.e = currency;
        this.f = i;
        this.f122301g = inputType;
        this.f122302h = kVar;
        this.i = z;
        this.f122303j = z3;
        this.k = referencedCurrency;
    }

    public static j a(j jVar, long j2, BigDecimal bigDecimal, l lVar, k kVar, boolean z, boolean z3, int i) {
        long j3 = (i & 1) != 0 ? jVar.f122298a : j2;
        BigDecimal percentage = (i & 2) != 0 ? jVar.f122299b : bigDecimal;
        g3i.a tpslType = jVar.f122300c;
        long j5 = jVar.d;
        xi0.b currency = jVar.e;
        int i2 = jVar.f;
        l inputType = (i & 64) != 0 ? jVar.f122301g : lVar;
        k kVar2 = (i & 128) != 0 ? jVar.f122302h : kVar;
        boolean z4 = (i & 256) != 0 ? jVar.i : z;
        boolean z6 = (i & 512) != 0 ? jVar.f122303j : z3;
        xi0.b referencedCurrency = jVar.k;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(percentage, "percentage");
        Intrinsics.checkNotNullParameter(tpslType, "tpslType");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(inputType, "inputType");
        Intrinsics.checkNotNullParameter(referencedCurrency, "referencedCurrency");
        return new j(j3, percentage, tpslType, j5, currency, i2, inputType, kVar2, z4, z6, referencedCurrency);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f122298a == jVar.f122298a && Intrinsics.f(this.f122299b, jVar.f122299b) && this.f122300c == jVar.f122300c && this.d == jVar.d && Intrinsics.f(this.e, jVar.e) && this.f == jVar.f && this.f122301g == jVar.f122301g && this.f122302h == jVar.f122302h && this.i == jVar.i && this.f122303j == jVar.f122303j && Intrinsics.f(this.k, jVar.k);
    }

    public final int hashCode() {
        int iHashCode = (this.f122301g.hashCode() + j6.a.b(this.f, h30.l.j(this.e, a0.d.c((this.f122300c.hashCode() + t61.a.d(this.f122299b, Long.hashCode(this.f122298a) * 31, 31)) * 31, 31, this.d), 31), 31)) * 31;
        k kVar = this.f122302h;
        return this.k.hashCode() + j6.a.c(j6.a.c((iHashCode + (kVar == null ? 0 : kVar.hashCode())) * 31, 31, this.i), 31, this.f122303j);
    }
}
