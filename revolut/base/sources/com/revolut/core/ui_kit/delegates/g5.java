package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.DatePickerDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class g5 implements koi.j, o31.c, qv0.i, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f54185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f54186c;
    public final boolean d;
    public final boolean e;
    public final DatePickerDelegate.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LocalDate f54187g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LocalDate f54188h;
    public final Map i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f54189j;
    public final List k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f54190l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f54191m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f54192n;
    public qv0.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f54193p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f54194q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f54195r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f54196s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public p31.c f54197t;
    public p31.c u;
    public p31.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public p31.c f54198w;

    public g5(String listId, LocalDate presentedMonth, LocalDate localDate, boolean z, f5 f5Var, LocalDate localDate2, LocalDate localDate3, Map map, List list, Object obj2, int i, int i2, int i3) {
        boolean z3 = (i3 & 8) != 0 ? false : z;
        f5 f5Var2 = (i3 & 32) != 0 ? null : f5Var;
        LocalDate localDate4 = (i3 & 64) != 0 ? null : localDate2;
        LocalDate localDate5 = (i3 & 128) != 0 ? null : localDate3;
        Map dots = (i3 & 256) != 0 ? zhm.r0.g() : map;
        boolean z4 = (i3 & 512) == 0;
        List filters = (i3 & 1024) != 0 ? zhm.f0.f322471a : list;
        String str = (i3 & 8192) != 0 ? null : "CalendarPickerHeader.leftChevronButton";
        String str2 = (i3 & 16384) != 0 ? null : "CalendarPickerHeader.rightChevronButton";
        Object obj3 = (32768 & i3) != 0 ? null : obj2;
        int i5 = (i3 & 65536) != 0 ? R$attr.uikit_dp8 : i;
        int i6 = (i3 & 131072) != 0 ? R$attr.uikit_dp0 : i2;
        int i21 = R$attr.uikit_dp16;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(presentedMonth, "presentedMonth");
        int i22 = i5;
        Intrinsics.checkNotNullParameter(dots, "dots");
        Intrinsics.checkNotNullParameter(filters, "filters");
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(presentedMonth, "presentedMonth");
        Intrinsics.checkNotNullParameter(dots, "dots");
        Intrinsics.checkNotNullParameter(filters, "filters");
        c.d positionInBox = c.d.f249513a;
        Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
        this.f54184a = listId;
        this.f54185b = presentedMonth;
        this.f54186c = localDate;
        this.d = z3;
        this.e = true;
        this.f = f5Var2;
        this.f54187g = localDate4;
        this.f54188h = localDate5;
        this.i = dots;
        this.f54189j = z4;
        this.k = filters;
        this.f54190l = str;
        this.f54191m = str2;
        this.f54192n = obj3;
        this.o = positionInBox;
        this.f54193p = i22;
        this.f54194q = i6;
        this.f54195r = i21;
        this.f54196s = i21;
        this.f54197t = null;
        this.u = null;
        this.v = null;
        this.f54198w = null;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new DatePickerDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF() {
        return this.f54192n;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF51809a() {
        return this.f54184a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g5)) {
            return false;
        }
        g5 g5Var = (g5) obj2;
        return Intrinsics.f(this.f54184a, g5Var.f54184a) && Intrinsics.f(this.f54185b, g5Var.f54185b) && Intrinsics.f(this.f54186c, g5Var.f54186c) && this.d == g5Var.d && this.e == g5Var.e && Intrinsics.f(this.f, g5Var.f) && Intrinsics.f(this.f54187g, g5Var.f54187g) && Intrinsics.f(this.f54188h, g5Var.f54188h) && Intrinsics.f(this.i, g5Var.i) && this.f54189j == g5Var.f54189j && Intrinsics.f(this.k, g5Var.k) && Intrinsics.f(this.f54190l, g5Var.f54190l) && Intrinsics.f(this.f54191m, g5Var.f54191m) && Intrinsics.f(this.f54192n, g5Var.f54192n) && Intrinsics.f(this.o, g5Var.o) && this.f54193p == g5Var.f54193p && this.f54194q == g5Var.f54194q && this.f54195r == g5Var.f54195r && this.f54196s == g5Var.f54196s && Intrinsics.f(this.f54197t, g5Var.f54197t) && Intrinsics.f(this.u, g5Var.u) && Intrinsics.f(this.v, g5Var.v) && Intrinsics.f(this.f54198w, g5Var.f54198w);
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF51816m() {
        return this.f54193p;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f54193p = i;
    }

    public final int hashCode() {
        int iA = wp5.y.a(this.f54184a.hashCode() * 31, 31, this.f54185b);
        LocalDate localDate = this.f54186c;
        int iC = j6.a.c(j6.a.c((iA + (localDate == null ? 0 : localDate.hashCode())) * 31, 31, this.d), 31, this.e);
        DatePickerDelegate.b bVar = this.f;
        int iHashCode = (iC + (bVar == null ? 0 : bVar.hashCode())) * 31;
        LocalDate localDate2 = this.f54187g;
        int iHashCode2 = (iHashCode + (localDate2 == null ? 0 : localDate2.hashCode())) * 31;
        LocalDate localDate3 = this.f54188h;
        int iD = p.a.d(j6.a.c(p.a.e((iHashCode2 + (localDate3 == null ? 0 : localDate3.hashCode())) * 31, 31, this.i), 31, this.f54189j), 29791, this.k);
        String str = this.f54190l;
        int iHashCode3 = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f54191m;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Object obj2 = this.f54192n;
        int iB = j6.a.b(this.f54196s, j6.a.b(this.f54195r, j6.a.b(this.f54194q, j6.a.b(this.f54193p, h30.l.i(this.o, (iHashCode4 + (obj2 == null ? 0 : obj2.hashCode())) * 31, 31), 31), 31), 31), 31);
        p31.c cVar = this.f54197t;
        int iHashCode5 = (iB + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.u;
        int iHashCode6 = (iHashCode5 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.v;
        int iHashCode7 = (iHashCode6 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f54198w;
        return iHashCode7 + (cVar4 != null ? cVar4.hashCode() : 0);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getI() {
        return this.f54198w;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.o = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF51814j() {
        return this.f54197t;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.u = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF51817n() {
        return this.f54194q;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF51818p() {
        return this.f54196s;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f54194q = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF51812g() {
        return this.o;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF51815l() {
        return this.v;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getK() {
        return this.u;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f54198w = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getO() {
        return this.f54195r;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f54197t = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.v = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        boolean z;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof g5 ? (g5) oldItem : null) == null) {
            return null;
        }
        g5 g5Var = (g5) oldItem;
        boolean z3 = !Intrinsics.f(g5Var.f54185b, this.f54185b);
        boolean z4 = !Intrinsics.f(g5Var.f54186c, this.f54186c);
        boolean z6 = false;
        boolean z11 = g5Var.d != this.d;
        if (g5Var.e != this.e) {
            z = false;
            z6 = true;
        } else {
            z = false;
        }
        return new ip0.xd(z3, z4, z11, z6, !Intrinsics.f(g5Var.f, this.f), !Intrinsics.f(g5Var.f54187g, this.f54187g), !Intrinsics.f(g5Var.f54188h, this.f54188h), !Intrinsics.f(g5Var.i, this.i), g5Var.f54189j != this.f54189j ? true : z, !Intrinsics.f(g5Var.k, this.k), !true, !true, !Intrinsics.f(g5Var.f54190l, this.f54190l), !Intrinsics.f(g5Var.f54191m, this.f54191m), !Intrinsics.f(g5Var.o, this.o));
    }
}
