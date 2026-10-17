package eyd;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final azd.e f130744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f130745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f130746c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f130747g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f130748h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f130749j;
    public final e4m.e k;

    public g(b0 b0Var, ViewController viewController, azd.e eVar) {
        this.f130744a = eVar;
        this.f130745b = e4m.b.b(e4m.c.a(viewController));
        int i = 29;
        this.f130746c = e4m.b.b(new ea2.p(b0Var, this, 2, i));
        this.d = e4m.b.b(new ea2.p(b0Var, this, 4, i));
        this.e = e4m.b.b(new ea2.p(b0Var, this, 5, i));
        this.f = e4m.b.b(new ea2.p(b0Var, this, 3, i));
        this.f130747g = e4m.b.b(new ea2.p(b0Var, this, 1, i));
        this.f130748h = e4m.b.b(new ea2.p(b0Var, this, 0, i));
        this.i = e4m.b.b(new ea2.p(b0Var, this, 6, i));
        this.f130749j = e4m.b.b(new ea2.p(b0Var, this, 7, i));
        this.k = e4m.b.b(new ea2.p(b0Var, this, 8, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f130749j.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f130748h.get(), (yji.d) this.i.get());
    }
}
