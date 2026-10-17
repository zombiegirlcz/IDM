package ip0;

import com.revolut.core.ui_kit.delegates.IndicesBarLoadingDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class fq implements qv0.i, o31.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public qv0.c f164300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p31.c f164301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p31.c f164302c;
    public p31.c d;
    public p31.c e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f164303g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f164304h;
    public int i;

    @Override // koi.j
    public final koi.k T1() {
        return new IndicesBarLoadingDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF52148b() {
        return "main_index_bar_loading";
    }

    public final boolean equals(Object obj2) {
        return this == obj2 || (obj2 instanceof fq);
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getK() {
        return this.f;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f = i;
    }

    public final int hashCode() {
        return Integer.hashCode(3) + 1762497411;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF53367s() {
        return this.f164301b;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f164300a = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF53368t() {
        return this.f164302c;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.d = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52153l() {
        return this.f164303g;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF52155n() {
        return this.i;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f164303g = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF53366r() {
        return this.f164300a;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getV() {
        return this.e;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getU() {
        return this.d;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f164301b = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF52154m() {
        return this.f164304h;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f164302c = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.e = cVar;
    }
}
