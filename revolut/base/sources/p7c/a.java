package p7c;

import b9.w2;
import com.revolut.feature.spending_analytics.impl.ui.budget.overview.BudgetOverviewContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.destinations_execution.IncomeSorterDestinationsExecutionContract$InputData;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f233576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f233577b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f233576a = i;
        this.f233577b = obj2;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f233576a) {
            case 0:
                return new com.revolut.feature.revolutpay.shared.ui.account_picker.a(((b) this.f233577b).f233581a, new edc.g());
            case 1:
                return new i8c.k(((d) this.f233577b).f233593a, new i8c.l());
            case 2:
                return new wdc.j(((m0) this.f233577b).f233644a, new wdc.i());
            case 3:
                return new wdc.j(((o0) this.f233577b).f233656a, new wdc.i());
            case 4:
                return new c1g.v(new pak.h(((v0) this.f233577b).f233734a.a()));
            case 5:
                return new com.revolut.feature.pix.impl.flow.alias_deletion.a(((p8a.d) this.f233577b).f233926a);
            case 6:
                p8a.e eVar = (p8a.e) this.f233577b;
                return new paa.i(new paa.j((j8a.a) eVar.f233950b.E.get()), eVar.f233949a);
            case 7:
                return new com.revolut.feature.pix.impl.flow.alias_registration.a(((p8a.f) this.f233577b).f233957a);
            case 8:
                return new com.revolut.feature.pix.impl.flow.migrate_alias.a(((p8a.j) this.f233577b).f233991a);
            case 9:
                return new com.revolut.feature.pix.impl.flow.authorisation_request.a(((p8a.s) this.f233577b).f234078a);
            case 10:
                return new com.revolut.feature.pix.impl.flow.automatico.a(((p8a.u) this.f233577b).f234093a);
            case 11:
                return new com.revolut.feature.pix.impl.flow.common.a(((p8a.y) this.f233577b).f234122a);
            case 12:
                gte.a aVarB = ((p8a.d0) this.f233577b).f.b();
                vc.s.j(aVarB);
                return new com.revolut.feature.pix.impl.flow.copy_paste.a(aVarB);
            case 13:
                p8a.d0 d0Var = ((p8a.i0) this.f233577b).f233986a;
                p8a.c cVar = d0Var.e;
                s8a.l lVarE = cVar.e();
                tca.f fVar = (tca.f) cVar.D.get();
                vc.s.j(fVar);
                hp.g gVarA = d0Var.v.a();
                gte.a aVarB2 = d0Var.f.b();
                vc.s.j(aVarB2);
                return new com.revolut.feature.pix.impl.flow.qr.a(new tca.e(lVarE, fVar, gVarA, aVarB2));
            case 14:
                return new com.revolut.feature.pix.impl.flow.qr_request.a(((p8a.o0) this.f233577b).f234043a);
            case 15:
                return new com.revolut.feature.pix.impl.flow.refund.a(((p8a.r0) this.f233577b).f234074a);
            case 16:
                p96.b bVar = (p96.b) this.f233577b;
                return new c3d.a(bVar.f234277a, bVar.f234278b, bVar.f234279c);
            case 17:
                return new com.revolut.feature.donations.impl.ui.kompot.flow.root.a(((pa6.n) this.f233577b).f234405a);
            case 18:
                return ((pfb.a) this.f233577b).f235567a.e();
            case 19:
                pl1.m mVar = ((pl1.l) this.f233577b).f237261a;
                vw1.b bVar2 = (vw1.b) mVar.k.get();
                lz1.m mVar2 = (lz1.m) mVar.f237263a;
                fx1.a aVarF = mVar2.f();
                vc.s.j(aVarF);
                iz1.m mVar3 = (iz1.m) mVar2.N.get();
                vc.s.j(mVar3);
                zl1.l lVar = new zl1.l(bVar2, aVarF, mVar3);
                v02.a aVarA = mVar.d.a();
                vc.s.j(aVarA);
                return new com.revolut.feature.apm.aani.impl.ui.settings.a(lVar, new zl1.t(aVarA));
            case 20:
                ppd.p pVar = (ppd.p) this.f233577b;
                ppd.n nVar = pVar.f238521b;
                l70.e eVar2 = nVar.d;
                w80.b bVarJ = eVar2.j();
                vc.s.j(bVarJ);
                l80.e eVarH = eVar2.h();
                vc.s.j(eVarH);
                thf.c cVarC = nVar.f238490h.c();
                vc.s.j(cVarC);
                umd.q qVar = new umd.q(bVarJ, eVarH, cVarC, (a9e.a) nVar.R0.get(), pVar.f238520a);
                BudgetOverviewContract$InputData budgetOverviewContract$InputData = pVar.f238520a;
                izi.a aVar = nVar.f238484b;
                jzi.a aVarD = ((dqj.r) aVar).d();
                vc.s.j(aVarD);
                dqj.r rVar = (dqj.r) aVar;
                eqj.f fVar2 = (eqj.f) rVar.H.get();
                vc.s.j(fVar2);
                ke3.e eVar3 = nVar.f238486c;
                ge3.e eVarD = eVar3.d();
                vc.s.j(eVarD);
                l5i.q qVarB = eVar3.b();
                ge3.a aVarE = eVar3.e();
                vc.s.j(aVarE);
                ang.f fVarE = nVar.i.e();
                ge3.d dVarF = eVar3.f();
                vc.s.j(dVarF);
                kzi.a aVarB3 = rVar.b();
                vc.s.j(aVarB3);
                wmd.f fVar3 = new wmd.f(qVarB, aVarE, fVarE, dVarF, aVarB3);
                xld.f fVar4 = (xld.f) nVar.f238489g.z0.get();
                vc.s.j(fVar4);
                ppk.f fVarA = nVar.f238510x.a();
                l80.e eVarH2 = nVar.d.h();
                vc.s.j(eVarH2);
                return new umd.m(qVar, budgetOverviewContract$InputData, new w2(aVarD, fVar2, eVarD, fVar3, new uc.d(fVar4, fVarA, eVarH2), new wmd.c(nVar.f.a(), nVar.f238494l.c(), eVar3.a())));
            case 21:
                ppd.f0 f0Var = (ppd.f0) this.f233577b;
                IncomeSorterDestinationsExecutionContract$InputData incomeSorterDestinationsExecutionContract$InputData = f0Var.f238407a;
                j9l.a aVar2 = new j9l.a();
                ppd.n nVar2 = f0Var.f238408b;
                onh.b bVar3 = new onh.b(new j9l.a());
                end.d dVarH = nVar2.f238489g.h();
                nmc.d dVarD = nVar2.J.d();
                gte.a aVarB4 = nVar2.f238482a.b();
                vc.s.j(aVarB4);
                return new ypd.j(incomeSorterDestinationsExecutionContract$InputData, aVar2, new ypd.k(bVar3, dVarH, new pqd.a(new end.f(dVarD, aVarB4, new ufl.b(new tfl.a()))), new j9l.a()));
            case 22:
                return new com.revolut.feature.spending_analytics.impl.ui.rev10.rev_iq.flow.a(((ppd.o0) this.f233577b).f238518a);
            case 23:
                return new wqd.f(((ppd.p0) this.f233577b).f238523a, new wqd.g());
            case 24:
                return new com.revolut.feature.spending_analytics.impl.ui.rev10.travel.remove.flow.a(((ppd.y0) this.f233577b).f238580a);
            case 25:
                return new com.revolut.biometric_verification.impl.ui.step.document.card_details_edit.a(((pr.x) this.f233577b).f238906a);
            case 26:
                return new com.revolut.biometric_verification.impl.ui.step.nfc.flow.a(((pr.d0) this.f233577b).f238836a);
            case 27:
                return new com.revolut.biometric_verification.impl.ui.step.nfc.manual_input.c(new at.r(new fu.c(), new fu.b(), new fu.e()), ((pr.j0) this.f233577b).f238853b, new fu.a());
            case 28:
                return new com.revolut.biometric_verification.impl.ui.step.nfc.manual_input.c(new at.r(new fu.c(), new fu.b(), new fu.e()), ((pr.j0) this.f233577b).f238853b, new fu.a());
            default:
                return new com.revolut.retail.feature.stockdetails.impl.ui.flows.a(((prk.b) this.f233577b).f239059a, new qy5.a(new zvk.b()), new mtk.e());
        }
    }

    public a(ppd.n nVar, ppd.f0 f0Var) {
        this.f233576a = 21;
        this.f233577b = f0Var;
    }
}
