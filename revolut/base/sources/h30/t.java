package h30;

import com.google.common.collect.ImmutableSet;
import com.revolut.chat.ui.messageslist.MessagesContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class t implements xki.e {
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
    public final h08.e L;
    public final e4m.e M;
    public final e4m.e N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MessagesContract$InputData f148954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f148955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f148956c;
    public final e4m.c d;
    public final e4m.e e;
    public final h08.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f148957g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h08.e f148958h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f148959j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f148960l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f148961m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f148962n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f148963p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final h08.e f148964q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final h08.e f148965r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f148966s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f148967t;
    public final e4m.e u;
    public final e4m.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f148968w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e4m.e f148969x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e4m.e f148970y;
    public final e4m.e z;

    public t(n nVar, o oVar, ViewController viewController, MessagesContract$InputData messagesContract$InputData) {
        this.f148955b = nVar;
        this.f148956c = oVar;
        this.f148954a = messagesContract$InputData;
        e4m.c cVarA = e4m.c.a(viewController);
        this.d = cVarA;
        this.e = e4m.b.b(cVarA);
        int i = 9;
        this.f = new h08.e(nVar, this, 2, i);
        this.f148957g = l.l(nVar, this, 3);
        this.f148958h = new h08.e(nVar, this, 4, i);
        this.i = l.l(nVar, this, 5);
        this.f148959j = e4m.b.b(this.d);
        this.k = e4m.b.b(new h08.e(nVar, this, 6, i));
        this.f148960l = l.l(nVar, this, 1);
        this.f148961m = l.l(nVar, this, 0);
        this.f148962n = l.l(nVar, this, 9);
        this.o = l.l(nVar, this, 8);
        this.f148963p = l.l(nVar, this, 7);
        this.f148964q = new h08.e(nVar, this, 12, i);
        this.f148965r = new h08.e(nVar, this, 13, i);
        this.f148966s = l.l(nVar, this, 11);
        this.f148967t = l.l(nVar, this, 10);
        this.u = l.l(nVar, this, 14);
        this.v = l.l(nVar, this, 16);
        this.f148968w = l.l(nVar, this, 15);
        this.f148969x = l.l(nVar, this, 19);
        this.f148970y = l.l(nVar, this, 18);
        this.z = l.l(nVar, this, 17);
        this.A = l.l(nVar, this, 20);
        this.B = e4m.b.b(new h08.e(nVar, this, 21, i));
        this.C = l.l(nVar, this, 22);
        this.D = e4m.b.b(new h08.e(nVar, this, 23, i));
        this.E = e4m.b.b(new h08.e(nVar, this, 24, i));
        this.F = l.l(nVar, this, 25);
        this.G = e4m.b.b(new h08.e(nVar, this, 26, i));
        this.H = e4m.b.b(new h08.e(nVar, this, 27, i));
        this.I = l.l(nVar, this, 28);
        this.J = e4m.b.b(new h08.e(nVar, this, 29, i));
        this.K = l.l(nVar, this, 30);
        this.L = new h08.e(nVar, this, 31, i);
        this.M = l.l(nVar, this, 32);
        this.N = l.l(nVar, this, 33);
    }

    public final t80.b b() {
        l70.e eVar = this.f148955b.d;
        f80.a aVarX = eVar.x();
        vc.s.j(aVarX);
        l80.e eVarH = eVar.h();
        vc.s.j(eVarH);
        zk0.b bVarL = eVar.l();
        vc.s.j(bVarL);
        return new t80.b(aVarX, eVarH, bVarL);
    }

    public final u96.b c() {
        l70.e eVar = this.f148955b.d;
        z70.a aVarF = eVar.f();
        vc.s.j(aVarF);
        c70.b bVar = new c70.b(aVarF, 2);
        z70.a aVarF2 = eVar.f();
        vc.s.j(aVarF2);
        return new u96.b(bVar, new smd.s(aVarF2));
    }

    @Override // xki.e
    public final Set f() {
        yji.n nVar = (yji.n) this.f148963p.get();
        yji.n nVar2 = (yji.n) this.f148967t.get();
        urg.a extension = (urg.a) this.u.get();
        Intrinsics.checkNotNullParameter(extension, "extension");
        vc.s.k(extension);
        return ImmutableSet.of(nVar, nVar2, extension, (yji.n) this.f148968w.get(), (yji.n) this.z.get(), (yji.n) this.A.get(), (yji.n) this.B.get(), (yji.n) this.C.get(), (yji.n) this.D.get(), (yji.n) this.E.get(), (yji.n) this.F.get(), (yji.n) this.G.get(), (yji.n) this.H.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f148961m.get());
    }

    public final nli.e j() {
        l70.e eVar = this.f148955b.d;
        zk0.b bVarL = eVar.l();
        vc.s.j(bVarL);
        t80.c cVar = (t80.c) this.f148957g.get();
        f80.a aVarX = eVar.x();
        vc.s.j(aVarX);
        return new nli.e(bVarL, cVar, aVarX);
    }
}
