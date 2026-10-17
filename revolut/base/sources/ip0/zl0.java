package ip0;

import com.revolut.core.ui_kit.delegates.TrendPreviewDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class zl0 implements qv0.i, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f167485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f167486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f167487c;
    public final List d;
    public final aw0.ya e;
    public final float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final bm0 f167488g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f167489h;
    public qv0.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p31.c f167490j;
    public p31.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p31.c f167491l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p31.c f167492m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f167493n;
    public int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f167494p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f167495q;

    public zl0(String listId, TextClause primaryValue, Clause secondaryValue, List items, aw0.ya colorScheme, float f, bm0 bm0Var, rzj.b bVar) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(primaryValue, "primaryValue");
        Intrinsics.checkNotNullParameter(secondaryValue, "secondaryValue");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        int i = R$attr.uikit_dp0;
        this.f167485a = listId;
        this.f167486b = primaryValue;
        this.f167487c = secondaryValue;
        this.d = items;
        this.e = colorScheme;
        this.f = f;
        this.f167488g = bm0Var;
        this.f167489h = bVar;
        this.i = c.d.f249513a;
        this.f167490j = null;
        this.k = null;
        this.f167491l = null;
        this.f167492m = null;
        this.f167493n = i;
        this.o = i;
        this.f167494p = i;
        this.f167495q = i;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new TrendPreviewDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF54968n() {
        return this.f167489h;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF54961b() {
        return this.f167485a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof zl0)) {
            return false;
        }
        zl0 zl0Var = (zl0) obj2;
        return Intrinsics.f(this.f167485a, zl0Var.f167485a) && this.f167486b.equals(zl0Var.f167486b) && Intrinsics.f(this.f167487c, zl0Var.f167487c) && Intrinsics.f(this.d, zl0Var.d) && Intrinsics.f(this.e, zl0Var.e) && Float.compare(this.f, zl0Var.f) == 0 && Intrinsics.f(this.f167488g, zl0Var.f167488g) && Intrinsics.f(this.f167489h, zl0Var.f167489h) && Intrinsics.f(this.i, zl0Var.i) && Intrinsics.f(this.f167490j, zl0Var.f167490j) && Intrinsics.f(this.k, zl0Var.k) && Intrinsics.f(this.f167491l, zl0Var.f167491l) && Intrinsics.f(this.f167492m, zl0Var.f167492m) && this.f167493n == zl0Var.f167493n && this.o == zl0Var.o && this.f167494p == zl0Var.f167494p && this.f167495q == zl0Var.f167495q;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF51633p() {
        return this.f167493n;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f167493n = i;
    }

    public final int hashCode() {
        int iB = m72.b.b(this.f, (this.e.hashCode() + p.a.d(p.a.a(v7.b(this.f167485a.hashCode() * 31, 31, this.f167486b), 31, this.f167487c), 31, this.d)) * 31, 31);
        bm0 bm0Var = this.f167488g;
        int iHashCode = (iB + (bm0Var == null ? 0 : Float.hashCode(bm0Var.f163630a))) * 31;
        Object obj2 = this.f167489h;
        int i = h30.l.i(this.i, (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31, 31);
        p31.c cVar = this.f167490j;
        int iHashCode2 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.k;
        int iHashCode3 = (iHashCode2 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f167491l;
        int iHashCode4 = (iHashCode3 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f167492m;
        return Integer.hashCode(this.f167495q) + j6.a.b(this.f167494p, j6.a.b(this.o, j6.a.b(this.f167493n, (iHashCode4 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF51630l() {
        return this.f167490j;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.i = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF51631m() {
        return this.k;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f167491l = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF51634q() {
        return this.o;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF51636s() {
        return this.f167495q;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.o = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF51637t() {
        return this.i;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getO() {
        return this.f167492m;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF51632n() {
        return this.f167491l;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f167490j = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF51635r() {
        return this.f167494p;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.k = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f167492m = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof zl0 ? (zl0) oldItem : null) == null) {
            return null;
        }
        return new am0(!r11.f167486b.equals(this.f167486b), !Intrinsics.f(r11.f167487c, this.f167487c), !Intrinsics.f(r11.d, this.d), !Intrinsics.f(r11.i, this.i), !Intrinsics.f(r11.e, this.e), !(((zl0) oldItem).f == this.f), !Intrinsics.f(r11.f167488g, this.f167488g));
    }
}
