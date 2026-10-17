package cwi;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class k0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f109735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f109736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f109737c;
    public final e4m.e d;
    public final e4m.e e;

    public k0(h0 h0Var, p0 p0Var, ViewController viewController) {
        this.f109735a = h0Var;
        this.f109736b = e4m.b.b(e4m.c.a(viewController));
        this.f109737c = e4m.b.b(new d0(h0Var, this, 0, 4));
        this.d = e4m.b.b(new d0(h0Var, this, 2, 4));
        this.e = e4m.b.b(new d0(h0Var, this, 1, 4));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f109737c.get());
    }
}
