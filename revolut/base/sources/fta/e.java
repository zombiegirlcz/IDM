package fta;

import android.app.Activity;
import b9.w2;
import bbg.f0;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.card_add_to_googlepay.impl.verification.confirmation.GooglePayConfirmationControllerContract$InputData;
import com.revolut.feature.card_add_to_googlepay.impl.verification.otp.card_security.GooglePayCardSecurityScreenContract$InputData;
import com.revolut.feature.card_add_to_googlepay.impl.verification.otp.location_mismatch.GooglePayOtpLocationMismatchScreenContract$InputData;
import com.revolut.feature.card_add_to_googlepay.impl.verification.otp.multiple.GooglePayMultipleOtpVerificationScreenContract$InputData;
import com.revolut.feature.card_add_to_googlepay.impl.verification.otp.single.GooglePayOtpVerificationScreenContract$InputData;
import com.revolut.feature.travel.hotels.impl.declaration.kompot.TravelHotelsBookingDetailsParams;
import com.revolut.feature.travel.hotels.impl.network.TravelHotelsService;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment.TravelHotelsBookingAmendmentDatesPickerScreenContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.TravelHotelsAmendmentConfirmationScreenContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.checkin_instructions.TravelHotelsCheckInInstructionsScreenContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.TravelHotelsCheckoutScreenContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.details.TravelHotelsPropertyDetailsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.balance.picker.api.balance_picker_v2.BalanceSelector$InputData;
import com.revolut.retail.feature.balance.picker.api.navigation.CurrencyChooserInputData;
import com.revolut.retail.feature.balance.picker.api.navigation.DualChooserContract$InputData;
import da3.j;
import dec.q;
import dyf.k;
import et6.h1;
import f60.z;
import fag.i0;
import g9g.a0;
import g9g.p;
import gcg.e0;
import hbg.j0;
import i9g.b0;
import i9g.h0;
import i9g.l;
import i9g.l0;
import i9g.n0;
import i9g.u;
import i9g.v;
import i9g.y;
import java.util.Optional;
import java.util.Set;
import kl.t1;
import kotlin.jvm.internal.Intrinsics;
import lu7.m0;
import n1j.d0;
import nd.o;
import nyb.p0;
import p7c.r;
import q7c.m;
import r10.t;
import r10.w;
import rp0.g1;
import rp0.x0;
import t80.e;
import vc.s;
import wbg.b1;
import wli.x;
import yji.n;
import zhm.a1;
import zxb.k0;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f137995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f137996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f137997c;
    public final Object d;

    public /* synthetic */ e(Object obj2, Object obj3, int i, int i2) {
        this.f137995a = i2;
        this.f137997c = obj2;
        this.d = obj3;
        this.f137996b = i;
    }

    private final Object a() {
        g9g.c cVar = (g9g.c) this.d;
        TravelHotelsAmendmentConfirmationScreenContract$InputData travelHotelsAmendmentConfirmationScreenContract$InputData = cVar.f141604a;
        g9g.d dVar = cVar.f141605b;
        g9g.d dVar2 = (g9g.d) this.f137997c;
        k0 k0Var = dVar2.i;
        r rVar = dVar2.F;
        int i = this.f137996b;
        switch (i) {
            case 0:
                Object extension = (a6c.f) cVar.f141606c.get();
                cbg.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                n nVar = (n) extension;
                s.k(nVar);
                return nVar;
            case 1:
                o8c.a factory = rVar.a();
                s.j(factory);
                cbg.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory, "factory");
                return factory.a();
            case 2:
                wbg.c extension2 = (wbg.c) cVar.e.get();
                Intrinsics.checkNotNullParameter(extension2, "extension");
                s.k(extension2);
                return extension2;
            case 3:
                sf0.h serverErrorParser = dVar2.f141645y.b();
                s.j(serverErrorParser);
                g81.a errorHandler = dVar2.E.c();
                s.j(errorHandler);
                wbg.b checkoutErrorDialogsFactory = new wbg.b();
                Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
                Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
                Intrinsics.checkNotNullParameter(checkoutErrorDialogsFactory, "checkoutErrorDialogsFactory");
                return new wbg.d(serverErrorParser, errorHandler, checkoutErrorDialogsFactory);
            case 4:
                Object extension3 = (mub.b) cVar.f141607g.get();
                Intrinsics.checkNotNullParameter(extension3, "extension");
                n nVar2 = (n) extension3;
                s.k(nVar2);
                return nVar2;
            case 5:
                return m0.z(k0Var.h());
            case 6:
                j jVar = dVar.v;
                l70.e eVar = dVar.e;
                ia3.r rVarB = jVar.b();
                m93.d dVarF = jVar.f();
                s.j(dVarF);
                mag.a aVar = new mag.a();
                dec.r rVar2 = new dec.r();
                dec.g gVar = new dec.g();
                dec.a aVar2 = new dec.a();
                l80.e eVarH = eVar.h();
                s.j(eVarH);
                ccg.g gVar2 = new ccg.g(rVarB, dVarF, aVar, new q(rVar2, gVar, aVar2, eVarH));
                mag.g gVar3 = new mag.g();
                l80.e eVarH2 = eVar.h();
                s.j(eVarH2);
                qd0.b bVarN = dVar.e.n();
                s.j(bVarN);
                ccg.i iVar = new ccg.i(eVarH2, new m9g.b(bVarN));
                l80.e eVarH3 = eVar.h();
                s.j(eVarH3);
                qd0.b bVarN2 = dVar.e.n();
                s.j(bVarN2);
                f0 f0Var = new f0(travelHotelsAmendmentConfirmationScreenContract$InputData, gVar2, gVar3, iVar, new ccg.j(eVarH3, new m9g.b(bVarN2), (p8g.c) dVar.g0.get()), new dbg.f(new dbg.g(new mag.b(), new fcg.b(), (p8g.c) dVar.g0.get()), new dbg.h(new fcg.b(), (p8g.c) dVar.g0.get()), new dbg.i(new fcg.b(), (p8g.c) dVar.g0.get())), new dbg.d());
                p8g.c cVar2 = (p8g.c) dVar2.g0.get();
                wbg.e eVar2 = (wbg.e) cVar.i.get();
                i9g.h hVar = (i9g.h) dVar2.q0.get();
                i9g.n nVar3 = (i9g.n) dVar2.p0.get();
                b0 b0Var = (b0) dVar2.m0.get();
                eub.i iVarE = k0Var.e();
                s.j(iVarE);
                l61.a aVarB = dVar2.f141629n.b();
                s.j(aVarB);
                k0c.a aVar3 = new k0c.a();
                a6c.f fVar = (a6c.f) cVar.f141606c.get();
                wj0.a aVarI = ((nj0.d) dVar2.f141617b).i();
                s.j(aVarI);
                return new com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.a(f0Var, cVar2, travelHotelsAmendmentConfirmationScreenContract$InputData, eVar2, hVar, nVar3, b0Var, iVarE, aVarB, aVar3, fVar, aVarI, new fcg.f(), (wbg.c) cVar.e.get(), (mub.b) cVar.f141607g.get());
            case 7:
                l93.f fVarJ = dVar.v.j();
                s.j(fVarJ);
                t tVar = new t(fVarJ, dVar.f141625j.b());
                mt8.d dVarB = dVar2.G.b();
                s.j(dVarB);
                sh3.a aVarA = dVar2.H.a();
                s.j(aVarA);
                q7c.g gVarE = rVar.e();
                wbg.a aVar4 = new wbg.a();
                m mVarD = rVar.d();
                s.j(mVarD);
                return new wbg.s(tVar, dVarB, aVarA, gVarE, aVar4, mVarD);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object b() {
        g9g.h hVar = (g9g.h) this.d;
        g9g.d dVar = (g9g.d) this.f137997c;
        pqi.a aVar = dVar.f141628m;
        l70.e eVar = dVar.e;
        int i = this.f137996b;
        if (i == 0) {
            return kxa.j.k((j60.a) hVar.f141682g.get());
        }
        if (i == 1) {
            return ehe.n.s((com.revolut.kompot.navigable.a) hVar.e.get(), (rp0.m) hVar.f.get());
        }
        if (i == 2) {
            return new rp0.m();
        }
        if (i != 3) {
            throw new AssertionError(i);
        }
        g9g.d dVar2 = hVar.d;
        l70.e eVar2 = dVar2.e;
        l80.e eVarH = eVar2.h();
        s.j(eVarH);
        qd0.b bVarN = eVar2.n();
        s.j(bVarN);
        m9g.b bVar = new m9g.b(bVarN);
        hag.a aVar2 = new hag.a();
        p8g.c cVar = (p8g.c) dVar2.g0.get();
        whf.n nVarB = dVar2.f141641w.b();
        s.j(nVarB);
        j0 j0Var = new j0(new hag.f(eVarH, bVar, aVar2, cVar, new iag.a(nVarB, hVar.f141679a), new iag.c(new cfg.b((p8g.c) dVar2.g0.get()))), hVar.b());
        TravelHotelsBookingDetailsParams travelHotelsBookingDetailsParams = hVar.f141680b;
        i9g.n nVar = (i9g.n) dVar.p0.get();
        p8g.c cVar2 = (p8g.c) dVar.g0.get();
        nyb.m0 m0VarG = dVar.i.g();
        s.j(m0VarG);
        y yVar = (y) dVar.A0.get();
        whf.b bVarA = dVar.f141641w.a();
        s.j(bVarA);
        l0 l0Var = (l0) dVar.H0.get();
        hyf.a aVarA = dVar.f141632p.a();
        s.j(aVarA);
        j61.b bVarC = dVar.f141643x.c();
        s.j(bVarC);
        l80.e eVarH2 = eVar.h();
        s.j(eVarH2);
        hbg.m0 m0Var = new hbg.m0();
        hag.c cVarB = hVar.b();
        j60.a aVar3 = (j60.a) hVar.f141682g.get();
        n8g.a aVar4 = (n8g.a) dVar.f141637s0.get();
        b0 b0Var = (b0) dVar.m0.get();
        x xVarD = ((s41.a) dVar.u).d();
        o oVarA = aVar.a();
        com.revolut.feature.rev_points.api.navigation.a aVar5 = hVar.f141681c;
        TravelHotelsService service = (TravelHotelsService) dVar.P.get();
        zk0.b fileSystemRepository = eVar.l();
        s.j(fileSystemRepository);
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(fileSystemRepository, "fileSystemRepository");
        w wVar = new w();
        wVar.f250865a = service;
        wVar.f250866b = fileSystemRepository;
        tqi.e eVarD = aVar.d();
        sf0.h hVarB = dVar.f141645y.b();
        s.j(hVarB);
        v60.e eVarA = dVar.z.a();
        s.j(eVarA);
        i9g.h hVar2 = (i9g.h) dVar.q0.get();
        f80.a aVarX = eVar.x();
        s.j(aVarX);
        return new com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.b(j0Var, travelHotelsBookingDetailsParams, nVar, cVar2, m0VarG, yVar, bVarA, l0Var, aVarA, bVarC, eVarH2, m0Var, cVarB, aVar3, aVar4, b0Var, xVarD, oVarA, aVar5, wVar, eVarD, hVarB, eVarA, hVar2, aVarX);
    }

    private final Object c() {
        g9g.o oVar = (g9g.o) this.d;
        g9g.d dVar = (g9g.d) this.f137997c;
        int i = this.f137996b;
        switch (i) {
            case 0:
                return kxa.j.k((j60.a) oVar.f.get());
            case 1:
                return ehe.n.s((com.revolut.kompot.navigable.a) oVar.d.get(), (rp0.m) oVar.e.get());
            case 2:
                return new rp0.m();
            case 3:
                odg.a extension = (odg.a) oVar.f141757h.get();
                bcg.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                s.k(extension);
                return extension;
            case 4:
                p8g.a aVar = (p8g.a) dVar.f141635r0.get();
                ffk.t tVarF = dVar.k.f();
                s.j(tVarF);
                return new odg.e(aVar, tVarF, (p8g.c) dVar.g0.get(), (j60.a) oVar.f.get());
            case 5:
                Object extension2 = (a6c.f) oVar.f141758j.get();
                bcg.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension2, "extension");
                n nVar = (n) extension2;
                s.k(nVar);
                return nVar;
            case 6:
                o8c.a factory = dVar.F.a();
                s.j(factory);
                bcg.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory, "factory");
                return factory.a();
            case 7:
                wbg.c extension3 = (wbg.c) oVar.f141759l.get();
                Intrinsics.checkNotNullParameter(extension3, "extension");
                s.k(extension3);
                return extension3;
            case 8:
                sf0.h serverErrorParser = dVar.f141645y.b();
                s.j(serverErrorParser);
                g81.a errorHandler = dVar.E.c();
                s.j(errorHandler);
                wbg.b checkoutErrorDialogsFactory = new wbg.b();
                Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
                Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
                Intrinsics.checkNotNullParameter(checkoutErrorDialogsFactory, "checkoutErrorDialogsFactory");
                return new wbg.d(serverErrorParser, errorHandler, checkoutErrorDialogsFactory);
            case 9:
                cli.n nVar2 = (cli.n) oVar.f141762p.get();
                TravelHotelsCheckoutScreenContract$InputData travelHotelsCheckoutScreenContract$InputData = oVar.f141753a;
                l70.e eVar = dVar.e;
                ore.b bVar = dVar.K;
                i90.b bVar2 = new i90.b();
                l lVar = (l) dVar.E0.get();
                pre.c cVarA = bVar.a();
                s.j(cVarA);
                p8g.c cVar = (p8g.c) dVar.g0.get();
                i9g.n nVar3 = (i9g.n) dVar.p0.get();
                eub.i iVarE = dVar.i.e();
                s.j(iVarE);
                p8g.b bVar3 = (p8g.b) dVar.f141640v0.get();
                wbg.e eVar2 = (wbg.e) oVar.f141763q.get();
                p8g.c travelHotelsFeatureInteractor = (p8g.c) oVar.f141755c.g0.get();
                Intrinsics.checkNotNullParameter(travelHotelsFeatureInteractor, "travelHotelsFeatureInteractor");
                akm.c cVar2 = new akm.c();
                cVar2.f6128a = ((v) travelHotelsFeatureInteractor).b();
                n0 n0Var = (n0) dVar.z0.get();
                y yVar = (y) dVar.A0.get();
                ffk.t tVarF2 = dVar.k.f();
                s.j(tVarF2);
                jgk.v vVar = oVar.f141754b;
                mre.c cVarB = bVar.b();
                s.j(cVarB);
                l61.a aVarB = dVar.f141629n.b();
                s.j(aVarB);
                return new com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.a(nVar2, travelHotelsCheckoutScreenContract$InputData, bVar2, lVar, cVarA, cVar, nVar3, iVarE, bVar3, eVar2, cVar2, n0Var, yVar, tVarF2, vVar, cVarB, aVarB, new k0c.a(), (b0) dVar.m0.get(), (odg.a) oVar.f141757h.get(), ((zc6.a) dVar.C).b(), (a6c.f) oVar.f141758j.get(), new zjh.i((txf.j) dVar.f141634r.f326330t.get()), new fcg.f(), (wbg.c) oVar.f141759l.get());
            case 10:
                g9g.d dVar2 = oVar.f141755c;
                g9g.d dVar3 = oVar.f141755c;
                l70.e eVar3 = dVar2.e;
                j jVar = dVar2.v;
                z80.b bVarS = eVar3.s();
                s.j(bVarS);
                jul.o oVarI = eVar3.i();
                fcg.a aVar2 = new fcg.a();
                ia3.r rVarB = jVar.b();
                n0 n0Var2 = (n0) dVar2.z0.get();
                mag.c cVar3 = (mag.c) oVar.f141761n.get();
                mag.g gVar = new mag.g();
                p8g.c cVar4 = (p8g.c) dVar2.g0.get();
                m93.d dVarF = jVar.f();
                s.j(dVarF);
                mag.a aVar3 = new mag.a();
                mag.b bVar4 = new mag.b();
                l80.e eVarH = eVar3.h();
                s.j(eVarH);
                lag.c cVar5 = new lag.c(bVarS, oVarI, aVar2, rVarB, n0Var2, cVar3, gVar, cVar4, dVarF, aVar3, bVar4, new ccg.i(eVarH, (m9g.b) oVar.o.get()));
                j jVar2 = dVar3.v;
                ia3.r rVarB2 = jVar2.b();
                m93.d dVarF2 = jVar2.f();
                s.j(dVarF2);
                mag.a aVar4 = new mag.a();
                dec.r rVar = new dec.r();
                dec.g gVar2 = new dec.g();
                dec.a aVar5 = new dec.a();
                l80.e eVarH2 = dVar3.e.h();
                s.j(eVarH2);
                ccg.g gVar3 = new ccg.g(rVarB2, dVarF2, aVar4, new q(rVar, gVar2, aVar5, eVarH2));
                ccg.e eVar4 = new ccg.e();
                dcg.b termsAndConditionsClauseMapper = new dcg.b();
                dyf.h exchangeTermsAndConditions = new dyf.h();
                p8g.c travelHotelsFeatureInteractor2 = (p8g.c) dVar3.g0.get();
                Intrinsics.checkNotNullParameter(termsAndConditionsClauseMapper, "termsAndConditionsClauseMapper");
                Intrinsics.checkNotNullParameter(exchangeTermsAndConditions, "exchangeTermsAndConditions");
                Intrinsics.checkNotNullParameter(travelHotelsFeatureInteractor2, "travelHotelsFeatureInteractor");
                r10.r rVar2 = new r10.r();
                rVar2.f250851a = termsAndConditionsClauseMapper;
                rVar2.f250852b = exchangeTermsAndConditions;
                rVar2.f250853c = travelHotelsFeatureInteractor2;
                l80.e eVarH3 = dVar3.e.h();
                s.j(eVarH3);
                return new b1(cVar5, gVar3, eVar4, rVar2, new ccg.j(eVarH3, (m9g.b) oVar.o.get(), (p8g.c) dVar3.g0.get()));
            case 11:
                return new mag.f(new mag.b());
            case 12:
                qd0.b bVarN = dVar.e.n();
                s.j(bVarN);
                return new m9g.b(bVarN);
            case 13:
                g9g.d dVar4 = oVar.f141755c;
                l93.f fVarJ = dVar4.v.j();
                s.j(fVarJ);
                t tVar = new t(fVarJ, dVar4.f141625j.b());
                nt8.a aVar6 = dVar.G;
                r rVar3 = dVar.F;
                mt8.d dVarB = aVar6.b();
                s.j(dVarB);
                sh3.a aVarA = dVar.H.a();
                s.j(aVarA);
                q7c.g gVarE = rVar3.e();
                wbg.a aVar7 = new wbg.a();
                m mVarD = rVar3.d();
                s.j(mVarD);
                return new wbg.s(tVar, dVarB, aVarA, gVarE, aVar7, mVarD);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object d() {
        g9g.d dVar = (g9g.d) this.f137997c;
        p pVar = (p) this.d;
        int i = this.f137996b;
        if (i == 0) {
            dyb.a extension = (dyb.a) pVar.f141773c.get();
            Intrinsics.checkNotNullParameter(extension, "extension");
            s.k(extension);
            return extension;
        }
        if (i == 1) {
            o7.b provider = dVar.i.d();
            Intrinsics.checkNotNullParameter(provider, "provider");
            dyb.a aVarE = provider.e();
            s.k(aVarE);
            return aVarE;
        }
        if (i == 2) {
            return new rcg.q(new rcg.s(pVar.f141771a, new qcg.c((p8g.c) pVar.f141772b.g0.get())), (u) dVar.f141639t0.get(), (g1) pVar.f.get(), (dyb.a) pVar.f141773c.get());
        }
        if (i != 3) {
            throw new AssertionError(i);
        }
        com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) pVar.e.get();
        Intrinsics.checkNotNullParameter(controller, "controller");
        return x0.a(g1.Companion, controller.D2());
    }

    private final Object e() {
        g9g.d dVar = (g9g.d) this.f137997c;
        g9g.q qVar = (g9g.q) this.d;
        int i = this.f137996b;
        if (i == 0) {
            dyb.a extension = (dyb.a) qVar.f141795b.get();
            Intrinsics.checkNotNullParameter(extension, "extension");
            s.k(extension);
            return extension;
        }
        if (i == 1) {
            o7.b provider = dVar.i.d();
            Intrinsics.checkNotNullParameter(provider, "provider");
            dyb.a aVarE = provider.e();
            s.k(aVarE);
            return aVarE;
        }
        if (i != 2) {
            if (i != 3) {
                throw new AssertionError(i);
            }
            com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) qVar.d.get();
            Intrinsics.checkNotNullParameter(controller, "controller");
            return x0.a(g1.Companion, controller.D2());
        }
        qcg.g gVar = new qcg.g(new qcg.i(new qcg.c((p8g.c) qVar.f141794a.g0.get())), new qcg.a());
        u uVar = (u) dVar.f141639t0.get();
        g1 g1Var = (g1) qVar.e.get();
        dyb.a aVar = (dyb.a) qVar.f141795b.get();
        a29.b bVarA = dVar.A.a();
        s.j(bVarA);
        return new ocg.r(gVar, uVar, g1Var, aVar, bVarA);
    }

    private final Object f() {
        g9g.s sVar = (g9g.s) this.d;
        g9g.d dVar = sVar.f141806a;
        g9g.d dVar2 = (g9g.d) this.f137997c;
        int i = this.f137996b;
        if (i != 0) {
            if (i == 1) {
                return new neg.v(new meg.i(dVar.f141628m.g()), new peg.a(new meg.i(dVar.f141628m.g())), new peg.c());
            }
            throw new AssertionError(i);
        }
        cli.n nVar = (cli.n) sVar.f141807b.get();
        i9g.c cVarC = dVar2.c();
        h0 h0Var = (h0) dVar2.f141631o0.get();
        meg.h hVar = new meg.h();
        p8g.c cVar = (p8g.c) dVar2.g0.get();
        t1 t1Var = new t1(new meg.h());
        l80.e eVarH = dVar2.e.h();
        s.j(eVarH);
        p8g.d dVar3 = (p8g.d) dVar2.l0.get();
        g81.a aVarC = dVar2.E.c();
        s.j(aVarC);
        return new com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.listing.c(nVar, cVarC, h0Var, hVar, cVar, t1Var, eVarH, dVar3, aVarC);
    }

    private final Object g() {
        g9g.u uVar = (g9g.u) this.d;
        g9g.d dVar = (g9g.d) this.f137997c;
        int i = this.f137996b;
        switch (i) {
            case 0:
                fd6.a aVar = (fd6.a) uVar.f141820c.get();
                va.g.t(aVar);
                return aVar;
            case 1:
                return va.g.s(((zc6.a) dVar.C).d(), (xc6.a) uVar.f141819b.get());
            case 2:
                return r6.b.k((zc6.a) dVar.C, "factory");
            case 3:
                Object extension = (icg.a) uVar.e.get();
                hcg.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                n nVar = (n) extension;
                s.k(nVar);
                return nVar;
            case 4:
                ayf.n nVarA = dVar.f141634r.a();
                s.j(nVarA);
                return new icg.d(nVarA, (i0) dVar.B0.get());
            case 5:
                Object extension2 = (kxf.a) uVar.f141821g.get();
                hcg.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension2, "extension");
                n nVar2 = (n) extension2;
                s.k(nVar2);
                return nVar2;
            case 6:
                z58.c cVar = dVar.D.e;
                he2.b factory = new he2.b(cVar);
                hcg.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory, "factory");
                Object obj2 = cVar.get();
                Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                kxf.a aVar2 = (kxf.a) obj2;
                s.k(aVar2);
                return aVar2;
            case 7:
                Object extension3 = (jcg.a) uVar.i.get();
                hcg.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension3, "extension");
                n nVar3 = (n) extension3;
                s.k(nVar3);
                return nVar3;
            case 8:
                return new jcg.c((p8g.b) dVar.f141640v0.get(), (p8g.d) dVar.l0.get(), (h0) dVar.f141631o0.get(), new j9g.t());
            case 9:
                dyb.a extension4 = (dyb.a) uVar.k.get();
                hcg.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension4, "extension");
                s.k(extension4);
                return extension4;
            case 10:
                o7.b provider = dVar.i.d();
                hcg.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(provider, "provider");
                dyb.a aVarE = provider.e();
                s.k(aVarE);
                return aVarE;
            case 11:
                return va.g.u((xc6.a) uVar.f141819b.get());
            case 12:
                g9g.d dVar2 = uVar.f141818a;
                kcg.h hVar = new kcg.h((p8g.c) dVar2.g0.get());
                gte.a aVarB = dVar2.f141622g.b();
                s.j(aVarB);
                avk.i0 i0Var = new avk.i0(hVar, new kcg.f(aVarB), new k(new dyf.c()), new kcg.b((q8g.b) dVar2.f141644x0.get()), new kcg.m((p8g.c) dVar2.g0.get()), new kcg.d((p8g.c) dVar2.g0.get()), new kcg.e(), new kcg.k((p8g.c) dVar2.g0.get()), ((zc6.a) dVar2.C).c(), new kcg.i());
                ayf.p pVar = (ayf.p) dVar.f141634r.f326327q.get();
                s.j(pVar);
                h0 h0Var = (h0) dVar.f141631o0.get();
                b0 b0Var = (b0) dVar.m0.get();
                wsg.n nVarB = dVar.f141625j.b();
                icg.a aVar3 = (icg.a) uVar.e.get();
                kxf.a aVar4 = (kxf.a) uVar.f141821g.get();
                i9g.o oVar = (i9g.o) dVar.f141642w0.get();
                jcg.a aVar5 = (jcg.a) uVar.i.get();
                p8g.b bVar = (p8g.b) dVar.f141640v0.get();
                dyb.a aVar6 = (dyb.a) uVar.k.get();
                fag.v vVar = new fag.v((TravelHotelsService) dVar.P.get(), (ne0.j) dVar.R.get(), (ue0.c) dVar.f141621e0.get());
                fag.y yVar = new fag.y((ue0.c) dVar.f141621e0.get());
                p8g.c cVar2 = (p8g.c) dVar.g0.get();
                nyb.j jVarB = dVar.i.b();
                s.j(jVarB);
                return new e0(i0Var, pVar, h0Var, b0Var, nVarB, aVar3, aVar4, oVar, aVar5, bVar, aVar6, vVar, yVar, cVar2, jVarB, ((zc6.a) dVar.C).b(), dVar.f141628m.g());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object h() {
        g9g.d dVar = (g9g.d) this.f137997c;
        g9g.y yVar = (g9g.y) this.d;
        int i = this.f137996b;
        switch (i) {
            case 0:
                return kxa.j.k((j60.a) yVar.e.get());
            case 1:
                return ehe.n.s((com.revolut.kompot.navigable.a) yVar.f141850c.get(), (rp0.m) yVar.d.get());
            case 2:
                return new rp0.m();
            case 3:
                odg.a extension = (odg.a) yVar.f141851g.get();
                qdg.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                s.k(extension);
                return extension;
            case 4:
                p8g.a aVar = (p8g.a) dVar.f141635r0.get();
                ffk.t tVarF = dVar.k.f();
                s.j(tVarF);
                return new odg.e(aVar, tVarF, (p8g.c) dVar.g0.get(), (j60.a) yVar.e.get());
            case 5:
                cli.n nVar = (cli.n) yVar.f141856n.get();
                TravelHotelsPropertyDetailsScreenContract$InputData travelHotelsPropertyDetailsScreenContract$InputData = yVar.f141848a;
                b0 b0Var = (b0) dVar.m0.get();
                h0 h0Var = (h0) dVar.f141631o0.get();
                y yVar2 = (y) dVar.A0.get();
                l lVar = (l) dVar.E0.get();
                p8g.b bVar = (p8g.b) dVar.f141640v0.get();
                xcg.b bVar2 = (xcg.b) yVar.o.get();
                p8g.c cVar = (p8g.c) dVar.g0.get();
                p0 p0Var = (p0) dVar.i.Z.get();
                s.j(p0Var);
                u uVar = (u) dVar.f141639t0.get();
                ang.f fVarE = dVar.f141629n.e();
                j60.a aVar2 = (j60.a) yVar.e.get();
                pqi.a aVar3 = yVar.f141849b.f141628m;
                return new pdg.i0(nVar, travelHotelsPropertyDetailsScreenContract$InputData, b0Var, h0Var, yVar2, lVar, bVar, bVar2, cVar, p0Var, uVar, fVarE, aVar2, new pdg.m0(aVar3.g(), aVar3.a()), (odg.a) yVar.f141851g.get(), new fcg.e());
            case 6:
                g9g.d dVar2 = yVar.f141849b;
                return new com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.details.b(new rdg.f(dVar2.e.i(), (c90.c) yVar.i.get(), (p8g.c) dVar2.g0.get(), (jag.a) yVar.k.get(), (rag.c) yVar.f141854l.get()), (rdg.a) yVar.f141855m.get(), new pdg.b());
            case 7:
                com.revolut.kompot.navigable.a screen = (com.revolut.kompot.navigable.a) yVar.f141850c.get();
                qdg.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(screen, "screen");
                return new c90.c(screen.m2());
            case 8:
                return new jag.d((m9g.b) yVar.f141853j.get());
            case 9:
                qd0.b bVarN = dVar.e.n();
                s.j(bVarN);
                return new m9g.b(bVarN);
            case 10:
                l80.e eVarH = dVar.e.h();
                s.j(eVarH);
                return new rag.d(eVarH);
            case 11:
                return new rdg.b();
            case 12:
                l80.e eVarH2 = dVar.e.h();
                s.j(eVarH2);
                return new xcg.d(eVarH2);
            default:
                throw new AssertionError(i);
        }
    }

    @Override // phm.a
    public final Object get() {
        Object xVar;
        switch (this.f137995a) {
            case 0:
                b bVar = (b) this.f137997c;
                f fVar = (f) this.d;
                int i = this.f137996b;
                if (i == 0) {
                    return new mta.j(new mta.k(new kdh.b((c90.c) fVar.f138000c.get()), new ota.a(), new ota.b()), fVar.f137999b, bVar.f.d(), bVar.f137979j.a());
                }
                if (i != 1) {
                    throw new AssertionError(i);
                }
                ViewController controller = fVar.f137998a;
                pta.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller, "controller");
                return new c90.c(controller.m2());
            case 1:
                j jVar = ((fw2.d) this.f137997c).f138524c;
                fw2.f fVar2 = (fw2.f) this.d;
                int i2 = this.f137996b;
                if (i2 == 0) {
                    cli.n nVar = (cli.n) fVar2.f138539c.get();
                    GooglePayCardSecurityScreenContract$InputData googlePayCardSecurityScreenContract$InputData = fVar2.f138537a;
                    l93.f fVarJ = jVar.j();
                    s.j(fVarJ);
                    ha3.f fVarD = jVar.d();
                    s.j(fVarD);
                    return new qw2.i(nVar, googlePayCardSecurityScreenContract$InputData, fVarJ, fVarD, (c90.c) fVar2.d.get());
                }
                if (i2 == 1) {
                    m93.a aVarA = jVar.a();
                    s.j(aVarA);
                    l93.f fVarJ2 = jVar.j();
                    s.j(fVarJ2);
                    return new qw2.n(aVarA, fVarJ2);
                }
                if (i2 != 2) {
                    throw new AssertionError(i2);
                }
                ViewController controller2 = fVar2.f138538b;
                rw2.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller2, "controller");
                return new c90.c(controller2.m2());
            case 2:
                fw2.g gVar = (fw2.g) this.d;
                fw2.d dVar = (fw2.d) this.f137997c;
                j jVar2 = dVar.f138524c;
                int i3 = this.f137996b;
                if (i3 == 0) {
                    cli.n nVar2 = (cli.n) gVar.f138542c.get();
                    GooglePayConfirmationControllerContract$InputData googlePayConfirmationControllerContract$InputData = gVar.f138540a;
                    l93.f fVarJ3 = jVar2.j();
                    s.j(fVarJ3);
                    gw2.c cVar = (gw2.c) dVar.o.get();
                    ha3.f fVarD2 = jVar2.d();
                    s.j(fVarD2);
                    return new com.revolut.feature.card_add_to_googlepay.impl.verification.confirmation.e(nVar2, googlePayConfirmationControllerContract$InputData, fVarJ3, cVar, fVarD2, (c90.c) gVar.d.get());
                }
                if (i3 == 1) {
                    m93.a aVarA2 = jVar2.a();
                    s.j(aVarA2);
                    l93.f fVarJ4 = jVar2.j();
                    s.j(fVarJ4);
                    return new ow2.n(aVarA2, fVarJ4);
                }
                if (i3 != 2) {
                    throw new AssertionError(i3);
                }
                ViewController controller3 = gVar.f138541b;
                pw2.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller3, "controller");
                return new c90.c(controller3.m2());
            case 3:
                fw2.i iVar = (fw2.i) this.d;
                fw2.d dVar2 = (fw2.d) this.f137997c;
                l70.e eVar = dVar2.e;
                ite.a aVar = dVar2.d;
                j jVar3 = dVar2.f138524c;
                int i5 = this.f137996b;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new AssertionError(i5);
                    }
                    ia3.r rVarB = jVar3.b();
                    m93.g gVarI = jVar3.i();
                    s.j(gVarI);
                    gte.a aVarB = aVar.b();
                    s.j(aVarB);
                    return new uw2.p(rVarB, gVarI, aVarB);
                }
                cli.n nVar3 = (cli.n) iVar.f138547b.get();
                GooglePayMultipleOtpVerificationScreenContract$InputData googlePayMultipleOtpVerificationScreenContract$InputData = iVar.f138546a;
                l93.f fVarJ5 = jVar3.j();
                s.j(fVarJ5);
                c70.a aVarZ = eVar.z();
                s.j(aVarZ);
                r70.c cVarA = eVar.A();
                s.j(cVarA);
                gte.a aVarB2 = aVar.b();
                s.j(aVarB2);
                return new uw2.g(nVar3, googlePayMultipleOtpVerificationScreenContract$InputData, fVarJ5, aVarZ, cVarA, aVarB2);
            case 4:
                fw2.d dVar3 = (fw2.d) this.f137997c;
                fw2.j jVar4 = (fw2.j) this.d;
                int i6 = this.f137996b;
                if (i6 != 0) {
                    if (i6 == 1) {
                        return new sw2.n();
                    }
                    throw new AssertionError(i6);
                }
                cli.n nVar4 = (cli.n) jVar4.f138550b.get();
                GooglePayOtpLocationMismatchScreenContract$InputData googlePayOtpLocationMismatchScreenContract$InputData = jVar4.f138549a;
                l93.f fVarJ6 = dVar3.f138524c.j();
                s.j(fVarJ6);
                w39.b bVarA = dVar3.f.a();
                s.j(bVarA);
                return new sw2.h(nVar4, googlePayOtpLocationMismatchScreenContract$InputData, fVarJ6, bVarA);
            case 5:
                fw2.k kVar = (fw2.k) this.d;
                fw2.d dVar4 = (fw2.d) this.f137997c;
                l70.e eVar2 = dVar4.e;
                j jVar5 = dVar4.f138524c;
                int i21 = this.f137996b;
                if (i21 != 0) {
                    if (i21 == 1) {
                        m93.a aVarA3 = jVar5.a();
                        s.j(aVarA3);
                        l93.f fVarJ7 = jVar5.j();
                        s.j(fVarJ7);
                        return new ww2.o(aVarA3, fVarJ7);
                    }
                    if (i21 != 2) {
                        throw new AssertionError(i21);
                    }
                    ViewController controller4 = kVar.f138553b;
                    xw2.a.Companion.getClass();
                    Intrinsics.checkNotNullParameter(controller4, "controller");
                    return new c90.c(controller4.m2());
                }
                cli.n nVar5 = (cli.n) kVar.f138554c.get();
                GooglePayOtpVerificationScreenContract$InputData googlePayOtpVerificationScreenContract$InputData = kVar.f138552a;
                l93.f fVarJ8 = jVar5.j();
                s.j(fVarJ8);
                ha3.f fVarD3 = jVar5.d();
                s.j(fVarD3);
                c90.c cVar2 = (c90.c) kVar.d.get();
                c70.a aVarZ2 = eVar2.z();
                s.j(aVarZ2);
                r70.c cVarA2 = eVar2.A();
                s.j(cVarA2);
                return new ww2.i(nVar5, googlePayOtpVerificationScreenContract$InputData, fVarJ8, fVarD3, cVar2, aVarZ2, cVarA2);
            case 6:
                g2j.f fVar3 = (g2j.f) this.f137997c;
                zc6.b bVar2 = fVar3.C;
                g2j.e eVar3 = (g2j.e) this.d;
                BalanceSelector$InputData balanceSelector$InputData = eVar3.f140082a;
                g2j.f fVar4 = eVar3.d;
                int i22 = this.f137996b;
                if (i22 == 0) {
                    fd6.a aVar2 = (fd6.a) eVar3.f.get();
                    va.g.t(aVar2);
                    return aVar2;
                }
                if (i22 == 1) {
                    return va.g.s(((zc6.a) bVar2).d(), (xc6.a) eVar3.e.get());
                }
                if (i22 == 2) {
                    return r6.b.k((zc6.a) bVar2, "factory");
                }
                if (i22 == 3) {
                    return va.g.u((xc6.a) eVar3.e.get());
                }
                if (i22 != 4) {
                    if (i22 != 5) {
                        throw new AssertionError(i22);
                    }
                    ViewController viewController = eVar3.f140084c;
                    q1j.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(viewController, "viewController");
                    return new f01.c(viewController.m2());
                }
                BalanceSelector$InputData balanceSelector$InputData2 = eVar3.f140082a;
                smd.s sVar = new smd.s(fVar4.G.h(), new t1j.b(fVar4.c()));
                p1j.e eVar4 = new p1j.e(balanceSelector$InputData, eVar3.f140083b, fVar4.D.a());
                n1j.e eVarA = fVar3.a();
                s1j.b bVar3 = new s1j.b(fVar4.f140101t.f());
                p1j.b bVar4 = new p1j.b(fVar4.d.e(), balanceSelector$InputData);
                xmg.a aVar3 = fVar4.d;
                ang.f fVarE = aVar3.e();
                ybl.l lVarF = fVar4.f140101t.f();
                aah.i iVarD = ((u8h.b) fVar4.E).d();
                s.j(iVarD);
                w1j.f fVar5 = new w1j.f(lVarF, fp8.c.A(iVarD));
                l61.a aVarB3 = aVar3.b();
                s.j(aVarB3);
                djb.n nVarA = fVar4.k.a();
                s.j(nVarA);
                gte.a aVarB4 = fVar4.f140098q.b();
                s.j(aVarB4);
                lal.a aVar4 = new lal.a(fVarE, fVar5, new w1j.c(aVarB3, nVarA, aVarB4), new p1j.g(balanceSelector$InputData));
                ogm.i iVar2 = new ogm.i(((blb.e) fVar4.A).e());
                gte.a aVarB5 = fVar4.f140098q.b();
                s.j(aVarB5);
                oh5.b bVar5 = (oh5.b) fVar4.F.f152254a.f215374g.get();
                s.j(bVar5);
                p1j.i iVar3 = new p1j.i(iVar2, aVarB5, bVar5, balanceSelector$InputData);
                z1j.a aVar5 = new z1j.a();
                p1j.m mVar = new p1j.m(new p1j.o(fVar4.f140093j.g(), balanceSelector$InputData), (f01.a) eVar3.i.get());
                tsk.t tVar = new tsk.t(((zc6.a) fVar4.C).b(), new nd.l(new y1j.c()));
                vfg.p pVarA = fVar3.z.a();
                p1j.l lVar = new p1j.l(fVar4.f140089b.c());
                os2.g gVar2 = new os2.g(fVar3.H.f215375a.a());
                v1j.a tradingBalanceDisabledInfoProvider = new v1j.a();
                Intrinsics.checkNotNullParameter(tradingBalanceDisabledInfoProvider, "tradingBalanceDisabledInfoProvider");
                return new com.revolut.retail.feature.balance.picker.impl.balance_picker_v2.c(balanceSelector$InputData2, sVar, eVar4, eVarA, bVar3, bVar4, aVar4, iVar3, aVar5, mVar, tVar, pVarA, lVar, gVar2, new p1j.d(), new d0(fVar4.e(), new r1j.a(), new u1j.c(), ((zc6.a) fVar4.C).c()));
            case 7:
                g2j.f fVar6 = (g2j.f) this.f137997c;
                g2j.i iVar4 = (g2j.i) this.d;
                int i32 = this.f137996b;
                if (i32 == 0) {
                    n60.a aVar6 = (n60.a) iVar4.f140111c.get();
                    o5k.i.l(aVar6);
                    return aVar6;
                }
                if (i32 == 1) {
                    return o5k.i.q((com.revolut.kompot.navigable.a) iVar4.f140110b.get());
                }
                if (i32 != 2) {
                    if (i32 == 3) {
                        return new e2j.q(iVar4.f140109a);
                    }
                    throw new AssertionError(i32);
                }
                cli.n nVar6 = (cli.n) iVar4.e.get();
                CurrencyChooserInputData currencyChooserInputData = iVar4.f140109a;
                t70.b bVarG = fVar6.f140092h.g();
                s.j(bVarG);
                fk3.a aVarA4 = fVar6.I.a();
                s.j(aVarA4);
                wsg.n nVarB = fVar6.e.b();
                h1 h1VarN = fVar6.f140091g.n();
                s.j(h1VarN);
                return new e2j.o(nVar6, currencyChooserInputData, bVarG, aVarA4, nVarB, h1VarN, (n60.a) iVar4.f140111c.get());
            case 8:
                g2j.f fVar7 = (g2j.f) this.f137997c;
                zc6.b bVar6 = fVar7.C;
                g2j.p pVar = (g2j.p) this.d;
                od0.i iVar5 = pVar.f140128c;
                DualChooserContract$InputData dualChooserContract$InputData = pVar.f140127b;
                g2j.f fVar8 = pVar.d;
                int i33 = this.f137996b;
                if (i33 == 0) {
                    fd6.a aVar7 = (fd6.a) pVar.f.get();
                    va.g.t(aVar7);
                    return aVar7;
                }
                if (i33 == 1) {
                    return va.g.s(((zc6.a) bVar6).d(), (xc6.a) pVar.e.get());
                }
                if (i33 == 2) {
                    return r6.b.k((zc6.a) bVar6, "factory");
                }
                if (i33 == 3) {
                    return va.g.u((xc6.a) pVar.e.get());
                }
                if (i33 != 4) {
                    throw new AssertionError(i33);
                }
                DualChooserContract$InputData dualChooserContract$InputData2 = pVar.f140127b;
                ang.f fVarE2 = fVar7.d.e();
                wsg.n nVarB2 = fVar8.e.b();
                h1 h1VarN2 = fVar8.f140091g.n();
                s.j(h1VarN2);
                w wVar = new w(nVarB2, h1VarN2);
                DualChooserContract$InputData dualChooserContract$InputData3 = pVar.f140127b;
                m2j.q qVarD = fVar8.d();
                i2j.a aVar8 = new i2j.a(dualChooserContract$InputData, iVar5, fVar8.D.a());
                l61.a aVarB6 = fVar8.d.b();
                s.j(aVarB6);
                h30.q qVar = new h30.q(dualChooserContract$InputData3, qVarD, aVar8, aVarB6, new k2j.a());
                h2j.w wVar2 = new h2j.w(fVar8.e(), new u1j.c(), ((zc6.a) fVar8.C).c(), dualChooserContract$InputData);
                n1j.e eVarA2 = fVar7.a();
                vfg.p pVarA2 = fVar7.z.a();
                s1j.b bVar7 = new s1j.b(fVar8.f140101t.f());
                xmg.a aVar9 = fVar8.d;
                ang.f fVarE3 = aVar9.e();
                ybl.l lVarF2 = fVar8.f140101t.f();
                aah.i iVarD2 = ((u8h.b) fVar8.E).d();
                s.j(iVarD2);
                w1j.f fVar9 = new w1j.f(lVarF2, fp8.c.A(iVarD2));
                l61.a aVarB7 = aVar9.b();
                s.j(aVarB7);
                djb.n nVarA2 = fVar8.k.a();
                s.j(nVarA2);
                gte.a aVarB8 = fVar8.f140098q.b();
                s.j(aVarB8);
                fn2.c cVar3 = new fn2.c(new p2j.c(fVarE3, fVar9, new w1j.c(aVarB7, nVarA2, aVarB8)));
                ogm.i iVar6 = new ogm.i(((blb.e) fVar8.A).e());
                gte.a aVarB9 = fVar8.f140098q.b();
                s.j(aVarB9);
                oh5.b bVar8 = (oh5.b) fVar8.F.f152254a.f215374g.get();
                s.j(bVar8);
                return new com.revolut.retail.feature.balance.picker.impl.new_picker.dual.a(dualChooserContract$InputData2, fVarE2, wVar, qVar, wVar2, eVarA2, pVarA2, bVar7, cVar3, new i2j.c(dualChooserContract$InputData, iVar6, aVarB9, bVar8), new z1j.a(), new smd.s(fVar8.G.h(), new t1j.b(fVar8.c())), new i2j.a(dualChooserContract$InputData, iVar5, fVar8.D.a()), new tsk.t(((zc6.a) fVar8.C).b(), new nd.l(new y1j.c())), new os2.g(fVar7.H.f215375a.a()));
            case 9:
                g2j.f fVar10 = (g2j.f) this.f137997c;
                g2j.p pVar2 = (g2j.p) this.d;
                od0.i iVar7 = pVar2.f140128c;
                DualChooserContract$InputData dualChooserContract$InputData4 = pVar2.f140127b;
                g2j.f fVar11 = pVar2.d;
                int i43 = this.f137996b;
                if (i43 == 0) {
                    fd6.a aVar10 = (fd6.a) pVar2.f.get();
                    va.g.t(aVar10);
                    return aVar10;
                }
                if (i43 == 1) {
                    return va.g.s(((zc6.a) fVar10.C).d(), (xc6.a) pVar2.e.get());
                }
                if (i43 == 2) {
                    return r6.b.k((zc6.a) fVar10.C, "factory");
                }
                if (i43 == 3) {
                    return va.g.u((xc6.a) pVar2.e.get());
                }
                if (i43 != 4) {
                    throw new AssertionError(i43);
                }
                DualChooserContract$InputData dualChooserContract$InputData5 = pVar2.f140127b;
                ang.f fVarE4 = fVar10.d.e();
                wsg.n nVarB3 = fVar11.e.b();
                h1 h1VarN3 = fVar11.f140091g.n();
                s.j(h1VarN3);
                w wVar3 = new w(nVarB3, h1VarN3);
                DualChooserContract$InputData dualChooserContract$InputData6 = pVar2.f140127b;
                m2j.q qVarD2 = fVar11.d();
                i2j.a aVar11 = new i2j.a(dualChooserContract$InputData4, iVar7, fVar11.D.a());
                l61.a aVarB10 = fVar11.d.b();
                s.j(aVarB10);
                h30.q qVar2 = new h30.q(dualChooserContract$InputData6, qVarD2, aVar11, aVarB10, new k2j.a());
                h2j.w wVar4 = new h2j.w(fVar11.e(), new u1j.c(), ((zc6.a) fVar11.C).c(), dualChooserContract$InputData4);
                n1j.e eVarA3 = fVar10.a();
                vfg.p pVarA3 = fVar10.z.a();
                s1j.b bVar9 = new s1j.b(fVar11.f140101t.f());
                ang.f fVarE5 = fVar11.d.e();
                ybl.l lVarF3 = fVar11.f140101t.f();
                aah.i iVarD3 = ((u8h.b) fVar11.E).d();
                s.j(iVarD3);
                w1j.f fVar12 = new w1j.f(lVarF3, fp8.c.A(iVarD3));
                l61.a aVarB11 = fVar11.d.b();
                s.j(aVarB11);
                djb.n nVarA3 = fVar11.k.a();
                s.j(nVarA3);
                gte.a aVarB12 = fVar11.f140098q.b();
                s.j(aVarB12);
                fn2.c cVar4 = new fn2.c(new p2j.c(fVarE5, fVar12, new w1j.c(aVarB11, nVarA3, aVarB12)));
                ogm.i iVar8 = new ogm.i(((blb.e) fVar11.A).e());
                gte.a aVarB13 = fVar11.f140098q.b();
                s.j(aVarB13);
                oh5.b bVar10 = (oh5.b) fVar11.F.f152254a.f215374g.get();
                s.j(bVar10);
                return new com.revolut.retail.feature.balance.picker.impl.new_picker.dual.a(dualChooserContract$InputData5, fVarE4, wVar3, qVar2, wVar4, eVarA3, pVarA3, bVar9, cVar4, new i2j.c(dualChooserContract$InputData4, iVar8, aVarB13, bVar10), new z1j.a(), new smd.s(fVar11.G.h(), new t1j.b(fVar11.c())), new i2j.a(dualChooserContract$InputData4, iVar7, fVar11.D.a()), new tsk.t(((zc6.a) fVar11.C).b(), new nd.l(new y1j.c())), new os2.g(fVar10.H.f215375a.a()));
            case 10:
                g92.e eVar5 = (g92.e) this.f137997c;
                j jVar6 = eVar5.f141444b;
                int i59 = this.f137996b;
                if (i59 != 0) {
                    if (i59 != 1) {
                        throw new AssertionError(i59);
                    }
                    m93.g gVarI2 = jVar6.i();
                    s.j(gVarI2);
                    return new com.revolut.feature.apm.multibanco.impl.via_verde.ui.details.a(gVarI2);
                }
                l93.f fVarJ9 = jVar6.j();
                s.j(fVarJ9);
                c70.a aVarZ3 = eVar5.f141445c.z();
                s.j(aVarZ3);
                g92.a aVar12 = (g92.a) this.d;
                return new com.revolut.feature.apm.multibanco.impl.via_verde.ui.details.b(fVarJ9, aVarZ3, aVar12.f141428a, (cli.n) aVar12.f141429b.get());
            case 11:
                g92.b bVar11 = (g92.b) this.d;
                int i66 = this.f137996b;
                if (i66 == 0) {
                    n60.a aVar13 = (n60.a) bVar11.f141433c.get();
                    o5k.i.l(aVar13);
                    return aVar13;
                }
                if (i66 == 1) {
                    return o5k.i.q((com.revolut.kompot.navigable.a) bVar11.f141432b.get());
                }
                if (i66 == 2) {
                    n60.b bVar12 = (n60.b) bVar11.e.get();
                    o5k.i.m(bVar12);
                    return bVar12;
                }
                if (i66 == 3) {
                    return o5k.i.r((com.revolut.kompot.navigable.a) bVar11.f141432b.get());
                }
                if (i66 == 4) {
                    return new o92.h((f92.g) ((g92.e) this.f137997c).f141446g.get(), bVar11.f141431a, (cli.n) bVar11.f141434g.get());
                }
                if (i66 == 5) {
                    return new o92.i();
                }
                throw new AssertionError(i66);
            case 12:
                int i74 = this.f137996b;
                if (i74 == 0) {
                    return new com.revolut.feature.apm.multibanco.impl.via_verde.ui.list.a((f92.g) ((g92.e) this.f137997c).f141446g.get(), (cli.n) ((g92.c) this.d).f141436a.get());
                }
                if (i74 == 1) {
                    return new at.r(new e92.b());
                }
                throw new AssertionError(i74);
            case 13:
                g92.d dVar5 = (g92.d) this.d;
                int i92 = this.f137996b;
                if (i92 == 0) {
                    n60.a aVar14 = (n60.a) dVar5.f141440c.get();
                    o5k.i.l(aVar14);
                    return aVar14;
                }
                if (i92 == 1) {
                    return o5k.i.q((com.revolut.kompot.navigable.a) dVar5.f141439b.get());
                }
                if (i92 == 2) {
                    n60.b bVar13 = (n60.b) dVar5.e.get();
                    o5k.i.m(bVar13);
                    return bVar13;
                }
                if (i92 == 3) {
                    return o5k.i.r((com.revolut.kompot.navigable.a) dVar5.f141439b.get());
                }
                if (i92 == 4) {
                    return new s92.k((f92.g) ((g92.e) this.f137997c).f141446g.get(), dVar5.f141438a, (cli.n) dVar5.f141441g.get());
                }
                if (i92 == 5) {
                    return new s92.l();
                }
                throw new AssertionError(i92);
            case 14:
                g97.a aVar15 = (g97.a) this.f137997c;
                g97.b bVar14 = (g97.b) this.d;
                int i96 = this.f137996b;
                switch (i96) {
                    case 0:
                        return f0k.d.p((e60.a) bVar14.f141473l.get());
                    case 1:
                        com.revolut.kompot.navigable.a aVar16 = (com.revolut.kompot.navigable.a) bVar14.d.get();
                        g60.a aVarA5 = f60.v.a((com.revolut.kompot.navigable.a) bVar14.d.get());
                        Activity activityA = f60.t.a((com.revolut.kompot.navigable.a) bVar14.d.get());
                        t80.g gVar3 = (t80.g) bVar14.e.get();
                        com.revolut.kompot.navigable.a aVar17 = (com.revolut.kompot.navigable.a) bVar14.d.get();
                        f60.y.a(aVar17);
                        d4m.a aVarA6 = e4m.b.a(bVar14.f);
                        nli.a aVar18 = new nli.a((t80.c) bVar14.f141470g.get(), f60.t.a((com.revolut.kompot.navigable.a) bVar14.d.get()));
                        t80.g gVar4 = (t80.g) bVar14.e.get();
                        zk0.b bVarL = bVar14.f141468b.f141463a.l();
                        s.j(bVarL);
                        return v1.c.q(aVar16, new t80.v(aVarA5, activityA, gVar3, aVar17, aVarA6, aVar18, new oli.c(gVar4, bVarL, new nli.a((t80.c) bVar14.f141470g.get(), f60.t.a((com.revolut.kompot.navigable.a) bVar14.d.get())), f60.v.a((com.revolut.kompot.navigable.a) bVar14.d.get()), bVar14.c()), new oli.g(f60.u.a(f60.t.a((com.revolut.kompot.navigable.a) bVar14.d.get())), v1.c.e((com.revolut.kompot.navigable.a) bVar14.d.get()), new ami.n(e4m.b.a(bVar14.f141471h), 1), e4m.b.a(bVar14.f), (t80.g) bVar14.e.get(), new nli.a((t80.c) bVar14.f141470g.get(), f60.t.a((com.revolut.kompot.navigable.a) bVar14.d.get())), new i90.b(), bVar14.b(), bVar14.c()), bVar14.c()), f60.x.a(), (rp0.m) bVar14.i.get(), (e60.t) bVar14.k.get());
                    case 2:
                        f80.a aVarX = aVar15.f141463a.x();
                        s.j(aVarX);
                        xVar = new t80.x(aVarX, new i90.b());
                        break;
                    case 3:
                        com.revolut.kompot.navigable.a aVar19 = (com.revolut.kompot.navigable.a) bVar14.d.get();
                        f60.y.a(aVar19);
                        return pli.c.a(new ks0.n(aVar19));
                    case 4:
                        m97.b.Companion.getClass();
                        return new t80.c(new e.a("global_search"), 20971520L);
                    case 5:
                        return t96.a.a();
                    case 6:
                        return z.a();
                    case 7:
                        aii.o oVar = (aii.o) bVar14.f141472j.get();
                        y80.a aVarR = aVar15.f141463a.r();
                        s.j(aVarR);
                        return new e60.y(oVar, aVarR, bVar14.b(), Optional.empty());
                    case 8:
                        return kxa.j.k((j60.a) bVar14.o.get());
                    case 9:
                        return ehe.n.s((com.revolut.kompot.navigable.a) bVar14.d.get(), (rp0.m) bVar14.f141475n.get());
                    case 10:
                        return new rp0.m();
                    case 11:
                        e60.t tVar2 = (e60.t) bVar14.k.get();
                        f60.w.a(tVar2);
                        return tVar2;
                    case 12:
                        z87.g searchSourceControllerModelExtensionSet = (z87.g) bVar14.f141478r.get();
                        m97.e.Companion.getClass();
                        Intrinsics.checkNotNullParameter(searchSourceControllerModelExtensionSet, "searchSourceControllerModelExtensionSet");
                        Set set = searchSourceControllerModelExtensionSet.f320047a;
                        s.k(set);
                        return set;
                    case 13:
                        z87.b globalSearchContentApi = aVar15.f141464b;
                        m97.e.Companion.getClass();
                        Intrinsics.checkNotNullParameter(globalSearchContentApi, "globalSearchContentApi");
                        pp.a aVar20 = (pp.a) globalSearchContentApi;
                        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(2);
                        w2 jointMcyErrorGuardianControllerExtensionProvider = aVar20.d.b();
                        oda.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(jointMcyErrorGuardianControllerExtensionProvider, "jointMcyErrorGuardianControllerExtensionProvider");
                        builderBuilderWithExpectedSize.add(jointMcyErrorGuardianControllerExtensionProvider.S());
                        k18.c factory = aVar20.B1.a();
                        Intrinsics.checkNotNullParameter(factory, "factory");
                        t5d.c cVarM = factory.m();
                        builderBuilderWithExpectedSize.addAll((Iterable) a1.m(cVarM.c3(), cVarM));
                        ImmutableSet extensions = builderBuilderWithExpectedSize.build();
                        pp.g.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extensions, "extensions");
                        xVar = new z87.g(extensions);
                        break;
                    case 14:
                        os2.g factory2 = aVar15.d.c();
                        Intrinsics.checkNotNullParameter(factory2, "factory");
                        return (sn.a) factory2.f229224b;
                    default:
                        throw new AssertionError(i96);
                }
                return xVar;
            case 15:
                g9g.d dVar6 = (g9g.d) this.f137997c;
                g9g.a aVar21 = (g9g.a) this.d;
                int i99 = this.f137996b;
                if (i99 == 0) {
                    dyb.a extension = (dyb.a) aVar21.f141587b.get();
                    ncg.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(extension, "extension");
                    s.k(extension);
                    return extension;
                }
                if (i99 == 1) {
                    o7.b provider = dVar6.i.d();
                    ncg.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(provider, "provider");
                    dyb.a aVarE = provider.e();
                    s.k(aVarE);
                    return aVarE;
                }
                if (i99 != 2) {
                    if (i99 != 3) {
                        throw new AssertionError(i99);
                    }
                    com.revolut.kompot.navigable.a controller5 = (com.revolut.kompot.navigable.a) aVar21.d.get();
                    ncg.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(controller5, "controller");
                    return x0.a(g1.Companion, controller5.D2());
                }
                mcg.m mVar2 = new mcg.m((p8g.c) aVar21.f141586a.g0.get());
                u uVar = (u) dVar6.f141639t0.get();
                g1 g1Var = (g1) aVar21.e.get();
                dyb.a aVar22 = (dyb.a) aVar21.f141587b.get();
                a29.b bVarA2 = dVar6.A.a();
                s.j(bVarA2);
                return new com.revolut.feature.travel.hotels.impl.ui_kompot.screen.favorites.d(mVar2, uVar, g1Var, aVar22, bVarA2);
            case 16:
                return a();
            case 17:
                g9g.f fVar13 = (g9g.f) this.d;
                g9g.d dVar7 = (g9g.d) this.f137997c;
                int i100 = this.f137996b;
                if (i100 != 0) {
                    if (i100 == 1) {
                        return new zag.n();
                    }
                    throw new AssertionError(i100);
                }
                l80.e eVarH = dVar7.e.h();
                s.j(eVarH);
                cli.n nVar7 = (cli.n) fVar13.f141662b.get();
                TravelHotelsBookingAmendmentDatesPickerScreenContract$InputData travelHotelsBookingAmendmentDatesPickerScreenContract$InputData = fVar13.f141661a;
                fcg.d dVar8 = new fcg.d();
                i9g.n nVar8 = (i9g.n) dVar7.p0.get();
                i9g.h hVar = (i9g.h) dVar7.q0.get();
                g81.a aVarC = dVar7.E.c();
                s.j(aVarC);
                wj0.a aVarI = ((nj0.d) dVar7.f141617b).i();
                s.j(aVarI);
                return new com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment.a(eVarH, nVar7, travelHotelsBookingAmendmentDatesPickerScreenContract$InputData, dVar8, nVar8, hVar, aVarC, aVarI);
            case 18:
                return b();
            case 19:
                g9g.d dVar9 = (g9g.d) this.f137997c;
                int i101 = this.f137996b;
                if (i101 != 0) {
                    if (i101 == 1) {
                        return new anl.j(new dyf.f(new dyf.c()));
                    }
                    throw new AssertionError(i101);
                }
                jki.p pVar3 = (jki.p) ((g9g.i) this.d).f141690a.get();
                ayf.n nVarA4 = dVar9.f141634r.a();
                s.j(nVarA4);
                return new mbg.f(pVar3, nVarA4, (i0) dVar9.B0.get());
            case 20:
                g9g.j jVar7 = (g9g.j) this.d;
                g9g.d dVar10 = (g9g.d) this.f137997c;
                int i102 = this.f137996b;
                if (i102 == 0) {
                    return new com.revolut.feature.travel.hotels.impl.ui_kompot.screen.campaign.b((cli.n) jVar7.f141702b.get(), jVar7.f141701a, (i9g.o) dVar10.f141642w0.get(), (h0) dVar10.f141631o0.get());
                }
                if (i102 != 1) {
                    throw new AssertionError(i102);
                }
                obg.a aVar23 = new obg.a();
                l80.e eVarH2 = dVar10.e.h();
                s.j(eVarH2);
                return new obg.r(aVar23, eVarH2);
            case 21:
                g9g.d dVar11 = (g9g.d) this.f137997c;
                g9g.m mVar3 = (g9g.m) this.d;
                int i103 = this.f137996b;
                if (i103 != 0) {
                    if (i103 == 1) {
                        return new fbg.m();
                    }
                    throw new AssertionError(i103);
                }
                cli.n nVar9 = (cli.n) mVar3.f141737b.get();
                TravelHotelsCheckInInstructionsScreenContract$InputData travelHotelsCheckInInstructionsScreenContract$InputData = mVar3.f141736a;
                i9g.n nVar10 = (i9g.n) dVar11.p0.get();
                fbg.n nVar11 = new fbg.n();
                c70.a aVarZ4 = dVar11.e.z();
                s.j(aVarZ4);
                return new fbg.l(nVar9, travelHotelsCheckInInstructionsScreenContract$InputData, nVar10, nVar11, aVarZ4);
            case 22:
                g9g.d dVar12 = (g9g.d) this.f137997c;
                g9g.n nVar12 = (g9g.n) this.d;
                int i104 = this.f137996b;
                if (i104 == 0) {
                    return new com.revolut.feature.travel.hotels.impl.ui_kompot.flow.checkout.a(nVar12.f141746a, new i90.b(), new tag.m(), (p8g.c) dVar12.g0.get(), (i9g.j0) nVar12.d.get());
                }
                if (i104 == 1) {
                    return new i9g.j0();
                }
                throw new AssertionError(i104);
            case 23:
                return c();
            case 24:
                return d();
            case 25:
                return e();
            case 26:
                return f();
            case 27:
                return g();
            case 28:
                return h();
            default:
                a0 a0Var = (a0) this.d;
                g9g.d dVar13 = (g9g.d) this.f137997c;
                int i105 = this.f137996b;
                if (i105 == 0) {
                    g9g.d dVar14 = a0Var.f141590b;
                    return new com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.guests_reviews.a(new sdg.l(new sdg.c(dVar14.e.i(), (c90.c) a0Var.d.get(), (p8g.c) dVar14.g0.get())), a0Var.f141589a, (b0) dVar13.m0.get(), (sdg.a) a0Var.e.get(), dVar13.f141629n.e());
                }
                if (i105 != 1) {
                    if (i105 == 2) {
                        return new sdg.a(new yk0.d(), (b0) dVar13.m0.get());
                    }
                    throw new AssertionError(i105);
                }
                com.revolut.kompot.navigable.a screen = (com.revolut.kompot.navigable.a) a0Var.f141591c.get();
                tdg.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(screen, "screen");
                return new c90.c(screen.m2());
        }
    }
}
