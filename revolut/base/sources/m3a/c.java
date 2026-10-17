package m3a;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uw1.g;
import vo1.d;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final c f202309p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f202310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f202311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f202312c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f202313g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f202314h;
    public final d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final g f202315j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f202316l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f202317m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f202318n;
    public final boolean o;

    static {
        vo1.a aVar = vo1.b.Companion;
        aVar.getClass();
        aVar.getClass();
        vo1.b bVar = vo1.b.f;
        d dVar = new d(bVar, bVar);
        h0 h0Var = h0.f322473a;
        f202309p = new c(false, false, false, false, false, false, false, false, dVar, new g(h0Var, h0Var), false, false, false, false, false);
    }

    public c(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31, d billsTaxesConfig, g apmConfig, boolean z41, boolean z49, boolean z54, boolean z74, boolean z83) {
        Intrinsics.checkNotNullParameter(billsTaxesConfig, "billsTaxesConfig");
        Intrinsics.checkNotNullParameter(apmConfig, "apmConfig");
        this.f202310a = z;
        this.f202311b = z3;
        this.f202312c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f202313g = z29;
        this.f202314h = z31;
        this.i = billsTaxesConfig;
        this.f202315j = apmConfig;
        this.k = z41;
        this.f202316l = z49;
        this.f202317m = z54;
        this.f202318n = z74;
        this.o = z83;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f202310a == cVar.f202310a && this.f202311b == cVar.f202311b && this.f202312c == cVar.f202312c && this.d == cVar.d && this.e == cVar.e && this.f == cVar.f && this.f202313g == cVar.f202313g && this.f202314h == cVar.f202314h && Intrinsics.f(this.i, cVar.i) && Intrinsics.f(this.f202315j, cVar.f202315j) && this.k == cVar.k && this.f202316l == cVar.f202316l && this.f202317m == cVar.f202317m && this.f202318n == cVar.f202318n && this.o == cVar.o;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.o) + j6.a.c(j6.a.c(j6.a.c(j6.a.c((this.f202315j.hashCode() + ((this.i.hashCode() + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f202310a) * 31, 31, this.f202311b), 31, this.f202312c), 31, this.d), 31, this.e), 31, this.f), 31, this.f202313g), 31, this.f202314h)) * 31)) * 31, 31, this.k), 31, this.f202316l), 31, this.f202317m), 31, this.f202318n);
    }
}
