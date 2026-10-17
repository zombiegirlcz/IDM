package l9f;

import akl.f1;
import akl.i0;
import akl.o0;
import akl.p1;
import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import bjl.p0;
import com.hcaptcha.sdk.HCaptchaConfig;
import com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.LitePosFlow;
import com.revolut.feature.pay_bills_taxes.api.navigation.BillPaymentNavigation$InputData;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.details.FormDetailsScreenContract$InputData;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.form.amount.FormAmountScreenContract$InputData;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.form.review.FormReviewScreenContract$InputData;
import com.revolut.feature.retail.privacy.impl.ui.flow.screen.extensions.discoverability.MakeMeDiscoverableDialogMapper;
import com.revolut.feature.subscriptions.impl.subscriptionlist.SubscriptionListContract$Configuration;
import com.revolut.feature_web_view.presentation.WebViewContract$WebViewConfiguration;
import com.revolut.kompot.navigable.screen.BaseScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import com.revolut.shared.feature.suspicious_transaction.impl.flow.SuspiciousTransactionFlowContract$InputData;
import com.revolut.shared.feature.suspicious_transaction.impl.ui.confirmation.SimpleConfirmationScreenContract$InputData;
import com.revolut.shared.feature.suspicious_transaction.impl.ui.suspicious_recipient.SuspiciousRecipientContract$InputData;
import com.revolut.sso.api.email.change.ChangeEmailInputData;
import com.revolut.sso.api.login.RevolutSsoApi$InputData$CombinedAuthentication;
import com.revolut.sso.api.models.UICustomization;
import com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$InputData;
import com.revolut.sso.impl.ui.phone.change_flow.ChangePhoneFlowContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import ljl.q0;
import ljl.t1;
import okl.n1;
import rp0.g1;
import rp0.x0;

