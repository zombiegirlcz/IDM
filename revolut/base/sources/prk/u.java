package prk;

import android.content.Context;
import android.os.Parcelable;
import com.google.common.collect.ImmutableSet;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.retail.feature.pricing_plans.ui.impl.network.LegacyPricingPlanOffersService;
import com.revolut.retail.feature.pricing_plans.ui.impl.network.PricingPlanOffersService;
import cu8.r0;
import grl.k9;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import qgk.a2;
import qgk.c3;
import qgk.f3;
import qgk.g3;
import qgk.h3;
import qgk.i3;
import qgk.m2;
import qgk.s3;
import qgk.z0;
import ql7.g2;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import ulm.a1;
import ulm.b1;

/* JADX INFO: loaded from: classes12.dex */
public final class u implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f239300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f239301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f239302c;

    public /* synthetic */ u(Object obj2, int i, int i2) {
        this.f239300a = i2;
        this.f239302c = obj2;
        this.f239301b = i;
    }

    @Override // phm.a
    public final Object get() {
        int i = this.f239300a;
        int i2 = 2;
        int i3 = this.f239301b;
        Object obj2 = this.f239302c;
        switch (i) {
            case 0:
                v vVar = (v) obj2;
                if (i3 == 0) {
                    return new ovk.i(vVar.f239303a, (ovk.a) vVar.f239304b.get(), (jki.p) vVar.f239305c.get());
                }
                if (i3 == 1) {
                    return new com.revolut.retail.feature.stockdetails.impl.ui.screens.glossary.a();
                }
                if (i3 == 2) {
                    return new ovk.j();
                }
                throw new AssertionError(i3);
            case 1:
                if (i3 == 0) {
                    Context context = ((g0) obj2).f239139a;
                    p0.Companion.getClass();
                    Intrinsics.checkNotNullParameter(context, "context");
                    return sri.o.c(context, null, null, 14);
                }
                if (i3 != 1) {
                    throw new AssertionError(i3);
                }
                ask.b controllerFactory = new ask.b();
                Intrinsics.checkNotNullParameter(controllerFactory, "controllerFactory");
                return new ask.c();
            case 2:
                py5.b bVar = (py5.b) obj2;
                switch (i3) {
                    case 0:
                        hri.b bVar2 = bVar.f240685a;
                        return new ifm.b();
                    case 1:
                        hri.b bVar3 = bVar.f240685a;
                        return new iri.j();
                    case 2:
                        return new cn.e();
                    case 3:
                        return new um.c();
                    case 4:
                        bVar.getClass();
                        return new hn.h(ImmutableSet.copyOf((Collection) hn.f.a()));
                    case 5:
                        return new ln.c();
                    case 6:
                        return new ym.d();
                    case 7:
                        return new mm.d();
                    case 8:
                        return new sm.e();
                    case 9:
                        return new om.c();
                    case 10:
                        return new xx5.a();
                    default:
                        throw new AssertionError(i3);
                }
            case 3:
                q1e.b bVar4 = (q1e.b) obj2;
                ecm.q qVar = bVar4.f241423a;
                if (i3 == 0) {
                    return new a16.b(qVar, bVar4.f241424b, 12);
                }
                if (i3 == 1) {
                    return new ax4.c(qVar, bVar4.f241425c, bVar4.d, bVar4.e, 16);
                }
                throw new AssertionError(i3);
            case 4:
                q39.a aVar = (q39.a) obj2;
                ecm.q qVar2 = aVar.f241912a;
                if (i3 == 0) {
                    return new add.b(qVar2, 10);
                }
                if (i3 == 1) {
                    return new a16.b(qVar2, aVar.f241913b, 15);
                }
                throw new AssertionError(i3);
            case 5:
                apc.b bVar5 = (apc.b) obj2;
                switch (i3) {
                    case 0:
                        return new jhh.a((m1h.g) bVar5.e.get(), (m1h.d) bVar5.f.get(), (m1h.e) bVar5.f8146g.get(), 1);
                    case 1:
                        return new cpc.c(bVar5.f8144b.f());
                    case 2:
                        return new r4f.e();
                    case 3:
                        f80.a uriHelper = bVar5.d.x();
                        vc.s.j(uriHelper);
                        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
                        return new r4f.g();
                    case 4:
                        q4f.b.Companion.getClass();
                        return null;
                    case 5:
                        q4f.b.Companion.getClass();
                        k9 k9Var = k9.Trading;
                        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                        return com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
                    case 6:
                        return new p4f.a();
                    case 7:
                        q4f.b.Companion.getClass();
                        return null;
                    case 8:
                        q4f.b.Companion.getClass();
                        return Boolean.TRUE;
                    default:
                        throw new AssertionError(i3);
                }
            case 6:
                q7k.d dVar = (q7k.d) obj2;
                if (i3 == 0) {
                    return new i8k.a((cli.n) dVar.f242879b.get());
                }
                if (i3 == 1) {
                    return new i8k.c(dVar.f242878a);
                }
                throw new AssertionError(i3);
            case 7:
                if (i3 != 0) {
                    if (i3 == 1) {
                        return new f9j.a();
                    }
                    throw new AssertionError(i3);
                }
                rc5.b bVar6 = ((q8j.c) obj2).f;
                qud.c cVar = bVar6.f253197a;
                yud.g gVarD = cVar.d();
                ang.f fVarE = bVar6.f253199c.e();
                wwd.d dVarJ = cVar.j();
                sud.b bVarI = cVar.i();
                gte.a aVarB = bVar6.f253198b.b();
                vc.s.j(aVarB);
                return new dd5.f(gVarD, fVarE, dVarJ, bVarI, aVarB);
            case 8:
                qbj.n nVar = (qbj.n) obj2;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new AssertionError(i3);
                    }
                    Context context2 = nVar.f244321a;
                    qbj.d.Companion.getClass();
                    Intrinsics.checkNotNullParameter(context2, "context");
                    return sri.o.c(context2, null, null, 14);
                }
                sri.m mVar = (sri.m) nVar.e.get();
                kbj.d dVar2 = (kbj.d) ((qbj.m) nVar.f244322b).f244312h.get();
                vc.s.j(dVar2);
                xoj.a aVarA = nVar.f244323c.a();
                vc.s.j(aVarA);
                ai5.b bVarB = nVar.d.b();
                vc.s.j(bVarB);
                return new kbj.c(mVar, dVar2, aVarA, bVarB);
            case 9:
                qbj.q qVar3 = (qbj.q) obj2;
                l70.e eVar = qVar3.i;
                if (i3 == 0) {
                    Context context3 = qVar3.f244336m;
                    qbj.g.Companion.getClass();
                    Intrinsics.checkNotNullParameter(context3, "context");
                    return new f01.c(context3);
                }
                if (i3 != 1) {
                    throw new AssertionError(i3);
                }
                s70.a aVarM = eVar.m();
                vc.s.j(aVarM);
                y80.a aVarR = eVar.r();
                vc.s.j(aVarR);
                return new pn3.b(aVarM, aVarR);
            case 10:
                qd2.f fVar = (qd2.f) obj2;
                uw1.b bVar7 = fVar.f244834a;
                if (i3 == 0) {
                    return new pd2.a();
                }
                if (i3 == 1) {
                    uy1.b factory = ((lz1.m) bVar7).b();
                    vc.s.j(factory);
                    qd2.d.Companion.getClass();
                    Intrinsics.checkNotNullParameter(factory, "factory");
                    zz1.h.Companion.getClass();
                    return factory.a(zz1.h.f326489l);
                }
                if (i3 == 2) {
                    return new td2.a();
                }
                if (i3 == 3) {
                    hy1.j0 j0Var = (hy1.j0) ((ey1.e) fVar.e).N.get();
                    vc.s.j(j0Var);
                    td2.b bVar8 = new td2.b((c12.f) fVar.f244842n.get());
                    od2.a aVar2 = (od2.a) fVar.f.f244833b.get();
                    vc.s.j(aVar2);
                    return new td2.d(j0Var, bVar8, aVar2);
                }
                if (i3 != 4) {
                    throw new AssertionError(i3);
                }
                uy1.m factory2 = (uy1.m) ((lz1.m) bVar7).T.get();
                vc.s.j(factory2);
                vw1.b aliasRepository = (vw1.b) fVar.f244841m.get();
                qd2.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory2, "factory");
                Intrinsics.checkNotNullParameter(aliasRepository, "repository");
                Intrinsics.checkNotNullParameter(aliasRepository, "aliasRepository");
                return new uy1.o(factory2.f284048a, aliasRepository);
            case 11:
                qd2.k kVar = (qd2.k) obj2;
                a31.a aVar3 = kVar.f244857b;
                ecm.q qVar4 = kVar.f244856a;
                if (i3 == 0) {
                    return new qd2.a(aVar3, qVar4);
                }
                if (i3 == 1) {
                    return new qd2.b(qVar4, kVar.f244858c, kVar.d, kVar.e, kVar.f, kVar.f244859g, aVar3, kVar.f244860h, kVar.i, kVar.f244864n, kVar.f244861j, kVar.k, kVar.f244862l);
                }
                if (i3 != 2) {
                    throw new AssertionError(i3);
                }
                qd2.e eVar2 = (qd2.e) ((qd2.a) kVar.f244863m.get()).b();
                vc.s.k(eVar2);
                return eVar2;
            case 12:
                if (i3 == 0) {
                    return new cmk.g((cli.n) ((qgk.h0) obj2).f245995a.get());
                }
                if (i3 == 1) {
                    return new cmk.h();
                }
                throw new AssertionError(i3);
            case 13:
                if (i3 == 0) {
                    return new mmk.d((cli.n) ((qgk.o0) obj2).f246172a.get());
                }
                if (i3 == 1) {
                    return new mmk.e();
                }
                throw new AssertionError(i3);
            case 14:
                z0 z0Var = (z0) obj2;
                if (i3 == 0) {
                    return new hnk.c((cli.n) z0Var.f246350b.get(), z0Var.f246349a);
                }
                if (i3 == 1) {
                    return new hnk.d();
                }
                throw new AssertionError(i3);
            case 15:
                a2 a2Var = (a2) obj2;
                if (i3 == 0) {
                    return new qkk.i((cli.n) a2Var.f245880b.get(), a2Var.f245879a);
                }
                if (i3 == 1) {
                    return new qkk.j();
                }
                throw new AssertionError(i3);
            case 16:
                m2 m2Var = (m2) obj2;
                if (i3 == 0) {
                    return new wmk.o((cli.n) m2Var.f246140c.get());
                }
                if (i3 == 1) {
                    return new wmk.r(m2Var.f246139b, new whk.a());
                }
                throw new AssertionError(i3);
            case 17:
                m2 m2Var2 = (m2) obj2;
                if (i3 == 0) {
                    return new wmk.o((cli.n) m2Var2.f246140c.get());
                }
                if (i3 == 1) {
                    return new wmk.r(m2Var2.f246139b, new whk.a());
                }
                throw new AssertionError(i3);
            case 18:
                c3 c3Var = (c3) obj2;
                if (i3 == 0) {
                    return new aok.l((cli.n) c3Var.d.get());
                }
                if (i3 == 1) {
                    return new aok.n(c3Var.f245909b, new dnk.l(c3Var.f245910c.e.g(), 0));
                }
                throw new AssertionError(i3);
            case 19:
                c3 c3Var2 = (c3) obj2;
                if (i3 == 0) {
                    return new aok.l((cli.n) c3Var2.d.get());
                }
                if (i3 == 1) {
                    return new aok.n(c3Var2.f245909b, new dnk.l(c3Var2.f245910c.e.g(), 0));
                }
                throw new AssertionError(i3);
            case 20:
                g3 g3Var = (g3) obj2;
                switch (i3) {
                    case 0:
                        return new lik.b(g3Var.u, g3Var.v, g3Var.f245987r, g3Var.f245985p, g3Var.f245989t, (f3) g3Var.f245991x.get());
                    case 1:
                        mhk.a factory3 = (mhk.a) g3Var.f245984n.get();
                        bgk.a planTermsWorkflowControllerExtension = (bgk.a) g3Var.f245985p.get();
                        xfk.b planDurableTermsControllerExtension = (xfk.b) g3Var.f245987r.get();
                        wfk.a globalPlansExtension = (wfk.a) g3Var.f245989t.get();
                        mik.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory3, "factory");
                        Intrinsics.checkNotNullParameter(planTermsWorkflowControllerExtension, "planTermsWorkflowControllerExtension");
                        Intrinsics.checkNotNullParameter(planDurableTermsControllerExtension, "planDurableTermsControllerExtension");
                        Intrinsics.checkNotNullParameter(globalPlansExtension, "globalPlansExtension");
                        return factory3.a(planTermsWorkflowControllerExtension, planDurableTermsControllerExtension, globalPlansExtension);
                    case 2:
                        sf0.h hVarB = g3Var.f245976a.b();
                        vc.s.j(hVarB);
                        efk.a aVar4 = g3Var.f245977b;
                        ffk.t tVarF = aVar4.f();
                        vc.s.j(tVarF);
                        r0 r0VarA = g3Var.f245978c.a();
                        fn2.c cVarB = g3Var.d.b();
                        xoj.a aVarA2 = g3Var.e.a();
                        vc.s.j(aVarA2);
                        cha.b bVarC = aVar4.c();
                        vc.s.j(bVarC);
                        i3 i3Var = g3Var.f;
                        a5h.g gVarB = i3Var.b();
                        ffk.t tVarF2 = aVar4.f();
                        vc.s.j(tVarF2);
                        cha.b bVarC2 = aVar4.c();
                        vc.s.j(bVarC2);
                        tbk.g gVar = (tbk.g) g3Var.f245979g.f223982r.get();
                        vc.s.j(gVar);
                        lhk.w wVar = new lhk.w(tVarF2, bVarC2, gVar, g3Var.f245980h.b());
                        wik.k kVar2 = new wik.k(fe0.c.a());
                        sh3.a aVarA3 = g3Var.i.a();
                        vc.s.j(aVarA3);
                        wik.u uVar = (wik.u) i3Var.Q.get();
                        vc.s.j(uVar);
                        return new mhk.a(hVarB, new lhk.r0(tVarF, r0VarA, cVarB, aVarA2, bVarC, gVarB, wVar, kVar2, aVarA3, uVar), new ylk.a());
                    case 3:
                        ohk.a factory4 = (ohk.a) g3Var.o.get();
                        mik.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory4, "factory");
                        return factory4.a();
                    case 4:
                        til.m mVarA = g3Var.f245981j.a();
                        vc.s.j(mVarA);
                        ffk.w wVar2 = (ffk.w) g3Var.f245977b.f125351t.get();
                        vc.s.j(wVar2);
                        return new ohk.a(mVarA, wVar2, new ohk.k(fe0.c.a()));
                    case 5:
                        fhk.a impl = (fhk.a) g3Var.f245986q.get();
                        mik.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(impl, "impl");
                        return impl.a();
                    case 6:
                        ylk.a aVar5 = new ylk.a();
                        ffk.t tVarF3 = g3Var.f245977b.f();
                        vc.s.j(tVarF3);
                        l80.h hVarV = g3Var.k.v();
                        vc.s.j(hVarV);
                        sh3.a aVarA4 = g3Var.i.a();
                        vc.s.j(aVarA4);
                        return new fhk.a(aVar5, tVarF3, new ehk.j(hVarV, aVarA4));
                    case 7:
                        dhk.a factory5 = (dhk.a) g3Var.f245988s.get();
                        mik.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory5, "factory");
                        return new dhk.e(factory5.f114822a);
                    case 8:
                        ffk.t tVarF4 = g3Var.f245977b.f();
                        vc.s.j(tVarF4);
                        r10.q qVarD = g3Var.f245982l.d();
                        gte.a aVarB2 = g3Var.f245983m.b();
                        vc.s.j(aVarB2);
                        return new dhk.a(new dhk.l(tVarF4, qVarD, aVarB2));
                    case 9:
                        gte.a aVarB3 = g3Var.f245983m.b();
                        vc.s.j(aVarB3);
                        phk.l impl2 = new phk.l(aVarB3);
                        mik.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(impl2, "impl");
                        return impl2;
                    case 10:
                        return new f3(this);
                    case 11:
                        gte.a aVarB4 = g3Var.f245983m.b();
                        vc.s.j(aVarB4);
                        return new yik.d(aVarB4);
                    case 12:
                        return new kik.a(g3Var.z);
                    case 13:
                        ffk.t tVarF5 = g3Var.f245977b.f();
                        vc.s.j(tVarF5);
                        egk.a aVar6 = (egk.a) g3Var.f.M.get();
                        vc.s.j(aVar6);
                        gte.a aVarB5 = g3Var.f245983m.b();
                        vc.s.j(aVarB5);
                        return new jik.i(tVarF5, aVar6, aVarB5, new jik.d(), new jik.j());
                    default:
                        throw new AssertionError(i3);
                }
            case 21:
                h3 h3Var = (h3) obj2;
                nj0.a aVar7 = h3Var.f246003b;
                if (i3 == 0) {
                    s3.Companion.getClass();
                    return new ne0.d();
                }
                if (i3 != 1) {
                    throw new AssertionError(i3);
                }
                Retrofit retrofit = ((nj0.d) aVar7).f();
                Json json = fe0.d.a();
                s3.Companion.getClass();
                Intrinsics.checkNotNullParameter(json, "json");
                rlm.o json2 = ue0.e.b(json, new b6b.b(json, i2));
                Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                Intrinsics.checkNotNullParameter(json2, "json");
                Retrofit.Builder builderNewBuilder = retrofit.newBuilder();
                builderNewBuilder.converterFactories().clear();
                b1.Companion.getClass();
                Retrofit retrofitBuild = builderNewBuilder.addConverterFactory(ek.b.a(json2, a1.a("application/json"))).build();
                Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
                vc.s.k(retrofitBuild);
                PricingPlanOffersService pricingPlanOffersService = (PricingPlanOffersService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofitBuild, "retrofit", PricingPlanOffersService.class, "create(...)");
                vc.s.k(pricingPlanOffersService);
                Retrofit retrofit3 = ((nj0.d) aVar7).f();
                kg.o gson = fe0.c.a();
                Intrinsics.checkNotNullParameter(retrofit3, "retrofit");
                Intrinsics.checkNotNullParameter(gson, "gson");
                Retrofit.Builder builderNewBuilder2 = retrofit3.newBuilder();
                builderNewBuilder2.converterFactories().clear();
                Retrofit retrofit4 = builderNewBuilder2.addConverterFactory(GsonConverterFactory.create(gson)).build();
                Intrinsics.checkNotNullExpressionValue(retrofit4, "build(...)");
                vc.s.k(retrofit4);
                Intrinsics.checkNotNullParameter(retrofit4, "retrofit");
                Object objCreate = retrofit4.create(LegacyPricingPlanOffersService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                LegacyPricingPlanOffersService legacyPricingPlanOffersService = (LegacyPricingPlanOffersService) objCreate;
                vc.s.k(legacyPricingPlanOffersService);
                ne0.j jVar = (ne0.j) h3Var.d.get();
                fn2.c cVar2 = new fn2.c(fe0.d.a());
                v60.e eVarA = h3Var.f246004c.a();
                vc.s.j(eVarA);
                return new kjk.o(pricingPlanOffersService, legacyPricingPlanOffersService, jVar, new kjk.e(cVar2, eVarA));
            case 22:
                qhh.a aVar8 = (qhh.a) obj2;
                zdl.c cVar3 = aVar8.f246605a;
                h9h.a aVar9 = aVar8.f246607c;
                if (i3 == 0) {
                    ybl.d dVarH = cVar3.h();
                    vc.s.j(dVarH);
                    gte.a aVarB6 = aVar8.f246606b.b();
                    vc.s.j(aVarB6);
                    return new ohh.c(dVarH, aVarB6);
                }
                if (i3 == 1) {
                    phh.c.Companion.getClass();
                    return null;
                }
                if (i3 == 2) {
                    ybl.d dVarH2 = cVar3.h();
                    vc.s.j(dVarH2);
                    return new ohh.d(dVarH2);
                }
                if (i3 == 3) {
                    return new ohh.b(aVar9.f(), new kpj.f(aVar9.H()));
                }
                if (i3 == 4) {
                    nd.o componentFactory = new nd.o();
                    Intrinsics.checkNotNullParameter(componentFactory, "componentFactory");
                    return new g5f.b(aVar8, 2);
                }
                if (i3 != 5) {
                    throw new AssertionError(i3);
                }
                phh.c.Companion.getClass();
                return null;
            case 23:
                ql7.a aVar10 = (ql7.a) obj2;
                ee0.a aVar11 = aVar10.f247221a;
                if (i3 == 0) {
                    return new if0.a(ImmutableSet.of((od0.e) aVar10.f247223c.get()));
                }
                if (i3 != 1) {
                    throw new AssertionError(i3);
                }
                je0.d mapper = aVar11.d();
                vc.s.j(mapper);
                yk0.a databaseSessionProvider = aVar10.f247222b.b();
                vc.s.j(databaseSessionProvider);
                xe0.f storageFactory = aVar11.f();
                vc.s.j(storageFactory);
                g2.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                return xe0.f.f(storageFactory, databaseSessionProvider, "car_insurance", mapper, 0, null, 56);
            case 24:
                ql7.d dVar3 = (ql7.d) obj2;
                if (i3 == 0) {
                    return new tq7.e((jki.p) dVar3.f247267b.get(), dVar3.f247266a);
                }
                if (i3 == 1) {
                    return new tq7.f();
                }
                throw new AssertionError(i3);
            case 25:
                ql7.g gVar2 = (ql7.g) obj2;
                if (i3 == 0) {
                    return new ln7.g((jki.p) gVar2.f247304b.get(), gVar2.f247303a);
                }
                if (i3 == 1) {
                    return new ln7.h();
                }
                throw new AssertionError(i3);
            case 26:
                ql7.h hVar = (ql7.h) obj2;
                if (i3 == 0) {
                    return new dq7.h((jki.p) hVar.f247314b.get(), hVar.f247313a);
                }
                if (i3 == 1) {
                    return new dq7.i();
                }
                throw new AssertionError(i3);
            case 27:
                ql7.k kVar3 = (ql7.k) obj2;
                switch (i3) {
                    case 0:
                        tl7.f fVar2 = (tl7.f) kVar3.e.get();
                        ufg.p0.l(fVar2);
                        return fVar2;
                    case 1:
                        return new tl7.f((j60.a) kVar3.d.get(), new vn7.a(), new in7.a(), new yl7.a(), new yl7.b(), new yl7.e());
                    case 2:
                        return h30.l.p((com.revolut.kompot.navigable.a) kVar3.f247347b.get(), (rp0.m) kVar3.f247348c.get());
                    case 3:
                        return new rp0.m();
                    case 4:
                        return kxa.j.l((j60.a) kVar3.d.get());
                    case 5:
                        return new no7.l((jki.p) kVar3.f247350h.get(), kVar3.f247346a, (tl7.f) kVar3.e.get(), new mo7.a());
                    case 6:
                        return new no7.m();
                    default:
                        throw new AssertionError(i3);
                }
            case 28:
                ql7.q qVar5 = (ql7.q) obj2;
                if (i3 == 0) {
                    tl7.f extension = (tl7.f) qVar5.f.get();
                    Intrinsics.checkNotNullParameter(extension, "extension");
                    vc.s.k(extension);
                    return extension;
                }
                if (i3 == 1) {
                    return ufg.p0.k((j60.a) qVar5.e.get(), new vn7.a(), new in7.a(), new yl7.a(), new yl7.b(), new yl7.e());
                }
                if (i3 == 2) {
                    return wp5.y.r((com.revolut.kompot.navigable.a) qVar5.f247432c.get(), (rp0.m) qVar5.d.get());
                }
                if (i3 == 3) {
                    return new rp0.m();
                }
                if (i3 == 4) {
                    return kxa.j.m((j60.a) qVar5.e.get());
                }
                if (i3 == 5) {
                    return new com.revolut.feature.insurance_car.impl.ui.flow.onboarding.car.b((tl7.f) qVar5.f.get());
                }
                throw new AssertionError(i3);
            default:
                ql7.s sVar = (ql7.s) obj2;
                if (i3 == 0) {
                    tl7.f extension2 = (tl7.f) sVar.f247459g.get();
                    Intrinsics.checkNotNullParameter(extension2, "extension");
                    vc.s.k(extension2);
                    return extension2;
                }
                if (i3 == 1) {
                    return ufg.p0.k((j60.a) sVar.f.get(), new vn7.a(), new in7.a(), new yl7.a(), new yl7.b(), new yl7.e());
                }
                if (i3 == 2) {
                    return wp5.y.r((com.revolut.kompot.navigable.a) sVar.d.get(), (rp0.m) sVar.e.get());
                }
                if (i3 == 3) {
                    return new rp0.m();
                }
                if (i3 == 4) {
                    return kxa.j.m((j60.a) sVar.f.get());
                }
                if (i3 == 5) {
                    return new com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.claims.b(sVar.f247456a, (tl7.f) sVar.f247459g.get());
                }
                throw new AssertionError(i3);
        }
    }
}
