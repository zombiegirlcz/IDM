package m2b;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class q implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b2b.e f201884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g4b.n f201885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g5b.d f201886c;
    public final v d;
    public final p e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f201887g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f201888h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f201889j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f201890l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f201891m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f201892n;

    public q(v vVar, p pVar, ViewController viewController, g4b.n nVar, g5b.d dVar, b2b.e eVar) {
        this.d = vVar;
        this.e = pVar;
        this.f201884a = eVar;
        this.f201885b = nVar;
        this.f201886c = dVar;
        this.f = e4m.b.b(e4m.c.a(viewController));
        this.f201887g = e4m.b.b(new ld1.q(vVar, pVar, this, 2, 17));
        int i = 17;
        this.f201888h = e4m.b.b(new ld1.q(vVar, pVar, this, 1, i));
        this.i = e4m.b.b(new ld1.q(vVar, pVar, this, 0, i));
        this.f201889j = e4m.b.b(new ld1.q(vVar, pVar, this, 5, i));
        this.k = e4m.b.b(new ld1.q(vVar, pVar, this, 6, i));
        this.f201890l = e4m.b.b(new ld1.q(vVar, pVar, this, 4, i));
        this.f201891m = e4m.b.b(new ld1.q(vVar, pVar, this, 3, i));
        this.f201892n = e4m.b.b(new ld1.q(vVar, pVar, this, 7, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f201889j.get(), (yji.n) this.f201891m.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.i.get(), (yji.d) c21.l.i(this.d.f201923c.i(), this.f201884a, (b2b.c) this.f201891m.get()), (yji.d) this.f201892n.get());
    }
}
