package r7d;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class n implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BaseScreen f252142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f252143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f252144c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f252145g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f252146h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f252147j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f252148l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f252149m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f252150n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f252151p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f252152q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f252153r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f252154s;

    public n(l lVar, m mVar, BaseScreen baseScreen) {
        this.f252143b = lVar;
        this.f252144c = mVar;
        this.f252142a = baseScreen;
        this.d = e4m.b.b(e4m.c.a(baseScreen));
        this.e = e4m.b.b(new ppd.j(lVar, mVar, this, 2, 27));
        int i = 27;
        this.f = e4m.b.b(new ppd.j(lVar, mVar, this, 1, i));
        this.f252145g = e4m.b.b(new ppd.j(lVar, mVar, this, 0, i));
        this.f252146h = e4m.b.b(new ppd.j(lVar, mVar, this, 4, i));
        this.i = e4m.b.b(new ppd.j(lVar, mVar, this, 3, i));
        this.f252147j = e4m.b.b(new ppd.j(lVar, mVar, this, 7, i));
        this.k = e4m.b.b(new ppd.j(lVar, mVar, this, 8, i));
        this.f252148l = e4m.b.b(new ppd.j(lVar, mVar, this, 6, i));
        this.f252149m = e4m.b.b(new ppd.j(lVar, mVar, this, 5, i));
        this.f252150n = e4m.b.b(new ppd.j(lVar, mVar, this, 9, i));
        this.o = e4m.b.b(new ppd.j(lVar, mVar, this, 10, i));
        this.f252151p = e4m.b.b(new ppd.j(lVar, mVar, this, 13, i));
        this.f252152q = e4m.b.b(new ppd.j(lVar, mVar, this, 14, i));
        this.f252153r = e4m.b.b(new ppd.j(lVar, mVar, this, 12, i));
        this.f252154s = e4m.b.b(new ppd.j(lVar, mVar, this, 11, i));
    }

    @Override // sji.b
    public final Set f() {
        m mVar = this.f252144c;
        return ImmutableSet.of((yji.n) mVar.f252140g.get(), (yji.n) mVar.e.get(), (yji.n) this.i.get(), (yji.n) this.f252149m.get(), (yji.n) this.f252150n.get(), (yji.n) this.o.get(), new yji.n[0]);
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f252145g.get());
    }
}
