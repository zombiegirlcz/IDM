package k74;

import bq.i;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature_web_view.presentation.WebViewActivity;
import com.revolut.feature_web_view.presentation.WebViewContract$WebViewConfiguration;
import e4m.b;
import e4m.e;
import fc4.c;
import fsi.g;
import java.util.Set;
import jqa.h;
import qgi.d;
import vc.s;
import yy0.f;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f181816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WebViewContract$WebViewConfiguration f181817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f181818c;
    public final e d;
    public final e e;
    public final e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f181819g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f181820h;
    public final e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e f181821j;
    public final e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e f181822l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e f181823m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e f181824n;

    public a(c cVar, xoi.d dVar, WebViewContract$WebViewConfiguration webViewContract$WebViewConfiguration) {
        this.f181818c = cVar;
        this.f181816a = dVar;
        this.f181817b = webViewContract$WebViewConfiguration;
        int i = 18;
        this.d = b.b(new h(cVar, this, 0, i));
        this.e = b.b(new h(cVar, this, 1, i));
        this.f = b.b(new h(cVar, this, 3, i));
        this.f181819g = b.b(new h(cVar, this, 2, i));
        this.f181820h = b.b(new h(cVar, this, 4, i));
        this.i = b.b(new h(cVar, this, 6, i));
        this.f181821j = b.b(new h(cVar, this, 5, i));
        this.k = b.b(new h(cVar, this, 8, i));
        this.f181822l = b.b(new h(cVar, this, 7, i));
        this.f181823m = b.b(new h(cVar, this, 9, i));
        this.f181824n = b.b(new h(cVar, this, 10, i));
    }

    @Override // gsi.a
    public final f Q() {
        return i.j(this.f181816a);
    }

    @Override // gsi.a
    public final mz0.a V() {
        return i.p(this.f181816a);
    }

    @Override // gsi.a
    public final c01.d W() {
        return gmf.b.e(this.f181816a);
    }

    @Override // gsi.a
    public final py0.e X() {
        return gmf.b.g(this.f181816a);
    }

    @Override // gsi.a
    public final xy0.a Y() {
        return gmf.b.b(this.f181816a);
    }

    @Override // gsi.a
    public final h01.b Z() {
        return i.n(this.f181816a);
    }

    @Override // gsi.h
    public final g a() {
        return this.f181816a;
    }

    @Override // gsi.a
    public final jz0.d a0() {
        return gmf.b.d(this.f181816a);
    }

    @Override // qgi.d
    public final pgi.i b() {
        return (pgi.i) this.f181824n.get();
    }

    @Override // gsi.a
    public final ty0.c b0() {
        return i.g(this.f181816a);
    }

    @Override // gsi.a
    public final lz0.g c0() {
        return gmf.b.f(this.f181816a);
    }

    @Override // gsi.a
    public final i01.b d0() {
        return gsi.d.p(this.f181816a);
    }

    @Override // gsi.a
    public final d01.g e0() {
        return gmf.b.c(this.f181816a);
    }

    @Override // gsi.a
    public final Set l0() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(8);
        builderBuilderWithExpectedSize.addAll((Iterable) i.k(this.f181816a));
        builderBuilderWithExpectedSize.add(this.d.get());
        builderBuilderWithExpectedSize.add(this.e.get());
        builderBuilderWithExpectedSize.add(this.f181819g.get());
        builderBuilderWithExpectedSize.add(this.f181820h.get());
        builderBuilderWithExpectedSize.add(this.f181821j.get());
        builderBuilderWithExpectedSize.add(this.f181822l.get());
        return j6.a.g(this.f181823m, builderBuilderWithExpectedSize);
    }

    @Override // gsi.a
    public final py0.f m0() {
        return gmf.b.i(this.f181816a);
    }

    @Override // qgi.d
    public final void t(WebViewActivity webViewActivity) {
        c cVar = this.f181818c;
        t70.g gVarO = cVar.f133638b.o();
        s.j(gVarO);
        webViewActivity.E0 = gVarO;
        webViewActivity.F0 = ((nj0.d) cVar.f133639c).h();
    }
}
