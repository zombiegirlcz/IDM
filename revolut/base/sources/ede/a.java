package ede;

import android.content.Context;
import android.location.Geocoder;
import androidx.room.migration.Migration;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.address.impl.data.network.AddressAutocompleteService;
import com.revolut.feature.address.impl.data.network.AddressFieldSuggestionService;
import com.revolut.feature.address.impl.data.network.AddressService;
import com.revolut.feature.address.impl.data.network.MunicipalitiesService;
import com.revolut.feature.apm.core.contacts.data.network.ApmContactsDiscoveryService;
import com.revolut.feature.apm.core.contacts.database.ApmContactsDatabase;
import com.revolut.feature.individual_flags.data.network.IndividualFlagsService;
import com.revolut.feature.insurance.impl.network.InsuranceService;
import com.revolut.feature.insurance_pet.impl.network.service.PetService;
import com.revolut.feature.junior_wallet.impl.services.JuniorWalletService;
import com.revolut.feature.location.impl.data.network.services.SecurityService;
import com.revolut.feature.shared.order_initiation.impl.data.database.OrderInitiationPageDatabase;
import com.revolut.feature.trusted_merchants.impl.data.network.TrustedMerchantsService;
import com.revolut.feature.wealth.analytics.data.database.WealthAnalyticsDatabase;
import com.revolut.feature.wealth.analytics.data.network.ComplexWealthAnalyticsService;
import com.revolut.feature.wealth.analytics.insights.repository.database.PortfolioInsightsDatabase;
import com.revolut.feature.workflow.engine.rfi.impl.data.network.service.RfiScreeningService;
import com.revolut.retail.feature.cryptocommoditydetails.impl.data.database.CryptoCommodityDetailsDatabase;
import com.revolut.retail.feature.impl.budgeting.database.BudgetingDatabase;
import com.revolut.retail.feature.impl.budgeting.network.services.BudgetingService;
import com.revolut.retail.feature.pricing_plans.impl.database.PricingPlansDatabase;
import com.revolut.retail.feature.pricing_plans.impl.network.CreditPlansService;
import com.revolut.retail.feature.pricing_plans.impl.network.FamilyPlanService;
import com.revolut.retail.feature.pricing_plans.impl.network.PricingPlanCancelService;
import com.revolut.retail.feature.pricing_plans.impl.network.PricingPlanService;
import com.revolut.retail.feature.pricing_plans.impl.network.PricingPlanWorkflowService;
import com.revolut.retail.feature.pricing_plans.impl.network.StudentPlanService;
import ewg.v;
import ewg.w;
import eyd.b0;
import fg8.l0;
import fh7.a0;
import fh7.t;
import fma.i0;
import fy1.p;
import fy1.r;
import hy1.c0;
import hy1.j0;
import hy1.l;
import hy1.m0;
import hy1.y;
import java.util.Collections;
import java.util.Set;
import kg.o;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kwg.m;
import kx7.y0;
import ne0.j;
import nvg.h0;
import nvg.i;
import nvg.n;
import nvg.n0;
import nvg.q;
import nvg.q0;
import nvg.u;
import nvg.x;
import om4.d0;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import skm.p0;
import us6.w3;
import vc.s;
import wvg.b1;
import wvg.c1;
import wvg.e0;
import wvg.g0;
import wvg.k;
import wvg.k0;
import wvg.n1;
import wvg.o0;
import wvg.r0;
import wvg.t0;
import wvg.x1;
import wvg.z;
import zhm.f0;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f124983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f124984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f124985c;

    public /* synthetic */ a(Object obj2, int i, int i2) {
        this.f124983a = i2;
        this.f124985c = obj2;
        this.f124984b = i;
    }

    private final Object a() {
        ewg.h hVar = (ewg.h) this.f124985c;
        int i = this.f124984b;
        switch (i) {
            case 0:
                b80.c cVarP = hVar.f130195c.p();
                s.j(cVarP);
                return new z(cVarP, (ComplexWealthAnalyticsService) hVar.A.get(), (j) hVar.B.get(), (x) hVar.D.get());
            case 1:
                return qvg.b.a((Retrofit) hVar.z.get());
            case 2:
                Retrofit retrofitI = ((c21.b) hVar.d).i();
                s.j(retrofitI);
                return ew3.d.D((o) hVar.f130215y.get(), retrofitI);
            case 3:
                return ewg.s.a();
            case 4:
                return v.a();
            case 5:
                return qlc.b.o((WealthAnalyticsDatabase) hVar.C.get());
            case 6:
                Context context = hVar.e;
                yk0.a aVarB = hVar.f.b();
                s.j(aVarB);
                return qlc.b.A(context, aVarB, ((c21.b) hVar.d).b());
            case 7:
                b80.c cVarP2 = hVar.f130195c.p();
                s.j(cVarP2);
                return new wvg.h(cVarP2, (ComplexWealthAnalyticsService) hVar.A.get(), (j) hVar.B.get(), (nvg.a) hVar.F.get());
            case 8:
                return qlc.b.h((WealthAnalyticsDatabase) hVar.C.get());
            case 9:
                return new wvg.j((ComplexWealthAnalyticsService) hVar.A.get(), (j) hVar.B.get(), (nvg.e) hVar.H.get());
            case 10:
                return qlc.b.i((WealthAnalyticsDatabase) hVar.C.get());
            case 11:
                b80.c cVarP3 = hVar.f130195c.p();
                s.j(cVarP3);
                return new k0(cVarP3, (ComplexWealthAnalyticsService) hVar.A.get(), (j) hVar.B.get(), (nvg.k0) hVar.J.get());
            case 12:
                return qlc.b.s((WealthAnalyticsDatabase) hVar.C.get());
            case 13:
                return new wvg.s((ComplexWealthAnalyticsService) hVar.A.get(), (j) hVar.B.get(), (nvg.s) hVar.L.get());
            case 14:
                return qlc.b.m((WealthAnalyticsDatabase) hVar.C.get());
            case 15:
                ComplexWealthAnalyticsService complexWealthAnalyticsService = (ComplexWealthAnalyticsService) hVar.A.get();
                j jVar = (j) hVar.B.get();
                h0 h0Var = (h0) hVar.N.get();
                ue0.c cVar = (ue0.c) hVar.O.get();
                CoroutineScope coroutineScopeA = hVar.f130199h.a();
                s.j(coroutineScopeA);
                return new g0(complexWealthAnalyticsService, jVar, h0Var, cVar, coroutineScopeA);
            case 16:
                return qlc.b.r((WealthAnalyticsDatabase) hVar.C.get());
            case 17:
                je0.d dVarB = hVar.f130198g.b();
                s.j(dVarB);
                yk0.a aVarB2 = hVar.f.b();
                s.j(aVarB2);
                xe0.f fVarF = hVar.f130198g.f();
                s.j(fVarF);
                return w.u(dVarB, fVarF, aVarB2);
            case 18:
                b80.c cVarP4 = hVar.f130195c.p();
                s.j(cVarP4);
                return new o0(cVarP4, (ComplexWealthAnalyticsService) hVar.A.get(), (j) hVar.B.get(), (n0) hVar.Q.get());
            case 19:
                return qlc.b.t((WealthAnalyticsDatabase) hVar.C.get());
            case 20:
                b80.c cVarP5 = hVar.f130195c.p();
                s.j(cVarP5);
                return new r0(cVarP5, (ComplexWealthAnalyticsService) hVar.A.get(), (j) hVar.B.get(), (q0) hVar.S.get());
            case 21:
                return qlc.b.u((WealthAnalyticsDatabase) hVar.C.get());
            case 22:
                return qlc.b.p((WealthAnalyticsDatabase) hVar.C.get());
            case 23:
                ComplexWealthAnalyticsService complexWealthAnalyticsService2 = (ComplexWealthAnalyticsService) hVar.A.get();
                j jVar2 = (j) hVar.B.get();
                q qVar = (q) hVar.V.get();
                ue0.c cVar2 = (ue0.c) hVar.O.get();
                CoroutineScope coroutineScopeA2 = hVar.f130199h.a();
                s.j(coroutineScopeA2);
                return new wvg.q(complexWealthAnalyticsService2, jVar2, qVar, cVar2, coroutineScopeA2);
            case 24:
                return qlc.b.l((WealthAnalyticsDatabase) hVar.C.get());
            case 25:
                return new k((ComplexWealthAnalyticsService) hVar.A.get(), (j) hVar.B.get(), (i) hVar.X.get());
            case 26:
                return qlc.b.j((WealthAnalyticsDatabase) hVar.C.get());
            case 27:
                e0 e0Var = (e0) hVar.f130192a0.get();
                wvg.o oVar = (wvg.o) hVar.c0.get();
                l80.e eVarH = hVar.f130195c.h();
                s.j(eVarH);
                return new b1(e0Var, oVar, eVarH);
            case 28:
                ComplexWealthAnalyticsService complexWealthAnalyticsService3 = (ComplexWealthAnalyticsService) hVar.A.get();
                j jVar3 = (j) hVar.B.get();
                nvg.e0 e0Var2 = (nvg.e0) hVar.Z.get();
                ue0.c cVar3 = (ue0.c) hVar.O.get();
                CoroutineScope coroutineScopeA3 = hVar.f130199h.a();
                s.j(coroutineScopeA3);
                l80.e eVarH2 = hVar.f130195c.h();
                s.j(eVarH2);
                return new e0(complexWealthAnalyticsService3, jVar3, e0Var2, cVar3, coroutineScopeA3, eVarH2);
            case 29:
                return qlc.b.q((WealthAnalyticsDatabase) hVar.C.get());
            case 30:
                ComplexWealthAnalyticsService complexWealthAnalyticsService4 = (ComplexWealthAnalyticsService) hVar.A.get();
                j jVar4 = (j) hVar.B.get();
                n nVar = (n) hVar.f130194b0.get();
                ue0.c cVar4 = (ue0.c) hVar.O.get();
                CoroutineScope coroutineScopeA4 = hVar.f130199h.a();
                s.j(coroutineScopeA4);
                return new wvg.o(complexWealthAnalyticsService4, jVar4, nVar, cVar4, coroutineScopeA4);
            case 31:
                return qlc.b.k((WealthAnalyticsDatabase) hVar.C.get());
            case 32:
                ComplexWealthAnalyticsService complexWealthAnalyticsService5 = (ComplexWealthAnalyticsService) hVar.A.get();
                j jVar5 = (j) hVar.B.get();
                nvg.e0 e0Var3 = (nvg.e0) hVar.Z.get();
                n nVar2 = (n) hVar.f130194b0.get();
                ue0.c cVar5 = (ue0.c) hVar.O.get();
                CoroutineScope coroutineScopeA5 = hVar.f130199h.a();
                s.j(coroutineScopeA5);
                gte.a aVarB3 = hVar.k.b();
                s.j(aVarB3);
                return new n1(complexWealthAnalyticsService5, jVar5, e0Var3, nVar2, cVar5, coroutineScopeA5, aVarB3);
            case 33:
                t0 t0Var = (t0) hVar.g0.get();
                wvg.v vVar = (wvg.v) hVar.i0.get();
                l80.e eVarH3 = hVar.f130195c.h();
                s.j(eVarH3);
                return new c1(t0Var, vVar, eVarH3);
            case 34:
                ComplexWealthAnalyticsService complexWealthAnalyticsService6 = (ComplexWealthAnalyticsService) hVar.A.get();
                j jVar6 = (j) hVar.B.get();
                nvg.t0 t0Var2 = (nvg.t0) hVar.f0.get();
                ue0.c cVar6 = (ue0.c) hVar.O.get();
                CoroutineScope coroutineScopeA6 = hVar.f130199h.a();
                s.j(coroutineScopeA6);
                l80.e eVarH4 = hVar.f130195c.h();
                s.j(eVarH4);
                return new t0(complexWealthAnalyticsService6, jVar6, t0Var2, cVar6, coroutineScopeA6, eVarH4);
            case 35:
                return qlc.b.v((WealthAnalyticsDatabase) hVar.C.get());
            case 36:
                ComplexWealthAnalyticsService complexWealthAnalyticsService7 = (ComplexWealthAnalyticsService) hVar.A.get();
                j jVar7 = (j) hVar.B.get();
                ue0.c cVar7 = (ue0.c) hVar.O.get();
                CoroutineScope coroutineScopeA7 = hVar.f130199h.a();
                s.j(coroutineScopeA7);
                return new wvg.v(complexWealthAnalyticsService7, jVar7, cVar7, coroutineScopeA7, (u) hVar.f130200h0.get());
            case 37:
                return qlc.b.n((WealthAnalyticsDatabase) hVar.C.get());
            case 38:
                ComplexWealthAnalyticsService complexWealthAnalyticsService8 = (ComplexWealthAnalyticsService) hVar.A.get();
                j jVar8 = (j) hVar.B.get();
                nvg.t0 t0Var3 = (nvg.t0) hVar.f0.get();
                u uVar = (u) hVar.f130200h0.get();
                ue0.c cVar8 = (ue0.c) hVar.O.get();
                CoroutineScope coroutineScopeA8 = hVar.f130199h.a();
                s.j(coroutineScopeA8);
                gte.a aVarB4 = hVar.k.b();
                s.j(aVarB4);
                return new x1(complexWealthAnalyticsService8, jVar8, t0Var3, uVar, cVar8, coroutineScopeA8, aVarB4);
            case 39:
                xoj.a aVarA = hVar.f130203l.a();
                s.j(aVarA);
                m mVar = new m();
                ybl.k kVarD = hVar.f130193b.d();
                s.j(kVarD);
                gte.a aVarB5 = hVar.k.b();
                s.j(aVarB5);
                tzg.m mVarT = hVar.i.t();
                s.j(mVarT);
                return new hwg.c(aVarA, mVar, kVarD, aVarB5, mVarT);
            case 40:
                je0.d dVarB2 = hVar.f130198g.b();
                s.j(dVarB2);
                yk0.a aVarB6 = hVar.f.b();
                s.j(aVarB6);
                xe0.f fVarF2 = hVar.f130198g.f();
                s.j(fVarF2);
                return w.g(dVarB2, fVarF2, aVarB6);
            case 41:
                z70.a aVarF = hVar.f130195c.f();
                s.j(aVarF);
                yk0.a aVarB7 = hVar.f.b();
                s.j(aVarB7);
                return w3.b(aVarF, aVarB7, ((c21.b) hVar.d).b(), ImmutableSet.of(new twg.e(fe0.d.a())));
            case 42:
                nj0.d dVar = (nj0.d) hVar.v;
                ik0.b bVarM = dVar.m();
                s.j(bVarM);
                return new swg.f(qwg.a.a(dVar.d(), bVarM), w3.p((PortfolioInsightsDatabase) hVar.f130206n0.get()), uwg.c.a(), new swg.a());
            case 43:
                return new vvg.b((ue0.c) hVar.m0.get());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object b() {
        ey1.e eVar = (ey1.e) this.f124985c;
        int i = this.f124984b;
        switch (i) {
            case 0:
                nx1.i iVar = (nx1.i) eVar.f130531w.get();
                cz5.b bVarC = eVar.c();
                fl3.a aVarE = eVar.i.e();
                s.j(aVarE);
                return new fy1.o(iVar, bVarC, aVarE, (CoroutineScope) eVar.f130532x.get());
            case 1:
                nj0.a aVar = eVar.f130517a;
                l70.e eVar2 = eVar.d;
                ApmContactsDiscoveryService apmContactsDiscoveryServiceC = w.c(((nj0.d) aVar).f());
                ue0.c cVar = (ue0.c) eVar.k.get();
                l80.e eVarH = eVar2.h();
                s.j(eVarH);
                px1.i iVar2 = new px1.i(apmContactsDiscoveryServiceC, new px1.c(cVar, eVarH), eVar.e(), eVar.a());
                ApmContactsDiscoveryService apmContactsDiscoveryServiceC2 = w.c(((nj0.d) eVar.f130517a).f());
                ue0.c cVar2 = (ue0.c) eVar.k.get();
                l80.e eVarH2 = eVar2.h();
                s.j(eVarH2);
                nx1.u uVar = new nx1.u(apmContactsDiscoveryServiceC2, new nx1.h(cVar2, eVarH2), eVar.e(), eVar.a());
                gte.a aVarB = eVar.f130521h.b();
                s.j(aVarB);
                return new nx1.v(iVar2, uVar, aVarB);
            case 2:
                je0.d dVarB = eVar.f130518b.b();
                s.j(dVarB);
                yk0.a aVarB2 = eVar.f130519c.b();
                s.j(aVarB2);
                xe0.f fVarF = eVar.f130518b.f();
                s.j(fVarF);
                return ey1.d.a(dVarB, aVarB2, fVarF);
            case 3:
                return w.b((ApmContactsDatabase) eVar.f130523l.get());
            case 4:
                Context context = eVar.e;
                yk0.a databaseSessionProvider = eVar.f130519c.b();
                s.j(databaseSessionProvider);
                de0.a databaseEncryptionMigratorFactory = ((c21.b) eVar.f).b();
                ey1.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory, "databaseEncryptionMigratorFactory");
                ApmContactsDatabase.Companion aVar2 = ApmContactsDatabase.INSTANCE;
                aVar2.getClass();
                ApmContactsDatabase apmContactsDatabase = (ApmContactsDatabase) aVar2.a(context, databaseSessionProvider, new Migration[]{yx1.h.f317535c, yx1.i.f317536c, yx1.j.f317537c, yx1.a.f317530c, yx1.c.f317531c, yx1.d.f317532c, yx1.e.f317533c, yx1.g.f317534c}, databaseEncryptionMigratorFactory);
                s.k(apmContactsDatabase);
                return apmContactsDatabase;
            case 5:
                return w.d((ApmContactsDatabase) eVar.f130523l.get());
            case 6:
                return w.e((ApmContactsDatabase) eVar.f130523l.get());
            case 7:
                return w.f((ApmContactsDatabase) eVar.f130523l.get());
            case 8:
                return w.j((ApmContactsDatabase) eVar.f130523l.get());
            case 9:
                return w.m((ApmContactsDatabase) eVar.f130523l.get());
            case 10:
                return w.s((ApmContactsDatabase) eVar.f130523l.get());
            case 11:
                return w.w((ApmContactsDatabase) eVar.f130523l.get());
            case 12:
                return w.y((ApmContactsDatabase) eVar.f130523l.get());
            case 13:
                return w.B((ApmContactsDatabase) eVar.f130523l.get());
            case 14:
                ey1.b.Companion.getClass();
                return rd0.e.a(p0.f264002b);
            case 15:
                cz5.b bVarC2 = eVar.c();
                vl3.n nVar = eVar.i;
                lx1.d dVar = (lx1.d) eVar.f130533y.get();
                wl3.c cVar3 = (wl3.c) nVar.f290240x.get();
                s.j(cVar3);
                cl3.a aVarD = nVar.d();
                s.j(aVarD);
                return new fy1.g(bVarC2, dVar, cVar3, aVarD, eVar.a());
            case 16:
                cz5.b bVarC3 = eVar.c();
                n02.a aVar3 = n02.a.PAYID;
                ky1.b bVar = (ky1.b) eVar.A.get();
                gsi.d.s(bVar);
                return new r(bVarC3, gy1.d.a(ImmutableMap.of(aVar3, bVar)));
            case 17:
                return new gy1.e(((c21.b) eVar.f).a());
            case 18:
                z80.b bVarS = eVar.d.s();
                s.j(bVarS);
                return new fy1.q(bVarS, (lx1.a) eVar.C.get());
            case 19:
                t2j.a aVar4 = eVar.f130522j;
                return new fy1.b(new c3j.c());
            case 20:
                return new p((f01.a) eVar.E.get());
            case 21:
                return w.A(eVar.e);
            case 22:
                return new hy1.c((sx1.a) eVar.f130524m.get(), (lx1.h) eVar.F.get());
            case 23:
                return new l(w.c(((nj0.d) eVar.f130517a).f()), (tx1.a) eVar.f130525n.get(), (lx1.h) eVar.F.get());
            case 24:
                return new hy1.p((ux1.a) eVar.o.get(), (lx1.h) eVar.F.get());
            case 25:
                return new hy1.s((vx1.a) eVar.f130526p.get(), (lx1.h) eVar.F.get());
            case 26:
                return new hy1.v((xx1.a) eVar.f130527q.get(), (lx1.h) eVar.F.get());
            case 27:
                return new y((zx1.a) eVar.f130528r.get(), (lx1.h) eVar.F.get());
            case 28:
                return new hy1.g0((by1.a) eVar.f130530t.get(), (lx1.h) eVar.F.get());
            case 29:
                return new j0((cy1.a) eVar.u.get(), (lx1.h) eVar.F.get());
            case 30:
                return new c0((ay1.a) eVar.f130529s.get(), (lx1.h) eVar.F.get());
            case 31:
                return new m0((dy1.a) eVar.v.get(), (lx1.h) eVar.F.get());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object c() {
        b0 b0Var = (b0) this.f124985c;
        ite.a aVar = b0Var.f130697a;
        l70.e eVar = b0Var.f130698b;
        fpg.c cVar = b0Var.f130703l;
        usg.a aVar2 = b0Var.i;
        pqi.a aVar3 = b0Var.f;
        int i = this.f124984b;
        switch (i) {
            case 0:
                tyd.g gVar = new tyd.g();
                gte.a aVarB = aVar.b();
                s.j(aVarB);
                ImmutableSet immutableSetOf = ImmutableSet.of((tyd.b) gVar, new tyd.b(aVarB));
                gte.a aVarB2 = aVar.b();
                s.j(aVarB2);
                return new dyd.b(immutableSetOf, aVarB2);
            case 1:
                return w.l(new nzd.d());
            case 2:
                wsg.b bVarA = aVar2.a();
                ppg.b bVarB = ((wpg.l) cVar).b();
                s.j(bVarB);
                lyd.w wVar = new lyd.w(bVarA, bVarB);
                d7e.b bVarA2 = b0Var.a();
                l80.e eVarH = eVar.h();
                s.j(eVarH);
                return ms1.g.s(wVar, bVarA2, eVarH);
            case 3:
                wsg.b bVarA3 = aVar2.a();
                ppg.b bVarB2 = ((wpg.l) cVar).b();
                s.j(bVarB2);
                lyd.x xVar = new lyd.x(bVarA3, bVarB2);
                d7e.b bVarA4 = b0Var.a();
                l80.e eVarH2 = eVar.h();
                s.j(eVarH2);
                return ms1.g.u(xVar, bVarA4, eVarH2);
            case 4:
                wsg.b bVarA5 = aVar2.a();
                g48.r0 r0VarC = b0Var.f130704m.c();
                ppg.b bVarB3 = ((wpg.l) cVar).b();
                s.j(bVarB3);
                lyd.u uVar = new lyd.u(bVarA5, r0VarC, bVarB3);
                d7e.b bVarA6 = b0Var.a();
                l80.e eVarH3 = eVar.h();
                s.j(eVarH3);
                return ms1.g.o(uVar, bVarA6, eVarH3);
            case 5:
                lyd.n nVar = new lyd.n(aVar3.g());
                ms1.g.r(nVar);
                return nVar;
            case 6:
                lyd.n nVar2 = new lyd.n(aVar3.g());
                ms1.g.t(nVar2);
                return nVar2;
            case 7:
                lyd.n nVar3 = new lyd.n(aVar3.g());
                ms1.g.n(nVar3);
                return nVar3;
            default:
                throw new AssertionError(i);
        }
    }

    private final Object d() {
        f49.a aVar = (f49.a) this.f124985c;
        l70.e eVar = aVar.f132026b;
        ee0.a aVar2 = aVar.d;
        int i = this.f124984b;
        switch (i) {
            case 0:
                c49.f fVar = (c49.f) aVar.f132032m.get();
                c49.d dVarB = aVar.b();
                qd0.b bVarN = eVar.n();
                s.j(bVarN);
                return new z39.b(fVar, dVarB, bVarN);
            case 1:
                SecurityService securityService = (SecurityService) aVar.f132029h.get();
                y80.a aVarR = eVar.r();
                s.j(aVarR);
                return new c49.f(securityService, aVarR, aVar.b(), (d49.a) aVar.f132031l.get(), (ue0.c) aVar.i.get());
            case 2:
                SecurityService securityService2 = (SecurityService) a0.d.f((nj0.d) aVar.f132025a, "retrofit", SecurityService.class, "create(...)");
                s.k(securityService2);
                return securityService2;
            case 3:
                xe0.f storageFactory = aVar2.f();
                s.j(storageFactory);
                je0.d jsonMapper = aVar2.b();
                s.j(jsonMapper);
                yk0.a databaseSessionProvider = aVar.e.b();
                s.j(databaseSessionProvider);
                g49.h.Companion.getClass();
                Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                Intrinsics.checkNotNullParameter(jsonMapper, "jsonMapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                return xe0.f.f(storageFactory, databaseSessionProvider, "location", jsonMapper, 0, f0.f322471a, 40);
            case 4:
                return new b49.c(new n80.b(), (Geocoder) aVar.f132030j.get(), g49.c.a());
            case 5:
                return fp8.c.o(aVar.f);
            case 6:
                return new d49.a();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object e() {
        f4i.a aVar = (f4i.a) this.f124985c;
        a31.a aVar2 = aVar.f132236g;
        a31.a aVar3 = aVar.f;
        a31.a aVar4 = aVar.e;
        int i = this.f124984b;
        if (i == 0) {
            return new j4i.b(aVar.f132233a, aVar.f132234b, aVar.f132235c, aVar.d, aVar4, aVar3, aVar2, aVar.f132237h);
        }
        if (i == 1) {
            return f0k.d.D((j4i.b) aVar.f132244r.get());
        }
        if (i == 2) {
            return jr9.h.c(aVar4, aVar.f132245s, aVar.f132238j, aVar3, aVar.k, aVar.f132240m, aVar.f132239l, aVar.f132241n, aVar.o, aVar2, aVar.f132243q);
        }
        throw new AssertionError(i);
    }

    private final Object f() {
        f98.c cVar = (f98.c) this.f124985c;
        a31.a aVar = cVar.i;
        a31.a aVar2 = cVar.d;
        int i = this.f124984b;
        if (i == 0) {
            return new h98.k(cVar.f132861a, cVar.f132862b, cVar.f132863c, aVar2, cVar.e, cVar.f, cVar.f132864g, cVar.f132865h, aVar);
        }
        if (i == 1) {
            return h7d.a.a(cVar.f132866j, cVar.f132872r, cVar.k, aVar2, cVar.f132867l, cVar.f132868m, cVar.f132869n, cVar.o, cVar.f132870p, aVar);
        }
        if (i == 2) {
            return f0k.d.C((h98.k) cVar.f132871q.get());
        }
        if (i == 3) {
            return h98.b.a();
        }
        throw new AssertionError(i);
    }

    private final Object g() {
        fa0.x xVar = (fa0.x) this.f124985c;
        a31.a aVar = xVar.d;
        a31.a aVar2 = xVar.f133173b;
        a31.a aVar3 = xVar.f133172a;
        int i = this.f124984b;
        if (i == 0) {
            return new fa0.z(aVar3, aVar2, xVar.f133174c, aVar, xVar.e);
        }
        if (i == 1) {
            return new ad3.b(aVar3, xVar.f133179m, xVar.f, aVar2, aVar, xVar.f133175g, xVar.f133176h, xVar.i, xVar.f133177j, xVar.k);
        }
        if (i != 2) {
            throw new AssertionError(i);
        }
        fa0.y yVar = (fa0.y) ((fa0.z) xVar.f133178l.get()).b();
        s.k(yVar);
        return yVar;
    }

    private final Object h() {
        fa0.y yVar = (fa0.y) this.f124985c;
        ee0.a aVar = yVar.f133183c;
        int i = this.f124984b;
        if (i == 0) {
            p90.a aVar2 = (p90.a) yVar.f133181a.f290174c.get();
            s.j(aVar2);
            return new ra0.h(aVar2, (ra0.a) yVar.f.get(), (ra0.b) yVar.f133185h.get());
        }
        if (i == 1) {
            return new ra0.a();
        }
        if (i == 2) {
            l80.e eVarH = yVar.f133182b.h();
            s.j(eVarH);
            return new com.revolut.core.backend_flow.impl.repository.a(eVarH, (ue0.c) yVar.f133184g.get(), yVar.e.f183263a);
        }
        if (i != 3) {
            throw new AssertionError(i);
        }
        xe0.f fVarF = aVar.f();
        s.j(fVarF);
        yk0.a aVarB = yVar.d.b();
        s.j(aVarB);
        ke0.d dVar = (ke0.d) aVar.e.get();
        s.j(dVar);
        ke0.b bVar = (ke0.b) aVar.f.get();
        s.j(bVar);
        ke0.f fVar = (ke0.f) aVar.f125050g.get();
        s.j(fVar);
        return f9f.b.t(fVarF, aVarB, dVar, bVar, fVar);
    }

    private final Object i() {
        fbd.a aVar = (fbd.a) this.f124985c;
        zs6.a aVar2 = aVar.f133536a;
        an0.c cVar = aVar.d;
        ee0.a aVar3 = aVar.e;
        int i = this.f124984b;
        switch (i) {
            case 0:
                return new bbd.b((dbd.g) aVar.k.get());
            case 1:
                zt6.g gVar = (zt6.g) aVar2.f324816c.get();
                s.j(gVar);
                bd1.a aVarA = aVar.f133537b.a();
                s.j(aVarA);
                return new dbd.g(gVar, aVarA, (j) aVar.f.get(), (xad.a) aVar.f133540h.get(), (ue0.c) aVar.f133541j.get());
            case 2:
                return new ne0.d();
            case 3:
                return f9f.b.o((OrderInitiationPageDatabase) aVar.f133539g.get());
            case 4:
                z70.a aVarF = aVar.f133538c.f();
                s.j(aVarF);
                Set set = Collections.EMPTY_SET;
                yk0.a aVarB = cVar.b();
                s.j(aVarB);
                return f9f.b.p(aVarF, aVarB, ((c21.b) aVar2.f324814a).b());
            case 5:
                yk0.a aVarB2 = cVar.b();
                s.j(aVarB2);
                je0.d dVar = (je0.d) aVar.i.get();
                xe0.f fVarF = aVar3.f();
                s.j(fVarF);
                return f9f.b.v(aVarB2, dVar, fVarF);
            case 6:
                le0.b bVarC = aVar3.c();
                s.j(bVarC);
                return f9f.b.n(fe0.c.a(), bVarC);
            case 7:
                return new bbd.c((bbd.b) aVar.f133542l.get());
            case 8:
                return new wad.a();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object j() {
        fdb.b bVar = (fdb.b) this.f124985c;
        int i = this.f124984b;
        if (i == 0) {
            sh5.d dVarF = bVar.f133927a.f();
            s.j(dVarF);
            return new gdb.b(dVarF);
        }
        if (i != 1) {
            throw new AssertionError(i);
        }
        gte.a aVarB = bVar.f133929c.b();
        s.j(aVarB);
        return new gdb.c(aVarB);
    }

    private final Object k() {
        fdj.a aVar = (fdj.a) this.f124985c;
        c21.e eVar = aVar.f133941c;
        cdj.a aVar2 = aVar.f133940b;
        int i = this.f124984b;
        switch (i) {
            case 0:
                return c21.l.k(aVar2, (Retrofit) aVar.k.get());
            case 1:
                Retrofit retrofitI = ((c21.b) eVar).i();
                s.j(retrofitI);
                return cdj.b.m(aVar2, retrofitI, (o) aVar.f133944j.get());
            case 2:
                o oVarH = ((c21.b) eVar).h();
                s.j(oVarH);
                return cdj.b.l(aVar2, oVarH);
            case 3:
                return xb1.a.h((CryptoCommodityDetailsDatabase) aVar.f133946m.get());
            case 4:
                Context context = aVar.d;
                yk0.a aVarB = aVar.e.b();
                s.j(aVarB);
                return xb1.a.k(context, aVarB, ((c21.b) eVar).b());
            case 5:
                return cdj.b.h(aVar2, (Retrofit) aVar.k.get());
            case 6:
                return xb1.a.j((CryptoCommodityDetailsDatabase) aVar.f133946m.get());
            case 7:
                thf.g gVarE = aVar.f133942g.e();
                s.j(gVarE);
                return new idj.a(gVarE);
            case 8:
                return new edj.a();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object l() {
        fh7.a aVar = (fh7.a) this.f124985c;
        int i = this.f124984b;
        switch (i) {
            case 0:
                IndividualFlagsService individualFlagsService = (IndividualFlagsService) aVar.e.get();
                eh7.a aVar2 = (eh7.a) aVar.C.get();
                hhi.d dVar = (hhi.d) aVar.f135166b.f152410a.get();
                s.j(dVar);
                return new eh7.d(individualFlagsService, aVar2, dVar, new ne0.d(), (ue0.c) aVar.D.get());
            case 1:
                return f9f.b.s(((nj0.d) aVar.f135165a).f());
            case 2:
                aVar.getClass();
                e4m.f fVar = new e4m.f(23);
                fVar.a(aVar.f.get());
                fVar.a(aVar.f135168g.get());
                fVar.a(aVar.f135169h.get());
                fVar.a(aVar.i.get());
                fVar.a(aVar.f135170j.get());
                fVar.a(aVar.k.get());
                fVar.a(aVar.f135171l.get());
                fVar.a(aVar.f135172m.get());
                fVar.a(aVar.f135173n.get());
                fVar.a(aVar.o.get());
                fVar.a(aVar.f135174p.get());
                fVar.a(aVar.f135175q.get());
                fVar.a(aVar.f135176r.get());
                fVar.a(aVar.f135177s.get());
                fVar.a(aVar.f135178t.get());
                fVar.a(aVar.u.get());
                fVar.a(aVar.v.get());
                fVar.a(aVar.f135179w.get());
                fVar.a(aVar.f135180x.get());
                fVar.a(aVar.f135181y.get());
                fVar.a(aVar.z.get());
                fVar.a(aVar.A.get());
                fVar.a(aVar.B.get());
                return new eh7.a(fVar.c());
            case 3:
                fh7.j.a();
                return gh7.e.f143861a;
            case 4:
                fh7.h.a();
                return gh7.c.f143859a;
            case 5:
                fh7.k.a();
                return gh7.f.f143862a;
            case 6:
                fh7.l.a();
                return gh7.g.f143863a;
            case 7:
                fh7.p.a();
                return gh7.p.f143870a;
            case 8:
                fh7.q.a();
                return gh7.q.f143871a;
            case 9:
                fh7.s.a();
                return gh7.s.f143873a;
            case 10:
                fh7.y.a();
                return gh7.y.f143879a;
            case 11:
                a0.a();
                return gh7.a0.f143856a;
            case 12:
                fh7.b0.a();
                return gh7.b0.f143858a;
            case 13:
                fh7.o.a();
                return gh7.o.f143869a;
            case 14:
                fh7.i.a();
                return gh7.d.f143860a;
            case 15:
                fh7.v.a();
                return gh7.v.f143876a;
            case 16:
                t.a();
                return gh7.t.f143874a;
            case 17:
                fh7.r.a();
                return gh7.r.f143872a;
            case 18:
                fh7.x.a();
                return gh7.x.f143878a;
            case 19:
                fh7.u.a();
                return gh7.u.f143875a;
            case 20:
                fh7.z.a();
                return gh7.z.f143880a;
            case 21:
                fh7.f.a();
                return gh7.a.f143855a;
            case 22:
                fh7.m.a();
                return gh7.i.f143865a;
            case 23:
                fh7.n.a();
                return gh7.j.f143866a;
            case 24:
                fh7.w.a();
                return gh7.w.f143877a;
            case 25:
                fh7.g.a();
                return gh7.b.f143857a;
            case 26:
                an0.c cVar = aVar.f135167c;
                ee0.a aVar3 = aVar.d;
                yk0.a aVarB = cVar.b();
                s.j(aVarB);
                xe0.f fVarF = aVar3.f();
                s.j(fVarF);
                le0.b bVarC = aVar3.c();
                s.j(bVarC);
                return f9f.b.u(fe0.c.a(), bVarC, fVarF, aVarB);
            case 27:
                return new ah7.a();
            case 28:
                return new if0.a(Collections.singleton((od0.e) aVar.D.get()));
            default:
                throw new AssertionError(i);
        }
    }

    private final Object m() {
        fma.h hVar = (fma.h) this.f124985c;
        int i = this.f124984b;
        switch (i) {
            case 0:
                sri.m mVar = (sri.m) hVar.f136144w.get();
                xq3.k kVar = (xq3.k) hVar.f136131b.P.get();
                s.j(kVar);
                gte.a aVarB = hVar.f136132c.b();
                s.j(aVarB);
                return new jma.g(mVar, kVar, aVarB);
            case 1:
                return gg0.g.v(hVar.f136130a);
            case 2:
                return new jma.m((sri.m) hVar.f136144w.get());
            case 3:
                return new lma.e((ue0.c) hVar.z.get());
            case 4:
                je0.d dVarB = hVar.d.b();
                s.j(dVarB);
                yk0.a aVarB2 = hVar.e.b();
                s.j(aVarB2);
                xe0.f fVarF = hVar.d.f();
                s.j(fVarF);
                return gg0.g.A(dVarB, fVarF, aVarB2);
            case 5:
                efk.a aVar = hVar.f;
                cm2.a aVar2 = hVar.f136135j;
                ckg.a aVar3 = hVar.f136133g;
                ffk.t tVarF = aVar.f();
                s.j(tVarF);
                ekg.g gVarB = aVar3.b();
                vjg.g gVarA = aVar3.a();
                s.j(gVarA);
                return new hma.g(tVarF, gVarB, gVarA, hVar.f136134h.e(), (lma.b) hVar.B.get(), aVar2.c(), aVar2.d());
            case 6:
                return new lma.c((mk0.a) hVar.A.get());
            case 7:
                mk0.a aVarA = hVar.i.a();
                s.j(aVarA);
                gg0.g.w(aVarA);
                return aVarA;
            case 8:
                return new jma.k();
            case 9:
                com.revolut.retail.feature.api.userauth.navigation.a aVarA2 = hVar.k.a();
                s.j(aVarA2);
                return new jma.i(aVarA2);
            case 10:
                return new kma.c();
            case 11:
                sri.m mVarD = ((g8b.a) hVar.f136136l).d();
                s.j(mVarD);
                return new jma.c(mVarD, (tla.d) hVar.E.get());
            case 12:
                return new kma.b(hVar.I);
            case 13:
                fk3.a aVarA3 = hVar.f136142s.a();
                s.j(aVarA3);
                gbd.a aVar4 = (gbd.a) hVar.H.get();
                n8b.b bVarB = hVar.f136143t.b();
                s.j(bVarB);
                return new hma.o(aVarA3, aVar4, bVarB, hVar.u.c(), hVar.f136134h.e());
            case 14:
                n8b.b bVarB2 = hVar.f136143t.b();
                s.j(bVarB2);
                return new kma.a(bVarB2);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object n() {
        fma.g0 g0Var = (fma.g0) this.f124985c;
        a31.a aVar = g0Var.f136112m;
        a31.a aVar2 = g0Var.f136111l;
        a31.a aVar3 = g0Var.f136103c;
        a31.a aVar4 = g0Var.o;
        a31.a aVar5 = g0Var.d;
        a31.a aVar6 = g0Var.f136107h;
        a31.a aVar7 = g0Var.f136118r;
        a31.a aVar8 = g0Var.f136113n;
        a31.a aVar9 = g0Var.k;
        a31.a aVar10 = g0Var.f136101b;
        a31.a aVar11 = g0Var.f136100a0;
        a31.a aVar12 = g0Var.i;
        a31.a aVar13 = g0Var.u;
        a31.a aVar14 = g0Var.f136120s;
        a31.a aVar15 = g0Var.f136122t;
        ecm.q qVar = g0Var.f136099a;
        int i = this.f124984b;
        if (i == 0) {
            return new fma.h0(qVar, aVar10, aVar3, aVar5, g0Var.e, g0Var.f, g0Var.f136106g, aVar6, aVar12, g0Var.f136109j, aVar9, aVar2, aVar, aVar8, aVar4, g0Var.f136116p, g0Var.f136117q, aVar7, aVar14, aVar15, aVar13);
        }
        if (i == 1) {
            return new fma.j0(qVar, g0Var.v, g0Var.f136125w, g0Var.f136127x, g0Var.f136129y, g0Var.z, g0Var.A, g0Var.B, aVar14, aVar9, g0Var.C, g0Var.D, aVar8, g0Var.E, g0Var.F, aVar7, aVar6, g0Var.G, g0Var.H, g0Var.I, aVar5, g0Var.J, g0Var.Q0, g0Var.K, aVar4, g0Var.L, aVar3, aVar12, g0Var.M, g0Var.N, g0Var.O, g0Var.P, g0Var.Q, aVar15, g0Var.R, g0Var.S, g0Var.T, g0Var.U, g0Var.V, g0Var.W, g0Var.X, g0Var.Y, aVar13, g0Var.Z, aVar11, g0Var.f136102b0, g0Var.c0, g0Var.f136104d0, g0Var.f136105e0, g0Var.f0, g0Var.g0, g0Var.f136108h0, g0Var.i0, g0Var.j0, g0Var.f136110k0, g0Var.S0, g0Var.m0, g0Var.f136114n0, g0Var.f136115o0, g0Var.p0, aVar2, aVar, g0Var.q0, g0Var.f136119r0, g0Var.f136121s0, g0Var.f136123t0, g0Var.u0, g0Var.f136124v0, g0Var.f136126w0, g0Var.f136128x0, g0Var.y0, g0Var.z0, g0Var.A0, g0Var.B0, g0Var.C0, g0Var.D0, g0Var.E0, g0Var.F0, g0Var.G0, g0Var.H0, g0Var.I0, g0Var.J0, g0Var.K0, g0Var.L0, g0Var.M0);
        }
        if (i == 2) {
            return f9f.b.C((fma.h0) g0Var.P0.get());
        }
        if (i == 3) {
            return f9f.b.D((i0) g0Var.R0.get());
        }
        if (i == 4) {
            return new i0(g0Var.l0, aVar11, aVar10);
        }
        if (i == 5) {
            return new emi.g(qVar, aVar15, aVar14, aVar13, aVar12, 1);
        }
        throw new AssertionError(i);
    }

    private final Object o() {
        fp8.a aVar = (fp8.a) this.f124985c;
        int i = this.f124984b;
        if (i == 0) {
            return new gp8.o(aVar.f137063a, aVar.f137064b, aVar.f137065c, aVar.d);
        }
        if (i == 1) {
            return gmf.b.j(aVar.e, aVar.f, aVar.f137066g, aVar.f137067h, aVar.i, aVar.f137068j, aVar.k, aVar.f137071n, aVar.f137069l);
        }
        if (i == 2) {
            return fp8.c.C((gp8.o) aVar.f137070m.get());
        }
        throw new AssertionError(i);
    }

    private final Object p() {
        fqk.a aVar = (fqk.a) this.f124985c;
        int i = this.f124984b;
        switch (i) {
            case 0:
                e4m.e eVar = aVar.f137291y;
                jhf.a aVar2 = aVar.f137275a;
                qsi.b bVar = (qsi.b) eVar.get();
                thf.l lVarF = aVar.f137280j.f();
                s.j(lVarF);
                wv9.c cVarD = ((s6k.b) aVar.f137276b).d();
                s.j(cVarD);
                jqk.c cVar = new jqk.c(cVarD);
                t70.g gVarO = aVar.d.d.o();
                s.j(gVarO);
                jqk.e eVar2 = new jqk.e(new nd.l(gVarO));
                lr8.a aVar3 = (lr8.a) aVar.f137279h.f273760p.get();
                s.j(aVar3);
                jqk.b bVar2 = new jqk.b(aVar3);
                mg8.a aVar4 = new mg8.a();
                sjf.e eVarD = ((bjf.a) aVar2).d();
                s.j(eVarD);
                h9e.h hVar = (h9e.h) aVar.k.H.get();
                s.j(hVar);
                mhf.b bVarB = ((bjf.a) aVar2).b();
                s.j(bVarB);
                return new jqk.g(bVar, lVarF, cVar, eVar2, bVar2, aVar4, eVarD, hVar, bVarB);
            case 1:
                com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) aVar.f137275a).c();
                s.j(aVarC);
                vv9.c cVarC = ((s6k.b) aVar.f137276b).c();
                s.j(cVarC);
                nhf.a aVarA = aVar.f137277c.a();
                s.j(aVarA);
                sh3.a aVarA2 = aVar.d.a();
                s.j(aVarA2);
                y45.h hVarG = aVar.e.g();
                fal.b bVar3 = (fal.b) aVar.f.f193459j.get();
                s.j(bVar3);
                rul.e eVarB = aVar.f137278g.b();
                sr8.g gVarA = aVar.f137279h.a();
                mhf.b bVarB2 = ((bjf.a) aVar.f137275a).b();
                s.j(bVarB2);
                ar3.c cVar2 = (ar3.c) aVar.i.O.get();
                s.j(cVar2);
                return new gqk.e(aVarC, cVarC, aVarA, aVarA2, hVarG, bVar3, eVarB, gVarA, bVarB2, cVar2);
            case 2:
                e4m.e eVar3 = aVar.z;
                okg.a aVar5 = aVar.f137284p;
                jhf.a aVar6 = aVar.f137275a;
                qsi.g gVar = (qsi.g) eVar3.get();
                qpa.b bVarB3 = aVar.f137281l.b();
                s.j(bVarB3);
                com.revolut.domain.interactors.transactions.a aVarC2 = ((bjf.a) aVar6).c();
                s.j(aVarC2);
                sjf.e eVarD2 = ((bjf.a) aVar6).d();
                s.j(eVarD2);
                oqk.m mVar = new oqk.m();
                x71.b bVar4 = (x71.b) ((bjf.a) aVar6).f15638w0.get();
                s.j(bVar4);
                oqk.b bVar5 = (oqk.b) aVar.A.get();
                kge.d dVar = new kge.d((dge.b) aVar.f137283n.e.get(), new ne0.d());
                gte.a aVarB = aVar.o.b();
                s.j(aVarB);
                mhf.b bVarB4 = ((bjf.a) aVar6).b();
                s.j(bVarB4);
                nhf.a aVarA3 = aVar.f137277c.a();
                s.j(aVarA3);
                return new oqk.g0(gVar, bVarB3, aVarC2, eVarD2, mVar, bVar4, bVar5, dVar, aVarB, bVarB4, aVarA3, aVar5.b(), aVar5.c(), aVar5.a(), (fd0.d) aVar.B.get());
            case 3:
                mk0.a aVarA4 = aVar.f137282m.a();
                s.j(aVarA4);
                return new oqk.b(aVarA4);
            case 4:
                return fqk.e.a();
            case 5:
                vjf.a aVar7 = aVar.f137285q;
                sm1.d dVar2 = aVar.f137287s;
                ujf.h hVarA = aVar7.a();
                oqk.b bVar6 = (oqk.b) aVar.A.get();
                qhf.a aVar8 = (qhf.a) aVar.f137280j.M.get();
                s.j(aVar8);
                g8i.a aVarQ = aVar.f137286r.Q();
                nm1.c cVarB = dVar2.b();
                s.j(cVarB);
                qm1.h hVarC = dVar2.c();
                s.j(hVarC);
                return new oqk.l(hVarA, bVar6, aVar8, aVarQ, cVarB, hVarC, aVar.f137288t.b());
            case 6:
                return fp8.c.z(new iqk.e(aVar.E));
            case 7:
                djf.c cVar3 = aVar.f137280j;
                thf.m mVarG = cVar3.g();
                s.j(mVarG);
                thf.d dVarD = cVar3.d();
                s.j(dVarD);
                return new iqk.k(new iqk.h(mVarG, dVarD), new iqk.f(aVar.u.b(), new f73.c()));
            case 8:
                ppg.b bVarB5 = ((wpg.l) aVar.v).b();
                s.j(bVarB5);
                return new lqk.e(bVarB5, new lqk.f());
            case 9:
                ppg.b bVarB6 = ((wpg.l) aVar.v).b();
                s.j(bVarB6);
                return new kqk.a(bVarB6, aVar.f137289w.e(), new mqk.b(new mqk.c()), new mqk.c());
            case 10:
                return new nqk.a(aVar.f137290x.g());
            default:
                throw new AssertionError(i);
        }
    }

    @Override // phm.a
    public final Object get() {
        Object fVar;
        int i = this.f124983a;
        int i2 = 1;
        int i3 = this.f124984b;
        Object obj2 = this.f124985c;
        switch (i) {
            case 0:
                b bVar = (b) obj2;
                switch (i3) {
                    case 0:
                        return e5f.b.D((Retrofit) bVar.f124993m.get());
                    case 1:
                        Retrofit retrofitI = ((c21.b) bVar.f124986a).i();
                        s.j(retrofitI);
                        return e5f.b.p((o) bVar.f124992l.get(), retrofitI);
                    case 2:
                        o oVarH = ((c21.b) bVar.f124986a).h();
                        s.j(oVarH);
                        return e5f.b.n(oVarH);
                    case 3:
                        je0.d mapper = bVar.f124988c.b();
                        s.j(mapper);
                        yk0.a databaseSessionProvider = bVar.d.b();
                        s.j(databaseSessionProvider);
                        xe0.f storageFactory = bVar.f124988c.f();
                        s.j(storageFactory);
                        h.Companion.getClass();
                        Intrinsics.checkNotNullParameter(mapper, "mapper");
                        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                        return xe0.f.f(storageFactory, databaseSessionProvider, "support", mapper, 0, null, 56);
                    case 4:
                        h.Companion.getClass();
                        ne0.n.Companion.getClass();
                        return ne0.l.a(Integer.MAX_VALUE, 1L);
                    case 5:
                        sri.m mVar = (sri.m) bVar.f124996q.get();
                        l93.f fVarJ = bVar.f.j();
                        s.j(fVarJ);
                        return new hde.i(mVar, fVarJ);
                    case 6:
                        return e5f.b.r(bVar.e);
                    case 7:
                        return new hde.f((sri.m) bVar.f124996q.get(), new lde.j(new fde.a(bVar.f124989g.b()), bVar.f124990h.e()));
                    case 8:
                        return new hde.c((sri.m) bVar.f124996q.get(), new lde.j(new fde.a(bVar.f124989g.b()), bVar.f124990h.e()));
                    case 9:
                        return new hde.j((sri.m) bVar.f124996q.get());
                    case 10:
                        return new hde.g((sri.m) bVar.f124996q.get());
                    default:
                        throw new AssertionError(i3);
                }
            case 1:
                ee0.a aVar = (ee0.a) obj2;
                switch (i3) {
                    case 0:
                        me0.a factory = (me0.a) aVar.f125049c.get();
                        Intrinsics.checkNotNullParameter(factory, "factory");
                        return factory.a(null);
                    case 1:
                        return new me0.a(fe0.d.a());
                    case 2:
                        return new ke0.d();
                    case 3:
                        return new ke0.b();
                    case 4:
                        return new ke0.f();
                    case 5:
                        le0.b factory2 = (le0.b) aVar.f125051h.get();
                        Intrinsics.checkNotNullParameter(factory2, "factory");
                        return factory2.a(null);
                    case 6:
                        return new le0.b(fe0.c.a());
                    case 7:
                        return new ze0.c();
                    case 8:
                        fe0.b.Companion.getClass();
                        return new xe0.a();
                    case 9:
                        return new xe0.f((xe0.a) aVar.k.get(), aVar.f125047a, (ye0.b) aVar.f125053l.get());
                    case 10:
                        return f9f.b.w(aVar.f125047a);
                    case 11:
                        m31.c multipartHelper = (m31.c) aVar.f125055n.get();
                        Intrinsics.checkNotNullParameter(multipartHelper, "multipartHelper");
                        return new m31.b();
                    case 12:
                        return new m31.c();
                    case 13:
                        b80.c networkStateRepository = aVar.f125048b.p();
                        s.j(networkStateRepository);
                        ue0.c storage = (ue0.c) aVar.f125056p.get();
                        Intrinsics.checkNotNullParameter(networkStateRepository, "networkStateRepository");
                        Intrinsics.checkNotNullParameter(storage, "storage");
                        p0 p0Var = p0.f264001a;
                        return new pe0.q(networkStateRepository, storage, rd0.e.a(elm.f.f127540b.plus(new az0.c1(skm.z.f264021a, i2))));
                    case 14:
                        je0.d mapper2 = (je0.d) aVar.d.get();
                        xe0.f storageFactory2 = (xe0.f) aVar.f125054m.get();
                        Intrinsics.checkNotNullParameter(mapper2, "mapper");
                        Intrinsics.checkNotNullParameter(storageFactory2, "storageFactory");
                        return xe0.f.e(storageFactory2, "offline_queue", mapper2, 8);
                    default:
                        throw new AssertionError(i3);
                }
            case 2:
                efk.a aVar2 = (efk.a) obj2;
                switch (i3) {
                    case 0:
                        dha.c cVar = (dha.c) aVar2.f125347p.get();
                        l80.e eVarH = aVar2.f.h();
                        s.j(eVarH);
                        return new ffk.t(cVar, eVarH);
                    case 1:
                        PricingPlanService pricingPlanService = (PricingPlanService) aVar2.f125344l.get();
                        xek.a aVar3 = (xek.a) aVar2.f125346n.get();
                        xe0.e eVarN = aVar2.n();
                        j jVar = (j) aVar2.o.get();
                        ifk.c cVar2 = new ifk.c(new qfk.a());
                        qfk.b bVar2 = new qfk.b();
                        b80.c cVarP = aVar2.f.p();
                        s.j(cVarP);
                        return new pfk.p0(pricingPlanService, aVar3, eVarN, jVar, cVar2, bVar2, cVarP);
                    case 2:
                        efk.g gVar = aVar2.f125338a;
                        PricingPlanService pricingPlanService2 = (PricingPlanService) com.google.android.gms.internal.mlkit_vision_face.a.i((Retrofit) aVar2.k.get(), "retrofit", PricingPlanService.class, "create(...)");
                        s.k(pricingPlanService2);
                        return pricingPlanService2;
                    case 3:
                        efk.g gVar2 = aVar2.f125338a;
                        Retrofit retrofitE = ((c21.b) aVar2.f125339b).e();
                        s.j(retrofitE);
                        o oVar = (o) aVar2.f125343j.get();
                        Retrofit retrofitBuild = p.a.x(retrofitE, "retrofit", oVar, "pricingPlansGson").addConverterFactory(GsonConverterFactory.create(oVar)).build();
                        Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
                        s.k(retrofitBuild);
                        return retrofitBuild;
                    case 4:
                        efk.g gVar3 = aVar2.f125338a;
                        o gson = ((c21.b) aVar2.f125339b).h();
                        s.j(gson);
                        Intrinsics.checkNotNullParameter(gson, "gson");
                        kg.p pVar = new kg.p(gson);
                        pVar.c(new gfk.l(), gfk.k.class);
                        o oVarB = pVar.b();
                        Intrinsics.checkNotNullExpressionValue(oVarB, "create(...)");
                        return oVarB;
                    case 5:
                        PricingPlansDatabase db8 = (PricingPlansDatabase) aVar2.f125345m.get();
                        efk.f.Companion.getClass();
                        Intrinsics.checkNotNullParameter(db8, "db");
                        xek.a aVarG = db8.g();
                        s.k(aVarG);
                        return aVarG;
                    case 6:
                        Context context = aVar2.f125340c;
                        yk0.a databaseSessionProvider2 = aVar2.d.b();
                        s.j(databaseSessionProvider2);
                        de0.a databaseEncryptionMigratorFactory = ((c21.b) aVar2.f125339b).b();
                        efk.f.Companion.getClass();
                        Intrinsics.checkNotNullParameter(context, "context");
                        Intrinsics.checkNotNullParameter(databaseSessionProvider2, "databaseSessionProvider");
                        Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory, "databaseEncryptionMigratorFactory");
                        PricingPlansDatabase pricingPlansDatabase = (PricingPlansDatabase) PricingPlansDatabase.INSTANCE.a(context, databaseSessionProvider2, new Migration[]{yek.a.f313030c, yek.b.f313031c, yek.c.f313032c, yek.d.f313033c}, databaseEncryptionMigratorFactory);
                        s.k(pricingPlansDatabase);
                        return pricingPlansDatabase;
                    case 7:
                        return new ne0.d();
                    case 8:
                        return new ffk.w((pfk.g0) aVar2.f125350s.get());
                    case 9:
                        return new pfk.g0((PricingPlanWorkflowService) aVar2.f125349r.get(), (j) aVar2.o.get(), aVar2.m());
                    case 10:
                        return e5f.b.A(aVar2.f125338a, (Retrofit) aVar2.k.get());
                    case 11:
                        return new ffk.j((pfk.y) aVar2.f125352w.get(), (ffk.t) aVar2.f125348q.get(), new ffk.i());
                    case 12:
                        PricingPlanService pricingPlanService3 = (PricingPlanService) aVar2.f125344l.get();
                        xe0.e eVarK = aVar2.k();
                        j jVar2 = (j) aVar2.o.get();
                        b80.c cVarP2 = aVar2.f.p();
                        s.j(cVarP2);
                        return new pfk.c0(pricingPlanService3, eVarK, jVar2, cVarP2);
                    case 13:
                        o oVar2 = (o) aVar2.u.get();
                        le0.b bVarC = aVar2.e.c();
                        s.j(bVarC);
                        return e5f.b.u(oVar2, bVarC);
                    case 14:
                        o oVarH2 = ((c21.b) aVar2.f125339b).h();
                        s.j(oVarH2);
                        return e5f.b.q(oVarH2);
                    case 15:
                        return e5f.b.z(aVar2.f125338a, (Retrofit) aVar2.k.get());
                    case 16:
                        return new sfk.a((ffk.t) aVar2.f125348q.get());
                    case 17:
                        return new pfk.x((PricingPlanCancelService) aVar2.A.get(), (j) aVar2.o.get());
                    case 18:
                        return e5f.b.v(aVar2.f125338a, (Retrofit) aVar2.k.get());
                    case 19:
                        return new ffk.h((ffk.t) aVar2.f125348q.get(), (dha.b) aVar2.D.get());
                    case 20:
                        return new pfk.s((j) aVar2.o.get(), (FamilyPlanService) aVar2.C.get(), aVar2.b(), new ifk.c(new qfk.a()));
                    case 21:
                        return e5f.b.k(aVar2.f125338a, (Retrofit) aVar2.k.get());
                    case 22:
                        ang.f fVarE = aVar2.f125341g.e();
                        mk0.a aVarA = aVar2.f125342h.a();
                        s.j(aVarA);
                        return new ffk.c0(fVarE, aVarA, (pfk.t0) aVar2.G.get());
                    case 23:
                        return new pfk.t0((StudentPlanService) aVar2.F.get());
                    case 24:
                        return e5f.b.C(aVar2.f125338a, (Retrofit) aVar2.k.get());
                    case 25:
                        dha.a aVar4 = (dha.a) aVar2.J.get();
                        gte.a aVarB = aVar2.i.b();
                        s.j(aVarB);
                        return new ffk.a(aVar4, aVarB);
                    case 26:
                        return new pfk.e((CreditPlansService) aVar2.I.get(), (j) aVar2.o.get(), aVar2.a());
                    case 27:
                        return e5f.b.i(aVar2.f125338a, (Retrofit) aVar2.k.get());
                    case 28:
                        return new tfk.a((CoroutineScope) aVar2.L.get(), (dha.c) aVar2.f125347p.get());
                    case 29:
                        return efk.e.a();
                    case 30:
                        return new ffk.e0((pfk.t0) aVar2.G.get(), aVar2.f125341g.e());
                    default:
                        throw new AssertionError(i3);
                }
            case 3:
                eg8.a aVar5 = (eg8.a) obj2;
                jd8.b bVar3 = aVar5.f125558n;
                ite.a aVar6 = aVar5.k;
                usg.a aVar7 = aVar5.f125554h;
                zd8.a aVar8 = aVar5.d;
                mj8.b bVar4 = aVar5.e;
                se8.a aVar9 = aVar5.f125552c;
                l78.a aVar10 = aVar5.f125557m;
                if (i3 != 0) {
                    if (i3 == 1) {
                        return efk.j.t(aVar5.f125551b);
                    }
                    if (i3 == 2) {
                        return new dg8.b();
                    }
                    throw new AssertionError(i3);
                }
                q58.b bVar5 = (q58.b) aVar5.f125550a.f319540r.get();
                s.j(bVar5);
                fg8.d dVar = new fg8.d(bVar5, (sri.m) aVar5.f125565x.get(), aVar9.c());
                ao.h hVarA = aVar8.a();
                zq.a aVarC = aVar8.c();
                hj8.a aVarA2 = bVar4.a();
                s.j(aVarA2);
                te8.e eVarA = aVar9.a();
                s.j(eVarA);
                hp8.b bVarA = aVar5.f.a();
                s.j(bVarA);
                xcd.a aVarA3 = aVar5.f125553g.a();
                s.j(aVarA3);
                wsg.n nVarB = aVar7.b();
                ic8.a aVar11 = (ic8.a) aVar5.i.f.get();
                s.j(aVar11);
                sri.m mVar2 = (sri.m) aVar5.f125565x.get();
                wk8.a aVar12 = (wk8.a) aVar5.f125555j.f289886j.get();
                s.j(aVar12);
                hj8.a aVarA4 = bVar4.a();
                s.j(aVarA4);
                wsg.n nVarB2 = aVar7.b();
                sri.m mVar3 = (sri.m) aVar5.f125565x.get();
                gte.a aVarB2 = aVar6.b();
                s.j(aVarB2);
                fg8.t0 t0Var = new fg8.t0(aVar12, aVarA4, nVarB2, mVar3, aVarB2, aVar5.f125556l.a(), aVar10.a());
                vc8.a aVar13 = (vc8.a) bVar3.f173012s.get();
                s.j(aVar13);
                fg8.g0 g0Var = new fg8.g0(aVar13, (sri.m) aVar5.f125565x.get(), aVar10.a());
                sri.m mVar4 = (sri.m) aVar5.f125565x.get();
                kd8.x xVar = (kd8.x) bVar3.v.get();
                s.j(xVar);
                te8.z zVarE = aVar9.e();
                s.j(zVarE);
                gte.a aVarB3 = aVar6.b();
                s.j(aVarB3);
                fg8.c0 c0Var = new fg8.c0(mVar4, xVar, zVarE, aVarB3);
                sri.m mVar5 = (sri.m) aVar5.f125565x.get();
                sg8.c cVar3 = aVar5.o;
                l0 l0Var = new l0(mVar5, cVar3.b(), new yg8.d(new t1j.b(cVar3.b()), new yg8.e(), cVar3.a()));
                sri.m mVar6 = (sri.m) aVar5.f125565x.get();
                hj8.a aVarA5 = bVar4.a();
                s.j(aVarA5);
                fg8.r rVar = new fg8.r(mVar6, aVarA5, aVar10.a());
                sri.m mVar7 = (sri.m) aVar5.f125565x.get();
                hj8.a aVarA6 = bVar4.a();
                s.j(aVarA6);
                fg8.m0 m0Var = new fg8.m0(mVar7, aVarA6, aVar5.f125559p.a(), aVar10.a());
                zjh.f fVar2 = new zjh.f((sri.m) aVar5.f125565x.get());
                d0 d0VarB = ((rb8.a) aVar5.f125560q).b();
                ang.f fVarE2 = aVar5.f125561r.e();
                sri.m mVar8 = (sri.m) aVar5.f125565x.get();
                te8.e eVarA2 = aVar9.a();
                s.j(eVarA2);
                fg8.q qVar = new fg8.q(d0VarB, fVarE2, mVar8, eVarA2, aVar10.a());
                sri.m mVar9 = (sri.m) aVar5.f125565x.get();
                om8.c cVarA = aVar5.f125562s.a();
                s.j(cVarA);
                mp.p pVar2 = new mp.p(mVar9, cVarA, aVar10.a());
                an8.b bVarA2 = aVar5.f125563t.a();
                s.j(bVarA2);
                te8.r rVarB = aVar9.b();
                s.j(rVarB);
                te8.v vVarD = aVar9.d();
                s.j(vVarD);
                fg8.h0 h0Var = new fg8.h0();
                kbb.c cVarF = aVar9.f();
                sri.m mVar10 = (sri.m) aVar5.f125565x.get();
                ic8.b bVarA3 = aVar5.u.a();
                s.j(bVarA3);
                return new fg8.m(dVar, hVarA, aVarC, aVarA2, eVarA, bVarA, aVarA3, nVarB, aVar11, mVar2, t0Var, g0Var, c0Var, l0Var, rVar, m0Var, fVar2, qVar, pVar2, bVarA2, rVarB, vVarD, h0Var, cVarF, new fg8.v(mVar10, bVarA3, aVar10.a()), ((ika.b) aVar5.v).b(), aVar5.f125564w.a(), aVar10.a());
            case 4:
                ej1.a aVar14 = (ej1.a) obj2;
                switch (i3) {
                    case 0:
                        cj1.k kVar = (cj1.k) aVar14.e.get();
                        cj1.c cVar4 = (cj1.c) aVar14.f126708g.get();
                        fk3.a aVarA7 = aVar14.f126706b.a();
                        s.j(aVarA7);
                        return new zi1.d(kVar, cVar4, aVarA7, aVar14.f126707c.e());
                    case 1:
                        return new cj1.k((AddressService) aVar14.d.get());
                    case 2:
                        Retrofit retrofit = ((c21.b) aVar14.f126705a).i();
                        s.j(retrofit);
                        fj1.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                        Object objCreate = retrofit.create(AddressService.class);
                        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                        AddressService addressService = (AddressService) objCreate;
                        s.k(addressService);
                        return addressService;
                    case 3:
                        return new cj1.c((AddressAutocompleteService) aVar14.f.get());
                    case 4:
                        Retrofit retrofit3 = ((c21.b) aVar14.f126705a).i();
                        s.j(retrofit3);
                        fj1.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(retrofit3, "retrofit");
                        Object objCreate2 = retrofit3.create(AddressAutocompleteService.class);
                        Intrinsics.checkNotNullExpressionValue(objCreate2, "create(...)");
                        AddressAutocompleteService addressAutocompleteService = (AddressAutocompleteService) objCreate2;
                        s.k(addressAutocompleteService);
                        return addressAutocompleteService;
                    case 5:
                        return new zi1.a((cj1.i) aVar14.f126711l.get());
                    case 6:
                        return new cj1.i((j) aVar14.i.get(), (MunicipalitiesService) aVar14.f126710j.get(), (AddressFieldSuggestionService) aVar14.k.get());
                    case 7:
                        return new ne0.d();
                    case 8:
                        Retrofit retrofit4 = ((c21.b) aVar14.f126705a).i();
                        s.j(retrofit4);
                        fj1.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(retrofit4, "retrofit");
                        Object objCreate3 = retrofit4.create(MunicipalitiesService.class);
                        Intrinsics.checkNotNullExpressionValue(objCreate3, "create(...)");
                        MunicipalitiesService municipalitiesService = (MunicipalitiesService) objCreate3;
                        s.k(municipalitiesService);
                        return municipalitiesService;
                    case 9:
                        Retrofit retrofitI2 = ((c21.b) aVar14.f126705a).i();
                        s.j(retrofitI2);
                        return f9f.b.h(retrofitI2);
                    default:
                        throw new AssertionError(i3);
                }
            case 5:
                ej7.a aVar15 = (ej7.a) obj2;
                c21.e eVar = aVar15.f126763b;
                ej7.d dVar2 = aVar15.f126762a;
                switch (i3) {
                    case 0:
                        return new kj7.o((InsuranceService) aVar15.f126767j.get(), new ne0.d(), aVar15.b());
                    case 1:
                        return efk.j.p(dVar2, (Retrofit) aVar15.i.get());
                    case 2:
                        Retrofit retrofitI3 = ((c21.b) eVar).i();
                        s.j(retrofitI3);
                        return efk.j.l(dVar2, retrofitI3, (o) aVar15.f126766h.get());
                    case 3:
                        o oVarH3 = ((c21.b) eVar).h();
                        s.j(oVarH3);
                        efk.j.k(dVar2, oVarH3);
                        return oVarH3;
                    case 4:
                        return new fj7.b((xi7.b) aVar15.k.get(), (xi7.a) aVar15.f126768l.get());
                    case 5:
                        return new kj7.j((InsuranceService) aVar15.f126767j.get(), new ne0.d(), aVar15.b());
                    case 6:
                        InsuranceService insuranceService = (InsuranceService) aVar15.f126767j.get();
                        ne0.d dVar3 = new ne0.d();
                        zk0.b bVarL = aVar15.e.l();
                        s.j(bVarL);
                        return new kj7.f(insuranceService, dVar3, bVarL);
                    case 7:
                        return new fj7.a((kj7.f) aVar15.f126770n.get());
                    case 8:
                        return new dj7.c();
                    default:
                        throw new AssertionError(i3);
                }
            case 6:
                ejg.b bVar6 = (ejg.b) obj2;
                ee0.a aVar16 = bVar6.f126884c;
                ejg.h hVar = bVar6.f126882a;
                switch (i3) {
                    case 0:
                        TrustedMerchantsService trustedMerchantsService = (TrustedMerchantsService) bVar6.k.get();
                        j jVar3 = (j) bVar6.f126888l.get();
                        ue0.c cVar5 = (ue0.c) bVar6.f126889m.get();
                        b80.c cVarP3 = bVar6.e.p();
                        s.j(cVarP3);
                        return new bjg.f(trustedMerchantsService, jVar3, cVar5, cVarP3);
                    case 1:
                        return efk.j.z(hVar, (Retrofit) bVar6.f126887j.get());
                    case 2:
                        return efk.j.m(hVar, ((nj0.d) bVar6.f126883b).f(), (o) bVar6.i.get());
                    case 3:
                        return efk.j.j(hVar, fe0.c.a());
                    case 4:
                        return new ne0.d();
                    case 5:
                        je0.d dVarB = aVar16.b();
                        s.j(dVarB);
                        yk0.a aVarB4 = bVar6.d.b();
                        s.j(aVarB4);
                        xe0.f fVarF = aVar16.f();
                        s.j(fVarF);
                        return efk.j.C(dVarB, fVarF, aVarB4);
                    case 6:
                        return new fjg.a();
                    case 7:
                        gte.a aVarB5 = bVar6.f.b();
                        s.j(aVarB5);
                        return new djg.b(aVarB5);
                    default:
                        throw new AssertionError(i3);
                }
            case 7:
                if (i3 != 0) {
                    if (i3 == 1) {
                        return new dji.c();
                    }
                    throw new AssertionError(i3);
                }
                jki.p stateMapper = (jki.p) ((eji.b) obj2).f126906a.get();
                Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
                return new dji.b(stateMapper);
            case 8:
                erj.h hVar2 = (erj.h) obj2;
                switch (i3) {
                    case 0:
                        je0.d dVarB2 = hVar2.f128691a.b();
                        s.j(dVarB2);
                        yk0.a aVarB6 = hVar2.f128692b.b();
                        s.j(aVarB6);
                        xe0.f fVarF2 = hVar2.f128691a.f();
                        s.j(fVarF2);
                        return efk.j.A(dVarB2, aVarB6, fVarF2);
                    case 1:
                        BudgetingService budgetingService = (BudgetingService) hVar2.f128705w.get();
                        BudgetingDatabase budgetingDatabase = (BudgetingDatabase) hVar2.f128706x.get();
                        b80.c cVarP4 = hVar2.e.p();
                        s.j(cVarP4);
                        return new krj.d(budgetingService, budgetingDatabase, cVarP4, new ne0.d());
                    case 2:
                        Retrofit retrofitI4 = ((c21.b) hVar2.f128693c).i();
                        s.j(retrofitI4);
                        return efk.j.c(retrofitI4);
                    case 3:
                        Context context2 = hVar2.d;
                        yk0.a aVarB7 = hVar2.f128692b.b();
                        s.j(aVarB7);
                        return efk.j.g(context2, aVarB7, ((c21.b) hVar2.f128693c).b());
                    case 4:
                        krj.d dVar4 = (krj.d) hVar2.f128707y.get();
                        wsg.n nVarB3 = hVar2.f.b();
                        ge3.e eVarD = hVar2.f128694g.d();
                        s.j(eVarD);
                        return new grj.i(dVar4, nVarB3, eVarD);
                    case 5:
                        ke3.e eVar2 = hVar2.f128694g;
                        ke3.e eVar3 = hVar2.f128694g;
                        le3.i iVar = (le3.i) eVar2.v.get();
                        s.j(iVar);
                        l5i.q qVarB = eVar3.b();
                        xua.a aVarA8 = hVar2.f128695h.a();
                        s.j(aVarA8);
                        pzi.b bVar7 = (pzi.b) hVar2.z.get();
                        grj.a aVar17 = (grj.a) hVar2.A.get();
                        tzi.a aVarA9 = hVar2.i.a();
                        s.j(aVarA9);
                        ang.f fVarE3 = hVar2.f128696j.e();
                        ge3.a aVarE = eVar3.e();
                        s.j(aVarE);
                        l80.e eVarH2 = hVar2.e.h();
                        s.j(eVarH2);
                        fVar = new grj.f(iVar, qVarB, aVarA8, bVar7, aVar17, aVarA9, fVarE3, aVarE, eVarH2);
                        break;
                    case 6:
                        return new grj.b();
                    case 7:
                        return new qrj.a();
                    case 8:
                        sri.m mVar11 = (sri.m) hVar2.C.get();
                        g48.r0 r0VarC = hVar2.k.c();
                        o38.a aVarC2 = hVar2.f128697l.c();
                        s.j(aVarC2);
                        fVar = new hrj.d(mVar11, r0VarC, aVarC2, (pzi.a) hVar2.B.get(), (pzi.b) hVar2.z.get());
                        break;
                    case 9:
                        return efk.j.v(hVar2.d);
                    case 10:
                        xua.a aVarA10 = hVar2.f128695h.a();
                        s.j(aVarA10);
                        pzi.b bVar8 = (pzi.b) hVar2.z.get();
                        tzi.a aVarA11 = hVar2.i.a();
                        s.j(aVarA11);
                        ge3.e eVarD2 = hVar2.f128694g.d();
                        s.j(eVarD2);
                        return new grj.k(aVarA10, bVar8, aVarA11, eVarD2);
                    case 11:
                        ke3.e eVar4 = hVar2.f128694g;
                        ke3.e eVar5 = hVar2.f128694g;
                        ge3.e eVarD3 = eVar4.d();
                        s.j(eVarD3);
                        ang.f fVarE4 = hVar2.f128696j.e();
                        ge3.a aVarE2 = eVar5.e();
                        s.j(aVarE2);
                        return new mrj.c(eVarD3, fVarE4, aVarE2, eVar5.b());
                    default:
                        throw new AssertionError(i3);
                }
                return fVar;
            case 9:
                es8.a aVar18 = (es8.a) obj2;
                if (i3 == 0) {
                    return new is8.a((JuniorWalletService) aVar18.f128906h.get());
                }
                if (i3 == 1) {
                    return efk.j.s(aVar18.f128902a, ((nj0.d) aVar18.f128903b).f());
                }
                throw new AssertionError(i3);
            case 10:
                euh.d dVar5 = (euh.d) obj2;
                ee0.a aVar19 = dVar5.f129573a;
                switch (i3) {
                    case 0:
                        return new nuh.l();
                    case 1:
                        je0.d dVarB3 = aVar19.b();
                        s.j(dVarB3);
                        yk0.a aVarB8 = dVar5.f129574b.b();
                        s.j(aVarB8);
                        xe0.f fVarF3 = aVar19.f();
                        s.j(fVarF3);
                        return fp8.c.y(dVarB3, aVarB8, fVarF3);
                    case 2:
                        atb.a aVarA12 = dVar5.d.a();
                        s.j(aVarA12);
                        return new huh.m(aVarA12, (cuh.b) dVar5.f129581n.get());
                    case 3:
                        return new cuh.b((auh.a) dVar5.k.get(), (RfiScreeningService) dVar5.f129579l.get(), (j) dVar5.f129580m.get(), (ue0.c) dVar5.f129578j.get());
                    case 4:
                        qil.b bVar9 = (qil.b) dVar5.e.k.get();
                        s.j(bVar9);
                        return new auh.b(bVar9);
                    case 5:
                        return fp8.c.D(dVar5.f);
                    case 6:
                        return fuh.c.a();
                    default:
                        throw new AssertionError(i3);
                }
            case 11:
                return a();
            case 12:
                ex7.a aVar20 = (ex7.a) obj2;
                switch (i3) {
                    case 0:
                        je0.d dVarB4 = aVar20.f130357a.b();
                        s.j(dVarB4);
                        yk0.a aVarB9 = aVar20.f130358b.b();
                        s.j(aVarB9);
                        xe0.f fVarF4 = aVar20.f130357a.f();
                        s.j(fVarF4);
                        return w.r(dVarB4, fVarF4, aVarB9);
                    case 1:
                        je0.d dVarB5 = aVar20.f130357a.b();
                        s.j(dVarB5);
                        yk0.a aVarB10 = aVar20.f130358b.b();
                        s.j(aVarB10);
                        xe0.f fVarF5 = aVar20.f130357a.f();
                        s.j(fVarF5);
                        return w.p(dVarB5, fVarF5, aVarB10);
                    case 2:
                        je0.d dVarB6 = aVar20.f130357a.b();
                        s.j(dVarB6);
                        yk0.a aVarB11 = aVar20.f130358b.b();
                        s.j(aVarB11);
                        xe0.f fVarF6 = aVar20.f130357a.f();
                        s.j(fVarF6);
                        return w.k(dVarB6, fVarF6, aVarB11);
                    case 3:
                        je0.d dVarB7 = aVar20.f130357a.b();
                        s.j(dVarB7);
                        yk0.a aVarB12 = aVar20.f130358b.b();
                        s.j(aVarB12);
                        xe0.f fVarF7 = aVar20.f130357a.f();
                        s.j(fVarF7);
                        return w.t(dVarB7, fVarF7, aVarB12);
                    case 4:
                        je0.d dVarB8 = aVar20.f130357a.b();
                        s.j(dVarB8);
                        yk0.a aVarB13 = aVar20.f130358b.b();
                        s.j(aVarB13);
                        xe0.f fVarF8 = aVar20.f130357a.f();
                        s.j(fVarF8);
                        return w.v(dVarB8, fVarF8, aVarB13);
                    case 5:
                        kx7.l0 l0Var2 = (kx7.l0) aVar20.f130368r.get();
                        ij0.a aVar21 = ((nj0.d) aVar20.f).f216295c;
                        r80.c cVar6 = (r80.c) aVar20.e.Z.get();
                        s.j(cVar6);
                        return new fx7.f(l0Var2, aVar21, cVar6);
                    case 6:
                        return new y0((PetService) aVar20.f130367q.get(), (ue0.c) aVar20.f130362j.get(), new ne0.d(), new i90.b());
                    case 7:
                        return w.q(aVar20.f130359c, (Retrofit) aVar20.f130366p.get());
                    case 8:
                        ex7.e eVar6 = aVar20.f130359c;
                        Retrofit retrofitI5 = ((c21.b) aVar20.d).i();
                        s.j(retrofitI5);
                        return w.i(eVar6, retrofitI5, (o) aVar20.o.get());
                    case 9:
                        ex7.e eVar7 = aVar20.f130359c;
                        o oVarH4 = ((c21.b) aVar20.d).h();
                        s.j(oVarH4);
                        w.h(eVar7, oVarH4);
                        return oVarH4;
                    case 10:
                        return new fx7.j((kx7.g) aVar20.f130370t.get());
                    case 11:
                        return new kx7.m((PetService) aVar20.f130367q.get(), (ue0.c) aVar20.f130364m.get(), new ne0.d());
                    case 12:
                        return new fx7.l((kx7.l0) aVar20.f130368r.get(), (kx7.c0) aVar20.v.get(), (kx7.k0) aVar20.f130371w.get());
                    case 13:
                        return new kx7.h0((PetService) aVar20.f130367q.get(), new ne0.d(), new i90.b());
                    case 14:
                        return new kx7.k0((PetService) aVar20.f130367q.get(), new i90.b());
                    case 15:
                        kx7.a aVar22 = (kx7.a) aVar20.f130373y.get();
                        gte.a aVarB14 = aVar20.f130360g.b();
                        s.j(aVarB14);
                        return new fx7.i(aVar22, aVarB14);
                    case 16:
                        return new kx7.f((PetService) aVar20.f130367q.get(), (ue0.c) aVar20.k.get(), new ne0.d());
                    case 17:
                        return new fx7.g((kx7.n) aVar20.A.get());
                    case 18:
                        return new kx7.w((PetService) aVar20.f130367q.get(), (ue0.c) aVar20.f130363l.get(), new ne0.d());
                    case 19:
                        return new fx7.m((kx7.i0) aVar20.C.get(), (kx7.a) aVar20.f130373y.get());
                    case 20:
                        return new kx7.i0((PetService) aVar20.f130367q.get());
                    case 21:
                        return new fx7.a();
                    case 22:
                        sri.m mVar12 = (sri.m) aVar20.F.get();
                        kw7.c cVar7 = (kw7.c) aVar20.i.k.get();
                        s.j(cVar7);
                        return new dx7.b(mVar12, cVar7);
                    case 23:
                        return w.n(aVar20.f130361h);
                    case 24:
                        return new fx7.k((kx7.b0) aVar20.H.get());
                    case 25:
                        return new kx7.b0((PetService) aVar20.f130367q.get(), (ue0.c) aVar20.f130365n.get(), new ne0.d());
                    default:
                        throw new AssertionError(i3);
                }
            case 13:
                return b();
            case 14:
                return c();
            case 15:
                return d();
            case 16:
                return e();
            case 17:
                return f();
            case 18:
                fa0.k kVar2 = (fa0.k) obj2;
                if (i3 != 0) {
                    if (i3 == 1) {
                        return new oa0.h(new aa0.d0());
                    }
                    throw new AssertionError(i3);
                }
                ra0.h hVarA2 = kVar2.f133101a.a();
                s.j(hVarA2);
                return new ea0.c(hVarA2, (oa0.e) kVar2.k.get());
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
                fw2.d dVar6 = (fw2.d) obj2;
                if (i3 == 0) {
                    tg1.a aVarA13 = dVar6.f138522a.a();
                    s.j(aVarA13);
                    return new gw2.c(aVarA13);
                }
                if (i3 == 1) {
                    return new mw2.a(new com.revolut.feature.card_add_to_googlepay.impl.credit_activation.a(new hw2.a()));
                }
                if (i3 != 2) {
                    if (i3 == 3) {
                        return fp8.c.v(dVar6.f138523b);
                    }
                    throw new AssertionError(i3);
                }
                sri.m mVar13 = (sri.m) dVar6.f138532q.get();
                l93.f fVarJ2 = dVar6.f138524c.j();
                s.j(fVarJ2);
                gte.a aVarB15 = dVar6.d.b();
                s.j(aVarB15);
                return new mw2.e(mVar13, fVarJ2, aVarB15);
        }
    }
}
