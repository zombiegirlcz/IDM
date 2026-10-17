package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.BigTileDelegate;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.bc0;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class cg implements qv0.q, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LayeredImage f53752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigTileDelegate.Model f53753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public qv0.c f53754c;
    public p31.c d;
    public p31.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f53755g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f53756h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f53757j;
    public final int k;

    public cg(LayeredImage scratchImage, BigTileDelegate.Model bigTileItem) {
        int i = R$attr.uikit_dp0;
        Intrinsics.checkNotNullParameter("REWARD_SCRATCH_CARD_LIST_ID", "listId");
        Intrinsics.checkNotNullParameter(scratchImage, "scratchImage");
        Intrinsics.checkNotNullParameter(bigTileItem, "bigTileItem");
        Intrinsics.checkNotNullParameter("REWARD_SCRATCH_CARD_LIST_ID", "listId");
        Intrinsics.checkNotNullParameter(scratchImage, "scratchImage");
        Intrinsics.checkNotNullParameter(bigTileItem, "bigTileItem");
        c.d positionInBox = c.d.f249513a;
        Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
        this.f53752a = scratchImage;
        this.f53753b = bigTileItem;
        this.f53754c = positionInBox;
        this.d = null;
        this.e = null;
        this.f = null;
        this.f53755g = null;
        this.f53756h = i;
        this.i = i;
        this.f53757j = i;
        this.k = i;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new ScratchTileDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getD() {
        return null;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53293a() {
        return "REWARD_SCRATCH_CARD_LIST_ID";
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof cg)) {
            return false;
        }
        cg cgVar = (cg) obj2;
        return this.f53752a.equals(cgVar.f53752a) && this.f53753b.equals(cgVar.f53753b) && Intrinsics.f(this.f53754c, cgVar.f53754c) && Intrinsics.f(this.d, cgVar.d) && Intrinsics.f(this.e, cgVar.e) && Intrinsics.f(this.f, cgVar.f) && Intrinsics.f(this.f53755g, cgVar.f53755g) && this.f53756h == cgVar.f53756h && this.i == cgVar.i && this.f53757j == cgVar.f53757j && this.k == cgVar.k;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getK() {
        return this.f53756h;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f53756h = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.f53754c, (this.f53753b.hashCode() + h30.l.e(this.f53752a, -1338763842, 31)) * 961, 31);
        p31.c cVar = this.d;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.e;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f53755g;
        return Integer.hashCode(this.k) + j6.a.b(this.f53757j, j6.a.b(this.i, j6.a.b(this.f53756h, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF53298j() {
        return this.d;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f53754c = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF53296g() {
        return this.e;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF53299l() {
        return this.i;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF53301n() {
        return this.k;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.i = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF() {
        return this.f53754c;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getI() {
        return this.f53755g;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF53297h() {
        return this.f;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.d = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF53300m() {
        return this.f53757j;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.e = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f53755g = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (!(oldItem instanceof cg)) {
            return null;
        }
        return new bc0((ip0.l4) this.f53753b.z(((cg) oldItem).f53753b), !this.f53752a.equals(r4.f53752a));
    }
}
