package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.VoucherBigTileDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.rn0;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class vi implements qv0.i, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComplexImage.Regular f54886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f54887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f54888c;
    public final int d;
    public final int e;
    public qv0.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f54889g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f54890h;
    public p31.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p31.c f54891j;

    public vi(ComplexImage.Regular content) {
        int i = R$attr.uikit_dp0;
        Intrinsics.checkNotNullParameter("NEWS_ARTICLE_IMAGE_DELEGATE_ID", "listId");
        Intrinsics.checkNotNullParameter(content, "content");
        VoucherBigTileDelegate.a.C0429a state = VoucherBigTileDelegate.a.C0429a.f53593a;
        Intrinsics.checkNotNullParameter(state, "state");
        this.f54886a = content;
        this.f54887b = i;
        this.f54888c = i;
        this.d = i;
        this.e = i;
        this.f = c.d.f249513a;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new VoucherBigTileDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF52328h() {
        return null;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF59201a() {
        return "NEWS_ARTICLE_IMAGE_DELEGATE_ID";
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof vi)) {
            return false;
        }
        vi viVar = (vi) obj2;
        if (!this.f54886a.equals(viVar.f54886a)) {
            return false;
        }
        Object obj3 = VoucherBigTileDelegate.a.C0429a.f53593a;
        return obj3.equals(obj3) && this.f54887b == viVar.f54887b && this.f54888c == viVar.f54888c && this.d == viVar.d && this.e == viVar.e;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getO() {
        return this.f54887b;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f54887b = i;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + j6.a.b(this.d, j6.a.b(this.f54888c, j6.a.b(this.f54887b, (VoucherBigTileDelegate.a.C0429a.f53593a.hashCode() + a10.b.c(this.f54886a.f55837a, -1404024828, 31)) * 29791, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getK() {
        return this.f54889g;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF52330l() {
        return this.f54890h;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.i = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52333p() {
        return this.f54888c;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF52335r() {
        return this.e;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f54888c = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF52329j() {
        return this.f;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF52332n() {
        return this.f54891j;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF52331m() {
        return this.i;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f54889g = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF52334q() {
        return this.d;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f54890h = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f54891j = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof vi ? (vi) oldItem : null) == null) {
            return null;
        }
        boolean z = !((vi) oldItem).f54886a.equals(this.f54886a);
        Object obj2 = VoucherBigTileDelegate.a.C0429a.f53593a;
        return new rn0(z, !obj2.equals(obj2), false);
    }
}
