package tn3;

import android.content.Context;
import androidx.room.migration.Migration;
import bw.t;
import cli.n;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.bills.pagopa.impl.data.network.PagoPAService;
import com.revolut.feature.travel.miles.impl.database.TravelMilesDatabase;
import com.revolut.feature.travel.miles.impl.network.TravelMilesRecommendedFlightsService;
import com.revolut.feature.travel.miles.impl.network.TravelMilesSearchService;
import com.revolut.feature.travel.miles.impl.network.TravelMilesService;
import com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.filter_options.TravelMilesFlightSearchFilterOptionScreenContract$InputData;
import com.revolut.feature.travel.miles.impl.ui.screen.transfer.breakdown.TravelMilesTransferBreakdownScreenContract$InputData;
import cwi.u;
import dw3.a6;
import e4m.e;
import ecm.q;
import et6.h1;
import et6.r0;
import et6.t0;
import ezj.h;
import iri.j;
import java.util.Collection;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import lfg.k0;
import lfg.w;
import nyb.m0;
import q6i.j0;
import skm.p0;
import syk.o;
import t33.x;
import t33.y;
import ta9.m;
import tq1.i;
import tr2.p;
import tz2.l;
import u7i.v;
import ufg.i0;
import ufg.o0;
import ufg.q0;
import us6.x1;
import vc.s;
import vn3.f;
import vn3.g;
import ybl.k;
import yfg.p;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f272284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f272285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f272286c;

    public /* synthetic */ a(Object obj2, int i, int i2) {
        this.f272284a = i2;
        this.f272286c = obj2;
        this.f272285b = i;
    }

    @Override // phm.a
    public final Object get() {
        Object aVar;
        int i = this.f272284a;
        int i2 = 0;
        int i3 = 14;
        int i5 = this.f272285b;
        Object obj2 = this.f272286c;
        switch (i) {
            case 0:
                b bVar = (b) obj2;
                if (i5 == 0) {
                    return new f((n) bVar.f272288b.get(), bVar.f272287a);
                }
                if (i5 == 1) {
                    return new g();
                }
                throw new AssertionError(i5);
            case 1:
                tq1.c cVar = (tq1.c) obj2;
                if (i5 == 0) {
                    return new vq1.a();
                }
                if (i5 == 1) {
                    return new uq1.a((oq1.b) cVar.d.get());
                }
                if (i5 == 2) {
                    return new oq1.b((PagoPAService) cVar.f273483c.get());
                }
                if (i5 != 3) {
                    if (i5 == 4) {
                        return new vq1.e();
                    }
                    throw new AssertionError(i5);
                }
                PagoPAService pagoPAService = (PagoPAService) a0.d.f((nj0.d) cVar.f273481a, "retrofit", PagoPAService.class, "create(...)");
                s.k(pagoPAService);
                return pagoPAService;
            case 2:
                i iVar = (i) obj2;
                q qVar = iVar.f273500a;
                if (i5 == 0) {
                    return new tq1.a(iVar.f273501b, qVar);
                }
                if (i5 == 1) {
                    return new h(qVar, iVar.f273502c, iVar.f, iVar.d, 4);
                }
                if (i5 != 2) {
                    throw new AssertionError(i5);
                }
                tq1.c cVar2 = (tq1.c) ((tq1.a) iVar.e.get()).b();
                s.k(cVar2);
                return cVar2;
            case 3:
                p pVar = (p) obj2;
                if (i5 == 0) {
                    return new bs2.g((n) pVar.f273681b.get(), pVar.f273680a);
                }
                if (i5 == 1) {
                    return new bs2.h();
                }
                throw new AssertionError(i5);
            case 4:
                tyk.b bVar2 = (tyk.b) obj2;
                switch (i5) {
                    case 0:
                        hri.b bVar3 = bVar2.f275701a;
                        return new ifm.b();
                    case 1:
                        hri.b bVar4 = bVar2.f275701a;
                        return new j();
                    case 2:
                        return new ln.c();
                    case 3:
                        g3l.a aVar2 = (g3l.a) bVar2.f275709n.get();
                        sf0.h hVarB = bVar2.f275703c.b();
                        s.j(hVarB);
                        v60.e eVarA = bVar2.d.a();
                        s.j(eVarA);
                        return new vxk.e(aVar2, hVarB, eVarA, (ln.a) bVar2.f275708m.get());
                    case 4:
                        return new g3l.g();
                    case 5:
                        return new um.c();
                    case 6:
                        return new cn.e();
                    case 7:
                        bVar2.getClass();
                        return new hn.h(ImmutableSet.copyOf((Collection) hn.f.a()));
                    case 8:
                        return new ym.d();
                    case 9:
                        return new mm.d();
                    case 10:
                        return new vxk.b((ln.a) bVar2.f275708m.get(), bVar2.c(), bVar2.a());
                    case 11:
                        return new vxk.b(bVar2.c(), (ln.a) bVar2.f275708m.get(), bVar2.a());
                    case 12:
                        return new sm.e();
                    case 13:
                        return new om.c();
                    case 14:
                        return new syk.p((ln.a) bVar2.f275708m.get());
                    case 15:
                        zdl.c cVar3 = bVar2.f275705h;
                        zdl.f fVar = bVar2.f;
                        ybl.d dVarH = cVar3.h();
                        s.j(dVarH);
                        k kVarD = fVar.d();
                        s.j(kVarD);
                        ybl.i iVarB = fVar.b();
                        s.j(iVarB);
                        zjh.f fVarA = bVar2.i.a();
                        Map mapA = fVar.a();
                        s.j(mapA);
                        return new o(dVarH, kVarD, iVarB, fVarA, mapA);
                    default:
                        throw new AssertionError(i5);
                }
            case 5:
                if (i5 == 0) {
                    return new j03.f((n) ((tz2.i) obj2).f275781a.get());
                }
                if (i5 == 1) {
                    return new j03.g();
                }
                throw new AssertionError(i5);
            case 6:
                tz2.j jVar = (tz2.j) obj2;
                if (i5 == 0) {
                    return new yz2.h((jki.p) jVar.f275784b.get(), jVar.f275783a);
                }
                if (i5 == 1) {
                    return new yz2.i();
                }
                throw new AssertionError(i5);
            case 7:
                if (i5 == 0) {
                    return new a03.g((jki.p) ((l) obj2).f275789a.get());
                }
                if (i5 == 1) {
                    return new a03.h();
                }
                throw new AssertionError(i5);
            case 8:
                u00.d dVar = (u00.d) obj2;
                sw.c cVar4 = dVar.f275998a;
                switch (i5) {
                    case 0:
                        t openCvProxy = (t) cVar4.f266048g.get();
                        s.j(openCvProxy);
                        u00.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(openCvProxy, "openCvProxy");
                        aVar = new e00.a(openCvProxy);
                        break;
                    case 1:
                        t tVar = (t) cVar4.f266048g.get();
                        s.j(tVar);
                        aVar = new b00.b(tVar);
                        break;
                    case 2:
                        t tVar2 = (t) cVar4.f266048g.get();
                        s.j(tVar2);
                        aVar = new a00.a(tVar2);
                        break;
                    case 3:
                        c00.f fVar2 = (c00.f) dVar.f276001g.get();
                        t tVar3 = (t) cVar4.f266048g.get();
                        s.j(tVar3);
                        aVar = new c00.g(fVar2, tVar3);
                        break;
                    case 4:
                        return new c00.f();
                    case 5:
                        qw.a aVarC = cVar4.c();
                        s.j(aVarC);
                        return aVarC;
                    case 6:
                        ImmutableSet delegates = ImmutableSet.copyOf((Collection) u00.c.a());
                        u00.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(delegates, "delegates");
                        aVar = new x00.b(delegates);
                        break;
                    case 7:
                        c10.e eVar = (c10.e) dVar.f275999b.f211061b.get();
                        s.j(eVar);
                        return eVar;
                    default:
                        throw new AssertionError(i5);
                }
                return aVar;
            case 9:
                u33.b bVar5 = (u33.b) obj2;
                switch (i5) {
                    case 0:
                        hri.b bVar6 = bVar5.f276758a;
                        return new ifm.b();
                    case 1:
                        hri.b bVar7 = bVar5.f276758a;
                        return new j();
                    case 2:
                        return new cn.e();
                    case 3:
                        return new um.c();
                    case 4:
                        bVar5.getClass();
                        return new hn.h(ImmutableSet.copyOf((Collection) hn.f.a()));
                    case 5:
                        return new ln.c();
                    case 6:
                        return new ym.d();
                    case 7:
                        return new mm.d();
                    case 8:
                        return rga.l.b(bVar5.f276760c, (ln.a) bVar5.f276768q.get(), (mm.d) bVar5.f276770s.get(), bVar5.a());
                    case 9:
                        bi3.d dVar2 = bVar5.d;
                        m mVar = bVar5.f;
                        sh3.a aVarA = dVar2.a();
                        s.j(aVarA);
                        l93.f fVarJ = bVar5.e.j();
                        s.j(fVarJ);
                        u89.a aVarB = mVar.b();
                        s.j(aVarB);
                        q89.e eVarA2 = mVar.a();
                        s.j(eVarA2);
                        return u.b(bVar5.a(), fVarJ, t2d.c.c(bVar5.f276761g.f271230a), eVarA2, aVarA, aVarB, ((oq8.a) bVar5.f276762h).c());
                    case 10:
                        ai3.c cVar5 = bVar5.f276760c;
                        com.google.firebase.messaging.t tVarA = bVar5.a();
                        g3l.a aVar3 = (g3l.a) bVar5.v.get();
                        ln.a aVar4 = (ln.a) bVar5.f276768q.get();
                        rh3.d dVar3 = (rh3.d) bVar5.f276772w.get();
                        sf0.h hVarB2 = bVar5.i.b();
                        s.j(hVarB2);
                        ym.d dVar4 = (ym.d) bVar5.f276769r.get();
                        v60.e eVarA3 = bVar5.f276763j.a();
                        s.j(eVarA3);
                        return rga.l.a(cVar5, tVarA, aVar3, aVar4, dVar3, hVarB2, dVar4, eVarA3);
                    case 11:
                        return new g3l.g();
                    case 12:
                        ai3.c api2 = bVar5.f276760c;
                        Intrinsics.checkNotNullParameter(api2, "api");
                        ((ai3.b) api2.f5179q.get()).getClass();
                        return new zh3.f();
                    case 13:
                        return new sm.e();
                    case 14:
                        return new om.c();
                    case 15:
                        return new y();
                    case 16:
                        return rga.l.c(bVar5.f276760c, (ln.a) bVar5.f276768q.get(), (zh3.g) bVar5.B.get());
                    case 17:
                        ai3.c api3 = bVar5.f276760c;
                        rh3.d state = (rh3.d) bVar5.f276772w.get();
                        Intrinsics.checkNotNullParameter(api3, "api");
                        Intrinsics.checkNotNullParameter(state, "state");
                        ((ai3.b) api3.f5179q.get()).getClass();
                        Intrinsics.checkNotNullParameter(state, "state");
                        return new zh3.g(state);
                    case 18:
                        return new t33.m((t33.g) bVar5.A.get(), (k93.a) bVar5.u.get(), (mm.d) bVar5.f276770s.get(), new i90.b(), new t33.a());
                    case 19:
                        return new x((ln.a) bVar5.f276768q.get());
                    default:
                        throw new AssertionError(i5);
                }
            case 10:
                u45.q qVar2 = (u45.q) obj2;
                if (i5 == 0) {
                    return new w65.h((n) qVar2.f277200b.get());
                }
                if (i5 == 1) {
                    return new com.revolut.feature.credit.loan.impl.ui.rev10.documents.section.a(qVar2.f277199a);
                }
                throw new AssertionError(i5);
            case 11:
                a6 a6Var = (a6) obj2;
                if (i5 == 0) {
                    return new qk4.g((jki.p) a6Var.f118279c.get(), a6Var.f118278b);
                }
                if (i5 == 1) {
                    return new qk4.h();
                }
                throw new AssertionError(i5);
            case 12:
                u7i.c cVar6 = (u7i.c) obj2;
                if (i5 == 0) {
                    v.Companion.getClass();
                    return new u7i.t();
                }
                if (i5 != 1) {
                    if (i5 == 2) {
                        return new j0();
                    }
                    throw new AssertionError(i5);
                }
                sh5.d dVarF = cVar6.f277761a.f();
                s.j(dVarF);
                s1i.a aVar5 = new s1i.a();
                xmg.a aVar6 = cVar6.f277762b;
                ang.f fVarE = aVar6.e();
                gte.a aVarB2 = cVar6.f277763c.b();
                s.j(aVarB2);
                l61.a aVarB3 = aVar6.b();
                s.j(aVarB3);
                return new h8i.e(dVarF, new h8i.c(aVar5, fVarE, aVarB2, new zd5.e(aVarB3)));
            case 13:
                ufg.g gVar = (ufg.g) obj2;
                switch (i5) {
                    case 0:
                        return new vfg.q((lfg.s) gVar.F.get());
                    case 1:
                        return new lfg.s((TravelMilesService) gVar.B.get(), (ne0.j) gVar.E.get(), (ofg.g) gVar.D.get());
                    case 2:
                        TravelMilesService travelMilesService = (TravelMilesService) a0.d.f((nj0.d) gVar.f279709a, "retrofit", TravelMilesService.class, "create(...)");
                        s.k(travelMilesService);
                        return travelMilesService;
                    case 3:
                        TravelMilesDatabase database = (TravelMilesDatabase) gVar.C.get();
                        q0.Companion.getClass();
                        Intrinsics.checkNotNullParameter(database, "database");
                        ofg.g gVarI = database.i();
                        s.k(gVarI);
                        return gVarI;
                    case 4:
                        Context context = gVar.f279710b;
                        yk0.a databaseSessionProvider = gVar.f279711c.b();
                        s.j(databaseSessionProvider);
                        de0.a databaseEncryptionMigratorFactory = ((cl0.a) gVar.d).a();
                        s.j(databaseEncryptionMigratorFactory);
                        q0.Companion.getClass();
                        Intrinsics.checkNotNullParameter(context, "context");
                        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                        Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory, "databaseEncryptionMigratorFactory");
                        TravelMilesDatabase.Companion aVar7 = TravelMilesDatabase.INSTANCE;
                        aVar7.getClass();
                        TravelMilesDatabase travelMilesDatabase = (TravelMilesDatabase) aVar7.a(context, databaseSessionProvider, new Migration[]{pfg.e.f235582c, pfg.f.f235583c, pfg.g.f235584c, pfg.h.f235585c, pfg.i.f235586c, pfg.j.f235587c, pfg.k.f235588c, pfg.l.f235589c, pfg.m.f235590c, pfg.a.f235578c, pfg.b.f235579c, pfg.c.f235580c, pfg.d.f235581c}, databaseEncryptionMigratorFactory);
                        s.k(travelMilesDatabase);
                        return travelMilesDatabase;
                    case 5:
                        return new ne0.d();
                    case 6:
                        return new vfg.d((lfg.e) gVar.H.get(), (lfg.s) gVar.F.get());
                    case 7:
                        return new lfg.e((TravelMilesService) gVar.B.get(), (ne0.j) gVar.E.get(), (ofg.g) gVar.D.get());
                    case 8:
                        lfg.i iVar2 = (lfg.i) gVar.L.get();
                        lfg.e eVar2 = (lfg.e) gVar.H.get();
                        svb.a aVarA2 = gVar.i.a();
                        s.j(aVarA2);
                        b6c.c cVarB = gVar.f279714j.b();
                        s.j(cVarB);
                        return new vfg.e(iVar2, eVar2, aVarA2, cVarB);
                    case 9:
                        return new lfg.i((TravelMilesService) gVar.B.get(), (ofg.d) gVar.J.get(), (ofg.b) gVar.K.get(), (ne0.j) gVar.E.get());
                    case 10:
                        TravelMilesDatabase database2 = (TravelMilesDatabase) gVar.C.get();
                        q0.Companion.getClass();
                        Intrinsics.checkNotNullParameter(database2, "database");
                        ofg.d dVarH2 = database2.h();
                        s.k(dVarH2);
                        return dVarH2;
                    case 11:
                        TravelMilesDatabase database3 = (TravelMilesDatabase) gVar.C.get();
                        q0.Companion.getClass();
                        Intrinsics.checkNotNullParameter(database3, "database");
                        ofg.b bVarG = database3.g();
                        s.k(bVarG);
                        return bVarG;
                    case 12:
                        k0 k0Var = (k0) gVar.O.get();
                        m0 m0VarG = gVar.f279712g.g();
                        s.j(m0VarG);
                        return new vfg.t(k0Var, m0VarG, new yk0.d());
                    case 13:
                        return new k0((ofg.j) gVar.N.get(), (TravelMilesService) gVar.B.get(), (ne0.j) gVar.E.get());
                    case 14:
                        TravelMilesDatabase database4 = (TravelMilesDatabase) gVar.C.get();
                        q0.Companion.getClass();
                        Intrinsics.checkNotNullParameter(database4, "database");
                        ofg.j jVarJ = database4.j();
                        s.k(jVarJ);
                        return jVarJ;
                    case 15:
                        je0.d mapper = gVar.v.b();
                        s.j(mapper);
                        yk0.a databaseSecurityProvider = gVar.f279711c.b();
                        s.j(databaseSecurityProvider);
                        xe0.f storageFactory = gVar.v.f();
                        s.j(storageFactory);
                        q0.Companion.getClass();
                        Intrinsics.checkNotNullParameter(mapper, "mapper");
                        Intrinsics.checkNotNullParameter(databaseSecurityProvider, "databaseSecurityProvider");
                        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                        return xe0.f.f(storageFactory, databaseSecurityProvider, "miles", mapper, 1, null, 48);
                    case 16:
                        TravelMilesSearchService travelMilesSearchService = (TravelMilesSearchService) a0.d.f((nj0.d) gVar.f279709a, "retrofit", TravelMilesSearchService.class, "create(...)");
                        s.k(travelMilesSearchService);
                        return travelMilesSearchService;
                    case 17:
                        q0.Companion.getClass();
                        return new fd0.d(20);
                    case 18:
                        je0.d mapper2 = (je0.d) gVar.U.get();
                        yk0.a databaseSecurityProvider2 = gVar.f279711c.b();
                        s.j(databaseSecurityProvider2);
                        xe0.f storageFactory2 = gVar.v.f();
                        s.j(storageFactory2);
                        q0.Companion.getClass();
                        Intrinsics.checkNotNullParameter(mapper2, "mapper");
                        Intrinsics.checkNotNullParameter(databaseSecurityProvider2, "databaseSecurityProvider");
                        Intrinsics.checkNotNullParameter(storageFactory2, "storageFactory");
                        return xe0.f.f(storageFactory2, databaseSecurityProvider2, "miles_search", mapper2, 1, null, 48);
                    case 19:
                        kg.o gson = (kg.o) gVar.T.get();
                        le0.b factory = gVar.v.c();
                        s.j(factory);
                        q0.Companion.getClass();
                        Intrinsics.checkNotNullParameter(gson, "gson");
                        Intrinsics.checkNotNullParameter(factory, "factory");
                        return factory.a(gson);
                    case 20:
                        ee0.a aVar8 = gVar.v;
                        kg.o gson2 = fe0.c.a();
                        q0.Companion.getClass();
                        Intrinsics.checkNotNullParameter(gson2, "gson");
                        kg.p pVar2 = new kg.p(gson2);
                        pVar2.c(new yfg.i(), yfg.h.class);
                        pVar2.c(new yfg.o(), p.a.class);
                        kg.o oVarB = pVar2.b();
                        Intrinsics.checkNotNullExpressionValue(oVarB, "create(...)");
                        return oVarB;
                    case 21:
                        return new w((TravelMilesRecommendedFlightsService) gVar.W.get(), (ne0.j) gVar.E.get(), (ue0.c) gVar.X.get());
                    case 22:
                        TravelMilesRecommendedFlightsService travelMilesRecommendedFlightsService = (TravelMilesRecommendedFlightsService) a0.d.f((nj0.d) gVar.f279709a, "retrofit", TravelMilesRecommendedFlightsService.class, "create(...)");
                        s.k(travelMilesRecommendedFlightsService);
                        return travelMilesRecommendedFlightsService;
                    case 23:
                        je0.d mapper3 = gVar.v.b();
                        s.j(mapper3);
                        yk0.a databaseSecurityProvider3 = gVar.f279711c.b();
                        s.j(databaseSecurityProvider3);
                        xe0.f storageFactory3 = gVar.v.f();
                        s.j(storageFactory3);
                        q0.Companion.getClass();
                        Intrinsics.checkNotNullParameter(mapper3, "mapper");
                        Intrinsics.checkNotNullParameter(databaseSecurityProvider3, "databaseSecurityProvider");
                        Intrinsics.checkNotNullParameter(storageFactory3, "storageFactory");
                        return xe0.f.f(storageFactory3, databaseSecurityProvider3, "recommended_flights", mapper3, 2, zhm.u.c(new zfg.a()), 32);
                    default:
                        throw new AssertionError(i5);
                }
            case 14:
                ufg.k kVar = (ufg.k) obj2;
                TravelMilesFlightSearchFilterOptionScreenContract$InputData travelMilesFlightSearchFilterOptionScreenContract$InputData = kVar.f279753a;
                if (i5 == 0) {
                    return new phg.l((n) kVar.f279754b.get(), travelMilesFlightSearchFilterOptionScreenContract$InputData);
                }
                if (i5 == 1) {
                    return new phg.p(travelMilesFlightSearchFilterOptionScreenContract$InputData);
                }
                throw new AssertionError(i5);
            case 15:
                i0 i0Var = (i0) obj2;
                TravelMilesTransferBreakdownScreenContract$InputData travelMilesTransferBreakdownScreenContract$InputData = i0Var.f279745b;
                if (i5 == 0) {
                    return new com.revolut.feature.travel.miles.impl.ui.screen.transfer.breakdown.a((n) i0Var.d.get(), travelMilesTransferBreakdownScreenContract$InputData, new agg.a());
                }
                if (i5 != 1) {
                    throw new AssertionError(i5);
                }
                agg.d dVar5 = new agg.d();
                qd0.b bVarN = i0Var.f279746c.f279720r.n();
                s.j(bVarN);
                return new qig.d(travelMilesTransferBreakdownScreenContract$InputData, dVar5, new pig.b(bVarN));
            case 16:
                i0 i0Var2 = (i0) obj2;
                TravelMilesTransferBreakdownScreenContract$InputData travelMilesTransferBreakdownScreenContract$InputData2 = i0Var2.f279745b;
                if (i5 == 0) {
                    return new com.revolut.feature.travel.miles.impl.ui.screen.transfer.breakdown.a((n) i0Var2.d.get(), travelMilesTransferBreakdownScreenContract$InputData2, new agg.a());
                }
                if (i5 != 1) {
                    throw new AssertionError(i5);
                }
                agg.d dVar6 = new agg.d();
                qd0.b bVarN2 = i0Var2.f279746c.f279720r.n();
                s.j(bVarN2);
                return new qig.d(travelMilesTransferBreakdownScreenContract$InputData2, dVar6, new pig.b(bVarN2));
            case 17:
                o0 o0Var = (o0) obj2;
                if (i5 == 0) {
                    return new c1g.v((vfg.g) o0Var.f279780c.get());
                }
                if (i5 != 1) {
                    throw new AssertionError(i5);
                }
                xoj.a aVarA3 = o0Var.f279778a.a();
                s.j(aVarA3);
                eub.a aVarA4 = o0Var.f279779b.a();
                s.j(aVarA4);
                return new vfg.g(aVarA3, aVarA4);
            case 18:
                if (i5 != 0) {
                    if (i5 == 1) {
                        return new sfh.b();
                    }
                    throw new AssertionError(i5);
                }
                Context context2 = ((ufh.i) obj2).f279850a;
                ufh.l.Companion.getClass();
                Intrinsics.checkNotNullParameter(context2, "context");
                return sri.o.c(context2, null, null, 14);
            case 19:
                ui3.e eVar3 = (ui3.e) obj2;
                if (i5 == 0) {
                    return new ifm.b();
                }
                if (i5 == 1) {
                    return new j();
                }
                if (i5 == 2) {
                    return new com.revolut.feature.chooser.e();
                }
                if (i5 == 3) {
                    return new qi3.n((com.revolut.feature.chooser.c) eVar3.f280307g.get());
                }
                if (i5 == 4) {
                    return new com.revolut.feature.chooser.a((com.revolut.feature.chooser.d) eVar3.e.get(), (qi3.o) eVar3.f.get());
                }
                if (i5 == 5) {
                    return new qi3.b((com.revolut.feature.chooser.d) eVar3.e.get());
                }
                throw new AssertionError(i5);
            case 20:
                uie.l lVar = (uie.l) obj2;
                if (i5 == 0) {
                    bge.b bVar8 = new bge.b();
                    tla.e eVarA4 = lVar.f280402c.a();
                    s.j(eVarA4);
                    n63.h hVar = (n63.h) lVar.d.f319904a.get();
                    s.j(hVar);
                    gte.a aVarB4 = lVar.e.b();
                    s.j(aVarB4);
                    j30.d dVarU = ((h30.n) lVar.f).u();
                    s.j(dVarU);
                    return new sie.c(bVar8, eVarA4, hVar, aVarB4, dVarU);
                }
                if (i5 == 1) {
                    vie.h hVarA = lVar.f280401b.a();
                    s.j(hVarA);
                    vie.i iVarB2 = lVar.f280400a.b();
                    s.j(iVarB2);
                    return new vie.j(hVarA, iVarB2);
                }
                if (i5 == 2) {
                    return new sie.d();
                }
                if (i5 != 3) {
                    throw new AssertionError(i5);
                }
                uie.u.Companion.getClass();
                return rd0.e.a(p0.f264002b);
            case 21:
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new AssertionError(i5);
                    }
                    uie.s.Companion.getClass();
                    return rd0.e.a(p0.f264002b);
                }
                mk0.a personalisationStorage = ((uie.n) obj2).f280409a.a();
                s.j(personalisationStorage);
                uie.s.Companion.getClass();
                Intrinsics.checkNotNullParameter(personalisationStorage, "personalisationStorage");
                return new vie.i(new qie.f(personalisationStorage));
            case 22:
                um5.d dVar7 = (um5.d) obj2;
                if (i5 == 0) {
                    return new vm5.j((vm5.l) dVar7.f281244c.get(), dVar7.f281242a);
                }
                if (i5 != 1) {
                    throw new AssertionError(i5);
                }
                l80.e eVarH = dVar7.f281243b.e.h();
                s.j(eVarH);
                return new vm5.l(new tsk.t(eVarH));
            case 23:
                um5.g gVar2 = (um5.g) obj2;
                if (i5 == 0) {
                    return new cn5.k((n) gVar2.f281252b.get(), gVar2.f281251a);
                }
                if (i5 == 1) {
                    return new cn5.l();
                }
                throw new AssertionError(i5);
            case 24:
                us2.j jVar2 = (us2.j) obj2;
                l70.e eVar4 = jVar2.e;
                k5j.c cVar7 = jVar2.f282408a;
                switch (i5) {
                    case 0:
                        m5j.g gVar3 = (m5j.g) cVar7.f181520h.get();
                        s.j(gVar3);
                        ue0.c cVar8 = (ue0.c) jVar2.f282411g.get();
                        ne0.j jVar3 = (ne0.j) cVar7.e.get();
                        s.j(jVar3);
                        return new rs2.n(gVar3, cVar8, jVar3);
                    case 1:
                        yk0.a databaseSessionProvider2 = cVar7.f181518c.b();
                        s.j(databaseSessionProvider2);
                        vu.a businessReferralsProviders = (vu.a) cVar7.i.get();
                        s.j(businessReferralsProviders);
                        xe0.f storageFactory4 = jVar2.f282409b.f();
                        s.j(storageFactory4);
                        us2.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(databaseSessionProvider2, "databaseSessionProvider");
                        Intrinsics.checkNotNullParameter(businessReferralsProviders, "businessReferralsProviders");
                        Intrinsics.checkNotNullParameter(storageFactory4, "storageFactory");
                        return xe0.f.f(storageFactory4, databaseSessionProvider2, "storage_referrals.pref", ((k5j.d) businessReferralsProviders).f181523a, 2, zhm.u.c(new exa.a(1, 2, 5)), 32);
                    case 2:
                        return new qs2.a();
                    case 3:
                        vu.g gVarA = cVar7.a();
                        s.j(gVarA);
                        return new ws2.c(gVarA);
                    case 4:
                        vu.g gVarA2 = cVar7.a();
                        s.j(gVarA2);
                        return new ws2.i(gVarA2);
                    case 5:
                        return new rs2.b((gl3.f) jVar2.f282414l.get());
                    case 6:
                        z70.a aVarF = eVar4.f();
                        s.j(aVarF);
                        y80.a aVarR = eVar4.r();
                        s.j(aVarR);
                        return bq.i.s(aVarF, aVarR, new gl3.g());
                    default:
                        throw new AssertionError(i5);
                }
            case 25:
                x1 x1Var = (x1) obj2;
                us6.q qVar3 = x1Var.f282800a;
                if (i5 != 0) {
                    if (i5 == 1) {
                        return new zt6.a();
                    }
                    if (i5 == 2) {
                        return new r0();
                    }
                    throw new AssertionError(i5);
                }
                gr6.g gVar4 = (gr6.g) qVar3.f282713w0.get();
                s.j(gVar4);
                h1 h1VarN = qVar3.n();
                s.j(h1VarN);
                gr6.i iVarA = x1Var.f282801b.a();
                s.j(iVarA);
                return new t0(gVar4, h1VarN, iVarA);
            case 26:
                ush.b bVar9 = (ush.b) obj2;
                osh.a aVar9 = bVar9.f282924a;
                csh.k widgetsDependenciesApi = bVar9.f282926c;
                if (i5 == 0) {
                    return olc.c.C(aVar9, bVar9.f282925b, widgetsDependenciesApi);
                }
                if (i5 != 1) {
                    if (i5 == 2) {
                        return olc.c.B(aVar9, widgetsDependenciesApi);
                    }
                    throw new AssertionError(i5);
                }
                ish.b widgetContentInteractor = (ish.b) bVar9.f282927g.get();
                Intrinsics.checkNotNullParameter(widgetsDependenciesApi, "widgetsDependenciesApi");
                Intrinsics.checkNotNullParameter(widgetContentInteractor, "widgetContentInteractor");
                return new ish.a(widgetsDependenciesApi.b(), widgetsDependenciesApi.d(), widgetContentInteractor);
            case 27:
                uub.b bVar10 = (uub.b) obj2;
                if (i5 == 0) {
                    return new ee6.f(bVar10.f283196a, bVar10.f283197b, bVar10.f283198c, bVar10.d, bVar10.e, bVar10.f, bVar10.f283199g, bVar10.f283200h, bVar10.i, 10);
                }
                if (i5 == 1) {
                    return new vub.j(bVar10.f283201j, bVar10.k, bVar10.f283202l, i2);
                }
                throw new AssertionError(i5);
            case 28:
                ux8.a aVar10 = (ux8.a) obj2;
                if (i5 != 0) {
                    if (i5 == 1) {
                        return new wx8.b();
                    }
                    throw new AssertionError(i5);
                }
                wx8.b bVar11 = (wx8.b) aVar10.f283910c.get();
                z70.a aVarF2 = aVar10.f283909b.f();
                s.j(aVarF2);
                return new wx8.a(bVar11, aVarF2);
            default:
                uy9.a aVar11 = (uy9.a) obj2;
                q qVar4 = aVar11.f284107a;
                if (i5 == 0) {
                    return new ea2.s(qVar4, aVar11.f284108b, aVar11.f284109c, aVar11.d, aVar11.e, aVar11.f, aVar11.f284110g, aVar11.f284111h, aVar11.i, aVar11.f284112j, aVar11.k, aVar11.f284113l, aVar11.f284114m, aVar11.f284115n, aVar11.o, 3);
                }
                if (i5 == 1) {
                    return new add.b(qVar4, i3);
                }
                throw new AssertionError(i5);
        }
    }
}
