package oda;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.pockets.impl.details_v2.pocket_details.PocketDetailsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import fmf.o0;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class k implements iea.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final agk.c f224368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PocketDetailsScreenContract$InputData f224369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o0 f224370c;
    public final o d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f224371g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f224372h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f224373j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f224374l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f224375m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f224376n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f224377p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f224378q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f224379r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f224380s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f224381t;
    public final e4m.e u;
    public final e4m.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f224382w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e4m.e f224383x;

    public k(o oVar, l lVar, agk.c cVar, ViewController viewController, PocketDetailsScreenContract$InputData pocketDetailsScreenContract$InputData, o0 o0Var) {
        this.d = oVar;
        this.f224368a = cVar;
        this.f224369b = pocketDetailsScreenContract$InputData;
        this.f224370c = o0Var;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 19;
        this.f = e4m.b.b(new o41.b(oVar, this, 2, i));
        this.f224371g = e4m.b.b(new o41.b(oVar, this, 1, i));
        this.f224372h = e4m.b.b(new o41.b(oVar, this, 0, i));
        this.i = e4m.b.b(new o41.b(oVar, this, 5, i));
        this.f224373j = e4m.b.b(new o41.b(oVar, this, 4, i));
        this.k = e4m.b.b(new o41.b(oVar, this, 3, i));
        this.f224374l = e4m.b.b(new o41.b(oVar, this, 8, i));
        this.f224375m = e4m.b.b(new o41.b(oVar, this, 7, i));
        this.f224376n = e4m.b.b(new o41.b(oVar, this, 6, i));
        this.o = e4m.b.b(new o41.b(oVar, this, 10, i));
        this.f224377p = e4m.b.b(new o41.b(oVar, this, 9, i));
        this.f224378q = e4m.b.b(new o41.b(oVar, this, 12, i));
        this.f224379r = e4m.b.b(new o41.b(oVar, this, 11, i));
        this.f224380s = e4m.b.b(new o41.b(oVar, this, 13, i));
        this.f224381t = e4m.b.b(new o41.b(oVar, this, 14, i));
        this.u = e4m.b.b(new o41.b(oVar, this, 15, i));
        this.v = e4m.b.b(new o41.b(oVar, this, 17, i));
        this.f224382w = e4m.b.b(new o41.b(oVar, this, 18, i));
        this.f224383x = e4m.b.b(new o41.b(oVar, this, 16, i));
    }

    @Override // xki.e
    public final Set f() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(6);
        builderBuilderWithExpectedSize.add(this.f224376n.get());
        builderBuilderWithExpectedSize.add(this.f224377p.get());
        builderBuilderWithExpectedSize.add(this.f224379r.get());
        builderBuilderWithExpectedSize.addAll((Iterable) this.f224380s.get());
        builderBuilderWithExpectedSize.add(this.f224381t.get());
        return j6.a.g(this.u, builderBuilderWithExpectedSize);
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f224372h.get(), (yji.d) this.k.get());
    }
}
