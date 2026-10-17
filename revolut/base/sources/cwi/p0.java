package cwi;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class p0 implements xki.c, vwi.a, txi.a, zwi.a, pxi.a, hyi.b, uyi.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f109756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p0 f109757b = this;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f109758c;

    public p0(h0 h0Var) {
        this.f109756a = h0Var;
        this.f109758c = e4m.b.b(new o0(h0Var, 0));
    }

    @Override // pxi.a
    public final x0 b() {
        return new x0(this.f109756a, this.f109757b, 1);
    }

    @Override // vwi.a
    public final t0 c() {
        return new t0(this.f109756a, this.f109757b, 1);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // hyi.b
    public final hyi.a j() {
        return new b1(this.f109756a, this.f109757b, 0);
    }

    @Override // uyi.a
    public final g1 q() {
        return new g1(this.f109756a, this.f109757b, 2);
    }

    @Override // zwi.a
    public final v0 s() {
        return new v0(this.f109756a, this.f109757b, 1);
    }

    @Override // txi.a
    public final z0 y() {
        return new z0(this.f109756a, this.f109757b, 1);
    }
}
