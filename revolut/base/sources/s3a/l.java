package s3a;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.payments.who_to_transfer.api.navigation.RecipientSelectionInputData;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class l implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecipientSelectionInputData f259556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f259557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f259558c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public l(k kVar, RecipientSelectionInputData recipientSelectionInputData) {
        this.f259557b = kVar;
        this.f259556a = recipientSelectionInputData;
        int i = 8;
        this.f259558c = e4m.b.b(new ryc.d(kVar, this, 1, i));
        this.d = e4m.b.b(new ryc.d(kVar, this, 0, i));
        this.e = e4m.b.b(new ryc.d(kVar, this, 3, i));
        this.f = e4m.b.b(new ryc.d(kVar, this, 2, i));
    }

    public final h3a.t d() {
        k kVar = this.f259557b;
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

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of((yji.n) this.d.get());
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of();
    }
}
