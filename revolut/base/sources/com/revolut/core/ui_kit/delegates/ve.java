package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.RoomPreviewCardDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.eb0;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class ve implements qv0.i, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f54868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f54869c;
    public final Clause d;
    public final Clause e;
    public final Clause f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Clause f54870g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Clause f54871h;
    public final RoomPreviewCardDelegate.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f54872j;
    public qv0.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p31.c f54873l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p31.c f54874m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p31.c f54875n;
    public p31.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f54876p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f54877q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f54878r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f54879s;

    public ve(String listId, Image image, Clause title, Clause clause, Clause clause2, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, Clause clause3, RoomPreviewCardDelegate.a.b bVar, Object obj2, int i) {
        clause = (i & 8) != 0 ? null : clause;
        textLocalisedClause = (i & 32) != 0 ? null : textLocalisedClause;
        textLocalisedClause2 = (i & 64) != 0 ? null : textLocalisedClause2;
        clause3 = (i & 128) != 0 ? null : clause3;
        RoomPreviewCardDelegate.a clicksTarget = bVar;
        clicksTarget = (i & 16384) != 0 ? RoomPreviewCardDelegate.a.c.f53216a : clicksTarget;
        obj2 = (i & 32768) != 0 ? null : obj2;
        int i2 = R$attr.uikit_dp0;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(clicksTarget, "clicksTarget");
        this.f54867a = listId;
        this.f54868b = image;
        this.f54869c = title;
        this.d = clause;
        this.e = clause2;
        this.f = textLocalisedClause;
        this.f54870g = textLocalisedClause2;
        this.f54871h = clause3;
        this.i = clicksTarget;
        this.f54872j = obj2;
        this.k = c.d.f249513a;
        this.f54873l = null;
        this.f54874m = null;
        this.f54875n = null;
        this.o = null;
        this.f54876p = i2;
        this.f54877q = i2;
        this.f54878r = i2;
        this.f54879s = i2;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new RoomPreviewCardDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF52276m() {
        return this.f54872j;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF52269a() {
        return this.f54867a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ve)) {
            return false;
        }
        ve veVar = (ve) obj2;
        return Intrinsics.f(this.f54867a, veVar.f54867a) && Intrinsics.f(this.f54868b, veVar.f54868b) && this.f54869c.equals(veVar.f54869c) && Intrinsics.f(this.d, veVar.d) && Intrinsics.f(this.e, veVar.e) && Intrinsics.f(this.f, veVar.f) && Intrinsics.f(this.f54870g, veVar.f54870g) && Intrinsics.f(this.f54871h, veVar.f54871h) && Intrinsics.f(this.i, veVar.i) && Intrinsics.f(this.f54872j, veVar.f54872j) && Intrinsics.f(this.k, veVar.k) && Intrinsics.f(this.f54873l, veVar.f54873l) && Intrinsics.f(this.f54874m, veVar.f54874m) && Intrinsics.f(this.f54875n, veVar.f54875n) && Intrinsics.f(this.o, veVar.o) && this.f54876p == veVar.f54876p && this.f54877q == veVar.f54877q && this.f54878r == veVar.f54878r && this.f54879s == veVar.f54879s;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF52282t() {
        return this.f54876p;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f54876p = i;
    }

    public final int hashCode() {
        int iHashCode = this.f54867a.hashCode() * 31;
        Object obj2 = this.f54868b;
        int iA = p.a.a((iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31, 31, this.f54869c);
        Clause clause = this.d;
        int iHashCode2 = (iA + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.e;
        int iHashCode3 = (iHashCode2 + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        Clause clause3 = this.f;
        int iHashCode4 = (iHashCode3 + (clause3 == null ? 0 : clause3.hashCode())) * 31;
        Clause clause4 = this.f54870g;
        int iHashCode5 = (iHashCode4 + (clause4 == null ? 0 : clause4.hashCode())) * 31;
        Clause clause5 = this.f54871h;
        int iHashCode6 = (this.i.hashCode() + j6.a.b(0, (iHashCode5 + (clause5 == null ? 0 : clause5.hashCode())) * 923521, 29791)) * 31;
        Object obj3 = this.f54872j;
        int i = h30.l.i(this.k, (iHashCode6 + (obj3 == null ? 0 : obj3.hashCode())) * 31, 31);
        p31.c cVar = this.f54873l;
        int iHashCode7 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f54874m;
        int iHashCode8 = (iHashCode7 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f54875n;
        int iHashCode9 = (iHashCode8 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.o;
        return Integer.hashCode(this.f54879s) + j6.a.b(this.f54878r, j6.a.b(this.f54877q, j6.a.b(this.f54876p, (iHashCode9 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF52278p() {
        return this.f54873l;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.k = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF52279q() {
        return this.f54874m;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f54875n = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getU() {
        return this.f54877q;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF52283w() {
        return this.f54879s;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f54877q = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getO() {
        return this.k;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF52281s() {
        return this.o;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF52280r() {
        return this.f54875n;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f54873l = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getV() {
        return this.f54878r;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f54874m = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.o = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof ve ? (ve) oldItem : null) == null) {
            return null;
        }
        ve veVar = (ve) oldItem;
        boolean z = true;
        boolean z3 = !Intrinsics.f(veVar.f54868b, this.f54868b);
        boolean z4 = !veVar.f54869c.equals(this.f54869c);
        boolean z6 = !Intrinsics.f(veVar.d, this.d);
        boolean z11 = !Intrinsics.f(veVar.e, this.e);
        boolean z12 = !true;
        boolean z29 = !true;
        boolean z31 = !true;
        boolean z41 = !true;
        boolean z49 = !true;
        boolean z54 = !Intrinsics.f(veVar.f, this.f);
        boolean z74 = !Intrinsics.f(veVar.f54871h, this.f54871h);
        boolean z83 = !Intrinsics.f(veVar.f54870g, this.f54870g);
        if (Intrinsics.f(veVar.f54873l, this.f54873l) && Intrinsics.f(veVar.f54874m, this.f54874m) && Intrinsics.f(veVar.f54875n, this.f54875n) && Intrinsics.f(veVar.o, this.o)) {
            z = false;
        }
        return new eb0(z3, z4, z6, z11, z12, z29, false, z31, z41, z49, z54, z83, z74, z);
    }
}
