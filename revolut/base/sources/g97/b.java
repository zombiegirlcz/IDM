package g97;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.globalsearch.models.GlobalSearchContext;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;
import vc.s;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements m97.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GlobalSearchContext f141467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f141468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.c f141469c;
    public final e4m.e d;
    public final e4m.e e;
    public final fta.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f141470g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final fta.e f141471h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f141472j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f141473l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f141474m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f141475n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f141476p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f141477q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f141478r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f141479s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f141480t;

    public b(a aVar, ViewController viewController, GlobalSearchContext globalSearchContext) {
        this.f141468b = aVar;
        this.f141467a = globalSearchContext;
        e4m.c cVarA = e4m.c.a(viewController);
        this.f141469c = cVarA;
        this.d = e4m.b.b(cVarA);
        int i = 14;
        this.e = e4m.b.b(new fta.e(aVar, this, 2, i));
        this.f = new fta.e(aVar, this, 3, i);
        this.f141470g = e4m.b.b(new fta.e(aVar, this, 4, i));
        this.f141471h = new fta.e(aVar, this, 5, i);
        this.i = e4m.b.b(new fta.e(aVar, this, 6, i));
        this.f141472j = e4m.b.b(this.f141469c);
        this.k = e4m.b.b(new fta.e(aVar, this, 7, i));
        this.f141473l = e4m.b.b(new fta.e(aVar, this, 1, i));
        this.f141474m = e4m.b.b(new fta.e(aVar, this, 0, i));
        this.f141475n = e4m.b.b(new fta.e(aVar, this, 10, i));
        this.o = e4m.b.b(new fta.e(aVar, this, 9, i));
        this.f141476p = e4m.b.b(new fta.e(aVar, this, 8, i));
        this.f141477q = e4m.b.b(new fta.e(aVar, this, 11, i));
        this.f141478r = e4m.b.b(new fta.e(aVar, this, 13, i));
        this.f141479s = e4m.b.b(new fta.e(aVar, this, 12, i));
        this.f141480t = e4m.b.b(new fta.e(aVar, this, 14, i));
    }

    public final u96.b b() {
        l70.e eVar = this.f141468b.f141463a;
        z70.a aVarF = eVar.f();
        s.j(aVarF);
        c70.b bVar = new c70.b(aVarF, 2);
        z70.a aVarF2 = eVar.f();
        s.j(aVarF2);
        return new u96.b(bVar, new smd.s(aVarF2));
    }

    public final nli.e c() {
        l70.e eVar = this.f141468b.f141463a;
        zk0.b bVarL = eVar.l();
        s.j(bVarL);
        t80.c cVar = (t80.c) this.f141470g.get();
        f80.a aVarX = eVar.x();
        s.j(aVarX);
        return new nli.e(bVarL, cVar, aVarX);
    }

    @Override // xki.e
    public final Set f() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(2);
        builderBuilderWithExpectedSize.add(this.f141477q.get());
        builderBuilderWithExpectedSize.addAll((Iterable) this.f141479s.get());
        return builderBuilderWithExpectedSize.build();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f141474m.get(), (yji.d) this.f141476p.get());
    }
}
