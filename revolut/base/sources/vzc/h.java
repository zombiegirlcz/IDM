package vzc;

import a0e.w;
import com.revolut.feature.apm.iris.impl.ui.registration.IrisRegistrationFlowContract$InputData;
import com.revolut.feature.atm.impl.ui.redesign.details.AtmDetailsBottomSheetContract$InputData;
import com.revolut.feature.crypto.withdraw.api.navigation.CryptoFeeBreakdownDialogInput;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.send.confirmation.CryptoSendConfirmationControllerContract$InputData;
import java.time.Clock;
import java.util.Optional;
import kotlin.jvm.internal.Intrinsics;
import m62.r;
import nz7.p;
import vc.s;
import vq5.z;
import xf6.f0;
import xf6.t;
import xf6.u;
import xj2.o;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f293495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f293496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f293497c;
    public final Object d;

    public /* synthetic */ h(Object obj2, int i, Object obj3, Object obj4) {
        this.f293495a = i;
        this.f293496b = obj2;
        this.f293497c = obj3;
        this.d = obj4;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f293495a) {
            case 0:
                ryc.a aVar = (ryc.a) this.d;
                b bVar = (b) this.f293496b;
                b0d.i iVar = new b0d.i((ozc.d) bVar.f293465y.get(), (b0d.c) ((c) this.f293497c).G.get(), (ozc.f) bVar.C.get());
                kli.a.p(iVar, bq.i.d(((c) aVar.f258289a).f293466a));
                return iVar;
            case 1:
                wy7.d dVar = (wy7.d) this.d;
                wy7.e eVar = (wy7.e) this.f293497c;
                xpi.g gVar = (xpi.g) eVar.f301135n.get();
                wy7.f fVar = (wy7.f) this.f293496b;
                vy7.g gVar2 = (vy7.g) fVar.G.get();
                vy7.b bVar2 = (vy7.b) fVar.H.get();
                wy7.f fVar2 = dVar.f301124a;
                fx7.f fVarB = fVar2.f301146c.b();
                s.j(fVarB);
                yx7.h hVar = new yx7.h(fVarB);
                yx7.i iVar2 = new yx7.i();
                yx7.s promotionBadgeImageBuilder = new yx7.s();
                Intrinsics.checkNotNullParameter(promotionBadgeImageBuilder, "promotionBadgeImageBuilder");
                yx7.f fVar3 = new yx7.f();
                l80.e eVarH = fVar2.f301145b.h();
                s.j(eVarH);
                p pVar = new p(gVar, gVar2, bVar2, new oz7.d(hVar, iVar2, fVar3, new w(eVarH, 6)), (f9b.f) eVar.f301136p.get(), (mm.d) fVar.u.get());
                kli.a.p(pVar, bq.i.d(dVar.f301125b.f301127a));
                return pVar;
            case 2:
                wy7.g gVar3 = (wy7.g) this.d;
                xpi.g gVar4 = (xpi.g) ((wy7.e) this.f293497c).f301135n.get();
                wy7.f fVar4 = (wy7.f) this.f293496b;
                pz7.h hVar2 = new pz7.h(gVar4, (vy7.g) fVar4.G.get(), (vy7.b) fVar4.H.get(), new qz7.a());
                kli.a.p(hVar2, bq.i.d(gVar3.f301161a.f301127a));
                return hVar2;
            case 3:
                return new nm6.j(((u) this.d).f305099a, (ig6.b) ((t) this.f293496b).z0.get(), new f61.a((ig6.b) ((f0) this.f293497c).f304845b.z0.get()), new nm6.k());
            case 4:
                xj2.f fVar5 = (xj2.f) this.d;
                AtmDetailsBottomSheetContract$InputData atmDetailsBottomSheetContract$InputData = fVar5.f306457a;
                xj2.n nVar = fVar5.f306458b;
                qd0.c cVar = new qd0.c();
                l80.e eVarH2 = nVar.f306478b.h();
                s.j(eVarH2);
                gk2.g gVar5 = new gk2.g(eVarH2);
                gk2.c cVar2 = new gk2.c();
                gk2.a aVar2 = new gk2.a();
                egk.e eVarE = nVar.f306481h.e();
                s.j(eVarE);
                gte.a aVarB = nVar.i.b();
                s.j(aVarB);
                ek2.t tVar = new ek2.t(atmDetailsBottomSheetContract$InputData, cVar, gVar5, cVar2, aVar2, new gk2.f(eVarE, aVarB));
                xj2.n nVar2 = (xj2.n) this.f293496b;
                dj3.a aVarA = nVar2.f306482j.a();
                s.j(aVarA);
                efk.a aVar3 = nVar2.k;
                ffk.t tVarF = aVar3.f();
                s.j(tVarF);
                ffk.j jVarG = aVar3.g();
                s.j(jVarG);
                uw1.c cVarD = ((lz1.m) nVar2.f306483l).d();
                s.j(cVarD);
                l93.f fVarJ = nVar2.f306484m.j();
                s.j(fVarJ);
                xmg.a aVar4 = nVar2.f306479c;
                ang.f fVarE = aVar4.e();
                l61.a aVarB2 = aVar4.b();
                s.j(aVarB2);
                wsg.n nVarB = nVar2.f306485n.b();
                til.m mVarA = nVar2.o.a();
                s.j(mVarA);
                tk2.p pVar2 = (tk2.p) ((o) this.f293497c).d.get();
                gte.a aVarB3 = nVar2.i.b();
                s.j(aVarB3);
                return new com.revolut.feature.atm.impl.ui.redesign.details.a(atmDetailsBottomSheetContract$InputData, tVar, aVarA, tVarF, jVarG, cVarD, fVarJ, fVarE, aVarB2, nVarB, mVarA, pVar2, aVarB3);
            case 5:
                IrisRegistrationFlowContract$InputData irisRegistrationFlowContract$InputData = ((z52.p) this.f293497c).f319465a;
                z52.j jVar = (z52.j) this.f293496b;
                c62.e eVar2 = (c62.e) jVar.f319434b.f319430b.get();
                s.j(eVar2);
                o62.a aVar5 = new o62.a();
                jvh.a aVarA2 = jVar.f319435c.a();
                s.j(aVarA2);
                til.m mVarA2 = jVar.d.a();
                s.j(mVarA2);
                z80.b bVarS = ((z52.o) this.d).f319463a.e.s();
                s.j(bVarS);
                return new m62.p(irisRegistrationFlowContract$InputData, eVar2, aVar5, aVarA2, mVarA2, new r(bVarS));
            case 6:
                fhi.i iVar3 = new fhi.i();
                jvh.a aVarA3 = ((zgi.a) this.f293496b).f322126b.a();
                s.j(aVarA3);
                return new fhi.m(iVar3, aVarA3, ((zgi.d) this.d).f322133a, (Clock) ((zgi.c) this.f293497c).d.get());
            case 7:
                zo5.d dVar2 = (zo5.d) this.f293496b;
                no5.b bVar3 = (no5.b) ((yo5.w) dVar2.f323886b).z.get();
                s.j(bVar3);
                wj0.a aVarI = ((nj0.d) dVar2.u).i();
                s.j(aVarI);
                ppk.f fVarA = dVar2.e.a();
                zo5.e eVar3 = (zo5.e) this.d;
                z zVar = new z(eVar3.b());
                xmg.a aVar6 = dVar2.f323890j;
                ang.f fVarE2 = aVar6.e();
                l61.a aVarB4 = aVar6.b();
                s.j(aVarB4);
                hc5.a aVarA4 = ((gc5.c) dVar2.v).a();
                s.j(aVarA4);
                mre.c cVarB = dVar2.f323899w.b();
                s.j(cVarB);
                zp5.d dVar3 = (zp5.d) ((zo5.f) this.f293497c).f.get();
                agf.b bVarA = ((dgf.a) dVar2.f323891l).a();
                s.j(bVarA);
                uj5.b bVarE = ((ak5.i) dVar2.f).e();
                s.j(bVarE);
                sf0.h hVarB = dVar2.f323900x.b();
                s.j(hVarB);
                be5.e eVar4 = new be5.e();
                CryptoSendConfirmationControllerContract$InputData cryptoSendConfirmationControllerContract$InputData = eVar3.f323902a;
                zo5.d dVar4 = eVar3.f323903b;
                uj5.a aVarB5 = ((ak5.i) dVar4.f).b();
                s.j(aVarB5);
                op5.e eVarF = ((yo5.w) dVar4.f323886b).f();
                s.j(eVarF);
                return new com.revolut.feature.crypto.withdraw.impl.ui_v3.send.confirmation.a(bVar3, aVarI, fVarA, zVar, fVarE2, aVarB4, aVarA4, cVarB, dVar3, bVarA, bVarE, hVarB, eVar4, cryptoSendConfirmationControllerContract$InputData, new vq5.m(aVarB5, eVarF, eVar3.b()));
            default:
                mq5.k kVar = new mq5.k();
                CryptoFeeBreakdownDialogInput cryptoFeeBreakdownDialogInput = ((zo5.r) this.d).f323945b;
                Optional optionalOf = Optional.of((zp5.d) ((zo5.f) this.f293497c).f.get());
                no5.b bVar4 = (no5.b) ((yo5.w) ((zo5.d) this.f293496b).f323886b).z.get();
                s.j(bVar4);
                return new com.revolut.feature.crypto.withdraw.impl.ui_v3.fee_breakdown_dialog.a(kVar, cryptoFeeBreakdownDialogInput, optionalOf, bVar4, new mq5.i());
        }
    }
}
