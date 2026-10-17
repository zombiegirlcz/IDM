package eyd;

import aa0.i1;
import com.google.common.collect.ImmutableMap;
import com.revolut.core.backend_flow.api.navigation.BackendFlowInput;
import com.revolut.feature.backend_flow.domain.models.BackendFlow;
import com.revolut.feature.backend_flow.domain.models.BackendFlowNavigationIcon;
import com.revolut.feature.backend_flow.domain.models.BottomPromptScreen;
import com.revolut.feature.backend_flow.domain.models.CardCellItem;
import com.revolut.feature.backend_flow.domain.models.CardSelectionItem;
import com.revolut.feature.backend_flow.domain.models.EntitiesListItem;
import com.revolut.feature.backend_flow.domain.models.EntitiesSelectionItem;
import com.revolut.feature.backend_flow.domain.models.EntitiesSummaryItem;
import com.revolut.feature.backend_flow.domain.models.EntityCellItem;
import com.revolut.feature.backend_flow.domain.models.HtmlPromptScreen;
import com.revolut.feature.backend_flow.domain.models.PromptScreen;
import com.revolut.feature.backend_flow.domain.models.TransactionCellItem;
import com.revolut.feature.backend_flow.domain.models.WidgetProgressionItem;
import com.revolut.feature.learn.shared.impl.ui.course.overview.CourseOverviewScreenContract$InputData;
import com.revolut.feature.learn.shared.impl.ui.home.LearnHomeScreenContract$InputData;
import com.revolut.feature.learn.shared.impl.ui.lesson.LessonScreenContract$InputData;
import com.revolut.feature.statements.impl.ui.consolidated.customisation.ConsolidatedStatementCustomisationScreenContract$InputData;
import com.revolut.feature.statements.impl.ui.savings.SavingsStatementsScreenContract$InputData;
import com.revolut.feature.statements.impl.ui.tax_filing.TaxFilingScreenContract$InputData;
import com.revolut.feature.travel.flights.api.R$string;
import com.revolut.feature.travel.flights.impl.ui.screen.booking_contact.TravelFlightsBookingContactScreenContract$InputData;
import com.revolut.feature.travel.flights.impl.ui.screen.checkout.TravelFlightsCheckoutScreenContract$InputData;
import com.revolut.feature.travel.flights.impl.ui.screen.passengers_details.TravelFlightsPassengersDetailsScreenContract$InputData;
import com.revolut.feature.travel.flights.impl.ui.screen.passengers_picker.TravelFlightsPassengersPickerScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f130762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f130763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f130764c;
    public final Object d;

    public /* synthetic */ j(Object obj2, Object obj3, int i, int i2) {
        this.f130762a = i2;
        this.f130763b = obj2;
        this.d = obj3;
        this.f130764c = i;
    }

    private final Object a() {
        f09.e eVar = (f09.e) this.f130763b;
        nyj.g gVar = eVar.f131058a;
        f09.g gVar2 = eVar.f131059b;
        f09.f fVar = (f09.f) this.d;
        LessonScreenContract$InputData lessonScreenContract$InputData = fVar.f131061a;
        int i = this.f130764c;
        switch (i) {
            case 0:
                return kxa.j.l((j60.a) fVar.e.get());
            case 1:
                return h30.l.p((com.revolut.kompot.navigable.a) fVar.f131063c.get(), (rp0.m) fVar.d.get());
            case 2:
                return new rp0.m();
            case 3:
                wli.x xVarD = ((s41.a) gVar.f).d();
                g09.h hVar = (g09.h) ((f09.b) gVar2).A.get();
                vc.s.j(hVar);
                return new s09.d(xVarD, hVar, (j60.a) fVar.e.get());
            case 4:
                g09.i iVarA = ((f09.b) gVar2).a();
                vc.s.j(iVarA);
                g09.e eVar2 = (g09.e) ((f09.b) gVar2).f131039q.get();
                vc.s.j(eVar2);
                t09.f fVar2 = new t09.f(lessonScreenContract$InputData, new h09.f());
                dz8.l lVar = (dz8.l) gVar.f220915l.get();
                vc.s.j(lVar);
                return new s09.k(iVarA, eVar2, lessonScreenContract$InputData, fVar2, lVar);
            case 5:
                g09.i iVarA2 = ((f09.b) gVar2).a();
                vc.s.j(iVarA2);
                g09.e eVar3 = (g09.e) ((f09.b) gVar2).f131039q.get();
                vc.s.j(eVar3);
                t09.h hVar2 = new t09.h();
                t09.g gVar3 = new t09.g();
                j60.a aVar = (j60.a) fVar.e.get();
                s09.d dVar = (s09.d) fVar.f131064g.get();
                s09.k kVar = (s09.k) fVar.f131065h.get();
                jki.p pVar = (jki.p) fVar.i.get();
                qd0.b bVarN = gVar.f220913h.n();
                vc.s.j(bVarN);
                return new q09.m0(iVarA2, eVar3, lessonScreenContract$InputData, hVar2, gVar3, aVar, dVar, kVar, pVar, bVarN);
            case 6:
                return new t09.c(new h09.a(), new h09.f());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object b() {
        f4g.f fVar = (f4g.f) this.d;
        int i = this.f130764c;
        if (i == 0) {
            return new d5g.f((cli.n) fVar.f132110b.get(), fVar.f132109a, (b4g.f) ((f4g.b) this.f130763b).f132067s.get());
        }
        if (i == 1) {
            return new d5g.g();
        }
        throw new AssertionError(i);
    }

    private final Object c() {
        f4g.b bVar = (f4g.b) this.f130763b;
        f4g.l lVar = (f4g.l) this.d;
        int i = this.f130764c;
        switch (i) {
            case 0:
                Object extension = (a6c.f) lVar.f132142c.get();
                r5g.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                if (!(extension instanceof yji.n)) {
                    throw new IllegalArgumentException("RevolutPayCheckoutExtension must implement ControllerModelExtension");
                }
                yji.n nVar = (yji.n) extension;
                vc.s.k(nVar);
                return nVar;
            case 1:
                o8c.a factory = bVar.f132061l.a();
                vc.s.j(factory);
                r5g.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory, "factory");
                return factory.a();
            case 2:
                j4g.a aVar = (j4g.a) lVar.e.get();
                jr9.h.j(aVar);
                return aVar;
            case 3:
                return new j4g.a(new j4g.b());
            case 4:
                Object extension2 = (mub.b) lVar.f132143g.get();
                Intrinsics.checkNotNullParameter(extension2, "extension");
                yji.n nVar2 = (yji.n) extension2;
                vc.s.k(nVar2);
                return nVar2;
            case 5:
                return lu7.m0.z(bVar.f132060j.h());
            case 6:
                s5g.a aVar2 = new s5g.a();
                s5g.k kVar = new s5g.k();
                s5g.j jVar = new s5g.j();
                dec.r rVar = new dec.r();
                dec.g gVar = new dec.g();
                dec.a aVar3 = new dec.a();
                l80.e eVarH = lVar.f132141b.d.h();
                vc.s.j(eVarH);
                s5g.i iVar = new s5g.i(new dec.q(rVar, gVar, aVar3, eVarH));
                q4g.k kVar2 = new q4g.k();
                q4g.r rVar2 = new q4g.r((q4g.o) lVar.i.get());
                r5g.b.Companion.getClass();
                com.revolut.feature.travel.flights.impl.ui.screen.checkout.c cVar = new com.revolut.feature.travel.flights.impl.ui.screen.checkout.c(new s5g.c(aVar2, kVar, jVar, iVar, kVar2, rVar2, new q4g.e(new q4g.c("FLIGHTS_CHECKOUT_ADDITIONAL_DETAILS_SUBHEADER", "FLIGHTS_CHECKOUT_BOOKING_CONTACT", null, R$string.travel_flights_checkout_additional_details_title, R$string.travel_flights_checkout_additional_details_booking_contact_title, R$string.travel_flights_checkout_additional_details_booking_contact_subtitle, null)), new s5g.f(), new s5g.g()), new s5g.d());
                TravelFlightsCheckoutScreenContract$InputData travelFlightsCheckoutScreenContract$InputData = lVar.f132140a;
                q5g.h hVar = (q5g.h) lVar.f132145j.get();
                s5g.f fVar = new s5g.f();
                a6c.f fVar2 = (a6c.f) lVar.f132142c.get();
                mub.b bVar2 = (mub.b) lVar.f132143g.get();
                h4g.b bVar3 = (h4g.b) lVar.k.get();
                sf0.h hVarB = bVar.f132062m.b();
                vc.s.j(hVarB);
                j4g.c cVar2 = new j4g.c();
                j4g.a aVar4 = (j4g.a) lVar.e.get();
                mre.c cVarB = bVar.f132063n.b();
                vc.s.j(cVarB);
                return new com.revolut.feature.travel.flights.impl.ui.screen.checkout.b(cVar, travelFlightsCheckoutScreenContract$InputData, hVar, fVar, fVar2, bVar2, bVar3, hVarB, cVar2, aVar4, cVarB);
            case 7:
                return r5g.c.a();
            case 8:
                return new q5g.h(bVar.f132061l.e());
            case 9:
                return new h4g.b((b4g.q) bVar.G.get(), (h4g.k) bVar.v.get(), (b4g.j) bVar.D.get());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object d() {
        f4g.q qVar = (f4g.q) this.d;
        int i = this.f130764c;
        if (i == 0) {
            Object extension = (mub.b) qVar.d.get();
            Intrinsics.checkNotNullParameter(extension, "extension");
            yji.n nVar = (yji.n) extension;
            vc.s.k(nVar);
            return nVar;
        }
        if (i != 1) {
            if (i == 2) {
                return new l4g.l(new l4g.n(), qVar.f132173a, (mub.b) qVar.d.get());
            }
            throw new AssertionError(i);
        }
        jid.z factory = ((f4g.b) this.f130763b).f132060j.h();
        Intrinsics.checkNotNullParameter(factory, "factory");
        Object obj2 = ((phm.a) factory.f174461b).get();
        Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
        mub.b bVar = (mub.b) obj2;
        vc.s.k(bVar);
        return bVar;
    }

    private final Object e() {
        f4g.b bVar = (f4g.b) this.f130763b;
        f4g.s sVar = (f4g.s) this.d;
        int i = this.f130764c;
        if (i == 0) {
            j4g.a aVar = (j4g.a) sVar.f132188c.get();
            jr9.h.j(aVar);
            return aVar;
        }
        if (i == 1) {
            return new j4g.a(new j4g.b());
        }
        if (i == 2) {
            return new com.revolut.feature.travel.flights.impl.ui.screen.itinerary.a((cli.n) sVar.e.get(), sVar.f132186a, (h4g.f) sVar.f.get(), (j4g.a) sVar.f132188c.get());
        }
        if (i != 3) {
            if (i == 4) {
                return new h4g.f((b4g.y) bVar.E.get(), (h4g.k) bVar.v.get());
            }
            throw new AssertionError(i);
        }
        f6g.b bVar2 = new f6g.b();
        qd0.b bVarN = sVar.f132187b.d.n();
        vc.s.j(bVarN);
        return new a3e.u(bVar2, new f6g.a(new p4g.b(bVarN)), new q4g.n());
    }

    private final Object f() {
        f4g.b bVar = (f4g.b) this.f130763b;
        f4g.v vVar = (f4g.v) this.d;
        f4g.b bVar2 = vVar.f132203b;
        int i = this.f130764c;
        if (i == 0) {
            j4g.a aVar = (j4g.a) vVar.f132204c.get();
            jr9.h.j(aVar);
            return aVar;
        }
        if (i == 1) {
            return new j4g.a(new j4g.b());
        }
        if (i != 2) {
            if (i == 3) {
                l80.e eVarH = bVar2.d.h();
                vc.s.j(eVarH);
                return new m6g.w(new a0e.w(eVarH, 5), new o6g.c());
            }
            if (i != 4) {
                if (i == 5) {
                    return new h4g.h((b4g.d0) bVar.F.get(), (h4g.k) bVar.v.get());
                }
                throw new AssertionError(i);
            }
            n8b.b bVarB = bVar.f.b();
            vc.s.j(bVarB);
            fk3.a aVarA = bVar.f132058g.a();
            vc.s.j(aVarA);
            return new q6g.c(bVarB, aVarA);
        }
        cli.n nVar = (cli.n) vVar.e.get();
        TravelFlightsPassengersDetailsScreenContract$InputData travelFlightsPassengersDetailsScreenContract$InputData = vVar.f132202a;
        o6g.d dVar = new o6g.d();
        l80.e eVarH2 = bVar2.d.h();
        vc.s.j(eVarH2);
        a0e.w wVar = new a0e.w(eVarH2, 5);
        e4m.e eVar = vVar.f;
        ang.f fVarE = bVar.k.e();
        h4g.h hVar = (h4g.h) vVar.f132205g.get();
        o6g.d dVar2 = new o6g.d();
        z80.b bVarS = bVar2.d.s();
        vc.s.j(bVarS);
        return new com.revolut.feature.travel.flights.impl.ui.screen.passengers_details.a(nVar, travelFlightsPassengersDetailsScreenContract$InputData, dVar, wVar, eVar, fVarE, hVar, new o6g.b(dVar2, bVarS), new j4g.c(), (j4g.a) vVar.f132204c.get());
    }

    private final Object g() {
        f4g.e0 e0Var = (f4g.e0) this.d;
        f4g.b bVar = e0Var.f132106c;
        f4g.b bVar2 = (f4g.b) this.f130763b;
        l70.e eVar = bVar2.d;
        int i = this.f130764c;
        if (i == 0) {
            cli.n nVar = (cli.n) e0Var.e.get();
            TravelFlightsBookingContactScreenContract$InputData travelFlightsBookingContactScreenContract$InputData = e0Var.f132105b;
            z80.b bVarS = eVar.s();
            vc.s.j(bVarS);
            zzl.b bVar3 = (zzl.b) e0Var.d.get();
            z80.b bVarS2 = bVar.d.s();
            vc.s.j(bVarS2);
            return new com.revolut.feature.travel.flights.impl.ui.screen.booking_contact.b(nVar, travelFlightsBookingContactScreenContract$InputData, bVarS, new rul.e(bVarS2, bVar3), (b4g.f) bVar2.f132067s.get(), e0Var.f);
        }
        if (i == 1) {
            zzl.b bVar4 = (zzl.b) e0Var.d.get();
            z80.b bVarS3 = bVar.d.s();
            vc.s.j(bVarS3);
            rul.e eVar2 = new rul.e(bVarS3, bVar4);
            z80.b bVarS4 = eVar.s();
            vc.s.j(bVarS4);
            return new y4g.m(eVar2, bVarS4);
        }
        if (i == 2) {
            z4g.d.Companion.getClass();
            return new zzl.c();
        }
        if (i != 3) {
            throw new AssertionError(i);
        }
        n8b.b bVarB = bVar2.f.b();
        vc.s.j(bVarB);
        fk3.a aVarA = bVar2.f132058g.a();
        vc.s.j(aVarA);
        return new q6g.c(bVarB, aVarA);
    }

    private final Object h() {
        f4g.e0 e0Var = (f4g.e0) this.d;
        f4g.b bVar = e0Var.f132106c;
        f4g.b bVar2 = (f4g.b) this.f130763b;
        int i = this.f130764c;
        if (i == 0) {
            cli.n nVar = (cli.n) e0Var.e.get();
            TravelFlightsBookingContactScreenContract$InputData travelFlightsBookingContactScreenContract$InputData = e0Var.f132105b;
            z80.b bVarS = bVar2.d.s();
            vc.s.j(bVarS);
            zzl.b bVar3 = (zzl.b) e0Var.d.get();
            z80.b bVarS2 = bVar.d.s();
            vc.s.j(bVarS2);
            return new com.revolut.feature.travel.flights.impl.ui.screen.booking_contact.b(nVar, travelFlightsBookingContactScreenContract$InputData, bVarS, new rul.e(bVarS2, bVar3), (b4g.f) bVar2.f132067s.get(), e0Var.f);
        }
        if (i == 1) {
            zzl.b bVar4 = (zzl.b) e0Var.d.get();
            z80.b bVarS3 = bVar.d.s();
            vc.s.j(bVarS3);
            rul.e eVar = new rul.e(bVarS3, bVar4);
            z80.b bVarS4 = bVar2.d.s();
            vc.s.j(bVarS4);
            return new y4g.m(eVar, bVarS4);
        }
        if (i == 2) {
            z4g.d.Companion.getClass();
            return new zzl.c();
        }
        if (i != 3) {
            throw new AssertionError(i);
        }
        n8b.b bVarB = bVar2.f.b();
        vc.s.j(bVarB);
        fk3.a aVarA = bVar2.f132058g.a();
        vc.s.j(aVarA);
        return new q6g.c(bVarB, aVarA);
    }

    private final Object i() {
        f4g.m0 m0Var = (f4g.m0) this.d;
        l70.e eVar = ((f4g.b) this.f130763b).d;
        int i = this.f130764c;
        if (i != 0) {
            if (i != 1) {
                throw new AssertionError(i);
            }
            l80.e eVarH = eVar.h();
            vc.s.j(eVarH);
            return new r6g.m(eVarH);
        }
        cli.n nVar = (cli.n) m0Var.f132155c.get();
        TravelFlightsPassengersPickerScreenContract$InputData travelFlightsPassengersPickerScreenContract$InputData = m0Var.f132154b;
        l80.e eVarH2 = eVar.h();
        vc.s.j(eVarH2);
        return new com.revolut.feature.travel.flights.impl.ui.screen.passengers_picker.a(nVar, travelFlightsPassengersPickerScreenContract$InputData, eVarH2, new r6g.n(), new r6g.a());
    }

    private final Object j() {
        f4g.m0 m0Var = (f4g.m0) this.d;
        l70.e eVar = ((f4g.b) this.f130763b).d;
        int i = this.f130764c;
        if (i != 0) {
            if (i != 1) {
                throw new AssertionError(i);
            }
            l80.e eVarH = eVar.h();
            vc.s.j(eVarH);
            return new r6g.m(eVarH);
        }
        cli.n nVar = (cli.n) m0Var.f132155c.get();
        TravelFlightsPassengersPickerScreenContract$InputData travelFlightsPassengersPickerScreenContract$InputData = m0Var.f132154b;
        l80.e eVarH2 = eVar.h();
        vc.s.j(eVarH2);
        return new com.revolut.feature.travel.flights.impl.ui.screen.passengers_picker.a(nVar, travelFlightsPassengersPickerScreenContract$InputData, eVarH2, new r6g.n(), new r6g.a());
    }

    private final Object k() {
        f4g.m0 m0Var = (f4g.m0) this.d;
        f4g.b bVar = (f4g.b) this.f130763b;
        int i = this.f130764c;
        if (i != 0) {
            if (i != 1) {
                throw new AssertionError(i);
            }
            l80.e eVarH = bVar.d.h();
            vc.s.j(eVarH);
            return new r6g.m(eVarH);
        }
        cli.n nVar = (cli.n) m0Var.f132155c.get();
        TravelFlightsPassengersPickerScreenContract$InputData travelFlightsPassengersPickerScreenContract$InputData = m0Var.f132154b;
        l80.e eVarH2 = bVar.d.h();
        vc.s.j(eVarH2);
        return new com.revolut.feature.travel.flights.impl.ui.screen.passengers_picker.a(nVar, travelFlightsPassengersPickerScreenContract$InputData, eVarH2, new r6g.n(), new r6g.a());
    }

    private final Object l() {
        f4g.r0 r0Var = (f4g.r0) this.d;
        f4g.b bVar = (f4g.b) this.f130763b;
        int i = this.f130764c;
        if (i == 0) {
            j4g.a aVar = (j4g.a) r0Var.f132184c.get();
            jr9.h.j(aVar);
            return aVar;
        }
        if (i == 1) {
            return new j4g.a(new j4g.b());
        }
        if (i == 2) {
            return new com.revolut.feature.travel.flights.impl.ui.screen.search_results.b((cli.n) r0Var.e.get(), r0Var.f132183b, (i4g.c) r0Var.f.get(), (h4g.k) bVar.v.get(), (h4g.i) bVar.f132070x.get(), (i4g.b) bVar.C.get(), (j4g.a) r0Var.f132184c.get());
        }
        if (i == 3) {
            return new a7g.h0(new c7g.b(), new c7g.e(), new c7g.g(), new c7g.a());
        }
        if (i == 4) {
            return new i4g.h(new yk0.d(), (b4g.i0) bVar.B.get(), (h4g.k) bVar.v.get(), (i4g.b) bVar.C.get(), new r7g.b());
        }
        throw new AssertionError(i);
    }

    private final Object m() {
        f4g.r0 r0Var = (f4g.r0) this.d;
        f4g.b bVar = (f4g.b) this.f130763b;
        int i = this.f130764c;
        if (i == 0) {
            j4g.a aVar = (j4g.a) r0Var.f132184c.get();
            jr9.h.j(aVar);
            return aVar;
        }
        if (i == 1) {
            return new j4g.a(new j4g.b());
        }
        if (i == 2) {
            return new com.revolut.feature.travel.flights.impl.ui.screen.search_results.b((cli.n) r0Var.e.get(), r0Var.f132183b, (i4g.c) r0Var.f.get(), (h4g.k) bVar.v.get(), (h4g.i) bVar.f132070x.get(), (i4g.b) bVar.C.get(), (j4g.a) r0Var.f132184c.get());
        }
        if (i == 3) {
            return new a7g.h0(new c7g.b(), new c7g.e(), new c7g.g(), new c7g.a());
        }
        if (i == 4) {
            return new i4g.h(new yk0.d(), (b4g.i0) bVar.B.get(), (h4g.k) bVar.v.get(), (i4g.b) bVar.C.get(), new r7g.b());
        }
        throw new AssertionError(i);
    }

    private final Object n() {
        f4g.r0 r0Var = (f4g.r0) this.d;
        f4g.b bVar = (f4g.b) this.f130763b;
        int i = this.f130764c;
        if (i == 0) {
            j4g.a aVar = (j4g.a) r0Var.f132184c.get();
            jr9.h.j(aVar);
            return aVar;
        }
        if (i == 1) {
            return new j4g.a(new j4g.b());
        }
        if (i == 2) {
            return new com.revolut.feature.travel.flights.impl.ui.screen.search_results.b((cli.n) r0Var.e.get(), r0Var.f132183b, (i4g.c) r0Var.f.get(), (h4g.k) bVar.v.get(), (h4g.i) bVar.f132070x.get(), (i4g.b) bVar.C.get(), (j4g.a) r0Var.f132184c.get());
        }
        if (i == 3) {
            return new a7g.h0(new c7g.b(), new c7g.e(), new c7g.g(), new c7g.a());
        }
        if (i != 4) {
            throw new AssertionError(i);
        }
        kf0.c cVar = bVar.i;
        return new i4g.h(new yk0.d(), (b4g.i0) bVar.B.get(), (h4g.k) bVar.v.get(), (i4g.b) bVar.C.get(), new r7g.b());
    }

    private final Object o() {
        fa0.c cVar = (fa0.c) this.d;
        int i = this.f130764c;
        if (i == 0) {
            return new com.revolut.core.backend_flow.impl.ui.card_photo.a(cVar.f133020a);
        }
        if (i != 1) {
            throw new AssertionError(i);
        }
        BackendFlow backendFlow = cVar.f133021b;
        ul2.c cVar2 = (ul2.c) ((fa0.k) this.f130763b).f133102b.d.get();
        vc.s.j(cVar2);
        return new ra0.f(backendFlow, cVar2);
    }

    private final Object p() {
        fa0.k kVar = (fa0.k) this.f130763b;
        fa0.d dVar = (fa0.d) this.d;
        int i = this.f130764c;
        if (i == 0) {
            ga0.a extension = (ga0.a) dVar.f133024b.get();
            ga0.f.Companion.getClass();
            Intrinsics.checkNotNullParameter(extension, "extension");
            vc.s.k(extension);
            return extension;
        }
        if (i == 1) {
            v60.e eVarA = kVar.e.a();
            vc.s.j(eVarA);
            sf0.h hVarB = kVar.f.b();
            vc.s.j(hVarB);
            return new ga0.d(hVarB, eVarA);
        }
        if (i != 2) {
            throw new AssertionError(i);
        }
        BackendFlowInput backendFlowInput = dVar.f133023a;
        ra0.h hVarA = kVar.f133101a.a();
        vc.s.j(hVarA);
        return new ia0.f(backendFlowInput, hVarA, (ga0.a) dVar.f133024b.get());
    }

    private final Object q() {
        fa0.k kVar = (fa0.k) this.f130763b;
        fa0.h hVar = (fa0.h) this.d;
        int i = this.f130764c;
        switch (i) {
            case 0:
                n60.a extension = (n60.a) hVar.i.get();
                Intrinsics.checkNotNullParameter(extension, "extension");
                vc.s.k(extension);
                return extension;
            case 1:
                com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) hVar.f133044h.get();
                Intrinsics.checkNotNullParameter(controller, "controller");
                return new n60.a(controller);
            case 2:
                Object extension2 = (j60.a) hVar.k.get();
                ab0.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension2, "extension");
                yji.d dVar = (yji.d) extension2;
                vc.s.k(dVar);
                return dVar;
            case 3:
                com.revolut.kompot.navigable.a controller2 = (com.revolut.kompot.navigable.a) hVar.f133044h.get();
                he2.b dialogHostFinder = ehe.n.r();
                ab0.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller2, "controller");
                Intrinsics.checkNotNullParameter(dialogHostFinder, "dialogHostFinder");
                return new j60.c(controller2, new rp0.m(), dialogHostFinder);
            case 4:
                Object extension3 = (r60.b) hVar.f133050n.get();
                Intrinsics.checkNotNullParameter(extension3, "extension");
                yji.d dVar2 = (yji.d) extension3;
                vc.s.k(dVar2);
                return dVar2;
            case 5:
                return s2l.c.r((com.revolut.kompot.navigable.a) hVar.f133044h.get(), (rp0.p0) hVar.f133049m.get(), kxa.j.o(new nji.b()));
            case 6:
                return new rp0.p0();
            case 7:
                Object extension4 = (j60.a) hVar.f133053p.get();
                rb0.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension4, "extension");
                yji.d dVar3 = (yji.d) extension4;
                vc.s.k(dVar3);
                return dVar3;
            case 8:
                com.revolut.kompot.navigable.a controller3 = (com.revolut.kompot.navigable.a) hVar.f133044h.get();
                he2.b dialogHostFinder2 = ehe.n.r();
                rb0.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller3, "controller");
                Intrinsics.checkNotNullParameter(dialogHostFinder2, "dialogHostFinder");
                return new j60.c(controller3, new rp0.m(), dialogHostFinder2);
            case 9:
                ga0.a extension5 = (ga0.a) hVar.f133055r.get();
                ga0.f.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension5, "extension");
                vc.s.k(extension5);
                return extension5;
            case 10:
                v60.e eVarA = kVar.e.a();
                vc.s.j(eVarA);
                sf0.h hVarB = kVar.f.b();
                vc.s.j(hVarB);
                return new ga0.d(hVarB, eVarA);
            case 11:
                qa0.b extension6 = (qa0.b) hVar.u.get();
                qa0.g.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension6, "extension");
                vc.s.k(extension6);
                return extension6;
            case 12:
                BackendFlow backendFlow = hVar.f133036a;
                l70.e eVar = kVar.f133103c;
                vl2.a aVar = kVar.f133102b;
                f80.a aVarX = eVar.x();
                vc.s.j(aVarX);
                o90.a aVar2 = (o90.a) aVar.e.get();
                vc.s.j(aVar2);
                return new qa0.e(backendFlow, aVarX, aVar2, (no.m) hVar.f133059t.get(), ((s41.a) aVar.f290173b).d());
            case 13:
                BackendFlowInput inputData = hVar.f133038b;
                Intrinsics.checkNotNullParameter(inputData, "inputData");
                return new ma0.a(inputData);
            case 14:
                za0.g extension7 = (za0.g) hVar.Q.get();
                ab0.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension7, "extension");
                vc.s.k(extension7);
                return extension7;
            case 15:
                j60.a aVar3 = (j60.a) hVar.k.get();
                yc0.j jVarC = hVar.c();
                qa0.b bVar = (qa0.b) hVar.u.get();
                ViewController viewController = hVar.f133040c;
                ua0.a aVar4 = (ua0.a) hVar.P.get();
                c70.a aVarZ = kVar.f133103c.z();
                vc.s.j(aVarZ);
                return a0k.b.e(aVar3, jVarC, bVar, viewController, aVar4, aVarZ);
            case 16:
                ViewController viewController2 = hVar.f133040c;
                na0.j.Companion.getClass();
                Intrinsics.checkNotNullParameter(viewController2, "viewController");
                return new f01.c(viewController2.m2());
            case 17:
                la0.c flowProvider = (la0.c) hVar.f133064x.get();
                no.m productProvider = (no.m) hVar.f133059t.get();
                ImmutableMap saturators = ImmutableMap.of(WidgetProgressionItem.class, new z90.b());
                Intrinsics.checkNotNullParameter(flowProvider, "flowProvider");
                Intrinsics.checkNotNullParameter(productProvider, "productProvider");
                Intrinsics.checkNotNullParameter(saturators, "saturators");
                return new yc0.g(productProvider, flowProvider, saturators);
            case 18:
                return new la0.c(hVar.f133036a);
            case 19:
                return new ad0.b();
            case 20:
                yc0.q qVarQ = hVar.q();
                yc0.r rVar = (yc0.r) hVar.A.get();
                ad0.c cVar = (ad0.c) hVar.B.get();
                ad0.w wVarG = kVar.f133104g.g();
                vc.s.j(wVarG);
                yc0.f0 f0Var = (yc0.f0) hVar.C.get();
                ad0.h hVar2 = (ad0.h) hVar.D.get();
                ad0.n nVarJ = hVar.j();
                u9l.a aVarB = kVar.f133105h.b();
                vc.s.j(aVarB);
                return new ad0.r(qVarQ, rVar, cVar, wVarG, f0Var, hVar2, nVarJ, aVarB);
            case 21:
                return new yc0.u(hVar.b(), new yc0.p());
            case 22:
                return new ad0.d();
            case 23:
                hbl.d dVarC = kVar.f133105h.c();
                vc.s.j(dVarC);
                return new yc0.f0(dVarC);
            case 24:
                return new ad0.i(hVar.j());
            case 25:
                return new ua0.b((qa0.b) hVar.u.get(), (wa0.b) hVar.O.get(), kVar.f133104g.f());
            case 26:
                hVar.getClass();
                ImmutableMap.Builder builderBuilderWithExpectedSize = ImmutableMap.builderWithExpectedSize(8);
                builderBuilderWithExpectedSize.put(CardCellItem.class, hVar.F.get());
                builderBuilderWithExpectedSize.put(CardSelectionItem.class, hVar.G.get());
                builderBuilderWithExpectedSize.put(EntitiesSummaryItem.class, hVar.H.get());
                builderBuilderWithExpectedSize.put(EntitiesSelectionItem.class, hVar.J.get());
                builderBuilderWithExpectedSize.put(EntitiesListItem.class, hVar.K.get());
                builderBuilderWithExpectedSize.put(EntityCellItem.class, hVar.L.get());
                builderBuilderWithExpectedSize.put(WidgetProgressionItem.class, hVar.M.get());
                builderBuilderWithExpectedSize.put(TransactionCellItem.class, hVar.N.get());
                return new wa0.b(builderBuilderWithExpectedSize.build());
            case 27:
                BackendFlow backendFlow2 = hVar.f133036a;
                oc0.f fVarC = kVar.f133104g.c();
                vc.s.j(fVarC);
                return new pb0.c(backendFlow2, fVarC, 0);
            case 28:
                BackendFlow backendFlow3 = hVar.f133036a;
                oc0.f fVarC2 = kVar.f133104g.c();
                vc.s.j(fVarC2);
                return new pb0.c(backendFlow3, fVarC2, 1);
            case 29:
                BackendFlow backendFlow4 = hVar.f133036a;
                oc0.k kVarA = kVar.f133104g.a();
                vc.s.j(kVarA);
                t9l.g gVarA = kVar.f133105h.a();
                vc.s.j(gVarA);
                return new pb0.f(backendFlow4, kVarA, gVarA);
            case 30:
                BackendFlow backendFlow5 = hVar.f133036a;
                fc0.f fVarD = kVar.f133104g.d();
                vc.s.j(fVarD);
                return new pb0.c(backendFlow5, fVarD);
            case 31:
                oc0.m mVarE = kVar.f133104g.e();
                vc.s.j(mVarE);
                return new pb0.i(mVarE);
            case 32:
                t9l.g gVarA2 = kVar.f133105h.a();
                vc.s.j(gVarA2);
                return new pb0.i(gVarA2);
            case 33:
                tb0.g extension8 = (tb0.g) hVar.S.get();
                ub0.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension8, "extension");
                vc.s.k(extension8);
                return extension8;
            case 34:
                r60.b promptViewControllerExtension = (r60.b) hVar.f133050n.get();
                tb0.h mapper = new tb0.h(hVar.q(), (ad0.a) hVar.z.get(), (yc0.g) hVar.f133066y.get(), new yc0.p());
                qa0.b externalNavigationExtension = (qa0.b) hVar.u.get();
                ub0.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(promptViewControllerExtension, "promptViewControllerExtension");
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(externalNavigationExtension, "externalNavigationExtension");
                return new tb0.g(promptViewControllerExtension, mapper, externalNavigationExtension);
            case 35:
                qb0.b extension9 = (qb0.b) hVar.U.get();
                rb0.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension9, "extension");
                vc.s.k(extension9);
                return extension9;
            case 36:
                j60.a bottomExpandableDialogControllerExtension = (j60.a) hVar.f133053p.get();
                yc0.o mapper2 = new yc0.o((yc0.g) hVar.f133066y.get());
                qa0.b externalNavigationExtension2 = (qa0.b) hVar.u.get();
                rb0.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
                Intrinsics.checkNotNullParameter(mapper2, "mapper");
                Intrinsics.checkNotNullParameter(externalNavigationExtension2, "externalNavigationExtension");
                return new qb0.b(bottomExpandableDialogControllerExtension, mapper2, externalNavigationExtension2);
            case 37:
                Object extension10 = (ua0.a) hVar.P.get();
                va0.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension10, "extension");
                yji.n nVar = (yji.n) extension10;
                vc.s.k(nVar);
                return nVar;
            case 38:
                o90.a aVar5 = (o90.a) kVar.f133102b.e.get();
                vc.s.j(aVar5);
                return new oa0.b(aVar5, (yc0.a) hVar.Z.get(), new aa0.a(), (od0.i) hVar.f133037a0.get());
            case 39:
                return new yc0.c((yc0.b0) hVar.Y.get());
            case 40:
                return new la0.j(new smd.s((la0.c) hVar.f133064x.get()), (BackendFlowNavigationIcon) hVar.X.get());
            case 41:
                na0.h hVar3 = hVar.d;
                BackendFlowInput inputData2 = hVar.f133038b;
                Intrinsics.checkNotNullParameter(inputData2, "inputData");
                BackendFlowNavigationIcon backendFlowNavigationIcon = inputData2.d;
                vc.s.k(backendFlowNavigationIcon);
                return backendFlowNavigationIcon;
            case 42:
                na0.h hVar4 = hVar.d;
                BackendFlowInput inputData3 = hVar.f133038b;
                Intrinsics.checkNotNullParameter(inputData3, "inputData");
                od0.h hVar5 = od0.i.Companion;
                inputData3.getClass();
                hVar5.getClass();
                return od0.i.f224256b;
            case 43:
                return new oa0.d(new aa0.d0());
            case 44:
                UUID uuid = (UUID) hVar.f133041d0.get();
                BackendFlow backendFlow6 = hVar.f133036a;
                a5h.g gVar = new a5h.g(new vb0.b(new vb0.a(hVar.q(), (yc0.g) hVar.f133066y.get(), (yc0.f) hVar.f133042e0.get(), new yc0.p(), (in0.g) hVar.f0.get()), (ad0.a) hVar.z.get(), (qa0.b) hVar.u.get()), (oa0.a) hVar.f133039b0.get(), (oa0.c) hVar.c0.get(), (oa0.e) hVar.f.k.get(), new lal.a(new g5k.e(hVar.g0), (ob0.a) hVar.j0.get(), (lb0.p0) hVar.m0.get(), (qa0.b) hVar.u.get()));
                ra0.h hVarA = kVar.f133101a.a();
                vc.s.j(hVarA);
                return new com.revolut.core.backend_flow.impl.internal_flow.d(uuid, backendFlow6, gVar, hVarA, (n60.a) hVar.i.get(), (ga0.a) hVar.f133055r.get(), (qa0.b) hVar.u.get(), new la0.m(), new la0.b(ImmutableMap.of(BottomPromptScreen.class, (xa0.b) hVar.Q.get(), PromptScreen.class, (xa0.b) hVar.S.get(), HtmlPromptScreen.class, (xa0.b) hVar.U.get())), new la0.k(hVar.f133038b));
            case 45:
                na0.h hVar6 = hVar.d;
                BackendFlowInput inputData4 = hVar.f133038b;
                Intrinsics.checkNotNullParameter(inputData4, "inputData");
                UUID uuid2 = ((BackendFlowInput.Source.Session) inputData4.f51218a).f51223a;
                vc.s.k(uuid2);
                return uuid2;
            case 46:
                return new yc0.f((yc0.b0) hVar.Y.get());
            case 47:
                return new la0.d(hVar.f133036a);
            case 48:
                return new ob0.m((f01.a) hVar.f133062w.get());
            case 49:
                aa0.b bVar2 = new aa0.b();
                aa0.d dVar4 = new aa0.d((aa0.y) hVar.i0.get());
                aa0.f fVar = new aa0.f();
                aa0.g gVar2 = new aa0.g();
                aa0.u uVar = new aa0.u();
                aa0.j jVar = new aa0.j();
                aa0.k kVar2 = new aa0.k();
                aa0.l lVar = new aa0.l();
                aa0.m mVar = new aa0.m();
                aa0.n nVar2 = new aa0.n();
                aa0.o oVar = new aa0.o();
                aa0.p pVar = new aa0.p();
                aa0.s sVar = new aa0.s((ad0.a) hVar.z.get(), 0);
                aa0.t tVar = new aa0.t();
                w80.b bVarJ = hVar.f.f133103c.j();
                vc.s.j(bVarJ);
                return new ob0.a(bVar2, dVar4, fVar, gVar2, uVar, jVar, kVar2, lVar, mVar, nVar2, oVar, pVar, sVar, tVar, new aa0.z(bVarJ), new aa0.a0(), new aa0.c0(), new aa0.e0(), new aa0.f0(), new aa0.g0(), new aa0.i0(), new aa0.j0(), new aa0.k0(), new aa0.l0(), new i1(), new aa0.q((ad0.a) hVar.z.get()));
            case 50:
                return new aa0.y((zzl.b) hVar.f133045h0.get());
            case 51:
                na0.b.Companion.getClass();
                return new zzl.c();
            case 52:
                return new lb0.q0((bd0.d) hVar.f133047k0.get(), (yc0.y) hVar.l0.get(), (yc0.f) hVar.f133042e0.get());
            case 53:
                return new bd0.e();
            case 54:
                na0.g.Companion.getClass();
                return new yc0.a0(bd0.c.f14513a);
            case 55:
                return new qa0.a(new smd.s((la0.c) hVar.f133064x.get()), hVar.f133038b);
            case 56:
                z80.b bVarS = hVar.f.f133103c.s();
                vc.s.j(bVarS);
                return new lb0.m0(new aa0.b0(bVarS, (aa0.y) hVar.i0.get()), (lb0.n0) hVar.p0.get(), (yc0.g) hVar.f133066y.get(), (na0.e) hVar.q0.get());
            case 57:
                return new lb0.n0();
            case 58:
                ViewController controller4 = hVar.f133040c;
                na0.g.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller4, "controller");
                return new na0.e(controller4);
            case 59:
                return new yc0.w();
            case 60:
                return new yc0.e0((yc0.r) hVar.A.get(), new yc0.p());
            case 61:
                return new bd0.b((f01.a) hVar.f133062w.get());
            case 62:
                return new ob0.n((f01.a) hVar.f133062w.get());
            case 63:
                return new ob0.s((f01.a) hVar.f133062w.get());
            case 64:
                return new ob0.p(hVar.b());
            default:
                throw new AssertionError(i);
        }
    }

    @Override // phm.a
    public final Object get() {
        Object gVar;
        Object aVar;
        Object cVar;
        Object gVar2;
        switch (this.f130762a) {
            case 0:
                b0 b0Var = (b0) this.f130763b;
                k kVar = (k) this.d;
                b0 b0Var2 = kVar.f130776b;
                int i = this.f130764c;
                if (i == 0) {
                    return new fzd.y();
                }
                if (i == 1) {
                    return new fzd.a0();
                }
                if (i != 2) {
                    if (i == 3) {
                        return new fzd.w(new mzd.b(b0Var2.f.g()), new mzd.d(b0Var2.f.g()));
                    }
                    throw new AssertionError(i);
                }
                cli.n nVar = (cli.n) kVar.e.get();
                ConsolidatedStatementCustomisationScreenContract$InputData consolidatedStatementCustomisationScreenContract$InputData = kVar.f130775a;
                fk3.a aVarA = b0Var2.f130700g.a();
                vc.s.j(aVarA);
                l80.e eVarH = b0Var2.f130698b.h();
                vc.s.j(eVarH);
                kgm.i iVar = new kgm.i(aVarA, eVarH);
                zxd.c cVarA = ((b) b0Var.f130699c).a();
                vc.s.j(cVarA);
                return new fzd.u(nVar, consolidatedStatementCustomisationScreenContract$InputData, iVar, cVarA, new l2j.a(), (fzd.x) kVar.f130777c.get(), (fzd.z) kVar.d.get(), b0Var.f130707q);
            case 1:
                b0 b0Var3 = (b0) this.f130763b;
                int i2 = this.f130764c;
                if (i2 == 0) {
                    return new com.revolut.feature.statements.impl.ui.consolidated.flow.a(((l) this.d).f130779a);
                }
                if (i2 != 1) {
                    throw new AssertionError(i2);
                }
                elb.b bVarE = ((blb.e) b0Var3.f130702j).e();
                zxd.c cVarA2 = ((b) b0Var3.f130699c).a();
                vc.s.j(cVarA2);
                return new pzd.c(bVarE, cVarA2, b0Var3.e.e());
            case 2:
                b0 b0Var4 = (b0) this.f130763b;
                m mVar = (m) this.d;
                int i3 = this.f130764c;
                switch (i3) {
                    case 0:
                        return iz8.c.i((i0e.f) mVar.f130786h.get());
                    case 1:
                        return new i0e.m((j60.a) mVar.d.get(), (i0e.g) mVar.f130785g.get());
                    case 2:
                        return iz8.c.B((com.revolut.kompot.navigable.a) mVar.f130784c.get(), kxa.j.o(new nji.b()));
                    case 3:
                        i0e.c cVar2 = (i0e.c) mVar.e.get();
                        zxd.c cVarA3 = ((b) b0Var4.f130699c).a();
                        vc.s.j(cVarA3);
                        return new i0e.q(cVar2, cVarA3, (i0e.h) mVar.f.get(), (j60.a) mVar.d.get());
                    case 4:
                        return new i0e.r();
                    case 5:
                        return new i0e.g0();
                    case 6:
                        return iz8.c.h((j60.a) mVar.d.get());
                    case 7:
                        return iz8.c.j((i0e.g) mVar.f130785g.get());
                    case 8:
                        b0 b0Var5 = mVar.f130783b;
                        zxd.c cVarA4 = ((b) b0Var5.f130699c).a();
                        vc.s.j(cVarA4);
                        gte.a aVarB = b0Var5.f130697a.b();
                        vc.s.j(aVarB);
                        pzd.g gVar3 = new pzd.g(cVarA4, aVarB);
                        zxd.c cVarA5 = ((b) b0Var4.f130699c).a();
                        vc.s.j(cVarA5);
                        i0e.e eVar = (i0e.e) mVar.f130785g.get();
                        n0e.b bVarC = ((b) b0Var4.f130699c).c();
                        vyd.a aVar2 = new vyd.a();
                        hk0.a aVarJ = ((nj0.d) b0Var4.f130701h).j();
                        gte.a aVarB2 = b0Var4.f130697a.b();
                        vc.s.j(aVarB2);
                        return new com.revolut.feature.statements.impl.ui.consolidated.screen.a(gVar3, cVarA5, eVar, bVarC, aVar2, aVarJ, aVarB2, mVar.f130782a, (cli.n) mVar.f130788l.get());
                    case 9:
                        return new pzd.d();
                    default:
                        throw new AssertionError(i3);
                }
            case 3:
                b0 b0Var6 = (b0) this.f130763b;
                vxd.b bVar = b0Var6.f130699c;
                o oVar = (o) this.d;
                int i5 = this.f130764c;
                switch (i5) {
                    case 0:
                        return iz8.c.i((i0e.f) oVar.f130808g.get());
                    case 1:
                        return new i0e.m((j60.a) oVar.f130807c.get(), (i0e.g) oVar.f.get());
                    case 2:
                        return iz8.c.B((com.revolut.kompot.navigable.a) oVar.f130806b.get(), kxa.j.o(new nji.b()));
                    case 3:
                        i0e.c cVar3 = (i0e.c) oVar.d.get();
                        zxd.c cVarA6 = ((b) bVar).a();
                        vc.s.j(cVarA6);
                        return new i0e.q(cVar3, cVarA6, (i0e.h) oVar.e.get(), (j60.a) oVar.f130807c.get());
                    case 4:
                        return new i0e.r();
                    case 5:
                        return new i0e.g0();
                    case 6:
                        return iz8.c.h((j60.a) oVar.f130807c.get());
                    case 7:
                        return iz8.c.j((i0e.g) oVar.f.get());
                    case 8:
                        tzd.j jVar = new tzd.j();
                        i0e.e eVar2 = (i0e.e) oVar.f.get();
                        hk0.a aVarJ2 = ((nj0.d) b0Var6.f130701h).j();
                        zxd.c cVarA7 = ((b) bVar).a();
                        vc.s.j(cVarA7);
                        return new tzd.t(jVar, eVar2, aVarJ2, cVarA7, new vyd.a(), ((b) bVar).c(), oVar.f130805a);
                    default:
                        throw new AssertionError(i5);
                }
            case 4:
                b0 b0Var7 = (b0) this.f130763b;
                vxd.b bVar2 = b0Var7.f130699c;
                q qVar = (q) this.d;
                b0 b0Var8 = qVar.f130815a;
                int i6 = this.f130764c;
                if (i6 == 0) {
                    return new fzd.y();
                }
                if (i6 == 1) {
                    return new fzd.a0();
                }
                if (i6 != 2) {
                    if (i6 != 3) {
                        throw new AssertionError(i6);
                    }
                    mzd.b bVar3 = new mzd.b(b0Var8.f.g());
                    d0e.a aVar3 = new d0e.a();
                    qd0.b bVarN = b0Var7.f130698b.n();
                    vc.s.j(bVarN);
                    return new xzd.w(bVar3, aVar3, new zjh.j(bVarN), qVar.b());
                }
                cli.n nVar2 = (cli.n) qVar.d.get();
                kgm.i iVarB = qVar.b();
                wzd.c cVar4 = new wzd.c(new e0e.i());
                zxd.c cVarA8 = ((b) bVar2).a();
                vc.s.j(cVarA8);
                ede.a aVar4 = b0Var7.f130707q;
                l2j.a aVar5 = new l2j.a();
                l80.e eVarH2 = b0Var8.f130698b.h();
                vc.s.j(eVarH2);
                return new com.revolut.feature.statements.impl.ui.custom_statement.screen.b(nVar2, iVarB, cVar4, cVarA8, aVar4, aVar5, new a0e.w(eVarH2, 1), ((nj0.d) b0Var7.f130701h).j(), new vyd.a(), ((b) bVar2).c());
            case 5:
                b0 b0Var9 = (b0) this.f130763b;
                vxd.b bVar4 = b0Var9.f130699c;
                y yVar = (y) this.d;
                int i21 = this.f130764c;
                switch (i21) {
                    case 0:
                        return iz8.c.i((i0e.f) yVar.f130843g.get());
                    case 1:
                        return new i0e.m((j60.a) yVar.f130842c.get(), (i0e.g) yVar.f.get());
                    case 2:
                        return iz8.c.B((com.revolut.kompot.navigable.a) yVar.f130841b.get(), kxa.j.o(new nji.b()));
                    case 3:
                        i0e.c cVar5 = (i0e.c) yVar.d.get();
                        zxd.c cVarA9 = ((b) bVar4).a();
                        vc.s.j(cVarA9);
                        return new i0e.q(cVar5, cVarA9, (i0e.h) yVar.e.get(), (j60.a) yVar.f130842c.get());
                    case 4:
                        return new i0e.r();
                    case 5:
                        return new i0e.g0();
                    case 6:
                        return iz8.c.h((j60.a) yVar.f130842c.get());
                    case 7:
                        return iz8.c.j((i0e.g) yVar.f.get());
                    case 8:
                        p0e.k kVar2 = new p0e.k();
                        p0e.e eVar3 = yVar.f130840a;
                        i0e.e eVar4 = (i0e.e) yVar.f.get();
                        zxd.c cVarA10 = ((b) bVar4).a();
                        vc.s.j(cVarA10);
                        n0e.b bVarC2 = ((b) bVar4).c();
                        vyd.a aVar6 = new vyd.a();
                        sf0.h hVarB = b0Var9.d.b();
                        vc.s.j(hVarB);
                        return new p0e.j(kVar2, eVar3, eVar4, cVarA10, bVarC2, aVar6, hVarB);
                    default:
                        throw new AssertionError(i21);
                }
            case 6:
                b0 b0Var10 = (b0) this.f130763b;
                a0 a0Var = (a0) this.d;
                int i22 = this.f130764c;
                switch (i22) {
                    case 0:
                        return iz8.c.i((i0e.f) a0Var.f130676g.get());
                    case 1:
                        return new i0e.m((j60.a) a0Var.f130675c.get(), (i0e.g) a0Var.f.get());
                    case 2:
                        return iz8.c.B((com.revolut.kompot.navigable.a) a0Var.f130674b.get(), kxa.j.o(new nji.b()));
                    case 3:
                        i0e.c cVar6 = (i0e.c) a0Var.d.get();
                        zxd.c cVarA11 = ((b) b0Var10.f130699c).a();
                        vc.s.j(cVarA11);
                        return new i0e.q(cVar6, cVarA11, (i0e.h) a0Var.e.get(), (j60.a) a0Var.f130675c.get());
                    case 4:
                        return new i0e.r();
                    case 5:
                        return new i0e.g0();
                    case 6:
                        return iz8.c.h((j60.a) a0Var.f130675c.get());
                    case 7:
                        return iz8.c.j((i0e.g) a0Var.f.get());
                    case 8:
                        SavingsStatementsScreenContract$InputData savingsStatementsScreenContract$InputData = a0Var.f130673a;
                        vxd.b bVar5 = b0Var10.f130699c;
                        nj0.a aVar7 = b0Var10.f130701h;
                        zxd.c cVarA12 = ((b) bVar5).a();
                        vc.s.j(cVarA12);
                        return new com.revolut.feature.statements.impl.ui.savings.a(savingsStatementsScreenContract$InputData, cVarA12, ((nj0.d) aVar7).j(), ((nj0.d) aVar7).f216295c, new vyd.a(), ((b) b0Var10.f130699c).c(), (i0e.e) a0Var.f.get(), ((blb.e) b0Var10.f130702j).e(), b0Var10.e.e(), (k0e.f) a0Var.k.get());
                    case 9:
                        return new k0e.p();
                    default:
                        throw new AssertionError(i22);
                }
            case 7:
                vxd.b bVar6 = ((b0) this.f130763b).f130699c;
                int i32 = this.f130764c;
                if (i32 != 0) {
                    if (i32 == 1) {
                        return new r0e.n();
                    }
                    throw new AssertionError(i32);
                }
                cli.n nVar3 = (cli.n) ((d0) this.d).f130727a.get();
                zxd.c cVarA13 = ((b) bVar6).a();
                vc.s.j(cVarA13);
                return new r0e.m(nVar3, cVarA13, new vyd.a(), ((b) bVar6).c());
            case 8:
                e0 e0Var = (e0) this.d;
                vxd.b bVar7 = ((b0) this.f130763b).f130699c;
                int i33 = this.f130764c;
                if (i33 != 0) {
                    if (i33 == 1) {
                        return new t0e.m();
                    }
                    throw new AssertionError(i33);
                }
                cli.n nVar4 = (cli.n) e0Var.f130733b.get();
                TaxFilingScreenContract$InputData taxFilingScreenContract$InputData = e0Var.f130732a;
                zxd.c cVarA14 = ((b) bVar7).a();
                vc.s.j(cVarA14);
                return new t0e.l(nVar4, taxFilingScreenContract$InputData, cVarA14, new vyd.a(), ((b) bVar7).c());
            case 9:
                f09.e eVar5 = (f09.e) this.f130763b;
                f09.c cVar7 = (f09.c) this.d;
                int i43 = this.f130764c;
                switch (i43) {
                    case 0:
                        return kxa.j.l((j60.a) cVar7.e.get());
                    case 1:
                        return h30.l.p((com.revolut.kompot.navigable.a) cVar7.f131048c.get(), (rp0.m) cVar7.d.get());
                    case 2:
                        return new rp0.m();
                    case 3:
                        return s2l.c.k((r60.b) cVar7.f131050h.get());
                    case 4:
                        return com.revolut.data.database.models.openbanking.d.w((com.revolut.kompot.navigable.a) cVar7.f131048c.get(), (rp0.p0) cVar7.f131049g.get());
                    case 5:
                        return new rp0.p0();
                    case 6:
                        g09.i iVarA = ((f09.b) eVar5.f131059b).a();
                        vc.s.j(iVarA);
                        return new k09.m(iVarA, new l09.g());
                    case 7:
                        g09.i iVarA2 = ((f09.b) eVar5.f131059b).a();
                        vc.s.j(iVarA2);
                        k09.m mVar2 = (k09.m) cVar7.f131051j.get();
                        r60.b bVar8 = (r60.b) cVar7.f131050h.get();
                        l09.a aVar8 = new l09.a();
                        dz8.e eVar6 = (dz8.e) eVar5.f131058a.k.get();
                        vc.s.j(eVar6);
                        gVar = new k09.g(iVarA2, mVar2, bVar8, aVar8, eVar6);
                        break;
                    case 8:
                        jki.p pVar = (jki.p) cVar7.f131052l.get();
                        CourseOverviewScreenContract$InputData courseOverviewScreenContract$InputData = cVar7.f131046a;
                        f09.g gVar4 = eVar5.f131059b;
                        f09.g gVar5 = eVar5.f131059b;
                        g09.e eVar7 = (g09.e) ((f09.b) gVar4).f131039q.get();
                        vc.s.j(eVar7);
                        g09.i iVarA3 = ((f09.b) gVar5).a();
                        vc.s.j(iVarA3);
                        g09.h hVar = (g09.h) ((f09.b) gVar5).A.get();
                        vc.s.j(hVar);
                        return new com.revolut.feature.learn.shared.impl.ui.course.overview.e(pVar, courseOverviewScreenContract$InputData, eVar7, iVarA3, hVar, new m09.a(), new l09.a(), (j60.a) cVar7.e.get(), (k09.g) cVar7.k.get(), (k09.m) cVar7.f131051j.get(), (l09.e) cVar7.f131053m.get());
                    case 9:
                        h09.f fVar = new h09.f();
                        cVar7.getClass();
                        h09.f rewardMapper = new h09.f();
                        Intrinsics.checkNotNullParameter(rewardMapper, "rewardMapper");
                        l09.d dVar = new l09.d();
                        h09.f rewardMapper2 = new h09.f();
                        Intrinsics.checkNotNullParameter(rewardMapper2, "rewardMapper");
                        gVar = new com.revolut.feature.learn.shared.impl.ui.course.overview.f(fVar, dVar, new l09.b());
                        break;
                    case 10:
                        dz8.f fVar2 = (dz8.f) eVar5.f131058a.f220914j.get();
                        vc.s.j(fVar2);
                        return new l09.f(fVar2);
                    default:
                        throw new AssertionError(i43);
                }
                return gVar;
            case 10:
                f09.e eVar8 = (f09.e) this.f130763b;
                f09.g gVar6 = eVar8.f131059b;
                f09.d dVar2 = (f09.d) this.d;
                LearnHomeScreenContract$InputData learnHomeScreenContract$InputData = dVar2.f131055a;
                int i59 = this.f130764c;
                if (i59 != 0) {
                    if (i59 == 1) {
                        return new p09.e(new p09.b(), new h09.d(new h09.f()), learnHomeScreenContract$InputData);
                    }
                    throw new AssertionError(i59);
                }
                jki.p pVar2 = (jki.p) dVar2.f131057c.get();
                g09.f fVar3 = (g09.f) ((f09.b) gVar6).f131044x.get();
                vc.s.j(fVar3);
                g09.a aVar9 = (g09.a) ((f09.b) gVar6).f131041s.get();
                vc.s.j(aVar9);
                dz8.f fVar4 = (dz8.f) eVar8.f131058a.f220914j.get();
                vc.s.j(fVar4);
                return new n09.m0(pVar2, learnHomeScreenContract$InputData, fVar3, aVar9, fVar4);
            case 11:
                return a();
            case 12:
                f4g.e eVar9 = (f4g.e) this.d;
                int i66 = this.f130764c;
                if (i66 == 0) {
                    return new com.revolut.feature.travel.flights.impl.ui.screen.booking_details.a((cli.n) eVar9.f132102b.get(), eVar9.f132101a, (b4g.f) ((f4g.b) this.f130763b).f132067s.get(), new j5g.b());
                }
                if (i66 != 1) {
                    throw new AssertionError(i66);
                }
                q4g.g gVar7 = new q4g.g();
                q4g.i iVar2 = new q4g.i();
                q4g.k kVar3 = new q4g.k();
                q4g.r rVar = new q4g.r(b5g.c.a());
                b5g.b.Companion.getClass();
                return new a3e.u(new r10.v(gVar7, iVar2, kVar3, rVar, new q4g.e(new q4g.c("BOOKING_DETAILS_ADDITIONAL_DETAILS_SUBHEADER", "BOOKING_DETAILS_BOOKING_CONTACT", "BOOKING_DETAILS_TICKET_RULES", R$string.travel_flights_booking_details_additional_details_title, R$string.travel_flights_booking_details_additional_details_booking_contact_title, R$string.travel_flights_booking_details_additional_details_booking_contact_subtitle, Integer.valueOf(R$string.travel_flights_booking_details_additional_details_ticket_rules_title)))));
            case 13:
                return b();
            case 14:
                return c();
            case 15:
                return d();
            case 16:
                return e();
            case 17:
                return f();
            case 18:
                return g();
            case 19:
                return h();
            case 20:
                return i();
            case 21:
                return j();
            case 22:
                return k();
            case 23:
                return l();
            case 24:
                return m();
            case 25:
                return n();
            case 26:
                return o();
            case 27:
                return p();
            case 28:
                return q();
            default:
                fa0.k kVar4 = (fa0.k) this.f130763b;
                fa0.j jVar2 = (fa0.j) this.d;
                int i74 = this.f130764c;
                switch (i74) {
                    case 0:
                        n60.a extension = (n60.a) jVar2.i.get();
                        Intrinsics.checkNotNullParameter(extension, "extension");
                        vc.s.k(extension);
                        return extension;
                    case 1:
                        com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) jVar2.f133078h.get();
                        Intrinsics.checkNotNullParameter(controller, "controller");
                        aVar = new n60.a(controller);
                        return aVar;
                    case 2:
                        Object extension2 = (j60.a) jVar2.k.get();
                        ab0.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension2, "extension");
                        yji.d dVar3 = (yji.d) extension2;
                        vc.s.k(dVar3);
                        return dVar3;
                    case 3:
                        com.revolut.kompot.navigable.a controller2 = (com.revolut.kompot.navigable.a) jVar2.f133078h.get();
                        he2.b dialogHostFinder = ehe.n.r();
                        ab0.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(controller2, "controller");
                        Intrinsics.checkNotNullParameter(dialogHostFinder, "dialogHostFinder");
                        cVar = new j60.c(controller2, new rp0.m(), dialogHostFinder);
                        return cVar;
                    case 4:
                        Object extension3 = (r60.b) jVar2.f133084n.get();
                        Intrinsics.checkNotNullParameter(extension3, "extension");
                        yji.d dVar4 = (yji.d) extension3;
                        vc.s.k(dVar4);
                        return dVar4;
                    case 5:
                        return s2l.c.r((com.revolut.kompot.navigable.a) jVar2.f133078h.get(), (rp0.p0) jVar2.f133083m.get(), kxa.j.o(new nji.b()));
                    case 6:
                        return new rp0.p0();
                    case 7:
                        Object extension4 = (j60.a) jVar2.f133087p.get();
                        rb0.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension4, "extension");
                        yji.d dVar5 = (yji.d) extension4;
                        vc.s.k(dVar5);
                        return dVar5;
                    case 8:
                        com.revolut.kompot.navigable.a controller3 = (com.revolut.kompot.navigable.a) jVar2.f133078h.get();
                        he2.b dialogHostFinder2 = ehe.n.r();
                        rb0.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(controller3, "controller");
                        Intrinsics.checkNotNullParameter(dialogHostFinder2, "dialogHostFinder");
                        cVar = new j60.c(controller3, new rp0.m(), dialogHostFinder2);
                        return cVar;
                    case 9:
                        ga0.a extension5 = (ga0.a) jVar2.f133089r.get();
                        ga0.f.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension5, "extension");
                        vc.s.k(extension5);
                        return extension5;
                    case 10:
                        v60.e eVarA = kVar4.e.a();
                        vc.s.j(eVarA);
                        sf0.h hVarB2 = kVar4.f.b();
                        vc.s.j(hVarB2);
                        aVar = new ga0.d(hVarB2, eVarA);
                        return aVar;
                    case 11:
                        qa0.b extension6 = (qa0.b) jVar2.u.get();
                        qa0.g.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension6, "extension");
                        vc.s.k(extension6);
                        return extension6;
                    case 12:
                        BackendFlow backendFlow = jVar2.f133070a;
                        l70.e eVar10 = kVar4.f133103c;
                        vl2.a aVar10 = kVar4.f133102b;
                        f80.a aVarX = eVar10.x();
                        vc.s.j(aVarX);
                        o90.a aVar11 = (o90.a) aVar10.e.get();
                        vc.s.j(aVar11);
                        cVar = new qa0.e(backendFlow, aVarX, aVar11, (no.m) jVar2.f133093t.get(), ((s41.a) aVar10.f290173b).d());
                        return cVar;
                    case 13:
                        BackendFlowInput inputData = jVar2.f133072b;
                        Intrinsics.checkNotNullParameter(inputData, "inputData");
                        aVar = new ma0.a(inputData);
                        return aVar;
                    case 14:
                        za0.g extension7 = (za0.g) jVar2.Q.get();
                        ab0.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension7, "extension");
                        vc.s.k(extension7);
                        return extension7;
                    case 15:
                        j60.a aVar12 = (j60.a) jVar2.k.get();
                        yc0.j jVarC = jVar2.c();
                        qa0.b bVar9 = (qa0.b) jVar2.u.get();
                        ViewController viewController = jVar2.f133074c;
                        ua0.a aVar13 = (ua0.a) jVar2.P.get();
                        c70.a aVarZ = kVar4.f133103c.z();
                        vc.s.j(aVarZ);
                        return a0k.b.e(aVar12, jVarC, bVar9, viewController, aVar13, aVarZ);
                    case 16:
                        ViewController viewController2 = jVar2.f133074c;
                        na0.j.Companion.getClass();
                        Intrinsics.checkNotNullParameter(viewController2, "viewController");
                        aVar = new f01.c(viewController2.m2());
                        return aVar;
                    case 17:
                        la0.c flowProvider = (la0.c) jVar2.f133098x.get();
                        no.m productProvider = (no.m) jVar2.f133093t.get();
                        ImmutableMap saturators = ImmutableMap.of(WidgetProgressionItem.class, new z90.b());
                        Intrinsics.checkNotNullParameter(flowProvider, "flowProvider");
                        Intrinsics.checkNotNullParameter(productProvider, "productProvider");
                        Intrinsics.checkNotNullParameter(saturators, "saturators");
                        gVar2 = new yc0.g(productProvider, flowProvider, saturators);
                        return gVar2;
                    case 18:
                        return new la0.c(jVar2.f133070a);
                    case 19:
                        return new ad0.b();
                    case 20:
                        yc0.q qVarQ = jVar2.q();
                        yc0.r rVar2 = (yc0.r) jVar2.A.get();
                        ad0.c cVar8 = (ad0.c) jVar2.B.get();
                        ad0.w wVarG = kVar4.f133104g.g();
                        vc.s.j(wVarG);
                        yc0.f0 f0Var = (yc0.f0) jVar2.C.get();
                        ad0.h hVar2 = (ad0.h) jVar2.D.get();
                        ad0.n nVarJ = jVar2.j();
                        u9l.a aVarB3 = kVar4.f133105h.b();
                        vc.s.j(aVarB3);
                        gVar2 = new ad0.r(qVarQ, rVar2, cVar8, wVarG, f0Var, hVar2, nVarJ, aVarB3);
                        return gVar2;
                    case 21:
                        return new yc0.u(jVar2.b(), new yc0.p());
                    case 22:
                        return new ad0.d();
                    case 23:
                        hbl.d dVarC = kVar4.f133105h.c();
                        vc.s.j(dVarC);
                        aVar = new yc0.f0(dVarC);
                        return aVar;
                    case 24:
                        return new ad0.i(jVar2.j());
                    case 25:
                        cVar = new ua0.b((qa0.b) jVar2.u.get(), (wa0.b) jVar2.O.get(), kVar4.f133104g.f());
                        return cVar;
                    case 26:
                        jVar2.getClass();
                        ImmutableMap.Builder builderBuilderWithExpectedSize = ImmutableMap.builderWithExpectedSize(8);
                        builderBuilderWithExpectedSize.put(CardCellItem.class, jVar2.F.get());
                        builderBuilderWithExpectedSize.put(CardSelectionItem.class, jVar2.G.get());
                        builderBuilderWithExpectedSize.put(EntitiesSummaryItem.class, jVar2.H.get());
                        builderBuilderWithExpectedSize.put(EntitiesSelectionItem.class, jVar2.J.get());
                        builderBuilderWithExpectedSize.put(EntitiesListItem.class, jVar2.K.get());
                        builderBuilderWithExpectedSize.put(EntityCellItem.class, jVar2.L.get());
                        builderBuilderWithExpectedSize.put(WidgetProgressionItem.class, jVar2.M.get());
                        builderBuilderWithExpectedSize.put(TransactionCellItem.class, jVar2.N.get());
                        return new wa0.b(builderBuilderWithExpectedSize.build());
                    case 27:
                        BackendFlow backendFlow2 = jVar2.f133070a;
                        oc0.f fVarC = kVar4.f133104g.c();
                        vc.s.j(fVarC);
                        cVar = new pb0.c(backendFlow2, fVarC, 0);
                        return cVar;
                    case 28:
                        BackendFlow backendFlow3 = jVar2.f133070a;
                        oc0.f fVarC2 = kVar4.f133104g.c();
                        vc.s.j(fVarC2);
                        cVar = new pb0.c(backendFlow3, fVarC2, 1);
                        return cVar;
                    case 29:
                        BackendFlow backendFlow4 = jVar2.f133070a;
                        oc0.k kVarA = kVar4.f133104g.a();
                        vc.s.j(kVarA);
                        t9l.g gVarA = kVar4.f133105h.a();
                        vc.s.j(gVarA);
                        cVar = new pb0.f(backendFlow4, kVarA, gVarA);
                        return cVar;
                    case 30:
                        BackendFlow backendFlow5 = jVar2.f133070a;
                        fc0.f fVarD = kVar4.f133104g.d();
                        vc.s.j(fVarD);
                        cVar = new pb0.c(backendFlow5, fVarD);
                        return cVar;
                    case 31:
                        oc0.m mVarE = kVar4.f133104g.e();
                        vc.s.j(mVarE);
                        aVar = new pb0.i(mVarE);
                        return aVar;
                    case 32:
                        t9l.g gVarA2 = kVar4.f133105h.a();
                        vc.s.j(gVarA2);
                        aVar = new pb0.i(gVarA2);
                        return aVar;
                    case 33:
                        tb0.g extension8 = (tb0.g) jVar2.S.get();
                        ub0.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension8, "extension");
                        vc.s.k(extension8);
                        return extension8;
                    case 34:
                        r60.b promptViewControllerExtension = (r60.b) jVar2.f133084n.get();
                        tb0.h mapper = new tb0.h(jVar2.q(), (ad0.a) jVar2.z.get(), (yc0.g) jVar2.f133100y.get(), new yc0.p());
                        qa0.b externalNavigationExtension = (qa0.b) jVar2.u.get();
                        ub0.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(promptViewControllerExtension, "promptViewControllerExtension");
                        Intrinsics.checkNotNullParameter(mapper, "mapper");
                        Intrinsics.checkNotNullParameter(externalNavigationExtension, "externalNavigationExtension");
                        gVar2 = new tb0.g(promptViewControllerExtension, mapper, externalNavigationExtension);
                        return gVar2;
                    case 35:
                        qb0.b extension9 = (qb0.b) jVar2.U.get();
                        rb0.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension9, "extension");
                        vc.s.k(extension9);
                        return extension9;
                    case 36:
                        j60.a bottomExpandableDialogControllerExtension = (j60.a) jVar2.f133087p.get();
                        yc0.o mapper2 = new yc0.o((yc0.g) jVar2.f133100y.get());
                        qa0.b externalNavigationExtension2 = (qa0.b) jVar2.u.get();
                        rb0.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
                        Intrinsics.checkNotNullParameter(mapper2, "mapper");
                        Intrinsics.checkNotNullParameter(externalNavigationExtension2, "externalNavigationExtension");
                        gVar2 = new qb0.b(bottomExpandableDialogControllerExtension, mapper2, externalNavigationExtension2);
                        return gVar2;
                    case 37:
                        Object extension10 = (ua0.a) jVar2.P.get();
                        va0.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension10, "extension");
                        yji.n nVar5 = (yji.n) extension10;
                        vc.s.k(nVar5);
                        return nVar5;
                    case 38:
                        o90.a aVar14 = (o90.a) kVar4.f133102b.e.get();
                        vc.s.j(aVar14);
                        cVar = new oa0.b(aVar14, (yc0.a) jVar2.Z.get(), new aa0.a(), (od0.i) jVar2.f133071a0.get());
                        return cVar;
                    case 39:
                        return new yc0.c((yc0.b0) jVar2.Y.get());
                    case 40:
                        return new la0.j(new smd.s((la0.c) jVar2.f133098x.get()), (BackendFlowNavigationIcon) jVar2.X.get());
                    case 41:
                        na0.h hVar3 = jVar2.d;
                        BackendFlowInput inputData2 = jVar2.f133072b;
                        Intrinsics.checkNotNullParameter(inputData2, "inputData");
                        BackendFlowNavigationIcon backendFlowNavigationIcon = inputData2.d;
                        vc.s.k(backendFlowNavigationIcon);
                        return backendFlowNavigationIcon;
                    case 42:
                        na0.h hVar4 = jVar2.d;
                        BackendFlowInput inputData3 = jVar2.f133072b;
                        Intrinsics.checkNotNullParameter(inputData3, "inputData");
                        od0.h hVar5 = od0.i.Companion;
                        inputData3.getClass();
                        hVar5.getClass();
                        return od0.i.f224256b;
                    case 43:
                        return new oa0.d(new aa0.d0());
                    case 44:
                        UUID uuid = (UUID) jVar2.f133075d0.get();
                        BackendFlow backendFlow6 = jVar2.f133070a;
                        a5h.g gVar8 = new a5h.g(new vb0.b(new vb0.a(jVar2.q(), (yc0.g) jVar2.f133100y.get(), (yc0.f) jVar2.f133076e0.get(), new yc0.p(), (in0.g) jVar2.f0.get()), (ad0.a) jVar2.z.get(), (qa0.b) jVar2.u.get()), (oa0.a) jVar2.f133073b0.get(), (oa0.c) jVar2.c0.get(), (oa0.e) jVar2.f.k.get(), new lal.a(new g5k.e(jVar2.g0), (ob0.a) jVar2.j0.get(), (lb0.p0) jVar2.m0.get(), (qa0.b) jVar2.u.get()));
                        ra0.h hVarA = kVar4.f133101a.a();
                        vc.s.j(hVarA);
                        aVar = new com.revolut.core.backend_flow.impl.internal_flow.e(uuid, backendFlow6, gVar8, hVarA, (n60.a) jVar2.i.get(), (ga0.a) jVar2.f133089r.get(), (qa0.b) jVar2.u.get(), new la0.m(), new la0.b(ImmutableMap.of(BottomPromptScreen.class, (xa0.b) jVar2.Q.get(), PromptScreen.class, (xa0.b) jVar2.S.get(), HtmlPromptScreen.class, (xa0.b) jVar2.U.get())), new la0.k(jVar2.f133072b));
                        return aVar;
                    case 45:
                        na0.h hVar6 = jVar2.d;
                        BackendFlowInput inputData4 = jVar2.f133072b;
                        Intrinsics.checkNotNullParameter(inputData4, "inputData");
                        UUID uuid2 = ((BackendFlowInput.Source.Session) inputData4.f51218a).f51223a;
                        vc.s.k(uuid2);
                        return uuid2;
                    case 46:
                        return new yc0.f((yc0.b0) jVar2.Y.get());
                    case 47:
                        return new la0.d(jVar2.f133070a);
                    case 48:
                        return new ob0.m((f01.a) jVar2.f133096w.get());
                    case 49:
                        aa0.b bVar10 = new aa0.b();
                        aa0.d dVar6 = new aa0.d((aa0.y) jVar2.i0.get());
                        aa0.f fVar5 = new aa0.f();
                        aa0.g gVar9 = new aa0.g();
                        aa0.u uVar = new aa0.u();
                        aa0.j jVar3 = new aa0.j();
                        aa0.k kVar5 = new aa0.k();
                        aa0.l lVar = new aa0.l();
                        aa0.m mVar3 = new aa0.m();
                        aa0.n nVar6 = new aa0.n();
                        aa0.o oVar2 = new aa0.o();
                        aa0.p pVar3 = new aa0.p();
                        aa0.s sVar = new aa0.s((ad0.a) jVar2.z.get(), 0);
                        aa0.t tVar = new aa0.t();
                        w80.b bVarJ = jVar2.f.f133103c.j();
                        vc.s.j(bVarJ);
                        return new ob0.a(bVar10, dVar6, fVar5, gVar9, uVar, jVar3, kVar5, lVar, mVar3, nVar6, oVar2, pVar3, sVar, tVar, new aa0.z(bVarJ), new aa0.a0(), new aa0.c0(), new aa0.e0(), new aa0.f0(), new aa0.g0(), new aa0.i0(), new aa0.j0(), new aa0.k0(), new aa0.l0(), new i1(), new aa0.q((ad0.a) jVar2.z.get()));
                    case 50:
                        return new aa0.y((zzl.b) jVar2.f133079h0.get());
                    case 51:
                        na0.b.Companion.getClass();
                        return new zzl.c();
                    case 52:
                        return new lb0.q0((bd0.d) jVar2.f133081k0.get(), (yc0.y) jVar2.l0.get(), (yc0.f) jVar2.f133076e0.get());
                    case 53:
                        return new bd0.e();
                    case 54:
                        na0.g.Companion.getClass();
                        return new yc0.a0(bd0.c.f14513a);
                    case 55:
                        return new qa0.a(new smd.s((la0.c) jVar2.f133098x.get()), jVar2.f133072b);
                    case 56:
                        z80.b bVarS = jVar2.f.f133103c.s();
                        vc.s.j(bVarS);
                        return new lb0.m0(new aa0.b0(bVarS, (aa0.y) jVar2.i0.get()), (lb0.n0) jVar2.p0.get(), (yc0.g) jVar2.f133100y.get(), (na0.e) jVar2.q0.get());
                    case 57:
                        return new lb0.n0();
                    case 58:
                        ViewController controller4 = jVar2.f133074c;
                        na0.g.Companion.getClass();
                        Intrinsics.checkNotNullParameter(controller4, "controller");
                        aVar = new na0.e(controller4);
                        return aVar;
                    case 59:
                        return new yc0.w();
                    case 60:
                        return new yc0.e0((yc0.r) jVar2.A.get(), new yc0.p());
                    case 61:
                        return new bd0.b((f01.a) jVar2.f133096w.get());
                    case 62:
                        return new ob0.n((f01.a) jVar2.f133096w.get());
                    case 63:
                        return new ob0.s((f01.a) jVar2.f133096w.get());
                    case 64:
                        return new ob0.p(jVar2.b());
                    default:
                        throw new AssertionError(i74);
                }
        }
    }
}
