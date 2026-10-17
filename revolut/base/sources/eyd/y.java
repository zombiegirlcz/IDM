package eyd;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class y implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p0e.e f130840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f130841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f130842c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f130843g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f130844h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f130845j;
    public final e4m.e k;

    public y(b0 b0Var, x xVar, ViewController viewController, p0e.e eVar) {
        this.f130840a = eVar;
        this.f130841b = e4m.b.b(e4m.c.a(viewController));
        this.f130842c = e4m.b.b(new j(b0Var, this, 2, 5));
        this.d = e4m.b.b(new j(b0Var, this, 4, 5));
        this.e = e4m.b.b(new j(b0Var, this, 5, 5));
        this.f = e4m.b.b(new j(b0Var, this, 3, 5));
        this.f130843g = e4m.b.b(new j(b0Var, this, 1, 5));
        this.f130844h = e4m.b.b(new j(b0Var, this, 0, 5));
        this.i = e4m.b.b(new j(b0Var, this, 6, 5));
        this.f130845j = e4m.b.b(new j(b0Var, this, 7, 5));
        this.k = e4m.b.b(new j(b0Var, this, 8, 5));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f130845j.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f130844h.get(), (yji.d) this.i.get());
    }
}
