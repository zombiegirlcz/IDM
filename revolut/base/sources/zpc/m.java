package zpc;

import android.app.Activity;
import android.content.Context;
import androidx.view.ComponentActivity;
import androidx.view.result.ActivityResultRegistry;
import ch.qos.logback.core.rolling.SizeBasedTriggeringPolicy;
import com.google.common.collect.ImmutableSet;
import com.onfido.android.sdk.capture.Onfido;
import com.onfido.android.sdk.capture.OnfidoFactory;
import com.onfido.workflow.OnfidoWorkflow;
import com.revolut.feature.kyc.impl.KycScreenContract$Configuration;
import com.revolut.feature.kyc.impl.choosedocument.review.DocumentReviewScreenContract$InputData;
import com.revolut.feature.kyc.impl.cmd.screen.CmdControllerContract$InputData;
import com.revolut.feature.kyc.impl.document_collection.document_selection.DocumentSelectionControllerContract$InputData;
import com.revolut.feature.kyc.impl.flow.kyc.KycFlowContract$InputData;
import com.revolut.feature.kyc.impl.flow.kyc_consolidated.KycConsolidatedFlowContract$InputData;
import com.revolut.feature.kyc.impl.fourthline.screen.FourthlineControllerContract$InputData;
import com.revolut.feature.kyc.impl.idnow.video_ident.screen.IdnowVideoIdentScreenContract$InputData;
import com.revolut.feature.kyc.impl.screens.chrome_portal.ChromePortalScreenContract$InputData;
import com.revolut.feature.kyc.impl.screens.documentid_input.KYCDocumentIdInputScreenContract$InputData;
import com.revolut.feature.kyc.impl.trustdock.icchip.TrustdockSdkFlowContract$InputData;
import com.revolut.feature.kyc.impl.trustdock.icchip.screen.TrustdockIcChipScreenContract$InputData;
import com.revolut.feature.rev_points.impl.ui.challenges.details.RevPointsChallengeDetailsScreenContract$InputData;
import com.revolut.feature.rev_points.impl.ui.earn.RevPointsEarnScreenContract$InputData;
import com.revolut.feature.rev_points.impl.ui.post_onboarding_personalisation.flow.RevPointsPostOnboardingPersonalisationFlowContract$InputData;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.consent_prompt_precondition.ConsentPromptPreconditionScreenContract$InputData;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.progress.AccountClosureProgressScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import cu8.g1;
import cu8.i1;
import f60.z;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import jzb.a0;
import jzb.b0;
import jzb.d0;
import jzb.f0;
import jzb.h0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import nyb.i0;
import qgk.k3;
import t80.e;
import z0h.q1;
import zu8.c0;
import zu8.e0;
import zu8.m0;
import zu8.s0;
import zu8.t0;
import zu8.u0;
import zu8.w0;
import zxb.k0;
import zxb.y0;

