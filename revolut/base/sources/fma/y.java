package fma;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class y implements sji.b {
    public final e4m.e A;
    public final e4m.e B;
    public final e4m.e C;
    public final e4m.e D;
    public final e4m.e E;
    public final e4m.e F;
    public final e4m.e G;
    public final e4m.e H;
    public final e4m.e I;
    public final e4m.e J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nkd.b f136235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mkd.g f136236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mcf.a f136237c;
    public final c0 d;
    public final d0 e;
    public final e4m.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f136238g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f136239h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f136240j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ehe.o f136241l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f136242m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ehe.o f136243n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f136244p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f136245q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f136246r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f136247s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f136248t;
    public final e4m.e u;
    public final e4m.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f136249w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e4m.e f136250x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e4m.e f136251y;
    public final e4m.e z;

    public y(c0 c0Var, d0 d0Var, BaseScreen baseScreen, mcf.a aVar, nkd.b bVar, mkd.g gVar) {
        this.d = c0Var;
        this.e = d0Var;
        this.f136235a = bVar;
        this.f136236b = gVar;
        this.f136237c = aVar;
        e4m.c cVarA = e4m.c.a(baseScreen);
        this.f = cVarA;
        this.f136238g = e4m.b.b(cVarA);
        this.f136239h = ehe.n.m(c0Var, d0Var, this, 2);
        this.i = ehe.n.m(c0Var, d0Var, this, 1);
        this.f136240j = ehe.n.m(c0Var, d0Var, this, 0);
        this.k = e4m.b.b(new ehe.o(c0Var, d0Var, this, 5, 17));
        int i = 17;
        this.f136241l = new ehe.o(c0Var, d0Var, this, 6, i);
        this.f136242m = ehe.n.m(c0Var, d0Var, this, 7);
        this.f136243n = new ehe.o(c0Var, d0Var, this, 8, i);
        this.o = ehe.n.m(c0Var, d0Var, this, 9);
        this.f136244p = e4m.b.b(this.f);
        this.f136245q = e4m.b.b(new ehe.o(c0Var, d0Var, this, 10, i));
        this.f136246r = ehe.n.m(c0Var, d0Var, this, 4);
        this.f136247s = ehe.n.m(c0Var, d0Var, this, 3);
        this.f136248t = ehe.n.m(c0Var, d0Var, this, 13);
        this.u = ehe.n.m(c0Var, d0Var, this, 12);
        this.v = ehe.n.m(c0Var, d0Var, this, 11);
        this.f136249w = ehe.n.m(c0Var, d0Var, this, 15);
        this.f136250x = ehe.n.m(c0Var, d0Var, this, 14);
        this.f136251y = ehe.n.m(c0Var, d0Var, this, 16);
        this.z = e4m.b.b(new ehe.o(c0Var, d0Var, this, 18, i));
        this.A = ehe.n.m(c0Var, d0Var, this, 17);
        this.B = ehe.n.m(c0Var, d0Var, this, 19);
        this.C = ehe.n.m(c0Var, d0Var, this, 20);
        this.D = ehe.n.m(c0Var, d0Var, this, 21);
        this.E = ehe.n.m(c0Var, d0Var, this, 22);
        this.F = ehe.n.m(c0Var, d0Var, this, 23);
        this.G = ehe.n.m(c0Var, d0Var, this, 27);
        this.H = e4m.b.b(new ehe.o(c0Var, d0Var, this, 26, i));
        this.I = e4m.b.b(new ehe.o(c0Var, d0Var, this, 25, i));
        this.J = e4m.b.b(new ehe.o(c0Var, d0Var, this, 24, i));
    }

    public final u96.b d() {
        l70.e eVar = this.d.f136052b;
        z70.a aVarF = eVar.f();
        vc.s.j(aVarF);
        c70.b bVar = new c70.b(aVarF, 2);
        z70.a aVarF2 = eVar.f();
        vc.s.j(aVarF2);
        return new u96.b(bVar, new smd.s(aVarF2));
    }

    public final nli.e e() {
        l70.e eVar = this.d.f136052b;
        zk0.b bVarL = eVar.l();
        vc.s.j(bVarL);
        t80.c cVar = (t80.c) this.f136242m.get();
        f80.a aVarX = eVar.x();
        vc.s.j(aVarX);
        return new nli.e(bVarL, cVar, aVarX);
    }

    @Override // sji.b
    public final Set f() {
        tla.f provider = (tla.f) this.f136251y.get();
        zna.a.Companion.getClass();
        Intrinsics.checkNotNullParameter(provider, "provider");
        vc.s.k(provider);
        return ImmutableSet.of(provider, (yji.n) this.A.get(), (yji.n) this.B.get(), (yji.n) this.C.get(), (yji.n) this.D.get(), (yji.n) this.E.get(), (yji.n) this.F.get());
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f136240j.get(), (yji.d) this.f136247s.get(), (yji.d) this.v.get(), (yji.d) this.f136250x.get());
    }
}
