package lc4;

import bq.i;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature_web_view.presentation.WebViewActivity;
import com.revolut.feature_web_view.presentation.WebViewContract$WebViewConfiguration;
import e4m.b;
import e4m.e;
import fc4.c;
import fsi.g;
import java.util.Set;
import l9f.z;
import qgi.d;
import vc.s;
import yy0.f;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f193788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WebViewContract$WebViewConfiguration f193789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f193790c;
    public final e d;
    public final e e;
    public final e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f193791g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f193792h;
    public final e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e f193793j;
    public final e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e f193794l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e f193795m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e f193796n;

    public a(c cVar, xoi.d dVar, WebViewContract$WebViewConfiguration webViewContract$WebViewConfiguration) {
        this.f193790c = cVar;
        this.f193788a = dVar;
        this.f193789b = webViewContract$WebViewConfiguration;
        int i = 7;
        this.d = b.b(new z(cVar, this, 0, i));
        this.e = b.b(new z(cVar, this, 1, i));
        this.f = b.b(new z(cVar, this, 3, i));
        this.f193791g = b.b(new z(cVar, this, 2, i));
        this.f193792h = b.b(new z(cVar, this, 4, i));
        this.i = b.b(new z(cVar, this, 6, i));
        this.f193793j = b.b(new z(cVar, this, 5, i));
        this.k = b.b(new z(cVar, this, 8, i));
        this.f193794l = b.b(new z(cVar, this, 7, i));
        this.f193795m = b.b(new z(cVar, this, 9, i));
        this.f193796n = b.b(new z(cVar, this, 10, i));
    }

    @Override // gsi.a
    public final f Q() {
        return i.j(this.f193788a);
    }

    @Override // gsi.a
    public final mz0.a V() {
        return i.p(this.f193788a);
    }

    @Override // gsi.a
    public final c01.d W() {
        return gmf.b.e(this.f193788a);
    }

    @Override // gsi.a
    public final py0.e X() {
        return gmf.b.g(this.f193788a);
    }

    @Override // gsi.a
    public final xy0.a Y() {
        return gmf.b.b(this.f193788a);
    }

    @Override // gsi.a
    public final h01.b Z() {
        return i.n(this.f193788a);
    }

    @Override // gsi.h
    public final g a() {
        return this.f193788a;
    }

    @Override // gsi.a
    public final jz0.d a0() {
        return gmf.b.d(this.f193788a);
    }

    @Override // qgi.d
    public final pgi.i b() {
        return (pgi.i) this.f193796n.get();
    }

    @Override // gsi.a
    public final ty0.c b0() {
        return i.g(this.f193788a);
    }

    @Override // gsi.a
    public final lz0.g c0() {
        return gmf.b.f(this.f193788a);
    }

    @Override // gsi.a
    public final i01.b d0() {
        return gsi.d.p(this.f193788a);
    }

    @Override // gsi.a
    public final d01.g e0() {
        return gmf.b.c(this.f193788a);
    }

    @Override // gsi.a
    public final Set l0() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(8);
        builderBuilderWithExpectedSize.addAll((Iterable) i.k(this.f193788a));
        builderBuilderWithExpectedSize.add(this.d.get());
        builderBuilderWithExpectedSize.add(this.e.get());
        builderBuilderWithExpectedSize.add(this.f193791g.get());
        builderBuilderWithExpectedSize.add(this.f193792h.get());
        builderBuilderWithExpectedSize.add(this.f193793j.get());
        builderBuilderWithExpectedSize.add(this.f193794l.get());
        return j6.a.g(this.f193795m, builderBuilderWithExpectedSize);
    }

    @Override // gsi.a
    public final py0.f m0() {
        return gmf.b.i(this.f193788a);
    }

    @Override // qgi.d
    public final void t(WebViewActivity webViewActivity) {
        c cVar = this.f193790c;
        t70.g gVarO = cVar.f133638b.o();
        s.j(gVarO);
        webViewActivity.E0 = gVarO;
        webViewActivity.F0 = ((nj0.d) cVar.f133639c).h();
    }
}
