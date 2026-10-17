package ax4;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import mx4.a0;
import mx4.b0;
import mx4.c1;
import mx4.d0;
import mx4.d1;
import mx4.e1;
import mx4.f1;
import mx4.g1;
import mx4.h0;
import mx4.h1;
import mx4.i1;
import mx4.j0;
import mx4.j1;
import mx4.k0;
import mx4.k1;
import mx4.l0;
import mx4.l1;
import mx4.m0;
import mx4.n0;
import mx4.o0;
import mx4.p;
import mx4.p0;
import mx4.q;
import mx4.q0;
import mx4.r;
import mx4.s0;
import mx4.u;
import mx4.v0;
import mx4.x;
import mx4.x0;
import mx4.y;
import mx4.y0;
import mx4.z;
import mx4.z0;
import vc.s;

/* JADX INFO: loaded from: classes22.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f10866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f91.b f10867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l70.e f10868c;
    public final cri.b d;
    public final e e = this;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f10869g;

    public e(f91.b bVar, l70.e eVar, cri.b bVar2, Context context) {
        this.f10866a = context;
        this.f10867b = bVar;
        this.f10868c = eVar;
        this.d = bVar2;
        int i = 2;
        this.f = e4m.b.b(new aq1.e(this, 0, i));
        this.f10869g = e4m.b.b(new aq1.e(this, 1, i));
    }

    public final u a() {
        return new u(this.f10866a);
    }

    public final x b() {
        y yVar = new y();
        v0 v0Var = new v0(a());
        x0 x0Var = new x0();
        c91.a aVarA = this.f10867b.a();
        s.j(aVarA);
        p0 p0Var = new p0(aVarA);
        s0 s0Var = new s0();
        mx4.f fVar = new mx4.f(a());
        p pVar = new p();
        c1 c1Var = new c1();
        h1 h1Var = new h1();
        b0 b0Var = new b0();
        mx4.l lVar = new mx4.l();
        g1 g1Var = new g1();
        jx4.d.Companion.getClass();
        Context context = this.f10866a;
        Intrinsics.checkNotNullParameter(context, "context");
        mx4.n nVar = new mx4.n(new c90.c(context));
        j0 j0Var = new j0((mx4.k) this.f.get());
        r rVar = new r();
        l1 l1Var = new l1();
        a0 a0Var = new a0();
        i1 i1Var = new i1();
        l0 l0Var = new l0();
        f1 f1Var = new f1();
        y0 y0Var = new y0();
        j1 j1Var = new j1(a());
        mx4.i iVar = new mx4.i(a());
        z0 z0Var = new z0();
        k1 k1Var = new k1();
        mx4.a aVar = new mx4.a();
        o0 o0Var = new o0();
        n0 n0Var = new n0();
        h0 h0Var = new h0();
        d0 d0Var = new d0();
        d1 d1Var = new d1(a());
        m0 m0Var = new m0();
        k0 k0Var = new k0(a());
        e1 e1Var = new e1();
        q0 q0Var = new q0();
        mx4.s sVar = new mx4.s();
        w80.b bVarJ = this.f10868c.j();
        s.j(bVarJ);
        return new x(yVar, v0Var, x0Var, p0Var, s0Var, fVar, pVar, c1Var, h1Var, b0Var, lVar, g1Var, nVar, j0Var, rVar, l1Var, a0Var, i1Var, l0Var, f1Var, y0Var, j1Var, iVar, z0Var, k1Var, aVar, o0Var, n0Var, h0Var, d0Var, d1Var, m0Var, k0Var, e1Var, q0Var, sVar, new q(bVarJ));
    }

    public final z c() {
        return new z(b());
    }

    public final u d() {
        return a();
    }

    public final lx4.a e() {
        return (lx4.a) this.f10869g.get();
    }
}
