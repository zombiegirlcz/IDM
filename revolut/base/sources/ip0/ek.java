package ip0;

import com.revolut.core.ui_kit.delegates.FullScreenStateLoadingDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class ek implements qv0.i, tw0.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f164115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f164116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f164117c;
    public int d;
    public int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f164118g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public qv0.c f164119h;
    public p31.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p31.c f164120j;
    public p31.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p31.c f164121l;

    public ek(String listId, int i, int i2, int i3, int i5, boolean z, int i6, boolean z3) {
        z = (i6 & 2) != 0 ? true : z;
        z3 = (i6 & 4) != 0 ? true : z3;
        i = (i6 & 8) != 0 ? R$attr.uikit_dp0 : i;
        i2 = (i6 & 16) != 0 ? R$attr.uikit_dp0 : i2;
        i3 = (i6 & 32) != 0 ? R$attr.uikit_dp0 : i3;
        i5 = (i6 & 64) != 0 ? R$attr.uikit_dp0 : i5;
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f164115a = listId;
        this.f164116b = z;
        this.f164117c = z3;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.f164118g = i5;
        this.f164119h = c.d.f249513a;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new FullScreenStateLoadingDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF52040s() {
        return this.f164115a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ek)) {
            return false;
        }
        ek ekVar = (ek) obj2;
        return Intrinsics.f(this.f164115a, ekVar.f164115a) && this.f164116b == ekVar.f164116b && this.f164117c == ekVar.f164117c && this.d == ekVar.d && this.e == ekVar.e && this.f == ekVar.f && this.f164118g == ekVar.f164118g;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getB() {
        return this.d;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.d = i;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f164118g) + j6.a.b(this.f, j6.a.b(this.e, j6.a.b(this.d, j6.a.c(j6.a.c(this.f164115a.hashCode() * 31, 31, this.f164116b), 31, this.f164117c), 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getO() {
        return this.i;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f164119h = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF53048p() {
        return this.f164120j;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.k = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getC() {
        return this.e;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getE() {
        return this.f164118g;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.e = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF53051s() {
        return this.f164119h;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF53050r() {
        return this.f164121l;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF53049q() {
        return this.k;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.i = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getD() {
        return this.f;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f164120j = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f164121l = cVar;
    }
}
