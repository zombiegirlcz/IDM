package nk7;

import android.app.Activity;
import android.content.Context;
import ch.qos.logback.core.rolling.SizeBasedTriggeringPolicy;
import com.revolut.feature.apm.breb.api.navigation.BrebNavigation$InputData;
import com.revolut.feature.apm.breb.impl.ui.qr_request.add_details.BrebQrRequestAddDetailsScreenContract$InputData;
import com.revolut.feature.insurance.impl.ui.cfac.claim.coverage_info.CFACInsuranceCoverageInfoScreenContract$InputData;
import com.revolut.feature.insurance.impl.ui.cfac.claim.exact_reason.CFACInsuranceExactReasonScreenContract$InputData;
import com.revolut.feature.insurance.impl.ui.cfac.claim.expense_details.CFACInsuranceExpenseDetailsScreenContract$InputData;
import com.revolut.feature.insurance.impl.ui.cfac.claim.reason_group.CFACInsuranceReasonGroupScreenContract$InputData;
import com.revolut.feature.insurance.impl.ui.cfac.claim.shared.CFACInsuranceAddExpensesItemMapper;
import com.revolut.feature.insurance.impl.ui.cfac.details.CFACInsuranceDetailsScreenContract$InputData;
import com.revolut.feature.junior_rewards.impl.ui.details_dialog.JuniorRewardDetailsDialogScreenContract$InputData;
import com.revolut.feature.junior_rewards.impl.ui.list.JuniorRewardsListScreenContract$InputData;
import com.revolut.feature.transfer_reasons.impl.ui.reuse_declaration.TransferReasonsReuseDeclarationScreenContract$InputData;
import com.revolut.feature.user_declarations.shared.flows.income.screen.IncomeScreenContract$InputData;
import com.revolut.feature.user_declarations.shared.flows.place_of_birth.screen.PlaceOfBirthScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.ratedetails.impl.ui.RateDetailsScreen;
import com.revolut.retail.feature.ratedetails.impl.ui.RateDetailsScreenContract$InputData;
import com.revolut.shared.feature.user_declarations.api.navigation.AddressSuggestionControllerDescriptor$InputData;
import com.revolut.shared.feature.user_declarations.api.navigation.PepFlowControllerDescriptor$InputData;
import f60.z;
import java.util.Optional;
import kotlin.jvm.internal.Intrinsics;
import nyb.i0;
import qgk.k3;
import rp0.g1;
import rp0.x0;
import t80.e;
import uv1.d0;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f216690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f216691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f216692c;
    public final Object d;

    public /* synthetic */ k(Object obj2, Object obj3, int i, int i2) {
        this.f216690a = i2;
        this.f216691b = obj2;
        this.d = obj3;
        this.f216692c = i;
    }

    private final Object a() {
        nv1.i iVar = (nv1.i) this.d;
        int i = this.f216692c;
        if (i != 0) {
            if (i != 1) {
                throw new AssertionError(i);
            }
            z80.b bVarS = iVar.f219417b.f219401j.s();
            vc.s.j(bVarS);
            return new yv1.n(new sv1.a(bVarS));
        }
        yv1.e eVar = iVar.f219416a;
        sv1.d dVar = new sv1.d();
        nv1.g gVar = ((nv1.e) this.f216691b).f219389b;
        zu1.a aVar = (zu1.a) gVar.f219411x.get();
        sf0.h hVarB = gVar.f219400h.b();
        vc.s.j(hVarB);
        return new yv1.l(eVar, dVar, new gw1.g(aVar, new gw1.b(hVarB)), (cli.n) iVar.f219418c.get());
    }

    private final Object b() {
        l70.e eVar = ((nv1.g) this.f216691b).f219401j;
        int i = this.f216692c;
        if (i != 0) {
            if (i != 1) {
                throw new AssertionError(i);
            }
            w80.b bVarJ = eVar.j();
            vc.s.j(bVarJ);
            return new kw1.h(new u80.o(), bVarJ);
        }
        nv1.o oVar = (nv1.o) this.d;
        BrebQrRequestAddDetailsScreenContract$InputData brebQrRequestAddDetailsScreenContract$InputData = oVar.f219433a;
        cli.n nVar = (cli.n) oVar.f219435c.get();
        w80.b bVarJ2 = eVar.j();
        vc.s.j(bVarJ2);
        return new kw1.i(brebQrRequestAddDetailsScreenContract$InputData, nVar, bVarJ2);
    }

    private final Object c() {
        nv1.g gVar = (nv1.g) this.f216691b;
        nv1.r rVar = (nv1.r) this.d;
        int i = this.f216692c;
        if (i == 0) {
            return new ow1.q((cli.n) rVar.f219444c.get(), rVar.f219442a, (rv1.v) gVar.z.get(), gVar.o.e());
        }
        if (i != 1) {
            throw new AssertionError(i);
        }
        z80.b bVarS = rVar.f219443b.f219401j.s();
        vc.s.j(bVarS);
        return new ow1.s(new sv1.a(bVarS));
    }

    private final Object d() {
        nyj.c cVar = (nyj.c) this.f216691b;
        nyj.a aVar = (nyj.a) this.d;
        int i = this.f216692c;
        if (i == 0) {
            return new ryj.x((jki.p) aVar.f220878b.get(), aVar.f220877a, (g09.h) cVar.D.get(), (g09.f) cVar.O.get());
        }
        if (i == 1) {
            return new ryj.y();
        }
        throw new AssertionError(i);
    }

    private final Object e() {
        nyj.c cVar = (nyj.c) this.f216691b;
        djf.c cVar2 = cVar.i;
        int i = this.f216692c;
        if (i != 0) {
            if (i != 1) {
                throw new AssertionError(i);
            }
            whf.n nVarB = cVar2.b();
            vc.s.j(nVarB);
            return new tyj.k(nVarB);
        }
        jki.p pVar = (jki.p) ((nyj.d) this.d).f220899a.get();
        whf.b bVarA = cVar2.a();
        vc.s.j(bVarA);
        g09.j jVar = (g09.j) cVar.I.get();
        wsg.n nVarB2 = cVar.f220887j.b();
        j61.b bVarC = cVar.k.c();
        vc.s.j(bVarC);
        return new tyj.j(pVar, bVarA, jVar, nVarB2, bVarC);
    }

    @Override // phm.a
    public final Object get() {
        Object kVar;
        switch (this.f216690a) {
            case 0:
                q qVar = (q) this.f216691b;
                l lVar = (l) this.d;
                int i = this.f216692c;
                if (i != 0) {
                    if (i == 1) {
                        return new rj7.n(new lk7.r());
                    }
                    throw new AssertionError(i);
                }
                jki.p pVar = (jki.p) lVar.f216694b.get();
                CFACInsuranceCoverageInfoScreenContract$InputData cFACInsuranceCoverageInfoScreenContract$InputData = lVar.f216693a;
                c70.a aVarZ = qVar.d.z();
                vc.s.j(aVarZ);
                mu7.a aVar = (mu7.a) qVar.f216718g.i.get();
                vc.s.j(aVar);
                return new rj7.m(pVar, cFACInsuranceCoverageInfoScreenContract$InputData, aVarZ, aVar);
            case 1:
                m mVar = (m) this.d;
                int i2 = this.f216692c;
                if (i2 != 0) {
                    if (i2 == 1) {
                        return new lk7.q(new lk7.r(), new lk7.b(), new lk7.t());
                    }
                    throw new AssertionError(i2);
                }
                jki.p pVar2 = (jki.p) mVar.f216697b.get();
                CFACInsuranceDetailsScreenContract$InputData cFACInsuranceDetailsScreenContract$InputData = mVar.f216696a;
                si7.a aVarA = ((q) this.f216691b).f216715a.a();
                vc.s.j(aVarA);
                return new lk7.l(pVar2, cFACInsuranceDetailsScreenContract$InputData, aVarA);
            case 2:
                n nVar = (n) this.d;
                int i3 = this.f216692c;
                if (i3 == 0) {
                    return new ok7.l((jki.p) nVar.f216700b.get(), nVar.f216699a, ((nj0.d) ((q) this.f216691b).f216716b).f216295c);
                }
                if (i3 == 1) {
                    return new ok7.m();
                }
                throw new AssertionError(i3);
            case 3:
                o oVar = (o) this.d;
                int i5 = this.f216692c;
                if (i5 != 0) {
                    if (i5 == 1) {
                        return new ck7.l(new ik7.g(), new ik7.e(((k3) oVar.f216703b.e).b()), 1);
                    }
                    throw new AssertionError(i5);
                }
                jki.p pVar3 = (jki.p) oVar.f216704c.get();
                CFACInsuranceExactReasonScreenContract$InputData cFACInsuranceExactReasonScreenContract$InputData = oVar.f216702a;
                ffk.t tVarF = ((q) this.f216691b).f.f();
                vc.s.j(tVarF);
                return new uj7.j(pVar3, cFACInsuranceExactReasonScreenContract$InputData, tVarF);
            case 4:
                q qVar2 = (q) this.f216691b;
                p pVar4 = (p) this.d;
                int i6 = this.f216692c;
                switch (i6) {
                    case 0:
                        return f0k.d.p((e60.a) pVar4.k.get());
                    case 1:
                        com.revolut.kompot.navigable.a aVar2 = (com.revolut.kompot.navigable.a) pVar4.d.get();
                        g60.a aVarA2 = f60.v.a((com.revolut.kompot.navigable.a) pVar4.d.get());
                        Activity activityA = f60.t.a((com.revolut.kompot.navigable.a) pVar4.d.get());
                        t80.x xVarJ = pVar4.j();
                        com.revolut.kompot.navigable.a aVar3 = (com.revolut.kompot.navigable.a) pVar4.d.get();
                        f60.y.a(aVar3);
                        d4m.a aVarA3 = e4m.b.a(pVar4.e);
                        nli.a aVar4 = new nli.a((t80.c) pVar4.f.get(), f60.t.a((com.revolut.kompot.navigable.a) pVar4.d.get()));
                        t80.x xVarJ2 = pVar4.j();
                        zk0.b bVarL = pVar4.f216706b.d.l();
                        vc.s.j(bVarL);
                        return v1.c.q(aVar2, new t80.v(aVarA2, activityA, xVarJ, aVar3, aVarA3, aVar4, new oli.c(xVarJ2, bVarL, new nli.a((t80.c) pVar4.f.get(), f60.t.a((com.revolut.kompot.navigable.a) pVar4.d.get())), f60.v.a((com.revolut.kompot.navigable.a) pVar4.d.get()), pVar4.c()), new oli.g(f60.u.a(f60.t.a((com.revolut.kompot.navigable.a) pVar4.d.get())), v1.c.e((com.revolut.kompot.navigable.a) pVar4.d.get()), new ami.n(e4m.b.a(pVar4.f216708g), 1), e4m.b.a(pVar4.e), pVar4.j(), new nli.a((t80.c) pVar4.f.get(), f60.t.a((com.revolut.kompot.navigable.a) pVar4.d.get())), new i90.b(), pVar4.b(), pVar4.c()), pVar4.c()), f60.x.a(), (rp0.m) pVar4.f216709h.get(), (e60.t) pVar4.f216710j.get());
                    case 2:
                        com.revolut.kompot.navigable.a aVar5 = (com.revolut.kompot.navigable.a) pVar4.d.get();
                        f60.y.a(aVar5);
                        return pli.c.a(new ks0.n(aVar5));
                    case 3:
                        xj7.b.Companion.getClass();
                        return new t80.c(new e.a("CFACInsurance_Claims"), SizeBasedTriggeringPolicy.DEFAULT_MAX_FILE_SIZE);
                    case 4:
                        return t96.a.a();
                    case 5:
                        return z.a();
                    case 6:
                        aii.o oVar2 = (aii.o) pVar4.i.get();
                        y80.a aVarR = qVar2.d.r();
                        vc.s.j(aVarR);
                        return new e60.y(oVar2, aVarR, pVar4.b(), Optional.empty());
                    case 7:
                        n60.a aVar6 = (n60.a) pVar4.f216712m.get();
                        o5k.i.l(aVar6);
                        return aVar6;
                    case 8:
                        return o5k.i.q((com.revolut.kompot.navigable.a) pVar4.d.get());
                    case 9:
                        e60.t tVar = (e60.t) pVar4.f216710j.get();
                        f60.w.a(tVar);
                        return tVar;
                    case 10:
                        q qVar3 = pVar4.f216706b;
                        thf.g gVarE = qVar3.f216717c.e();
                        vc.s.j(gVarE);
                        w80.b bVarJ = qVar3.d.j();
                        vc.s.j(bVarJ);
                        wj7.s sVar = new wj7.s(gVarE, bVarJ);
                        CFACInsuranceExpenseDetailsScreenContract$InputData cFACInsuranceExpenseDetailsScreenContract$InputData = pVar4.f216705a;
                        e60.a aVar7 = (e60.a) pVar4.k.get();
                        n60.a aVar8 = (n60.a) pVar4.f216712m.get();
                        l80.e eVarH = qVar2.d.h();
                        vc.s.j(eVarH);
                        w80.b bVarJ2 = qVar2.d.j();
                        vc.s.j(bVarJ2);
                        return new com.revolut.feature.insurance.impl.ui.cfac.claim.expense_details.b(sVar, cFACInsuranceExpenseDetailsScreenContract$InputData, aVar7, aVar8, eVarH, bVarJ2);
                    default:
                        throw new AssertionError(i6);
                }
            case 5:
                s sVar2 = (s) this.d;
                int i21 = this.f216692c;
                if (i21 == 0) {
                    return new yj7.i((jki.p) sVar2.f216725c.get(), sVar2.f216723a, (mj7.b) ((j) this.f216691b).e.get());
                }
                if (i21 != 1) {
                    throw new AssertionError(i21);
                }
                thf.g gVarE2 = sVar2.f216724b.f216717c.e();
                vc.s.j(gVarE2);
                return new tk7.i(new ik7.j(gVarE2), new CFACInsuranceAddExpensesItemMapper());
            case 6:
                u uVar = (u) this.d;
                int i22 = this.f216692c;
                if (i22 != 0) {
                    if (i22 == 1) {
                        return new ck7.l(new ik7.g(), new ik7.e(((k3) uVar.f216729b.e).b()), 0);
                    }
                    throw new AssertionError(i22);
                }
                jki.p pVar5 = (jki.p) uVar.f216730c.get();
                CFACInsuranceReasonGroupScreenContract$InputData cFACInsuranceReasonGroupScreenContract$InputData = uVar.f216728a;
                ffk.t tVarF2 = ((q) this.f216691b).f.f();
                vc.s.j(tVarF2);
                return new ck7.k(pVar5, cFACInsuranceReasonGroupScreenContract$InputData, tVarF2);
            case 7:
                nl5.f fVar = (nl5.f) this.d;
                nl5.e eVar = (nl5.e) this.f216691b;
                int i32 = this.f216692c;
                if (i32 == 0) {
                    return kxa.j.l((j60.a) fVar.d.get());
                }
                if (i32 == 1) {
                    return h30.l.p((com.revolut.kompot.navigable.a) fVar.f217030b.get(), (rp0.m) fVar.f217031c.get());
                }
                if (i32 == 2) {
                    return new rp0.m();
                }
                if (i32 != 3) {
                    if (i32 == 4) {
                        return new xl5.b((j60.a) fVar.d.get());
                    }
                    if (i32 == 5) {
                        return new wl5.u((ul5.g) eVar.f217024s.get());
                    }
                    throw new AssertionError(i32);
                }
                wsg.n nVarB = eVar.i.b();
                sl5.f fVar2 = (sl5.f) eVar.z.get();
                ul5.g gVar = (ul5.g) eVar.f217024s.get();
                fk3.a aVarA4 = eVar.f217017j.a();
                vc.s.j(aVarA4);
                ul5.e eVar2 = new ul5.e(aVarA4);
                xl5.b bVar = (xl5.b) fVar.f.get();
                i0 i0VarF = eVar.k.f();
                vc.s.j(i0VarF);
                xvh.c cVarA = ((a6d.e) eVar.f217016h).a();
                vc.s.j(cVarA);
                return new wl5.s(nVarB, fVar2, gVar, eVar2, bVar, i0VarF, cVarA, fVar.f217029a, (jki.p) fVar.f217032g.get());
            case 8:
                nm8.e eVar3 = (nm8.e) this.f216691b;
                nm8.c cVar = (nm8.c) this.d;
                int i33 = this.f216692c;
                if (i33 != 0) {
                    if (i33 == 1) {
                        return new qm8.e();
                    }
                    if (i33 != 2) {
                        throw new AssertionError(i33);
                    }
                    ViewController viewController = cVar.f217203b;
                    rm8.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(viewController, "viewController");
                    return new f01.c(viewController.m2());
                }
                cli.n nVar2 = (cli.n) cVar.d.get();
                JuniorRewardDetailsDialogScreenContract$InputData juniorRewardDetailsDialogScreenContract$InputData = cVar.f217202a;
                bgc.e eVarC = eVar3.f217208a.c();
                vc.s.j(eVarC);
                hj8.a aVarA5 = eVar3.f217209b.a();
                vc.s.j(aVarA5);
                om8.f fVar3 = (om8.f) eVar3.f217210c.i.get();
                vc.s.j(fVar3);
                nm8.e eVar4 = cVar.f217204c;
                kbb.c cVarF = eVar4.d.f();
                s70.a aVarM = eVar4.e.m();
                vc.s.j(aVarM);
                return new qm8.d(nVar2, juniorRewardDetailsDialogScreenContract$InputData, eVarC, aVarA5, fVar3, new sm8.a(cVarF, aVarM, (f01.a) cVar.e.get()), new sm8.b());
            case 9:
                nm8.e eVar5 = (nm8.e) this.f216691b;
                nm8.b bVar2 = eVar5.f217210c;
                nm8.d dVar = (nm8.d) this.d;
                int i43 = this.f216692c;
                if (i43 != 0) {
                    if (i43 == 1) {
                        return new at.r(new vm8.a());
                    }
                    if (i43 != 2) {
                        throw new AssertionError(i43);
                    }
                    ViewController viewController2 = dVar.f217206b;
                    um8.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(viewController2, "viewController");
                    return new f01.c(viewController2.m2());
                }
                cli.n nVar3 = (cli.n) dVar.d.get();
                JuniorRewardsListScreenContract$InputData juniorRewardsListScreenContract$InputData = dVar.f217205a;
                bgc.e eVarC2 = eVar5.f217208a.c();
                vc.s.j(eVarC2);
                hj8.a aVarA6 = eVar5.f217209b.a();
                vc.s.j(aVarA6);
                om8.f fVar4 = (om8.f) bVar2.i.get();
                vc.s.j(fVar4);
                nm8.e eVar6 = dVar.f217207c;
                kbb.c cVarF2 = eVar6.d.f();
                s70.a aVarM2 = eVar6.e.m();
                vc.s.j(aVarM2);
                sm8.a aVar9 = new sm8.a(cVarF2, aVarM2, (f01.a) dVar.e.get());
                sm8.b bVar3 = new sm8.b();
                om8.c cVarA2 = bVar2.a();
                vc.s.j(cVarA2);
                return new com.revolut.feature.junior_rewards.impl.ui.list.a(nVar3, juniorRewardsListScreenContract$InputData, eVarC2, aVarA6, fVar4, aVar9, bVar3, cVarA2);
            case 10:
                nng.p pVar6 = (nng.p) this.f216691b;
                nng.a aVar10 = (nng.a) this.d;
                int i59 = this.f216692c;
                if (i59 == 0) {
                    ivh.c cVar2 = (ivh.c) aVar10.d.get();
                    gvh.d.a(cVar2);
                    return cVar2;
                }
                if (i59 != 1) {
                    if (i59 != 2) {
                        throw new AssertionError(i59);
                    }
                    AddressSuggestionControllerDescriptor$InputData addressSuggestionControllerDescriptor$InputData = aVar10.f217631a;
                    jvh.a aVarA7 = pVar6.e.a();
                    vc.s.j(aVarA7);
                    return new com.revolut.feature.user_declarations.shared.flows.address_suggestion.flow.a(addressSuggestionControllerDescriptor$InputData, aVarA7, (ivh.c) aVar10.d.get());
                }
                nng.p pVar7 = aVar10.f217632b;
                v60.e eVarA = pVar7.f.a();
                vc.s.j(eVarA);
                sf0.h hVarB = pVar7.f217676g.b();
                vc.s.j(hVarB);
                return gvh.c.a(new kvh.h(hVarB, eVarA), pVar6.f217677h.a());
            case 11:
                nng.e eVar7 = (nng.e) this.d;
                nng.p pVar8 = (nng.p) this.f216691b;
                int i66 = this.f216692c;
                if (i66 == 0) {
                    return new sng.i(eVar7.f217642b, (cli.n) eVar7.d.get());
                }
                if (i66 == 1) {
                    l80.e eVarH2 = pVar8.f217673a.h();
                    vc.s.j(eVarH2);
                    return new sng.j(eVarH2, (ung.b) eVar7.f217643c.get());
                }
                if (i66 != 2) {
                    throw new AssertionError(i66);
                }
                l80.e eVarH3 = pVar8.f217673a.h();
                vc.s.j(eVarH3);
                return new ung.c(eVarH3);
            case 12:
                nng.g gVar2 = (nng.g) this.d;
                nng.p pVar9 = (nng.p) this.f216691b;
                int i74 = this.f216692c;
                if (i74 == 0) {
                    qd0.b bVarN = gVar2.f217648b.f217673a.n();
                    vc.s.j(bVarN);
                    xng.o oVar3 = new xng.o(bVarN, new u80.o());
                    IncomeScreenContract$InputData incomeScreenContract$InputData = gVar2.f217647a;
                    w80.b bVar4 = (w80.b) gVar2.f217649c.get();
                    pbi.i iVar = (pbi.i) pVar9.f217675c.i.get();
                    vc.s.j(iVar);
                    return new com.revolut.feature.user_declarations.shared.flows.income.screen.b(oVar3, incomeScreenContract$InputData, bVar4, iVar, (x7a.d) gVar2.d.get());
                }
                if (i74 != 1) {
                    if (i74 == 2) {
                        return new wng.b((f01.a) pVar9.k.get(), vd0.d.a());
                    }
                    throw new AssertionError(i74);
                }
                qd0.b languageProvider = pVar9.f217673a.n();
                vc.s.j(languageProvider);
                yng.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
                return v80.b.b(languageProvider, false, false, 58);
            case 13:
                nng.p pVar10 = (nng.p) this.f216691b;
                nng.j jVar = (nng.j) this.d;
                int i92 = this.f216692c;
                if (i92 == 0) {
                    ivh.c cVar3 = (ivh.c) jVar.d.get();
                    gvh.d.a(cVar3);
                    return cVar3;
                }
                if (i92 != 1) {
                    if (i92 != 2) {
                        throw new AssertionError(i92);
                    }
                    PepFlowControllerDescriptor$InputData pepFlowControllerDescriptor$InputData = jVar.f217657a;
                    jvh.a aVarA8 = pVar10.e.a();
                    vc.s.j(aVarA8);
                    return new com.revolut.feature.user_declarations.shared.flows.pep.a(pepFlowControllerDescriptor$InputData, aVarA8, new fog.a(), (ivh.c) jVar.d.get());
                }
                nng.p pVar11 = jVar.f217658b;
                v60.e eVarA2 = pVar11.f.a();
                vc.s.j(eVarA2);
                sf0.h hVarB2 = pVar11.f217676g.b();
                vc.s.j(hVarB2);
                return gvh.c.a(new kvh.h(hVarB2, eVarA2), pVar10.f217677h.a());
            case 14:
                nng.m mVar2 = (nng.m) this.d;
                oai.a sharedDeps = ((nng.p) this.f216691b).f217675c;
                int i96 = this.f216692c;
                if (i96 == 0) {
                    oog.m mVar3 = new oog.m();
                    PlaceOfBirthScreenContract$InputData placeOfBirthScreenContract$InputData = mVar2.f217665a;
                    pbi.e eVar8 = (pbi.e) sharedDeps.f223655h.get();
                    vc.s.j(eVar8);
                    pbi.c cVar4 = (pbi.c) sharedDeps.f223656j.get();
                    vc.s.j(cVar4);
                    return new com.revolut.feature.user_declarations.shared.flows.place_of_birth.screen.a(mVar3, placeOfBirthScreenContract$InputData, eVar8, cVar4, mVar2.f217666b, mVar2.f217667c);
                }
                if (i96 == 1) {
                    pog.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(sharedDeps, "sharedDeps");
                    x7a.c cVar5 = (x7a.c) sharedDeps.f.get();
                    vc.s.k(cVar5);
                    return cVar5;
                }
                if (i96 != 2) {
                    throw new AssertionError(i96);
                }
                pog.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(sharedDeps, "sharedDeps");
                x7a.d dVar2 = (x7a.d) sharedDeps.f223654g.get();
                vc.s.k(dVar2);
                return dVar2;
            case 15:
                npk.c cVar6 = (npk.c) this.f216691b;
                npk.d dVar3 = (npk.d) this.d;
                int i99 = this.f216692c;
                switch (i99) {
                    case 0:
                        return kxa.j.l((j60.a) dVar3.f.get());
                    case 1:
                        return h30.l.p((com.revolut.kompot.navigable.a) dVar3.d.get(), (rp0.m) dVar3.e.get());
                    case 2:
                        return new rp0.m();
                    case 3:
                        k2d.d dVar4 = cVar6.f218249a;
                        m2d.a factory = new m2d.a();
                        zpk.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory, "factory");
                        return m2d.a.a();
                    case 4:
                        jpc.e factory2 = cVar6.f218250b.a();
                        j60.a bottomExpandableDialogControllerExtension = (j60.a) dVar3.f.get();
                        zpk.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory2, "factory");
                        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
                        return factory2.c("COMBINED_WATCHLIST_ORDERING_HOME", bottomExpandableDialogControllerExtension);
                    case 5:
                        RateDetailsScreenContract$InputData inputData = dVar3.f218257a;
                        gte.a aVarB = cVar6.f218251c.f218248a.b();
                        vc.s.j(aVarB);
                        qpk.a rateDetailsExchangeCommandProvider = new qpk.a(aVarB);
                        zpk.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(inputData, "inputData");
                        Intrinsics.checkNotNullParameter(rateDetailsExchangeCommandProvider, "rateDetailsExchangeCommandProvider");
                        return new aqk.a(inputData, rateDetailsExchangeCommandProvider);
                    case 6:
                        RateDetailsScreenContract$InputData rateDetailsScreenContract$InputData = dVar3.f218257a;
                        ypk.b bVar5 = (ypk.b) dVar3.k.get();
                        ypk.c cVar7 = (ypk.c) dVar3.f218263l.get();
                        o9j.b bVar6 = (o9j.b) cVar6.f.f.get();
                        vc.s.j(bVar6);
                        return new ypk.g(rateDetailsScreenContract$InputData, bVar5, cVar7, bVar6);
                    case 7:
                        BaseScreen screen = dVar3.f218258b;
                        zpk.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(screen, "screen");
                        return (RateDetailsScreen) screen;
                    case 8:
                        return new ypk.c(((n51.a) cVar6.d).b(), cVar6.e.a());
                    case 9:
                        jki.p pVar12 = (jki.p) dVar3.o.get();
                        RateDetailsScreenContract$InputData rateDetailsScreenContract$InputData2 = dVar3.f218257a;
                        npk.c cVar8 = dVar3.f218259c;
                        fk3.a aVarA9 = cVar8.f218252g.a();
                        vc.s.j(aVarA9);
                        xh5.a aVarA10 = cVar8.f218253h.a();
                        vc.s.j(aVarA10);
                        tj3.a aVarA11 = cVar8.i.a();
                        vc.s.j(aVarA11);
                        ppk.c cVar9 = new ppk.c(aVarA9, aVarA10, aVarA11);
                        wif.a aVarA12 = cVar6.f218254j.a();
                        u1d.a aVar11 = (u1d.a) dVar3.i.get();
                        xpk.p pVar13 = (xpk.p) dVar3.f218266p.get();
                        l1d.a aVar12 = (l1d.a) dVar3.f218261h.get();
                        aqk.a aVar13 = (aqk.a) dVar3.f218262j.get();
                        ypk.a aVar14 = (ypk.a) dVar3.f218264m.get();
                        sh5.d dVarF = cVar6.f218253h.f();
                        vc.s.j(dVarF);
                        gte.a aVarB2 = cVar6.k.f278148a.b();
                        vc.s.j(aVarB2);
                        return new xpk.m(pVar12, rateDetailsScreenContract$InputData2, cVar9, aVarA12, aVar11, pVar13, aVar12, aVar13, aVar14, dVarF, new w8b.c(aVarB2));
                    case 10:
                        return new xpk.o(dVar3.f218257a, (xpk.i) dVar3.f218265n.get());
                    case 11:
                        return new bqk.a();
                    case 12:
                        return new xpk.p();
                    default:
                        throw new AssertionError(i99);
                }
            case 16:
                nsf.d dVar5 = (nsf.d) this.d;
                int i100 = this.f216692c;
                if (i100 == 0) {
                    return new com.revolut.feature.transfer_reasons.impl.flow.a(new qsf.o(), new isf.d(), new qsf.k(), dVar5.f218810a, (g1) dVar5.e.get(), (csf.b) ((nsf.b) this.f216691b).f218804q.get(), new com.revolut.feature.transfer_reasons.impl.flow.b(dVar5.f218810a));
                }
                if (i100 != 1) {
                    throw new AssertionError(i100);
                }
                com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) dVar5.d.get();
                rsf.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller, "controller");
                return x0.a(g1.Companion, controller.C2().D2());
            case 17:
                nsf.g gVar3 = (nsf.g) this.d;
                nsf.b bVar7 = (nsf.b) this.f216691b;
                vxd.b bVar8 = bVar7.i;
                int i101 = this.f216692c;
                if (i101 != 0) {
                    if (i101 == 1) {
                        return new ltf.m();
                    }
                    throw new AssertionError(i101);
                }
                cli.n nVar4 = (cli.n) gVar3.f218818b.get();
                TransferReasonsReuseDeclarationScreenContract$InputData transferReasonsReuseDeclarationScreenContract$InputData = gVar3.f218817a;
                zxd.c cVarA3 = ((eyd.b) bVar8).a();
                vc.s.j(cVarA3);
                n0e.b bVarC = ((eyd.b) bVar8).c();
                vyd.a aVar15 = new vyd.a();
                sf0.h hVarB3 = bVar7.f218799j.b();
                vc.s.j(hVarB3);
                return new ltf.l(nVar4, transferReasonsReuseDeclarationScreenContract$InputData, cVarA3, bVarC, aVar15, hVarB3);
            case 18:
                nsf.r rVar = (nsf.r) this.d;
                int i102 = this.f216692c;
                if (i102 == 0) {
                    return new htf.r((cli.n) rVar.e.get(), new fnc.s(rVar.f218852b), (csf.a) ((nsf.b) this.f216691b).o.get(), new psf.a(), rVar.f218852b, new isf.d(), rVar.f218853c, rVar.d);
                }
                if (i102 == 1) {
                    return new htf.t(new isf.c());
                }
                throw new AssertionError(i102);
            case 19:
                nsf.r rVar2 = (nsf.r) this.d;
                int i103 = this.f216692c;
                if (i103 == 0) {
                    return new htf.r((cli.n) rVar2.e.get(), new fnc.s(rVar2.f218852b), (csf.a) ((nsf.b) this.f216691b).o.get(), new psf.a(), rVar2.f218852b, new isf.d(), rVar2.f218853c, rVar2.d);
                }
                if (i103 == 1) {
                    return new htf.t(new isf.c());
                }
                throw new AssertionError(i103);
            case 20:
                nsf.t tVar2 = (nsf.t) this.d;
                int i104 = this.f216692c;
                if (i104 == 0) {
                    return new ntf.r((cli.n) tVar2.e.get(), tVar2.f218858b, (csf.a) ((nsf.b) this.f216691b).o.get(), new psf.a(), new ntf.a((f01.a) tVar2.d.f218807t.get(), 0), tVar2.f218859c, new isf.d());
                }
                if (i104 == 1) {
                    return new ntf.t(new isf.c());
                }
                throw new AssertionError(i104);
            case 21:
                nsf.t tVar3 = (nsf.t) this.d;
                int i105 = this.f216692c;
                if (i105 == 0) {
                    return new ntf.r((cli.n) tVar3.e.get(), tVar3.f218858b, (csf.a) ((nsf.b) this.f216691b).o.get(), new psf.a(), new ntf.a((f01.a) tVar3.d.f218807t.get(), 0), tVar3.f218859c, new isf.d());
                }
                if (i105 == 1) {
                    return new ntf.t(new isf.c());
                }
                throw new AssertionError(i105);
            case 22:
                nv1.g gVar4 = (nv1.g) this.f216691b;
                nv1.e eVar9 = (nv1.e) this.d;
                nv1.g gVar5 = eVar9.f219389b;
                int i106 = this.f216692c;
                if (i106 == 0) {
                    Object extension = (com.revolut.feature.apm.core.ui.api.navigation.a) eVar9.d.get();
                    qv1.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(extension, "extension");
                    yji.n nVar5 = (yji.n) extension;
                    vc.s.k(nVar5);
                    return nVar5;
                }
                if (i106 == 1) {
                    zu1.a aVar16 = (zu1.a) gVar4.f219411x.get();
                    sf0.h hVarB4 = gVar5.f219400h.b();
                    vc.s.j(hVarB4);
                    return new gw1.e(aVar16, new gw1.b(hVarB4));
                }
                if (i106 != 2) {
                    if (i106 != 3) {
                        throw new AssertionError(i106);
                    }
                    BrebNavigation$InputData brebNavigation$InputData = eVar9.f219388a;
                    wj0.a aVarI = ((nj0.d) gVar4.f).i();
                    vc.s.j(aVarI);
                    return new com.revolut.feature.apm.breb.impl.flow.area.a(brebNavigation$InputData, aVarI, (com.revolut.feature.apm.core.ui.api.navigation.a) eVar9.d.get(), new rv1.z((rv1.v) gVar5.z.get()), (bv1.a) gVar4.f219409t.get());
                }
                zu1.a aVar17 = (zu1.a) gVar5.f219411x.get();
                sf0.h hVarB5 = gVar5.f219400h.b();
                vc.s.j(hVarB5);
                gw1.g extension2 = new gw1.g(aVar17, new gw1.b(hVarB5));
                qv1.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension2, "extension");
                return extension2;
            case 23:
                nv1.f fVar5 = (nv1.f) this.d;
                nv1.g gVar6 = fVar5.f219393b;
                nv1.g gVar7 = (nv1.g) this.f216691b;
                zc6.b bVar9 = gVar7.f219402l;
                int i107 = this.f216692c;
                if (i107 == 0) {
                    fd6.a aVar18 = (fd6.a) fVar5.d.get();
                    va.g.t(aVar18);
                    return aVar18;
                }
                if (i107 == 1) {
                    return va.g.s(((zc6.a) bVar9).d(), (xc6.a) fVar5.f219394c.get());
                }
                if (i107 == 2) {
                    return r6.b.k((zc6.a) bVar9, "factory");
                }
                if (i107 == 3) {
                    return va.g.u((xc6.a) fVar5.f219394c.get());
                }
                if (i107 != 4) {
                    throw new AssertionError(i107);
                }
                uv1.m mVar4 = fVar5.f219392a;
                h12.a aVarD = gVar7.f219403m.d();
                vc.s.j(aVarD);
                lx1.d dVarB = ((ey1.e) gVar7.f219404n).b();
                vc.s.j(dVarB);
                vz1.j jVarI = ((lz1.m) gVar7.f219396a).i();
                vc.s.j(jVarI);
                h12.h hVarF = gVar6.f219403m.f();
                vc.s.j(hVarF);
                ugc.a aVar19 = new ugc.a(hVarF);
                h12.h hVarF2 = gVar6.f219403m.f();
                vc.s.j(hVarF2);
                tsk.t tVar4 = new tsk.t(hVarF2);
                zu1.a aVar20 = (zu1.a) gVar7.f219411x.get();
                pn3.a aVar21 = (pn3.a) gVar7.A.get();
                i4b.f fVarB = ((zc6.a) bVar9).b();
                c70.a aVarZ2 = gVar7.f219401j.z();
                vc.s.j(aVarZ2);
                tqi.g gVarE3 = gVar7.o.e();
                rv1.v vVar = (rv1.v) gVar7.z.get();
                sv1.d dVar6 = new sv1.d();
                p12.l lVar2 = gVar6.f219403m;
                a12.j jVarE = lVar2.e();
                vc.s.j(jVarE);
                wv1.a actionsMapper = new wv1.a(jVarE);
                z80.b bVarS = gVar6.f219401j.s();
                vc.s.j(bVarS);
                wv1.b aliasSectionMapper = new wv1.b(new sv1.a(bVarS));
                a12.j jVarE2 = lVar2.e();
                vc.s.j(jVarE2);
                lx1.i iVarD = ((ey1.e) gVar6.f219404n).d();
                vc.s.j(iVarD);
                wv1.e contactsSectionMapper = new wv1.e(jVarE2, iVarD);
                a12.o oVarM = lVar2.m();
                vc.s.j(oVarM);
                wv1.g transactionsSectionMapper = new wv1.g(oVarM);
                a12.j jVarE3 = lVar2.e();
                vc.s.j(jVarE3);
                wv1.f qrInfoSectionMapper = new wv1.f(jVarE3);
                a12.j jVarE4 = lVar2.e();
                vc.s.j(jVarE4);
                wv1.c bottomSectionMapper = new wv1.c(jVarE4, ((zc6.a) gVar6.f219402l).c());
                vv1.g.Companion.getClass();
                Intrinsics.checkNotNullParameter(actionsMapper, "actionsMapper");
                Intrinsics.checkNotNullParameter(aliasSectionMapper, "aliasSectionMapper");
                Intrinsics.checkNotNullParameter(contactsSectionMapper, "contactsSectionMapper");
                Intrinsics.checkNotNullParameter(transactionsSectionMapper, "transactionsSectionMapper");
                Intrinsics.checkNotNullParameter(qrInfoSectionMapper, "qrInfoSectionMapper");
                Intrinsics.checkNotNullParameter(bottomSectionMapper, "bottomSectionMapper");
                return new d0(mVar4, aVarD, dVarB, jVarI, aVar19, tVar4, aVar20, aVar21, fVarB, aVarZ2, gVarE3, vVar, dVar6, new gig.t(new vv1.a(0, 0, wv1.a.class, actionsMapper, "map", "map$feature_apm_breb_impl_release()Lcom/revolut/recyclerkit/delegates/ListItem;"), new vv1.b(1, 0, wv1.b.class, aliasSectionMapper, "map", "map$feature_apm_breb_impl_release(Lcom/revolut/data/model/Data;)Ljava/util/List;"), new vv1.c(1, 0, wv1.e.class, contactsSectionMapper, "map", "map$feature_apm_breb_impl_release(Lcom/revolut/feature/apm/breb/impl/ui/area/BrebAreaScreenContract$ContactsState;)Ljava/util/List;"), new vv1.d(1, 0, wv1.g.class, transactionsSectionMapper, "map", "map$feature_apm_breb_impl_release(Lcom/revolut/data/model/Data;)Ljava/util/List;"), new vv1.e(1, 0, wv1.f.class, qrInfoSectionMapper, "map", "map$feature_apm_breb_impl_release(Lcom/revolut/data/model/Data;)Ljava/util/List;"), new vv1.f(1, 0, wv1.c.class, bottomSectionMapper, "map", "map$feature_apm_breb_impl_release(Lcom/revolut/data/model/Data;)Ljava/util/List;")));
            case 24:
                return a();
            case 25:
                return b();
            case 26:
                return c();
            case 27:
                return d();
            case 28:
                return e();
            default:
                nyj.c cVar10 = (nyj.c) this.f216691b;
                nyj.e eVar10 = (nyj.e) this.d;
                int i108 = this.f216692c;
                switch (i108) {
                    case 0:
                        return new uyj.i((jki.p) eVar10.f220903c.get(), eVar10.f220901a, (jyj.b) eVar10.k.get(), (ez8.b) cVar10.P.get(), cVar10.f220888l.e());
                    case 1:
                        kVar = new uyj.k(eVar10.f220901a, new oc.f(eVar10.f220902b.f220884c, 2));
                        break;
                    case 2:
                        return new jyj.g((jyj.a) eVar10.e.get(), (jyj.m) eVar10.f.get(), (jyj.c) eVar10.f220905h.get(), (jyj.d) eVar10.i.get(), (f01.a) eVar10.f220906j.get());
                    case 3:
                        kVar = new jyj.f((qz0.j) eVar10.d.get());
                        break;
                    case 4:
                        Context context = cVar10.f220884c;
                        kyj.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(context, "context");
                        return new qz0.n(context, null, null);
                    case 5:
                        return new jyj.m(cVar10.f220884c);
                    case 6:
                        kVar = new jyj.i((jyj.j) eVar10.f220904g.get());
                        break;
                    case 7:
                        return new jyj.j(cVar10.f220884c);
                    case 8:
                        return new jyj.d();
                    case 9:
                        Context context2 = cVar10.f220884c;
                        kyj.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(context2, "context");
                        return new f01.c(context2);
                    default:
                        throw new AssertionError(i108);
                }
                return kVar;
        }
    }
}
