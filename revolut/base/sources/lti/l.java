package lti;

import com.revolut.feature.card_management.impl.cardlimit.screens.overview.CardLimitOverviewScreenContract$InputData;
import com.revolut.feature.card_management.impl.cardlimit.screens.setlimit.CardSetLimitScreenContract$InputData;
import com.revolut.feature.insurance_embedded.impl.ui.screen.coverage_activation.InsuranceCoverageActivationScreenContract$InputData;
import com.revolut.feature.insurance_embedded.impl.ui.screen.coverage_list.CoverageListScreenContract$InputData;
import com.revolut.feature.insurance_embedded.impl.ui.screen.detail.EmbeddedInsuranceDetailScreenContract$InputData;
import com.revolut.feature.insurance_embedded.impl.ui.screen.documents.preview.InsuranceDocumentsPreviewScreenContract$InputData;
import com.revolut.feature.insurance_embedded.impl.ui.screen.eligible_cards.InsuranceEligibleCardsScreenContract$InputData;
import com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.cfac_coverage_selection.CfacCoverageSelectionScreenContract$InputData;
import com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.details.InsuranceDetailsLayoutScreenContract$InputData;
import com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.get_help.GetHelpScreenContract$InputData;
import com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.make_claim.MakeClaimScreenContract$InputData;
import com.revolut.feature.insurance_embedded.impl.ui.screen.scheme_insurance.card_claims.CardClaimsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.AsftPassDetailsScreenContract$InputData;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.legacy.AsftPassDetailsLegacyScreenContract$InputData;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.terminal_selection.AsftTerminalSelectionScreenContract$InputData;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.AsftTimeSlotBookingScreenContract$InputData;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.dialogs.time_slot_picker.AsftTimeSlotPickerScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import lu7.b0;
import lu7.e0;
import lu7.k0;
import lu7.w;
import lu7.y;
import pv7.v;
import rp0.g1;
import rp0.x0;
import uo.q0;
import wli.x;
import yui.a0;

