package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.PhotoDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class na implements qv0.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PhotoDelegate.a.C0417a f54501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public qv0.c f54502c;
    public p31.c d;
    public p31.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f54503g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f54504h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f54505j;
    public final int k;

    public na(String listId, PhotoDelegate.a.C0417a background) {
        int i = R$attr.uikit_dp0;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(background, "background");
        c.d positionInBox = c.d.f249513a;
        Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
        this.f54500a = listId;
        this.f54501b = background;
        this.f54502c = positionInBox;
        this.d = null;
        this.e = null;
        this.f = null;
        this.f54503g = null;
        this.f54504h = i;
        this.i = i;
        this.f54505j = i;
        this.k = i;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new PhotoDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53056a() {
        return this.f54500a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof na)) {
            return false;
        }
        na naVar = (na) obj2;
        return this.f54500a.equals(naVar.f54500a) && this.f54501b.equals(naVar.f54501b) && Intrinsics.f(this.f54502c, naVar.f54502c) && Intrinsics.f(this.d, naVar.d) && Intrinsics.f(this.e, naVar.e) && Intrinsics.f(this.f, naVar.f) && Intrinsics.f(this.f54503g, naVar.f54503g) && this.f54504h == naVar.f54504h && this.i == naVar.i && this.f54505j == naVar.f54505j && this.k == naVar.k;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF52020l() {
        return this.f54504h;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f54504h = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.f54502c, (this.f54501b.f52921a.hashCode() + (this.f54500a.hashCode() * 31)) * 31, 31);
        p31.c cVar = this.d;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.e;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f54503g;
        return Integer.hashCode(this.k) + j6.a.b(this.f54505j, j6.a.b(this.i, j6.a.b(this.f54504h, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF52018h() {
        return this.d;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f54502c = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getI() {
        return this.e;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52021m() {
        return this.i;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getO() {
        return this.k;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.i = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF52017g() {
        return this.f54502c;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getK() {
        return this.f54503g;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF52019j() {
        return this.f;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.d = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF52022n() {
        return this.f54505j;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.e = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f54503g = cVar;
    }
}
