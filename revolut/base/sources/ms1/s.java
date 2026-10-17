package ms1;

import aa0.y;
import ad0.w;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.camera.view.PreviewView;
import androidx.lifecycle.LifecycleOwner;
import androidx.view.ComponentActivity;
import androidx.view.result.ActivityResultRegistry;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.revolut.camerakit.client.api.models.CameraCaptureSettings;
import com.revolut.camerakit.client.api.models.CameraKitClientSettings;
import com.revolut.camerakit.client.api.models.CameraKitUiSettings;
import com.revolut.camerakit.revolut.ui.flow.CameraKitFlowContract$FlowType;
import com.revolut.camerakit.ui.views.view.CameraKitPreviewView;
import com.revolut.core.mobile_services.api.mlkit.vision.barcode.MsBarcodeDetectorSettings;
import com.revolut.feature.apm.bizum.api.navigation.BizumTransferInputData;
import com.revolut.feature.apm.payto.impl.screen.pay_to_confirmation_screen.PayToConfirmationScreenContract$InputData;
import com.revolut.feature.apm.wero.impl.ui.home.WeroHomeFlowContract$InputData;
import com.revolut.feature.apm.wero.impl.ui.pay.WeroPayFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.backendflow.CreditBackendFlowContract$Configuration;
import com.revolut.feature.cryptocommodity_invest.impl.ui.collections_v2.collection_details.CryptoCollectionDetailsController;
import com.revolut.feature.cryptocommodity_invest.impl.ui.collections_v2.collection_details.CryptoCollectionDetailsControllerContract$InputData;
import com.revolut.feature.insurance.impl.ui.cfac.my_claims.claim_details.CFACClaimDetailsScreenContract$InputData;
import com.revolut.feature.insurance.impl.ui.cfac.my_claims.claims_list.CFACClaimsListScreenContract$InputData;
import com.revolut.feature.rating.shared.api.RatingSharedApi$Toggles$AppRatingRedesignFeatureToggle;
import com.revolut.feature.rev10_main_screen.impl.ui.MainContainerFlowContract$InputData;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.SharedCreateAlertScreenContract$InputData;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.select_type.SelectAlertTypeControllerContract$InputData;
import com.revolut.feature.shared_separate_favourites.common.screen.add_asset.SharedFavouritesAddAssetScreenContract$InputData;
import com.revolut.feature.shared_separate_favourites.common.screen.counterpart_chooser.SharedFavouritesCounterpartChooserScreenContract$InputData;
import com.revolut.feature.shared_separate_favourites.common.screen.init.SharedFavouritesInitScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import dw3.c1;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import pb2.z;
import qc0.i1;
import rp0.g1;
import rp0.k1;
import rp0.l0;
import rp0.p0;
import rp0.x0;
import sbb.a0;
import sbb.d0;
import vkm.j2;
import wli.x;
import yc0.c0;
import yc0.f0;
import yed.o0;
import yed.r0;
import z0h.q1;
import zhm.z0;

