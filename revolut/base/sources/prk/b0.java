package prk;

import com.google.common.collect.ImmutableSet;
import java.util.Set;
import z0h.s1;

/* JADX INFO: loaded from: classes12.dex */
public final class b0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s1 f239062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g0 f239063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f239064c;
    public final e4m.e d;
    public final e4m.e e;

    public b0(g0 g0Var, s1 s1Var) {
        this.f239063b = g0Var;
        this.f239062a = s1Var;
        this.f239064c = e4m.b.b(new ppd.i0(g0Var, this, 0, 27));
        this.d = e4m.b.b(new ppd.i0(g0Var, this, 2, 27));
        this.e = e4m.b.b(new ppd.i0(g0Var, this, 1, 27));
    }

    @Override // xki.e
    public final Set f() {
        aah.h hVar = (aah.h) this.f239064c.get();
        a0k.b.n(hVar);
        return ImmutableSet.of(hVar);
    }

    @Override // xki.e
    public final Set g() {
        aah.i iVarD = ((u8h.b) this.f239063b.d).d();
        vc.s.j(iVarD);
        return ImmutableSet.of(a0k.b.l(iVarD, this.f239062a, (aah.h) this.f239064c.get()));
    }
}
