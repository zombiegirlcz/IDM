package fw2;

import ael.t;
import android.content.Context;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import bjl.q0;
import com.revolut.core.faq.data.db.FaqDatabase;
import com.revolut.core.faq.data.network.AiSearchService;
import com.revolut.core.faq.data.network.FaqFeedbackService;
import com.revolut.core.faq.data.network.FaqService;
import com.revolut.core.faq.data.network.HelpCenterService;
import com.revolut.core.faq.data.network.LightenedFaqService;
import com.revolut.core.faq.data.network.PigeonService;
import com.revolut.core.faq.data.network.TroubleshooterService;
import com.revolut.feature.junior.card_request.impl.data.service.JuniorCardRequestService;
import com.revolut.feature.payments.recipients.settings.impl.data.db.RecipientSettingsDatabase;
import com.revolut.feature.payments.recipients.settings.impl.data.network.RecipientPaymentsSettingsService;
import com.revolut.feature.revolut_x_common.impl.data.network.RevolutXCommonService;
import com.revolut.feature.transactions.impl.data.network.RecallableService;
import com.revolut.feature.travel.hotels.impl.database.TravelHotelsDatabase;
import com.revolut.feature.travel.hotels.impl.network.TravelHotelsService;
import com.revolut.feature.wealth.impl.data.database.WealthDatabase;
import com.revolut.feature.wealth.impl.data.network.eodrates.EodRatesService;
import com.revolut.feature.wealth.impl.data.network.mostowned.MostOwnedAssetsService;
import com.revolut.feature.wealth.impl.data.network.portfolio_metrics.PortfolioMetricsService;
import com.revolut.feature.wealth.impl.data.network.promotions.PromotionsService;
import com.revolut.feature.wealth.impl.data.network.recurring_orders.PortfolioRecurringOrdersService;
import com.revolut.feature.wealth.impl.data.network.stock_lending.StockLendingService;
import com.revolut.feature.widgets.impl.network.WidgetService;
import com.revolut.feature.workflow.engine.shared.data.WorkflowService;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import com.revolut.retail.feature.impl.budgeting_cycle.network.AnalyticsCycleService;
import e8h.d0;
import e8h.n0;
import e8h.y;
import ecm.q;
import evh.i;
import fag.j0;
import fag.y0;
import fag.z0;
import fsl.w;
import g9g.b2;
import g9g.c2;
import g9g.m1;
import g9g.s1;
import g9g.y1;
import hvf.e0;
import hvf.k0;
import i9g.b0;
import i9g.h0;
import kg.p;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import u90.x;
import us6.w3;
import vc.s;
import wf0.g0;
import wf0.u0;
import x8h.a0;
import x8h.c0;
import x8h.i0;
import x8h.l0;
import x8h.t0;
import x8h.v0;
import z0g.f1;
import z8g.r;
import zhm.f0;
import zhm.u;
import zhm.v;
import zuh.o;

