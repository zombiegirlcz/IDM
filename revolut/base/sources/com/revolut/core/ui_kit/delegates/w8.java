package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.MapDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.mw;
import ip0.qw;
import ip0.rw;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class w8 implements qv0.i, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f54895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f54896c;
    public final MapDelegate.b d;
    public final Integer e;
    public final Integer f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final qw f54897g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f54898h;
    public final Image i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f54899j;
    public final mw k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f54900l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public qv0.c f54901m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p31.c f54902n;
    public p31.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public p31.c f54903p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public p31.c f54904q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f54905r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f54906s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f54907t;
    public final int u;

    public w8(String listId, Clause note, Clause clause, x8 x8Var, Integer num, Integer num2, qw qwVar, boolean z, Image image, boolean z3, mw mwVar, Object obj2, int i, int i2, int i3, int i5, int i6) {
        num2 = (i6 & 32) != 0 ? null : num2;
        z = (i6 & 128) != 0 ? true : z;
        boolean z4 = (i6 & 512) == 0 ? z3 : true;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(note, "note");
        c.d positionInBox = c.d.f249513a;
        Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
        this.f54894a = listId;
        this.f54895b = note;
        this.f54896c = clause;
        this.d = x8Var;
        this.e = num;
        this.f = num2;
        this.f54897g = qwVar;
        this.f54898h = z;
        this.i = image;
        this.f54899j = z4;
        this.k = mwVar;
        this.f54900l = obj2;
        this.f54901m = positionInBox;
        this.f54902n = null;
        this.o = null;
        this.f54903p = null;
        this.f54904q = null;
        this.f54905r = i;
        this.f54906s = i2;
        this.f54907t = i3;
        this.u = i5;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new MapDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getI() {
        return this.f54900l;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF98597a() {
        return this.f54894a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w8)) {
            return false;
        }
        w8 w8Var = (w8) obj2;
        return Intrinsics.f(this.f54894a, w8Var.f54894a) && Intrinsics.f(this.f54895b, w8Var.f54895b) && Intrinsics.f(this.f54896c, w8Var.f54896c) && Intrinsics.f(this.d, w8Var.d) && Intrinsics.f(this.e, w8Var.e) && Intrinsics.f(this.f, w8Var.f) && this.f54897g == w8Var.f54897g && this.f54898h == w8Var.f54898h && Intrinsics.f(this.i, w8Var.i) && this.f54899j == w8Var.f54899j && Intrinsics.f(this.k, w8Var.k) && Intrinsics.f(this.f54900l, w8Var.f54900l) && Intrinsics.f(this.f54901m, w8Var.f54901m) && Intrinsics.f(this.f54902n, w8Var.f54902n) && Intrinsics.f(this.o, w8Var.o) && Intrinsics.f(this.f54903p, w8Var.f54903p) && Intrinsics.f(this.f54904q, w8Var.f54904q) && this.f54905r == w8Var.f54905r && this.f54906s == w8Var.f54906s && this.f54907t == w8Var.f54907t && this.u == w8Var.u;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF52982p() {
        return this.f54905r;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f54905r = i;
    }

    public final int hashCode() {
        int iB = p.a.b(this.f54894a.hashCode() * 31, 31, this.f54895b);
        Clause clause = this.f54896c;
        int iHashCode = (iB + (clause == null ? 0 : clause.hashCode())) * 31;
        MapDelegate.b bVar = this.d;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        Integer num = this.e;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        qw qwVar = this.f54897g;
        int iC = j6.a.c((iHashCode4 + (qwVar == null ? 0 : qwVar.hashCode())) * 31, 31, this.f54898h);
        Image image = this.i;
        int iC2 = j6.a.c((iC + (image == null ? 0 : image.hashCode())) * 31, 31, this.f54899j);
        mw mwVar = this.k;
        int iHashCode5 = (iC2 + (mwVar == null ? 0 : mwVar.hashCode())) * 31;
        Object obj2 = this.f54900l;
        int i = h30.l.i(this.f54901m, (iHashCode5 + (obj2 == null ? 0 : obj2.hashCode())) * 31, 31);
        p31.c cVar = this.f54902n;
        int iHashCode6 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.o;
        int iHashCode7 = (iHashCode6 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f54903p;
        int iHashCode8 = (iHashCode7 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f54904q;
        return Integer.hashCode(this.u) + j6.a.b(this.f54907t, j6.a.b(this.f54906s, j6.a.b(this.f54905r, (iHashCode8 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF52979l() {
        return this.f54902n;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f54901m = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF52980m() {
        return this.o;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f54903p = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52983q() {
        return this.f54906s;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF52985s() {
        return this.u;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f54906s = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getK() {
        return this.f54901m;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getO() {
        return this.f54904q;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF52981n() {
        return this.f54903p;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f54902n = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF52984r() {
        return this.f54907t;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.o = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f54904q = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        w8 w8Var = oldItem instanceof w8 ? (w8) oldItem : null;
        if (w8Var != null) {
            return new rw(!Intrinsics.f(this.f54895b, w8Var.f54895b), !Intrinsics.f(this.f54896c, w8Var.f54896c), !Intrinsics.f(this.d, w8Var.d), !Intrinsics.f(this.i, w8Var.i), this.f54899j != w8Var.f54899j);
        }
        return null;
    }

    public w8(String listId, Clause note, Double d, Double d5, qw qwVar, mw mwVar, ResourceImage resourceImage, int i) {
        x8 x8Var = null;
        qw qwVar2 = (i & 128) != 0 ? null : qwVar;
        mw mwVar2 = (i & 256) != 0 ? null : mwVar;
        ResourceImage resourceImage2 = (i & 512) != 0 ? null : resourceImage;
        boolean z = (i & 1024) != 0;
        int i2 = R$attr.uikit_dp0;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(note, "note");
        if (d != null && d5 != null) {
            x8Var = new x8(d.doubleValue(), d5.doubleValue());
        }
        this(listId, note, null, x8Var, null, null, qwVar2, false, resourceImage2, z, mwVar2, null, i2, i2, i2, i2, 123008);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public w8(String listId, Clause note, TextLocalisedClause textLocalisedClause, x8 x8Var, Integer num, Integer num2, qw qwVar, ResourceImage resourceImage, Object obj2, int i, int i2, int i3) {
        TextLocalisedClause textLocalisedClause2 = (i3 & 4) != 0 ? null : textLocalisedClause;
        Integer num3 = (i3 & 16) != 0 ? null : num;
        Integer num4 = (i3 & 32) != 0 ? null : num2;
        qw qwVar2 = (i3 & 64) != 0 ? null : qwVar;
        boolean z = (i3 & 128) != 0;
        ResourceImage resourceImage2 = (i3 & 512) != 0 ? null : resourceImage;
        boolean z3 = (i3 & 1024) != 0;
        Object obj3 = (i3 & 2048) != 0 ? null : obj2;
        int i5 = R$attr.uikit_dp0;
        int i6 = (i3 & 16384) != 0 ? i5 : i;
        int i21 = (i3 & 32768) != 0 ? i5 : i2;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(note, "note");
        this(listId, note, textLocalisedClause2, x8Var, num3, num4, qwVar2, z, resourceImage2, z3, null, obj3, i5, i5, i6, i21, 122880);
    }
}
