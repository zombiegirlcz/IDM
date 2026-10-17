package s01;

import com.revolut.feature.retail.advanced_charts.models.AdvancedChartSymbol;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f258771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f258772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f258773c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f258774g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f258775h;
    public final Pair i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Pair f258776j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f258777l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f258778m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f258779n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f258780p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AdvancedChartSymbol f258781q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f258782r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f258783s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f258784t;

    public i(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31, Pair pair, Pair pair2, boolean z41, boolean z49, boolean z54, boolean z74, boolean z83, boolean z89, AdvancedChartSymbol advancedChartSymbol, boolean z96, boolean z100, boolean z101) {
        this.f258771a = z;
        this.f258772b = z3;
        this.f258773c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f258774g = z29;
        this.f258775h = z31;
        this.i = pair;
        this.f258776j = pair2;
        this.k = z41;
        this.f258777l = z49;
        this.f258778m = z54;
        this.f258779n = z74;
        this.o = z83;
        this.f258780p = z89;
        this.f258781q = advancedChartSymbol;
        this.f258782r = z96;
        this.f258783s = z100;
        this.f258784t = z101;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f258771a == iVar.f258771a && this.f258772b == iVar.f258772b && this.f258773c == iVar.f258773c && this.d == iVar.d && this.e == iVar.e && this.f == iVar.f && this.f258774g == iVar.f258774g && this.f258775h == iVar.f258775h && Intrinsics.f(this.i, iVar.i) && Intrinsics.f(this.f258776j, iVar.f258776j) && this.k == iVar.k && this.f258777l == iVar.f258777l && this.f258778m == iVar.f258778m && this.f258779n == iVar.f258779n && this.o == iVar.o && this.f258780p == iVar.f258780p && Intrinsics.f(this.f258781q, iVar.f258781q) && this.f258782r == iVar.f258782r && this.f258783s == iVar.f258783s && this.f258784t == iVar.f258784t;
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f258771a) * 31, 31, this.f258772b), 31, this.f258773c), 31, this.d), 31, this.e), 31, this.f), 31, this.f258774g), 31, this.f258775h);
        Pair pair = this.i;
        int iHashCode = (iC + (pair == null ? 0 : pair.hashCode())) * 31;
        Pair pair2 = this.f258776j;
        int iC2 = j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c((iHashCode + (pair2 == null ? 0 : pair2.hashCode())) * 31, 31, this.k), 31, this.f258777l), 31, this.f258778m), 31, this.f258779n), 31, this.o), 31, this.f258780p);
        AdvancedChartSymbol advancedChartSymbol = this.f258781q;
        return Boolean.hashCode(this.f258784t) + j6.a.c(j6.a.c((iC2 + (advancedChartSymbol != null ? advancedChartSymbol.hashCode() : 0)) * 31, 31, this.f258782r), 31, this.f258783s);
    }
}
