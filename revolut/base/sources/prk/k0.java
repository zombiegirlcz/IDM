package prk;

import afj.y3;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.view.PreviewView;
import androidx.lifecycle.LifecycleOwner;
import b9.w2;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.revolut.camerakit.client.api.models.CameraCaptureSettings;
import com.revolut.camerakit.client.api.models.CameraKitClientSettings;
import com.revolut.camerakit.core.settings.VideoWatermark;
import com.revolut.camerakit.revolut.ui.previewless_selfie.PreviewlessSelfieFlowContract$InputData;
import com.revolut.camerakit.ui.models.R$id;
import com.revolut.camerakit.ui.views.view.CameraKitPreviewView;
import com.revolut.core.mobile_services.api.mlkit.vision.barcode.MsBarcodeDetectorSettings;
import com.revolut.feature.apm.spin.api.navigation.SpinNavigation$InputData;
import com.revolut.feature.confirmation_code.ui.otp.ESignOtpScreenContract$InputData;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.discoverall.ui.CryptoCommodityDiscoverAllContract$Configuration;
import com.revolut.feature.onboarding.api.qes_terms.QesTermsFlowInputData;
import com.revolut.feature.passcode.PasscodeScreenContract$InputData;
import com.revolut.feature_web_view.presentation.WebViewContract$WebViewConfiguration;
import com.revolut.kompot.navigable.screen.BaseScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.asset_details.CryptoAssetDetailsScreen;
import com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.asset_details.CryptoAssetDetailsScreenContract$InputData;
import com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.earning.v2.CryptoEarningScreenContract$InputData;
import com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.holding.CryptoHoldingScreenContract$InputData;
import com.revolut.retail.feature.crypto_deposits.impl.ui.overview.CryptoDepositsOverviewControllerContract$InputData;
import com.revolut.retail.feature.payment_options.impl.ui.screens.options.PaymentOptionsScreenContract$InputData;
import com.revolut.retail.feature.payment_options.impl.ui.screens.vault.PaymentOptionsVaultWithdrawalScreenContract$InputData;
import com.revolut.retail.feature.payments.core.fees.mapper.RateExplanationDialogMapper;
import com.revolut.retail.feature.payments.payment_links.impl.ui.details.PaymentLinkDetailsContract$InputData;
import com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.PaymentLinksAmountScreenContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.decline_invitation.DeclineFamilyPlanInvitationScreenContract$InputData;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.screens.technicals.TechnicalInsightsControllerContract$InputData;
import ip0.v7;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import ljl.q1;
import qgk.g3;
import qgk.i3;
import qgk.k3;
import retrofit2.Retrofit;
import rp0.g1;
import rp0.x0;
import rp0.z1;
import zbj.q0;
import zbj.t0;
import zhm.y0;

