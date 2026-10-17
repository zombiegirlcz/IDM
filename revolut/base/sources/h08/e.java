package h08;

import aa0.y;
import ad0.p;
import ad0.t;
import ad0.w;
import an.q;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleRegistry;
import androidx.view.ComponentActivity;
import androidx.view.result.ActivityResultRegistry;
import com.google.common.collect.ImmutableSet;
import com.revolut.chat.ChatApi$Toggles;
import com.revolut.chat.ui.agentinfo.AgentInfoContract$InputData;
import com.revolut.chat.ui.chatlist.ChatListContract$InputData;
import com.revolut.chat.ui.flow.ChatFlowContract$InputData;
import com.revolut.chat_core.R$id;
import com.revolut.core.backend_flow.ui.BackendFlowContract$Configuration;
import com.revolut.feature.apm.qvik.impl.data.QvikPayService;
import com.revolut.feature.apm.qvik.impl.ui.pay.QvikPayFlowContract$InputData;
import com.revolut.feature.apm.swish.impl.ui.confirmation.SwishConfirmationScreenContract$InputData;
import com.revolut.feature.apm.swish.impl.ui.home.area.SwishHomeAreaScreenContract$InputData;
import com.revolut.feature.apm.swish.impl.ui.home.transaction_limit.SwishTransactionLimitScreenContract$InputData;
import com.revolut.feature.junior.card_request.impl.ui.screen.request_review.CardRequestReviewScreenContract$InputData;
import com.revolut.feature.trusted_merchants.impl.ui.merchant_details.TrustedMerchantDetailsContract$Configuration;
import com.revolut.feature.wealth.impl.ui.screens.instruments_collection.InstrumentsCollectionControllerContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import f60.u;
import f60.x;
import f60.z;
import h30.e0;
import ip0.pr;
import java.util.Collection;
import java.util.Optional;
import k50.a0;
import k50.i0;
import k50.n0;
import k50.x4;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import qc0.i1;
import r40.c1;
import rp0.g1;
import rp0.k1;
import rp0.l0;
import rp0.x0;
import t80.v;
import vc.s;
import vtc.p0;
import y20.g0;
import yc0.c0;
import yc0.f0;
import yc0.o;
import yc0.r;
import z0h.q1;
import zc0.y2;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f148250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f148251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f148252c;
    public final Object d;

    public /* synthetic */ e(Object obj2, Object obj3, int i, int i2) {
        this.f148250a = i2;
        this.f148251b = obj2;
        this.d = obj3;
        this.f148252c = i;
    }

    private final Object a() {
        h1e.c cVar = (h1e.c) this.f148251b;
        h1e.b bVar = (h1e.b) this.d;
        int i = this.f148252c;
        switch (i) {
            case 0:
                bVar.getClass();
                return new cn.d(ImmutableSet.copyOf((Collection) dn.b.a()), (cn.e) cVar.f148535n.get(), cVar.h());
            case 1:
                um.c cVar2 = (um.c) cVar.o.get();
                bVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(6);
                h1e.c cVar3 = bVar.f;
                hn.h hVar = (hn.h) cVar3.f148538p.get();
                t70.g gVarO = cVar3.f148523b.o();
                s.j(gVarO);
                builderBuilderWithExpectedSize.add(new jn.a(hVar, gVarO));
                builderBuilderWithExpectedSize.add(new vm.b(com.google.android.gms.internal.mlkit_vision_face.a.f()));
                builderBuilderWithExpectedSize.add(cVar3.k());
                builderBuilderWithExpectedSize.add(new xc0.a((qc0.j) cVar3.Z.get(), (qc0.h) cVar3.W.get()));
                builderBuilderWithExpectedSize.addAll((Iterable) in.g.a());
                builderBuilderWithExpectedSize.add(new jn.d(e4m.b.a(bVar.f148508h)));
                return new in.e(cVar2, builderBuilderWithExpectedSize.build(), cVar.h());
            case 2:
                return bq.i.t(bVar.f148504a);
            case 3:
                bVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize2 = ImmutableSet.builderWithExpectedSize(3);
                builderBuilderWithExpectedSize2.addAll((Iterable) kn.g.a());
                builderBuilderWithExpectedSize2.add(bVar.f148509j.get());
                builderBuilderWithExpectedSize2.add(new kn.h(e4m.b.a(bVar.f148510l)));
                return new kn.e(builderBuilderWithExpectedSize2.build(), (ym.d) cVar.P.get(), cVar.h());
            case 4:
                return new zm.a();
            case 5:
                return new tpi.i((rpi.c) bVar.k.get(), gsi.c.a(bVar.f148504a));
            case 6:
                return new rpi.b(bq.i.b(bVar.f148504a));
            case 7:
                bVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize3 = ImmutableSet.builderWithExpectedSize(2);
                builderBuilderWithExpectedSize3.addAll((Iterable) hn.g.a());
                builderBuilderWithExpectedSize3.add(bVar.f.k());
                return new hn.d(builderBuilderWithExpectedSize3.build(), (hn.h) cVar.f148538p.get(), (npi.f) bVar.f148512n.get());
            case 8:
                Context contextI = bq.i.i(bVar.f148504a);
                BaseDelegatesActivity baseDelegatesActivityF = bq.i.f(bVar.f148504a);
                t70.g gVarO2 = cVar.f148523b.o();
                s.j(gVarO2);
                return new npi.c(contextI, baseDelegatesActivityF, gVarO2);
            case 9:
                h1e.c cVar4 = bVar.f;
                return new en.c(ImmutableSet.of((ln.d) cVar4.f148526d0.get(), (ln.d) cVar4.f148539q.get()), bq.i.l(bVar.f148504a));
            case 10:
                return new gn.c((lpi.e) bVar.f148514q.get(), (sm.e) cVar.f148527e0.get(), ImmutableSet.copyOf((Collection) gn.e.a()), cVar.h());
            case 11:
                return new lpi.b(bq.i.i(bVar.f148504a), bq.i.j(bVar.f148504a));
            case 12:
                bVar.getClass();
                return new in.e(ImmutableSet.copyOf((Collection) pm.b.a()), (om.c) cVar.f0.get(), cVar.h());
            case 13:
                bVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize4 = ImmutableSet.builderWithExpectedSize(2);
                builderBuilderWithExpectedSize4.addAll((Iterable) g3l.f.a());
                h1e.c cVar5 = bVar.f;
                builderBuilderWithExpectedSize4.add(new wc0.a((qc0.k) cVar5.f148540r.get(), ((s41.a) cVar5.f148528g).d(), (ln.a) cVar5.f148539q.get(), (qc0.j) cVar5.Z.get(), new xl2.f(true, 14), cVar5.d()));
                return new g3l.c(builderBuilderWithExpectedSize4.build(), (g3l.g) cVar.g0.get(), (k3l.b) bVar.f148517t.get(), cVar.h());
            case 14:
                return new k3l.d(bq.i.b(bVar.f148504a));
            case 15:
                ypi.h hVar2 = bVar.f148505b;
                fsi.g gVar = bVar.f148504a;
                return new ypi.e(hVar2, bq.i.b(gVar), bq.i.o(gVar), bq.i.g(gVar));
            case 16:
                return new hqi.f(bVar.f148506c, bq.i.b(bVar.f148504a));
            case 17:
                return new rpi.h(bq.i.b(bVar.f148504a));
            case 18:
                return new iri.g((iri.j) cVar.f148534m.get(), (iri.m) cVar.f148540r.get(), bq.i.f(bVar.f148504a), bq.i.l(bVar.f148504a));
            case 19:
                return new iri.l((iri.m) cVar.f148540r.get(), bq.i.f(bVar.f148504a), (iri.d) bVar.z.get());
            case 20:
                return new iri.d(bq.i.f(bVar.f148504a));
            case 21:
                return new q((cqi.h) bVar.B.get(), (an.a) cVar.f148530h0.get(), ImmutableSet.copyOf((Collection) bn.b.a()), cVar.h());
            case 22:
                return new cqi.j(bq.i.f(bVar.f148504a));
            case 23:
                return new xpi.c(bVar.d, bq.i.b(bVar.f148504a));
            case 24:
                return new com.revolut.retail.toast.mediator.a((d4l.a) cVar.i0.get(), (c4l.b) bVar.E.get());
            case 25:
                return new c4l.e(bq.i.i(bVar.f148504a), bq.i.g(bVar.f148504a));
            case 26:
                return new f5l.c((f5l.a) cVar.j0.get(), bq.i.b(bVar.f148504a));
            case 27:
                Activity activityB = bq.i.b(bVar.f148504a);
                y80.b bVar2 = new y80.b();
                g60.a aVar = (g60.a) bVar.H.get();
                fsi.g gVar2 = bVar.f148504a;
                Activity activityB2 = bq.i.b(gVar2);
                t80.g gVar3 = (t80.g) bVar.I.get();
                BaseDelegatesActivity baseDelegatesActivityF2 = bq.i.f(gVar2);
                d4m.a aVarA = e4m.b.a(bVar.J);
                nli.a aVarG = bVar.g();
                t80.g gVar4 = (t80.g) bVar.I.get();
                l70.e eVar = bVar.f.f148523b;
                zk0.b bVarL = eVar.l();
                s.j(bVarL);
                oli.c cVar6 = new oli.c(gVar4, bVarL, bVar.g(), (g60.a) bVar.H.get(), bVar.h());
                ComponentActivity componentActivityA = gmf.b.a(gVar2);
                ActivityResultRegistry activityResultRegistryA = pli.b.a(gmf.b.a(gVar2));
                ami.n nVar = new ami.n(e4m.b.a(bVar.K), 1);
                d4m.a aVarA2 = e4m.b.a(bVar.J);
                t80.g gVar5 = (t80.g) bVar.I.get();
                nli.a aVarG2 = bVar.g();
                i90.b bVar3 = new i90.b();
                z70.a aVarF = eVar.f();
                s.j(aVarF);
                c70.b bVar4 = new c70.b(aVarF, 2);
                z70.a aVarF2 = eVar.f();
                s.j(aVarF2);
                return new upi.b(activityB, bVar2, new v(aVar, activityB2, gVar3, baseDelegatesActivityF2, aVarA, aVarG, cVar6, new oli.g(componentActivityA, activityResultRegistryA, nVar, aVarA2, gVar5, aVarG2, bVar3, new u96.b(bVar4, new smd.s(aVarF2)), bVar.h()), bVar.h()));
            case 28:
                return new g60.a(bq.i.b(bVar.f148504a));
            case 29:
                l70.e eVar2 = cVar.f148523b;
                l70.e eVar3 = cVar.f148523b;
                f80.a aVarX = eVar2.x();
                s.j(aVarX);
                l80.e eVarH = eVar3.h();
                s.j(eVarH);
                zk0.b bVarL2 = eVar3.l();
                s.j(bVarL2);
                return new t80.b(aVarX, eVarH, bVarL2);
            case 30:
                return pli.c.a(new ks0.n(bq.i.f(bVar.f148504a)));
            case 31:
                return t96.a.a();
            case 32:
                return new aqi.d(bq.i.b(bVar.f148504a), new y80.b());
            case 33:
                return new iqi.b(bVar.e, bq.i.b(bVar.f148504a));
            case 34:
                return new opi.b(bq.i.f(bVar.f148504a));
            case 35:
                qc0.j router = (qc0.j) cVar.Z.get();
                qc0.h presentationModel = (qc0.h) cVar.W.get();
                qc0.k state = (qc0.k) cVar.f148540r.get();
                ypi.i nextButtonView = (ypi.i) bVar.v.get();
                f9b.f errorView = (f9b.f) bVar.f148508h.get();
                tpi.j progressView = (tpi.j) bVar.f148510l.get();
                hqi.l toolbarView = (hqi.l) bVar.f148518w.get();
                npi.a dialogView = (npi.a) bVar.f148512n.get();
                BackendFlowContract$Configuration configuration = (BackendFlowContract$Configuration) bVar.P.get();
                pri.f authorizedPresenterDelegate = bq.i.d(bVar.f148504a);
                k3l.b statusViewModel = (k3l.b) bVar.f148517t.get();
                xpi.g navBarWithToolbarView = (xpi.g) bVar.D.get();
                rpi.c keyboardView = (rpi.c) bVar.k.get();
                qc0.h hVar3 = (qc0.h) bVar.f.W.get();
                wpg.v.b(hVar3);
                ImmutableSet initSet = ImmutableSet.of(hVar3);
                mm.d actionsDispatcher = (mm.d) cVar.X.get();
                opi.d expandableDialogView = (opi.d) bVar.O.get();
                qd0.b languageProvider = cVar.f148523b.n();
                s.j(languageProvider);
                Intrinsics.checkNotNullParameter(router, "router");
                Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(nextButtonView, "nextButtonView");
                Intrinsics.checkNotNullParameter(errorView, "errorView");
                Intrinsics.checkNotNullParameter(progressView, "progressView");
                Intrinsics.checkNotNullParameter(toolbarView, "toolbarView");
                Intrinsics.checkNotNullParameter(dialogView, "dialogView");
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                Intrinsics.checkNotNullParameter(authorizedPresenterDelegate, "authorizedPresenterDelegate");
                Intrinsics.checkNotNullParameter(statusViewModel, "statusViewModel");
                Intrinsics.checkNotNullParameter(navBarWithToolbarView, "navBarWithToolbarView");
                Intrinsics.checkNotNullParameter(keyboardView, "keyboardView");
                Intrinsics.checkNotNullParameter(initSet, "initSet");
                Intrinsics.checkNotNullParameter(actionsDispatcher, "actionsDispatcher");
                Intrinsics.checkNotNullParameter(expandableDialogView, "expandableDialogView");
                Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
                return new g1e.f(router, state, presentationModel, nextButtonView, errorView, progressView, toolbarView, configuration, keyboardView, dialogView, authorizedPresenterDelegate, statusViewModel, navBarWithToolbarView, initSet, actionsDispatcher, expandableDialogView, languageProvider);
            case 36:
                h1e.e.Companion.getClass();
                return new BackendFlowContract$Configuration(26, null, "STOCK_LENDING_ONBOARDING");
            case 37:
                e4m.e eVar4 = cVar.m0;
                y90.e eVar5 = cVar.f148531j;
                zc0.g gVar6 = (zc0.g) eVar4.get();
                qc0.j jVar = (qc0.j) cVar.Z.get();
                ypi.i iVar = (ypi.i) bVar.v.get();
                h1e.c cVar7 = bVar.f;
                l70.e eVar6 = cVar7.f148523b;
                w80.b bVarJ = eVar6.j();
                s.j(bVarJ);
                t70.g gVarO3 = eVar6.o();
                s.j(gVarO3);
                zc0.c cVar8 = new zc0.c(bVarJ, gVarO3, (p80.a) cVar7.f148536n0.get(), (y) cVar7.B.get(), bVar.f(), new yc0.j(new yc0.q(bVar.e()), bVar.e(), (yc0.g) cVar7.l0.get(), (ad0.a) cVar7.O.get(), (p) bVar.V.get(), new yc0.p()), new o((yc0.g) cVar7.l0.get()), (p) bVar.V.get(), (ad0.c) bVar.S.get(), new t(bVar.e(), new yc0.p()), new ad0.s(bVar.e(), new yc0.p()), new ad0.g(bVar.e()), new ad0.v(new yc0.q(bVar.e())), new ad0.o(), new yc0.q(bVar.e()), new yc0.p(), (yc0.y) cVar7.f148537o0.get(), (bd0.a) cVar7.p0.get(), (yc0.v) cVar7.q0.get(), (c0) bVar.W.get());
                npi.a aVar2 = (npi.a) bVar.f148512n.get();
                xpi.g gVar7 = (xpi.g) bVar.D.get();
                k3l.b bVar5 = (k3l.b) bVar.f148517t.get();
                rpi.c cVar9 = (rpi.c) bVar.k.get();
                zd7.b bVar6 = (zd7.b) bVar.Y.get();
                tpi.j jVar2 = (tpi.j) bVar.f148510l.get();
                opi.d dVar = (opi.d) bVar.O.get();
                cqi.h hVar4 = (cqi.h) bVar.B.get();
                i1 i1VarB = eVar5.b();
                s.j(i1VarB);
                oc0.f fVarC = eVar5.c();
                s.j(fVarC);
                fc0.f fVarD = eVar5.d();
                s.j(fVarD);
                oc0.m mVarE = eVar5.e();
                s.j(mVarE);
                t9l.g gVarA = cVar.i.a();
                s.j(gVarA);
                oc0.k kVarA = eVar5.a();
                s.j(kVarA);
                return new y2(hVar4, eVar5.f(), fVarD, bVar5, aVar2, fVarC, kVarA, mVarE, dVar, jVar, i1VarB, cVar9, gVarA, jVar2, gVar7, iVar, cVar8, gVar6, bVar6);
            case 38:
                x90.c cVar10 = cVar.d;
                yc0.q qVar = new yc0.q(bVar.e());
                r rVar = (r) bVar.R.get();
                ad0.c cVar11 = (ad0.c) bVar.S.get();
                w wVarG = cVar.f148531j.g();
                s.j(wVarG);
                f0 f0Var = (f0) bVar.T.get();
                ad0.h hVar5 = (ad0.h) bVar.U.get();
                ad0.n nVarF = bVar.f();
                u9l.a aVarB = cVar.i.b();
                s.j(aVarB);
                return wpg.v.o(cVar10, qVar, rVar, cVar11, wVarG, f0Var, hVar5, nVarF, aVarB);
            case 39:
                return wpg.v.n(cVar.d, bVar.e(), new yc0.p());
            case 40:
                x90.c cVar12 = cVar.d;
                return new ad0.d();
            case 41:
                x90.c cVar13 = cVar.d;
                hbl.d dVarC = cVar.i.c();
                s.j(dVarC);
                return wpg.v.y(cVar13, dVarC);
            case 42:
                return wpg.v.a(cVar.d, bVar.f());
            case 43:
                return wpg.v.w(cVar.d, (r) bVar.R.get(), new yc0.p());
            case 44:
                return new ae7.i((upi.f) bVar.L.get(), (t80.c) cVar.f148532k0.get(), (d4l.a) cVar.i0.get(), (aqi.a) bVar.X.get(), new ae7.j(), bq.i.l(bVar.f148504a));
            case 45:
                return aqi.f.a(bVar.f148504a, (aqi.d) bVar.M.get());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object b() {
        h30.n nVar = (h30.n) this.f148251b;
        h30.r rVar = (h30.r) this.d;
        int i = this.f148252c;
        switch (i) {
            case 0:
                return kxa.j.l((j60.a) rVar.d.get());
            case 1:
                return h30.l.p((com.revolut.kompot.navigable.a) rVar.f148944b.get(), (rp0.m) rVar.f148945c.get());
            case 2:
                return new rp0.m();
            case 3:
                y40.b extension = (y40.b) rVar.f.get();
                s40.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                s.k(extension);
                return extension;
            case 4:
                rf3.b factory = (rf3.b) nVar.f148906b.C.get();
                s.j(factory);
                s40.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory, "factory");
                return new rf3.a();
            case 5:
                y9l.a extension2 = (y9l.a) rVar.f148947h.get();
                Intrinsics.checkNotNullParameter(extension2, "extension");
                s.k(extension2);
                return extension2;
            case 6:
                byc.k factory2 = ((vxc.b) nVar.f148923r).a();
                s.j(factory2);
                Intrinsics.checkNotNullParameter(factory2, "factory");
                return factory2.a();
            case 7:
                Object extension3 = (ep6.n) rVar.k.get();
                Intrinsics.checkNotNullParameter(extension3, "extension");
                yji.n nVar2 = (yji.n) extension3;
                s.k(nVar2);
                return nVar2;
            case 8:
                zo6.a factory3 = nVar.f148925s.a();
                s.j(factory3);
                j60.a bottomExpandableDialogControllerExtension = (j60.a) rVar.d.get();
                g1 shotDialogDisplayer = (g1) rVar.f148948j.get();
                Intrinsics.checkNotNullParameter(factory3, "factory");
                Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
                Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
                ep6.n nVarA = factory3.a(bottomExpandableDialogControllerExtension, shotDialogDisplayer, pr.f165860a);
                s.k(nVarA);
                return nVarA;
            case 9:
                com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) rVar.f148944b.get();
                s40.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller, "controller");
                return x0.a(g1.Companion, controller.D2());
            case 10:
                w50.l factory4 = (w50.l) nVar.f148928t0.get();
                y40.b pdfViewExtension = (y40.b) rVar.f.get();
                com.revolut.kompot.navigable.a controller2 = (com.revolut.kompot.navigable.a) rVar.f148944b.get();
                s40.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory4, "factory");
                Intrinsics.checkNotNullParameter(pdfViewExtension, "pdfViewExtension");
                Intrinsics.checkNotNullParameter(controller2, "controller");
                return factory4.a(controller2, pdfViewExtension);
            case 11:
                ChatListContract$InputData chatListContract$InputData = rVar.f148943a;
                n30.n nVarK = nVar.k();
                t40.a aVar = new t40.a();
                use.d dVarB = nVar.f148927t.b();
                s.j(dVarB);
                w50.k kVar = (w50.k) rVar.f148950m.get();
                ep6.n nVar3 = (ep6.n) rVar.k.get();
                m30.g gVarA = nVar.a();
                y9l.a aVar2 = (y9l.a) rVar.f148947h.get();
                tf3.b bVarD = nVar.f148906b.d();
                s.j(bVarD);
                return new r40.x0(chatListContract$InputData, nVarK, aVar, dVarB, kVar, nVar3, gVarA, aVar2, bVarD, (jki.p) rVar.f148951n.get());
            case 12:
                of3.f fVar = nVar.f148906b;
                sse.b bVar = nVar.f148927t;
                j30.c cVarF = fVar.f();
                s.j(cVarF);
                return new c1(cVarF, new r40.p(nVar.l(), new z50.g()), rVar.f148943a, nVar.A(), bVar.c(), bVar.f265380a.a());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object c() {
        h30.t tVar = (h30.t) this.d;
        h30.n nVar = (h30.n) this.f148251b;
        int i = this.f148252c;
        switch (i) {
            case 0:
                return f0k.d.p((e60.a) tVar.f148960l.get());
            case 1:
                com.revolut.kompot.navigable.a aVar = (com.revolut.kompot.navigable.a) tVar.e.get();
                g60.a aVarA = f60.v.a((com.revolut.kompot.navigable.a) tVar.e.get());
                Activity activityA = f60.t.a((com.revolut.kompot.navigable.a) tVar.e.get());
                t80.b bVarB = tVar.b();
                com.revolut.kompot.navigable.a aVar2 = (com.revolut.kompot.navigable.a) tVar.e.get();
                f60.y.a(aVar2);
                d4m.a aVarA2 = e4m.b.a(tVar.f);
                nli.a aVar3 = new nli.a((t80.c) tVar.f148957g.get(), f60.t.a((com.revolut.kompot.navigable.a) tVar.e.get()));
                t80.b bVarB2 = tVar.b();
                zk0.b bVarL = tVar.f148955b.d.l();
                s.j(bVarL);
                return v1.c.q(aVar, new v(aVarA, activityA, bVarB, aVar2, aVarA2, aVar3, new oli.c(bVarB2, bVarL, new nli.a((t80.c) tVar.f148957g.get(), f60.t.a((com.revolut.kompot.navigable.a) tVar.e.get())), f60.v.a((com.revolut.kompot.navigable.a) tVar.e.get()), tVar.j()), new oli.g(u.a(f60.t.a((com.revolut.kompot.navigable.a) tVar.e.get())), v1.c.e((com.revolut.kompot.navigable.a) tVar.e.get()), new ami.n(e4m.b.a(tVar.f148958h), 1), e4m.b.a(tVar.f), tVar.b(), new nli.a((t80.c) tVar.f148957g.get(), f60.t.a((com.revolut.kompot.navigable.a) tVar.e.get())), new i90.b(), tVar.c(), tVar.j()), tVar.j()), x.a(), (rp0.m) tVar.i.get(), (e60.t) tVar.k.get());
            case 2:
                com.revolut.kompot.navigable.a aVar4 = (com.revolut.kompot.navigable.a) tVar.e.get();
                f60.y.a(aVar4);
                return pli.c.a(new ks0.n(aVar4));
            case 3:
                return l50.b.a();
            case 4:
                return t96.a.a();
            case 5:
                return z.a();
            case 6:
                aii.o oVar = (aii.o) tVar.f148959j.get();
                y80.a aVarR = nVar.d.r();
                s.j(aVarR);
                return new e60.y(oVar, aVarR, tVar.c(), Optional.empty());
            case 7:
                k50.f0 extension = (k50.f0) tVar.o.get();
                l50.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                s.k(extension);
                return extension;
            case 8:
                k50.m impl = (k50.m) tVar.f148962n.get();
                l50.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(impl, "impl");
                s.k(impl);
                return impl;
            case 9:
                of3.f fVar = nVar.f148906b;
                of3.f fVar2 = nVar.f148906b;
                j30.c cVarF = fVar.f();
                s.j(cVarF);
                md0.b bVarA = nVar.u.a();
                s.j(bVarA);
                lg0.c cVar = (lg0.c) fVar2.k.f276067j.get();
                s.j(cVar);
                wli.x xVarD = ((s41.a) fVar2.i).d();
                z50.l lVar = new z50.l();
                z70.a contextProvider = tVar.f148955b.d.f();
                s.j(contextProvider);
                l50.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
                return new k50.m(cVarF, bVarA, cVar, xVarD, lVar, new iki.c(contextProvider.getContext()));
            case 10:
                i0 extension2 = (i0) tVar.f148966s.get();
                l50.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension2, "extension");
                s.k(extension2);
                return extension2;
            case 11:
                j30.c chatFeatureToggles = nVar.f148906b.f();
                s.j(chatFeatureToggles);
                e impl2 = tVar.f148964q;
                e noOp = tVar.f148965r;
                l50.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(chatFeatureToggles, "chatFeatureToggles");
                Intrinsics.checkNotNullParameter(impl2, "impl");
                Intrinsics.checkNotNullParameter(noOp, "noOp");
                if (((jte.d) ((rf3.d) chatFeatureToggles).f253679a).c(ChatApi$Toggles.ChatPersistentComposerDraft.f50977c)) {
                    Object obj2 = impl2.get();
                    Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                    return (i0) obj2;
                }
                Object obj3 = noOp.get();
                Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
                return (i0) obj3;
            case 12:
                o30.a aVar5 = (o30.a) nVar.f148929v0.get();
                CoroutineScope coroutineScopeA = nVar.f148914j.a();
                s.j(coroutineScopeA);
                return new m50.d(aVar5, coroutineScopeA);
            case 13:
                return new m50.m();
            case 14:
                l70.e eVar = nVar.v.f299577a;
                y80.a permissionProvider = eVar.r();
                s.j(permissionProvider);
                zk0.b fileSystemRepository = eVar.l();
                s.j(fileSystemRepository);
                a61.a audioRecorder = new a61.a(eVar.f192431a, (l80.h) eVar.f192444p.get());
                l80.h systemTimeProvider = eVar.v();
                s.j(systemTimeProvider);
                Intrinsics.checkNotNullParameter(permissionProvider, "permissionProvider");
                Intrinsics.checkNotNullParameter(fileSystemRepository, "fileSystemRepository");
                Intrinsics.checkNotNullParameter(audioRecorder, "audioRecorder");
                Intrinsics.checkNotNullParameter(systemTimeProvider, "systemTimeProvider");
                Intrinsics.checkNotNullParameter(new nd.l(), "factory");
                return new xrg.d(permissionProvider, fileSystemRepository, audioRecorder, systemTimeProvider);
            case 15:
                y40.b extension3 = (y40.b) tVar.v.get();
                l50.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension3, "extension");
                s.k(extension3);
                return extension3;
            case 16:
                rf3.b bVar = (rf3.b) nVar.f148906b.C.get();
                s.j(bVar);
                return l50.c.a(bVar);
            case 17:
                n0 extension4 = (n0) tVar.f148970y.get();
                l50.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension4, "extension");
                s.k(extension4);
                return extension4;
            case 18:
                m50.k impl3 = (m50.k) tVar.f148969x.get();
                l50.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(impl3, "impl");
                s.k(impl3);
                return impl3;
            case 19:
                e60.a aVar6 = (e60.a) tVar.f148960l.get();
                g0 g0Var = (g0) nVar.j0.get();
                j30.c cVarF2 = nVar.f148906b.f();
                s.j(cVarF2);
                return new m50.k(aVar6, g0Var, cVarF2, nVar.k(), (y40.b) tVar.v.get(), nVar.i());
            case 20:
                e60.t tVar2 = (e60.t) tVar.k.get();
                f60.w.a(tVar2);
                return tVar2;
            case 21:
                df0.b bVarA2 = nVar.f148921p.a();
                s.j(bVarA2);
                return new x4(bVarA2);
            case 22:
                g0 g0Var2 = (g0) nVar.j0.get();
                j30.c cVarF3 = nVar.f148906b.f();
                s.j(cVarF3);
                return new a0(g0Var2, cVarF3);
            case 23:
                return new m50.l((f30.h) nVar.y0.get());
            case 24:
                return new q50.s(nVar.p());
            case 25:
                w50.l factory = (w50.l) nVar.f148928t0.get();
                y40.b pdfViewExtension = (y40.b) tVar.v.get();
                com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) tVar.e.get();
                l50.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory, "factory");
                Intrinsics.checkNotNullParameter(pdfViewExtension, "pdfViewExtension");
                Intrinsics.checkNotNullParameter(controller, "controller");
                return factory.a(controller, pdfViewExtension);
            case 26:
                ee7.a aVar7 = nVar.o;
                of3.f fVar3 = nVar.f148906b;
                be7.k kVarC = aVar7.c();
                s.j(kVarC);
                be7.h hVarB = nVar.o.b();
                s.j(hVarB);
                n30.n nVarK = nVar.k();
                m30.j jVar = (m30.j) nVar.Z.get();
                u20.f fVarF = nVar.f();
                y80.a aVarR2 = nVar.d.r();
                s.j(aVarR2);
                j30.c cVarF4 = fVar3.f();
                s.j(cVarF4);
                rf3.j jVarA = fVar3.a();
                s.j(jVarA);
                return new l40.q(kVarC, hVarB, nVarK, jVar, fVarF, aVarR2, cVarF4, jVarA, (p10.h) nVar.f148924r0.get(), nVar.Y);
            case 27:
                dp6.a aVarB = nVar.f148925s.b();
                s.j(aVarB);
                return new j50.o(aVarB, (j50.p) nVar.z0.get());
            case 28:
                com.revolut.kompot.navigable.a controller2 = (com.revolut.kompot.navigable.a) tVar.e.get();
                l50.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller2, "controller");
                x0 x0Var = g1.Companion;
                View view = controller2.D2();
                View viewFindViewById = controller2.D2().findViewById(R$id.bottomContainer);
                x0Var.getClass();
                Intrinsics.checkNotNullParameter(view, "view");
                return new k1(view, viewFindViewById);
            case 29:
                return new p50.g(nVar.x());
            case 30:
                z70.a contextProvider2 = nVar.d.f();
                s.j(contextProvider2);
                l50.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(contextProvider2, "contextProvider");
                return new p80.a(contextProvider2.getContext());
            case 31:
                return new o50.b(nVar.k());
            case 32:
                com.revolut.kompot.navigable.a controller3 = (com.revolut.kompot.navigable.a) tVar.e.get();
                l50.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller3, "controller");
                return new l0(controller3.m2());
            case 33:
                z70.a contextProvider3 = nVar.d.f();
                s.j(contextProvider3);
                com.revolut.kompot.navigable.a controller4 = (com.revolut.kompot.navigable.a) tVar.e.get();
                l50.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(contextProvider3, "contextProvider");
                Intrinsics.checkNotNullParameter(controller4, "controller");
                LifecycleRegistry lifecycle = controller4.F;
                Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
                Intrinsics.checkNotNullParameter(contextProvider3, "contextProvider");
                return new oo0.k(lifecycle, contextProvider3, -1);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object d() {
        h30.n nVar = (h30.n) this.f148251b;
        h30.x xVar = (h30.x) this.d;
        int i = this.f148252c;
        switch (i) {
            case 0:
                return p0.f((j60.a) xVar.f148980c.get());
            case 1:
                return w40.c.g((com.revolut.kompot.navigable.a) xVar.f148979b.get(), kxa.j.o(new nji.b()));
            case 2:
                mse.a extension = (mse.a) xVar.i.get();
                w40.e.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                s.k(extension);
                return extension;
            case 3:
                return w40.c.x((y9l.a) xVar.e.get(), (ep6.n) xVar.f148982h.get(), nVar.f148927t.a());
            case 4:
                byc.k factory = ((vxc.b) nVar.f148923r).a();
                s.j(factory);
                Intrinsics.checkNotNullParameter(factory, "factory");
                return factory.a();
            case 5:
                return w40.c.m((i8d.f) xVar.f148981g.get(), (j60.a) xVar.f148980c.get(), (g1) xVar.f.get());
            case 6:
                zo6.a aVarA = nVar.f148925s.a();
                s.j(aVarA);
                return w40.c.n(aVarA, (j60.a) xVar.f148980c.get(), (g1) xVar.f.get());
            case 7:
                com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) xVar.f148979b.get();
                i40.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller, "controller");
                return x0.a(g1.Companion, controller.D2());
            case 8:
                return w40.c.l((ep6.n) xVar.f148982h.get());
            case 9:
                n30.n nVarK = nVar.k();
                n30.x xVarB = nVar.f148906b.b();
                s.j(xVarB);
                use.d dVarB = nVar.f148927t.b();
                s.j(dVarB);
                return new h40.n(nVarK, xVarB, dVarB, (mse.a) xVar.i.get(), (cli.n) xVar.f148984l.get());
            case 10:
                j30.c cVarF = nVar.f148906b.f();
                s.j(cVarF);
                return new h40.s(cVarF, nVar.A(), nVar.f148927t.c());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object e() {
        h30.z zVar = (h30.z) this.d;
        h30.n nVar = (h30.n) this.f148251b;
        int i = this.f148252c;
        switch (i) {
            case 0:
                return f0k.d.p((e60.a) zVar.f148994j.get());
            case 1:
                com.revolut.kompot.navigable.a aVar = (com.revolut.kompot.navigable.a) zVar.e.get();
                g60.a aVarA = f60.v.a((com.revolut.kompot.navigable.a) zVar.e.get());
                Activity activityA = f60.t.a((com.revolut.kompot.navigable.a) zVar.e.get());
                t80.b bVarB = zVar.b();
                com.revolut.kompot.navigable.a aVar2 = (com.revolut.kompot.navigable.a) zVar.e.get();
                f60.y.a(aVar2);
                d4m.a aVarA2 = e4m.b.a((e) zVar.f149001s);
                nli.a aVar3 = new nli.a((t80.c) zVar.f.get(), f60.t.a((com.revolut.kompot.navigable.a) zVar.e.get()));
                t80.b bVarB2 = zVar.b();
                zk0.b bVarL = zVar.f148991c.d.l();
                s.j(bVarL);
                return v1.c.q(aVar, new v(aVarA, activityA, bVarB, aVar2, aVarA2, aVar3, new oli.c(bVarB2, bVarL, new nli.a((t80.c) zVar.f.get(), f60.t.a((com.revolut.kompot.navigable.a) zVar.e.get())), f60.v.a((com.revolut.kompot.navigable.a) zVar.e.get()), zVar.j()), new oli.g(u.a(f60.t.a((com.revolut.kompot.navigable.a) zVar.e.get())), v1.c.e((com.revolut.kompot.navigable.a) zVar.e.get()), new ami.n(e4m.b.a((e) zVar.f149002t), 1), e4m.b.a((e) zVar.f149001s), zVar.b(), new nli.a((t80.c) zVar.f.get(), f60.t.a((com.revolut.kompot.navigable.a) zVar.e.get())), new i90.b(), zVar.c(), zVar.j()), zVar.j()), x.a(), (rp0.m) zVar.f148992g.get(), (e60.t) zVar.i.get());
            case 2:
                com.revolut.kompot.navigable.a aVar4 = (com.revolut.kompot.navigable.a) zVar.e.get();
                f60.y.a(aVar4);
                return pli.c.a(new ks0.n(aVar4));
            case 3:
                return l50.b.a();
            case 4:
                return t96.a.a();
            case 5:
                return z.a();
            case 6:
                aii.o oVar = (aii.o) zVar.f148993h.get();
                y80.a aVarR = nVar.d.r();
                s.j(aVarR);
                return new e60.y(oVar, aVarR, zVar.c(), Optional.empty());
            case 7:
                y40.b extension = (y40.b) zVar.f148995l.get();
                l50.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                s.k(extension);
                return extension;
            case 8:
                rf3.b bVar = (rf3.b) nVar.f148906b.C.get();
                s.j(bVar);
                return l50.c.a(bVar);
            case 9:
                n0 extension2 = (n0) zVar.o.get();
                l50.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension2, "extension");
                s.k(extension2);
                return extension2;
            case 10:
                m50.k impl = (m50.k) zVar.f148997n.get();
                l50.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(impl, "impl");
                s.k(impl);
                return impl;
            case 11:
                e60.a aVar5 = (e60.a) zVar.f148994j.get();
                g0 g0Var = (g0) nVar.j0.get();
                j30.c cVarF = nVar.f148906b.f();
                s.j(cVarF);
                return new m50.k(aVar5, g0Var, cVarF, nVar.k(), (y40.b) zVar.f148995l.get(), nVar.i());
            case 12:
                e60.t tVar = (e60.t) zVar.i.get();
                f60.w.a(tVar);
                return tVar;
            case 13:
                ee7.a aVar6 = nVar.o;
                of3.f fVar = nVar.f148906b;
                be7.k kVarC = aVar6.c();
                s.j(kVarC);
                be7.h hVarB = nVar.o.b();
                s.j(hVarB);
                n30.n nVarK = nVar.k();
                m30.j jVar = (m30.j) nVar.Z.get();
                u20.f fVarF = nVar.f();
                y80.a aVarR2 = nVar.d.r();
                s.j(aVarR2);
                j30.c cVarF2 = fVar.f();
                s.j(cVarF2);
                rf3.j jVarA = fVar.a();
                s.j(jVarA);
                return new l40.q(kVarC, hVarB, nVarK, jVar, fVarF, aVarR2, cVarF2, jVarA, (p10.h) nVar.f148924r0.get(), nVar.Y);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object f() {
        h30.z zVar = (h30.z) this.d;
        h30.n nVar = (h30.n) this.f148251b;
        int i = this.f148252c;
        switch (i) {
            case 0:
                return f0k.d.p((e60.a) zVar.f148994j.get());
            case 1:
                com.revolut.kompot.navigable.a aVar = (com.revolut.kompot.navigable.a) zVar.e.get();
                g60.a aVarA = f60.v.a((com.revolut.kompot.navigable.a) zVar.e.get());
                Activity activityA = f60.t.a((com.revolut.kompot.navigable.a) zVar.e.get());
                t80.b bVarB = zVar.b();
                com.revolut.kompot.navigable.a aVar2 = (com.revolut.kompot.navigable.a) zVar.e.get();
                f60.y.a(aVar2);
                d4m.a aVarA2 = e4m.b.a((e) zVar.f149001s);
                nli.a aVar3 = new nli.a((t80.c) zVar.f.get(), f60.t.a((com.revolut.kompot.navigable.a) zVar.e.get()));
                t80.b bVarB2 = zVar.b();
                zk0.b bVarL = zVar.f148991c.d.l();
                s.j(bVarL);
                return v1.c.q(aVar, new v(aVarA, activityA, bVarB, aVar2, aVarA2, aVar3, new oli.c(bVarB2, bVarL, new nli.a((t80.c) zVar.f.get(), f60.t.a((com.revolut.kompot.navigable.a) zVar.e.get())), f60.v.a((com.revolut.kompot.navigable.a) zVar.e.get()), zVar.j()), new oli.g(u.a(f60.t.a((com.revolut.kompot.navigable.a) zVar.e.get())), v1.c.e((com.revolut.kompot.navigable.a) zVar.e.get()), new ami.n(e4m.b.a((e) zVar.f149002t), 1), e4m.b.a((e) zVar.f149001s), zVar.b(), new nli.a((t80.c) zVar.f.get(), f60.t.a((com.revolut.kompot.navigable.a) zVar.e.get())), new i90.b(), zVar.c(), zVar.j()), zVar.j()), x.a(), (rp0.m) zVar.f148992g.get(), (e60.t) zVar.i.get());
            case 2:
                com.revolut.kompot.navigable.a aVar4 = (com.revolut.kompot.navigable.a) zVar.e.get();
                f60.y.a(aVar4);
                return pli.c.a(new ks0.n(aVar4));
            case 3:
                return l50.b.a();
            case 4:
                return t96.a.a();
            case 5:
                return z.a();
            case 6:
                aii.o oVar = (aii.o) zVar.f148993h.get();
                y80.a aVarR = nVar.d.r();
                s.j(aVarR);
                return new e60.y(oVar, aVarR, zVar.c(), Optional.empty());
            case 7:
                y40.b extension = (y40.b) zVar.f148995l.get();
                l50.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                s.k(extension);
                return extension;
            case 8:
                rf3.b bVar = (rf3.b) nVar.f148906b.C.get();
                s.j(bVar);
                return l50.c.a(bVar);
            case 9:
                n0 extension2 = (n0) zVar.o.get();
                l50.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension2, "extension");
                s.k(extension2);
                return extension2;
            case 10:
                m50.k impl = (m50.k) zVar.f148997n.get();
                l50.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(impl, "impl");
                s.k(impl);
                return impl;
            case 11:
                e60.a aVar5 = (e60.a) zVar.f148994j.get();
                g0 g0Var = (g0) nVar.j0.get();
                j30.c cVarF = nVar.f148906b.f();
                s.j(cVarF);
                return new m50.k(aVar5, g0Var, cVarF, nVar.k(), (y40.b) zVar.f148995l.get(), nVar.i());
            case 12:
                e60.t tVar = (e60.t) zVar.i.get();
                f60.w.a(tVar);
                return tVar;
            case 13:
                ee7.a aVar6 = nVar.o;
                of3.f fVar = nVar.f148906b;
                be7.k kVarC = aVar6.c();
                s.j(kVarC);
                be7.h hVarB = nVar.o.b();
                s.j(hVarB);
                n30.n nVarK = nVar.k();
                m30.j jVar = (m30.j) nVar.Z.get();
                u20.f fVarF = nVar.f();
                y80.a aVarR2 = nVar.d.r();
                s.j(aVarR2);
                j30.c cVarF2 = fVar.f();
                s.j(cVarF2);
                rf3.j jVarA = fVar.a();
                s.j(jVarA);
                return new l40.q(kVarC, hVarB, nVarK, jVar, fVarF, aVarR2, cVarF2, jVarA, (p10.h) nVar.f148924r0.get(), nVar.Y);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object g() {
        h30.n nVar = (h30.n) this.f148251b;
        e0 e0Var = (e0) this.d;
        int i = this.f148252c;
        switch (i) {
            case 0:
                return p0.f((j60.a) e0Var.d.get());
            case 1:
                return w40.c.g((com.revolut.kompot.navigable.a) e0Var.f148883c.get(), kxa.j.o(new nji.b()));
            case 2:
                qf3.b provider = (qf3.b) nVar.f148906b.B.get();
                s.j(provider);
                Intrinsics.checkNotNullParameter(provider, "provider");
                fd6.b modelExtension = provider.f245236c.e();
                Intrinsics.checkNotNullParameter(modelExtension, "modelExtension");
                fd6.a aVar = new fd6.a(modelExtension);
                return new p10.c(aVar.e, aVar, modelExtension);
            case 3:
                mse.a extension = (mse.a) e0Var.k.get();
                f50.f.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                s.k(extension);
                return extension;
            case 4:
                return f0k.d.y((y9l.a) e0Var.f148884g.get(), (ep6.n) e0Var.f148886j.get(), nVar.f148927t.a());
            case 5:
                byc.k factory = ((vxc.b) nVar.f148923r).a();
                s.j(factory);
                Intrinsics.checkNotNullParameter(factory, "factory");
                return factory.a();
            case 6:
                return w40.c.m((i8d.f) e0Var.i.get(), (j60.a) e0Var.d.get(), (g1) e0Var.f148885h.get());
            case 7:
                zo6.a aVarA = nVar.f148925s.a();
                s.j(aVarA);
                return w40.c.n(aVarA, (j60.a) e0Var.d.get(), (g1) e0Var.f148885h.get());
            case 8:
                com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) e0Var.f148883c.get();
                f50.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller, "controller");
                return x0.a(g1.Companion, controller.D2());
            case 9:
                return w40.c.l((ep6.n) e0Var.f148886j.get());
            case 10:
                y40.a extension2 = (y40.a) e0Var.f148889n.get();
                Intrinsics.checkNotNullParameter(extension2, "extension");
                s.k(extension2);
                return extension2;
            case 11:
                r69.a aVarA2 = nVar.f148906b.f224694m.a();
                s.j(aVarA2);
                Intrinsics.checkNotNullParameter(new nd.m(aVarA2), "factory");
                return new uf3.b(aVarA2);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object h() {
        h30.n nVar = (h30.n) this.f148251b;
        e0 e0Var = (e0) this.d;
        int i = this.f148252c;
        switch (i) {
            case 0:
                return p0.f((j60.a) e0Var.d.get());
            case 1:
                return w40.c.g((com.revolut.kompot.navigable.a) e0Var.f148883c.get(), kxa.j.o(new nji.b()));
            case 2:
                qf3.b provider = (qf3.b) nVar.f148906b.B.get();
                s.j(provider);
                Intrinsics.checkNotNullParameter(provider, "provider");
                fd6.b modelExtension = provider.f245236c.e();
                Intrinsics.checkNotNullParameter(modelExtension, "modelExtension");
                fd6.a aVar = new fd6.a(modelExtension);
                return new p10.c(aVar.e, aVar, modelExtension);
            case 3:
                mse.a extension = (mse.a) e0Var.k.get();
                f50.f.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                s.k(extension);
                return extension;
            case 4:
                return f0k.d.y((y9l.a) e0Var.f148884g.get(), (ep6.n) e0Var.f148886j.get(), nVar.f148927t.a());
            case 5:
                byc.k factory = ((vxc.b) nVar.f148923r).a();
                s.j(factory);
                Intrinsics.checkNotNullParameter(factory, "factory");
                return factory.a();
            case 6:
                return w40.c.m((i8d.f) e0Var.i.get(), (j60.a) e0Var.d.get(), (g1) e0Var.f148885h.get());
            case 7:
                zo6.a aVarA = nVar.f148925s.a();
                s.j(aVarA);
                return w40.c.n(aVarA, (j60.a) e0Var.d.get(), (g1) e0Var.f148885h.get());
            case 8:
                com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) e0Var.f148883c.get();
                f50.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller, "controller");
                return x0.a(g1.Companion, controller.D2());
            case 9:
                return w40.c.l((ep6.n) e0Var.f148886j.get());
            case 10:
                y40.a extension2 = (y40.a) e0Var.f148889n.get();
                Intrinsics.checkNotNullParameter(extension2, "extension");
                s.k(extension2);
                return extension2;
            case 11:
                r69.a aVarA2 = nVar.f148906b.f224694m.a();
                s.j(aVarA2);
                Intrinsics.checkNotNullParameter(new nd.m(aVarA2), "factory");
                return new uf3.b(aVarA2);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object i() {
        h98.i iVar = (h98.i) this.f148251b;
        da3.j jVar = iVar.f150198b;
        h98.h hVar = (h98.h) this.d;
        h98.i iVar2 = hVar.f150196c;
        CardRequestReviewScreenContract$InputData cardRequestReviewScreenContract$InputData = hVar.f150195b;
        int i = this.f148252c;
        if (i == 0) {
            BaseScreen screen = hVar.f150194a;
            n98.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(screen, "screen");
            return new c90.c(screen.m2());
        }
        if (i != 1) {
            if (i != 2) {
                throw new AssertionError(i);
            }
            c90.c cVar = (c90.c) hVar.d.get();
            m93.b bVar = (m93.b) jVar.N.get();
            s.j(bVar);
            qd0.b bVarN = iVar2.f150199c.n();
            s.j(bVarN);
            return new m98.s(cVar, bVar, cardRequestReviewScreenContract$InputData, new m98.a(bVarN));
        }
        jki.p pVar = (jki.p) hVar.e.get();
        hj8.a aVarA = iVar.d.a();
        s.j(aVarA);
        ang.f fVarE = iVar.e.e();
        ic8.b bVarA = iVar.f.a();
        s.j(bVarA);
        ha3.f fVarD = jVar.d();
        s.j(fVarD);
        z13.a aVar = iVar2.f150200g;
        y13.c cVar2 = (y13.c) aVar.f318719g.get();
        s.j(cVar2);
        wsg.n nVarB = iVar2.f150201h.b();
        j6l.b bVarD = aVar.f.e.d();
        s.j(bVarD);
        zjh.i iVar3 = new zjh.i(bVarD);
        uq8.a aVarC = ((oq8.a) iVar2.i).c();
        hj8.a aVarA2 = iVar2.d.a();
        s.j(aVarA2);
        z43.a aVarA3 = iVar2.f150202j.a();
        s.j(aVarA3);
        return new m98.p(pVar, cardRequestReviewScreenContract$InputData, aVarA, fVarE, bVarA, fVarD, new l98.f(cVar2, nVarB, iVar3, aVarC, aVarA2, aVarA3), new i90.b());
    }

    private final Object j() {
        h9h.a aVar = (h9h.a) this.f148251b;
        u8h.c cVar = aVar.C;
        h9h.b bVar = (h9h.b) this.d;
        int i = this.f148252c;
        if (i == 0) {
            return a10.b.f((u8h.b) cVar, "factory");
        }
        if (i == 1) {
            return kxa.j.k((j60.a) bVar.f150290g.get());
        }
        if (i == 2) {
            return ehe.n.s((com.revolut.kompot.navigable.a) bVar.e.get(), (rp0.m) bVar.f.get());
        }
        if (i == 3) {
            return new rp0.m();
        }
        if (i != 4) {
            if (i == 5) {
                return a10.b.g((u8h.b) cVar, "factory");
            }
            throw new AssertionError(i);
        }
        bof.r rVar = new bof.r(bVar.f150288b, new mch.d(), new mch.c(), new mch.b(h9h.a.y()), (q1) bVar.i.get());
        ich.u uVar = new ich.u();
        InstrumentsCollectionControllerContract$InputData instrumentsCollectionControllerContract$InputData = bVar.f150288b;
        j60.a aVar2 = (j60.a) bVar.f150290g.get();
        aah.h hVar = (aah.h) bVar.d.get();
        mch.e eVar = new mch.e();
        x8h.p pVar = new x8h.p();
        ich.t tVar = new ich.t();
        x8h.o oVar = new x8h.o(new vfg.p((e8h.n0) aVar.f150281v0.get()));
        x8h.g gVarB = aVar.b();
        ybl.b bVarB = aVar.f150258b.b();
        s.j(bVarB);
        return new com.revolut.feature.wealth.impl.ui.screens.instruments_collection.a(rVar, uVar, instrumentsCollectionControllerContract$InputData, aVar2, hVar, eVar, pVar, tVar, oVar, gVarB, bVarB);
    }

    private final Object k() {
        hc2.o oVar = (hc2.o) this.d;
        hc2.m mVar = (hc2.m) this.f148251b;
        int i = this.f148252c;
        if (i == 0) {
            Object extension = (com.revolut.feature.apm.core.ui.api.navigation.a) mVar.f150812t.get();
            oc2.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(extension, "extension");
            yji.n nVar = (yji.n) extension;
            s.k(nVar);
            return nVar;
        }
        if (i != 1) {
            if (i == 2) {
                return new com.revolut.feature.apm.qvik.impl.ui.a(oVar.f150816a, new mc2.g((c12.f) mVar.o.get()), new mc2.n((c12.z) oVar.f150817b.f150808p.get()));
            }
            if (i == 3) {
                return new ci2.a((vw1.b) mVar.f150811s.get(), 2);
            }
            throw new AssertionError(i);
        }
        Object extension2 = mVar.f150800b.b();
        s.j(extension2);
        oc2.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(extension2, "extension");
        return (yji.n) extension2;
    }

    private final Object l() {
        hc2.p pVar = (hc2.p) this.d;
        hc2.m mVar = pVar.f150820a;
        hc2.m mVar2 = (hc2.m) this.f148251b;
        p12.l lVar = mVar2.f150800b;
        int i = this.f148252c;
        if (i != 0) {
            if (i != 1) {
                throw new AssertionError(i);
            }
            a12.j jVarE = lVar.e();
            s.j(jVarE);
            a12.e eVarL = lVar.l();
            s.j(eVarL);
            a12.o oVarM = lVar.m();
            s.j(oVarM);
            a12.h hVar = (a12.h) lVar.A.get();
            s.j(hVar);
            gte.a aVarB = mVar2.e.b();
            s.j(aVarB);
            return new qc2.p(jVarE, eVarL, oVarM, hVar, aVarB);
        }
        h12.h hVarF = mVar.f150800b.f();
        s.j(hVarF);
        pc2.e eVar = new pc2.e(hVarF);
        mc2.g gVar = new mc2.g((c12.f) mVar.o.get());
        mc2.n nVar = new mc2.n((c12.z) mVar.f150808p.get());
        mc2.c cVar = new mc2.c();
        iz1.n nVar2 = (iz1.n) ((lz1.m) mVar.f).G.get();
        s.j(nVar2);
        a12.h hVar2 = (a12.h) mVar.f150800b.A.get();
        s.j(hVar2);
        mc2.b bVar = new mc2.b(nVar2, hVar2, new mc2.c());
        h12.a aVarD = lVar.d();
        s.j(aVarD);
        vz1.j jVarI = ((lz1.m) mVar2.f).i();
        s.j(jVarI);
        return new qc2.n(eVar, gVar, nVar, cVar, bVar, aVarD, jVarI, (e12.f) mVar2.f150809q.get(), (pn3.a) mVar2.f150810r.get(), (cli.n) pVar.f150821b.get());
    }

    private final Object m() {
        hc2.t tVar = (hc2.t) this.d;
        hc2.m mVar = tVar.f150832b;
        int i = this.f148252c;
        if (i == 0) {
            Object extension = (ic2.a) tVar.f150833c.get();
            jc2.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(extension, "extension");
            yji.n nVar = (yji.n) extension;
            s.k(nVar);
            return nVar;
        }
        if (i == 1) {
            sf0.h hVarB = mVar.f150804j.b();
            s.j(hVarB);
            v60.e eVarA = mVar.k.a();
            s.j(eVarA);
            return new ic2.b(new ic2.c(hVarB, eVarA, 0));
        }
        if (i != 2) {
            throw new AssertionError(i);
        }
        QvikPayFlowContract$InputData qvikPayFlowContract$InputData = tVar.f150831a;
        uc2.c cVar = new uc2.c(new tnb.g0(new o7.b((QvikPayService) mVar.v.get())));
        tnb.g0 g0Var = new tnb.g0(new o7.b((QvikPayService) mVar.v.get()));
        ic2.a aVar = (ic2.a) tVar.f150833c.get();
        cc2.a aVar2 = (cc2.a) ((hc2.m) this.f148251b).d.e.get();
        s.j(aVar2);
        return new com.revolut.feature.apm.qvik.impl.ui.pay.a(qvikPayFlowContract$InputData, cVar, g0Var, aVar, aVar2);
    }

    private final Object n() {
        hc2.v vVar = (hc2.v) this.d;
        hc2.m mVar = vVar.f150838b;
        hc2.m mVar2 = (hc2.m) this.f148251b;
        p12.l lVar = mVar2.f150800b;
        int i = this.f148252c;
        if (i != 0) {
            if (i != 1) {
                throw new AssertionError(i);
            }
            v02.a aVarA = lVar.a();
            s.j(aVarA);
            a12.u uVar = (a12.u) lVar.v.get();
            s.j(uVar);
            return new vc2.w(aVarA, uVar);
        }
        vw1.b bVar = (vw1.b) mVar.f150811s.get();
        iz1.m mVar3 = (iz1.m) ((lz1.m) mVar.f).N.get();
        s.j(mVar3);
        vc2.h hVar = new vc2.h(bVar, mVar3);
        com.revolut.feature.apm.core.ui.api.navigation.a aVar = (com.revolut.feature.apm.core.ui.api.navigation.a) mVar2.f150812t.get();
        v02.b bVarB = lVar.b();
        s.j(bVarB);
        wc2.g gVar = new wc2.g((com.revolut.feature.apm.core.ui.api.navigation.a) mVar.f150812t.get());
        v02.c cVarC = lVar.c();
        s.j(cVarC);
        wj0.a aVarI = ((nj0.d) mVar2.f150803h).i();
        s.j(aVarI);
        return new vc2.u(hVar, aVar, bVarB, gVar, cVarC, aVarI, (cli.n) vVar.f150839c.get());
    }

    private final Object o() {
        hc2.v vVar = (hc2.v) this.d;
        hc2.m mVar = vVar.f150838b;
        hc2.m mVar2 = (hc2.m) this.f148251b;
        p12.l lVar = mVar2.f150800b;
        int i = this.f148252c;
        if (i != 0) {
            if (i != 1) {
                throw new AssertionError(i);
            }
            v02.a aVarA = lVar.a();
            s.j(aVarA);
            a12.u uVar = (a12.u) lVar.v.get();
            s.j(uVar);
            return new vc2.w(aVarA, uVar);
        }
        vw1.b bVar = (vw1.b) mVar.f150811s.get();
        iz1.m mVar3 = (iz1.m) ((lz1.m) mVar.f).N.get();
        s.j(mVar3);
        vc2.h hVar = new vc2.h(bVar, mVar3);
        com.revolut.feature.apm.core.ui.api.navigation.a aVar = (com.revolut.feature.apm.core.ui.api.navigation.a) mVar2.f150812t.get();
        v02.b bVarB = lVar.b();
        s.j(bVarB);
        wc2.g gVar = new wc2.g((com.revolut.feature.apm.core.ui.api.navigation.a) mVar.f150812t.get());
        v02.c cVarC = lVar.c();
        s.j(cVarC);
        wj0.a aVarI = ((nj0.d) mVar2.f150803h).i();
        s.j(aVarI);
        return new vc2.u(hVar, aVar, bVarB, gVar, cVarC, aVarI, (cli.n) vVar.f150839c.get());
    }

    private final Object p() {
        hc2.v vVar = (hc2.v) this.d;
        hc2.m mVar = vVar.f150838b;
        hc2.m mVar2 = (hc2.m) this.f148251b;
        int i = this.f148252c;
        if (i != 0) {
            if (i != 1) {
                throw new AssertionError(i);
            }
            v02.a aVarA = mVar2.f150800b.a();
            s.j(aVarA);
            a12.u uVar = (a12.u) mVar2.f150800b.v.get();
            s.j(uVar);
            return new vc2.w(aVarA, uVar);
        }
        vw1.b bVar = (vw1.b) mVar.f150811s.get();
        iz1.m mVar3 = (iz1.m) ((lz1.m) mVar.f).N.get();
        s.j(mVar3);
        vc2.h hVar = new vc2.h(bVar, mVar3);
        e4m.e eVar = mVar2.f150812t;
        p12.l lVar = mVar2.f150800b;
        com.revolut.feature.apm.core.ui.api.navigation.a aVar = (com.revolut.feature.apm.core.ui.api.navigation.a) eVar.get();
        v02.b bVarB = lVar.b();
        s.j(bVarB);
        wc2.g gVar = new wc2.g((com.revolut.feature.apm.core.ui.api.navigation.a) mVar.f150812t.get());
        v02.c cVarC = lVar.c();
        s.j(cVarC);
        wj0.a aVarI = ((nj0.d) mVar2.f150803h).i();
        s.j(aVarI);
        return new vc2.u(hVar, aVar, bVarB, gVar, cVarC, aVarI, (cli.n) vVar.f150839c.get());
    }

    private final Object q() {
        he2.c cVar = (he2.c) this.f148251b;
        he2.d dVar = (he2.d) this.d;
        int i = this.f148252c;
        if (i != 0) {
            if (i != 1) {
                throw new AssertionError(i);
            }
            z80.b bVarS = cVar.d.s();
            s.j(bVarS);
            return new ke2.s(bVarS);
        }
        cli.n nVar = (cli.n) dVar.f151536c.get();
        SwishConfirmationScreenContract$InputData swishConfirmationScreenContract$InputData = dVar.f151534a;
        wli.x xVarD = ((s41.a) cVar.f151530c).d();
        he2.c cVar2 = dVar.f151535b;
        fx1.a aVarF = ((lz1.m) cVar2.e).f();
        s.j(aVarF);
        return new ke2.q(nVar, swishConfirmationScreenContract$InputData, xVarD, new com.revolut.feature.apm.swish.impl.domain.a(aVarF, (ce2.a) cVar2.k.get(), cVar2.f151531g.e()));
    }

    private final Object r() {
        he2.g gVar = (he2.g) this.d;
        int i = this.f148252c;
        if (i != 0) {
            if (i != 1) {
                throw new AssertionError(i);
            }
            z80.b bVarS = ((he2.c) this.f148251b).d.s();
            s.j(bVarS);
            return new pe2.n(bVarS);
        }
        cli.n nVar = (cli.n) gVar.f151544c.get();
        SwishHomeAreaScreenContract$InputData swishHomeAreaScreenContract$InputData = gVar.f151542a;
        he2.c cVar = gVar.f151543b;
        fx1.a aVarF = ((lz1.m) cVar.e).f();
        s.j(aVarF);
        return new com.revolut.feature.apm.swish.impl.ui.home.area.a(nVar, swishHomeAreaScreenContract$InputData, new com.revolut.feature.apm.swish.impl.domain.a(aVarF, (ce2.a) cVar.k.get(), cVar.f151531g.e()), new pe2.a());
    }

    private final Object s() {
        he2.c cVar = (he2.c) this.f148251b;
        he2.h hVar = (he2.h) this.d;
        int i = this.f148252c;
        if (i == 0) {
            cli.n nVar = (cli.n) hVar.e.get();
            SwishTransactionLimitScreenContract$InputData swishTransactionLimitScreenContract$InputData = hVar.f151545a;
            he2.c cVar2 = hVar.f151546b;
            fx1.a aVarF = ((lz1.m) cVar2.e).f();
            s.j(aVarF);
            return new re2.i(nVar, swishTransactionLimitScreenContract$InputData, new com.revolut.feature.apm.swish.impl.domain.a(aVarF, (ce2.a) cVar2.k.get(), cVar2.f151531g.e()), (ldd.b) hVar.d.get(), (w80.b) hVar.f151547c.get());
        }
        if (i == 1) {
            return new re2.k(new u80.o(), (w80.b) hVar.f151547c.get(), (ldd.b) hVar.d.get());
        }
        if (i == 2) {
            qd0.b languageProvider = cVar.d.n();
            s.j(languageProvider);
            se2.a.Companion.getClass();
            Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
            return v80.b.b(languageProvider, false, false, 58);
        }
        if (i != 3) {
            throw new AssertionError(i);
        }
        ldd.a factory = new ldd.a();
        se2.a.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new ldd.b();
    }

    private final Object t() {
        he9.d dVar = (he9.d) this.d;
        he9.e eVar = (he9.e) this.f148251b;
        int i = this.f148252c;
        if (i == 0) {
            return new he9.c(this, 0);
        }
        if (i == 1) {
            return new com.revolut.feature.passcode.ui.biometric_passcode_verification.b(dVar.f151606b, (ie9.d) eVar.f151612h.get(), eVar.f151609b.a(), new fe9.h(dVar.f151607c.f151609b.a()), (me9.a) eVar.f151613j.get(), (oe9.a) eVar.i.get());
        }
        throw new AssertionError(i);
    }

    private final Object u() {
        hja.a aVar = (hja.a) this.f148251b;
        hja.b bVar = (hja.b) this.d;
        int i = this.f148252c;
        if (i != 0) {
            if (i == 1) {
                return new com.revolut.feature.product.lifecycle.flow.a(bVar.f152676a, (ija.a) aVar.f152675j.get(), (kja.b) bVar.f152678c.get());
            }
            throw new AssertionError(i);
        }
        hja.a aVar2 = bVar.f152677b;
        v60.e eVarA = aVar2.f152671b.a();
        s.j(eVarA);
        sf0.h hVarB = aVar2.f152672c.b();
        s.j(hVarB);
        return new kja.d(new kvh.h(hVarB, eVarA), aVar.d.a());
    }

    @Override // phm.a
    public final Object get() {
        int i = this.f148250a;
        int i2 = this.f148252c;
        Object obj2 = this.d;
        Object obj3 = this.f148251b;
        switch (i) {
            case 0:
                h hVar = (h) obj3;
                f fVar = (f) obj2;
                switch (i2) {
                    case 0:
                        return kpi.f.a();
                    case 1:
                        Context contextI = bq.i.i(fVar.f148253a);
                        BaseDelegatesActivity baseDelegatesActivityF = bq.i.f(fVar.f148253a);
                        t70.g gVarO = hVar.f148280b.o();
                        s.j(gVarO);
                        return new npi.c(contextI, baseDelegatesActivityF, gVarO);
                    case 2:
                        return new tpi.i((rpi.c) fVar.e.get(), gsi.c.a(fVar.f148253a));
                    case 3:
                        return new rpi.b(bq.i.b(fVar.f148253a));
                    case 4:
                        return new rpi.h(bq.i.b(fVar.f148253a));
                    case 5:
                        return new iri.g((iri.j) hVar.f148284j.get(), new f08.k(), bq.i.f(fVar.f148253a), bq.i.l(fVar.f148253a));
                    case 6:
                        return new iri.l(new f08.k(), bq.i.f(fVar.f148253a), (iri.d) fVar.i.get());
                    case 7:
                        return new iri.d(bq.i.f(fVar.f148253a));
                    case 8:
                        return new opi.b(bq.i.f(fVar.f148253a));
                    case 9:
                        return new en.c(ImmutableSet.of((ln.d) fVar.f148254b.f148285l.get()), bq.i.l(fVar.f148253a));
                    case 10:
                        fVar.getClass();
                        return new xpi.c(xpi.f.d, bq.i.b(fVar.f148253a));
                    case 11:
                        k08.h hVar2 = new k08.h((xpi.g) fVar.f148260m.get(), (f08.d) hVar.L.get(), (f08.a) hVar.B.get(), (f9b.f) fVar.f148261n.get(), (tpi.j) fVar.f.get(), new g08.i());
                        kli.a.p(hVar2, bq.i.d(fVar.f148253a));
                        return hVar2;
                    case 12:
                        return bq.i.t(fVar.f148253a);
                    default:
                        throw new AssertionError(i2);
                }
            case 1:
                h hVar3 = (h) obj3;
                g gVar = (g) obj2;
                switch (i2) {
                    case 0:
                        return kpi.f.a();
                    case 1:
                        Context contextI2 = bq.i.i(gVar.f148262a);
                        BaseDelegatesActivity baseDelegatesActivityF2 = bq.i.f(gVar.f148262a);
                        t70.g gVarO2 = hVar3.f148280b.o();
                        s.j(gVarO2);
                        return new npi.c(contextI2, baseDelegatesActivityF2, gVarO2);
                    case 2:
                        return new tpi.i((rpi.c) gVar.e.get(), gsi.c.a(gVar.f148262a));
                    case 3:
                        return new rpi.b(bq.i.b(gVar.f148262a));
                    case 4:
                        return new rpi.h(bq.i.b(gVar.f148262a));
                    case 5:
                        return new iri.g((iri.j) hVar3.f148284j.get(), new f08.k(), bq.i.f(gVar.f148262a), bq.i.l(gVar.f148262a));
                    case 6:
                        return new iri.l(new f08.k(), bq.i.f(gVar.f148262a), (iri.d) gVar.i.get());
                    case 7:
                        return new iri.d(bq.i.f(gVar.f148262a));
                    case 8:
                        return new opi.b(bq.i.f(gVar.f148262a));
                    case 9:
                        return new en.c(ImmutableSet.of((ln.d) gVar.f148263b.f148285l.get()), bq.i.l(gVar.f148262a));
                    case 10:
                        gVar.getClass();
                        wpi.c cVar = wpi.d.Companion;
                        return new wpi.b(bq.i.b(gVar.f148262a));
                    case 11:
                        gVar.getClass();
                        xoi.d dVar = gVar.f148262a;
                        return new ypi.e(ypi.h.d, bq.i.b(dVar), bq.i.o(dVar), bq.i.g(dVar));
                    case 12:
                        gVar.getClass();
                        return new cn.d(ImmutableSet.copyOf((Collection) dn.b.a()), (cn.e) hVar3.o.get(), hVar3.h());
                    case 13:
                        um.c cVar2 = (um.c) hVar3.f148288p.get();
                        gVar.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(6);
                        h hVar4 = gVar.f148263b;
                        builderBuilderWithExpectedSize.add(hVar4.c());
                        builderBuilderWithExpectedSize.add(new vm.b(com.google.android.gms.internal.mlkit_vision_face.a.f()));
                        builderBuilderWithExpectedSize.add(hVar4.i());
                        builderBuilderWithExpectedSize.add(hVar4.f148292t.get());
                        builderBuilderWithExpectedSize.addAll((Iterable) in.g.a());
                        builderBuilderWithExpectedSize.add(new jn.d(e4m.b.a(gVar.f148271p)));
                        return new in.e(cVar2, builderBuilderWithExpectedSize.build(), hVar3.h());
                    case 14:
                        return bq.i.t(gVar.f148262a);
                    case 15:
                        gVar.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize2 = ImmutableSet.builderWithExpectedSize(3);
                        builderBuilderWithExpectedSize2.addAll((Iterable) kn.g.a());
                        builderBuilderWithExpectedSize2.add(gVar.f148273r.get());
                        builderBuilderWithExpectedSize2.add(new kn.h(e4m.b.a(gVar.f)));
                        return new kn.e(builderBuilderWithExpectedSize2.build(), (ym.d) hVar3.f148291s.get(), hVar3.h());
                    case 16:
                        return new zm.a();
                    case 17:
                        gVar.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize3 = ImmutableSet.builderWithExpectedSize(2);
                        builderBuilderWithExpectedSize3.addAll((Iterable) hn.g.a());
                        builderBuilderWithExpectedSize3.add(gVar.f148263b.i());
                        return new hn.d(builderBuilderWithExpectedSize3.build(), (hn.h) hVar3.f148289q.get(), (npi.f) gVar.d.get());
                    case 18:
                        return new gn.c((lpi.e) gVar.u.get(), (sm.e) hVar3.F.get(), ImmutableSet.copyOf((Collection) gn.e.a()), hVar3.h());
                    case 19:
                        return new lpi.b(bq.i.i(gVar.f148262a), bq.i.j(gVar.f148262a));
                    case 20:
                        gVar.getClass();
                        return new in.e(ImmutableSet.copyOf((Collection) pm.b.a()), (om.c) hVar3.G.get(), hVar3.h());
                    case 21:
                        gVar.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize4 = ImmutableSet.builderWithExpectedSize(4);
                        builderBuilderWithExpectedSize4.addAll((Iterable) g3l.f.a());
                        h hVar5 = gVar.f148263b;
                        builderBuilderWithExpectedSize4.add(hVar5.v.get());
                        builderBuilderWithExpectedSize4.add(hVar5.f148292t.get());
                        return new g3l.c(j6.a.g(hVar5.D, builderBuilderWithExpectedSize4), (g3l.g) hVar3.f148290r.get(), (k3l.b) gVar.f148277x.get(), hVar3.h());
                    case 22:
                        return new k3l.d(bq.i.b(gVar.f148262a));
                    case 23:
                        return new wm.l((opi.d) gVar.k.get(), (wm.a) hVar3.f148294x.get(), ImmutableSet.copyOf((Collection) xm.b.a()), hVar3.h());
                    case 24:
                        Activity activityB = bq.i.b(gVar.f148262a);
                        y80.b bVar = new y80.b();
                        g60.a aVar = (g60.a) gVar.A.get();
                        xoi.d dVar2 = gVar.f148262a;
                        Activity activityB2 = bq.i.b(dVar2);
                        t80.g gVar2 = (t80.g) gVar.B.get();
                        BaseDelegatesActivity baseDelegatesActivityF3 = bq.i.f(dVar2);
                        d4m.a aVarA = e4m.b.a(gVar.C);
                        nli.a aVarE = gVar.e();
                        t80.g gVar3 = (t80.g) gVar.B.get();
                        l70.e eVar = gVar.f148263b.f148280b;
                        zk0.b bVarL = eVar.l();
                        s.j(bVarL);
                        oli.c cVar3 = new oli.c(gVar3, bVarL, gVar.e(), (g60.a) gVar.A.get(), gVar.f());
                        ComponentActivity componentActivityA = gmf.b.a(dVar2);
                        ActivityResultRegistry activityResultRegistryA = pli.b.a(gmf.b.a(dVar2));
                        ami.n nVar = new ami.n(e4m.b.a(gVar.D), 1);
                        d4m.a aVarA2 = e4m.b.a(gVar.C);
                        t80.g gVar4 = (t80.g) gVar.B.get();
                        nli.a aVarE2 = gVar.e();
                        i90.b bVar2 = new i90.b();
                        z70.a aVarF = eVar.f();
                        s.j(aVarF);
                        c70.b bVar3 = new c70.b(aVarF, 2);
                        z70.a aVarF2 = eVar.f();
                        s.j(aVarF2);
                        return new upi.b(activityB, bVar, new v(aVar, activityB2, gVar2, baseDelegatesActivityF3, aVarA, aVarE, cVar3, new oli.g(componentActivityA, activityResultRegistryA, nVar, aVarA2, gVar4, aVarE2, bVar2, new u96.b(bVar3, new smd.s(aVarF2)), gVar.f()), gVar.f()));
                    case 25:
                        return new g60.a(bq.i.b(gVar.f148262a));
                    case 26:
                        l70.e eVar2 = hVar3.f148280b;
                        l70.e eVar3 = hVar3.f148280b;
                        f80.a aVarX = eVar2.x();
                        s.j(aVarX);
                        l80.e eVarH = eVar3.h();
                        s.j(eVarH);
                        zk0.b bVarL2 = eVar3.l();
                        s.j(bVarL2);
                        return new t80.b(aVarX, eVarH, bVarL2);
                    case 27:
                        return pli.c.a(new ks0.n(bq.i.f(gVar.f148262a)));
                    case 28:
                        return t96.a.a();
                    case 29:
                        return new aqi.d(bq.i.b(gVar.f148262a), new y80.b());
                    case 30:
                        return new com.revolut.retail.toast.mediator.a((d4l.a) hVar3.K.get(), (c4l.b) gVar.G.get());
                    case 31:
                        return new c4l.e(bq.i.i(gVar.f148262a), bq.i.g(gVar.f148262a));
                    case 32:
                        e4m.e eVar4 = gVar.f148269m;
                        h hVar6 = gVar.f148263b;
                        wpi.e eVar5 = (wpi.e) eVar4.get();
                        ypi.i iVar = (ypi.i) gVar.f148270n.get();
                        f08.d dVar3 = (f08.d) hVar3.L.get();
                        f08.a aVar2 = (f08.a) hVar3.B.get();
                        f9b.f fVar2 = (f9b.f) gVar.f148271p.get();
                        tpi.j jVar = (tpi.j) gVar.f.get();
                        yx7.n policyCancellationMessageBuilder = new yx7.n();
                        yx7.t vendorUiBuilder = new yx7.t();
                        g08.l petProfileCommonUiBuilder = new g08.l();
                        Intrinsics.checkNotNullParameter(policyCancellationMessageBuilder, "policyCancellationMessageBuilder");
                        Intrinsics.checkNotNullParameter(vendorUiBuilder, "vendorUiBuilder");
                        Intrinsics.checkNotNullParameter(petProfileCommonUiBuilder, "petProfileCommonUiBuilder");
                        g08.g gVar5 = new g08.g();
                        yx7.t vendorUiBuilder2 = new yx7.t();
                        g08.l petProfileCommonUiBuilder2 = new g08.l();
                        Intrinsics.checkNotNullParameter(vendorUiBuilder2, "vendorUiBuilder");
                        Intrinsics.checkNotNullParameter(petProfileCommonUiBuilder2, "petProfileCommonUiBuilder");
                        g08.p pVar = new g08.p(gVar5, new g08.c());
                        g08.a aVar3 = new g08.a();
                        g08.h hVar7 = new g08.h();
                        fx7.f fVarB = hVar6.f148281c.b();
                        s.j(fVarB);
                        yx7.h hVar8 = new yx7.h(fVarB);
                        ey7.g petStatusUiModelProvider = new ey7.g();
                        Intrinsics.checkNotNullParameter(petStatusUiModelProvider, "petStatusUiModelProvider");
                        yx7.k kVar = new yx7.k();
                        l80.e eVarH2 = hVar6.f148280b.h();
                        s.j(eVarH2);
                        g08.o oVar = new g08.o(hVar8, kVar, new a0e.w(eVarH2, 6));
                        opi.d dVar4 = (opi.d) gVar.k.get();
                        zd7.b bVar4 = (zd7.b) gVar.J.get();
                        mm.d dVar5 = (mm.d) hVar3.u.get();
                        l80.e eVarH3 = hVar3.f148280b.h();
                        s.j(eVarH3);
                        c70.a aVarZ = hVar6.f148280b.z();
                        s.j(aVarZ);
                        n08.c0 c0Var = new n08.c0(eVar5, iVar, dVar3, aVar2, fVar2, jVar, pVar, aVar3, hVar7, oVar, dVar4, bVar4, dVar5, eVarH3, new u08.a(aVarZ, (d4l.a) hVar6.K.get()), new n08.e0());
                        kli.a.p(c0Var, bq.i.d(gVar.f148262a));
                        return c0Var;
                    case 33:
                        return new ae7.i((upi.f) gVar.E.get(), (t80.c) hVar3.J.get(), (d4l.a) hVar3.K.get(), (aqi.a) gVar.I.get(), new ae7.j(), bq.i.l(gVar.f148262a));
                    case 34:
                        return aqi.f.a(gVar.f148262a, (aqi.d) gVar.F.get());
                    default:
                        throw new AssertionError(i2);
                }
            case 2:
                h hVar9 = (h) obj3;
                j jVar2 = (j) obj2;
                switch (i2) {
                    case 0:
                        return kpi.f.a();
                    case 1:
                        Context contextI3 = bq.i.i(jVar2.f148299a);
                        BaseDelegatesActivity baseDelegatesActivityF4 = bq.i.f(jVar2.f148299a);
                        t70.g gVarO3 = hVar9.f148280b.o();
                        s.j(gVarO3);
                        return new npi.c(contextI3, baseDelegatesActivityF4, gVarO3);
                    case 2:
                        return new tpi.i((rpi.c) jVar2.f148303h.get(), gsi.c.a(jVar2.f148299a));
                    case 3:
                        return new rpi.b(bq.i.b(jVar2.f148299a));
                    case 4:
                        return new rpi.h(bq.i.b(jVar2.f148299a));
                    case 5:
                        return new iri.g((iri.j) hVar9.f148284j.get(), new iri.b(), bq.i.f(jVar2.f148299a), bq.i.l(jVar2.f148299a));
                    case 6:
                        return new iri.l(new iri.b(), bq.i.f(jVar2.f148299a), (iri.d) jVar2.f148305l.get());
                    case 7:
                        return new iri.d(bq.i.f(jVar2.f148299a));
                    case 8:
                        return new opi.b(bq.i.f(jVar2.f148299a));
                    case 9:
                        return new en.c(ImmutableSet.of((ln.d) jVar2.e.f148285l.get()), bq.i.l(jVar2.f148299a));
                    case 10:
                        return new iqi.b(jVar2.f148300b, bq.i.b(jVar2.f148299a));
                    case 11:
                        return new xpi.c(jVar2.f148301c, bq.i.b(jVar2.f148299a));
                    case 12:
                        jVar2.getClass();
                        return new cn.d(ImmutableSet.copyOf((Collection) dn.b.a()), (cn.e) hVar9.o.get(), hVar9.h());
                    case 13:
                        um.c cVar4 = (um.c) hVar9.f148288p.get();
                        jVar2.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize5 = ImmutableSet.builderWithExpectedSize(6);
                        h hVar10 = jVar2.e;
                        builderBuilderWithExpectedSize5.add(hVar10.c());
                        builderBuilderWithExpectedSize5.add(new vm.b(com.google.android.gms.internal.mlkit_vision_face.a.f()));
                        builderBuilderWithExpectedSize5.add(hVar10.i());
                        builderBuilderWithExpectedSize5.add(hVar10.f148292t.get());
                        builderBuilderWithExpectedSize5.addAll((Iterable) in.g.a());
                        builderBuilderWithExpectedSize5.add(new jn.d(e4m.b.a(jVar2.f148311s)));
                        return new in.e(cVar4, builderBuilderWithExpectedSize5.build(), hVar9.h());
                    case 14:
                        return bq.i.t(jVar2.f148299a);
                    case 15:
                        jVar2.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize6 = ImmutableSet.builderWithExpectedSize(3);
                        builderBuilderWithExpectedSize6.addAll((Iterable) kn.g.a());
                        builderBuilderWithExpectedSize6.add(jVar2.u.get());
                        builderBuilderWithExpectedSize6.add(new kn.h(e4m.b.a(jVar2.i)));
                        return new kn.e(builderBuilderWithExpectedSize6.build(), (ym.d) hVar9.f148291s.get(), hVar9.h());
                    case 16:
                        return new zm.a();
                    case 17:
                        jVar2.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize7 = ImmutableSet.builderWithExpectedSize(2);
                        builderBuilderWithExpectedSize7.addAll((Iterable) hn.g.a());
                        builderBuilderWithExpectedSize7.add(jVar2.e.i());
                        return new hn.d(builderBuilderWithExpectedSize7.build(), (hn.h) hVar9.f148289q.get(), (npi.f) jVar2.f148302g.get());
                    case 18:
                        return new gn.c((lpi.e) jVar2.f148314x.get(), (sm.e) hVar9.F.get(), ImmutableSet.copyOf((Collection) gn.e.a()), hVar9.h());
                    case 19:
                        return new lpi.b(bq.i.i(jVar2.f148299a), bq.i.j(jVar2.f148299a));
                    case 20:
                        jVar2.getClass();
                        return new in.e(ImmutableSet.copyOf((Collection) pm.b.a()), (om.c) hVar9.G.get(), hVar9.h());
                    case 21:
                        return new wm.l((opi.d) jVar2.f148307n.get(), (wm.a) hVar9.f148294x.get(), ImmutableSet.copyOf((Collection) xm.b.a()), hVar9.h());
                    case 22:
                        jVar2.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize8 = ImmutableSet.builderWithExpectedSize(4);
                        builderBuilderWithExpectedSize8.addAll((Iterable) g3l.f.a());
                        h hVar11 = jVar2.e;
                        builderBuilderWithExpectedSize8.add(hVar11.v.get());
                        builderBuilderWithExpectedSize8.add(hVar11.f148292t.get());
                        return new g3l.c(j6.a.g(hVar11.D, builderBuilderWithExpectedSize8), (g3l.g) hVar9.f148290r.get(), (k3l.b) jVar2.B.get(), hVar9.h());
                    case 23:
                        return new k3l.d(bq.i.b(jVar2.f148299a));
                    case 24:
                        xpi.g gVar6 = (xpi.g) jVar2.f148309q.get();
                        iqi.h hVar12 = (iqi.h) jVar2.f148308p.get();
                        f9b.f fVar3 = (f9b.f) jVar2.f148311s.get();
                        opi.d dVar6 = (opi.d) jVar2.f148307n.get();
                        gz7.l lVar = (gz7.l) hVar9.H.get();
                        gz7.h hVar13 = (gz7.h) hVar9.I.get();
                        fx7.f fVarB2 = jVar2.e.f148281c.b();
                        s.j(fVarB2);
                        gz7.v vVar = new gz7.v(gVar6, hVar12, fVar3, dVar6, lVar, hVar13, new iz7.c(new yx7.h(fVarB2)), new iz7.a((xpi.g) jVar2.f148309q.get(), (iqi.h) jVar2.f148308p.get()), jVar2.d);
                        kli.a.p(vVar, bq.i.d(jVar2.f148299a));
                        return vVar;
                    default:
                        throw new AssertionError(i2);
                }
            case 3:
                h hVar14 = (h) obj3;
                l lVar2 = (l) obj2;
                switch (i2) {
                    case 0:
                        return kpi.f.a();
                    case 1:
                        Context contextI4 = bq.i.i(lVar2.f148319a);
                        BaseDelegatesActivity baseDelegatesActivityF5 = bq.i.f(lVar2.f148319a);
                        t70.g gVarO4 = hVar14.f148280b.o();
                        s.j(gVarO4);
                        return new npi.c(contextI4, baseDelegatesActivityF5, gVarO4);
                    case 2:
                        return new tpi.i((rpi.c) lVar2.f.get(), gsi.c.a(lVar2.f148319a));
                    case 3:
                        return new rpi.b(bq.i.b(lVar2.f148319a));
                    case 4:
                        return new rpi.h(bq.i.b(lVar2.f148319a));
                    case 5:
                        return new iri.g((iri.j) hVar14.f148284j.get(), (iri.m) hVar14.k.get(), bq.i.f(lVar2.f148319a), bq.i.l(lVar2.f148319a));
                    case 6:
                        return new iri.l((iri.m) hVar14.k.get(), bq.i.f(lVar2.f148319a), (iri.d) lVar2.f148324j.get());
                    case 7:
                        return new iri.d(bq.i.f(lVar2.f148319a));
                    case 8:
                        return new opi.b(bq.i.f(lVar2.f148319a));
                    case 9:
                        return new en.c(ImmutableSet.of((ln.d) lVar2.f148321c.f148285l.get()), bq.i.l(lVar2.f148319a));
                    case 10:
                        return new xpi.c(lVar2.f148320b, bq.i.b(lVar2.f148319a));
                    case 11:
                        hy7.i iVar2 = new hy7.i((xpi.g) lVar2.f148327n.get(), (f9b.f) lVar2.o.get(), (hy7.g) hVar14.f148286m.get(), (hy7.b) hVar14.f148287n.get(), new iy7.a());
                        kli.a.p(iVar2, bq.i.d(lVar2.f148319a));
                        return iVar2;
                    case 12:
                        return bq.i.t(lVar2.f148319a);
                    default:
                        throw new AssertionError(i2);
                }
            case 4:
                h1e.c cVar5 = (h1e.c) obj3;
                h1e.a aVar4 = (h1e.a) obj2;
                switch (i2) {
                    case 0:
                        ypi.h hVar15 = aVar4.f148493b;
                        fsi.g gVar7 = aVar4.f148492a;
                        return new ypi.e(hVar15, bq.i.b(gVar7), bq.i.o(gVar7), bq.i.g(gVar7));
                    case 1:
                        return new hqi.f(aVar4.f148494c, bq.i.b(aVar4.f148492a));
                    case 2:
                        return kpi.f.a();
                    case 3:
                        Context contextI5 = bq.i.i(aVar4.f148492a);
                        BaseDelegatesActivity baseDelegatesActivityF6 = bq.i.f(aVar4.f148492a);
                        t70.g gVarO5 = cVar5.f148523b.o();
                        s.j(gVarO5);
                        return new npi.c(contextI5, baseDelegatesActivityF6, gVarO5);
                    case 4:
                        return new tpi.i((rpi.c) aVar4.f148497j.get(), gsi.c.a(aVar4.f148492a));
                    case 5:
                        return new rpi.b(bq.i.b(aVar4.f148492a));
                    case 6:
                        return new rpi.h(bq.i.b(aVar4.f148492a));
                    case 7:
                        return new iri.g((iri.j) cVar5.f148534m.get(), (iri.m) cVar5.f148544t.get(), bq.i.f(aVar4.f148492a), bq.i.l(aVar4.f148492a));
                    case 8:
                        return new iri.l((iri.m) cVar5.f148544t.get(), bq.i.f(aVar4.f148492a), (iri.d) aVar4.f148500n.get());
                    case 9:
                        return new iri.d(bq.i.f(aVar4.f148492a));
                    case 10:
                        return new opi.b(bq.i.f(aVar4.f148492a));
                    case 11:
                        return new qi3.l(bq.i.l(aVar4.f148492a), (f9b.f) aVar4.f148502q.get(), (qi3.r) cVar5.f148541r0.get(), (com.revolut.feature.chooser.c) cVar5.f148543s0.get(), aVar4.d, (ypi.i) aVar4.f.get(), (hqi.l) aVar4.f148495g.get(), (opi.d) aVar4.f148501p.get(), (tpi.j) aVar4.k.get(), bq.i.o(aVar4.f148492a));
                    case 12:
                        return bq.i.t(aVar4.f148492a);
                    default:
                        throw new AssertionError(i2);
                }
            case 5:
                return a();
            case 6:
                h30.n nVar2 = (h30.n) obj3;
                h30.i iVar3 = (h30.i) obj2;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new AssertionError(i2);
                    }
                    g40.h redesignMapper = new g40.h(new z50.g());
                    Intrinsics.checkNotNullParameter(redesignMapper, "redesignMapper");
                    return redesignMapper;
                }
                AgentInfoContract$InputData agentInfoContract$InputData = iVar3.f148897a;
                jki.p pVar2 = (jki.p) iVar3.f148898b.get();
                n30.n nVarK = nVar2.k();
                nf3.a aVarC = nVar2.f148906b.c();
                s.j(aVarC);
                return new g40.l(agentInfoContract$InputData, pVar2, nVarK, aVarC);
            case 7:
                h30.o oVar2 = (h30.o) obj2;
                h30.n nVar3 = (h30.n) obj3;
                of3.f fVar4 = nVar3.f148906b;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new AssertionError(i2);
                    }
                    com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) oVar2.e.get();
                    d50.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(controller, "controller");
                    return new c90.c(controller.m2());
                }
                ChatFlowContract$InputData chatFlowContract$InputData = oVar2.f148935a;
                q30.a aVar5 = (q30.a) nVar3.m0.get();
                j30.c cVarF = fVar4.f();
                s.j(cVarF);
                nf3.a aVarC2 = fVar4.c();
                s.j(aVarC2);
                return new com.revolut.chat.ui.flow.e(chatFlowContract$InputData, aVar5, cVarF, aVarC2);
            case 8:
                return b();
            case 9:
                return c();
            case 10:
                h30.n nVar4 = (h30.n) obj3;
                h30.x xVar = (h30.x) obj2;
                switch (i2) {
                    case 0:
                        return p0.f((j60.a) xVar.f148980c.get());
                    case 1:
                        return w40.c.g((com.revolut.kompot.navigable.a) xVar.f148979b.get(), kxa.j.o(new nji.b()));
                    case 2:
                        mse.a extension = (mse.a) xVar.i.get();
                        w40.e.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension, "extension");
                        s.k(extension);
                        return extension;
                    case 3:
                        return w40.c.x((y9l.a) xVar.e.get(), (ep6.n) xVar.f148982h.get(), nVar4.f148927t.a());
                    case 4:
                        byc.k factory = ((vxc.b) nVar4.f148923r).a();
                        s.j(factory);
                        Intrinsics.checkNotNullParameter(factory, "factory");
                        return factory.a();
                    case 5:
                        return w40.c.m((i8d.f) xVar.f148981g.get(), (j60.a) xVar.f148980c.get(), (g1) xVar.f.get());
                    case 6:
                        zo6.a aVarA3 = nVar4.f148925s.a();
                        s.j(aVarA3);
                        return w40.c.n(aVarA3, (j60.a) xVar.f148980c.get(), (g1) xVar.f.get());
                    case 7:
                        com.revolut.kompot.navigable.a controller2 = (com.revolut.kompot.navigable.a) xVar.f148979b.get();
                        i40.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(controller2, "controller");
                        return x0.a(g1.Companion, controller2.D2());
                    case 8:
                        return w40.c.l((ep6.n) xVar.f148982h.get());
                    case 9:
                        n30.n nVarK2 = nVar4.k();
                        n30.x xVarB = nVar4.f148906b.b();
                        s.j(xVarB);
                        use.d dVarB = nVar4.f148927t.b();
                        s.j(dVarB);
                        return new h40.n(nVarK2, xVarB, dVarB, (mse.a) xVar.i.get(), (cli.n) xVar.f148984l.get());
                    case 10:
                        j30.c cVarF2 = nVar4.f148906b.f();
                        s.j(cVarF2);
                        return new h40.s(cVarF2, nVar4.A(), nVar4.f148927t.c());
                    default:
                        throw new AssertionError(i2);
                }
            case 11:
                return d();
            case 12:
                return e();
            case 13:
                return f();
            case 14:
                return g();
            case 15:
                return h();
            case 16:
                return i();
            case 17:
                return j();
            case 18:
                return k();
            case 19:
                return l();
            case 20:
                return m();
            case 21:
                return n();
            case 22:
                return o();
            case 23:
                return p();
            case 24:
                return q();
            case 25:
                return r();
            case 26:
                return s();
            case 27:
                return t();
            case 28:
                return u();
            default:
                hjg.d dVar7 = (hjg.d) obj3;
                hjg.a aVar6 = (hjg.a) obj2;
                switch (i2) {
                    case 0:
                        aVar6.getClass();
                        return new cn.d(ImmutableSet.copyOf((Collection) dn.b.a()), (cn.e) dVar7.i.get(), dVar7.a());
                    case 1:
                        um.c cVar6 = (um.c) dVar7.f152810j.get();
                        aVar6.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize9 = ImmutableSet.builderWithExpectedSize(5);
                        hjg.d dVar8 = aVar6.f152770c;
                        hn.h hVar16 = (hn.h) dVar8.k.get();
                        t70.g gVarO6 = dVar8.f152806b.o();
                        s.j(gVarO6);
                        builderBuilderWithExpectedSize9.add(new jn.a(hVar16, gVarO6));
                        builderBuilderWithExpectedSize9.add(new vm.b(com.google.android.gms.internal.mlkit_vision_face.a.f()));
                        builderBuilderWithExpectedSize9.add(dVar8.b());
                        builderBuilderWithExpectedSize9.addAll((Iterable) in.g.a());
                        builderBuilderWithExpectedSize9.add(new jn.d(e4m.b.a(aVar6.e)));
                        return new in.e(cVar6, builderBuilderWithExpectedSize9.build(), dVar7.a());
                    case 2:
                        return bq.i.t(aVar6.f152768a);
                    case 3:
                        aVar6.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize10 = ImmutableSet.builderWithExpectedSize(3);
                        builderBuilderWithExpectedSize10.addAll((Iterable) kn.g.a());
                        builderBuilderWithExpectedSize10.add(aVar6.f152771g.get());
                        builderBuilderWithExpectedSize10.add(new kn.h(e4m.b.a(aVar6.i)));
                        return new kn.e(builderBuilderWithExpectedSize10.build(), (ym.d) dVar7.f152812m.get(), dVar7.a());
                    case 4:
                        return new zm.a();
                    case 5:
                        return new tpi.i((rpi.c) aVar6.f152772h.get(), gsi.c.a(aVar6.f152768a));
                    case 6:
                        return new rpi.b(bq.i.b(aVar6.f152768a));
                    case 7:
                        aVar6.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize11 = ImmutableSet.builderWithExpectedSize(2);
                        builderBuilderWithExpectedSize11.addAll((Iterable) hn.g.a());
                        builderBuilderWithExpectedSize11.add(aVar6.f152770c.b());
                        return new hn.d(builderBuilderWithExpectedSize11.build(), (hn.h) dVar7.k.get(), (npi.f) aVar6.k.get());
                    case 8:
                        Context contextI6 = bq.i.i(aVar6.f152768a);
                        BaseDelegatesActivity baseDelegatesActivityF7 = bq.i.f(aVar6.f152768a);
                        t70.g gVarO7 = dVar7.f152806b.o();
                        s.j(gVarO7);
                        return new npi.c(contextI6, baseDelegatesActivityF7, gVarO7);
                    case 9:
                        return new en.c(ImmutableSet.of((ln.d) aVar6.f152770c.f152811l.get()), bq.i.l(aVar6.f152768a));
                    case 10:
                        return new gn.c((lpi.e) aVar6.f152776n.get(), (sm.e) dVar7.o.get(), ImmutableSet.copyOf((Collection) gn.e.a()), dVar7.a());
                    case 11:
                        return new lpi.b(bq.i.i(aVar6.f152768a), bq.i.j(aVar6.f152768a));
                    case 12:
                        aVar6.getClass();
                        return new in.e(ImmutableSet.copyOf((Collection) pm.b.a()), (om.c) dVar7.f152814p.get(), dVar7.a());
                    case 13:
                        return kpi.f.a();
                    case 14:
                        return new rpi.h(bq.i.b(aVar6.f152768a));
                    case 15:
                        return new iri.g((iri.j) dVar7.f152809h.get(), (iri.m) dVar7.f152815q.get(), bq.i.f(aVar6.f152768a), bq.i.l(aVar6.f152768a));
                    case 16:
                        return new iri.l((iri.m) dVar7.f152815q.get(), bq.i.f(aVar6.f152768a), (iri.d) aVar6.f152781t.get());
                    case 17:
                        return new iri.d(bq.i.f(aVar6.f152768a));
                    case 18:
                        return new opi.b(bq.i.f(aVar6.f152768a));
                    case 19:
                        aVar6.getClass();
                        return new xpi.c(xpi.f.f307976c, bq.i.b(aVar6.f152768a));
                    case 20:
                        return new k3l.d(bq.i.b(aVar6.f152768a));
                    case 21:
                        gjg.a aVar7 = (gjg.a) dVar7.f152816r.get();
                        gjg.b bVar5 = (gjg.b) dVar7.f152817s.get();
                        pjg.b bVar6 = (pjg.b) aVar6.f152784y.get();
                        tpi.j jVar3 = (tpi.j) aVar6.i.get();
                        f9b.f fVar5 = (f9b.f) aVar6.e.get();
                        opi.d dVar9 = (opi.d) aVar6.v.get();
                        k3l.b bVar7 = (k3l.b) aVar6.f152783x.get();
                        xpi.g gVar8 = (xpi.g) aVar6.f152782w.get();
                        TrustedMerchantDetailsContract$Configuration trustedMerchantDetailsContract$Configuration = aVar6.f152769b;
                        xig.b bVar8 = (xig.b) dVar7.f152807c.o.get();
                        s.j(bVar8);
                        return new pjg.p(aVar7, bVar5, bVar6, jVar3, fVar5, dVar9, bVar7, gVar8, trustedMerchantDetailsContract$Configuration, bVar8);
                    case 22:
                        thf.c cVarC = dVar7.e.c();
                        s.j(cVarC);
                        return new pjg.g(cVarC);
                    default:
                        throw new AssertionError(i2);
                }
        }
    }
}