/* JADX INFO: loaded from: classes10.dex */
public final class l implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f199925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f199926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f199927c;
    public final Object d;

    public /* synthetic */ l(Object obj2, Object obj3, int i, int i2) {
        this.f199925a = i2;
        this.f199926b = obj2;
        this.d = obj3;
        this.f199927c = i;
    }

    private final Object a() {
        k0 k0Var = (k0) this.d;
        int i = this.f199927c;
        if (i == 0) {
            return kxa.j.l((j60.a) k0Var.e.get());
        }
        if (i == 1) {
            return h30.l.p((com.revolut.kompot.navigable.a) k0Var.f200128c.get(), (rp0.m) k0Var.d.get());
        }
        if (i == 2) {
            return new rp0.m();
        }
        if (i == 3) {
            return new yv7.k((jki.p) k0Var.f200129g.get(), k0Var.f200127b, (hu7.j) ((lu7.s) this.f199926b).f200170w.get(), (j60.a) k0Var.e.get());
        }
        if (i == 4) {
            return new yv7.l();
        }
        throw new AssertionError(i);
    }

    private final Object b() {
        k0 k0Var = (k0) this.d;
        int i = this.f199927c;
        if (i == 0) {
            return kxa.j.l((j60.a) k0Var.e.get());
        }
        if (i == 1) {
            return h30.l.p((com.revolut.kompot.navigable.a) k0Var.f200128c.get(), (rp0.m) k0Var.d.get());
        }
        if (i == 2) {
            return new rp0.m();
        }
        if (i == 3) {
            return new yv7.k((jki.p) k0Var.f200129g.get(), k0Var.f200127b, (hu7.j) ((lu7.s) this.f199926b).f200170w.get(), (j60.a) k0Var.e.get());
        }
        if (i == 4) {
            return new yv7.l();
        }
        throw new AssertionError(i);
    }

    private final Object c() {
        lz2.c cVar = (lz2.c) this.d;
        lz2.a aVar = (lz2.a) this.f199926b;
        da3.j jVar = aVar.f200899a;
        int i = this.f199927c;
        if (i != 0) {
            if (i != 1) {
                throw new AssertionError(i);
            }
            m93.d dVarF = jVar.f();
            vc.s.j(dVarF);
            return new nz2.b(dVarF);
        }
        cli.n nVar = (cli.n) cVar.f200906b.get();
        CardLimitOverviewScreenContract$InputData cardLimitOverviewScreenContract$InputData = cVar.f200905a;
        l93.f fVarJ = jVar.j();
        vc.s.j(fVarJ);
        fk3.a aVarA = aVar.f200900b.a();
        vc.s.j(aVarA);
        return new com.revolut.feature.card_management.impl.cardlimit.screens.overview.a(nVar, cardLimitOverviewScreenContract$InputData, fVarJ, aVarA, aVar.f200901c.b());
    }

    @Override // phm.a
    public final Object get() {
        Object cVar;
        switch (this.f199925a) {
            case 0:
                g gVar = (g) this.f199926b;
                poi.b bVar = gVar.f;
                kti.g gVar2 = gVar.f199905b;
                m mVar = (m) this.d;
                g gVar3 = mVar.f199930c;
                int i = this.f199927c;
                if (i == 0) {
                    com.revolut.kompot.navigable.a aVar = (com.revolut.kompot.navigable.a) mVar.d.get();
                    gti.h hVar = new gti.h(gVar3.e);
                    q0 q0VarJ = bVar.j();
                    uo.b bVarB = bVar.b();
                    vc.s.j(bVarB);
                    ho.t tVarC = gVar3.f.c();
                    vc.s.j(tVarC);
                    return hsi.b.j(aVar, hVar, q0VarJ, bVarB, new gti.b(tVarC));
                }
                if (i == 1) {
                    cli.n nVar = (cli.n) mVar.f199931g.get();
                    AsftPassDetailsLegacyScreenContract$InputData asftPassDetailsLegacyScreenContract$InputData = mVar.f199929b;
                    zsi.e eVarA = gVar2.a();
                    vc.s.j(eVarA);
                    zsi.i iVar = (zsi.i) gVar2.D.get();
                    vc.s.j(iVar);
                    return new com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.legacy.b(nVar, asftPassDetailsLegacyScreenContract$InputData, eVarA, iVar, new rui.a());
                }
                if (i == 2) {
                    l80.e dateProvider = gVar3.d.h();
                    vc.s.j(dateProvider);
                    Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
                    return new kxk.o(new pui.c(), new pui.f(new rui.k((c90.c) mVar.f.get()), (c90.c) mVar.f.get(), gVar3.d.d()));
                }
                if (i != 3) {
                    throw new AssertionError(i);
                }
                ViewController viewController = mVar.f199928a;
                oui.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(viewController, "viewController");
                return new c90.c(viewController.m2());
            case 1:
                g gVar4 = (g) this.f199926b;
                poi.b bVar2 = gVar4.f;
                kti.g gVar5 = gVar4.f199905b;
                n nVar2 = (n) this.d;
                g gVar6 = nVar2.f199935c;
                int i2 = this.f199927c;
                if (i2 == 0) {
                    com.revolut.kompot.navigable.a aVar2 = (com.revolut.kompot.navigable.a) nVar2.d.get();
                    gti.h hVar2 = new gti.h(gVar6.e);
                    q0 q0VarJ2 = bVar2.j();
                    uo.b bVarB2 = bVar2.b();
                    vc.s.j(bVarB2);
                    ho.t tVarC2 = gVar6.f.c();
                    vc.s.j(tVarC2);
                    return hsi.b.j(aVar2, hVar2, q0VarJ2, bVarB2, new gti.b(tVarC2));
                }
                if (i2 == 1) {
                    com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) nVar2.d.get();
                    gte.a featureToggleInteractor = gVar4.f199904a.b();
                    vc.s.j(featureToggleInteractor);
                    tti.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(controller, "controller");
                    Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
                    return new aah.g(controller, featureToggleInteractor);
                }
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new AssertionError(i2);
                    }
                    ViewController viewController2 = nVar2.f199934b;
                    mui.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(viewController2, "viewController");
                    return new c90.c(viewController2.m2());
                }
                AsftPassDetailsScreenContract$InputData asftPassDetailsScreenContract$InputData = nVar2.f199933a;
                kui.j jVar = new kui.j(new rui.k((c90.c) nVar2.f199936g.get()), new rui.b(new rui.k((c90.c) nVar2.f199936g.get()), new rui.g(), new rui.e(gVar6.d.d(), (c90.c) nVar2.f199936g.get()), new rui.f(), new rui.h()));
                zsi.e eVarA2 = gVar5.a();
                vc.s.j(eVarA2);
                zsi.i iVar2 = (zsi.i) gVar5.D.get();
                vc.s.j(iVar2);
                return new kui.h(asftPassDetailsScreenContract$InputData, jVar, eVarA2, iVar2);
            case 2:
                poi.b bVar3 = ((g) this.f199926b).f;
                o oVar = (o) this.d;
                g gVar7 = oVar.f199939b;
                int i3 = this.f199927c;
                if (i3 != 0) {
                    if (i3 == 1) {
                        return new wui.b((cli.n) oVar.e.get());
                    }
                    if (i3 == 2) {
                        return new wui.c(oVar.f199938a);
                    }
                    throw new AssertionError(i3);
                }
                com.revolut.kompot.navigable.a aVar3 = (com.revolut.kompot.navigable.a) oVar.f199940c.get();
                gti.h hVar3 = new gti.h(gVar7.e);
                q0 q0VarJ3 = bVar3.j();
                uo.b bVarB3 = bVar3.b();
                vc.s.j(bVarB3);
                ho.t tVarC3 = gVar7.f.c();
                vc.s.j(tVarC3);
                return hsi.b.j(aVar3, hVar3, q0VarJ3, bVarB3, new gti.b(tVarC3));
            case 3:
                p pVar = (p) this.d;
                g gVar8 = pVar.f199942b;
                g gVar9 = (g) this.f199926b;
                poi.b bVar4 = gVar9.f;
                kti.g gVar10 = gVar9.f199905b;
                int i5 = this.f199927c;
                if (i5 == 0) {
                    com.revolut.kompot.navigable.a aVar4 = (com.revolut.kompot.navigable.a) pVar.f199943c.get();
                    gti.h hVar4 = new gti.h(gVar8.e);
                    q0 q0VarJ4 = bVar4.j();
                    uo.b bVarB4 = bVar4.b();
                    vc.s.j(bVarB4);
                    ho.t tVarC4 = gVar8.f.c();
                    vc.s.j(tVarC4);
                    return hsi.b.j(aVar4, hVar4, q0VarJ4, bVarB4, new gti.b(tVarC4));
                }
                if (i5 != 1) {
                    if (i5 != 2) {
                        throw new AssertionError(i5);
                    }
                    gte.a featureToggleInteractor2 = gVar8.f199904a.b();
                    vc.s.j(featureToggleInteractor2);
                    Intrinsics.checkNotNullParameter(featureToggleInteractor2, "featureToggleInteractor");
                    return new sui.o(new nd.p());
                }
                AsftTerminalSelectionScreenContract$InputData asftTerminalSelectionScreenContract$InputData = pVar.f199941a;
                cli.n nVar3 = (cli.n) pVar.e.get();
                mti.b bVar5 = (mti.b) gVar10.v.get();
                vc.s.j(bVar5);
                nyb.k kVarC = gVar9.f199908h.c();
                vc.s.j(kVarC);
                mti.n nVar4 = (mti.n) gVar10.C.get();
                vc.s.j(nVar4);
                gte.a aVarB = gVar9.f199904a.b();
                vc.s.j(aVarB);
                return new com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.terminal_selection.b(asftTerminalSelectionScreenContract$InputData, nVar3, bVar5, kVarC, nVar4, aVarB, new uui.a());
            case 4:
                g gVar11 = (g) this.f199926b;
                poi.b bVar6 = gVar11.f;
                kti.g gVar12 = gVar11.f199905b;
                q qVar = (q) this.d;
                g gVar13 = qVar.f199945b;
                int i6 = this.f199927c;
                if (i6 == 0) {
                    com.revolut.kompot.navigable.a aVar5 = (com.revolut.kompot.navigable.a) qVar.f199946c.get();
                    gti.h hVar5 = new gti.h(gVar13.e);
                    q0 q0VarJ5 = bVar6.j();
                    uo.b bVarB5 = bVar6.b();
                    vc.s.j(bVarB5);
                    ho.t tVarC5 = gVar13.f.c();
                    vc.s.j(tVarC5);
                    return hsi.b.j(aVar5, hVar5, q0VarJ5, bVarB5, new gti.b(tVarC5));
                }
                if (i6 == 1) {
                    zsi.e eVarA3 = gVar12.a();
                    vc.s.j(eVarA3);
                    gte.a featureToggleInteractor3 = gVar13.f199904a.b();
                    vc.s.j(featureToggleInteractor3);
                    Intrinsics.checkNotNullParameter(featureToggleInteractor3, "featureToggleInteractor");
                    return new gui.j(eVarA3, new r39.a(), (mti.c) gVar11.f199913p.get());
                }
                if (i6 != 2) {
                    if (i6 != 3) {
                        throw new AssertionError(i6);
                    }
                    yui.c cVar2 = new yui.c();
                    n8b.a aVarA = gVar13.f199907g.a();
                    vc.s.j(aVarA);
                    return new a0(cVar2, new k7i.i(aVarA), new nd7.d(new nd7.c()));
                }
                cli.n nVar5 = (cli.n) qVar.f.get();
                AsftTimeSlotBookingScreenContract$InputData asftTimeSlotBookingScreenContract$InputData = qVar.f199944a;
                mti.a aVar6 = (mti.a) gVar12.f189547s.get();
                vc.s.j(aVar6);
                mti.n nVar6 = (mti.n) gVar12.C.get();
                vc.s.j(nVar6);
                zsi.h hVar6 = (zsi.h) gVar12.B.get();
                vc.s.j(hVar6);
                pti.k kVar = (pti.k) gVar12.u.get();
                vc.s.j(kVar);
                return new com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.a(nVar5, asftTimeSlotBookingScreenContract$InputData, aVar6, nVar6, hVar6, kVar, new yui.a(), new nd.n(new yui.a()), (gui.j) qVar.e.get());
            case 5:
                g gVar14 = (g) this.f199926b;
                poi.b bVar7 = gVar14.f;
                r rVar = (r) this.d;
                g gVar15 = rVar.f199949b;
                AsftTimeSlotPickerScreenContract$InputData asftTimeSlotPickerScreenContract$InputData = rVar.f199948a;
                int i21 = this.f199927c;
                if (i21 != 0) {
                    if (i21 != 1) {
                        if (i21 == 2) {
                            return new ac4.g(asftTimeSlotPickerScreenContract$InputData, new nd.n(new yui.a()));
                        }
                        throw new AssertionError(i21);
                    }
                    cli.n nVar7 = (cli.n) rVar.e.get();
                    mti.n nVar8 = (mti.n) gVar14.f199905b.C.get();
                    vc.s.j(nVar8);
                    return new evi.g(asftTimeSlotPickerScreenContract$InputData, nVar7, nVar8, new nd.n(new yui.a()));
                }
                com.revolut.kompot.navigable.a aVar7 = (com.revolut.kompot.navigable.a) rVar.f199950c.get();
                gti.h hVar7 = new gti.h(gVar15.e);
                q0 q0VarJ6 = bVar7.j();
                uo.b bVarB6 = bVar7.b();
                vc.s.j(bVarB6);
                ho.t tVarC6 = gVar15.f.c();
                vc.s.j(tVarC6);
                return hsi.b.j(aVar7, hVar7, q0VarJ6, bVarB6, new gti.b(tVarC6));
            case 6:
                g gVar16 = (g) this.f199926b;
                poi.b bVar8 = gVar16.f;
                s sVar = (s) this.d;
                g gVar17 = sVar.f199952b;
                int i22 = this.f199927c;
                if (i22 == 0) {
                    com.revolut.kompot.navigable.a aVar8 = (com.revolut.kompot.navigable.a) sVar.f199953c.get();
                    gti.h hVar8 = new gti.h(gVar17.e);
                    q0 q0VarJ7 = bVar8.j();
                    uo.b bVarB7 = bVar8.b();
                    vc.s.j(bVarB7);
                    ho.t tVarC7 = gVar17.f.c();
                    vc.s.j(tVarC7);
                    return hsi.b.j(aVar8, hVar8, q0VarJ7, bVarB7, new gti.b(tVarC7));
                }
                if (i22 != 1) {
                    if (i22 == 2) {
                        return new gvi.r(sVar.f199951a, (cli.n) sVar.f.get(), gVar16.i.e(), new gvi.a(), (gui.j) sVar.e.get());
                    }
                    if (i22 == 3) {
                        return new gvi.u(sVar.f199951a, new gvi.a(), new nd7.d(new nd7.c()));
                    }
                    throw new AssertionError(i22);
                }
                zsi.e eVarA4 = gVar16.f199905b.a();
                vc.s.j(eVarA4);
                gte.a featureToggleInteractor4 = gVar17.f199904a.b();
                vc.s.j(featureToggleInteractor4);
                Intrinsics.checkNotNullParameter(featureToggleInteractor4, "featureToggleInteractor");
                return new gui.j(eVarA4, new r39.a(), (mti.c) gVar16.f199913p.get());
            case 7:
                lu7.c cVar3 = (lu7.c) this.d;
                lu7.s sVar2 = cVar3.f200074b;
                CardClaimsScreenContract$InputData cardClaimsScreenContract$InputData = cVar3.f200073a;
                int i32 = this.f199927c;
                if (i32 == 0) {
                    cli.n nVar9 = (cli.n) cVar3.f200075c.get();
                    eu7.b bVar9 = (eu7.b) ((lu7.s) this.f199926b).B.get();
                    c70.a aVarZ = sVar2.i.z();
                    vc.s.j(aVarZ);
                    return new dw7.h(nVar9, cardClaimsScreenContract$InputData, bVar9, new tr7.a(aVarZ, (g1) cVar3.e.get()));
                }
                if (i32 == 1) {
                    m93.d dVarF = sVar2.f200163m.f();
                    vc.s.j(dVarF);
                    return new ac4.g(cardClaimsScreenContract$InputData, new ou7.c(dVarF));
                }
                if (i32 != 2) {
                    throw new AssertionError(i32);
                }
                com.revolut.kompot.navigable.a controller2 = (com.revolut.kompot.navigable.a) cVar3.d.get();
                ew7.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller2, "controller");
                return x0.a(g1.Companion, controller2.D2());
            case 8:
                lu7.d dVar = (lu7.d) this.d;
                lu7.s sVar3 = (lu7.s) this.f199926b;
                int i33 = this.f199927c;
                if (i33 != 0) {
                    if (i33 == 1) {
                        return new nv7.m(sVar3.f200161j.g(), (xv7.e) sVar3.K.get(), new xv7.m());
                    }
                    throw new AssertionError(i33);
                }
                cli.n nVar10 = (cli.n) dVar.f200080b.get();
                CfacCoverageSelectionScreenContract$InputData cfacCoverageSelectionScreenContract$InputData = dVar.f200079a;
                si7.a aVarA2 = sVar3.k.a();
                vc.s.j(aVarA2);
                return new nv7.l(nVar10, cfacCoverageSelectionScreenContract$InputData, aVarA2, ((s41.a) sVar3.f200159g).d(), (mu7.c) sVar3.G.get());
            case 9:
                lu7.e eVar = (lu7.e) this.d;
                lu7.s sVar4 = (lu7.s) this.f199926b;
                int i43 = this.f199927c;
                if (i43 == 0) {
                    return new com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.coverage_details.b((cli.n) eVar.f200086b.get(), eVar.f200085a, ((s41.a) sVar4.f200159g).d(), (mu7.c) sVar4.G.get());
                }
                if (i43 == 1) {
                    return new ov7.o((xv7.r) sVar4.I.get(), (xv7.i) sVar4.J.get(), new xv7.m());
                }
                throw new AssertionError(i43);
            case 10:
                lu7.g gVar18 = (lu7.g) this.d;
                lu7.s sVar5 = (lu7.s) this.f199926b;
                int i59 = this.f199927c;
                if (i59 != 0) {
                    if (i59 == 1) {
                        return new av7.n();
                    }
                    throw new AssertionError(i59);
                }
                jki.p pVar2 = (jki.p) gVar18.f200098b.get();
                CoverageListScreenContract$InputData coverageListScreenContract$InputData = gVar18.f200097a;
                x xVarD = ((s41.a) sVar5.f200159g).d();
                hu7.b bVar10 = (hu7.b) sVar5.f200169t.get();
                or7.a aVar9 = (or7.a) sVar5.f200160h.i.get();
                vc.s.j(aVar9);
                return new av7.m(pVar2, coverageListScreenContract$InputData, xVarD, bVar10, aVar9);
            case 11:
                lu7.s sVar6 = (lu7.s) this.f199926b;
                lu7.h hVar9 = (lu7.h) this.d;
                int i66 = this.f199927c;
                if (i66 == 0) {
                    return new mv7.j(hVar9.f200103a, ((s41.a) sVar6.f200159g).d(), (xv7.p) sVar6.F.get(), (mu7.a) sVar6.H.get(), (cli.n) hVar9.f200104b.get());
                }
                if (i66 == 1) {
                    return new mv7.l(hVar9.f200103a);
                }
                throw new AssertionError(i66);
            case 12:
                lu7.s sVar7 = (lu7.s) this.f199926b;
                lu7.j jVar2 = (lu7.j) this.d;
                int i74 = this.f199927c;
                if (i74 == 0) {
                    Object extension = (sv7.a) jVar2.f200117c.get();
                    uv7.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(extension, "extension");
                    yji.n nVar11 = (yji.n) extension;
                    vc.s.k(nVar11);
                    return nVar11;
                }
                if (i74 == 1) {
                    cVar = new sv7.c(((s41.a) sVar7.f200159g).d());
                } else {
                    if (i74 == 2) {
                        cli.n nVar12 = (cli.n) jVar2.e.get();
                        GetHelpScreenContract$InputData getHelpScreenContract$InputData = jVar2.f200115a;
                        hu7.j jVar3 = (hu7.j) sVar7.f200170w.get();
                        sv7.a aVar10 = (sv7.a) jVar2.f200117c.get();
                        c70.a aVarZ2 = jVar2.f200116b.i.z();
                        vc.s.j(aVarZ2);
                        return new tv7.j(nVar12, getHelpScreenContract$InputData, jVar3, aVar10, new tr7.a(aVarZ2, (g1) jVar2.f200118g.get()), (mu7.c) sVar7.G.get());
                    }
                    if (i74 != 3) {
                        if (i74 != 4) {
                            throw new AssertionError(i74);
                        }
                        com.revolut.kompot.navigable.a controller3 = (com.revolut.kompot.navigable.a) jVar2.f.get();
                        uv7.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(controller3, "controller");
                        return x0.a(g1.Companion, controller3.D2());
                    }
                    cVar = new tv7.l((xv7.d) sVar7.E.get());
                }
                return cVar;
            case 13:
                lu7.l lVar = (lu7.l) this.d;
                lu7.s sVar8 = lVar.f200132b;
                InsuranceCoverageActivationScreenContract$InputData insuranceCoverageActivationScreenContract$InputData = lVar.f200131a;
                int i92 = this.f199927c;
                if (i92 == 0) {
                    cli.n nVar13 = (cli.n) lVar.f200133c.get();
                    eu7.b bVar11 = (eu7.b) ((lu7.s) this.f199926b).B.get();
                    c70.a aVarZ3 = sVar8.i.z();
                    vc.s.j(aVarZ3);
                    return new yu7.k(nVar13, insuranceCoverageActivationScreenContract$InputData, bVar11, new tr7.a(aVarZ3, (g1) lVar.e.get()));
                }
                if (i92 == 1) {
                    m93.d dVarF2 = sVar8.f200163m.f();
                    vc.s.j(dVarF2);
                    return new yu7.m(insuranceCoverageActivationScreenContract$InputData, new ou7.c(dVarF2));
                }
                if (i92 != 2) {
                    throw new AssertionError(i92);
                }
                com.revolut.kompot.navigable.a controller4 = (com.revolut.kompot.navigable.a) lVar.d.get();
                zu7.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller4, "controller");
                return x0.a(g1.Companion, controller4.D2());
            case 14:
                lu7.s sVar9 = (lu7.s) this.f199926b;
                cri.b bVar12 = sVar9.f200159g;
                lu7.n nVar14 = (lu7.n) this.d;
                lu7.s sVar10 = nVar14.f200141b;
                int i96 = this.f199927c;
                if (i96 == 0) {
                    Object extension2 = (sv7.a) nVar14.f200142c.get();
                    qv7.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(extension2, "extension");
                    yji.n nVar15 = (yji.n) extension2;
                    vc.s.k(nVar15);
                    return nVar15;
                }
                if (i96 == 1) {
                    return new sv7.c(((s41.a) bVar12).d());
                }
                if (i96 != 2) {
                    if (i96 != 3) {
                        throw new AssertionError(i96);
                    }
                    com.revolut.kompot.navigable.a controller5 = (com.revolut.kompot.navigable.a) nVar14.e.get();
                    qv7.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(controller5, "controller");
                    return x0.a(g1.Companion, controller5.D2());
                }
                pqi.a aVar11 = sVar10.f200161j;
                v vVar = new v(aVar11.g(), (xv7.b) sVar10.C.get(), (xv7.f) sVar10.D.get(), new xv7.q(), (xv7.d) sVar10.E.get(), new xv7.n(), new xv7.a(), new xv7.l(aVar11.g()), new xv7.j(), new yik.b());
                InsuranceDetailsLayoutScreenContract$InputData insuranceDetailsLayoutScreenContract$InputData = nVar14.f200140a;
                c70.a aVarZ4 = sVar10.i.z();
                vc.s.j(aVarZ4);
                tr7.a aVar12 = new tr7.a(aVarZ4, (g1) nVar14.f.get());
                x xVarD2 = ((s41.a) bVar12).d();
                xv7.p pVar3 = (xv7.p) sVar9.F.get();
                ffk.t tVarF = sVar9.f200162l.f();
                vc.s.j(tVarF);
                return new com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.details.b(vVar, insuranceDetailsLayoutScreenContract$InputData, aVar12, xVarD2, pVar3, tVarF, (mu7.c) sVar9.G.get(), (sv7.a) nVar14.f200142c.get());
            case 15:
                lu7.s sVar11 = (lu7.s) this.f199926b;
                lu7.o oVar2 = (lu7.o) this.d;
                int i99 = this.f199927c;
                if (i99 == 0) {
                    return new rv7.j((cli.n) oVar2.f200147c.get(), oVar2.f200145a, ((s41.a) sVar11.f200159g).d(), ((nj0.d) sVar11.f200157b).f216295c, (mu7.c) sVar11.G.get());
                }
                if (i99 == 1) {
                    return new rv7.k(new xv7.h(oVar2.f200146b.f200161j.g()));
                }
                throw new AssertionError(i99);
            case 16:
                lu7.q qVar2 = (lu7.q) this.d;
                lu7.s sVar12 = qVar2.f200152b;
                InsuranceEligibleCardsScreenContract$InputData insuranceEligibleCardsScreenContract$InputData = qVar2.f200151a;
                int i100 = this.f199927c;
                if (i100 == 0) {
                    cli.n nVar16 = (cli.n) qVar2.f200153c.get();
                    eu7.b bVar13 = (eu7.b) ((lu7.s) this.f199926b).B.get();
                    c70.a aVarZ5 = sVar12.i.z();
                    vc.s.j(aVarZ5);
                    return new kv7.i(nVar16, insuranceEligibleCardsScreenContract$InputData, bVar13, new tr7.a(aVarZ5, (g1) qVar2.e.get()));
                }
                if (i100 == 1) {
                    m93.d dVarF3 = sVar12.f200163m.f();
                    vc.s.j(dVarF3);
                    return new ac4.g(insuranceEligibleCardsScreenContract$InputData, new ou7.c(dVarF3));
                }
                if (i100 != 2) {
                    throw new AssertionError(i100);
                }
                com.revolut.kompot.navigable.a controller6 = (com.revolut.kompot.navigable.a) qVar2.d.get();
                lv7.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller6, "controller");
                return x0.a(g1.Companion, controller6.D2());
            case 17:
                lu7.s sVar13 = (lu7.s) this.f199926b;
                cri.b bVar14 = sVar13.f200159g;
                lu7.t tVar = (lu7.t) this.d;
                int i101 = this.f199927c;
                if (i101 == 0) {
                    Object extension3 = (sv7.a) tVar.f200175c.get();
                    wv7.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(extension3, "extension");
                    yji.n nVar17 = (yji.n) extension3;
                    vc.s.k(nVar17);
                    return nVar17;
                }
                if (i101 == 1) {
                    return new sv7.c(((s41.a) bVar14).d());
                }
                if (i101 != 2) {
                    if (i101 == 3) {
                        return new vv7.n((xv7.d) sVar13.E.get());
                    }
                    if (i101 != 4) {
                        throw new AssertionError(i101);
                    }
                    com.revolut.kompot.navigable.a controller7 = (com.revolut.kompot.navigable.a) tVar.f.get();
                    wv7.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(controller7, "controller");
                    return x0.a(g1.Companion, controller7.D2());
                }
                cli.n nVar18 = (cli.n) tVar.e.get();
                MakeClaimScreenContract$InputData makeClaimScreenContract$InputData = tVar.f200173a;
                x xVarD3 = ((s41.a) bVar14).d();
                mu7.a aVar13 = (mu7.a) sVar13.H.get();
                sv7.a aVar14 = (sv7.a) tVar.f200175c.get();
                c70.a aVarZ6 = tVar.f200174b.i.z();
                vc.s.j(aVarZ6);
                return new com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.make_claim.a(nVar18, makeClaimScreenContract$InputData, xVarD3, aVar13, aVar14, new tr7.a(aVarZ6, (g1) tVar.f200176g.get()), (mu7.c) sVar13.G.get());
            case 18:
                lu7.v vVar2 = (lu7.v) this.d;
                int i102 = this.f199927c;
                if (i102 == 0) {
                    return new aw7.l((jki.p) vVar2.f200182b.get(), vVar2.f200181a, (mu7.e) ((lu7.s) this.f199926b).A.get());
                }
                if (i102 == 1) {
                    return new aw7.m();
                }
                throw new AssertionError(i102);
            case 19:
                lu7.s sVar14 = (lu7.s) this.f199926b;
                w wVar = (w) this.d;
                int i103 = this.f199927c;
                if (i103 == 0) {
                    return kxa.j.k((j60.a) wVar.d.get());
                }
                if (i103 == 1) {
                    return ehe.n.s((com.revolut.kompot.navigable.a) wVar.f200185b.get(), (rp0.m) wVar.f200186c.get());
                }
                if (i103 == 2) {
                    return new rp0.m();
                }
                if (i103 == 3) {
                    return new com.revolut.feature.insurance_embedded.impl.ui.screen.scheme_insurance.a((cli.n) wVar.f.get(), wVar.f200184a, (hu7.o) sVar14.f200172y.get(), (j60.a) wVar.d.get());
                }
                if (i103 == 4) {
                    return new cw7.l(sVar14.f200161j.g());
                }
                throw new AssertionError(i103);
            case 20:
                lu7.s sVar15 = (lu7.s) this.f199926b;
                y yVar = (y) this.d;
                int i104 = this.f199927c;
                if (i104 == 0) {
                    return kxa.j.l((j60.a) yVar.f.get());
                }
                if (i104 == 1) {
                    return h30.l.p((com.revolut.kompot.navigable.a) yVar.d.get(), (rp0.m) yVar.e.get());
                }
                if (i104 == 2) {
                    return new rp0.m();
                }
                if (i104 == 3) {
                    jki.p pVar4 = (jki.p) yVar.f200195h.get();
                    EmbeddedInsuranceDetailScreenContract$InputData embeddedInsuranceDetailScreenContract$InputData = yVar.f200192b;
                    j60.a aVar15 = (j60.a) yVar.f.get();
                    c70.a aVarZ7 = yVar.f200193c.i.z();
                    vc.s.j(aVarZ7);
                    return new cv7.o(pVar4, embeddedInsuranceDetailScreenContract$InputData, aVar15, new tr7.a(aVarZ7, (g1) yVar.i.get()), (hu7.j) sVar15.f200170w.get(), ((s41.a) sVar15.f200159g).d(), sVar15.f.e());
                }
                if (i104 == 4) {
                    return new cv7.r(yVar.f200192b);
                }
                if (i104 != 5) {
                    throw new AssertionError(i104);
                }
                com.revolut.kompot.navigable.a controller8 = (com.revolut.kompot.navigable.a) yVar.d.get();
                dv7.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller8, "controller");
                return x0.a(g1.Companion, controller8.D2());
            case 21:
                lu7.s sVar16 = (lu7.s) this.f199926b;
                y yVar2 = (y) this.d;
                int i105 = this.f199927c;
                if (i105 == 0) {
                    return kxa.j.l((j60.a) yVar2.f.get());
                }
                if (i105 == 1) {
                    return h30.l.p((com.revolut.kompot.navigable.a) yVar2.d.get(), (rp0.m) yVar2.e.get());
                }
                if (i105 == 2) {
                    return new rp0.m();
                }
                if (i105 == 3) {
                    jki.p pVar5 = (jki.p) yVar2.f200195h.get();
                    EmbeddedInsuranceDetailScreenContract$InputData embeddedInsuranceDetailScreenContract$InputData2 = yVar2.f200192b;
                    j60.a aVar16 = (j60.a) yVar2.f.get();
                    c70.a aVarZ8 = yVar2.f200193c.i.z();
                    vc.s.j(aVarZ8);
                    return new cv7.o(pVar5, embeddedInsuranceDetailScreenContract$InputData2, aVar16, new tr7.a(aVarZ8, (g1) yVar2.i.get()), (hu7.j) sVar16.f200170w.get(), ((s41.a) sVar16.f200159g).d(), sVar16.f.e());
                }
                if (i105 == 4) {
                    return new cv7.r(yVar2.f200192b);
                }
                if (i105 != 5) {
                    throw new AssertionError(i105);
                }
                com.revolut.kompot.navigable.a controller9 = (com.revolut.kompot.navigable.a) yVar2.d.get();
                dv7.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller9, "controller");
                return x0.a(g1.Companion, controller9.D2());
            case 22:
                lu7.s sVar17 = (lu7.s) this.f199926b;
                b0 b0Var = (b0) this.d;
                int i106 = this.f199927c;
                if (i106 == 0) {
                    return new ev7.i((jki.p) b0Var.f200072c.get(), b0Var.f200071b, (eu7.e) sVar17.f200171x.get(), sVar17.f.e());
                }
                if (i106 == 1) {
                    return new ev7.j();
                }
                throw new AssertionError(i106);
            case 23:
                lu7.s sVar18 = (lu7.s) this.f199926b;
                b0 b0Var2 = (b0) this.d;
                int i107 = this.f199927c;
                if (i107 == 0) {
                    return new ev7.i((jki.p) b0Var2.f200072c.get(), b0Var2.f200071b, (eu7.e) sVar18.f200171x.get(), sVar18.f.e());
                }
                if (i107 == 1) {
                    return new ev7.j();
                }
                throw new AssertionError(i107);
            case 24:
                lu7.s sVar19 = (lu7.s) this.f199926b;
                e0 e0Var = (e0) this.d;
                int i108 = this.f199927c;
                if (i108 != 0) {
                    if (i108 == 1) {
                        return new iv7.j();
                    }
                    throw new AssertionError(i108);
                }
                cli.n nVar19 = (cli.n) e0Var.f200090c.get();
                InsuranceDocumentsPreviewScreenContract$InputData insuranceDocumentsPreviewScreenContract$InputData = e0Var.f200089b;
                si7.a aVarA3 = sVar19.k.a();
                vc.s.j(aVarA3);
                return new iv7.i(nVar19, insuranceDocumentsPreviewScreenContract$InputData, aVarA3, sVar19.f.e());
            case 25:
                lu7.s sVar20 = (lu7.s) this.f199926b;
                e0 e0Var2 = (e0) this.d;
                int i109 = this.f199927c;
                if (i109 != 0) {
                    if (i109 == 1) {
                        return new iv7.j();
                    }
                    throw new AssertionError(i109);
                }
                cli.n nVar20 = (cli.n) e0Var2.f200090c.get();
                InsuranceDocumentsPreviewScreenContract$InputData insuranceDocumentsPreviewScreenContract$InputData2 = e0Var2.f200089b;
                si7.a aVarA4 = sVar20.k.a();
                vc.s.j(aVarA4);
                return new iv7.i(nVar20, insuranceDocumentsPreviewScreenContract$InputData2, aVarA4, sVar20.f.e());
            case 26:
                return a();
            case 27:
                return b();
            case 28:
                return c();
            default:
                lz2.a aVar17 = (lz2.a) this.f199926b;
                lz2.d dVar2 = (lz2.d) this.d;
                int i110 = this.f199927c;
                if (i110 == 0) {
                    cli.n nVar21 = (cli.n) dVar2.d.get();
                    CardSetLimitScreenContract$InputData cardSetLimitScreenContract$InputData = dVar2.f200908a;
                    w80.b bVar15 = (w80.b) dVar2.f200910c.get();
                    l93.f fVarJ = aVar17.f200899a.j();
                    vc.s.j(fVarJ);
                    return new pz2.n(nVar21, cardSetLimitScreenContract$InputData, bVar15, fVarJ);
                }
                if (i110 == 1) {
                    return new pz2.b(new u80.o(), (w80.b) dVar2.f200910c.get());
                }
                if (i110 != 2) {
                    throw new AssertionError(i110);
                }
                qd0.b languageProvider = aVar17.d.n();
                vc.s.j(languageProvider);
                qz2.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
                return v80.b.b(languageProvider, true, false, 48);
        }
    }
}
