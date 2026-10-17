package qbj;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.crypto_deposits.impl.ui.overview.CryptoDepositsOverviewControllerContract$InputData;
import java.util.Set;
import prk.k0;

/* JADX INFO: loaded from: classes11.dex */
public final class r implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bcj.g f244345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CryptoDepositsOverviewControllerContract$InputData f244346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f244347c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f244348g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f244349h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f244350j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f244351l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f244352m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f244353n;
    public final e4m.e o;

    public r(q qVar, s sVar, ViewController viewController, bcj.g gVar, CryptoDepositsOverviewControllerContract$InputData cryptoDepositsOverviewControllerContract$InputData) {
        this.f244347c = qVar;
        this.f244345a = gVar;
        this.f244346b = cryptoDepositsOverviewControllerContract$InputData;
        int i = 14;
        this.d = e4m.b.b(new k0(qVar, this, 1, i));
        this.e = e4m.b.b(new k0(qVar, this, 0, i));
        this.f = e4m.b.b(e4m.c.a(viewController));
        int i2 = 14;
        this.f244348g = e4m.b.b(new k0(qVar, this, 4, i2));
        this.f244349h = e4m.b.b(new k0(qVar, this, 3, i2));
        this.i = e4m.b.b(new k0(qVar, this, 2, i2));
        this.f244350j = e4m.b.b(new k0(qVar, this, 6, i2));
        this.k = e4m.b.b(new k0(qVar, this, 5, i2));
        this.f244351l = e4m.b.b(new k0(qVar, this, 7, i2));
        this.f244352m = e4m.b.b(new k0(qVar, this, 8, i2));
        this.f244353n = e4m.b.b(new k0(qVar, this, 9, i2));
        this.o = e4m.b.b(new k0(qVar, this, 10, i2));
    }

    public final rbj.l b() {
        q qVar = this.f244347c;
        ebj.b bVar = qVar.f244329a;
        kbj.d dVar = (kbj.d) ((m) bVar).f244312h.get();
        vc.s.j(dVar);
        cl3.a aVarD = qVar.f.d();
        vc.s.j(aVarD);
        xx9.p pVarB = qVar.f244332g.b();
        vc.s.j(pVarB);
        bk5.a aVarA = ((ak5.i) qVar.f244330b).a();
        fbj.a aVarA2 = ((m) bVar).a();
        vc.s.j(aVarA2);
        jpc.e eVar = new jpc.e(aVarA, aVarA2, qVar.e.f());
        g56.a aVar = qVar.f244333h;
        k18.c cVarA = aVar.f140627a.a();
        g26.b bVarA = aVar.f140628b.a();
        vc.s.j(bVarA);
        return new rbj.l(dVar, aVarD, pVarB, this.f244346b, new rbj.m(eVar, new r10.f(bVarA, cVarA)), qVar.i.d());
    }

    public final fcj.b c() {
        q qVar = this.f244347c;
        ak5.a aVar = qVar.f244330b;
        uj5.a aVarB = ((ak5.i) aVar).b();
        vc.s.j(aVarB);
        xj5.c cVar = (xj5.c) ((ak5.i) aVar).k.get();
        vc.s.j(cVar);
        f01.a aVar2 = (f01.a) qVar.f244343w.get();
        uj5.a aVarB2 = ((ak5.i) ((m) qVar.f244329a).f).b();
        vc.s.j(aVarB2);
        fcj.f fVar = new fcj.f(aVarB2);
        uj5.a aVarB3 = ((ak5.i) qVar.f244330b).b();
        vc.s.j(aVarB3);
        fcj.e eVar = new fcj.e(aVarB3);
        fcj.h hVar = new fcj.h();
        uj5.a aVarB4 = ((ak5.i) qVar.f244330b).b();
        vc.s.j(aVarB4);
        fcj.i iVar = new fcj.i(aVarB4);
        bbj.c cVarA = qVar.f244337n.a();
        vc.s.j(cVarA);
        return new fcj.b(aVarB, cVar, aVar2, fVar, eVar, hVar, iVar, cVarA, this.f244346b);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.i.get(), (yji.n) this.k.get(), (yji.n) this.f244351l.get(), (yji.n) this.f244352m.get(), (yji.n) this.f244353n.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
