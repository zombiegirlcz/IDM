package com.fourthline.vision.internal;

import com.fourthline.core.internal.devicedata.MotionDataCollector;
import com.fourthline.core.location.LocationProvider;
import com.fourthline.vision.internal.v5;
import com.fourthline.vision.internal.yc;
import com.google.mlkit.vision.text.TextRecognizer;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public abstract class c2 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private s0 f36035a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ed f36036b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private af f36037c;
        private c0 d;
        private k2 e;

        public /* synthetic */ a(int i) {
            this();
        }

        public s6 a() {
            vc.s.h(this.f36035a, s0.class);
            if (this.f36036b == null) {
                this.f36036b = new ed();
            }
            if (this.f36037c == null) {
                this.f36037c = new af();
            }
            vc.s.h(this.d, c0.class);
            if (this.e == null) {
                this.e = new k2();
            }
            return new d(this.f36035a, this.f36036b, this.f36037c, this.d, this.e);
        }

        private a() {
        }

        public a a(c0 c0Var) {
            c0Var.getClass();
            this.d = c0Var;
            return this;
        }

        public a a(s0 s0Var) {
            s0Var.getClass();
            this.f36035a = s0Var;
            return this;
        }
    }

    public static final class b implements v5.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f36038a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private o3 f36039b;

        public /* synthetic */ b(d dVar, int i) {
            this(dVar);
        }

        @Override // com.fourthline.vision.internal.v5.a
        public v5 build() {
            vc.s.h(this.f36039b, o3.class);
            return new c(this.f36038a, this.f36039b);
        }

        private b(d dVar) {
            this.f36038a = dVar;
        }

        @Override // com.fourthline.vision.internal.v5.a
        public b documentModule(o3 o3Var) {
            o3Var.getClass();
            this.f36039b = o3Var;
            return this;
        }
    }

    public static final class c implements v5 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final o3 f36040a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d f36041b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final c f36042c = this;

        public c(d dVar, o3 o3Var) {
            this.f36041b = dVar;
            this.f36040a = o3Var;
        }

        public pe A() {
            o3 o3Var = this.f36040a;
            return a5.a(o3Var, z3.a(o3Var), this.f36041b.d());
        }

        public x2 a() {
            return r3.a(this.f36040a, l1.a(this.f36041b.f36043a));
        }

        public b3 b() {
            return p3.a(this.f36040a, h(), k(), p1.b(this.f36041b.f36043a));
        }

        public j3 c() {
            o3 o3Var = this.f36040a;
            return t3.a(o3Var, i4.a(o3Var), u(), s4.a(this.f36040a), this.f36041b.b());
        }

        public l3 d() {
            return u3.a(this.f36040a, l1.a(this.f36041b.f36043a));
        }

        public g5 e() {
            o3 o3Var = this.f36040a;
            return w3.a(o3Var, z3.a(o3Var), (j6) this.f36041b.z.get(), this.f36041b.c());
        }

        public h5 f() {
            o3 o3Var = this.f36040a;
            return y3.a(o3Var, x3.a(o3Var), l1.a(this.f36041b.f36043a), (LocationProvider) this.f36041b.f36055s.get(), a4.a(this.f36040a), b4.a(this.f36040a), getVisionAnalytics());
        }

        public p5 g() {
            return u4.a(this.f36040a, l1.a(this.f36041b.f36043a), h(), (a9) this.f36041b.f36053q.get());
        }

        @Override // com.fourthline.vision.internal.v5, com.fourthline.vision.internal.uf
        public x getCameraFocusManager() {
            return (x) this.f36041b.B.get();
        }

        @Override // com.fourthline.vision.internal.v5, com.fourthline.vision.internal.uf
        public e2 getDebugConsumer() {
            return (e2) this.f36041b.i.get();
        }

        @Override // com.fourthline.vision.internal.v5, com.fourthline.vision.internal.uf
        public z7 getLegacyPreviewCalculator() {
            return (z7) this.f36041b.E.get();
        }

        @Override // com.fourthline.vision.internal.v5, com.fourthline.vision.internal.uf
        public i8 getMediaCodecDataSource() {
            return this.f36041b.e();
        }

        @Override // com.fourthline.vision.internal.v5, com.fourthline.vision.internal.uf
        public x9 getPreviewCalculator() {
            return (x9) this.f36041b.D.get();
        }

        @Override // com.fourthline.vision.internal.v5, com.fourthline.vision.internal.uf
        public ne getVisionAnalytics() {
            o3 o3Var = this.f36040a;
            return q3.a(o3Var, a4.a(o3Var), b4.a(this.f36040a), z3.a(this.f36040a), A());
        }

        @Override // com.fourthline.vision.internal.v5, com.fourthline.vision.internal.uf
        public xf getVisionViewModel() {
            return b5.a(this.f36040a, w0.b(this.f36041b.f36043a), (zf) this.f36041b.f36050m.get(), (k7) this.f36041b.f36052p.get(), this.f36041b.h(), y(), (x) this.f36041b.B.get(), i1.b(this.f36041b.f36043a), m());
        }

        public t5 h() {
            o3 o3Var = this.f36040a;
            return w4.a(o3Var, r4.a(o3Var), i(), n(), o(), c(), x(), v(), w(), m(), this.f36041b.g(), p4.a(this.f36040a), (TextRecognizer) this.f36041b.I.get(), x0.b(this.f36041b.f36043a), p1.b(this.f36041b.f36043a));
        }

        public w5 i() {
            return x4.a(this.f36040a, l1.a(this.f36041b.f36043a), s4.a(this.f36040a));
        }

        public y5 j() {
            o3 o3Var = this.f36040a;
            return c4.a(o3Var, z3.a(o3Var));
        }

        public z5 k() {
            return d4.a(this.f36040a, l());
        }

        public b6 l() {
            o3 o3Var = this.f36040a;
            return e4.a(o3Var, v3.a(o3Var), j(), a(), d(), e(), s3.a(this.f36040a));
        }

        public l7 m() {
            o3 o3Var = this.f36040a;
            return g4.a(o3Var, r4.a(o3Var), n(), (r9) this.f36041b.J.get(), t(), u(), this.f36041b.c(), this.f36041b.h(), (e2) this.f36041b.i.get());
        }

        public o7 n() {
            return h4.a(this.f36040a, this.f36041b.h(), r4.a(this.f36040a));
        }

        public w7 o() {
            return j4.a(this.f36040a, (t7) this.f36041b.f36057w.get());
        }

        public k8 p() {
            return y4.a(this.f36040a, p1.b(this.f36041b.f36043a), (a9) this.f36041b.f36053q.get(), h());
        }

        public o8 q() {
            return z4.a(this.f36040a, u0.a(this.f36041b.f36043a), n1.a(this.f36041b.f36043a), o1.a(this.f36041b.f36043a), p());
        }

        public g9 r() {
            return l4.a(this.f36040a, this.f36041b.f(), l1.a(this.f36041b.f36043a), s(), i1.b(this.f36041b.f36043a));
        }

        public h9 s() {
            return m4.a(this.f36040a, p());
        }

        public i9 t() {
            return n4.a(this.f36040a, l1.a(this.f36041b.f36043a));
        }

        public j9 u() {
            o3 o3Var = this.f36040a;
            return o4.a(o3Var, r4.a(o3Var));
        }

        public g8 v() {
            o3 o3Var = this.f36040a;
            return f4.a(o3Var, s4.a(o3Var), this.f36041b.c(), this.f36041b.h(), (z9) this.f36041b.G.get(), (r9) this.f36041b.J.get(), t(), this.f36041b.b());
        }

        public g8 w() {
            return k4.a(this.f36040a, u(), this.f36041b.c(), this.f36041b.h(), (r9) this.f36041b.J.get(), t(), this.f36041b.b());
        }

        public sa x() {
            return t4.a(this.f36040a, this.f36041b.b());
        }

        public ja y() {
            return q4.a(this.f36040a, q(), r(), f(), z(), l1.a(this.f36041b.f36043a), (LocationProvider) this.f36041b.f36055s.get(), (a9) this.f36041b.f36053q.get(), (be) this.f36041b.A.get(), x0.b(this.f36041b.f36043a));
        }

        public wd z() {
            o3 o3Var = this.f36040a;
            return v4.a(o3Var, z3.a(o3Var), (k7) this.f36041b.f36052p.get(), (t7) this.f36041b.f36057w.get(), b(), g());
        }
    }

    public static final class d implements s6 {
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

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final s0 f36043a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final af f36044b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final d f36045c = this;
        e4m.e d;
        e4m.e e;
        e4m.e f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        e4m.e f36046g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        e4m.e f36047h;
        e4m.e i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        e4m.e f36048j;
        e4m.e k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        e4m.e f36049l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        e4m.e f36050m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        e4m.e f36051n;
        e4m.e o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        e4m.e f36052p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        e4m.e f36053q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        e4m.e f36054r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        e4m.e f36055s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        e4m.e f36056t;
        e4m.e u;
        e4m.e v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        e4m.e f36057w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        e4m.e f36058x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        e4m.e f36059y;
        e4m.e z;

        public d(s0 s0Var, ed edVar, af afVar, c0 c0Var, k2 k2Var) {
            this.f36043a = s0Var;
            this.f36044b = afVar;
            a(s0Var, edVar, afVar, c0Var, k2Var);
            b(s0Var, edVar, afVar, c0Var, k2Var);
        }

        public q7 b() {
            return c1.a(this.f36043a, a(), b1.a(this.f36043a), h());
        }

        public e8 c() {
            return d1.a(this.f36043a, h());
        }

        public Map d() {
            s0 s0Var = this.f36043a;
            return j1.a(s0Var, k1.b(s0Var));
        }

        @Override // com.fourthline.vision.internal.s6
        public v5.a documentBuilder() {
            return new b(this.f36045c, 0);
        }

        public i8 e() {
            return e1.a(this.f36043a, h(), f1.a(this.f36043a), v0.a(this.f36043a));
        }

        public MotionDataCollector f() {
            s0 s0Var = this.f36043a;
            return g1.a(s0Var, x0.b(s0Var), i1.b(this.f36043a));
        }

        public ae g() {
            return m1.a(this.f36043a, (be) this.A.get());
        }

        public df h() {
            return cf.a(this.f36044b, (b0) this.f36047h.get());
        }

        @Override // com.fourthline.vision.internal.s6
        public yc.a selfieBuilder() {
            return new e(this.f36045c, 0);
        }

        private void b(s0 s0Var, ed edVar, af afVar, c0 c0Var, k2 k2Var) {
            cf cfVarA = cf.a(afVar, this.f36047h);
            this.C = cfVarA;
            this.D = e4m.b.b(s1.a(s0Var, cfVarA));
            this.E = e4m.b.b(q1.a(s0Var, this.C));
            e4m.e eVarB = e4m.b.b(l2.a(k2Var));
            this.F = eVarB;
            this.G = e4m.b.b(p2.a(k2Var, eVarB, this.f36059y));
            p1 p1VarA = p1.a(s0Var);
            this.H = p1VarA;
            e4m.e eVarB2 = e4m.b.b(q2.a(k2Var, p1VarA));
            this.I = eVarB2;
            this.J = e4m.b.b(o2.a(k2Var, eVarB2, this.f36059y, this.H));
        }

        public i7 a() {
            s0 s0Var = this.f36043a;
            return a1.a(s0Var, h1.a(s0Var), h());
        }

        private void a(s0 s0Var, ed edVar, af afVar, c0 c0Var, k2 k2Var) {
            w0 w0VarA = w0.a(s0Var);
            this.d = w0VarA;
            this.e = g0.a(c0Var, w0VarA);
            this.f = h0.a(c0Var, this.d);
            i1 i1VarA = i1.a(s0Var);
            this.f36046g = i1VarA;
            this.f36047h = e4m.b.b(f0.a(c0Var, this.e, this.f, i1VarA));
            this.i = e4m.b.b(gd.a(edVar));
            e4m.e eVarB = e4m.b.b(z0.a(s0Var));
            this.f36048j = eVarB;
            e4m.e eVarB2 = e4m.b.b(y0.a(s0Var, eVarB));
            this.k = eVarB2;
            d0 d0VarA = d0.a(c0Var, this.e, eVarB2, this.f36047h);
            this.f36049l = d0VarA;
            this.f36050m = e4m.b.b(bf.a(afVar, d0VarA));
            this.f36051n = e4m.b.b(jd.a(edVar, this.f36047h));
            x0 x0VarA = x0.a(s0Var);
            this.o = x0VarA;
            this.f36052p = e4m.b.b(id.a(edVar, this.f36051n, this.k, x0VarA));
            this.f36053q = e4m.b.b(md.a(edVar));
            t0 t0VarA = t0.a(s0Var);
            this.f36054r = t0VarA;
            this.f36055s = e4m.b.b(ld.a(edVar, this.d, t0VarA));
            k1 k1VarA = k1.a(s0Var);
            this.f36056t = k1VarA;
            this.u = e4m.b.b(hd.a(edVar, this.o, k1VarA));
            e4m.e eVarB3 = e4m.b.b(fd.a(edVar, this.o, this.f36056t));
            this.v = eVarB3;
            this.f36057w = e4m.b.b(kd.a(edVar, this.o, this.u, eVarB3));
            this.f36058x = e4m.b.b(n2.a(k2Var, this.f36046g));
            r1 r1VarA = r1.a(s0Var);
            this.f36059y = r1VarA;
            this.z = e4m.b.b(m2.a(k2Var, this.f36058x, r1VarA));
            this.A = e4m.b.b(nd.a(edVar));
            this.B = e4m.b.b(e0.a(c0Var, this.f36049l, this.o));
        }
    }

    public static final class e implements yc.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f36060a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private bb f36061b;

        public /* synthetic */ e(d dVar, int i) {
            this(dVar);
        }

        @Override // com.fourthline.vision.internal.yc.a
        public yc build() {
            vc.s.h(this.f36061b, bb.class);
            return new f(this.f36060a, this.f36061b);
        }

        private e(d dVar) {
            this.f36060a = dVar;
        }

        @Override // com.fourthline.vision.internal.yc.a
        public e selfieModule(bb bbVar) {
            bbVar.getClass();
            this.f36061b = bbVar;
            return this;
        }
    }

    public static final class f implements yc {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final bb f36062a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d f36063b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final f f36064c = this;

        public f(d dVar, bb bbVar) {
            this.f36063b = dVar;
            this.f36062a = bbVar;
        }

        public i6 a() {
            bb bbVar = this.f36062a;
            return db.a(bbVar, kb.a(bbVar), sb.a(this.f36062a), this.f36063b.b());
        }

        public n6 b() {
            bb bbVar = this.f36062a;
            return gb.a(bbVar, rb.a(bbVar));
        }

        public o6 c() {
            bb bbVar = this.f36062a;
            return hb.a(bbVar, rb.a(bbVar));
        }

        public p6 d() {
            bb bbVar = this.f36062a;
            return ib.a(bbVar, rb.a(bbVar));
        }

        public m7 e() {
            bb bbVar = this.f36062a;
            return jb.a(bbVar, yb.a(bbVar), (e2) this.f36063b.i.get(), (j6) this.f36063b.z.get(), this.f36063b.c());
        }

        public v7 f() {
            return lb.a(this.f36062a, (t7) this.f36063b.f36057w.get());
        }

        public k8 g() {
            return ic.a(this.f36062a, (a9) this.f36063b.f36053q.get(), yb.a(this.f36062a));
        }

        @Override // com.fourthline.vision.internal.yc, com.fourthline.vision.internal.uf
        public x getCameraFocusManager() {
            return (x) this.f36063b.B.get();
        }

        @Override // com.fourthline.vision.internal.yc, com.fourthline.vision.internal.uf
        public e2 getDebugConsumer() {
            return (e2) this.f36063b.i.get();
        }

        @Override // com.fourthline.vision.internal.yc, com.fourthline.vision.internal.uf
        public z7 getLegacyPreviewCalculator() {
            return (z7) this.f36063b.E.get();
        }

        @Override // com.fourthline.vision.internal.yc, com.fourthline.vision.internal.uf
        public i8 getMediaCodecDataSource() {
            return this.f36063b.e();
        }

        @Override // com.fourthline.vision.internal.yc, com.fourthline.vision.internal.uf
        public x9 getPreviewCalculator() {
            return (x9) this.f36063b.D.get();
        }

        @Override // com.fourthline.vision.internal.yc, com.fourthline.vision.internal.uf
        public ne getVisionAnalytics() {
            bb bbVar = this.f36062a;
            return ub.a(bbVar, yb.a(bbVar), zb.a(this.f36062a), u());
        }

        @Override // com.fourthline.vision.internal.yc, com.fourthline.vision.internal.uf
        public xf getVisionViewModel() {
            return lc.a(this.f36062a, w0.b(this.f36063b.f36043a), (zf) this.f36063b.f36050m.get(), (k7) this.f36063b.f36052p.get(), this.f36063b.h(), o(), (x) this.f36063b.B.get(), i1.b(this.f36063b.f36043a), e());
        }

        public o8 h() {
            return jc.a(this.f36062a, u0.a(this.f36063b.f36043a), n1.a(this.f36063b.f36043a), o1.a(this.f36063b.f36043a), g());
        }

        public g9 i() {
            return nb.a(this.f36062a, this.f36063b.f(), l1.a(this.f36063b.f36043a), j(), i1.b(this.f36063b.f36043a));
        }

        public h9 j() {
            return ob.a(this.f36062a, g());
        }

        public td k() {
            return vb.a(this.f36062a, f(), ac.a(this.f36062a), fb.a(this.f36062a), pb.a(this.f36062a), b(), d(), c(), t(), a(), e());
        }

        public td l() {
            return ec.a(this.f36062a, t(), fc.a(this.f36062a), a(), eb.a(this.f36062a), pb.a(this.f36062a), e());
        }

        public td m() {
            return gc.a(this.f36062a, t(), hc.a(this.f36062a), a(), eb.a(this.f36062a), pb.a(this.f36062a), e());
        }

        public td n() {
            return qb.a(this.f36062a, t(), mb.a(this.f36062a), a(), eb.a(this.f36062a), pb.a(this.f36062a), e());
        }

        public ja o() {
            return tb.a(this.f36062a, h(), i(), q(), s(), l1.a(this.f36063b.f36043a), (LocationProvider) this.f36063b.f36055s.get(), (a9) this.f36063b.f36053q.get(), (be) this.f36063b.A.get(), x0.b(this.f36063b.f36043a));
        }

        public ya p() {
            return cb.a(this.f36062a, r());
        }

        public nc q() {
            bb bbVar = this.f36062a;
            return xb.a(bbVar, wb.a(bbVar), zb.a(this.f36062a), getVisionAnalytics(), (LocationProvider) this.f36063b.f36055s.get());
        }

        public xc r() {
            bb bbVar = this.f36062a;
            return cc.a(bbVar, yb.a(bbVar), k(), l(), m(), n());
        }

        public wd s() {
            return bc.a(this.f36062a, (k7) this.f36063b.f36052p.get(), (t7) this.f36063b.f36057w.get(), p());
        }

        public zd t() {
            return dc.a(this.f36062a, l1.a(this.f36063b.f36043a));
        }

        public hf u() {
            bb bbVar = this.f36062a;
            return kc.a(bbVar, yb.a(bbVar), this.f36063b.d());
        }
    }

    public static a a() {
        return new a(0);
    }
}
