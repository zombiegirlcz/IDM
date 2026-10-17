package iwb;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import com.google.common.collect.ImmutableSet;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen.ShowCardPinScreenContract$InputData;
import com.revolut.feature.card_label.ui.screen.card_label_screen.CardLabelScreenContract$InputData;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.flow.CryptoTradeFlowContract$InputData;
import com.revolut.feature.payments.splitbill.impl.ui_new.SplitBillsFlowContract$InputData;
import com.revolut.feature.payments.splitbill.impl.ui_new.recurring_split.RecurringSplitFlowContract$InputData;
import com.revolut.feature.rev_points.giftcards.api.navigation.descriptor.RevPointsGiftcardsCheckoutController$InputData;
import com.revolut.feature.rev_points.giftcards.impl.ui.screen.giftcarddetails.RevPointsGiftcardDetailsScreenContract$InputData;
import com.revolut.feature.rev_points.giftcards.impl.ui.screen.giftcardshome.RevPointsGiftcardsHomeScreenContract$InputData;
import com.revolut.feature_exchange.impl.network.service.FxService;
import com.revolut.feature_exchange.impl.ui.exchange.order_summary.OrderSummaryActivity;
import com.revolut.feature_exchange.impl.ui.exchange.order_summary.OrderSummaryContract$Configuration;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.retail.common.ui.activity.delegate.keyboardsuggestions.KeyboardSuggestionsDelegate;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import efm.c0;
import f2i.z;
import java.util.Collection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.Intrinsics;
import lp.l9;
import m1i.e0;
import m1i.h0;
import m1i.i1;
import ox5.o0;
import ox5.x0;
import rp0.g1;
import rp0.l0;
import sgm.e3;
import u2i.y;
import us6.w3;
import z1i.b0;
import z1i.d0;
import z1i.i0;
import zxb.k0;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f169006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f169007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f169008c;
    public final Object d;

    public /* synthetic */ b(Object obj2, Object obj3, int i, int i2) {
        this.f169006a = i2;
        this.f169007b = obj2;
        this.d = obj3;
        this.f169008c = i;
    }

    private final Object a() {
        j1i.a aVar = (j1i.a) this.f169007b;
        j1i.c cVar = (j1i.c) this.d;
        int i = this.f169008c;
        switch (i) {
            case 0:
                cVar.getClass();
                return new cn.d(ImmutableSet.copyOf((Collection) dn.b.a()), (cn.e) aVar.Y.get(), aVar.l());
            case 1:
                um.c cVar2 = (um.c) aVar.Z.get();
                cVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(6);
                j1i.a aVar2 = cVar.f170510c;
                builderBuilderWithExpectedSize.add(aVar2.m0.get());
                builderBuilderWithExpectedSize.add(aVar2.h());
                builderBuilderWithExpectedSize.add(aVar2.a());
                builderBuilderWithExpectedSize.add(aVar2.n());
                builderBuilderWithExpectedSize.addAll((Iterable) in.g.a());
                builderBuilderWithExpectedSize.add(new jn.d(e4m.b.a(cVar.e)));
                return new in.e(cVar2, builderBuilderWithExpectedSize.build(), aVar.l());
            case 2:
                return bq.i.t(cVar.f170508a);
            case 3:
                cVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize2 = ImmutableSet.builderWithExpectedSize(3);
                builderBuilderWithExpectedSize2.addAll((Iterable) kn.g.a());
                builderBuilderWithExpectedSize2.add(cVar.f170511g.get());
                builderBuilderWithExpectedSize2.add(new kn.h(e4m.b.a(cVar.i)));
                return new kn.e(builderBuilderWithExpectedSize2.build(), (ym.d) aVar.f170468d0.get(), aVar.l());
            case 4:
                return new zm.a();
            case 5:
                return new tpi.i((rpi.c) cVar.f170512h.get(), gsi.c.a(cVar.f170508a));
            case 6:
                return new rpi.b(bq.i.b(cVar.f170508a));
            case 7:
                cVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize3 = ImmutableSet.builderWithExpectedSize(2);
                builderBuilderWithExpectedSize3.addAll((Iterable) hn.g.a());
                builderBuilderWithExpectedSize3.add(cVar.f170510c.n());
                return new hn.d(builderBuilderWithExpectedSize3.build(), (hn.h) aVar.f170478n0.get(), (npi.f) cVar.k.get());
            case 8:
                Context contextI = bq.i.i(cVar.f170508a);
                BaseDelegatesActivity baseDelegatesActivityF = bq.i.f(cVar.f170508a);
                t70.g gVarO = aVar.f170473j.o();
                vc.s.j(gVarO);
                return new npi.c(contextI, baseDelegatesActivityF, gVarO);
            case 9:
                return new en.c(ImmutableSet.of((ln.d) cVar.f170510c.f170479o0.get()), bq.i.l(cVar.f170508a));
            case 10:
                return new gn.c((lpi.e) cVar.f170516n.get(), (sm.e) aVar.p0.get(), ImmutableSet.copyOf((Collection) gn.e.a()), aVar.l());
            case 11:
                return new lpi.b(bq.i.i(cVar.f170508a), bq.i.j(cVar.f170508a));
            case 12:
                cVar.getClass();
                return new in.e(ImmutableSet.copyOf((Collection) pm.b.a()), (om.c) aVar.q0.get(), aVar.l());
            case 13:
                return kpi.f.a();
            case 14:
                return new rpi.h(bq.i.b(cVar.f170508a));
            case 15:
                return new iri.g((iri.j) aVar.X.get(), (iri.m) aVar.f170466b0.get(), bq.i.f(cVar.f170508a), bq.i.l(cVar.f170508a));
            case 16:
                return new iri.l((iri.m) aVar.f170466b0.get(), bq.i.f(cVar.f170508a), (iri.d) cVar.f170521t.get());
            case 17:
                return new iri.d(bq.i.f(cVar.f170508a));
            case 18:
                return new opi.b(bq.i.f(cVar.f170508a));
            case 19:
                cVar.getClass();
                vpi.c cVar3 = vpi.d.Companion;
                return new vpi.b(bq.i.b(cVar.f170508a));
            case 20:
                cVar.getClass();
                xoi.d dVar = cVar.f170508a;
                return new ypi.e(ypi.h.d, bq.i.b(dVar), bq.i.o(dVar), bq.i.g(dVar));
            case 21:
                cqi.h hVar = (cqi.h) cVar.f170524y.get();
                an.a aVar3 = (an.a) aVar.f170483r0.get();
                ImmutableSet.Builder builderBuilderWithExpectedSize4 = ImmutableSet.builderWithExpectedSize(2);
                builderBuilderWithExpectedSize4.add(cVar.f170510c.k());
                builderBuilderWithExpectedSize4.addAll((Iterable) bn.b.a());
                return new an.q(hVar, aVar3, builderBuilderWithExpectedSize4.build(), aVar.l());
            case 22:
                return new cqi.j(bq.i.f(cVar.f170508a));
            case 23:
                return new dqi.g(bq.i.b(cVar.f170508a), cVar.f170509b);
            case 24:
                return new k3l.d(bq.i.b(cVar.f170508a));
            case 25:
                return new KeyboardSuggestionsDelegate(bq.i.b(cVar.f170508a));
            case 26:
                cVar.getClass();
                return new g3l.c(ImmutableSet.copyOf((Collection) g3l.f.a()), (g3l.g) aVar.f170464a0.get(), (k3l.b) cVar.B.get(), aVar.l());
            case 27:
                return new wm.l((opi.d) cVar.v.get(), (wm.a) aVar.f170487t0.get(), ImmutableSet.copyOf((Collection) xm.b.a()), aVar.l());
            case 28:
                vpi.e eVar = (vpi.e) cVar.f170522w.get();
                m1i.m mVar = (m1i.m) aVar.f170485s0.get();
                m1i.k kVar = (m1i.k) aVar.l0.get();
                ypi.i iVar = (ypi.i) cVar.f170523x.get();
                opi.d dVar2 = (opi.d) cVar.v.get();
                w80.b bVarJ = aVar.f170473j.j();
                vc.s.j(bVarJ);
                tpi.j jVar = (tpi.j) cVar.i.get();
                f9b.f fVar = (f9b.f) cVar.e.get();
                cu8.a aVar4 = (cu8.a) cVar.F.get();
                rpi.c cVar4 = (rpi.c) cVar.f170512h.get();
                n2i.a aVar5 = (n2i.a) cVar.H.get();
                pri.f fVarD = bq.i.d(cVar.f170508a);
                j1i.a aVar6 = cVar.f170510c;
                m1i.k kVar2 = (m1i.k) aVar6.l0.get();
                m1i.m mVar2 = (m1i.m) aVar6.f170485s0.get();
                tpi.j jVar2 = (tpi.j) cVar.i.get();
                f9b.f fVar2 = (f9b.f) cVar.e.get();
                k3l.b bVar = (k3l.b) cVar.B.get();
                ttd.a aVarH = aVar6.f170488w.f249364b.h();
                gte.a aVarB = aVar6.f170475l.b();
                vc.s.j(aVarB);
                h0 h0Var = new h0(aVarB, aVar6.I.a(), aVarH);
                npi.a aVar7 = (npi.a) cVar.k.get();
                xvh.c cVarA = ((a6d.e) aVar6.J).a();
                vc.s.j(cVarA);
                AccountId accountId = aVar6.f170484s;
                lrh.a aVar8 = (lrh.a) ((krh.a) aVar6.f170490y).f188872g.get();
                vc.s.j(aVar8);
                e0 e0Var = new e0(kVar2, mVar2, jVar2, fVar2, bVar, h0Var, aVar7, cVarA, accountId, aVar8, new m1i.u((g1i.b) aVar6.f170466b0.get(), (ypi.i) cVar.f170523x.get(), (k3l.b) cVar.B.get(), (m1i.m) aVar6.f170485s0.get()));
                g2i.a aVar9 = (g2i.a) cVar.J.get();
                l4i.a aVar10 = new l4i.a();
                o2i.a aVar11 = (o2i.a) cVar.K.get();
                i2i.h hVar2 = (i2i.h) cVar.L.get();
                i2i.e eVar2 = (i2i.e) cVar.M.get();
                i2i.i iVar2 = (i2i.i) cVar.N.get();
                i2i.g gVar = (i2i.g) cVar.O.get();
                AccountId accountId2 = aVar.f170484s;
                gte.a aVarB2 = aVar.f170475l.b();
                vc.s.j(aVarB2);
                p1i.a aVar12 = (p1i.a) cVar.P.get();
                wsg.n nVarB = aVar.d.b();
                vo9.a aVarB3 = ((ut9.a) aVar.M).b();
                vc.s.j(aVarB3);
                return new com.revolut.feature_exchange.impl.ui.exchange_v2.market_order.a(eVar, mVar, kVar, iVar, dVar2, bVarJ, jVar, fVar, aVar4, cVar4, aVar5, fVarD, e0Var, aVar9, aVar10, aVar11, hVar2, eVar2, iVar2, gVar, accountId2, aVarB2, aVar12, nVarB, aVarB3, (q2i.a) cVar.Q.get(), (kpi.c) cVar.f170518q.get(), aVar.L.a());
            case 29:
                return nga.c.m(new o7.d(aVar.H.a()), bq.i.l(cVar.f170508a), (f9b.f) cVar.e.get(), (tpi.j) cVar.i.get());
            case 30:
                c2i.j jVar3 = (c2i.j) aVar.l0.get();
                c2i.l lVar = (c2i.l) aVar.f170485s0.get();
                gte.a aVarB4 = aVar.f170475l.b();
                vc.s.j(aVarB4);
                mk0.a aVarA = aVar.i.f284866p.a();
                vc.s.j(aVarA);
                return new n2i.j(jVar3, lVar, aVarB4, new x0i.l(aVarA), (c2i.i) cVar.G.get(), (opi.d) cVar.v.get(), (rpi.c) cVar.f170512h.get(), bq.i.e(cVar.f170508a));
            case 31:
                return new com.revolut.feature_exchange.impl.ui.exchange.order_type_dialog.b();
            case 32:
                return new h2i.c((g2i.b) cVar.I.get(), (opi.d) cVar.v.get(), (rpi.c) cVar.f170512h.get());
            case 33:
                return new h2i.d();
            case 34:
                return new o2i.e((e2i.c) aVar.f170485s0.get());
            case 35:
                return new l2i.e(aVar.i.c());
            case 36:
                return new l2i.a();
            case 37:
                return new l2i.k();
            case 38:
                spi.a aVar13 = (spi.a) cVar.C.get();
                l4i.a converter = new l4i.a();
                Intrinsics.checkNotNullParameter(converter, "converter");
                return new j2i.d(aVar13, new l2i.i(), (m1i.k) aVar.l0.get(), new l4i.a());
            case 39:
                v0i.b bVar2 = aVar.i;
                p1i.i iVar3 = new p1i.i();
                wm.e eVar3 = (wm.e) aVar.f170487t0.get();
                rpi.c cVar5 = (rpi.c) cVar.f170512h.get();
                q06.l lVarA = aVar.K.a();
                vc.s.j(lVarA);
                return new p1i.h(iVar3, eVar3, cVar5, lVarA, (ln.a) aVar.f170479o0.get());
            case 40:
                return new q2i.f((q2i.b) aVar.f170485s0.get(), new q2i.d());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object b() {
        j1i.a aVar = (j1i.a) this.f169007b;
        j1i.d dVar = (j1i.d) this.d;
        int i = this.f169008c;
        switch (i) {
            case 0:
                return kpi.f.a();
            case 1:
                Context contextI = bq.i.i(dVar.f170525a);
                BaseDelegatesActivity baseDelegatesActivityF = bq.i.f(dVar.f170525a);
                t70.g gVarO = aVar.f170473j.o();
                vc.s.j(gVarO);
                return new npi.c(contextI, baseDelegatesActivityF, gVarO);
            case 2:
                return new tpi.i((rpi.c) dVar.e.get(), gsi.c.a(dVar.f170525a));
            case 3:
                return new rpi.b(bq.i.b(dVar.f170525a));
            case 4:
                return new rpi.h(bq.i.b(dVar.f170525a));
            case 5:
                return new iri.g((iri.j) aVar.X.get(), (iri.m) aVar.f170466b0.get(), bq.i.f(dVar.f170525a), bq.i.l(dVar.f170525a));
            case 6:
                return new iri.l((iri.m) aVar.f170466b0.get(), bq.i.f(dVar.f170525a), (iri.d) dVar.i.get());
            case 7:
                return new iri.d(bq.i.f(dVar.f170525a));
            case 8:
                return new opi.b(bq.i.f(dVar.f170525a));
            case 9:
                dVar.getClass();
                xoi.d dVar2 = dVar.f170525a;
                return new ypi.e(ypi.h.d, bq.i.b(dVar2), bq.i.o(dVar2), bq.i.g(dVar2));
            case 10:
                dVar.getClass();
                return new xpi.c(xpi.f.f307976c, bq.i.b(dVar.f170525a));
            case 11:
                dVar.getClass();
                return new cn.d(ImmutableSet.copyOf((Collection) dn.b.a()), (cn.e) aVar.Y.get(), aVar.l());
            case 12:
                um.c cVar = (um.c) aVar.Z.get();
                dVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(6);
                j1i.a aVar2 = dVar.f170526b;
                builderBuilderWithExpectedSize.add(aVar2.m0.get());
                builderBuilderWithExpectedSize.add(aVar2.h());
                builderBuilderWithExpectedSize.add(aVar2.a());
                builderBuilderWithExpectedSize.add(aVar2.n());
                builderBuilderWithExpectedSize.addAll((Iterable) in.g.a());
                builderBuilderWithExpectedSize.add(new jn.d(e4m.b.a(dVar.o)));
                return new in.e(cVar, builderBuilderWithExpectedSize.build(), aVar.l());
            case 13:
                return bq.i.t(dVar.f170525a);
            case 14:
                dVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize2 = ImmutableSet.builderWithExpectedSize(3);
                builderBuilderWithExpectedSize2.addAll((Iterable) kn.g.a());
                builderBuilderWithExpectedSize2.add(dVar.f170535q.get());
                builderBuilderWithExpectedSize2.add(new kn.h(e4m.b.a(dVar.f)));
                return new kn.e(builderBuilderWithExpectedSize2.build(), (ym.d) aVar.f170468d0.get(), aVar.l());
            case 15:
                return new zm.a();
            case 16:
                dVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize3 = ImmutableSet.builderWithExpectedSize(2);
                builderBuilderWithExpectedSize3.addAll((Iterable) hn.g.a());
                builderBuilderWithExpectedSize3.add(dVar.f170526b.n());
                return new hn.d(builderBuilderWithExpectedSize3.build(), (hn.h) aVar.f170478n0.get(), (npi.f) dVar.d.get());
            case 17:
                return new en.c(ImmutableSet.of((ln.d) dVar.f170526b.f170479o0.get()), bq.i.l(dVar.f170525a));
            case 18:
                return new gn.c((lpi.e) dVar.u.get(), (sm.e) aVar.p0.get(), ImmutableSet.copyOf((Collection) gn.e.a()), aVar.l());
            case 19:
                return new lpi.b(bq.i.i(dVar.f170525a), bq.i.j(dVar.f170525a));
            case 20:
                dVar.getClass();
                return new in.e(ImmutableSet.copyOf((Collection) pm.b.a()), (om.c) aVar.q0.get(), aVar.l());
            case 21:
                ypi.i iVar = (ypi.i) dVar.f170531l.get();
                xpi.g gVar = (xpi.g) dVar.f170532m.get();
                t1i.g gVar2 = (t1i.g) aVar.f170485s0.get();
                g1i.a aVar3 = (g1i.a) aVar.l0.get();
                t1i.b bVar = new t1i.b();
                Activity activity = bq.i.b(dVar.f170525a);
                Intrinsics.checkNotNullParameter(activity, "activity");
                Resources resources = activity.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                vc.s.k(resources);
                return new t1i.o(iVar, gVar, gVar2, aVar3, bVar, new t1i.d(resources));
            default:
                throw new AssertionError(i);
        }
    }

    private final Object c() {
        j1i.a aVar = (j1i.a) this.f169007b;
        j1i.e eVar = (j1i.e) this.d;
        int i = this.f169008c;
        switch (i) {
            case 0:
                return kpi.f.a();
            case 1:
                Context contextI = bq.i.i(eVar.f170541a);
                BaseDelegatesActivity baseDelegatesActivityF = bq.i.f(eVar.f170541a);
                t70.g gVarO = aVar.f170473j.o();
                vc.s.j(gVarO);
                return new npi.c(contextI, baseDelegatesActivityF, gVarO);
            case 2:
                return new tpi.i((rpi.c) eVar.f.get(), gsi.c.a(eVar.f170541a));
            case 3:
                return new rpi.b(bq.i.b(eVar.f170541a));
            case 4:
                return new rpi.h(bq.i.b(eVar.f170541a));
            case 5:
                return new iri.g((iri.j) aVar.X.get(), (iri.m) aVar.f170466b0.get(), bq.i.f(eVar.f170541a), bq.i.l(eVar.f170541a));
            case 6:
                return new iri.l((iri.m) aVar.f170466b0.get(), bq.i.f(eVar.f170541a), (iri.d) eVar.f170546j.get());
            case 7:
                return new iri.d(bq.i.f(eVar.f170541a));
            case 8:
                return new opi.b(bq.i.f(eVar.f170541a));
            case 9:
                eVar.getClass();
                return new xpi.c(xpi.f.f307976c, bq.i.b(eVar.f170541a));
            case 10:
                eVar.getClass();
                xoi.d dVar = eVar.f170541a;
                return new ypi.e(ypi.h.d, bq.i.b(dVar), bq.i.o(dVar), bq.i.g(dVar));
            case 11:
                eVar.getClass();
                return new cn.d(ImmutableSet.copyOf((Collection) dn.b.a()), (cn.e) aVar.Y.get(), aVar.l());
            case 12:
                um.c cVar = (um.c) aVar.Z.get();
                eVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(6);
                j1i.a aVar2 = eVar.f170543c;
                builderBuilderWithExpectedSize.add(aVar2.m0.get());
                builderBuilderWithExpectedSize.add(aVar2.h());
                builderBuilderWithExpectedSize.add(aVar2.a());
                builderBuilderWithExpectedSize.add(aVar2.n());
                builderBuilderWithExpectedSize.addAll((Iterable) in.g.a());
                builderBuilderWithExpectedSize.add(new jn.d(e4m.b.a(eVar.f170550p)));
                return new in.e(cVar, builderBuilderWithExpectedSize.build(), aVar.l());
            case 13:
                return bq.i.t(eVar.f170541a);
            case 14:
                eVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize2 = ImmutableSet.builderWithExpectedSize(3);
                builderBuilderWithExpectedSize2.addAll((Iterable) kn.g.a());
                builderBuilderWithExpectedSize2.add(eVar.f170552r.get());
                builderBuilderWithExpectedSize2.add(new kn.h(e4m.b.a(eVar.f170544g)));
                return new kn.e(builderBuilderWithExpectedSize2.build(), (ym.d) aVar.f170468d0.get(), aVar.l());
            case 15:
                return new zm.a();
            case 16:
                eVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize3 = ImmutableSet.builderWithExpectedSize(2);
                builderBuilderWithExpectedSize3.addAll((Iterable) hn.g.a());
                builderBuilderWithExpectedSize3.add(eVar.f170543c.n());
                return new hn.d(builderBuilderWithExpectedSize3.build(), (hn.h) aVar.f170478n0.get(), (npi.f) eVar.e.get());
            case 17:
                return new en.c(ImmutableSet.of((ln.d) eVar.f170543c.f170479o0.get()), bq.i.l(eVar.f170541a));
            case 18:
                return new gn.c((lpi.e) eVar.v.get(), (sm.e) aVar.p0.get(), ImmutableSet.copyOf((Collection) gn.e.a()), aVar.l());
            case 19:
                return new lpi.b(bq.i.i(eVar.f170541a), bq.i.j(eVar.f170541a));
            case 20:
                eVar.getClass();
                return new in.e(ImmutableSet.copyOf((Collection) pm.b.a()), (om.c) aVar.q0.get(), aVar.l());
            case 21:
                xpi.g gVar = (xpi.g) eVar.f170548m.get();
                e4m.e eVar2 = aVar.l0;
                l70.e eVar3 = aVar.f170473j;
                g1i.a aVar3 = (g1i.a) eVar2.get();
                w1i.e eVar4 = (w1i.e) aVar.f170485s0.get();
                ypi.i iVar = (ypi.i) eVar.f170549n.get();
                u80.t tVarU = eVar3.u();
                vc.s.j(tVarU);
                t70.b bVarG = eVar3.g();
                vc.s.j(bVarG);
                return new w1i.o(gVar, aVar3, eVar4, iVar, tVarU, bVarG, eVar.f170542b, (f9b.f) eVar.f170550p.get());
            case 22:
                qd0.b languageProvider = aVar.f170473j.n();
                vc.s.j(languageProvider);
                x1i.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
                return new u80.d(((s80.b) languageProvider).b());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object d() {
        j1i.a aVar = (j1i.a) this.f169007b;
        j1i.f fVar = (j1i.f) this.d;
        int i = this.f169008c;
        switch (i) {
            case 0:
                return kpi.f.a();
            case 1:
                Context contextI = bq.i.i(fVar.f170558a);
                BaseDelegatesActivity baseDelegatesActivityF = bq.i.f(fVar.f170558a);
                t70.g gVarO = aVar.f170473j.o();
                vc.s.j(gVarO);
                return new npi.c(contextI, baseDelegatesActivityF, gVarO);
            case 2:
                return new tpi.i((rpi.c) fVar.f170561g.get(), gsi.c.a(fVar.f170558a));
            case 3:
                return new rpi.b(bq.i.b(fVar.f170558a));
            case 4:
                return new rpi.h(bq.i.b(fVar.f170558a));
            case 5:
                return new iri.g((iri.j) aVar.X.get(), (iri.m) aVar.f170466b0.get(), bq.i.f(fVar.f170558a), bq.i.l(fVar.f170558a));
            case 6:
                return new iri.l((iri.m) aVar.f170466b0.get(), bq.i.f(fVar.f170558a), (iri.d) fVar.k.get());
            case 7:
                return new iri.d(bq.i.f(fVar.f170558a));
            case 8:
                return new opi.b(bq.i.f(fVar.f170558a));
            case 9:
                return new r3l.c((g1) fVar.f170566n.get());
            case 10:
                return l9.k(bq.i.b(fVar.f170558a));
            case 11:
                return new k3l.d(bq.i.b(fVar.f170558a));
            case 12:
                fVar.getClass();
                return new xpi.c(xpi.f.f307976c, bq.i.b(fVar.f170558a));
            case 13:
                fVar.getClass();
                return new cn.d(ImmutableSet.copyOf((Collection) dn.b.a()), (cn.e) aVar.Y.get(), aVar.l());
            case 14:
                um.c cVar = (um.c) aVar.Z.get();
                fVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(6);
                j1i.a aVar2 = fVar.d;
                builderBuilderWithExpectedSize.add(aVar2.m0.get());
                builderBuilderWithExpectedSize.add(aVar2.h());
                builderBuilderWithExpectedSize.add(aVar2.a());
                builderBuilderWithExpectedSize.add(aVar2.n());
                builderBuilderWithExpectedSize.addAll((Iterable) in.g.a());
                builderBuilderWithExpectedSize.add(new jn.d(e4m.b.a(fVar.f170570s)));
                return new in.e(cVar, builderBuilderWithExpectedSize.build(), aVar.l());
            case 15:
                return bq.i.t(fVar.f170558a);
            case 16:
                fVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize2 = ImmutableSet.builderWithExpectedSize(3);
                builderBuilderWithExpectedSize2.addAll((Iterable) kn.g.a());
                builderBuilderWithExpectedSize2.add(fVar.u.get());
                builderBuilderWithExpectedSize2.add(new kn.h(e4m.b.a(fVar.f170562h)));
                return new kn.e(builderBuilderWithExpectedSize2.build(), (ym.d) aVar.f170468d0.get(), aVar.l());
            case 17:
                return new zm.a();
            case 18:
                fVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize3 = ImmutableSet.builderWithExpectedSize(2);
                builderBuilderWithExpectedSize3.addAll((Iterable) hn.g.a());
                builderBuilderWithExpectedSize3.add(fVar.d.n());
                return new hn.d(builderBuilderWithExpectedSize3.build(), (hn.h) aVar.f170478n0.get(), (npi.f) fVar.f.get());
            case 19:
                return new en.c(ImmutableSet.of((ln.d) fVar.d.f170479o0.get()), bq.i.l(fVar.f170558a));
            case 20:
                return new gn.c((lpi.e) fVar.f170574y.get(), (sm.e) aVar.p0.get(), ImmutableSet.copyOf((Collection) gn.e.a()), aVar.l());
            case 21:
                return new lpi.b(bq.i.i(fVar.f170558a), bq.i.j(fVar.f170558a));
            case 22:
                fVar.getClass();
                return new in.e(ImmutableSet.copyOf((Collection) pm.b.a()), (om.c) aVar.q0.get(), aVar.l());
            case 23:
                fVar.getClass();
                xoi.d dVar = fVar.f170558a;
                return new ypi.e(ypi.h.d, bq.i.b(dVar), bq.i.o(dVar), bq.i.g(dVar));
            case 24:
                cqi.h hVar = (cqi.h) fVar.C.get();
                an.a aVar3 = (an.a) aVar.f170483r0.get();
                ImmutableSet.Builder builderBuilderWithExpectedSize4 = ImmutableSet.builderWithExpectedSize(2);
                builderBuilderWithExpectedSize4.add(fVar.d.k());
                builderBuilderWithExpectedSize4.addAll((Iterable) bn.b.a());
                return new an.q(hVar, aVar3, builderBuilderWithExpectedSize4.build(), aVar.l());
            case 25:
                return new cqi.j(bq.i.f(fVar.f170558a));
            case 26:
                fVar.getClass();
                return new g3l.c(ImmutableSet.copyOf((Collection) g3l.f.a()), (g3l.g) aVar.f170464a0.get(), (k3l.b) fVar.f170567p.get(), aVar.l());
            case 27:
                return new wm.l((opi.d) fVar.f170565m.get(), (wm.a) aVar.f170487t0.get(), ImmutableSet.copyOf((Collection) xm.b.a()), aVar.l());
            case 28:
                z1i.f fVar2 = (z1i.f) aVar.f170485s0.get();
                e4m.e eVar = fVar.B;
                OrderSummaryContract$Configuration configuration = fVar.f170559b;
                j1i.a aVar4 = fVar.d;
                ypi.i iVar = (ypi.i) eVar.get();
                z1i.d dVar2 = (z1i.d) aVar.l0.get();
                f9b.f fVar3 = (f9b.f) fVar.f170570s.get();
                k3l.b bVar = (k3l.b) fVar.f170567p.get();
                k1i.j jVar = new k1i.j((k1i.b) aVar4.l0.get(), (npi.a) fVar.f.get(), (k1i.c) aVar4.f170485s0.get());
                xpi.g gVar = (xpi.g) fVar.f170568q.get();
                t2i.b bVar2 = (t2i.b) aVar4.l0.get();
                t2i.c cVar2 = (t2i.c) aVar4.f170485s0.get();
                t2i.j jVar2 = new t2i.j();
                a2i.b bVar3 = (a2i.b) fVar.L.get();
                sh5.d dVarF = aVar4.G.f();
                vc.s.j(dVarF);
                gte.a aVarB = aVar4.f170475l.b();
                vc.s.j(aVarB);
                i0 i0Var = new i0(gVar, bVar2, cVar2, jVar2, bVar3, dVarF, aVarB, configuration);
                t2i.b presentationModel = (t2i.b) aVar4.l0.get();
                u2i.q cryptoCommodityDelegate = (u2i.q) fVar.K.get();
                z1i.j orderSummaryItemsMapper = (z1i.j) fVar.M.get();
                tga.k upgradeEntryPointItemProvider = aVar4.S.b();
                e3 tpslSummaryItemsDelegate = new e3(new y2i.c((y2i.a) aVar4.l0.get(), aVar4.k.b(), new y2i.d(), new l4i.a(), new r2i.a()), (u2i.k) fVar.J.get(), new y2i.d());
                r2i.a settlementDelayBannerMapper = new r2i.a();
                Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
                Intrinsics.checkNotNullParameter(cryptoCommodityDelegate, "cryptoCommodityDelegate");
                Intrinsics.checkNotNullParameter(orderSummaryItemsMapper, "orderSummaryItemsMapper");
                Intrinsics.checkNotNullParameter(upgradeEntryPointItemProvider, "upgradeEntryPointItemProvider");
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                Intrinsics.checkNotNullParameter(tpslSummaryItemsDelegate, "tpslSummaryItemsDelegate");
                Intrinsics.checkNotNullParameter(settlementDelayBannerMapper, "settlementDelayBannerMapper");
                b9k.f fVar4 = new b9k.f();
                fVar4.f13817b = presentationModel;
                fVar4.f13816a = cryptoCommodityDelegate;
                fVar4.f13818c = orderSummaryItemsMapper;
                fVar4.d = upgradeEntryPointItemProvider;
                fVar4.e = configuration;
                fVar4.f = tpslSummaryItemsDelegate;
                fVar4.f13819g = settlementDelayBannerMapper;
                a2i.b bVar4 = (a2i.b) fVar.L.get();
                l4i.a aVar5 = new l4i.a();
                z1i.g gVar2 = (z1i.g) fVar.N.get();
                com.google.firebase.messaging.t tVarD = aVar.d();
                mga.h0 h0Var = (mga.h0) fVar.O.get();
                m1i.k kVar = (m1i.k) aVar4.l0.get();
                m1i.m mVar = (m1i.m) aVar4.f170485s0.get();
                tpi.j jVar3 = (tpi.j) fVar.f170562h.get();
                f9b.f fVar5 = (f9b.f) fVar.f170570s.get();
                k3l.b bVar5 = (k3l.b) fVar.f170567p.get();
                ttd.a aVarH = aVar4.f170488w.f249364b.h();
                gte.a aVarB2 = aVar4.f170475l.b();
                vc.s.j(aVarB2);
                h0 h0Var2 = new h0(aVarB2, aVar4.I.a(), aVarH);
                npi.a aVar6 = (npi.a) fVar.f.get();
                xvh.c cVarA = ((a6d.e) aVar4.J).a();
                vc.s.j(cVarA);
                AccountId accountId = aVar4.f170484s;
                lrh.a aVar7 = (lrh.a) ((krh.a) aVar4.f170490y).f188872g.get();
                vc.s.j(aVar7);
                e0 e0Var = new e0(kVar, mVar, jVar3, fVar5, bVar5, h0Var2, aVar6, cVarA, accountId, aVar7, new m1i.u((g1i.b) aVar4.f170466b0.get(), (ypi.i) fVar.B.get(), (k3l.b) fVar.f170567p.get(), (m1i.m) aVar4.f170485s0.get()));
                mkd.e eVar2 = (mkd.e) fVar.I.get();
                u2i.k kVar2 = (u2i.k) fVar.J.get();
                pri.f fVarD = bq.i.d(fVar.f170558a);
                opi.d dVar3 = (opi.d) fVar.f170565m.get();
                h5i.g gVarB = aVar.k.b();
                lrh.a aVar8 = (lrh.a) ((krh.a) aVar.f170490y).f188872g.get();
                vc.s.j(aVar8);
                nd.k kVar3 = new nd.k(new l4i.a());
                sd5.c cVarA2 = aVar.U.a();
                vc.s.j(cVarA2);
                q06.l lVarA = aVar.K.a();
                vc.s.j(lVarA);
                return new b0(fVar2, iVar, dVar2, fVar3, bVar, jVar, i0Var, fVar4, bVar4, aVar5, gVar2, tVarD, h0Var, e0Var, eVar2, kVar2, fVarD, dVar3, gVarB, aVar8, configuration, kVar3, cVarA2, lVarA, (g1) fVar.f170566n.get(), aVar.L.b());
            case 29:
                return new a2i.o((z1i.f) aVar.f170485s0.get(), (a2i.a) aVar.l0.get(), (a2i.f) fVar.G.get(), new t2i.j(), (ypi.i) fVar.B.get(), gmf.b.h(fVar.f170558a), (wm.e) aVar.f170487t0.get(), new u2i.d(), new u2i.c(), (u2i.q) fVar.K.get(), fVar.f170559b);
            case 30:
                return new a2i.r(fVar.f170559b);
            case 31:
                u2i.r rVar = (u2i.r) aVar.l0.get();
                u2i.t tVar = (u2i.t) fVar.H.get();
                t2i.j jVar4 = new t2i.j();
                u2i.t tVar2 = (u2i.t) fVar.H.get();
                h5i.g gVarB2 = aVar.k.b();
                gte.a aVarB3 = aVar.f170475l.b();
                vc.s.j(aVarB3);
                opi.d dVar4 = (opi.d) fVar.f170565m.get();
                u2i.d dVar5 = new u2i.d();
                mre.c cVarB = aVar.N.b();
                vc.s.j(cVarB);
                u2i.s sVar = (u2i.s) aVar.f170485s0.get();
                sh5.d dVarF2 = aVar.G.f();
                vc.s.j(dVarF2);
                return new y(rVar, tVar, jVar4, tVar2, gVarB2, aVarB3, dVar4, dVar5, cVarB, sVar, dVarF2, (u2i.k) fVar.J.get(), new q2i.d(), new r2i.a());
            case 32:
                return new u2i.b0(new f2i.a(), aVar.f170488w.j(), new s1i.a());
            case 33:
                gte.a aVarB4 = aVar.f170475l.b();
                vc.s.j(aVarB4);
                FxService fxServiceK = w3.k(aVar.O, ((nj0.d) aVar.A).f());
                ee0.a aVar9 = aVar.P;
                je0.d dVarB = aVar9.b();
                vc.s.j(dVarB);
                yk0.a aVarB5 = aVar.Q.b();
                vc.s.j(aVarB5);
                xe0.f fVarF = aVar9.f();
                vc.s.j(fVarF);
                return new u2i.h(aVarB4, new c1i.g(fxServiceK, w3.j(dVarB, fVarF, aVarB5)), (u2i.r) aVar.l0.get(), (mkd.e) fVar.I.get(), aVar.S.b(), new l4i.a());
            case 34:
                OrderSummaryActivity orderSummaryActivity = fVar.f170560c;
                sri.m mVarL = bq.i.l(fVar.f170558a);
                tpi.j jVar5 = (tpi.j) fVar.f170562h.get();
                r3l.a aVar10 = (r3l.a) fVar.o.get();
                k3l.b bVar6 = (k3l.b) fVar.f170567p.get();
                rkd.n nVar = (rkd.n) aVar.R.I.get();
                vc.s.j(nVar);
                return w3.t(orderSummaryActivity, mVarL, jVar5, aVar10, bVar6, nVar);
            case 35:
                return new z1i.j(aVar.k.b());
            case 36:
                return new d0(fVar.f170559b);
            case 37:
                qga.b bVar7 = aVar.C;
                vn.a aVar11 = aVar.T;
                return n57.a.A(bVar7.c(), (ln.a) aVar.f170479o0.get(), (wm.e) aVar.f170487t0.get(), aVar11.c(), aVar11.a());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object e() {
        j1i.a aVar = (j1i.a) this.f169007b;
        j1i.g gVar = (j1i.g) this.d;
        int i = this.f169008c;
        switch (i) {
            case 0:
                return kpi.f.a();
            case 1:
                Context contextI = bq.i.i(gVar.f170575a);
                BaseDelegatesActivity baseDelegatesActivityF = bq.i.f(gVar.f170575a);
                t70.g gVarO = aVar.f170473j.o();
                vc.s.j(gVarO);
                return new npi.c(contextI, baseDelegatesActivityF, gVarO);
            case 2:
                return new tpi.i((rpi.c) gVar.f.get(), gsi.c.a(gVar.f170575a));
            case 3:
                return new rpi.b(bq.i.b(gVar.f170575a));
            case 4:
                return new rpi.h(bq.i.b(gVar.f170575a));
            case 5:
                return new iri.g((iri.j) aVar.X.get(), (iri.m) aVar.f170466b0.get(), bq.i.f(gVar.f170575a), bq.i.l(gVar.f170575a));
            case 6:
                return new iri.l((iri.m) aVar.f170466b0.get(), bq.i.f(gVar.f170575a), (iri.d) gVar.f170580j.get());
            case 7:
                return new iri.d(bq.i.f(gVar.f170575a));
            case 8:
                return new opi.b(bq.i.f(gVar.f170575a));
            case 9:
                gVar.getClass();
                return new xpi.c(xpi.f.f307976c, bq.i.b(gVar.f170575a));
            case 10:
                ypi.h hVar = gVar.f170576b;
                xoi.d dVar = gVar.f170575a;
                return new ypi.e(hVar, bq.i.b(dVar), bq.i.o(dVar), bq.i.g(dVar));
            case 11:
                gVar.getClass();
                return new cn.d(ImmutableSet.copyOf((Collection) dn.b.a()), (cn.e) aVar.Y.get(), aVar.l());
            case 12:
                um.c cVar = (um.c) aVar.Z.get();
                gVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(6);
                j1i.a aVar2 = gVar.f170577c;
                builderBuilderWithExpectedSize.add(aVar2.m0.get());
                builderBuilderWithExpectedSize.add(aVar2.h());
                builderBuilderWithExpectedSize.add(aVar2.a());
                builderBuilderWithExpectedSize.add(aVar2.n());
                builderBuilderWithExpectedSize.addAll((Iterable) in.g.a());
                builderBuilderWithExpectedSize.add(new jn.d(e4m.b.a(gVar.f170584p)));
                return new in.e(cVar, builderBuilderWithExpectedSize.build(), aVar.l());
            case 13:
                return bq.i.t(gVar.f170575a);
            case 14:
                gVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize2 = ImmutableSet.builderWithExpectedSize(3);
                builderBuilderWithExpectedSize2.addAll((Iterable) kn.g.a());
                builderBuilderWithExpectedSize2.add(gVar.f170586r.get());
                builderBuilderWithExpectedSize2.add(new kn.h(e4m.b.a(gVar.f170578g)));
                return new kn.e(builderBuilderWithExpectedSize2.build(), (ym.d) aVar.f170468d0.get(), aVar.l());
            case 15:
                return new zm.a();
            case 16:
                gVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize3 = ImmutableSet.builderWithExpectedSize(2);
                builderBuilderWithExpectedSize3.addAll((Iterable) hn.g.a());
                builderBuilderWithExpectedSize3.add(gVar.f170577c.n());
                return new hn.d(builderBuilderWithExpectedSize3.build(), (hn.h) aVar.f170478n0.get(), (npi.f) gVar.e.get());
            case 17:
                return new en.c(ImmutableSet.of((ln.d) gVar.f170577c.f170479o0.get()), bq.i.l(gVar.f170575a));
            case 18:
                return new gn.c((lpi.e) gVar.v.get(), (sm.e) aVar.p0.get(), ImmutableSet.copyOf((Collection) gn.e.a()), aVar.l());
            case 19:
                return new lpi.b(bq.i.i(gVar.f170575a), bq.i.j(gVar.f170575a));
            case 20:
                gVar.getClass();
                return new in.e(ImmutableSet.copyOf((Collection) pm.b.a()), (om.c) aVar.q0.get(), aVar.l());
            case 21:
                f2i.j jVar = (f2i.j) aVar.f170485s0.get();
                g1i.a aVar3 = (g1i.a) aVar.l0.get();
                e4m.e eVar = gVar.f170591y;
                xoi.d dVar2 = gVar.f170575a;
                z zVar = new z(jVar, aVar3, (f2i.k) eVar.get(), (opi.d) gVar.f170581l.get(), (xpi.g) gVar.f170582m.get(), bq.i.e(dVar2), (ypi.i) gVar.f170583n.get(), gmf.b.h(dVar2));
                kli.a.p(zVar, bq.i.d(dVar2));
                return zVar;
            case 22:
                f2i.a dateFormatter = new f2i.a();
                Intrinsics.checkNotNullParameter(dateFormatter, "dateFormatter");
                return new f2i.b0();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object f() {
        j1i.a aVar = (j1i.a) this.f169007b;
        j1i.h hVar = (j1i.h) this.d;
        int i = this.f169008c;
        switch (i) {
            case 0:
                return kpi.f.a();
            case 1:
                Context contextI = bq.i.i(hVar.f170592a);
                BaseDelegatesActivity baseDelegatesActivityF = bq.i.f(hVar.f170592a);
                t70.g gVarO = aVar.f170473j.o();
                vc.s.j(gVarO);
                return new npi.c(contextI, baseDelegatesActivityF, gVarO);
            case 2:
                return new tpi.i((rpi.c) hVar.f.get(), gsi.c.a(hVar.f170592a));
            case 3:
                return new rpi.b(bq.i.b(hVar.f170592a));
            case 4:
                return new rpi.h(bq.i.b(hVar.f170592a));
            case 5:
                return new iri.g((iri.j) aVar.X.get(), (iri.m) aVar.f170466b0.get(), bq.i.f(hVar.f170592a), bq.i.l(hVar.f170592a));
            case 6:
                return new iri.l((iri.m) aVar.f170466b0.get(), bq.i.f(hVar.f170592a), (iri.d) hVar.f170597j.get());
            case 7:
                return new iri.d(bq.i.f(hVar.f170592a));
            case 8:
                return new opi.b(bq.i.f(hVar.f170592a));
            case 9:
                hVar.getClass();
                return new xpi.c(xpi.f.f307976c, bq.i.b(hVar.f170592a));
            case 10:
                ypi.h hVar2 = hVar.f170593b;
                xoi.d dVar = hVar.f170592a;
                return new ypi.e(hVar2, bq.i.b(dVar), bq.i.o(dVar), bq.i.g(dVar));
            case 11:
                hVar.getClass();
                return new cn.d(ImmutableSet.copyOf((Collection) dn.b.a()), (cn.e) aVar.Y.get(), aVar.l());
            case 12:
                um.c cVar = (um.c) aVar.Z.get();
                hVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(6);
                j1i.a aVar2 = hVar.f170594c;
                builderBuilderWithExpectedSize.add(aVar2.m0.get());
                builderBuilderWithExpectedSize.add(aVar2.h());
                builderBuilderWithExpectedSize.add(aVar2.a());
                builderBuilderWithExpectedSize.add(aVar2.n());
                builderBuilderWithExpectedSize.addAll((Iterable) in.g.a());
                builderBuilderWithExpectedSize.add(new jn.d(e4m.b.a(hVar.f170601p)));
                return new in.e(cVar, builderBuilderWithExpectedSize.build(), aVar.l());
            case 13:
                return bq.i.t(hVar.f170592a);
            case 14:
                hVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize2 = ImmutableSet.builderWithExpectedSize(3);
                builderBuilderWithExpectedSize2.addAll((Iterable) kn.g.a());
                builderBuilderWithExpectedSize2.add(hVar.f170603r.get());
                builderBuilderWithExpectedSize2.add(new kn.h(e4m.b.a(hVar.f170595g)));
                return new kn.e(builderBuilderWithExpectedSize2.build(), (ym.d) aVar.f170468d0.get(), aVar.l());
            case 15:
                return new zm.a();
            case 16:
                hVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize3 = ImmutableSet.builderWithExpectedSize(2);
                builderBuilderWithExpectedSize3.addAll((Iterable) hn.g.a());
                builderBuilderWithExpectedSize3.add(hVar.f170594c.n());
                return new hn.d(builderBuilderWithExpectedSize3.build(), (hn.h) aVar.f170478n0.get(), (npi.f) hVar.e.get());
            case 17:
                return new en.c(ImmutableSet.of((ln.d) hVar.f170594c.f170479o0.get()), bq.i.l(hVar.f170592a));
            case 18:
                return new gn.c((lpi.e) hVar.v.get(), (sm.e) aVar.p0.get(), ImmutableSet.copyOf((Collection) gn.e.a()), aVar.l());
            case 19:
                return new lpi.b(bq.i.i(hVar.f170592a), bq.i.j(hVar.f170592a));
            case 20:
                hVar.getClass();
                return new in.e(ImmutableSet.copyOf((Collection) pm.b.a()), (om.c) aVar.q0.get(), aVar.l());
            case 21:
                f2i.j jVar = (f2i.j) aVar.f170485s0.get();
                g1i.a aVar3 = (g1i.a) aVar.l0.get();
                e4m.e eVar = hVar.f170608y;
                xoi.d dVar2 = hVar.f170592a;
                p2i.r rVar = new p2i.r(jVar, aVar3, (p2i.e) eVar.get(), (opi.d) hVar.f170598l.get(), (xpi.g) hVar.f170599m.get(), bq.i.e(dVar2), (ypi.i) hVar.f170600n.get(), gmf.b.h(dVar2));
                kli.a.p(rVar, bq.i.d(dVar2));
                return rVar;
            case 22:
                p2i.a dateFormatter = new p2i.a();
                Intrinsics.checkNotNullParameter(dateFormatter, "dateFormatter");
                return new p2i.u();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object g() {
        j3l.c cVar = (j3l.c) this.f169007b;
        j3l.b bVar = (j3l.b) this.d;
        int i = this.f169008c;
        switch (i) {
            case 0:
                return new k3l.d(bq.i.b(bVar.f171225a));
            case 1:
                bVar.getClass();
                return new cn.d(ImmutableSet.copyOf((Collection) dn.b.a()), (cn.e) cVar.f171243g.get(), cVar.a());
            case 2:
                um.c cVar2 = (um.c) cVar.f171244h.get();
                bVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(5);
                j3l.c cVar3 = bVar.f171226b;
                hn.h hVar = (hn.h) cVar3.i.get();
                t70.g gVarO = cVar3.f171241b.o();
                vc.s.j(gVarO);
                builderBuilderWithExpectedSize.add(new jn.a(hVar, gVarO));
                builderBuilderWithExpectedSize.add(new vm.b(com.google.android.gms.internal.mlkit_vision_face.a.f()));
                builderBuilderWithExpectedSize.add(cVar3.b());
                builderBuilderWithExpectedSize.addAll((Iterable) in.g.a());
                builderBuilderWithExpectedSize.add(new jn.d(e4m.b.a(bVar.e)));
                return new in.e(cVar2, builderBuilderWithExpectedSize.build(), cVar.a());
            case 3:
                return bq.i.t(bVar.f171225a);
            case 4:
                bVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize2 = ImmutableSet.builderWithExpectedSize(3);
                builderBuilderWithExpectedSize2.addAll((Iterable) kn.g.a());
                builderBuilderWithExpectedSize2.add(bVar.f171228g.get());
                builderBuilderWithExpectedSize2.add(new kn.h(e4m.b.a(bVar.i)));
                return new kn.e(builderBuilderWithExpectedSize2.build(), (ym.d) cVar.k.get(), cVar.a());
            case 5:
                return new zm.a();
            case 6:
                return new tpi.i((rpi.c) bVar.f171229h.get(), gsi.c.a(bVar.f171225a));
            case 7:
                return new rpi.b(bq.i.b(bVar.f171225a));
            case 8:
                bVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize3 = ImmutableSet.builderWithExpectedSize(2);
                builderBuilderWithExpectedSize3.addAll((Iterable) hn.g.a());
                builderBuilderWithExpectedSize3.add(bVar.f171226b.b());
                return new hn.d(builderBuilderWithExpectedSize3.build(), (hn.h) cVar.i.get(), (npi.f) bVar.k.get());
            case 9:
                Context contextI = bq.i.i(bVar.f171225a);
                BaseDelegatesActivity baseDelegatesActivityF = bq.i.f(bVar.f171225a);
                t70.g gVarO2 = cVar.f171241b.o();
                vc.s.j(gVarO2);
                return new npi.c(contextI, baseDelegatesActivityF, gVarO2);
            case 10:
                return new en.c(ImmutableSet.of((ln.d) bVar.f171226b.f171245j.get()), bq.i.l(bVar.f171225a));
            case 11:
                return new gn.c((lpi.e) bVar.f171233n.get(), (sm.e) cVar.f171251r.get(), ImmutableSet.copyOf((Collection) gn.e.a()), cVar.a());
            case 12:
                return new lpi.b(bq.i.i(bVar.f171225a), bq.i.j(bVar.f171225a));
            case 13:
                bVar.getClass();
                return new in.e(ImmutableSet.copyOf((Collection) pm.b.a()), (om.c) cVar.f171252s.get(), cVar.a());
            case 14:
                return kpi.f.a();
            case 15:
                return new rpi.h(bq.i.b(bVar.f171225a));
            case 16:
                return new iri.g((iri.j) cVar.f.get(), (iri.m) cVar.f171247m.get(), bq.i.f(bVar.f171225a), bq.i.l(bVar.f171225a));
            case 17:
                return new iri.l((iri.m) cVar.f171247m.get(), bq.i.f(bVar.f171225a), (iri.d) bVar.f171238t.get());
            case 18:
                return new iri.d(bq.i.f(bVar.f171225a));
            case 19:
                return new opi.b(bq.i.f(bVar.f171225a));
            case 20:
                return new h3l.l((h3l.h) cVar.f171253t.get(), (k3l.b) bVar.f171227c.get(), bq.i.e(bVar.f171225a), (mm.d) cVar.f171246l.get());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object h() {
        jak.b bVar = (jak.b) this.f169007b;
        jak.a aVar = (jak.a) this.d;
        int i = this.f169008c;
        switch (i) {
            case 0:
                aVar.getClass();
                return new xpi.c(xpi.f.f307976c, bq.i.b(aVar.f172496a));
            case 1:
                ypi.h hVar = aVar.f172497b;
                xoi.d dVar = aVar.f172496a;
                return new ypi.e(hVar, bq.i.b(dVar), bq.i.o(dVar), bq.i.g(dVar));
            case 2:
                return kpi.f.a();
            case 3:
                Context contextI = bq.i.i(aVar.f172496a);
                BaseDelegatesActivity baseDelegatesActivityF = bq.i.f(aVar.f172496a);
                t70.g gVarO = bVar.f172514b.o();
                vc.s.j(gVarO);
                return new npi.c(contextI, baseDelegatesActivityF, gVarO);
            case 4:
                return new tpi.i((rpi.c) aVar.f172500h.get(), gsi.c.a(aVar.f172496a));
            case 5:
                return new rpi.b(bq.i.b(aVar.f172496a));
            case 6:
                return new rpi.h(bq.i.b(aVar.f172496a));
            case 7:
                return new iri.g((iri.j) bVar.f172517h.get(), (iri.m) bVar.i.get(), bq.i.f(aVar.f172496a), bq.i.l(aVar.f172496a));
            case 8:
                return new iri.l((iri.m) bVar.i.get(), bq.i.f(aVar.f172496a), (iri.d) aVar.f172502l.get());
            case 9:
                return new iri.d(bq.i.f(aVar.f172496a));
            case 10:
                return new opi.b(bq.i.f(aVar.f172496a));
            case 11:
                jak.b bVar2 = aVar.f172498c;
                return new en.c(ImmutableSet.of((ln.d) bVar2.f172521n.get(), (ln.d) bVar2.o.get()), bq.i.l(aVar.f172496a));
            case 12:
                return new k3l.d(bq.i.b(aVar.f172496a));
            case 13:
                aVar.getClass();
                return new cn.d(ImmutableSet.copyOf((Collection) dn.b.a()), (cn.e) bVar.f172518j.get(), bVar.a());
            case 14:
                um.c cVar = (um.c) bVar.f172519l.get();
                aVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(5);
                jak.b bVar3 = aVar.f172498c;
                hn.h hVar2 = (hn.h) bVar3.f172522p.get();
                t70.g gVarO2 = bVar3.f172514b.o();
                vc.s.j(gVarO2);
                builderBuilderWithExpectedSize.add(new jn.a(hVar2, gVarO2));
                builderBuilderWithExpectedSize.add(new vm.b(com.google.android.gms.internal.mlkit_vision_face.a.f()));
                builderBuilderWithExpectedSize.add(bVar3.b());
                builderBuilderWithExpectedSize.addAll((Iterable) in.g.a());
                builderBuilderWithExpectedSize.add(new jn.d(e4m.b.a(aVar.f172507r)));
                return new in.e(cVar, builderBuilderWithExpectedSize.build(), bVar.a());
            case 15:
                return bq.i.t(aVar.f172496a);
            case 16:
                aVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize2 = ImmutableSet.builderWithExpectedSize(3);
                builderBuilderWithExpectedSize2.addAll((Iterable) kn.g.a());
                builderBuilderWithExpectedSize2.add(aVar.f172509t.get());
                builderBuilderWithExpectedSize2.add(new kn.h(e4m.b.a(aVar.i)));
                return new kn.e(builderBuilderWithExpectedSize2.build(), (ym.d) bVar.k.get(), bVar.a());
            case 17:
                return new zm.a();
            case 18:
                aVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize3 = ImmutableSet.builderWithExpectedSize(2);
                builderBuilderWithExpectedSize3.addAll((Iterable) hn.g.a());
                builderBuilderWithExpectedSize3.add(aVar.f172498c.b());
                return new hn.d(builderBuilderWithExpectedSize3.build(), (hn.h) bVar.f172522p.get(), (npi.f) aVar.f172499g.get());
            case 19:
                return new gn.c((lpi.e) aVar.f172510w.get(), (sm.e) bVar.f172524r.get(), ImmutableSet.copyOf((Collection) gn.e.a()), bVar.a());
            case 20:
                return new lpi.b(bq.i.i(aVar.f172496a), bq.i.j(aVar.f172496a));
            case 21:
                aVar.getClass();
                return new in.e(ImmutableSet.copyOf((Collection) pm.b.a()), (om.c) bVar.f172525s.get(), bVar.a());
            case 22:
                oak.e eVar = new oak.e();
                kli.a.p(eVar, bq.i.d(aVar.f172496a));
                return eVar;
            case 23:
                pak.i iVar = new pak.i((iak.b) bVar.f172520m.get(), (tpi.j) aVar.i.get(), (f9b.f) aVar.f172507r.get(), ((b3j.p) bVar.e).i(), (lak.c) bVar.f172521n.get());
                kli.a.p(iVar, bq.i.d(aVar.f172496a));
                return iVar;
            case 24:
                mak.d dVar2 = new mak.d((iak.b) bVar.f172520m.get(), ((b3j.p) bVar.e).g());
                kli.a.p(dVar2, bq.i.d(aVar.f172496a));
                return dVar2;
            case 25:
                com.revolut.retail.feature.pda.impl.ui.a aVar2 = new com.revolut.retail.feature.pda.impl.ui.a((xpi.g) aVar.d.get(), (ypi.i) aVar.e.get(), (tpi.j) aVar.i.get(), (f9b.f) aVar.f172507r.get(), (lak.c) bVar.f172521n.get(), (iak.b) bVar.f172520m.get(), (k3l.b) aVar.f172505p.get(), (kpi.c) aVar.f.get());
                kli.a.p(aVar2, bq.i.d(aVar.f172496a));
                return aVar2;
            default:
                throw new AssertionError(i);
        }
    }

    private final Object i() {
        jcc.e eVar = (jcc.e) this.f169007b;
        jcc.d dVar = (jcc.d) this.d;
        int i = this.f169008c;
        if (i == 0) {
            return new scc.j((gcc.g) eVar.o.get(), eVar.d.b(), (bcc.a) eVar.f172777p.get(), (c0) dVar.f172767c.get(), (cli.n) dVar.d.get(), dVar.f172765a);
        }
        if (i != 1) {
            if (i == 2) {
                return new qee.s(new ncc.d(new ncc.b()));
            }
            throw new AssertionError(i);
        }
        tcc.b.Companion.getClass();
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        c0 c0Var = hhm.f.f152429a;
        wfm.j jVar = new wfm.j(executorServiceNewSingleThreadExecutor);
        Intrinsics.checkNotNullExpressionValue(jVar, "from(...)");
        return jVar;
    }

    private final Object j() {
        jcc.e eVar = (jcc.e) this.f169007b;
        jcc.f fVar = (jcc.f) this.d;
        int i = this.f169008c;
        if (i == 0) {
            gcc.g gVar = (gcc.g) eVar.o.get();
            h4g.g gVarB = eVar.d.b();
            bcc.a aVar = (bcc.a) eVar.f172777p.get();
            eub.i iVarE = eVar.f172772h.e();
            vc.s.j(iVarE);
            return new qcc.m(gVar, gVarB, aVar, iVarE, (c0) fVar.f172785c.get(), (f01.a) fVar.e.get(), (cli.n) fVar.f.get(), fVar.f172783a);
        }
        if (i == 1) {
            rcc.b.Companion.getClass();
            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
            c0 c0Var = hhm.f.f152429a;
            wfm.j jVar = new wfm.j(executorServiceNewSingleThreadExecutor);
            Intrinsics.checkNotNullExpressionValue(jVar, "from(...)");
            return jVar;
        }
        if (i != 2) {
            if (i == 3) {
                return new qcc.o(new ncc.d(new ncc.b()));
            }
            throw new AssertionError(i);
        }
        com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) fVar.d.get();
        rcc.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(controller, "controller");
        return new f01.c(controller.m2());
    }

    private final Object k() {
        jd8.e eVar = (jd8.e) this.f169007b;
        jd8.b bVar = eVar.f173025b;
        jd8.d dVar = (jd8.d) this.d;
        int i = this.f169008c;
        if (i == 0) {
            return kxa.j.j((j60.a) dVar.d.get());
        }
        if (i == 1) {
            return v1.c.r((com.revolut.kompot.navigable.a) dVar.f173020b.get(), (rp0.m) dVar.f173021c.get());
        }
        if (i == 2) {
            return new rp0.m();
        }
        if (i != 3) {
            if (i == 4) {
                return new md8.t(dVar.f173019a);
            }
            if (i == 5) {
                return new md8.b();
            }
            throw new AssertionError(i);
        }
        cli.n nVar = (cli.n) dVar.f.get();
        md8.d dVar2 = dVar.f173019a;
        hj8.a aVarA = eVar.f173024a.a();
        vc.s.j(aVarA);
        kd8.x xVar = (kd8.x) bVar.v.get();
        vc.s.j(xVar);
        kd8.e eVarA = bVar.a();
        vc.s.j(eVarA);
        kbb.c cVarF = eVar.f173026c.f();
        md8.a aVar = (md8.a) dVar.f173022g.get();
        gte.a aVarB = eVar.d.b();
        vc.s.j(aVarB);
        return new md8.q(nVar, dVar2, aVarA, xVar, eVarA, cVarF, aVar, aVarB, (j60.a) dVar.d.get());
    }

    private final Object l() {
        jd9.a aVar = (jd9.a) this.f169007b;
        int i = this.f169008c;
        if (i != 0) {
            if (i == 1) {
                return new md9.m();
            }
            throw new AssertionError(i);
        }
        cli.n nVar = (cli.n) ((jd9.c) this.d).f173041a.get();
        bng.b bVar = new bng.b(aVar.f173034a.e(), 0);
        qpa.b bVarB = aVar.f173035b.b();
        vc.s.j(bVarB);
        q06.l lVarA = aVar.f173036c.a();
        vc.s.j(lVarA);
        gc9.a aVar2 = (gc9.a) aVar.d.V.get();
        vc.s.j(aVar2);
        return new md9.l(nVar, bVar, bVarB, lVarA, aVar2, ((h30.n) aVar.e).k());
    }

    @Override // phm.a
    public final Object get() {
        Object gVar;
        switch (this.f169006a) {
            case 0:
                c cVar = (c) this.d;
                e eVar = (e) this.f169007b;
                r rVar = eVar.f169015a;
                int i = this.f169008c;
                if (i == 0) {
                    nwb.a extension = (nwb.a) cVar.f169010b.get();
                    owb.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(extension, "extension");
                    vc.s.k(extension);
                    return extension;
                }
                if (i == 1) {
                    jwb.e eVarB = rVar.b();
                    vc.s.j(eVarB);
                    sf0.h hVarB = eVar.f169023n.b();
                    vc.s.j(hVarB);
                    v60.e eVarA = eVar.o.a();
                    vc.s.j(eVarA);
                    return new nwb.d(eVarB, hVarB, eVarA, new mwb.a());
                }
                if (i != 2) {
                    if (i == 3) {
                        return new rwb.l(cVar.f169009a);
                    }
                    throw new AssertionError(i);
                }
                cli.n nVar = (cli.n) cVar.d.get();
                i90.b bVar = new i90.b();
                RevPointsGiftcardsCheckoutController$InputData revPointsGiftcardsCheckoutController$InputData = cVar.f169009a;
                jwb.e eVarB2 = rVar.b();
                vc.s.j(eVarB2);
                nyb.k kVarC = eVar.d.c();
                vc.s.j(kVarC);
                return new rwb.h(nVar, bVar, revPointsGiftcardsCheckoutController$InputData, eVarB2, kVarC, (nwb.a) cVar.f169010b.get(), eVar.f169022m.e());
            case 1:
                d dVar = (d) this.d;
                e eVar2 = (e) this.f169007b;
                did.d dVar2 = eVar2.k;
                k0 k0Var = eVar2.d;
                ite.a aVar = eVar2.f169018g;
                l70.e eVar3 = eVar2.f;
                r rVar2 = eVar2.f169015a;
                int i2 = this.f169008c;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            return new c90.c(eVar2.f169019h);
                        }
                        throw new AssertionError(i2);
                    }
                    svb.a aVarA = rVar2.a();
                    vc.s.j(aVarA);
                    uwb.c cVar2 = new uwb.c();
                    uwb.d dVar3 = new uwb.d();
                    l80.e eVarH = eVar3.h();
                    vc.s.j(eVarH);
                    gte.a aVarB = aVar.b();
                    vc.s.j(aVarB);
                    l70.e eVar4 = dVar.f169013b.f;
                    fkg.a aVarD = eVar4.d();
                    c90.c cVar3 = (c90.c) dVar.f169014c.get();
                    c90.a aVarE = eVar4.e();
                    vc.s.j(aVarE);
                    return new twb.h0(aVarA, cVar2, dVar3, eVarH, aVarB, new uwb.i(aVarD, cVar3, aVarE));
                }
                cli.n nVar2 = (cli.n) dVar.d.get();
                RevPointsGiftcardDetailsScreenContract$InputData revPointsGiftcardDetailsScreenContract$InputData = dVar.f169012a;
                c70.a aVarZ = eVar3.z();
                vc.s.j(aVarZ);
                r70.c cVarA = eVar3.A();
                vc.s.j(cVarA);
                jwb.e eVarB3 = rVar2.b();
                vc.s.j(eVarB3);
                svb.a aVarA2 = rVar2.a();
                vc.s.j(aVarA2);
                nyb.k kVarC2 = k0Var.c();
                vc.s.j(kVarC2);
                eub.i iVarE = k0Var.e();
                vc.s.j(iVarE);
                ffk.t tVarF = eVar2.i.f();
                vc.s.j(tVarF);
                wub.a aVarA3 = eVar2.f169020j.a();
                vc.s.j(aVarA3);
                fmc.z zVarB = dVar2.b();
                fn2.c cVarA2 = dVar2.a();
                h4g.g gVarB = eVar2.f169021l.b();
                mwb.a aVar2 = new mwb.a();
                ang.f fVarE = eVar2.f169022m.e();
                gte.a aVarB2 = aVar.b();
                vc.s.j(aVarB2);
                return new com.revolut.feature.rev_points.giftcards.impl.ui.screen.giftcarddetails.a(nVar2, revPointsGiftcardDetailsScreenContract$InputData, aVarZ, cVarA, eVarB3, aVarA2, kVarC2, iVarE, tVarF, aVarA3, zVarB, cVarA2, gVarB, aVar2, fVarE, aVarB2);
            case 2:
                e eVar5 = (e) this.f169007b;
                l70.e eVar6 = eVar5.f;
                int i3 = this.f169008c;
                if (i3 != 0) {
                    if (i3 == 1) {
                        return new swb.k();
                    }
                    throw new AssertionError(i3);
                }
                jwb.e eVarB4 = eVar5.f169015a.b();
                vc.s.j(eVarB4);
                tqi.g gVarE = eVar5.f169024p.e();
                zk0.b bVarL = eVar6.l();
                vc.s.j(bVarL);
                l80.e eVarH2 = eVar6.h();
                vc.s.j(eVarH2);
                return new com.revolut.feature.rev_points.giftcards.impl.ui.screen.downloadcards.a(eVarB4, gVarE, bVarL, eVarH2, (cli.n) ((f) this.d).f169027a.get());
            case 3:
                int i5 = this.f169008c;
                if (i5 != 0) {
                    if (i5 == 1) {
                        return new ywb.n();
                    }
                    throw new AssertionError(i5);
                }
                cli.n nVar3 = (cli.n) ((i) this.d).f169034a.get();
                jwb.e eVarB5 = ((e) this.f169007b).f169015a.b();
                vc.s.j(eVarB5);
                return new ywb.m(nVar3, eVarB5);
            case 4:
                e eVar7 = (e) this.f169007b;
                int i6 = this.f169008c;
                if (i6 != 0) {
                    if (i6 == 1) {
                        return new axb.k();
                    }
                    throw new AssertionError(i6);
                }
                jwb.e eVarB6 = eVar7.f169015a.b();
                vc.s.j(eVarB6);
                l80.e eVarH3 = eVar7.f.h();
                vc.s.j(eVarH3);
                return new axb.j(eVarB6, eVarH3, (cli.n) ((k) this.d).f169039a.get());
            case 5:
                m mVar = (m) this.d;
                e eVar8 = (e) this.f169007b;
                int i21 = this.f169008c;
                switch (i21) {
                    case 0:
                        fd6.a aVar3 = (fd6.a) mVar.d.get();
                        va.g.t(aVar3);
                        return aVar3;
                    case 1:
                        return va.g.s(((zc6.a) eVar8.f169017c).d(), (xc6.a) mVar.f169046c.get());
                    case 2:
                        return r6.b.k((zc6.a) eVar8.f169017c, "factory");
                    case 3:
                        Object extension2 = (aub.a) mVar.f.get();
                        wwb.d.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension2, "extension");
                        yji.n nVar4 = (yji.n) extension2;
                        vc.s.k(nVar4);
                        return nVar4;
                    case 4:
                        z58.c cVar4 = eVar8.d.f326197h0;
                        he2.b provider = new he2.b(cVar4, (byte) 0);
                        wwb.d.Companion.getClass();
                        Intrinsics.checkNotNullParameter(provider, "provider");
                        Object obj2 = cVar4.get();
                        Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                        aub.a aVar4 = (aub.a) obj2;
                        vc.s.k(aVar4);
                        return aVar4;
                    case 5:
                        dyb.a extension3 = (dyb.a) mVar.f169048h.get();
                        wwb.d.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension3, "extension");
                        vc.s.k(extension3);
                        return extension3;
                    case 6:
                        o7.b provider2 = eVar8.d.d();
                        wwb.d.Companion.getClass();
                        Intrinsics.checkNotNullParameter(provider2, "provider");
                        dyb.a aVarE2 = provider2.e();
                        vc.s.k(aVarE2);
                        return aVarE2;
                    case 7:
                        return va.g.u((xc6.a) mVar.f169046c.get());
                    case 8:
                        cli.n nVar5 = (cli.n) mVar.k.get();
                        RevPointsGiftcardsHomeScreenContract$InputData revPointsGiftcardsHomeScreenContract$InputData = mVar.f169045b;
                        jwb.e eVarB7 = eVar8.f169015a.b();
                        vc.s.j(eVarB7);
                        eub.i iVarE2 = eVar8.d.e();
                        vc.s.j(iVarE2);
                        aub.a aVar5 = (aub.a) mVar.f.get();
                        dyb.a aVar6 = (dyb.a) mVar.f169048h.get();
                        a29.b bVarA = eVar8.e.a();
                        vc.s.j(bVarA);
                        return new vwb.n(nVar5, revPointsGiftcardsHomeScreenContract$InputData, eVarB7, iVarE2, aVar5, aVar6, bVarA, ((zc6.a) eVar8.f169017c).b());
                    case 9:
                        return new vwb.p(((zc6.a) eVar8.f169017c).c());
                    default:
                        throw new AssertionError(i21);
                }
            case 6:
                m mVar2 = (m) this.d;
                e eVar9 = (e) this.f169007b;
                int i22 = this.f169008c;
                switch (i22) {
                    case 0:
                        fd6.a aVar7 = (fd6.a) mVar2.d.get();
                        va.g.t(aVar7);
                        return aVar7;
                    case 1:
                        return va.g.s(((zc6.a) eVar9.f169017c).d(), (xc6.a) mVar2.f169046c.get());
                    case 2:
                        return r6.b.k((zc6.a) eVar9.f169017c, "factory");
                    case 3:
                        Object extension4 = (aub.a) mVar2.f.get();
                        wwb.d.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension4, "extension");
                        yji.n nVar6 = (yji.n) extension4;
                        vc.s.k(nVar6);
                        return nVar6;
                    case 4:
                        z58.c cVar5 = eVar9.d.f326197h0;
                        he2.b provider3 = new he2.b(cVar5, (byte) 0);
                        wwb.d.Companion.getClass();
                        Intrinsics.checkNotNullParameter(provider3, "provider");
                        Object obj3 = cVar5.get();
                        Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
                        aub.a aVar8 = (aub.a) obj3;
                        vc.s.k(aVar8);
                        return aVar8;
                    case 5:
                        dyb.a extension5 = (dyb.a) mVar2.f169048h.get();
                        wwb.d.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension5, "extension");
                        vc.s.k(extension5);
                        return extension5;
                    case 6:
                        o7.b provider4 = eVar9.d.d();
                        wwb.d.Companion.getClass();
                        Intrinsics.checkNotNullParameter(provider4, "provider");
                        dyb.a aVarE3 = provider4.e();
                        vc.s.k(aVarE3);
                        return aVarE3;
                    case 7:
                        return va.g.u((xc6.a) mVar2.f169046c.get());
                    case 8:
                        cli.n nVar7 = (cli.n) mVar2.k.get();
                        RevPointsGiftcardsHomeScreenContract$InputData revPointsGiftcardsHomeScreenContract$InputData2 = mVar2.f169045b;
                        jwb.e eVarB8 = eVar9.f169015a.b();
                        vc.s.j(eVarB8);
                        eub.i iVarE3 = eVar9.d.e();
                        vc.s.j(iVarE3);
                        aub.a aVar9 = (aub.a) mVar2.f.get();
                        dyb.a aVar10 = (dyb.a) mVar2.f169048h.get();
                        a29.b bVarA2 = eVar9.e.a();
                        vc.s.j(bVarA2);
                        return new vwb.n(nVar7, revPointsGiftcardsHomeScreenContract$InputData2, eVarB8, iVarE3, aVar9, aVar10, bVarA2, ((zc6.a) eVar9.f169017c).b());
                    case 9:
                        return new vwb.p(((zc6.a) eVar9.f169017c).c());
                    default:
                        throw new AssertionError(i22);
                }
            case 7:
                e eVar10 = (e) this.f169007b;
                r rVar3 = eVar10.f169015a;
                int i32 = this.f169008c;
                if (i32 != 0) {
                    if (i32 == 1) {
                        return new bxb.m();
                    }
                    throw new AssertionError(i32);
                }
                cli.n nVar8 = (cli.n) ((p) this.d).f169058b.get();
                jwb.e eVarB9 = rVar3.b();
                vc.s.j(eVarB9);
                jwb.a aVar11 = (jwb.a) rVar3.f169073s.get();
                vc.s.j(aVar11);
                a29.b bVarA3 = eVar10.e.a();
                vc.s.j(bVarA3);
                l80.e eVarH4 = eVar10.f.h();
                vc.s.j(eVarH4);
                return new bxb.l(nVar8, eVarB9, aVar11, bVarA3, eVarH4);
            case 8:
                e eVar11 = (e) this.f169007b;
                int i33 = this.f169008c;
                if (i33 != 0) {
                    if (i33 == 1) {
                        return new bxb.m();
                    }
                    throw new AssertionError(i33);
                }
                cli.n nVar9 = (cli.n) ((p) this.d).f169058b.get();
                jwb.e eVarB10 = eVar11.f169015a.b();
                vc.s.j(eVarB10);
                jwb.a aVar12 = (jwb.a) eVar11.f169015a.f169073s.get();
                vc.s.j(aVar12);
                a29.b bVarA4 = eVar11.e.a();
                vc.s.j(bVarA4);
                l80.e eVarH5 = eVar11.f.h();
                vc.s.j(eVarH5);
                return new bxb.l(nVar9, eVarB10, aVar12, bVarA4, eVarH5);
            case 9:
                iwh.f fVar = (iwh.f) this.d;
                CardLabelScreenContract$InputData cardLabelScreenContract$InputData = fVar.f169100a;
                int i43 = this.f169008c;
                if (i43 == 0) {
                    return new com.revolut.feature.card_label.ui.screen.card_label_screen.d((jki.p) fVar.f169101b.get(), cardLabelScreenContract$InputData, (gwh.b) ((iwh.c) this.f169007b).f169093h.get());
                }
                if (i43 == 1) {
                    return new com.revolut.feature.card_label.ui.screen.card_label_screen.e(cardLabelScreenContract$InputData);
                }
                throw new AssertionError(i43);
            case 10:
                iwh.c cVar6 = (iwh.c) this.f169007b;
                iwh.j jVar = (iwh.j) this.d;
                ShowCardPinScreenContract$InputData showCardPinScreenContract$InputData = jVar.f169109b;
                int i59 = this.f169008c;
                if (i59 == 0) {
                    return new wv2.n((cli.n) jVar.f169110c.get(), showCardPinScreenContract$InputData, (rv2.a) cVar6.f169092g.get(), (c90.c) cVar6.i.get());
                }
                if (i59 == 1) {
                    return new wv2.p(showCardPinScreenContract$InputData);
                }
                throw new AssertionError(i59);
            case 11:
                ix5.d dVar4 = (ix5.d) this.f169007b;
                ix5.f fVar2 = (ix5.f) this.d;
                int i66 = this.f169008c;
                switch (i66) {
                    case 0:
                        return kxa.j.k((j60.a) fVar2.f169365g.get());
                    case 1:
                        return ehe.n.s((com.revolut.kompot.navigable.a) fVar2.e.get(), (rp0.m) fVar2.f.get());
                    case 2:
                        return new rp0.m();
                    case 3:
                        fVar2.getClass();
                        ix5.d dVar5 = fVar2.d;
                        ny5.e eVar12 = new ny5.e();
                        jbh.e eVarC = dVar5.f169347c.C();
                        ttd.a aVarH = dVar5.d.f249364b.h();
                        f01.c cVarG = dVar5.e.g();
                        ifd.h hVarB2 = dVar5.f.b();
                        vc.s.j(hVarB2);
                        x0 x0Var = new x0(eVar12, eVarC, aVarH, cVarG, hVarB2);
                        CryptoTradeFlowContract$InputData cryptoTradeFlowContract$InputData = fVar2.f169362a;
                        tv5.b bVarC = dVar4.f169348g.c();
                        vc.s.j(bVarC);
                        ny5.g gVar2 = (ny5.g) fVar2.i.get();
                        my5.d dVar6 = (my5.d) fVar2.k.get();
                        ox5.i iVar = (ox5.i) fVar2.f169368l.get();
                        l3d.h0 h0VarB = dVar4.i.b();
                        vc.s.j(h0VarB);
                        l0 l0Var = (l0) fVar2.f169369m.get();
                        b9k.f fVarA = wpg.v.A(fVar2.f169363b, dVar5.f169350j.c());
                        px5.e eVar13 = (px5.e) fVar2.f169370n.get();
                        yud.g gVarD = dVar4.d.d();
                        x8h.g gVarB2 = dVar4.f169347c.b();
                        t70.b bVarG = dVar4.f169349h.g();
                        vc.s.j(bVarG);
                        kgm.c cVar7 = new kgm.c((tw5.i) dVar5.u.get());
                        gte.a aVarB3 = dVar4.k.b();
                        vc.s.j(aVarB3);
                        xv5.c cVarA3 = dVar4.f169348g.a();
                        vc.s.j(cVarA3);
                        mk0.a aVarA4 = dVar4.f169351l.a();
                        vc.s.j(aVarA4);
                        sh5.d dVarF = dVar4.f169352m.f();
                        vc.s.j(dVarF);
                        return new com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trade.b(x0Var, cryptoTradeFlowContract$InputData, bVarC, gVar2, dVar6, iVar, h0VarB, l0Var, fVarA, eVar13, gVarD, gVarB2, bVarG, cVar7, aVarB3, cVarA3, aVarA4, dVarF, dVar4.f169345a.a(), fVar2.f169364c);
                    case 4:
                        nw5.a aVarC = dVar4.f169345a.c();
                        vc.s.j(aVarC);
                        gVar = new ny5.g(aVarC);
                        break;
                    case 5:
                        nw5.j jVarD = dVar4.f169345a.d();
                        vc.s.j(jVarD);
                        return new my5.d(jVarD, new ny5.u(), (my5.a) fVar2.f169367j.get());
                    case 6:
                        return new o0();
                    case 7:
                        ny5.g gVar3 = (ny5.g) fVar2.i.get();
                        t70.b bVarG2 = fVar2.d.f169349h.g();
                        vc.s.j(bVarG2);
                        return new ox5.i(gVar3, new ny5.c(bVarG2), new ny5.u());
                    case 8:
                        com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) fVar2.e.get();
                        px5.d.Companion.getClass();
                        Intrinsics.checkNotNullParameter(controller, "controller");
                        gVar = new l0(controller.m2());
                        break;
                    case 9:
                        return new qx5.a();
                    default:
                        throw new AssertionError(i66);
                }
                return gVar;
            case 12:
                int i74 = this.f169008c;
                if (i74 == 0) {
                    return new com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.retail.a(((ix5.e) this.f169007b).f169359a, new ox5.j(), (iw5.j) ((ix5.g) this.d).f169371a.get(), new mx5.h());
                }
                if (i74 != 1) {
                    throw new AssertionError(i74);
                }
                lx5.a factory = new lx5.a();
                nx5.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory, "factory");
                return new lx5.b();
            case 13:
                j1a.d dVar7 = (j1a.d) this.d;
                j1a.i iVar2 = (j1a.i) this.f169007b;
                int i92 = this.f169008c;
                if (i92 != 0) {
                    if (i92 != 1) {
                        throw new AssertionError(i92);
                    }
                    RecurringSplitFlowContract$InputData recurringSplitFlowContract$InputData = dVar7.f170292a;
                    ln3.b contactsChooserNavigationScreenProvider = new ln3.b();
                    kp9.a billsChooserNavigationScreenProvider = new kp9.a();
                    Intrinsics.checkNotNullParameter(contactsChooserNavigationScreenProvider, "contactsChooserNavigationScreenProvider");
                    Intrinsics.checkNotNullParameter(billsChooserNavigationScreenProvider, "billsChooserNavigationScreenProvider");
                    return new com.revolut.feature.payments.splitbill.impl.ui_new.recurring_split.d(recurringSplitFlowContract$InputData, new y1a.g(), iVar2.a(), new com.revolut.feature.payments.splitbill.impl.ui_new.recurring_split.e(dVar7.f170293b.k.e()));
                }
                wj0.a idempotencyKeyHolder = ((nj0.d) iVar2.f170304a).i();
                vc.s.j(idempotencyKeyHolder);
                l80.e dateProvider = iVar2.d.h();
                vc.s.j(dateProvider);
                z1a.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
                Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
                return new m60.b(idempotencyKeyHolder, dateProvider, "payments_recurring_split");
            case 14:
                j1a.j jVar2 = (j1a.j) this.d;
                j1a.i iVar3 = jVar2.f170323c;
                j1a.i iVar4 = (j1a.i) this.f169007b;
                int i96 = this.f169008c;
                if (i96 != 0) {
                    if (i96 != 1) {
                        throw new AssertionError(i96);
                    }
                    BaseFlow flow = jVar2.f170322b;
                    p1a.a.Companion.getClass();
                    Intrinsics.checkNotNullParameter(flow, "flow");
                    return new f01.c(flow.m2());
                }
                SplitBillsFlowContract$InputData splitBillsFlowContract$InputData = jVar2.f170321a;
                kp9.a aVar13 = new kp9.a();
                ln3.b bVar2 = new ln3.b();
                com.revolut.feature.payments.groups.api.navigation.a aVar14 = (com.revolut.feature.payments.groups.api.navigation.a) iVar4.f170309j.N.get();
                vc.s.j(aVar14);
                q1a.b bVarC2 = iVar3.c();
                l1a.d splitBillDataPayerMapper = new l1a.d();
                Intrinsics.checkNotNullParameter(splitBillDataPayerMapper, "splitBillDataPayerMapper");
                l1a.e eVar14 = new l1a.e();
                l1a.d splitBillDataPayerMapper2 = new l1a.d();
                Intrinsics.checkNotNullParameter(splitBillDataPayerMapper2, "splitBillDataPayerMapper");
                l1a.h hVar = new l1a.h();
                thf.m mVarG = iVar3.f.g();
                vc.s.j(mVarG);
                o1a.b bVar3 = new o1a.b(bVarC2, eVar14, hVar, new l1a.c(mVarG, (f01.a) jVar2.d.get()));
                cl3.a aVarD2 = iVar4.i.d();
                vc.s.j(aVarD2);
                ang.f fVarE2 = iVar4.k.e();
                l70.e eVar15 = iVar3.d;
                pqi.a aVar15 = iVar3.f170310l;
                c70.a aVarZ2 = eVar15.z();
                vc.s.j(aVarZ2);
                nd.o oVarA = aVar15.a();
                f01.c cVarG2 = aVar15.g();
                gte.a aVarB4 = iVar3.f170311m.b();
                vc.s.j(aVarB4);
                fnc.s sVarB = iVar3.b();
                s1a.f fVar3 = new s1a.f();
                com.revolut.domain.interactors.transactions.a aVarC2 = ((bjf.a) iVar3.f170312n).c();
                vc.s.j(aVarC2);
                return new com.revolut.feature.payments.splitbill.impl.ui_new.e(splitBillsFlowContract$InputData, aVar13, bVar2, aVar14, bVar3, aVarD2, fVarE2, new r1a.e(aVarZ2, oVarA, cVarG2, aVarB4, sVarB, fVar3, aVarC2, new l1a.i(iVar3.b())));
            case 15:
                j1i.a aVar16 = (j1i.a) this.f169007b;
                j1i.b bVar4 = (j1i.b) this.d;
                int i99 = this.f169008c;
                switch (i99) {
                    case 0:
                        bVar4.getClass();
                        return new cn.d(ImmutableSet.copyOf((Collection) dn.b.a()), (cn.e) aVar16.Y.get(), aVar16.l());
                    case 1:
                        um.c cVar8 = (um.c) aVar16.Z.get();
                        bVar4.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(6);
                        j1i.a aVar17 = bVar4.f170493c;
                        builderBuilderWithExpectedSize.add(aVar17.m0.get());
                        builderBuilderWithExpectedSize.add(aVar17.h());
                        builderBuilderWithExpectedSize.add(aVar17.a());
                        builderBuilderWithExpectedSize.add(aVar17.n());
                        builderBuilderWithExpectedSize.addAll((Iterable) in.g.a());
                        builderBuilderWithExpectedSize.add(new jn.d(e4m.b.a(bVar4.e)));
                        return new in.e(cVar8, builderBuilderWithExpectedSize.build(), aVar16.l());
                    case 2:
                        return bq.i.t(bVar4.f170491a);
                    case 3:
                        bVar4.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize2 = ImmutableSet.builderWithExpectedSize(3);
                        builderBuilderWithExpectedSize2.addAll((Iterable) kn.g.a());
                        builderBuilderWithExpectedSize2.add(bVar4.f170494g.get());
                        builderBuilderWithExpectedSize2.add(new kn.h(e4m.b.a(bVar4.i)));
                        return new kn.e(builderBuilderWithExpectedSize2.build(), (ym.d) aVar16.f170468d0.get(), aVar16.l());
                    case 4:
                        return new zm.a();
                    case 5:
                        return new tpi.i((rpi.c) bVar4.f170495h.get(), gsi.c.a(bVar4.f170491a));
                    case 6:
                        return new rpi.b(bq.i.b(bVar4.f170491a));
                    case 7:
                        bVar4.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize3 = ImmutableSet.builderWithExpectedSize(2);
                        builderBuilderWithExpectedSize3.addAll((Iterable) hn.g.a());
                        builderBuilderWithExpectedSize3.add(bVar4.f170493c.n());
                        return new hn.d(builderBuilderWithExpectedSize3.build(), (hn.h) aVar16.f170478n0.get(), (npi.f) bVar4.k.get());
                    case 8:
                        Context contextI = bq.i.i(bVar4.f170491a);
                        BaseDelegatesActivity baseDelegatesActivityF = bq.i.f(bVar4.f170491a);
                        t70.g gVarO = aVar16.f170473j.o();
                        vc.s.j(gVarO);
                        return new npi.c(contextI, baseDelegatesActivityF, gVarO);
                    case 9:
                        return new en.c(ImmutableSet.of((ln.d) bVar4.f170493c.f170479o0.get()), bq.i.l(bVar4.f170491a));
                    case 10:
                        return new gn.c((lpi.e) bVar4.f170499n.get(), (sm.e) aVar16.p0.get(), ImmutableSet.copyOf((Collection) gn.e.a()), aVar16.l());
                    case 11:
                        return new lpi.b(bq.i.i(bVar4.f170491a), bq.i.j(bVar4.f170491a));
                    case 12:
                        bVar4.getClass();
                        return new in.e(ImmutableSet.copyOf((Collection) pm.b.a()), (om.c) aVar16.q0.get(), aVar16.l());
                    case 13:
                        return kpi.f.a();
                    case 14:
                        return new rpi.h(bq.i.b(bVar4.f170491a));
                    case 15:
                        return new iri.g((iri.j) aVar16.X.get(), (iri.m) aVar16.f170466b0.get(), bq.i.f(bVar4.f170491a), bq.i.l(bVar4.f170491a));
                    case 16:
                        return new iri.l((iri.m) aVar16.f170466b0.get(), bq.i.f(bVar4.f170491a), (iri.d) bVar4.f170504t.get());
                    case 17:
                        return new iri.d(bq.i.f(bVar4.f170491a));
                    case 18:
                        return new opi.b(bq.i.f(bVar4.f170491a));
                    case 19:
                        bVar4.getClass();
                        return new xpi.c(xpi.f.f307976c, bq.i.b(bVar4.f170491a));
                    case 20:
                        bVar4.getClass();
                        xoi.d dVar8 = bVar4.f170491a;
                        return new ypi.e(ypi.h.d, bq.i.b(dVar8), bq.i.o(dVar8), bq.i.g(dVar8));
                    case 21:
                        cqi.h hVar2 = (cqi.h) bVar4.f170507y.get();
                        an.a aVar18 = (an.a) aVar16.f170483r0.get();
                        ImmutableSet.Builder builderBuilderWithExpectedSize4 = ImmutableSet.builderWithExpectedSize(2);
                        builderBuilderWithExpectedSize4.add(bVar4.f170493c.k());
                        builderBuilderWithExpectedSize4.addAll((Iterable) bn.b.a());
                        return new an.q(hVar2, aVar18, builderBuilderWithExpectedSize4.build(), aVar16.l());
                    case 22:
                        return new cqi.j(bq.i.f(bVar4.f170491a));
                    case 23:
                        return new dqi.g(bq.i.b(bVar4.f170491a), bVar4.f170492b);
                    case 24:
                        return new k3l.d(bq.i.b(bVar4.f170491a));
                    case 25:
                        return new KeyboardSuggestionsDelegate(bq.i.b(bVar4.f170491a));
                    case 26:
                        bVar4.getClass();
                        return new g3l.c(ImmutableSet.copyOf((Collection) g3l.f.a()), (g3l.g) aVar16.f170464a0.get(), (k3l.b) bVar4.B.get(), aVar16.l());
                    case 27:
                        return new wm.l((opi.d) bVar4.v.get(), (wm.a) aVar16.f170487t0.get(), ImmutableSet.copyOf((Collection) xm.b.a()), aVar16.l());
                    case 28:
                        e4m.e eVar16 = bVar4.f170505w;
                        xoi.d dVar9 = bVar4.f170491a;
                        xpi.g gVar4 = (xpi.g) eVar16.get();
                        m1i.m mVar3 = (m1i.m) aVar16.f170485s0.get();
                        m1i.k kVar = (m1i.k) aVar16.l0.get();
                        ypi.i iVar5 = (ypi.i) bVar4.f170506x.get();
                        w80.b bVarJ = aVar16.f170473j.j();
                        vc.s.j(bVarJ);
                        tpi.j jVar3 = (tpi.j) bVar4.i.get();
                        f9b.f fVar4 = (f9b.f) bVar4.e.get();
                        cu8.a aVar19 = (cu8.a) bVar4.F.get();
                        rpi.c cVar9 = (rpi.c) bVar4.f170495h.get();
                        tri.c cVarE = bq.i.e(dVar9);
                        c2i.k kVar2 = (c2i.k) bVar4.H.get();
                        pri.f fVarD = bq.i.d(dVar9);
                        j1i.a aVar20 = bVar4.f170493c;
                        m1i.k kVar3 = (m1i.k) aVar20.l0.get();
                        m1i.m mVar4 = (m1i.m) aVar20.f170485s0.get();
                        tpi.j jVar4 = (tpi.j) bVar4.i.get();
                        f9b.f fVar5 = (f9b.f) bVar4.e.get();
                        k3l.b bVar5 = (k3l.b) bVar4.B.get();
                        ttd.a aVarH2 = aVar20.f170488w.f249364b.h();
                        gte.a aVarB5 = aVar20.f170475l.b();
                        vc.s.j(aVarB5);
                        h0 h0Var = new h0(aVarB5, aVar20.I.a(), aVarH2);
                        npi.a aVar21 = (npi.a) bVar4.k.get();
                        xvh.c cVarA4 = ((a6d.e) aVar20.J).a();
                        vc.s.j(cVarA4);
                        AccountId accountId = aVar20.f170484s;
                        lrh.a aVar22 = (lrh.a) ((krh.a) aVar20.f170490y).f188872g.get();
                        vc.s.j(aVar22);
                        e0 e0Var = new e0(kVar3, mVar4, jVar4, fVar5, bVar5, h0Var, aVar21, cVarA4, accountId, aVar22, new m1i.u((g1i.b) aVar20.f170466b0.get(), (ypi.i) bVar4.f170506x.get(), (k3l.b) bVar4.B.get(), (m1i.m) aVar20.f170485s0.get()));
                        h1i.a aVar23 = (h1i.a) bVar4.I.get();
                        l4i.a aVar24 = new l4i.a();
                        e2i.a aVar25 = (e2i.a) bVar4.J.get();
                        m1i.h hVar3 = (m1i.h) bVar4.K.get();
                        k5i.c cVarA5 = aVar16.k.a();
                        n1i.d dVar10 = (n1i.d) bVar4.L.get();
                        AccountId accountId2 = aVar16.f170484s;
                        gte.a aVarB6 = aVar16.f170475l.b();
                        vc.s.j(aVarB6);
                        p1i.a aVar26 = (p1i.a) bVar4.M.get();
                        ji5.i iVarC = aVar16.G.c();
                        vc.s.j(iVarC);
                        return new i1(gVar4, mVar3, kVar, iVar5, bVarJ, jVar3, fVar4, aVar19, cVar9, cVarE, kVar2, fVarD, e0Var, aVar23, aVar24, aVar25, hVar3, cVarA5, dVar10, accountId2, aVarB6, aVar26, iVarC, (g3l.a) aVar16.f170464a0.get(), aVar16.L.a(), (kpi.c) bVar4.f170501q.get());
                    case 29:
                        return nga.c.m(new o7.d(aVar16.H.a()), bq.i.l(bVar4.f170491a), (f9b.f) bVar4.e.get(), (tpi.j) bVar4.i.get());
                    case 30:
                        return new c2i.t((c2i.i) bVar4.G.get(), (c2i.j) aVar16.l0.get(), (opi.d) bVar4.v.get(), (xpi.g) bVar4.f170505w.get(), (c2i.l) aVar16.f170485s0.get(), bq.i.e(bVar4.f170491a), (rpi.c) bVar4.f170495h.get());
                    case 31:
                        return new com.revolut.feature_exchange.impl.ui.exchange.order_type_dialog.b();
                    case 32:
                        v0i.b bVar6 = aVar16.i;
                        return new i1i.c(new p1i.i(), (opi.d) bVar4.v.get(), (rpi.c) bVar4.f170495h.get());
                    case 33:
                        return new e2i.k((e2i.c) aVar16.f170485s0.get(), (opi.d) bVar4.v.get(), (rpi.c) bVar4.f170495h.get());
                    case 34:
                        w80.b bVarJ2 = aVar16.f170473j.j();
                        vc.s.j(bVarJ2);
                        l4i.a aVar27 = new l4i.a();
                        gte.a aVarB7 = aVar16.f170475l.b();
                        vc.s.j(aVarB7);
                        return new q1i.b(bVarJ2, aVar27, aVarB7, new u80.o(), aVar16.f170484s);
                    case 35:
                        gte.a aVarB8 = aVar16.f170475l.b();
                        vc.s.j(aVarB8);
                        spi.a aVar28 = (spi.a) bVar4.C.get();
                        gte.a aVarB9 = bVar4.f170493c.f170475l.b();
                        vc.s.j(aVarB9);
                        return new n1i.d(aVarB8, aVar28, new q1i.e(aVarB9), (m1i.k) aVar16.l0.get());
                    case 36:
                        v0i.b bVar7 = aVar16.i;
                        p1i.i iVar6 = new p1i.i();
                        wm.e eVar17 = (wm.e) aVar16.f170487t0.get();
                        rpi.c cVar10 = (rpi.c) bVar4.f170495h.get();
                        q06.l lVarA = aVar16.K.a();
                        vc.s.j(lVarA);
                        return new p1i.h(iVar6, eVar17, cVar10, lVarA, (ln.a) aVar16.f170479o0.get());
                    default:
                        throw new AssertionError(i99);
                }
            case 16:
                return a();
            case 17:
                return b();
            case 18:
                return c();
            case 19:
                return d();
            case 20:
                return e();
            case 21:
                return f();
            case 22:
                return g();
            case 23:
                jaj.b bVar8 = (jaj.b) this.f169007b;
                int i100 = this.f169008c;
                if (i100 != 0) {
                    if (i100 == 1) {
                        return new qaj.h();
                    }
                    throw new AssertionError(i100);
                }
                cli.n nVar10 = (cli.n) ((jaj.c) this.d).f172493a.get();
                oaj.a aVar29 = (oaj.a) bVar8.f172492l.get();
                gaj.b bVar9 = (gaj.b) bVar8.f.f172495a.get();
                vc.s.j(bVar9);
                return new qaj.g(nVar10, aVar29, bVar9);
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
                jdi.c cVar11 = (jdi.c) this.f169007b;
                jdi.m mVar5 = cVar11.f173080b;
                jdi.d dVar11 = (jdi.d) this.d;
                int i101 = this.f169008c;
                switch (i101) {
                    case 0:
                        return kxa.j.k((j60.a) dVar11.f173087c.get());
                    case 1:
                        return ehe.n.s((com.revolut.kompot.navigable.a) dVar11.f173085a.get(), (rp0.m) dVar11.f173086b.get());
                    case 2:
                        return new rp0.m();
                    case 3:
                        Object extension6 = (kdi.b) dVar11.e.get();
                        vdi.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension6, "extension");
                        yji.d dVar12 = (yji.d) extension6;
                        vc.s.k(dVar12);
                        return dVar12;
                    case 4:
                        ldi.f fVarA2 = mVar5.a();
                        vc.s.j(fVarA2);
                        return new kdi.c(fVarA2);
                    case 5:
                        cli.n nVar11 = (cli.n) dVar11.f173088g.get();
                        ldi.f fVarA3 = mVar5.a();
                        vc.s.j(fVarA3);
                        udi.a aVar30 = (udi.a) dVar11.f173089h.get();
                        wj0.a aVarI = ((nj0.d) cVar11.f173082g).i();
                        vc.s.j(aVarI);
                        j60.a aVar31 = (j60.a) dVar11.f173087c.get();
                        kdi.b bVar10 = (kdi.b) dVar11.e.get();
                        q06.l lVarA2 = cVar11.f173083h.a();
                        vc.s.j(lVarA2);
                        return new com.revolut.feature_rev_points_pocket_impl.ui.screen.details.b(nVar11, fVarA3, aVar30, aVarI, aVar31, bVar10, lVarA2);
                    case 6:
                        return new udi.u(new tdi.a());
                    case 7:
                        return new udi.b();
                    default:
                        throw new AssertionError(i101);
                }
        }
    }
}
