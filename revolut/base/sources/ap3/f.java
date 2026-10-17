package ap3;

import aah.i;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.corporate_events.impl.ui.screen.home.CorporateEventsHomeScreenContract$Input;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import hp3.y;
import java.util.Set;
import vc.s;
import z0h.q1;
import z0h.s1;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s1 f8070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScreenContentRecyclerView f8071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CorporateEventsHomeScreenContract$Input f8072c;
    public final h d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f8073g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f8074h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f8075j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f8076l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f8077m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f8078n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f8079p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f8080q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f8081r;

    public f(h hVar, e eVar, ViewController viewController, ScreenContentRecyclerView screenContentRecyclerView, CorporateEventsHomeScreenContract$Input corporateEventsHomeScreenContract$Input, s1 s1Var) {
        this.d = hVar;
        this.f8070a = s1Var;
        this.f8071b = screenContentRecyclerView;
        this.f8072c = corporateEventsHomeScreenContract$Input;
        int i = 17;
        this.e = e4m.b.b(new ak5.f(hVar, this, 0, i));
        this.f = e4m.b.b(new ak5.f(hVar, this, 2, i));
        this.f8073g = e4m.b.b(new ak5.f(hVar, this, 1, i));
        this.f8074h = e4m.b.b(e4m.c.a(viewController));
        int i2 = 17;
        this.i = e4m.b.b(new ak5.f(hVar, this, 5, i2));
        this.f8075j = e4m.b.b(new ak5.f(hVar, this, 4, i2));
        this.k = e4m.b.b(new ak5.f(hVar, this, 3, i2));
        this.f8076l = e4m.b.b(new ak5.f(hVar, this, 8, i2));
        this.f8077m = e4m.b.b(new ak5.f(hVar, this, 7, i2));
        this.f8078n = e4m.b.b(new ak5.f(hVar, this, 6, i2));
        this.o = e4m.b.b(new ak5.f(hVar, this, 10, i2));
        this.f8079p = e4m.b.b(new ak5.f(hVar, this, 9, i2));
        this.f8080q = e4m.b.b(new ak5.f(hVar, this, 12, i2));
        this.f8081r = e4m.b.b(new ak5.f(hVar, this, 11, i2));
    }

    public final y b() {
        l70.e eVar = this.d.e;
        l80.e eVarH = eVar.h();
        s.j(eVarH);
        j8b.f fVar = new j8b.f();
        l80.e eVarH2 = eVar.h();
        s.j(eVarH2);
        return new y(new j8b.h(eVarH, fVar, new j8b.e(eVarH2), new j8b.d(), new j8b.c()), (q1) this.f8080q.get());
    }

    @Override // xki.e
    public final Set f() {
        aah.h hVar = (aah.h) this.e.get();
        a0k.b.n(hVar);
        return ImmutableSet.of(hVar);
    }

    @Override // xki.e
    public final Set g() {
        i iVarD = ((u8h.b) this.d.f8090g).d();
        s.j(iVarD);
        return ImmutableSet.of((yji.d) a0k.b.l(iVarD, this.f8070a, (aah.h) this.e.get()), (yji.d) this.f8073g.get(), (yji.d) this.k.get(), (yji.d) this.f8078n.get(), (yji.d) this.f8079p.get());
    }
}
