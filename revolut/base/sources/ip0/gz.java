package ip0;

import com.revolut.core.ui_kit.delegates.OptionCardLoadingDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class gz implements qv0.i, tw0.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f164477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public qv0.c f164478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p31.c f164479c;
    public p31.c d;
    public p31.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f164480g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f164481h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f164482j;

    public gz(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        int i = R$attr.uikit_dp0;
        this.f164477a = listId;
        this.f164478b = c.d.f249513a;
        this.f164479c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.f164480g = i;
        this.f164481h = i;
        this.i = i;
        this.f164482j = i;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new OptionCardLoadingDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF57029a() {
        return this.f164477a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof gz)) {
            return false;
        }
        gz gzVar = (gz) obj2;
        return Intrinsics.f(this.f164477a, gzVar.f164477a) && Intrinsics.f(this.f164478b, gzVar.f164478b) && Intrinsics.f(this.f164479c, gzVar.f164479c) && Intrinsics.f(this.d, gzVar.d) && Intrinsics.f(this.e, gzVar.e) && Intrinsics.f(this.f, gzVar.f) && this.f164480g == gzVar.f164480g && this.f164481h == gzVar.f164481h && this.i == gzVar.i && this.f164482j == gzVar.f164482j;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF51762q() {
        return this.f164480g;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f164480g = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.f164478b, this.f164477a.hashCode() * 31, 31);
        p31.c cVar = this.f164479c;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.d;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.e;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f;
        return Integer.hashCode(this.f164482j) + j6.a.b(this.i, j6.a.b(this.f164481h, j6.a.b(this.f164480g, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF() {
        return this.f164479c;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f164478b = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF57032g() {
        return this.d;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.e = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF51763r() {
        return this.f164481h;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF51765t() {
        return this.f164482j;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f164481h = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF51758l() {
        return this.f164478b;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getI() {
        return this.f;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF57033h() {
        return this.e;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f164479c = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF51764s() {
        return this.i;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.d = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f = cVar;
    }
}
