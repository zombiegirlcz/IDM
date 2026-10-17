package va;

import com.feature.user.details.impl.ui.details.UserDetailsControllerContract$InputData;
import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;
import us6.r2;
import vc.s;
import yji.n;

/* JADX INFO: loaded from: classes16.dex */
public final class b implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserDetailsControllerContract$InputData f287098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f287099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.c f287100c;
    public final e4m.e d;
    public final e4m.e e;
    public final r2 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f287101g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r2 f287102h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f287103j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f287104l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f287105m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f287106n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f287107p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f287108q;

    public b(a aVar, c cVar, ViewController viewController, UserDetailsControllerContract$InputData userDetailsControllerContract$InputData) {
        this.f287099b = aVar;
        this.f287098a = userDetailsControllerContract$InputData;
        e4m.c cVarA = e4m.c.a(viewController);
        this.f287100c = cVarA;
        this.d = e4m.b.b(cVarA);
        int i = 10;
        this.e = e4m.b.b(new r2(aVar, this, 2, i));
        this.f = new r2(aVar, this, 3, i);
        this.f287101g = e4m.b.b(new r2(aVar, this, 4, i));
        this.f287102h = new r2(aVar, this, 5, i);
        this.i = e4m.b.b(new r2(aVar, this, 6, i));
        this.f287103j = e4m.b.b(this.f287100c);
        this.k = e4m.b.b(new r2(aVar, this, 7, i));
        this.f287104l = e4m.b.b(new r2(aVar, this, 1, i));
        this.f287105m = e4m.b.b(new r2(aVar, this, 0, i));
        this.f287106n = e4m.b.b(new r2(aVar, this, 8, i));
        this.o = e4m.b.b(new r2(aVar, this, 10, i));
        this.f287107p = e4m.b.b(new r2(aVar, this, 11, i));
        this.f287108q = e4m.b.b(new r2(aVar, this, 9, i));
    }

    public final u96.b b() {
        l70.e eVar = this.f287099b.f287086j;
        z70.a aVarF = eVar.f();
        s.j(aVarF);
        c70.b bVar = new c70.b(aVarF, 2);
        z70.a aVarF2 = eVar.f();
        s.j(aVarF2);
        return new u96.b(bVar, new smd.s(aVarF2));
    }

    public final nli.e c() {
        l70.e eVar = this.f287099b.f287086j;
        zk0.b bVarL = eVar.l();
        s.j(bVarL);
        t80.c cVar = (t80.c) this.f287101g.get();
        f80.a aVarX = eVar.x();
        s.j(aVarX);
        return new nli.e(bVarL, cVar, aVarX);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((n) this.f287106n.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f287105m.get());
    }
}
