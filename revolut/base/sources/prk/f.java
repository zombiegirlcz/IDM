package prk;

import com.google.common.collect.ImmutableSet;
import java.util.Set;
import z0h.s1;

/* JADX INFO: loaded from: classes12.dex */
public final class f implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s1 f239103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rtk.d f239104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g0 f239105c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public f(g0 g0Var, x xVar, rtk.d dVar, s1 s1Var) {
        this.f239105c = g0Var;
        this.f239103a = s1Var;
        this.f239104b = dVar;
        this.d = e4m.b.b(new ppd.i0(g0Var, this, 0, 17));
        this.e = e4m.b.b(new ppd.i0(g0Var, this, 2, 17));
        this.f = e4m.b.b(new ppd.i0(g0Var, this, 1, 17));
    }

    @Override // xki.e
    public final Set f() {
        aah.h hVar = (aah.h) this.d.get();
        a0k.b.n(hVar);
        return ImmutableSet.of(hVar);
    }

    @Override // xki.e
    public final Set g() {
        aah.i iVarD = ((u8h.b) this.f239105c.d).d();
        vc.s.j(iVarD);
        return ImmutableSet.of(a0k.b.l(iVarD, this.f239103a, (aah.h) this.d.get()));
    }
}