/* JADX INFO: loaded from: classes6.dex */
public final class m implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f324272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f324273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f324274c;
    public final Object d;

    public /* synthetic */ m(Object obj2, Object obj3, int i, int i2) {
        this.f324272a = i2;
        this.f324273b = obj2;
        this.d = obj3;
        this.f324274c = i;
    }

    private final Object a() {
        u0 u0Var = (u0) this.f324273b;
        t0 t0Var = (t0) this.d;
        int i = this.f324274c;
        switch (i) {
            case 0:
                return new ry8.d(bq.i.b(t0Var.f325367a), new sy8.b((ny8.a) t0Var.f325369c.v.get()), e4m.b.a(t0Var.e), e4m.b.a(t0Var.f), (vw8.a) u0Var.f325401w.get());
            case 1:
                Activity activity = bq.i.b(t0Var.f325367a);
                ry8.e.Companion.getClass();
                Intrinsics.checkNotNullParameter(activity, "activity");
                Onfido client = OnfidoFactory.INSTANCE.create(activity).getClient();
                vc.s.k(client);
                return client;
            case 2:
                Activity activity2 = bq.i.b(t0Var.f325367a);
                ry8.e.Companion.getClass();
                Intrinsics.checkNotNullParameter(activity2, "activity");
                OnfidoWorkflow onfidoWorkflowCreate = OnfidoWorkflow.INSTANCE.create(activity2);
                vc.s.k(onfidoWorkflowCreate);
                return onfidoWorkflowCreate;
            case 3:
                t0Var.getClass();
                return new xpi.c(xpi.f.d, bq.i.b(t0Var.f325367a));
            case 4:
                return kpi.f.a();
            case 5:
                Context contextI = bq.i.i(t0Var.f325367a);
                BaseDelegatesActivity baseDelegatesActivityF = bq.i.f(t0Var.f325367a);
                t70.g gVarO = u0Var.f325388b.o();
                vc.s.j(gVarO);
                return new npi.c(contextI, baseDelegatesActivityF, gVarO);
            case 6:
                return new tpi.i((rpi.c) t0Var.k.get(), gsi.c.a(t0Var.f325367a));
            case 7:
                return new rpi.b(bq.i.b(t0Var.f325367a));
            case 8:
                return new rpi.h(bq.i.b(t0Var.f325367a));
            case 9:
                return new iri.g((iri.j) u0Var.f325400t.get(), (iri.m) u0Var.u.get(), bq.i.f(t0Var.f325367a), bq.i.l(t0Var.f325367a));
            case 10:
                return new iri.l((iri.m) u0Var.u.get(), bq.i.f(t0Var.f325367a), (iri.d) t0Var.o.get());
            case 11:
                return new iri.d(bq.i.f(t0Var.f325367a));
            case 12:
                return new opi.b(bq.i.f(t0Var.f325367a));
            case 13:
                t0Var.getClass();
                return new cn.d(ImmutableSet.copyOf((Collection) dn.b.a()), (cn.e) u0Var.f325402x.get(), u0Var.d());
            case 14:
                um.c cVar = (um.c) u0Var.f325403y.get();
                t0Var.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(6);
                u0 u0Var2 = t0Var.f325369c;
                builderBuilderWithExpectedSize.add(u0Var2.I.get());
                hn.h hVar = (hn.h) u0Var2.J.get();
                t70.g gVarO2 = u0Var2.f325388b.o();
                vc.s.j(gVarO2);
                builderBuilderWithExpectedSize.add(new jn.a(hVar, gVarO2));
                builderBuilderWithExpectedSize.add(new vm.b(com.google.android.gms.internal.mlkit_vision_face.a.f()));
                builderBuilderWithExpectedSize.add(u0Var2.h());
                builderBuilderWithExpectedSize.addAll((Iterable) in.g.a());
                builderBuilderWithExpectedSize.add(new jn.d(e4m.b.a(t0Var.f325379s)));
                return new in.e(cVar, builderBuilderWithExpectedSize.build(), u0Var.d());
            case 15:
                return bq.i.t(t0Var.f325367a);
            case 16:
                t0Var.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize2 = ImmutableSet.builderWithExpectedSize(4);
                builderBuilderWithExpectedSize2.addAll((Iterable) kn.g.a());
                builderBuilderWithExpectedSize2.add(t0Var.u.get());
                builderBuilderWithExpectedSize2.add(new kn.h(e4m.b.a(t0Var.f325373l)));
                builderBuilderWithExpectedSize2.add(new sx8.e((g3l.a) t0Var.f325369c.E.get()));
                return new kn.e(builderBuilderWithExpectedSize2.build(), (ym.d) u0Var.L.get(), u0Var.d());
            case 17:
                return new zm.a();
            case 18:
                return new ae7.i((upi.f) t0Var.B.get(), (t80.c) t0Var.z.get(), (d4l.a) u0Var.P.get(), (aqi.a) t0Var.D.get(), new ae7.j(), bq.i.l(t0Var.f325367a));
            case 19:
                Activity activityB = bq.i.b(t0Var.f325367a);
                y80.b bVar = new y80.b();
                g60.a aVar = (g60.a) t0Var.f325381w.get();
                xoi.d dVar = t0Var.f325367a;
                Activity activityB2 = bq.i.b(dVar);
                t80.g gVar = (t80.g) t0Var.f325382x.get();
                BaseDelegatesActivity baseDelegatesActivityF2 = bq.i.f(dVar);
                d4m.a aVarA = e4m.b.a(t0Var.f325383y);
                nli.a aVarG = t0Var.g();
                t80.g gVar2 = (t80.g) t0Var.f325382x.get();
                l70.e eVar = t0Var.f325369c.f325388b;
                zk0.b bVarL = eVar.l();
                vc.s.j(bVarL);
                oli.c cVar2 = new oli.c(gVar2, bVarL, t0Var.g(), (g60.a) t0Var.f325381w.get(), t0Var.h());
                ComponentActivity componentActivityA = gmf.b.a(dVar);
                ActivityResultRegistry activityResultRegistryA = pli.b.a(gmf.b.a(dVar));
                ami.n nVar = new ami.n(e4m.b.a(t0Var.A), 1);
                d4m.a aVarA2 = e4m.b.a(t0Var.f325383y);
                t80.g gVar3 = (t80.g) t0Var.f325382x.get();
                nli.a aVarG2 = t0Var.g();
                i90.b bVar2 = new i90.b();
                z70.a aVarF = eVar.f();
                vc.s.j(aVarF);
                c70.b bVar3 = new c70.b(aVarF, 2);
                z70.a aVarF2 = eVar.f();
                vc.s.j(aVarF2);
                return new upi.b(activityB, bVar, new t80.v(aVar, activityB2, gVar, baseDelegatesActivityF2, aVarA, aVarG, cVar2, new oli.g(componentActivityA, activityResultRegistryA, nVar, aVarA2, gVar3, aVarG2, bVar2, new u96.b(bVar3, new smd.s(aVarF2)), t0Var.h()), t0Var.h()));
            case 20:
                return new g60.a(bq.i.b(t0Var.f325367a));
            case 21:
                l70.e eVar2 = u0Var.f325388b;
                l70.e eVar3 = u0Var.f325388b;
                f80.a aVarX = eVar2.x();
                vc.s.j(aVarX);
                l80.e eVarH = eVar3.h();
                vc.s.j(eVarH);
                zk0.b bVarL2 = eVar3.l();
                vc.s.j(bVarL2);
                return new t80.b(aVarX, eVarH, bVarL2);
            case 22:
                return pli.c.a(new ks0.n(bq.i.f(t0Var.f325367a)));
            case 23:
                w0.Companion.getClass();
                return new t80.c(new e.a("kyc_internal"), SizeBasedTriggeringPolicy.DEFAULT_MAX_FILE_SIZE);
            case 24:
                return t96.a.a();
            case 25:
                return aqi.f.a(t0Var.f325367a, (aqi.d) t0Var.C.get());
            case 26:
                return new aqi.d(bq.i.b(t0Var.f325367a), new y80.b());
            case 27:
                t0Var.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize3 = ImmutableSet.builderWithExpectedSize(2);
                builderBuilderWithExpectedSize3.addAll((Iterable) hn.g.a());
                builderBuilderWithExpectedSize3.add(t0Var.f325369c.h());
                return new hn.d(builderBuilderWithExpectedSize3.build(), (hn.h) u0Var.J.get(), (npi.f) t0Var.f325372j.get());
            case 28:
                return new en.c(ImmutableSet.of((ln.d) t0Var.f325369c.K.get()), bq.i.l(t0Var.f325367a));
            case 29:
                return new gn.c((lpi.e) t0Var.H.get(), (sm.e) u0Var.Q.get(), ImmutableSet.copyOf((Collection) gn.e.a()), u0Var.d());
            case 30:
                return new lpi.b(bq.i.i(t0Var.f325367a), bq.i.j(t0Var.f325367a));
            case 31:
                t0Var.getClass();
                return new in.e(ImmutableSet.copyOf((Collection) pm.b.a()), (om.c) u0Var.R.get(), u0Var.d());
            case 32:
                return new wm.l((opi.d) t0Var.f325377q.get(), (wm.a) u0Var.B.get(), ImmutableSet.copyOf((Collection) xm.b.a()), u0Var.d());
            case 33:
                t0Var.getClass();
                return new iqi.b(iqi.g.f167870b, bq.i.b(t0Var.f325367a));
            case 34:
                t0Var.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize4 = ImmutableSet.builderWithExpectedSize(3);
                builderBuilderWithExpectedSize4.addAll((Iterable) g3l.f.a());
                builderBuilderWithExpectedSize4.add(t0Var.f325369c.S.get());
                builderBuilderWithExpectedSize4.add(t0Var.f());
                return new g3l.c(builderBuilderWithExpectedSize4.build(), (g3l.g) u0Var.E.get(), (k3l.b) t0Var.M.get(), u0Var.d());
            case 35:
                return new k3l.d(bq.i.b(t0Var.f325367a));
            case 36:
                return new com.revolut.retail.toast.mediator.a((d4l.a) u0Var.P.get(), (c4l.b) t0Var.O.get());
            case 37:
                return new c4l.e(bq.i.i(t0Var.f325367a), bq.i.g(t0Var.f325367a));
            case 38:
                e4m.e eVar4 = t0Var.f325371h;
                xoi.d dVar2 = t0Var.f325367a;
                xpi.g gVar4 = (xpi.g) eVar4.get();
                tpi.j jVar = (tpi.j) t0Var.f325373l.get();
                k3l.b bVar4 = (k3l.b) t0Var.M.get();
                ky8.a aVar2 = (ky8.a) t0Var.f325370g.get();
                i1 i1Var = (i1) u0Var.F.get();
                g1 g1Var = (g1) u0Var.A.get();
                sri.m mVarL = bq.i.l(dVar2);
                kpi.c cVar3 = (kpi.c) t0Var.i.get();
                KycScreenContract$Configuration kycScreenContract$Configuration = t0Var.f325368b;
                opi.d dVar3 = (opi.d) t0Var.f325377q.get();
                iqi.h hVar2 = (iqi.h) t0Var.L.get();
                tri.c cVarE = bq.i.e(dVar2);
                ju8.d dVarE = t0Var.e();
                ju8.f fVar = (ju8.f) u0Var.o.f325251w.get();
                vc.s.j(fVar);
                mm.d dVar4 = (mm.d) u0Var.z.get();
                f80.a aVarX2 = u0Var.f325388b.x();
                vc.s.j(aVarX2);
                q06.l lVarA = u0Var.f325396p.a();
                vc.s.j(lVarA);
                com.revolut.feature.kyc.impl.c cVar4 = new com.revolut.feature.kyc.impl.c(gVar4, jVar, bVar4, aVar2, i1Var, g1Var, mVarL, cVar3, kycScreenContract$Configuration, dVar3, hVar2, cVarE, dVarE, fVar, dVar4, aVarX2, lVarA);
                kli.a.p(cVar4, bq.i.d(dVar2));
                return cVar4;
            default:
                throw new AssertionError(i);
        }
    }

    private final Object b() {
        zxb.g gVar = (zxb.g) this.d;
        zxb.e eVar = (zxb.e) this.f324273b;
        k0 k0Var = eVar.f;
        int i = this.f324274c;
        if (i == 0) {
            bzb.a extension = (bzb.a) gVar.f326150b.get();
            czb.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(extension, "extension");
            vc.s.k(extension);
            return extension;
        }
        if (i == 1) {
            nyb.k kVarC = k0Var.c();
            vc.s.j(kVarC);
            return new bzb.a(kVarC, eVar.e());
        }
        if (i != 2) {
            throw new AssertionError(i);
        }
        dzb.k kVar = new dzb.k(new ozb.e());
        RevPointsChallengeDetailsScreenContract$InputData revPointsChallengeDetailsScreenContract$InputData = gVar.f326149a;
        q06.l lVarA = eVar.f326132r.a();
        vc.s.j(lVarA);
        nyb.k kVarC2 = k0Var.c();
        vc.s.j(kVarC2);
        return new dzb.i(kVar, revPointsChallengeDetailsScreenContract$InputData, lVarA, kVarC2, new pyb.c(eVar.e()), (bzb.a) gVar.f326150b.get());
    }

    private final Object c() {
        zxb.j jVar = (zxb.j) this.d;
        zxb.e eVar = (zxb.e) this.f324273b;
        int i = this.f324274c;
        switch (i) {
            case 0:
                fd6.a aVar = (fd6.a) jVar.e.get();
                va.g.t(aVar);
                return aVar;
            case 1:
                return va.g.s(((zc6.a) eVar.f326134t).d(), (xc6.a) jVar.d.get());
            case 2:
                return r6.b.k((zc6.a) eVar.f326134t, "factory");
            case 3:
                Object extension = (ztb.a) jVar.f326171g.get();
                izb.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                yji.n nVar = (yji.n) extension;
                vc.s.k(nVar);
                return nVar;
            case 4:
                z58.c cVar = eVar.f.j0;
                qy5.a provider = new qy5.a(cVar);
                izb.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(provider, "provider");
                Object obj2 = cVar.get();
                Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                ztb.a aVar2 = (ztb.a) obj2;
                vc.s.k(aVar2);
                return aVar2;
            case 5:
                Object extension2 = (hzb.a) jVar.i.get();
                izb.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension2, "extension");
                yji.n nVar2 = (yji.n) extension2;
                vc.s.k(nVar2);
                return nVar2;
            case 6:
                zxb.e eVar2 = jVar.f326170c;
                ldi.f fVarA = eVar2.o.a();
                vc.s.j(fVarA);
                p9g.g gVarA = eVar2.f326137y.a();
                a61.a aVarB = eVar2.A.b();
                edi.a aVar3 = (edi.a) eVar2.O.f173127b.get();
                vc.s.j(aVar3);
                b6c.c cVarB = eVar2.f326135w.b();
                vc.s.j(cVarB);
                gte.a aVarB2 = eVar2.f326124g.b();
                vc.s.j(aVarB2);
                h30.q qVarD = eVar2.f326136x.d();
                nyb.k kVarC = eVar2.f.c();
                vc.s.j(kVarC);
                hzb.i revPointsEarnRouter = new hzb.i(fVarA, gVarA, aVarB, aVar3, cVarB, aVarB2, qVarD, kVarC, eVar2.k.b());
                izb.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(revPointsEarnRouter, "revPointsEarnRouter");
                return revPointsEarnRouter;
            case 7:
                Object extension3 = (o1c.a) jVar.k.get();
                izb.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension3, "extension");
                yji.n nVar3 = (yji.n) extension3;
                vc.s.k(nVar3);
                return nVar3;
            case 8:
                vy9.a aVar4 = eVar.k.k;
                ugc.a provider2 = new ugc.a(aVar4);
                izb.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(provider2, "provider");
                Object obj3 = aVar4.get();
                Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
                o1c.a aVar5 = (o1c.a) obj3;
                vc.s.k(aVar5);
                return aVar5;
            case 9:
                return va.g.u((xc6.a) jVar.d.get());
            case 10:
                c0c.t view = jVar.f326168a;
                rkd.m factory = eVar.E.a();
                vc.s.j(factory);
                izb.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(factory, "factory");
                return factory.a(view);
            case 11:
                cli.n nVar4 = (cli.n) jVar.v.get();
                RevPointsEarnScreenContract$InputData revPointsEarnScreenContract$InputData = jVar.f326169b;
                e4m.e eVar3 = eVar.f326123e0;
                vub.f fVar = eVar.i;
                k0 k0Var = eVar.f;
                ozb.f fVar2 = (ozb.f) eVar3.get();
                nyb.k kVarC2 = k0Var.c();
                vc.s.j(kVarC2);
                ffk.t tVarF = eVar.f326125h.f();
                vc.s.j(tVarF);
                nyb.c cVar2 = (nyb.c) k0Var.Y.get();
                vc.s.j(cVar2);
                i0 i0VarF = k0Var.f();
                vc.s.j(i0VarF);
                rul.e eVarA = eVar.k.a();
                ztb.a aVar6 = (ztb.a) jVar.f326171g.get();
                hzb.a aVar7 = (hzb.a) jVar.i.get();
                q06.l lVarA = eVar.f326132r.a();
                vc.s.j(lVarA);
                mkd.d dVar = (mkd.d) jVar.f326176n.get();
                o1c.a aVar8 = (o1c.a) jVar.k.get();
                eub.a aVarA = k0Var.a();
                vc.s.j(aVarA);
                nyb.j jVarB = k0Var.b();
                vc.s.j(jVarB);
                p8g.c cVarB2 = eVar.f326137y.b();
                vc.s.j(cVarB2);
                hyf.a aVarA2 = eVar.A.a();
                vc.s.j(aVarA2);
                h4g.g gVarB = eVar.P.b();
                eub.h hVar = (eub.h) k0Var.f326194e0.get();
                vc.s.j(hVar);
                ldi.f fVarA2 = eVar.o.a();
                vc.s.j(fVarA2);
                wub.a aVarA3 = fVar.a();
                vc.s.j(aVarA3);
                qub.a aVar9 = (qub.a) fVar.f292304m.get();
                vc.s.j(aVar9);
                kcc.a aVar10 = (kcc.a) eVar.G.f172778q.get();
                vc.s.j(aVar10);
                com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) eVar.f326131q).c();
                vc.s.j(aVarC);
                i4b.f fVarB = ((zc6.a) eVar.f326134t).b();
                ang.f fVarE = eVar.Q.e();
                p19.a aVarA4 = ((o19.b) eVar.M).a();
                vc.s.j(aVarA4);
                gte.a aVarB3 = eVar.f326124g.b();
                vc.s.j(aVarB3);
                return new com.revolut.feature.rev_points.impl.ui.earn.b(nVar4, revPointsEarnScreenContract$InputData, fVar2, kVarC2, tVarF, cVar2, i0VarF, eVarA, aVar6, aVar7, lVarA, dVar, aVar8, aVarA, jVarB, cVarB2, aVarA2, gVarB, hVar, fVarA2, aVarA3, aVar9, aVar10, aVarC, fVarB, fVarE, aVarA4, aVarB3, eVar.v.i());
            case 12:
                return new jzb.v((jzb.s) jVar.o.get(), new h0(((k3) jVar.f326170c.f326133s).b()), (jzb.p) jVar.f326178q.get(), (d0) jVar.f326180s.get(), (jzb.l) jVar.u.get(), new jzb.x(), ((zc6.a) eVar.f326134t).c());
            case 13:
                return new jzb.t();
            case 14:
                return new jzb.r((fub.d) eVar.f0.get(), (jzb.b) jVar.f326177p.get());
            case 15:
                return new jzb.d(eVar.v.e(), (fub.d) eVar.f0.get());
            case 16:
                return new f0((a0) jVar.f326179r.get());
            case 17:
                return new b0();
            case 18:
                return new jzb.n((jzb.i) jVar.f326181t.get());
            case 19:
                return new jzb.j();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object d() {
        zxb.o oVar = (zxb.o) this.d;
        zxb.e eVar = (zxb.e) this.f324273b;
        k0 k0Var = eVar.f;
        zc6.b bVar = eVar.f326134t;
        int i = this.f324274c;
        if (i == 0) {
            fd6.a aVar = (fd6.a) oVar.d.get();
            va.g.t(aVar);
            return aVar;
        }
        if (i == 1) {
            return va.g.s(((zc6.a) bVar).d(), (xc6.a) oVar.f326232c.get());
        }
        if (i == 2) {
            return r6.b.k((zc6.a) bVar, "factory");
        }
        if (i == 3) {
            return va.g.u((xc6.a) oVar.f326232c.get());
        }
        if (i != 4) {
            throw new AssertionError(i);
        }
        zxb.e eVar2 = oVar.f326231b;
        cq9.m mVar = new cq9.m(new rzb.d(y0.w(eVar2.f326121c), new ozb.e(), ((zc6.a) eVar2.f326134t).c()), new rzb.a(), new rzb.b(), new os2.g(oVar.f326230a));
        u29.b bVar2 = (u29.b) ((t29.f) eVar.N).f267489j.get();
        vc.s.j(bVar2);
        eub.i iVarE = k0Var.e();
        vc.s.j(iVarE);
        nyb.k kVarC = k0Var.c();
        vc.s.j(kVarC);
        q06.l lVarA = eVar.f326132r.a();
        vc.s.j(lVarA);
        return new com.revolut.feature.rev_points.impl.ui.opt_in.screen.a(mVar, bVar2, iVarE, kVarC, lVarA, new k0c.a(), ((zc6.a) bVar).b(), oVar.f326230a);
    }

    @Override // phm.a
    public final Object get() throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object cVar;
        Object cVar2;
        Object cVar3;
        int i = this.f324272a;
        int i2 = this.f324274c;
        Object obj2 = this.d;
        Object obj3 = this.f324273b;
        switch (i) {
            case 0:
                k kVar = (k) obj3;
                if (i2 == 0) {
                    n nVar = (n) obj2;
                    return new com.revolut.feature.salary_switch.impl.ui.flow.a(nVar.f324275a, (drc.a) nVar.f324276b.get(), (vpc.a) kVar.C.get(), (aqc.k) kVar.G.get(), kVar.f324257j.b());
                }
                if (i2 == 1) {
                    return new drc.b();
                }
                throw new AssertionError(i2);
            case 1:
                k kVar2 = (k) obj3;
                p pVar = (p) obj2;
                if (i2 == 0) {
                    return new mrc.l((cli.n) pVar.f324282b.get(), pVar.f324281a, (aqc.k) kVar2.G.get(), kVar2.f324257j.b());
                }
                if (i2 == 1) {
                    return new mrc.m();
                }
                throw new AssertionError(i2);
            case 2:
                q qVar = (q) obj2;
                k kVar3 = (k) obj3;
                if (i2 == 0) {
                    mkd.g view = qVar.f324284a;
                    rkd.m factory = kVar3.o.a();
                    vc.s.j(factory);
                    src.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(view, "view");
                    Intrinsics.checkNotNullParameter(factory, "factory");
                    return factory.a(view);
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        return new rrc.i0(kVar3.f324259m.a(), qVar.f324285b);
                    }
                    throw new AssertionError(i2);
                }
                cli.n nVar2 = (cli.n) qVar.d.get();
                c70.a aVarZ = kVar3.f324256h.z();
                vc.s.j(aVarZ);
                return new rrc.f0(nVar2, aVarZ, qVar.f324285b, kVar3.f324252a.e(), (vpc.a) kVar3.C.get(), (mkd.d) qVar.f324286c.get(), kVar3.f324257j.b(), kVar3.f324258l.b(), (wpc.b) kVar3.D.get());
            case 3:
                zrk.c cVar4 = (zrk.c) obj3;
                zrk.a aVar = (zrk.a) obj2;
                switch (i2) {
                    case 0:
                        return kpi.f.a();
                    case 1:
                        Context contextI = bq.i.i(aVar.f324743a);
                        BaseDelegatesActivity baseDelegatesActivityF = bq.i.f(aVar.f324743a);
                        t70.g gVarO = cVar4.f324756a.o();
                        vc.s.j(gVarO);
                        return new npi.c(contextI, baseDelegatesActivityF, gVarO);
                    case 2:
                        return new tpi.i((rpi.c) aVar.f324747h.get(), gsi.c.a(aVar.f324743a));
                    case 3:
                        return new rpi.b(bq.i.b(aVar.f324743a));
                    case 4:
                        return new rpi.h(bq.i.b(aVar.f324743a));
                    case 5:
                        return new iri.g((iri.j) cVar4.f324761j.get(), (iri.m) cVar4.k.get(), bq.i.f(aVar.f324743a), bq.i.l(aVar.f324743a));
                    case 6:
                        return new iri.l((iri.m) cVar4.k.get(), bq.i.f(aVar.f324743a), (iri.d) aVar.f324749l.get());
                    case 7:
                        return new iri.d(bq.i.f(aVar.f324743a));
                    case 8:
                        return new opi.b(bq.i.f(aVar.f324743a));
                    case 9:
                        return new en.c(ImmutableSet.of((ln.d) aVar.d.f324762l.get()), bq.i.l(aVar.f324743a));
                    case 10:
                        aVar.getClass();
                        return new xpi.c(xpi.f.d, bq.i.b(aVar.f324743a));
                    default:
                        throw new AssertionError(i2);
                }
            case 4:
                zrk.c cVar5 = (zrk.c) obj3;
                zrk.e eVar = (zrk.e) obj2;
                switch (i2) {
                    case 0:
                        return kpi.f.a();
                    case 1:
                        Context contextI2 = bq.i.i(eVar.f324768a);
                        BaseDelegatesActivity baseDelegatesActivityF2 = bq.i.f(eVar.f324768a);
                        t70.g gVarO2 = cVar5.f324756a.o();
                        vc.s.j(gVarO2);
                        return new npi.c(contextI2, baseDelegatesActivityF2, gVarO2);
                    case 2:
                        return new tpi.i((rpi.c) eVar.f324771g.get(), gsi.c.a(eVar.f324768a));
                    case 3:
                        return new rpi.b(bq.i.b(eVar.f324768a));
                    case 4:
                        return new rpi.h(bq.i.b(eVar.f324768a));
                    case 5:
                        return new iri.g((iri.j) cVar5.f324761j.get(), (iri.m) cVar5.k.get(), bq.i.f(eVar.f324768a), bq.i.l(eVar.f324768a));
                    case 6:
                        return new iri.l((iri.m) cVar5.k.get(), bq.i.f(eVar.f324768a), (iri.d) eVar.k.get());
                    case 7:
                        return new iri.d(bq.i.f(eVar.f324768a));
                    case 8:
                        return new opi.b(bq.i.f(eVar.f324768a));
                    case 9:
                        return new xpi.c(eVar.f324769b, bq.i.b(eVar.f324768a));
                    case 10:
                        return new en.c(ImmutableSet.of((ln.d) eVar.d.f324762l.get()), bq.i.l(eVar.f324768a));
                    default:
                        throw new AssertionError(i2);
                }
            case 5:
                ztg.i iVar = (ztg.i) obj2;
                ztg.n nVar3 = (ztg.n) obj3;
                u8h.c cVar6 = nVar3.f325155m;
                if (i2 == 0) {
                    return a10.b.f((u8h.b) cVar6, "factory");
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        return a10.b.g((u8h.b) cVar6, "factory");
                    }
                    throw new AssertionError(i2);
                }
                wug.m mVar = new wug.m((q1) iVar.e.get());
                AccountClosureProgressScreenContract$InputData accountClosureProgressScreenContract$InputData = iVar.f325137b;
                ktg.a aVar2 = (ktg.a) nVar3.f325162w.get();
                ybl.k kVarD = nVar3.i.d();
                vc.s.j(kVarD);
                return new wug.j(mVar, accountClosureProgressScreenContract$InputData, aVar2, kVarD, (aah.h) iVar.d.get());
            case 6:
                ztg.n nVar4 = (ztg.n) obj3;
                ztg.j jVar = (ztg.j) obj2;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new AssertionError(i2);
                    }
                    gte.a aVarB = jVar.f325140b.k.b();
                    vc.s.j(aVarB);
                    return new com.revolut.feature.wealth.account_closure.impl.ui.screens.consent_prompt_precondition.c(new fug.c(aVarB), jVar.f325139a);
                }
                kug.h hVar = (kug.h) jVar.f325141c.get();
                ConsentPromptPreconditionScreenContract$InputData consentPromptPreconditionScreenContract$InputData = jVar.f325139a;
                ktg.a aVar3 = (ktg.a) nVar4.f325162w.get();
                ybl.k kVarD2 = nVar4.i.d();
                vc.s.j(kVarD2);
                return new com.revolut.feature.wealth.account_closure.impl.ui.screens.consent_prompt_precondition.b(hVar, consentPromptPreconditionScreenContract$InputData, aVar3, kVarD2, nVar4.f325154l.f(), new kug.a());
            case 7:
                ztg.n nVar5 = (ztg.n) obj3;
                ztg.k kVar4 = (ztg.k) obj2;
                if (i2 == 0) {
                    return new uug.j((cli.n) kVar4.f325143b.get(), (ktg.a) nVar5.f325162w.get(), kVar4.f325142a, new m4f.b());
                }
                if (i2 == 1) {
                    return new uug.k();
                }
                throw new AssertionError(i2);
            case 8:
                zu8.d dVar = (zu8.d) obj2;
                if (i2 == 0) {
                    ChromePortalScreenContract$InputData chromePortalScreenContract$InputData = dVar.f325255a;
                    f80.a aVarX = ((c0) obj3).f325244m.x();
                    vc.s.j(aVarX);
                    return new yw8.e(chromePortalScreenContract$InputData, aVarX, (ks8.k) dVar.f325257c.get());
                }
                if (i2 != 1) {
                    throw new AssertionError(i2);
                }
                ViewController controller = dVar.f325256b;
                zw8.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller, "controller");
                return new cu8.d(controller.m2());
            case 9:
                c0 c0Var = (c0) obj3;
                l70.e eVar2 = c0Var.f325244m;
                zu8.e eVar3 = (zu8.e) obj2;
                c0 c0Var2 = eVar3.f325262b;
                if (i2 == 0) {
                    zjh.i iVar2 = new zjh.i(c0Var2.f325243l.b());
                    om0.b bVarC = c0Var.f325245n.c();
                    vc.s.j(bVarC);
                    ru8.a.Companion.getClass();
                    by8.a aVar4 = new by8.a(false);
                    y80.a aVarR = eVar2.r();
                    vc.s.j(aVarR);
                    return new yx8.c(iVar2, bVarC, aVar4, aVarR);
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        return new qu8.n();
                    }
                    if (i2 != 3) {
                        throw new AssertionError(i2);
                    }
                    ru8.a.Companion.getClass();
                    return px8.c.f240583a;
                }
                CmdControllerContract$InputData cmdControllerContract$InputData = eVar3.f325261a;
                cli.n nVar6 = (cli.n) eVar3.d.get();
                f80.a aVarX2 = eVar2.x();
                vc.s.j(aVarX2);
                yx8.a aVar5 = (yx8.a) eVar3.f325263c.get();
                CmdControllerContract$InputData inputData = eVar3.f325261a;
                f80.a uriHelper = c0Var2.f325244m.x();
                vc.s.j(uriHelper);
                ru8.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(inputData, "inputData");
                Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
                return new qu8.m(cmdControllerContract$InputData, nVar6, aVarX2, aVar5, new kge.d(inputData.f77612b, uriHelper));
            case 10:
                c0 c0Var3 = (c0) obj3;
                zu8.i iVar3 = (zu8.i) obj2;
                switch (i2) {
                    case 0:
                        return f0k.d.p((e60.a) iVar3.f325291l.get());
                    case 1:
                        com.revolut.kompot.navigable.a aVar6 = (com.revolut.kompot.navigable.a) iVar3.d.get();
                        g60.a aVarA = f60.v.a((com.revolut.kompot.navigable.a) iVar3.d.get());
                        Activity activityA = f60.t.a((com.revolut.kompot.navigable.a) iVar3.d.get());
                        t80.g gVar = (t80.g) iVar3.e.get();
                        com.revolut.kompot.navigable.a aVar7 = (com.revolut.kompot.navigable.a) iVar3.d.get();
                        f60.y.a(aVar7);
                        d4m.a aVarA2 = e4m.b.a(iVar3.f);
                        nli.a aVar8 = new nli.a((t80.c) iVar3.f325288g.get(), f60.t.a((com.revolut.kompot.navigable.a) iVar3.d.get()));
                        t80.g gVar2 = (t80.g) iVar3.e.get();
                        zk0.b bVarL = iVar3.f325286b.f325244m.l();
                        vc.s.j(bVarL);
                        return v1.c.q(aVar6, new t80.v(aVarA, activityA, gVar, aVar7, aVarA2, aVar8, new oli.c(gVar2, bVarL, new nli.a((t80.c) iVar3.f325288g.get(), f60.t.a((com.revolut.kompot.navigable.a) iVar3.d.get())), f60.v.a((com.revolut.kompot.navigable.a) iVar3.d.get()), iVar3.c()), new oli.g(f60.u.a(f60.t.a((com.revolut.kompot.navigable.a) iVar3.d.get())), v1.c.e((com.revolut.kompot.navigable.a) iVar3.d.get()), new ami.n(e4m.b.a(iVar3.f325289h), 1), e4m.b.a(iVar3.f), (t80.g) iVar3.e.get(), new nli.a((t80.c) iVar3.f325288g.get(), f60.t.a((com.revolut.kompot.navigable.a) iVar3.d.get())), new i90.b(), iVar3.b(), iVar3.c()), iVar3.c()), f60.x.a(), (rp0.m) iVar3.i.get(), (e60.t) iVar3.k.get());
                    case 2:
                        l70.e eVar4 = c0Var3.f325244m;
                        l70.e eVar5 = c0Var3.f325244m;
                        f80.a aVarX3 = eVar4.x();
                        vc.s.j(aVarX3);
                        l80.e eVarH = eVar5.h();
                        vc.s.j(eVarH);
                        zk0.b bVarL2 = eVar5.l();
                        vc.s.j(bVarL2);
                        return new t80.b(aVarX3, eVarH, bVarL2);
                    case 3:
                        com.revolut.kompot.navigable.a aVar9 = (com.revolut.kompot.navigable.a) iVar3.d.get();
                        f60.y.a(aVar9);
                        return pli.c.a(new ks0.n(aVar9));
                    case 4:
                        nu8.b.Companion.getClass();
                        return new t80.c(new e.a("DocumentReview_kyc"), SizeBasedTriggeringPolicy.DEFAULT_MAX_FILE_SIZE);
                    case 5:
                        return t96.a.a();
                    case 6:
                        return z.a();
                    case 7:
                        aii.o oVar = (aii.o) iVar3.f325290j.get();
                        y80.a aVarR2 = c0Var3.f325244m.r();
                        vc.s.j(aVarR2);
                        return new e60.y(oVar, aVarR2, iVar3.b(), Optional.empty());
                    case 8:
                        e60.t tVar = (e60.t) iVar3.k.get();
                        f60.w.a(tVar);
                        return tVar;
                    case 9:
                        mu8.n nVar7 = new mu8.n(iVar3.f325285a);
                        DocumentReviewScreenContract$InputData documentReviewScreenContract$InputData = iVar3.f325285a;
                        e60.a aVar10 = (e60.a) iVar3.f325291l.get();
                        r80.c cVar7 = (r80.c) c0Var3.f325244m.Z.get();
                        vc.s.j(cVar7);
                        f80.a aVarX4 = c0Var3.f325244m.x();
                        vc.s.j(aVarX4);
                        return new mu8.l(nVar7, documentReviewScreenContract$InputData, aVar10, cVar7, aVarX4);
                    default:
                        throw new AssertionError(i2);
                }
            case 11:
                zu8.j jVar2 = (zu8.j) obj2;
                DocumentSelectionControllerContract$InputData documentSelectionControllerContract$InputData = jVar2.f325297a;
                c0 c0Var4 = (c0) obj3;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new AssertionError(i2);
                    }
                    n8b.a aVarA3 = c0Var4.o.a();
                    vc.s.j(aVarA3);
                    return new av8.r(aVarA3, documentSelectionControllerContract$InputData);
                }
                cli.n nVar8 = (cli.n) jVar2.f325298b.get();
                ot8.a aVar11 = (ot8.a) c0Var4.f325238b.f218990q.get();
                vc.s.j(aVar11);
                f80.a aVarX5 = c0Var4.f325244m.x();
                vc.s.j(aVarX5);
                return new com.revolut.feature.kyc.impl.document_collection.document_selection.a(nVar8, documentSelectionControllerContract$InputData, aVar11, aVarX5);
            case 12:
                c0 c0Var5 = (c0) obj3;
                zu8.l lVar = (zu8.l) obj2;
                if (i2 != 0) {
                    if (i2 == 1) {
                        return new gv8.m(new gv8.n(), (yx8.a) lVar.f325311c.get(), lVar.b(), new f61.a(lVar.b()));
                    }
                    if (i2 != 2) {
                        throw new AssertionError(i2);
                    }
                    hv8.a.Companion.getClass();
                    return gv8.o.f147088a;
                }
                zjh.i iVar4 = new zjh.i(lVar.f325310b.f325243l.b());
                om0.b bVarC2 = c0Var5.f325245n.c();
                vc.s.j(bVarC2);
                hv8.a.Companion.getClass();
                by8.a aVar12 = new by8.a(false);
                y80.a aVarR3 = c0Var5.f325244m.r();
                vc.s.j(aVarR3);
                return new yx8.c(iVar4, bVarC2, aVar12, aVarR3);
            case 13:
                zu8.o oVar2 = (zu8.o) obj2;
                c0 c0Var6 = (c0) obj3;
                if (i2 == 0) {
                    FourthlineControllerContract$InputData fourthlineControllerContract$InputData = oVar2.f325327a;
                    t3i.m mVar2 = new t3i.m(e4m.b.a(oVar2.f325329c));
                    Activity activity = oVar2.f325328b;
                    mt8.d dVarB = c0Var6.f325238b.b();
                    vc.s.j(dVarB);
                    return new vv8.q(fourthlineControllerContract$InputData, mVar2, activity, dVarB, new vv8.s());
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new AssertionError(i2);
                    }
                    th0.j.a();
                    return new vv8.r(new vv8.a());
                }
                u3i.b.Companion.getClass();
                Object objNewInstance = Class.forName("com.revolut.feature_fourthline.FourthlineSdkImpl").getDeclaredConstructor(null).newInstance(null);
                Intrinsics.i(objNewInstance, "null cannot be cast to non-null type com.revolut.feature_fourthline.FourthlineSdk");
                return (t3i.j) objNewInstance;
            case 14:
                c0 c0Var7 = (c0) obj3;
                zu8.w wVar = (zu8.w) obj2;
                if (i2 == 0) {
                    zjh.i iVar5 = new zjh.i(wVar.f325408b.f325243l.b());
                    om0.b bVarC3 = c0Var7.f325245n.c();
                    vc.s.j(bVarC3);
                    jw8.b.Companion.getClass();
                    by8.a aVar13 = new by8.a(false);
                    y80.a aVarR4 = c0Var7.f325244m.r();
                    vc.s.j(aVarR4);
                    return new yx8.c(iVar5, bVarC3, aVar13, aVarR4);
                }
                if (i2 != 1) {
                    throw new AssertionError(i2);
                }
                yx8.a aVar14 = (yx8.a) wVar.f325409c.get();
                nx8.a aVar15 = new nx8.a();
                IdnowVideoIdentScreenContract$InputData idnowVideoIdentScreenContract$InputData = wVar.f325407a;
                gte.a aVarB2 = c0Var7.d.b();
                vc.s.j(aVarB2);
                iw8.n nVar9 = new iw8.n();
                IdnowVideoIdentScreenContract$InputData inputData2 = wVar.f325407a;
                jw8.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(inputData2, "inputData");
                return new com.revolut.feature.kyc.impl.idnow.video_ident.screen.a(aVar14, aVar15, idnowVideoIdentScreenContract$InputData, aVarB2, nVar9, new fmc.z(inputData2.f77795b));
            case 15:
                zu8.z zVar = (zu8.z) obj2;
                if (i2 == 0) {
                    return new lw8.h(zVar.f325415a, (lw8.e) zVar.f.get());
                }
                if (i2 == 1) {
                    Activity activity2 = (Activity) zVar.d.get();
                    d4m.a incodeSdkProvider = e4m.b.a(zVar.e);
                    ny8.a kycDocumentsScanFeatureTogglesProvider = (ny8.a) ((c0) obj3).B.get();
                    mw8.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(activity2, "activity");
                    Intrinsics.checkNotNullParameter(incodeSdkProvider, "incodeSdkProvider");
                    Intrinsics.checkNotNullParameter(kycDocumentsScanFeatureTogglesProvider, "kycDocumentsScanFeatureTogglesProvider");
                    return new lw8.e(activity2, incodeSdkProvider, kycDocumentsScanFeatureTogglesProvider);
                }
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new AssertionError(i2);
                    }
                    mw8.d.Companion.getClass();
                    Object objNewInstance2 = Class.forName("com.revolut.feature_incode_sdk.IncodeSdkProviderImpl").getDeclaredConstructor(null).newInstance(null);
                    Intrinsics.i(objNewInstance2, "null cannot be cast to non-null type com.revolut.feature.kyc_documents_scan.api.externalkyc.incode.IncodeSdkProvider");
                    return (ly8.g) objNewInstance2;
                }
                ViewController viewController = zVar.f325416b;
                mw8.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(viewController, "viewController");
                Activity activityM2 = viewController.m2();
                vc.s.k(activityM2);
                return activityM2;
            case 16:
                c0 c0Var8 = (c0) obj3;
                zu8.b0 b0Var = (zu8.b0) obj2;
                KYCDocumentIdInputScreenContract$InputData kYCDocumentIdInputScreenContract$InputData = b0Var.f325231a;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new AssertionError(i2);
                    }
                    rh1.b bVarA = c0Var8.f325249s.a();
                    vc.s.j(bVarA);
                    return new vi1.r(bVarA);
                }
                bx8.t tVar2 = new bx8.t(kYCDocumentIdInputScreenContract$InputData);
                KYCDocumentIdInputScreenContract$InputData kYCDocumentIdInputScreenContract$InputData2 = b0Var.f325231a;
                mre.c cVarB = c0Var8.f325248r.b();
                vc.s.j(cVarB);
                return new com.revolut.feature.kyc.impl.screens.documentid_input.b(tVar2, kYCDocumentIdInputScreenContract$InputData2, cVarB, new bx8.c(), new bx8.f(kYCDocumentIdInputScreenContract$InputData), b0Var.f325232b);
            case 17:
                zu8.d0 d0Var = (zu8.d0) obj2;
                c0 c0Var9 = (c0) obj3;
                nt8.a aVar16 = c0Var9.f325238b;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new AssertionError(i2);
                    }
                    n8b.a aVarA4 = c0Var9.o.a();
                    vc.s.j(aVarA4);
                    return new com.revolut.feature.kyc.impl.flow.kyc.provider.a(aVarA4);
                }
                KycConsolidatedFlowContract$InputData kycConsolidatedFlowContract$InputData = d0Var.f325258a;
                pv8.b bVar = (pv8.b) d0Var.e.get();
                ang.f fVarE = c0Var9.f.e();
                ot8.a aVar17 = (ot8.a) aVar16.f218990q.get();
                vc.s.j(aVar17);
                mt8.d dVarB2 = aVar16.b();
                vc.s.j(dVarB2);
                fk3.a aVarA5 = c0Var9.f325250t.a();
                vc.s.j(aVarA5);
                q89.e eVar6 = d0Var.f325259b;
                gte.a aVarB3 = c0Var9.d.b();
                vc.s.j(aVarB3);
                qd0.b bVarN = c0Var9.f325244m.n();
                vc.s.j(bVarN);
                return new com.revolut.feature.kyc.impl.flow.kyc_consolidated.c(kycConsolidatedFlowContract$InputData, bVar, fVarE, aVar17, dVarB2, aVarA5, eVar6, aVarB3, bVarN);
            case 18:
                c0 c0Var10 = (c0) obj3;
                e0 e0Var = (e0) obj2;
                qv8.b bVar2 = e0Var.f325264a;
                if (i2 == 0) {
                    vy8.a extension = (vy8.a) e0Var.f.get();
                    qy8.i.Companion.getClass();
                    Intrinsics.checkNotNullParameter(extension, "extension");
                    vc.s.k(extension);
                    return extension;
                }
                if (i2 == 1) {
                    return new vy8.b((fx8.a) e0Var.e.get());
                }
                if (i2 == 2) {
                    return new fx8.a(bVar2);
                }
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new AssertionError(i2);
                    }
                    n8b.a aVarA6 = c0Var10.o.a();
                    vc.s.j(aVarA6);
                    return new com.revolut.feature.kyc.impl.flow.kyc.provider.a(aVarA6);
                }
                KycFlowContract$InputData kycFlowContract$InputData = e0Var.f325265b;
                pv8.b bVar3 = (pv8.b) e0Var.f325268h.get();
                mre.c cVarB2 = c0Var10.f325248r.b();
                vc.s.j(cVarB2);
                return new com.revolut.feature.kyc.impl.flow.kyc.a(kycFlowContract$InputData, bVar3, bVar2, cVarB2, new vy8.d(new bs.a(), (vy8.a) e0Var.f.get()));
            case 19:
                c0 c0Var11 = (c0) obj3;
                if (i2 == 0) {
                    zu8.h0 h0Var = (zu8.h0) obj2;
                    TrustdockIcChipScreenContract$InputData trustdockIcChipScreenContract$InputData = h0Var.f325282a;
                    d4m.a aVarA7 = e4m.b.a(h0Var.f325283b);
                    z70.a aVarF = c0Var11.f325244m.f();
                    vc.s.j(aVarF);
                    return new jx8.f(trustdockIcChipScreenContract$InputData, aVarA7, aVarF);
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new AssertionError(i2);
                    }
                    th0.j.a();
                    kx8.b.Companion.getClass();
                    uh0.a dynamicDeliveryCompat = uh0.a.f280049a;
                    Intrinsics.checkNotNullParameter(dynamicDeliveryCompat, "dynamicDeliveryCompat");
                    Intrinsics.checkNotNullParameter(dynamicDeliveryCompat, "dynamicDeliveryCompat");
                    return new oi0.a();
                }
                kx8.b.Companion.getClass();
                try {
                    Object objNewInstance3 = Class.forName("com.revolut.trustdock_ic_chip.TrustdockIcChipSdkImpl").getDeclaredConstructor(null).newInstance(null);
                    Intrinsics.i(objNewInstance3, "null cannot be cast to non-null type com.revolut.feature_trustdock_ic_chip_api.TrustdockIcChipSdk");
                    return (hgi.a) objNewInstance3;
                } catch (Exception e) {
                    IllegalStateException illegalStateException = new IllegalStateException("Unable to load TrustdockIcChip SDK", e);
                    zhm.h0 h0Var2 = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var2);
                    return null;
                }
            case 20:
                zu8.i0 i0Var = (zu8.i0) obj2;
                c0 c0Var12 = (c0) obj3;
                l70.e eVar7 = c0Var12.f325244m;
                if (i2 != 0) {
                    if (i2 == 1) {
                        return new ix8.b();
                    }
                    throw new AssertionError(i2);
                }
                TrustdockSdkFlowContract$InputData trustdockSdkFlowContract$InputData = i0Var.f325294a;
                y80.a aVarR5 = eVar7.r();
                vc.s.j(aVarR5);
                ix8.a aVar18 = (ix8.a) i0Var.d.get();
                xg0.a aVarA8 = c0Var12.f325247q.a();
                vc.s.j(aVarA8);
                z70.a aVarF2 = eVar7.f();
                vc.s.j(aVarF2);
                return new com.revolut.feature.kyc.impl.trustdock.icchip.a(trustdockSdkFlowContract$InputData, aVarR5, aVar18, aVarA8, aVarF2);
            case 21:
                zu8.k0 k0Var = (zu8.k0) obj2;
                c0 c0Var13 = (c0) obj3;
                l70.e eVar8 = c0Var13.f325244m;
                if (i2 == 0) {
                    zjh.i iVar6 = new zjh.i(k0Var.f325306a.f325243l.b());
                    om0.b bVarC4 = c0Var13.f325245n.c();
                    vc.s.j(bVarC4);
                    rx8.a.Companion.getClass();
                    by8.a aVar19 = new by8.a(false);
                    y80.a aVarR6 = eVar8.r();
                    vc.s.j(aVarR6);
                    cVar = new yx8.c(iVar6, bVarC4, aVar19, aVarR6);
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new AssertionError(i2);
                        }
                        rx8.a.Companion.getClass();
                        return px8.c.f240583a;
                    }
                    qx8.q qVar2 = new qx8.q();
                    y80.a aVarR7 = eVar8.r();
                    vc.s.j(aVarR7);
                    nx8.a aVar20 = new nx8.a();
                    yx8.a aVar21 = (yx8.a) k0Var.f325307b.get();
                    rx8.a.Companion.getClass();
                    qx8.b.Companion.getClass();
                    cVar = new com.revolut.feature.kyc.impl.web_id.web_id_portal.a(qVar2, aVarR7, aVar20, aVar21, new qx8.b(new Regex("^https://revolut.com/app/video-conference/")));
                }
                return cVar;
            case 22:
                c0 c0Var14 = (c0) obj3;
                m0 m0Var = (m0) obj2;
                yv8.e inputData3 = m0Var.f325319b;
                if (i2 == 0) {
                    zjh.i iVar7 = new zjh.i(m0Var.f325320c.f325243l.b());
                    om0.b bVarC5 = c0Var14.f325245n.c();
                    vc.s.j(bVarC5);
                    zv8.c.Companion.getClass();
                    Intrinsics.checkNotNullParameter(inputData3, "inputData");
                    by8.a aVar22 = new by8.a(inputData3.f317143c);
                    y80.a aVarR8 = c0Var14.f325244m.r();
                    vc.s.j(aVarR8);
                    cVar2 = new yx8.c(iVar7, bVarC5, aVar22, aVarR8);
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new AssertionError(i2);
                        }
                        zv8.c.Companion.getClass();
                        return aw8.c.f10751a;
                    }
                    yv8.l lVar2 = new yv8.l();
                    yx8.a aVar23 = (yx8.a) m0Var.d.get();
                    zv8.c.Companion.getClass();
                    Intrinsics.checkNotNullParameter(inputData3, "inputData");
                    cVar2 = new yv8.k(lVar2, aVar23, new x8h.e(inputData3.f317142b, 1));
                }
                return cVar2;
            case 23:
                c0 c0Var15 = (c0) obj3;
                m0 m0Var2 = (m0) obj2;
                yv8.e inputData4 = m0Var2.f325319b;
                if (i2 == 0) {
                    zjh.i iVar8 = new zjh.i(m0Var2.f325320c.f325243l.b());
                    om0.b bVarC6 = c0Var15.f325245n.c();
                    vc.s.j(bVarC6);
                    zv8.c.Companion.getClass();
                    Intrinsics.checkNotNullParameter(inputData4, "inputData");
                    by8.a aVar24 = new by8.a(inputData4.f317143c);
                    y80.a aVarR9 = c0Var15.f325244m.r();
                    vc.s.j(aVarR9);
                    cVar3 = new yx8.c(iVar8, bVarC6, aVar24, aVarR9);
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new AssertionError(i2);
                        }
                        zv8.c.Companion.getClass();
                        return aw8.c.f10751a;
                    }
                    yv8.l lVar3 = new yv8.l();
                    yx8.a aVar25 = (yx8.a) m0Var2.d.get();
                    zv8.c.Companion.getClass();
                    Intrinsics.checkNotNullParameter(inputData4, "inputData");
                    cVar3 = new yv8.k(lVar3, aVar25, new x8h.e(inputData4.f317142b, 1));
                }
                return cVar3;
            case 24:
                u0 u0Var = (u0) obj3;
                s0 s0Var = (s0) obj2;
                switch (i2) {
                    case 0:
                        return kpi.f.a();
                    case 1:
                        Context contextI3 = bq.i.i(s0Var.f325353a);
                        BaseDelegatesActivity baseDelegatesActivityF3 = bq.i.f(s0Var.f325353a);
                        t70.g gVarO3 = u0Var.f325388b.o();
                        vc.s.j(gVarO3);
                        return new npi.c(contextI3, baseDelegatesActivityF3, gVarO3);
                    case 2:
                        return new tpi.i((rpi.c) s0Var.f.get(), gsi.c.a(s0Var.f325353a));
                    case 3:
                        return new rpi.b(bq.i.b(s0Var.f325353a));
                    case 4:
                        return new rpi.h(bq.i.b(s0Var.f325353a));
                    case 5:
                        return new iri.g((iri.j) u0Var.f325400t.get(), (iri.m) u0Var.u.get(), bq.i.f(s0Var.f325353a), bq.i.l(s0Var.f325353a));
                    case 6:
                        return new iri.l((iri.m) u0Var.u.get(), bq.i.f(s0Var.f325353a), (iri.d) s0Var.f325358j.get());
                    case 7:
                        return new iri.d(bq.i.f(s0Var.f325353a));
                    case 8:
                        return new opi.b(bq.i.f(s0Var.f325353a));
                    case 9:
                        nw8.e eVar9 = new nw8.e((nw8.g) s0Var.f325361n.get(), (nw8.h) s0Var.o.get(), (f9b.f) s0Var.f325362p.get(), (tpi.j) s0Var.f325356g.get());
                        kli.a.p(eVar9, bq.i.d(s0Var.f325353a));
                        return eVar9;
                    case 10:
                        return new nw8.c((z51.f) s0Var.f325360m.get(), s0Var.f325354b, (ifm.b) u0Var.f325399s.get());
                    case 11:
                        mt8.d dVarB3 = u0Var.f325389c.b();
                        vc.s.j(dVarB3);
                        m61.b bVar4 = (m61.b) u0Var.d.f202629n.get();
                        vc.s.j(bVar4);
                        ang.f fVarE2 = u0Var.e.e();
                        qd0.b bVarN2 = s0Var.f325355c.f325388b.n();
                        vc.s.j(bVarN2);
                        vfg.p pVar2 = new vfg.p(bVarN2);
                        kl.c0 c0Var16 = new kl.c0((nzc.d) ((izc.a) u0Var.f).e.get());
                        mt8.a aVarA9 = u0Var.f325389c.a();
                        vc.s.j(aVarA9);
                        return new z51.e(dVarB3, bVar4, fVarE2, pVar2, c0Var16, aVarA9);
                    case 12:
                        nw8.g gVar3 = (nw8.g) s0Var.f325361n.get();
                        npi.f fVar = (npi.f) s0Var.e.get();
                        sri.m mVarL = bq.i.l(s0Var.f325353a);
                        t70.g gVarO4 = u0Var.f325388b.o();
                        vc.s.j(gVarO4);
                        return new nw8.f(gVar3, fVar, mVarL, gVarO4);
                    case 13:
                        return bq.i.t(s0Var.f325353a);
                    default:
                        throw new AssertionError(i2);
                }
            case 25:
                return a();
            case 26:
                return b();
            case 27:
                return c();
            case 28:
                return d();
            default:
                k0 k0Var2 = ((zxb.e) obj3).f;
                zxb.q qVar3 = (zxb.q) obj2;
                if (i2 == 0) {
                    RevPointsPostOnboardingPersonalisationFlowContract$InputData revPointsPostOnboardingPersonalisationFlowContract$InputData = qVar3.f326243a;
                    eub.k kVar5 = (eub.k) k0Var2.Q.get();
                    vc.s.j(kVar5);
                    return new com.revolut.feature.rev_points.impl.ui.post_onboarding_personalisation.flow.a(revPointsPostOnboardingPersonalisationFlowContract$InputData, kVar5, (lzb.c) qVar3.d.get());
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new AssertionError(i2);
                    }
                    lzb.c extension2 = (lzb.c) qVar3.d.get();
                    Intrinsics.checkNotNullParameter(extension2, "extension");
                    vc.s.k(extension2);
                    return extension2;
                }
                jid.z factory2 = k0Var2.h();
                Intrinsics.checkNotNullParameter(factory2, "factory");
                Object obj4 = ((phm.a) factory2.f174462c).get();
                Intrinsics.checkNotNullExpressionValue(obj4, "get(...)");
                lzb.c cVar8 = (lzb.c) obj4;
                vc.s.k(cVar8);
                return cVar8;
        }
    }
}
