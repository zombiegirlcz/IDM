package lzk;

import android.app.Activity;
import android.content.Context;
import android.text.InputFilter;
import b4c.u;
import b4c.x;
import byc.k;
import cli.n;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.cash_topup.impl.ui.amount.CashTopUpAmountScreenContract$InputData;
import com.revolut.feature.cms.stories.impl.ui.screen.CmsStoriesScreenContract$InputData;
import com.revolut.feature.invest.smart_notifications.api.domain.models.FeedFilter;
import com.revolut.feature.invest.smart_notifications.impl.ui.screen.all_insights.AllInsightsScreenContract$InputData;
import com.revolut.feature.invest.smart_notifications.impl.ui.screen.feed.SmartFeedScreenContract$InputData;
import com.revolut.feature.retail.cfd.impl.flows.withdraw.CfdWithdrawFlowContract$InputData;
import com.revolut.feature.retail.cfd.impl.screens.cash_balance.CfdCashBalanceControllerContract$InputData;
import com.revolut.feature.retail.cfd.impl.screens.cash_trade.CfdCashTradeDetailsContract$InputData;
import com.revolut.feature.retail.cfd.impl.screens.home.CfdTradingHomeScreenContract$InputData;
import com.revolut.feature.retail.cfd.impl.screens.withdraw.CfdWithdrawScreenContract$InputData;
import com.revolut.feature.revolut_shop.ui.screen.deliveryaddress.DeliveryAddressScreenContract$InputData;
import com.revolut.feature.revolut_shop.ui.screen.orderconfirmation.OrderConfirmationScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import e4m.e;
import ep6.o;
import g4c.w;
import h3b.z;
import i4c.l;
import i4c.p;
import i4c.t;
import java.util.Optional;
import k3c.r;
import kl.b0;
import kl.t1;
import kotlin.jvm.internal.Intrinsics;
import l4c.m;
import m3c.h;
import m3c.j;
import mb3.q;
import mb3.v;
import o3b.f0;
import o3b.n0;
import o3b.q0;
import p4c.a0;
import rp0.g1;
import rp0.x0;
import vc.s;
import vrl.u0;
import wp5.y;
import z0h.q1;
import z3c.f;
import z3c.g;
import z3c.i;
import zhm.h0;
import zhm.r0;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f201017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f201018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f201019c;
    public final Object d;

    public /* synthetic */ b(Object obj2, Object obj3, int i, int i2) {
        this.f201017a = i2;
        this.f201019c = obj2;
        this.d = obj3;
        this.f201018b = i;
    }

    private final Object a() {
        m3c.d dVar = (m3c.d) this.d;
        j jVar = (j) this.f201019c;
        jpj.d dVar2 = jVar.f202347b;
        sse.b bVar = jVar.f202348c;
        int i = this.f201018b;
        if (i != 0) {
            if (i == 1) {
                k factory = ((vxc.b) jVar.d).a();
                s.j(factory);
                Intrinsics.checkNotNullParameter(factory, "factory");
                return factory.a();
            }
            if (i == 2) {
                return new u((n) dVar.d.get(), (e3c.a) jVar.i.get(), dVar2.a(), dVar2.b(), (mse.a) dVar.f202330c.get());
            }
            if (i == 3) {
                return new x(new i(), new g(), new z3c.d(), new f(new kpj.b()), bVar.d());
            }
            throw new AssertionError(i);
        }
        j jVar2 = dVar.f202328a;
        kpj.e eVarB = jVar2.f202347b.b();
        use.d dVarB = jVar2.f202348c.b();
        s.j(dVarB);
        p3c.a interactor = new p3c.a(eVarB, dVarB);
        y9l.a actionControllerExtension = (y9l.a) dVar.f202329b.get();
        rul.e factory2 = bVar.a();
        p3c.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(actionControllerExtension, "actionControllerExtension");
        Intrinsics.checkNotNullParameter(factory2, "factory");
        return rul.e.b(factory2, o.f128092a, actionControllerExtension, interactor, false, 24);
    }

    private final Object b() {
        m3c.f fVar = (m3c.f) this.d;
        j jVar = (j) this.f201019c;
        jpj.d dVar = jVar.f202347b;
        int i = this.f201018b;
        if (i == 0) {
            return new p4c.x((n) fVar.d.get(), fVar.f202334a, dVar.a(), new kpj.f(dVar.d.a()), (e3c.a) jVar.i.get(), dVar.c(), dVar.b());
        }
        if (i == 1) {
            return new a0(fVar.f202334a, new z3c.d(), new i(), new g(), new f(new kpj.b()), dVar.c(), new r4c.b(new g(), (f01.a) fVar.f202336c.get()));
        }
        if (i != 2) {
            throw new AssertionError(i);
        }
        com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) fVar.f202335b.get();
        q4c.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(controller, "controller");
        return new f01.c(controller.m2());
    }

    private final Object c() {
        j jVar = (j) this.f201019c;
        h hVar = (h) this.d;
        j jVar2 = hVar.f202340a;
        int i = this.f201018b;
        if (i != 0) {
            if (i == 1) {
                return new g4c.u(new r((e3c.a) jVar2.i.get()), jVar.f202347b.b(), (f3c.a) hVar.f202341b.get(), new w(new l(new i4c.d((g3c.b) jVar2.f202351j.get()), new i4c.r((g3c.b) jVar2.f202351j.get()), new i4c.h((g3c.b) jVar2.f202351j.get()), new i4c.f((g3c.b) jVar2.f202351j.get()), new i4c.n((g3c.b) jVar2.f202351j.get()), new p((g3c.b) jVar2.f202351j.get()), new i4c.b((g3c.b) jVar2.f202351j.get()), new t((g3c.b) jVar2.f202351j.get()))));
            }
            throw new AssertionError(i);
        }
        npj.a factory = new npj.a();
        h4c.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        npj.b bVar = npj.b.f218232l;
        s.k(bVar);
        return bVar;
    }

    private final Object d() {
        m3c.l lVar = (m3c.l) this.d;
        j jVar = (j) this.f201019c;
        jpj.d dVar = jVar.f202347b;
        int i = this.f201018b;
        if (i == 0) {
            npj.a factory = new npj.a();
            k4c.c.Companion.getClass();
            Intrinsics.checkNotNullParameter(factory, "factory");
            npj.b bVar = npj.b.f218232l;
            s.k(bVar);
            return bVar;
        }
        if (i != 1) {
            if (i != 2) {
                throw new AssertionError(i);
            }
            com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) lVar.d.get();
            k4c.c.Companion.getClass();
            Intrinsics.checkNotNullParameter(controller, "controller");
            return x0.a(g1.Companion, controller.D2());
        }
        j4c.x xVar = new j4c.x(new l4c.c(), new l4c.l(new l4c.f(new i())), new m(), new l4c.i(new z3c.a()), new l4c.o(), new l4c.b());
        OrderConfirmationScreenContract$InputData orderConfirmationScreenContract$InputData = lVar.f202358b;
        dl2.a aVarA = dVar.a();
        n3c.a aVar = (n3c.a) jVar.f202353m.get();
        kpj.e eVarB = dVar.b();
        b0 b0Var = new b0(dVar.f177302c.a());
        c70.a aVarZ = jVar.e.z();
        s.j(aVarZ);
        g1 g1Var = (g1) lVar.e.get();
        f3c.a aVar2 = (f3c.a) lVar.f202359c.get();
        zk0.b bVarL = dVar.e.l();
        s.j(bVarL);
        return new j4c.u(xVar, orderConfirmationScreenContract$InputData, aVarA, aVar, eVarB, b0Var, aVarZ, g1Var, aVar2, new opj.b(bVarL));
    }

    private final Object e() {
        m3c.l lVar = (m3c.l) this.d;
        j jVar = (j) this.f201019c;
        jpj.d dVar = jVar.f202347b;
        int i = this.f201018b;
        if (i == 0) {
            npj.a factory = new npj.a();
            k4c.c.Companion.getClass();
            Intrinsics.checkNotNullParameter(factory, "factory");
            npj.b bVar = npj.b.f218232l;
            s.k(bVar);
            return bVar;
        }
        if (i != 1) {
            if (i != 2) {
                throw new AssertionError(i);
            }
            com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) lVar.d.get();
            k4c.c.Companion.getClass();
            Intrinsics.checkNotNullParameter(controller, "controller");
            return x0.a(g1.Companion, controller.D2());
        }
        j4c.x xVar = new j4c.x(new l4c.c(), new l4c.l(new l4c.f(new i())), new m(), new l4c.i(new z3c.a()), new l4c.o(), new l4c.b());
        OrderConfirmationScreenContract$InputData orderConfirmationScreenContract$InputData = lVar.f202358b;
        dl2.a aVarA = dVar.a();
        n3c.a aVar = (n3c.a) jVar.f202353m.get();
        kpj.e eVarB = dVar.b();
        b0 b0Var = new b0(dVar.f177302c.a());
        c70.a aVarZ = jVar.e.z();
        s.j(aVarZ);
        g1 g1Var = (g1) lVar.e.get();
        f3c.a aVar2 = (f3c.a) lVar.f202359c.get();
        zk0.b bVarL = dVar.e.l();
        s.j(bVarL);
        return new j4c.u(xVar, orderConfirmationScreenContract$InputData, aVarA, aVar, eVarB, b0Var, aVarZ, g1Var, aVar2, new opj.b(bVarL));
    }

    private final Object f() {
        m5c.c cVar = (m5c.c) this.f201019c;
        m5c.a aVar = (m5c.a) this.d;
        int i = this.f201018b;
        if (i == 0) {
            Activity activity = (Activity) aVar.f202880b.get();
            ryc.a aVarB = cVar.i.b();
            sh5.d dVarF = cVar.f202889j.f();
            s.j(dVarF);
            return new v5c.g(activity, aVarB, dVarF, new v5c.h());
        }
        if (i != 1) {
            throw new AssertionError(i);
        }
        ViewController viewController = aVar.f202879a;
        w5c.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(viewController, "viewController");
        Activity activityM2 = viewController.m2();
        s.k(activityM2);
        return activityM2;
    }

    private final Object g() {
        mb3.p pVar = (mb3.p) this.f201019c;
        mb3.i iVar = pVar.f204093c;
        mb3.j jVar = (mb3.j) this.d;
        int i = this.f201018b;
        switch (i) {
            case 0:
                return kxa.j.l((j60.a) jVar.e.get());
            case 1:
                return h30.l.p((com.revolut.kompot.navigable.a) jVar.f204071c.get(), (rp0.m) jVar.d.get());
            case 2:
                return new rp0.m();
            case 3:
                wsg.n nVarB = pVar.f204095h.b();
                nb3.b bVarC = iVar.c();
                t1 t1VarB = iVar.b();
                w80.b bVar = (w80.b) jVar.f204072g.get();
                jki.p pVar2 = (jki.p) jVar.i.get();
                CashTopUpAmountScreenContract$InputData.CreateBarcodeData createBarcodeData = jVar.f204069a;
                j60.a aVar = (j60.a) jVar.e.get();
                qb3.a aVar2 = new qb3.a();
                w39.b bVarA = pVar.f.a();
                s.j(bVarA);
                return new com.revolut.feature.cash_topup.impl.ui.amount.c(nVarB, bVarC, t1VarB, bVar, pVar2, createBarcodeData, aVar, aVar2, bVarA);
            case 4:
                qd0.b languageProvider = pVar.d.n();
                s.j(languageProvider);
                rb3.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
                return v80.b.b(languageProvider, false, false, 58);
            case 5:
                return new qb3.t(new u80.o(), (InputFilter) jVar.f204073h.get(), new qb3.u());
            case 6:
                rb3.b.Companion.getClass();
                return new mp0.d(11);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object h() {
        mb3.p pVar = (mb3.p) this.f201019c;
        mb3.k kVar = (mb3.k) this.d;
        int i = this.f201018b;
        if (i == 0) {
            return kxa.j.m((j60.a) kVar.f.get());
        }
        if (i == 1) {
            return y.r((com.revolut.kompot.navigable.a) kVar.d.get(), (rp0.m) kVar.e.get());
        }
        if (i == 2) {
            return new rp0.m();
        }
        if (i != 3) {
            throw new AssertionError(i);
        }
        dj3.a aVarA = pVar.f204091a.a();
        s.j(aVarA);
        return new com.revolut.feature.cash_topup.impl.ui.flow.barcode.a(aVarA, pVar.f204092b.a(), pVar.f204093c.b(), kVar.f204075a);
    }

    private final Object i() {
        mb3.p pVar = (mb3.p) this.f201019c;
        mb3.i iVar = pVar.f204093c;
        mb3.l lVar = (mb3.l) this.d;
        int i = this.f201018b;
        switch (i) {
            case 0:
                return kxa.j.k((j60.a) lVar.d.get());
            case 1:
                return ehe.n.s((com.revolut.kompot.navigable.a) lVar.f204081b.get(), (rp0.m) lVar.f204082c.get());
            case 2:
                return new rp0.m();
            case 3:
                db3.b bVar = (db3.b) iVar.f204068m.get();
                s.j(bVar);
                return new ob3.e(bVar);
            case 4:
                return new sb3.p(iVar.b(), (j60.a) lVar.d.get(), new sb3.a(), (ob3.b) lVar.f.get(), (n) lVar.f204084h.get());
            case 5:
                return new sb3.s(pVar.d.d(), (c90.c) lVar.f204083g.get());
            case 6:
                Activity context = lVar.f204080a;
                tb3.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                return new c90.c(context);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object j() {
        q qVar = (q) this.d;
        int i = this.f201018b;
        if (i != 0) {
            if (i == 1) {
                return new kc3.l();
            }
            throw new AssertionError(i);
        }
        n nVar = (n) qVar.f204098b.get();
        fk3.a aVarA = ((mb3.p) this.f201019c).e.a();
        s.j(aVarA);
        return new kc3.k(nVar, aVarA, qVar.f204097a);
    }

    private final Object k() {
        mb3.p pVar = (mb3.p) this.f201019c;
        v vVar = (v) this.d;
        int i = this.f201018b;
        if (i == 0) {
            n nVar = (n) vVar.f204110c.get();
            nb3.b bVarC = pVar.f204093c.c();
            w39.b bVarA = pVar.f.a();
            s.j(bVarA);
            return new qc3.k(nVar, bVarC, bVarA);
        }
        if (i != 1) {
            throw new AssertionError(i);
        }
        qc3.f fVar = vVar.f204108a;
        mb3.p pVar2 = vVar.f204109b;
        ub3.g gVar = new ub3.g((ub3.m) pVar2.f204096j.get());
        ub3.h hVar = new ub3.h();
        ub3.j jVar = new ub3.j();
        ub3.i iVar = new ub3.i();
        l80.e eVarH = pVar2.d.h();
        s.j(eVarH);
        return new qc3.m(fVar, new ub3.e(gVar, hVar, jVar, iVar, eVarH));
    }

    private final Object l() {
        mb3.y yVar = (mb3.y) this.d;
        int i = this.f201018b;
        if (i == 0) {
            return kxa.j.m((j60.a) yVar.f204117c.get());
        }
        if (i == 1) {
            return y.r((com.revolut.kompot.navigable.a) yVar.f204115a.get(), (rp0.m) yVar.f204116b.get());
        }
        if (i == 2) {
            return new rp0.m();
        }
        if (i == 3) {
            return new cc3.j((j60.a) yVar.f204117c.get(), new cc3.a(), ((mb3.p) this.f201019c).f204093c.b());
        }
        throw new AssertionError(i);
    }

    @Override // phm.a
    public final Object get() {
        Object cVar;
        Object eVar;
        Object cVar2;
        Object qVar;
        Object eVar2;
        Object jVar;
        switch (this.f201017a) {
            case 0:
                c cVar3 = (c) this.d;
                xoi.d dVar = cVar3.f201020a;
                int i = this.f201018b;
                switch (i) {
                    case 0:
                        return new xpi.c(xpi.f.f307976c, bq.i.b(dVar));
                    case 1:
                        cVar = new en.c(ImmutableSet.of((ln.d) cVar3.f201021b.d.get()), bq.i.l(dVar));
                        break;
                    case 2:
                        return new ypi.e(ypi.h.d, bq.i.b(dVar), bq.i.o(dVar), bq.i.g(dVar));
                    case 3:
                        return new iri.g((iri.j) ((a) this.f201019c).f201016c.get(), new iri.b(), bq.i.f(dVar), bq.i.l(dVar));
                    case 4:
                        cVar = new iri.l(new iri.b(), bq.i.f(dVar), (iri.d) cVar3.f201023g.get());
                        break;
                    case 5:
                        return new iri.d(bq.i.f(dVar));
                    case 6:
                        return new opi.b(bq.i.f(dVar));
                    default:
                        throw new AssertionError(i);
                }
                return cVar;
            case 1:
                m18.a aVar = (m18.a) this.d;
                m18.e eVar3 = aVar.f201253c;
                m18.e eVar4 = (m18.e) this.f201019c;
                u8h.c cVar4 = eVar4.i;
                int i2 = this.f201018b;
                if (i2 == 0) {
                    return a10.b.f((u8h.b) cVar4, "factory");
                }
                if (i2 == 1) {
                    prl.e factory = eVar4.b();
                    z08.d.Companion.getClass();
                    Intrinsics.checkNotNullParameter(factory, "factory");
                    eVar = new s18.e((mk0.a) factory.f239325b, (gte.a) factory.f239326c, (toa.a) factory.d, (ybl.k) factory.e);
                } else {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            return a10.b.g((u8h.b) cVar4, "factory");
                        }
                        if (i2 == 4) {
                            return new t18.w();
                        }
                        throw new AssertionError(i2);
                    }
                    t18.u uVar = new t18.u(new t18.t(eVar3.a()), new ykh.a(), aVar.f201252b, (q1) aVar.f.get(), new q18.i());
                    AllInsightsScreenContract$InputData allInsightsScreenContract$InputData = aVar.f201252b;
                    t18.h hVar = new t18.h(eVar3.c(), aVar.f201252b);
                    t18.w wVar = (t18.w) aVar.f201254g.get();
                    q18.h hVar2 = new q18.h();
                    z0h.d dVarC = ((u8h.b) cVar4).c();
                    s.j(dVarC);
                    y08.a aVar2 = (y08.a) aVar.e.get();
                    oih.j jVarE = ((mkh.s) eVar4.f201268m).e();
                    s.j(jVarE);
                    eVar = new com.revolut.feature.invest.smart_notifications.impl.ui.screen.all_insights.b(uVar, allInsightsScreenContract$InputData, hVar, wVar, hVar2, dVarC, aVar2, jVarE);
                }
                return eVar;
            case 2:
                m18.f fVar = (m18.f) this.d;
                m18.e eVar5 = (m18.e) this.f201019c;
                u8h.c cVar5 = eVar5.i;
                int i3 = this.f201018b;
                if (i3 == 0) {
                    return a10.b.f((u8h.b) cVar5, "factory");
                }
                if (i3 == 1) {
                    return a0k.b.w(eVar5.e(), fVar.f201279b, (a18.c) fVar.f.get());
                }
                if (i3 == 2) {
                    prl.e eVarE = eVar5.e();
                    y18.b.Companion.getClass();
                    return a0k.b.x(eVarE, new a18.e(new FeedFilter.ByAssetFilter(h0.f322473a)));
                }
                if (i3 == 3) {
                    prl.e factory2 = eVar5.b();
                    z08.d.Companion.getClass();
                    Intrinsics.checkNotNullParameter(factory2, "factory");
                    return new s18.e((mk0.a) factory2.f239325b, (gte.a) factory2.f239326c, (toa.a) factory2.d, (ybl.k) factory2.e);
                }
                if (i3 != 4) {
                    if (i3 == 5) {
                        return a10.b.g((u8h.b) cVar5, "factory");
                    }
                    throw new AssertionError(i3);
                }
                m18.e eVar6 = fVar.d;
                x18.x xVar = new x18.x(new a1k.a());
                ykh.a aVar3 = new ykh.a();
                prl.e factory3 = eVar6.e();
                a18.i.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory3, "factory");
                x18.y yVar = new x18.y(xVar, aVar3, new r18.n((q18.c) factory3.f239325b), (q1) fVar.i.get(), new q18.i());
                SmartFeedScreenContract$InputData smartFeedScreenContract$InputData = fVar.f201280c;
                jt0.b bVarC = eVar5.c();
                a18.c cVar6 = (a18.c) fVar.f.get();
                m0k.e eVar7 = (m0k.e) eVar5.o.H.get();
                s.j(eVar7);
                tzg.m mVarT = eVar5.f201270p.t();
                s.j(mVarT);
                ybl.d dVarH = eVar5.f201265h.h();
                s.j(dVarH);
                l3d.h0 h0VarB = eVar5.f201269n.b();
                s.j(h0VarB);
                q18.h hVar3 = new q18.h();
                z0h.d dVarC2 = ((u8h.b) cVar5).c();
                s.j(dVarC2);
                return new com.revolut.feature.invest.smart_notifications.impl.ui.screen.feed.b(yVar, smartFeedScreenContract$InputData, bVarC, cVar6, eVar7, mVarT, dVarH, h0VarB, hVar3, new onh.b(dVarC2), (y08.a) fVar.f201282h.get());
            case 3:
                m2b.v vVar = (m2b.v) this.f201019c;
                m2b.g gVar = (m2b.g) this.d;
                int i5 = this.f201018b;
                switch (i5) {
                    case 0:
                        return kxa.j.k((j60.a) gVar.f201825h.get());
                    case 1:
                        return ehe.n.s((com.revolut.kompot.navigable.a) gVar.f.get(), (rp0.m) gVar.f201824g.get());
                    case 2:
                        return new rp0.m();
                    case 3:
                        return new h5b.l(gVar.f201821a, (h5b.b) gVar.f201826j.get());
                    case 4:
                        h5b.c cVar7 = gVar.f201822b;
                        p2b.j jVarH = vVar.f201923c.h();
                        s.j(jVarH);
                        nlh.b bVarA = vVar.f201929n.a();
                        s.j(bVarA);
                        return new h5b.m(cVar7, jVarH, bVarA);
                    case 5:
                        hbh.j jVarA = vVar.f201928m.a();
                        s.j(jVarA);
                        return hy1.g.k(jVarA, gVar.f201823c, (h1h.b) gVar.f201827l.get());
                    case 6:
                        hbh.j jVarA2 = vVar.f201928m.a();
                        s.j(jVarA2);
                        return hy1.g.l(jVarA2);
                    case 7:
                        f1h.c cVarA = vVar.f201931q.a();
                        s.j(cVarA);
                        return fp8.c.s(cVarA, (f1h.f) gVar.f201829n.get(), (f1h.b) gVar.o.get());
                    case 8:
                        f1h.c cVarA2 = vVar.f201931q.a();
                        s.j(cVarA2);
                        return fp8.c.t(cVarA2);
                    case 9:
                        n nVar = (n) gVar.f201832r.get();
                        CfdCashBalanceControllerContract$InputData cfdCashBalanceControllerContract$InputData = gVar.d;
                        m2b.v vVar2 = gVar.e;
                        ybl.d dVarH2 = vVar2.e.h();
                        s.j(dVarH2);
                        y1b.a aVarD = vVar2.f201923c.d();
                        s.j(aVarD);
                        ybl.k kVarD = vVar2.f201922b.d();
                        s.j(kVarD);
                        h3b.s sVar = new h3b.s(cfdCashBalanceControllerContract$InputData, dVarH2, aVarD, kVarD);
                        h3b.x xVar2 = new h3b.x();
                        j60.a aVar4 = (j60.a) gVar.f201825h.get();
                        h1h.b bVar = (h1h.b) gVar.f201827l.get();
                        h5b.b bVar2 = (h5b.b) gVar.f201826j.get();
                        n4f.a aVar5 = vVar.d;
                        m4f.b bVar3 = new m4f.b();
                        gte.a aVarB = vVar.f201927l.b();
                        s.j(aVarB);
                        iih.a aVar6 = (iih.a) vVar.f201930p.f263842g.get();
                        s.j(aVar6);
                        return new h3b.v(nVar, cfdCashBalanceControllerContract$InputData, sVar, xVar2, aVar4, bVar, bVar2, bVar3, aVarB, aVar6);
                    case 10:
                        h3b.a0 a0Var = new h3b.a0();
                        h3b.y yVar2 = new h3b.y();
                        h5b.d dVar2 = (h5b.d) gVar.f201831q.get();
                        gte.a aVarB2 = gVar.e.f201927l.b();
                        s.j(aVarB2);
                        return new bof.r(a0Var, yVar2, dVar2, new z(aVarB2));
                    case 11:
                        return new h5b.n();
                    default:
                        throw new AssertionError(i5);
                }
            case 4:
                m2b.v vVar3 = (m2b.v) this.f201019c;
                r7d.l lVar = vVar3.f201937y;
                m2b.h hVar4 = (m2b.h) this.d;
                int i6 = this.f201018b;
                if (i6 == 0) {
                    return h7d.d.a(hVar4.f201834a, (i7d.o) hVar4.d.get(), lVar.d());
                }
                if (i6 == 1) {
                    return h7d.f.a(lVar.d(), Optional.empty());
                }
                if (i6 != 2) {
                    throw new AssertionError(i6);
                }
                CfdCashTradeDetailsContract$InputData cfdCashTradeDetailsContract$InputData = hVar4.f201835b;
                return new j3b.j(cfdCashTradeDetailsContract$InputData, new j3b.k(cfdCashTradeDetailsContract$InputData, new c5b.e(hVar4.f201836c.o.s()), new wfl.b()), (i7d.o) hVar4.d.get(), vVar3.o.f());
            case 5:
                m2b.v vVar4 = (m2b.v) this.f201019c;
                l70.e eVar8 = vVar4.f201932r;
                m2b.i iVar = (m2b.i) this.d;
                int i21 = this.f201018b;
                switch (i21) {
                    case 0:
                        return kxa.j.k((j60.a) iVar.d.get());
                    case 1:
                        return ehe.n.s((com.revolut.kompot.navigable.a) iVar.f201838b.get(), (rp0.m) iVar.f201839c.get());
                    case 2:
                        return new rp0.m();
                    case 3:
                        n60.b bVar4 = (n60.b) iVar.f.get();
                        o5k.i.m(bVar4);
                        return bVar4;
                    case 4:
                        return o5k.i.r((com.revolut.kompot.navigable.a) iVar.f201838b.get());
                    case 5:
                        n60.a aVar7 = (n60.a) iVar.f201841h.get();
                        o5k.i.l(aVar7);
                        return aVar7;
                    case 6:
                        return o5k.i.q((com.revolut.kompot.navigable.a) iVar.f201838b.get());
                    case 7:
                        l4i.a aVar8 = new l4i.a();
                        j60.a aVar9 = (j60.a) iVar.d.get();
                        o3b.b bVar5 = new o3b.b();
                        q0 q0Var = new q0(new q2b.b());
                        o3b.d dVar3 = new o3b.d(new q2b.b());
                        n3b.b bVar6 = new n3b.b();
                        wj0.a aVarI = ((nj0.d) vVar4.v).i();
                        s.j(aVarI);
                        o3b.y yVar3 = iVar.f201837a;
                        n60.a aVar10 = (n60.a) iVar.f201841h.get();
                        n60.b bVar7 = (n60.b) iVar.f.get();
                        o3b.z zVar = (o3b.z) iVar.f201842j.get();
                        y1b.a aVarD2 = vVar4.f201923c.d();
                        s.j(aVarD2);
                        u80.t tVarU = eVar8.u();
                        s.j(tVarU);
                        ybl.b bVarB = vVar4.e.b();
                        s.j(bVarB);
                        u0 u0VarI = vVar4.f201933s.i();
                        s.j(u0VarI);
                        return new n0(aVar8, aVar9, bVar5, q0Var, dVar3, bVar6, aVarI, yVar3, aVar10, bVar7, zVar, aVarD2, tVarU, bVarB, u0VarI);
                    case 8:
                        q2b.b bVar8 = new q2b.b();
                        qd0.b bVarN = eVar8.n();
                        s.j(bVarN);
                        return new f0(bVar8, bVarN);
                    default:
                        throw new AssertionError(i21);
                }
            case 6:
                m2b.v vVar5 = (m2b.v) this.f201019c;
                m2b.k kVar = (m2b.k) this.d;
                int i22 = this.f201018b;
                if (i22 != 0) {
                    if (i22 == 1) {
                        return new u3b.g((n) kVar.d.get(), kVar.f201847b, (h5b.b) kVar.f201848c.get(), new m4f.b());
                    }
                    if (i22 == 2) {
                        return new u3b.i();
                    }
                    throw new AssertionError(i22);
                }
                h5b.c cVar8 = kVar.f201846a;
                p2b.j jVarH2 = vVar5.f201923c.h();
                s.j(jVarH2);
                nlh.b bVarA2 = vVar5.f201929n.a();
                s.j(bVarA2);
                return new h5b.m(cVar8, jVarH2, bVarA2);
            case 7:
                m2b.m mVar = (m2b.m) this.d;
                m2b.v vVar6 = (m2b.v) this.f201019c;
                trl.a aVar11 = vVar6.f201933s;
                int i32 = this.f201018b;
                switch (i32) {
                    case 0:
                        return kxa.j.m((j60.a) mVar.f.get());
                    case 1:
                        return y.r((com.revolut.kompot.navigable.a) mVar.d.get(), (rp0.m) mVar.e.get());
                    case 2:
                        return new rp0.m();
                    case 3:
                        i90.b bVar9 = new i90.b();
                        w2b.d dVar4 = mVar.f201851a;
                        t2b.c cVar9 = (t2b.c) mVar.f201855h.get();
                        s2b.b bVar10 = (s2b.b) vVar6.f201923c.f201814t.get();
                        s.j(bVar10);
                        o7.b bVarQ = mVar.q();
                        a4b.h hVar5 = new a4b.h();
                        ybl.d dVarH3 = mVar.f201852b.e.h();
                        s.j(dVarH3);
                        toh.d dVar5 = new toh.d(bVarQ, hVar5, dVarH3);
                        vrl.b bVar11 = (vrl.b) aVar11.Q.get();
                        s.j(bVar11);
                        return new com.revolut.feature.retail.cfd.impl.flows.order.c(bVar9, dVar4, cVar9, bVar10, dVar5, bVar11);
                    case 4:
                        x2b.b.Companion.getClass();
                        return new t2b.c(0);
                    case 5:
                        w2b.d dVar6 = mVar.f201851a;
                        t2b.c cVar10 = (t2b.c) mVar.f201855h.get();
                        u2b.a aVar12 = (u2b.a) vVar6.F.get();
                        p2b.l lVar2 = (p2b.l) vVar6.G.get();
                        vrl.s sVarD = aVar11.d();
                        s.j(sVarD);
                        return new w2b.h(dVar6, cVar10, aVar12, lVar2, sVarD);
                    case 6:
                        w2b.d dVar7 = mVar.f201851a;
                        t2b.c cVar11 = (t2b.c) mVar.f201855h.get();
                        vrl.s sVarD2 = aVar11.d();
                        s.j(sVarD2);
                        return new w2b.a(dVar7, cVar11, sVarD2);
                    case 7:
                        vrl.s sVarD3 = aVar11.d();
                        s.j(sVarD3);
                        return new t2b.f(sVarD3, (p2b.l) vVar6.G.get(), (u2b.a) vVar6.F.get());
                    default:
                        throw new AssertionError(i32);
                }
            case 8:
                m2b.o oVar = (m2b.o) this.d;
                m2b.v vVar7 = (m2b.v) this.f201019c;
                r7d.l lVar3 = vVar7.f201937y;
                int i33 = this.f201018b;
                if (i33 == 0) {
                    return h7d.d.a(oVar.f201875a, (i7d.o) oVar.d.get(), lVar3.d());
                }
                if (i33 == 1) {
                    return h7d.f.a(lVar3.d(), Optional.empty());
                }
                if (i33 != 2) {
                    throw new AssertionError(i33);
                }
                e4b.i iVar2 = oVar.f201876b;
                e4b.m mVar2 = new e4b.m(new c5b.e(oVar.f201877c.o.s()), new wfl.b());
                y2f.a aVarB3 = vVar7.z.b();
                s.j(aVarB3);
                return new e4b.q(iVar2, mVar2, aVarB3, vVar7.u.e(), (i7d.o) oVar.d.get(), vVar7.o.f());
            case 9:
                m2b.v vVar8 = (m2b.v) this.f201019c;
                m2b.p pVar = (m2b.p) this.d;
                y2b.e eVar9 = pVar.f201878a;
                int i43 = this.f201018b;
                switch (i43) {
                    case 0:
                        return kxa.j.m((j60.a) pVar.f.get());
                    case 1:
                        return y.r((com.revolut.kompot.navigable.a) pVar.d.get(), (rp0.m) pVar.e.get());
                    case 2:
                        return new rp0.m();
                    case 3:
                        return new com.revolut.feature.retail.cfd.impl.flows.position.a(eVar9);
                    case 4:
                        ybl.d dVarH4 = vVar8.e.h();
                        s.j(dVarH4);
                        cVar2 = new z2b.c(eVar9, dVarH4, (z2b.b) pVar.i.get(), pVar.s());
                        break;
                    case 5:
                        p2b.j jVarH3 = vVar8.f201923c.h();
                        s.j(jVarH3);
                        cVar2 = new z2b.b(eVar9, jVarH3, pVar.s());
                        break;
                    case 6:
                        vrl.s sVarD4 = vVar8.f201933s.d();
                        s.j(sVarD4);
                        return new t2b.f(sVarD4, (p2b.l) vVar8.G.get(), (u2b.a) vVar8.F.get());
                    default:
                        throw new AssertionError(i43);
                }
                return cVar2;
            case 10:
                m2b.v vVar9 = (m2b.v) this.f201019c;
                m2b.t tVar = (m2b.t) this.d;
                int i59 = this.f201018b;
                switch (i59) {
                    case 0:
                        return kxa.j.k((j60.a) tVar.d.get());
                    case 1:
                        return ehe.n.s((com.revolut.kompot.navigable.a) tVar.f201899b.get(), (rp0.m) tVar.f201900c.get());
                    case 2:
                        return new rp0.m();
                    case 3:
                        i5b.b componentsProvider = (i5b.b) vVar9.D.get();
                        jx0.a view = tVar.f201898a;
                        h2b.h.Companion.getClass();
                        Intrinsics.checkNotNullParameter(componentsProvider, "componentsProvider");
                        Intrinsics.checkNotNullParameter(view, "view");
                        componentsProvider.getClass();
                        Intrinsics.checkNotNullParameter(view, "view");
                        return new i5b.h(view, componentsProvider.f158796a);
                    case 4:
                        i5b.b componentsProvider2 = (i5b.b) vVar9.D.get();
                        h2b.h.Companion.getClass();
                        Intrinsics.checkNotNullParameter(componentsProvider2, "componentsProvider");
                        return componentsProvider2.f158796a;
                    case 5:
                        return new o4b.b((n) tVar.i.get(), (h2b.d) tVar.f201901g.get());
                    case 6:
                        return new i3g.k((i5b.k) tVar.f201902h.get());
                    case 7:
                        i5b.b componentsProvider3 = (i5b.b) vVar9.D.get();
                        h2b.h.Companion.getClass();
                        Intrinsics.checkNotNullParameter(componentsProvider3, "componentsProvider");
                        return componentsProvider3.f158797b;
                    default:
                        throw new AssertionError(i59);
                }
            case 11:
                m2b.v vVar10 = (m2b.v) this.f201019c;
                m2b.u uVar2 = (m2b.u) this.d;
                int i66 = this.f201018b;
                switch (i66) {
                    case 0:
                        return kxa.j.k((j60.a) uVar2.f201911m.get());
                    case 1:
                        return ehe.n.s((com.revolut.kompot.navigable.a) uVar2.k.get(), (rp0.m) uVar2.f201910l.get());
                    case 2:
                        return new rp0.m();
                    case 3:
                        return efk.j.d((dtl.a) uVar2.f201913p.get());
                    case 4:
                        return efk.j.q(vVar10.f.a(), uVar2.f201904a, (dtl.b) uVar2.o.get());
                    case 5:
                        return efk.j.r(vVar10.f.a());
                    case 6:
                        return c21.l.j(vVar10.f201923c.i(), (b2b.f) uVar2.F.get());
                    case 7:
                        n nVar2 = (n) uVar2.f201919x.get();
                        gte.a aVarB4 = vVar10.f201927l.b();
                        s.j(aVarB4);
                        CfdTradingHomeScreenContract$InputData cfdTradingHomeScreenContract$InputData = uVar2.f201906c;
                        ybl.d dVarH5 = vVar10.e.h();
                        s.j(dVarH5);
                        h1h.b bVar12 = (h1h.b) uVar2.f201920y.get();
                        fsl.m mVarB = vVar10.f201925h.b();
                        s.j(mVarB);
                        h5b.b bVar13 = (h5b.b) uVar2.z.get();
                        t2b.h hVar6 = (t2b.h) vVar10.E.get();
                        zhh.a aVar13 = (zhh.a) vVar10.f201930p.f.get();
                        s.j(aVar13);
                        xjh.b bVar14 = (xjh.b) uVar2.A.get();
                        r3b.y yVar4 = (r3b.y) uVar2.B.get();
                        ybl.k kVarD2 = vVar10.f201922b.d();
                        s.j(kVarD2);
                        o5d.a aVar14 = (o5d.a) uVar2.D.get();
                        tzg.m mVarT2 = vVar10.o.t();
                        s.j(mVarT2);
                        d1h.e eVar10 = (d1h.e) uVar2.E.get();
                        f2b.b bVar15 = (f2b.b) vVar10.f201923c.f201810p.get();
                        s.j(bVar15);
                        return new com.revolut.feature.retail.cfd.impl.screens.home.a(nVar2, aVarB4, cfdTradingHomeScreenContract$InputData, dVarH5, bVar12, mVarB, bVar13, hVar6, aVar13, bVar14, yVar4, kVarD2, aVar14, mVarT2, eVar10, bVar15);
                    case 8:
                        t3b.a aVar15 = (t3b.a) uVar2.f201915r.get();
                        t3b.f fVar2 = (t3b.f) uVar2.f201916s.get();
                        fsl.k kVar2 = (fsl.k) uVar2.f201917t.get();
                        t3b.l lVar4 = (t3b.l) uVar2.v.get();
                        d1h.h hVar7 = (d1h.h) uVar2.f201918w.get();
                        s5d.a aVar16 = vVar10.k;
                        qVar = new r3b.q(aVar15, fVar2, kVar2, lVar4, hVar7, new t5d.d());
                        return qVar;
                    case 9:
                        hih.e eVar11 = (hih.e) ((mkh.s) vVar10.f201924g).f206432x0.get();
                        s.j(eVar11);
                        eVar2 = new t3b.e(eVar11);
                        return eVar2;
                    case 10:
                        d2b.a aVarC = uVar2.f201909j.f201923c.c();
                        s.j(aVarC);
                        t3b.k kVar3 = new t3b.k(aVarC);
                        m2b.e eVar12 = vVar10.f201923c;
                        m2b.e eVar13 = vVar10.f201923c;
                        k5b.d dVarG = eVar12.g();
                        s.j(dVarG);
                        d2b.a aVarC2 = eVar13.c();
                        s.j(aVarC2);
                        eVar2 = new t3b.i(kVar3, dVarG, aVarC2, eVar13.j(), ((mkh.s) vVar10.f201924g).k());
                        return eVar2;
                    case 11:
                        fsl.t tVarA = vVar10.f201925h.a();
                        s.j(tVarA);
                        return fp8.c.r(tVarA, vVar10.i.a());
                    case 12:
                        return new t3b.l((h5b.d) uVar2.u.get());
                    case 13:
                        return new h5b.n();
                    case 14:
                        return kii.e.k((u8h.b) vVar10.f201926j);
                    case 15:
                        hbh.j jVarA3 = vVar10.f201928m.a();
                        s.j(jVarA3);
                        return hy1.g.l(jVarA3);
                    case 16:
                        h5b.c cVar12 = uVar2.d;
                        p2b.j jVarH4 = vVar10.f201923c.h();
                        s.j(jVarH4);
                        nlh.b bVarA3 = vVar10.f201929n.a();
                        s.j(bVarA3);
                        qVar = new h5b.m(cVar12, jVarH4, bVarA3);
                        return qVar;
                    case 17:
                        vhh.a aVar17 = vVar10.f201924g;
                        ske.a aVar18 = vVar10.f201930p;
                        xjh.a factory4 = (xjh.a) ((mkh.s) aVar17).f206430w0.get();
                        s.j(factory4);
                        iih.a wealthActionTransferDestinationProvider = (iih.a) aVar18.f263842g.get();
                        s.j(wealthActionTransferDestinationProvider);
                        zhh.a cfdAccountActionsProvider = (zhh.a) aVar18.f.get();
                        s.j(cfdAccountActionsProvider);
                        Intrinsics.checkNotNullParameter(factory4, "factory");
                        Intrinsics.checkNotNullParameter(wealthActionTransferDestinationProvider, "wealthActionTransferDestinationProvider");
                        Intrinsics.checkNotNullParameter(cfdAccountActionsProvider, "cfdAccountActionsProvider");
                        return factory4.a(wealthActionTransferDestinationProvider, cfdAccountActionsProvider.b(), r0.g());
                    case 18:
                        eVar2 = new r3b.y(vVar10.f201923c.a(), vVar10.o.d());
                        return eVar2;
                    case 19:
                        return n57.a.u((o5d.c) uVar2.C.get());
                    case 20:
                        return n57.a.w(vVar10.k.a(), uVar2.e);
                    case 21:
                        return kii.e.j((u8h.b) vVar10.f201926j, "factory");
                    case 22:
                        return n57.a.t((o5d.c) uVar2.C.get());
                    case 23:
                        hbh.j jVarA4 = vVar10.f201928m.a();
                        s.j(jVarA4);
                        return hy1.g.k(jVarA4, uVar2.f201907g, (h1h.b) uVar2.f201920y.get());
                    case 24:
                        f1h.c cVarA3 = vVar10.f201931q.a();
                        s.j(cVarA3);
                        return fp8.c.s(cVarA3, (f1h.f) uVar2.J.get(), (f1h.b) uVar2.K.get());
                    case 25:
                        f1h.c cVarA4 = vVar10.f201931q.a();
                        s.j(cVarA4);
                        return fp8.c.t(cVarA4);
                    case 26:
                        fsl.t tVarA2 = vVar10.f201925h.a();
                        s.j(tVarA2);
                        return fp8.c.p(tVarA2, uVar2.f201908h, (fsl.i) uVar2.M.get());
                    case 27:
                        fsl.t tVarA3 = vVar10.f201925h.a();
                        s.j(tVarA3);
                        s3b.d.Companion.getClass();
                        return fp8.c.q(tVarA3, new s3b.b());
                    case 28:
                        return ige.d.m(vVar10.i.b(), (htl.g) uVar2.O.get(), (htl.d) uVar2.P.get());
                    case 29:
                        return ige.d.n(vVar10.i.b());
                    case 30:
                        return new h5b.l(uVar2.i, (h5b.b) uVar2.z.get());
                    case 31:
                        xjh.b actionsHandler = (xjh.b) uVar2.A.get();
                        Intrinsics.checkNotNullParameter(actionsHandler, "actionsHandler");
                        return actionsHandler.f306529a;
                    case 32:
                        return efk.j.e((dtl.b) uVar2.o.get());
                    case 33:
                        return n57.a.v((o5d.c) uVar2.C.get());
                    case 34:
                        return n57.a.g((o5d.c) uVar2.C.get());
                    default:
                        throw new AssertionError(i66);
                }
            case 12:
                m2b.v vVar11 = (m2b.v) this.f201019c;
                m2b.w wVar2 = (m2b.w) this.d;
                int i74 = this.f201018b;
                if (i74 == 0) {
                    return kxa.j.m((j60.a) wVar2.f.get());
                }
                if (i74 == 1) {
                    return y.r((com.revolut.kompot.navigable.a) wVar2.d.get(), (rp0.m) wVar2.e.get());
                }
                if (i74 == 2) {
                    return new rp0.m();
                }
                if (i74 != 3) {
                    throw new AssertionError(i74);
                }
                CfdWithdrawFlowContract$InputData cfdWithdrawFlowContract$InputData = wVar2.f201938a;
                ybl.d dVarH6 = vVar11.e.h();
                s.j(dVarH6);
                p2b.j jVarH5 = vVar11.f201923c.h();
                s.j(jVarH5);
                i90.b bVar16 = new i90.b();
                gah.f factory5 = ((u8h.b) wVar2.f201939b.f201926j).a();
                s.j(factory5);
                b3b.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory5, "factory");
                return new com.revolut.feature.retail.cfd.impl.flows.withdraw.a(cfdWithdrawFlowContract$InputData, dVarH6, jVarH5, bVar16, new a3b.g(new gah.g()), (j60.a) wVar2.f.get(), ((u8h.b) vVar11.f201926j).f());
            case 13:
                m2b.v vVar12 = (m2b.v) this.f201019c;
                u8h.c cVar13 = vVar12.f201926j;
                m2b.x xVar3 = (m2b.x) this.d;
                CfdWithdrawScreenContract$InputData cfdWithdrawScreenContract$InputData = xVar3.f201944b;
                int i92 = this.f201018b;
                switch (i92) {
                    case 0:
                        return kii.e.j((u8h.b) cVar13, "factory");
                    case 1:
                        n nVar3 = (n) xVar3.i.get();
                        w80.b bVar17 = (w80.b) xVar3.e.get();
                        p2b.j jVarH6 = vVar12.f201923c.h();
                        s.j(jVarH6);
                        jVar = new u4b.j(nVar3, cfdWithdrawScreenContract$InputData, bVar17, jVarH6, (x4b.d) xVar3.f201948j.get(), (d1h.e) xVar3.d.get());
                        break;
                    case 2:
                        jVar = new u4b.k(cfdWithdrawScreenContract$InputData, (w80.b) xVar3.e.get(), (w4b.a) xVar3.f.get(), (w4b.c) xVar3.f201946g.get(), (d1h.h) xVar3.f201947h.get());
                        break;
                    case 3:
                        qd0.b languageProvider = vVar12.f201932r.n();
                        s.j(languageProvider);
                        v4b.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
                        return v80.b.b(languageProvider, false, false, 58);
                    case 4:
                        return new w4b.b();
                    case 5:
                        return new w4b.c();
                    case 6:
                        return kii.e.k((u8h.b) cVar13);
                    case 7:
                        return new x4b.d();
                    default:
                        throw new AssertionError(i92);
                }
                return jVar;
            case 14:
                m3c.a aVar19 = (m3c.a) this.d;
                j jVar2 = (j) this.f201019c;
                jpj.d dVar8 = jVar2.f202347b;
                int i96 = this.f201018b;
                if (i96 == 0) {
                    npj.a factory6 = new npj.a();
                    x3c.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(factory6, "factory");
                    npj.b bVar18 = npj.b.f218232l;
                    s.k(bVar18);
                    return bVar18;
                }
                if (i96 != 1) {
                    throw new AssertionError(i96);
                }
                b0 b0Var = new b0(dVar8.f177302c.a());
                dl2.a aVarA = dVar8.a();
                kpj.e eVarB = dVar8.b();
                n3c.a aVar20 = (n3c.a) jVar2.f202353m.get();
                jul.o oVar2 = new jul.o(dVar8.b(), dVar8.a());
                mpj.b bVar19 = new mpj.b();
                vh1.d dVar9 = (vh1.d) dVar8.f.f184283g.get();
                s.j(dVar9);
                o3c.c cVar14 = new o3c.c(dVar9);
                f3c.a aVar21 = (f3c.a) aVar19.f202321a.get();
                z3c.a accountItemsMapper = new z3c.a();
                Intrinsics.checkNotNullParameter(accountItemsMapper, "accountItemsMapper");
                y3c.d paymentMethodMapper = new y3c.d();
                y3c.b deliveryMapper = new y3c.b();
                i productMapper = new i();
                Intrinsics.checkNotNullParameter(productMapper, "productMapper");
                z3c.c cartItemMapper = new z3c.c();
                Intrinsics.checkNotNullParameter(cartItemMapper, "cartItemMapper");
                y3c.h userCartItemsMapper = new y3c.h();
                y3c.e priceMapper = new y3c.e();
                y3c.a buttonMapper = new y3c.a();
                Intrinsics.checkNotNullParameter(paymentMethodMapper, "paymentMethodMapper");
                Intrinsics.checkNotNullParameter(deliveryMapper, "deliveryMapper");
                Intrinsics.checkNotNullParameter(userCartItemsMapper, "userCartItemsMapper");
                Intrinsics.checkNotNullParameter(priceMapper, "priceMapper");
                Intrinsics.checkNotNullParameter(buttonMapper, "buttonMapper");
                return new com.revolut.feature.revolut_shop.ui.screen.checkout.a(b0Var, aVarA, eVarB, aVar20, oVar2, bVar19, cVar14, aVar21, new w3c.t());
            case 15:
                m3c.b bVar20 = (m3c.b) this.d;
                jpj.d dVar10 = ((j) this.f201019c).f202347b;
                int i99 = this.f201018b;
                if (i99 != 0) {
                    if (i99 != 1) {
                        throw new AssertionError(i99);
                    }
                    f4c.a addressItemMapper = new f4c.a();
                    Intrinsics.checkNotNullParameter(addressItemMapper, "addressItemMapper");
                    return new d4c.i();
                }
                DeliveryAddressScreenContract$InputData deliveryAddressScreenContract$InputData = bVar20.f202323a;
                jul.o oVar3 = new jul.o(dVar10.b(), dVar10.a());
                mpj.b bVar21 = new mpj.b();
                vh1.d dVar11 = (vh1.d) dVar10.f.f184283g.get();
                s.j(dVar11);
                return new com.revolut.feature.revolut_shop.ui.screen.deliveryaddress.a(deliveryAddressScreenContract$InputData, oVar3, bVar21, new o3c.c(dVar11), (n) bVar20.f202324b.get());
            case 16:
                j jVar3 = (j) this.f201019c;
                int i100 = this.f201018b;
                if (i100 == 0) {
                    return new u3c.o((n) ((m3c.c) this.d).f202326a.get(), (e3c.a) jVar3.i.get(), jVar3.f202347b.a());
                }
                if (i100 != 1) {
                    throw new AssertionError(i100);
                }
                i productMapper2 = new i();
                Intrinsics.checkNotNullParameter(productMapper2, "productMapper");
                return new u3c.r();
            case 17:
                return a();
            case 18:
                return b();
            case 19:
                return c();
            case 20:
                return d();
            case 21:
                return e();
            case 22:
                return f();
            case 23:
                return g();
            case 24:
                return h();
            case 25:
                return i();
            case 26:
                return j();
            case 27:
                return k();
            case 28:
                return l();
            default:
                mj3.d dVar12 = (mj3.d) this.f201019c;
                mj3.f fVar3 = (mj3.f) this.d;
                int i101 = this.f201018b;
                if (i101 != 0) {
                    if (i101 == 1) {
                        g80.c cVarY = dVar12.e.y();
                        s.j(cVarY);
                        return new pj3.u(cVarY, (f01.a) fVar3.e.get(), fVar3.f205917c);
                    }
                    if (i101 != 2) {
                        throw new AssertionError(i101);
                    }
                    ViewController controller = fVar3.f205916b;
                    qj3.a.Companion.getClass();
                    Intrinsics.checkNotNullParameter(controller, "controller");
                    return new f01.c(controller.m2());
                }
                CmsStoriesScreenContract$InputData cmsStoriesScreenContract$InputData = fVar3.f205915a;
                jj3.e eVar14 = (jj3.e) dVar12.f205912j.get();
                wli.x xVarD = ((s41.a) dVar12.d).d();
                mj3.d dVar13 = fVar3.d;
                e eVar15 = dVar13.f205913l;
                l70.e eVar16 = dVar13.e;
                qz0.j jVar4 = (qz0.j) eVar15.get();
                lx0.j jVarA5 = kqi.b.a((Context) dVar13.k.get());
                g80.c cVarY2 = eVar16.y();
                s.j(cVarY2);
                z70.a aVarF = eVar16.f();
                s.j(aVarF);
                return new pj3.r(cmsStoriesScreenContract$InputData, eVar14, xVarD, new nj3.b(jVar4, jVarA5, cVarY2, aVarF), (n) fVar3.f.get());
        }
    }
}
