package idb;

import com.revolut.feature.tax_residency.impl.v2.ui.add_declaration_flow.AddDeclarationFlowContract$InputData;
import com.revolut.feature.tax_residency.impl.v2.ui.declaration_flow.TaxResidencyDeclarationFlowContract$InputData;
import com.revolut.feature.tax_residency.impl.v2.ui.fatca_flow.FatcaFlowContract$InputData;
import e4m.e;
import ecm.q;
import ee6.f;
import emi.g;
import il8.i;
import in3.h;
import ine.k;
import ine.o;
import kl.b0;
import kotlin.jvm.internal.Intrinsics;
import mjl.p;
import ope.j;
import sri.m;
import tb4.t;
import vc.s;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f160460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f160461b;

    public /* synthetic */ b(Object obj2, int i) {
        this.f160460a = i;
        this.f160461b = obj2;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f160460a) {
            case 0:
                return new a7d.a(((c) this.f160461b).f160462a, 14);
            case 1:
                idd.b bVar = (idd.b) this.f160461b;
                return new ax4.c(bVar.f160472a, bVar.f160473b, bVar.f160474c, bVar.d, 8);
            case 2:
                idh.a aVar = (idh.a) this.f160461b;
                return new ajf.d(aVar.f160485a, aVar.f160486b, aVar.f160487c, aVar.d, aVar.e, 10);
            case 3:
                idh.b bVar2 = (idh.b) this.f160461b;
                return new c1d.d(bVar2.f160488a, bVar2.f160489b, bVar2.f160490c, bVar2.d, bVar2.e, bVar2.f, 9);
            case 4:
                ief.a aVar2 = (ief.a) this.f160461b;
                return new g(aVar2.f160704a, aVar2.f160705b, aVar2.f160706c, aVar2.d, aVar2.e, 4);
            case 5:
                return new add.b(((ij2.b) this.f160461b).f161671a, 6);
            case 6:
                ijf.b bVar3 = (ijf.b) this.f160461b;
                return new c1d.d(bVar3.f161784a, bVar3.f161785b, bVar3.f161786c, bVar3.d, bVar3.e, bVar3.f, 8);
            case 7:
                ijl.b bVar4 = (ijl.b) this.f160461b;
                q qVar = bVar4.f161832a;
                return new p(bVar4.f161833b, bVar4.f161834c, bVar4.d, bVar4.e, bVar4.f, bVar4.f161835g, bVar4.f161836h, bVar4.f161837j, bVar4.k, bVar4.f161838l, bVar4.f161839m, bVar4.f161840n, bVar4.o, qVar, bVar4.i);
            case 8:
                il0.a aVar3 = (il0.a) this.f160461b;
                m mVarD = ((g8b.a) aVar3.f162036a).d();
                s.j(mVarD);
                s70.a aVarM = aVar3.f162037b.m();
                s.j(aVarM);
                return new hl0.c(mVarD, aVarM);
            case 9:
                il0.b bVar5 = (il0.b) this.f160461b;
                return new c3d.d(bVar5.f162039a, bVar5.f162040b, 10);
            case 10:
                return new com.revolut.feature.junior_remote_login.impl.ui.flow.invite_creation.a(((i) this.f160461b).f162158a);
            case 11:
                h hVar = (h) this.f160461b;
                return new f(hVar.f162634a, hVar.f162635b, hVar.f162636c, hVar.d, hVar.e, hVar.f, hVar.f162637g, hVar.f162638h, hVar.i, 2);
            case 12:
                ine.a aVar4 = (ine.a) this.f160461b;
                AddDeclarationFlowContract$InputData addDeclarationFlowContract$InputData = aVar4.f162837a;
                n8b.b bVarB = aVar4.f162838b.d.b();
                s.j(bVarB);
                return new com.revolut.feature.tax_residency.impl.v2.ui.add_declaration_flow.a(addDeclarationFlowContract$InputData, new b0(new npe.d(bVarB)));
            case 13:
                return new com.revolut.feature.tax_residency.impl.flows.collection.a(((ine.b) this.f160461b).f162840a);
            case 14:
                return new com.revolut.feature.tax_residency.impl.v2.ui.crs_flow.a(((ine.c) this.f160461b).f162843a, new j(), new lpe.e());
            case 15:
                return new com.revolut.feature.tax_residency.impl.v2.ui.direct_tin_flow.a(((ine.d) this.f160461b).f162845a, new qpe.h(), new lpe.e());
            case 16:
                ine.f fVar = (ine.f) this.f160461b;
                FatcaFlowContract$InputData fatcaFlowContract$InputData = fVar.f162849a;
                tpe.i iVar = new tpe.i();
                o oVar = fVar.f162850b;
                jpe.d dVar = new jpe.d((joe.b) oVar.f162888p.get());
                v60.e eVarA = oVar.f162882g.a();
                s.j(eVarA);
                sf0.h hVarB = oVar.f162883h.b();
                s.j(hVarB);
                lpe.d dVar2 = new lpe.d(new e1l.a(hVarB, eVarA));
                je0.d dVarB = oVar.f162880b.b();
                s.j(dVarB);
                sf0.h hVarB2 = oVar.f162883h.b();
                s.j(hVarB2);
                a61.a aVar5 = new a61.a(dVarB, hVarB2);
                wj0.a aVarI = ((nj0.d) oVar.f162879a).i();
                s.j(aVarI);
                return new com.revolut.feature.tax_residency.impl.v2.ui.fatca_flow.a(fatcaFlowContract$InputData, iVar, dVar, dVar2, aVar5, new t(aVarI));
            case 17:
                ine.g gVar = (ine.g) this.f160461b;
                return new com.revolut.feature.tax_residency.impl.v2.ui.multi_residency_flow.c(gVar.f162852a, new jpe.d((joe.b) gVar.f162853b.f162888p.get()));
            case 18:
                return new com.revolut.feature.tax_residency.impl.flows.single_tin.c(((ine.i) this.f160461b).f162858a);
            case 19:
                return new rpe.g(new rpe.j(((k) this.f160461b).f162865a));
            case 20:
                ine.p pVar = (ine.p) this.f160461b;
                TaxResidencyDeclarationFlowContract$InputData taxResidencyDeclarationFlowContract$InputData = pVar.f162892a;
                o oVar2 = pVar.f162893b;
                jpe.d dVar3 = new jpe.d((joe.b) oVar2.f162888p.get());
                v60.e eVarA2 = oVar2.f162882g.a();
                s.j(eVarA2);
                sf0.h hVarB3 = oVar2.f162883h.b();
                s.j(hVarB3);
                lpe.d dVar4 = new lpe.d(new e1l.a(hVarB3, eVarA2));
                je0.d dVarB2 = oVar2.f162880b.b();
                s.j(dVarB2);
                sf0.h hVarB4 = oVar2.f162883h.b();
                s.j(hVarB4);
                a61.a aVar6 = new a61.a(dVarB2, hVarB4);
                wj0.a aVarI2 = ((nj0.d) oVar2.f162879a).i();
                s.j(aVarI2);
                return new com.revolut.feature.tax_residency.impl.v2.ui.declaration_flow.a(taxResidencyDeclarationFlowContract$InputData, dVar3, dVar4, aVar6, new lal.a(aVarI2));
            case 21:
                return new com.revolut.otp.input.flow.email.flow.a(((ini.a) this.f160461b).f162952a);
            case 22:
                return new com.revolut.otp.input.flow.code.flow.confirm_with_otp_code.a(((ini.b) this.f160461b).f162955a);
            case 23:
                return new qni.i(((ini.d) this.f160461b).f162960a, new qni.j());
            case 24:
                return new nni.e(((ini.h) this.f160461b).f162972b, new nni.f());
            case 25:
                return new nni.e(((ini.h) this.f160461b).f162972b, new nni.f());
            case 26:
                io9.a aVar7 = (io9.a) this.f160461b;
                return new mo9.d(aVar7.f163200a, aVar7.f163201b, aVar7.f163202c, aVar7.d, aVar7.e, aVar7.f, aVar7.f163203g, aVar7.f163204h, aVar7.i, aVar7.f163205j, aVar7.k, aVar7.f163206l, aVar7.f163207m, aVar7.f163208n, 0);
            case 27:
                return new com.revolut.feature.rev_points.giftcards.impl.ui.flow.root.a(((iwb.g) this.f160461b).f169029a);
            case 28:
                ixc.a aVar8 = (ixc.a) this.f160461b;
                return new c3d.d(aVar8.f169543a, aVar8.f169544b, 13);
            default:
                j1a.e eVar = (j1a.e) this.f160461b;
                s1a.j perPersonAmountCalculator = new s1a.j();
                Intrinsics.checkNotNullParameter(perPersonAmountCalculator, "perPersonAmountCalculator");
                return new s1a.g(new s1a.i(), eVar.f170295a, new s1a.j());
        }
    }
}
