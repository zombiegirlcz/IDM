package ljl;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes13.dex */
public final class u0 implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dql.a f196107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewController f196108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q0 f196109c;
    public final u0 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f196110g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f196111h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f196112j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f196113l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f196114m;

    public u0(q0 q0Var, dql.a aVar, ViewController viewController) {
        this.f196109c = q0Var;
        this.f196107a = aVar;
        this.f196108b = viewController;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 0;
        this.f = e4m.b.b(new t0(q0Var, this, 1, i));
        this.f196110g = e4m.b.b(new t0(q0Var, this, 0, i));
        this.f196111h = e4m.g.a(new t0(q0Var, this, 4, i));
        this.i = e4m.b.b(new t0(q0Var, this, 5, i));
        this.f196112j = e4m.b.b(new t0(q0Var, this, 6, i));
        this.k = e4m.b.b(new t0(q0Var, this, 3, i));
        this.f196113l = e4m.b.b(new t0(q0Var, this, 2, i));
        this.f196114m = e4m.b.b(new t0(q0Var, this, 7, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f196110g.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
