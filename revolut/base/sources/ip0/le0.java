package ip0;

import com.revolut.core.ui_kit.delegates.SimpleLimitProgressBarWithTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class le0 implements qv0.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f165192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f165193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ke0 f165194c;
    public int d;
    public int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f165195g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public qv0.c f165196h;
    public p31.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p31.c f165197j;
    public p31.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p31.c f165198l;

    public le0(String listId, Clause header, ke0 progress, int i, int i2, int i3) {
        i = (i3 & 16) != 0 ? R$attr.uikit_dp16 : i;
        i2 = (i3 & 32) != 0 ? R$attr.uikit_dp16 : i2;
        int i5 = R$attr.uikit_dp16;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(progress, "progress");
        this.f165192a = listId;
        this.f165193b = header;
        this.f165194c = progress;
        this.d = i;
        this.e = i2;
        this.f = i5;
        this.f165195g = i5;
        this.f165196h = c.d.f249513a;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new SimpleLimitProgressBarWithTextDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF52560a() {
        return this.f165192a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof le0)) {
            return false;
        }
        le0 le0Var = (le0) obj2;
        return this.f165192a.equals(le0Var.f165192a) && this.f165193b.equals(le0Var.f165193b) && this.f165194c.equals(le0Var.f165194c) && this.d == le0Var.d && this.e == le0Var.e && this.f == le0Var.f && this.f165195g == le0Var.f165195g;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF52568n() {
        return this.d;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.d = i;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f165195g) + j6.a.b(this.f, j6.a.b(this.e, j6.a.b(this.d, a0.d.c((this.f165194c.hashCode() + p.a.a(this.f165192a.hashCode() * 31, 31, this.f165193b)) * 31, 31, 0L), 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF52572s() {
        return this.i;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f165196h = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF52573t() {
        return this.f165197j;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.k = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getO() {
        return this.e;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF52570q() {
        return this.f165195g;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.e = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF52571r() {
        return this.f165196h;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getV() {
        return this.f165198l;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getU() {
        return this.k;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.i = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF52569p() {
        return this.f;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f165197j = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f165198l = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof le0 ? (le0) oldItem : null) == null) {
            return null;
        }
        le0 le0Var = (le0) oldItem;
        return new me0(!le0Var.f165193b.equals(this.f165193b), !Intrinsics.f(le0Var.f165196h, this.f165196h), !le0Var.f165194c.equals(this.f165194c));
    }
}
