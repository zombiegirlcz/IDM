package q63;

import h93.f0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f242459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f242460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f242461c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f242462g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f242463h;
    public final j i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f242464j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f242465l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f242466m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f242467n;

    public g(f0 card, boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, a aVar, j jVar, boolean z29, boolean z31, List list, boolean z41, boolean z49) {
        Intrinsics.checkNotNullParameter(card, "card");
        this.f242459a = card;
        this.f242460b = z;
        this.f242461c = z3;
        this.d = z4;
        this.e = z6;
        this.f = z11;
        this.f242462g = z12;
        this.f242463h = aVar;
        this.i = jVar;
        this.f242464j = z29;
        this.k = z31;
        this.f242465l = list;
        this.f242466m = z41;
        this.f242467n = z49;
    }

    public final f0 a() {
        return this.f242459a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f242459a, gVar.f242459a) && this.f242460b == gVar.f242460b && this.f242461c == gVar.f242461c && this.d == gVar.d && this.e == gVar.e && this.f == gVar.f && this.f242462g == gVar.f242462g && this.f242463h == gVar.f242463h && Intrinsics.f(this.i, gVar.i) && this.f242464j == gVar.f242464j && this.k == gVar.k && Intrinsics.f(this.f242465l, gVar.f242465l) && this.f242466m == gVar.f242466m && this.f242467n == gVar.f242467n;
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(this.f242459a.hashCode() * 31, 31, this.f242460b), 31, this.f242461c), 31, this.d), 31, this.e), 31, this.f), 31, this.f242462g);
        a aVar = this.f242463h;
        int iHashCode = (iC + (aVar == null ? 0 : aVar.hashCode())) * 31;
        j jVar = this.i;
        int iC2 = j6.a.c(j6.a.c((iHashCode + (jVar == null ? 0 : jVar.hashCode())) * 31, 31, this.f242464j), 31, this.k);
        List list = this.f242465l;
        return Boolean.hashCode(this.f242467n) + j6.a.c((iC2 + (list != null ? list.hashCode() : 0)) * 31, 31, this.f242466m);
    }
}
