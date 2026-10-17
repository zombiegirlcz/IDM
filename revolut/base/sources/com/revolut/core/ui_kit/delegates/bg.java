package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.lb0;
import ip0.xb0;
import ip0.yb0;
import ip0.zb0;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class bg implements qv0.i, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f53729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RowDelegate.Model f53730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yb0 f53731c;
    public int d;
    public int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f53732g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f53733h;
    public qv0.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p31.c f53734j;
    public p31.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p31.c f53735l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p31.c f53736m;

    public bg(String listId, RowDelegate.Model rowData, yb0 quantitySelectorConfig, d3c.c0 c0Var, int i) {
        int i2 = R$attr.uikit_dp16;
        c0Var = (i & 128) != 0 ? null : c0Var;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(rowData, "rowData");
        Intrinsics.checkNotNullParameter(quantitySelectorConfig, "quantitySelectorConfig");
        this.f53729a = listId;
        this.f53730b = rowData;
        this.f53731c = quantitySelectorConfig;
        this.d = i2;
        this.e = i2;
        this.f = i2;
        this.f53732g = i2;
        this.f53733h = c0Var;
        this.i = c.d.f249513a;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new RowQuantityDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getI() {
        return this.f53733h;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF59198a() {
        return this.f53729a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof bg)) {
            return false;
        }
        bg bgVar = (bg) obj2;
        return Intrinsics.f(this.f53729a, bgVar.f53729a) && Intrinsics.f(this.f53730b, bgVar.f53730b) && Intrinsics.f(this.f53731c, bgVar.f53731c) && this.d == bgVar.d && this.e == bgVar.e && this.f == bgVar.f && this.f53732g == bgVar.f53732g && Intrinsics.f(this.f53733h, bgVar.f53733h);
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF52982p() {
        return this.d;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.d = i;
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f53732g, j6.a.b(this.f, j6.a.b(this.e, j6.a.b(this.d, (this.f53731c.hashCode() + ((this.f53730b.hashCode() + (this.f53729a.hashCode() * 31)) * 31)) * 31, 31), 31), 31), 31);
        Object obj2 = this.f53733h;
        return iB + (obj2 == null ? 0 : obj2.hashCode());
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF52979l() {
        return this.f53734j;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.i = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF52980m() {
        return this.k;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f53735l = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52983q() {
        return this.e;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF52985s() {
        return this.f53732g;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.e = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getK() {
        return this.i;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getO() {
        return this.f53736m;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF52981n() {
        return this.f53735l;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f53734j = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF52984r() {
        return this.f;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.k = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f53736m = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        bg bgVar = oldItem instanceof bg ? (bg) oldItem : null;
        if (bgVar == null) {
            return null;
        }
        bg bgVar2 = (bg) oldItem;
        yb0 yb0Var = bgVar2.f53731c;
        yb0 yb0Var2 = bgVar2.f53731c;
        xb0 xb0Var = yb0Var.f167297b;
        yb0 yb0Var3 = this.f53731c;
        return new zb0(!xb0Var.equals(yb0Var3.f167297b), !yb0Var2.f167298c.equals(yb0Var3.f167298c), !yb0Var2.f167296a.equals(yb0Var3.f167296a), (lb0) this.f53730b.z(bgVar.f53730b));
    }
}
