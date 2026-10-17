package zo5;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.crypto.withdraw.impl.navigation.CryptoSendAmountInputScreenDestination$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import eq5.x0;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import yo5.w;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoSendAmountInputScreenDestination$InputData f323880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f323881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f323882c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f323883g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f323884h;
    public final e4m.e i;

    public c(d dVar, f fVar, ViewController viewController, CryptoSendAmountInputScreenDestination$InputData cryptoSendAmountInputScreenDestination$InputData) {
        this.f323881b = dVar;
        this.f323880a = cryptoSendAmountInputScreenDestination$InputData;
        this.f323882c = e4m.b.b(e4m.c.a(viewController));
        int i = 5;
        this.d = e4m.b.b(new z52.q(dVar, fVar, this, 1, i));
        this.e = e4m.b.b(new z52.q(dVar, fVar, this, 0, i));
        this.f = e4m.b.b(new z52.q(dVar, fVar, this, 3, i));
        this.f323883g = e4m.b.b(new z52.q(dVar, fVar, this, 2, i));
        this.f323884h = e4m.b.b(new z52.q(dVar, fVar, this, 4, i));
        this.i = e4m.b.b(new z52.q(dVar, fVar, this, 5, i));
    }

    public final x0 b() {
        d dVar = this.f323881b;
        qd0.b languageProvider = dVar.f323893n.n();
        vc.s.j(languageProvider);
        fq5.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        w80.b bVarB = v80.b.b(languageProvider, false, false, 58);
        ppk.f fVarA = dVar.e.a();
        wsg.n nVarB = dVar.d.b();
        rea.m mVarF = dVar.o.f();
        bk5.a aVarA = ((ak5.i) dVar.f).a();
        go5.c cVar = dVar.f323886b;
        ap5.b bVarE = ((w) cVar).e();
        vc.s.j(bVarE);
        no5.b bVar = (no5.b) ((w) cVar).z.get();
        vc.s.j(bVar);
        po5.a aVarD = ((w) cVar).d();
        vc.s.j(aVarD);
        go5.e eVarA = dVar.k.a();
        sd5.c cVarA = dVar.f323894p.a();
        vc.s.j(cVarA);
        com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) dVar.f323895q).c();
        vc.s.j(aVarC);
        ap5.f fVar = (ap5.f) ((w) cVar).C.get();
        vc.s.j(fVar);
        return new x0(bVarB, fVarA, nVarB, mVarF, aVarA, bVarE, bVar, aVarD, eVarA, cVarA, aVarC, fVar);
    }

    public final yp5.f c() {
        u80.o oVar = new u80.o();
        mp5.a aVar = new mp5.a();
        d dVar = this.f323881b;
        mo5.a aVarC = ((w) dVar.f323886b).c();
        vc.s.j(aVarC);
        bq5.c cryptoCreateBeneficiaryDialogProvider = new bq5.c(aVarC);
        Intrinsics.checkNotNullParameter(cryptoCreateBeneficiaryDialogProvider, "cryptoCreateBeneficiaryDialogProvider");
        op5.c cVar = new op5.c();
        io5.b bVarA = ((w) dVar.f323886b).a();
        vc.s.j(bVarA);
        uj5.a aVarB = ((ak5.i) dVar.f).b();
        vc.s.j(aVarB);
        return new yp5.f(oVar, aVar, cVar, bVarA, aVarB);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f323883g.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
