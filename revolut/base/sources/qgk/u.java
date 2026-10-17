package qgk;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class u implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewController f246263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f246264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f246265c;
    public final e4m.e d;
    public final e4m.e e;

    public u(i0 i0Var, n0 n0Var, ViewController viewController) {
        this.f246264b = i0Var;
        this.f246263a = viewController;
        int i = 3;
        this.f246265c = e4m.b.b(new m(i0Var, this, 2, i));
        this.d = e4m.b.b(new m(i0Var, this, 1, i));
        this.e = e4m.b.b(new m(i0Var, this, 0, i));
    }

    public final dnk.l b() {
        return new dnk.l(this.f246264b.e.g(), 0);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
