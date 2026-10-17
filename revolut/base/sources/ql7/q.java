package ql7;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.flow.BaseFlow;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class q implements z7a.c, up7.a, qji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k0 f247430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f247431b = this;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f247432c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f247433g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f247434h;
    public final e4m.e i;

    public q(k0 k0Var, BaseFlow baseFlow) {
        this.f247430a = k0Var;
        this.f247432c = e4m.b.b(e4m.c.a(baseFlow));
        int i = 28;
        this.d = e4m.b.b(new prk.u(this, 3, i));
        this.e = e4m.b.b(new prk.u(this, 2, i));
        this.f = e4m.b.b(new prk.u(this, 1, i));
        this.f247433g = e4m.b.b(new prk.u(this, 0, i));
        this.f247434h = e4m.b.b(new prk.u(this, 4, i));
        this.i = e4m.b.b(new prk.u(this, 5, i));
    }

    @Override // up7.a
    public final z1 b() {
        return new z1(this.f247430a, this.f247431b, 0);
    }

    @Override // z7a.c
    public final z7a.a c() {
        return new eyd.u(this.f247430a, this.f247431b, 10);
    }

    @Override // dki.t
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // dki.q
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f247433g.get(), (yji.d) this.f247434h.get());
    }
}
