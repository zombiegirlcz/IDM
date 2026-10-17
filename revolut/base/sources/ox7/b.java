package ox7;

import com.google.common.collect.ImmutableSet;
import com.google.firebase.messaging.t;
import iri.j;
import java.util.Collection;
import mp.r;
import oai.s;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements hri.a, ui3.a {
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
    public final e4m.e K;
    public final e4m.e L;
    public final e4m.e M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hri.b f230660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l70.e f230661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ex7.a f230662c;
    public final xmg.a d;
    public final b e = this;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f230663g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f230664h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f230665j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f230666l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f230667m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f230668n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f230669p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f230670q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f230671r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f230672s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f230673t;
    public final e4m.e u;
    public final e4m.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f230674w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e4m.e f230675x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e4m.e f230676y;
    public final e4m.e z;

    public b(hri.b bVar, l70.e eVar, ex7.a aVar, xmg.a aVar2) {
        this.f230660a = bVar;
        this.f230661b = eVar;
        this.f230662c = aVar;
        this.d = aVar2;
        int i = 14;
        this.f = e4m.b.b(new s(this, 0, i));
        this.f230663g = e4m.b.b(new s(this, 1, i));
        this.f230664h = e4m.b.b(new s(this, 2, i));
        this.i = e4m.b.b(new s(this, 5, i));
        this.f230665j = e4m.b.b(new s(this, 6, i));
        this.k = e4m.b.b(new s(this, 4, i));
        this.f230666l = e4m.b.b(new s(this, 8, i));
        this.f230667m = e4m.b.b(new s(this, 7, i));
        this.f230668n = e4m.b.b(new s(this, 3, i));
        this.o = e4m.b.b(new s(this, 9, i));
        this.f230669p = e4m.b.b(new s(this, 10, i));
        this.f230670q = e4m.b.b(new s(this, 11, i));
        this.f230671r = e4m.b.b(new s(this, 12, i));
        this.f230672s = e4m.b.b(new s(this, 13, i));
        this.f230673t = e4m.b.b(new s(this, 14, i));
        this.u = e4m.b.b(new s(this, 15, i));
        this.v = e4m.b.b(new s(this, 17, i));
        this.f230674w = e4m.b.b(new s(this, 18, i));
        this.f230675x = e4m.b.b(new s(this, 16, i));
        this.f230676y = e4m.b.b(new s(this, 19, i));
        this.z = e4m.b.b(new s(this, 21, i));
        this.A = e4m.b.b(new s(this, 22, i));
        this.B = e4m.b.b(new s(this, 23, i));
        this.C = e4m.b.b(new s(this, 24, i));
        this.D = e4m.b.b(new s(this, 25, i));
        this.E = e4m.b.b(new s(this, 26, i));
        this.F = e4m.b.b(new s(this, 27, i));
        this.G = e4m.b.b(new s(this, 28, i));
        this.H = e4m.b.b(new s(this, 20, i));
        this.I = e4m.b.b(new s(this, 29, i));
        this.J = e4m.b.b(new s(this, 30, i));
        this.K = e4m.b.b(new s(this, 31, i));
        this.L = e4m.b.b(new s(this, 32, i));
        this.M = e4m.b.b(new s(this, 33, i));
    }

    @Override // ui3.a
    public final b05.a G() {
        return new b05.a(this.e, 4);
    }

    public final t a() {
        return new t((cn.e) this.f230673t.get(), (ym.d) this.f230674w.get(), (um.c) this.u.get(), (ifm.b) this.f.get());
    }

    public final qm.e d() {
        return new qm.e((um.c) this.u.get());
    }

    @Override // hri.a
    public final j e() {
        return (j) this.f230663g.get();
    }

    @Override // hri.a
    public final ifm.b f() {
        return (ifm.b) this.f.get();
    }

    public final jn.e h() {
        ln.a aVar = (ln.a) this.f230672s.get();
        hn.h hVar = (hn.h) this.f230676y.get();
        t70.g gVarO = this.f230661b.o();
        vc.s.j(gVarO);
        return new jn.e(aVar, hVar, new r(gVarO), ImmutableSet.copyOf((Collection) jn.c.a()));
    }
}
