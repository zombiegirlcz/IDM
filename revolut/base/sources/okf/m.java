package okf;

import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction;
import com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails;
import com.revolut.feature.cms.stories.impl.ui.screen.CmsStoriesScreenContract$InputData;
import com.revolut.feature.freelancer.common.models.acquiring_order.AcquiringOrderFilter;
import com.revolut.feature.junior.isa.impl.ui.jisa_details.JuniorIsaDetailsScreenContract$InputData;
import com.revolut.feature.pricing_plans.upgrade_prompt.api.entry_point.UpgradeEntryPointItemContract$ItemType;
import dfj.m0;
import dp4.o0;
import et6.p1;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import n8i.b1;
import om4.e0;
import om4.r0;
import om4.r1;
import om4.x2;
import ood.g0;
import ood.l0;
import ood.q0;
import pdg.i0;
import tof.a3;
import tof.i7;
import tof.s9;
import tof.t3;
import tof.ta;
import tof.x1;
import tof.xa;
import vkm.j2;
import vkm.v1;
import zh9.u0;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.y0;

/* JADX INFO: loaded from: classes8.dex */
public final class m extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f226021w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f226022x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f226023y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(b80.c cVar, ot8.c cVar2, Continuation continuation) {
        super(3, continuation);
        this.u = 9;
        this.f226022x = cVar;
        this.f226023y = cVar2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                m mVar = new m((Continuation) obj4, (o) this.f226023y, 0);
                mVar.f226021w = (FlowCollector) obj2;
                mVar.f226022x = obj3;
                return mVar.invokeSuspend(Unit.f186387a);
            case 1:
                m mVar2 = new m((Continuation) obj4, (r) this.f226023y, 1);
                mVar2.f226021w = (FlowCollector) obj2;
                mVar2.f226022x = obj3;
                return mVar2.invokeSuspend(Unit.f186387a);
            case 2:
                m mVar3 = new m((Continuation) obj4, (e0) this.f226023y, 2);
                mVar3.f226021w = (FlowCollector) obj2;
                mVar3.f226022x = obj3;
                return mVar3.invokeSuspend(Unit.f186387a);
            case 3:
                m mVar4 = new m((Continuation) obj4, (r1) this.f226023y, 3);
                mVar4.f226021w = (FlowCollector) obj2;
                mVar4.f226022x = obj3;
                return mVar4.invokeSuspend(Unit.f186387a);
            case 4:
                m mVar5 = new m((Continuation) obj4, (o0) this.f226023y, 4);
                mVar5.f226021w = (FlowCollector) obj2;
                mVar5.f226022x = obj3;
                return mVar5.invokeSuspend(Unit.f186387a);
            case 5:
                m mVar6 = new m((Continuation) obj4, (onk.l) this.f226023y, 5);
                mVar6.f226021w = (FlowCollector) obj2;
                mVar6.f226022x = obj3;
                return mVar6.invokeSuspend(Unit.f186387a);
            case 6:
                m mVar7 = new m((Continuation) obj4, (q0) this.f226023y, 6);
                mVar7.f226021w = (FlowCollector) obj2;
                mVar7.f226022x = obj3;
                return mVar7.invokeSuspend(Unit.f186387a);
            case 7:
                m mVar8 = new m((hd.r) this.f226023y, (Continuation) obj4);
                mVar8.f226021w = (x4l.c) obj2;
                mVar8.f226022x = (ook.c) obj3;
                return mVar8.invokeSuspend(Unit.f186387a);
            case 8:
                m mVar9 = new m((Continuation) obj4, (oqe.t) this.f226023y, 8);
                mVar9.f226021w = (FlowCollector) obj2;
                mVar9.f226022x = obj3;
                return mVar9.invokeSuspend(Unit.f186387a);
            case 9:
                m mVar10 = new m((b80.c) this.f226022x, (ot8.c) this.f226023y, (Continuation) obj4);
                mVar10.f226021w = (ot8.b) obj3;
                return mVar10.invokeSuspend(Unit.f186387a);
            case 10:
                m mVar11 = new m((Continuation) obj4, (com.revolut.feature.freelancer.impl.ui.acquiring_order.list.a) this.f226023y, 10);
                mVar11.f226021w = (FlowCollector) obj2;
                mVar11.f226022x = obj3;
                return mVar11.invokeSuspend(Unit.f186387a);
            case 11:
                m mVar12 = new m((Continuation) obj4, (com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trade.b) this.f226023y, 11);
                mVar12.f226021w = (FlowCollector) obj2;
                mVar12.f226022x = obj3;
                return mVar12.invokeSuspend(Unit.f186387a);
            case 12:
                m mVar13 = new m((Continuation) obj4, (com.revolut.feature.freelancer.impl.ui.invoice.details.screen.a) this.f226023y, 12);
                mVar13.f226021w = (FlowCollector) obj2;
                mVar13.f226022x = obj3;
                return mVar13.invokeSuspend(Unit.f186387a);
            case 13:
                m mVar14 = new m((Continuation) obj4, (com.revolut.feature.freelancer.impl.ui.invoice.settings.recurring_settings.a) this.f226023y, 13);
                mVar14.f226021w = (FlowCollector) obj2;
                mVar14.f226022x = obj3;
                return mVar14.invokeSuspend(Unit.f186387a);
            case 14:
                m mVar15 = new m((Continuation) obj4, (p26.c) this.f226023y, 14);
                mVar15.f226021w = (FlowCollector) obj2;
                mVar15.f226022x = obj3;
                return mVar15.invokeSuspend(Unit.f186387a);
            case 15:
                m mVar16 = new m((Continuation) obj4, (p26.n) this.f226023y, 15);
                mVar16.f226021w = (FlowCollector) obj2;
                mVar16.f226022x = obj3;
                return mVar16.invokeSuspend(Unit.f186387a);
            case 16:
                m mVar17 = new m((Continuation) obj4, (p3b.l) this.f226023y, 16);
                mVar17.f226021w = (FlowCollector) obj2;
                mVar17.f226022x = obj3;
                return mVar17.invokeSuspend(Unit.f186387a);
            case 17:
                m mVar18 = new m((Continuation) obj4, (com.revolut.feature.apm.iris.impl.ui.settings.a) this.f226023y, 17);
                mVar18.f226021w = (FlowCollector) obj2;
                mVar18.f226022x = obj3;
                return mVar18.invokeSuspend(Unit.f186387a);
            case 18:
                m mVar19 = new m((Continuation) obj4, (com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.strategy_report.a) this.f226023y, 18);
                mVar19.f226021w = (FlowCollector) obj2;
                mVar19.f226022x = obj3;
                return mVar19.invokeSuspend(Unit.f186387a);
            case 19:
                m mVar20 = new m((Continuation) obj4, (p8f.h) this.f226023y, 19);
                mVar20.f226021w = (FlowCollector) obj2;
                mVar20.f226022x = obj3;
                return mVar20.invokeSuspend(Unit.f186387a);
            case 20:
                m mVar21 = new m((Continuation) obj4, (p8k.j) this.f226023y, 20);
                mVar21.f226021w = (FlowCollector) obj2;
                mVar21.f226022x = obj3;
                return mVar21.invokeSuspend(Unit.f186387a);
            case 21:
                m mVar22 = new m((Continuation) obj4, (com.revolut.feature.junior.isa.impl.ui.jisa_details.a) this.f226023y, 21);
                mVar22.f226021w = (FlowCollector) obj2;
                mVar22.f226022x = obj3;
                return mVar22.invokeSuspend(Unit.f186387a);
            case 22:
                m mVar23 = new m((Continuation) obj4, (com.revolut.feature.apm.payto.impl.screen.pay_to_confirmation_screen.b) this.f226023y, 22);
                mVar23.f226021w = (FlowCollector) obj2;
                mVar23.f226022x = obj3;
                return mVar23.invokeSuspend(Unit.f186387a);
            case 23:
                m mVar24 = new m((Continuation) obj4, (i0) this.f226023y, 23);
                mVar24.f226021w = (FlowCollector) obj2;
                mVar24.f226022x = obj3;
                return mVar24.invokeSuspend(Unit.f186387a);
            case 24:
                m mVar25 = new m((Continuation) obj4, (pf2.n) this.f226023y, 24);
                mVar25.f226021w = (FlowCollector) obj2;
                mVar25.f226022x = obj3;
                return mVar25.invokeSuspend(Unit.f186387a);
            case 25:
                m mVar26 = new m((Continuation) obj4, (com.revolut.feature.retail.salary_account.impl.salary_hub_phase3.a) this.f226023y, 25);
                mVar26.f226021w = (FlowCollector) obj2;
                mVar26.f226022x = obj3;
                return mVar26.invokeSuspend(Unit.f186387a);
            case 26:
                m mVar27 = new m((Continuation) obj4, (uf0.b) this.f226023y, 26);
                mVar27.f226021w = (FlowCollector) obj2;
                mVar27.f226022x = obj3;
                return mVar27.invokeSuspend(Unit.f186387a);
            case 27:
                m mVar28 = new m((Continuation) obj4, (pj3.r) this.f226023y, 27);
                mVar28.f226021w = (FlowCollector) obj2;
                mVar28.f226022x = obj3;
                return mVar28.invokeSuspend(Unit.f186387a);
            case 28:
                m mVar29 = new m((Continuation) obj4, (pj9.l) this.f226023y, 28);
                mVar29.f226021w = (FlowCollector) obj2;
                mVar29.f226022x = obj3;
                return mVar29.invokeSuspend(Unit.f186387a);
            default:
                m mVar30 = new m((Continuation) obj4, (pkf.v) this.f226023y, 29);
                mVar30.f226021w = (FlowCollector) obj2;
                mVar30.f226022x = obj3;
                return mVar30.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Exception {
        Set setI1;
        Flow gVar;
        List list;
        Flow flowQ;
        int i = this.u;
        int i2 = 12;
        int i3 = 15;
        int i5 = 18;
        int i6 = 26;
        int i21 = 3;
        int i22 = 8;
        w4l.h loadingStrategy = w4l.h.f294642c;
        int i32 = 2;
        int i33 = 0;
        Object obj3 = this.f226023y;
        Continuation continuation = null;
        switch (i) {
            case 0:
                o oVar = (o) obj3;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = (FlowCollector) this.f226021w;
                    t3 t3Var = (t3) this.f226022x;
                    tof.v vVar = t3Var != null ? t3Var.g0 : null;
                    String str = vVar != null ? vVar.d : null;
                    LocalDate localDate = vVar != null ? vVar.f273112c : null;
                    Flow gVar2 = (!d0.T(zhm.v.k(tof.w.PURCHASE_INTEREST, tof.w.LATE_PENALTY_INTEREST), vVar != null ? vVar.f273110a : null) || str == null || localDate == null) ? new go.g(f0.f322471a, 2) : new mle.x(n14.k.p(nim.a.v(((x2) oVar.f226026b).r(str, localDate, loadingStrategy), new ojk.a(10)), new ojk.a(11)), oVar, str, 6);
                    this.f226021w = null;
                    this.f226022x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, gVar2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                r rVar = (r) obj3;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = (FlowCollector) this.f226021w;
                    t3 t3Var2 = (t3) this.f226022x;
                    tof.v vVar2 = t3Var2 != null ? t3Var2.g0 : null;
                    if (vVar2 == null || (list = vVar2.f273111b) == null || (setI1 = d0.i1(list)) == null) {
                        setI1 = h0.f322473a;
                    }
                    if ((vVar2 != null ? vVar2.f273110a : null) != tof.w.CASH_LIKE_INTEREST || setI1.isEmpty()) {
                        gVar = new go.g(f0.f322471a, 2);
                    } else {
                        rVar.getClass();
                        i7.c cVar = i7.Companion;
                        i7[] i7VarArr = {new s9(setI1), new xa(io3.l.CREDIT)};
                        cVar.getClass();
                        gVar = new mle.x(n14.k.p(nim.a.v(rd0.e.b(whf.b.a(rVar.f226030b, te0.w.h(i7.c.a(i7VarArr)), null, null, null, 14)), new ojk.a(i2)), new ojk.a(13)), rVar, vVar2, 7);
                    }
                    this.f226021w = null;
                    this.f226022x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, gVar, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector3 = (FlowCollector) this.f226021w;
                    Flow flowA = ((e0) obj3).a((w4l.k) this.f226022x);
                    this.f226021w = null;
                    this.f226022x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, flowA, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector4 = (FlowCollector) this.f226021w;
                    List list2 = (List) this.f226022x;
                    if (list2.isEmpty()) {
                        flowQ = new go.g(new Data(f0.f322471a, null, false, 6, null), 2);
                    } else {
                        r1 r1Var = (r1) obj3;
                        List<String> list3 = list2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list3, 10));
                        for (String str2 : list3) {
                            arrayList.add(n14.k.p(nim.a.v(r1Var.m(str2, loadingStrategy), new o23.l(str2, i6)), new om4.o0(i22)));
                        }
                        flowQ = vkm.q.q(nim.a.v(u0.k(arrayList), new om4.o0(9)));
                    }
                    this.f226021w = null;
                    this.f226022x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector4, flowQ, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector5 = (FlowCollector) this.f226021w;
                    akg.n nVarA = ((o0) obj3).a((w4l.k) this.f226022x, true);
                    this.f226021w = null;
                    this.f226022x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector5, nVarA, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 5:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector6 = (FlowCollector) this.f226021w;
                    w4l.k loadingStrategy2 = (w4l.k) this.f226022x;
                    wik.t tVar = (wik.t) ((onk.l) obj3).f226964t;
                    tVar.getClass();
                    Intrinsics.checkNotNullParameter(loadingStrategy2, "loadingStrategy");
                    efm.r rVarDistinctUntilChanged = nim.a.w(tVar.f297936b.v(loadingStrategy), new wgk.f(19)).distinctUntilChanged();
                    Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
                    Flow flowE = boh.f.e(rd0.e.b(rVarDistinctUntilChanged), new wg2.g(tVar, loadingStrategy2, 11));
                    this.f226021w = null;
                    this.f226022x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector6, flowE, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 6:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector7 = (FlowCollector) this.f226021w;
                    q0 q0Var = (q0) obj3;
                    AccountId accountIdA = com.revolut.retail.feature.api.a.a(q0Var.D);
                    efm.r rVarX = q0Var.f227073t.E(accountIdA).x();
                    Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
                    wkm.l lVarH = vkm.q.H(new l0(q0Var, continuation, i33), yh5.b.d(boh.f.e(vkm.q.r(new g0(0), nim.a.u(new m84.c(i32, i5, continuation), u0.m(u0.i(new o9a.e(rd0.e.b(rVarX), 13), new o9a.e(rd0.e.b(((le3.b0) q0Var.f227071r).d(accountIdA, false)), 14), j0j.a.a(q0Var.o)), u0.m(new o9a.e(rd0.e.b(q0Var.f227072s.f196950b), i3), q0Var.z.j())))), new ood.k(q0Var, accountIdA, 1)), q0Var.A.b(loadingStrategy)));
                    this.f226021w = null;
                    this.f226022x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector7, lVarH, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 7:
                x4l.c cVar2 = (x4l.c) this.f226021w;
                ook.c cVar3 = (ook.c) this.f226022x;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 != 0) {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                hd.r rVar2 = (hd.r) obj3;
                om4.l0 l0Var = new om4.l0(cVar3, i22, cVar2, rVar2);
                oh4.i iVar = new oh4.i(rVar2, cVar3, continuation, 25);
                this.f226021w = null;
                this.f226022x = null;
                this.v = 1;
                Object objI = hd.r.i(rVar2, 7, l0Var, iVar, this);
                return objI == aVar8 ? aVar8 : objI;
            case 8:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector8 = (FlowCollector) this.f226021w;
                    oqe.t tVar2 = (oqe.t) obj3;
                    m0 m0VarA = tVar2.f227900p.a(tVar2.o.f90332a, (w4l.k) this.f226022x);
                    this.f226021w = null;
                    this.f226022x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector8, m0VarA, this) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 9:
                ot8.b bVar = (ot8.b) this.f226021w;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 != 0) {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                b80.c cVar4 = (b80.c) this.f226022x;
                ol8.e eVar = new ol8.e((ot8.c) obj3, bVar, continuation, i22);
                this.f226021w = null;
                this.v = 1;
                Object objM0 = te0.w.m0(cVar4, eVar, this);
                return objM0 == aVar10 ? aVar10 : objM0;
            case 10:
                com.revolut.feature.freelancer.impl.ui.acquiring_order.list.a aVar11 = (com.revolut.feature.freelancer.impl.ui.acquiring_order.list.a) obj3;
                cli.y yVar = aVar11.f73703x;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector9 = (FlowCollector) this.f226021w;
                    Flow flowB = yVar.B(ou6.t.f229844a);
                    Flow flowB2 = yVar.B(ou6.u.f229845a);
                    b9k.f fVar = aVar11.o;
                    AcquiringOrderFilter acquiringOrderFilter = ((ou6.h) ((j2) yVar.f22677a).getValue()).e;
                    Intrinsics.checkNotNullParameter(w4l.i.f294643c, "loadingStrategy");
                    j23.b bVarE = yh5.b.e(flowB, flowB2, fVar.t(acquiringOrderFilter, new nr6.b0(false), new gr6.b()));
                    this.f226021w = null;
                    this.f226022x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector9, bVarE, this) == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 11:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector10 = (FlowCollector) this.f226021w;
                    int iIntValue = ((Number) this.f226022x).intValue();
                    l3d.h0 h0Var = ((com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trade.b) obj3).f71570t;
                    y1d.b.Companion.getClass();
                    v1 v1VarG = l3d.h0.g(h0Var, y0.b(y1d.a.f310359c), "COMBINED_WATCHLIST_ORDERING_CRYPTO", true, true, new Integer(iIntValue), 64);
                    this.f226021w = null;
                    this.f226022x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector10, v1VarG, this) == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 12:
                com.revolut.feature.freelancer.impl.ui.invoice.details.screen.a aVar14 = (com.revolut.feature.freelancer.impl.ui.invoice.details.screen.a) obj3;
                p1 p1Var = aVar14.f73869s;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector11 = (FlowCollector) this.f226021w;
                    Flow flowE2 = boh.f.e(rd0.e.b(kli.a.h(p1Var.d(aVar14.f73870t.f73864a, true), p1Var.e(false))), new b1(aVar14, i2));
                    this.f226021w = null;
                    this.f226022x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector11, flowE2, this) == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 13:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector12 = (FlowCollector) this.f226021w;
                    vkm.d dVarB = rd0.e.b(((com.revolut.feature.freelancer.impl.ui.invoice.settings.recurring_settings.a) obj3).f73934p.e(false));
                    this.f226021w = null;
                    this.f226022x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector12, dVarB, this) == aVar16) {
                        return aVar16;
                    }
                } else {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 14:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector13 = (FlowCollector) this.f226021w;
                    akg.n nVarV = nim.a.v(t46.a.a(((p26.c) obj3).f232080b, zhm.u.c((Pair) this.f226022x)), p26.b.f232078a);
                    this.f226021w = null;
                    this.f226022x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector13, nVarV, this) == aVar17) {
                        return aVar17;
                    }
                } else {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 15:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector14 = (FlowCollector) this.f226021w;
                    qta.f duration = (qta.f) this.f226022x;
                    p26.c cVar5 = ((p26.n) obj3).f232096b;
                    cVar5.getClass();
                    Intrinsics.checkNotNullParameter(duration, "duration");
                    wkm.l lVarQ = vkm.q.Q(new oi3.g(rd0.e.b(xv5.c.b(cVar5.f232081c)), cVar5, 16), new r0(continuation, cVar5, duration, i21));
                    this.f226021w = null;
                    this.f226022x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector14, lVarQ, this) == aVar18) {
                        return aVar18;
                    }
                } else {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 16:
                p3b.l lVar = (p3b.l) obj3;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector15 = (FlowCollector) this.f226021w;
                    Flow flowE3 = boh.f.e(rd0.e.b(((ael.k) lVar.f232728s).f(lVar.f232727r.f232712a)), new p3b.k(lVar, (w4l.k) this.f226022x));
                    this.f226021w = null;
                    this.f226022x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector15, flowE3, this) == aVar19) {
                        return aVar19;
                    }
                } else {
                    if (i109 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 17:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector16 = (FlowCollector) this.f226021w;
                    vkm.y yVarE = rd0.e.e(nim.a.u(new p62.p(2, null), zi0.c.w(vw1.b.c(((com.revolut.feature.apm.iris.impl.ui.settings.a) obj3).f62534q.f21584a))), h0.f322473a, new im2.b(i21, 29, continuation));
                    this.f226021w = null;
                    this.f226022x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector16, yVarE, this) == aVar20) {
                        return aVar20;
                    }
                } else {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 18:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector17 = (FlowCollector) this.f226021w;
                    String investorUpdateId = (String) this.f226022x;
                    t1j.b bVar2 = ((com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.strategy_report.a) obj3).o;
                    bVar2.getClass();
                    Intrinsics.checkNotNullParameter(investorUpdateId, "investorUpdateId");
                    kgm.i iVar2 = (kgm.i) bVar2.f267380b;
                    Intrinsics.checkNotNullParameter(investorUpdateId, "investorUpdateId");
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    vkm.d dVarB2 = ((x4l.c) iVar2.f184023b).b(investorUpdateId, loadingStrategy);
                    this.f226021w = null;
                    this.f226022x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector17, dVarB2, this) == aVar21) {
                        return aVar21;
                    }
                } else {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 19:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector18 = (FlowCollector) this.f226021w;
                    p8f.h hVar = (p8f.h) obj3;
                    Flow flowB3 = hVar.f234152p.b(hVar.o.f91491a, a6f.a.FORCE_TEMPLATE);
                    this.f226021w = null;
                    this.f226022x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector18, flowB3, this) == aVar22) {
                        return aVar22;
                    }
                } else {
                    if (i112 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 20:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                if (i113 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector19 = (FlowCollector) this.f226021w;
                    xi0.b bVar3 = (xi0.b) this.f226022x;
                    k61.a aVar24 = ((p8k.j) obj3).f234174n;
                    Intrinsics.h(bVar3);
                    vkm.d dVarB3 = rd0.e.b(((k61.i) aVar24).h(bVar3));
                    this.f226021w = null;
                    this.f226022x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector19, dVarB3, this) == aVar23) {
                        return aVar23;
                    }
                } else {
                    if (i113 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 21:
                com.revolut.feature.junior.isa.impl.ui.jisa_details.a aVar25 = (com.revolut.feature.junior.isa.impl.ui.jisa_details.a) obj3;
                JuniorIsaDetailsScreenContract$InputData juniorIsaDetailsScreenContract$InputData = aVar25.o;
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                int i114 = this.v;
                if (i114 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector20 = (FlowCollector) this.f226021w;
                    w4l.k loadingStrategy3 = (w4l.k) this.f226022x;
                    wkm.l lVarD = hj8.a.d(aVar25.f76794p, juniorIsaDetailsScreenContract$InputData.f76787a, loadingStrategy3);
                    z98.d dVar = aVar25.f76795q;
                    String value = juniorIsaDetailsScreenContract$InputData.f76787a;
                    Intrinsics.checkNotNullParameter(value, "value");
                    dVar.getClass();
                    Intrinsics.checkNotNullParameter(value, "$v$c$com-revolut-feature-identity-auth-domain-model-RegisteredIdentityId$-juniorRegId$0");
                    Intrinsics.checkNotNullParameter(loadingStrategy3, "loadingStrategy");
                    ca8.a aVar27 = dVar.f320320a;
                    aVar27.getClass();
                    Intrinsics.checkNotNullParameter(value, "$v$c$com-revolut-feature-identity-auth-domain-model-RegisteredIdentityId$-juniorRegId$0");
                    Intrinsics.checkNotNullParameter(loadingStrategy3, "loadingStrategy");
                    j23.b bVarE2 = yh5.b.e(lVarD, aVar27.d.b(value, loadingStrategy3), nim.a.v(rd0.e.b(aVar25.f76796r.K(loadingStrategy3)), new p5a.m(21)));
                    this.f226021w = null;
                    this.f226022x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector20, bVarE2, this) == aVar26) {
                        return aVar26;
                    }
                } else {
                    if (i114 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 22:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                int i115 = this.v;
                if (i115 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector21 = (FlowCollector) this.f226021w;
                    PaymentMethodDetails paymentMethodDetails = ((ApmPaymentAuthorisationPendingAction) this.f226022x).getF61991a().f61995g;
                    Intrinsics.i(paymentMethodDetails, "null cannot be cast to non-null type com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails.PayTo");
                    String str3 = ((PaymentMethodDetails.PayTo) paymentMethodDetails).f62045c;
                    wsg.n nVar = ((com.revolut.feature.apm.payto.impl.screen.pay_to_confirmation_screen.b) obj3).f62755q;
                    j23.b bVarD = yh5.b.d(mo3.a.g(rd0.e.b(nVar.g0(fo3.d.PERSONAL, loadingStrategy, null)), null, new p4a.g(i6), 1), mo3.a.g(rd0.e.b(nVar.g0(fo3.d.PERSONAL_JOINT, loadingStrategy, null)), null, new p4a.g(27), 1));
                    this.f226021w = null;
                    this.f226022x = null;
                    this.v = 1;
                    vkm.q.w(flowCollector21);
                    Object objCollect = bVarD.collect(new nj8.g(flowCollector21, str3, i21), this);
                    if (objCollect != aVar28) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect != aVar28) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect == aVar28) {
                        return aVar28;
                    }
                } else {
                    if (i115 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 23:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                int i116 = this.v;
                if (i116 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector22 = (FlowCollector) this.f226021w;
                    yhm.r rVar3 = (yhm.r) this.f226022x;
                    LocalDate localDate2 = (LocalDate) rVar3.f314201a;
                    LocalDate localDate3 = (LocalDate) rVar3.f314202b;
                    List list4 = (List) rVar3.f314203c;
                    i0 i0Var = (i0) obj3;
                    wkm.l lVarQ2 = vkm.q.Q(rd0.e.b(ue0.e.p(zi0.c.J(i0Var.f235190p.a(new yfi.a(i0Var.o.f93981a.f93670a, Boolean.TRUE, localDate2, localDate3, hx7.a.F(list4)), false)), h0.f322473a)), new ahe.y0((Continuation) null, i0Var, localDate2, localDate3, list4));
                    this.f226021w = null;
                    this.f226022x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector22, lVarQ2, this) == aVar29) {
                        return aVar29;
                    }
                } else {
                    if (i116 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 24:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                int i117 = this.v;
                if (i117 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector23 = (FlowCollector) this.f226021w;
                    lal.a aVar31 = ((pf2.n) obj3).o;
                    vkm.y yVarE2 = rd0.e.e(new bo8.w(yh5.b.e(rd0.e.b(whf.b.a((whf.b) aVar31.f193426b, te0.w.h(new ta(x1.UPI)), null, 3, null, 10)), nim.a.v(hg2.h.c((hg2.h) aVar31.f193427c), new m98.k(aVar31, i5)), rd0.e.b(nim.a.w(xx9.p.c((xx9.p) aVar31.e, false, null, 3), new md0.c(i3)))), 4), h0.f322473a, new im2.b(i21, 17, continuation));
                    this.f226021w = null;
                    this.f226022x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector23, yVarE2, this) == aVar30) {
                        return aVar30;
                    }
                } else {
                    if (i117 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 25:
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                int i118 = this.v;
                if (i118 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector24 = (FlowCollector) this.f226021w;
                    w4l.k loadingStrategy4 = (w4l.k) this.f226022x;
                    xfb.s sVar = ((com.revolut.feature.retail.salary_account.impl.salary_hub_phase3.a) obj3).o;
                    sVar.getClass();
                    Intrinsics.checkNotNullParameter(loadingStrategy4, "loadingStrategy");
                    kgb.g gVar3 = sVar.f305228a;
                    gVar3.getClass();
                    Intrinsics.checkNotNullParameter(loadingStrategy4, "loadingStrategy");
                    vkm.d dVarB4 = gVar3.f.b(Unit.f186387a, loadingStrategy4);
                    this.f226021w = null;
                    this.f226022x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector24, dVarB4, this) == aVar32) {
                        return aVar32;
                    }
                } else {
                    if (i118 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 26:
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                int i119 = this.v;
                if (i119 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector25 = (FlowCollector) this.f226021w;
                    this.f226021w = null;
                    this.f226022x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector25, (uf0.b) obj3, this) == aVar33) {
                        return aVar33;
                    }
                } else {
                    if (i119 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 27:
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                int i120 = this.v;
                if (i120 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector26 = (FlowCollector) this.f226021w;
                    w4l.k loadingStrategy5 = (w4l.k) this.f226022x;
                    pj3.r rVar4 = (pj3.r) obj3;
                    jj3.e eVar2 = rVar4.f236650p;
                    CmsStoriesScreenContract$InputData cmsStoriesScreenContract$InputData = rVar4.o;
                    String managedCampaignReference = cmsStoriesScreenContract$InputData.f65944a;
                    Map queryParameters = cmsStoriesScreenContract$InputData.f65946c;
                    eVar2.getClass();
                    Intrinsics.checkNotNullParameter(managedCampaignReference, "managedCampaignReference");
                    Intrinsics.checkNotNullParameter(loadingStrategy5, "loadingStrategy");
                    Intrinsics.checkNotNullParameter(queryParameters, "queryParameters");
                    vkm.d dVarB5 = eVar2.d.b(new jj3.c(managedCampaignReference, queryParameters), loadingStrategy5);
                    this.f226021w = null;
                    this.f226022x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector26, dVarB5, this) == aVar34) {
                        return aVar34;
                    }
                } else {
                    if (i120 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 28:
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                int i121 = this.v;
                if (i121 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector27 = (FlowCollector) this.f226021w;
                    String str4 = (String) this.f226022x;
                    Flow flowB4 = str4 != null ? ((ti9.n) ((pj9.l) obj3).f236713p).b(str4) : vkm.i.f290039a;
                    this.f226021w = null;
                    this.f226022x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector27, flowB4, this) == aVar35) {
                        return aVar35;
                    }
                } else {
                    if (i121 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                int i122 = this.v;
                if (i122 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector28 = (FlowCollector) this.f226021w;
                    a3 a3Var = (a3) this.f226022x;
                    pkf.v vVar3 = (pkf.v) obj3;
                    vVar3.getClass();
                    Flow r0Var = k71.k.t(a3Var) ? new n33.r0(mo3.a.e(rd0.e.b(((tga.k) vVar3.f237138m).c(k71.k.s(a3Var) ? UpgradeEntryPointItemContract$ItemType.Transaction.CryptoFeeTiering.f80997a : UpgradeEntryPointItemContract$ItemType.Transaction.Commodity.f80995a)), new g3e.s(i6), new pj9.m(i22)), 20) : new go.g(f0.f322471a, 2);
                    this.f226021w = null;
                    this.f226022x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector28, r0Var, this) == aVar36) {
                        return aVar36;
                    }
                } else {
                    if (i122 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(hd.r rVar, Continuation continuation) {
        super(3, continuation);
        this.u = 7;
        this.f226023y = rVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(Continuation continuation, Object obj2, int i) {
        super(3, continuation);
        this.u = i;
        this.f226023y = obj2;
    }
}
