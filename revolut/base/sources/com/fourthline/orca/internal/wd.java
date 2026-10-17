package com.fourthline.orca.internal;

import com.fourthline.core.DeviceMetadata;
import com.fourthline.orca.Orca;
import com.fourthline.orca.internal.z31;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public abstract class wd {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private p31 f34622a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private zg1 f34623b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private mg1 f34624c;
        private l1 d;

        public /* synthetic */ a(int i) {
            this();
        }

        public o31 a() {
            vc.s.h(this.f34622a, p31.class);
            if (this.f34623b == null) {
                this.f34623b = new zg1();
            }
            if (this.f34624c == null) {
                this.f34624c = new mg1();
            }
            if (this.d == null) {
                this.d = new l1();
            }
            return new b(this.f34622a, this.f34623b, this.f34624c, this.d);
        }

        private a() {
        }

        public a a(p31 p31Var) {
            p31Var.getClass();
            this.f34622a = p31Var;
            return this;
        }
    }

    public static final class b implements o31 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final mg1 f34625a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b f34626b = this;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        e4m.e f34627c;
        e4m.e d;
        e4m.e e;
        e4m.e f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        e4m.e f34628g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        e4m.e f34629h;
        e4m.e i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        e4m.e f34630j;
        e4m.e k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        e4m.e f34631l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        e4m.e f34632m;

        public b(p31 p31Var, zg1 zg1Var, mg1 mg1Var, l1 l1Var) {
            this.f34625a = mg1Var;
            a(p31Var, zg1Var, mg1Var, l1Var);
        }

        public ib0 a() {
            return pg1.a(this.f34625a, (ib0) this.i.get(), (Function0) this.f34630j.get(), (sg0) this.e.get());
        }

        @Override // com.fourthline.orca.internal.o31
        public z31.a b() {
            return new c(this.f34626b, 0);
        }

        private void a(p31 p31Var, zg1 zg1Var, mg1 mg1Var, l1 l1Var) {
            this.f34627c = e4m.b.b(q31.a(p31Var));
            e4m.e eVarB = e4m.b.b(m1.a(l1Var));
            this.d = eVarB;
            this.e = e4m.b.b(o1.a(l1Var, eVarB));
            e4m.e eVarB2 = e4m.b.b(s31.a(p31Var));
            this.f = eVarB2;
            this.f34628g = e4m.b.b(og1.a(mg1Var, eVarB2, this.e));
            this.f34629h = e4m.b.b(t31.a(p31Var));
            this.i = e4m.b.b(rg1.a(mg1Var, this.f));
            this.f34630j = e4m.b.b(ah1.a(zg1Var, this.f34629h));
            this.k = e4m.b.b(r31.a(p31Var));
            e4m.e eVarB3 = e4m.b.b(bh1.a(zg1Var, this.f34629h));
            this.f34631l = eVarB3;
            this.f34632m = qg1.a(mg1Var, this.i, eVarB3, this.e);
        }
    }

    public static final class c implements z31.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f34633a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private wc f34634b;

        public /* synthetic */ c(b bVar, int i) {
            this(bVar);
        }

        @Override // com.fourthline.orca.internal.z31.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c a(wc wcVar) {
            wcVar.getClass();
            this.f34634b = wcVar;
            return this;
        }

        @Override // com.fourthline.orca.internal.z31.a
        public z31 build() {
            vc.s.h(this.f34634b, wc.class);
            return new d(this.f34633a, new ja(), new xd(), this.f34634b, new a41(), new u61(), new oh1(), new i71(), new u31(), new zl0());
        }

        private c(b bVar) {
            this.f34633a = bVar;
        }
    }

    public static a a() {
        return new a(0);
    }

    public static final class d implements z31 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final u31 f34635a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final wc f34636b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final a41 f34637c;
        private final zl0 d;
        private final b e;
        private final d f = this;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        e4m.e f34638g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        e4m.e f34639h;
        e4m.e i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        e4m.e f34640j;
        e4m.e k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        e4m.e f34641l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        e4m.e f34642m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        e4m.e f34643n;
        e4m.e o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        e4m.e f34644p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        e4m.e f34645q;

        public d(b bVar, ja jaVar, xd xdVar, wc wcVar, a41 a41Var, u61 u61Var, oh1 oh1Var, i71 i71Var, u31 u31Var, zl0 zl0Var) {
            this.e = bVar;
            this.f34635a = u31Var;
            this.f34636b = wcVar;
            this.f34637c = a41Var;
            this.d = zl0Var;
            a(jaVar, xdVar, wcVar, a41Var, u61Var, oh1Var, i71Var, u31Var, zl0Var);
        }

        private void a(ja jaVar, xd xdVar, wc wcVar, a41 a41Var, u61 u61Var, oh1 oh1Var, i71 i71Var, u31 u31Var, zl0 zl0Var) {
            xc xcVarA = xc.a(wcVar);
            this.f34638g = xcVarA;
            e4m.e eVarB = e4m.b.b(fe.a(xdVar, xcVarA));
            this.f34639h = eVarB;
            this.i = e4m.b.b(sh1.a(oh1Var, this.e.f34628g, eVarB));
            this.f34640j = e4m.b.b(la.a(jaVar));
            this.k = x61.a(u61Var);
            this.f34641l = w61.a(u61Var, this.f34638g);
            k71 k71VarA = k71.a(i71Var);
            this.f34642m = k71VarA;
            b bVar = this.e;
            this.f34643n = e4m.b.b(qh1.a(oh1Var, bVar.f, bVar.f34632m, k71VarA));
            this.o = y61.a(u61Var);
            this.f34644p = z61.a(u61Var);
            this.f34645q = a71.a(u61Var);
        }

        @Override // com.fourthline.orca.internal.z31
        public je b() {
            return c41.a(this.f34637c, (mb.d) this.e.f.get(), this.e.a());
        }

        @Override // com.fourthline.orca.internal.z31
        public h00 c() {
            return x31.a(this.f34635a, m(), e(), i(), j());
        }

        public h2 d() {
            return am0.a(this.d, (mb.d) this.e.f.get(), g(), k(), f());
        }

        public ej e() {
            return d41.a(this.f34637c, (mb.d) this.e.f.get(), this.e.a(), this.o);
        }

        public e30 f() {
            return bm0.a(this.d, (sg0) this.e.e.get());
        }

        public f30 g() {
            return cm0.a(this.d, xc.b(this.f34636b), f());
        }

        public t90 h() {
            return y31.a(this.f34635a, (gf1) this.e.f34629h.get());
        }

        public p01 i() {
            return e41.a(this.f34637c, (mb.d) this.e.f.get(), this.e.a(), this.f34644p);
        }

        public r11 j() {
            return f41.a(this.f34637c, xc.b(this.f34636b), (mb.d) this.e.f.get(), (t9) this.i.get(), this.f34645q);
        }

        public o71 k() {
            return dm0.a(this.d, (mb.d) this.e.f.get(), this.e.a());
        }

        public bf1 l() {
            return g41.a(this.f34637c, (mb.d) this.e.f.get(), this.e.a(), this.f34641l, (Orca.a) this.e.k.get(), (sg0) this.e.e.get());
        }

        public fg1 m() {
            return w31.a(this.f34635a, xc.b(this.f34636b), (t9) this.i.get(), h(), n(), l(), (kh1) this.f34643n.get(), (mb.d) this.e.f.get(), (sg0) this.e.e.get(), d(), v31.a(this.f34635a));
        }

        public gh1 n() {
            return h41.a(this.f34637c, xc.b(this.f34636b), (mb.d) this.e.f.get(), (ib0) this.e.i.get(), (DeviceMetadata) this.f34640j.get(), (sg0) this.e.e.get(), this.k);
        }

        @Override // com.fourthline.orca.internal.z31
        public sg0 a() {
            return (sg0) this.e.e.get();
        }
    }
}
