package fc4;

import bq.i;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature_web_view.presentation.WebViewActivity;
import com.revolut.feature_web_view.presentation.WebViewContract$WebViewConfiguration;
import e4m.e;
import fa0.q;
import fsi.g;
import java.util.Set;
import vc.s;
import yy0.f;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements qgi.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f133628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WebViewContract$WebViewConfiguration f133629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f133630c;
    public final e d;
    public final e e;
    public final e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f133631g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f133632h;
    public final e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e f133633j;
    public final e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e f133634l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e f133635m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e f133636n;

    public b(c cVar, xoi.d dVar, WebViewContract$WebViewConfiguration webViewContract$WebViewConfiguration) {
        this.f133630c = cVar;
        this.f133628a = dVar;
        this.f133629b = webViewContract$WebViewConfiguration;
        int i = 5;
        this.d = e4m.b.b(new q(cVar, this, 0, i));
        this.e = e4m.b.b(new q(cVar, this, 1, i));
        this.f = e4m.b.b(new q(cVar, this, 3, i));
        this.f133631g = e4m.b.b(new q(cVar, this, 2, i));
        this.f133632h = e4m.b.b(new q(cVar, this, 4, i));
        this.i = e4m.b.b(new q(cVar, this, 6, i));
        this.f133633j = e4m.b.b(new q(cVar, this, 5, i));
        this.k = e4m.b.b(new q(cVar, this, 8, i));
        this.f133634l = e4m.b.b(new q(cVar, this, 7, i));
        this.f133635m = e4m.b.b(new q(cVar, this, 9, i));
        this.f133636n = e4m.b.b(new q(cVar, this, 10, i));
    }

    @Override // gsi.a
    public final f Q() {
        return i.j(this.f133628a);
    }

    @Override // gsi.a
    public final mz0.a V() {
        return i.p(this.f133628a);
    }

    @Override // gsi.a
    public final c01.d W() {
        return gmf.b.e(this.f133628a);
    }

    @Override // gsi.a
    public final py0.e X() {
        return gmf.b.g(this.f133628a);
    }

    @Override // gsi.a
    public final xy0.a Y() {
        return gmf.b.b(this.f133628a);
    }

    @Override // gsi.a
    public final h01.b Z() {
        return i.n(this.f133628a);
    }

    @Override // gsi.h
    public final g a() {
        return this.f133628a;
    }

    @Override // gsi.a
    public final jz0.d a0() {
        return gmf.b.d(this.f133628a);
    }

    @Override // qgi.d
    public final pgi.i b() {
        return (pgi.i) this.f133636n.get();
    }

    @Override // gsi.a
    public final ty0.c b0() {
        return i.g(this.f133628a);
    }

    @Override // gsi.a
    public final lz0.g c0() {
        return gmf.b.f(this.f133628a);
    }

    @Override // gsi.a
    public final i01.b d0() {
        return gsi.d.p(this.f133628a);
    }

    @Override // gsi.a
    public final d01.g e0() {
        return gmf.b.c(this.f133628a);
    }

    @Override // gsi.a
    public final Set l0() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(8);
        builderBuilderWithExpectedSize.addAll((Iterable) i.k(this.f133628a));
        builderBuilderWithExpectedSize.add(this.d.get());
        builderBuilderWithExpectedSize.add(this.e.get());
        builderBuilderWithExpectedSize.add(this.f133631g.get());
        builderBuilderWithExpectedSize.add(this.f133632h.get());
        builderBuilderWithExpectedSize.add(this.f133633j.get());
        builderBuilderWithExpectedSize.add(this.f133634l.get());
        return j6.a.g(this.f133635m, builderBuilderWithExpectedSize);
    }

    @Override // gsi.a
    public final py0.f m0() {
        return gmf.b.i(this.f133628a);
    }

    @Override // qgi.d
    public final void t(WebViewActivity webViewActivity) {
        c cVar = this.f133630c;
        t70.g gVarO = cVar.f133638b.o();
        s.j(gVarO);
        webViewActivity.E0 = gVarO;
        webViewActivity.F0 = ((nj0.d) cVar.f133639c).h();
    }
}
