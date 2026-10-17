package ql7;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.flow.BaseFlow;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class u implements z7a.c, qji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k0 f247479a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f247481c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f247480b = this;
    public final e4m.e d = e4m.b.b(new t(this, 3, 0));
    public final e4m.e e = e4m.b.b(new t(this, 2, 0));
    public final e4m.e f = e4m.b.b(new t(this, 1, 0));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f247482g = e4m.b.b(new t(this, 0, 0));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f247483h = e4m.b.b(new t(this, 4, 0));
    public final e4m.e i = e4m.b.b(new t(this, 5, 0));

    public u(k0 k0Var, BaseFlow baseFlow) {
        this.f247479a = k0Var;
        this.f247481c = e4m.b.b(e4m.c.a(baseFlow));
    }

    @Override // z7a.c
    public final z7a.a c() {
        return new eyd.u(this.f247479a, this.f247480b, 14);
    }

    @Override // dki.t
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // dki.q
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f247482g.get(), (yji.d) this.f247483h.get());
    }
}
