package com.fourthline.orca.internal;

import androidx.content.NavHostController;
import com.fourthline.core.internal.TimestampProvider;
import com.fourthline.orca.internal.eo;
import com.fourthline.orca.internal.kq;
import com.google.common.base.Optional;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public abstract class ud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final e4m.e f34001a = e4m.c.a(Optional.absent());

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private lh f34002a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private tg1 f34003b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private mg1 f34004c;
        private l1 d;

        public /* synthetic */ a(int i) {
            this();
        }

        public gh0 a() {
            vc.s.h(this.f34002a, lh.class);
            if (this.f34003b == null) {
                this.f34003b = new tg1();
            }
            if (this.f34004c == null) {
                this.f34004c = new mg1();
            }
            if (this.d == null) {
                this.d = new l1();
            }
            return new f(this.f34002a, this.f34003b, this.f34004c, this.d);
        }

        private a() {
        }

        public a a(lh lhVar) {
            lhVar.getClass();
            this.f34002a = lhVar;
            return this;
        }
    }

    public static final class b implements eo.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f f34005a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final e f34006b;

        public /* synthetic */ b(f fVar, e eVar, int i) {
            this(fVar, eVar);
        }

        @Override // com.fourthline.orca.internal.eo.a
        public eo build() {
            return new c(this.f34005a, this.f34006b, new vn(), new eg(), new v41());
        }

        private b(f fVar, e eVar) {
            this.f34005a = fVar;
            this.f34006b = eVar;
        }
    }

    public static final class d implements kq.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f f34023a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private com.fourthline.orca.internal.d f34024b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private t80 f34025c;

        public /* synthetic */ d(f fVar, int i) {
            this(fVar);
        }

        @Override // com.fourthline.orca.internal.cj0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d a(com.fourthline.orca.internal.d dVar) {
            dVar.getClass();
            this.f34024b = dVar;
            return this;
        }

        private d(f fVar) {
            this.f34023a = fVar;
        }

        @Override // com.fourthline.orca.internal.cj0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public kq build() {
            vc.s.h(this.f34024b, com.fourthline.orca.internal.d.class);
            vc.s.h(this.f34025c, t80.class);
            return new e(this.f34023a, this.f34024b, new dq0(), new m8(), new ow(), new xd(), new vy0(), new ga(), this.f34025c, new ol(), new ln(), new nn());
        }

        @Override // com.fourthline.orca.internal.cj0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d a(t80 t80Var) {
            t80Var.getClass();
            this.f34025c = t80Var;
            return this;
        }
    }

    public static final class e implements kq {
        e4m.e A;
        e4m.e B;
        e4m.e C;
        e4m.e D;
        e4m.e E;
        e4m.e F;
        e4m.e G;
        e4m.e H;
        e4m.e I;
        e4m.e J;
        e4m.e K;
        e4m.e L;
        e4m.e M;
        e4m.e N;
        e4m.e O;
        e4m.e P;
        e4m.e Q;
        e4m.e R;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ln f34026a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ol f34027b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final nn f34028c;
        private final dq0 d;
        private final ga e;
        private final f f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final e f34029g = this;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        e4m.e f34030h;
        e4m.e i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        e4m.e f34031j;
        e4m.e k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        e4m.e f34032l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        e4m.e f34033m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        e4m.e f34034n;
        e4m.e o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        e4m.e f34035p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        e4m.e f34036q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        e4m.e f34037r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        e4m.e f34038s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        e4m.e f34039t;
        e4m.e u;
        e4m.e v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        e4m.e f34040w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        e4m.e f34041x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        e4m.e f34042y;
        e4m.e z;

        public e(f fVar, com.fourthline.orca.internal.d dVar, dq0 dq0Var, m8 m8Var, ow owVar, xd xdVar, vy0 vy0Var, ga gaVar, t80 t80Var, ol olVar, ln lnVar, nn nnVar) {
            this.f = fVar;
            this.f34026a = lnVar;
            this.f34027b = olVar;
            this.f34028c = nnVar;
            this.d = dq0Var;
            this.e = gaVar;
            a(dVar, dq0Var, m8Var, owVar, xdVar, vy0Var, gaVar, t80Var, olVar, lnVar, nnVar);
            b(dVar, dq0Var, m8Var, owVar, xdVar, vy0Var, gaVar, t80Var, olVar, lnVar, nnVar);
        }

        @Override // com.fourthline.orca.internal.kq
        public l31 D() {
            return new l31((o80) this.v.get(), E(), (c80) this.f34041x.get());
        }

        public bg E() {
            return mn.a(this.f34026a, Optional.of((bg) this.f34040w.get()));
        }

        public wd1 F() {
            return ul.a(this.f34027b, (wm) this.D.get());
        }

        public wd1 G() {
            return rl.a(this.f34027b, (wm) this.D.get());
        }

        @Override // com.fourthline.orca.internal.bj0
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public ml a() {
            return (ml) this.f.e.get();
        }

        public aq0 I() {
            return ia.a(this.e, (o80) this.v.get(), (r70) this.f.d.get(), (fh0) this.i.get(), J(), (v10) this.H.get());
        }

        public bq0 J() {
            return eq0.a(this.d, (fq0) this.L.get(), (tp0) this.M.get(), (CoroutineScope) this.o.get());
        }

        @Override // com.fourthline.orca.internal.kq
        public eo.a c() {
            return new b(this.f, this.f34029g, 0);
        }

        @Override // com.fourthline.orca.internal.bj0
        public sy h() {
            return (sy) this.f.f34048j.get();
        }

        @Override // com.fourthline.orca.internal.bj0
        public v90 j() {
            return (v90) this.f34037r.get();
        }

        @Override // com.fourthline.orca.internal.bj0
        public iq0 k() {
            return (iq0) this.f34035p.get();
        }

        @Override // com.fourthline.orca.internal.bj0
        public NavHostController o() {
            return (NavHostController) this.f34031j.get();
        }

        @Override // com.fourthline.orca.internal.bj0
        public ij0 q() {
            return (ij0) this.f34030h.get();
        }

        @Override // com.fourthline.orca.internal.bj0
        public r71 s() {
            return (r71) this.f34032l.get();
        }

        @Override // com.fourthline.orca.internal.bj0
        public ry0 x() {
            return (ry0) this.u.get();
        }

        @Override // com.fourthline.orca.internal.bj0
        public q70 y() {
            return (q70) this.f34033m.get();
        }

        private void b(com.fourthline.orca.internal.d dVar, dq0 dq0Var, m8 m8Var, ow owVar, xd xdVar, vy0 vy0Var, ga gaVar, t80 t80Var, ol olVar, ln lnVar, nn nnVar) {
            this.G = e4m.b.b(xy0.a(vy0Var, this.f34036q, this.F));
            this.H = e4m.b.b(wy0.a(vy0Var, this.f34036q, this.F));
            this.I = e4m.b.b(pl.a(olVar, this.f.e));
            this.J = e4m.b.b(yl.a(olVar, this.f.d));
            this.K = e4m.b.b(xl.a(olVar, this.f.e));
            this.L = e4m.b.b(pw.a(owVar));
            e4m.e eVarB = e4m.b.b(rw.a(owVar, this.f.f34047h));
            this.M = eVarB;
            this.N = eq0.a(dq0Var, this.L, eVarB, this.o);
            this.O = e4m.b.b(qw.a(owVar, this.f.f34047h));
            this.P = e4m.b.b(sw.a(owVar));
            this.Q = e4m.b.b(w.a(dVar));
            this.R = e4m.b.b(u8.a(m8Var));
        }

        private void a(com.fourthline.orca.internal.d dVar, dq0 dq0Var, m8 m8Var, ow owVar, xd xdVar, vy0 vy0Var, ga gaVar, t80 t80Var, ol olVar, ln lnVar, nn nnVar) {
            this.f34030h = e4m.b.b(v.a(dVar, this.f.d));
            this.i = e4m.b.b(s.a(dVar, this.f.f));
            e4m.e eVarB = e4m.b.b(w80.a(t80Var));
            this.f34031j = eVarB;
            this.k = e4m.b.b(u80.a(t80Var, eVarB));
            e4m.e eVarB2 = e4m.b.b(y80.a(t80Var));
            this.f34032l = eVarB2;
            f fVar = this.f;
            this.f34033m = e4m.b.b(v80.a(t80Var, fVar.d, this.i, this.k, eVarB2, fVar.i));
            e4m.e eVarB3 = e4m.b.b(x.a(dVar));
            this.f34034n = eVarB3;
            e4m.e eVarB4 = e4m.b.b(k.a(dVar, eVarB3));
            this.o = eVarB4;
            this.f34035p = e4m.b.b(tw.a(owVar, eVarB4));
            e4m.e eVarB5 = e4m.b.b(j.a(dVar));
            this.f34036q = eVarB5;
            this.f34037r = e4m.b.b(q.a(dVar, eVarB5, this.i, this.o));
            this.f34038s = e4m.b.b(yd.a(xdVar, this.f34036q, this.o));
            e4m.e eVarB6 = e4m.b.b(zd.a(xdVar));
            this.f34039t = eVarB6;
            this.u = e4m.b.b(he.a(xdVar, this.f34038s, eVarB6, this.f.d, this.o));
            this.v = e4m.b.b(x80.a(t80Var, this.f34033m, this.o));
            this.f34040w = e4m.b.b(ql.a(olVar));
            this.f34041x = e4m.b.b(sl.a(olVar, this.f.e));
            e4m.e eVarA = g.a(this.f34040w);
            this.f34042y = eVarA;
            this.z = mn.a(lnVar, eVarA);
            this.A = e4m.b.b(h.a(dVar));
            e4m.e eVarB7 = e4m.b.b(ge.a(xdVar, this.f.d));
            this.B = eVarB7;
            e4m.e eVar = this.z;
            e4m.e eVar2 = this.f34039t;
            f fVar2 = this.f;
            e4m.e eVarB8 = e4m.b.b(tl.a(olVar, eVar, eVar2, fVar2.f34047h, fVar2.e, this.A, eVarB7));
            this.C = eVarB8;
            this.D = e4m.b.b(vl.a(olVar, this.f.d, eVarB8));
            this.E = e4m.b.b(wl.a(olVar));
            this.F = e4m.b.b(zy0.a(vy0Var, this.f.d));
        }
    }

    public static final class g implements e4m.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e4m.e f34052a;

        private g(e4m.e eVar) {
            eVar.getClass();
            this.f34052a = eVar;
        }

        @Override // phm.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Optional get() {
            return Optional.of(this.f34052a.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static e4m.e a(e4m.e eVar) {
            return new g(eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static e4m.e a() {
        return f34001a;
    }

    public static a b() {
        return new a(0);
    }

    public static final class f implements gh0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final mg1 f34043a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final tg1 f34044b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final f f34045c = this;
        e4m.e d;
        e4m.e e;
        e4m.e f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        e4m.e f34046g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        e4m.e f34047h;
        e4m.e i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        e4m.e f34048j;
        e4m.e k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        e4m.e f34049l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        e4m.e f34050m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        e4m.e f34051n;

        public f(lh lhVar, tg1 tg1Var, mg1 mg1Var, l1 l1Var) {
            this.f34043a = mg1Var;
            this.f34044b = tg1Var;
            a(lhVar, tg1Var, mg1Var, l1Var);
        }

        private void a(lh lhVar, tg1 tg1Var, mg1 mg1Var, l1 l1Var) {
            this.d = e4m.b.b(nh.a(lhVar));
            this.e = e4m.b.b(mh.a(lhVar));
            this.f = e4m.b.b(oh.a(lhVar));
            e4m.e eVarB = e4m.b.b(m1.a(l1Var));
            this.f34046g = eVarB;
            e4m.e eVarB2 = e4m.b.b(o1.a(l1Var, eVarB));
            this.f34047h = eVarB2;
            this.i = e4m.b.b(n1.a(l1Var, eVarB2));
            this.f34048j = e4m.b.b(ph.a(lhVar));
            e4m.e eVarB3 = e4m.b.b(vg1.a(tg1Var, this.d));
            this.k = eVarB3;
            this.f34049l = e4m.b.b(rg1.a(mg1Var, eVarB3));
            ug1 ug1VarA = ug1.a(tg1Var, this.d);
            this.f34050m = ug1VarA;
            this.f34051n = pg1.a(mg1Var, this.f34049l, ug1VarA, this.f34047h);
        }

        public Function0 c() {
            return ug1.a(this.f34044b, (r70) this.d.get());
        }

        public ib0 d() {
            return pg1.a(this.f34043a, (ib0) this.f34049l.get(), c(), (sg0) this.f34047h.get());
        }

        @Override // com.fourthline.orca.internal.dh0
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public kq.a b() {
            return new d(this.f34045c, 0);
        }

        @Override // com.fourthline.orca.internal.dh0
        public r70 a() {
            return (r70) this.d.get();
        }
    }

    public static final class c implements eo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final vn f34007a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final v41 f34008b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final eg f34009c;
        private final f d;
        private final e e;
        private final c f = this;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        e4m.e f34010g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        e4m.e f34011h;
        e4m.e i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        e4m.e f34012j;
        e4m.e k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        e4m.e f34013l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        e4m.e f34014m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        e4m.e f34015n;
        e4m.e o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        e4m.e f34016p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        e4m.e f34017q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        e4m.e f34018r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        e4m.e f34019s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        e4m.e f34020t;
        e4m.e u;
        e4m.e v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        e4m.e f34021w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        e4m.e f34022x;

        public c(f fVar, e eVar, vn vnVar, eg egVar, v41 v41Var) {
            this.d = fVar;
            this.e = eVar;
            this.f34007a = vnVar;
            this.f34008b = v41Var;
            this.f34009c = egVar;
            a(vnVar, egVar, v41Var);
        }

        private void a(vn vnVar, eg egVar, v41 v41Var) {
            e4m.e eVarA = ud.a();
            this.f34010g = eVarA;
            this.f34011h = w41.a(v41Var, eVarA);
            e4m.e eVarA2 = g.a(this.e.I);
            this.i = eVarA2;
            this.f34012j = hg.a(egVar, eVarA2);
            e eVar = this.e;
            mn mnVarA = mn.a(eVar.f34026a, eVar.f34042y);
            this.k = mnVarA;
            this.f34013l = e4m.b.b(z41.a(v41Var, mnVarA));
            e4m.e eVarA3 = ud.a();
            this.f34014m = eVarA3;
            e eVar2 = this.e;
            c51 c51VarA = c51.a(v41Var, eVar2.J, this.k, eVarA3, eVar2.C, this.d.f34051n);
            this.f34015n = c51VarA;
            this.o = fg.a(egVar, this.e.C, c51VarA);
            this.f34016p = x41.a(v41Var, this.e.C, this.f34012j);
            e4m.e eVarA4 = g.a(this.e.K);
            this.f34017q = eVarA4;
            qg qgVarA = qg.a(egVar, eVarA4);
            this.f34018r = qgVarA;
            this.f34019s = b51.a(v41Var, this.e.C, qgVarA);
            this.f34020t = co.a(vnVar);
            e eVar3 = this.e;
            m31 m31VarA = m31.a(eVar3.v, this.k, eVar3.f34041x);
            this.u = m31VarA;
            e eVar4 = this.e;
            mg mgVarA = mg.a(egVar, eVar4.N, this.f34020t, eVar4.C, m31VarA, eVar4.H, this.k);
            this.v = mgVarA;
            this.f34021w = d51.a(v41Var, this.f34012j, this.f34013l, this.o, this.f34016p, this.f34019s, mgVarA, this.f34010g, this.d.f34047h);
            this.f34022x = y41.a(v41Var, this.f34013l, this.f34015n);
        }

        @Override // com.fourthline.orca.internal.eo
        public dh b() {
            return og.a(this.f34009c, y(), h(), g(), this.e.I(), (CoroutineScope) this.e.o.get(), c(), e(), f(), this.e.G());
        }

        public tf c() {
            return gg.a(this.f34009c, (sg0) this.d.f34047h.get());
        }

        public bg d() {
            e eVar = this.e;
            return mn.a(eVar.f34026a, Optional.of((bg) eVar.f34040w.get()));
        }

        public dg e() {
            return ig.a(this.f34009c, (Function0) this.e.J.get(), (to) this.e.C.get(), w(), x());
        }

        public rg f() {
            return jg.a(this.f34009c, i(), d(), (yj0) this.e.R.get(), Optional.absent());
        }

        public aq0 g() {
            return kg.a(this.f34009c, (to) this.e.C.get(), this.e.J(), co.b(this.f34007a), y(), (v10) this.e.H.get(), d());
        }

        public xg h() {
            return lg.a(this.f34009c, (l70) this.e.G.get(), (v10) this.e.H.get());
        }

        public wf i() {
            return hg.a(this.f34009c, Optional.of((wf) this.e.I.get()));
        }

        public List j() {
            return qg.a(this.f34009c, Optional.of((List) this.e.K.get()));
        }

        public ho k() {
            return zn.a(this.f34007a, (sg0) this.d.f34047h.get(), (to) this.e.C.get());
        }

        public yo l() {
            return ao.a(this.f34007a, (to) this.e.C.get(), (bp) this.e.E.get(), m(), (l70) this.e.G.get(), (v10) this.e.H.get());
        }

        public ap m() {
            return on.a(this.e.f34028c, Optional.absent());
        }

        public kw n() {
            return wn.a(this.f34007a, o(), (fq0) this.e.L.get(), s(), (uw) this.e.O.get(), (CoroutineScope) this.e.o.get());
        }

        public ww o() {
            return xn.a(this.f34007a, p(), q(), r());
        }

        public ww p() {
            return pn.a(this.e.f34028c, y(), Optional.absent());
        }

        public ww q() {
            return rn.a(this.e.f34028c, y(), Optional.absent());
        }

        public ww r() {
            return tn.a(this.e.f34028c, y(), Optional.absent());
        }

        public yw s() {
            return yn.a(this.f34007a, t(), u(), v());
        }

        public yw t() {
            return qn.a(this.e.f34028c, Optional.absent(), (v10) this.e.H.get());
        }

        public yw u() {
            e eVar = this.e;
            return sn.a(eVar.f34028c, (to) eVar.C.get(), Optional.absent(), (v10) this.e.H.get());
        }

        public yw v() {
            return un.a(this.e.f34028c, Optional.absent(), (v10) this.e.H.get());
        }

        public e00 w() {
            return pg.a(this.f34009c, d(), this.d.d());
        }

        public bh x() {
            return ng.a(this.f34009c, (TimestampProvider) this.e.Q.get(), j(), (to) this.e.C.get());
        }

        public l31 y() {
            return new l31((o80) this.e.v.get(), d(), (c80) this.e.f34041x.get());
        }

        public u41 z() {
            return a51.a(this.f34008b, (to) this.e.C.get(), this.f34011h, this.f34021w, this.f34022x);
        }

        @Override // com.fourthline.orca.internal.eo
        public dp a() {
            return bo.a(this.f34007a, (to) this.e.C.get(), (vo) this.e.C.get(), y(), this.e.F(), l(), z(), Optional.absent(), Optional.absent(), n(), k(), (v10) this.e.H.get(), (l70) this.e.G.get(), this.e.J(), Optional.of((vp0) this.e.P.get()), (CoroutineScope) this.e.o.get());
        }
    }
}