/* JADX INFO: loaded from: classes20.dex */
public final class s implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f208585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f208586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f208587c;
    public final Object d;

    public /* synthetic */ s(Object obj2, Object obj3, int i, int i2) {
        this.f208585a = i2;
        this.f208587c = obj2;
        this.d = obj3;
        this.f208586b = i;
    }

    private final Object a() {
        n9b.b bVar = (n9b.b) this.d;
        n9b.c cVar = (n9b.c) this.f208587c;
        xmg.a aVar = cVar.d;
        int i = this.f208586b;
        if (i != 0) {
            if (i == 1) {
                n8b.a aVarA = cVar.f213622a.a();
                vc.s.j(aVarA);
                return new s9b.r(aVarA);
            }
            if (i != 2) {
                throw new AssertionError(i);
            }
            com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) bVar.f213621c.get();
            q9b.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(controller, "controller");
            return x0.a(g1.Companion, controller.D2());
        }
        cli.n nVar = (cli.n) bVar.f213620b.get();
        r10.q qVarD = aVar.d();
        ang.f fVarE = aVar.e();
        g1 g1Var = (g1) bVar.d.get();
        p9b.e eVar = new p9b.e();
        ogm.i iVar = new ogm.i(cVar.a());
        u79.a aVar2 = (u79.a) ((s79.b) ((t8l.a) cVar.e).f268903a).f260594g.get();
        vc.s.j(aVar2);
        x xVarD = ((s41.a) cVar.f).d();
        n9b.c cVar2 = bVar.f213619a;
        sf0.h hVarB = cVar2.f213625g.b();
        vc.s.j(hVarB);
        v60.e eVarA = cVar2.f213626h.a();
        vc.s.j(eVarA);
        return new s9b.p(nVar, qVarD, fVarE, g1Var, eVar, iVar, aVar2, xVarD, new e1l.a(hVarB, eVarA, 5));
    }

    private final Object b() {
        na4.e eVar = (na4.e) this.f208587c;
        na4.b bVar = (na4.b) this.d;
        int i = this.f208586b;
        switch (i) {
            case 0:
                ypi.h hVar = bVar.f213713b;
                fsi.g gVar = bVar.f213712a;
                return new ypi.e(hVar, bq.i.b(gVar), bq.i.o(gVar), bq.i.g(gVar));
            case 1:
                return new hqi.f(bVar.f213714c, bq.i.b(bVar.f213712a));
            case 2:
                return kpi.f.a();
            case 3:
                Context contextI = bq.i.i(bVar.f213712a);
                BaseDelegatesActivity baseDelegatesActivityF = bq.i.f(bVar.f213712a);
                t70.g gVarO = eVar.f213750b.o();
                vc.s.j(gVarO);
                return new npi.c(contextI, baseDelegatesActivityF, gVarO);
            case 4:
                return new tpi.i((rpi.c) bVar.f213717j.get(), gsi.c.a(bVar.f213712a));
            case 5:
                return new rpi.b(bq.i.b(bVar.f213712a));
            case 6:
                return new rpi.h(bq.i.b(bVar.f213712a));
            case 7:
                return new iri.g((iri.j) eVar.f213765p.get(), (iri.m) eVar.f213774w.get(), bq.i.f(bVar.f213712a), bq.i.l(bVar.f213712a));
            case 8:
                return new iri.l((iri.m) eVar.f213774w.get(), bq.i.f(bVar.f213712a), (iri.d) bVar.f213720n.get());
            case 9:
                return new iri.d(bq.i.f(bVar.f213712a));
            case 10:
                return new opi.b(bq.i.f(bVar.f213712a));
            case 11:
                return new qi3.l(bq.i.l(bVar.f213712a), (f9b.f) bVar.f213722q.get(), (qi3.r) eVar.f213775w0.get(), (com.revolut.feature.chooser.c) eVar.f213777x0.get(), bVar.d, (ypi.i) bVar.f.get(), (hqi.l) bVar.f213715g.get(), (opi.d) bVar.f213721p.get(), (tpi.j) bVar.k.get(), bq.i.o(bVar.f213712a));
            case 12:
                return bq.i.t(bVar.f213712a);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object c() {
        na4.e eVar = (na4.e) this.f208587c;
        na4.d dVar = (na4.d) this.d;
        int i = this.f208586b;
        switch (i) {
            case 0:
                dVar.getClass();
                return new cn.d(ImmutableSet.copyOf((Collection) dn.b.a()), (cn.e) eVar.f213766q.get(), eVar.k());
            case 1:
                um.c cVar = (um.c) eVar.f213767r.get();
                dVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(6);
                na4.e eVar2 = dVar.f213734g;
                hn.h hVar = (hn.h) eVar2.f213769s.get();
                t70.g gVarO = eVar2.f213750b.o();
                vc.s.j(gVarO);
                builderBuilderWithExpectedSize.add(new jn.a(hVar, gVarO));
                builderBuilderWithExpectedSize.add(new vm.b(com.google.android.gms.internal.mlkit_vision_face.a.f()));
                builderBuilderWithExpectedSize.add(eVar2.l());
                builderBuilderWithExpectedSize.add(new xc0.a((qc0.j) eVar2.f213751b0.get(), (qc0.h) eVar2.Y.get()));
                builderBuilderWithExpectedSize.addAll((Iterable) in.g.a());
                builderBuilderWithExpectedSize.add(new jn.d(e4m.b.a(dVar.i)));
                return new in.e(cVar, builderBuilderWithExpectedSize.build(), eVar.k());
            case 2:
                return bq.i.t(dVar.f213729a);
            case 3:
                dVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize2 = ImmutableSet.builderWithExpectedSize(3);
                builderBuilderWithExpectedSize2.addAll((Iterable) kn.g.a());
                builderBuilderWithExpectedSize2.add(dVar.k.get());
                builderBuilderWithExpectedSize2.add(new kn.h(e4m.b.a(dVar.f213738m)));
                return new kn.e(builderBuilderWithExpectedSize2.build(), (ym.d) eVar.S.get(), eVar.k());
            case 4:
                return new zm.a();
            case 5:
                return new tpi.i((rpi.c) dVar.f213737l.get(), gsi.c.a(dVar.f213729a));
            case 6:
                return new rpi.b(bq.i.b(dVar.f213729a));
            case 7:
                dVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize3 = ImmutableSet.builderWithExpectedSize(2);
                builderBuilderWithExpectedSize3.addAll((Iterable) hn.g.a());
                builderBuilderWithExpectedSize3.add(dVar.f213734g.l());
                return new hn.d(builderBuilderWithExpectedSize3.build(), (hn.h) eVar.f213769s.get(), (npi.f) dVar.o.get());
            case 8:
                Context contextI = bq.i.i(dVar.f213729a);
                BaseDelegatesActivity baseDelegatesActivityF = bq.i.f(dVar.f213729a);
                t70.g gVarO2 = eVar.f213750b.o();
                vc.s.j(gVarO2);
                return new npi.c(contextI, baseDelegatesActivityF, gVarO2);
            case 9:
                na4.e eVar3 = dVar.f213734g;
                return new en.c(ImmutableSet.of((ln.d) eVar3.f213759k0.get(), (ln.d) eVar3.f213771t.get()), bq.i.l(dVar.f213729a));
            case 10:
                return new gn.c((lpi.e) dVar.f213742r.get(), (sm.e) eVar.l0.get(), ImmutableSet.copyOf((Collection) gn.e.a()), eVar.k());
            case 11:
                return new lpi.b(bq.i.i(dVar.f213729a), bq.i.j(dVar.f213729a));
            case 12:
                dVar.getClass();
                return new in.e(ImmutableSet.copyOf((Collection) pm.b.a()), (om.c) eVar.m0.get(), eVar.k());
            case 13:
                dVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize4 = ImmutableSet.builderWithExpectedSize(2);
                builderBuilderWithExpectedSize4.addAll((Iterable) g3l.f.a());
                na4.e eVar4 = dVar.f213734g;
                builderBuilderWithExpectedSize4.add(new wc0.a((qc0.k) eVar4.u.get(), ((s41.a) eVar4.i).d(), (ln.a) eVar4.f213771t.get(), (qc0.j) eVar4.f213751b0.get(), qw7.u.i(eVar4.f), eVar4.h()));
                return new g3l.c(builderBuilderWithExpectedSize4.build(), (g3l.g) eVar.f213763n0.get(), (k3l.b) dVar.u.get(), eVar.k());
            case 14:
                return new k3l.d(bq.i.b(dVar.f213729a));
            case 15:
                ypi.h hVar2 = dVar.f213731b;
                fsi.g gVar = dVar.f213729a;
                return new ypi.e(hVar2, bq.i.b(gVar), bq.i.o(gVar), bq.i.g(gVar));
            case 16:
                return new hqi.f(dVar.f213733c, bq.i.b(dVar.f213729a));
            case 17:
                return new rpi.h(bq.i.b(dVar.f213729a));
            case 18:
                return new iri.g((iri.j) eVar.f213765p.get(), (iri.m) eVar.u.get(), bq.i.f(dVar.f213729a), bq.i.l(dVar.f213729a));
            case 19:
                return new iri.l((iri.m) eVar.u.get(), bq.i.f(dVar.f213729a), (iri.d) dVar.A.get());
            case 20:
                return new iri.d(bq.i.f(dVar.f213729a));
            case 21:
                return new an.q((cqi.h) dVar.C.get(), (an.a) eVar.f213764o0.get(), ImmutableSet.copyOf((Collection) bn.b.a()), eVar.k());
            case 22:
                return new cqi.j(bq.i.f(dVar.f213729a));
            case 23:
                return new xpi.c(dVar.d, bq.i.b(dVar.f213729a));
            case 24:
                return new com.revolut.retail.toast.mediator.a((d4l.a) eVar.p0.get(), (c4l.b) dVar.F.get());
            case 25:
                return new c4l.e(bq.i.i(dVar.f213729a), bq.i.g(dVar.f213729a));
            case 26:
                return new f5l.c((f5l.a) eVar.q0.get(), bq.i.b(dVar.f213729a));
            case 27:
                Activity activityB = bq.i.b(dVar.f213729a);
                y80.b bVar = new y80.b();
                g60.a aVar = (g60.a) dVar.I.get();
                fsi.g gVar2 = dVar.f213729a;
                Activity activityB2 = bq.i.b(gVar2);
                t80.g gVar3 = (t80.g) dVar.J.get();
                BaseDelegatesActivity baseDelegatesActivityF2 = bq.i.f(gVar2);
                d4m.a aVarA = e4m.b.a(dVar.K);
                nli.a aVarG = dVar.g();
                t80.g gVar4 = (t80.g) dVar.J.get();
                l70.e eVar5 = dVar.f213734g.f213750b;
                zk0.b bVarL = eVar5.l();
                vc.s.j(bVarL);
                oli.c cVar2 = new oli.c(gVar4, bVarL, dVar.g(), (g60.a) dVar.I.get(), dVar.h());
                ComponentActivity componentActivityA = gmf.b.a(gVar2);
                ActivityResultRegistry activityResultRegistryA = pli.b.a(gmf.b.a(gVar2));
                ami.n nVar = new ami.n(e4m.b.a(dVar.L), 1);
                d4m.a aVarA2 = e4m.b.a(dVar.K);
                t80.g gVar5 = (t80.g) dVar.J.get();
                nli.a aVarG2 = dVar.g();
                i90.b bVar2 = new i90.b();
                z70.a aVarF = eVar5.f();
                vc.s.j(aVarF);
                c70.b bVar3 = new c70.b(aVarF, 2);
                z70.a aVarF2 = eVar5.f();
                vc.s.j(aVarF2);
                return new upi.b(activityB, bVar, new t80.v(aVar, activityB2, gVar3, baseDelegatesActivityF2, aVarA, aVarG, cVar2, new oli.g(componentActivityA, activityResultRegistryA, nVar, aVarA2, gVar5, aVarG2, bVar2, new u96.b(bVar3, new smd.s(aVarF2)), dVar.h()), dVar.h()));
            case 28:
                return new g60.a(bq.i.b(dVar.f213729a));
            case 29:
                l70.e eVar6 = eVar.f213750b;
                l70.e eVar7 = eVar.f213750b;
                f80.a aVarX = eVar6.x();
                vc.s.j(aVarX);
                l80.e eVarH = eVar7.h();
                vc.s.j(eVarH);
                zk0.b bVarL2 = eVar7.l();
                vc.s.j(bVarL2);
                return new t80.b(aVarX, eVarH, bVarL2);
            case 30:
                return pli.c.a(new ks0.n(bq.i.f(dVar.f213729a)));
            case 31:
                return t96.a.a();
            case 32:
                return new aqi.d(bq.i.b(dVar.f213729a), new y80.b());
            case 33:
                return kpi.f.a();
            case 34:
                return new opi.b(bq.i.f(dVar.f213729a));
            case 35:
                return new iqi.b(dVar.e, bq.i.b(dVar.f213729a));
            case 36:
                fsi.g gVar6 = dVar.f213729a;
                fsi.g gVar7 = dVar.f213729a;
                c90.c cVarH = gmf.b.h(gVar6);
                CreditBackendFlowContract$Configuration creditBackendFlowContract$Configuration = dVar.f;
                kpi.c cVar3 = (kpi.c) dVar.O.get();
                rz3.c cVarG = ((c1) eVar.f213752c).g();
                vc.s.j(cVarG);
                sri.m mVarL = bq.i.l(gVar7);
                qc0.h hVar3 = (qc0.h) eVar.Y.get();
                qc0.j jVar = (qc0.j) eVar.f213751b0.get();
                qc0.k kVar = (qc0.k) eVar.u.get();
                ypi.i iVar = (ypi.i) dVar.f213745w.get();
                f9b.f fVar = (f9b.f) dVar.i.get();
                tpi.j jVar2 = (tpi.j) dVar.f213738m.get();
                hqi.l lVar = (hqi.l) dVar.f213746x.get();
                npi.a aVar2 = (npi.a) dVar.o.get();
                pri.f fVarD = bq.i.d(gVar7);
                k3l.b bVar4 = (k3l.b) dVar.u.get();
                xpi.g gVar8 = (xpi.g) dVar.E.get();
                rpi.c cVar4 = (rpi.c) dVar.f213737l.get();
                qc0.h hVar4 = (qc0.h) dVar.f213734g.Y.get();
                wpg.v.b(hVar4);
                ImmutableSet immutableSetOf = ImmutableSet.of(hVar4);
                mm.d dVar2 = (mm.d) eVar.Z.get();
                opi.d dVar3 = (opi.d) dVar.P.get();
                qd0.b bVarN = eVar.f213750b.n();
                vc.s.j(bVarN);
                return new p54.j(cVarH, creditBackendFlowContract$Configuration, cVar3, cVarG, mVarL, hVar3, jVar, kVar, iVar, fVar, jVar2, lVar, aVar2, fVarD, bVar4, gVar8, cVar4, immutableSetOf, dVar2, dVar3, bVarN);
            case 37:
                xpi.g gVar9 = (xpi.g) dVar.E.get();
                e4m.e eVar8 = eVar.Y;
                y90.e eVar9 = eVar.f213761m;
                zc0.g gVar10 = (zc0.g) eVar8.get();
                qc0.j jVar3 = (qc0.j) eVar.f213751b0.get();
                ypi.i iVar2 = (ypi.i) dVar.f213745w.get();
                na4.e eVar10 = dVar.f213734g;
                w80.b bVarJ = eVar10.f213750b.j();
                vc.s.j(bVarJ);
                t70.g gVarO3 = eVar10.f213750b.o();
                vc.s.j(gVarO3);
                zc0.c cVar5 = new zc0.c(bVarJ, gVarO3, (p80.a) dVar.S.get(), (y) eVar10.E.get(), dVar.f(), new yc0.j(new yc0.q(dVar.e()), dVar.e(), (yc0.g) eVar10.f213770s0.get(), (ad0.a) eVar10.R.get(), (ad0.p) dVar.X.get(), new yc0.p()), new yc0.o((yc0.g) eVar10.f213770s0.get()), (ad0.p) dVar.X.get(), (ad0.c) dVar.U.get(), new ad0.t(dVar.e(), new yc0.p()), new ad0.s(dVar.e(), new yc0.p()), new ad0.g(dVar.e()), new ad0.v(new yc0.q(dVar.e())), new ad0.o(), new yc0.q(dVar.e()), new yc0.p(), (yc0.y) eVar10.f213772t0.get(), (bd0.a) eVar10.u0.get(), (yc0.v) eVar10.f213773v0.get(), (c0) dVar.Y.get());
                npi.a aVar3 = (npi.a) dVar.o.get();
                k3l.b bVar5 = (k3l.b) dVar.u.get();
                rpi.c cVar6 = (rpi.c) dVar.f213737l.get();
                zd7.b bVar6 = (zd7.b) dVar.f213730a0.get();
                tpi.j jVar4 = (tpi.j) dVar.f213738m.get();
                opi.d dVar4 = (opi.d) dVar.P.get();
                cqi.h hVar5 = (cqi.h) dVar.C.get();
                i1 i1VarB = eVar9.b();
                vc.s.j(i1VarB);
                oc0.f fVarC = eVar9.c();
                vc.s.j(fVarC);
                fc0.f fVarD2 = eVar9.d();
                vc.s.j(fVarD2);
                oc0.m mVarE = eVar9.e();
                vc.s.j(mVarE);
                t9l.g gVarA = eVar.f213760l.a();
                vc.s.j(gVarA);
                oc0.k kVarA = eVar9.a();
                vc.s.j(kVarA);
                return new ma4.c(hVar5, eVar9.f(), fVarD2, bVar5, aVar3, fVarC, kVarA, mVarE, dVar4, jVar3, i1VarB, cVar6, gVarA, jVar4, gVar9, iVar2, cVar5, gVar10, bVar6);
            case 38:
                Context context = bq.i.i(dVar.f213729a);
                na4.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                return new p80.a(context);
            case 39:
                x90.c cVar7 = eVar.d;
                yc0.q qVar = new yc0.q(dVar.e());
                yc0.r rVar = (yc0.r) dVar.T.get();
                ad0.c cVar8 = (ad0.c) dVar.U.get();
                w wVarG = eVar.f213761m.g();
                vc.s.j(wVarG);
                f0 f0Var = (f0) dVar.V.get();
                ad0.h hVar6 = (ad0.h) dVar.W.get();
                ad0.n nVarF = dVar.f();
                u9l.a aVarB = eVar.f213760l.b();
                vc.s.j(aVarB);
                return wpg.v.o(cVar7, qVar, rVar, cVar8, wVarG, f0Var, hVar6, nVarF, aVarB);
            case 40:
                return wpg.v.n(eVar.d, dVar.e(), new yc0.p());
            case 41:
                x90.c cVar9 = eVar.d;
                return new ad0.d();
            case 42:
                x90.c cVar10 = eVar.d;
                hbl.d dVarC = eVar.f213760l.c();
                vc.s.j(dVarC);
                return wpg.v.y(cVar10, dVarC);
            case 43:
                return wpg.v.a(eVar.d, dVar.f());
            case 44:
                return wpg.v.w(eVar.d, (yc0.r) dVar.T.get(), new yc0.p());
            case 45:
                return new ae7.i((upi.f) dVar.M.get(), (t80.c) eVar.f213768r0.get(), (d4l.a) eVar.p0.get(), (aqi.a) dVar.Z.get(), new ae7.j(), bq.i.l(dVar.f213729a));
            case 46:
                return aqi.f.a(dVar.f213729a, (aqi.d) dVar.N.get());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object d() {
        na4.e eVar = (na4.e) this.f208587c;
        na4.g gVar = (na4.g) this.d;
        int i = this.f208586b;
        switch (i) {
            case 0:
                return new k3l.d(bq.i.b(gVar.f213779a));
            case 1:
                gVar.getClass();
                return new cn.d(ImmutableSet.copyOf((Collection) dn.b.a()), (cn.e) eVar.f213766q.get(), eVar.k());
            case 2:
                um.c cVar = (um.c) eVar.f213767r.get();
                gVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(6);
                na4.e eVar2 = gVar.f213780b;
                hn.h hVar = (hn.h) eVar2.f213769s.get();
                t70.g gVarO = eVar2.f213750b.o();
                vc.s.j(gVarO);
                builderBuilderWithExpectedSize.add(new jn.a(hVar, gVarO));
                builderBuilderWithExpectedSize.add(new vm.b(com.google.android.gms.internal.mlkit_vision_face.a.f()));
                builderBuilderWithExpectedSize.add(eVar2.l());
                builderBuilderWithExpectedSize.add(new xc0.a((qc0.j) eVar2.f213751b0.get(), (qc0.h) eVar2.Y.get()));
                builderBuilderWithExpectedSize.addAll((Iterable) in.g.a());
                builderBuilderWithExpectedSize.add(new jn.d(e4m.b.a(gVar.e)));
                return new in.e(cVar, builderBuilderWithExpectedSize.build(), eVar.k());
            case 3:
                return bq.i.t(gVar.f213779a);
            case 4:
                gVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize2 = ImmutableSet.builderWithExpectedSize(3);
                builderBuilderWithExpectedSize2.addAll((Iterable) kn.g.a());
                builderBuilderWithExpectedSize2.add(gVar.f213782g.get());
                builderBuilderWithExpectedSize2.add(new kn.h(e4m.b.a(gVar.i)));
                return new kn.e(builderBuilderWithExpectedSize2.build(), (ym.d) eVar.S.get(), eVar.k());
            case 5:
                return new zm.a();
            case 6:
                return new tpi.i((rpi.c) gVar.f213783h.get(), gsi.c.a(gVar.f213779a));
            case 7:
                return new rpi.b(bq.i.b(gVar.f213779a));
            case 8:
                gVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize3 = ImmutableSet.builderWithExpectedSize(2);
                builderBuilderWithExpectedSize3.addAll((Iterable) hn.g.a());
                builderBuilderWithExpectedSize3.add(gVar.f213780b.l());
                return new hn.d(builderBuilderWithExpectedSize3.build(), (hn.h) eVar.f213769s.get(), (npi.f) gVar.k.get());
            case 9:
                Context contextI = bq.i.i(gVar.f213779a);
                BaseDelegatesActivity baseDelegatesActivityF = bq.i.f(gVar.f213779a);
                t70.g gVarO2 = eVar.f213750b.o();
                vc.s.j(gVarO2);
                return new npi.c(contextI, baseDelegatesActivityF, gVarO2);
            case 10:
                na4.e eVar3 = gVar.f213780b;
                return new en.c(ImmutableSet.of((ln.d) eVar3.f213759k0.get(), (ln.d) eVar3.f213771t.get()), bq.i.l(gVar.f213779a));
            case 11:
                return new gn.c((lpi.e) gVar.f213787n.get(), (sm.e) eVar.l0.get(), ImmutableSet.copyOf((Collection) gn.e.a()), eVar.k());
            case 12:
                return new lpi.b(bq.i.i(gVar.f213779a), bq.i.j(gVar.f213779a));
            case 13:
                gVar.getClass();
                return new in.e(ImmutableSet.copyOf((Collection) pm.b.a()), (om.c) eVar.m0.get(), eVar.k());
            case 14:
                return kpi.f.a();
            case 15:
                return new rpi.h(bq.i.b(gVar.f213779a));
            case 16:
                return new iri.g((iri.j) eVar.f213765p.get(), (iri.m) eVar.f0.get(), bq.i.f(gVar.f213779a), bq.i.l(gVar.f213779a));
            case 17:
                return new iri.l((iri.m) eVar.f0.get(), bq.i.f(gVar.f213779a), (iri.d) gVar.f213792t.get());
            case 18:
                return new iri.d(bq.i.f(gVar.f213779a));
            case 19:
                return new opi.b(bq.i.f(gVar.f213779a));
            case 20:
                return new h3l.l((h3l.h) eVar.y0.get(), (k3l.b) gVar.f213781c.get(), bq.i.e(gVar.f213779a), (mm.d) eVar.Z.get());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object e() {
        nb2.c cVar = (nb2.c) this.d;
        nb2.b bVar = (nb2.b) this.f208587c;
        int i = this.f208586b;
        if (i != 0) {
            if (i == 1) {
                return new z(new pb2.c(), bVar.b());
            }
            throw new AssertionError(i);
        }
        PayToConfirmationScreenContract$InputData payToConfirmationScreenContract$InputData = cVar.f213967a;
        oz1.j jVarG = ((lz1.m) bVar.f213961c).g();
        wsg.n nVarB = bVar.e.b();
        b3a.a aVarA = bVar.f.a();
        vc.s.j(aVarA);
        sf0.h hVarB = bVar.f213962g.b();
        vc.s.j(hVarB);
        return new com.revolut.feature.apm.payto.impl.screen.pay_to_confirmation_screen.b(payToConfirmationScreenContract$InputData, jVarG, nVarB, aVarA, hVarB, new ob2.i(), (cli.n) cVar.f213968b.get());
    }

    private final Object f() {
        nb2.e eVar = (nb2.e) this.d;
        nb2.b bVar = eVar.f213973a;
        nb2.b bVar2 = (nb2.b) this.f208587c;
        int i = this.f208586b;
        if (i != 0) {
            if (i != 1) {
                throw new AssertionError(i);
            }
            wb2.b.Companion.getClass();
            return new zzl.c();
        }
        rve.i iVar = (rve.i) bVar2.i.f230121b0.get();
        vc.s.j(iVar);
        zzl.b bVar3 = (zzl.b) eVar.f213974b.get();
        z80.b bVarS = bVar.d.s();
        vc.s.j(bVarS);
        xb2.b bVar4 = new xb2.b(bVarS, bVar3);
        wj0.a aVarI = ((nj0.d) bVar2.f213964j).i();
        vc.s.j(aVarI);
        ob2.i iVar2 = new ob2.i();
        zzl.b bVar5 = (zzl.b) eVar.f213974b.get();
        z80.b bVarS2 = bVar.d.s();
        vc.s.j(bVarS2);
        return new vb2.s(iVar, bVar4, aVarI, iVar2, new vb2.q(new xb2.b(bVarS2, bVar5)));
    }

    private final Object g() {
        fgd.b bVar = (fgd.b) this.d;
        int i = this.f208586b;
        if (i == 0) {
            return kxa.j.l((j60.a) bVar.e.get());
        }
        if (i == 1) {
            return h30.l.p((com.revolut.kompot.navigable.a) bVar.f135036c.get(), (rp0.m) bVar.d.get());
        }
        if (i == 2) {
            return new rp0.m();
        }
        if (i == 3) {
            return new bgd.h(bVar.f135035b, (jki.p) bVar.f135037g.get(), (ghd.c) bVar.f135038h.get(), (j60.a) bVar.e.get());
        }
        if (i == 4) {
            return new bgd.i();
        }
        if (i != 5) {
            throw new AssertionError(i);
        }
        ifd.h hVarB = ((ned.e) this.f208587c).f214447h.b();
        vc.s.j(hVarB);
        return new ghd.d(hVarB);
    }

    private final Object h() {
        ned.e eVar = (ned.e) this.f208587c;
        int i = this.f208586b;
        if (i == 0) {
            ned.c cVar = (ned.c) this.d;
            return new com.revolut.feature.shared_separate_favourites.alerts.ui.flow.add_alert.a(cVar.f214437a, (ued.d) cVar.d.get());
        }
        if (i != 1) {
            throw new AssertionError(i);
        }
        ee0.a aVar = eVar.f214443a;
        je0.d dVarD = aVar.d();
        vc.s.j(dVarD);
        xe0.f fVarF = aVar.f();
        vc.s.j(fVarF);
        ve0.c cVarB = l70.h.B(dVarD, fVarF);
        l80.e eVarH = eVar.f214444b.h();
        vc.s.j(eVarH);
        b90.a aVarA = eVar.f214445c.a();
        vc.s.j(aVarA);
        return new ued.d(cVarB, eVarH, aVarA);
    }

    private final Object i() {
        ned.k kVar = (ned.k) this.d;
        SharedFavouritesCounterpartChooserScreenContract$InputData sharedFavouritesCounterpartChooserScreenContract$InputData = kVar.f214472a;
        int i = this.f208586b;
        if (i == 0) {
            n60.a aVar = (n60.a) kVar.f214474c.get();
            o5k.i.k(aVar);
            return aVar;
        }
        if (i == 1) {
            return o5k.i.p((com.revolut.kompot.navigable.a) kVar.f214473b.get());
        }
        if (i != 2) {
            if (i == 3) {
                return new cgd.q(sharedFavouritesCounterpartChooserScreenContract$InputData);
            }
            throw new AssertionError(i);
        }
        ifd.e eVar = (ifd.e) ((ned.e) this.f208587c).e.f310628h.get();
        vc.s.j(eVar);
        return new cgd.c(sharedFavouritesCounterpartChooserScreenContract$InputData, eVar, (n60.a) kVar.f214474c.get(), (jki.p) kVar.e.get());
    }

    private final Object j() {
        ned.l lVar = (ned.l) this.d;
        ned.e eVar = (ned.e) this.f208587c;
        y2d.b bVar = eVar.e;
        k2d.e eVar2 = eVar.f214446g;
        u8h.c cVar = eVar.f;
        int i = this.f208586b;
        if (i == 0) {
            return a10.b.f((u8h.b) cVar, "factory");
        }
        if (i == 1) {
            jki.p pVar = (jki.p) lVar.f.get();
            SharedCreateAlertScreenContract$InputData sharedCreateAlertScreenContract$InputData = lVar.f214476b;
            efd.a aVarA = eVar2.a();
            vc.s.j(aVarA);
            z2d.c cVar2 = (z2d.c) bVar.f310627g.get();
            vc.s.j(cVar2);
            i90.b bVar2 = new i90.b();
            ifd.e eVar3 = (ifd.e) bVar.f310628h.get();
            vc.s.j(eVar3);
            o0 o0Var = new o0();
            aah.h hVar = (aah.h) lVar.d.get();
            u80.t tVarU = eVar.f214444b.u();
            vc.s.j(tVarU);
            return new com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.b(pVar, sharedCreateAlertScreenContract$InputData, aVarA, cVar2, bVar2, eVar3, o0Var, hVar, tVarU, (g1) lVar.f214479h.get(), (ped.a) lVar.i.get());
        }
        if (i == 2) {
            ffd.a aVarB = eVar2.b();
            vc.s.j(aVarB);
            return new r0(aVarB, new afd.a((q1) lVar.e.get()));
        }
        if (i == 3) {
            return a10.b.g((u8h.b) cVar, "factory");
        }
        if (i != 4) {
            if (i == 5) {
                return new ped.b();
            }
            throw new AssertionError(i);
        }
        com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) lVar.f214478g.get();
        zed.a.Companion.getClass();
        Intrinsics.checkNotNullParameter(controller, "controller");
        x0 x0Var = g1.Companion;
        View decorView = controller.m2().getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        return x0.a(x0Var, decorView);
    }

    private final Object k() {
        ned.e eVar = (ned.e) this.f208587c;
        y2d.b bVar = eVar.e;
        fgd.i iVar = (fgd.i) this.d;
        SharedFavouritesAddAssetScreenContract$InputData sharedFavouritesAddAssetScreenContract$InputData = iVar.f135058b;
        int i = this.f208586b;
        if (i != 0) {
            if (i != 1) {
                throw new AssertionError(i);
            }
            ifd.d dVar = (ifd.d) bVar.i.get();
            vc.s.j(dVar);
            return new com.revolut.feature.shared_separate_favourites.common.screen.add_asset.b(sharedFavouritesAddAssetScreenContract$InputData, dVar);
        }
        m3d.d dVar2 = (m3d.d) eVar.d.d.get();
        vc.s.j(dVar2);
        n3d.c cVarA = bVar.a();
        vc.s.j(cVarA);
        return new yfd.w(sharedFavouritesAddAssetScreenContract$InputData, dVar2, cVarA, (jki.p) iVar.f135059c.get());
    }

    private final Object l() {
        ned.e eVar = (ned.e) this.f208587c;
        ned.m mVar = (ned.m) this.d;
        int i = this.f208586b;
        if (i != 0) {
            if (i == 1) {
                return new dgd.e();
            }
            throw new AssertionError(i);
        }
        SharedFavouritesInitScreenContract$InputData sharedFavouritesInitScreenContract$InputData = mVar.f214481a;
        z2d.c cVar = (z2d.c) eVar.e.f310627g.get();
        vc.s.j(cVar);
        efd.a aVarA = eVar.f214446g.a();
        vc.s.j(aVarA);
        return new dgd.d(sharedFavouritesInitScreenContract$InputData, cVar, aVarA, (jki.p) mVar.f214482b.get());
    }

    private final Object m() {
        nh2.o oVar = (nh2.o) this.f208587c;
        nh2.p pVar = (nh2.p) this.d;
        int i = this.f208586b;
        switch (i) {
            case 0:
                n60.b bVar = (n60.b) pVar.d.get();
                o5k.i.m(bVar);
                return bVar;
            case 1:
                return o5k.i.r((com.revolut.kompot.navigable.a) pVar.f215332c.get());
            case 2:
                n60.a aVar = (n60.a) pVar.f.get();
                o5k.i.l(aVar);
                return aVar;
            case 3:
                return o5k.i.q((com.revolut.kompot.navigable.a) pVar.f215332c.get());
            case 4:
                r10.f fVar = new r10.f(pVar.f215331b.b(), new opf.c0());
                n60.a aVar2 = (n60.a) pVar.f.get();
                ldd.b bVar2 = (ldd.b) pVar.f215334h.get();
                w80.b bVar3 = (w80.b) pVar.i.get();
                wj0.a aVarI = ((nj0.d) oVar.e).i();
                vc.s.j(aVarI);
                return new hi2.n(fVar, aVar2, bVar2, bVar3, aVarI, (cli.n) pVar.k.get());
            case 5:
                ldd.a factory = new ldd.a();
                ii2.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory, "factory");
                return new ldd.b();
            case 6:
                qd0.b languageProvider = oVar.i.n();
                vc.s.j(languageProvider);
                ii2.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
                return v80.b.b(languageProvider, false, false, 58);
            case 7:
                return new hi2.o(new ji2.b((yof.d) pVar.f215335j.get(), new u80.o(), (w80.b) pVar.i.get(), (ldd.b) pVar.f215334h.get()), (yof.d) pVar.f215335j.get());
            case 8:
                ppf.a factory2 = oVar.f215325s.b();
                vc.s.j(factory2);
                ldd.b delegate = (ldd.b) pVar.f215334h.get();
                ii2.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory2, "factory");
                Intrinsics.checkNotNullParameter(delegate, "delegate");
                return ppf.a.a(delegate);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object n() {
        nh2.r rVar = (nh2.r) this.d;
        ViewController viewController = rVar.f215340a;
        nh2.o oVar = rVar.f215341b;
        nh2.o oVar2 = (nh2.o) this.f208587c;
        vy9.b bVar = oVar2.o;
        p12.l lVar = oVar2.f215321n;
        int i = this.f208586b;
        switch (i) {
            case 0:
                Object extension = (y02.a) rVar.d.get();
                z02.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                yji.d dVar = (yji.d) extension;
                vc.s.k(dVar);
                return dVar;
            case 1:
                r12.a aVar = (r12.a) lVar.f231711s.get();
                vc.s.j(aVar);
                return yf6.b.k(aVar, viewController, (y02.c) rVar.f215342c.get());
            case 2:
                return yf6.b.l(viewController);
            case 3:
                ry9.d extension2 = (ry9.d) rVar.f.get();
                wh2.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension2, "extension");
                vc.s.k(extension2);
                return extension2;
            case 4:
                vy9.g factory = bVar.b();
                vc.s.j(factory);
                wh2.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory, "factory");
                return factory.a();
            case 5:
                qh2.a aVarA = oVar.f215314b.a();
                vc.s.j(aVarA);
                h12.h hVarF = oVar.f215321n.f();
                vc.s.j(hVarF);
                ih2.c cVar = (ih2.c) oVar.B.get();
                ax1.a aVarE = ((lz1.m) oVar.f215313a).e();
                vc.s.j(aVarE);
                pz1.b bVar2 = (pz1.b) oVar.f215319l.f210571b.get();
                vc.s.j(bVar2);
                vv9.c cVarC = ((s6k.b) oVar.f215320m).c();
                vc.s.j(cVarC);
                uh2.g gVar = new uh2.g(aVarA, hVarF, new ki2.b(cVar, aVarE, bVar2, cVarC));
                sh2.d dVar2 = new sh2.d((c12.f) oVar2.f215328x.get());
                f62.o oVar3 = new f62.o((c12.z) oVar.f215329y.get(), 1);
                h12.a aVarD = lVar.d();
                vc.s.j(aVarD);
                pn3.a aVar2 = (pn3.a) oVar2.D.get();
                vz1.j jVarI = ((lz1.m) oVar2.f215313a).i();
                vc.s.j(jVarI);
                e12.f fVar = (e12.f) oVar2.E.get();
                e12.h hVar = (e12.h) oVar2.F.get();
                c70.a aVarZ = oVar2.i.z();
                vc.s.j(aVarZ);
                return new vh2.n(gVar, dVar2, oVar3, aVarD, aVar2, jVarI, fVar, hVar, aVarZ, (ry9.d) rVar.f.get(), (cli.n) rVar.f215344h.get());
            case 6:
                a12.j jVarE = lVar.e();
                vc.s.j(jVarE);
                a12.e eVarL = lVar.l();
                vc.s.j(eVarL);
                a12.o oVarM = lVar.m();
                vc.s.j(oVarM);
                ni2.a weroRequestLinkMapper = new ni2.a();
                Intrinsics.checkNotNullParameter(weroRequestLinkMapper, "weroRequestLinkMapper");
                xh2.d dVar3 = new xh2.d();
                thf.g gVarE = oVar2.f215322p.e();
                vc.s.j(gVarE);
                xh2.b bVar3 = new xh2.b(gVarE);
                a12.p pVar = (a12.p) lVar.L.get();
                vc.s.j(pVar);
                ty9.b bVarC = bVar.c();
                vc.s.j(bVarC);
                return new vh2.q(jVarE, eVarL, oVarM, dVar3, bVar3, pVar, bVarC);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object o() {
        nh2.s sVar = (nh2.s) this.d;
        nh2.o oVar = (nh2.o) this.f208587c;
        int i = this.f208586b;
        switch (i) {
            case 0:
                Object extension = (com.revolut.feature.apm.core.ui.api.navigation.a) sVar.d.get();
                yh2.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                yji.n nVar = (yji.n) extension;
                vc.s.k(nVar);
                return nVar;
            case 1:
                vw1.b bVar = (vw1.b) oVar.C.get();
                wj0.a aVarI = ((nj0.d) oVar.e).i();
                vc.s.j(aVarI);
                return new ci2.e(bVar, aVarI);
            case 2:
                Object extension2 = oVar.f215321n.b();
                vc.s.j(extension2);
                yh2.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension2, "extension");
                return (yji.n) extension2;
            case 3:
                Object extension3 = (oh2.a) sVar.f215348g.get();
                ph2.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension3, "extension");
                yji.n nVar2 = (yji.n) extension3;
                vc.s.k(nVar2);
                return nVar2;
            case 4:
                return new oh2.b(oVar.a());
            case 5:
                WeroHomeFlowContract$InputData weroHomeFlowContract$InputData = sVar.f215345a;
                lx1.d dVarB = ((ey1.e) oVar.f215317h).b();
                vc.s.j(dVarB);
                return new com.revolut.feature.apm.wero.impl.ui.home.a(weroHomeFlowContract$InputData, dVarB, (oh2.a) sVar.f215348g.get());
            case 6:
                return new ci2.a((vw1.b) oVar.C.get(), 0);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object p() {
        nh2.v vVar = (nh2.v) this.d;
        nh2.o oVar = (nh2.o) this.f208587c;
        int i = this.f208586b;
        if (i == 0) {
            Object extension = (oh2.a) vVar.d.get();
            ph2.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(extension, "extension");
            yji.n nVar = (yji.n) extension;
            vc.s.k(nVar);
            return nVar;
        }
        if (i == 1) {
            return new oh2.b(oVar.a());
        }
        if (i != 2) {
            throw new AssertionError(i);
        }
        WeroPayFlowContract$InputData weroPayFlowContract$InputData = vVar.f215355a;
        ki2.b bVarB = vVar.b();
        ni2.a aVar = new ni2.a();
        oh2.a aVar2 = (oh2.a) vVar.d.get();
        ang.f fVarE = oVar.f215323q.e();
        kz9.a aVarA = oVar.f.a();
        vc.s.j(aVarA);
        f12.a aVar3 = (f12.a) oVar.G.get();
        tak.d dVar = (tak.d) oVar.H.get();
        gte.a aVarB = oVar.f215324r.b();
        vc.s.j(aVarB);
        return new com.revolut.feature.apm.wero.impl.ui.pay.b(weroPayFlowContract$InputData, bVarB, aVar, aVar2, fVarE, aVarA, aVar3, dVar, aVarB);
    }

    private final Object q() {
        nh2.z zVar = (nh2.z) this.d;
        int i = this.f208586b;
        if (i == 0) {
            Object extension = (c12.z) ((nh2.o) this.f208587c).f215329y.get();
            mi2.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(extension, "extension");
            yji.n nVar = (yji.n) extension;
            vc.s.k(nVar);
            return nVar;
        }
        if (i != 1) {
            if (i != 2) {
                throw new AssertionError(i);
            }
            ni2.a requestLinkMapper = new ni2.a();
            Intrinsics.checkNotNullParameter(requestLinkMapper, "requestLinkMapper");
            return new li2.i();
        }
        nh2.o oVar = zVar.f215365a;
        ih2.c cVar = (ih2.c) oVar.B.get();
        ax1.a aVarE = ((lz1.m) oVar.f215313a).e();
        vc.s.j(aVarE);
        pz1.b bVar = (pz1.b) oVar.f215319l.f210571b.get();
        vc.s.j(bVar);
        vv9.c cVarC = ((s6k.b) oVar.f215320m).c();
        vc.s.j(cVarC);
        return new li2.g(new ki2.b(cVar, aVarE, bVar, cVarC), (cli.n) zVar.f215367c.get());
    }

    private final Object r() {
        nk7.q qVar = (nk7.q) this.f208587c;
        nk7.c cVar = (nk7.c) this.d;
        int i = this.f208586b;
        if (i != 0) {
            if (i != 1) {
                throw new AssertionError(i);
            }
            thf.g gVarE = cVar.f216668b.f216717c.e();
            vc.s.j(gVarE);
            return new rk7.n(new ik7.j(gVarE), new qk7.a(), new ik7.i(), new ik7.a());
        }
        jki.p pVar = (jki.p) cVar.f216669c.get();
        whf.b bVarA = qVar.f216717c.a();
        vc.s.j(bVarA);
        CFACClaimDetailsScreenContract$InputData cFACClaimDetailsScreenContract$InputData = cVar.f216667a;
        si7.a aVarA = qVar.f216715a.a();
        vc.s.j(aVarA);
        return new rk7.l(pVar, bVarA, cFACClaimDetailsScreenContract$InputData, aVarA);
    }

    @Override // phm.a
    public final Object get() {
        Object bVar;
        sbb.k kVar;
        sbb.p pVar;
        yji.n dVar;
        Object jVar;
        Object impl;
        int i = this.f208585a;
        int i2 = 7;
        Object obj2 = this.f208587c;
        int i3 = this.f208586b;
        Object obj3 = this.d;
        switch (i) {
            case 0:
                j jVar2 = (j) obj2;
                t tVar = (t) obj3;
                switch (i3) {
                    case 0:
                        Object extension = (qt1.a) tVar.d.get();
                        nt1.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension, "extension");
                        yji.n nVar = (yji.n) extension;
                        vc.s.k(nVar);
                        return nVar;
                    case 1:
                        BizumTransferInputData bizumTransferInputData = tVar.f208588a;
                        ps1.b bVar2 = (ps1.b) jVar2.D.get();
                        hy1.l lVar = (hy1.l) ((ey1.e) jVar2.i).H.get();
                        vc.s.j(lVar);
                        ax1.a aVarE = ((lz1.m) jVar2.f208539l).e();
                        vc.s.j(aVarE);
                        bVar = new com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.b(bizumTransferInputData, bVar2, lVar, aVarE, jVar2.f208540m.a(), jVar2.f208541n.b());
                        break;
                    case 2:
                        Object extension2 = (qt1.n) tVar.f208591g.get();
                        nt1.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension2, "extension");
                        yji.n nVar2 = (yji.n) extension2;
                        vc.s.k(nVar2);
                        return nVar2;
                    case 3:
                        return new com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.c(tVar.f208588a, tVar.q(), (ns1.b) tVar.f.get());
                    case 4:
                        ns1.f fVarQ = tVar.q();
                        fk3.a aVarA = jVar2.d.a();
                        vc.s.j(aVarA);
                        return new ns1.e(fVarQ, aVarA);
                    case 5:
                        Object extension3 = (st1.b) tVar.i.get();
                        nt1.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension3, "extension");
                        yji.n nVar3 = (yji.n) extension3;
                        vc.s.k(nVar3);
                        return nVar3;
                    case 6:
                        BizumTransferInputData bizumTransferInputData2 = tVar.f208588a;
                        fk3.a aVarA2 = jVar2.d.a();
                        vc.s.j(aVarA2);
                        wsg.n nVarB = jVar2.f208541n.b();
                        u5k.c cVar = (u5k.c) jVar2.H.get();
                        st1.a aVar = new st1.a();
                        tt1.a aVar2 = new tt1.a();
                        tt1.e eVar = new tt1.e();
                        gte.a aVarB = tVar.f208589b.f208536g.b();
                        vc.s.j(aVarB);
                        bVar = new st1.f(bizumTransferInputData2, aVarA2, nVarB, cVar, aVar, aVar2, eVar, new l1l.s(aVarB), new l1l.q());
                        break;
                    case 7:
                        r10.f factory = jVar2.f.a();
                        nt1.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory, "factory");
                        return factory.d();
                    case 8:
                        Object extension4 = (ns1.b) tVar.f.get();
                        os1.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension4, "extension");
                        yji.n nVar4 = (yji.n) extension4;
                        vc.s.k(nVar4);
                        return nVar4;
                    case 9:
                        BizumTransferInputData bizumTransferInputData3 = tVar.f208588a;
                        b3a.a aVarA3 = jVar2.f208542p.a();
                        vc.s.j(aVarA3);
                        ns1.b bVar3 = (ns1.b) tVar.f.get();
                        wj0.a aVarI = ((nj0.d) jVar2.f208543q).i();
                        vc.s.j(aVarI);
                        return new com.revolut.feature.apm.bizum.impl.ui.transfer.flow.a(bizumTransferInputData3, aVarA3, bVar3, aVarI);
                    case 10:
                        rt1.c.Companion.getClass();
                        return new rt1.a();
                    default:
                        throw new AssertionError(i3);
                }
                return bVar;
            case 1:
                mtb.d dVar2 = (mtb.d) obj2;
                ftb.d dVar3 = dVar2.f208799a;
                mtb.b bVar4 = (mtb.b) obj3;
                mtb.d dVar4 = bVar4.f208791b;
                if (i3 == 0) {
                    Object extension5 = (r60.b) bVar4.f.get();
                    Intrinsics.checkNotNullParameter(extension5, "extension");
                    yji.d dVar5 = (yji.d) extension5;
                    vc.s.k(dVar5);
                    return dVar5;
                }
                if (i3 == 1) {
                    return s2l.c.r((com.revolut.kompot.navigable.a) bVar4.d.get(), (p0) bVar4.e.get(), kxa.j.o(new nji.b()));
                }
                if (i3 == 2) {
                    return new p0();
                }
                if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 != 5) {
                            throw new AssertionError(i3);
                        }
                        nbb.d provider = ((nbb.a) dVar3).a();
                        vc.s.j(provider);
                        stb.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(provider, "provider");
                        return provider.f214065w;
                    }
                    MainContainerFlowContract$InputData mainContainerFlowContract$InputData = bVar4.f208790a;
                    jtb.b bVar5 = (jtb.b) dVar2.f208802g.get();
                    Set set = (Set) bVar4.f208794h.get();
                    nbb.d provider2 = ((nbb.a) dVar4.f208799a).a();
                    vc.s.j(provider2);
                    stb.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(provider2, "provider");
                    qr0.i iVar = new qr0.i(provider2.f214066x);
                    nbb.d provider3 = ((nbb.a) dVar4.f208799a).a();
                    vc.s.j(provider3);
                    Intrinsics.checkNotNullParameter(provider3, "provider");
                    rbb.a aVar3 = new rbb.a();
                    ttb.a aVar4 = new ttb.a();
                    ekg.g gVarB = dVar2.f208800b.b();
                    kbb.p pVar2 = (kbb.p) ((nbb.a) dVar3).K.get();
                    vc.s.j(pVar2);
                    return new com.revolut.feature.rev10_main_screen.impl.ui.a(mainContainerFlowContract$InputData, bVar5, set, iVar, aVar3, aVar4, gVarB, pVar2, bVar4.c());
                }
                com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) bVar4.d.get();
                nbb.d provider4 = ((nbb.a) dVar3).a();
                vc.s.j(provider4);
                r60.b promptView = (r60.b) bVar4.f.get();
                stb.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller, "controller");
                Intrinsics.checkNotNullParameter(provider4, "provider");
                Intrinsics.checkNotNullParameter(promptView, "promptViewControllerExtension");
                Intrinsics.checkNotNullParameter(controller, "controller");
                Intrinsics.checkNotNullParameter(promptView, "promptViewControllerExtension");
                Activity activityM2 = controller.m2();
                Intrinsics.i(activityM2, "null cannot be cast to non-null type androidx.activity.ComponentActivity");
                ComponentActivity activity = (ComponentActivity) activityM2;
                zjh.f fVar = provider4.f214051a;
                Intrinsics.checkNotNullParameter(activity, "activity");
                oc.b bVarC = hx7.a.c(activity);
                Intrinsics.checkNotNullExpressionValue(bVarC, "create(...)");
                cq.g inAppUpdater = new cq.g(activity, bVarC, (ue0.c) fVar.f322835b);
                nbb.c inAppUpdaterGlobalToggle = new nbb.c();
                zjh.c cVar2 = provider4.u;
                qbb.a configurationProvider = provider4.v;
                sri.m navigator = sri.o.c(activity, null, null, 14);
                k1 shotDialogDisplayer = x0.a(g1.Companion, controller.D2());
                Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
                Intrinsics.checkNotNullParameter(inAppUpdater, "inAppUpdater");
                Intrinsics.checkNotNullParameter(inAppUpdaterGlobalToggle, "inAppUpdaterGlobalToggle");
                Intrinsics.checkNotNullParameter(navigator, "navigator");
                Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
                cq.b bVar6 = new cq.b(configurationProvider, inAppUpdater, inAppUpdaterGlobalToggle, navigator, shotDialogDisplayer, (ue0.c) cVar2.f322830b);
                ug6.f fVar2 = provider4.f214052b;
                ug6.v vVar = new ug6.v(fVar2.f279943a, fVar2.f279944b, fVar2.f279945c, fVar2.d, fVar2.e, fVar2.f, fVar2.f279946g, fVar2.f279947h, fVar2.i, fVar2.f279948j, fVar2.k, fVar2.f279949l);
                f88.f fVar3 = new f88.f(provider4.f214053c);
                c84.c cVar3 = new c84.c(provider4.d, provider4.e);
                sbb.m mVar = new sbb.m(inAppUpdater, bVar6);
                sbb.o oVar = new sbb.o(provider4.f);
                sbb.r rVar = new sbb.r(provider4.f214054g);
                d0 d0Var = new d0(provider4.f214055h, provider4.i);
                sbb.x xVar = new sbb.x(provider4.f214056j);
                a0 a0Var = new a0(provider4.k, provider4.f214057l, provider4.f214058m, provider4.f214059n, provider4.o, provider4.f214060p);
                sbb.q qVar = new sbb.q(vVar);
                sbb.d dVar6 = provider4.f214061q;
                sbb.k kVar2 = provider4.f214062r;
                sbb.p pVar3 = provider4.f214063s;
                sz5.f fVar4 = provider4.f214064t;
                toh.d dVar7 = (toh.d) fVar4.f266768g;
                dqk.f fVar5 = (dqk.f) fVar4.e;
                yp.b bVar7 = (yp.b) fVar4.d;
                x xVar2 = (x) fVar4.f266767c;
                yta.b bVar8 = (yta.b) fVar4.f266766b;
                py3.b bVar9 = (py3.b) fVar4.f266765a;
                Intrinsics.checkNotNullParameter(activity, "activity");
                Intrinsics.checkNotNullParameter(promptView, "promptView");
                if (((jte.d) ((gte.a) fVar4.f)).c(RatingSharedApi$Toggles$AppRatingRedesignFeatureToggle.f81643c)) {
                    dVar = new cc7.l(bVar9, bVar8, xVar2, bVar7, fVar5, dVar7, (cua.a) fVar4.f266769h);
                    kVar = kVar2;
                    pVar = pVar3;
                } else {
                    kVar = kVar2;
                    pVar = pVar3;
                    dVar = new xta.d(bVar9, bVar8, promptView, xVar2, bVar7, fVar5, dVar7);
                }
                return z0.i(fVar3, cVar3, mVar, oVar, rVar, d0Var, xVar, a0Var, vVar, qVar, dVar6, kVar, pVar, dVar, new daj.b());
            case 2:
                mw5.l lVar2 = (mw5.l) obj2;
                mw5.f fVar6 = (mw5.f) obj3;
                switch (i3) {
                    case 0:
                        return new aah.g((ey5.e) fVar6.f209344c.get(), (ey5.d) fVar6.e.get());
                    case 1:
                        ViewController view = fVar6.f209342a;
                        iy5.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(view, "view");
                        return (CryptoCollectionDetailsController) view;
                    case 2:
                        CryptoCollectionDetailsControllerContract$InputData cryptoCollectionDetailsControllerContract$InputData = fVar6.f209343b;
                        wsg.n nVarB2 = lVar2.i.b();
                        cu8.r0 r0VarA = lVar2.v.a();
                        xh5.a aVarA4 = lVar2.f209374b.a();
                        vc.s.j(aVarA4);
                        jVar = new ey5.j(cryptoCollectionDetailsControllerContract$InputData, nVarB2, r0VarA, aVarA4, (ey5.f) fVar6.d.get());
                        break;
                    case 3:
                        return new ey5.f();
                    case 4:
                        return new dy5.e(lVar2.f209378j.b(), fVar6.f209343b, (dy5.a) fVar6.f209345g.get());
                    case 5:
                        return new dy5.c();
                    case 6:
                        return new fy5.m((fy5.d) fVar6.f209344c.get(), fVar6.f209343b, (jy5.a) fVar6.f209347j.get(), lVar2.f209378j.b(), (fy5.b) fVar6.k.get(), (jy5.d) fVar6.f209348l.get());
                    case 7:
                        return new jy5.b((gy5.a) fVar6.i.get());
                    case 8:
                        iy5.b.Companion.getClass();
                        j2 j2VarC = vkm.q.c(qta.f.DAY);
                        od0.i.Companion.getClass();
                        return new gy5.a(j2VarC, vkm.q.c(od0.i.f224256b));
                    case 9:
                        return new fy5.e(new hx5.b(), lVar2.f209382p.g());
                    case 10:
                        return new jy5.d(lVar2.f209378j.b());
                    case 11:
                        jVar = new hy5.h((hy5.c) fVar6.f209344c.get(), fVar6.f209343b, lVar2.f209378j.b(), (hy5.a) fVar6.f209350n.get(), (nw5.a) lVar2.C.get(), (jy5.a) fVar6.f209347j.get());
                        break;
                    case 12:
                        return new hy5.d();
                    case 13:
                        cli.n nVar5 = (cli.n) fVar6.f209351p.get();
                        ey5.d dVar8 = (ey5.d) fVar6.e.get();
                        fy5.c cVar4 = (fy5.c) fVar6.f209349m.get();
                        dy5.b bVar10 = (dy5.b) fVar6.f209346h.get();
                        hy5.b bVar11 = (hy5.b) fVar6.o.get();
                        sh5.d dVarF = lVar2.f209374b.f();
                        vc.s.j(dVarF);
                        jVar = new cy5.i(nVar5, dVar8, cVar4, bVar10, bVar11, dVarF);
                        break;
                    case 14:
                        return new cy5.j();
                    default:
                        throw new AssertionError(i3);
                }
                return jVar;
            case 3:
                mw5.l lVar3 = (mw5.l) obj2;
                if (i3 == 0) {
                    return new ly5.j((cli.n) ((mw5.g) obj3).f209353a.get(), lVar3.f209378j.b());
                }
                if (i3 == 1) {
                    return new ly5.m(lVar3.f209382p.g());
                }
                throw new AssertionError(i3);
            case 4:
                mw5.j jVar3 = (mw5.j) obj3;
                if (i3 == 0) {
                    Object extension6 = (j60.a) jVar3.f.get();
                    Intrinsics.checkNotNullParameter(extension6, "extension");
                    yji.d dVar9 = (yji.d) extension6;
                    vc.s.k(dVar9);
                    return dVar9;
                }
                if (i3 == 1) {
                    com.revolut.kompot.navigable.a controller2 = (com.revolut.kompot.navigable.a) jVar3.d.get();
                    rp0.m dialogDisplayer = (rp0.m) jVar3.e.get();
                    he2.b dialogHostFinder = kxa.j.o(new nji.b());
                    Intrinsics.checkNotNullParameter(controller2, "controller");
                    Intrinsics.checkNotNullParameter(dialogDisplayer, "dialogDisplayer");
                    Intrinsics.checkNotNullParameter(dialogHostFinder, "dialogHostFinder");
                    return new j60.c(controller2, dialogDisplayer, dialogHostFinder);
                }
                if (i3 == 2) {
                    return new rp0.m();
                }
                if (i3 == 3) {
                    return new com.revolut.feature.cryptocommodity_invest.impl.ui.activities.collections.buy.flow.a(jVar3.f209365a, (j60.a) jVar3.f.get(), new vw5.a(), (g1) jVar3.f209369h.get(), ((mw5.l) obj2).o.b());
                }
                if (i3 != 4) {
                    throw new AssertionError(i3);
                }
                com.revolut.kompot.navigable.a controller3 = (com.revolut.kompot.navigable.a) jVar3.d.get();
                yw5.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller3, "controller");
                return x0.a(g1.Companion, controller3.D2());
            case 5:
                mw5.m mVar2 = (mw5.m) obj3;
                mw5.l lVar4 = (mw5.l) obj2;
                l70.e eVar2 = lVar4.f209379l;
                if (i3 == 0) {
                    yx5.p pVar4 = new yx5.p(new ny5.e());
                    tv5.b bVarC2 = lVar4.f209377h.c();
                    vc.s.j(bVarC2);
                    my5.d dVar10 = (my5.d) mVar2.f209391b.get();
                    ox5.i iVar2 = (ox5.i) mVar2.f209392c.get();
                    t70.b bVarG = eVar2.g();
                    vc.s.j(bVarG);
                    return new com.revolut.feature.cryptocommodity_invest.impl.ui.activities.discoverall.ui.kompot.b(pVar4, bVarC2, dVar10, iVar2, bVarG);
                }
                if (i3 == 1) {
                    return new my5.d((nw5.j) lVar4.H.get(), new ny5.u(), (my5.a) mVar2.f209390a.get());
                }
                if (i3 == 2) {
                    return new yx5.m();
                }
                if (i3 != 3) {
                    throw new AssertionError(i3);
                }
                ny5.g gVar = new ny5.g((nw5.a) lVar4.C.get());
                t70.b bVarG2 = eVar2.g();
                vc.s.j(bVarG2);
                return new ox5.i(gVar, new ny5.c(bVarG2), new ny5.u());
            case 6:
                mz.b bVar12 = (mz.b) obj2;
                ey.d dVar11 = (ey.d) obj3;
                switch (i3) {
                    case 0:
                        oy.b bVar13 = dVar11.f130490b;
                        oy.a extension7 = (oy.a) dVar11.i.get();
                        Intrinsics.checkNotNullParameter(extension7, "extension");
                        vc.s.k(extension7);
                        return extension7;
                    case 1:
                        return olc.c.b(dVar11.f130490b, (com.revolut.kompot.navigable.a) dVar11.f130493h.get());
                    case 2:
                        xy.b bVar14 = dVar11.f130491c;
                        xy.a extension8 = (xy.a) dVar11.E.get();
                        Intrinsics.checkNotNullParameter(extension8, "extension");
                        vc.s.k(extension8);
                        return extension8;
                    case 3:
                        return xhi.f.e(dVar11.f130491c, (com.revolut.kompot.navigable.a) dVar11.f130493h.get(), (yy.c) dVar11.D.get());
                    case 4:
                        xv.h hVar = (xv.h) dVar11.u.get();
                        pv.a aVar5 = (pv.a) dVar11.v.get();
                        sx.a aVar6 = (sx.a) bVar12.f.k.get();
                        vc.s.j(aVar6);
                        py.d dVarB = bVar12.f.b();
                        vc.s.j(dVarB);
                        impl = new yy.c(hVar, aVar5, aVar6, dVarB, (dv.a) dVar11.A.get(), (ww.b) dVar11.B.get(), new sy.d0(), (pw.c) dVar11.C.get());
                        break;
                    case 5:
                        kdh.b factory2 = bVar12.f210564c.b();
                        mz.b bVar15 = (mz.b) dVar11.L;
                        vy.a inputData = dVar11.d;
                        u00.d dVar12 = bVar15.d;
                        mz.d.Companion.getClass();
                        Intrinsics.checkNotNullParameter(inputData, "inputData");
                        Set set2 = inputData.e;
                        vc.s.k(set2);
                        LinkedHashSet validators = dw3.l.h(dVar12, set2, (dx.l) dVar11.f130495l.get(), bVar15.e);
                        xv.d framesProvider = (xv.d) dVar11.f130502t.get();
                        LifecycleOwner lifecycleOwner = (LifecycleOwner) dVar11.f130496m.get();
                        Intrinsics.checkNotNullParameter(inputData, "inputData");
                        CameraKitFlowContract$FlowType cameraKitFlowContract$FlowType = inputData.f293107a;
                        Intrinsics.i(cameraKitFlowContract$FlowType, "null cannot be cast to non-null type com.revolut.camerakit.revolut.ui.flow.CameraKitFlowContract.FlowType.QrCode");
                        MsBarcodeDetectorSettings msBarcodeDetectorSettings = ((CameraKitFlowContract$FlowType.QrCode) cameraKitFlowContract$FlowType).f50794a;
                        vc.s.k(msBarcodeDetectorSettings);
                        Intrinsics.checkNotNullParameter(factory2, "factory");
                        Intrinsics.checkNotNullParameter(validators, "validators");
                        Intrinsics.checkNotNullParameter(framesProvider, "framesProvider");
                        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
                        Intrinsics.checkNotNullParameter(msBarcodeDetectorSettings, "msBarcodeDetectorSettings");
                        return factory2.q(validators, framesProvider, lifecycleOwner, msBarcodeDetectorSettings);
                    case 6:
                        dx.m mVar3 = (dx.m) dVar11.k.get();
                        dw3.l.u(mVar3);
                        return mVar3;
                    case 7:
                        return dw3.l.s((com.revolut.kompot.navigable.a) dVar11.f130493h.get());
                    case 8:
                        return dw3.l.b((sw.d) dVar11.f130501s.get());
                    case 9:
                        tw.a aVarA5 = bVar12.f.a();
                        LifecycleOwner lifecycleOwner2 = (LifecycleOwner) dVar11.f130496m.get();
                        PreviewView previewView = (PreviewView) dVar11.o.get();
                        yw.h hVar2 = (yw.h) dVar11.f130500r.get();
                        mz.d.Companion.getClass();
                        return dw3.l.d(aVarA5, lifecycleOwner2, previewView, hVar2, false, null, null, null, null);
                    case 10:
                        return wy.d.a();
                    case 11:
                        return dw3.l.t((CameraKitPreviewView) dVar11.f130497n.get());
                    case 12:
                        return dw3.l.f((com.revolut.kompot.navigable.a) dVar11.f130493h.get());
                    case 13:
                        impl = (yw.f) dVar11.f130499q.get();
                        Intrinsics.checkNotNullParameter(impl, "impl");
                        vc.s.k(impl);
                        break;
                    case 14:
                        nz.a factory3 = (nz.a) dVar11.f130498p.get();
                        Intrinsics.checkNotNullParameter(factory3, "factory");
                        factory3.getClass();
                        yw.a aVar7 = yw.a.BACK;
                        CameraKitClientSettings cameraKitClientSettings = factory3.f220927a;
                        yw.e eVarA = hy.e.a(cameraKitClientSettings);
                        yw.e eVar3 = yw.e.HD;
                        yw.e eVar4 = yw.e.FHD;
                        CameraCaptureSettings cameraCaptureSettings = cameraKitClientSettings.f50706a;
                        return new yw.f(aVar7, eVarA, eVar3, eVar3, new yw.d(new yw.c(hy.a.a(cameraCaptureSettings), hy.b.a(cameraCaptureSettings), hy.a.b(cameraCaptureSettings)), new yw.i(hy.d.a(cameraCaptureSettings), false)), yw.b.COMBINED, eVar4, hy.f.a(cameraCaptureSettings), false);
                    case 15:
                        CameraKitClientSettings cameraKitClientSettings2 = dVar11.e;
                        Intrinsics.checkNotNullParameter(cameraKitClientSettings2, "cameraKitClientSettings");
                        impl = new nz.a(cameraKitClientSettings2);
                        break;
                    case 16:
                        return dw3.l.e(bVar12.f210565g);
                    case 17:
                        nv.a aVar8 = bVar12.f210565g;
                        dv.m mVar4 = (dv.m) dVar11.f130503w.get();
                        xv.c cVar5 = (xv.c) dVar11.f130504x.get();
                        CameraKitClientSettings cameraKitClientSettings3 = dVar11.e;
                        xv.h hVar3 = (xv.h) dVar11.u.get();
                        LifecycleOwner lifecycleOwner3 = (LifecycleOwner) dVar11.f130496m.get();
                        CameraKitUiSettings cameraKitUiSettings = dVar11.f130492g;
                        pv.a aVar9 = (pv.a) dVar11.v.get();
                        ww.b bVar16 = (ww.b) dVar11.f130505y.get();
                        dx.m mVar5 = (dx.m) dVar11.k.get();
                        fv.e eVar5 = bVar12.f210566h;
                        yw.h hVar4 = (yw.h) dVar11.z.get();
                        mz.d.Companion.getClass();
                        return dw3.l.c(aVar8, mVar4, cVar5, cameraKitClientSettings3, hVar3, lifecycleOwner3, cameraKitUiSettings, aVar9, bVar16, mVar5, eVar5, hVar4, null, null, null);
                    case 18:
                        return dw3.l.g(bVar12.f210565g, dVar11.f, dVar11.f130492g);
                    case 19:
                        return dw3.l.a((sw.d) dVar11.f130501s.get());
                    case 20:
                        return dw3.l.r((sw.d) dVar11.f130501s.get());
                    case 21:
                        impl = (yw.h) dVar11.f130500r.get();
                        Intrinsics.checkNotNullParameter(impl, "impl");
                        vc.s.k(impl);
                        break;
                    case 22:
                        return dw3.l.q((sw.d) dVar11.f130501s.get());
                    case 23:
                        return dw3.l.k((sw.d) dVar11.f130501s.get());
                    case 24:
                        yy.c cVar6 = (yy.c) dVar11.D.get();
                        yf6.b.h(cVar6);
                        return cVar6;
                    case 25:
                        fz.b bVar17 = new fz.b((fz.c) dVar11.H.get(), (com.revolut.kompot.navigable.a) dVar11.f130493h.get());
                        gsi.d.i(bVar17);
                        return bVar17;
                    case 26:
                        return wpg.v.k((LifecycleOwner) dVar11.f130496m.get());
                    case 27:
                        uy.a aVar10 = new uy.a();
                        dv.a aVar11 = (dv.a) dVar11.A.get();
                        xv.h hVar5 = (xv.h) dVar11.u.get();
                        vy.a aVar12 = dVar11.d;
                        py.d dVarB2 = bVar12.f.b();
                        vc.s.j(dVarB2);
                        yy.c cVar7 = (yy.c) dVar11.D.get();
                        dz.a aVar13 = new dz.a();
                        ty.h hVar6 = new ty.h();
                        ty.i iVar3 = new ty.i();
                        qd0.b bVarN = ((mz.b) dVar11.L).f210563b.n();
                        vc.s.j(bVarN);
                        return new com.revolut.camerakit.revolut.ui.flow.steps.camera.a(aVar10, aVar11, hVar5, aVar12, dVarB2, cVar7, aVar13, hVar6, iVar3, new zy.f(new ybh.c0(bVarN, new ez.a())), (cli.n) dVar11.J.get());
                    case 28:
                        qy.a aVar14 = (qy.a) bVar12.k.get();
                        vy.a aVar15 = dVar11.d;
                        qd0.b bVarN2 = bVar12.f210563b.n();
                        vc.s.j(bVarN2);
                        return new sy.c0(aVar14, aVar15, bVarN2);
                    default:
                        throw new AssertionError(i3);
                }
                return impl;
            case 7:
                n16.b bVar18 = (n16.b) obj2;
                n16.d dVar13 = (n16.d) obj3;
                switch (i3) {
                    case 0:
                        return kxa.j.k((j60.a) dVar13.f.get());
                    case 1:
                        return ehe.n.s((com.revolut.kompot.navigable.a) dVar13.d.get(), (rp0.m) dVar13.e.get());
                    case 2:
                        return new rp0.m();
                    case 3:
                        ku5.j api2 = (ku5.j) dVar13.i.get();
                        b26.e.Companion.getClass();
                        Intrinsics.checkNotNullParameter(api2, "api");
                        return api2.a();
                    case 4:
                        hd.r factory4 = bVar18.f211251h.h();
                        ut5.l view2 = dVar13.f211259a;
                        n16.b bVar19 = dVar13.f211261c;
                        f16.b bVar20 = (f16.b) bVar19.f211248b.k.get();
                        vc.s.j(bVar20);
                        i26.k kVar3 = (i26.k) bVar19.i.i.get();
                        vc.s.j(kVar3);
                        xv5.c cVarA = bVar19.d.a();
                        vc.s.j(cVarA);
                        mp.p customCryptoStatsDataProvider = new mp.p(bVar20, kVar3, cVarA);
                        l0 popupMenuDialogDisplayer = (l0) dVar13.f211263h.get();
                        j60.a bottomExpandableDialogControllerExtension = (j60.a) dVar13.f.get();
                        f16.b deFiAccountsRepository = (f16.b) bVar19.f211248b.k.get();
                        vc.s.j(deFiAccountsRepository);
                        t46.a deFiRatesRepository = (t46.a) bVar19.f211249c.i.get();
                        vc.s.j(deFiRatesRepository);
                        xv5.c cryptoCommodityBaseCurrencyInteractor = bVar19.d.a();
                        vc.s.j(cryptoCommodityBaseCurrencyInteractor);
                        CoroutineScope appCoroutineScope = bVar19.f211252j.a();
                        vc.s.j(appCoroutineScope);
                        Intrinsics.checkNotNullParameter(deFiAccountsRepository, "deFiAccountsRepository");
                        Intrinsics.checkNotNullParameter(deFiRatesRepository, "deFiRatesRepository");
                        Intrinsics.checkNotNullParameter(cryptoCommodityBaseCurrencyInteractor, "cryptoCommodityBaseCurrencyInteractor");
                        Intrinsics.checkNotNullParameter(appCoroutineScope, "appCoroutineScope");
                        hd.r customPocketsDataProvider = new hd.r();
                        customPocketsDataProvider.f151364a = deFiAccountsRepository;
                        customPocketsDataProvider.f151365b = deFiRatesRepository;
                        customPocketsDataProvider.f151366c = cryptoCommodityBaseCurrencyInteractor;
                        customPocketsDataProvider.d = appCoroutineScope;
                        customPocketsDataProvider.e = new ee.b(new a0.c(customPocketsDataProvider, i2));
                        a26.n assetModelExtension = new a26.n();
                        a26.t perpetualsItemsProvider = new a26.t();
                        b26.e.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory4, "factory");
                        Intrinsics.checkNotNullParameter(view2, "view");
                        Intrinsics.checkNotNullParameter(customCryptoStatsDataProvider, "cryptoStatsDataProvider");
                        Intrinsics.checkNotNullParameter(popupMenuDialogDisplayer, "popupMenuDialogDisplayer");
                        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
                        Intrinsics.checkNotNullParameter(customPocketsDataProvider, "dataProvider");
                        Intrinsics.checkNotNullParameter(assetModelExtension, "assetModelExtension");
                        Intrinsics.checkNotNullParameter(perpetualsItemsProvider, "perpetualsItemsProvider");
                        Intrinsics.checkNotNullParameter(view2, "view");
                        Intrinsics.checkNotNullParameter(customCryptoStatsDataProvider, "customCryptoStatsDataProvider");
                        Intrinsics.checkNotNullParameter(popupMenuDialogDisplayer, "popupMenuDialogDisplayer");
                        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
                        Intrinsics.checkNotNullParameter(customPocketsDataProvider, "customPocketsDataProvider");
                        Intrinsics.checkNotNullParameter(assetModelExtension, "assetModelExtension");
                        Intrinsics.checkNotNullParameter(perpetualsItemsProvider, "perpetualsItemsProvider");
                        return factory4.s(view2, popupMenuDialogDisplayer, bottomExpandableDialogControllerExtension, customCryptoStatsDataProvider, customPocketsDataProvider, null, assetModelExtension, perpetualsItemsProvider);
                    case 5:
                        com.revolut.kompot.navigable.a controller4 = (com.revolut.kompot.navigable.a) dVar13.d.get();
                        b26.e.Companion.getClass();
                        Intrinsics.checkNotNullParameter(controller4, "controller");
                        return new l0(controller4.m2());
                    case 6:
                        p46.d eventObserver = (p46.d) bVar18.k.f212308h.get();
                        q46.f.Companion.getClass();
                        Intrinsics.checkNotNullParameter(eventObserver, "eventObserver");
                        nd.p factory5 = new nd.p();
                        b26.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory5, "factory");
                        return new f88.f(eventObserver);
                    case 7:
                        ku5.j api3 = (ku5.j) dVar13.i.get();
                        b26.e.Companion.getClass();
                        Intrinsics.checkNotNullParameter(api3, "api");
                        Set set3 = (Set) api3.f189714s.get();
                        vc.s.k(set3);
                        return set3;
                    case 8:
                        ash.j widgetsView = dVar13.f211260b;
                        n46.a component = bVar18.k;
                        r10.f factory6 = component.f212304a.a();
                        ImmutableMap eventHandlers = ImmutableMap.of("TransactionsDynamic", component.f212309j);
                        ash.i widgetsInteractor = (ash.i) component.k.get();
                        q46.f.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory6, "factory");
                        Intrinsics.checkNotNullParameter(component, "component");
                        Intrinsics.checkNotNullParameter(eventHandlers, "eventHandlers");
                        Intrinsics.checkNotNullParameter(widgetsInteractor, "widgetsInteractor");
                        dsh.h factory7 = new dsh.h(factory6, component, eventHandlers, widgetsInteractor);
                        l46.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(widgetsView, "widgetsView");
                        Intrinsics.checkNotNullParameter(factory7, "factory");
                        Intrinsics.checkNotNullParameter(widgetsView, "widgetsView");
                        return factory6.J(widgetsView, component, eventHandlers, widgetsInteractor);
                    case 9:
                        ku5.j api4 = (ku5.j) dVar13.i.get();
                        b26.e.Companion.getClass();
                        Intrinsics.checkNotNullParameter(api4, "api");
                        ut5.i iVar4 = (ut5.i) api4.f189713r.get();
                        vc.s.k(iVar4);
                        return iVar4;
                    case 10:
                        ku5.j api5 = (ku5.j) dVar13.i.get();
                        b26.e.Companion.getClass();
                        Intrinsics.checkNotNullParameter(api5, "api");
                        return api5.b();
                    case 11:
                        ku5.j api6 = (ku5.j) dVar13.i.get();
                        b26.e.Companion.getClass();
                        Intrinsics.checkNotNullParameter(api6, "api");
                        return api6.f189705g;
                    case 12:
                        n16.b bVar21 = dVar13.f211261c;
                        a26.m mVar6 = new a26.m(new iv5.a());
                        ut5.e eVar6 = (ut5.e) dVar13.o.get();
                        ash.e eVar7 = (ash.e) dVar13.f211266m.get();
                        com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) bVar18.f211253l).c();
                        vc.s.j(aVarC);
                        mre.c cVarB = bVar18.f211250g.b();
                        vc.s.j(cVarB);
                        return new a26.k(mVar6, eVar6, eVar7, aVarC, cVarB);
                    default:
                        throw new AssertionError(i3);
                }
            case 8:
                n3l.b bVar22 = (n3l.b) obj2;
                n3l.a aVar16 = (n3l.a) obj3;
                switch (i3) {
                    case 0:
                        hqi.l lVar5 = (hqi.l) aVar16.d.get();
                        p3l.a aVar17 = (p3l.a) aVar16.f.get();
                        o3l.d dVar14 = (o3l.d) bVar22.i.get();
                        o3l.e eVar8 = (o3l.e) bVar22.f212201l.get();
                        zpi.c cVar8 = (zpi.c) aVar16.f212184g.get();
                        r70.c cVarA2 = bVar22.f212195a.A();
                        vc.s.j(cVarA2);
                        return new o3l.q(lVar5, aVar17, dVar14, eVar8, cVar8, cVarA2);
                    case 1:
                        return new hqi.f(aVar16.f212181a, bq.i.b(aVar16.f212182b));
                    case 2:
                        return new p3l.a((iqi.h) aVar16.e.get(), (o3l.d) bVar22.i.get());
                    case 3:
                        aVar16.getClass();
                        return new iqi.b(iqi.g.f167870b, bq.i.b(aVar16.f212182b));
                    case 4:
                        return new zpi.b(bq.i.b(aVar16.f212182b));
                    case 5:
                        return kpi.f.a();
                    case 6:
                        Context contextI = bq.i.i(aVar16.f212182b);
                        BaseDelegatesActivity baseDelegatesActivityF = bq.i.f(aVar16.f212182b);
                        t70.g gVarO = bVar22.f212195a.o();
                        vc.s.j(gVarO);
                        return new npi.c(contextI, baseDelegatesActivityF, gVarO);
                    case 7:
                        return new tpi.i((rpi.c) aVar16.k.get(), gsi.c.a(aVar16.f212182b));
                    case 8:
                        return new rpi.b(bq.i.b(aVar16.f212182b));
                    case 9:
                        return new rpi.h(bq.i.b(aVar16.f212182b));
                    case 10:
                        return new iri.g((iri.j) bVar22.f212198g.get(), (iri.m) bVar22.f212200j.get(), bq.i.f(aVar16.f212182b), bq.i.l(aVar16.f212182b));
                    case 11:
                        return new iri.l((iri.m) bVar22.f212200j.get(), bq.i.f(aVar16.f212182b), (iri.d) aVar16.o.get());
                    case 12:
                        return new iri.d(bq.i.f(aVar16.f212182b));
                    case 13:
                        return new opi.b(bq.i.f(aVar16.f212182b));
                    case 14:
                        return new qpi.b(bq.i.l(aVar16.f212182b), n3l.d.a());
                    case 15:
                        l3l.b bVar23 = (l3l.b) bVar22.f212201l.get();
                        sri.m mVarL = bq.i.l(aVar16.f212182b);
                        l3l.h hVar7 = (l3l.h) bVar22.k.get();
                        hqi.l lVar6 = (hqi.l) aVar16.d.get();
                        r70.c cVarA3 = bVar22.f212195a.A();
                        vc.s.j(cVarA3);
                        return new l3l.n(bVar23, mVarL, hVar7, lVar6, cVarA3, (f9b.f) aVar16.f212193s.get(), (npi.f) aVar16.f212186j.get(), (tpi.j) aVar16.f212187l.get(), (m3l.e) aVar16.f212194t.get());
                    case 16:
                        return bq.i.t(aVar16.f212182b);
                    case 17:
                        return new m3l.e((iqi.h) aVar16.e.get(), (f9b.f) aVar16.f212193s.get(), (tpi.j) aVar16.f212187l.get(), (l3l.b) bVar22.f212201l.get(), (l3l.h) bVar22.k.get());
                    default:
                        throw new AssertionError(i3);
                }
            case 9:
                n9b.a aVar18 = (n9b.a) obj3;
                n9b.c cVar9 = (n9b.c) obj2;
                if (i3 != 0) {
                    if (i3 == 1) {
                        return new t9b.e(cVar9.a());
                    }
                    throw new AssertionError(i3);
                }
                n9b.c cVar10 = aVar18.f213616a;
                n8b.a aVarA6 = cVar10.f213622a.a();
                vc.s.j(aVarA6);
                return new com.revolut.feature.retail.global_accounts.impl.onboarding.ui.a(new t9b.c(aVarA6, cVar10.f213623b.a(), new u9b.a()), (t9b.e) aVar18.f213617b.get(), new nd.m(new np.a()));
            case 10:
                return a();
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
                return g();
            case 17:
                ned.b bVar24 = (ned.b) obj3;
                if (i3 != 0) {
                    if (i3 == 1) {
                        return new bfd.h();
                    }
                    throw new AssertionError(i3);
                }
                cli.n nVar6 = (cli.n) bVar24.f214435b.get();
                SelectAlertTypeControllerContract$InputData selectAlertTypeControllerContract$InputData = bVar24.f214434a;
                efd.a aVarA7 = ((ned.e) obj2).f214446g.a();
                vc.s.j(aVarA7);
                return new bfd.g(nVar6, selectAlertTypeControllerContract$InputData, aVarA7);
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
                nk7.h hVar8 = (nk7.h) obj3;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new AssertionError(i3);
                    }
                    qk7.a myClaimsImageProvider = new qk7.a();
                    Intrinsics.checkNotNullParameter(myClaimsImageProvider, "myClaimsImageProvider");
                    return new vk7.k();
                }
                jki.p pVar5 = (jki.p) hVar8.f216683b.get();
                CFACClaimsListScreenContract$InputData cFACClaimsListScreenContract$InputData = hVar8.f216682a;
                si7.a aVarA8 = ((nk7.q) obj2).f216715a.a();
                vc.s.j(aVarA8);
                return new vk7.h(pVar5, cFACClaimsListScreenContract$InputData, aVarA8);
        }
    }
}
