package qgk;

import com.revolut.feature.defi.exchange.impl.ui.cefi_to_defi.flow.CeFiToDeFiFlowContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes11.dex */
public final class f1 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f245952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f245953b;

    public /* synthetic */ f1(Object obj2, int i) {
        this.f245952a = i;
        this.f245953b = obj2;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f245952a) {
            case 0:
                return new com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_selection.a(((g1) this.f245953b).f245966a);
            case 1:
                return new ynk.i(new ynk.h(), ((x1) this.f245953b).f246322a);
            case 2:
                qh8.k kVar = (qh8.k) this.f245953b;
                til.m mVarA = kVar.f246534g.a();
                vc.s.j(mVarA);
                qh8.b bVar = kVar.f;
                prl.e eVarB = bVar.b();
                rh8.d0 d0Var = (rh8.d0) bVar.f246503q.get();
                vc.s.j(d0Var);
                gte.a aVarB = kVar.f246536j.b();
                vc.s.j(aVarB);
                hj8.a aVarA = kVar.k.a();
                vc.s.j(aVarA);
                return new com.revolut.feature.junior_onboarding.impl.ui.creation.a(mVarA, eVarB, d0Var, aVarB, aVarA, kVar.f246535h.a());
            case 3:
                ji8.d dVar = ((qh8.i) this.f245953b).f246526a;
                return new ji8.g(new ji8.h(dVar), dVar);
            case 4:
                return new com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.licence.a(((ql7.k0) this.f245953b).i.e());
            case 5:
                return new com.revolut.feature.insurance_car.impl.ui.flow.mta_review.c(((ql7.u0) this.f245953b).f247484a);
            case 6:
                return new com.revolut.feature.insurance_car.impl.ui.flow.onboarding.proof_of_driving_number.b(((ql7.e1) this.f245953b).f247284a);
            case 7:
                return new com.revolut.feature.insurance_car.impl.ui.flow.smart_driving.a(((ql7.h1) this.f245953b).f247321a);
            case 8:
                qm1.i iVar = (qm1.i) this.f245953b;
                return new fdk.j(iVar.f247754a, iVar.f247755b, iVar.f247756c, iVar.d, iVar.e, iVar.f, iVar.f247757g, iVar.f247758h, iVar.i, iVar.f247759j, iVar.k, iVar.f247760l, iVar.f247761m, 2);
            case 9:
                qr1.a aVar = (qr1.a) this.f245953b;
                return new rr1.g(aVar.f248599a, aVar.f248600b, aVar.f248601c, aVar.d, aVar.e, aVar.f, aVar.f248602g, aVar.f248603h, aVar.i, aVar.f248604j, aVar.k, aVar.f248605l, aVar.f248606m, aVar.f248607n, aVar.o, aVar.f248608p, aVar.f248609q);
            case 10:
                qud.a aVar2 = (qud.a) this.f245953b;
                return new uud.f(new uud.e(aVar2.f249349a, aVar2.f249350b.f249364b.h()));
            case 11:
                qud.g gVar = (qud.g) this.f245953b;
                return new tud.f(gVar.f249397a, new tud.e(gVar.f249398b.f249364b.h()));
            case 12:
                qve.k kVar2 = (qve.k) this.f245953b;
                wj0.a aVarI = ((nj0.d) kVar2.f249602a).i();
                vc.s.j(aVarI);
                ove.t tVar = kVar2.f249604b;
                p71.a aVar3 = (p71.a) tVar.N.get();
                vc.s.j(aVar3);
                zte.b bVar2 = (zte.b) tVar.f230127h0.get();
                vc.s.j(bVar2);
                return new com.revolut.feature.topup_screen.impl.flow.add_card.b(aVarI, aVar3, bVar2);
            case 13:
                return new com.revolut.feature.topup_screen.impl.flows.topup.fee_bottom_sheet.a(new qee.s(((qve.s) this.f245953b).f249653a), new sye.a());
            case 14:
                kw7.c cVar = (kw7.c) ((qw7.k) this.f245953b).f249830a.k.get();
                vc.s.j(cVar);
                return new c1g.v(cVar);
            case 15:
                qy1.a aVar4 = (qy1.a) this.f245953b;
                return new m41.e(aVar4.f250103a, aVar4.f250104b, aVar4.f250105c, aVar4.d, aVar4.e, aVar4.f, aVar4.f250106g, aVar4.f250107h, aVar4.i, aVar4.f250108j, aVar4.k, 2);
            case 16:
                return new n8j.a(((qye.a) this.f245953b).f250282a, 13);
            case 17:
                qye.d dVar2 = (qye.d) this.f245953b;
                return new c3d.d(dVar2.f250287a, dVar2.f250288b, 28);
            case 18:
                r29.b bVar3 = (r29.b) this.f245953b;
                return new a16.b(bVar3.f251071a, bVar3.f251072b, 19);
            case 19:
                r29.d dVar3 = (r29.d) this.f245953b;
                return new t29.j(dVar3.f251075b, dVar3.f251076c, dVar3.d, dVar3.e, dVar3.f, dVar3.f251077g, dVar3.f251078h, dVar3.i, dVar3.f251079j, dVar3.k, dVar3.f251080l, dVar3.f251081m, dVar3.f251082n, dVar3.f251074a);
            case 20:
                r29.f fVar = (r29.f) this.f245953b;
                return new emi.g(fVar.f251086a, fVar.f251087b, fVar.f251088c, fVar.d, fVar.e, 11);
            case 21:
                r36.b bVar4 = (r36.b) this.f245953b;
                CeFiToDeFiFlowContract$InputData ceFiToDeFiFlowContract$InputData = bVar4.f251154a;
                r36.e eVar = bVar4.f251155b;
                o36.b bVar5 = (o36.b) eVar.B.get();
                vv5.e eVar2 = eVar.f251168g;
                xv5.c cVarA = eVar2.a();
                vc.s.j(cVarA);
                rul.e eVar3 = new rul.e(bVar5, cVarA);
                m2j.j jVarC = eVar.f251176r.c();
                xv5.c cVarA2 = eVar2.a();
                vc.s.j(cVarA2);
                return new com.revolut.feature.defi.exchange.impl.ui.cefi_to_defi.flow.b(ceFiToDeFiFlowContract$InputData, new s36.h(eVar3, jVarC, cVarA2, eVar.f251177s.f()), new w36.a());
            case 22:
                return new com.revolut.feature.defi.exchange.impl.ui.flow.a(((r36.f) this.f245953b).f251182a);
            case 23:
                r3i.a aVar5 = (r3i.a) this.f245953b;
                return new a16.b(aVar5.f251294a, aVar5.f251295b, 16);
            case 24:
                r41.c cVar2 = (r41.c) this.f245953b;
                return new jje.j(cVar2.f251422a, cVar2.f251423b, cVar2.f251424c, cVar2.d, cVar2.e, cVar2.f, cVar2.f251425g, cVar2.f251426h, cVar2.i, cVar2.f251427j, cVar2.k, cVar2.f251428l, cVar2.f251429m, cVar2.f251430n, cVar2.o, cVar2.f251431p, cVar2.f251432q, cVar2.f251433r, cVar2.f251434s, cVar2.f251435t, cVar2.u, cVar2.v, cVar2.f251436w, cVar2.f251437x, cVar2.f251438y, cVar2.z, cVar2.A, cVar2.B, cVar2.C, cVar2.D, cVar2.E, cVar2.F, cVar2.G, cVar2.H, cVar2.I, cVar2.J, cVar2.K, cVar2.L, cVar2.M, cVar2.N, cVar2.O, cVar2.P, cVar2.Q, cVar2.R, cVar2.S, cVar2.T);
            case 25:
                r4l.a aVar6 = (r4l.a) this.f245953b;
                CoroutineScope coroutineScopeA = aVar6.f251510a.a();
                vc.s.j(coroutineScopeA);
                gte.a aVarB2 = aVar6.f251511b.b();
                vc.s.j(aVarB2);
                sri.m mVarD = ((g8b.a) aVar6.f251512c).d();
                vc.s.j(mVarD);
                rql.b bVar6 = (rql.b) aVar6.d.f.get();
                vc.s.j(bVar6);
                su9.c cVar3 = new su9.c(aVar6.e.c(), new bkl.g(fe0.d.a(), 1));
                arh.a aVar7 = (arh.a) aVar6.f.f324492c.get();
                vc.s.j(aVar7);
                return new t4l.d(coroutineScopeA, aVarB2, mVarD, bVar6, cVar3, aVar7);
            case 26:
                r5a.a aVar8 = (r5a.a) this.f245953b;
                tla.e eVarA = aVar8.f251547a.a();
                vc.s.j(eVarA);
                j30.d dVarU = ((h30.n) aVar8.f251548b).u();
                vc.s.j(dVarU);
                s3a.r rVar = aVar8.f251549c;
                k4a.v vVar = (k4a.v) ((s3a.k) rVar).l0.get();
                vc.s.j(vVar);
                vqi.a aVar9 = (vqi.a) ((s3a.k) rVar).f259540n0.get();
                vc.s.j(aVar9);
                return new a5a.d(eVarA, dVarU, vVar, aVar9);
            case 27:
                r5d.a aVar10 = (r5d.a) this.f245953b;
                return new s5d.b(aVar10.f251581a, aVar10.f251582b, 0);
            case 28:
                g6e.b bVarA = ((r6e.a) this.f245953b).f251676a.a();
                vc.s.j(bVarA);
                return new w8e.a(bVarA);
            default:
                r7d.l lVar = (r7d.l) this.f245953b;
                ee0.a aVar11 = lVar.f252131c;
                je0.d mapper = aVar11.b();
                vc.s.j(mapper);
                yk0.a databaseSessionProvider = lVar.d.b();
                vc.s.j(databaseSessionProvider);
                xe0.f storageFactory = aVar11.f();
                vc.s.j(storageFactory);
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                return xe0.f.f(storageFactory, databaseSessionProvider, "shared_help_prefs", mapper, 1, zhm.f0.f322471a, 32);
        }
    }
}
