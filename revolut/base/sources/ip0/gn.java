package ip0;

import com.revolut.core.ui_kit.delegates.HighlightTileLoadingDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class gn implements qv0.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f164447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f164448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f164449c;
    public int d;
    public qv0.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f164450g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f164451h;
    public p31.c i;

    @Override // koi.j
    public final koi.k T1() {
        return new HighlightTileLoadingDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF52159a() {
        return "ID_EARN_REVPOINTS_LOADING";
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof gn)) {
            return false;
        }
        gn gnVar = (gn) obj2;
        return this.f164447a == gnVar.f164447a && this.f164448b == gnVar.f164448b && this.f164449c == gnVar.f164449c && this.d == gnVar.d && Intrinsics.f(this.e, gnVar.e) && Intrinsics.f(this.f, gnVar.f) && Intrinsics.f(this.f164450g, gnVar.f164450g) && Intrinsics.f(this.f164451h, gnVar.f164451h) && Intrinsics.f(this.i, gnVar.i);
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF52168p() {
        return this.f164447a;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f164447a = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.e, j6.a.b(this.d, j6.a.b(this.f164449c, j6.a.b(this.f164448b, j6.a.b(this.f164447a, -1909437440, 31), 31), 31), 31), 31);
        p31.c cVar = this.f;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f164450g;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f164451h;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.i;
        return iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF52165l() {
        return this.f;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.e = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF52166m() {
        return this.f164450g;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f164451h = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52169q() {
        return this.f164448b;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF52171s() {
        return this.d;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f164448b = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getK() {
        return this.e;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getO() {
        return this.i;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF52167n() {
        return this.f164451h;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF52170r() {
        return this.f164449c;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f164450g = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.i = cVar;
    }
}
