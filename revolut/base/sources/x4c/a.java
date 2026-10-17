package x4c;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.revolut_x_balances.impl.breakdown.RevXOrdersBreakdownScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;
import whc.t;
import yji.n;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewController f302844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RevXOrdersBreakdownScreenContract$InputData f302845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f302846c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f302847g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f302848h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f302849j;

    public a(b bVar, ViewController viewController, RevXOrdersBreakdownScreenContract$InputData revXOrdersBreakdownScreenContract$InputData) {
        this.f302846c = bVar;
        this.f302844a = viewController;
        this.f302845b = revXOrdersBreakdownScreenContract$InputData;
        int i = 25;
        this.d = e4m.b.b(new t(bVar, this, 2, i));
        this.e = e4m.b.b(new t(bVar, this, 3, i));
        this.f = e4m.b.b(new t(bVar, this, 1, i));
        this.f302847g = e4m.b.b(new t(bVar, this, 0, i));
        this.f302848h = e4m.b.b(new t(bVar, this, 6, i));
        this.i = e4m.b.b(new t(bVar, this, 5, i));
        this.f302849j = e4m.b.b(new t(bVar, this, 4, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((n) this.e.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f302847g.get());
    }
}
