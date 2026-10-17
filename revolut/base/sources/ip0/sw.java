package ip0;

import com.revolut.core.ui_kit.delegates.MapLoadingDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class sw implements qv0.i, tw0.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f166390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f166391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f166392c;
    public final int d;
    public final int e;
    public qv0.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f166393g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f166394h;
    public p31.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p31.c f166395j;

    public sw(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        int i = R$attr.uikit_dp0;
        this.f166390a = listId;
        this.f166391b = i;
        this.f166392c = i;
        this.d = i;
        this.e = i;
        this.f = c.d.f249513a;
        this.f166393g = null;
        this.f166394h = null;
        this.i = null;
        this.f166395j = null;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new MapLoadingDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF51730a() {
        return this.f166390a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof sw)) {
            return false;
        }
        sw swVar = (sw) obj2;
        return Intrinsics.f(this.f166390a, swVar.f166390a) && this.f166391b == swVar.f166391b && this.f166392c == swVar.f166392c && this.d == swVar.d && this.e == swVar.e && Intrinsics.f(this.f, swVar.f) && Intrinsics.f(this.f166393g, swVar.f166393g) && Intrinsics.f(this.f166394h, swVar.f166394h) && Intrinsics.f(this.i, swVar.i) && Intrinsics.f(this.f166395j, swVar.f166395j);
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getU() {
        return this.f166391b;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f166391b = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.f, j6.a.b(this.e, j6.a.b(this.d, j6.a.b(this.f166392c, j6.a.b(this.f166391b, this.f166390a.hashCode() * 31, 31), 31), 31), 31), 31);
        p31.c cVar = this.f166393g;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f166394h;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.i;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f166395j;
        return iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getZ() {
        return this.f166393g;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getA() {
        return this.f166394h;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.i = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getV() {
        return this.f166392c;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF51745x() {
        return this.e;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f166392c = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF51746y() {
        return this.f;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getC() {
        return this.f166395j;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getB() {
        return this.i;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f166393g = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF51744w() {
        return this.d;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f166394h = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f166395j = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof sw ? (sw) oldItem : null) != null) {
            return Unit.f186387a;
        }
        return null;
    }
}