/* JADX INFO: loaded from: classes13.dex */
public final class l implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f138555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f138556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f138557c;

    public /* synthetic */ l(Object obj2, int i, int i2) {
        this.f138555a = i2;
        this.f138557c = obj2;
        this.f138556b = i;
    }

    private final Object a() {
        gvh.a aVar = (gvh.a) this.f138557c;
        int i = this.f138556b;
        switch (i) {
            case 0:
                return new jvh.a((o) aVar.o.get());
            case 1:
                ue0.c cVar = (ue0.c) aVar.f147168h.get();
                ne0.j jVar = (ne0.j) aVar.i.get();
                WorkflowService workflowService = (WorkflowService) aVar.f147169j.get();
                avh.e eVar = (avh.e) aVar.f147171m.get();
                cvh.b bVar = (cvh.b) aVar.f147172n.get();
                yxc.l lVar = (yxc.l) aVar.d.f293075b.get();
                s.j(lVar);
                return new o(cVar, jVar, workflowService, eVar, bVar, new zjh.c(lVar));
            case 2:
                je0.d mapper = (je0.d) aVar.f147167g.get();
                yk0.a databaseSessionProvider = aVar.f147165b.b();
                s.j(databaseSessionProvider);
                xe0.f storageFactory = aVar.f147164a.f();
                s.j(storageFactory);
                gvh.f.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                return xe0.f.f(storageFactory, databaseSessionProvider, "workflow_engine", mapper, 2, u.c(new ei7.a(5)), 32);
            case 3:
                kg.o gson = (kg.o) aVar.f.get();
                le0.b factory = aVar.f147164a.c();
                s.j(factory);
                gvh.f.Companion.getClass();
                Intrinsics.checkNotNullParameter(gson, "gson");
                Intrinsics.checkNotNullParameter(factory, "factory");
                return factory.a(gson);
            case 4:
                ee0.a aVar2 = aVar.f147164a;
                kg.o gson2 = fe0.c.a();
                zuh.a workflowGsonBuilderConfigurator = (zuh.a) aVar.e.get();
                gvh.f.Companion.getClass();
                Intrinsics.checkNotNullParameter(gson2, "gson");
                Intrinsics.checkNotNullParameter(workflowGsonBuilderConfigurator, "workflowGsonBuilderConfigurator");
                p pVar = new p(gson2);
                he0.m mVar = new he0.m("type", evh.i.class, false, false);
                mVar.c(i.k.class, "YES_NO");
                mVar.c(i.g.class, "SINGLE_CHOICE");
                mVar.c(i.d.class, "MULTI_CHOICE");
                mVar.c(i.h.class, "TEXT");
                mVar.c(i.c.class, "MONETARY_VALUE_WITH_FREQUENCY");
                mVar.c(i.b.class, "DOCUMENT_UPLOAD");
                mVar.c(i.a.class, "CITY");
                mVar.c(i.C0758i.class, "TIMELINE");
                mVar.c(i.e.class, "MULTI_TEXT");
                mVar.c(i.j.class, "FALLBACK_SUBTYPE_LABEL");
                Intrinsics.checkNotNullExpressionValue(mVar, "registerFallbackSubtype(...)");
                pVar.e.add(mVar);
                workflowGsonBuilderConfigurator.getClass();
                zuh.a.a(pVar);
                kg.o oVarB = pVar.b();
                Intrinsics.checkNotNullExpressionValue(oVarB, "create(...)");
                return oVarB;
            case 5:
                return gvh.g.a();
            case 6:
                gvh.f.Companion.getClass();
                return new ne0.d();
            case 7:
                kg.o gson3 = (kg.o) aVar.f.get();
                ysb.a deps = aVar.f147166c;
                gvh.f.Companion.getClass();
                Intrinsics.checkNotNullParameter(gson3, "gson");
                Intrinsics.checkNotNullParameter(deps, "deps");
                Retrofit.Builder builderNewBuilder = ((Retrofit) deps.f316431b.get()).newBuilder();
                builderNewBuilder.converterFactories().clear();
                builderNewBuilder.addConverterFactory(GsonConverterFactory.create(gson3));
                Object objCreate = builderNewBuilder.build().create(WorkflowService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                WorkflowService workflowService2 = (WorkflowService) objCreate;
                s.k(workflowService2);
                return workflowService2;
            case 8:
                yxc.l lVar2 = (yxc.l) aVar.d.f293075b.get();
                s.j(lVar2);
                return new avh.g(lVar2, (qil.b) aVar.k.get(), (kvh.a) aVar.f147170l.get(), new avh.d((kg.o) aVar.f.get()));
            case 9:
                return new kvh.d();
            case 10:
                return new kvh.a();
            case 11:
                return new cvh.c((kvh.a) aVar.f147170l.get());
            case 12:
                return new kvh.c();
            case 13:
                return new hvh.a();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object b() {
        h98.j jVar = (h98.j) this.f138557c;
        ee0.a aVar = jVar.f150204b;
        int i = this.f138556b;
        if (i == 0) {
            e98.a aVar2 = (e98.a) jVar.f150210m.get();
            x5l.a aVarA = jVar.d.a();
            s.j(aVarA);
            gte.a aVarB = jVar.e.b();
            s.j(aVarB);
            return new i98.e(aVar2, aVarA, aVarB);
        }
        if (i == 1) {
            JuniorCardRequestService juniorCardRequestService = (JuniorCardRequestService) jVar.f150208j.get();
            ne0.j jVar2 = (ne0.j) jVar.k.get();
            ue0.c cVar = (ue0.c) jVar.f150209l.get();
            ze0.a aVarA2 = aVar.a();
            s.j(aVarA2);
            return new e98.f(juniorCardRequestService, jVar2, cVar, aVarA2);
        }
        if (i == 2) {
            return h98.m.a(((nj0.d) jVar.f150203a).f());
        }
        if (i == 3) {
            return new ne0.d();
        }
        if (i == 4) {
            je0.d dVarB = aVar.b();
            s.j(dVarB);
            yk0.a aVarB2 = jVar.f150205c.b();
            s.j(aVarB2);
            xe0.f fVarF = aVar.f();
            s.j(fVarF);
            return h7d.a.m(dVarB, fVarF, aVarB2);
        }
        if (i != 5) {
            throw new AssertionError(i);
        }
        ic8.b bVar = (ic8.b) jVar.f150211n.get();
        hj8.a aVarA3 = jVar.f.a();
        s.j(aVarA3);
        te8.e eVarA = jVar.f150206g.a();
        s.j(eVarA);
        return new g98.k(bVar, aVarA3, eVarA, jVar.f150207h.a(), jVar.i.b());
    }

    private final Object c() {
        h9h.a aVar = (h9h.a) this.f138557c;
        int i = 2;
        int i2 = this.f138556b;
        switch (i2) {
            case 0:
                ybl.k kVarD = aVar.f150256a.d();
                s.j(kVarD);
                ybl.d dVarH = aVar.f150258b.h();
                s.j(dVarH);
                x8h.k kVarD2 = aVar.d();
                ppk.f fVarA = aVar.f150266j.a();
                p2b.j jVarH = aVar.k.h();
                s.j(jVarH);
                return new c9h.k(kVarD, dVarH, kVarD2, fVarA, jVarH, aVar.L());
            case 1:
                je0.d dVarB = aVar.d.b();
                s.j(dVarB);
                yk0.a aVarB = aVar.e.b();
                s.j(aVarB);
                xe0.f fVarF = aVar.d.f();
                s.j(fVarF);
                return h7d.a.h(dVarB, fVarF, aVarB);
            case 2:
                xoj.a aVarA = aVar.f150263g.a();
                s.j(aVarA);
                tj3.a aVarA2 = aVar.f150264h.a();
                s.j(aVarA2);
                ybl.k kVarD3 = aVar.f150256a.d();
                s.j(kVarD3);
                ybl.l lVarA = aVar.i.a();
                s.j(lVarA);
                return new v0(aVarA, aVarA2, kVarD3, lVarA);
            case 3:
                ue0.c cVar = (ue0.c) aVar.G.get();
                d4m.a aVarA3 = e4m.b.a(aVar.H);
                ne0.j jVar = (ne0.j) aVar.I.get();
                x4l.c cVar2 = (x4l.c) aVar.M.get();
                x4l.c cVar3 = (x4l.c) aVar.N.get();
                x4l.c cVar4 = (x4l.c) aVar.O.get();
                CoroutineScope coroutineScopeA = aVar.f150273p.a();
                s.j(coroutineScopeA);
                return new f8h.d(cVar, aVarA3, jVar, cVar2, cVar3, cVar4, coroutineScopeA);
            case 4:
                an0.c cVar5 = aVar.e;
                ee0.a aVar2 = aVar.d;
                yk0.a aVarB2 = cVar5.b();
                s.j(aVarB2);
                je0.d dVarD = aVar2.d();
                s.j(dVarD);
                xe0.f fVarF2 = aVar2.f();
                s.j(fVarF2);
                return h7d.a.A(dVarD, fVarF2, aVarB2);
            case 5:
                an0.c cVar6 = aVar.e;
                ee0.a aVar3 = aVar.d;
                yk0.a aVarB3 = cVar6.b();
                s.j(aVarB3);
                je0.d dVarD2 = aVar3.d();
                s.j(dVarD2);
                xe0.f fVarF3 = aVar3.f();
                s.j(fVarF3);
                return h7d.a.z(dVarD2, fVarF3, aVarB3);
            case 6:
                return z6h.c.a();
            case 7:
                return m4d.e.A(aVar.f150268l, new n7h.b(e4m.b.a(aVar.K), (ne0.j) aVar.L.get(), e4m.b.a(aVar.G)));
            case 8:
                return p7h.b.t(aVar.f150269m, (Retrofit) aVar.J.get());
            case 9:
                p7h.a aVar4 = aVar.f150269m;
                ik0.b bVarM = ((nj0.d) aVar.f150270n).m();
                s.j(bVarM);
                return oyj.c.j(aVar4, bVarM, fe0.d.a());
            case 10:
                return new ne0.d();
            case 11:
                m7h.a aVar5 = aVar.f150268l;
                d4m.a aVarA4 = e4m.b.a(aVar.K);
                ne0.j jVar2 = (ne0.j) aVar.I.get();
                b80.c cVarP = aVar.o.p();
                s.j(cVarP);
                return m4d.e.z(aVar5, new lal.a(aVarA4, jVar2, cVarP, e4m.b.a(aVar.H)));
            case 12:
                return m4d.e.B(aVar.f150268l, new n7h.e(e4m.b.a(aVar.K), (ne0.j) aVar.L.get()));
            case 13:
                return new nd.p(new y((PromotionsService) aVar.T.get(), new ej9.c((ue0.c) aVar.V.get(), 2), (ne0.j) aVar.L.get()));
            case 14:
                return oyj.c.t(aVar.f150269m, (Retrofit) aVar.S.get());
            case 15:
                p7h.a aVar6 = aVar.f150269m;
                Retrofit retrofitF = ((nj0.d) aVar.f150270n).f();
                kg.o oVar = (kg.o) aVar.R.get();
                return j6.a.B(p.a.x(retrofitF, "retrofit", oVar, "gson"), oVar, "build(...)");
            case 16:
                k7h.b.Companion.getClass();
                Object value = p8h.a.f234155a.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                kg.o oVar2 = (kg.o) value;
                s.k(oVar2);
                return oVar2;
            case 17:
                je0.d dVar = (je0.d) aVar.U.get();
                yk0.a aVarB4 = aVar.e.b();
                s.j(aVarB4);
                xe0.f fVarF4 = aVar.d.f();
                s.j(fVarF4);
                return h7d.a.q(dVar, fVarF4, aVarB4);
            case 18:
                kg.o gson = (kg.o) aVar.R.get();
                le0.b gsonObjectMapperFactory = aVar.d.c();
                s.j(gsonObjectMapperFactory);
                h8h.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(gson, "gson");
                Intrinsics.checkNotNullParameter(gsonObjectMapperFactory, "gsonObjectMapperFactory");
                return gsonObjectMapperFactory.a(gson);
            case 19:
                return p7h.b.D(aVar.f150269m, (Retrofit) aVar.S.get());
            case 20:
                je0.d mapper = (je0.d) aVar.U.get();
                yk0.a databaseSessionProvider = aVar.e.b();
                s.j(databaseSessionProvider);
                xe0.f storageFactory = aVar.d.f();
                s.j(storageFactory);
                h8h.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                int i3 = 1;
                int i5 = 3;
                int i6 = 4;
                int i21 = 5;
                int i22 = 6;
                return xe0.f.f(storageFactory, databaseSessionProvider, "WealthStorage", mapper, 10, v.k(new exa.a(i3, i, i3), new exa.a(i, i5, i3), new exa.a(i5, i6, i3), new exa.a(i6, i21, i), new exa.a(i21, i22, i6), new exa.a(i22, 7, i5), new ei7.a(3), new ei7.a(2), new exa.a(9, 10, i5)), 32);
            case 21:
                zjh.j jVar3 = new zjh.j((w4l.f) aVar.Z.get());
                fk3.a aVarA5 = aVar.f150274q.a();
                s.j(aVarA5);
                return new c0(jVar3, aVarA5);
            case 22:
                m7h.a aVar7 = aVar.f150268l;
                MostOwnedAssetsService mostOwnedAssetsService = (MostOwnedAssetsService) aVar.Y.get();
                k8h.f fVar = new k8h.f((ue0.c) aVar.X.get());
                b7h.a aVar8 = new b7h.a((ne0.j) aVar.L.get(), 0);
                b80.c cVarP2 = aVar.o.p();
                s.j(cVarP2);
                return m4d.e.h(aVar7, new l7h.e(mostOwnedAssetsService, fVar, aVar8, cVarP2));
            case 23:
                return p7h.b.w(aVar.f150269m, (Retrofit) aVar.S.get());
            case 24:
                return p7h.b.x(aVar.f150269m, (Retrofit) aVar.S.get());
            case 25:
                p7h.a aVar9 = aVar.f150269m;
                EodRatesService eodRatesService = (EodRatesService) com.google.android.gms.internal.mlkit_vision_face.a.i((Retrofit) aVar.S.get(), "retrofit", EodRatesService.class, "create(...)");
                s.k(eodRatesService);
                return eodRatesService;
            case 26:
                return p7h.b.z(aVar.f150269m, (Retrofit) aVar.S.get());
            case 27:
                je0.d dVarB2 = aVar.d.b();
                s.j(dVarB2);
                yk0.a aVarB5 = aVar.e.b();
                s.j(aVarB5);
                xe0.f fVarF5 = aVar.d.f();
                s.j(fVarF5);
                return h7d.a.e(dVarB2, fVarF5, aVarB5);
            case 28:
                return p7h.b.u(aVar.f150269m, (Retrofit) aVar.S.get());
            case 29:
                return fp8.c.e((WealthDatabase) aVar.g0.get());
            case 30:
                Context context = aVar.f150277s;
                yk0.a aVarB6 = aVar.e.b();
                s.j(aVarB6);
                de0.a aVarA6 = ((cl0.a) aVar.f150279t).a();
                s.j(aVarA6);
                return fp8.c.i(context, aVarB6, aVarA6);
            case 31:
                z70.a aVarF = aVar.o.f();
                s.j(aVarF);
                return w3.x(aVarF);
            case 32:
                return m4d.e.k(aVar.f150268l, new jt0.b((PortfolioMetricsService) aVar.j0.get(), (ne0.j) aVar.L.get(), (ue0.c) aVar.f150267k0.get()));
            case 33:
                return p7h.b.A(aVar.f150269m, (Retrofit) aVar.S.get());
            case 34:
                je0.d dVarB3 = aVar.d.b();
                s.j(dVarB3);
                yk0.a aVarB7 = aVar.e.b();
                s.j(aVarB7);
                xe0.f fVarF6 = aVar.d.f();
                s.j(fVarF6);
                return h7d.a.o(dVarB3, fVarF6, aVarB7);
            case 35:
                return p7h.b.B(aVar.f150269m, (Retrofit) aVar.S.get());
            case 36:
                je0.d dVarB4 = aVar.d.b();
                s.j(dVarB4);
                yk0.a aVarB8 = aVar.e.b();
                s.j(aVarB8);
                xe0.f fVarF7 = aVar.d.f();
                s.j(fVarF7);
                return h7d.a.p(dVarB4, fVarF7, aVarB8);
            case 37:
                return oyj.c.u(aVar.f150269m, (Retrofit) aVar.S.get());
            case 38:
                return m4d.e.l(aVar.f150268l, new l7h.o((PortfolioRecurringOrdersService) aVar.f150271n0.get(), (ne0.j) aVar.L.get(), (i7h.a) aVar.f150272o0.get()));
            case 39:
                return g7h.c.p((WealthDatabase) aVar.g0.get());
            case 40:
                return m4d.e.t(aVar.f150268l, new l7h.k((PortfolioRecurringOrdersService) aVar.f150271n0.get(), (ne0.j) aVar.L.get(), (i7h.a) aVar.f150272o0.get()));
            case 41:
                return new e8h.j((ne0.j) aVar.L.get(), (ue0.c) aVar.f150276r0.get(), oyj.c.k(aVar.f150269m, (Retrofit) aVar.J.get()));
            case 42:
                je0.d dVarD3 = aVar.d.d();
                s.j(dVarD3);
                yk0.a aVarB9 = aVar.e.b();
                s.j(aVarB9);
                xe0.f fVarF8 = aVar.d.f();
                s.j(fVarF8);
                return h7d.a.k(dVarD3, fVarF8, aVarB9);
            case 43:
                gte.a aVarB10 = aVar.f150284x.b();
                s.j(aVarB10);
                return new a0(aVarB10);
            case 44:
                e4m.e eVar = aVar.F;
                zdl.c cVar7 = aVar.f150258b;
                tzg.m mVar = (tzg.m) eVar.get();
                t tVarF = cVar7.f();
                s.j(tVarF);
                ou5.b bVarB = aVar.f150286y.b();
                p2b.j jVarH2 = aVar.k.h();
                s.j(jVarH2);
                ybl.d dVarH2 = cVar7.h();
                s.j(dVarH2);
                x8h.k kVarD4 = aVar.d();
                gte.a aVarB11 = aVar.f150284x.b();
                s.j(aVarB11);
                t tVarF2 = cVar7.f();
                s.j(tVarF2);
                return new t0(mVar, tVarF, bVarB, jVarH2, dVarH2, kVarD4, new l0(aVarB11, tVarF2, aVar.F(), cVar7.i()));
            case 45:
                return new n0(p7h.b.p(aVar.f150269m, (Retrofit) aVar.S.get()), (ne0.j) aVar.L.get(), new d8h.a(), (ue0.c) aVar.X.get());
            case 46:
                return new mbh.e(aVar.A.a(), new l4i.a(), new by5.a(new l4i.a(), 27));
            case 47:
                ybl.d dVarH3 = aVar.f150258b.h();
                s.j(dVarH3);
                return new i0(dVarH3, aVar.G());
            case 48:
                return new d0((StockLendingService) aVar.y0.get(), (t90.g) aVar.z0.get());
            case 49:
                return oyj.c.z(aVar.f150269m, (Retrofit) aVar.S.get());
            case 50:
                aVar.getClass();
                return new t90.g(new e84.e(new v90.h(), new v90.e(new x()), new v90.e(h9h.a.K()), new v90.c(), new v90.e(new u90.a0()), new v90.d(aVar.B(), new t90.a(), h9h.a.K(), new u90.c0(new u90.y())), new v90.i(aVar.B()), new v90.g(new t90.a(), new u90.y(), new u90.a0(), h9h.a.K()), new v90.b(aVar.B(), new t90.a(), h9h.a.K())));
            case 51:
                return p7h.b.C(aVar.f150269m, ((nj0.d) aVar.f150270n).f());
            case 52:
                return new s8h.b((sri.m) aVar.C0.get(), new s8h.a());
            case 53:
                return f1.p(aVar.f150277s);
            case 54:
                y2f.a aVarB12 = aVar.f150282w.b();
                s.j(aVarB12);
                return new s8h.m(aVarB12, aVar.z(), (sri.m) aVar.C0.get());
            default:
                throw new AssertionError(i2);
        }
    }

    private final Object d() {
        hd8.a aVar = (hd8.a) this.f138557c;
        a31.a aVar2 = aVar.f;
        a31.a aVar3 = aVar.e;
        int i = this.f138556b;
        if (i == 0) {
            return new jd8.g(aVar.f151388a, aVar.f151389b, aVar.f151390c, aVar.d, aVar3, aVar2, aVar.f151391g, aVar.f151392h);
        }
        if (i == 1) {
            return iz8.c.b(aVar3, aVar.i, aVar2, aVar.f151393j, aVar.f151394l);
        }
        if (i == 2) {
            return h7d.a.B((jd8.g) aVar.k.get());
        }
        throw new AssertionError(i);
    }

    private final Object e() {
        hdi.b bVar = (hdi.b) this.f138557c;
        a31.a aVar = bVar.e;
        int i = this.f138556b;
        if (i == 0) {
            return new bfc.c(bVar.f151446a, bVar.f151447b, bVar.f151448c, bVar.d, aVar, bVar.f, bVar.f151449g, bVar.f151450h, bVar.i, 2);
        }
        if (i == 1) {
            return iz8.c.f(bVar.f151451j);
        }
        if (i == 2) {
            return iz8.c.a(aVar);
        }
        throw new AssertionError(i);
    }

    private final Object f() {
        he9.e eVar = (he9.e) this.f138557c;
        ee0.a aVar = eVar.f151608a;
        int i = this.f138556b;
        if (i == 0) {
            ue0.c storage = (ue0.c) eVar.f151611g.get();
            l80.e dateProvider = eVar.f151610c.h();
            s.j(dateProvider);
            he9.i.Companion.getClass();
            Intrinsics.checkNotNullParameter(storage, "storage");
            Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
            return new ie9.h(storage, dateProvider);
        }
        if (i != 1) {
            if (i == 2) {
                return new oe9.a();
            }
            if (i == 3) {
                return new me9.a();
            }
            if (i != 4) {
                throw new AssertionError(i);
            }
            je0.d dVarB = aVar.b();
            s.j(dVarB);
            xe0.f fVarF = aVar.f();
            s.j(fVarF);
            return iz8.c.o(dVarB, fVarF);
        }
        je0.d mapper = aVar.b();
        s.j(mapper);
        yk0.a databaseSessionProvider = eVar.f151609b.b();
        s.j(databaseSessionProvider);
        xe0.f storageFactory = aVar.f();
        s.j(storageFactory);
        he9.i.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "passcode_screen_storage", mapper, 0, null, 56);
    }

    private final Object g() {
        hjf.b bVar = (hjf.b) this.f138557c;
        ee0.a aVar = bVar.f152763b;
        int i = this.f138556b;
        if (i == 0) {
            return new mjf.u(new xif.i((RecallableService) bVar.d.get(), (ne0.j) bVar.e.get(), (ue0.c) bVar.f.get()));
        }
        if (i == 1) {
            return h7d.a.s(((nj0.d) bVar.f152762a).f());
        }
        if (i == 2) {
            return new ne0.d();
        }
        if (i != 3) {
            if (i == 4) {
                return new hjf.e();
            }
            throw new AssertionError(i);
        }
        je0.d dVarB = aVar.b();
        s.j(dVarB);
        yk0.a aVarB = bVar.f152764c.b();
        s.j(aVarB);
        xe0.f fVarF = aVar.f();
        s.j(fVarF);
        return h7d.a.u(dVarB, aVarB, fVarF);
    }

    private final Object h() {
        hl8.a aVar = (hl8.a) this.f138557c;
        int i = this.f138556b;
        if (i == 0) {
            return new il8.n(aVar.f153403a, aVar.f153404b, aVar.f153405c, aVar.d, aVar.e, aVar.f);
        }
        if (i == 1) {
            return ige.d.c(aVar.f153406g, aVar.f153407h, aVar.i, aVar.f153408j, aVar.f153409l);
        }
        if (i == 2) {
            return h7d.a.C((il8.n) aVar.k.get());
        }
        throw new AssertionError(i);
    }

    private final Object i() {
        hsh.b bVar = (hsh.b) this.f138557c;
        ee0.a aVar = bVar.f155048a;
        csh.c cVar = bVar.d;
        l70.e eVar = bVar.e;
        int i = this.f138556b;
        switch (i) {
            case 0:
                gsh.a0 a0Var = (gsh.a0) bVar.f155052h.get();
                WidgetService widgetService = (WidgetService) bVar.f155053j.get();
                CoroutineScope coroutineScope = (CoroutineScope) bVar.f155051g.get();
                l80.e eVarH = eVar.h();
                s.j(eVarH);
                return new hsh.d(a0Var, widgetService, coroutineScope, eVarH, cVar);
            case 1:
                return new gsh.a0((ue0.c) bVar.f.get(), (CoroutineScope) bVar.f155051g.get());
            case 2:
                je0.d dVarB = aVar.b();
                s.j(dVarB);
                yk0.a aVarB = bVar.f155049b.b();
                s.j(aVarB);
                xe0.f fVarF = aVar.f();
                s.j(fVarF);
                return h7d.a.v(dVarB, fVarF, aVarB);
            case 3:
                return hsh.g.a();
            case 4:
                return h7d.a.f((Retrofit) bVar.i.get());
            case 5:
                return h7d.a.j(((nj0.d) bVar.f155050c).f(), fe0.c.a(), cVar);
            case 6:
                return new ish.a0((gsh.a0) bVar.f155052h.get());
            case 7:
                z70.a aVarF = eVar.f();
                s.j(aVarF);
                return new lsh.b(new c70.b(aVarF, 1));
            default:
                throw new AssertionError(i);
        }
    }

    private final Object j() {
        hsj.e eVar = (hsj.e) this.f138557c;
        ee0.a aVar = eVar.f155064a;
        int i = this.f138556b;
        if (i == 0) {
            je0.d dVarB = aVar.b();
            s.j(dVarB);
            yk0.a aVarB = eVar.f155065b.b();
            s.j(aVarB);
            xe0.f fVarF = aVar.f();
            s.j(fVarF);
            return hsi.b.x(dVarB, aVarB, fVarF);
        }
        if (i == 1) {
            return new isj.c(eVar.f155066c.b(), (lsj.f) eVar.f155068h.get());
        }
        if (i == 2) {
            ue0.c cVar = (ue0.c) eVar.f.get();
            ne0.d dVar = new ne0.d();
            b80.c cVarP = eVar.d.p();
            s.j(cVarP);
            return new lsj.f(cVar, dVar, cVarP, (AnalyticsCycleService) eVar.f155067g.get());
        }
        if (i != 3) {
            if (i == 4) {
                return hsj.d.a();
            }
            throw new AssertionError(i);
        }
        Retrofit retrofitI = ((c21.b) eVar.e).i();
        s.j(retrofitI);
        return hsi.b.c(retrofitI);
    }

    private final Object k() {
        hvf.d dVar = (hvf.d) this.f138557c;
        a31.a aVar = dVar.d;
        a31.a aVar2 = dVar.f155878b;
        q qVar = dVar.f155877a;
        int i = this.f138556b;
        if (i == 0) {
            return new e0(aVar2, dVar.f155879c, aVar, dVar.e, dVar.f, dVar.f155880g, dVar.f155881h, dVar.i, qVar);
        }
        if (i == 1) {
            return new c4f.l(qVar, dVar.f155882j, aVar2, dVar.k, aVar, dVar.f155883l, dVar.f155884m, dVar.f155885n, dVar.o, dVar.f155886p, dVar.f155888r);
        }
        if (i == 2) {
            muf.b bVar = (muf.b) ((e0) dVar.f155887q.get()).b();
            s.k(bVar);
            return bVar;
        }
        if (i == 3) {
            return new a51.d(dVar.f155888r, 10);
        }
        if (i == 4) {
            return new a51.d(dVar.f155888r, 9);
        }
        throw new AssertionError(i);
    }

    private final Object l() {
        hvf.q qVar = (hvf.q) this.f138557c;
        l70.e eVar = qVar.f155943c;
        int i = this.f138556b;
        if (i == 0) {
            return new fvf.a();
        }
        if (i != 1) {
            if (i == 2) {
                return ms1.g.a((lvf.a) qVar.f155948m.get());
            }
            if (i == 3) {
                return k0.a();
            }
            throw new AssertionError(i);
        }
        ouf.a aVarA = ((hvf.b) qVar.f155941a).a();
        s.j(aVarA);
        w39.b bVarA = qVar.f155942b.a();
        s.j(bVarA);
        y80.a aVarR = eVar.r();
        s.j(aVarR);
        s70.a aVarM = eVar.m();
        s.j(aVarM);
        return new lvf.c(aVarA, bVarA, aVarR, aVarM);
    }

    private final Object m() {
        hwj.a aVar = (hwj.a) this.f138557c;
        int i = this.f138556b;
        if (i == 0) {
            return new gwj.b();
        }
        if (i != 1) {
            throw new AssertionError(i);
        }
        Context context = aVar.f156275a;
        CoroutineScope coroutineScopeA = aVar.f156276b.a();
        s.j(coroutineScopeA);
        w39.b bVarA = aVar.f156277c.a();
        s.j(bVarA);
        sri.m mVarD = ((g8b.a) aVar.d).d();
        s.j(mVarD);
        zm0.c cVarJ = aVar.e.j();
        s.j(cVarJ);
        return new iwj.a(context, coroutineScopeA, bVarA, mVarD, cVarJ, aVar.f.e());
    }

    @Override // phm.a
    public final Object get() {
        Object t0Var;
        Object obj2;
        Object obj3;
        int i = this.f138555a;
        int i2 = 1;
        int i3 = this.f138556b;
        Object obj4 = this.f138557c;
        switch (i) {
            case 0:
                int i5 = 5;
                m mVar = (m) obj4;
                a31.a aVar = mVar.f;
                a31.a aVar2 = mVar.f138559b;
                if (i3 == 0) {
                    return new a(mVar.f138558a, aVar2, mVar.f138560c, mVar.d, mVar.e, aVar, mVar.f138561g, mVar.f138562h, mVar.i, mVar.f138563j, mVar.k, mVar.f138564l, mVar.f138565m);
                }
                if (i3 == 1) {
                    return new c3d.d(aVar2, aVar, i5);
                }
                throw new AssertionError(i3);
            case 1:
                fy9.b bVar = (fy9.b) obj4;
                if (i3 == 0) {
                    return new by9.j((RecipientPaymentsSettingsService) bVar.f.get(), (cy9.b) bVar.f138972h.get(), new ne0.d());
                }
                if (i3 == 1) {
                    ik0.b bVarM = ((nj0.d) bVar.f138968a).m();
                    s.j(bVarM);
                    return fp8.c.x(bVarM, bVar.f138969b.a());
                }
                if (i3 == 2) {
                    return fp8.c.w((RecipientSettingsDatabase) bVar.f138971g.get());
                }
                if (i3 != 3) {
                    if (i3 == 4) {
                        return new hy9.c((ay9.b) bVar.i.get());
                    }
                    throw new AssertionError(i3);
                }
                Context context = bVar.f138970c;
                yk0.a aVarB = bVar.d.b();
                s.j(aVarB);
                de0.a aVarA = ((cl0.a) bVar.e).a();
                s.j(aVarA);
                return fp8.c.h(context, aVarB, aVarA);
            case 2:
                g30.b bVar2 = (g30.b) obj4;
                a31.a aVar3 = bVar2.e;
                if (i3 == 0) {
                    return new b3j.h(bVar2.f140148a, bVar2.f140149b, bVar2.f140150c, bVar2.d, bVar2.f140162w, aVar3, bVar2.f140151g, bVar2.f140152h, bVar2.i, bVar2.f140153j, bVar2.k, bVar2.f140154l, bVar2.f140155m, bVar2.f140156n, bVar2.o, bVar2.f140157p, bVar2.f140158q, bVar2.f140159r, bVar2.f140160s, bVar2.f140161t, bVar2.u);
                }
                if (i3 == 1) {
                    return fp8.c.B((h30.g) bVar2.v.get());
                }
                if (i3 == 2) {
                    return gsi.d.e(aVar3, bVar2.f);
                }
                throw new AssertionError(i3);
            case 3:
                g9g.d dVar = (g9g.d) obj4;
                switch (i3) {
                    case 0:
                        fag.t0 t0Var2 = (fag.t0) dVar.f141624h0.get();
                        z0 z0Var = (z0) dVar.i0.get();
                        gte.a aVarB2 = dVar.f141622g.b();
                        s.j(aVarB2);
                        return new i9g.a0(t0Var2, z0Var, aVarB2, (j0) dVar.f141626k0.get(), (p8g.c) dVar.g0.get());
                    case 1:
                        TravelHotelsService travelHotelsService = (TravelHotelsService) dVar.P.get();
                        ne0.j jVar = (ne0.j) dVar.R.get();
                        z8g.l lVar = (z8g.l) dVar.T.get();
                        z8g.b bVar3 = (z8g.b) dVar.U.get();
                        r rVar = (r) dVar.V.get();
                        z8g.s sVar = (z8g.s) dVar.W.get();
                        z8g.d dVar2 = (z8g.d) dVar.X.get();
                        z8g.f fVar = (z8g.f) dVar.Y.get();
                        z8g.p pVar = (z8g.p) dVar.Z.get();
                        z8g.j jVar2 = (z8g.j) dVar.f141616a0.get();
                        l80.e eVarH = dVar.e.h();
                        s.j(eVarH);
                        t0Var = new fag.t0(travelHotelsService, jVar, lVar, bVar3, rVar, sVar, dVar2, fVar, pVar, jVar2, eVarH, (gag.d) dVar.f141618b0.get(), (gag.d) dVar.c0.get(), (ue0.c) dVar.f141621e0.get(), new i90.b(), (gag.c) dVar.f0.get(), new q9g.e(new q9g.c()), (p8g.c) dVar.g0.get());
                        break;
                    case 2:
                        return g7h.c.C((Retrofit) dVar.O.get());
                    case 3:
                        Retrofit retrofitI = ((c21.b) dVar.f141615a).i();
                        s.j(retrofitI);
                        kg.o oVar = (kg.o) dVar.M.get();
                        OkHttpClient okHttpClientE = ((nj0.d) dVar.f141617b).e();
                        s.j(okHttpClientE);
                        return g7h.c.n(retrofitI, oVar, okHttpClientE, (q9g.a) dVar.N.get());
                    case 4:
                        kg.o oVarH = ((c21.b) dVar.f141615a).h();
                        s.j(oVarH);
                        return g7h.c.m(oVarH);
                    case 5:
                        return new q9g.a();
                    case 6:
                        return new ne0.d();
                    case 7:
                        return g7h.c.t((TravelHotelsDatabase) dVar.S.get());
                    case 8:
                        Context context2 = dVar.f141619c;
                        yk0.a aVarB3 = dVar.d.b();
                        s.j(aVarB3);
                        return g7h.c.l(context2, aVarB3, ((c21.b) dVar.f141615a).b());
                    case 9:
                        return g7h.c.r((TravelHotelsDatabase) dVar.S.get());
                    case 10:
                        return g7h.c.z((TravelHotelsDatabase) dVar.S.get());
                    case 11:
                        return g7h.c.A((TravelHotelsDatabase) dVar.S.get());
                    case 12:
                        return g7h.c.s((TravelHotelsDatabase) dVar.S.get());
                    case 13:
                        return g7h.c.u((TravelHotelsDatabase) dVar.S.get());
                    case 14:
                        return g7h.c.y((TravelHotelsDatabase) dVar.S.get());
                    case 15:
                        return g7h.c.w((TravelHotelsDatabase) dVar.S.get());
                    case 16:
                        return new gag.a();
                    case 17:
                        return new gag.b();
                    case 18:
                        je0.d dVar3 = (je0.d) dVar.f141620d0.get();
                        yk0.a aVarB4 = dVar.d.b();
                        s.j(aVarB4);
                        xe0.f fVarF = dVar.f.f();
                        s.j(fVarF);
                        return g7h.c.q(dVar3, aVarB4, fVarF);
                    case 19:
                        le0.b bVarC = dVar.f.c();
                        s.j(bVarC);
                        return g7h.c.o((kg.o) dVar.M.get(), bVarC);
                    case 20:
                        return y1.a();
                    case 21:
                        gte.a aVarB5 = dVar.f141622g.b();
                        s.j(aVarB5);
                        xoj.a aVarA2 = dVar.f141623h.a();
                        s.j(aVarA2);
                        eub.a aVarA3 = dVar.i.a();
                        s.j(aVarA3);
                        return new i9g.v(aVarA3, aVarB5, aVarA2);
                    case 22:
                        return new z0((TravelHotelsService) dVar.P.get(), new j9g.n());
                    case 23:
                        z8g.u uVar = (z8g.u) dVar.j0.get();
                        l80.e eVarH2 = dVar.e.h();
                        s.j(eVarH2);
                        return new j0(uVar, eVarH2);
                    case 24:
                        return g7h.c.B((TravelHotelsDatabase) dVar.S.get());
                    case 25:
                        return new b0((fag.t0) dVar.f141624h0.get(), (p8g.c) dVar.g0.get());
                    case 26:
                        return new h0((fag.t0) dVar.f141624h0.get(), (y0) dVar.f141630n0.get(), dVar.f141625j.b());
                    case 27:
                        return new y0((TravelHotelsService) dVar.P.get(), (ne0.j) dVar.R.get(), (ue0.c) dVar.f141621e0.get());
                    case 28:
                        return new i9g.n((fag.t0) dVar.f141624h0.get(), dVar.f141625j.b());
                    case 29:
                        return new i9g.h(new fag.o((TravelHotelsService) dVar.P.get(), (ne0.j) dVar.R.get()), (fag.t0) dVar.f141624h0.get(), dVar.f141625j.b());
                    case 30:
                        fag.t0 t0Var3 = (fag.t0) dVar.f141624h0.get();
                        ffk.t tVarF = dVar.k.f();
                        s.j(tVarF);
                        return new i9g.p(t0Var3, tVarF);
                    case 31:
                        return g7h.c.D(dVar.f141627l, dVar.f141619c);
                    case 32:
                        return b2.a(dVar.f141619c, dVar.f141628m.g());
                    case 33:
                        return new qy5.a((fag.t0) dVar.f141624h0.get());
                    case 34:
                        return new i9g.u((fag.t0) dVar.f141624h0.get());
                    case 35:
                        return new i9g.t((h0) dVar.f141631o0.get(), (fag.t0) dVar.f141624h0.get(), (i9g.i0) dVar.u0.get());
                    case 36:
                        return new i9g.i0((fag.t0) dVar.f141624h0.get());
                    case 37:
                        fag.t0 t0Var4 = (fag.t0) dVar.f141624h0.get();
                        l80.e eVarH3 = dVar.e.h();
                        s.j(eVarH3);
                        return new i9g.o(t0Var4, eVarH3);
                    case 38:
                        l80.e eVarH4 = dVar.e.h();
                        s.j(eVarH4);
                        return new j9g.s(eVarH4);
                    case 39:
                        zzl.b bVar4 = (zzl.b) dVar.y0.get();
                        z80.b bVarS = dVar.e.s();
                        s.j(bVarS);
                        return new i9g.n0(bVarS, bVar4);
                    case 40:
                        return c2.a();
                    case 41:
                        return new r39.a((fag.t0) dVar.f141624h0.get());
                    case 42:
                        return new i9g.y((fag.t0) dVar.f141624h0.get());
                    case 43:
                        return new fag.i0((gag.c) dVar.f0.get());
                    case 44:
                        t0Var = new i9g.l((fag.r) dVar.D0.get(), (i9g.n0) dVar.z0.get(), dVar.f141629n.e(), (b0) dVar.m0.get(), (fag.t0) dVar.f141624h0.get(), new i90.b());
                        break;
                    case 45:
                        return new fag.r((ne0.j) dVar.C0.get());
                    case 46:
                        fag.d0 d0Var = (fag.d0) dVar.G0.get();
                        qsg.b bVarB = dVar.o.b();
                        s.j(bVarB);
                        hyf.a aVarA4 = dVar.f141632p.a();
                        s.j(aVarA4);
                        return new i9g.l0(d0Var, bVarB, aVarA4);
                    case 47:
                        return new fag.d0((TravelHotelsService) dVar.P.get(), (z8g.g) dVar.F0.get(), (ne0.j) dVar.R.get());
                    case 48:
                        return g7h.c.v((TravelHotelsDatabase) dVar.S.get());
                    case 49:
                        fag.h0 h0Var = (fag.h0) dVar.J0.get();
                        l80.e eVarH5 = dVar.e.h();
                        s.j(eVarH5);
                        return new by5.a(h0Var, eVarH5);
                    case 50:
                        return new fag.h0((TravelHotelsService) dVar.P.get(), (ne0.j) dVar.R.get(), (z8g.n) dVar.I0.get());
                    case 51:
                        return g7h.c.x((TravelHotelsDatabase) dVar.S.get());
                    case 52:
                        return new i9g.x(dVar.c(), new i9g.a());
                    case 53:
                        return new fag.i((TravelHotelsService) dVar.P.get(), (ue0.c) dVar.f141621e0.get(), (ne0.j) dVar.R.get(), new j9g.p(), new j9g.o(new j9g.n(), new j9g.u()));
                    default:
                        throw new AssertionError(i3);
                }
                return t0Var;
            case 4:
                m1 m1Var = (m1) obj4;
                g9g.d dVar4 = m1Var.f141742a;
                if (i3 != 0) {
                    if (i3 == 1) {
                        return s1.a(m1Var.e);
                    }
                    throw new AssertionError(i3);
                }
                p8g.b bVar5 = (p8g.b) dVar4.f141640v0.get();
                s.j(bVar5);
                b0 b0Var = (b0) dVar4.m0.get();
                s.j(b0Var);
                ang.f fVarE = m1Var.f141743b.e();
                l93.f fVarJ = m1Var.f141744c.j();
                s.j(fVarJ);
                p8g.b bVar6 = (p8g.b) dVar4.f141640v0.get();
                s.j(bVar6);
                h0 h0Var2 = (h0) dVar4.f141631o0.get();
                s.j(h0Var2);
                jul.o oVar2 = new jul.o(b0Var, fVarE, fVarJ, bVar6, h0Var2);
                i9g.l lVar2 = (i9g.l) dVar4.E0.get();
                s.j(lVar2);
                l80.e eVarH6 = m1Var.d.h();
                s.j(eVarH6);
                nei.c cVar = new nei.c(oVar2, lVar2, eVarH6, dVar4.a());
                sri.m mVar2 = (sri.m) m1Var.f.get();
                p8g.c cVarB = dVar4.b();
                s.j(cVarB);
                return new f9g.c(bVar5, cVar, mVar2, cVarB);
            case 5:
                gg0.d dVar5 = (gg0.d) obj4;
                switch (i3) {
                    case 0:
                        return new wf0.f((AiSearchService) dVar5.e.get(), gg0.c.a());
                    case 1:
                        return g7h.c.k(dVar5.f143575a.b());
                    case 2:
                        gg0.f fVar2 = dVar5.f143576b;
                        wf0.x repository = new wf0.x((xf0.a) dVar5.f143579h.get(), dVar5.f143575a.a(), (wf0.m) dVar5.k.get(), (FaqService) dVar5.f143581l.get(), (wf0.j0) dVar5.f143580j.get(), (ne0.j) dVar5.f143582m.get());
                        Intrinsics.checkNotNullParameter(repository, "repository");
                        obj2 = repository;
                        return obj2;
                    case 3:
                        gg0.f fVar3 = dVar5.f143576b;
                        FaqDatabase database = (FaqDatabase) dVar5.f143578g.get();
                        Intrinsics.checkNotNullParameter(database, "database");
                        xf0.a aVarG = database.g();
                        s.k(aVarG);
                        return aVarG;
                    case 4:
                        gg0.f fVar4 = dVar5.f143576b;
                        z70.a contextProvider = dVar5.f143577c.f();
                        s.j(contextProvider);
                        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
                        FaqDatabase.Companion aVar4 = FaqDatabase.INSTANCE;
                        Context context3 = contextProvider.getContext();
                        aVar4.getClass();
                        Intrinsics.checkNotNullParameter(context3, "context");
                        if (FaqDatabase.f == null) {
                            RoomDatabase.Builder builderDatabaseBuilder = Room.databaseBuilder(context3, FaqDatabase.class, "revolut_support_db");
                            yf0.h hVar = new yf0.h();
                            yf0.i iVar = new yf0.i();
                            Intrinsics.checkNotNullParameter(context3, "context");
                            FaqDatabase.f = (FaqDatabase) builderDatabaseBuilder.addMigrations(hVar, iVar, new yf0.j(context3), new yf0.k(), new yf0.l(), new yf0.m(), new yf0.n(), new yf0.o(), new yf0.p(), new yf0.a(), new yf0.b(), new yf0.c(), new yf0.d(), new yf0.e(), new yf0.f(), new yf0.g()).build();
                        }
                        FaqDatabase faqDatabase = FaqDatabase.f;
                        Intrinsics.h(faqDatabase);
                        return faqDatabase;
                    case 5:
                        gg0.f fVar5 = dVar5.f143576b;
                        wf0.j0 j0Var = (wf0.j0) dVar5.f143580j.get();
                        vo6.b bVarA = dVar5.f143575a.a();
                        qd0.b bVarN = dVar5.f143577c.n();
                        s.j(bVarN);
                        wf0.m repository2 = new wf0.m(j0Var, bVarA, bVarN);
                        Intrinsics.checkNotNullParameter(repository2, "repository");
                        obj3 = repository2;
                        return obj3;
                    case 6:
                        gg0.f fVar6 = dVar5.f143576b;
                        wf0.j0 impl = new wf0.j0((xf0.a) dVar5.f143579h.get(), dVar5.f143575a.a(), (xf0.e) dVar5.i.get());
                        Intrinsics.checkNotNullParameter(impl, "impl");
                        return impl;
                    case 7:
                        gg0.f fVar7 = dVar5.f143576b;
                        FaqDatabase database2 = (FaqDatabase) dVar5.f143578g.get();
                        Intrinsics.checkNotNullParameter(database2, "database");
                        xf0.e eVarH7 = database2.h();
                        s.k(eVarH7);
                        return eVarH7;
                    case 8:
                        gg0.f fVar8 = dVar5.f143576b;
                        Retrofit retrofit = dVar5.f143575a.b();
                        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                        Object objCreate = retrofit.create(FaqService.class);
                        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                        FaqService faqService = (FaqService) objCreate;
                        s.k(faqService);
                        return faqService;
                    case 9:
                        gg0.f.Companion.getClass();
                        ne0.n.Companion.getClass();
                        return ne0.l.a(3, 5L);
                    case 10:
                        gg0.f fVar9 = dVar5.f143576b;
                        hg0.c cVar2 = new hg0.c((wf0.x) dVar5.f143583n.get(), (wf0.j0) dVar5.f143580j.get(), (ifm.b) dVar5.o.get(), (wf0.g) dVar5.f143587s.get());
                        g7h.c.a(fVar9, cVar2);
                        obj3 = cVar2;
                        return obj3;
                    case 11:
                        return gg0.g.n(dVar5.f143576b);
                    case 12:
                        gg0.f fVar10 = dVar5.f143576b;
                        wf0.l lVar3 = new wf0.l((FaqFeedbackService) dVar5.f143584p.get(), (ne0.j) dVar5.f143585q.get(), (ne0.j) dVar5.f143586r.get());
                        gg0.g.o(fVar10, lVar3);
                        obj3 = lVar3;
                        return obj3;
                    case 13:
                        return gg0.g.p(dVar5.f143576b, dVar5.f143575a.b());
                    case 14:
                        return gg0.h.a();
                    case 15:
                        return gg0.k.a();
                    case 16:
                        gg0.f fVar11 = dVar5.f143576b;
                        wf0.a0 a0Var = new wf0.a0((hg0.d) dVar5.z.get(), (hg0.o) dVar5.E.get(), (wf0.c0) dVar5.F.get());
                        g7h.c.b(fVar11, a0Var);
                        obj3 = a0Var;
                        return obj3;
                    case 17:
                        gg0.f fVar12 = dVar5.f143576b;
                        hg0.m mVar3 = new hg0.m((eg0.a) dVar5.f143591y.get());
                        g7h.c.d(fVar12, mVar3);
                        obj3 = mVar3;
                        return obj3;
                    case 18:
                        gg0.f fVar13 = dVar5.f143576b;
                        eg0.h hVar2 = new eg0.h(dVar5.f143575a.a(), (wf0.m) dVar5.k.get(), (LightenedFaqService) dVar5.u.get(), (wf0.j0) dVar5.f143580j.get(), (xf0.g) dVar5.v.get(), (xf0.a) dVar5.f143579h.get(), (eg0.i) dVar5.f143589w.get(), (ne0.j) dVar5.f143590x.get(), (ne0.j) dVar5.f143582m.get());
                        g7h.c.e(fVar13, hVar2);
                        obj2 = hVar2;
                        return obj2;
                    case 19:
                        return gg0.g.z(dVar5.f143576b, dVar5.f143575a.b());
                    case 20:
                        return gg0.g.u(dVar5.f143576b, (FaqDatabase) dVar5.f143578g.get());
                    case 21:
                        gg0.f fVar14 = dVar5.f143576b;
                        eg0.j jVar3 = new eg0.j();
                        g7h.c.f(fVar14, jVar3);
                        obj3 = jVar3;
                        return obj3;
                    case 22:
                        return gg0.l.a();
                    case 23:
                        gg0.f fVar15 = dVar5.f143576b;
                        hg0.o oVar3 = new hg0.o((fg0.k) dVar5.D.get());
                        gg0.g.a(fVar15, oVar3);
                        obj3 = oVar3;
                        return obj3;
                    case 24:
                        gg0.f fVar16 = dVar5.f143576b;
                        fg0.k kVar = new fg0.k(dVar5.f143575a.a(), (wf0.m) dVar5.k.get(), (PigeonService) dVar5.A.get(), (xf0.k) dVar5.B.get(), (wf0.j0) dVar5.f143580j.get(), new fg0.g(), (ne0.j) dVar5.C.get());
                        gg0.g.b(fVar16, kVar);
                        obj2 = kVar;
                        return obj2;
                    case 25:
                        return gg0.g.y(dVar5.f143576b, dVar5.f143575a.b());
                    case 26:
                        return gg0.g.x(dVar5.f143576b, (FaqDatabase) dVar5.f143578g.get());
                    case 27:
                        return gg0.j.a();
                    case 28:
                        gg0.f fVar17 = dVar5.f143576b;
                        g0 g0Var = new g0(dVar5.f143575a.a(), (wf0.m) dVar5.k.get(), (FaqService) dVar5.f143581l.get());
                        g7h.c.c(fVar17, g0Var);
                        obj3 = g0Var;
                        return obj3;
                    case 29:
                        HelpCenterService helpCenterServiceS = gg0.g.s(dVar5.f143575a.b());
                        ne0.d dVarA = gg0.p.a();
                        ee0.a aVar5 = dVar5.d;
                        xe0.f fVarF2 = aVar5.f();
                        s.j(fVarF2);
                        je0.d dVarB = aVar5.b();
                        s.j(dVarB);
                        return new u0(helpCenterServiceS, dVarA, gg0.g.t(dVarB, fVarF2));
                    case 30:
                        return gg0.g.m(dVar5.f143576b);
                    case 31:
                        gg0.f fVar18 = dVar5.f143576b;
                        fg0.e eVar = new fg0.e(dVar5.f143575a.a(), (wf0.m) dVar5.k.get(), (PigeonService) dVar5.A.get(), (xf0.k) dVar5.B.get(), new fg0.a(), (ne0.j) dVar5.J.get());
                        g7h.c.g(fVar18, eVar);
                        obj3 = eVar;
                        return obj3;
                    case 32:
                        return gg0.i.a();
                    case 33:
                        gg0.f fVar19 = dVar5.f143576b;
                        hg0.p pVar2 = new hg0.p((wf0.z0) dVar5.O.get());
                        gg0.g.c(fVar19, pVar2);
                        obj3 = pVar2;
                        return obj3;
                    case 34:
                        gg0.f fVar20 = dVar5.f143576b;
                        wf0.z0 z0Var2 = new wf0.z0((TroubleshooterService) dVar5.L.get(), (wf0.m) dVar5.k.get(), (bg0.e) dVar5.M.get(), (ne0.j) dVar5.N.get());
                        gg0.g.C(fVar20, z0Var2);
                        obj3 = z0Var2;
                        return obj3;
                    case 35:
                        return gg0.g.D(dVar5.f143576b, dVar5.f143575a.b());
                    case 36:
                        return gg0.g.B(dVar5.f143576b);
                    case 37:
                        return gg0.m.a();
                    default:
                        throw new AssertionError(i3);
                }
            case 6:
                gl0.a aVar6 = (gl0.a) obj4;
                if (i3 == 0) {
                    return new fl0.c((ue0.c) aVar6.d.get());
                }
                if (i3 != 1) {
                    if (i3 == 2) {
                        return new fl0.a((kg.o) aVar6.f144532b.get());
                    }
                    if (i3 != 3) {
                        throw new AssertionError(i3);
                    }
                    gl0.f.Companion.getClass();
                    return new kg.o();
                }
                Context appContext = aVar6.f144531a;
                je0.d objectMapper = (je0.d) aVar6.f144533c.get();
                gl0.f.Companion.getClass();
                Intrinsics.checkNotNullParameter(appContext, "appContext");
                Intrinsics.checkNotNullParameter(objectMapper, "objectMapper");
                we0.b bVar7 = we0.c.Companion;
                f0 f0Var = f0.f322471a;
                bVar7.getClass();
                return new ve0.c(appContext, "locale.CHANGE_LOCALE_FILE", objectMapper, we0.b.b(1, "locale.CHANGE_LOCALE_FILE", f0Var, objectMapper), null);
            case 7:
                gnf.a aVar7 = (gnf.a) obj4;
                if (i3 == 0) {
                    return new inf.b();
                }
                if (i3 == 1) {
                    return new inf.a((sri.m) aVar7.f144976h.get());
                }
                if (i3 == 2) {
                    return gnf.g.a(aVar7.f144972a);
                }
                throw new AssertionError(i3);
            case 8:
                gp6.b bVar8 = (gp6.b) obj4;
                if (i3 == 0) {
                    return new gp6.h(bVar8.f145261a, bVar8.f145262b, bVar8.f145263c);
                }
                if (i3 == 1) {
                    return new ava.d(bVar8.f145264g, bVar8.d, bVar8.e, i2);
                }
                if (i3 == 2) {
                    return gmf.b.A((gp6.h) bVar8.f.get());
                }
                throw new AssertionError(i3);
            case 9:
                gsi.f fVar21 = (gsi.f) obj4;
                switch (i3) {
                    case 0:
                        BaseDelegatesActivity baseDelegatesActivity = fVar21.f146537a;
                        bq.i.a(baseDelegatesActivity);
                        return bq.i.c(baseDelegatesActivity, fVar21.f146538b);
                    case 1:
                        BaseDelegatesActivity baseDelegatesActivity2 = fVar21.f146537a;
                        bq.i.a(baseDelegatesActivity2);
                        return bq.i.u(baseDelegatesActivity2);
                    case 2:
                        BaseDelegatesActivity baseDelegatesActivity3 = fVar21.f146537a;
                        bq.i.a(baseDelegatesActivity3);
                        return bq.i.B(baseDelegatesActivity3);
                    case 3:
                        BaseDelegatesActivity baseDelegatesActivity4 = fVar21.f146537a;
                        bq.i.a(baseDelegatesActivity4);
                        return bq.i.q(baseDelegatesActivity4);
                    case 4:
                        BaseDelegatesActivity baseDelegatesActivity5 = fVar21.f146537a;
                        bq.i.a(baseDelegatesActivity5);
                        return hsi.b.B(baseDelegatesActivity5);
                    case 5:
                        BaseDelegatesActivity baseDelegatesActivity6 = fVar21.f146537a;
                        bq.i.a(baseDelegatesActivity6);
                        return hsi.b.y(baseDelegatesActivity6);
                    case 6:
                        BaseDelegatesActivity baseDelegatesActivity7 = fVar21.f146537a;
                        bq.i.a(baseDelegatesActivity7);
                        return hsi.b.v(baseDelegatesActivity7);
                    case 7:
                        BaseDelegatesActivity baseDelegatesActivity8 = fVar21.f146537a;
                        bq.i.a(baseDelegatesActivity8);
                        return h7d.a.l(baseDelegatesActivity8);
                    case 8:
                        BaseDelegatesActivity baseDelegatesActivity9 = fVar21.f146537a;
                        bq.i.a(baseDelegatesActivity9);
                        return bq.i.w(baseDelegatesActivity9);
                    case 9:
                        BaseDelegatesActivity baseDelegatesActivity10 = fVar21.f146537a;
                        bq.i.a(baseDelegatesActivity10);
                        return hsi.b.A(baseDelegatesActivity10);
                    case 10:
                        BaseDelegatesActivity baseDelegatesActivity11 = fVar21.f146537a;
                        bq.i.a(baseDelegatesActivity11);
                        return bq.i.y(baseDelegatesActivity11);
                    case 11:
                        BaseDelegatesActivity baseDelegatesActivity12 = fVar21.f146537a;
                        bq.i.a(baseDelegatesActivity12);
                        return h7d.a.n(baseDelegatesActivity12);
                    case 12:
                        BaseDelegatesActivity baseDelegatesActivity13 = fVar21.f146537a;
                        bq.i.a(baseDelegatesActivity13);
                        return h7d.a.r(baseDelegatesActivity13);
                    case 13:
                        BaseDelegatesActivity baseDelegatesActivity14 = fVar21.f146537a;
                        bq.i.a(baseDelegatesActivity14);
                        return h7d.a.g(baseDelegatesActivity14);
                    default:
                        throw new AssertionError(i3);
                }
            case 10:
                gsl.a aVar8 = (gsl.a) obj4;
                ktl.a aVar9 = aVar8.f146553a;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new AssertionError(i3);
                    }
                    vrl.g gVarB = aVar9.f189569a.b();
                    s.j(gVarB);
                    return new w(new fkg.a(gVarB));
                }
                r10.q qVarB = aVar9.b();
                fsl.m mVar4 = (fsl.m) aVar8.f146555c.get();
                htl.l lVar4 = new htl.l();
                gte.a aVarB6 = aVar8.f146554b.b();
                s.j(aVarB6);
                return new fsl.t(qVarB, mVar4, lVar4, aVarB6);
            case 11:
                gtg.a aVar10 = (gtg.a) obj4;
                an0.c cVar3 = aVar10.f146606b;
                ee0.a aVar11 = aVar10.d;
                if (i3 == 0) {
                    return new itg.a((dtg.a) aVar10.e.get());
                }
                if (i3 == 1) {
                    ang.f fVarE2 = aVar10.f146605a.e();
                    hzl.e eVarA = gtg.d.a();
                    zm0.c cVarJ = cVar3.j();
                    s.j(cVarJ);
                    mp.p pVar3 = new mp.p(fVarE2, eVarA, cVarJ);
                    tla.d dVarB2 = aVar10.f146607c.b();
                    s.j(dVarB2);
                    return new itg.b(pVar3, dVarB2);
                }
                if (i3 != 2) {
                    throw new AssertionError(i3);
                }
                je0.d dVarB3 = aVar11.b();
                s.j(dVarB3);
                yk0.a aVarB7 = cVar3.b();
                s.j(aVarB7);
                xe0.f fVarF3 = aVar11.f();
                s.j(fVarF3);
                return gsi.d.w(dVarB3, aVarB7, fVarF3);
            case 12:
                return a();
            case 13:
                gwb.b bVar9 = (gwb.b) obj4;
                a31.a aVar12 = bVar9.f147294m;
                a31.a aVar13 = bVar9.f147288b;
                a31.a aVar14 = bVar9.e;
                if (i3 == 0) {
                    return new cf7.m(bVar9.f147287a, aVar13, bVar9.f147289c, bVar9.d, aVar14, bVar9.f, bVar9.f147290g, bVar9.f147291h, bVar9.i, bVar9.f147292j, bVar9.k, bVar9.f147293l, aVar12, bVar9.f147295n, bVar9.o, bVar9.f147296p, bVar9.f147297q, 1);
                }
                if (i3 == 1) {
                    return ige.d.a(aVar12, bVar9.f147298r, bVar9.f147299s);
                }
                if (i3 == 2) {
                    return ige.d.b(aVar14);
                }
                if (i3 == 3) {
                    return ige.d.e(aVar14, aVar13);
                }
                throw new AssertionError(i3);
            case 14:
                gz5.c cVar4 = (gz5.c) obj4;
                ee0.a aVar15 = cVar4.f147936a;
                if (i3 == 0) {
                    return new ez5.b((hz5.a) cVar4.d.get());
                }
                if (i3 == 1) {
                    return new hz5.a((ue0.c) cVar4.f147938c.get());
                }
                if (i3 != 2) {
                    throw new AssertionError(i3);
                }
                je0.d mapper = aVar15.b();
                s.j(mapper);
                yk0.a databaseSessionProvider = cVar4.f147937b.b();
                s.j(databaseSessionProvider);
                xe0.f storageFactory = aVar15.f();
                s.j(storageFactory);
                gz5.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                return xe0.f.f(storageFactory, databaseSessionProvider, "vaults_order", mapper, 0, null, 56);
            case 15:
                h5c.a aVar16 = (h5c.a) obj4;
                l70.e eVar2 = aVar16.f149535a;
                if (i3 != 0) {
                    if (i3 == 1) {
                        return new e5c.a((RevolutXCommonService) aVar16.f149538g.get());
                    }
                    if (i3 != 2) {
                        if (i3 == 3) {
                            return new i5c.a();
                        }
                        throw new AssertionError(i3);
                    }
                    ik0.b bVarM2 = ((nj0.d) aVar16.f149537c).m();
                    s.j(bVarM2);
                    return gsi.d.t(bVarM2);
                }
                y70.a aVarC = eVar2.c();
                s.j(aVarC);
                sri.m mVarD = ((g8b.a) aVar16.f149536b).d();
                s.j(mVarD);
                e5c.a aVar17 = (e5c.a) aVar16.f149539h.get();
                f80.a aVarX = eVar2.x();
                s.j(aVarX);
                q0 q0Var = (q0) ((ljl.q0) aVar16.d).q0.get();
                s.j(q0Var);
                ryc.a aVarB8 = aVar16.e.b();
                z70.a aVarF = eVar2.f();
                s.j(aVarF);
                return new g5c.f(aVarC, mVarD, aVar17, aVarX, q0Var, aVarB8, aVarF, ((ika.b) aVar16.f).b());
            case 16:
                return b();
            case 17:
                return c();
            case 18:
                hak.b bVar10 = (hak.b) obj4;
                if (i3 == 0) {
                    return new hak.c(bVar10.f150526b, bVar10.f150525a);
                }
                if (i3 == 1) {
                    return h7d.a.D((hak.c) bVar10.f.get());
                }
                throw new AssertionError(i3);
            case 19:
                return d();
            case 20:
                return e();
            case 21:
                return f();
            case 22:
                return g();
            case 23:
                return h();
            case 24:
                return i();
            case 25:
                return j();
            case 26:
                return k();
            case 27:
                return l();
            case 28:
                return m();
            default:
                i15.d dVar6 = (i15.d) obj4;
                c21.e eVar3 = dVar6.e;
                ee0.a aVar18 = dVar6.f;
                i15.a aVar19 = dVar6.d;
                switch (i3) {
                    case 0:
                        return new ne0.d();
                    case 1:
                        return new j15.e((g15.a) dVar6.f157560j.get(), (k15.f) dVar6.k.get(), dVar6.f157556b.e());
                    case 2:
                        return new q15.a();
                    case 3:
                        up3.b bVarI = dVar6.f157555a.i();
                        s.j(bVarI);
                        return new k15.f(bVarI);
                    case 4:
                        return hy1.g.f(aVar19, (Retrofit) dVar6.f157563n.get());
                    case 5:
                        Retrofit retrofitJ = ((c21.b) eVar3).j();
                        s.j(retrofitJ);
                        return hy1.g.i(aVar19, retrofitJ, (kg.o) dVar6.f157562m.get());
                    case 6:
                        kg.o oVarH2 = ((c21.b) eVar3).h();
                        s.j(oVarH2);
                        return hy1.g.j(aVar19, oVarH2);
                    case 7:
                        je0.d dVarB4 = aVar18.b();
                        s.j(dVarB4);
                        yk0.a aVarB9 = dVar6.f157558g.b();
                        s.j(aVarB9);
                        xe0.f fVarF4 = aVar18.f();
                        s.j(fVarF4);
                        return hy1.g.g(dVarB4, fVarF4, aVarB9);
                    default:
                        throw new AssertionError(i3);
                }
        }
    }
}
