package pa6;

import afj.y3;
import ahf.e0;
import android.app.Activity;
import android.content.Context;
import b9.w2;
import ch.qos.logback.core.rolling.SizeBasedTriggeringPolicy;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.donations.impl.domain.model.CharityTransactionsParams;
import com.revolut.feature.donations.impl.ui.kompot.bottomsheet.donatewithpoints.DonateWithPointsContract$InputData;
import com.revolut.feature.donations.impl.ui.kompot.screen.recurring.amount.RecurringDonationAmountScreenContract$InputData;
import com.revolut.feature.donations.impl.ui.kompot.screen.recurring.schedule.RecurringDonationScheduleScreenContract$InputData;
import com.revolut.feature.donations.impl.ui.kompot.screen.transactions.CharityTransactionsContract$InputData;
import com.revolut.feature.donations.impl.ui.mapper.DonateSuccessStatusDialogMapper;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.flow.AnalyticsDashboardFlowContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.category_management.list.CategoryManagementListContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.group_details.GroupDetailsScreenContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.execution.IncomeSorterExecutionContract$InputData;
import com.revolut.feature.transaction_list.impl.ui.list.flow.TransactionListFlowContract$InputData;
import com.revolut.feature.transaction_list.impl.ui.simple_transactions.SimpleTransactionsScreenContract$InputData;
import com.revolut.feature.transactions.api.navigation.ScheduledPaymentsInputData;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import com.revolut.retail.feature.plan_gifting.impl.ui.flows.receiver.PlanGiftingReceiverFlowContract$InputData;
import com.revolut.retail.feature.plan_gifting.impl.ui.screens.receiver.intro.PlanGiftingReceiverIntroScreenContract$InputData;
import com.revolut.retail.feature.plan_gifting.impl.ui.screens.sender.confirmation.PlanGiftingSendConfirmationScreenContract$InputData;
import g48.r0;
import java.util.Collection;
import java.util.Optional;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import lnd.k0;
import lp.l9;
import ppd.h0;
import qgk.g3;
import qgk.k3;
import rnd.v0;
import rnd.w0;
import rp0.g1;
import rp0.x0;
import t80.e;
import urd.g0;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f234364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f234365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f234366c;
    public final Object d;

    public /* synthetic */ f(Object obj2, Object obj3, int i, int i2) {
        this.f234364a = i2;
        this.f234365b = obj2;
        this.d = obj3;
        this.f234366c = i;
    }

    private final Object a() {
        pma.b bVar = (pma.b) this.f234365b;
        pma.a aVar = (pma.a) this.d;
        int i = this.f234366c;
        switch (i) {
            case 0:
                return new xpi.c(aVar.f237492b, bq.i.b(aVar.f237491a));
            case 1:
                return kpi.f.a();
            case 2:
                ypi.h hVar = aVar.f237493c;
                fsi.g gVar = aVar.f237491a;
                return new ypi.e(hVar, bq.i.b(gVar), bq.i.o(gVar), bq.i.g(gVar));
            case 3:
                Context contextI = bq.i.i(aVar.f237491a);
                BaseDelegatesActivity baseDelegatesActivityF = bq.i.f(aVar.f237491a);
                t70.g gVarO = bVar.f237509b.o();
                vc.s.j(gVarO);
                return new npi.c(contextI, baseDelegatesActivityF, gVarO);
            case 4:
                return new tpi.i((rpi.c) aVar.i.get(), gsi.c.a(aVar.f237491a));
            case 5:
                return new rpi.b(bq.i.b(aVar.f237491a));
            case 6:
                return new rpi.h(bq.i.b(aVar.f237491a));
            case 7:
                return new iri.g((iri.j) bVar.i.get(), (iri.m) bVar.f237513j.get(), bq.i.f(aVar.f237491a), bq.i.l(aVar.f237491a));
            case 8:
                return new iri.l((iri.m) bVar.f237513j.get(), bq.i.f(aVar.f237491a), (iri.d) aVar.f237498m.get());
            case 9:
                return new iri.d(bq.i.f(aVar.f237491a));
            case 10:
                return new opi.b(bq.i.f(aVar.f237491a));
            case 11:
                aVar.getClass();
                return new cn.d(ImmutableSet.copyOf((Collection) dn.b.a()), (cn.e) bVar.k.get(), bVar.b());
            case 12:
                um.c cVar = (um.c) bVar.f237514l.get();
                aVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(5);
                pma.b bVar2 = aVar.d;
                hn.h hVar2 = (hn.h) bVar2.f237515m.get();
                t70.g gVarO2 = bVar2.f237509b.o();
                vc.s.j(gVarO2);
                builderBuilderWithExpectedSize.add(new jn.a(hVar2, gVarO2));
                builderBuilderWithExpectedSize.add(new vm.b(com.google.android.gms.internal.mlkit_vision_face.a.f()));
                builderBuilderWithExpectedSize.add(bVar2.c());
                builderBuilderWithExpectedSize.addAll((Iterable) in.g.a());
                builderBuilderWithExpectedSize.add(new jn.d(e4m.b.a(aVar.f237501q)));
                return new in.e(cVar, builderBuilderWithExpectedSize.build(), bVar.b());
            case 13:
                return bq.i.t(aVar.f237491a);
            case 14:
                aVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize2 = ImmutableSet.builderWithExpectedSize(3);
                builderBuilderWithExpectedSize2.addAll((Iterable) kn.g.a());
                builderBuilderWithExpectedSize2.add(aVar.f237503s.get());
                builderBuilderWithExpectedSize2.add(new kn.h(e4m.b.a(aVar.f237496j)));
                return new kn.e(builderBuilderWithExpectedSize2.build(), (ym.d) bVar.o.get(), bVar.b());
            case 15:
                return new zm.a();
            case 16:
                aVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize3 = ImmutableSet.builderWithExpectedSize(2);
                builderBuilderWithExpectedSize3.addAll((Iterable) hn.g.a());
                builderBuilderWithExpectedSize3.add(aVar.d.c());
                return new hn.d(builderBuilderWithExpectedSize3.build(), (hn.h) bVar.f237515m.get(), (npi.f) aVar.f237495h.get());
            case 17:
                return new en.c(ImmutableSet.of((ln.d) aVar.d.f237516n.get()), bq.i.l(aVar.f237491a));
            case 18:
                return new gn.c((lpi.e) aVar.f237505w.get(), (sm.e) bVar.f237518q.get(), ImmutableSet.copyOf((Collection) gn.e.a()), bVar.b());
            case 19:
                return new lpi.b(bq.i.i(aVar.f237491a), bq.i.j(aVar.f237491a));
            case 20:
                aVar.getClass();
                return new in.e(ImmutableSet.copyOf((Collection) pm.b.a()), (om.c) bVar.f237519r.get(), bVar.b());
            case 21:
                return new k3l.d(bq.i.b(aVar.f237491a));
            case 22:
                aVar.getClass();
                return new g3l.c(ImmutableSet.copyOf((Collection) g3l.f.a()), (g3l.g) bVar.f237520s.get(), (k3l.b) aVar.z.get(), bVar.b());
            case 23:
                return new r3l.c((g1) aVar.B.get());
            case 24:
                return l9.k(bq.i.b(aVar.f237491a));
            case 25:
                return new wm.l((opi.d) aVar.o.get(), (wm.a) bVar.f237521t.get(), ImmutableSet.copyOf((Collection) xm.b.a()), bVar.b());
            case 26:
                vla.d dVar = (vla.d) ((zla.a) bVar.f237510c).f323207h.get();
                vc.s.j(dVar);
                e4m.e eVar = aVar.e;
                fsi.g gVar2 = aVar.f237491a;
                xpi.g gVar3 = (xpi.g) eVar.get();
                oma.c cVar2 = (oma.c) aVar.E.get();
                tri.c cVarE = bq.i.e(gVar2);
                ypi.i iVar = (ypi.i) aVar.f237494g.get();
                f9b.f fVar = (f9b.f) aVar.f237501q.get();
                oma.g gVar4 = (oma.g) bVar.u.get();
                bma.b bVar3 = (bma.b) ((zla.a) bVar.f237510c).f.get();
                vc.s.j(bVar3);
                oma.q qVar = new oma.q(dVar, gVar3, cVar2, cVarE, iVar, fVar, gVar4, bVar3, (k3l.b) aVar.z.get(), (r3l.a) aVar.C.get(), (tpi.j) aVar.f237496j.get(), (kpi.c) aVar.f.get());
                kli.a.p(qVar, bq.i.d(gVar2));
                return qVar;
            case 27:
                e4m.e eVar2 = bVar.f237516n;
                ula.a aVar2 = bVar.f237510c;
                ln.a aVar3 = (ln.a) eVar2.get();
                tla.d dVarB = bVar.d.b();
                vc.s.j(dVarB);
                xla.a aVar4 = (xla.a) ((zla.a) aVar2).f323208j.get();
                vc.s.j(aVar4);
                wm.e eVar3 = (wm.e) bVar.f237521t.get();
                vla.b bVar4 = (vla.b) ((zla.a) aVar2).i.get();
                vc.s.j(bVar4);
                return new oma.s(aVar3, dVarB, aVar4, eVar3, bVar4);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object b() {
        poa.b bVar = (poa.b) this.f234365b;
        poa.a aVar = (poa.a) this.d;
        xoi.d dVar = aVar.f237946a;
        int i = this.f234366c;
        if (i == 0) {
            return new h7a.d(aVar.f237947b, bq.i.f(dVar));
        }
        if (i == 1) {
            return new iri.g((iri.j) bVar.e.get(), new iri.b(), bq.i.f(dVar), bq.i.l(dVar));
        }
        if (i == 2) {
            return new iri.l(new iri.b(), bq.i.f(dVar), (iri.d) aVar.f.get());
        }
        if (i == 3) {
            return new iri.d(bq.i.f(dVar));
        }
        if (i == 4) {
            return new j7a.k((j7a.d) bVar.f237955h.get(), aVar.f237948c, (h7a.b) aVar.d.get(), bq.i.l(dVar));
        }
        throw new AssertionError(i);
    }

    private final Object c() {
        ppd.f fVar = (ppd.f) this.d;
        ppd.n nVar = fVar.f238405b;
        ppd.n nVar2 = (ppd.n) this.f234365b;
        izi.a aVar = nVar2.f238484b;
        int i = this.f234366c;
        if (i == 0) {
            ffk.t tVarF = nVar2.D.f();
            vc.s.j(tVarF);
            tsj.g gVarE = ((dqj.r) aVar).e();
            vc.s.j(gVarE);
            jla.h hVarA = nVar2.f238487d0.a();
            egk.e eVarE = nVar2.A.e();
            vc.s.j(eVarE);
            return new com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.common.a(tVarF, gVarE, hVarA, eVarE);
        }
        if (i != 1) {
            throw new AssertionError(i);
        }
        grd.b bVar = fVar.f238404a;
        n8b.a aVarA = nVar.o.a();
        vc.s.j(aVarA);
        ird.b bVar2 = new ird.b(aVarA);
        fk3.a aVarA2 = nVar.K0.a();
        vc.s.j(aVarA2);
        ird.e eVar = new ird.e(aVarA2);
        tsj.g gVarE2 = ((dqj.r) aVar).e();
        vc.s.j(gVarE2);
        com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.common.a aVar2 = (com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.common.a) fVar.f238406c.get();
        w80.b bVarB = fVar.b();
        i90.b bVar3 = new i90.b();
        ang.f fVarE = nVar2.i.e();
        wli.x xVarD = ((s41.a) nVar2.q0).d();
        grd.b bVar4 = fVar.f238404a;
        rrd.b bVar5 = new rrd.b();
        rrd.g gVar = new rrd.g();
        w80.b bVarB2 = fVar.b();
        izi.a aVar3 = nVar.f238484b;
        tsj.g gVarE3 = ((dqj.r) aVar3).e();
        vc.s.j(gVarE3);
        rrd.q qVar = new rrd.q(gVarE3);
        tsj.g gVarE4 = ((dqj.r) aVar3).e();
        vc.s.j(gVarE4);
        return new com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_edit_asset.d(bVar, bVar2, eVar, gVarE2, aVar2, bVarB, bVar3, fVarE, xVarD, new com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_edit_asset.e(bVar4, bVar5, gVar, bVarB2, qVar, gVarE4), (dtd.a) nVar2.S0.get());
    }

    private final Object d() {
        ppd.n nVar = (ppd.n) this.f234365b;
        izi.a aVar = nVar.f238484b;
        int i = this.f234366c;
        if (i == 0) {
            y91.b bVarA = nVar.f0.a();
            tsj.g gVarE = ((dqj.r) aVar).e();
            vc.s.j(gVarE);
            return new com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_new_options.a(bVarA, gVarE, (cli.n) ((ppd.g) this.d).f238413a.get());
        }
        if (i != 1) {
            throw new AssertionError(i);
        }
        tsj.g gVarE2 = ((dqj.r) aVar).e();
        vc.s.j(gVarE2);
        return new lrd.i(gVarE2);
    }

    private final Object e() {
        int i = this.f234366c;
        if (i == 0) {
            tsj.g gVarE = ((dqj.r) ((ppd.n) this.f234365b).f238484b).e();
            vc.s.j(gVarE);
            return new nrd.h(gVarE, (cli.n) ((ppd.h) this.d).f238421a.get());
        }
        if (i != 1) {
            throw new AssertionError(i);
        }
        rrd.b categoryMapper = new rrd.b();
        Intrinsics.checkNotNullParameter(categoryMapper, "categoryMapper");
        return new nrd.j();
    }

    private final Object f() {
        ppd.l lVar = (ppd.l) this.d;
        ppd.n nVar = (ppd.n) this.f234365b;
        usg.a aVar = nVar.f;
        l70.e eVar = nVar.d;
        ite.a aVar2 = nVar.f238482a;
        izi.a aVar3 = nVar.f238484b;
        int i = this.f234366c;
        if (i == 0) {
            jzi.a aVarD = ((dqj.r) aVar3).d();
            vc.s.j(aVarD);
            l80.e eVarH = eVar.h();
            vc.s.j(eVarH);
            return new jnd.t(aVarD, eVarH, (CoroutineScope) lVar.d.get());
        }
        if (i == 1) {
            eod.a.Companion.getClass();
            return jh.d.a(kotlin.coroutines.g.f186406a);
        }
        if (i == 2) {
            AnalyticsDashboardFlowContract$InputData analyticsDashboardFlowContract$InputData = lVar.f238465a;
            mjb.a aVarA = ((anb.n) nVar.X).a();
            vc.s.j(aVarA);
            kge.d dVarQ = lVar.q();
            gte.a aVarB = aVar2.b();
            vc.s.j(aVarB);
            return new com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.flow.b(analyticsDashboardFlowContract$InputData, aVarA, dVarQ, aVarB, nVar.f238489g.i(), aVar.b());
        }
        if (i != 3) {
            if (i == 4) {
                jnd.t tVar = (jnd.t) lVar.e.get();
                gte.a aVarB2 = aVar2.b();
                vc.s.j(aVarB2);
                return new jnd.h(tVar, aVarB2);
            }
            if (i != 5) {
                throw new AssertionError(i);
            }
            eqj.d dVarA = ((dqj.r) aVar3).a();
            vc.s.j(dVarA);
            kzi.a aVarB3 = ((dqj.r) aVar3).b();
            vc.s.j(aVarB3);
            l80.e eVarH2 = eVar.h();
            vc.s.j(eVarH2);
            return new xnd.j(dVarA, aVarB3, eVarH2);
        }
        wsg.n nVarB = aVar.b();
        al4.n nVarS = nVar.Z.s();
        vc.s.j(nVarS);
        r0 r0VarC = nVar.f238494l.c();
        gr6.a aVarA2 = nVar.f238483a0.a();
        vc.s.j(aVarA2);
        cge.h hVarA = nVar.f238503s.a();
        v0 v0VarS = lVar.s();
        ppd.n nVar2 = lVar.f238466b;
        gte.a aVarB4 = nVar2.f238482a.b();
        vc.s.j(aVarB4);
        hj8.a aVarA3 = nVar2.f238485b0.a();
        vc.s.j(aVarA3);
        rnd.c0 c0Var = new rnd.c0(aVarB4, aVarA3, nVar2.f.a(), nVar2.f238488e0.i());
        y91.b bVarA = nVar.f0.a();
        ge3.a aVarE = nVar.f238486c.e();
        vc.s.j(aVarE);
        rnd.i iVarJ = lVar.j();
        wa7.m mVarI = nVar.f238488e0.i();
        w0 w0Var = new w0();
        gte.a aVarB5 = aVar2.b();
        vc.s.j(aVarB5);
        return new rnd.y(nVarB, nVarS, r0VarC, aVarA2, hVarA, v0VarS, c0Var, bVarA, aVarE, iVarJ, mVarI, w0Var, aVarB5);
    }

    private final Object g() {
        ppd.n nVar = (ppd.n) this.f234365b;
        ppd.s sVar = (ppd.s) this.d;
        int i = this.f234366c;
        switch (i) {
            case 0:
                return kxa.j.k((j60.a) sVar.d.get());
            case 1:
                return ehe.n.s((com.revolut.kompot.navigable.a) sVar.f238539b.get(), (rp0.m) sVar.f238540c.get());
            case 2:
                return new rp0.m();
            case 3:
                j60.a aVar = (j60.a) sVar.d.get();
                ge3.e eVarD = nVar.f238486c.d();
                vc.s.j(eVarD);
                g1 g1Var = (g1) sVar.f.get();
                pe0.q qVar = (pe0.q) nVar.u.f125057q.get();
                vc.s.j(qVar);
                com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) nVar.v).c();
                vc.s.j(aVarC);
                return new dpd.k(aVar, eVarD, g1Var, qVar, aVarC);
            case 4:
                com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) sVar.f238539b.get();
                fpd.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller, "controller");
                return x0.a(g1.Companion, controller.D2());
            case 5:
                return new com.revolut.feature.spending_analytics.impl.ui.rev10.category_management.custom.b((cli.n) sVar.f238542h.get(), sVar.f238538a, (dpd.k) sVar.f238541g.get());
            case 6:
                thf.c transactionCategoryResourcesMapper = nVar.f238490h.c();
                vc.s.j(transactionCategoryResourcesMapper);
                Intrinsics.checkNotNullParameter(transactionCategoryResourcesMapper, "transactionCategoryResourcesMapper");
                return new epd.o();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object h() {
        ppd.n nVar = (ppd.n) this.f234365b;
        ke3.e eVar = nVar.f238486c;
        ppd.t tVar = (ppd.t) this.d;
        int i = this.f234366c;
        switch (i) {
            case 0:
                return kxa.j.k((j60.a) tVar.d.get());
            case 1:
                return ehe.n.s((com.revolut.kompot.navigable.a) tVar.f238547b.get(), (rp0.m) tVar.f238548c.get());
            case 2:
                return new rp0.m();
            case 3:
                j60.a aVar = (j60.a) tVar.d.get();
                ge3.e eVarD = eVar.d();
                vc.s.j(eVarD);
                g1 g1Var = (g1) tVar.f.get();
                pe0.q qVar = (pe0.q) nVar.u.f125057q.get();
                vc.s.j(qVar);
                com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) nVar.v).c();
                vc.s.j(aVarC);
                return new dpd.k(aVar, eVarD, g1Var, qVar, aVarC);
            case 4:
                com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) tVar.f238547b.get();
                hpd.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller, "controller");
                return x0.a(g1.Companion, controller.D2());
            case 5:
                cli.n nVar2 = (cli.n) tVar.f238550h.get();
                CategoryManagementListContract$InputData categoryManagementListContract$InputData = tVar.f238546a;
                ge3.e eVarD2 = eVar.d();
                vc.s.j(eVarD2);
                return new com.revolut.feature.spending_analytics.impl.ui.rev10.category_management.list.b(nVar2, categoryManagementListContract$InputData, eVarD2, (dpd.k) tVar.f238549g.get());
            case 6:
                thf.c cVarC = nVar.f238490h.c();
                vc.s.j(cVarC);
                return new gpd.n(cVarC);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object i() {
        ppd.w wVar = (ppd.w) this.d;
        ppd.n nVar = (ppd.n) this.f234365b;
        izi.a aVar = nVar.f238484b;
        int i = this.f234366c;
        if (i == 0) {
            ffk.t tVarF = nVar.D.f();
            vc.s.j(tVarF);
            tsj.g gVarE = ((dqj.r) aVar).e();
            vc.s.j(gVarE);
            jla.h hVarA = nVar.f238487d0.a();
            egk.e eVarE = nVar.A.e();
            vc.s.j(eVarE);
            return new com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.common.a(tVarF, gVarE, hVarA, eVarE);
        }
        if (i != 1) {
            throw new AssertionError(i);
        }
        urd.c cVar = wVar.f238565a;
        tsj.g gVarE2 = ((dqj.r) aVar).e();
        vc.s.j(gVarE2);
        com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.common.a aVar2 = (com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.common.a) wVar.f238567c.get();
        wli.x xVarD = ((s41.a) nVar.q0).d();
        bsd.e eVar = new bsd.e();
        ppd.n nVar2 = wVar.f238566b;
        l70.e eVar2 = nVar2.d;
        izi.a aVar3 = nVar2.f238484b;
        ite.a aVar4 = nVar2.f238482a;
        l80.e eVarH = eVar2.h();
        vc.s.j(eVarH);
        rrd.r rVar = new rrd.r();
        gte.a aVarB = aVar4.b();
        vc.s.j(aVarB);
        bsd.h hVar = new bsd.h(eVar, eVarH, rVar, aVarB);
        bsd.e eVar3 = new bsd.e();
        rrd.f fVar = new rrd.f();
        rrd.g gVar = new rrd.g();
        l80.e eVarH2 = eVar2.h();
        vc.s.j(eVarH2);
        dqj.r rVar2 = (dqj.r) aVar3;
        tsj.g gVarE3 = rVar2.e();
        vc.s.j(gVarE3);
        rrd.q qVar = new rrd.q(gVarE3);
        mzi.b bVarF = rVar2.f();
        vc.s.j(bVarF);
        k0 k0Var = new k0(bVarF);
        rrd.r rVar3 = new rrd.r();
        rrd.k kVar = new rrd.k();
        gte.a aVarB2 = aVar4.b();
        vc.s.j(aVarB2);
        return new urd.x(cVar, gVarE2, aVar2, xVarD, new g0(hVar, eVar3, fVar, gVar, eVarH2, qVar, k0Var, rVar3, kVar, aVarB2));
    }

    private final Object j() {
        ppd.c0 c0Var = (ppd.c0) this.d;
        ppd.n nVar = c0Var.f238383b;
        ppd.n nVar2 = (ppd.n) this.f234365b;
        ke3.e eVar = nVar2.f238486c;
        int i = this.f234366c;
        if (i == 0) {
            l5i.q qVarB = eVar.b();
            GroupDetailsScreenContract$InputData groupDetailsScreenContract$InputData = c0Var.f238382a;
            gte.a aVarB = nVar2.f238482a.b();
            vc.s.j(aVarB);
            return new com.revolut.feature.spending_analytics.impl.ui.rev10.group_details.a(qVarB, groupDetailsScreenContract$InputData, aVarB, eVar.c(), nVar2.k.a(), new gmd.d(nVar.f238494l.c(), nVar.i.e()), (cli.n) c0Var.f238384c.get());
        }
        if (i != 1) {
            throw new AssertionError(i);
        }
        thf.l lVarF = nVar.f238490h.f();
        vc.s.j(lVarF);
        qpd.s sVar = new qpd.s(lVarF, new j9l.a());
        cmd.a aVarG = nVar2.f238489g.g();
        vc.s.j(aVarG);
        mzi.b bVarF = ((dqj.r) nVar2.f238484b).f();
        vc.s.j(bVarF);
        return new com.revolut.feature.spending_analytics.impl.ui.rev10.group_details.b(sVar, aVarG, bVarF, c0Var.f238382a);
    }

    private final Object k() {
        ppd.g0 g0Var = (ppd.g0) this.d;
        u8h.c cVar = ((ppd.n) this.f234365b).V;
        int i = this.f234366c;
        if (i == 0) {
            return kii.e.j((u8h.b) cVar, "factory");
        }
        if (i == 1) {
            return new eqd.g(new eqd.i((d1h.h) g0Var.e.get()), g0Var.f238416b, (d1h.e) g0Var.d.get());
        }
        if (i == 2) {
            return kii.e.k((u8h.b) cVar);
        }
        throw new AssertionError(i);
    }

    @Override // phm.a
    public final Object get() {
        Object xVar;
        int i = this.f234364a;
        int i2 = this.f234366c;
        Object obj2 = this.f234365b;
        Object obj3 = this.d;
        switch (i) {
            case 0:
                g gVar = (g) obj3;
                if (i2 == 0) {
                    ua6.a aVar = new ua6.a();
                    sa6.i iVar = (sa6.i) gVar.f234369c.get();
                    m mVar = gVar.f234368b;
                    thf.g gVarE = mVar.f234402w.e();
                    vc.s.j(gVarE);
                    fub.k kVarD = mVar.f234403x.d();
                    vc.s.j(kVarD);
                    return new qc6.j(aVar, iVar, new qc6.i(new sc6.a(gVarE, kVarD)));
                }
                if (i2 != 1) {
                    throw new AssertionError(i2);
                }
                sa6.h charityTransactionsInteractor = (sa6.h) ((m) obj2).f234389d0.get();
                CharityTransactionsContract$InputData inputData = gVar.f234367a;
                rc6.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(charityTransactionsInteractor, "charityTransactionsInteractor");
                Intrinsics.checkNotNullParameter(inputData, "inputData");
                CharityTransactionsParams charityTransactionsParams = inputData.f72111a;
                ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
                efm.c0 c0Var = hhm.f.f152429a;
                wfm.j jVar = new wfm.j(executorServiceNewSingleThreadExecutor);
                Intrinsics.checkNotNullExpressionValue(jVar, "from(...)");
                return new sa6.i(charityTransactionsInteractor, charityTransactionsParams, jVar);
            case 1:
                h hVar = (h) obj3;
                if (i2 == 0) {
                    return new xb6.h((jki.p) hVar.f234371b.get(), (sa6.b) ((m) obj2).c0.get(), hVar.f234370a);
                }
                if (i2 == 1) {
                    return new xb6.i();
                }
                throw new AssertionError(i2);
            case 2:
                m mVar2 = (m) obj2;
                y96.f fVar = mVar2.f234384a;
                i iVar2 = (i) obj3;
                m mVar3 = iVar2.f234373a;
                if (i2 == 0) {
                    return kxa.j.l((j60.a) iVar2.d.get());
                }
                if (i2 == 1) {
                    return h30.l.p((com.revolut.kompot.navigable.a) iVar2.f234374b.get(), (rp0.m) iVar2.f234375c.get());
                }
                if (i2 == 2) {
                    return new rp0.m();
                }
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new AssertionError(i2);
                    }
                    djf.c cVar = mVar3.f234402w;
                    whf.n nVarB = cVar.b();
                    vc.s.j(nVarB);
                    thf.g gVarE2 = cVar.e();
                    vc.s.j(gVarE2);
                    fub.k kVarD2 = mVar3.f234403x.d();
                    vc.s.j(kVarD2);
                    return new gc6.q(new gc6.b(nVarB, new sc6.a(gVarE2, kVarD2)), fVar.a());
                }
                aa6.c cVar2 = (aa6.c) mVar3.T.get();
                ppk.f fVarA = mVar3.v.a();
                wsg.n nVarB2 = mVar3.f234395m.b();
                xua.a aVarA = mVar3.f234393j.a();
                vc.s.j(aVarA);
                sa6.b bVar = (sa6.b) mVar3.c0.get();
                whf.b bVarA = mVar3.f234402w.a();
                vc.s.j(bVarA);
                dc6.c cVar3 = new dc6.c(cVar2, fVarA, nVarB2, aVarA, bVar, bVarA, (sa6.h) mVar3.f234389d0.get());
                j60.a aVar2 = (j60.a) iVar2.d.get();
                ua6.a aVar3 = new ua6.a();
                gte.a aVarB = mVar2.o.b();
                vc.s.j(aVarB);
                return new gc6.o(cVar3, aVar2, aVar3, aVarB, fVar.a(), (jki.p) iVar2.f.get());
            case 3:
                j jVar2 = (j) obj3;
                m mVar4 = (m) obj2;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new AssertionError(i2);
                    }
                    DonateWithPointsContract$InputData donateWithPointsContract$InputData = jVar2.f234377a;
                    nyb.k kVarC = mVar4.f234398q.c();
                    vc.s.j(kVarC);
                    return new com.revolut.feature.donations.impl.ui.kompot.bottomsheet.donatewithpoints.a(donateWithPointsContract$InputData, kVarC, (aa6.c) mVar4.T.get(), new mb6.k((uc6.a) jVar2.f234378b.f234390e0.get()), new sc6.b(), new fb6.n());
                }
                wj0.a idempotencyKeyHolder = ((nj0.d) mVar4.f234386b).i();
                vc.s.j(idempotencyKeyHolder);
                l80.e dateProvider = mVar4.i.h();
                vc.s.j(dateProvider);
                gb6.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
                Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
                return new m60.b(idempotencyKeyHolder, dateProvider, "charity_donations_flow");
            case 4:
                m mVar5 = (m) obj2;
                l70.e eVar = mVar5.i;
                o oVar = (o) obj3;
                if (i2 == 0) {
                    wj0.a idempotencyKeyHolder2 = ((nj0.d) mVar5.f234386b).i();
                    vc.s.j(idempotencyKeyHolder2);
                    l80.e dateProvider2 = eVar.h();
                    vc.s.j(dateProvider2);
                    ac6.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(idempotencyKeyHolder2, "idempotencyKeyHolder");
                    Intrinsics.checkNotNullParameter(dateProvider2, "dateProvider");
                    return new m60.b(idempotencyKeyHolder2, dateProvider2, "charity_donations_flow");
                }
                if (i2 == 1) {
                    Object extension = (kb6.b) oVar.d.get();
                    lb6.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(extension, "extension");
                    yji.n nVar = (yji.n) extension;
                    vc.s.k(nVar);
                    return nVar;
                }
                if (i2 == 2) {
                    return new kb6.c(new ua6.a(), new DonateSuccessStatusDialogMapper());
                }
                if (i2 == 3) {
                    return new com.revolut.feature.donations.impl.ui.kompot.screen.one_time_donation.a(oVar.f234408a, (w80.b) oVar.f.get(), new sc6.d(), mVar5.f234395m.b(), (aa6.c) mVar5.T.get(), (sa6.w) mVar5.f0.get(), new sc6.b(), new mb6.k((uc6.a) oVar.f234409b.f234390e0.get()), (kb6.b) oVar.d.get(), new cc6.c(), (bb6.d) oVar.f234412h.get(), new zb6.n(new bc6.a(new dec.r(), new u80.o())));
                }
                if (i2 == 4) {
                    qd0.b languageProvider = eVar.n();
                    vc.s.j(languageProvider);
                    ac6.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
                    return v80.b.b(languageProvider, false, false, 58);
                }
                if (i2 != 5) {
                    throw new AssertionError(i2);
                }
                com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) oVar.f234411g.get();
                ac6.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller, "controller");
                return new bb6.d(controller);
            case 5:
                p pVar = (p) obj3;
                m mVar6 = (m) obj2;
                pqi.a aVar4 = mVar6.E;
                if (i2 == 0) {
                    jki.p pVar2 = (jki.p) pVar.d.get();
                    RecurringDonationAmountScreenContract$InputData recurringDonationAmountScreenContract$InputData = pVar.f234413a;
                    w80.b bVar2 = (w80.b) pVar.e.get();
                    wsg.n nVarB3 = mVar6.f234395m.b();
                    aa6.c cVar4 = (aa6.c) mVar6.T.get();
                    xua.a aVarA2 = mVar6.f234393j.a();
                    vc.s.j(aVarA2);
                    aa6.a aVar5 = (aa6.a) mVar6.U.get();
                    eli.j jVarA = mVar6.A.a();
                    com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) mVar6.B).c();
                    vc.s.j(aVarC);
                    return new jc6.s(pVar2, recurringDonationAmountScreenContract$InputData, bVar2, nVarB3, cVar4, aVarA2, aVar5, jVarA, aVarC, mVar6.C.a(), mVar6.D.a(), new l2j.a(), (jc6.b) pVar.f.get(), aVar4.a(), aVar4.g());
                }
                if (i2 == 1) {
                    return new jc6.t((lc6.b) pVar.f234415c.get());
                }
                if (i2 == 2) {
                    return new lc6.c(new u80.o(), new l4i.a());
                }
                if (i2 != 3) {
                    if (i2 == 4) {
                        return new jc6.c();
                    }
                    throw new AssertionError(i2);
                }
                qd0.b languageProvider2 = mVar6.i.n();
                vc.s.j(languageProvider2);
                kc6.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(languageProvider2, "languageProvider");
                return v80.b.b(languageProvider2, false, false, 58);
            case 6:
                m mVar7 = (m) obj2;
                q qVar = (q) obj3;
                switch (i2) {
                    case 0:
                        return kxa.j.l((j60.a) qVar.d.get());
                    case 1:
                        return h30.l.p((com.revolut.kompot.navigable.a) qVar.f234418b.get(), (rp0.m) qVar.f234419c.get());
                    case 2:
                        return new rp0.m();
                    case 3:
                        jki.p pVar3 = (jki.p) qVar.f.get();
                        RecurringDonationScheduleScreenContract$InputData recurringDonationScheduleScreenContract$InputData = qVar.f234417a;
                        xua.a aVarA3 = mVar7.f234393j.a();
                        vc.s.j(aVarA3);
                        l80.e eVarH = mVar7.i.h();
                        vc.s.j(eVarH);
                        return new mc6.k(pVar3, recurringDonationScheduleScreenContract$InputData, aVarA3, eVarH, (j60.a) qVar.d.get(), (nc6.b) qVar.f234420g.get(), (oc6.b) qVar.f234421h.get());
                    case 4:
                        return new mc6.l();
                    case 5:
                        return new nc6.c();
                    case 6:
                        return new oc6.c();
                    default:
                        throw new AssertionError(i2);
                }
            case 7:
                pbk.a aVar6 = (pbk.a) obj3;
                if (i2 == 0) {
                    return new eck.j((cli.n) aVar6.f234713b.get(), ((c21.b) ((pbk.b) obj2).e).c(), aVar6.f234712a);
                }
                if (i2 == 1) {
                    return new eck.k();
                }
                throw new AssertionError(i2);
            case 8:
                pbk.b bVar3 = (pbk.b) obj2;
                g3 g3Var = bVar3.f234718g;
                pbk.c cVar5 = (pbk.c) obj3;
                agk.a aVar7 = cVar5.f234722a;
                switch (i2) {
                    case 0:
                        return agk.b.B(aVar7, (zfk.c) cVar5.f234726h.get(), (xfk.b) cVar5.e.get(), (bgk.a) cVar5.f.get(), (wfk.a) cVar5.f234725g.get(), (bgk.a) cVar5.i.get());
                    case 1:
                        mhk.a aVarC2 = g3Var.c();
                        vc.s.j(aVarC2);
                        return y3.C(aVar7, aVarC2, (xfk.b) cVar5.e.get(), (bgk.a) cVar5.f.get(), (wfk.a) cVar5.f234725g.get());
                    case 2:
                        fhk.a aVarB2 = g3Var.b();
                        vc.s.j(aVarB2);
                        return y3.b(aVar7, aVarB2);
                    case 3:
                        ohk.a aVarD = g3Var.d();
                        vc.s.j(aVarD);
                        return y3.D(aVar7, aVarD);
                    case 4:
                        dhk.a aVarA4 = g3Var.a();
                        vc.s.j(aVarA4);
                        return y3.z(aVar7, aVarA4);
                    case 5:
                        ohk.a aVarD2 = g3Var.d();
                        vc.s.j(aVarD2);
                        return agk.b.y(aVar7, aVarD2);
                    case 6:
                        PlanGiftingReceiverFlowContract$InputData planGiftingReceiverFlowContract$InputData = cVar5.f234723b;
                        egk.e eVarE = cVar5.f234724c.f234719h.e();
                        vc.s.j(eVarE);
                        ick.b bVar4 = new ick.b(eVarE);
                        tbk.e eVar2 = (tbk.e) bVar3.d.u.get();
                        vc.s.j(eVar2);
                        ffk.t tVarF = bVar3.i.f();
                        vc.s.j(tVarF);
                        return new com.revolut.retail.feature.plan_gifting.impl.ui.flows.receiver.d(planGiftingReceiverFlowContract$InputData, bVar4, eVar2, tVarF, ((k3) bVar3.f).b(), (zfk.c) cVar5.f234726h.get(), bVar3.f234719h.h(), new i90.b());
                    default:
                        throw new AssertionError(i2);
                }
            case 9:
                pbk.b bVar5 = (pbk.b) obj2;
                obk.a aVar8 = bVar5.d;
                pbk.d dVar = (pbk.d) obj3;
                switch (i2) {
                    case 0:
                        return kxa.j.k((j60.a) dVar.e.get());
                    case 1:
                        return ehe.n.s((com.revolut.kompot.navigable.a) dVar.f234730c.get(), (rp0.m) dVar.d.get());
                    case 2:
                        return new rp0.m();
                    case 3:
                        yfk.a extension2 = (yfk.a) dVar.f234731g.get();
                        Intrinsics.checkNotNullParameter(extension2, "extension");
                        vc.s.k(extension2);
                        return extension2;
                    case 4:
                        kik.a factory = (kik.a) bVar5.f234718g.A.get();
                        vc.s.j(factory);
                        Intrinsics.checkNotNullParameter(factory, "factory");
                        Object obj4 = factory.f184249a.get();
                        Intrinsics.checkNotNullExpressionValue(obj4, "get(...)");
                        yfk.a aVar9 = (yfk.a) obj4;
                        vc.s.k(aVar9);
                        return aVar9;
                    case 5:
                        PlanGiftingReceiverIntroScreenContract$InputData planGiftingReceiverIntroScreenContract$InputData = dVar.f234728a;
                        wli.x xVarD = ((s41.a) bVar5.f234720j).d();
                        cli.n nVar2 = (cli.n) dVar.i.get();
                        cl3.a aVarD3 = bVar5.f234716b.d();
                        vc.s.j(aVarD3);
                        ffk.t tVarF2 = bVar5.i.f();
                        vc.s.j(tVarF2);
                        yik.h hVarB = ((k3) bVar5.f).b();
                        tbk.g gVar2 = (tbk.g) aVar8.f223982r.get();
                        vc.s.j(gVar2);
                        j60.a aVar10 = (j60.a) dVar.e.get();
                        ibk.b bVar6 = (ibk.b) aVar8.D.get();
                        vc.s.j(bVar6);
                        return new gck.w(planGiftingReceiverIntroScreenContract$InputData, xVarD, nVar2, aVarD3, tVarF2, hVarB, gVar2, aVar10, bVar6, (yfk.a) dVar.f234731g.get());
                    case 6:
                        ick.a aVar11 = new ick.a();
                        ick.d dVar2 = new ick.d();
                        ick.a clickableClauseMapper = new ick.a();
                        Intrinsics.checkNotNullParameter(clickableClauseMapper, "clickableClauseMapper");
                        ick.f fVar2 = new ick.f();
                        pbk.b bVar7 = dVar.f234729b;
                        sf0.h hVarB2 = bVar7.f234717c.b();
                        vc.s.j(hVarB2);
                        v60.e eVarA = bVar7.k.a();
                        vc.s.j(eVarA);
                        return new gck.y(aVar11, dVar2, fVar2, new qek.a(hVarB2, eVarA, 1));
                    default:
                        throw new AssertionError(i2);
                }
            case 10:
                pbk.f fVar3 = (pbk.f) obj3;
                pbk.b bVar8 = (pbk.b) obj2;
                vl3.n nVar3 = bVar8.f234716b;
                if (i2 == 0) {
                    cli.n nVar4 = (cli.n) fVar3.f234738b.get();
                    PlanGiftingSendConfirmationScreenContract$InputData planGiftingSendConfirmationScreenContract$InputData = fVar3.f234737a;
                    cl3.a aVarD4 = nVar3.d();
                    vc.s.j(aVarD4);
                    return new lck.f(nVar4, planGiftingSendConfirmationScreenContract$InputData, aVarD4);
                }
                if (i2 != 1) {
                    throw new AssertionError(i2);
                }
                yik.g gVarA = ((k3) bVar8.f).a();
                dl3.f fVarC = nVar3.c();
                vc.s.j(fVarC);
                return new i3g.k(gVarA, fVarC);
            case 11:
                pgf.b bVar9 = (pgf.b) obj3;
                pgf.e eVar3 = (pgf.e) obj2;
                x9e.a aVar12 = eVar3.f235898h;
                if (i2 != 0) {
                    if (i2 == 1) {
                        return new ygf.j((a9e.h) bVar9.f235883c.get());
                    }
                    if (i2 != 2) {
                        throw new AssertionError(i2);
                    }
                    mae.p factory2 = aVar12.e();
                    vc.s.j(factory2);
                    f01.c uikitResources = eVar3.o.g();
                    t70.b currenciesLocalization = eVar3.f235896c.g();
                    vc.s.j(currenciesLocalization);
                    zgf.a.Companion.getClass();
                    Intrinsics.checkNotNullParameter(factory2, "factory");
                    Intrinsics.checkNotNullParameter(uikitResources, "uikitResources");
                    Intrinsics.checkNotNullParameter(currenciesLocalization, "currenciesLocalization");
                    return factory2.d(uikitResources, currenciesLocalization);
                }
                g9e.a aVarC3 = aVar12.c();
                vc.s.j(aVarC3);
                pgf.e eVar4 = bVar9.f235882b;
                usg.a aVar13 = eVar4.i;
                x9e.a aVar14 = eVar4.f235898h;
                wsg.n nVarB4 = aVar13.b();
                c9e.c cVarB = aVar14.b();
                vc.s.j(cVarB);
                z8e.a aVarD5 = aVar14.d();
                vc.s.j(aVarD5);
                ahf.c0 c0Var2 = new ahf.c0(nVarB4, cVarB, aVarD5);
                r0 r0VarC = eVar3.u.c();
                nhf.a aVarA5 = eVar3.C.a();
                vc.s.j(aVarA5);
                return new ygf.i(aVarC3, c0Var2, r0VarC, aVarA5, bVar9.f235881a, (jki.p) bVar9.d.get());
            case 12:
                pgf.c cVar6 = (pgf.c) obj3;
                pgf.e eVar5 = cVar6.f235886c;
                pgf.e eVar6 = (pgf.e) obj2;
                ae9.b bVar10 = eVar6.F;
                x9e.a aVar15 = eVar6.f235898h;
                switch (i2) {
                    case 0:
                        return kxa.j.k((j60.a) cVar6.f.get());
                    case 1:
                        return ehe.n.s((com.revolut.kompot.navigable.a) cVar6.d.get(), (rp0.m) cVar6.e.get());
                    case 2:
                        return new rp0.m();
                    case 3:
                        mkd.g view = cVar6.f235884a;
                        rkd.m factory3 = eVar6.E.a();
                        vc.s.j(factory3);
                        bhf.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(view, "view");
                        Intrinsics.checkNotNullParameter(factory3, "factory");
                        return factory3.a(view);
                    case 4:
                        xua.a aVarA6 = aVar15.f303678t.a();
                        vc.s.j(aVarA6);
                        nd.l factory4 = new nd.l(aVarA6);
                        e9e.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory4, "factory");
                        return new wae.d(aVarA6);
                    case 5:
                        g9e.a aVarC4 = aVar15.c();
                        vc.s.j(aVarC4);
                        r10.q factory5 = bVar10.a();
                        Intrinsics.checkNotNullParameter(factory5, "factory");
                        yd9.k kVar = new yd9.k((p0i.b) factory5.f250850c, (xua.a) factory5.d);
                        f01.c cVarG = bVar10.e.g();
                        ae9.e eVar7 = ae9.f.Companion;
                        eVar7.getClass();
                        eVar7.getClass();
                        be9.f fVar4 = new be9.f(cVarG);
                        usg.a aVar16 = eVar5.i;
                        x9e.a aVar17 = eVar5.f235898h;
                        wsg.n nVarB5 = aVar16.b();
                        c9e.c cVarB2 = aVar17.b();
                        vc.s.j(cVarB2);
                        z8e.a aVarD6 = aVar17.d();
                        vc.s.j(aVarD6);
                        ahf.c0 c0Var3 = new ahf.c0(nVarB5, cVarB2, aVarD6);
                        j60.a aVar18 = (j60.a) cVar6.f.get();
                        ahf.b bVar11 = new ahf.b();
                        ScheduledPaymentsInputData scheduledPaymentsInputData = cVar6.f235885b;
                        l70.e eVar8 = eVar5.f235896c;
                        l80.e eVarH2 = eVar8.h();
                        vc.s.j(eVarH2);
                        n8b.a aVarA7 = eVar5.f235901m.a();
                        vc.s.j(aVarA7);
                        thf.c cVarC = eVar5.f235902n.c();
                        vc.s.j(cVarC);
                        f01.c cVarG2 = eVar5.o.g();
                        t70.b bVarG = eVar8.g();
                        vc.s.j(bVarG);
                        dhf.d dVar3 = new dhf.d(eVarH2, aVarA7, cVarC, cVarG2, bVarG);
                        ang.f fVarE = eVar6.f235900l.e();
                        gte.a aVarB3 = eVar6.f.b();
                        vc.s.j(aVarB3);
                        c8i.x xVar2 = (c8i.x) eVar6.G.E.get();
                        vc.s.j(xVar2);
                        wzi.a aVarA8 = ((ctj.b) eVar5.H).a();
                        vc.s.j(aVarA8);
                        whf.b bVarA2 = eVar5.f235902n.a();
                        vc.s.j(bVarA2);
                        wsg.n nVarB6 = eVar5.i.b();
                        rqd.h hVar2 = (rqd.h) eVar5.I.C0.get();
                        vc.s.j(hVar2);
                        chf.c cVar7 = new chf.c(aVarA8, bVarA2, nVarB6, hVar2);
                        dtj.a aVar19 = (dtj.a) ((dqj.r) eVar6.f235897g).f117012a0.get();
                        vc.s.j(aVar19);
                        ypf.b bVarB = eVar6.J.b();
                        jla.h hVarA = eVar6.K.a();
                        v5a.c cVarA = ((u5a.f) eVar6.L).a();
                        v67.b bVarA3 = eVar6.M.a();
                        vc.s.j(bVarA3);
                        gte.a aVarB4 = eVar5.f.b();
                        vc.s.j(aVarB4);
                        wsg.n nVarB7 = eVar5.i.b();
                        i61.b bVarA4 = eVar5.N.a();
                        u51.a aVarA9 = eVar5.O.a();
                        vc.s.j(aVarA9);
                        h30.q qVar2 = new h30.q(aVarB4, nVarB7, bVarA4, aVarA9);
                        qm1.h hVarC = eVar6.P.c();
                        vc.s.j(hVarC);
                        mkd.d dVar4 = (mkd.d) cVar6.i.get();
                        d9e.a aVar20 = (d9e.a) cVar6.f235889j.get();
                        a61.a aVarH = eVar6.Q.h();
                        bgc.e eVarC = eVar6.R.c();
                        vc.s.j(eVarC);
                        nhf.a aVarA10 = eVar6.C.a();
                        vc.s.j(aVarA10);
                        a9e.h hVar3 = (a9e.h) cVar6.k.get();
                        djf.c cVar8 = eVar5.f235902n;
                        r10.q factory6 = eVar5.F.a();
                        Intrinsics.checkNotNullParameter(factory6, "factory");
                        yd9.g gVar3 = new yd9.g((yd9.e) factory6.f250849b);
                        thf.d dVarD = cVar8.d();
                        vc.s.j(dVarD);
                        thf.m mVarG = cVar8.g();
                        vc.s.j(mVarG);
                        chf.i iVar3 = new chf.i(dVarD, mVarG, new j9l.a());
                        jla.h hVarA2 = eVar5.K.a();
                        v67.b bVarA5 = eVar5.M.a();
                        vc.s.j(bVarA5);
                        je6.h hVarC2 = ((xf6.t) eVar5.S).c();
                        vc.s.j(hVarC2);
                        return new ahf.z(aVarC4, kVar, fVar4, c0Var3, aVar18, bVar11, scheduledPaymentsInputData, dVar3, fVarE, aVarB3, xVar2, cVar7, aVar19, bVarB, hVarA, cVarA, bVarA3, qVar2, hVarC, dVar4, aVar20, aVarH, eVarC, aVarA10, new e0(hVar3, gVar3, iVar3, hVarA2, bVarA5, new xgf.b(hVarC2), cVar6.f235885b));
                    case 6:
                        mae.p factory7 = aVar15.e();
                        vc.s.j(factory7);
                        f01.c uikitResources2 = eVar6.o.g();
                        t70.b currenciesLocalization2 = eVar6.f235896c.g();
                        vc.s.j(currenciesLocalization2);
                        bhf.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory7, "factory");
                        Intrinsics.checkNotNullParameter(uikitResources2, "uikitResources");
                        Intrinsics.checkNotNullParameter(currenciesLocalization2, "currenciesLocalization");
                        return factory7.d(uikitResources2, currenciesLocalization2);
                    default:
                        throw new AssertionError(i2);
                }
            case 13:
                pgf.e eVar9 = (pgf.e) obj2;
                djf.c cVar9 = eVar9.f235902n;
                if (i2 == 0) {
                    pgf.d dVar5 = (pgf.d) obj3;
                    SimpleTransactionsScreenContract$InputData simpleTransactionsScreenContract$InputData = dVar5.f235891a;
                    cli.n nVar5 = (cli.n) dVar5.f235892b.get();
                    whf.b bVarA6 = cVar9.a();
                    vc.s.j(bVarA6);
                    return new fhf.j(simpleTransactionsScreenContract$InputData, nVar5, bVarA6, ((b3j.p) eVar9.T).e());
                }
                if (i2 != 1) {
                    throw new AssertionError(i2);
                }
                whf.n nVarB8 = cVar9.b();
                vc.s.j(nVarB8);
                thf.d dVarD2 = cVar9.d();
                vc.s.j(dVarD2);
                m3j.j jVarD = b3j.p.d();
                aqa.a aVarA11 = ((jqa.p) eVar9.U).a();
                vc.s.j(aVarA11);
                gte.a aVarB5 = eVar9.f.b();
                vc.s.j(aVarB5);
                return new fhf.l(nVarB8, dVarD2, jVarD, aVarA11, aVarB5);
            case 14:
                pgf.f fVar5 = (pgf.f) obj3;
                TransactionListFlowContract$InputData transactionListFlowContract$InputData = fVar5.f235911a;
                pgf.e eVar10 = (pgf.e) obj2;
                jhf.a aVar21 = eVar10.f235895b;
                if (i2 == 0) {
                    mjf.f fVar6 = new mjf.f(((bjf.a) aVar21).f15623l.a());
                    r70.c cVarA2 = eVar10.f235896c.A();
                    vc.s.j(cVarA2);
                    l80.e eVarH3 = fVar5.f235912b.f235896c.h();
                    vc.s.j(eVarH3);
                    return new com.revolut.feature.transaction_list.impl.ui.list.flow.a(transactionListFlowContract$InputData, fVar6, cVarA2, new qgf.y(eVarH3, transactionListFlowContract$InputData));
                }
                if (i2 != 1) {
                    throw new AssertionError(i2);
                }
                mhf.b bVarB2 = ((bjf.a) aVar21).b();
                vc.s.j(bVarB2);
                TransactionListFlowContract$InputData transactionListFlowContract$InputData2 = fVar5.f235911a;
                qfe.a aVarE = ((jge.m) eVar10.f235894a.e).e();
                rkg.b bVar12 = new rkg.b();
                gte.a aVarB6 = eVar10.f.b();
                vc.s.j(aVarB6);
                return new qgf.x(bVarB2, transactionListFlowContract$InputData2, aVarE, bVar12, aVarB6);
            case 15:
                l70.e eVar11 = ((pm2.c) obj2).f;
                pm2.a aVar22 = (pm2.a) obj3;
                switch (i2) {
                    case 0:
                        return f0k.d.p((e60.a) aVar22.f237453m.get());
                    case 1:
                        com.revolut.kompot.navigable.a aVar23 = (com.revolut.kompot.navigable.a) aVar22.e.get();
                        g60.a aVarA12 = f60.v.a((com.revolut.kompot.navigable.a) aVar22.e.get());
                        Activity activityA = f60.t.a((com.revolut.kompot.navigable.a) aVar22.e.get());
                        t80.g gVar4 = (t80.g) aVar22.f.get();
                        com.revolut.kompot.navigable.a aVar24 = (com.revolut.kompot.navigable.a) aVar22.e.get();
                        f60.y.a(aVar24);
                        d4m.a aVarA13 = e4m.b.a(aVar22.f237449g);
                        nli.a aVar25 = new nli.a((t80.c) aVar22.f237450h.get(), f60.t.a((com.revolut.kompot.navigable.a) aVar22.e.get()));
                        t80.g gVar5 = (t80.g) aVar22.f.get();
                        zk0.b bVarL = aVar22.f237447b.f.l();
                        vc.s.j(bVarL);
                        return v1.c.q(aVar23, new t80.v(aVarA12, activityA, gVar4, aVar24, aVarA13, aVar25, new oli.c(gVar5, bVarL, new nli.a((t80.c) aVar22.f237450h.get(), f60.t.a((com.revolut.kompot.navigable.a) aVar22.e.get())), f60.v.a((com.revolut.kompot.navigable.a) aVar22.e.get()), aVar22.c()), new oli.g(f60.u.a(f60.t.a((com.revolut.kompot.navigable.a) aVar22.e.get())), v1.c.e((com.revolut.kompot.navigable.a) aVar22.e.get()), new ami.n(e4m.b.a(aVar22.i), 1), e4m.b.a(aVar22.f237449g), (t80.g) aVar22.f.get(), new nli.a((t80.c) aVar22.f237450h.get(), f60.t.a((com.revolut.kompot.navigable.a) aVar22.e.get())), new i90.b(), aVar22.b(), aVar22.c()), aVar22.c()), f60.x.a(), (rp0.m) aVar22.f237451j.get(), (e60.t) aVar22.f237452l.get());
                    case 2:
                        f80.a aVarX = eVar11.x();
                        vc.s.j(aVarX);
                        xVar = new t80.x(aVarX, new i90.b());
                        break;
                    case 3:
                        com.revolut.kompot.navigable.a aVar26 = (com.revolut.kompot.navigable.a) aVar22.e.get();
                        f60.y.a(aVar26);
                        return pli.c.a(new ks0.n(aVar26));
                    case 4:
                        sm2.b.Companion.getClass();
                        return new t80.c(new e.a("background_photo"), SizeBasedTriggeringPolicy.DEFAULT_MAX_FILE_SIZE);
                    case 5:
                        return t96.a.a();
                    case 6:
                        return f60.z.a();
                    case 7:
                        aii.o oVar2 = (aii.o) aVar22.k.get();
                        y80.a aVarR = eVar11.r();
                        vc.s.j(aVarR);
                        xVar = new e60.y(oVar2, aVarR, aVar22.b(), Optional.empty());
                        break;
                    case 8:
                        e60.t tVar = (e60.t) aVar22.f237452l.get();
                        f60.w.a(tVar);
                        return tVar;
                    default:
                        throw new AssertionError(i2);
                }
                return xVar;
            case 16:
                pm2.b bVar13 = (pm2.b) obj3;
                pm2.c cVar10 = (pm2.c) obj2;
                nm2.e eVar12 = cVar10.d;
                if (i2 == 0) {
                    return new com.revolut.feature.backgroundpicker.impl.flow.a(bVar13.f237455a, (bn2.c) bVar13.f.get(), new hm2.e());
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        return new bn2.u(cVar10.f237460b.b(), eVar12.c(), new r10.d(eVar12.e(), cVar10.a()));
                    }
                    throw new AssertionError(i2);
                }
                Optional customInteractor = bVar13.f237456b;
                bn2.c defaultInteractor = (bn2.c) bVar13.e.get();
                tm2.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(customInteractor, "customInteractor");
                Intrinsics.checkNotNullParameter(defaultInteractor, "defaultInteractor");
                if (customInteractor.isPresent()) {
                    Object obj5 = customInteractor.get();
                    Intrinsics.h(obj5);
                    defaultInteractor = (bn2.c) obj5;
                }
                vc.s.k(defaultInteractor);
                return defaultInteractor;
            case 17:
                pm2.d dVar6 = (pm2.d) obj3;
                if (i2 == 0) {
                    bn2.e0 interactor = (bn2.e0) dVar6.d.get();
                    vm2.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(interactor, "interactor");
                    bn2.e0 e0Var = interactor;
                    vc.s.k(e0Var);
                    return e0Var;
                }
                if (i2 != 1) {
                    throw new AssertionError(i2);
                }
                gte.a featureToggleInteractor = ((pm2.c) obj2).f237459a.b();
                vc.s.j(featureToggleInteractor);
                pm2.c cVar11 = dVar6.f237465c;
                nm2.e eVar13 = cVar11.d;
                ckg.a aVar27 = cVar11.f237460b;
                ekg.g gVarB = aVar27.b();
                hm2.a aVar28 = (hm2.a) cVar11.f237461c;
                qfe.b bVar14 = (qfe.b) ((jge.m) aVar28.f153507a.e).f174025r.get();
                vc.s.j(bVar14);
                bn2.p pVarC = aVar28.f153508b.c();
                ji5.m mVarE = aVar28.f153509c.e();
                vc.s.j(mVarE);
                uke.a aVar29 = (uke.a) ((ske.c) aVar28.d).f0.get();
                vc.s.j(aVar29);
                u29.o oVar3 = (u29.o) ((t29.c) aVar28.e).z.get();
                vc.s.j(oVar3);
                ibb.d dVar7 = (ibb.d) ((mbb.a) aVar28.f).f204191a.get();
                vc.s.j(dVar7);
                bn2.e0 sandboxInteractorImpl = new bn2.e0(gVarB, new w2(bVar14, pVarC, mVarE, aVar29, oVar3, dVar7), eVar13.c(), eVar13.e(), new r10.d(eVar13.e(), cVar11.a()), new zjh.f(aVar27.b()), eVar13.f217156a.a());
                vm2.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
                Intrinsics.checkNotNullParameter(sandboxInteractorImpl, "sandboxInteractorImpl");
                return sandboxInteractorImpl;
            case 18:
                return a();
            case 19:
                return b();
            case 20:
                return c();
            case 21:
                return d();
            case 22:
                return e();
            case 23:
                return f();
            case 24:
                return g();
            case 25:
                return h();
            case 26:
                return i();
            case 27:
                return j();
            case 28:
                return k();
            default:
                h0 h0Var = (h0) obj3;
                ppd.n nVar6 = h0Var.f238424b;
                ppd.n nVar7 = (ppd.n) obj2;
                jmd.d dVar8 = nVar7.f238489g;
                djf.c cVar12 = nVar7.f238490h;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new AssertionError(i2);
                    }
                    whf.n nVarB9 = cVar12.b();
                    vc.s.j(nVarB9);
                    end.d dVarH = nVar6.f238489g.h();
                    whf.n nVarB10 = nVar6.f238490h.b();
                    vc.s.j(nVarB10);
                    return new gqd.z(nVarB9, new gqd.r(dVarH, nVarB10), new j9l.a());
                }
                IncomeSorterExecutionContract$InputData incomeSorterExecutionContract$InputData = h0Var.f238423a;
                wsg.n nVarB11 = nVar7.f.b();
                wzi.a aVarA14 = ((ctj.b) nVar7.I).a();
                vc.s.j(aVarA14);
                xld.b bVar15 = (xld.b) dVar8.D0.get();
                vc.s.j(bVar15);
                whf.b bVarA7 = cVar12.a();
                vc.s.j(bVarA7);
                com.revolut.domain.interactors.transactions.a aVarC5 = ((bjf.a) nVar6.v).c();
                vc.s.j(aVarC5);
                rqd.k kVar2 = new rqd.k(aVarC5);
                rqd.h hVar4 = (rqd.h) dVar8.C0.get();
                vc.s.j(hVar4);
                return new gqd.v(incomeSorterExecutionContract$InputData, nVarB11, aVarA14, bVar15, bVarA7, kVar2, hVar4, (cli.n) h0Var.f238425c.get());
        }
    }
}
