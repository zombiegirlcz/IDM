package ql7;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.flow.BaseFlow;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class y0 implements qji.a, z7a.c, up7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k0 f247533a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f247535c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y0 f247534b = this;
    public final e4m.e d = e4m.b.b(new t(this, 3, 10));
    public final e4m.e e = e4m.b.b(new t(this, 2, 10));
    public final e4m.e f = e4m.b.b(new t(this, 1, 10));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f247536g = e4m.b.b(new t(this, 0, 10));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f247537h = e4m.b.b(new t(this, 4, 10));
    public final e4m.e i = e4m.b.b(new t(this, 5, 10));

    public y0(k0 k0Var, BaseFlow baseFlow) {
        this.f247533a = k0Var;
        this.f247535c = e4m.b.b(e4m.c.a(baseFlow));
    }

    @Override // up7.a
    public final z1 b() {
        return new z1(this.f247533a, this.f247534b, 1);
    }

    @Override // z7a.c
    public final z7a.a c() {
        return new eyd.u(this.f247533a, this.f247534b, 8);
    }

    @Override // dki.t
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // dki.q
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f247536g.get(), (yji.d) this.f247537h.get());
    }
}
