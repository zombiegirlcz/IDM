package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.WebViewDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.cp0;
import ip0.xo0;
import ip0.zo0;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class kj implements qv0.i, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WebViewDelegate.a f54399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cp0 f54400c;
    public int d;
    public int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f54401g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public qv0.c f54402h;
    public p31.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p31.c f54403j;
    public p31.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p31.c f54404l;

    public kj(String listId, WebViewDelegate.a content, cp0 settings, int i) {
        settings = (i & 4) != 0 ? new cp0(false, null, null, null, 126) : settings;
        int i2 = R$attr.uikit_dp0;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.f54398a = listId;
        this.f54399b = content;
        this.f54400c = settings;
        this.d = i2;
        this.e = i2;
        this.f = i2;
        this.f54401g = i2;
        this.f54402h = c.d.f249513a;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new WebViewDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getI() {
        return null;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF55721a() {
        return this.f54398a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof kj)) {
            return false;
        }
        kj kjVar = (kj) obj2;
        return Intrinsics.f(this.f54398a, kjVar.f54398a) && Intrinsics.f(this.f54399b, kjVar.f54399b) && Intrinsics.f(this.f54400c, kjVar.f54400c) && this.d == kjVar.d && this.e == kjVar.e && this.f == kjVar.f && this.f54401g == kjVar.f54401g;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getK() {
        return this.d;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.d = i;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f54401g) + j6.a.b(this.f, j6.a.b(this.e, j6.a.b(this.d, (this.f54400c.hashCode() + ((this.f54399b.hashCode() + (this.f54398a.hashCode() * 31)) * 31)) * 961, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF52531s() {
        return this.i;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f54402h = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF52528p() {
        return this.f54404l;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f54403j = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52525l() {
        return this.e;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF52527n() {
        return this.f54401g;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.e = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getO() {
        return this.f54402h;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF52530r() {
        return this.k;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF52529q() {
        return this.f54403j;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.i = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF52526m() {
        return this.f;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f54404l = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.k = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        kj kjVar = oldItem instanceof kj ? (kj) oldItem : null;
        if (kjVar == null) {
            return null;
        }
        boolean z = !Intrinsics.f(kjVar.f54399b, this.f54399b);
        cp0 cp0Var = kjVar.f54400c;
        xo0 xo0Var = cp0Var.f;
        cp0 cp0Var2 = this.f54400c;
        return new zo0(z, xo0Var != cp0Var2.f, cp0Var.f163775g != cp0Var2.f163775g);
    }
}
