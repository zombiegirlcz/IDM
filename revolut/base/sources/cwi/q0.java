package cwi;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class q0 implements qji.a, uyi.a, tyi.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f109759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q0 f109760b = this;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f109761c = e4m.b.b(new a96.b(26));

    public q0(h0 h0Var) {
        this.f109759a = h0Var;
    }

    @Override // tyi.a
    public final e1 c() {
        return new e1(this.f109759a, this.f109760b, 0);
    }

    @Override // dki.t
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // dki.q
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // uyi.a
    public final g1 q() {
        return new g1(this.f109759a, this.f109760b, 1);
    }
}
