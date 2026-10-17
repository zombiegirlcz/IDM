package p8a;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class w0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f234113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f234114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f234115c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f234116g;

    public w0(d0 d0Var, n nVar, ViewController viewController) {
        this.f234113a = d0Var;
        this.f234114b = nVar;
        this.f234115c = e4m.b.b(e4m.c.a(viewController));
        int i = 18;
        this.d = e4m.b.b(new m(d0Var, this, 2, i));
        this.e = e4m.b.b(new m(d0Var, this, 1, i));
        this.f = e4m.b.b(new m(d0Var, this, 0, i));
        this.f234116g = e4m.b.b(new m(d0Var, this, 3, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f234114b.f.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get());
    }
}
