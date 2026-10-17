package p8a;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class t0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f234088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f234089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f234090c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f234091g;

    public t0(d0 d0Var, u0 u0Var, ViewController viewController) {
        this.f234088a = d0Var;
        this.f234089b = e4m.b.b(e4m.c.a(viewController));
        this.f234090c = e4m.b.b(new m(d0Var, this, 2, 15));
        this.d = e4m.b.b(new m(d0Var, this, 1, 15));
        this.e = e4m.b.b(new m(d0Var, this, 0, 15));
        this.f = e4m.b.b(new m(d0Var, this, 4, 15));
        this.f234091g = e4m.b.b(new m(d0Var, this, 3, 15));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
