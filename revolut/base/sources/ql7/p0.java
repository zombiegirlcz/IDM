package ql7;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class p0 implements z7a.c, qji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k0 f247424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p0 f247425b = this;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f247426c = e4m.b.b(new p12.o(24));

    public p0(k0 k0Var) {
        this.f247424a = k0Var;
    }

    @Override // z7a.c
    public final z7a.a c() {
        return new eyd.u(this.f247424a, this.f247425b, 12);
    }

    @Override // dki.t
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // dki.q
    public final Set g() {
        return ImmutableSet.of();
    }
}
