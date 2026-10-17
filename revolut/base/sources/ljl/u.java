package ljl;

import android.app.Activity;
import android.content.Context;
import com.google.common.collect.ImmutableMap;
import com.hcaptcha.sdk.HCaptchaConfig;
import com.revolut.feature.passcode.PasscodeScreenContract$InputData;
import com.revolut.feature.transfer.core.api.cancellation.TransferCancellationInputData;
import com.revolut.feature.transfer.core.api.schedule.ScheduleTransferInputData;
import com.revolut.feature.transfer.core.api.ui.throubleshooter.TransferLocateInputData;
import com.revolut.feature.transfer.core.api.ui.throubleshooter.TransferRecallInputData;
import com.revolut.feature.transfer.core.api.ui.throubleshooter.TransferTroubleshooterInputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.checkout.AsftCheckoutScreenContract$InputData;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.cancel_booking.AsftCancelBookingScreenContract$InputData;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.dialogs.flight_date_picker_screen.AsftFlightDatePickerScreenContract$InputData;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.dialogs.number_of_travelers_picker.AsftNumberOfTravelersPickerScreenContract$InputData;
import com.revolut.sso.impl.ui.email.enter_email.EnterEmailScreenContract$InputData;
import com.revolut.sso.impl.ui.manual_review.ManualReviewFlowContract$InputData;
import com.revolut.sso.impl.ui.post_authentication.PostAuthenticationFlowContract$InputData;
import java.util.Optional;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class u implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f196104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f196105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f196106c;
    public final Object d;

    public /* synthetic */ u(Object obj2, Object obj3, int i, int i2) {
        this.f196104a = i2;
        this.f196105b = obj2;
        this.d = obj3;
        this.f196106c = i;
    }

    private final Object a() {
        lti.g gVar = (lti.g) this.f196105b;
        poi.b bVar = gVar.f;
        p7c.r rVar = gVar.f199909j;
        ite.a aVar = gVar.f199904a;
        kti.g gVar2 = gVar.f199905b;
        lti.d dVar = (lti.d) this.d;
        lti.g gVar3 = dVar.f199889b;
        int i = this.f196106c;
        if (i == 0) {
            com.revolut.kompot.navigable.a aVar2 = (com.revolut.kompot.navigable.a) dVar.f199890c.get();
            gti.h hVar = new gti.h(gVar3.e);
            uo.q0 q0VarJ = bVar.j();
            uo.b bVarB = bVar.b();
            vc.s.j(bVarB);
            ho.t tVarC = gVar3.f.c();
            vc.s.j(tVarC);
            return hsi.b.j(aVar2, hVar, q0VarJ, bVarB, new gti.b(tVarC));
        }
        if (i == 1) {
            fui.d dVar2 = (fui.d) dVar.e.get();
            dui.b.Companion.getClass();
            u6c.t tVar = u6c.t.AIRPORT_SECURITY_FAST_TRACK;
            vc.s.k(tVar);
            gte.a aVarB = aVar.b();
            vc.s.j(aVarB);
            return new fui.g(dVar2, tVar, aVarB);
        }
        if (i == 2) {
            q7c.g gVarE = rVar.e();
            q7c.m mVarD = rVar.d();
            vc.s.j(mVarD);
            dui.b.Companion.getClass();
            u6c.t tVar2 = u6c.t.AIRPORT_SECURITY_FAST_TRACK;
            vc.s.k(tVar2);
            return new fui.i(gVarE, mVarD, tVar2);
        }
        if (i == 3) {
            zsi.e eVarA = gVar2.a();
            vc.s.j(eVarA);
            gte.a featureToggleInteractor = gVar3.f199904a.b();
            vc.s.j(featureToggleInteractor);
            Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
            return new gui.j(eVarA, new r39.a(), (mti.c) gVar.f199913p.get());
        }
        if (i == 4) {
            AsftCheckoutScreenContract$InputData asftCheckoutScreenContract$InputData = dVar.f199888a;
            wli.x xVarD = ((s41.a) gVar.k).d();
            cli.n nVar = (cli.n) dVar.f199892h.get();
            nyb.k kVarC = gVar.f199908h.c();
            vc.s.j(kVarC);
            mti.n nVar2 = (mti.n) gVar2.C.get();
            vc.s.j(nVar2);
            zsi.h hVar2 = (zsi.h) gVar2.B.get();
            vc.s.j(hVar2);
            pti.k kVar = (pti.k) gVar2.u.get();
            vc.s.j(kVar);
            gui.j jVar = (gui.j) dVar.f199891g.get();
            fui.c cVar = (fui.c) dVar.f.get();
            gte.a aVarB2 = aVar.b();
            vc.s.j(aVarB2);
            return new com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.checkout.b(asftCheckoutScreenContract$InputData, xVarD, nVar, kVarC, nVar2, hVar2, kVar, jVar, cVar, aVarB2, new axi.b0(gVar3.i.d(), 1));
        }
        if (i != 5) {
            throw new AssertionError(i);
        }
        n8b.a aVarA = gVar3.f199907g.a();
        vc.s.j(aVarA);
        eui.c cVar2 = new eui.c(aVarA, new gui.k());
        eui.b bVar2 = new eui.b(dVar.f199888a, new nd7.d(new nd7.c()), new eui.g());
        fui.h exchangeAmountItemMapper = new fui.h();
        Intrinsics.checkNotNullParameter(exchangeAmountItemMapper, "exchangeAmountItemMapper");
        eui.e eVar = new eui.e();
        dec.r rVar2 = new dec.r();
        dec.g gVar4 = new dec.g();
        dec.a aVar3 = new dec.a();
        l80.e eVarH = gVar3.d.h();
        vc.s.j(eVarH);
        fui.j jVar2 = new fui.j(new dec.q(rVar2, gVar4, aVar3, eVarH));
        gte.a aVarB3 = gVar3.f199904a.b();
        vc.s.j(aVarB3);
        eui.a aVar4 = new eui.a(aVarB3);
        AsftCheckoutScreenContract$InputData asftCheckoutScreenContract$InputData2 = dVar.f199888a;
        gte.a aVarB4 = aVar.b();
        vc.s.j(aVarB4);
        return new com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.checkout.c(cVar2, bVar2, eVar, jVar2, aVar4, asftCheckoutScreenContract$InputData2, aVarB4);
    }

    private final Object b() {
        poi.b bVar = ((lti.g) this.f196105b).f;
        lti.e eVar = (lti.e) this.d;
        lti.g gVar = eVar.f199894b;
        AsftFlightDatePickerScreenContract$InputData asftFlightDatePickerScreenContract$InputData = eVar.f199893a;
        int i = this.f196106c;
        if (i != 0) {
            if (i == 1) {
                return new avi.f(asftFlightDatePickerScreenContract$InputData, (cli.n) eVar.e.get());
            }
            if (i == 2) {
                return new avi.h(asftFlightDatePickerScreenContract$InputData, new avi.i());
            }
            throw new AssertionError(i);
        }
        com.revolut.kompot.navigable.a aVar = (com.revolut.kompot.navigable.a) eVar.f199895c.get();
        gti.h hVar = new gti.h(gVar.e);
        uo.q0 q0VarJ = bVar.j();
        uo.b bVarB = bVar.b();
        vc.s.j(bVarB);
        ho.t tVarC = gVar.f.c();
        vc.s.j(tVarC);
        return hsi.b.j(aVar, hVar, q0VarJ, bVarB, new gti.b(tVarC));
    }

    private final Object c() {
        lti.f fVar = (lti.f) this.d;
        lti.g gVar = fVar.f199898c;
        lti.g gVar2 = (lti.g) this.f196105b;
        r7d.l lVar = gVar2.f199910l;
        poi.b bVar = gVar2.f;
        zc6.b bVar2 = gVar2.f199911m;
        kti.g gVar3 = gVar2.f199905b;
        int i = this.f196106c;
        switch (i) {
            case 0:
                return h7d.d.a(fVar.f199896a, (i7d.o) fVar.d.get(), lVar.d());
            case 1:
                return h7d.f.a(lVar.d(), Optional.empty());
            case 2:
                com.revolut.kompot.navigable.a aVar = (com.revolut.kompot.navigable.a) fVar.f.get();
                gti.h hVar = new gti.h(gVar.e);
                uo.q0 q0VarJ = bVar.j();
                uo.b bVarB = bVar.b();
                vc.s.j(bVarB);
                ho.t tVarC = gVar.f.c();
                vc.s.j(tVarC);
                return hsi.b.j(aVar, hVar, q0VarJ, bVarB, new gti.b(tVarC));
            case 3:
                fd6.a aVar2 = (fd6.a) fVar.i.get();
                va.g.t(aVar2);
                return aVar2;
            case 4:
                return va.g.s(((zc6.a) bVar2).d(), (xc6.a) fVar.f199900h.get());
            case 5:
                return r6.b.k((zc6.a) bVar2, "factory");
            case 6:
                return va.g.u((xc6.a) fVar.f199900h.get());
            case 7:
                cli.n nVar = (cli.n) fVar.f199902l.get();
                nyb.k kVarC = gVar2.f199908h.c();
                vc.s.j(kVarC);
                zsi.e eVarA = gVar3.a();
                vc.s.j(eVarA);
                mti.a aVar3 = (mti.a) gVar3.f189547s.get();
                vc.s.j(aVar3);
                zsi.i iVar = (zsi.i) gVar3.D.get();
                vc.s.j(iVar);
                pti.k kVar = (pti.k) gVar3.u.get();
                vc.s.j(kVar);
                rui.a aVar4 = new rui.a();
                zja.a aVarA = ((ika.b) gVar.f199912n).a();
                vc.s.j(aVarA);
                mti.b bVar3 = (mti.b) gVar.f199905b.v.get();
                vc.s.j(bVar3);
                uti.g gVar4 = new uti.g(aVarA, bVar3);
                i7d.o oVar = (i7d.o) fVar.d.get();
                jvi.c cVar = (jvi.c) gVar3.E.get();
                vc.s.j(cVar);
                return new com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.home.c(nVar, kVarC, eVarA, aVar3, iVar, kVar, aVar4, gVar4, oVar, cVar, fVar.f199897b, ((zc6.a) bVar2).b());
            case 8:
                n8b.a aVarA2 = gVar.f199907g.a();
                vc.s.j(aVarA2);
                jvi.b bVar4 = new jvi.b(new k7i.i(aVarA2));
                n8b.a aVarA3 = gVar.f199907g.a();
                vc.s.j(aVarA3);
                k7i.i iVar2 = new k7i.i(aVarA3);
                l80.e eVarH = gVar.d.h();
                vc.s.j(eVarH);
                return new ac4.g(new iui.d(bVar4, iVar2, eVarH, new gui.k()), ((zc6.a) bVar2).c());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object d() {
        lti.g gVar = (lti.g) this.f196105b;
        poi.b bVar = gVar.f;
        kti.g gVar2 = gVar.f199905b;
        lti.i iVar = (lti.i) this.d;
        lti.g gVar3 = iVar.f199917b;
        int i = this.f196106c;
        if (i == 0) {
            com.revolut.kompot.navigable.a aVar = (com.revolut.kompot.navigable.a) iVar.f199918c.get();
            gti.h hVar = new gti.h(gVar3.e);
            uo.q0 q0VarJ = bVar.j();
            uo.b bVarB = bVar.b();
            vc.s.j(bVarB);
            ho.t tVarC = gVar3.f.c();
            vc.s.j(tVarC);
            return hsi.b.j(aVar, hVar, q0VarJ, bVarB, new gti.b(tVarC));
        }
        if (i != 1) {
            if (i == 2) {
                return new cvi.l();
            }
            throw new AssertionError(i);
        }
        AsftNumberOfTravelersPickerScreenContract$InputData asftNumberOfTravelersPickerScreenContract$InputData = iVar.f199916a;
        cli.n nVar = (cli.n) iVar.e.get();
        mti.n nVar2 = (mti.n) gVar2.C.get();
        vc.s.j(nVar2);
        pti.k kVar = (pti.k) gVar2.u.get();
        vc.s.j(kVar);
        return new cvi.k(asftNumberOfTravelersPickerScreenContract$InputData, nVar, nVar2, kVar);
    }

    @Override // phm.a
    public final Object get() {
        Object aVar;
        Object iVar;
        switch (this.f196104a) {
            case 0:
                c63.c cVar = ((q0) this.f196105b).D;
                v vVar = (v) this.d;
                int i = this.f196106c;
                switch (i) {
                    case 0:
                        d63.a extension = (d63.a) vVar.f196117c.get();
                        dll.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension, "extension");
                        vc.s.k(extension);
                        return extension;
                    case 1:
                        d63.c modelExtension = (d63.c) vVar.f196116b.get();
                        e63.a factory = cVar.a();
                        vc.s.j(factory);
                        dll.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(modelExtension, "modelExtension");
                        Intrinsics.checkNotNullParameter(factory, "factory");
                        Intrinsics.checkNotNullParameter(modelExtension, "modelExtension");
                        return new d63.a(modelExtension);
                    case 2:
                        e63.a factory2 = cVar.a();
                        vc.s.j(factory2);
                        BaseScreen screen = vVar.f196115a;
                        dll.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory2, "factory");
                        Intrinsics.checkNotNullParameter(screen, "screen");
                        Activity activity = screen.m2();
                        Intrinsics.checkNotNullParameter(activity, "activity");
                        return new d63.c(e63.a.a(activity));
                    case 3:
                        d63.c extension2 = (d63.c) vVar.f196116b.get();
                        dll.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension2, "extension");
                        vc.s.k(extension2);
                        return extension2;
                    case 4:
                        return new cll.l((jki.p) vVar.f.get(), (fll.a) vVar.f196118g.get(), (d63.c) vVar.f196116b.get());
                    case 5:
                        return new cll.m();
                    case 6:
                        return new fll.b();
                    default:
                        throw new AssertionError(i);
                }
            case 1:
                q0 q0Var = (q0) this.f196105b;
                l70.e eVar = q0Var.f196062g;
                b0 b0Var = (b0) this.d;
                int i2 = this.f196106c;
                switch (i2) {
                    case 0:
                        ManualReviewFlowContract$InputData manualReviewFlowContract$InputData = b0Var.f195881a;
                        s70.a aVarM = eVar.m();
                        vc.s.j(aVarM);
                        b90.e eVar2 = (b90.e) eVar.U.get();
                        vc.s.j(eVar2);
                        return new com.revolut.sso.impl.ui.manual_review.b(manualReviewFlowContract$InputData, aVarM, eVar2, (okl.n1) q0Var.p0.get(), (nnl.a) b0Var.d.get(), (gu2.e) b0Var.i.get(), new kye.e((Activity) b0Var.f195884g.get()));
                    case 1:
                        return new nnl.b();
                    case 2:
                        hu2.a aVar2 = (hu2.a) b0Var.e.get();
                        com.hcaptcha.sdk.a aVarL = jr9.h.l((Activity) b0Var.f195884g.get());
                        HCaptchaConfig hCaptchaConfigM = jr9.h.m((String) b0Var.f195885h.get());
                        aoi.c cVarA = aoi.f.a();
                        dm0.d dVarD = b0Var.f195882b.f196068m.d();
                        vc.s.j(dVarD);
                        return jr9.h.x(aVar2, new ku2.h(aVarL, hCaptchaConfigM, cVarA, dVarD));
                    case 3:
                        return new hu2.d();
                    case 4:
                        return jr9.h.e((com.revolut.kompot.navigable.a) b0Var.f.get());
                    case 5:
                        bjl.p0 revolutSsoDependenciesProvider = (bjl.p0) q0Var.H.get();
                        onl.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(revolutSsoDependenciesProvider, "revolutSsoDependenciesProvider");
                        String str = ((rqk.k) revolutSsoDependenciesProvider).f256594q;
                        vc.s.k(str);
                        return str;
                    case 6:
                        gu2.e eVar3 = (gu2.e) b0Var.i.get();
                        jr9.h.h(eVar3);
                        return eVar3;
                    default:
                        throw new AssertionError(i2);
                }
            case 2:
                q0 q0Var2 = (q0) this.f196105b;
                i0 i0Var = (i0) this.d;
                int i3 = this.f196106c;
                if (i3 == 0) {
                    return new lol.k((jki.p) i0Var.f195978b.get(), (tll.n) q0Var2.y0.get(), (jol.b) q0Var2.I.get());
                }
                if (i3 == 1) {
                    return new lol.m(i0Var.f195977a);
                }
                throw new AssertionError(i3);
            case 3:
                q0 q0Var3 = (q0) this.f196105b;
                l70.e eVar4 = q0Var3.f196062g;
                j0 j0Var = (j0) this.d;
                q0 q0Var4 = j0Var.f195999c;
                int i5 = this.f196106c;
                if (i5 == 0) {
                    Context context = q0Var4.f196055a;
                    g90.a aVarW = q0Var4.f196062g.w();
                    vc.s.j(aVarW);
                    gnl.a aVar3 = new gnl.a(context, aVarW);
                    PostAuthenticationFlowContract$InputData postAuthenticationFlowContract$InputData = j0Var.f195997a;
                    z80.b bVarS = eVar4.s();
                    vc.s.j(bVarS);
                    aVar = new com.revolut.sso.impl.ui.post_authentication.a(aVar3, postAuthenticationFlowContract$InputData, bVarS, (bjl.p0) q0Var3.H.get());
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            throw new AssertionError(i5);
                        }
                        ViewController flow = j0Var.f195998b;
                        sol.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(flow, "flow");
                        return new f01.c(flow.m2());
                    }
                    akl.z zVarC = q0Var3.c();
                    f01.a aVar4 = (f01.a) j0Var.f.get();
                    Context context2 = q0Var4.f196055a;
                    g90.a aVarW2 = q0Var4.f196062g.w();
                    vc.s.j(aVarW2);
                    gnl.a aVar5 = new gnl.a(context2, aVarW2);
                    z80.b bVarS2 = eVar4.s();
                    vc.s.j(bVarS2);
                    aVar = new gnl.v(zVarC, aVar4, aVar5, bVarS2);
                }
                return aVar;
            case 4:
                int i6 = this.f196106c;
                if (i6 != 0) {
                    if (i6 == 1) {
                        return new tol.h();
                    }
                    throw new AssertionError(i6);
                }
                jki.p pVar = (jki.p) ((l0) this.d).f196020a.get();
                f86.a aVar6 = (f86.a) ((q0) this.f196105b).f196081w.d.get();
                vc.s.j(aVar6);
                return new tol.g(pVar, aVar6);
            case 5:
                m0 m0Var = (m0) this.d;
                q0 q0Var5 = (q0) this.f196105b;
                l70.e eVar5 = q0Var5.f196062g;
                int i21 = this.f196106c;
                if (i21 == 0) {
                    return new com.revolut.sso.impl.ui.consent.qr.b(m0Var.f196028a, (knl.d) m0Var.e.get(), (bjl.p0) q0Var5.H.get(), q0Var5.g(), ((s41.a) q0Var5.A).d(), (rp0.g1) m0Var.f.get());
                }
                if (i21 == 1) {
                    s70.a aVarM2 = eVar5.m();
                    vc.s.j(aVarM2);
                    y80.a aVarR = eVar5.r();
                    vc.s.j(aVarR);
                    w39.b bVarA = q0Var5.f196083x.a();
                    vc.s.j(bVarA);
                    return new knl.h(aVarM2, aVarR, bVarA);
                }
                if (i21 == 2) {
                    return cdj.b.z(m0Var.f196029b);
                }
                if (i21 != 3) {
                    throw new AssertionError(i21);
                }
                Object extension3 = (knl.d) m0Var.e.get();
                lnl.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension3, "extension");
                yji.n nVar = (yji.n) extension3;
                vc.s.k(nVar);
                return nVar;
            case 6:
                w0 w0Var = (w0) this.d;
                q0 q0Var6 = (q0) this.f196105b;
                int i22 = this.f196106c;
                switch (i22) {
                    case 0:
                        return db5.e.s((col.c) w0Var.f196127g.get());
                    case 1:
                        com.revolut.kompot.navigable.a aVar7 = (com.revolut.kompot.navigable.a) w0Var.f.get();
                        wl0.c cVarA2 = q0Var6.f.a();
                        ph0.d dVarA = t2d.c.a(q0Var6.i.f271230a);
                        l80.e eVarH = q0Var6.f196062g.h();
                        vc.s.j(eVarH);
                        iVar = new col.i(aVar7, cVarA2, dVarA, eVarH);
                        break;
                    case 2:
                        uil.a aVarA = q0Var6.f196057b.a();
                        vc.s.j(aVarA);
                        iql.a aVar8 = new iql.a();
                        gu2.e eVar6 = (gu2.e) w0Var.f196130l.get();
                        xjl.h hVar = (xjl.h) q0Var6.f0.get();
                        yil.a aVar9 = w0Var.f196124a;
                        akl.z zVarC2 = q0Var6.c();
                        bjl.p0 p0Var = (bjl.p0) q0Var6.H.get();
                        dm0.d dVar = (dm0.d) q0Var6.f196068m.o.get();
                        vc.s.j(dVar);
                        iVar = new com.revolut.sso.impl.ui.signup.b(aVarA, aVar8, eVar6, hVar, aVar9, zVarC2, p0Var, dVar, (jol.b) q0Var6.I.get(), w0Var.f196125b, q0Var6.k());
                        break;
                    case 3:
                        hu2.a aVar10 = (hu2.a) w0Var.i.get();
                        com.hcaptcha.sdk.a aVarL2 = jr9.h.l((Activity) w0Var.f196129j.get());
                        HCaptchaConfig hCaptchaConfigM2 = jr9.h.m((String) w0Var.k.get());
                        aoi.c cVarA3 = aoi.f.a();
                        dm0.d dVarD2 = w0Var.d.f196068m.d();
                        vc.s.j(dVarD2);
                        return jr9.h.x(aVar10, new ku2.h(aVarL2, hCaptchaConfigM2, cVarA3, dVarD2));
                    case 4:
                        return new hu2.d();
                    case 5:
                        return jr9.h.e((com.revolut.kompot.navigable.a) w0Var.f.get());
                    case 6:
                        bjl.p0 revolutSsoDependenciesProvider2 = (bjl.p0) q0Var6.H.get();
                        jql.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(revolutSsoDependenciesProvider2, "revolutSsoDependenciesProvider");
                        String str2 = ((rqk.k) revolutSsoDependenciesProvider2).f256594q;
                        vc.s.k(str2);
                        return str2;
                    case 7:
                        gu2.e eVar7 = (gu2.e) w0Var.f196130l.get();
                        jr9.h.h(eVar7);
                        return eVar7;
                    case 8:
                        akl.z zVarC3 = q0Var6.c();
                        f01.a aVar11 = (f01.a) w0Var.o.get();
                        gnl.a aVarC = w0Var.c();
                        z80.b bVarS3 = q0Var6.f196062g.s();
                        vc.s.j(bVarS3);
                        iVar = new gnl.v(zVarC3, aVar11, aVarC, bVarS3);
                        break;
                    case 9:
                        ViewController flow2 = w0Var.f196126c;
                        jql.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(flow2, "flow");
                        return new f01.c(flow2.m2());
                    default:
                        throw new AssertionError(i22);
                }
                return iVar;
            case 7:
                y0 y0Var = (y0) this.d;
                q0 q0Var7 = (q0) this.f196105b;
                he9.e eVar8 = q0Var7.B;
                int i32 = this.f196106c;
                if (i32 != 0) {
                    if (i32 == 1) {
                        return new de9.y(new de9.z());
                    }
                    if (i32 == 2) {
                        return new he9.c(this, 1);
                    }
                    throw new AssertionError(i32);
                }
                PasscodeScreenContract$InputData passcodeScreenContract$InputData = y0Var.f196144b;
                oe9.a aVarB = eVar8.b();
                vc.s.j(aVarB);
                fe9.h hVar2 = new fe9.h(y0Var.d.f.a());
                ie9.d dVarA2 = eVar8.a();
                vc.s.j(dVarA2);
                wl0.c cVarA4 = q0Var7.f.a();
                io.c cVarD = q0Var7.C.d();
                vc.s.j(cVarD);
                return new de9.x(passcodeScreenContract$InputData, aVarB, hVar2, dVarA2, cVarA4, cVarD, e2.a(), (jki.p) y0Var.e.get());
            case 8:
                y0 y0Var2 = (y0) this.d;
                q0 q0Var8 = (q0) this.f196105b;
                he9.e eVar9 = q0Var8.B;
                int i33 = this.f196106c;
                if (i33 != 0) {
                    if (i33 == 1) {
                        return new de9.y(new de9.z());
                    }
                    if (i33 == 2) {
                        return new he9.c(this, 2);
                    }
                    throw new AssertionError(i33);
                }
                PasscodeScreenContract$InputData passcodeScreenContract$InputData2 = y0Var2.f196144b;
                oe9.a aVarB2 = eVar9.b();
                vc.s.j(aVarB2);
                fe9.h hVar3 = new fe9.h(y0Var2.d.f.a());
                ie9.d dVarA3 = eVar9.a();
                vc.s.j(dVarA3);
                wl0.c cVarA5 = q0Var8.f.a();
                io.c cVarD2 = q0Var8.C.d();
                vc.s.j(cVarD2);
                return new de9.x(passcodeScreenContract$InputData2, aVarB2, hVar3, dVarA3, cVarA5, cVarD2, e2.a(), (jki.p) y0Var2.e.get());
            case 9:
                y0 y0Var3 = (y0) this.d;
                q0 q0Var9 = (q0) this.f196105b;
                he9.e eVar10 = q0Var9.B;
                int i43 = this.f196106c;
                if (i43 != 0) {
                    if (i43 == 1) {
                        return new de9.y(new de9.z());
                    }
                    if (i43 == 2) {
                        return new he9.c(this, 3);
                    }
                    throw new AssertionError(i43);
                }
                PasscodeScreenContract$InputData passcodeScreenContract$InputData3 = y0Var3.f196144b;
                oe9.a aVarB3 = eVar10.b();
                vc.s.j(aVarB3);
                fe9.h hVar4 = new fe9.h(y0Var3.d.f.a());
                ie9.d dVarA4 = eVar10.a();
                vc.s.j(dVarA4);
                wl0.c cVarA6 = q0Var9.f.a();
                io.c cVarD3 = q0Var9.C.d();
                vc.s.j(cVarD3);
                return new de9.x(passcodeScreenContract$InputData3, aVarB3, hVar4, dVarA4, cVarA6, cVarD3, e2.a(), (jki.p) y0Var3.e.get());
            case 10:
                i1 i1Var = (i1) this.d;
                EnterEmailScreenContract$InputData enterEmailScreenContract$InputData = i1Var.f195981b;
                int i59 = this.f196106c;
                if (i59 == 0) {
                    return new com.revolut.sso.impl.ui.email.enter_email.a(enterEmailScreenContract$InputData, (cli.n) i1Var.f195982c.get(), (tll.a) ((q0) this.f196105b).E0.get());
                }
                if (i59 == 1) {
                    return new com.revolut.sso.impl.ui.email.enter_email.b(enterEmailScreenContract$InputData, d2.a());
                }
                throw new AssertionError(i59);
            case 11:
                i1 i1Var2 = (i1) this.d;
                EnterEmailScreenContract$InputData enterEmailScreenContract$InputData2 = i1Var2.f195981b;
                int i66 = this.f196106c;
                if (i66 == 0) {
                    return new com.revolut.sso.impl.ui.email.enter_email.a(enterEmailScreenContract$InputData2, (cli.n) i1Var2.f195982c.get(), (tll.a) ((q0) this.f196105b).E0.get());
                }
                if (i66 == 1) {
                    return new com.revolut.sso.impl.ui.email.enter_email.b(enterEmailScreenContract$InputData2, d2.a());
                }
                throw new AssertionError(i66);
            case 12:
                lne.c cVar2 = (lne.c) this.f196105b;
                lne.a aVar12 = (lne.a) this.d;
                int i74 = this.f196106c;
                if (i74 == 0) {
                    return new tne.g((cli.n) aVar12.d.get(), aVar12.f197212a, (w80.b) aVar12.f197214c.get(), (nne.b) cVar2.o.get());
                }
                if (i74 == 1) {
                    return new tne.i(new u80.o(), (w80.b) aVar12.f197214c.get());
                }
                if (i74 != 2) {
                    throw new AssertionError(i74);
                }
                qd0.b languageProvider = cVar2.e.n();
                vc.s.j(languageProvider);
                une.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
                return v80.b.b(languageProvider, false, false, 58);
            case 13:
                l70.e eVar11 = ((lpf.i) this.f196105b).f199039j;
                lpf.g gVar = (lpf.g) this.d;
                ScheduleTransferInputData scheduleTransferInputData = gVar.f199025a;
                int i92 = this.f196106c;
                if (i92 == 0) {
                    return kxa.j.l((j60.a) gVar.d.get());
                }
                if (i92 == 1) {
                    return h30.l.p((com.revolut.kompot.navigable.a) gVar.f199026b.get(), (rp0.m) gVar.f199027c.get());
                }
                if (i92 == 2) {
                    return new rp0.m();
                }
                if (i92 == 3) {
                    j60.a aVar13 = (j60.a) gVar.d.get();
                    zpf.b bVar = (zpf.b) gVar.f.get();
                    l80.e eVarH2 = eVar11.h();
                    vc.s.j(eVarH2);
                    return new xpf.h(scheduleTransferInputData, aVar13, bVar, eVarH2, (jki.p) gVar.f199028g.get());
                }
                if (i92 == 4) {
                    l80.e eVarH3 = eVar11.h();
                    vc.s.j(eVarH3);
                    return new zpf.e(eVarH3);
                }
                if (i92 != 5) {
                    throw new AssertionError(i92);
                }
                zpf.b bVar2 = (zpf.b) gVar.f.get();
                l80.e eVarH4 = eVar11.h();
                vc.s.j(eVarH4);
                return new zpf.f(scheduleTransferInputData, bVar2, eVarH4);
            case 14:
                hjf.b bVar3 = ((lpf.i) this.f196105b).d;
                lpf.h hVar5 = (lpf.h) this.d;
                int i96 = this.f196106c;
                if (i96 == 0) {
                    return kxa.j.l((j60.a) hVar5.d.get());
                }
                if (i96 == 1) {
                    return h30.l.p((com.revolut.kompot.navigable.a) hVar5.f199031b.get(), (rp0.m) hVar5.f199032c.get());
                }
                if (i96 == 2) {
                    return new rp0.m();
                }
                if (i96 != 3) {
                    if (i96 == 4) {
                        return new wqf.e();
                    }
                    throw new AssertionError(i96);
                }
                TransferCancellationInputData transferCancellationInputData = hVar5.f199030a;
                j60.a aVar14 = (j60.a) hVar5.d.get();
                uhf.d dVar2 = (uhf.d) bVar3.f152766h.get();
                vc.s.j(dVar2);
                mjf.u uVarA = bVar3.a();
                vc.s.j(uVarA);
                return new wqf.d(transferCancellationInputData, aVar14, dVar2, uVarA, new xqf.a(), (jki.p) hVar5.f.get());
            case 15:
                lpf.i iVar2 = (lpf.i) this.f196105b;
                lpf.j jVar = (lpf.j) this.d;
                int i99 = this.f196106c;
                if (i99 == 0) {
                    n60.b bVar4 = (n60.b) jVar.d.get();
                    o5k.i.n(bVar4);
                    return bVar4;
                }
                if (i99 == 1) {
                    return o5k.i.s((com.revolut.kompot.navigable.a) jVar.f199050c.get());
                }
                if (i99 == 2) {
                    n60.a aVar15 = (n60.a) jVar.f.get();
                    o5k.i.k(aVar15);
                    return aVar15;
                }
                if (i99 == 3) {
                    return o5k.i.p((com.revolut.kompot.navigable.a) jVar.f199050c.get());
                }
                if (i99 != 4) {
                    if (i99 == 5) {
                        return new zqf.f();
                    }
                    throw new AssertionError(i99);
                }
                TransferLocateInputData transferLocateInputData = jVar.f199048a;
                use.d dVarB = jVar.f199049b.e.b();
                vc.s.j(dVarB);
                opf.l lVar = new opf.l(dVarB);
                com.revolut.domain.interactors.transactions.a aVarC2 = ((bjf.a) iVar2.f199035b).c();
                vc.s.j(aVarC2);
                return new zqf.k(transferLocateInputData, lVar, aVarC2, new yqf.b(), ((s41.a) iVar2.f).d(), (jki.p) jVar.f199052h.get());
            case 16:
                lpf.i iVar3 = (lpf.i) this.f196105b;
                lpf.k kVar = (lpf.k) this.d;
                int i100 = this.f196106c;
                if (i100 == 0) {
                    n60.b bVar5 = (n60.b) kVar.d.get();
                    o5k.i.n(bVar5);
                    return bVar5;
                }
                if (i100 == 1) {
                    return o5k.i.s((com.revolut.kompot.navigable.a) kVar.f199055c.get());
                }
                if (i100 == 2) {
                    n60.a aVar16 = (n60.a) kVar.f.get();
                    o5k.i.k(aVar16);
                    return aVar16;
                }
                if (i100 == 3) {
                    return o5k.i.p((com.revolut.kompot.navigable.a) kVar.f199055c.get());
                }
                if (i100 != 4) {
                    if (i100 == 5) {
                        return new arf.f();
                    }
                    throw new AssertionError(i100);
                }
                TransferRecallInputData transferRecallInputData = kVar.f199053a;
                use.d dVarB2 = kVar.f199054b.e.b();
                vc.s.j(dVarB2);
                opf.l lVar2 = new opf.l(dVarB2);
                com.revolut.domain.interactors.transactions.a aVarC3 = ((bjf.a) iVar3.f199035b).c();
                vc.s.j(aVarC3);
                return new arf.l(transferRecallInputData, lVar2, aVarC3, new yqf.b(), ((s41.a) iVar3.f).d(), (jki.p) kVar.f199057h.get());
            case 17:
                lpf.i iVar4 = (lpf.i) this.f196105b;
                vxd.b bVar6 = iVar4.f199037g;
                lpf.l lVar3 = (lpf.l) this.d;
                lpf.i iVar5 = lVar3.f199059b;
                int i101 = this.f196106c;
                if (i101 == 0) {
                    Object extension4 = (crf.d) lVar3.f199060c.get();
                    drf.a.Companion.getClass();
                    Intrinsics.checkNotNullParameter(extension4, "extension");
                    yji.n nVar2 = (yji.n) extension4;
                    vc.s.k(nVar2);
                    return nVar2;
                }
                if (i101 == 1) {
                    use.d dVarB3 = iVar5.e.b();
                    vc.s.j(dVarB3);
                    opf.l lVar4 = new opf.l(dVarB3);
                    zxd.c cVarA7 = ((eyd.b) bVar6).a();
                    vc.s.j(cVarA7);
                    return new crf.k(lVar4, cVarA7, ((eyd.b) bVar6).c(), new vyd.a(), ((s41.a) iVar4.f).d());
                }
                if (i101 == 2) {
                    TransferTroubleshooterInputData transferTroubleshooterInputData = lVar3.f199058a;
                    mde.e eVarE = iVar4.f199038h.e();
                    com.revolut.domain.interactors.transactions.a aVarC4 = ((bjf.a) iVar5.f199035b).c();
                    vc.s.j(aVarC4);
                    bef.b bVar7 = (bef.b) iVar5.i.f199665h.get();
                    vc.s.j(bVar7);
                    return new brf.f(transferTroubleshooterInputData, eVarE, new r10.f(aVarC4, bVar7), (crf.d) lVar3.f199060c.get(), (jki.p) lVar3.e.get());
                }
                if (i101 != 3) {
                    throw new AssertionError(i101);
                }
                ImmutableMap.Builder builderBuilderWithExpectedSize = ImmutableMap.builderWithExpectedSize(8);
                c6k.a paymentTrackingDateFormatter = iVar5.a();
                Intrinsics.checkNotNullParameter(paymentTrackingDateFormatter, "paymentTrackingDateFormatter");
                builderBuilderWithExpectedSize.put("KEY_STEP_VERIFICATION", new c6k.k(paymentTrackingDateFormatter));
                l70.e eVar12 = iVar5.f199039j;
                l80.e eVarH5 = eVar12.h();
                vc.s.j(eVarH5);
                builderBuilderWithExpectedSize.put("KEY_STEP_PROCESSING", new c6k.j(eVarH5, iVar5.a()));
                c6k.a paymentTrackingDateFormatter2 = iVar5.a();
                Intrinsics.checkNotNullParameter(paymentTrackingDateFormatter2, "paymentTrackingDateFormatter");
                builderBuilderWithExpectedSize.put("KEY_STEP_DELIVERY", new c6k.h(paymentTrackingDateFormatter2, 1));
                c6k.a paymentTrackingDateFormatter3 = iVar5.a();
                Intrinsics.checkNotNullParameter(paymentTrackingDateFormatter3, "paymentTrackingDateFormatter");
                builderBuilderWithExpectedSize.put("KEY_STEP_CREDIT", new c6k.h(paymentTrackingDateFormatter3, 0));
                c6k.a aVarA2 = iVar5.a();
                thf.m mVarG = iVar5.k.g();
                vc.s.j(mVarG);
                builderBuilderWithExpectedSize.put("KEY_STEP_LINK_CREATED", new c6k.i(aVarA2, mVarG));
                c6k.a paymentTrackingDateFormatter4 = iVar5.a();
                Intrinsics.checkNotNullParameter(paymentTrackingDateFormatter4, "paymentTrackingDateFormatter");
                builderBuilderWithExpectedSize.put("KEY_STEP_LINK_CLAIMED", new c6k.h(paymentTrackingDateFormatter4, 4));
                c6k.a paymentTrackingDateFormatter5 = iVar5.a();
                Intrinsics.checkNotNullParameter(paymentTrackingDateFormatter5, "paymentTrackingDateFormatter");
                builderBuilderWithExpectedSize.put("KEY_STEP_FUNDS_RECEIVED", new c6k.h(paymentTrackingDateFormatter5, 2));
                c6k.a paymentTrackingDateFormatter6 = iVar5.a();
                Intrinsics.checkNotNullParameter(paymentTrackingDateFormatter6, "paymentTrackingDateFormatter");
                builderBuilderWithExpectedSize.put("KEY_STEP_FUNDS_RETURNED", new c6k.h(paymentTrackingDateFormatter6, 3));
                ImmutableMap immutableMapBuild = builderBuilderWithExpectedSize.build();
                l80.e eVarH6 = eVar12.h();
                vc.s.j(eVarH6);
                erf.k kVar2 = new erf.k(new erf.f(new c6k.e(immutableMapBuild, eVarH6, iVar5.a()), iVar5.a()), new erf.d(new erf.i(iVar5.a())), new erf.b(new erf.i(iVar5.a())), new erf.g());
                frf.a cardMapper = new frf.a();
                Intrinsics.checkNotNullParameter(cardMapper, "cardMapper");
                frf.g gVar2 = new frf.g();
                frf.a cardMapper2 = new frf.a();
                Intrinsics.checkNotNullParameter(cardMapper2, "cardMapper");
                frf.c cVar3 = new frf.c();
                frf.a cardMapper3 = new frf.a();
                Intrinsics.checkNotNullParameter(cardMapper3, "cardMapper");
                frf.e eVar13 = new frf.e();
                frf.h hVar6 = new frf.h();
                l80.e eVarH7 = iVar5.f199039j.h();
                vc.s.j(eVarH7);
                return new brf.a(kVar2, new frf.k(gVar2, cVar3, eVar13, hVar6, eVarH7), new grf.a());
            case 18:
                lpf.i iVar6 = (lpf.i) this.f196105b;
                lpf.v vVar2 = (lpf.v) this.d;
                int i102 = this.f196106c;
                if (i102 == 0) {
                    return new nqf.p(vVar2.f199092b, (nqf.l) vVar2.d.get(), (jki.p) vVar2.e.get());
                }
                if (i102 != 1) {
                    if (i102 == 2) {
                        return new nqf.b(new pqf.b(), new pqf.a());
                    }
                    throw new AssertionError(i102);
                }
                fk3.a aVarA3 = iVar6.f199040l.a();
                vc.s.j(aVarA3);
                return new nqf.c(aVarA3, new dnk.l(vVar2.f199093c.f199041m.g(), 2), iVar6.f199041m.g());
            case 19:
                lpf.i iVar7 = (lpf.i) this.f196105b;
                lpf.v vVar3 = (lpf.v) this.d;
                int i103 = this.f196106c;
                if (i103 == 0) {
                    return new nqf.p(vVar3.f199092b, (nqf.l) vVar3.d.get(), (jki.p) vVar3.e.get());
                }
                if (i103 != 1) {
                    if (i103 == 2) {
                        return new nqf.b(new pqf.b(), new pqf.a());
                    }
                    throw new AssertionError(i103);
                }
                fk3.a aVarA4 = iVar7.f199040l.a();
                vc.s.j(aVarA4);
                return new nqf.c(aVarA4, new dnk.l(vVar3.f199093c.f199041m.g(), 2), iVar7.f199041m.g());
            case 20:
                ls2.b bVar8 = (ls2.b) this.f196105b;
                ls2.a aVar17 = (ls2.a) this.d;
                xoi.d dVar3 = aVar17.f199597a;
                int i104 = this.f196106c;
                if (i104 == 0) {
                    return new iri.g((iri.j) bVar8.f199603c.get(), (iri.m) bVar8.d.get(), bq.i.f(dVar3), bq.i.l(dVar3));
                }
                if (i104 == 1) {
                    return new iri.l((iri.m) bVar8.d.get(), bq.i.f(dVar3), (iri.d) aVar17.d.get());
                }
                if (i104 == 2) {
                    return new iri.d(bq.i.f(dVar3));
                }
                if (i104 == 3) {
                    return new opi.b(bq.i.f(dVar3));
                }
                if (i104 == 4) {
                    return new ms2.k((ks2.a) bVar8.d.get(), (ms2.h) bVar8.e.get(), bq.i.e(dVar3), bq.i.l(dVar3));
                }
                throw new AssertionError(i104);
            case 21:
                ls2.b bVar9 = (ls2.b) this.f196105b;
                ls2.c cVar4 = (ls2.c) this.d;
                xoi.d dVar4 = cVar4.f199604a;
                int i105 = this.f196106c;
                if (i105 == 0) {
                    return new iri.g((iri.j) bVar9.f199603c.get(), (iri.m) bVar9.d.get(), bq.i.f(dVar4), bq.i.l(dVar4));
                }
                if (i105 == 1) {
                    return new iri.l((iri.m) bVar9.d.get(), bq.i.f(dVar4), (iri.d) cVar4.d.get());
                }
                if (i105 == 2) {
                    return new iri.d(bq.i.f(dVar4));
                }
                if (i105 == 3) {
                    return new cqi.j(bq.i.f(dVar4));
                }
                if (i105 == 4) {
                    return new os2.h((ks2.a) bVar9.d.get(), (cqi.h) cVar4.f.get(), bq.i.l(dVar4));
                }
                throw new AssertionError(i105);
            case 22:
                lti.g gVar3 = (lti.g) this.f196105b;
                poi.b bVar10 = gVar3.f;
                lti.a aVar18 = (lti.a) this.d;
                lti.g gVar4 = aVar18.f199879a;
                int i106 = this.f196106c;
                if (i106 == 0) {
                    com.revolut.kompot.navigable.a aVar19 = (com.revolut.kompot.navigable.a) aVar18.f199880b.get();
                    gti.h hVar7 = new gti.h(gVar4.e);
                    uo.q0 q0VarJ = bVar10.j();
                    uo.b bVarB = bVar10.b();
                    vc.s.j(bVarB);
                    ho.t tVarC = gVar4.f.c();
                    vc.s.j(tVarC);
                    return hsi.b.j(aVar19, hVar7, q0VarJ, bVarB, new gti.b(tVarC));
                }
                if (i106 != 1) {
                    if (i106 != 2) {
                        throw new AssertionError(i106);
                    }
                    n8b.a aVarA5 = gVar4.f199907g.a();
                    vc.s.j(aVarA5);
                    return new aui.k(new jvi.b(new k7i.i(aVarA5)), 1);
                }
                cli.n nVar3 = (cli.n) aVar18.d.get();
                mti.a aVar20 = (mti.a) gVar3.f199905b.f189547s.get();
                vc.s.j(aVar20);
                n8b.a aVarA6 = gVar4.f199907g.a();
                vc.s.j(aVarA6);
                return new xti.j(nVar3, aVar20, new zti.d(new k7i.i(aVarA6)));
            case 23:
                lti.g gVar5 = (lti.g) this.f196105b;
                poi.b bVar11 = gVar5.f;
                lti.b bVar12 = (lti.b) this.d;
                lti.g gVar6 = bVar12.f199882a;
                int i107 = this.f196106c;
                if (i107 == 0) {
                    com.revolut.kompot.navigable.a aVar21 = (com.revolut.kompot.navigable.a) bVar12.f199883b.get();
                    gti.h hVar8 = new gti.h(gVar6.e);
                    uo.q0 q0VarJ2 = bVar11.j();
                    uo.b bVarB2 = bVar11.b();
                    vc.s.j(bVarB2);
                    ho.t tVarC2 = gVar6.f.c();
                    vc.s.j(tVarC2);
                    return hsi.b.j(aVar21, hVar8, q0VarJ2, bVarB2, new gti.b(tVarC2));
                }
                if (i107 == 1) {
                    cli.n nVar4 = (cli.n) bVar12.d.get();
                    mti.a aVar22 = (mti.a) gVar5.f199905b.f189547s.get();
                    vc.s.j(aVar22);
                    return new aui.j(nVar4, aVar22);
                }
                if (i107 != 2) {
                    throw new AssertionError(i107);
                }
                n8b.a aVarA7 = gVar6.f199907g.a();
                vc.s.j(aVarA7);
                return new aui.k(new jvi.b(new k7i.i(aVarA7)), 0);
            case 24:
                poi.b bVar13 = ((lti.g) this.f196105b).f;
                lti.c cVar5 = (lti.c) this.d;
                lti.g gVar7 = cVar5.f199886b;
                AsftCancelBookingScreenContract$InputData asftCancelBookingScreenContract$InputData = cVar5.f199885a;
                int i108 = this.f196106c;
                if (i108 != 0) {
                    if (i108 == 1) {
                        return new com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.cancel_booking.a(asftCancelBookingScreenContract$InputData, (cli.n) cVar5.e.get());
                    }
                    if (i108 == 2) {
                        return new lui.j(asftCancelBookingScreenContract$InputData);
                    }
                    throw new AssertionError(i108);
                }
                com.revolut.kompot.navigable.a aVar23 = (com.revolut.kompot.navigable.a) cVar5.f199887c.get();
                gti.h hVar9 = new gti.h(gVar7.e);
                uo.q0 q0VarJ3 = bVar13.j();
                uo.b bVarB3 = bVar13.b();
                vc.s.j(bVarB3);
                ho.t tVarC3 = gVar7.f.c();
                vc.s.j(tVarC3);
                return hsi.b.j(aVar23, hVar9, q0VarJ3, bVarB3, new gti.b(tVarC3));
            case 25:
                return a();
            case 26:
                return b();
            case 27:
                return c();
            case 28:
                return d();
            default:
                poi.b bVar14 = ((lti.g) this.f196105b).f;
                lti.j jVar2 = (lti.j) this.d;
                lti.g gVar8 = jVar2.f199920b;
                int i109 = this.f196106c;
                if (i109 != 0) {
                    if (i109 == 1) {
                        return new jui.e((cli.n) jVar2.e.get());
                    }
                    if (i109 == 2) {
                        return new jui.f(jVar2.f199919a, new qui.j());
                    }
                    throw new AssertionError(i109);
                }
                com.revolut.kompot.navigable.a aVar24 = (com.revolut.kompot.navigable.a) jVar2.f199921c.get();
                gti.h hVar10 = new gti.h(gVar8.e);
                uo.q0 q0VarJ4 = bVar14.j();
                uo.b bVarB4 = bVar14.b();
                vc.s.j(bVarB4);
                ho.t tVarC4 = gVar8.f.c();
                vc.s.j(tVarC4);
                return hsi.b.j(aVar24, hVar10, q0VarJ4, bVarB4, new gti.b(tVarC4));
        }
    }
}
