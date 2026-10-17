package ql7;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class n0 implements z7a.c, qji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k0 f247401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n0 f247402b = this;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f247403c;

    public n0(k0 k0Var) {
        this.f247401a = k0Var;
        this.f247403c = e4m.b.b(new qgk.f1(k0Var, 4));
    }

    @Override // z7a.c
    public final z7a.a c() {
        return new eyd.u(this.f247401a, this.f247402b, 11);
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