/* JADX INFO: loaded from: classes12.dex */
public final class k0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f239223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f239224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f239225c;
    public final Object d;

    public /* synthetic */ k0(Object obj2, Object obj3, int i, int i2) {
        this.f239223a = i2;
        this.f239225c = obj2;
        this.d = obj3;
        this.f239224b = i;
    }

    private final Object a() {
        q7k.j jVar = (q7k.j) this.f239225c;
        q7k.i iVar = (q7k.i) this.d;
        int i = this.f239224b;
        switch (i) {
            case 0:
                return kxa.j.k((j60.a) iVar.f242893j.get());
            case 1:
                return ehe.n.s((com.revolut.kompot.navigable.a) iVar.f242892h.get(), (rp0.m) iVar.i.get());
            case 2:
                return new rp0.m();
            case 3:
                n60.b bVar = (n60.b) iVar.f242894l.get();
                o5k.i.m(bVar);
                return bVar;
            case 4:
                return o5k.i.r((com.revolut.kompot.navigable.a) iVar.f242892h.get());
            case 5:
                n60.a aVar = (n60.a) iVar.f242896n.get();
                o5k.i.l(aVar);
                return aVar;
            case 6:
                return o5k.i.q((com.revolut.kompot.navigable.a) iVar.f242892h.get());
            case 7:
                j9i.d extension = (j9i.d) iVar.f242898q.get();
                Intrinsics.checkNotNullParameter(extension, "extension");
                vc.s.k(extension);
                return extension;
            case 8:
                o9i.a aVar2 = iVar.f242888a;
                q7k.j jVar2 = iVar.f242891g;
                o9i.c cVar = iVar.f242890c;
                o9i.b bVar2 = iVar.f242889b;
                Retrofit retrofit = ((nj0.d) jVar2.f242908g).f();
                Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                q9i.d dVarE = o5k.i.e(aVar2, o5k.i.c(bVar2, o5k.i.y(cVar, retrofit), new l9i.a(), new p9i.a()));
                Retrofit retrofit3 = ((nj0.d) jVar2.f242908g).f();
                Intrinsics.checkNotNullParameter(retrofit3, "retrofit");
                return jr9.h.w(new r9i.e(new q9i.b(dVarE, o5k.i.f(aVar2, o5k.i.d(bVar2, o5k.i.y(cVar, retrofit3), new l9i.a(), new p9i.a()))), new r9i.a()), iVar.d, (j9i.a) iVar.f242897p.get());
            case 9:
                return z7k.e.a();
            case 10:
                return nga.c.s(jVar.f242909h.c(), (mga.i0) iVar.f242900s.get(), (mga.f0) iVar.u.get(), (on.a) iVar.v.get());
            case 11:
                yji.o controller = (com.revolut.kompot.navigable.a) iVar.f242892h.get();
                Intrinsics.checkNotNullParameter(controller, "controller");
                mga.i0 i0Var = (mga.i0) controller;
                vc.s.k(i0Var);
                return i0Var;
            case 12:
                return nga.c.u(jVar.f242909h.c(), iVar.e, (wn.a) iVar.f242901t.get());
            case 13:
                return v7.z(jVar.i, "provider");
            case 14:
                os2.g factory = jVar.i.c();
                Intrinsics.checkNotNullParameter(factory, "factory");
                return (sn.a) factory.f229224b;
            case 15:
                a8k.d extension2 = (a8k.d) iVar.z.get();
                z7k.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension2, "extension");
                vc.s.k(extension2);
                return extension2;
            case 16:
                twg.c cVarJ = iVar.j();
                p8k.a aVar3 = (p8k.a) iVar.f242904y.get();
                lpf.a aVar4 = jVar.f242912m;
                so9.b bVar3 = jVar.f242913n;
                opf.c0 c0Var = new opf.c0();
                vo9.a aVarB = ((ut9.a) bVar3).b();
                vc.s.j(aVarB);
                wt9.e eVarC = ((ut9.a) bVar3).c();
                vc.s.j(eVarC);
                return new a8k.d(cVarJ, aVar3, c0Var, aVarB, eVarC);
            case 17:
                PaymentLinksAmountScreenContract$InputData paymentLinksAmountScreenContract$InputData = iVar.f;
                q7k.j jVar3 = iVar.f242891g;
                o8k.a aVar5 = (o8k.a) iVar.f242903x.get();
                k61.a aVarE = jVar.f242905a.e();
                vc.s.j(aVarE);
                u5k.c cVar2 = (u5k.c) jVar.H.get();
                wsg.n nVarB = jVar.f242911l.b();
                srf.d dVar = new srf.d();
                urf.f fVar = new urf.f();
                gte.a aVarB2 = jVar3.k.b();
                vc.s.j(aVarB2);
                l1l.s sVar = new l1l.s(aVarB2);
                l1l.q qVar = new l1l.q();
                gte.a aVarB3 = jVar3.k.b();
                vc.s.j(aVarB3);
                l1l.h hVar = new l1l.h(aVarB3, 0);
                gte.a aVarB4 = jVar3.k.b();
                vc.s.j(aVarB4);
                return new p8k.j(paymentLinksAmountScreenContract$InputData, aVar5, aVarE, cVar2, nVarB, dVar, fVar, sVar, qVar, hVar, new l1l.h(aVarB4, 1));
            case 18:
                o8k.c.Companion.getClass();
                return new o8k.a();
            case 19:
                Object extension3 = (p8k.a) iVar.f242904y.get();
                z7k.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension3, "extension");
                yji.n nVar = (yji.n) extension3;
                vc.s.k(nVar);
                return nVar;
            case 20:
                Object extension4 = (n8k.a) iVar.C.get();
                z7k.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension4, "extension");
                yji.n nVar2 = (yji.n) extension4;
                vc.s.k(nVar2);
                return nVar2;
            case 21:
                eli.j jVarA = jVar.o.a();
                wsg.n nVarB2 = jVar.f242911l.b();
                k61.a aVarE2 = jVar.f242905a.e();
                vc.s.j(aVarE2);
                vv9.c cVarC = ((s6k.b) jVar.f242914p).c();
                vc.s.j(cVarC);
                return new n8k.d(jVarA, nVarB2, aVarE2, cVarC, jVar.f242915q.c(), iVar.f);
            case 22:
                Object extension5 = (n8k.f) iVar.E.get();
                z7k.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension5, "extension");
                yji.n nVar3 = (yji.n) extension5;
                vc.s.k(nVar3);
                return nVar3;
            case 23:
                q7k.j jVar4 = iVar.f242891g;
                sw8.a aVar6 = new sw8.a();
                sf0.h hVarB = jVar4.f242916r.b();
                vc.s.j(hVarB);
                n8k.e eVar = new n8k.e(aVar6, hVarB);
                q7k.c cVar3 = jVar.f242907c;
                p7k.b bVar4 = new p7k.b();
                cpf.c cVarF = jVar.f242917s.f();
                vc.s.j(cVarF);
                return new n8k.g(eVar, bVar4, cVarF);
            case 24:
                b8k.i extension6 = (b8k.i) iVar.G.get();
                z7k.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension6, "extension");
                vc.s.k(extension6);
                return extension6;
            case 25:
                xmg.a aVar7 = jVar.d;
                l89.b bVar5 = jVar.f242918t;
                ang.f fVarE = aVar7.e();
                s99.i iVarB = ((s99.a) bVar5).b();
                t99.k kVarA = ((s99.a) bVar5).a();
                vc.s.j(kVarA);
                return new b8k.l(fVarE, iVarB, kVarA);
            case 26:
                xdk.b bVar6 = (xdk.b) iVar.I.get();
                ydk.c.a(bVar6);
                return bVar6;
            case 27:
                xdk.a aVar8 = new xdk.a();
                z71.a aVarF = ((c21.b) jVar.u).f();
                vc.s.j(aVarF);
                return new xdk.g(aVar8, aVarF, jVar.f242911l.a());
            case 28:
                return o5k.d.a((n5k.b) iVar.N.get());
            case 29:
                e4m.e eVar2 = iVar.K;
                q7k.j jVar5 = iVar.f242891g;
                n5k.a aVar9 = (n5k.a) eVar2.get();
                p5k.d dVar2 = new p5k.d();
                p5k.y yVar = new p5k.y();
                j4i.a aVar10 = jVar5.v;
                qga.a aVar11 = jVar5.f242920x;
                k5i.c cVarA = aVar10.a();
                p5k.f fVarC = iVar.c();
                j9l.a aVar12 = new j9l.a();
                gte.a aVarB5 = jVar5.k.b();
                vc.s.j(aVarB5);
                p5k.k kVar = new p5k.k(dVar2, new p5k.x(yVar, cVarA, fVarC, new kgm.i(aVar12, aVarB5), new p5k.p()), aVar11.b(), iVar.b(), new jt0.b(aVar11.b(), jVar5.A.a(), iVar.b()), iVar.c(), new RateExplanationDialogMapper());
                ffk.t tVarF = jVar.B.f();
                vc.s.j(tVarF);
                ang.f fVarE2 = jVar.d.e();
                wif.a aVarA = jVar.A.a();
                gte.a aVarB6 = jVar.k.b();
                vc.s.j(aVarB6);
                j60.a aVar13 = (j60.a) iVar.f242893j.get();
                qpk.b bVar7 = new qpk.b();
                v2k.c cVarA2 = jVar.f242919w.a();
                mre.c cVarB = jVar.C.b();
                vc.s.j(cVarB);
                z0h.a aVarB7 = ((u8h.b) jVar.f242921y).b();
                vc.s.j(aVarB7);
                l80.e eVarH = jVar5.f242906b.h();
                vc.s.j(eVarH);
                return new n5k.p(aVar9, kVar, tVarF, fVarE2, aVarA, aVarB6, aVar13, bVar7, cVarA2, cVarB, aVarB7, new p5k.a(eVarH), jVar.D.b(), (n5k.q) iVar.M.get());
            case 30:
                o8k.a aVar14 = (o8k.a) iVar.f242903x.get();
                twg.c cVarJ2 = iVar.j();
                gte.a aVarB8 = iVar.f242891g.k.b();
                vc.s.j(aVarB8);
                return new d8k.e(aVar14, cVarJ2, new d8k.f(aVarB8, 0));
            case 31:
                aah.i iVarD = ((u8h.b) jVar.f242921y).d();
                vc.s.j(iVarD);
                return o5k.i.C(iVarD);
            case 32:
                return new n5k.r(new RateExplanationDialogMapper());
            case 33:
                return o5k.i.a((n5k.q) iVar.M.get());
            case 34:
                i5k.a aVar15 = (i5k.a) iVar.Q.get();
                j5k.b.a(aVar15);
                return aVar15;
            case 35:
                l80.h hVarV = jVar.f242906b.v();
                vc.s.j(hVarV);
                return new i5k.d(hVarV);
            case 36:
                Object extension7 = (s5k.a) iVar.T.get();
                t5k.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension7, "extension");
                yji.n nVar4 = (yji.n) extension7;
                vc.s.k(nVar4);
                return nVar4;
            case 37:
                return new s5k.d((r5k.d) iVar.S.get(), (j60.a) iVar.f242893j.get(), new r5k.a(), new r5k.b());
            case 38:
                return new r5k.e();
            case 39:
                wn.a aVar16 = (wn.a) iVar.f242901t.get();
                n57.a.d(aVar16);
                return aVar16;
            case 40:
                PaymentLinksAmountScreenContract$InputData paymentLinksAmountScreenContract$InputData2 = iVar.f;
                q7k.j jVar6 = iVar.f242891g;
                fk3.a aVarA2 = jVar6.E.a();
                vc.s.j(aVarA2);
                g8k.f fVar2 = new g8k.f(aVarA2, jVar6.f242911l.b());
                lpf.a aVar17 = jVar6.f242912m;
                opf.b bVarG = aVar17.g();
                k61.a aVarE3 = jVar6.f242905a.e();
                vc.s.j(aVarE3);
                b8k.d dVar3 = new b8k.d(paymentLinksAmountScreenContract$InputData2, fVar2, bVarG, aVarE3, aVar17.d());
                fk3.a aVarA3 = jVar6.E.a();
                vc.s.j(aVarA3);
                g8k.f fVar3 = new g8k.f(aVarA3, jVar6.f242911l.b());
                gte.a aVarB9 = jVar6.k.b();
                vc.s.j(aVarB9);
                y7k.f fVar4 = new y7k.f(fVar3, aVarB9);
                o8k.a aVar18 = (o8k.a) iVar.f242903x.get();
                zof.f fVarD = jVar.f242917s.d();
                vc.s.j(fVarD);
                a8k.d dVar4 = (a8k.d) iVar.z.get();
                p8k.a aVar19 = (p8k.a) iVar.f242904y.get();
                n8k.a aVar20 = (n8k.a) iVar.C.get();
                n8k.f fVar5 = (n8k.f) iVar.E.get();
                n5k.b bVar8 = (n5k.b) iVar.N.get();
                s5k.a aVar21 = (s5k.a) iVar.T.get();
                xdk.b bVar9 = (xdk.b) iVar.I.get();
                n60.a aVar22 = (n60.a) iVar.f242896n.get();
                j9i.d dVar5 = (j9i.d) iVar.f242898q.get();
                l2j.a aVar23 = new l2j.a();
                ldd.b bVar10 = (ldd.b) iVar.W.get();
                w80.b bVar11 = (w80.b) iVar.X.get();
                c8k.f fVar6 = new c8k.f();
                b8k.i iVar2 = (b8k.i) iVar.G.get();
                yof.d dVar6 = (yof.d) iVar.Y.get();
                vo9.a aVarB10 = ((ut9.a) jVar6.f242913n).b();
                vc.s.j(aVarB10);
                u80.o oVar = new u80.o();
                w80.b bVar12 = (w80.b) iVar.X.get();
                ldd.b bVar13 = (ldd.b) iVar.W.get();
                gte.a aVarB11 = jVar6.k.b();
                vc.s.j(aVarB11);
                c8k.a amountHintMapperV2 = new c8k.a(aVarB11, (yof.d) iVar.Y.get());
                yof.d transferAmountMapper = (yof.d) iVar.Y.get();
                Intrinsics.checkNotNullParameter(amountHintMapperV2, "amountHintMapperV2");
                Intrinsics.checkNotNullParameter(transferAmountMapper, "transferAmountMapper");
                r10.d dVar7 = new r10.d();
                dVar7.f250818a = amountHintMapperV2;
                dVar7.f250819b = transferAmountMapper;
                return new com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a(paymentLinksAmountScreenContract$InputData2, dVar3, fVar4, aVar18, fVarD, dVar4, aVar19, aVar20, fVar5, bVar8, aVar21, bVar9, aVar22, dVar5, aVar23, bVar10, bVar11, fVar6, iVar2, new y7k.c0(new c8k.e(dVar6, aVarB10, oVar, bVar12, bVar13, dVar7), (yof.d) iVar.Y.get()));
            case 41:
                kdd.b bVar14 = jVar.F;
                ldd.a factory2 = new ldd.a();
                z7k.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory2, "factory");
                return new ldd.b();
            case 42:
                qd0.b languageProvider = jVar.f242906b.n();
                vc.s.j(languageProvider);
                z7k.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
                return v80.b.b(languageProvider, false, false, 58);
            case 43:
                ppf.a factory3 = jVar.f242917s.b();
                vc.s.j(factory3);
                ldd.b delegate = (ldd.b) iVar.W.get();
                z7k.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory3, "factory");
                Intrinsics.checkNotNullParameter(delegate, "delegate");
                return ppf.a.a(delegate);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object b() {
        q8j.e eVar = (q8j.e) this.d;
        q8j.c cVar = (q8j.c) this.f239225c;
        int i = this.f239224b;
        switch (i) {
            case 0:
                Object extension = (j60.a) eVar.f.get();
                e9j.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                yji.d dVar = (yji.d) extension;
                vc.s.k(dVar);
                return dVar;
            case 1:
                com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) eVar.d.get();
                rp0.m dialogDisplayer = (rp0.m) eVar.e.get();
                he2.b dialogHostFinder = ehe.n.r();
                e9j.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller, "controller");
                Intrinsics.checkNotNullParameter(dialogDisplayer, "dialogDisplayer");
                Intrinsics.checkNotNullParameter(dialogHostFinder, "dialogHostFinder");
                return new j60.c(controller, dialogDisplayer, dialogHostFinder);
            case 2:
                e9j.b.Companion.getClass();
                return new rp0.m();
            case 3:
                f4h.a provider = cVar.f243090c.b();
                c8j.c model = (c8j.c) eVar.f243115j.get();
                CryptoAssetDetailsScreen view = (CryptoAssetDetailsScreen) eVar.k.get();
                k9j.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(provider, "provider");
                Intrinsics.checkNotNullParameter(model, "modelExtension");
                Intrinsics.checkNotNullParameter(view, "screen");
                Intrinsics.checkNotNullParameter(model, "model");
                Intrinsics.checkNotNullParameter(view, "view");
                return new aah.g(view, model);
            case 4:
                f4h.a provider2 = cVar.f243090c.b();
                c8j.a dataSource = (c8j.a) eVar.f243114h.get();
                c8j.b statsExtraItemsExtension = (c8j.b) eVar.i.get();
                k9j.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(provider2, "provider");
                Intrinsics.checkNotNullParameter(dataSource, "dataSource");
                Intrinsics.checkNotNullParameter(statsExtraItemsExtension, "statsExtraItemsExtension");
                Intrinsics.checkNotNullParameter(dataSource, "dataSource");
                Intrinsics.checkNotNullParameter(statsExtraItemsExtension, "statsExtraItemsExtension");
                return new k8j.c(dataSource, (k8j.f) provider2.f132229b, statsExtraItemsExtension);
            case 5:
                fn2.c cVarC = cVar.d.c();
                nw5.j jVarD = cVar.e.d();
                vc.s.j(jVarD);
                return new j9j.c(cVarC, jVarD);
            case 6:
                ViewController screen = eVar.f243106a;
                e9j.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(screen, "screen");
                return (CryptoAssetDetailsScreen) screen;
            case 7:
                zq.a provider3 = cVar.f243090c.a();
                w7j.a model2 = (w7j.a) eVar.f243118n.get();
                CryptoAssetDetailsScreen view2 = (CryptoAssetDetailsScreen) eVar.k.get();
                w8j.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(provider3, "provider");
                Intrinsics.checkNotNullParameter(model2, "modelExtension");
                Intrinsics.checkNotNullParameter(view2, "screen");
                Intrinsics.checkNotNullParameter(model2, "model");
                Intrinsics.checkNotNullParameter(view2, "view");
                return new aah.g(view2, model2);
            case 8:
                zq.a provider4 = cVar.f243090c.a();
                w7j.b dataSource2 = (w7j.b) eVar.f243117m.get();
                w8j.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(provider4, "provider");
                Intrinsics.checkNotNullParameter(dataSource2, "dataSource");
                Intrinsics.checkNotNullParameter(dataSource2, "dataSource");
                return new e8j.e(dataSource2, (e8j.b) provider4.f324335b, (f80.a) provider4.f324336c);
            case 9:
                return new v8j.a(cVar.d.c());
            case 10:
                n2d.h hVarB = cVar.f243091g.b();
                vc.s.j(hVarB);
                return ms1.g.h(hVarB, (m1d.b) eVar.k.get(), (m1d.a) eVar.f243120q.get());
            case 11:
                n2d.h hVarB2 = cVar.f243091g.b();
                vc.s.j(hVarB2);
                return ms1.g.g(hVarB2, (g1) eVar.f243119p.get());
            case 12:
                CryptoAssetDetailsScreen screen2 = (CryptoAssetDetailsScreen) eVar.k.get();
                e9j.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(screen2, "screen");
                return x0.a(g1.Companion, screen2.D2());
            case 13:
                ev5.d dVarD = ((ku5.f) cVar.f243092h).d();
                vc.s.j(dVarD);
                return qt5.h.a(dVarD, (pt5.s) eVar.f243123t.get());
            case 14:
                ev5.d dVarD2 = ((ku5.f) cVar.f243092h).d();
                vc.s.j(dVarD2);
                ev5.d dVarD3 = ((ku5.f) eVar.f243110c.f243092h).d();
                vc.s.j(dVarD3);
                return qt5.g.a(dVarD2, qt5.f.a(dVarD3, Optional.empty()), (pt5.r) eVar.k.get(), (pt5.m) eVar.f243122s.get());
            case 15:
                ev5.d dVarD4 = ((ku5.f) cVar.f243092h).d();
                vc.s.j(dVarD4);
                return qt5.i.a(dVarD4, Optional.empty(), Optional.empty());
            case 16:
                return kxa.j.k((j60.a) eVar.f243124w.get());
            case 17:
                return ehe.n.s((com.revolut.kompot.navigable.a) eVar.d.get(), (rp0.m) eVar.v.get());
            case 18:
                return new rp0.m();
            case 19:
                return f0k.d.f(cVar.i.a(), (e5d.d) eVar.k.get(), (e5d.a) eVar.z.get());
            case 20:
                a5h.g gVarA = cVar.i.a();
                CryptoAssetDetailsScreenContract$InputData inputData = eVar.f243108b;
                q8j.d factory = (q8j.d) eVar.f243126y.get();
                e9j.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(inputData, "inputData");
                Intrinsics.checkNotNullParameter(factory, "factory");
                xi0.b bVar = inputData.f99962a;
                q8j.c cVar2 = (q8j.c) factory.f243105a.f239225c;
                fn2.c cVarC2 = cVar2.d.c();
                gte.a aVarB = cVar2.f243093j.b();
                vc.s.j(aVarB);
                df0.b bVarA = cVar2.k.a();
                vc.s.j(bVarA);
                return f0k.d.c(gVarA, new z8j.b(bVar, cVarC2, aVarB, bVarA));
            case 21:
                return new q8j.d(this);
            case 22:
                return new aah.g((d9j.f) eVar.k.get(), (d9j.e) eVar.C.get());
            case 23:
                return new d9j.j((d9j.d) eVar.B.get(), cVar.f243095m.b(), cVar.e.a());
            case 24:
                return new d9j.h(cVar.f243094l.g());
            case 25:
                return new x8j.e((x8j.o) eVar.k.get(), (x8j.n) eVar.F.get());
            case 26:
                usg.a aVar = cVar.f243096n;
                qud.c cVar3 = cVar.f243097p;
                wsg.n nVarB = aVar.b();
                xv5.c cVarA = cVar.o.a();
                vc.s.j(cVarA);
                yud.g gVarD = cVar3.d();
                mcj.d dVar2 = (mcj.d) cVar.d.f133949q.get();
                vc.s.j(dVar2);
                j60.a aVar2 = (j60.a) eVar.f243124w.get();
                utd.a aVarG = cVar3.g();
                com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) cVar.f243098q).c();
                vc.s.j(aVarC);
                w0i.a aVarA = cVar.f243099r.a();
                fk3.a aVarA2 = cVar.f243100s.a();
                vc.s.j(aVarA2);
                tul.b bVar2 = new tul.b(new f8j.a());
                vh5.a aVar3 = (vh5.a) eVar.E.get();
                t7j.d dVar3 = (t7j.d) cVar.O.get();
                gte.a aVarB2 = cVar.f243093j.b();
                vc.s.j(aVarB2);
                oh5.e eVarA = cVar.u.a();
                n8j.b bVar3 = cVar.v;
                o8j.b bVar4 = new o8j.b();
                lo5.p pVarB = ((yo5.w) bVar3.f213496a).b();
                vc.s.j(pVarB);
                return new x8j.g0(nVarB, cVarA, gVarD, dVar2, aVar2, aVarG, aVarC, aVarA, aVarA2, bVar2, aVar3, dVar3, aVarB2, eVarA, bVar4, new kpj.f(pVarB));
            case 27:
                ii5.a aVarD = cVar.f243101t.d();
                vc.s.j(aVarD);
                return w40.c.j(aVarD);
            case 28:
                bq6.a extension2 = (bq6.a) eVar.H.get();
                e9j.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension2, "extension");
                vc.s.k(extension2);
                return extension2;
            case 29:
                fq6.a api2 = cVar.f243102w;
                bq6.b view3 = (bq6.b) eVar.k.get();
                CryptoAssetDetailsScreenContract$InputData inputData2 = eVar.f243108b;
                e9j.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(api2, "api");
                Intrinsics.checkNotNullParameter(view3, "view");
                Intrinsics.checkNotNullParameter(inputData2, "inputData");
                cq6.d dVar4 = (cq6.d) api2.f137194j.get();
                xi0.b currency = inputData2.f99962a;
                dVar4.getClass();
                Intrinsics.checkNotNullParameter(view3, "view");
                Intrinsics.checkNotNullParameter(currency, "currency");
                return new cq6.l(view3, dVar4.f108004a, dVar4.f108005b, dVar4.f108006c, dVar4.d, currency);
            case 30:
                k2d.d dVar5 = cVar.f243091g;
                m2d.a factory2 = new m2d.a();
                e9j.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory2, "factory");
                return m2d.a.a();
            case 31:
                jpc.e factory3 = cVar.f243103x.a();
                j60.a bottomExpandableDialogControllerExtension = (j60.a) eVar.f.get();
                e9j.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory3, "factory");
                Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
                return factory3.c("COMBINED_WATCHLIST_ORDERING_HOME", bottomExpandableDialogControllerExtension);
            case 32:
                CryptoAssetDetailsScreenContract$InputData cryptoAssetDetailsScreenContract$InputData = eVar.f243108b;
                a9j.w wVar = (a9j.w) eVar.k.get();
                a9j.a aVar4 = (a9j.a) eVar.M.get();
                o9j.b bVar5 = (o9j.b) cVar.D.f.get();
                vc.s.j(bVar5);
                sd5.c cVarA2 = cVar.E.a();
                vc.s.j(cVarA2);
                c9j.e eVar2 = new c9j.e();
                sd5.c cVarA3 = eVar.f243110c.E.a();
                vc.s.j(cVarA3);
                return new a9j.u(cryptoAssetDetailsScreenContract$InputData, wVar, aVar4, bVar5, cVarA2, new c9j.d(eVar2, cVarA3), (y8j.a) eVar.O.get());
            case 33:
                fk3.a aVarA3 = cVar.f243100s.a();
                vc.s.j(aVarA3);
                wsg.n nVarB2 = cVar.f243096n.b();
                f61.a aVarB3 = ((n51.a) cVar.f243104y).b();
                l61.a aVarB4 = cVar.z.b();
                vc.s.j(aVarB4);
                ppk.f fVarA = cVar.A.a();
                whf.b bVarA2 = cVar.B.a();
                vc.s.j(bVarA2);
                a8j.a aVar5 = (a8j.a) eVar.L.get();
                l80.e eVarH = cVar.C.h();
                vc.s.j(eVarH);
                xv5.c cVarA4 = cVar.o.a();
                vc.s.j(cVarA4);
                return new a9j.g(aVarA3, nVarB2, aVarB3, aVarB4, fVarA, bVarA2, aVar5, eVarH, cVarA4);
            case 34:
                return b9j.c.a();
            case 35:
                y8j.c cVar4 = (y8j.c) eVar.k.get();
                y8j.b bVar6 = (y8j.b) eVar.N.get();
                xv5.c cVarA5 = cVar.o.a();
                vc.s.j(cVarA5);
                a9j.a aVar6 = (a9j.a) eVar.M.get();
                gte.a aVarB5 = cVar.F.f278148a.b();
                vc.s.j(aVarB5);
                w8b.c cVar5 = new w8b.c(aVarB5);
                c9j.e eVar3 = new c9j.e();
                sd5.c cVarA6 = eVar.f243110c.E.a();
                vc.s.j(cVarA6);
                return new y8j.f(cVar4, bVar6, cVarA5, aVar6, cVar5, new c9j.d(eVar3, cVarA6));
            case 36:
                return new y8j.d();
            case 37:
                CryptoAssetDetailsScreenContract$InputData cryptoAssetDetailsScreenContract$InputData2 = eVar.f243108b;
                g9j.d dVar6 = (g9j.d) eVar.k.get();
                g9j.w wVar2 = (g9j.w) eVar.R.get();
                h9j.a aVar7 = (h9j.a) eVar.S.get();
                h9j.g gVar = (h9j.g) eVar.T.get();
                h9j.d dVar7 = (h9j.d) eVar.U.get();
                rc5.b bVar7 = eVar.f243110c.f;
                ttd.a aVarH = bVar7.f253197a.f249364b.h();
                gte.a aVarB6 = bVar7.f253198b.b();
                vc.s.j(aVarB6);
                return new g9j.t(cryptoAssetDetailsScreenContract$InputData2, dVar6, wVar2, new g9j.h(aVar7, gVar, dVar7, new cd5.c(aVarB6, aVarH), new cd5.f()), cVar.f243099r.a(), (s8j.c) eVar.V.get(), (vh5.a) eVar.E.get(), cVar.e.a(), (bq6.a) eVar.H.get());
            case 38:
                wsg.n nVarB3 = cVar.f243096n.b();
                ppk.f fVarA2 = cVar.A.a();
                mu5.f fVarD = cVar.G.d();
                yud.g gVarD2 = cVar.f243097p.d();
                q8j.c cVar6 = eVar.f243110c;
                jul.o oVar = new jul.o(cVar6.A.a(), cVar6.f243096n.b());
                r8j.d dVar8 = (r8j.d) eVar.Q.get();
                xv5.c cVarA7 = cVar.o.a();
                vc.s.j(cVarA7);
                return new g9j.w(nVarB3, fVarA2, fVarD, gVarD2, oVar, dVar8, cVarA7, cVar.u.a());
            case 39:
                wsg.n nVarB4 = cVar.f243096n.b();
                l61.a aVarB7 = cVar.z.b();
                vc.s.j(aVarB7);
                gte.a aVarB8 = cVar.f243093j.b();
                vc.s.j(aVarB8);
                return new r8j.g(nVarB4, aVarB7, aVarB8);
            case 40:
                gte.a aVarB9 = cVar.f243093j.b();
                vc.s.j(aVarB9);
                return new h9j.c(aVarB9, cVar.f243097p.f249364b.h());
            case 41:
                he2.b bVarA3 = cVar.f.a();
                ttd.a aVarH2 = cVar.f243097p.f249364b.h();
                gte.a aVarB10 = cVar.f243093j.b();
                vc.s.j(aVarB10);
                return new h9j.i(aVarB10, bVarA3, aVarH2);
            case 42:
                ttd.a aVarH3 = cVar.f243097p.f249364b.h();
                he2.b bVarA4 = cVar.f.a();
                gte.a aVarB11 = cVar.f243093j.b();
                vc.s.j(aVarB11);
                return new h9j.f(aVarB11, bVarA4, aVarH3);
            case 43:
                return new s8j.c(cVar.a());
            case 44:
                m0k.e eVar4 = (m0k.e) cVar.H.H.get();
                vc.s.j(eVar4);
                return new t8j.b(eVar4, (t8j.e) eVar.k.get());
            case 45:
                cli.n nVar = (cli.n) eVar.f243109b0.get();
                u8j.e eVar5 = (u8j.e) eVar.k.get();
                l1d.a aVar8 = (l1d.a) eVar.J.get();
                u1d.a aVar9 = (u1d.a) eVar.K.get();
                CryptoAssetDetailsScreenContract$InputData cryptoAssetDetailsScreenContract$InputData3 = eVar.f243108b;
                r8j.a aVar10 = (r8j.a) eVar.c0.get();
                ei5.d dVar9 = cVar.f243101t;
                vv5.e eVar6 = cVar.o;
                nyj.h hVar = cVar.I;
                sh5.d dVarF = dVar9.f();
                vc.s.j(dVarF);
                vyj.a aVar11 = new vyj.a((g09.e) ((nyj.c) hVar).v.get(), new h09.d(new h09.f()));
                a9j.v vVar = (a9j.v) eVar.P.get();
                g9j.b bVar8 = (g9j.b) eVar.W.get();
                c8j.c cVar7 = (c8j.c) eVar.f243115j.get();
                w7j.a aVar12 = (w7j.a) eVar.f243118n.get();
                t8j.c cVar8 = (t8j.c) eVar.X.get();
                m1d.a aVar13 = (m1d.a) eVar.f243120q.get();
                pt5.m mVar = (pt5.m) eVar.f243122s.get();
                d9j.e eVar7 = (d9j.e) eVar.C.get();
                x8j.n nVar2 = (x8j.n) eVar.F.get();
                y8j.a aVar14 = (y8j.a) eVar.O.get();
                xv5.c cVarA8 = eVar6.a();
                vc.s.j(cVarA8);
                j61.b bVarC = cVar.J.c();
                vc.s.j(bVarC);
                tv5.b bVarC2 = eVar6.c();
                vc.s.j(bVarC2);
                r8j.b bVar9 = (r8j.b) eVar.f243111d0.get();
                sd5.c cVarA9 = cVar.E.a();
                vc.s.j(cVarA9);
                myj.e eVar8 = (myj.e) ((nyj.c) hVar).K.get();
                vc.s.j(eVar8);
                return new com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.asset_details.a(nVar, eVar5, aVar8, aVar9, cryptoAssetDetailsScreenContract$InputData3, aVar10, dVarF, aVar11, vVar, bVar8, cVar7, aVar12, cVar8, aVar13, mVar, eVar7, nVar2, aVar14, cVarA8, bVarC, bVarC2, bVar9, cVarA9, eVar8, (e5d.a) eVar.z.get());
            case 46:
                return new u8j.k((i9j.a) eVar.Y.get(), (t8j.d) eVar.Z.get(), (pt5.f) eVar.f243107a0.get(), new vyj.a((g09.e) ((nyj.c) cVar.I).v.get(), new h09.d(new h09.f())));
            case 47:
                return new i9j.a();
            case 48:
                h9h.a aVar15 = cVar.f243095m;
                jbh.f relativeTimeClauseBuilder = new jbh.f();
                Intrinsics.checkNotNullParameter(relativeTimeClauseBuilder, "relativeTimeClauseBuilder");
                return new t8j.h();
            case 49:
                ev5.d dVarD5 = ((ku5.f) cVar.f243092h).d();
                vc.s.j(dVarD5);
                return qt5.e.a(dVarD5);
            case 50:
                ppk.f fVarA3 = cVar.A.a();
                xv5.c cVarA10 = cVar.o.a();
                vc.s.j(cVarA10);
                return new r8j.a(fVarA3, cVarA10);
            case 51:
                xv5.c cVarA11 = cVar.o.a();
                vc.s.j(cVarA11);
                l3d.h0 h0VarB = cVar.K.b();
                vc.s.j(h0VarB);
                g9j.w wVar3 = (g9j.w) eVar.R.get();
                efd.a aVarA4 = cVar.L.a();
                vc.s.j(aVarA4);
                return new r8j.c(cVarA11, h0VarB, wVar3, aVarA4);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object c() {
        q8j.f fVar = (q8j.f) this.d;
        q8j.c cVar = (q8j.c) this.f239225c;
        vv5.e eVar = cVar.o;
        qud.c cVar2 = cVar.f243097p;
        int i = this.f239224b;
        switch (i) {
            case 0:
                return kxa.j.k((j60.a) fVar.f.get());
            case 1:
                return ehe.n.s((com.revolut.kompot.navigable.a) fVar.d.get(), (rp0.m) fVar.e.get());
            case 2:
                return new rp0.m();
            case 3:
                return new x8j.e(fVar.f243127a, (x8j.n) fVar.i.get());
            case 4:
                wsg.n nVarB = cVar.f243096n.b();
                xv5.c cVarA = eVar.a();
                vc.s.j(cVarA);
                yud.g gVarD = cVar2.d();
                mcj.d dVar = (mcj.d) cVar.d.f133949q.get();
                vc.s.j(dVar);
                j60.a aVar = (j60.a) fVar.f.get();
                utd.a aVarG = cVar2.g();
                com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) cVar.f243098q).c();
                vc.s.j(aVarC);
                w0i.a aVarA = cVar.f243099r.a();
                fk3.a aVarA2 = cVar.f243100s.a();
                vc.s.j(aVarA2);
                tul.b bVar = new tul.b(new f8j.a());
                vh5.a aVar2 = (vh5.a) fVar.f243131h.get();
                t7j.d dVar2 = (t7j.d) cVar.O.get();
                gte.a aVarB = cVar.f243093j.b();
                vc.s.j(aVarB);
                oh5.e eVarA = cVar.u.a();
                n8j.b bVar2 = cVar.v;
                o8j.b bVar3 = new o8j.b();
                lo5.p pVarB = ((yo5.w) bVar2.f213496a).b();
                vc.s.j(pVarB);
                return new x8j.g0(nVarB, cVarA, gVarD, dVar, aVar, aVarG, aVarC, aVarA, aVarA2, bVar, aVar2, dVar2, aVarB, eVarA, bVar3, new kpj.f(pVarB));
            case 5:
                ii5.a aVarD = cVar.f243101t.d();
                vc.s.j(aVarD);
                return w40.c.j(aVarD);
            case 6:
                ppk.f fVarA = cVar.A.a();
                yud.g gVarD2 = cVar2.d();
                mu5.f fVarD = cVar.G.d();
                sud.b bVarI = cVar2.i();
                x8j.n nVar = (x8j.n) fVar.i.get();
                xv5.c cVarA2 = eVar.a();
                vc.s.j(cVarA2);
                ang.f fVarE = cVar.z.e();
                CryptoEarningScreenContract$InputData cryptoEarningScreenContract$InputData = fVar.f243128b;
                q8j.c cVar3 = fVar.f243129c;
                cd5.d dVar3 = new cd5.d(new cd5.a(new wt5.a()), cVar3.f.a());
                cd5.e eVar2 = new cd5.e();
                cd5.g gVar = new cd5.g();
                wwd.d dVarJ = cVar3.f243097p.j();
                cd5.h hVar = new cd5.h();
                gte.a aVarB2 = cVar3.f243093j.b();
                vc.s.j(aVarB2);
                return new com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.earning.v2.a(fVarA, gVarD2, fVarD, bVarI, nVar, cVarA2, fVarE, cryptoEarningScreenContract$InputData, new l9j.n(dVar3, eVar2, gVar, dVarJ, hVar, aVarB2));
            default:
                throw new AssertionError(i);
        }
    }

    private final Object d() {
        q8j.g gVar = (q8j.g) this.d;
        q8j.c cVar = (q8j.c) this.f239225c;
        int i = this.f239224b;
        switch (i) {
            case 0:
                return kxa.j.k((j60.a) gVar.f.get());
            case 1:
                return ehe.n.s((com.revolut.kompot.navigable.a) gVar.d.get(), (rp0.m) gVar.e.get());
            case 2:
                return new rp0.m();
            case 3:
                return kxa.j.j((j60.a) gVar.i.get());
            case 4:
                return v1.c.r((com.revolut.kompot.navigable.a) gVar.d.get(), (rp0.m) gVar.f243137h.get());
            case 5:
                return new rp0.m();
            case 6:
                return new x8j.e(gVar.f243133a, (x8j.n) gVar.f243139l.get());
            case 7:
                usg.a aVar = cVar.f243096n;
                qud.c cVar2 = cVar.f243097p;
                wsg.n nVarB = aVar.b();
                xv5.c cVarA = cVar.o.a();
                vc.s.j(cVarA);
                yud.g gVarD = cVar2.d();
                mcj.d dVar = (mcj.d) cVar.d.f133949q.get();
                vc.s.j(dVar);
                j60.a aVar2 = (j60.a) gVar.f.get();
                utd.a aVarG = cVar2.g();
                com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) cVar.f243098q).c();
                vc.s.j(aVarC);
                w0i.a aVarA = cVar.f243099r.a();
                fk3.a aVarA2 = cVar.f243100s.a();
                vc.s.j(aVarA2);
                tul.b bVar = new tul.b(new f8j.a());
                vh5.a aVar3 = (vh5.a) gVar.k.get();
                t7j.d dVar2 = (t7j.d) cVar.O.get();
                gte.a aVarB = cVar.f243093j.b();
                vc.s.j(aVarB);
                oh5.e eVarA = cVar.u.a();
                n8j.b bVar2 = cVar.v;
                o8j.b bVar3 = new o8j.b();
                lo5.p pVarB = ((yo5.w) bVar2.f213496a).b();
                vc.s.j(pVarB);
                return new x8j.g0(nVarB, cVarA, gVarD, dVar, aVar2, aVarG, aVarC, aVarA, aVarA2, bVar, aVar3, dVar2, aVarB, eVarA, bVar3, new kpj.f(pVarB));
            case 8:
                ii5.a aVarD = cVar.f243101t.d();
                vc.s.j(aVarD);
                return w40.c.j(aVarD);
            case 9:
                npk.a aVar4 = cVar.A;
                qud.c cVar3 = cVar.f243097p;
                ppk.f fVarA = aVar4.a();
                mu5.f fVarD = cVar.G.d();
                q8j.c cVar4 = gVar.f243135c;
                jul.o oVar = new jul.o(cVar4.A.a(), cVar4.f243096n.b());
                r8j.d dVar3 = (r8j.d) gVar.f243141n.get();
                xv5.c cVarA2 = cVar.o.a();
                vc.s.j(cVarA2);
                yud.g gVarD2 = cVar3.d();
                zud.a aVarE = cVar3.e();
                x8j.n nVar = (x8j.n) gVar.f243139l.get();
                dd5.a aVar5 = new dd5.a();
                sud.b bVarI = cVar3.i();
                ang.f fVarE = cVar.z.e();
                gte.a aVarB2 = cVar.f243093j.b();
                vc.s.j(aVarB2);
                oh5.e eVarA2 = cVar.u.a();
                avd.b bVarC = cVar3.c();
                CryptoHoldingScreenContract$InputData cryptoHoldingScreenContract$InputData = gVar.f243134b;
                q8j.c cVar5 = gVar.f243135c;
                rc5.b bVar4 = cVar5.f;
                cd5.a aVar6 = new cd5.a(new wt5.a());
                he2.b bVarA = bVar4.a();
                cd5.g gVar2 = new cd5.g();
                wwd.d dVarJ = cVar5.f243097p.j();
                gte.a aVarB3 = cVar5.f243093j.b();
                vc.s.j(aVarB3);
                return new com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.holding.a(fVarA, fVarD, oVar, dVar3, cVarA2, gVarD2, aVarE, nVar, aVar5, bVarI, fVarE, aVarB2, eVarA2, bVarC, cryptoHoldingScreenContract$InputData, new m9j.r(aVar6, bVarA, gVar2, dVarJ, aVarB3));
            case 10:
                wsg.n nVarB2 = cVar.f243096n.b();
                l61.a aVarB4 = cVar.z.b();
                vc.s.j(aVarB4);
                gte.a aVarB5 = cVar.f243093j.b();
                vc.s.j(aVarB5);
                return new r8j.g(nVarB2, aVarB4, aVarB5);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object e() {
        qbj.q qVar = (qbj.q) this.f239225c;
        qbj.r rVar = (qbj.r) this.d;
        int i = this.f239224b;
        switch (i) {
            case 0:
                return new bcj.b(rVar.f244345a, (bcj.f) rVar.d.get());
            case 1:
                bcj.h hVar = new bcj.h();
                gte.a aVarB = qVar.d.b();
                vc.s.j(aVarB);
                rea.m mVarF = qVar.e.f();
                fbj.a aVarA = ((qbj.m) qVar.f244329a).a();
                vc.s.j(aVarA);
                return new bcj.l(hVar, aVarB, new rbj.f(mVarF, aVarA));
            case 2:
                zbj.f0 extension = (zbj.f0) rVar.f244349h.get();
                acj.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                zbj.f0 f0Var = extension;
                vc.s.k(f0Var);
                return f0Var;
            case 3:
                return new zbj.f0(rVar.b(), (z1) rVar.f244348g.get());
            case 4:
                com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) rVar.f.get();
                acj.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller, "controller");
                return new z1(controller.m2());
            case 5:
                Object extension2 = (zbj.r) rVar.f244350j.get();
                acj.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension2, "extension");
                yji.n nVar = (yji.n) extension2;
                vc.s.k(nVar);
                return nVar;
            case 6:
                return new q0(qVar.f244334j.a());
            case 7:
                Object model = (bcj.f) rVar.d.get();
                ccj.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                yji.n nVar2 = (yji.n) model;
                vc.s.k(nVar2);
                return nVar2;
            case 8:
                ete.a factory = (ete.a) qVar.k.f324910h.get();
                vc.s.j(factory);
                acj.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory, "factory");
                return factory.a();
            case 9:
                w9j.a factory2 = qVar.f244335l.a();
                vc.s.j(factory2);
                acj.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory2, "factory");
                return new w9j.b();
            case 10:
                fcj.b bVarC = rVar.c();
                qbj.q qVar2 = rVar.f244347c;
                t0 t0Var = new t0(bVarC);
                fcj.b bVarC2 = rVar.c();
                uj5.a aVarB2 = ((ak5.i) ((qbj.m) qVar2.f244329a).f).b();
                vc.s.j(aVarB2);
                fcj.f selectNetworkDialogMapper = new fcj.f(aVarB2);
                fcj.c minimumDepositDialogMapper = new fcj.c();
                uj5.a aVarB3 = ((ak5.i) qVar2.f244330b).b();
                vc.s.j(aVarB3);
                fcj.e mindfulOfNetworkDialogMapper = new fcj.e(aVarB3);
                fcj.h tagDialogMapper = new fcj.h();
                fcj.g shotDialogMapper = new fcj.g();
                uj5.a aVarB4 = ((ak5.i) qVar2.f244330b).b();
                vc.s.j(aVarB4);
                fcj.i viewAddressDialogMapper = new fcj.i(aVarB4);
                Intrinsics.checkNotNullParameter(selectNetworkDialogMapper, "selectNetworkDialogMapper");
                Intrinsics.checkNotNullParameter(minimumDepositDialogMapper, "minimumDepositDialogMapper");
                Intrinsics.checkNotNullParameter(mindfulOfNetworkDialogMapper, "mindfulOfNetworkDialogMapper");
                Intrinsics.checkNotNullParameter(tagDialogMapper, "tagDialogMapper");
                Intrinsics.checkNotNullParameter(shotDialogMapper, "shotDialogMapper");
                Intrinsics.checkNotNullParameter(viewAddressDialogMapper, "viewAddressDialogMapper");
                r10.r rVar2 = new r10.r();
                rVar2.f250851a = selectNetworkDialogMapper;
                rVar2.f250852b = mindfulOfNetworkDialogMapper;
                rVar2.f250853c = viewAddressDialogMapper;
                zbj.r rVar3 = (zbj.r) rVar.f244350j.get();
                CryptoDepositsOverviewControllerContract$InputData cryptoDepositsOverviewControllerContract$InputData = rVar.f244346b;
                rbj.l lVarB = rVar.b();
                pn3.a aVar = (pn3.a) qVar.f244344x.get();
                vbj.c cVar = (vbj.c) ((qbj.m) qVar.f244329a).f244320s.get();
                vc.s.j(cVar);
                dte.b bVar = (dte.b) rVar.f244352m.get();
                c70.a aVarZ = qVar.i.z();
                vc.s.j(aVarZ);
                tqi.e eVarD = qVar.o.d();
                se5.a aVar2 = new se5.a();
                bcj.f fVar = (bcj.f) rVar.d.get();
                zbj.f0 f0Var2 = (zbj.f0) rVar.f244349h.get();
                w9j.e eVarB = qVar.f244335l.b();
                vc.s.j(eVarB);
                return new com.revolut.retail.feature.crypto_deposits.impl.ui.overview.c(t0Var, bVarC2, rVar2, rVar3, cryptoDepositsOverviewControllerContract$InputData, lVarB, aVar, cVar, bVar, aVarZ, eVarD, aVar2, fVar, f0Var2, eVarB, (v9j.a) rVar.f244353n.get());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object f() {
        qc9.a aVar = (qc9.a) this.d;
        qc9.c cVar = aVar.f244609b;
        qc9.c cVar2 = (qc9.c) this.f239225c;
        ite.a aVar2 = cVar2.f244622m;
        int i = this.f239224b;
        if (i != 0) {
            if (i == 1) {
                rpa.b bVarA = cVar2.k.a();
                vc.s.j(bVarA);
                return new tk3.e(bVarA, new tk3.c());
            }
            if (i != 2) {
                throw new AssertionError(i);
            }
            ji0.a aVarG = cVar2.f244621l.g();
            vc.s.j(aVarG);
            tk3.c cVar3 = new tk3.c();
            gte.a aVarB = aVar2.b();
            vc.s.j(aVarB);
            return new tk3.k(aVarG, cVar3, aVarB);
        }
        ESignOtpScreenContract$InputData eSignOtpScreenContract$InputData = aVar.f244608a;
        pk3.a aVar3 = (pk3.a) cVar2.f244631y.get();
        ImmutableMap immutableMapOf = ImmutableMap.of(nk3.a.PUSH, aVar.d, nk3.a.SMS, aVar.e);
        nf0.a aVar4 = cVar.f244623n;
        sf0.h hVarB = aVar4.b();
        vc.s.j(hVarB);
        qk3.c cVar4 = new qk3.c(hVarB);
        sf0.h hVarB2 = aVar4.b();
        vc.s.j(hVarB2);
        qk3.e eVar = new qk3.e(hVarB2);
        sf0.h hVarB3 = aVar4.b();
        vc.s.j(hVarB3);
        ImmutableSet immutableSetOf = ImmutableSet.of((qk3.g) cVar4, (qk3.g) eVar, new qk3.g(hVarB3));
        ESignOtpScreenContract$InputData eSignOtpScreenContract$InputData2 = aVar.f244608a;
        z80.b bVarS = cVar.f244620j.s();
        vc.s.j(bVarS);
        rk3.p pVar = new rk3.p(eSignOtpScreenContract$InputData2, bVarS);
        gte.a aVarB2 = aVar2.b();
        vc.s.j(aVarB2);
        return new com.revolut.feature.confirmation_code.ui.otp.a(eSignOtpScreenContract$InputData, aVar3, immutableMapOf, immutableSetOf, pVar, aVarB2);
    }

    private final Object g() {
        qc9.d dVar = (qc9.d) this.d;
        qc9.c cVar = (qc9.c) this.f239225c;
        an0.c cVar2 = cVar.e;
        q1 q1Var = cVar.f;
        int i = this.f239224b;
        if (i != 0) {
            if (i == 1) {
                xjl.n factory = (xjl.n) ((ljl.q0) q1Var).f196079t0.get();
                vc.s.j(factory);
                qc9.l.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory, "factory");
                return new kll.a(factory.f306575b, factory.f306576c);
            }
            if (i != 2) {
                if (i == 3) {
                    return new oc9.m();
                }
                throw new AssertionError(i);
            }
            kll.a extension = (kll.a) dVar.d.get();
            qc9.l.Companion.getClass();
            Intrinsics.checkNotNullParameter(extension, "extension");
            vc.s.k(extension);
            return extension;
        }
        o99.a aVar = (o99.a) cVar.f244631y.get();
        ang.f fVarE = cVar.f244617c.e();
        QesTermsFlowInputData qesTermsFlowInputData = dVar.f244632a;
        oe9.a aVar2 = (oe9.a) cVar.d.i.get();
        vc.s.j(aVar2);
        cn0.c cVar3 = (cn0.c) cVar2.A.get();
        vc.s.j(cVar3);
        hn0.n nVarH = cVar2.h();
        vc.s.j(nVarH);
        nkl.b bVarI = ((ljl.q0) q1Var).i();
        xjl.i iVar = (xjl.i) ((ljl.q0) q1Var).Z.get();
        vc.s.j(iVar);
        kll.a aVar3 = (kll.a) dVar.d.get();
        mli.e eVarB = ((j51.a) cVar.f244618g).b();
        vc.s.j(eVarB);
        com.revolut.retail.feature.api.userauth.navigation.a aVarA = cVar.f244619h.a();
        vc.s.j(aVarA);
        cn0.e eVarE = cVar2.e();
        vc.s.j(eVarE);
        return new com.revolut.feature.onboarding.impl.qes_terms.h(aVar, fVarE, qesTermsFlowInputData, aVar2, cVar3, nVarH, bVarI, iVar, aVar3, eVarB, aVarA, eVarE);
    }

    private final Object h() {
        qc9.c cVar = (qc9.c) this.f239225c;
        int i = this.f239224b;
        if (i != 0) {
            if (i == 1) {
                return new mc9.q();
            }
            throw new AssertionError(i);
        }
        o99.a aVar = (o99.a) cVar.f244631y.get();
        pre.c cVarA = cVar.o.a();
        vc.s.j(cVarA);
        w39.b bVarA = cVar.f244624p.a();
        vc.s.j(bVarA);
        qc9.f fVar = (qc9.f) this.d;
        return new com.revolut.feature.onboarding.impl.qes.waiting_qes_result.b(aVar, cVarA, bVarA, fVar.f244639a, (mc9.q) fVar.f244641c.get());
    }

    private final Object i() {
        qc9.g gVar = (qc9.g) this.d;
        qc9.c cVar = (qc9.c) this.f239225c;
        int i = this.f239224b;
        if (i == 0) {
            return new kc9.m((o99.a) cVar.f244631y.get(), gVar.f244642a, e4m.b.a(gVar.f244644c), (kc9.n) gVar.d.get());
        }
        if (i != 1) {
            if (i == 2) {
                return new kc9.n();
            }
            throw new AssertionError(i);
        }
        rpa.b bVarA = cVar.k.a();
        vc.s.j(bVarA);
        return new tk3.e(bVarA, new tk3.c());
    }

    private final Object j() {
        qd2.h hVar = (qd2.h) this.d;
        qd2.f fVar = (qd2.f) this.f239225c;
        int i = this.f239224b;
        if (i == 0) {
            xd2.f extension = (xd2.f) hVar.d.get();
            wd2.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(extension, "extension");
            xd2.f fVar2 = extension;
            vc.s.k(fVar2);
            return fVar2;
        }
        if (i == 1) {
            vw1.b bVar = (vw1.b) fVar.f244841m.get();
            wj0.a aVarI = ((nj0.d) fVar.f244835b).i();
            vc.s.j(aVarI);
            return new xd2.f(bVar, aVarI, fVar.f244836c.e());
        }
        if (i == 2) {
            Object extension2 = fVar.d.b();
            vc.s.j(extension2);
            wd2.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(extension2, "extension");
            return (yji.n) extension2;
        }
        if (i != 3) {
            throw new AssertionError(i);
        }
        SpinNavigation$InputData spinNavigation$InputData = hVar.f244847a;
        td2.b bVar2 = new td2.b((c12.f) hVar.f244848b.f244842n.get());
        c12.z zVar = (c12.z) fVar.o.get();
        zja.a aVarA = ((ika.b) fVar.f244837g).a();
        vc.s.j(aVarA);
        return new com.revolut.feature.apm.spin.impl.ui.b(spinNavigation$InputData, bVar2, zVar, aVarA);
    }

    private final Object k() {
        qgi.c cVar = (qgi.c) this.f239225c;
        qgi.b bVar = (qgi.b) this.d;
        int i = this.f239224b;
        switch (i) {
            case 0:
                return kpi.f.a();
            case 1:
                Context contextI = bq.i.i(bVar.f245849a);
                BaseDelegatesActivity baseDelegatesActivityF = bq.i.f(bVar.f245849a);
                t70.g gVarO = cVar.f245858a.o();
                vc.s.j(gVarO);
                return new npi.c(contextI, baseDelegatesActivityF, gVarO);
            case 2:
                return new tpi.i((rpi.c) bVar.f.get(), gsi.c.a(bVar.f245849a));
            case 3:
                return new rpi.b(bq.i.b(bVar.f245849a));
            case 4:
                return new rpi.h(bq.i.b(bVar.f245849a));
            case 5:
                iri.j jVar = (iri.j) cVar.f.get();
                e4m.e eVar = bVar.i;
                fsi.g gVar = bVar.f245849a;
                return new iri.g(jVar, (iri.m) eVar.get(), bq.i.f(gVar), bq.i.l(gVar));
            case 6:
                return new iri.b();
            case 7:
                return new iri.l((iri.m) bVar.i.get(), bq.i.f(bVar.f245849a), (iri.d) bVar.k.get());
            case 8:
                return new iri.d(bq.i.f(bVar.f245849a));
            case 9:
                return new opi.b(bq.i.f(bVar.f245849a));
            case 10:
                WebViewContract$WebViewConfiguration webViewContract$WebViewConfiguration = bVar.f245850b;
                pgi.l lVar = (pgi.l) cVar.f245861g.get();
                wli.x xVar = cVar.f245860c;
                sri.m mVarL = bq.i.l(bVar.f245849a);
                f80.a aVarX = cVar.f245858a.x();
                vc.s.j(aVarX);
                return new pgi.s(webViewContract$WebViewConfiguration, lVar, xVar, mVarL, aVarX);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object l() {
        int i = this.f239224b;
        if (i == 0) {
            cli.n nVar = (cli.n) ((qgk.b) this.d).f245885a.get();
            ffk.t tVarF = ((qgk.i0) this.f239225c).f246013h.f();
            vc.s.j(tVarF);
            return new sjk.g(nVar, tVarF, new sjk.h());
        }
        if (i != 1) {
            throw new AssertionError(i);
        }
        sjk.h planNameMapper = new sjk.h();
        Intrinsics.checkNotNullParameter(planNameMapper, "planNameMapper");
        return new sjk.i();
    }

    private final Object m() {
        qgk.i0 i0Var = (qgk.i0) this.f239225c;
        g3 g3Var = i0Var.u;
        qgk.e eVar = (qgk.e) this.d;
        agk.a aVar = eVar.f245927a;
        int i = this.f239224b;
        switch (i) {
            case 0:
                qh3.c extension = (qh3.c) eVar.f245930g.get();
                ugk.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                vc.s.k(extension);
                return extension;
            case 1:
                wh3.a provider = i0Var.f246025y.a();
                vc.s.j(provider);
                zfk.c planSubscriberControllerModelExtension = (zfk.c) eVar.f.get();
                ugk.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(provider, "provider");
                Intrinsics.checkNotNullParameter(planSubscriberControllerModelExtension, "planSubscriberControllerModelExtension");
                return provider.a(planSubscriberControllerModelExtension);
            case 2:
                mhk.a aVarC = g3Var.c();
                vc.s.j(aVarC);
                return y3.C(aVar, aVarC, (xfk.b) eVar.f245929c.get(), (bgk.a) eVar.d.get(), (wfk.a) eVar.e.get());
            case 3:
                fhk.a aVarB = g3Var.b();
                vc.s.j(aVarB);
                return y3.b(aVar, aVarB);
            case 4:
                ohk.a aVarD = g3Var.d();
                vc.s.j(aVarD);
                return y3.D(aVar, aVarD);
            case 5:
                dhk.a aVarA = g3Var.a();
                vc.s.j(aVarA);
                return y3.z(aVar, aVarA);
            case 6:
                return agk.b.B(aVar, (zfk.c) eVar.f.get(), (xfk.b) eVar.f245929c.get(), (bgk.a) eVar.d.get(), (wfk.a) eVar.e.get(), (bgk.a) eVar.i.get());
            case 7:
                ohk.a aVarD2 = g3Var.d();
                vc.s.j(aVarD2);
                return agk.b.y(aVar, aVarD2);
            case 8:
                tgk.d dVar = eVar.f245928b;
                qh3.c cVar = (qh3.c) eVar.f245930g.get();
                z43.b bVar = (z43.b) i0Var.z.f202796l.get();
                vc.s.j(bVar);
                tgk.a aVar2 = new tgk.a();
                bgk.a aVar3 = (bgk.a) eVar.i.get();
                wik.d dVar2 = (wik.d) i0Var.f246010b.N.get();
                vc.s.j(dVar2);
                tfk.a aVar4 = (tfk.a) i0Var.f246013h.M.get();
                vc.s.j(aVar4);
                return new com.revolut.retail.feature.pricing_plans.ui.impl.flows.checkout.a(dVar, cVar, bVar, aVar2, aVar3, dVar2, aVar4, i0Var.f246014j.e());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object n() {
        qgk.f fVar = (qgk.f) this.d;
        int i = this.f239224b;
        if (i != 0) {
            if (i != 1) {
                throw new AssertionError(i);
            }
            ikk.k subtitleProvider = new ikk.k();
            Intrinsics.checkNotNullParameter(subtitleProvider, "subtitleProvider");
            return new ikk.j();
        }
        cli.n nVar = (cli.n) fVar.f245947b.get();
        DeclineFamilyPlanInvitationScreenContract$InputData declineFamilyPlanInvitationScreenContract$InputData = fVar.f245946a;
        ffk.t tVarF = ((qgk.i0) this.f239225c).f246013h.f();
        vc.s.j(tVarF);
        return new ikk.i(nVar, declineFamilyPlanInvitationScreenContract$InputData, tVarF);
    }

    private final Object o() {
        qgk.g gVar = (qgk.g) this.d;
        int i = this.f239224b;
        if (i == 0) {
            return kxa.j.r((j60.a) gVar.d.get());
        }
        if (i == 1) {
            return kxa.j.p((com.revolut.kompot.navigable.a) gVar.f245959b.get(), (rp0.m) gVar.f245960c.get(), new j60.e());
        }
        if (i == 2) {
            return new rp0.m();
        }
        if (i == 3) {
            akk.h hVar = gVar.f245958a;
            akk.b bVar = (akk.b) gVar.f.get();
            sh3.a aVarA = ((qgk.i0) this.f239225c).v.a();
            vc.s.j(aVarA);
            return new akk.p(hVar, bVar, aVarA, (j60.a) gVar.f245961g.get());
        }
        if (i == 4) {
            return new akk.c();
        }
        if (i != 5) {
            throw new AssertionError(i);
        }
        j60.a bottomExpandableDialogEmbeddedControllerExtension = (j60.a) gVar.d.get();
        bkk.a.Companion.getClass();
        Intrinsics.checkNotNullParameter(bottomExpandableDialogEmbeddedControllerExtension, "bottomExpandableDialogEmbeddedControllerExtension");
        vc.s.k(bottomExpandableDialogEmbeddedControllerExtension);
        return bottomExpandableDialogEmbeddedControllerExtension;
    }

    private final Object p() {
        qgk.i0 i0Var = (qgk.i0) this.f239225c;
        i3 i3Var = i0Var.f246010b;
        int i = this.f239224b;
        if (i != 0) {
            if (i != 1) {
                throw new AssertionError(i);
            }
            cjk.a aVar = new cjk.a();
            cjk.b bVar = new cjk.b();
            gte.a aVarB = i0Var.f246011c.b();
            vc.s.j(aVarB);
            return new hkk.s(aVar, bVar, aVarB);
        }
        egk.a aVar2 = (egk.a) i3Var.M.get();
        vc.s.j(aVar2);
        si7.a aVarA = i0Var.F.a();
        vc.s.j(aVarA);
        mre.c cVarB = i0Var.D.b();
        vc.s.j(cVarB);
        jgk.v vVarD = i3Var.d();
        vc.s.j(vVarD);
        q06.l lVarA = i0Var.f.a();
        vc.s.j(lVarA);
        return new hkk.p(aVar2, aVarA, cVarB, vVarD, lVarA, i3Var.f(), (cli.n) ((qgk.h) this.d).f245993a.get());
    }

    private final Object q() {
        qgk.i0 i0Var = (qgk.i0) this.f239225c;
        qgk.j jVar = (qgk.j) this.d;
        int i = this.f239224b;
        switch (i) {
            case 0:
                return agk.b.B(jVar.f246052a, (zfk.c) jVar.i.get(), (xfk.b) jVar.f.get(), (bgk.a) jVar.f246055g.get(), (wfk.a) jVar.f246056h.get(), (bgk.a) jVar.f246057j.get());
            case 1:
                agk.a aVar = jVar.f246052a;
                mhk.a aVarC = i0Var.u.c();
                vc.s.j(aVarC);
                return y3.C(aVar, aVarC, (xfk.b) jVar.f.get(), (bgk.a) jVar.f246055g.get(), (wfk.a) jVar.f246056h.get());
            case 2:
                agk.a aVar2 = jVar.f246052a;
                fhk.a aVarB = i0Var.u.b();
                vc.s.j(aVarB);
                return y3.b(aVar2, aVarB);
            case 3:
                agk.a aVar3 = jVar.f246052a;
                ohk.a aVarD = i0Var.u.d();
                vc.s.j(aVarD);
                return y3.D(aVar3, aVarD);
            case 4:
                agk.a aVar4 = jVar.f246052a;
                dhk.a aVarA = i0Var.u.a();
                vc.s.j(aVarA);
                return y3.z(aVar4, aVarA);
            case 5:
                agk.a aVar5 = jVar.f246052a;
                ohk.a aVarD2 = i0Var.u.d();
                vc.s.j(aVarD2);
                return agk.b.y(aVar5, aVarD2);
            case 6:
                kik.b bVar = jVar.f246053b;
                yfk.a extension = (yfk.a) jVar.f246058l.get();
                Intrinsics.checkNotNullParameter(extension, "extension");
                vc.s.k(extension);
                return extension;
            case 7:
                kik.b bVar2 = jVar.f246053b;
                kik.a factory = (kik.a) i0Var.u.A.get();
                vc.s.j(factory);
                Intrinsics.checkNotNullParameter(factory, "factory");
                Object obj2 = factory.f184249a.get();
                Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                yfk.a aVar6 = (yfk.a) obj2;
                vc.s.k(aVar6);
                return aVar6;
            case 8:
                cha.b bVarC = i0Var.f246013h.c();
                vc.s.j(bVarC);
                ffk.t tVarF = i0Var.f246013h.f();
                vc.s.j(tVarF);
                return new vjk.d(bVarC, tVarF, new vjk.e());
            case 9:
                cha.b bVarC2 = i0Var.f246013h.c();
                vc.s.j(bVarC2);
                ffk.t tVarF2 = i0Var.f246013h.f();
                vc.s.j(tVarF2);
                return new yjk.c(bVarC2, tVarF2, (zfk.c) jVar.i.get());
            case 10:
                vgk.c cVar = jVar.f246054c;
                cha.b bVarC3 = i0Var.f246013h.c();
                vc.s.j(bVarC3);
                ffk.t tVarF3 = i0Var.f246013h.f();
                vc.s.j(tVarF3);
                ahk.a aVar7 = new ahk.a();
                zfk.c cVar2 = (zfk.c) jVar.i.get();
                ajk.f fVarH = i0Var.f246010b.h();
                gte.a aVarB2 = i0Var.f246011c.b();
                vc.s.j(aVarB2);
                return new com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.d(cVar, bVarC3, tVarF3, aVar7, cVar2, fVarH, aVarB2, (vjk.a) jVar.f246060n.get(), (yjk.a) jVar.o.get(), (yfk.a) jVar.f246058l.get());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object r() {
        qgk.i0 i0Var = (qgk.i0) this.f239225c;
        i3 i3Var = i0Var.f246010b;
        ite.a aVar = i0Var.f246011c;
        int i = this.f239224b;
        if (i != 0) {
            if (i != 1) {
                throw new AssertionError(i);
            }
            yik.b bVar = new yik.b();
            cjk.a aVar2 = new cjk.a();
            cjk.b bVar2 = new cjk.b();
            gte.a aVarB = aVar.b();
            vc.s.j(aVarB);
            return new gkk.n(bVar, aVar2, bVar2, aVarB, ((k3) i0Var.G).a());
        }
        ang.f fVarE = i0Var.f246014j.e();
        egk.a aVar3 = (egk.a) i3Var.M.get();
        vc.s.j(aVar3);
        cha.b bVarC = i0Var.f246013h.c();
        vc.s.j(bVarC);
        mre.c cVarB = i0Var.D.b();
        vc.s.j(cVarB);
        si7.a aVarA = i0Var.F.a();
        vc.s.j(aVarA);
        jgk.v vVarD = i3Var.d();
        vc.s.j(vVarD);
        gte.a aVarB2 = aVar.b();
        vc.s.j(aVarB2);
        qgk.k kVar = (qgk.k) this.d;
        return new gkk.k(fVarE, aVar3, bVarC, cVarB, aVarA, vVarD, aVarB2, kVar.f246073a, (cli.n) kVar.f246074b.get());
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f239223a) {
            case 0:
                l0 l0Var = (l0) this.d;
                g0 g0Var = (g0) this.f239225c;
                u8h.c cVar = g0Var.d;
                int i = this.f239224b;
                if (i == 0) {
                    return a10.b.f((u8h.b) cVar, "factory");
                }
                if (i != 1) {
                    if (i == 2) {
                        return a10.b.g((u8h.b) cVar, "factory");
                    }
                    throw new AssertionError(i);
                }
                TechnicalInsightsControllerContract$InputData technicalInsightsControllerContract$InputData = l0Var.f239231b;
                ouk.b bVar = new ouk.b();
                ytk.b numberClauseMapper = new ytk.b();
                Intrinsics.checkNotNullParameter(numberClauseMapper, "numberClauseMapper");
                muk.n nVar = new muk.n(bVar, new ouk.e(), (z0h.q1) l0Var.e.get());
                qrk.c cVarA = ((a) g0Var.f239147n).a();
                vc.s.j(cVarA);
                ouk.a aVar = new ouk.a();
                z0h.d dVarC = ((u8h.b) l0Var.f239232c.d).c();
                vc.s.j(dVarC);
                return new com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.screens.technicals.a(technicalInsightsControllerContract$InputData, nVar, cVarA, aVar, new f61.a(dVarC));
            case 1:
                px.g gVar = (px.g) this.f239225c;
                px.d dVar = (px.d) this.d;
                int i2 = this.f239224b;
                switch (i2) {
                    case 0:
                        oy.b bVar2 = dVar.f240498a;
                        oy.a extension = (oy.a) dVar.e.get();
                        Intrinsics.checkNotNullParameter(extension, "extension");
                        vc.s.k(extension);
                        return extension;
                    case 1:
                        return olc.c.b(dVar.f240498a, (com.revolut.kompot.navigable.a) dVar.d.get());
                    case 2:
                        fz.b bVar3 = new fz.b((fz.c) dVar.f240502h.get(), (com.revolut.kompot.navigable.a) dVar.d.get());
                        gsi.d.i(bVar3);
                        return bVar3;
                    case 3:
                        LifecycleOwner lifecycleOwner = (LifecycleOwner) dVar.f240501g.get();
                        zx.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
                        fz.c cVar2 = (fz.c) lifecycleOwner;
                        vc.s.k(cVar2);
                        return cVar2;
                    case 4:
                        zx.b.Companion.getClass();
                        return new fz.c();
                    case 5:
                        return new yx.r((xv.h) dVar.f240509r.get(), (xv.c) dVar.f240510s.get(), (cli.n) dVar.f240511t.get());
                    case 6:
                        kdh.b factory = gVar.d.b();
                        Set validators = (Set) dVar.k.get();
                        xv.d framesProvider = (xv.d) dVar.f240508q.get();
                        LifecycleOwner lifecycleOwner2 = (LifecycleOwner) dVar.f240501g.get();
                        zx.a aVar2 = zx.b.Companion;
                        aVar2.getClass();
                        MsBarcodeDetectorSettings msBarcodeDetectorSettings = new MsBarcodeDetectorSettings(bh0.a.QR_CODE, zhm.f0.f322471a);
                        aVar2.getClass();
                        Intrinsics.checkNotNullParameter(factory, "factory");
                        Intrinsics.checkNotNullParameter(validators, "validators");
                        Intrinsics.checkNotNullParameter(framesProvider, "framesProvider");
                        Intrinsics.checkNotNullParameter(lifecycleOwner2, "lifecycleOwner");
                        Intrinsics.checkNotNullParameter(msBarcodeDetectorSettings, "msBarcodeDetectorSettings");
                        return factory.q(validators, framesProvider, lifecycleOwner2, msBarcodeDetectorSettings);
                    case 7:
                        xx.c qrValidator = (xx.c) dVar.f240503j.get();
                        zx.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(qrValidator, "qrValidator");
                        Set setB = y0.b(qrValidator);
                        vc.s.k(setB);
                        return setB;
                    case 8:
                        return new xx.c();
                    case 9:
                        return dw3.l.b((sw.d) dVar.f240507p.get());
                    case 10:
                        tw.a aVarA = gVar.f240527a.a();
                        vc.s.j(aVarA);
                        LifecycleOwner lifecycleOwner3 = (LifecycleOwner) dVar.f240501g.get();
                        PreviewView previewView = (PreviewView) dVar.f240505m.get();
                        yw.h hVar = (yw.h) dVar.o.get();
                        zx.a aVar3 = zx.b.Companion;
                        iy.b experimentsInteractor = dVar.f240500c.f240528b.a();
                        aVar3.getClass();
                        Intrinsics.checkNotNullParameter(experimentsInteractor, "experimentsInteractor");
                        return dw3.l.d(aVarA, lifecycleOwner3, previewView, hVar, false, null, null, null, null);
                    case 11:
                        return dw3.l.t((CameraKitPreviewView) dVar.f240504l.get());
                    case 12:
                        return dw3.l.f((com.revolut.kompot.navigable.a) dVar.d.get());
                    case 13:
                        yw.f impl = (yw.f) dVar.f240506n.get();
                        zx.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(impl, "impl");
                        vc.s.k(impl);
                        return impl;
                    case 14:
                        CameraKitClientSettings cameraKitClientSettings = zx.c.a();
                        zx.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(cameraKitClientSettings, "cameraKitClientSettings");
                        yw.a aVar4 = yw.a.BACK;
                        yw.e eVarA = hy.e.a(cameraKitClientSettings);
                        yw.e eVar = yw.e.HD;
                        yw.e eVar2 = yw.e.FHD;
                        CameraCaptureSettings cameraCaptureSettings = cameraKitClientSettings.f50706a;
                        return new yw.f(aVar4, eVarA, eVar, eVar, new yw.d(new yw.c(hy.a.a(cameraCaptureSettings), hy.b.a(cameraCaptureSettings), hy.a.b(cameraCaptureSettings)), new yw.i(hy.d.a(cameraCaptureSettings), false)), yw.b.COMBINED, eVar2, hy.f.a(cameraCaptureSettings), false);
                    case 15:
                        return dw3.l.a((sw.d) dVar.f240507p.get());
                    case 16:
                        return new yx.p(dVar.f240499b);
                    default:
                        throw new AssertionError(i2);
                }
            case 2:
                px.g gVar2 = (px.g) this.f239225c;
                px.f fVar = (px.f) this.d;
                int i3 = this.f239224b;
                switch (i3) {
                    case 0:
                        oy.b bVar4 = fVar.f240514a;
                        oy.a extension2 = (oy.a) fVar.e.get();
                        Intrinsics.checkNotNullParameter(extension2, "extension");
                        vc.s.k(extension2);
                        return extension2;
                    case 1:
                        return olc.c.b(fVar.f240514a, (com.revolut.kompot.navigable.a) fVar.d.get());
                    case 2:
                        fz.b bVar5 = new fz.b((fz.c) fVar.f240518h.get(), (com.revolut.kompot.navigable.a) fVar.d.get());
                        gsi.d.i(bVar5);
                        return bVar5;
                    case 3:
                        LifecycleOwner lifecycleOwner4 = (LifecycleOwner) fVar.f240517g.get();
                        vx.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(lifecycleOwner4, "lifecycleOwner");
                        fz.c cVar3 = (fz.c) lifecycleOwner4;
                        vc.s.k(cVar3);
                        return cVar3;
                    case 4:
                        vx.b.Companion.getClass();
                        return new fz.c();
                    case 5:
                        return new ux.n((xv.h) fVar.f240523p.get(), (xv.c) fVar.f240524q.get(), (cli.n) fVar.f240525r.get());
                    case 6:
                        kdh.b factory2 = gVar2.d.b();
                        tx.c barcodePatternValidator = new tx.c(fVar.f240515b);
                        vx.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(barcodePatternValidator, "barcodePatternValidator");
                        Set setB2 = y0.b(barcodePatternValidator);
                        vc.s.k(setB2);
                        Set validators2 = setB2;
                        xv.d framesProvider2 = (xv.d) fVar.o.get();
                        LifecycleOwner lifecycleOwner5 = (LifecycleOwner) fVar.f240517g.get();
                        MsBarcodeDetectorSettings msBarcodeDetectorSettings2 = vx.d.a();
                        Intrinsics.checkNotNullParameter(factory2, "factory");
                        Intrinsics.checkNotNullParameter(validators2, "validators");
                        Intrinsics.checkNotNullParameter(framesProvider2, "framesProvider");
                        Intrinsics.checkNotNullParameter(lifecycleOwner5, "lifecycleOwner");
                        Intrinsics.checkNotNullParameter(msBarcodeDetectorSettings2, "msBarcodeDetectorSettings");
                        return factory2.q(validators2, framesProvider2, lifecycleOwner5, msBarcodeDetectorSettings2);
                    case 7:
                        return dw3.l.b((sw.d) fVar.f240522n.get());
                    case 8:
                        tw.a aVarA2 = gVar2.f240527a.a();
                        vc.s.j(aVarA2);
                        LifecycleOwner lifecycleOwner6 = (LifecycleOwner) fVar.f240517g.get();
                        PreviewView previewView2 = (PreviewView) fVar.k.get();
                        yw.h hVar2 = (yw.h) fVar.f240521m.get();
                        vx.a aVar5 = vx.b.Companion;
                        iy.b experimentsInteractor2 = fVar.f240516c.f240528b.a();
                        aVar5.getClass();
                        Intrinsics.checkNotNullParameter(experimentsInteractor2, "experimentsInteractor");
                        return dw3.l.d(aVarA2, lifecycleOwner6, previewView2, hVar2, false, null, null, null, null);
                    case 9:
                        return dw3.l.t((CameraKitPreviewView) fVar.f240519j.get());
                    case 10:
                        return dw3.l.f((com.revolut.kompot.navigable.a) fVar.d.get());
                    case 11:
                        yw.f impl2 = (yw.f) fVar.f240520l.get();
                        vx.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(impl2, "impl");
                        vc.s.k(impl2);
                        return impl2;
                    case 12:
                        CameraKitClientSettings cameraKitClientSettings2 = vx.c.a();
                        vx.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(cameraKitClientSettings2, "cameraKitClientSettings");
                        yw.a aVar6 = yw.a.BACK;
                        yw.e eVarA2 = hy.e.a(cameraKitClientSettings2);
                        yw.e eVar3 = yw.e.HD;
                        yw.e eVar4 = yw.e.FHD;
                        CameraCaptureSettings cameraCaptureSettings2 = cameraKitClientSettings2.f50706a;
                        return new yw.f(aVar6, eVarA2, eVar3, eVar3, new yw.d(new yw.c(hy.a.a(cameraCaptureSettings2), hy.b.a(cameraCaptureSettings2), hy.a.b(cameraCaptureSettings2)), new yw.i(hy.d.a(cameraCaptureSettings2), false)), yw.b.COMBINED, eVar4, hy.f.a(cameraCaptureSettings2), false);
                    case 13:
                        return dw3.l.a((sw.d) fVar.f240522n.get());
                    case 14:
                        return new ux.k(fVar.f240515b);
                    default:
                        throw new AssertionError(i3);
                }
            case 3:
                px.g gVar3 = (px.g) this.f239225c;
                px.h hVar3 = (px.h) this.d;
                int i5 = this.f239224b;
                switch (i5) {
                    case 0:
                        jz.c extension3 = (jz.c) hVar3.f240549x.get();
                        kz.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension3, "extension");
                        vc.s.k(extension3);
                        return extension3;
                    case 1:
                        return new jz.l(new jz.q(), new jz.s(), (fz.c) hVar3.e.get(), (vv.d) hVar3.f240547t.get(), new dz.a(), (pw.c) hVar3.u.get(), hVar3.f240535b, (sx.a) gVar3.k.get(), (ww.b) hVar3.v.get(), (ww.b) hVar3.f240548w.get(), (xv.h) hVar3.f240545r.get());
                    case 2:
                        LifecycleOwner lifecycleOwner7 = (LifecycleOwner) hVar3.d.get();
                        kz.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(lifecycleOwner7, "lifecycleOwner");
                        fz.c cVar4 = (fz.c) lifecycleOwner7;
                        vc.s.k(cVar4);
                        return cVar4;
                    case 3:
                        kz.b.Companion.getClass();
                        return new fz.c();
                    case 4:
                        nv.a api2 = gVar3.f240529c;
                        xv.c cameraCoreDelegate = (xv.c) hVar3.f240540l.get();
                        xv.h detector = (xv.h) hVar3.f240545r.get();
                        LifecycleOwner lifecycleOwner8 = (LifecycleOwner) hVar3.d.get();
                        CameraCaptureSettings cameraCaptureSettings3 = hVar3.f240534a;
                        yw.h cameraSettings = (yw.h) hVar3.f240546s.get();
                        dy.f.Companion.getClass();
                        Intrinsics.checkNotNullParameter(api2, "api");
                        Intrinsics.checkNotNullParameter(cameraCoreDelegate, "cameraCoreDelegate");
                        Intrinsics.checkNotNullParameter(detector, "detector");
                        Intrinsics.checkNotNullParameter(lifecycleOwner8, "lifecycleOwner");
                        Intrinsics.checkNotNullParameter(cameraCaptureSettings3, "cameraCaptureSettings");
                        Intrinsics.checkNotNullParameter(cameraSettings, "cameraSettings");
                        rv.d dVar2 = (rv.d) api2.f.get();
                        dVar2.getClass();
                        Intrinsics.checkNotNullParameter(cameraCoreDelegate, "cameraCoreDelegate");
                        Intrinsics.checkNotNullParameter(detector, "detector");
                        Intrinsics.checkNotNullParameter(lifecycleOwner8, "lifecycleOwner");
                        Intrinsics.checkNotNullParameter(cameraCaptureSettings3, "cameraCaptureSettings");
                        Intrinsics.checkNotNullParameter(cameraSettings, "cameraSettings");
                        prl.e eVar5 = dVar2.f257632a;
                        Intrinsics.checkNotNullParameter(cameraCoreDelegate, "cameraCoreDelegate");
                        Intrinsics.checkNotNullParameter(cameraSettings, "cameraSettings");
                        return new vv.d(cameraCoreDelegate, detector, lifecycleOwner8, new kv.p(cameraCoreDelegate, (xw.a) eVar5.f239325b, cameraSettings, (d4m.a) eVar5.f239326c, (qw.a) eVar5.d, (d4m.a) eVar5.e), cameraCaptureSettings3);
                    case 5:
                        return dw3.l.a((sw.d) hVar3.k.get());
                    case 6:
                        tw.a aVarA3 = gVar3.f240527a.a();
                        vc.s.j(aVarA3);
                        LifecycleOwner lifecycleOwner9 = (LifecycleOwner) hVar3.d.get();
                        PreviewView previewView3 = (PreviewView) hVar3.f240538h.get();
                        yw.h hVar4 = (yw.h) hVar3.f240539j.get();
                        lz.a aVar7 = lz.b.Companion;
                        iy.b experimentsInteractor3 = hVar3.f240536c.f240528b.a();
                        aVar7.getClass();
                        Intrinsics.checkNotNullParameter(experimentsInteractor3, "experimentsInteractor");
                        boolean zA = experimentsInteractor3.a(px.a.f240490a);
                        aVar7.getClass();
                        return dw3.l.d(aVarA3, lifecycleOwner9, previewView3, hVar4, zA, null, null, null, null);
                    case 7:
                        CameraKitPreviewView cameraKitPreviewView = (CameraKitPreviewView) hVar3.f240537g.get();
                        dy.h.Companion.getClass();
                        Intrinsics.checkNotNullParameter(cameraKitPreviewView, "cameraKitPreviewView");
                        cameraKitPreviewView.removeAllViews();
                        PreviewView previewView4 = new PreviewView(cameraKitPreviewView.getContext());
                        cameraKitPreviewView.addView(previewView4);
                        previewView4.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                        cameraKitPreviewView.currentPreview = previewView4;
                        previewView4.setImplementationMode(PreviewView.ImplementationMode.COMPATIBLE);
                        return previewView4;
                    case 8:
                        com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) hVar3.f.get();
                        dy.j.Companion.getClass();
                        Intrinsics.checkNotNullParameter(controller, "controller");
                        View viewFindViewById = controller.D2().findViewById(R$id.cameraKitUi_previewView);
                        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
                        CameraKitPreviewView cameraKitPreviewView2 = (CameraKitPreviewView) viewFindViewById;
                        vc.s.k(cameraKitPreviewView2);
                        return cameraKitPreviewView2;
                    case 9:
                        yw.g impl3 = (yw.g) hVar3.i.get();
                        dy.f.Companion.getClass();
                        Intrinsics.checkNotNullParameter(impl3, "impl");
                        vc.s.k(impl3);
                        return impl3;
                    case 10:
                        CameraCaptureSettings cameraCaptureSettings4 = hVar3.f240534a;
                        jz.a previewlessSelfieCameraSettingsFactory = new jz.a();
                        PreviewlessSelfieFlowContract$InputData inputData = hVar3.f240535b;
                        kz.d.Companion.getClass();
                        Intrinsics.checkNotNullParameter(cameraCaptureSettings4, "cameraCaptureSettings");
                        Intrinsics.checkNotNullParameter(previewlessSelfieCameraSettingsFactory, "previewlessSelfieCameraSettingsFactory");
                        Intrinsics.checkNotNullParameter(inputData, "inputData");
                        Intrinsics.checkNotNullParameter(cameraCaptureSettings4, "cameraCaptureSettings");
                        yw.a cameraLens = yw.a.FRONT;
                        yw.e photoResolution = yw.e.HD;
                        yw.d cameraPreset = new yw.d(new yw.c(hy.a.a(cameraCaptureSettings4), hy.b.a(cameraCaptureSettings4), hy.a.b(cameraCaptureSettings4)), new yw.i(hy.d.a(cameraCaptureSettings4), false));
                        yw.b initialMode = yw.b.COMBINED;
                        VideoWatermark videoWatermark = hy.f.a(cameraCaptureSettings4);
                        Intrinsics.checkNotNullParameter(cameraLens, "cameraLens");
                        Intrinsics.checkNotNullParameter(photoResolution, "videoResolution");
                        Intrinsics.checkNotNullParameter(photoResolution, "analysisResolution");
                        Intrinsics.checkNotNullParameter(photoResolution, "photoResolution");
                        Intrinsics.checkNotNullParameter(initialMode, "initialMode");
                        Intrinsics.checkNotNullParameter(cameraPreset, "cameraPreset");
                        Intrinsics.checkNotNullParameter(videoWatermark, "videoWatermark");
                        boolean z = inputData.d;
                        Intrinsics.checkNotNullParameter(cameraLens, "cameraLens");
                        Intrinsics.checkNotNullParameter(photoResolution, "videoResolution");
                        Intrinsics.checkNotNullParameter(photoResolution, "analysisResolution");
                        Intrinsics.checkNotNullParameter(photoResolution, "photoResolution");
                        Intrinsics.checkNotNullParameter(initialMode, "initialMode");
                        Intrinsics.checkNotNullParameter(cameraPreset, "cameraPreset");
                        Intrinsics.checkNotNullParameter(videoWatermark, "videoWatermark");
                        return new yw.g(cameraLens, photoResolution, photoResolution, photoResolution, initialMode, cameraPreset, videoWatermark, z);
                    case 11:
                        w2 factory3 = gVar3.d.a();
                        px.g gVar4 = hVar3.f240536c;
                        px.g gVar5 = hVar3.f240536c;
                        LinkedHashSet validators3 = dw3.l.h(gVar4.e, (Set) hVar3.f240541m.get(), (dx.l) hVar3.o.get(), (f00.b) hVar3.f240543p.get());
                        xv.d framesProvider3 = (xv.d) hVar3.f240544q.get();
                        LifecycleOwner lifecycleOwner10 = (LifecycleOwner) hVar3.d.get();
                        dx.l previewMetadata = (dx.l) hVar3.o.get();
                        lz.a aVar8 = lz.b.Companion;
                        iy.b experimentsInteractor4 = gVar5.f240528b.a();
                        aVar8.getClass();
                        Intrinsics.checkNotNullParameter(experimentsInteractor4, "experimentsInteractor");
                        boolean zA2 = experimentsInteractor4.a(px.a.f240490a);
                        iy.b experimentsInteractor5 = gVar5.f240528b.a();
                        aVar8.getClass();
                        Intrinsics.checkNotNullParameter(experimentsInteractor5, "experimentsInteractor");
                        iy.a experiment = px.a.f240492c;
                        boolean zA3 = experimentsInteractor5.a(experiment);
                        iy.b experimentsInteractor6 = gVar5.f240528b.a();
                        Intrinsics.checkNotNullParameter(experimentsInteractor6, "experimentsInteractor");
                        Intrinsics.checkNotNullParameter(experiment, "experiment");
                        kz.d.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory3, "factory");
                        Intrinsics.checkNotNullParameter(validators3, "validators");
                        Intrinsics.checkNotNullParameter(framesProvider3, "framesProvider");
                        Intrinsics.checkNotNullParameter(lifecycleOwner10, "lifecycleOwner");
                        Intrinsics.checkNotNullParameter(previewMetadata, "previewMetadata");
                        Intrinsics.checkNotNullParameter("default", "analysisCollectionFolder");
                        return factory3.n(validators3, framesProvider3, lifecycleOwner10, previewMetadata, zA2, zA3, cx.b.f109873a);
                    case 12:
                        return kz.e.a();
                    case 13:
                        dx.n previewMetadata2 = (dx.n) hVar3.f240542n.get();
                        dy.j.Companion.getClass();
                        Intrinsics.checkNotNullParameter(previewMetadata2, "previewMetadata");
                        vc.s.k(previewMetadata2);
                        return previewMetadata2;
                    case 14:
                        com.revolut.kompot.navigable.a controller2 = (com.revolut.kompot.navigable.a) hVar3.f.get();
                        dy.j.Companion.getClass();
                        Intrinsics.checkNotNullParameter(controller2, "controller");
                        View viewFindViewById2 = controller2.D2().findViewById(R$id.cameraKitUi_previewView);
                        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
                        return new dx.n((CameraKitPreviewView) viewFindViewById2);
                    case 15:
                        kz.d.Companion.getClass();
                        f00.b.Companion.getClass();
                        return f00.a.f130988b;
                    case 16:
                        return dw3.l.b((sw.d) hVar3.k.get());
                    case 17:
                        yw.h impl4 = (yw.h) hVar3.f240539j.get();
                        dy.f.Companion.getClass();
                        Intrinsics.checkNotNullParameter(impl4, "impl");
                        vc.s.k(impl4);
                        return impl4;
                    case 18:
                        return dw3.l.k((sw.d) hVar3.k.get());
                    case 19:
                        return dw3.l.q((sw.d) hVar3.k.get());
                    case 20:
                        return dw3.l.r((sw.d) hVar3.k.get());
                    case 21:
                        y80.a aVarR = gVar3.f.r();
                        vc.s.j(aVarR);
                        return new com.revolut.camerakit.revolut.ui.previewless_selfie.a(aVarR, (jz.c) hVar3.f240549x.get(), hVar3.f240535b);
                    default:
                        throw new AssertionError(i5);
                }
            case 4:
                py5.b bVar6 = (py5.b) this.f239225c;
                py5.a aVar9 = (py5.a) this.d;
                int i6 = this.f239224b;
                switch (i6) {
                    case 0:
                        return kpi.f.a();
                    case 1:
                        Context contextI = bq.i.i(aVar9.f240668a);
                        BaseDelegatesActivity baseDelegatesActivityF = bq.i.f(aVar9.f240668a);
                        t70.g gVarO = bVar6.f240686b.o();
                        vc.s.j(gVarO);
                        return new npi.c(contextI, baseDelegatesActivityF, gVarO);
                    case 2:
                        return new tpi.i((rpi.c) aVar9.f.get(), gsi.c.a(aVar9.f240668a));
                    case 3:
                        return new rpi.b(bq.i.b(aVar9.f240668a));
                    case 4:
                        return new rpi.h(bq.i.b(aVar9.f240668a));
                    case 5:
                        return new iri.g((iri.j) bVar6.i.get(), new oy5.a(), bq.i.f(aVar9.f240668a), bq.i.l(aVar9.f240668a));
                    case 6:
                        return new iri.l(new oy5.a(), bq.i.f(aVar9.f240668a), (iri.d) aVar9.f240673j.get());
                    case 7:
                        return new iri.d(bq.i.f(aVar9.f240668a));
                    case 8:
                        return new opi.b(bq.i.f(aVar9.f240668a));
                    case 9:
                        aVar9.getClass();
                        return new xpi.c(xpi.f.d, bq.i.b(aVar9.f240668a));
                    case 10:
                        aVar9.getClass();
                        return new cn.d(ImmutableSet.copyOf((Collection) dn.b.a()), (cn.e) bVar6.f240690j.get(), bVar6.a());
                    case 11:
                        um.c cVar5 = (um.c) bVar6.k.get();
                        aVar9.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(5);
                        py5.b bVar7 = aVar9.f240670c;
                        hn.h hVar5 = (hn.h) bVar7.f240691l.get();
                        t70.g gVarO2 = bVar7.f240686b.o();
                        vc.s.j(gVarO2);
                        builderBuilderWithExpectedSize.add(new jn.a(hVar5, gVarO2));
                        builderBuilderWithExpectedSize.add(new vm.b(com.google.android.gms.internal.mlkit_vision_face.a.f()));
                        builderBuilderWithExpectedSize.add(bVar7.d());
                        builderBuilderWithExpectedSize.addAll((Iterable) in.g.a());
                        builderBuilderWithExpectedSize.add(new jn.d(e4m.b.a(aVar9.o)));
                        return new in.e(cVar5, builderBuilderWithExpectedSize.build(), bVar6.a());
                    case 12:
                        return bq.i.t(aVar9.f240668a);
                    case 13:
                        aVar9.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize2 = ImmutableSet.builderWithExpectedSize(3);
                        builderBuilderWithExpectedSize2.addAll((Iterable) kn.g.a());
                        builderBuilderWithExpectedSize2.add(aVar9.f240678q.get());
                        builderBuilderWithExpectedSize2.add(new kn.h(e4m.b.a(aVar9.f240671g)));
                        return new kn.e(builderBuilderWithExpectedSize2.build(), (ym.d) bVar6.f240693n.get(), bVar6.a());
                    case 14:
                        return new zm.a();
                    case 15:
                        aVar9.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize3 = ImmutableSet.builderWithExpectedSize(2);
                        builderBuilderWithExpectedSize3.addAll((Iterable) hn.g.a());
                        builderBuilderWithExpectedSize3.add(aVar9.f240670c.d());
                        return new hn.d(builderBuilderWithExpectedSize3.build(), (hn.h) bVar6.f240691l.get(), (npi.f) aVar9.e.get());
                    case 16:
                        return new en.c(ImmutableSet.of((ln.d) aVar9.f240670c.f240692m.get()), bq.i.l(aVar9.f240668a));
                    case 17:
                        return new gn.c((lpi.e) aVar9.u.get(), (sm.e) bVar6.f240694p.get(), ImmutableSet.copyOf((Collection) gn.e.a()), bVar6.a());
                    case 18:
                        return new lpi.b(bq.i.i(aVar9.f240668a), bq.i.j(aVar9.f240668a));
                    case 19:
                        aVar9.getClass();
                        return new in.e(ImmutableSet.copyOf((Collection) pm.b.a()), (om.c) bVar6.f240695q.get(), bVar6.a());
                    case 20:
                        CryptoCommodityDiscoverAllContract$Configuration cryptoCommodityDiscoverAllContract$Configuration = aVar9.f240669b;
                        py5.b bVar8 = aVar9.f240670c;
                        bVar6.getClass();
                        xx5.a aVar10 = new xx5.a();
                        tv5.b bVarC = bVar6.f240687c.c();
                        vc.s.j(bVarC);
                        t70.b bVarG = bVar6.f240686b.g();
                        vc.s.j(bVarG);
                        tj3.a aVarA4 = bVar6.d.a();
                        vc.s.j(aVarA4);
                        xx5.c cVar6 = new xx5.c(aVar10, bVarC, bVarG, aVarA4);
                        vx5.g gVar6 = (vx5.g) aVar9.f240683x.get();
                        t70.b bVarG2 = bVar8.f240686b.g();
                        vc.s.j(bVarG2);
                        ny5.c cVar7 = new ny5.c(bVarG2);
                        nw5.a aVarC = bVar8.e.c();
                        vc.s.j(aVarC);
                        return new vx5.x(cryptoCommodityDiscoverAllContract$Configuration, cVar6, gVar6, cVar7, new ny5.i(new ny5.g(aVarC), new ny5.e()), (xpi.g) aVar9.f240675m.get(), (vx5.d) aVar9.f240684y.get(), new sy5.c((rpi.c) aVar9.f.get()), bq.i.e(aVar9.f240668a), bVar6.f.a(), new oy5.b((ln.a) bVar6.f240692m.get()), new ny5.u(), (my5.b) aVar9.B.get());
                    case 21:
                        return new vx5.y((ln.a) bVar6.f240692m.get(), new oy5.b((ln.a) bVar6.f240692m.get()));
                    case 22:
                        return new vx5.k();
                    case 23:
                        return new my5.i((my5.d) aVar9.A.get(), (opi.d) aVar9.f240674l.get(), new ny5.j());
                    case 24:
                        nw5.j jVarD = bVar6.e.d();
                        vc.s.j(jVarD);
                        return new my5.d(jVarD, new ny5.u(), (my5.a) aVar9.z.get());
                    default:
                        throw new AssertionError(i6);
                }
            case 5:
                q1k.c cVar8 = (q1k.c) this.d;
                q1k.a aVar11 = (q1k.a) this.f239225c;
                int i21 = this.f239224b;
                if (i21 != 0) {
                    if (i21 == 1) {
                        return new s1k.k(new dcd.b());
                    }
                    throw new AssertionError(i21);
                }
                jki.p pVar = (jki.p) cVar8.f241461b.get();
                PaymentOptionsScreenContract$InputData paymentOptionsScreenContract$InputData = cVar8.f241460a;
                wsg.n nVarB = aVar11.f241454a.b();
                ppg.b bVarB = ((wpg.l) aVar11.f241455b).b();
                vc.s.j(bVarB);
                return new s1k.j(pVar, paymentOptionsScreenContract$InputData, nVarB, bVarB);
            case 6:
                q1k.a aVar12 = (q1k.a) this.f239225c;
                q1k.d dVar3 = (q1k.d) this.d;
                int i22 = this.f239224b;
                if (i22 == 0) {
                    jki.p pVar2 = (jki.p) dVar3.d.get();
                    PaymentOptionsVaultWithdrawalScreenContract$InputData paymentOptionsVaultWithdrawalScreenContract$InputData = dVar3.f241463a;
                    ppg.b bVarB2 = ((wpg.l) aVar12.f241455b).b();
                    vc.s.j(bVarB2);
                    return new u1k.j(pVar2, paymentOptionsVaultWithdrawalScreenContract$InputData, bVarB2, aVar12.d.a(), (w80.b) dVar3.f241465c.get());
                }
                if (i22 == 1) {
                    return new u1k.k(new u80.o(), (w80.b) dVar3.f241465c.get());
                }
                if (i22 != 2) {
                    throw new AssertionError(i22);
                }
                qd0.b languageProvider = aVar12.f241456c.n();
                vc.s.j(languageProvider);
                v1k.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
                return v80.b.b(languageProvider, false, false, 58);
            case 7:
                q7k.c cVar9 = (q7k.c) this.f239225c;
                l70.e eVar6 = cVar9.f;
                q7k.a aVar13 = (q7k.a) this.d;
                q7k.c cVar10 = aVar13.f242869b;
                int i32 = this.f239224b;
                if (i32 == 0) {
                    w7k.b extension4 = (w7k.b) aVar13.f242870c.get();
                    Intrinsics.checkNotNullParameter(extension4, "extension");
                    w7k.b bVar9 = extension4;
                    vc.s.k(bVar9);
                    return bVar9;
                }
                if (i32 == 1) {
                    k61.a aVarE = cVar9.f242872a.e();
                    vc.s.j(aVarE);
                    return new w7k.b(aVarE);
                }
                if (i32 != 2) {
                    throw new AssertionError(i32);
                }
                w7k.b bVar10 = (w7k.b) aVar13.f242870c.get();
                c70.a aVarZ = eVar6.z();
                vc.s.j(aVarZ);
                r70.c cVarA2 = eVar6.A();
                vc.s.j(cVarA2);
                pqi.a aVar14 = cVar9.f242874c;
                l7k.d dVar4 = new l7k.d(aVar14.e(), aVar14.g());
                t7k.a aVar15 = new t7k.a();
                djf.c cVar11 = cVar10.e;
                t7k.a aVar16 = new t7k.a();
                thf.m mVarG = cVar11.g();
                vc.s.j(mVarG);
                v7k.i iVar = new v7k.i(aVar15, new l7k.b(aVar16, mVarG));
                t7k.a transferLinkResourcesMapper = new t7k.a();
                Intrinsics.checkNotNullParameter(transferLinkResourcesMapper, "transferLinkResourcesMapper");
                v7k.f fVar2 = new v7k.f();
                u7k.q paymentLinkDetailsOwnerProvider = new u7k.q();
                Intrinsics.checkNotNullParameter(paymentLinkDetailsOwnerProvider, "paymentLinkDetailsOwnerProvider");
                v7k.e eVar7 = new v7k.e();
                v7k.g gVar7 = new v7k.g();
                thf.m mVarG2 = cVar11.g();
                vc.s.j(mVarG2);
                u7k.p pVar3 = new u7k.p(iVar, new usc.a(fVar2, new v7k.c(eVar7, gVar7, mVarG2, new t7k.a(), new v7k.a())));
                u7k.q paymentLinkDetailsOwnerProvider2 = new u7k.q();
                Intrinsics.checkNotNullParameter(paymentLinkDetailsOwnerProvider2, "paymentLinkDetailsOwnerProvider");
                u7k.l lVar = new u7k.l();
                vl3.n nVar2 = cVar10.f242875g;
                m41.c cVar12 = cVar10.f242872a;
                cl3.a aVarD = nVar2.d();
                vc.s.j(aVarD);
                ang.f fVarE = cVar10.f242876h.e();
                PaymentLinkDetailsContract$InputData paymentLinkDetailsContract$InputData = aVar13.f242868a;
                k61.a aVarE2 = cVar12.e();
                vc.s.j(aVarE2);
                com.revolut.retail.feature.payments.payment_links.impl.ui.details.a aVar17 = new com.revolut.retail.feature.payments.payment_links.impl.ui.details.a(paymentLinkDetailsContract$InputData, aVarE2);
                k61.a aVarE3 = cVar12.e();
                vc.s.j(aVarE3);
                u7k.k kVar = new u7k.k(aVarD, fVarE, aVar17, aVarE3);
                j7k.a mapper = new j7k.a();
                u7k.q paymentLinkDetailsOwnerProvider3 = new u7k.q();
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(paymentLinkDetailsOwnerProvider3, "paymentLinkDetailsOwnerProvider");
                return new com.revolut.retail.feature.payments.payment_links.impl.ui.details.b(bVar10, aVarZ, cVarA2, dVar4, pVar3, lVar, kVar, new u7k.j0());
            case 8:
                return a();
            case 9:
                q7k.j jVar = (q7k.j) this.f239225c;
                int i33 = this.f239224b;
                if (i33 != 0) {
                    if (i33 != 1) {
                        if (i33 == 2) {
                            return new e8k.b(((q7k.k) this.d).f242922a);
                        }
                        throw new AssertionError(i33);
                    }
                    pak.h priceQuoteTraceIdControllerExtensionFactory = jVar.f242909h.a();
                    f8k.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(priceQuoteTraceIdControllerExtensionFactory, "priceQuoteTraceIdControllerExtensionFactory");
                    return priceQuoteTraceIdControllerExtensionFactory.a("payments_links_price_quote");
                }
                wj0.a idempotencyKeyHolder = ((nj0.d) jVar.f242908g).i();
                vc.s.j(idempotencyKeyHolder);
                l80.e dateProvider = jVar.f242906b.h();
                vc.s.j(dateProvider);
                f8k.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
                Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
                return new m60.b(idempotencyKeyHolder, dateProvider, "payments_links_transfer");
            case 10:
                q7k.j jVar2 = (q7k.j) this.f239225c;
                q7k.l lVar2 = (q7k.l) this.d;
                int i43 = this.f239224b;
                switch (i43) {
                    case 0:
                        n60.b bVar11 = (n60.b) lVar2.f242927c.get();
                        o5k.i.n(bVar11);
                        return bVar11;
                    case 1:
                        return o5k.i.s((com.revolut.kompot.navigable.a) lVar2.f242926b.get());
                    case 2:
                        n60.a aVar18 = (n60.a) lVar2.e.get();
                        o5k.i.k(aVar18);
                        return aVar18;
                    case 3:
                        return o5k.i.p((com.revolut.kompot.navigable.a) lVar2.f242926b.get());
                    case 4:
                        ang.f fVarE2 = jVar2.d.e();
                        tqi.g gVarE = jVar2.e.e();
                        c70.a aVarZ2 = jVar2.f242906b.z();
                        vc.s.j(aVarZ2);
                        return new l8k.i(fVarE2, gVarE, aVarZ2, (f01.a) lVar2.f242928g.get(), (jki.p) lVar2.f242929h.get());
                    case 5:
                        BaseScreen screen = lVar2.f242925a;
                        m8k.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(screen, "screen");
                        return new f01.c(screen.m2());
                    case 6:
                        return new l8k.g();
                    default:
                        throw new AssertionError(i43);
                }
            case 11:
                return b();
            case 12:
                return c();
            case 13:
                return d();
            case 14:
                return e();
            case 15:
                return f();
            case 16:
                qc9.b bVar12 = (qc9.b) this.d;
                qc9.c cVar13 = (qc9.c) this.f239225c;
                he9.e eVar8 = cVar13.d;
                int i59 = this.f239224b;
                if (i59 != 0) {
                    if (i59 == 1) {
                        return new de9.y(new de9.z());
                    }
                    if (i59 == 2) {
                        return new he9.c(this, 4);
                    }
                    throw new AssertionError(i59);
                }
                PasscodeScreenContract$InputData passcodeScreenContract$InputData = bVar12.f244611a;
                oe9.a aVarB = eVar8.b();
                vc.s.j(aVarB);
                fe9.h hVar6 = new fe9.h(bVar12.f244613c.e.a());
                ie9.d dVarA = eVar8.a();
                vc.s.j(dVarA);
                wl0.c cVarA3 = cVar13.e.a();
                io.c cVarD = cVar13.i.d();
                vc.s.j(cVarD);
                qc9.l.Companion.getClass();
                return new de9.x(passcodeScreenContract$InputData, aVarB, hVar6, dVarA, cVarA3, cVarD, new qc9.j(), (jki.p) bVar12.e.get());
            case 17:
                return g();
            case 18:
                return h();
            case 19:
                return i();
            case 20:
                return j();
            case 21:
                return k();
            case 22:
                return l();
            case 23:
                return m();
            case 24:
                return n();
            case 25:
                return o();
            case 26:
                return p();
            case 27:
                return q();
            case 28:
                return r();
            default:
                qgk.i0 i0Var = (qgk.i0) this.f239225c;
                g3 g3Var = i0Var.u;
                qgk.l lVar3 = (qgk.l) this.d;
                agk.a aVar19 = lVar3.f246092a;
                int i66 = this.f239224b;
                switch (i66) {
                    case 0:
                        return agk.b.B(aVar19, (zfk.c) lVar3.f246096h.get(), (xfk.b) lVar3.e.get(), (bgk.a) lVar3.f.get(), (wfk.a) lVar3.f246095g.get(), (bgk.a) lVar3.i.get());
                    case 1:
                        mhk.a aVarC2 = g3Var.c();
                        vc.s.j(aVarC2);
                        return y3.C(aVar19, aVarC2, (xfk.b) lVar3.e.get(), (bgk.a) lVar3.f.get(), (wfk.a) lVar3.f246095g.get());
                    case 2:
                        fhk.a aVarB2 = g3Var.b();
                        vc.s.j(aVarB2);
                        return y3.b(aVar19, aVarB2);
                    case 3:
                        ohk.a aVarD2 = g3Var.d();
                        vc.s.j(aVarD2);
                        return y3.D(aVar19, aVarD2);
                    case 4:
                        dhk.a aVarA5 = g3Var.a();
                        vc.s.j(aVarA5);
                        return y3.z(aVar19, aVarA5);
                    case 5:
                        ohk.a aVarD3 = g3Var.d();
                        vc.s.j(aVarD3);
                        return agk.b.y(aVar19, aVarD3);
                    case 6:
                        zgk.d dVar5 = lVar3.f246093b;
                        ajk.f fVarH = i0Var.f246010b.h();
                        cha.b bVarC2 = i0Var.f246013h.c();
                        vc.s.j(bVarC2);
                        gte.a aVarB3 = i0Var.f246011c.b();
                        vc.s.j(aVarB3);
                        return new com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.invitation.e(dVar5, fVarH, bVarC2, aVarB3, new zgk.a(), (zfk.c) lVar3.f246096h.get(), (bgk.a) lVar3.i.get());
                    default:
                        throw new AssertionError(i66);
                }
        }
    }
}
