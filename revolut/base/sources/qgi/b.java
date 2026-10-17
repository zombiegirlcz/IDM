package qgi;

import bq.i;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature_web_view.presentation.WebViewActivity;
import com.revolut.feature_web_view.presentation.WebViewContract$WebViewConfiguration;
import fsi.g;
import java.util.Set;
import prk.k0;
import vc.s;
import yy0.f;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f245849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WebViewContract$WebViewConfiguration f245850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f245851c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f245852g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f245853h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f245854j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f245855l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f245856m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f245857n;

    public b(c cVar, xoi.d dVar, WebViewContract$WebViewConfiguration webViewContract$WebViewConfiguration) {
        this.f245851c = cVar;
        this.f245849a = dVar;
        this.f245850b = webViewContract$WebViewConfiguration;
        int i = 21;
        this.d = e4m.b.b(new k0(cVar, this, 0, i));
        this.e = e4m.b.b(new k0(cVar, this, 1, i));
        this.f = e4m.b.b(new k0(cVar, this, 3, i));
        this.f245852g = e4m.b.b(new k0(cVar, this, 2, i));
        this.f245853h = e4m.b.b(new k0(cVar, this, 4, i));
        this.i = e4m.b.b(new k0(cVar, this, 6, i));
        this.f245854j = e4m.b.b(new k0(cVar, this, 5, i));
        this.k = e4m.b.b(new k0(cVar, this, 8, i));
        this.f245855l = e4m.b.b(new k0(cVar, this, 7, i));
        this.f245856m = e4m.b.b(new k0(cVar, this, 9, i));
        this.f245857n = e4m.b.b(new k0(cVar, this, 10, i));
    }

    @Override // gsi.a
    public final f Q() {
        return i.j(this.f245849a);
    }

    @Override // gsi.a
    public final mz0.a V() {
        return i.p(this.f245849a);
    }

    @Override // gsi.a
    public final c01.d W() {
        return gmf.b.e(this.f245849a);
    }

    @Override // gsi.a
    public final py0.e X() {
        return gmf.b.g(this.f245849a);
    }

    @Override // gsi.a
    public final xy0.a Y() {
        return gmf.b.b(this.f245849a);
    }

    @Override // gsi.a
    public final h01.b Z() {
        return i.n(this.f245849a);
    }

    @Override // gsi.h
    public final g a() {
        return this.f245849a;
    }

    @Override // gsi.a
    public final jz0.d a0() {
        return gmf.b.d(this.f245849a);
    }

    @Override // qgi.d
    public final pgi.i b() {
        return (pgi.i) this.f245857n.get();
    }

    @Override // gsi.a
    public final ty0.c b0() {
        return i.g(this.f245849a);
    }

    @Override // gsi.a
    public final lz0.g c0() {
        return gmf.b.f(this.f245849a);
    }

    @Override // gsi.a
    public final i01.b d0() {
        return gsi.d.p(this.f245849a);
    }

    @Override // gsi.a
    public final d01.g e0() {
        return gmf.b.c(this.f245849a);
    }

    @Override // gsi.a
    public final Set l0() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(8);
        builderBuilderWithExpectedSize.addAll((Iterable) i.k(this.f245849a));
        builderBuilderWithExpectedSize.add(this.d.get());
        builderBuilderWithExpectedSize.add(this.e.get());
        builderBuilderWithExpectedSize.add(this.f245852g.get());
        builderBuilderWithExpectedSize.add(this.f245853h.get());
        builderBuilderWithExpectedSize.add(this.f245854j.get());
        builderBuilderWithExpectedSize.add(this.f245855l.get());
        return j6.a.g(this.f245856m, builderBuilderWithExpectedSize);
    }

    @Override // gsi.a
    public final py0.f m0() {
        return gmf.b.i(this.f245849a);
    }

    @Override // qgi.d
    public final void t(WebViewActivity webViewActivity) {
        c cVar = this.f245851c;
        t70.g gVarO = cVar.f245858a.o();
        s.j(gVarO);
        webViewActivity.E0 = gVarO;
        webViewActivity.F0 = cVar.f245859b;
    }
}
