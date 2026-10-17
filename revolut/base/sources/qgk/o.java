package qgk;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class o implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f246168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f246169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f246170c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f246171g;

    public o(i0 i0Var, j jVar, ViewController viewController) {
        this.f246168a = i0Var;
        this.f246169b = e4m.b.b(new ppd.j(i0Var, jVar, this, 1, 11));
        int i = 11;
        this.f246170c = e4m.b.b(new ppd.j(i0Var, jVar, this, 0, i));
        this.d = e4m.b.b(new ppd.j(i0Var, jVar, this, 3, i));
        this.e = e4m.b.b(e4m.c.a(viewController));
        this.f = e4m.b.b(new ppd.j(i0Var, jVar, this, 4, i));
        this.f246171g = e4m.b.b(new ppd.j(i0Var, jVar, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f246170c.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