/* JADX INFO: loaded from: classes8.dex */
public final class z implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f193242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f193243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f193244c;
    public final Object d;

    public /* synthetic */ z(Object obj2, Object obj3, int i, int i2) {
        this.f193242a = i2;
        this.f193243b = obj2;
        this.d = obj3;
        this.f193244c = i;
    }

    private final Object a() {
        lf9.m mVar = (lf9.m) this.f193243b;
        l70.e eVar = mVar.f194734b;
        nj0.a aVar = mVar.f194733a;
        lf9.n nVar = (lf9.n) this.d;
        lf9.m mVar2 = nVar.f194749b;
        int i = this.f193244c;
        switch (i) {
            case 0:
                wj0.a aVarI = ((nj0.d) aVar).i();
                vc.s.j(aVarI);
                l80.e eVarH = eVar.h();
                vc.s.j(eVarH);
                return m4d.e.d(aVarI, eVarH);
            case 1:
                wj0.a aVarI2 = ((nj0.d) aVar).i();
                vc.s.j(aVarI2);
                l80.e eVarH2 = eVar.h();
                vc.s.j(eVarH2);
                return m4d.e.c(aVarI2, eVarH2);
            case 2:
                Object extension = (vf9.a) nVar.f.get();
                wf9.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                yji.n nVar2 = (yji.n) extension;
                vc.s.k(nVar2);
                return nVar2;
            case 3:
                sf0.h hVarB = mVar2.f194735c.b();
                vc.s.j(hVarB);
                v60.e eVarA = mVar2.d.a();
                vc.s.j(eVarA);
                return new vf9.b(new ph9.c(hVarB, eVarA, 1));
            case 4:
                gf9.b extension2 = (gf9.b) nVar.f194752h.get();
                hf9.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension2, "extension");
                vc.s.k(extension2);
                return extension2;
            case 5:
                return new gf9.b();
            case 6:
                return new com.revolut.feature.pay_bills_taxes.impl.ui.flow.b(new nf9.f(mVar2.e.e(), mVar2.f.a()), (vf9.a) nVar.f.get());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object b() {
        lf9.m mVar = (lf9.m) this.f193243b;
        lf9.q qVar = (lf9.q) this.d;
        int i = this.f193244c;
        switch (i) {
            case 0:
                wj0.a aVarI = ((nj0.d) mVar.f194733a).i();
                vc.s.j(aVarI);
                l80.e eVarH = mVar.f194734b.h();
                vc.s.j(eVarH);
                return m4d.e.d(aVarI, eVarH);
            case 1:
                wj0.a aVarI2 = ((nj0.d) mVar.f194733a).i();
                vc.s.j(aVarI2);
                l80.e eVarH2 = mVar.f194734b.h();
                vc.s.j(eVarH2);
                return m4d.e.c(aVarI2, eVarH2);
            case 2:
                rh9.e extension = (rh9.e) qVar.f.get();
                hh9.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                vc.s.k(extension);
                return extension;
            case 3:
                BillPaymentNavigation$InputData billPaymentNavigation$InputData = qVar.f194778a;
                wsg.n nVarB = mVar.f194739l.b();
                u5k.c cVar = (u5k.c) mVar.f194747w.get();
                rh9.a aVar = new rh9.a();
                sh9.a aVar2 = new sh9.a();
                gte.a aVarB = qVar.f194779b.k.b();
                vc.s.j(aVarB);
                return new rh9.e(billPaymentNavigation$InputData, nVarB, cVar, aVar, aVar2, new l1l.s(aVarB));
            case 4:
                nh9.d extension2 = (nh9.d) qVar.i.get();
                hh9.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension2, "extension");
                vc.s.k(extension2);
                return extension2;
            case 5:
                BillPaymentNavigation$InputData billPaymentNavigation$InputData2 = qVar.f194778a;
                gf9.b bVar = (gf9.b) qVar.f194782h.get();
                wo1.b bVarB = ((up1.e) mVar.f194736g).b();
                vc.s.j(bVarB);
                return new nh9.d(billPaymentNavigation$InputData2, bVar, bVarB, mVar.f194739l.b(), new nh9.h());
            case 6:
                return new gf9.b();
            case 7:
                Object extension3 = (nh9.e) qVar.f194784l.get();
                hh9.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension3, "extension");
                yji.n nVar = (yji.n) extension3;
                vc.s.k(nVar);
                return nVar;
            case 8:
                return new nh9.f(qVar.q(), (ph9.a) qVar.k.get());
            case 9:
                return new ph9.b(qVar.q());
            case 10:
                Object extension4 = (ph9.a) qVar.k.get();
                qh9.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension4, "extension");
                yji.n nVar2 = (yji.n) extension4;
                vc.s.k(nVar2);
                return nVar2;
            case 11:
                gf9.b extension5 = (gf9.b) qVar.f194782h.get();
                hf9.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension5, "extension");
                vc.s.k(extension5);
                return extension5;
            case 12:
                BillPaymentNavigation$InputData billPaymentNavigation$InputData3 = qVar.f194778a;
                ph9.a aVar3 = (ph9.a) qVar.k.get();
                b3a.a aVarA = mVar.f194741n.a();
                vc.s.j(aVarA);
                co9.b bVarB2 = mVar.o.b();
                vc.s.j(bVarB2);
                return new com.revolut.feature.pay_bills_taxes.impl.ui_payment.a(billPaymentNavigation$InputData3, aVar3, aVarA, bVarB2);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object c() {
        q0 q0Var = (q0) this.f193243b;
        ljl.c cVar = (ljl.c) this.d;
        int i = this.f193244c;
        switch (i) {
            case 0:
                tll.f extension = (tll.f) cVar.C.get();
                pkl.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                vc.s.k(extension);
                return extension;
            case 1:
                return new tll.f((tll.e) cVar.B.get());
            case 2:
                e4m.e eVar = cVar.f195895h;
                AuthenticationFlowContract$InputData authenticationFlowContract$InputData = cVar.d;
                q0 q0Var2 = cVar.f;
                qkl.h hVar = (qkl.h) eVar.get();
                e4m.e eVar2 = q0Var.p0;
                l70.e eVar3 = q0Var.f196062g;
                n1 n1Var = (n1) eVar2.get();
                mp.p pVarS = cVar.s();
                vkl.d dVar = (vkl.d) cVar.i.get();
                q0Var.v.getClass();
                bs.a aVar = new bs.a();
                xkl.i iVar = (xkl.i) cVar.f195901q.get();
                zkl.a aVar2 = (zkl.a) cVar.f195902r.get();
                gu2.e eVar4 = (gu2.e) cVar.f195900p.get();
                gu2.e captchaViewControllerExtension = (gu2.e) cVar.f195900p.get();
                akl.l claimsRepository = (akl.l) q0Var2.U.get();
                mni.a otpDispatcher = q0Var2.u.a();
                vc.s.j(otpDispatcher);
                Intrinsics.checkNotNullParameter(captchaViewControllerExtension, "captchaViewControllerExtension");
                Intrinsics.checkNotNullParameter(claimsRepository, "claimsRepository");
                Intrinsics.checkNotNullParameter(otpDispatcher, "otpDispatcher");
                wll.c cVar2 = new wll.c(captchaViewControllerExtension, claimsRepository, otpDispatcher);
                xjl.h hVar2 = (xjl.h) q0Var.f0.get();
                yil.a aVar3 = cVar.f195892b;
                mki.b bVar = cVar.f195893c;
                fkg.a aVarD = q0Var.d();
                pml.d dVar2 = (pml.d) cVar.f195903s.get();
                dm0.d dVar3 = (dm0.d) q0Var.f196068m.o.get();
                vc.s.j(dVar3);
                jol.b bVar2 = (jol.b) q0Var.I.get();
                f1 f1Var = (f1) q0Var2.P.get();
                i0 i0VarF = q0Var2.f();
                f86.a aVar4 = (f86.a) q0Var2.f196081w.d.get();
                vc.s.j(aVar4);
                com.revolut.sso.impl.ui.auth.a aVar5 = new com.revolut.sso.impl.ui.auth.a(authenticationFlowContract$InputData, f1Var, i0VarF, aVar4);
                inl.b bVar3 = (inl.b) cVar.f195904t.get();
                pnl.d dVar4 = (pnl.d) cVar.u.get();
                tnl.e eVar5 = (tnl.e) cVar.v.get();
                lkl.a aVar6 = (lkl.a) q0Var.f196084x0.get();
                mni.a aVarA = q0Var.u.a();
                vc.s.j(aVarA);
                tll.n nVar = (tll.n) q0Var.y0.get();
                col.c cVar3 = (col.c) cVar.f195905w.get();
                vnl.l lVar = (vnl.l) cVar.f195906x.get();
                knl.d dVar5 = (knl.d) cVar.f195907y.get();
                nkl.a aVar7 = new nkl.a();
                v60.g gVarA = ((a0b.d) q0Var.f196085y).a();
                uil.a aVarA2 = q0Var.f196057b.a();
                vc.s.j(aVarA2);
                p0 p0Var = (p0) q0Var.H.get();
                zpl.a aVar8 = (zpl.a) cVar.z.get();
                com.google.firebase.messaging.t tVarJ = q0Var.j();
                ConnectivityManager connectivityManager = (ConnectivityManager) eVar3.f192451y.get();
                vc.s.j(connectivityManager);
                nj0.d dVar6 = (nj0.d) q0Var.f196065j;
                ak0.a instrumentationTestDecorator = new ak0.a(dVar6.f216295c);
                ak0.c loggingDecorator = new ak0.c(dVar6.f216295c);
                t1.Companion.getClass();
                Intrinsics.checkNotNullParameter(instrumentationTestDecorator, "instrumentationTestDecorator");
                Intrinsics.checkNotNullParameter(loggingDecorator, "loggingDecorator");
                a61.a aVar9 = new a61.a(connectivityManager, new p1(instrumentationTestDecorator, loggingDecorator));
                q0Var.z.getClass();
                b5l.a aVar10 = new b5l.a();
                tll.s sVar = (tll.s) q0Var.z0.get();
                kql.f fVar = (kql.f) cVar.A.get();
                fkl.i iVar2 = (fkl.i) q0Var.j0.get();
                ynl.c cVar4 = (ynl.c) q0Var.B0.get();
                iol.c cVar5 = (iol.c) q0Var.D0.get();
                UICustomization uICustomization = cVar.e;
                f80.a aVarX = eVar3.x();
                vc.s.j(aVarX);
                rqk.m mVarB = q0Var.f196063h.b();
                o0 o0Var = (o0) q0Var.R.get();
                uil.a aVarA3 = q0Var2.f196057b.a();
                vc.s.j(aVarA3);
                return new com.revolut.sso.impl.ui.auth.n(hVar, n1Var, pVarS, dVar, aVar, iVar, aVar2, eVar4, cVar2, hVar2, aVar3, bVar, aVarD, dVar2, dVar3, bVar2, aVar5, authenticationFlowContract$InputData, bVar3, dVar4, eVar5, aVar6, aVarA, nVar, cVar3, lVar, dVar5, aVar7, gVarA, aVarA2, p0Var, aVar8, tVarJ, aVar9, aVar10, sVar, fVar, iVar2, cVar4, cVar5, uICustomization, aVarX, mVarB, o0Var, new kol.b(aVarA3, (p0) q0Var2.H.get()));
            case 3:
                return new qkl.j((n1) q0Var.p0.get());
            case 4:
                return new vkl.e(cVar.s());
            case 5:
                Activity activity = (Activity) cVar.k.get();
                xkl.l lVar2 = (xkl.l) cVar.f195898m.get();
                vfg.p pVar = new vfg.p(cVar.f.f.a());
                gu2.e eVar6 = (gu2.e) cVar.f195900p.get();
                akl.l lVar3 = (akl.l) q0Var.U.get();
                p0 p0Var2 = (p0) q0Var.H.get();
                jn0.d dVar7 = (jn0.d) q0Var.f.I.get();
                vc.s.j(dVar7);
                return new xkl.i(activity, lVar2, pVar, eVar6, lVar3, p0Var2, dVar7);
            case 6:
                return jr9.h.e((com.revolut.kompot.navigable.a) cVar.f195896j.get());
            case 7:
                return new xkl.l((f01.a) cVar.f195897l.get());
            case 8:
                ViewController flow = cVar.f195891a;
                pkl.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(flow, "flow");
                return new f01.c(flow.m2());
            case 9:
                hu2.a aVar11 = (hu2.a) cVar.f195899n.get();
                com.hcaptcha.sdk.a aVarL = jr9.h.l((Activity) cVar.k.get());
                HCaptchaConfig hCaptchaConfigM = jr9.h.m((String) cVar.o.get());
                aoi.c cVarA = aoi.f.a();
                dm0.d dVarD = cVar.f.f196068m.d();
                vc.s.j(dVarD);
                return jr9.h.x(aVar11, new ku2.h(aVarL, hCaptchaConfigM, cVarA, dVarD));
            case 10:
                return new hu2.d();
            case 11:
                p0 revolutSsoDependenciesProvider = (p0) q0Var.H.get();
                pkl.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(revolutSsoDependenciesProvider, "revolutSsoDependenciesProvider");
                String str = ((rqk.k) revolutSsoDependenciesProvider).f256594q;
                vc.s.k(str);
                return str;
            case 12:
                return new zkl.a((n1) q0Var.p0.get(), (p0) q0Var.H.get());
            case 13:
                return new pml.e(q0Var.d());
            case 14:
                return new inl.c();
            case 15:
                return new pnl.d();
            case 16:
                Activity activity2 = (Activity) cVar.k.get();
                f70.a aVar12 = (f70.a) q0Var.f196062g.f192449w.get();
                vc.s.j(aVar12);
                return new tnl.g(activity2, aVar12);
            case 17:
                com.revolut.kompot.navigable.a aVar13 = (com.revolut.kompot.navigable.a) cVar.f195896j.get();
                wl0.c cVarA2 = q0Var.f.a();
                ph0.d dVarA = t2d.c.a(q0Var.i.f271230a);
                l80.e eVarH = q0Var.f196062g.h();
                vc.s.j(eVarH);
                return new col.i(aVar13, cVarA2, dVarA, eVarH);
            case 18:
                return new vnl.p((bjl.f) q0Var.f196066k0.get());
            case 19:
                s70.a aVarM = q0Var.f196062g.m();
                vc.s.j(aVarM);
                y80.a aVarR = q0Var.f196062g.r();
                vc.s.j(aVarR);
                w39.b bVarA = q0Var.f196083x.a();
                vc.s.j(bVarA);
                return new knl.h(aVarM, aVarR, bVarA);
            case 20:
                gu2.e eVar7 = (gu2.e) cVar.f195900p.get();
                akl.k kVar = (akl.k) q0Var.T.get();
                akl.l lVar4 = (akl.l) q0Var.U.get();
                fi0.b bVar4 = new fi0.b(q0Var.f196068m.f, 1);
                jn0.d dVar8 = (jn0.d) q0Var.f.I.get();
                vc.s.j(dVar8);
                return new zpl.g(eVar7, kVar, lVar4, bVar4, dVar8);
            case 21:
                zkl.a aVar14 = (zkl.a) cVar.f195902r.get();
                jol.b bVar5 = (jol.b) q0Var.I.get();
                tll.n nVar2 = (tll.n) q0Var.y0.get();
                p0 p0Var3 = (p0) q0Var.H.get();
                tll.s sVar2 = (tll.s) q0Var.z0.get();
                q0Var.z.getClass();
                return new kql.h(aVar14, bVar5, nVar2, p0Var3, sVar2, new b5l.a());
            case 22:
                return new c84.w((tnl.e) cVar.v.get());
            case 23:
                Object extension2 = (qkl.h) cVar.f195895h.get();
                rkl.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension2, "extension");
                yji.n nVar3 = (yji.n) extension2;
                vc.s.k(nVar3);
                return nVar3;
            case 24:
                Object extension3 = (vkl.d) cVar.i.get();
                wkl.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension3, "extension");
                yji.n nVar4 = (yji.n) extension3;
                vc.s.k(nVar4);
                return nVar4;
            case 25:
                xkl.i extension4 = (xkl.i) cVar.f195901q.get();
                ykl.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension4, "extension");
                xkl.i iVar3 = extension4;
                vc.s.k(iVar3);
                return iVar3;
            case 26:
                zkl.a extension5 = (zkl.a) cVar.f195902r.get();
                all.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension5, "extension");
                vc.s.k(extension5);
                return extension5;
            case 27:
                Object extension6 = (pml.d) cVar.f195903s.get();
                qml.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension6, "extension");
                yji.n nVar5 = (yji.n) extension6;
                vc.s.k(nVar5);
                return nVar5;
            case 28:
                pnl.d extension7 = (pnl.d) cVar.u.get();
                qnl.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension7, "extension");
                vc.s.k(extension7);
                return extension7;
            case 29:
                return db5.e.s((col.c) cVar.f195905w.get());
            case 30:
                Object extension8 = (vnl.l) cVar.f195906x.get();
                wnl.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension8, "extension");
                yji.n nVar6 = (yji.n) extension8;
                vc.s.k(nVar6);
                return nVar6;
            case 31:
                Object extension9 = (knl.d) cVar.f195907y.get();
                lnl.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension9, "extension");
                yji.n nVar7 = (yji.n) extension9;
                vc.s.k(nVar7);
                return nVar7;
            case 32:
                Object extension10 = (kql.f) cVar.A.get();
                lql.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension10, "extension");
                yji.n nVar8 = (yji.n) extension10;
                vc.s.k(nVar8);
                return nVar8;
            case 33:
                gu2.e eVar8 = (gu2.e) cVar.f195900p.get();
                jr9.h.h(eVar8);
                return eVar8;
            case 34:
                Object extension11 = (inl.b) cVar.f195904t.get();
                jnl.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension11, "extension");
                yji.n nVar9 = (yji.n) extension11;
                vc.s.k(nVar9);
                return nVar9;
            case 35:
                akl.z zVarC = q0Var.c();
                f01.a aVar15 = (f01.a) cVar.f195897l.get();
                gnl.a aVarY = cVar.y();
                z80.b bVarS = q0Var.f196062g.s();
                vc.s.j(bVarS);
                return new gnl.v(zVarC, aVar15, aVarY, bVarS);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object d() {
        q0 q0Var = (q0) this.f193243b;
        ljl.f fVar = (ljl.f) this.d;
        q0 q0Var2 = fVar.f195933c;
        int i = this.f193244c;
        switch (i) {
            case 0:
                ChangeEmailInputData changeEmailInputData = fVar.f195931a;
                gu2.e eVar = (gu2.e) fVar.i.get();
                akl.l lVar = (akl.l) q0Var2.U.get();
                rql.a aVarB = q0Var2.o.b();
                vc.s.j(aVarB);
                bjl.o0 o0Var = (bjl.o0) q0Var2.f196077s0.get();
                mni.a aVarA = q0Var2.u.a();
                vc.s.j(aVarA);
                return new com.revolut.sso.impl.ui.email.change_flow.a(changeEmailInputData, new wll.e(eVar, lVar, aVarB, o0Var, aVarA), (jol.b) q0Var.I.get(), new nkl.a(), (o0) q0Var.R.get(), (xjl.h) q0Var.f0.get(), (g1) fVar.f195936j.get(), q0Var.f196063h.b());
            case 1:
                hu2.a aVar = (hu2.a) fVar.e.get();
                com.hcaptcha.sdk.a aVarL = jr9.h.l((Activity) fVar.f195934g.get());
                HCaptchaConfig hCaptchaConfigM = jr9.h.m((String) fVar.f195935h.get());
                aoi.c cVarA = aoi.f.a();
                dm0.d dVarD = q0Var2.f196068m.d();
                vc.s.j(dVarD);
                return jr9.h.x(aVar, new ku2.h(aVarL, hCaptchaConfigM, cVarA, dVarD));
            case 2:
                return new hu2.d();
            case 3:
                return jr9.h.e((com.revolut.kompot.navigable.a) fVar.f.get());
            case 4:
                p0 revolutSsoDependenciesProvider = (p0) q0Var.H.get();
                uml.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(revolutSsoDependenciesProvider, "revolutSsoDependenciesProvider");
                String str = ((rqk.k) revolutSsoDependenciesProvider).f256594q;
                vc.s.k(str);
                return str;
            case 5:
                ViewController controller = fVar.f195932b;
                uml.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller, "controller");
                return x0.a(g1.Companion, controller.C2().D2());
            case 6:
                gu2.e eVar2 = (gu2.e) fVar.i.get();
                jr9.h.h(eVar2);
                return eVar2;
            default:
                throw new AssertionError(i);
        }
    }

    private final Object e() {
        q0 q0Var = (q0) this.f193243b;
        ljl.h hVar = (ljl.h) this.d;
        int i = this.f193244c;
        switch (i) {
            case 0:
                zkl.a extension = (zkl.a) hVar.e.get();
                all.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                vc.s.k(extension);
                return extension;
            case 1:
                return new zkl.a((n1) q0Var.p0.get(), (p0) q0Var.H.get());
            case 2:
                Object extension2 = (kql.f) hVar.f195957g.get();
                lql.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension2, "extension");
                yji.n nVar = (yji.n) extension2;
                vc.s.k(nVar);
                return nVar;
            case 3:
                zkl.a aVar = (zkl.a) hVar.e.get();
                jol.b bVar = (jol.b) q0Var.I.get();
                tll.n nVar2 = (tll.n) q0Var.y0.get();
                p0 p0Var = (p0) q0Var.H.get();
                tll.s sVar = (tll.s) q0Var.z0.get();
                q0Var.z.getClass();
                return new kql.h(aVar, bVar, nVar2, p0Var, sVar, new b5l.a());
            case 4:
                gu2.e eVar = (gu2.e) hVar.f195961m.get();
                q0 q0Var2 = hVar.f195956c;
                akl.l lVar = (akl.l) q0Var2.U.get();
                rql.a aVarB = q0Var2.o.b();
                vc.s.j(aVarB);
                bjl.o0 o0Var = (bjl.o0) q0Var2.f196077s0.get();
                mni.a aVarA = q0Var2.u.a();
                vc.s.j(aVarA);
                wll.e eVar2 = new wll.e(eVar, lVar, aVarB, o0Var, aVarA);
                jol.b bVar2 = (jol.b) q0Var.I.get();
                ChangePhoneFlowContract$InputData changePhoneFlowContract$InputData = hVar.f195954a;
                z80.b bVarS = q0Var.f196062g.s();
                vc.s.j(bVarS);
                return new com.revolut.sso.impl.ui.phone.change_flow.b(eVar2, bVar2, changePhoneFlowContract$InputData, bVarS, new nkl.a(), (o0) q0Var.R.get(), (g1) hVar.f195962n.get(), (kql.f) hVar.f195957g.get(), q0Var.f196063h.b());
            case 5:
                hu2.a aVar2 = (hu2.a) hVar.i.get();
                com.hcaptcha.sdk.a aVarL = jr9.h.l((Activity) hVar.k.get());
                HCaptchaConfig hCaptchaConfigM = jr9.h.m((String) hVar.f195960l.get());
                aoi.c cVarA = aoi.f.a();
                dm0.d dVarD = hVar.f195956c.f196068m.d();
                vc.s.j(dVarD);
                return jr9.h.x(aVar2, new ku2.h(aVarL, hCaptchaConfigM, cVarA, dVarD));
            case 6:
                return new hu2.d();
            case 7:
                return jr9.h.e((com.revolut.kompot.navigable.a) hVar.f195959j.get());
            case 8:
                p0 revolutSsoDependenciesProvider = (p0) q0Var.H.get();
                ool.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(revolutSsoDependenciesProvider, "revolutSsoDependenciesProvider");
                String str = ((rqk.k) revolutSsoDependenciesProvider).f256594q;
                vc.s.k(str);
                return str;
            case 9:
                ViewController controller = hVar.f195955b;
                ool.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller, "controller");
                return x0.a(g1.Companion, controller.C2().D2());
            case 10:
                gu2.e eVar3 = (gu2.e) hVar.f195961m.get();
                jr9.h.h(eVar3);
                return eVar3;
            case 11:
                akl.z zVarC = q0Var.c();
                f01.a aVar3 = (f01.a) hVar.f195964q.get();
                q0 q0Var3 = hVar.f195956c;
                Context context = q0Var3.f196055a;
                g90.a aVarW = q0Var3.f196062g.w();
                vc.s.j(aVarW);
                gnl.a aVar4 = new gnl.a(context, aVarW);
                z80.b bVarS2 = q0Var.f196062g.s();
                vc.s.j(bVarS2);
                return new gnl.v(zVarC, aVar3, aVar4, bVarS2);
            case 12:
                ViewController flow = hVar.f195955b;
                ool.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(flow, "flow");
                return new f01.c(flow.m2());
            default:
                throw new AssertionError(i);
        }
    }

    @Override // phm.a
    public final Object get() {
        Object hVar;
        Object eVar;
        Object cVar;
        Object bVar;
        Object cVar2;
        Object aVar;
        Object gVar;
        Object iVar;
        switch (this.f193242a) {
            case 0:
                w wVar = (w) this.d;
                int i = this.f193244c;
                if (i == 0) {
                    return new eaf.q(wVar.f193232b, (o9f.c) ((k) this.f193243b).P.get(), (cli.n) wVar.f193233c.get());
                }
                if (i == 1) {
                    return new eaf.r();
                }
                throw new AssertionError(i);
            case 1:
                y yVar = (y) this.d;
                int i2 = this.f193244c;
                if (i2 == 0) {
                    return kxa.j.k((j60.a) yVar.f.get());
                }
                if (i2 == 1) {
                    return ehe.n.s((com.revolut.kompot.navigable.a) yVar.d.get(), (rp0.m) yVar.e.get());
                }
                if (i2 == 2) {
                    return new rp0.m();
                }
                if (i2 == 3) {
                    return new t9f.o(yVar.f193238b, (w80.b) yVar.f193241h.get(), new t9f.a((w80.b) yVar.f193241h.get()), (j60.a) yVar.f.get());
                }
                if (i2 != 4) {
                    throw new AssertionError(i2);
                }
                qd0.b languageProvider = ((k) this.f193243b).f193185g.n();
                vc.s.j(languageProvider);
                u9f.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
                return v80.b.b(languageProvider, false, false, 58);
            case 2:
                lal.c cVar3 = (lal.c) this.d;
                int i3 = this.f193244c;
                if (i3 == 0) {
                    hVar = new xal.h((jki.p) cVar3.f193433c.get(), cVar3.f193431a, (fal.b) ((lal.k) this.f193243b).f193459j.get());
                } else {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            return new tal.f();
                        }
                        throw new AssertionError(i3);
                    }
                    hVar = new xal.j((tal.e) cVar3.f193432b.get());
                }
                return hVar;
            case 3:
                lal.e eVar2 = (lal.e) this.d;
                int i5 = this.f193244c;
                if (i5 == 0) {
                    return new abl.g((jki.p) eVar2.f193437b.get(), (fal.b) ((lal.k) this.f193243b).f193459j.get(), eVar2.f193436a);
                }
                if (i5 == 1) {
                    return new abl.h();
                }
                throw new AssertionError(i5);
            case 4:
                lal.h hVar2 = (lal.h) this.d;
                int i6 = this.f193244c;
                if (i6 == 0) {
                    jki.p pVar = (jki.p) hVar2.f193447c.get();
                    SimpleConfirmationScreenContract$InputData simpleConfirmationScreenContract$InputData = hVar2.f193445a;
                    f80.a aVarX = ((lal.k) this.f193243b).d.x();
                    vc.s.j(aVarX);
                    eVar = new yal.e(pVar, simpleConfirmationScreenContract$InputData, aVarX);
                } else {
                    if (i6 != 1) {
                        if (i6 == 2) {
                            return new tal.f();
                        }
                        throw new AssertionError(i6);
                    }
                    eVar = new yal.g((tal.e) hVar2.f193446b.get());
                }
                return eVar;
            case 5:
                lal.k kVar = (lal.k) this.f193243b;
                lal.i iVar2 = (lal.i) this.d;
                int i21 = this.f193244c;
                if (i21 != 0) {
                    if (i21 == 1) {
                        return new dbl.f();
                    }
                    throw new AssertionError(i21);
                }
                cli.n nVar = (cli.n) iVar2.f193449b.get();
                SuspiciousRecipientContract$InputData suspiciousRecipientContract$InputData = iVar2.f193448a;
                cal.a aVar2 = (cal.a) kVar.f193455b.f.get();
                vc.s.j(aVar2);
                t9l.g gVarA = kVar.f193456c.a();
                vc.s.j(gVarA);
                return new dbl.e(nVar, suspiciousRecipientContract$InputData, aVar2, gVarA);
            case 6:
                lal.k kVar2 = (lal.k) this.f193243b;
                lfe.b bVar2 = kVar2.f193455b;
                int i22 = this.f193244c;
                if (i22 != 0) {
                    if (i22 == 1) {
                        return new com.revolut.shared.feature.suspicious_transaction.impl.flow.b();
                    }
                    throw new AssertionError(i22);
                }
                lal.l lVar = (lal.l) this.d;
                SuspiciousTransactionFlowContract$InputData suspiciousTransactionFlowContract$InputData = lVar.f193462c;
                nal.f fVar = (nal.f) lVar.f.get();
                cal.a aVar3 = (cal.a) bVar2.f.get();
                vc.s.j(aVar3);
                ife.c cVar4 = (ife.c) bVar2.f194859g.get();
                vc.s.j(cVar4);
                f80.a aVarX2 = kVar2.d.x();
                vc.s.j(aVarX2);
                return new com.revolut.shared.feature.suspicious_transaction.impl.flow.a(suspiciousTransactionFlowContract$InputData, fVar, aVar3, cVar4, aVarX2, (fal.b) kVar2.f193459j.get(), new bbl.a());
            case 7:
                fc4.c cVar5 = (fc4.c) this.f193243b;
                lc4.a aVar4 = (lc4.a) this.d;
                int i32 = this.f193244c;
                switch (i32) {
                    case 0:
                        return kpi.f.a();
                    case 1:
                        Context contextI = bq.i.i(aVar4.f193788a);
                        BaseDelegatesActivity baseDelegatesActivityF = bq.i.f(aVar4.f193788a);
                        t70.g gVarO = cVar5.f133638b.o();
                        vc.s.j(gVarO);
                        cVar = new npi.c(contextI, baseDelegatesActivityF, gVarO);
                        break;
                    case 2:
                        return new tpi.i((rpi.c) aVar4.f.get(), gsi.c.a(aVar4.f193788a));
                    case 3:
                        return new rpi.b(bq.i.b(aVar4.f193788a));
                    case 4:
                        return new rpi.h(bq.i.b(aVar4.f193788a));
                    case 5:
                        iri.j jVar = (iri.j) cVar5.f.get();
                        e4m.e eVar3 = aVar4.i;
                        fsi.g gVar2 = aVar4.f193788a;
                        cVar = new iri.g(jVar, (iri.m) eVar3.get(), bq.i.f(gVar2), bq.i.l(gVar2));
                        break;
                    case 6:
                        return new iri.b();
                    case 7:
                        return new iri.l((iri.m) aVar4.i.get(), bq.i.f(aVar4.f193788a), (iri.d) aVar4.k.get());
                    case 8:
                        return new iri.d(bq.i.f(aVar4.f193788a));
                    case 9:
                        return new opi.b(bq.i.f(aVar4.f193788a));
                    case 10:
                        sri.m mVarL = bq.i.l(aVar4.f193788a);
                        WebViewContract$WebViewConfiguration webViewContract$WebViewConfiguration = aVar4.f193789b;
                        fc4.c cVar6 = aVar4.f193790c;
                        pgi.l lVar2 = (pgi.l) ((e4m.e) cVar6.i).get();
                        wli.x xVarD = ((s41.a) cVar6.d).d();
                        sri.m mVarL2 = bq.i.l(aVar4.f193788a);
                        f80.a aVarX3 = cVar6.f133638b.x();
                        vc.s.j(aVarX3);
                        return new kc4.b(mVarL, new pgi.s(webViewContract$WebViewConfiguration, lVar2, xVarD, mVarL2, aVarX3));
                    default:
                        throw new AssertionError(i32);
                }
                return cVar;
            case 8:
                lcb.c cVar7 = (lcb.c) this.d;
                lcb.a aVar5 = cVar7.f193829a;
                lcb.a aVar6 = (lcb.a) this.f193243b;
                c21.e eVar4 = aVar6.f193819b;
                int i33 = this.f193244c;
                switch (i33) {
                    case 0:
                        return kxa.j.l((j60.a) cVar7.d.get());
                    case 1:
                        return h30.l.p((com.revolut.kompot.navigable.a) cVar7.f193830b.get(), (rp0.m) cVar7.f193831c.get());
                    case 2:
                        return new rp0.m();
                    case 3:
                        Object extension = (rcb.e) cVar7.f.get();
                        qcb.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension, "extension");
                        yji.n nVar2 = (yji.n) extension;
                        vc.s.k(nVar2);
                        return nVar2;
                    case 4:
                        bVar = new com.revolut.feature.retail.privacy.impl.ui.flow.screen.extensions.discoverability.b(new MakeMeDiscoverableDialogMapper(), (j60.a) cVar7.d.get(), aVar6.f193818a.e(), ((c21.b) eVar4).c());
                        break;
                    case 5:
                        jki.p pVar2 = (jki.p) cVar7.f193833h.get();
                        ekg.g gVarB = aVar6.f193820c.b();
                        y21.c cVarC = ((c21.b) eVar4).c();
                        loi.a aVar7 = (loi.a) aVar6.d.f238037t0.get();
                        vc.s.j(aVar7);
                        xoj.a aVarA = aVar6.e.a();
                        vc.s.j(aVarA);
                        l93.f fVarJ = aVar6.f.j();
                        vc.s.j(fVarJ);
                        am2.a aVarI = aVar6.f193821g.f136165a.i();
                        rcb.e eVar5 = (rcb.e) cVar7.f.get();
                        gte.a aVarB = aVar6.f193822h.b();
                        vc.s.j(aVarB);
                        xoj.a aVarA2 = aVar5.e.a();
                        vc.s.j(aVarA2);
                        pak.h hVar3 = new pak.h(aVarA2);
                        eub.k kVar3 = (eub.k) aVar6.i.Q.get();
                        vc.s.j(kVar3);
                        rea.e eVarE = aVar6.f193823j.e();
                        tbk.b bVar3 = (tbk.b) aVar5.k.v.get();
                        vc.s.j(bVar3);
                        bVar = new ocb.x(pVar2, gVarB, cVarC, aVar7, aVarA, fVarJ, aVarI, eVar5, aVarB, hVar3, kVar3, eVarE, new jid.z(bVar3, ((c21.b) aVar5.f193819b).c()));
                        break;
                    case 6:
                        return new com.revolut.feature.retail.privacy.impl.ui.flow.screen.b();
                    default:
                        throw new AssertionError(i33);
                }
                return bVar;
            case 9:
                lce.b bVar4 = (lce.b) this.f193243b;
                lce.a aVar8 = (lce.a) this.d;
                int i43 = this.f193244c;
                switch (i43) {
                    case 0:
                        return kpi.f.a();
                    case 1:
                        Context contextI2 = bq.i.i(aVar8.f193870a);
                        BaseDelegatesActivity baseDelegatesActivityF2 = bq.i.f(aVar8.f193870a);
                        t70.g gVarO2 = bVar4.f193879a.o();
                        vc.s.j(gVarO2);
                        cVar2 = new npi.c(contextI2, baseDelegatesActivityF2, gVarO2);
                        break;
                    case 2:
                        return new tpi.i((rpi.c) aVar8.f.get(), gsi.c.a(aVar8.f193870a));
                    case 3:
                        return new rpi.b(bq.i.b(aVar8.f193870a));
                    case 4:
                        return new rpi.h(bq.i.b(aVar8.f193870a));
                    case 5:
                        cVar2 = new iri.g((iri.j) bVar4.f.get(), (iri.m) bVar4.f193882g.get(), bq.i.f(aVar8.f193870a), bq.i.l(aVar8.f193870a));
                        break;
                    case 6:
                        cVar2 = new iri.l((iri.m) bVar4.f193882g.get(), bq.i.f(aVar8.f193870a), (iri.d) aVar8.f193875j.get());
                        break;
                    case 7:
                        return new iri.d(bq.i.f(aVar8.f193870a));
                    case 8:
                        return new opi.b(bq.i.f(aVar8.f193870a));
                    case 9:
                        return new xpi.c(aVar8.f193871b, bq.i.b(aVar8.f193870a));
                    case 10:
                        g9e.a aVarC = bVar4.f193880b.c();
                        vc.s.j(aVarC);
                        sri.m mVarL3 = bq.i.l(aVar8.f193870a);
                        xpi.g gVar3 = (xpi.g) aVar8.f193877m.get();
                        kce.a aVar9 = (kce.a) bVar4.f193883h.get();
                        a9e.h hVar4 = (a9e.h) aVar8.f193878n.get();
                        SubscriptionListContract$Configuration subscriptionListContract$Configuration = aVar8.f193872c;
                        nhf.a aVarA3 = bVar4.f193881c.a();
                        vc.s.j(aVarA3);
                        ice.o oVar = new ice.o(aVarC, mVarL3, gVar3, aVar9, hVar4, subscriptionListContract$Configuration, aVarA3);
                        kli.a.p(oVar, bq.i.d(aVar8.f193870a));
                        return oVar;
                    case 11:
                        mae.p factory = bVar4.f193880b.e();
                        vc.s.j(factory);
                        f01.c uiKitResources = bq.i.o(aVar8.f193870a);
                        t70.b currenciesLocalization = bVar4.f193879a.g();
                        vc.s.j(currenciesLocalization);
                        jce.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory, "factory");
                        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
                        Intrinsics.checkNotNullParameter(currenciesLocalization, "currenciesLocalization");
                        return factory.d(uiKitResources, currenciesLocalization);
                    default:
                        throw new AssertionError(i43);
                }
                return cVar2;
            case 10:
                l70.e eVar6 = ((ld1.l) this.f193243b).e;
                int i59 = this.f193244c;
                if (i59 == 0) {
                    return new com.revolut.feature.acquiring.lite_pos.impl.ui.flow.catalogue_details.a(((ld1.c) this.d).f193927a);
                }
                if (i59 != 1) {
                    throw new AssertionError(i59);
                }
                qd0.b bVarN = eVar6.n();
                vc.s.j(bVarN);
                u80.t tVarU = eVar6.u();
                vc.s.j(tVarU);
                return new rd1.d(bVarN, tVarU);
            case 11:
                ld1.l lVar3 = (ld1.l) this.f193243b;
                ld1.m mVar = (ld1.m) this.d;
                int i66 = this.f193244c;
                switch (i66) {
                    case 0:
                        Object extension2 = (ad1.b) mVar.d.get();
                        yd1.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension2, "extension");
                        yji.n nVar3 = (yji.n) extension2;
                        vc.s.k(nVar3);
                        return nVar3;
                    case 1:
                        com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) mVar.f193971c.get();
                        fc1.a extensionFactory = (fc1.a) lVar3.f193956b.d.get();
                        vc.s.j(extensionFactory);
                        yd1.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(controller, "controller");
                        Intrinsics.checkNotNullParameter(extensionFactory, "extensionFactory");
                        Intrinsics.checkNotNullParameter(controller, "controller");
                        return new ec1.c(extensionFactory.f133608a, x0.a(g1.Companion, controller.D2()));
                    case 2:
                        nd1.n nVar4 = (nd1.n) lVar3.f193964p.get();
                        nd1.c cVar8 = (nd1.c) lVar3.f193960j.get();
                        nd1.i iVar3 = (nd1.i) lVar3.f193966r.get();
                        rd1.a aVar10 = new rd1.a((pd1.a) mVar.f193969a.f193968t.get());
                        nd1.j jVar2 = (nd1.j) lVar3.d.f.get();
                        vc.s.j(jVar2);
                        wc1.a aVar11 = (wc1.a) mVar.f.get();
                        ad1.b bVar5 = (ad1.b) mVar.d.get();
                        ld1.l lVar4 = mVar.f193969a;
                        nd1.n nVar5 = (nd1.n) lVar4.f193964p.get();
                        nd1.i iVar4 = (nd1.i) lVar4.f193966r.get();
                        ad1.b bVar6 = (ad1.b) mVar.d.get();
                        bd1.a aVarA4 = lVar4.d.a();
                        vc.s.j(aVarA4);
                        hf1.d dVar = (hf1.d) mVar.f193973h.get();
                        gd1.a aVar12 = (gd1.a) lVar4.f193956b.f303969c.get();
                        vc.s.j(aVar12);
                        return new com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.g(nVar4, cVar8, iVar3, aVar10, jVar2, aVar11, bVar5, new hd.r(nVar5, iVar4, bVar6, aVarA4, dVar, aVar12), (pd1.a) lVar3.f193968t.get(), (cli.n) mVar.i.get());
                    case 3:
                        com.revolut.kompot.navigable.a controller2 = (com.revolut.kompot.navigable.a) mVar.f193971c.get();
                        Intrinsics.checkNotNullParameter(controller2, "controller");
                        aVar = new wc1.a(controller2);
                        break;
                    case 4:
                        return new hf1.e((f01.a) mVar.f193972g.get());
                    case 5:
                        com.revolut.kompot.navigable.a controller3 = (com.revolut.kompot.navigable.a) mVar.f193971c.get();
                        yd1.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(controller3, "controller");
                        aVar = new f01.c(controller3.m2());
                        break;
                    case 6:
                        return new com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.h();
                    case 7:
                        wc1.a extension3 = (wc1.a) mVar.f.get();
                        Intrinsics.checkNotNullParameter(extension3, "extension");
                        vc.s.k(extension3);
                        return extension3;
                    case 8:
                        xc1.d extension4 = (xc1.d) mVar.f193976m.get();
                        Intrinsics.checkNotNullParameter(extension4, "extension");
                        xc1.d dVar2 = extension4;
                        vc.s.k(dVar2);
                        return dVar2;
                    case 9:
                        xc1.a dialogDisplayerProvider = (xc1.a) mVar.f193975l.get();
                        Intrinsics.checkNotNullParameter(dialogDisplayerProvider, "dialogDisplayerProvider");
                        aVar = new xc1.d(dialogDisplayerProvider);
                        break;
                    case 10:
                        com.revolut.kompot.navigable.a controller4 = (com.revolut.kompot.navigable.a) mVar.f193971c.get();
                        yd1.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(controller4, "controller");
                        LitePosFlow litePosFlow = (LitePosFlow) controller4;
                        vc.s.k(litePosFlow);
                        return litePosFlow;
                    default:
                        throw new AssertionError(i66);
                }
                return aVar;
            case 12:
                ld1.t tVar = (ld1.t) this.d;
                BaseScreen screen = tVar.f193997b;
                int i74 = this.f193244c;
                if (i74 == 0) {
                    gVar = new af1.g((jki.p) tVar.f193998c.get(), tVar.f193996a, ((ld1.l) this.f193243b).e.d(), (c90.c) tVar.d.get(), (hf1.a) tVar.f.get());
                } else {
                    if (i74 == 1) {
                        return new af1.h();
                    }
                    if (i74 == 2) {
                        bf1.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(screen, "screen");
                        return new c90.c(screen.m2());
                    }
                    if (i74 != 3) {
                        if (i74 != 4) {
                            throw new AssertionError(i74);
                        }
                        bf1.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(screen, "screen");
                        return new f01.c(screen.m2());
                    }
                    gVar = new hf1.c((f01.a) tVar.e.get());
                }
                return gVar;
            case 13:
                l70.e eVar7 = ((ld1.l) this.f193243b).e;
                int i92 = this.f193244c;
                if (i92 == 0) {
                    return new com.revolut.feature.acquiring.lite_pos.impl.ui.flow.shopping_cart.b();
                }
                if (i92 == 1) {
                    qd0.b bVarN2 = eVar7.n();
                    vc.s.j(bVarN2);
                    u80.t tVarU2 = eVar7.u();
                    vc.s.j(tVarU2);
                    return new rd1.d(bVarN2, tVarU2);
                }
                if (i92 != 2) {
                    throw new AssertionError(i92);
                }
                com.revolut.kompot.navigable.a controller5 = (com.revolut.kompot.navigable.a) ((ld1.w) this.d).e.get();
                de1.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller5, "controller");
                return new f01.c(controller5.m2());
            case 14:
                ld1.l lVar5 = (ld1.l) this.f193243b;
                int i96 = this.f193244c;
                if (i96 == 0) {
                    return new ff1.j((jki.p) ((ld1.x) this.d).f194009a.get(), (nd1.c) lVar5.f193960j.get());
                }
                if (i96 == 1) {
                    return new ff1.l((hf1.g) lVar5.u.get());
                }
                throw new AssertionError(i96);
            case 15:
                ld1.l lVar6 = (ld1.l) this.f193243b;
                int i99 = this.f193244c;
                if (i99 != 0) {
                    if (i99 == 1) {
                        return new he1.n((pd1.a) lVar6.f193968t.get());
                    }
                    throw new AssertionError(i99);
                }
                sfc.f fVar2 = (sfc.f) lVar6.f193955a.f.get();
                vc.s.j(fVar2);
                return new he1.l(fVar2, (nd1.c) lVar6.f193960j.get(), (jki.p) ((ld1.y) this.d).f194012b.get());
            case 16:
                lf9.d dVar3 = (lf9.d) this.d;
                lf9.m mVar2 = (lf9.m) this.f193243b;
                l70.e eVar8 = mVar2.f194734b;
                up1.c cVar9 = mVar2.f194736g;
                int i100 = this.f193244c;
                if (i100 == 0) {
                    return l70.h.b((jg9.g) dVar3.f194705b.get());
                }
                if (i100 == 1) {
                    tg9.d dVar4 = new tg9.d();
                    tg9.a aVar13 = new tg9.a();
                    l80.e eVarH = eVar8.h();
                    vc.s.j(eVarH);
                    return new jg9.l(dVar4, aVar13, eVarH);
                }
                if (i100 == 2) {
                    return l70.h.c((jg9.q) dVar3.d.get());
                }
                if (i100 == 3) {
                    l80.e eVarH2 = eVar8.h();
                    vc.s.j(eVarH2);
                    return new jg9.s(eVarH2);
                }
                if (i100 != 4) {
                    throw new AssertionError(i100);
                }
                a3e.u uVar = new a3e.u(new of9.k(new of9.m()), new of9.m());
                bh9.b bVar7 = dVar3.f194704a;
                jg9.g gVar4 = (jg9.g) dVar3.f194705b.get();
                wo1.b bVarB = ((up1.e) cVar9).b();
                vc.s.j(bVarB);
                sf9.a aVar14 = new sf9.a();
                ep1.b bVar8 = (ep1.b) ((up1.e) cVar9).f281813n.get();
                vc.s.j(bVar8);
                wj0.a aVarI2 = ((nj0.d) mVar2.f194733a).i();
                vc.s.j(aVarI2);
                gte.a aVarB2 = mVar2.k.b();
                vc.s.j(aVarB2);
                return new bh9.t(uVar, bVar7, gVar4, bVarB, aVar14, bVar8, aVarI2, aVarB2, mVar2.e.e());
            case 17:
                lf9.e eVar9 = (lf9.e) this.d;
                lf9.m mVar3 = (lf9.m) this.f193243b;
                npf.a aVar15 = mVar3.f194746t;
                p12.l lVar7 = mVar3.f194743q;
                int i101 = this.f193244c;
                if (i101 != 0) {
                    if (i101 != 1) {
                        if (i101 != 2) {
                            throw new AssertionError(i101);
                        }
                        ldd.a factory2 = new ldd.a();
                        kh9.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory2, "factory");
                        return new ldd.b();
                    }
                    ppf.a factory3 = aVar15.b();
                    vc.s.j(factory3);
                    ldd.b delegate = (ldd.b) eVar9.f194709c.get();
                    kh9.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(factory3, "factory");
                    Intrinsics.checkNotNullParameter(delegate, "delegate");
                    return ppf.a.a(delegate);
                }
                wo1.b bVarB2 = ((up1.e) mVar3.f194736g).b();
                vc.s.j(bVarB2);
                x02.a aVarH = lVar7.h();
                vc.s.j(aVarH);
                x02.b bVarI = lVar7.i();
                vc.s.j(bVarI);
                x02.d dVarK = lVar7.k();
                vc.s.j(dVarK);
                vo9.a aVarB3 = ((ut9.a) mVar3.f194744r).b();
                vc.s.j(aVarB3);
                zof.f fVarD = aVar15.d();
                vc.s.j(fVarD);
                FormAmountScreenContract$InputData formAmountScreenContract$InputData = eVar9.f194707a;
                yof.d dVar5 = (yof.d) eVar9.d.get();
                u80.o oVar2 = new u80.o();
                lf9.m mVar4 = eVar9.f194708b;
                l70.e eVar10 = mVar4.f194734b;
                w80.b bVarJ = eVar10.j();
                vc.s.j(bVarJ);
                vo9.a aVarB4 = ((ut9.a) mVar4.f194744r).b();
                vc.s.j(aVarB4);
                l80.e eVarH3 = eVar10.h();
                vc.s.j(eVarH3);
                return new jh9.p(bVarB2, aVarH, bVarI, dVarK, aVarB3, fVarD, formAmountScreenContract$InputData, new jh9.q(dVar5, oVar2, bVarJ, aVarB4, eVarH3));
            case 18:
                lf9.m mVar5 = (lf9.m) this.f193243b;
                int i102 = this.f193244c;
                if (i102 != 0) {
                    if (i102 != 1) {
                        throw new AssertionError(i102);
                    }
                    qd0.b languageProvider2 = mVar5.f194734b.n();
                    vc.s.j(languageProvider2);
                    dg9.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(languageProvider2, "languageProvider");
                    return v80.b.b(languageProvider2, false, false, 10);
                }
                wo1.b bVarB3 = ((up1.e) mVar5.f194736g).b();
                vc.s.j(bVarB3);
                wj0.a aVarI3 = ((nj0.d) mVar5.f194733a).i();
                vc.s.j(aVarI3);
                lf9.f fVar3 = (lf9.f) this.d;
                FormDetailsScreenContract$InputData formDetailsScreenContract$InputData = fVar3.f194710a;
                of9.b bVar9 = new of9.b((w80.b) fVar3.f194712c.get());
                l80.e eVarH4 = fVar3.f194711b.f194734b.h();
                vc.s.j(eVarH4);
                return new cg9.n(bVarB3, aVarI3, formDetailsScreenContract$InputData, new cg9.q(bVar9, eVarH4));
            case 19:
                lf9.g gVar5 = (lf9.g) this.d;
                int i103 = this.f193244c;
                if (i103 == 0) {
                    wo1.b bVarB4 = ((up1.e) ((lf9.m) this.f193243b).f194736g).b();
                    vc.s.j(bVarB4);
                    return new hg9.m(bVarB4, new tsk.t(fe0.c.a()), gVar5.f194713a, new hg9.b((f01.a) gVar5.f194715c.get()), new hg9.n());
                }
                if (i103 != 1) {
                    throw new AssertionError(i103);
                }
                com.revolut.kompot.navigable.a controller6 = (com.revolut.kompot.navigable.a) gVar5.f194714b.get();
                ig9.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller6, "controller");
                return new f01.c(controller6.m2());
            case 20:
                lf9.m mVar6 = (lf9.m) this.f193243b;
                nj0.a aVar16 = mVar6.f194733a;
                l70.e eVar11 = mVar6.f194734b;
                int i104 = this.f193244c;
                if (i104 == 0) {
                    wj0.a aVarI4 = ((nj0.d) aVar16).i();
                    vc.s.j(aVarI4);
                    l80.e eVarH5 = eVar11.h();
                    vc.s.j(eVarH5);
                    return m4d.e.d(aVarI4, eVarH5);
                }
                if (i104 == 1) {
                    wj0.a aVarI5 = ((nj0.d) aVar16).i();
                    vc.s.j(aVarI5);
                    l80.e eVarH6 = eVar11.h();
                    vc.s.j(eVarH6);
                    return m4d.e.c(aVarI5, eVarH6);
                }
                if (i104 == 2) {
                    wo1.b bVarB5 = ((up1.e) mVar6.f194736g).b();
                    vc.s.j(bVarB5);
                    return new com.revolut.feature.pay_bills_taxes.impl.ui.flow.form.b(bVarB5, ((lf9.h) this.d).f194716a);
                }
                if (i104 != 3) {
                    throw new AssertionError(i104);
                }
                qd0.b languageProvider3 = eVar11.n();
                vc.s.j(languageProvider3);
                ag9.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(languageProvider3, "languageProvider");
                return v80.b.b(languageProvider3, false, false, 10);
            case 21:
                lf9.m mVar7 = (lf9.m) this.f193243b;
                l70.e eVar12 = mVar7.f194734b;
                nj0.a aVar17 = mVar7.f194733a;
                int i105 = this.f193244c;
                if (i105 == 0) {
                    wj0.a aVarI6 = ((nj0.d) aVar17).i();
                    vc.s.j(aVarI6);
                    l80.e eVarH7 = eVar12.h();
                    vc.s.j(eVarH7);
                    return m4d.e.d(aVarI6, eVarH7);
                }
                if (i105 != 1) {
                    if (i105 == 2) {
                        return new com.revolut.feature.pay_bills_taxes.impl.ui_payment.form.a(((lf9.j) this.d).f194722a);
                    }
                    throw new AssertionError(i105);
                }
                wj0.a aVarI7 = ((nj0.d) aVar17).i();
                vc.s.j(aVarI7);
                l80.e eVarH8 = eVar12.h();
                vc.s.j(eVarH8);
                return m4d.e.c(aVarI7, eVarH8);
            case 22:
                lf9.k kVar4 = (lf9.k) this.d;
                lf9.m mVar8 = (lf9.m) this.f193243b;
                p12.l lVar8 = mVar8.f194743q;
                int i106 = this.f193244c;
                if (i106 == 0) {
                    wo1.b bVarB6 = ((up1.e) mVar8.f194736g).b();
                    vc.s.j(bVarB6);
                    x02.b bVarI2 = lVar8.i();
                    vc.s.j(bVarI2);
                    x02.d dVarK2 = lVar8.k();
                    vc.s.j(dVarK2);
                    FormReviewScreenContract$InputData formReviewScreenContract$InputData = kVar4.f194725a;
                    yof.d dVar6 = (yof.d) kVar4.d.get();
                    u80.o oVar3 = new u80.o();
                    lf9.m mVar9 = kVar4.f194726b;
                    w80.b bVarJ2 = mVar9.f194734b.j();
                    vc.s.j(bVarJ2);
                    of9.b bVar10 = new of9.b((w80.b) kVar4.e.get());
                    q12.g gVarJ = mVar9.f194743q.j();
                    vc.s.j(gVarJ);
                    return new lh9.r(bVarB6, bVarI2, dVarK2, formReviewScreenContract$InputData, new lh9.s(dVar6, oVar3, bVarJ2, bVar10, gVarJ));
                }
                if (i106 == 1) {
                    ppf.a factory4 = mVar8.f194746t.b();
                    vc.s.j(factory4);
                    ldd.b delegate2 = (ldd.b) kVar4.f194727c.get();
                    mh9.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(factory4, "factory");
                    Intrinsics.checkNotNullParameter(delegate2, "delegate");
                    return ppf.a.a(delegate2);
                }
                if (i106 == 2) {
                    ldd.a factory5 = new ldd.a();
                    mh9.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(factory5, "factory");
                    return new ldd.b();
                }
                if (i106 != 3) {
                    throw new AssertionError(i106);
                }
                qd0.b languageProvider4 = mVar8.f194734b.n();
                vc.s.j(languageProvider4);
                mh9.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(languageProvider4, "languageProvider");
                return v80.b.b(languageProvider4, false, false, 26);
            case 23:
                return a();
            case 24:
                return b();
            case 25:
                lf9.t tVar2 = (lf9.t) this.d;
                int i107 = this.f193244c;
                if (i107 == 0) {
                    return new eg9.e(new a3e.u(new of9.b((w80.b) tVar2.f194798b.get())), tVar2.f194797a);
                }
                if (i107 != 1) {
                    throw new AssertionError(i107);
                }
                qd0.b languageProvider5 = ((lf9.m) this.f193243b).f194734b.n();
                vc.s.j(languageProvider5);
                fg9.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(languageProvider5, "languageProvider");
                return v80.b.b(languageProvider5, false, false, 10);
            case 26:
                return c();
            case 27:
                return d();
            case 28:
                return e();
            default:
                ljl.j jVar3 = (ljl.j) this.d;
                q0 q0Var = (q0) this.f193243b;
                int i108 = this.f193244c;
                switch (i108) {
                    case 0:
                        tll.f extension5 = (tll.f) jVar3.f195991n.get();
                        nll.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension5, "extension");
                        vc.s.k(extension5);
                        return extension5;
                    case 1:
                        return new tll.f((tll.e) jVar3.f195990m.get());
                    case 2:
                        mp.p pVarC = jVar3.c();
                        RevolutSsoApi$InputData$CombinedAuthentication revolutSsoApi$InputData$CombinedAuthentication = jVar3.f195983a;
                        ywj.i iVar5 = jVar3.f195984b;
                        xjl.h hVar5 = (xjl.h) q0Var.f0.get();
                        uil.a aVarA5 = q0Var.f196057b.a();
                        vc.s.j(aVarA5);
                        p0 p0Var = (p0) q0Var.H.get();
                        gu2.e eVar13 = (gu2.e) jVar3.k.get();
                        a5h.g gVarK = q0Var.k();
                        dm0.d dVar7 = (dm0.d) q0Var.f196068m.o.get();
                        vc.s.j(dVar7);
                        jol.b bVar11 = (jol.b) q0Var.I.get();
                        fkg.a aVarD = q0Var.d();
                        fkl.i iVar6 = (fkl.i) q0Var.j0.get();
                        iql.a aVar18 = new iql.a();
                        akl.d dVar8 = (akl.d) q0Var.f196060d0.get();
                        col.c cVar10 = (col.c) jVar3.f195989l.get();
                        UICustomization uICustomization = jVar3.f195985c;
                        f80.a aVarX4 = q0Var.f196062g.x();
                        vc.s.j(aVarX4);
                        return new com.revolut.sso.impl.ui.combined_authentication.flow.c(pVarC, revolutSsoApi$InputData$CombinedAuthentication, iVar5, hVar5, aVarA5, p0Var, eVar13, gVarK, dVar7, bVar11, aVarD, iVar6, aVar18, dVar8, cVar10, uICustomization, aVarX4);
                    case 3:
                        hu2.a aVar19 = (hu2.a) jVar3.f195986g.get();
                        com.hcaptcha.sdk.a aVarL = jr9.h.l((Activity) jVar3.i.get());
                        HCaptchaConfig hCaptchaConfigM = jr9.h.m((String) jVar3.f195988j.get());
                        aoi.c cVarA = aoi.f.a();
                        dm0.d dVarD = jVar3.e.f196068m.d();
                        vc.s.j(dVarD);
                        return jr9.h.x(aVar19, new ku2.h(aVarL, hCaptchaConfigM, cVarA, dVarD));
                    case 4:
                        return new hu2.d();
                    case 5:
                        return jr9.h.e((com.revolut.kompot.navigable.a) jVar3.f195987h.get());
                    case 6:
                        p0 revolutSsoDependenciesProvider = (p0) q0Var.H.get();
                        nll.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(revolutSsoDependenciesProvider, "revolutSsoDependenciesProvider");
                        String str = ((rqk.k) revolutSsoDependenciesProvider).f256594q;
                        vc.s.k(str);
                        return str;
                    case 7:
                        com.revolut.kompot.navigable.a aVar20 = (com.revolut.kompot.navigable.a) jVar3.f195987h.get();
                        wl0.c cVarA2 = q0Var.f.a();
                        ph0.d dVarA = t2d.c.a(q0Var.i.f271230a);
                        l80.e eVarH9 = q0Var.f196062g.h();
                        vc.s.j(eVarH9);
                        iVar = new col.i(aVar20, cVarA2, dVarA, eVarH9);
                        break;
                    case 8:
                        return db5.e.s((col.c) jVar3.f195989l.get());
                    case 9:
                        gu2.e eVar14 = (gu2.e) jVar3.k.get();
                        jr9.h.h(eVar14);
                        return eVar14;
                    case 10:
                        Context context = q0Var.f196055a;
                        g90.a aVarW = q0Var.f196062g.w();
                        vc.s.j(aVarW);
                        return new gnl.a(context, aVarW);
                    case 11:
                        akl.z zVarC = q0Var.c();
                        f01.a aVar21 = (f01.a) jVar3.f195995s.get();
                        gnl.a aVar22 = (gnl.a) jVar3.f195994r.get();
                        z80.b bVarS = q0Var.f196062g.s();
                        vc.s.j(bVarS);
                        iVar = new gnl.v(zVarC, aVar21, aVar22, bVarS);
                        break;
                    case 12:
                        ViewController flow = jVar3.d;
                        nll.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(flow, "flow");
                        return new f01.c(flow.m2());
                    default:
                        throw new AssertionError(i108);
                }
                return iVar;
        }
    }
}
