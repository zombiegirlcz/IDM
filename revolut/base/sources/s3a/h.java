package s3a;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.payments.who_to_transfer.impl.transfer.search.PaymentsSearchScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentsSearchScreenContract$InputData f259516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f259517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f259518c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f259519g;

    public h(k kVar, PaymentsSearchScreenContract$InputData paymentsSearchScreenContract$InputData) {
        this.f259517b = kVar;
        this.f259516a = paymentsSearchScreenContract$InputData;
        int i = 7;
        this.f259518c = e4m.b.b(new ryc.d(kVar, this, 1, i));
        this.d = e4m.b.b(new ryc.d(kVar, this, 0, i));
        this.e = e4m.b.b(new ryc.d(kVar, this, 3, i));
        this.f = e4m.b.b(new ryc.d(kVar, this, 2, i));
        this.f259519g = e4m.b.b(new ryc.d(kVar, this, 4, i));
    }

    public final j3a.b b() {
        com.revolut.feature.payments.who_to_transfer.impl.common.transfer_action.a aVar = new com.revolut.feature.payments.who_to_transfer.impl.common.transfer_action.a();
        k kVar = this.f259517b;
        m3j.n nVarI = ((b3j.p) kVar.f259527b).i();
        aqa.c cVarC = ((jqa.p) kVar.f259529c).c();
        vc.s.j(cVarC);
        dl3.f fVarC = kVar.f259525a.c();
        vc.s.j(fVarC);
        nq9.b bVarB = kVar.W.b();
        vc.s.j(bVarB);
        lx1.i iVarD = ((ey1.e) kVar.i).d();
        vc.s.j(iVarD);
        tn9.a aVarC = kVar.f259537l.c();
        vc.s.j(aVarC);
        return new j3a.b(aVar, new j3a.c(nVarI, cVarC, fVarC, bVarB, iVarD, aVarC), new j3a.d());
    }

    public final h3a.t c() {
        k kVar = this.f259517b;
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

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.d.get(), (yji.n) this.f.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
