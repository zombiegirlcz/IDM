package tq0;

import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;
import qv0.p;

/* JADX INFO: loaded from: classes19.dex */
public final class g implements koi.j, qv0.i, p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f273458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TimeClause f273459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public qv0.c f273460c;
    public int d;
    public int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f273461g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f273462h;
    public p31.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p31.c f273463j;
    public p31.c k;

    public g(String listId, TimeClause title) {
        int i = R$attr.uikit_dp0;
        int i2 = R$attr.uikit_dp16;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(title, "title");
        c.d positionInBox = c.d.f249513a;
        Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
        this.f273458a = listId;
        this.f273459b = title;
        this.f273460c = positionInBox;
        this.d = i;
        this.e = i;
        this.f = i2;
        this.f273461g = i2;
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getU() {
        return null;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF51752a() {
        return this.f273458a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f273458a, gVar.f273458a) && this.f273459b.equals(gVar.f273459b) && Intrinsics.f(this.f273460c, gVar.f273460c) && this.d == gVar.d && this.e == gVar.e && this.f == gVar.f && this.f273461g == gVar.f273461g;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF51762q() {
        return this.d;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.d = i;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f273461g) + j6.a.b(this.f, j6.a.b(this.e, j6.a.b(this.d, h30.l.i(this.f273460c, j6.a.c(h30.l.d(this.f273459b, this.f273458a.hashCode() * 31, 31), 961, false), 31), 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF51761p() {
        return this.k;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f273460c = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF51759m() {
        return this.f273462h;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.i = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF51763r() {
        return this.e;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF51765t() {
        return this.f273461g;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.e = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF51758l() {
        return this.f273460c;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getO() {
        return this.f273463j;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF51760n() {
        return this.i;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.k = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF51764s() {
        return this.f;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f273462h = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f273463j = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof g ? (g) oldItem : null) == null) {
            return null;
        }
        g gVar = (g) oldItem;
        return new h(!gVar.f273459b.equals(this.f273459b), !Intrinsics.f(gVar.f273460c, this.f273460c), false);
    }
}
