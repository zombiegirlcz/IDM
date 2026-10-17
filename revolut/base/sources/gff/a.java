package gff;

import aa0.a0;
import aa0.b0;
import aa0.c0;
import aa0.d0;
import aa0.e0;
import aa0.f0;
import aa0.g0;
import aa0.i0;
import aa0.i1;
import aa0.j0;
import aa0.k0;
import aa0.l0;
import aa0.u;
import aa0.y;
import aa0.z;
import android.content.Context;
import az0.q1;
import az0.r;
import az0.s;
import az0.t1;
import ch.qos.logback.core.net.SyslogConstants;
import ch.qos.logback.core.rolling.SizeBasedTriggeringPolicy;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.firebase.messaging.t;
import com.revolut.core.backend_flow.ui.BackendFlowSnapshotsCompressor;
import com.revolut.feature.apm.bills.billers.impl.data.network.BillersService;
import com.revolut.feature.apm.swish.impl.data.network.SwishService;
import com.revolut.feature.backend_flow.domain.models.ExternalValidation;
import com.revolut.feature.backend_flow.domain.models.MaxAmountValidation;
import com.revolut.feature.backend_flow.domain.models.MaxLengthValidation;
import com.revolut.feature.backend_flow.domain.models.MinAmountValidation;
import com.revolut.feature.backend_flow.domain.models.MinLengthValidation;
import com.revolut.feature.backend_flow.domain.models.RegexValidation;
import com.revolut.feature.backend_flow.domain.models.WidgetProgressionItem;
import com.revolut.feature.feedback.impl.service.FeedbackService;
import com.revolut.feature.product.lifecycle.data.ProductLifecycleService;
import com.revolut.feature.wealth.impl.ui.screens.composite_add_money.schedule.ScheduleScreen;
import com.revolut.feature.wealth.impl.ui.screens.composite_add_money.schedule.ScheduleScreenContract$Input;
import com.revolut.kompot.navigable.screen.BaseScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.trading_onboarding.impl.ui.onboarding_backend_flow.TradingOnboardingBackendFlowContract$Configuration;
import e4m.e;
import ech.o;
import ech.p;
import ecm.q;
import fgl.f;
import fgl.h;
import fgl.k;
import gch.l;
import gch.m;
import h80.e;
import h9h.g;
import hc2.i;
import hc2.x;
import java.util.Collection;
import java.util.Optional;
import kotlin.jvm.internal.Intrinsics;
import kyk.v;
import nj0.d;
import nyb.m0;
import qc0.g1;
import qz0.j;
import qz0.n;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import t80.e;
import te0.w;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f143398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f143399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f143400c;

    public /* synthetic */ a(Object obj2, int i, int i2) {
        this.f143398a = i2;
        this.f143400c = obj2;
        this.f143399b = i;
    }

    private final Object a() {
        h51.a aVar = (h51.a) this.f143400c;
        int i = this.f143399b;
        switch (i) {
            case 0:
                return new s((qz0.b) aVar.f149423j.get());
            case 1:
                return new xz0.c(aVar.f149418a, (r) aVar.i.get());
            case 2:
                ij0.a aVar2 = ((d) aVar.f149419b).f216295c;
                z80.b bVarS = aVar.f149420c.s();
                vc.s.j(bVarS);
                return new i51.a(aVar2, bVarS);
            case 3:
                return new fgl.d(new fgl.c((j) aVar.f149424l.get()), new f(new r10.a(aVar.d.f125667a.f180898a.f())));
            case 4:
                Context context = aVar.f149418a;
                Optional authHeadersProvider = Optional.empty();
                Optional headersProvider = Optional.of(((d) aVar.f149419b).h());
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(authHeadersProvider, "authHeadersProvider");
                Intrinsics.checkNotNullParameter(headersProvider, "headersProvider");
                return new n(context, (bk0.a) authHeadersProvider.orElse(null), (bk0.c) headersProvider.orElse(null));
            case 5:
                return new fgl.d(new fgl.c((j) aVar.f149424l.get()), new h(new r10.a(aVar.d.f125667a.f180898a.f())));
            case 6:
                zm0.c cVarJ = aVar.e.j();
                vc.s.j(cVarJ);
                return new az0.e(cVarJ, (az0.d) aVar.o.get());
            case 7:
                return new t1((q1) aVar.f149428q.get(), (a01.b) aVar.f149429r.get());
            case 8:
                return new a01.f(aVar.f149418a);
            case 9:
                return new k();
            case 10:
                bnf.a aVar3 = (bnf.a) aVar.f.z.get();
                vc.s.j(aVar3);
                return new zjf.a(aVar3);
            case 11:
                je0.d mapper = aVar.f149421g.b();
                vc.s.j(mapper);
                yk0.a databaseSessionProvider = aVar.e.b();
                vc.s.j(databaseSessionProvider);
                xe0.f storageFactory = aVar.f149421g.f();
                vc.s.j(storageFactory);
                h51.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                return xe0.f.g(storageFactory, databaseSessionProvider, "user_avatars_failed_requests", mapper, 0, null, false, SyslogConstants.LOG_CLOCK);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object b() {
        g gVar = (g) this.f143400c;
        int i = this.f143399b;
        switch (i) {
            case 0:
                gch.f extensions = (gch.f) gVar.f150306h.get();
                fch.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extensions, "extensions");
                return extensions.f142475a;
            case 1:
                m extensionFactory = (m) gVar.f150305g.get();
                ScheduleScreenContract$Input input = gVar.f150303b;
                fch.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extensionFactory, "extensionFactory");
                Intrinsics.checkNotNullParameter(input, "input");
                gch.g input2 = new gch.g(input.f95600b);
                extensionFactory.getClass();
                Intrinsics.checkNotNullParameter(input2, "input");
                gch.k kVar = new gch.k(extensionFactory.f142486a, extensionFactory.f142487b, input2);
                return new gch.f(new gch.j(((ScheduleScreen) extensionFactory.f142488c).Z, kVar), kVar);
            case 2:
                gVar.getClass();
                return new m(new l(new adh.h()), (j60.a) gVar.e.get(), (gch.e) gVar.f.get());
            case 3:
                return h30.l.p((com.revolut.kompot.navigable.a) gVar.f150304c.get(), (rp0.m) gVar.d.get());
            case 4:
                return new rp0.m();
            case 5:
                BaseScreen screen = gVar.f150302a;
                fch.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(screen, "screen");
                return (ScheduleScreen) screen;
            case 6:
                return kxa.j.l((j60.a) gVar.e.get());
            case 7:
                gch.f extensions2 = (gch.f) gVar.f150306h.get();
                fch.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extensions2, "extensions");
                return extensions2.f142476b;
            case 8:
                return new ech.m((ech.d) gVar.f150308l.get(), (ech.e) gVar.f150309m.get(), (j60.a) gVar.e.get(), (gch.c) gVar.f150310n.get());
            case 9:
                ScheduleScreenContract$Input input3 = gVar.f150303b;
                fch.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(input3, "input");
                return new ech.d(input3.f95599a, input3.f95600b);
            case 10:
                return new p(new adh.h(), new o(), gVar.f150303b);
            case 11:
                gch.f extensions3 = (gch.f) gVar.f150306h.get();
                fch.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extensions3, "extensions");
                return extensions3.f142476b;
            default:
                throw new AssertionError(i);
        }
    }

    private final Object c() {
        x xVar = (x) this.f143400c;
        a31.a aVar = xVar.f150844c;
        a31.a aVar2 = xVar.f150843b;
        q qVar = xVar.f150842a;
        int i = this.f143399b;
        if (i == 0) {
            return new hc2.a(aVar2, aVar, xVar.d, qVar);
        }
        if (i == 1) {
            return new hc2.e(qVar, aVar2, xVar.e, xVar.f, xVar.f150845g, xVar.f150846h, aVar, xVar.i, xVar.f150851p, xVar.f150847j, xVar.k, xVar.f150848l, xVar.f150849m, xVar.f150850n);
        }
        if (i != 2) {
            throw new AssertionError(i);
        }
        i iVar = (i) ((hc2.a) xVar.o.get()).b();
        vc.s.k(iVar);
        return iVar;
    }

    private final Object d() {
        he2.c cVar = (he2.c) this.f143400c;
        int i = this.f143399b;
        if (i == 0) {
            return new ge2.a();
        }
        if (i == 1) {
            return new ce2.a((SwishService) cVar.f151533j.get());
        }
        if (i != 2) {
            throw new AssertionError(i);
        }
        SwishService swishService = (SwishService) a0.d.f((d) cVar.f, "retrofit", SwishService.class, "create(...)");
        vc.s.k(swishService);
        return swishService;
    }

    private final Object e() {
        he2.i iVar = (he2.i) this.f143400c;
        q qVar = iVar.f151548a;
        int i = this.f143399b;
        if (i == 0) {
            return new add.b(qVar, 4);
        }
        if (i == 1) {
            return new ee6.f(qVar, iVar.f151549b, iVar.f151550c, iVar.d, iVar.e, iVar.f, iVar.f151551g, iVar.f151552h, iVar.i, 1);
        }
        throw new AssertionError(i);
    }

    private final Object f() {
        hja.a aVar = (hja.a) this.f143400c;
        int i = this.f143399b;
        if (i == 0) {
            return new cja.a();
        }
        if (i == 1) {
            return new ija.a((dja.c) aVar.i.get());
        }
        if (i == 2) {
            return new dja.f((ProductLifecycleService) aVar.f152674h.get(), new eja.a());
        }
        if (i == 3) {
            Retrofit retrofit = ((d) aVar.f152670a).f();
            kg.o productLifecycleGson = (kg.o) aVar.f152673g.get();
            hja.d.Companion.getClass();
            Intrinsics.checkNotNullParameter(retrofit, "retrofit");
            Intrinsics.checkNotNullParameter(productLifecycleGson, "productLifecycleGson");
            Retrofit.Builder builderNewBuilder = retrofit.newBuilder();
            GsonConverterFactory gsonConverterFactoryCreate = GsonConverterFactory.create(productLifecycleGson);
            builderNewBuilder.converterFactories().clear();
            Intrinsics.h(gsonConverterFactoryCreate);
            builderNewBuilder.addConverterFactory(new dja.h(gsonConverterFactoryCreate));
            builderNewBuilder.addConverterFactory(gsonConverterFactoryCreate);
            Object objCreate = builderNewBuilder.build().create(ProductLifecycleService.class);
            Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
            ProductLifecycleService productLifecycleService = (ProductLifecycleService) objCreate;
            vc.s.k(productLifecycleService);
            return productLifecycleService;
        }
        if (i != 4) {
            throw new AssertionError(i);
        }
        kg.o gson = fe0.c.a();
        dja.b configurator = new dja.b();
        hja.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(configurator, "configurator");
        kg.p gsonBuilder = new kg.p(gson);
        Intrinsics.checkNotNullParameter(gsonBuilder, "gsonBuilder");
        he0.m mVarB = he0.m.b(fja.e.class, "type");
        mVarB.c(fja.d.class, "WORKFLOW");
        gsonBuilder.e.add(mVarB);
        gsonBuilder.c(new dja.a(), fja.f.class);
        Intrinsics.checkNotNullExpressionValue(gsonBuilder, "registerTypeAdapter(...)");
        kg.o oVarB = gsonBuilder.b();
        Intrinsics.checkNotNullExpressionValue(oVarB, "create(...)");
        return oVarB;
    }

    private final Object g() {
        hjg.d dVar = (hjg.d) this.f143400c;
        int i = this.f143399b;
        switch (i) {
            case 0:
                hri.b bVar = dVar.f152805a;
                return new ifm.b();
            case 1:
                hri.b bVar2 = dVar.f152805a;
                return new iri.j();
            case 2:
                return new cn.e();
            case 3:
                return new um.c();
            case 4:
                dVar.getClass();
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
                return new gjg.l();
            case 11:
                yig.a aVar = (yig.a) dVar.f152807c.f126890n.get();
                vc.s.j(aVar);
                return new gjg.j(aVar, dVar.d.a(), (ifm.b) dVar.f152808g.get(), (gjg.c) dVar.f152815q.get(), new t((cn.e) dVar.i.get(), (ym.d) dVar.f152812m.get(), (um.c) dVar.f152810j.get(), (ifm.b) dVar.f152808g.get()));
            case 12:
                return new gjg.k((ln.a) dVar.f152811l.get());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object h() {
        hm1.d dVar = (hm1.d) this.f143400c;
        int i = this.f143399b;
        if (i == 0) {
            return new gm1.a();
        }
        if (i == 1) {
            return new im1.a(new fm1.c((BillersService) dVar.e.get(), new ne0.d()));
        }
        if (i != 2) {
            throw new AssertionError(i);
        }
        Retrofit retrofit = ((d) dVar.f153498a).f();
        hm1.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(BillersService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        BillersService billersService = (BillersService) objCreate;
        vc.s.k(billersService);
        return billersService;
    }

    private final Object i() {
        hm2.c cVar = (hm2.c) this.f143400c;
        a31.a aVar = cVar.f153517j;
        int i = this.f143399b;
        if (i == 0) {
            return new af5.f(cVar.f153512a, cVar.f153513b, cVar.f153514c, cVar.d, cVar.e, cVar.f, cVar.f153515g, cVar.f153516h, cVar.i, aVar, 3);
        }
        if (i == 1) {
            return new c3d.d(aVar, cVar.k, 8);
        }
        throw new AssertionError(i);
    }

    private final Object j() {
        hvf.e eVar = (hvf.e) this.f143400c;
        int i = this.f143399b;
        if (i == 0) {
            return new rwf.i((cli.n) eVar.f155893c.get(), eVar.f155891a);
        }
        if (i == 1) {
            return new rwf.j();
        }
        throw new AssertionError(i);
    }

    private final Object k() {
        int i = this.f143399b;
        if (i == 0) {
            return new zvf.g((cli.n) ((hvf.p) this.f143400c).f155939b.get());
        }
        if (i == 1) {
            return new zvf.h();
        }
        throw new AssertionError(i);
    }

    private final Object l() {
        int i = this.f143399b;
        if (i != 0) {
            if (i == 1) {
                return new gy8.b();
            }
            throw new AssertionError(i);
        }
        hy8.b bVar = (hy8.b) this.f143400c;
        xx8.f fVar = bVar.f156760a;
        z70.a aVarF = bVar.f156761b.f();
        vc.s.j(aVarF);
        return new iy8.b(xhi.f.r(fVar, aVarF));
    }

    private final Object m() {
        hzc.a aVar = (hzc.a) this.f143400c;
        int i = this.f143399b;
        if (i == 0) {
            return new izc.c(aVar.f157141a, aVar.f157142b);
        }
        if (i != 1) {
            throw new AssertionError(i);
        }
        fzc.a aVar2 = (fzc.a) ((izc.c) aVar.f157145h.get()).b();
        vc.s.k(aVar2);
        return aVar2;
    }

    private final Object n() {
        hzk.b bVar = (hzk.b) this.f143400c;
        int i = this.f143399b;
        switch (i) {
            case 0:
                hri.b bVar2 = bVar.f157235a;
                return new ifm.b();
            case 1:
                hri.b bVar3 = bVar.f157235a;
                return new iri.j();
            case 2:
                return new gzk.e();
            case 3:
                return new ln.c();
            case 4:
                return new cn.e();
            case 5:
                return new um.c();
            case 6:
                bVar.getClass();
                return new hn.h(ImmutableSet.copyOf((Collection) hn.f.a()));
            case 7:
                g3l.a aVar = (g3l.a) bVar.f157244p.get();
                sf0.h hVarB = bVar.f157237c.b();
                vc.s.j(hVarB);
                v60.e eVarA = bVar.d.a();
                vc.s.j(eVarA);
                return new vxk.e(aVar, hVarB, eVarA, (ln.a) bVar.f157241l.get());
            case 8:
                return new g3l.g();
            case 9:
                return new ym.d();
            case 10:
                return new mm.d();
            case 11:
                return new vxk.b((ln.a) bVar.f157241l.get(), bVar.h(), bVar.a());
            case 12:
                return new vxk.b(bVar.h(), (ln.a) bVar.f157241l.get(), bVar.a());
            case 13:
                return new sm.e();
            case 14:
                return new om.c();
            case 15:
                return new gzk.d((mm.d) bVar.f157247s.get());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object o() {
        i0l.d dVar = (i0l.d) this.f143400c;
        int i = this.f143399b;
        switch (i) {
            case 0:
                hri.b bVar = dVar.f157459a;
                return new ifm.b();
            case 1:
                hri.b bVar2 = dVar.f157459a;
                return new iri.j();
            case 2:
                return new cn.e();
            case 3:
                return new um.c();
            case 4:
                dVar.getClass();
                return new hn.h(ImmutableSet.copyOf((Collection) hn.f.a()));
            case 5:
                return new ln.c();
            case 6:
                dVar.getClass();
                return new h0l.h(new g1(new com.revolut.feature.chooser.e(), new tc0.c(), new onh.b(new BackendFlowSnapshotsCompressor())));
            case 7:
                e eVar = dVar.f157462b0;
                l70.e eVar2 = dVar.f157461b;
                qc0.h hVar = (qc0.h) eVar.get();
                h0l.e eVar3 = (h0l.e) dVar.v.get();
                String str = dVar.f157466g;
                dcl.q qVar = new dcl.q(new aa0.i(), (xl2.f) dVar.S.get());
                am2.a aVarA = dVar.f.a();
                t70.b bVarG = eVar2.g();
                vc.s.j(bVarG);
                mm.d dVar2 = (mm.d) dVar.c0.get();
                wli.x xVarD = ((s41.a) dVar.f157467h).d();
                xl2.f fVar = (xl2.f) dVar.S.get();
                s70.a aVarM = eVar2.m();
                vc.s.j(aVarM);
                return new com.revolut.retail.feature.trading_onboarding.impl.ui.onboarding_backend_flow.c(hVar, eVar3, str, qVar, aVarA, bVarG, dVar2, xVarD, fVar, aVarM, (yc0.a) dVar.f157464d0.get(), dVar.h());
            case 8:
                qc0.k kVar = (qc0.k) dVar.v.get();
                wl2.f fVar2 = (wl2.f) dVar.f157485w.get();
                ifm.b bVar3 = (ifm.b) dVar.f157476p.get();
                com.revolut.feature.chooser.a aVar = new com.revolut.feature.chooser.a((com.revolut.feature.chooser.d) dVar.f157487x.get(), (qi3.o) dVar.f157489y.get());
                yc0.k kVar2 = (yc0.k) dVar.z.get();
                f0 f0Var = (f0) dVar.A.get();
                w80.b bVarJ = dVar.f157461b.j();
                vc.s.j(bVarJ);
                z zVar = new z(bVarJ);
                aa0.b bVar4 = (aa0.b) dVar.B.get();
                c0 c0Var = (c0) dVar.C.get();
                k0 k0Var = (k0) dVar.D.get();
                i0 i0Var = new i0();
                b0 b0Var = (b0) dVar.G.get();
                aa0.h hVar2 = (aa0.h) dVar.H.get();
                aa0.n nVar = (aa0.n) dVar.I.get();
                aa0.d dVar3 = (aa0.d) dVar.J.get();
                aa0.p pVar = (aa0.p) dVar.K.get();
                aa0.l lVar = (aa0.l) dVar.L.get();
                aa0.m mVar = (aa0.m) dVar.M.get();
                a0 a0Var = (a0) dVar.N.get();
                i1 i1Var = (i1) dVar.O.get();
                l0 l0Var = (l0) dVar.P.get();
                e0 e0Var = (e0) dVar.Q.get();
                j0 j0Var = (j0) dVar.R.get();
                aa0.j jVar = new aa0.j();
                aa0.t tVar = new aa0.t();
                dcl.q qVar2 = new dcl.q(new aa0.i(), (xl2.f) dVar.S.get());
                aa0.s sVar = new aa0.s((ad0.a) dVar.T.get(), 1);
                aa0.f fVar3 = new aa0.f();
                aa0.g gVar = new aa0.g();
                u uVar = new u();
                g0 g0Var = new g0();
                aa0.q qVar3 = new aa0.q((ad0.a) dVar.T.get());
                aa0.s sVar2 = new aa0.s((ad0.a) dVar.T.get(), 0);
                aa0.k kVar3 = new aa0.k();
                aa0.a aVar2 = new aa0.a();
                d0 d0Var = new d0();
                t tVarA = dVar.a();
                eli.j jVarA = dVar.e.a();
                ca0.a aVar3 = new ca0.a();
                bd0.d dVar4 = (bd0.d) dVar.V.get();
                yc0.f fVar4 = (yc0.f) dVar.Y.get();
                ad0.a aVar4 = (ad0.a) dVar.T.get();
                aa0.o oVar = new aa0.o();
                ImmutableMap.Builder builderBuilderWithExpectedSize = ImmutableMap.builderWithExpectedSize(6);
                builderBuilderWithExpectedSize.put(ExternalValidation.class, new ed0.d((wl2.a) dVar.Z.get()));
                builderBuilderWithExpectedSize.put(MaxLengthValidation.class, new ed0.f());
                builderBuilderWithExpectedSize.put(MinLengthValidation.class, new ed0.h());
                builderBuilderWithExpectedSize.put(RegexValidation.class, new ed0.i((zzl.b) dVar.E.get()));
                builderBuilderWithExpectedSize.put(MinAmountValidation.class, new ed0.g());
                builderBuilderWithExpectedSize.put(MaxAmountValidation.class, new ed0.e());
                return new qc0.j0(kVar, fVar2, bVar3, aVar, kVar2, f0Var, zVar, bVar4, c0Var, k0Var, i0Var, b0Var, hVar2, nVar, dVar3, pVar, lVar, mVar, a0Var, i1Var, l0Var, e0Var, j0Var, jVar, tVar, qVar2, sVar, fVar3, gVar, uVar, g0Var, qVar3, sVar2, kVar3, aVar2, d0Var, tVarA, jVarA, aVar3, dVar4, fVar4, aVar4, oVar, new dd0.c(builderBuilderWithExpectedSize.build()), new cd0.d());
            case 9:
                return new com.revolut.retail.feature.trading_onboarding.impl.ui.onboarding_backend_flow.a(new kl.b0((hyk.a) ((v) dVar.f157463c).J.get()), (h0l.e) dVar.v.get());
            case 10:
                x90.c cVar = dVar.d;
                qc0.k state = (qc0.k) dVar.v.get();
                Intrinsics.checkNotNullParameter(state, "state");
                vc.s.k(state);
                return state;
            case 11:
                x90.c cVar2 = dVar.d;
                qi3.b modelsProvider = new qi3.b((com.revolut.feature.chooser.d) dVar.f157487x.get());
                Intrinsics.checkNotNullParameter(modelsProvider, "modelsProvider");
                return modelsProvider;
            case 12:
                x90.c cVar3 = dVar.d;
                l80.e eVarH = dVar.f157461b.h();
                vc.s.j(eVarH);
                return wpg.v.l(cVar3, eVarH);
            case 13:
                x90.c cVar4 = dVar.d;
                return new f0();
            case 14:
                x90.c cVar5 = dVar.d;
                return new aa0.b();
            case 15:
                x90.c cVar6 = dVar.d;
                return new c0();
            case 16:
                x90.c cVar7 = dVar.d;
                return new k0();
            case 17:
                x90.c cVar8 = dVar.d;
                z80.b bVarS = dVar.f157461b.s();
                vc.s.j(bVarS);
                return wpg.v.g(cVar8, bVarS, (y) dVar.F.get());
            case 18:
                return wpg.v.i(dVar.d, (zzl.b) dVar.E.get());
            case 19:
                i0l.h.Companion.getClass();
                return new zzl.c();
            case 20:
                x90.c cVar9 = dVar.d;
                return new aa0.h();
            case 21:
                x90.c cVar10 = dVar.d;
                return new aa0.n();
            case 22:
                return wpg.v.h(dVar.d, (y) dVar.F.get());
            case 23:
                x90.c cVar11 = dVar.d;
                return new aa0.p();
            case 24:
                x90.c cVar12 = dVar.d;
                return new aa0.l();
            case 25:
                x90.c cVar13 = dVar.d;
                return new aa0.m();
            case 26:
                x90.c cVar14 = dVar.d;
                return new a0();
            case 27:
                x90.c cVar15 = dVar.d;
                return new i1();
            case 28:
                x90.c cVar16 = dVar.d;
                return new l0();
            case 29:
                x90.c cVar17 = dVar.d;
                return new e0();
            case 30:
                x90.c cVar18 = dVar.d;
                return new j0();
            case 31:
                h0l.e state2 = (h0l.e) dVar.v.get();
                i0l.h.Companion.getClass();
                Intrinsics.checkNotNullParameter(state2, "state");
                TradingOnboardingBackendFlowContract$Configuration tradingOnboardingBackendFlowContract$Configuration = (TradingOnboardingBackendFlowContract$Configuration) w.O(((h0l.h) state2).w0());
                return new xl2.f(tradingOnboardingBackendFlowContract$Configuration != null ? tradingOnboardingBackendFlowContract$Configuration.V9() : true, 14);
            case 32:
                x90.c cVar19 = dVar.d;
                return new ad0.b();
            case 33:
                return new ym.d();
            case 34:
                x90.c cVar20 = dVar.d;
                return new bd0.e();
            case 35:
                return wpg.v.s(dVar.d, (yc0.b0) dVar.X.get());
            case 36:
                return wpg.v.u(dVar.d, (qc0.k) dVar.v.get(), new smd.s((la0.c) dVar.W.get()));
            case 37:
                return wpg.v.e(dVar.d, (qc0.k) dVar.v.get());
            case 38:
                x90.c cVar21 = dVar.d;
                aa0.w legacyBackendFlowAdapterInteractor = new aa0.w((wl2.f) dVar.f157485w.get(), dVar.f.b());
                Intrinsics.checkNotNullParameter(legacyBackendFlowAdapterInteractor, "legacyBackendFlowAdapterInteractor");
                return legacyBackendFlowAdapterInteractor;
            case 39:
                return new mm.d();
            case 40:
                return wpg.v.c(dVar.d, (yc0.b0) dVar.X.get());
            case 41:
                g3l.a aVar5 = (g3l.a) dVar.f0.get();
                sf0.h hVarB = dVar.k.b();
                vc.s.j(hVarB);
                v60.e eVarA = dVar.f157471l.a();
                vc.s.j(eVarA);
                return new vxk.e(aVar5, hVarB, eVarA, (ln.a) dVar.u.get());
            case 42:
                return new g3l.g();
            case 43:
                return new vc0.a((qc0.j) dVar.f157465e0.get(), (qc0.k) dVar.v.get(), (ln.a) dVar.u.get(), (xl2.f) dVar.S.get(), (mm.d) dVar.c0.get(), dVar.a());
            case 44:
                return new vc0.b((ln.a) dVar.u.get());
            case 45:
                return new vc0.c((qc0.k) dVar.v.get(), (qc0.j) dVar.f157465e0.get(), (wl2.f) dVar.f157485w.get(), dVar.e.a(), new ca0.a(), dVar.a());
            case 46:
                return new vxk.b((ln.a) dVar.u.get(), dVar.h(), dVar.a());
            case 47:
                return new vxk.b(dVar.h(), (ln.a) dVar.u.get(), dVar.a());
            case 48:
                x90.c cVar22 = dVar.d;
                qc0.j router = (qc0.j) dVar.f157465e0.get();
                Intrinsics.checkNotNullParameter(router, "router");
                vc.s.k(router);
                return router;
            case 49:
                return new sm.e();
            case 50:
                return new om.c();
            case 51:
                return new an.a();
            case 52:
                return new d4l.a();
            case 53:
                x90.c cVar23 = dVar.d;
                qc0.h state3 = (qc0.h) dVar.f157462b0.get();
                Intrinsics.checkNotNullParameter(state3, "state");
                vc.s.k(state3);
                return state3;
            case 54:
                i0l.h.Companion.getClass();
                return new t80.c(new e.a("TransferOut"), SizeBasedTriggeringPolicy.DEFAULT_MAX_FILE_SIZE);
            case 55:
                return wpg.v.d(dVar.d, (qc0.k) dVar.v.get(), (la0.c) dVar.W.get(), ImmutableMap.of(WidgetProgressionItem.class, new z90.b()));
            case 56:
                return wpg.v.t(dVar.d, (bd0.d) dVar.V.get());
            case 57:
                x90.c cVar24 = dVar.d;
                z70.a aVarF = dVar.f157461b.f();
                vc.s.j(aVarF);
                return wpg.v.p(cVar24, aVarF);
            case 58:
                x90.c cVar25 = dVar.d;
                return new yc0.w();
            case 59:
                x90.c cVar26 = dVar.d;
                qc0.j router2 = (qc0.j) dVar.f157465e0.get();
                Intrinsics.checkNotNullParameter(router2, "router");
                vc.s.k(router2);
                return router2;
            case 60:
                x90.c cVar27 = dVar.d;
                qc0.h state4 = (qc0.h) dVar.f157462b0.get();
                Intrinsics.checkNotNullParameter(state4, "state");
                vc.s.k(state4);
                return state4;
            default:
                throw new AssertionError(i);
        }
    }

    private final Object p() {
        i2e.a aVar = (i2e.a) this.f143400c;
        a31.a aVar2 = aVar.f157919j;
        a31.a aVar3 = aVar.o;
        a31.a aVar4 = aVar.f157917g;
        int i = this.f143399b;
        if (i == 0) {
            return new k2e.w(aVar.f157914a, aVar.f157915b, aVar.f157916c, aVar.d, aVar.e, aVar.f, aVar4, aVar.f157918h, aVar.i, aVar2, aVar.k, aVar.f157920l, aVar.f157921m, aVar.f157922n, aVar3, aVar.f157923p, aVar.f157924q, aVar.f157925r, aVar.f157926s, 0);
        }
        if (i == 1) {
            return new anb.c0(aVar4, aVar.f157927t, aVar3, aVar2, 14);
        }
        throw new AssertionError(i);
    }

    @Override // phm.a
    public final Object get() {
        Object mVar;
        Object bVar;
        Object bVar2;
        Object modelsProvider;
        Object aVar;
        Object jVar;
        switch (this.f143398a) {
            case 0:
                int i = this.f143399b;
                if (i == 0) {
                    return new hff.a();
                }
                if (i != 1) {
                    throw new AssertionError(i);
                }
                w39.b bVarA = ((b) this.f143400c).f143401a.a();
                vc.s.j(bVarA);
                return new hff.c(bVarA);
            case 1:
                gn5.c cVar = (gn5.c) this.f143400c;
                npk.a aVar2 = cVar.d;
                usg.a aVar3 = cVar.f144909b;
                Context context = cVar.e;
                ei5.d dVar = cVar.f144908a;
                int i2 = this.f143399b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        gn5.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(context, "context");
                        return com.bumptech.glide.c.k(context).a(context);
                    }
                    if (i2 != 2) {
                        throw new AssertionError(i2);
                    }
                    ii5.a aVarD = dVar.d();
                    vc.s.j(aVarD);
                    return new fn5.d(aVarD);
                }
                xh5.a aVarA = dVar.a();
                vc.s.j(aVarA);
                wsg.b bVarA2 = aVar3.a();
                mu5.f fVarD = cVar.f144910c.d();
                ur5.c cVarD = t2d.c.d(aVar2.a(), aVar3.b());
                wt5.a aVar4 = new wt5.a();
                ppk.f fVarA = aVar2.a();
                ty0.c cVar2 = (ty0.c) cVar.f144911g.get();
                gte.a aVarB = cVar.f.b();
                vc.s.j(aVarB);
                return new fn5.j(aVarA, bVarA2, fVarD, cVarD, aVar4, fVarA, context, cVar2, aVarB);
            case 2:
                gp6.a aVar5 = (gp6.a) this.f143400c;
                ee0.a aVar6 = aVar5.f145255a;
                int i3 = this.f143399b;
                switch (i3) {
                    case 0:
                        je0.d mapper = aVar6.b();
                        vc.s.j(mapper);
                        yk0.a databaseSecurityProvider = aVar5.f145256b.b();
                        vc.s.j(databaseSecurityProvider);
                        xe0.f storageFactory = aVar6.f();
                        vc.s.j(storageFactory);
                        gp6.j.Companion.getClass();
                        Intrinsics.checkNotNullParameter(mapper, "mapper");
                        Intrinsics.checkNotNullParameter(databaseSecurityProvider, "databaseSecurityProvider");
                        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                        return xe0.f.f(storageFactory, databaseSecurityProvider, "feedbacks", mapper, 0, null, 56);
                    case 1:
                        mVar = new lp6.m((FeedbackService) aVar5.e.get(), (ne0.j) aVar5.f.get(), new jp6.a(), (ue0.c) aVar5.d.get());
                        break;
                    case 2:
                        Retrofit retrofit = ((d) aVar5.f145257c.f324179a).f();
                        gp6.j.Companion.getClass();
                        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                        Object objCreate = retrofit.create(FeedbackService.class);
                        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                        FeedbackService feedbackService = (FeedbackService) objCreate;
                        vc.s.k(feedbackService);
                        return feedbackService;
                    case 3:
                        gp6.j.Companion.getClass();
                        return new ne0.d(ne0.b.HASH);
                    case 4:
                        return new mp6.a();
                    case 5:
                        mVar = new ip6.a((dp6.a) aVar5.f145258g.get(), (ep6.b) aVar5.f145259h.get());
                        break;
                    case 6:
                        return new jp6.b();
                    default:
                        throw new AssertionError(i3);
                }
                return mVar;
            case 3:
                gp9.c cVar3 = (gp9.c) this.f143400c;
                cq9.g gVar = cVar3.f145351a;
                int i5 = this.f143399b;
                if (i5 == 0) {
                    return new com.revolut.feature.payments.bills_chooser.impl.ui.itemization.add.a(new cq9.m(new eq9.a(gVar), new eq9.e(gVar), new i4b.f(gVar), new eq9.c(cVar3.b(), gVar, new u80.o(), (ldd.b) cVar3.f145353c.get())), cVar3.b(), (ldd.b) cVar3.f145353c.get(), gVar, new bq9.d(), new i90.b());
                }
                if (i5 != 1) {
                    throw new AssertionError(i5);
                }
                ldd.a factory = new ldd.a();
                dq9.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory, "factory");
                return new ldd.b();
            case 4:
                ri0.a aVar7 = ((gx.c) this.f143400c).f147607a;
                int i6 = this.f143399b;
                if (i6 != 0) {
                    if (i6 == 1) {
                        return new ti0.a(aVar7.f254531a.b());
                    }
                    throw new AssertionError(i6);
                }
                c10.d dVarA = aVar7.f254531a.a();
                vc.s.j(dVarA);
                return new ti0.c(dVarA, si0.c.a());
            case 5:
                gy2.j jVar2 = (gy2.j) this.f143400c;
                int i21 = this.f143399b;
                if (i21 == 0) {
                    return new yx2.c((cli.n) jVar2.f147814c.get(), jVar2.f147812a);
                }
                if (i21 == 1) {
                    return new yx2.d();
                }
                throw new AssertionError(i21);
            case 6:
                h08.h hVar = (h08.h) this.f143400c;
                int i22 = this.f143399b;
                switch (i22) {
                    case 0:
                        hri.b bVar3 = hVar.f148279a;
                        return new ifm.b();
                    case 1:
                        hri.b bVar4 = hVar.f148279a;
                        return new iri.j();
                    case 2:
                        return new hy7.k();
                    case 3:
                        return new ln.c();
                    case 4:
                        return new hy7.g((hy7.c) hVar.k.get());
                    case 5:
                        return new hy7.j((ln.a) hVar.f148285l.get());
                    case 6:
                        return new cn.e();
                    case 7:
                        return new um.c();
                    case 8:
                        hVar.getClass();
                        return new hn.h(ImmutableSet.copyOf((Collection) hn.f.a()));
                    case 9:
                        e4m.e eVar = hVar.f148290r;
                        ex7.a aVar8 = hVar.f148281c;
                        g3l.a aVar9 = (g3l.a) eVar.get();
                        fx7.f fVarB = aVar8.b();
                        vc.s.j(fVarB);
                        ang.f fVarE = hVar.d.e();
                        fx7.a aVarA2 = aVar8.a();
                        vc.s.j(aVarA2);
                        bVar = new d08.b(aVar9, fVarB, fVarE, aVarA2, (ln.a) hVar.f148285l.get(), hVar.b());
                        return bVar;
                    case 10:
                        return new g3l.g();
                    case 11:
                        return new ym.d();
                    case 12:
                        return new mm.d();
                    case 13:
                        ex7.a aVar10 = hVar.f148281c;
                        ex7.a aVar11 = hVar.f148281c;
                        fx7.f fVarB2 = aVar10.b();
                        vc.s.j(fVarB2);
                        fx7.g gVarC = aVar11.c();
                        vc.s.j(gVarC);
                        fx7.l lVarD = aVar11.d();
                        vc.s.j(lVarD);
                        bVar2 = new hz7.b(fVarB2, gVarC, lVarD, (g3l.a) hVar.f148290r.get(), (ln.a) hVar.f148285l.get(), hVar.b());
                        return bVar2;
                    case 14:
                        fx7.g gVarC2 = hVar.f148281c.c();
                        vc.s.j(gVarC2);
                        fx7.l lVarD2 = hVar.f148281c.d();
                        vc.s.j(lVarD2);
                        return new du8.b(gVarC2, lVarD2, hVar.b());
                    case 15:
                        return new zx7.d((wm.e) hVar.f148294x.get());
                    case 16:
                        return new wm.a();
                    case 17:
                        return new com.revolut.feature.insurance_pet.impl.ui.cancellation.b((an.a) hVar.z.get(), (ln.a) hVar.f148285l.get(), (f08.a) hVar.B.get(), (f08.e) hVar.A.get());
                    case 18:
                        return new an.a();
                    case 19:
                        ex7.a aVar12 = hVar.f148281c;
                        ex7.a aVar13 = hVar.f148281c;
                        fx7.f fVarB3 = aVar12.b();
                        vc.s.j(fVarB3);
                        fx7.g gVarC3 = aVar13.c();
                        vc.s.j(gVarC3);
                        fx7.j jVar3 = (fx7.j) aVar13.u.get();
                        vc.s.j(jVar3);
                        ang.f fVarE2 = hVar.d.e();
                        n8b.a aVarA3 = hVar.e.a();
                        vc.s.j(aVarA3);
                        fx7.a aVarA4 = aVar13.a();
                        vc.s.j(aVarA4);
                        bVar = new f08.h(fVarB3, gVarC3, jVar3, fVarE2, aVarA3, aVarA4, (f08.e) hVar.A.get(), new l08.a(), new yx7.q());
                        return bVar;
                    case 20:
                        return new f08.k();
                    case 21:
                        wm.e eVar2 = (wm.e) hVar.f148294x.get();
                        t tVarB = hVar.b();
                        fx7.f fVarB4 = hVar.f148281c.b();
                        vc.s.j(fVarB4);
                        bVar2 = new f08.m(eVar2, tVarB, fVarB4, (f08.c) hVar.A.get(), (g3l.a) hVar.f148290r.get(), (ln.a) hVar.f148285l.get());
                        return bVar2;
                    case 22:
                        fx7.f fVarB5 = hVar.f148281c.b();
                        vc.s.j(fVarB5);
                        return new r08.c(fVarB5, (f08.e) hVar.A.get(), hVar.b());
                    case 23:
                        return new sm.e();
                    case 24:
                        return new om.c();
                    case 25:
                        fx7.g gVarC4 = hVar.f148281c.c();
                        vc.s.j(gVarC4);
                        fx7.f fVarB6 = hVar.f148281c.b();
                        vc.s.j(fVarB6);
                        return new gz7.l(gVarC4, fVarB6);
                    case 26:
                        return new gz7.w((mm.d) hVar.u.get(), (ln.a) hVar.f148285l.get());
                    case 27:
                        h08.n.Companion.getClass();
                        return new t80.c(new e.a("PetInsurance"), SizeBasedTriggeringPolicy.DEFAULT_MAX_FILE_SIZE);
                    case 28:
                        return new d4l.a();
                    case 29:
                        e4m.e eVar3 = hVar.u;
                        pqi.a aVar14 = hVar.f;
                        mm.d dVar2 = (mm.d) eVar3.get();
                        ln.a aVar15 = (ln.a) hVar.f148285l.get();
                        nd.o oVarA = aVar14.a();
                        t08.a aVar16 = new t08.a();
                        f80.a aVarX = hVar.f148280b.x();
                        vc.s.j(aVarX);
                        f01.c cVarG = aVar14.g();
                        nhi.j jVar4 = (nhi.j) hVar.f148282g.d.get();
                        vc.s.j(jVar4);
                        return new f08.j(dVar2, aVar15, oVarA, aVar16, aVarX, cVarG, jVar4);
                    default:
                        throw new AssertionError(i22);
                }
            case 7:
                h1e.c cVar4 = (h1e.c) this.f143400c;
                int i32 = this.f143399b;
                switch (i32) {
                    case 0:
                        hri.b bVar5 = cVar4.f148521a;
                        return new ifm.b();
                    case 1:
                        hri.b bVar6 = cVar4.f148521a;
                        return new iri.j();
                    case 2:
                        return new cn.e();
                    case 3:
                        return new um.c();
                    case 4:
                        cVar4.getClass();
                        modelsProvider = new hn.h(ImmutableSet.copyOf((Collection) hn.f.a()));
                        return modelsProvider;
                    case 5:
                        return new ln.c();
                    case 6:
                        cVar4.getClass();
                        modelsProvider = new g1e.h(new g1(new com.revolut.feature.chooser.e(), new tc0.c(), new onh.b(new BackendFlowSnapshotsCompressor())));
                        return modelsProvider;
                    case 7:
                        e4m.e eVar4 = cVar4.W;
                        l70.e eVar5 = cVar4.f148523b;
                        qc0.h hVar2 = (qc0.h) eVar4.get();
                        qc0.k kVar = (qc0.k) cVar4.f148540r.get();
                        dcl.q qVar = new dcl.q(new aa0.i(), new xl2.f(true, 14));
                        am2.a aVarA5 = cVar4.f.a();
                        t70.b bVarG = eVar5.g();
                        vc.s.j(bVarG);
                        mm.d dVar3 = (mm.d) cVar4.X.get();
                        wli.x xVarD = ((s41.a) cVar4.f148528g).d();
                        xl2.f fVar = new xl2.f(true, 14);
                        s70.a aVarM = eVar5.m();
                        vc.s.j(aVarM);
                        return new g1e.g(hVar2, kVar, qVar, aVarA5, bVarG, dVar3, xVarD, fVar, aVarM, (yc0.a) cVar4.Y.get());
                    case 8:
                        qc0.k kVar2 = (qc0.k) cVar4.f148540r.get();
                        wl2.f fVar2 = (wl2.f) cVar4.f148542s.get();
                        ifm.b bVar7 = (ifm.b) cVar4.f148533l.get();
                        com.revolut.feature.chooser.a aVar17 = new com.revolut.feature.chooser.a((com.revolut.feature.chooser.d) cVar4.f148544t.get(), (qi3.o) cVar4.u.get());
                        yc0.k kVar3 = (yc0.k) cVar4.v.get();
                        f0 f0Var = (f0) cVar4.f148545w.get();
                        w80.b bVarJ = cVar4.f148523b.j();
                        vc.s.j(bVarJ);
                        z zVar = new z(bVarJ);
                        aa0.b bVar8 = (aa0.b) cVar4.f148546x.get();
                        c0 c0Var = (c0) cVar4.f148547y.get();
                        k0 k0Var = (k0) cVar4.z.get();
                        i0 i0Var = new i0();
                        b0 b0Var = (b0) cVar4.C.get();
                        aa0.h hVar3 = (aa0.h) cVar4.D.get();
                        aa0.n nVar = (aa0.n) cVar4.E.get();
                        aa0.d dVar4 = (aa0.d) cVar4.F.get();
                        aa0.p pVar = (aa0.p) cVar4.G.get();
                        aa0.l lVar = (aa0.l) cVar4.H.get();
                        aa0.m mVar2 = (aa0.m) cVar4.I.get();
                        a0 a0Var = (a0) cVar4.J.get();
                        i1 i1Var = (i1) cVar4.K.get();
                        l0 l0Var = (l0) cVar4.L.get();
                        e0 e0Var = (e0) cVar4.M.get();
                        j0 j0Var = (j0) cVar4.N.get();
                        aa0.j jVar5 = new aa0.j();
                        aa0.t tVar = new aa0.t();
                        dcl.q qVar2 = new dcl.q(new aa0.i(), new xl2.f(true, 14));
                        aa0.s sVar = new aa0.s((ad0.a) cVar4.O.get(), 1);
                        aa0.f fVar3 = new aa0.f();
                        aa0.g gVar2 = new aa0.g();
                        u uVar = new u();
                        g0 g0Var = new g0();
                        aa0.q qVar3 = new aa0.q((ad0.a) cVar4.O.get());
                        aa0.s sVar2 = new aa0.s((ad0.a) cVar4.O.get(), 0);
                        aa0.k kVar4 = new aa0.k();
                        aa0.a aVar18 = new aa0.a();
                        d0 d0Var = new d0();
                        t tVarD = cVar4.d();
                        eli.j jVarA = cVar4.e.a();
                        ca0.a aVar19 = new ca0.a();
                        bd0.d dVar5 = (bd0.d) cVar4.Q.get();
                        yc0.f fVar4 = (yc0.f) cVar4.T.get();
                        ad0.a aVar20 = (ad0.a) cVar4.O.get();
                        aa0.o oVar = new aa0.o();
                        ImmutableMap.Builder builderBuilderWithExpectedSize = ImmutableMap.builderWithExpectedSize(6);
                        builderBuilderWithExpectedSize.put(ExternalValidation.class, new ed0.d((wl2.a) cVar4.U.get()));
                        builderBuilderWithExpectedSize.put(MaxLengthValidation.class, new ed0.f());
                        builderBuilderWithExpectedSize.put(MinLengthValidation.class, new ed0.h());
                        builderBuilderWithExpectedSize.put(RegexValidation.class, new ed0.i((zzl.b) cVar4.A.get()));
                        builderBuilderWithExpectedSize.put(MinAmountValidation.class, new ed0.g());
                        builderBuilderWithExpectedSize.put(MaxAmountValidation.class, new ed0.e());
                        return new qc0.j0(kVar2, fVar2, bVar7, aVar17, kVar3, f0Var, zVar, bVar8, c0Var, k0Var, i0Var, b0Var, hVar3, nVar, dVar4, pVar, lVar, mVar2, a0Var, i1Var, l0Var, e0Var, j0Var, jVar5, tVar, qVar2, sVar, fVar3, gVar2, uVar, g0Var, qVar3, sVar2, kVar4, aVar18, d0Var, tVarD, jVarA, aVar19, dVar5, fVar4, aVar20, oVar, new dd0.c(builderBuilderWithExpectedSize.build()), new cd0.d());
                    case 9:
                        modelsProvider = new b1e.a(cVar4.f148525c.q(), (g1e.b) cVar4.f148540r.get());
                        return modelsProvider;
                    case 10:
                        x90.c cVar5 = cVar4.d;
                        qc0.k state = (qc0.k) cVar4.f148540r.get();
                        Intrinsics.checkNotNullParameter(state, "state");
                        vc.s.k(state);
                        return state;
                    case 11:
                        x90.c cVar6 = cVar4.d;
                        modelsProvider = new qi3.b((com.revolut.feature.chooser.d) cVar4.f148544t.get());
                        Intrinsics.checkNotNullParameter(modelsProvider, "modelsProvider");
                        return modelsProvider;
                    case 12:
                        x90.c cVar7 = cVar4.d;
                        l80.e eVarH = cVar4.f148523b.h();
                        vc.s.j(eVarH);
                        return wpg.v.l(cVar7, eVarH);
                    case 13:
                        x90.c cVar8 = cVar4.d;
                        return new f0();
                    case 14:
                        x90.c cVar9 = cVar4.d;
                        return new aa0.b();
                    case 15:
                        x90.c cVar10 = cVar4.d;
                        return new c0();
                    case 16:
                        x90.c cVar11 = cVar4.d;
                        return new k0();
                    case 17:
                        x90.c cVar12 = cVar4.d;
                        z80.b bVarS = cVar4.f148523b.s();
                        vc.s.j(bVarS);
                        return wpg.v.g(cVar12, bVarS, (y) cVar4.B.get());
                    case 18:
                        return wpg.v.i(cVar4.d, (zzl.b) cVar4.A.get());
                    case 19:
                        h1e.i.Companion.getClass();
                        return new zzl.c();
                    case 20:
                        x90.c cVar13 = cVar4.d;
                        return new aa0.h();
                    case 21:
                        x90.c cVar14 = cVar4.d;
                        return new aa0.n();
                    case 22:
                        return wpg.v.h(cVar4.d, (y) cVar4.B.get());
                    case 23:
                        x90.c cVar15 = cVar4.d;
                        return new aa0.p();
                    case 24:
                        x90.c cVar16 = cVar4.d;
                        return new aa0.l();
                    case 25:
                        x90.c cVar17 = cVar4.d;
                        return new aa0.m();
                    case 26:
                        x90.c cVar18 = cVar4.d;
                        return new a0();
                    case 27:
                        x90.c cVar19 = cVar4.d;
                        return new i1();
                    case 28:
                        x90.c cVar20 = cVar4.d;
                        return new l0();
                    case 29:
                        x90.c cVar21 = cVar4.d;
                        return new e0();
                    case 30:
                        x90.c cVar22 = cVar4.d;
                        return new j0();
                    case 31:
                        x90.c cVar23 = cVar4.d;
                        return new ad0.b();
                    case 32:
                        return new ym.d();
                    case 33:
                        x90.c cVar24 = cVar4.d;
                        return new bd0.e();
                    case 34:
                        return wpg.v.s(cVar4.d, (yc0.b0) cVar4.S.get());
                    case 35:
                        return wpg.v.u(cVar4.d, (qc0.k) cVar4.f148540r.get(), new smd.s((la0.c) cVar4.R.get()));
                    case 36:
                        return wpg.v.e(cVar4.d, (qc0.k) cVar4.f148540r.get());
                    case 37:
                        x90.c cVar25 = cVar4.d;
                        modelsProvider = new aa0.w((wl2.f) cVar4.f148542s.get(), cVar4.f.b());
                        Intrinsics.checkNotNullParameter(modelsProvider, "legacyBackendFlowAdapterInteractor");
                        return modelsProvider;
                    case 38:
                        return new mm.d();
                    case 39:
                        return wpg.v.c(cVar4.d, (yc0.b0) cVar4.S.get());
                    case 40:
                        aVar = new vc0.a((qc0.j) cVar4.Z.get(), (qc0.k) cVar4.f148540r.get(), (ln.a) cVar4.f148539q.get(), new xl2.f(true, 14), (mm.d) cVar4.X.get(), cVar4.d());
                        return aVar;
                    case 41:
                        modelsProvider = new vc0.b((ln.a) cVar4.f148539q.get());
                        return modelsProvider;
                    case 42:
                        aVar = new vc0.c((qc0.k) cVar4.f148540r.get(), (qc0.j) cVar4.Z.get(), (wl2.f) cVar4.f148542s.get(), cVar4.e.a(), new ca0.a(), cVar4.d());
                        return aVar;
                    case 43:
                        x90.c cVar26 = cVar4.d;
                        qc0.j router = (qc0.j) cVar4.Z.get();
                        Intrinsics.checkNotNullParameter(router, "router");
                        vc.s.k(router);
                        return router;
                    case 44:
                        return new sm.e();
                    case 45:
                        return new om.c();
                    case 46:
                        return new g3l.g();
                    case 47:
                        return new an.a();
                    case 48:
                        return new d4l.a();
                    case 49:
                        x90.c cVar27 = cVar4.d;
                        qc0.h state2 = (qc0.h) cVar4.W.get();
                        Intrinsics.checkNotNullParameter(state2, "state");
                        vc.s.k(state2);
                        return state2;
                    case 50:
                        h1e.i.Companion.getClass();
                        return new t80.c(new e.a("StockLending"), SizeBasedTriggeringPolicy.DEFAULT_MAX_FILE_SIZE);
                    case 51:
                        return wpg.v.d(cVar4.d, (qc0.k) cVar4.f148540r.get(), (la0.c) cVar4.R.get(), ImmutableMap.of(WidgetProgressionItem.class, new z90.b()));
                    case 52:
                        Context context2 = cVar4.f148529h;
                        h1e.i.Companion.getClass();
                        Intrinsics.checkNotNullParameter(context2, "context");
                        modelsProvider = new p80.a(context2);
                        return modelsProvider;
                    case 53:
                        return wpg.v.t(cVar4.d, (bd0.d) cVar4.Q.get());
                    case 54:
                        x90.c cVar28 = cVar4.d;
                        z70.a aVarF = cVar4.f148523b.f();
                        vc.s.j(aVarF);
                        return wpg.v.p(cVar28, aVarF);
                    case 55:
                        x90.c cVar29 = cVar4.d;
                        return new yc0.w();
                    case 56:
                        x90.c cVar30 = cVar4.d;
                        qc0.j router2 = (qc0.j) cVar4.Z.get();
                        Intrinsics.checkNotNullParameter(router2, "router");
                        vc.s.k(router2);
                        return router2;
                    case 57:
                        x90.c cVar31 = cVar4.d;
                        qc0.h state3 = (qc0.h) cVar4.W.get();
                        Intrinsics.checkNotNullParameter(state3, "state");
                        vc.s.k(state3);
                        return state3;
                    default:
                        throw new AssertionError(i32);
                }
            case 8:
                h30.v vVar = (h30.v) this.f143400c;
                t50.h hVar4 = vVar.f148972a;
                int i33 = this.f143399b;
                if (i33 == 0) {
                    return new t50.o(hVar4, new t50.v());
                }
                if (i33 != 1) {
                    throw new AssertionError(i33);
                }
                f01.a aVarG = vVar.f148973b.f148906b.g();
                vc.s.j(aVarG);
                return new t50.w(hVar4, new z40.c(aVarG), new t50.v());
            case 9:
                h30.g0 g0Var2 = (h30.g0) this.f143400c;
                l70.e eVar6 = g0Var2.f148895b;
                int i43 = this.f143399b;
                if (i43 != 0) {
                    if (i43 == 1) {
                        return new c40.b();
                    }
                    throw new AssertionError(i43);
                }
                c40.b bVar9 = (c40.b) g0Var2.f148896c.get();
                yk0.c cVar32 = g0Var2.f148894a;
                z70.a aVarF2 = eVar6.f();
                vc.s.j(aVarF2);
                s70.a aVarM2 = eVar6.m();
                vc.s.j(aVarM2);
                h30.h.Companion.getClass();
                e.a aVar21 = h80.e.f149935b;
                vc.s.k(aVar21);
                return new q20.b(bVar9, cVar32, aVarF2, aVarM2, aVar21);
            case 10:
                return a();
            case 11:
                h8j.b bVar10 = (h8j.b) this.f143400c;
                int i59 = this.f143399b;
                if (i59 == 0) {
                    return new i8j.d((cli.n) bVar10.f150061b.get());
                }
                if (i59 == 1) {
                    return new i8j.f(bVar10.f150060a);
                }
                throw new AssertionError(i59);
            case 12:
                h9h.d dVar6 = (h9h.d) this.f143400c;
                int i66 = this.f143399b;
                if (i66 == 0) {
                    return new nch.k(new nch.l(), dVar6.f150295a, (f01.a) dVar6.f150297c.get(), new ich.t());
                }
                if (i66 != 1) {
                    throw new AssertionError(i66);
                }
                ViewController viewController = dVar6.f150296b;
                och.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(viewController, "viewController");
                return new f01.c(viewController.m2());
            case 13:
                return b();
            case 14:
                i iVar = (i) this.f143400c;
                int i74 = this.f143399b;
                if (i74 == 0) {
                    l80.e eVarH2 = iVar.f150787b.h();
                    vc.s.j(eVarH2);
                    jVar = new fc2.j(eVarH2);
                } else {
                    if (i74 != 1) {
                        if (i74 != 2) {
                            throw new AssertionError(i74);
                        }
                        Context context3 = iVar.f150788c;
                        hc2.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(context3, "context");
                        return sri.o.c(context3, null, null, 14);
                    }
                    sri.m mVar3 = (sri.m) iVar.f.get();
                    uw1.c cVarD2 = ((lz1.m) iVar.f150786a).d();
                    vc.s.j(cVarD2);
                    jVar = new gc2.c(mVar3, cVarD2, iVar.d.b());
                }
                return jVar;
            case 15:
                return c();
            case 16:
                return d();
            case 17:
                return e();
            case 18:
                return f();
            case 19:
                return g();
            case 20:
                return h();
            case 21:
                return i();
            case 22:
                return j();
            case 23:
                return k();
            case 24:
                return l();
            case 25:
                return m();
            case 26:
                return n();
            case 27:
                return o();
            case 28:
                return p();
            default:
                i39.a aVar22 = (i39.a) this.f143400c;
                int i92 = this.f143399b;
                switch (i92) {
                    case 0:
                        zxb.k0 k0Var2 = aVar22.f158113b;
                        zxb.k0 k0Var3 = aVar22.f158113b;
                        eub.a aVarA6 = k0Var2.a();
                        vc.s.j(aVarA6);
                        m0 m0VarG = k0Var3.g();
                        vc.s.j(m0VarG);
                        fub.k kVarD = aVar22.f158114c.d();
                        vc.s.j(kVarD);
                        nhf.a aVarA7 = aVar22.d.a();
                        vc.s.j(aVarA7);
                        eub.i iVarE = k0Var3.e();
                        vc.s.j(iVarE);
                        return new m39.f(aVarA6, m0VarG, kVarD, aVarA7, iVarE);
                    case 1:
                        n69.a aVar23 = aVar22.e;
                        did.d dVar7 = aVar22.f;
                        p69.a aVarA8 = aVar23.a();
                        vc.s.j(aVarA8);
                        jid.x xVar = new jid.x(dVar7.d());
                        w39.b bVarA3 = aVar22.f158115g.a();
                        vc.s.j(bVarA3);
                        return kxa.j.w(aVarA8, xVar, bVarA3, new mjd.b(new ljd.b(), dVar7.f114992a.a()), aVar22.f158116h.b());
                    case 2:
                        aoj.a aVar24 = aVar22.i;
                        afj.b bVar11 = aVar22.k;
                        doj.a aVarA9 = aVar24.a();
                        vc.s.j(aVarA9);
                        oej.a aVarA10 = aVar22.f158117j.a();
                        vc.s.j(aVarA10);
                        hej.a aVar25 = (hej.a) bVar11.z0.get();
                        vc.s.j(aVar25);
                        cej.a aVarL = bVar11.l();
                        vc.s.j(aVarL);
                        return hy1.g.b(aVarA9, aVarA10, aVar25, aVarL);
                    case 3:
                        aoj.a aVar26 = aVar22.i;
                        afj.b bVar12 = aVar22.k;
                        doj.a aVarA11 = aVar26.a();
                        vc.s.j(aVarA11);
                        oej.a aVarA12 = aVar22.f158117j.a();
                        vc.s.j(aVarA12);
                        hej.a aVar27 = (hej.a) bVar12.z0.get();
                        vc.s.j(aVar27);
                        cej.a aVarL2 = bVar12.l();
                        vc.s.j(aVarL2);
                        return hy1.g.a(aVarA11, aVarA12, aVar27, aVarL2);
                    case 4:
                        exb.a factory2 = (exb.a) aVar22.f158118l.f169080c.get();
                        vc.s.j(factory2);
                        svb.a giftcardsFeatureInteractor = aVar22.f158119m.a();
                        vc.s.j(giftcardsFeatureInteractor);
                        wvb.b giftcardsMediumWidgetItemsProvider = (wvb.b) aVar22.f158118l.d.get();
                        vc.s.j(giftcardsMediumWidgetItemsProvider);
                        Intrinsics.checkNotNullParameter(factory2, "factory");
                        Intrinsics.checkNotNullParameter(giftcardsFeatureInteractor, "giftcardsFeatureInteractor");
                        Intrinsics.checkNotNullParameter(giftcardsMediumWidgetItemsProvider, "giftcardsMediumWidgetItemsProvider");
                        Intrinsics.checkNotNullParameter(giftcardsFeatureInteractor, "giftcardsFeatureInteractor");
                        Intrinsics.checkNotNullParameter(giftcardsMediumWidgetItemsProvider, "giftcardsMediumWidgetItemsProvider");
                        return new dxb.c(giftcardsFeatureInteractor, giftcardsMediumWidgetItemsProvider);
                    case 5:
                        lvi.a factory3 = (lvi.a) aVar22.f158120n.d.get();
                        vc.s.j(factory3);
                        mti.h asftProductAvailabilityInteractor = (mti.h) aVar22.o.f189544p.get();
                        vc.s.j(asftProductAvailabilityInteractor);
                        eti.a asftMediumWidgetItemsProvider = (eti.a) aVar22.f158120n.e.get();
                        vc.s.j(asftMediumWidgetItemsProvider);
                        Intrinsics.checkNotNullParameter(factory3, "factory");
                        Intrinsics.checkNotNullParameter(asftProductAvailabilityInteractor, "asftProductAvailabilityInteractor");
                        Intrinsics.checkNotNullParameter(asftMediumWidgetItemsProvider, "asftMediumWidgetItemsProvider");
                        Intrinsics.checkNotNullParameter(asftProductAvailabilityInteractor, "asftProductAvailabilityInteractor");
                        Intrinsics.checkNotNullParameter(asftMediumWidgetItemsProvider, "asftMediumWidgetItemsProvider");
                        return new kvi.c(asftProductAvailabilityInteractor, asftMediumWidgetItemsProvider);
                    case 6:
                        l1c.a aVarA13 = aVar22.f158121p.a();
                        vc.s.j(aVarA13);
                        nyb.k0 k0Var4 = (nyb.k0) aVar22.f158113b.f0.get();
                        vc.s.j(k0Var4);
                        return olc.c.a(aVarA13, k0Var4, aVar22.f158121p.b());
                    case 7:
                        fzi.a factory4 = (fzi.a) aVar22.f158122q.f109750c.get();
                        vc.s.j(factory4);
                        dwi.x airportLoungesAvailabilityInteractor = (dwi.x) aVar22.f158123r.f109801m.get();
                        vc.s.j(airportLoungesAvailabilityInteractor);
                        vvi.b airportLoungesMediumWidgetItemsProvider = (vvi.b) aVar22.f158122q.d.get();
                        vc.s.j(airportLoungesMediumWidgetItemsProvider);
                        Intrinsics.checkNotNullParameter(factory4, "factory");
                        Intrinsics.checkNotNullParameter(airportLoungesAvailabilityInteractor, "airportLoungesAvailabilityInteractor");
                        Intrinsics.checkNotNullParameter(airportLoungesMediumWidgetItemsProvider, "airportLoungesMediumWidgetItemsProvider");
                        Intrinsics.checkNotNullParameter(airportLoungesAvailabilityInteractor, "airportLoungesAvailabilityInteractor");
                        Intrinsics.checkNotNullParameter(airportLoungesMediumWidgetItemsProvider, "airportLoungesMediumWidgetItemsProvider");
                        return new ezi.c(airportLoungesAvailabilityInteractor, airportLoungesMediumWidgetItemsProvider);
                    case 8:
                        xuj.i iVar2 = aVar22.f158124s;
                        xuj.i iVar3 = aVar22.f158124s;
                        pvj.a factory5 = (pvj.a) iVar2.f309100n.get();
                        vc.s.j(factory5);
                        ovj.a tripItineraryWidgetAvailabilityInteractor = (ovj.a) iVar3.f309105t.get();
                        vc.s.j(tripItineraryWidgetAvailabilityInteractor);
                        ovj.g tripItineraryWidgetItemsProvider = new ovj.g((yuj.a) iVar3.f309104s.get(), new ovj.f());
                        Intrinsics.checkNotNullParameter(factory5, "factory");
                        Intrinsics.checkNotNullParameter(tripItineraryWidgetAvailabilityInteractor, "tripItineraryWidgetAvailabilityInteractor");
                        Intrinsics.checkNotNullParameter(tripItineraryWidgetItemsProvider, "tripItineraryWidgetItemsProvider");
                        Intrinsics.checkNotNullParameter(tripItineraryWidgetAvailabilityInteractor, "tripItineraryWidgetAvailabilityInteractor");
                        Intrinsics.checkNotNullParameter(tripItineraryWidgetItemsProvider, "tripItineraryWidgetItemsProvider");
                        return new ovj.d(tripItineraryWidgetAvailabilityInteractor, tripItineraryWidgetItemsProvider);
                    case 9:
                        p69.a aVarA14 = aVar22.e.a();
                        vc.s.j(aVarA14);
                        return kxa.j.v(aVarA14);
                    case 10:
                        doj.a aVarA15 = aVar22.i.a();
                        vc.s.j(aVarA15);
                        ioj.a aVar28 = (ioj.a) aVar22.k.A0.get();
                        vc.s.j(aVar28);
                        return hy1.g.p(aVarA15, aVar28);
                    case 11:
                        exb.a factory6 = (exb.a) aVar22.f158118l.f169080c.get();
                        vc.s.j(factory6);
                        Intrinsics.checkNotNullParameter(factory6, "factory");
                        return new dxb.a();
                    case 12:
                        lvi.a factory7 = (lvi.a) aVar22.f158120n.d.get();
                        vc.s.j(factory7);
                        Intrinsics.checkNotNullParameter(factory7, "factory");
                        return new kvi.a();
                    case 13:
                        fzi.a factory8 = (fzi.a) aVar22.f158122q.f109750c.get();
                        vc.s.j(factory8);
                        Intrinsics.checkNotNullParameter(factory8, "factory");
                        return new ezi.a();
                    case 14:
                        return new m39.a();
                    case 15:
                        ioj.a aVar29 = (ioj.a) aVar22.k.A0.get();
                        vc.s.j(aVar29);
                        return new a67.a(aVar29, 2);
                    case 16:
                        f4h.a widgetsInteractorFactory = aVar22.f158112a.b();
                        csh.k widgetsDependenciesApi = (csh.k) aVar22.M.get();
                        Intrinsics.checkNotNullParameter(widgetsInteractorFactory, "widgetsInteractorFactory");
                        Intrinsics.checkNotNullParameter(widgetsDependenciesApi, "widgetsDependenciesApi");
                        return widgetsInteractorFactory.i(widgetsDependenciesApi);
                    case 17:
                        return new h39.b();
                    case 18:
                        return new k39.a();
                    case 19:
                        exb.a factory9 = (exb.a) aVar22.f158118l.f169080c.get();
                        vc.s.j(factory9);
                        ash.d widgetsCommonEventDispatcher = (ash.d) aVar22.P.get();
                        ish.a0 widgetsUiInteractor = aVar22.f158112a.c();
                        vc.s.j(widgetsUiInteractor);
                        Intrinsics.checkNotNullParameter(factory9, "factory");
                        Intrinsics.checkNotNullParameter(widgetsCommonEventDispatcher, "widgetsCommonEventDispatcher");
                        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
                        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
                        Intrinsics.checkNotNullParameter(widgetsCommonEventDispatcher, "widgetsCommonEventDispatcher");
                        return new dxb.d(widgetsCommonEventDispatcher, widgetsUiInteractor);
                    case 20:
                        lvi.a factory10 = (lvi.a) aVar22.f158120n.d.get();
                        vc.s.j(factory10);
                        ash.d widgetsCommonEventDispatcher2 = (ash.d) aVar22.P.get();
                        ish.a0 widgetsUiInteractor2 = aVar22.f158112a.c();
                        vc.s.j(widgetsUiInteractor2);
                        jvi.c asftPassAvailabilityMapper = (jvi.c) aVar22.o.E.get();
                        vc.s.j(asftPassAvailabilityMapper);
                        Intrinsics.checkNotNullParameter(factory10, "factory");
                        Intrinsics.checkNotNullParameter(widgetsCommonEventDispatcher2, "widgetsCommonEventDispatcher");
                        Intrinsics.checkNotNullParameter(widgetsUiInteractor2, "widgetsUiInteractor");
                        Intrinsics.checkNotNullParameter(asftPassAvailabilityMapper, "asftPassAvailabilityMapper");
                        Intrinsics.checkNotNullParameter(widgetsUiInteractor2, "widgetsUiInteractor");
                        Intrinsics.checkNotNullParameter(widgetsCommonEventDispatcher2, "widgetsCommonEventDispatcher");
                        Intrinsics.checkNotNullParameter(asftPassAvailabilityMapper, "asftPassAvailabilityMapper");
                        return new kvi.e(widgetsUiInteractor2, widgetsCommonEventDispatcher2, asftPassAvailabilityMapper);
                    case 21:
                        fzi.a factory11 = (fzi.a) aVar22.f158122q.f109750c.get();
                        vc.s.j(factory11);
                        ash.d widgetsCommonEventDispatcher3 = (ash.d) aVar22.P.get();
                        ish.a0 widgetsUiInteractor3 = aVar22.f158112a.c();
                        vc.s.j(widgetsUiInteractor3);
                        Intrinsics.checkNotNullParameter(factory11, "factory");
                        Intrinsics.checkNotNullParameter(widgetsCommonEventDispatcher3, "widgetsCommonEventDispatcher");
                        Intrinsics.checkNotNullParameter(widgetsUiInteractor3, "widgetsUiInteractor");
                        Intrinsics.checkNotNullParameter(widgetsUiInteractor3, "widgetsUiInteractor");
                        Intrinsics.checkNotNullParameter(widgetsCommonEventDispatcher3, "widgetsCommonEventDispatcher");
                        return new ezi.d(widgetsCommonEventDispatcher3, widgetsUiInteractor3);
                    default:
                        throw new AssertionError(i92);
                }
        }
    }

    public a(gp9.d dVar, gp9.c cVar, int i) {
        this.f143398a = 3;
        this.f143400c = cVar;
        this.f143399b = i;
    }
}
