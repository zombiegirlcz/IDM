package s3a;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.payments.who_to_transfer.impl.transfer.new_transfer.NewTransferScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NewTransferScreenContract$InputData f259486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f259487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f259488c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f259489g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f259490h;
    public final ryc.d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f259491j;
    public final ryc.d k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f259492l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f259493m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f259494n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f259495p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f259496q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f259497r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f259498s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f259499t;
    public final e4m.e u;
    public final e4m.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f259500w;

    public c(k kVar, ViewController viewController, NewTransferScreenContract$InputData newTransferScreenContract$InputData) {
        this.f259487b = kVar;
        this.f259486a = newTransferScreenContract$InputData;
        int i = 3;
        this.f259488c = e4m.b.b(new ryc.d(kVar, this, 2, i));
        this.d = e4m.b.b(new ryc.d(kVar, this, 1, i));
        this.e = e4m.b.b(new ryc.d(kVar, this, 0, i));
        e4m.c cVarA = e4m.c.a(viewController);
        this.f = cVarA;
        this.f259489g = e4m.b.b(cVarA);
        int i2 = 3;
        this.f259490h = e4m.b.b(new ryc.d(kVar, this, 5, i2));
        this.i = new ryc.d(kVar, this, 6, i2);
        this.f259491j = e4m.b.b(new ryc.d(kVar, this, 7, i2));
        this.k = new ryc.d(kVar, this, 8, i2);
        this.f259492l = e4m.b.b(new ryc.d(kVar, this, 9, i2));
        this.f259493m = e4m.b.b(this.f);
        this.f259494n = e4m.b.b(new ryc.d(kVar, this, 10, i2));
        this.o = e4m.b.b(new ryc.d(kVar, this, 4, i2));
        this.f259495p = e4m.b.b(new ryc.d(kVar, this, 3, i2));
        this.f259496q = e4m.b.b(new ryc.d(kVar, this, 12, i2));
        this.f259497r = e4m.b.b(new ryc.d(kVar, this, 11, i2));
        this.f259498s = e4m.b.b(new ryc.d(kVar, this, 13, i2));
        this.f259499t = e4m.b.b(new ryc.d(kVar, this, 15, i2));
        this.u = e4m.b.b(new ryc.d(kVar, this, 14, i2));
        this.v = e4m.b.b(new ryc.d(kVar, this, 16, i2));
        this.f259500w = e4m.b.b(new ryc.d(kVar, this, 17, i2));
    }

    public final u96.b b() {
        l70.e eVar = this.f259487b.f259532g;
        z70.a aVarF = eVar.f();
        vc.s.j(aVarF);
        c70.b bVar = new c70.b(aVarF, 2);
        z70.a aVarF2 = eVar.f();
        vc.s.j(aVarF2);
        return new u96.b(bVar, new smd.s(aVarF2));
    }

    public final nli.e c() {
        l70.e eVar = this.f259487b.f259532g;
        zk0.b bVarL = eVar.l();
        vc.s.j(bVarL);
        t80.c cVar = (t80.c) this.f259491j.get();
        f80.a aVarX = eVar.x();
        vc.s.j(aVarX);
        return new nli.e(bVarL, cVar, aVarX);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f259497r.get(), (yji.n) this.f259498s.get(), (yji.n) this.u.get(), (yji.n) this.v.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get(), (yji.d) this.f259495p.get());
    }

    public final h3a.t j() {
        k kVar = this.f259487b;
        gqa.b bVarE = ((jqa.p) kVar.f259529c).e();
        vc.s.j(bVarE);
        bu9.a aVarA = ((ut9.a) kVar.P).a();
        vc.s.j(aVarA);
        ga6.a aVarC = kVar.f259533h.c();
        vc.s.j(aVarC);
        fnc.s sVarB = kVar.Q.b();
        uw1.e eVarJ = ((lz1.m) kVar.f259539n).j();
        vc.s.j(eVarJ);
        fp1.f fVarC = ((up1.e) kVar.R).c();
        vc.s.j(fVarC);
        gte.a aVarB = kVar.o.b();
        vc.s.j(aVarB);
        cw9.d dVarA = kVar.S.a();
        v67.b bVarA = kVar.T.a();
        vc.s.j(bVarA);
        er1.b bVarA2 = ((ir1.b) kVar.U).a();
        vc.s.j(bVarA2);
        return new h3a.t(bVarE, aVarA, aVarC, sVarB, eVarJ, fVarC, aVarB, dVarA, bVarA, bVarA2);
    }
}
