package ip0;

import com.revolut.core.ui_kit.delegates.ExtraSmallCardLoadingDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class kh implements qv0.q, tw0.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f165014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f165015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f165016c;
    public final int d;
    public final int e;
    public qv0.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f165017g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f165018h;
    public p31.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p31.c f165019j;

    public kh(String listId) {
        int i = R$attr.uikit_dp0;
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f165014a = listId;
        this.f165015b = i;
        this.f165016c = i;
        this.d = i;
        this.e = i;
        this.f = c.d.f249513a;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new ExtraSmallCardLoadingDelegate(0);
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF52708a() {
        return this.f165014a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof kh)) {
            return false;
        }
        kh khVar = (kh) obj2;
        return Intrinsics.f(this.f165014a, khVar.f165014a) && this.f165015b == khVar.f165015b && this.f165016c == khVar.f165016c && this.d == khVar.d && this.e == khVar.e;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getU() {
        return this.f165015b;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f165015b = i;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + j6.a.b(this.d, j6.a.b(this.f165016c, j6.a.b(this.f165015b, this.f165014a.hashCode() * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF52718q() {
        return this.f165019j;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF52719r() {
        return this.f165017g;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f165018h = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getV() {
        return this.f165016c;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF52723x() {
        return this.e;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f165016c = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF52717p() {
        return this.f;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF52721t() {
        return this.i;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF52720s() {
        return this.f165018h;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f165019j = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF52722w() {
        return this.d;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f165017g = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.i = cVar;
    }
}
