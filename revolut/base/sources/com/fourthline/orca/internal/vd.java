package com.fourthline.orca.internal;

import androidx.content.NavHostController;
import androidx.lifecycle.ViewModelStoreOwner;
import com.fourthline.orca.internal.d8;
import com.fourthline.orca.internal.n21;

/* JADX INFO: loaded from: classes23.dex */
public abstract class vd {

    public static final class a implements d8.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f34303a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final f f34304b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private wd1 f34305c;

        public /* synthetic */ a(d dVar, f fVar, int i) {
            this(dVar, fVar);
        }

        @Override // com.fourthline.orca.internal.d8.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(wd1 wd1Var) {
            wd1Var.getClass();
            this.f34305c = wd1Var;
            return this;
        }

        @Override // com.fourthline.orca.internal.d8.a
        public d8 build() {
            vc.s.h(this.f34305c, wd1.class);
            return new b(this.f34303a, this.f34304b, new y7(), new u7(), this.f34305c);
        }

        private a(d dVar, f fVar) {
            this.f34303a = dVar;
            this.f34304b = fVar;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private f01 f34312a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private l1 f34313b;

        public /* synthetic */ c(int i) {
            this();
        }

        public ti0 a() {
            vc.s.h(this.f34312a, f01.class);
            if (this.f34313b == null) {
                this.f34313b = new l1();
            }
            return new d(this.f34312a, this.f34313b);
        }

        private c() {
        }

        public c a(f01 f01Var) {
            f01Var.getClass();
            this.f34312a = f01Var;
            return this;
        }
    }

    public static final class e implements n21.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f34319a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private com.fourthline.orca.internal.d f34320b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private t80 f34321c;

        public /* synthetic */ e(d dVar, int i) {
            this(dVar);
        }

        @Override // com.fourthline.orca.internal.cj0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e a(com.fourthline.orca.internal.d dVar) {
            dVar.getClass();
            this.f34320b = dVar;
            return this;
        }

        private e(d dVar) {
            this.f34319a = dVar;
        }

        @Override // com.fourthline.orca.internal.cj0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public n21 build() {
            vc.s.h(this.f34320b, com.fourthline.orca.internal.d.class);
            vc.s.h(this.f34321c, t80.class);
            return new f(this.f34319a, this.f34320b, new ow(), new xd(), new vy0(), this.f34321c, new s11());
        }

        @Override // com.fourthline.orca.internal.cj0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e a(t80 t80Var) {
            t80Var.getClass();
            this.f34321c = t80Var;
            return this;
        }
    }

    public static final class f implements n21 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f34322a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final f f34323b = this;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        e4m.e f34324c;
        e4m.e d;
        e4m.e e;
        e4m.e f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        e4m.e f34325g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        e4m.e f34326h;
        e4m.e i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        e4m.e f34327j;
        e4m.e k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        e4m.e f34328l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        e4m.e f34329m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        e4m.e f34330n;
        e4m.e o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        e4m.e f34331p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        e4m.e f34332q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        e4m.e f34333r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        e4m.e f34334s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        e4m.e f34335t;
        e4m.e u;
        e4m.e v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        e4m.e f34336w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        e4m.e f34337x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        e4m.e f34338y;

        public f(d dVar, com.fourthline.orca.internal.d dVar2, ow owVar, xd xdVar, vy0 vy0Var, t80 t80Var, s11 s11Var) {
            this.f34322a = dVar;
            a(dVar2, owVar, xdVar, vy0Var, t80Var, s11Var);
        }

        @Override // com.fourthline.orca.internal.bj0
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public q11 a() {
            return (q11) this.f34322a.f34316c.get();
        }

        @Override // com.fourthline.orca.internal.n21
        public n31 b() {
            return (n31) this.f34333r.get();
        }

        @Override // com.fourthline.orca.internal.bj0
        public sy h() {
            return (sy) this.f34322a.f34318h.get();
        }

        @Override // com.fourthline.orca.internal.bj0
        public v90 j() {
            return (v90) this.f34329m.get();
        }

        @Override // com.fourthline.orca.internal.bj0
        public iq0 k() {
            return (iq0) this.k.get();
        }

        @Override // com.fourthline.orca.internal.n21
        public d8.a l() {
            return new a(this.f34322a, this.f34323b, 0);
        }

        @Override // com.fourthline.orca.internal.bj0
        public NavHostController o() {
            return (NavHostController) this.e.get();
        }

        @Override // com.fourthline.orca.internal.bj0
        public ij0 q() {
            return (ij0) this.f34324c.get();
        }

        @Override // com.fourthline.orca.internal.bj0
        public r71 s() {
            return (r71) this.f34325g.get();
        }

        @Override // com.fourthline.orca.internal.bj0
        public ry0 x() {
            return (ry0) this.f34331p.get();
        }

        @Override // com.fourthline.orca.internal.bj0
        public q70 y() {
            return (q70) this.f34326h.get();
        }

        private void a(com.fourthline.orca.internal.d dVar, ow owVar, xd xdVar, vy0 vy0Var, t80 t80Var, s11 s11Var) {
            this.f34324c = e4m.b.b(v.a(dVar, this.f34322a.f34315b));
            this.d = e4m.b.b(s.a(dVar, this.f34322a.d));
            e4m.e eVarB = e4m.b.b(w80.a(t80Var));
            this.e = eVarB;
            this.f = e4m.b.b(u80.a(t80Var, eVarB));
            e4m.e eVarB2 = e4m.b.b(y80.a(t80Var));
            this.f34325g = eVarB2;
            d dVar2 = this.f34322a;
            this.f34326h = e4m.b.b(v80.a(t80Var, dVar2.f34315b, this.d, this.f, eVarB2, dVar2.f34317g));
            e4m.e eVarB3 = e4m.b.b(x.a(dVar));
            this.i = eVarB3;
            e4m.e eVarB4 = e4m.b.b(k.a(dVar, eVarB3));
            this.f34327j = eVarB4;
            this.k = e4m.b.b(tw.a(owVar, eVarB4));
            e4m.e eVarB5 = e4m.b.b(j.a(dVar));
            this.f34328l = eVarB5;
            this.f34329m = e4m.b.b(q.a(dVar, eVarB5, this.d, this.f34327j));
            this.f34330n = e4m.b.b(yd.a(xdVar, this.f34328l, this.f34327j));
            e4m.e eVarB6 = e4m.b.b(zd.a(xdVar));
            this.o = eVarB6;
            this.f34331p = e4m.b.b(he.a(xdVar, this.f34330n, eVarB6, this.f34322a.f34315b, this.f34327j));
            e4m.e eVarB7 = e4m.b.b(x80.a(t80Var, this.f34326h, this.f34327j));
            this.f34332q = eVarB7;
            this.f34333r = e4m.b.b(t11.a(s11Var, eVarB7));
            e4m.e eVarB8 = e4m.b.b(ge.a(xdVar, this.f34322a.f34315b));
            this.f34334s = eVarB8;
            d dVar3 = this.f34322a;
            this.f34335t = e4m.b.b(u11.a(s11Var, dVar3.f34316c, this.o, dVar3.f, eVarB8));
            e4m.e eVarB9 = e4m.b.b(zy0.a(vy0Var, this.f34322a.f34315b));
            this.u = eVarB9;
            this.v = e4m.b.b(xy0.a(vy0Var, this.f34328l, eVarB9));
            this.f34336w = e4m.b.b(wy0.a(vy0Var, this.f34328l, this.u));
            this.f34337x = e4m.b.b(pw.a(owVar));
            this.f34338y = e4m.b.b(qw.a(owVar, this.f34322a.f));
        }
    }

    public static c a() {
        return new c(0);
    }

    public static final class b implements d8 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f34306a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final f f34307b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final b f34308c = this;
        e4m.e d;
        e4m.e e;
        e4m.e f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        e4m.e f34309g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        e4m.e f34310h;
        e4m.e i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        e4m.e f34311j;

        public b(d dVar, f fVar, y7 y7Var, u7 u7Var, wd1 wd1Var) {
            this.f34306a = dVar;
            this.f34307b = fVar;
            a(y7Var, u7Var, wd1Var);
        }

        private void a(y7 y7Var, u7 u7Var, wd1 wd1Var) {
            this.d = e4m.c.a(wd1Var);
            f fVar = this.f34307b;
            this.e = e4m.b.b(b8.a(y7Var, fVar.v, fVar.f34336w));
            this.f = e4m.b.b(v7.a(u7Var, this.f34307b.f34333r));
            e4m.e eVarB = e4m.b.b(w7.a(u7Var, this.f34307b.f34336w));
            this.f34309g = eVarB;
            e4m.e eVar = this.f;
            f fVar2 = this.f34307b;
            this.f34310h = e4m.b.b(z7.a(y7Var, eVar, fVar2.f34337x, eVarB, fVar2.f34338y, fVar2.f34327j));
            e4m.e eVarB2 = e4m.b.b(a8.a(y7Var, this.f34306a.f));
            this.i = eVarB2;
            f fVar3 = this.f34307b;
            this.f34311j = e4m.b.b(c8.a(y7Var, fVar3.f34335t, fVar3.f34333r, this.d, this.e, this.f34310h, eVarB2, fVar3.f34327j));
        }

        @Override // com.fourthline.orca.internal.d8
        public m21 d() {
            return (m21) this.f34311j.get();
        }

        @Override // com.fourthline.orca.internal.d8
        public ViewModelStoreOwner a() {
            return (ViewModelStoreOwner) this.f34307b.i.get();
        }
    }

    public static final class d implements ti0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f34314a = this;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        e4m.e f34315b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        e4m.e f34316c;
        e4m.e d;
        e4m.e e;
        e4m.e f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        e4m.e f34317g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        e4m.e f34318h;

        public d(f01 f01Var, l1 l1Var) {
            a(f01Var, l1Var);
        }

        private void a(f01 f01Var, l1 l1Var) {
            this.f34315b = e4m.b.b(g01.a(f01Var));
            this.f34316c = e4m.b.b(j01.a(f01Var));
            this.d = e4m.b.b(h01.a(f01Var));
            e4m.e eVarB = e4m.b.b(m1.a(l1Var));
            this.e = eVarB;
            e4m.e eVarB2 = e4m.b.b(o1.a(l1Var, eVarB));
            this.f = eVarB2;
            this.f34317g = e4m.b.b(n1.a(l1Var, eVarB2));
            this.f34318h = e4m.b.b(i01.a(f01Var));
        }

        @Override // com.fourthline.orca.internal.dh0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public n21.a b() {
            return new e(this.f34314a, 0);
        }

        @Override // com.fourthline.orca.internal.dh0
        public r70 a() {
            return (r70) this.f34315b.get();
        }
    }
}
