package g5f;

import ael.t;
import dcl.q;
import dmc.r;
import fd2.n;
import jm4.o3;
import kotlin.jvm.internal.Intrinsics;
import r10.v;
import t1h.i;
import t1h.j;
import t1h.k;
import vc.s;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements w2f.b, rzg.a, ykc.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f140778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zdl.c f140779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ite.a f140780c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f140781g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f140782h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f140783j;
    public final Object k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f140784l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f140785m;

    public a(ite.a aVar, h9h.a aVar2, u8h.c cVar, zdl.c cVar2, zdl.f fVar) {
        this.f140778a = 0;
        this.f140785m = this;
        this.f140779b = cVar2;
        this.f140783j = cVar;
        this.k = aVar2;
        this.f140784l = fVar;
        this.f140780c = aVar;
        int i = 11;
        this.d = e4m.b.b(new n(this, 0, i));
        this.e = e4m.b.b(new n(this, 1, i));
        this.f = e4m.b.b(new n(this, 2, i));
        this.f140781g = e4m.b.b(new n(this, 3, i));
        this.f140782h = e4m.b.b(new n(this, 4, i));
        this.i = e4m.b.b(new n(this, 5, i));
    }

    @Override // rzg.a
    public final t1h.c a() {
        switch (this.f140778a) {
            case 0:
                t1h.f fVar = (t1h.f) this.e.get();
                t1h.d dVar = (t1h.d) this.f.get();
                e.Companion.getClass();
                return new h5f.e(fVar, dVar, new c());
            default:
                return (t1h.c) this.f140781g.get();
        }
    }

    @Override // rzg.a
    public final k b() {
        switch (this.f140778a) {
            case 0:
                return (k) this.i.get();
            default:
                return new mpc.a(((dmc.a) this.f140783j).a());
        }
    }

    @Override // rzg.a
    public final i c() {
        switch (this.f140778a) {
            case 0:
                return (i) this.d.get();
            default:
                return new ipc.d(((dmc.a) this.f140783j).a(), g());
        }
    }

    @Override // rzg.a
    public final b d() {
        switch (this.f140778a) {
            case 0:
                a aVar = (a) this.f140785m;
                q componentFactory = new q();
                Intrinsics.checkNotNullParameter(componentFactory, "componentFactory");
                return new b(aVar, 0);
            default:
                return (b) ((e4m.e) this.f140785m).get();
        }
    }

    @Override // rzg.a
    public final t1h.a e() {
        switch (this.f140778a) {
            case 0:
                return (t1h.a) this.f140782h.get();
            default:
                return (t1h.a) this.i.get();
        }
    }

    @Override // rzg.a
    public final j f() {
        switch (this.f140778a) {
            case 0:
                return (j) this.f140781g.get();
            default:
                return (j) this.f140782h.get();
        }
    }

    public jpc.e g() {
        zdl.c cVar = this.f140779b;
        ybl.d dVarH = cVar.h();
        s.j(dVarH);
        t tVarF = cVar.f();
        s.j(tVarF);
        ael.q qVarE = cVar.e();
        s.j(qVarE);
        k9l.a aVarA = ((i9l.a) this.k).a();
        s.j(aVarA);
        ybl.b bVarB = cVar.b();
        s.j(bVarB);
        return new jpc.e(dVarH, tVarF, new v(qVarE, aVarA, bVarB, new jpc.a()));
    }

    public a(kpc.a aVar, zdl.c cVar, ite.a aVar2, i9l.a aVar3, dmc.a aVar4, r rVar) {
        this.f140778a = 1;
        this.f140783j = aVar4;
        this.f140779b = cVar;
        this.k = aVar3;
        this.f140784l = rVar;
        this.f140780c = aVar2;
        int i = 21;
        this.d = e4m.b.b(new o3(this, 1, i));
        this.e = e4m.b.b(new o3(this, 2, i));
        this.f = e4m.b.b(new o3(this, 3, i));
        this.f140781g = e4m.b.b(new o3(this, 0, i));
        this.f140782h = e4m.b.b(new o3(this, 4, i));
        this.i = e4m.b.b(new o3(this, 5, i));
        this.f140785m = e4m.b.b(new o3(this, 6, i));
    }
}
