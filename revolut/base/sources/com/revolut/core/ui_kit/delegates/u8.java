package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.ListingTileDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.media.Media;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.gv;
import ip0.hv;
import ip0.iv;
import ip0.jv;
import ip0.kv;
import ip0.mv;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class u8 implements qv0.q, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f54808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f54809c;
    public final Clause d;
    public final Media e;
    public final mv f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ListingTileDelegate.b f54810g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final gv f54811h;
    public final iv i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final aw0.v1 f54812j;
    public final jv k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f54813l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f54814m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f54815n;
    public final List o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f54816p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f54817q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f54818r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f54819s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f54820t;
    public p31.c u;
    public p31.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public p31.c f54821w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public p31.c f54822x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public qv0.c f54823y;

    public u8(String listId, Clause title, Clause clause, Clause clause2, Media backgroundMedia, kv kvVar, v8 v8Var, gv gvVar, aw0.v1 v1Var, jv jvVar, boolean z, boolean z3, boolean z4, Object obj2, int i) {
        Clause clause3 = (i & 8) != 0 ? null : clause2;
        kv kvVar2 = (i & 32) != 0 ? null : kvVar;
        v8 v8Var2 = (i & 64) != 0 ? null : v8Var;
        gv backgroundOverlay = (i & 128) != 0 ? gv.BOTTOM_TO_TOP : gvVar;
        iv textWidthLimit = iv.MATCH_PARENT;
        aw0.v1 colorScheme = (i & 512) != 0 ? aw0.v1.LIGHT : v1Var;
        jv titleStyle = (i & 1024) != 0 ? jv.DEFAULT : jvVar;
        boolean z6 = (i & 2048) != 0 ? true : z;
        boolean z11 = (i & 4096) != 0 ? false : z3;
        boolean z12 = (i & 8192) != 0 ? false : z4;
        zhm.f0 bottomRightImages = zhm.f0.f322471a;
        Object obj3 = (i & 65536) != 0 ? null : obj2;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(backgroundMedia, "backgroundMedia");
        Intrinsics.checkNotNullParameter(backgroundOverlay, "backgroundOverlay");
        Intrinsics.checkNotNullParameter(textWidthLimit, "textWidthLimit");
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        Intrinsics.checkNotNullParameter(titleStyle, "titleStyle");
        Intrinsics.checkNotNullParameter(bottomRightImages, "bottomRightImages");
        int i2 = R$attr.uikit_dp0;
        this.f54807a = listId;
        this.f54808b = title;
        this.f54809c = clause;
        this.d = clause3;
        this.e = backgroundMedia;
        this.f = kvVar2;
        this.f54810g = v8Var2;
        this.f54811h = backgroundOverlay;
        this.i = textWidthLimit;
        this.f54812j = colorScheme;
        this.k = titleStyle;
        this.f54813l = z6;
        this.f54814m = z11;
        this.f54815n = z12;
        this.o = bottomRightImages;
        this.f54816p = obj3;
        this.f54817q = i2;
        this.f54818r = i2;
        this.f54819s = i2;
        this.f54820t = i2;
        this.u = null;
        this.v = null;
        this.f54821w = null;
        this.f54822x = null;
        this.f54823y = c.d.f249513a;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new ListingTileDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF53623w() {
        return this.f54816p;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53609a() {
        return this.f54807a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u8)) {
            return false;
        }
        u8 u8Var = (u8) obj2;
        return Intrinsics.f(this.f54807a, u8Var.f54807a) && Intrinsics.f(this.f54808b, u8Var.f54808b) && Intrinsics.f(this.f54809c, u8Var.f54809c) && Intrinsics.f(this.d, u8Var.d) && Intrinsics.f(this.e, u8Var.e) && Intrinsics.f(this.f, u8Var.f) && Intrinsics.f(this.f54810g, u8Var.f54810g) && this.f54811h == u8Var.f54811h && this.i == u8Var.i && this.f54812j == u8Var.f54812j && this.k == u8Var.k && this.f54813l == u8Var.f54813l && this.f54814m == u8Var.f54814m && this.f54815n == u8Var.f54815n && Intrinsics.f(this.o, u8Var.o) && Intrinsics.f(this.f54816p, u8Var.f54816p) && this.f54817q == u8Var.f54817q && this.f54818r == u8Var.f54818r && this.f54819s == u8Var.f54819s && this.f54820t == u8Var.f54820t && Intrinsics.f(this.u, u8Var.u) && Intrinsics.f(this.v, u8Var.v) && Intrinsics.f(this.f54821w, u8Var.f54821w) && Intrinsics.f(this.f54822x, u8Var.f54822x) && Intrinsics.f(this.f54823y, u8Var.f54823y);
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF53621s() {
        return this.f54817q;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f54817q = i;
    }

    public final int hashCode() {
        int iB = p.a.b(this.f54807a.hashCode() * 31, 31, this.f54808b);
        Clause clause = this.f54809c;
        int iHashCode = (iB + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.d;
        int iHashCode2 = (this.e.hashCode() + ((iHashCode + (clause2 == null ? 0 : clause2.hashCode())) * 31)) * 31;
        mv mvVar = this.f;
        int iHashCode3 = (iHashCode2 + (mvVar == null ? 0 : ((kv) mvVar).f165088a.hashCode())) * 31;
        ListingTileDelegate.b bVar = this.f54810g;
        int iD = p.a.d(j6.a.c(j6.a.c(j6.a.c((this.k.hashCode() + ((this.f54812j.hashCode() + ((this.i.hashCode() + ((this.f54811h.hashCode() + ((iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.f54813l), 31, this.f54814m), 961, this.f54815n), 31, this.o);
        Object obj2 = this.f54816p;
        int iB2 = j6.a.b(this.f54820t, j6.a.b(this.f54819s, j6.a.b(this.f54818r, j6.a.b(this.f54817q, (iD + (obj2 == null ? 0 : obj2.hashCode())) * 31, 31), 31), 31), 31);
        p31.c cVar = this.u;
        int iHashCode4 = (iB2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.v;
        int iHashCode5 = (iHashCode4 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f54821w;
        int iHashCode6 = (iHashCode5 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f54822x;
        return this.f54823y.hashCode() + ((iHashCode6 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF53624x() {
        return this.u;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f54823y = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF53625y() {
        return this.v;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f54821w = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF53622t() {
        return this.f54818r;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getV() {
        return this.f54820t;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f54818r = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getB() {
        return this.f54823y;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getA() {
        return this.f54822x;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getZ() {
        return this.f54821w;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.u = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getU() {
        return this.f54819s;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.v = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f54822x = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof u8 ? (u8) oldItem : null) == null) {
            return null;
        }
        u8 u8Var = (u8) oldItem;
        return new hv(!Intrinsics.f(u8Var.f54808b, this.f54808b), !Intrinsics.f(u8Var.f54809c, this.f54809c), !Intrinsics.f(u8Var.d, this.d), !Intrinsics.f(u8Var.e, this.e), !Intrinsics.f(u8Var.f, this.f), !Intrinsics.f(u8Var.f54810g, this.f54810g), (Intrinsics.f(u8Var.u, this.u) && Intrinsics.f(u8Var.v, this.v) && Intrinsics.f(u8Var.f54821w, this.f54821w) && Intrinsics.f(u8Var.f54822x, this.f54822x)) ? false : true, u8Var.f54811h != this.f54811h, u8Var.i != this.i, u8Var.f54812j != this.f54812j, u8Var.k != this.k, !true, !Intrinsics.f(u8Var.o, this.o));
    }
}
