package prk;

import com.google.common.collect.ImmutableSet;
import java.util.Set;
import z0h.s1;

/* JADX INFO: loaded from: classes12.dex */
public final class t implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fuk.e f239293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fuk.c f239294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s1 f239295c;
    public final wtk.i d;
    public final g0 e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f239296g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f239297h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f239298j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f239299l;

    public t(g0 g0Var, x xVar, wtk.i iVar, fuk.e eVar, fuk.c cVar, s1 s1Var) {
        this.e = g0Var;
        this.f239293a = eVar;
        this.f239294b = cVar;
        this.f239295c = s1Var;
        this.d = iVar;
        this.f = e4m.b.b(new ppd.i0(g0Var, this, 1, 24));
        this.f239296g = e4m.b.b(new ppd.i0(g0Var, this, 0, 24));
        this.f239297h = e4m.b.b(new ppd.i0(g0Var, this, 2, 24));
        this.i = e4m.b.b(new ppd.i0(g0Var, this, 4, 24));
        this.f239298j = e4m.b.b(new ppd.i0(g0Var, this, 3, 24));
        this.k = e4m.b.b(new ppd.i0(g0Var, this, 6, 24));
        this.f239299l = e4m.b.b(new ppd.i0(g0Var, this, 5, 24));
    }

    @Override // xki.e
    public final Set f() {
        yji.n nVar = (yji.n) this.f239298j.get();
        aah.h hVar = (aah.h) this.f239297h.get();
        a0k.b.n(hVar);
        return ImmutableSet.of((aah.h) nVar, hVar);
    }

    @Override // xki.e
    public final Set g() {
        yji.d dVar = (yji.d) this.f239296g.get();
        aah.i iVarD = ((u8h.b) this.e.d).d();
        vc.s.j(iVarD);
        return ImmutableSet.of((aah.g) dVar, a0k.b.l(iVarD, this.f239295c, (aah.h) this.f239297h.get()));
    }
}
