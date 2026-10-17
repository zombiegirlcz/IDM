package h30;

import com.google.common.collect.ImmutableSet;
import com.revolut.chat.ui.chat_profile.ChatProfileInputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes19.dex */
public final class z implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f148989a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ChatProfileInputData f148990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f148991c;
    public final e4m.c d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f148992g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f148993h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f148994j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f148995l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f148996m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f148997n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f148998p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f148999q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f149000r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f149001s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f149002t;

    public z(n nVar, o oVar, ViewController viewController, ChatProfileInputData chatProfileInputData) {
        this.f148991c = nVar;
        this.f148990b = chatProfileInputData;
        e4m.c cVarA = e4m.c.a(viewController);
        this.d = cVarA;
        this.e = e4m.b.b(cVarA);
        int i = 12;
        this.f149001s = new h08.e(nVar, this, 2, i);
        this.f = e4m.b.b(new h08.e(nVar, this, 3, i));
        this.f149002t = new h08.e(nVar, this, 4, i);
        this.f148992g = e4m.b.b(new h08.e(nVar, this, 5, i));
        this.f148993h = e4m.b.b(this.d);
        this.i = e4m.b.b(new h08.e(nVar, this, 6, i));
        this.f148994j = e4m.b.b(new h08.e(nVar, this, 1, i));
        this.k = e4m.b.b(new h08.e(nVar, this, 0, i));
        this.f148995l = e4m.b.b(new h08.e(nVar, this, 8, i));
        this.f148996m = e4m.b.b(new h08.e(nVar, this, 7, i));
        this.f148997n = e4m.b.b(new h08.e(nVar, this, 11, i));
        this.o = e4m.b.b(new h08.e(nVar, this, 10, i));
        this.f148998p = e4m.b.b(new h08.e(nVar, this, 9, i));
        this.f148999q = e4m.b.b(new h08.e(nVar, this, 12, i));
        this.f149000r = e4m.b.b(new h08.e(nVar, this, 13, i));
    }

    public final t80.b b() {
        switch (this.f148989a) {
            case 0:
                l70.e eVar = this.f148991c.d;
                f80.a aVarX = eVar.x();
                vc.s.j(aVarX);
                l80.e eVarH = eVar.h();
                vc.s.j(eVarH);
                zk0.b bVarL = eVar.l();
                vc.s.j(bVarL);
                return new t80.b(aVarX, eVarH, bVarL);
            default:
                n nVar = this.f148991c;
                f80.a aVarX2 = nVar.d.x();
                vc.s.j(aVarX2);
                l70.e eVar2 = nVar.d;
                l80.e eVarH2 = eVar2.h();
                vc.s.j(eVarH2);
                zk0.b bVarL2 = eVar2.l();
                vc.s.j(bVarL2);
                return new t80.b(aVarX2, eVarH2, bVarL2);
        }
    }

    public final u96.b c() {
        switch (this.f148989a) {
            case 0:
                l70.e eVar = this.f148991c.d;
                z70.a aVarF = eVar.f();
                vc.s.j(aVarF);
                c70.b bVar = new c70.b(aVarF, 2);
                z70.a aVarF2 = eVar.f();
                vc.s.j(aVarF2);
                return new u96.b(bVar, new smd.s(aVarF2));
            default:
                n nVar = this.f148991c;
                z70.a aVarF3 = nVar.d.f();
                vc.s.j(aVarF3);
                c70.b bVar2 = new c70.b(aVarF3, 2);
                z70.a aVarF4 = nVar.d.f();
                vc.s.j(aVarF4);
                return new u96.b(bVar2, new smd.s(aVarF4));
        }
    }

    @Override // xki.e
    public final Set f() {
        switch (this.f148989a) {
        }
        return ImmutableSet.of((yji.n) this.f148996m.get(), (yji.n) this.f148998p.get(), (yji.n) this.f148999q.get(), (yji.n) this.f149000r.get());
    }

    @Override // xki.e
    public final Set g() {
        switch (this.f148989a) {
        }
        return ImmutableSet.of((yji.d) this.k.get());
    }

    public final nli.e j() {
        switch (this.f148989a) {
            case 0:
                l70.e eVar = this.f148991c.d;
                zk0.b bVarL = eVar.l();
                vc.s.j(bVarL);
                t80.c cVar = (t80.c) this.f.get();
                f80.a aVarX = eVar.x();
                vc.s.j(aVarX);
                return new nli.e(bVarL, cVar, aVarX);
            default:
                n nVar = this.f148991c;
                zk0.b bVarL2 = nVar.d.l();
                vc.s.j(bVarL2);
                t80.c cVar2 = (t80.c) this.f.get();
                f80.a aVarX2 = nVar.d.x();
                vc.s.j(aVarX2);
                return new nli.e(bVarL2, cVar2, aVarX2);
        }
    }

    public z(n nVar, ViewController viewController, ChatProfileInputData chatProfileInputData) {
        this.f148991c = nVar;
        this.f148990b = chatProfileInputData;
        e4m.c cVarA = e4m.c.a(viewController);
        this.d = cVarA;
        this.e = e4m.b.b(cVarA);
        int i = 13;
        this.f149001s = new h08.e(nVar, this, 2, i);
        this.f = e4m.b.b(new h08.e(nVar, this, 3, i));
        this.f149002t = new h08.e(nVar, this, 4, i);
        this.f148992g = e4m.b.b(new h08.e(nVar, this, 5, i));
        this.f148993h = e4m.b.b(this.d);
        this.i = e4m.b.b(new h08.e(nVar, this, 6, i));
        this.f148994j = e4m.b.b(new h08.e(nVar, this, 1, i));
        this.k = e4m.b.b(new h08.e(nVar, this, 0, i));
        this.f148995l = e4m.b.b(new h08.e(nVar, this, 8, i));
        this.f148996m = e4m.b.b(new h08.e(nVar, this, 7, i));
        this.f148997n = e4m.b.b(new h08.e(nVar, this, 11, i));
        this.o = e4m.b.b(new h08.e(nVar, this, 10, i));
        this.f148998p = e4m.b.b(new h08.e(nVar, this, 9, i));
        this.f148999q = e4m.b.b(new h08.e(nVar, this, 12, i));
        this.f149000r = e4m.b.b(new h08.e(nVar, this, 13, i));
    }
}
