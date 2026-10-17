package r3k;

import chc.c0;
import cmf.p;
import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.crypto_investments.api.navigation.CryptoInvestmentsFeatureConfig;
import com.revolut.feature.crypto_investments.impl.ui.screens.activity.ActivityScreenContract$InputData;
import com.revolut.feature.statements.api.models.StatementUrlState;
import com.revolut.feature.store.impl.ui.brand_detail.screen.discount.StoreBrandDetailDiscountScreenContract$InputData;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.goals.category_budget.CategoryBudgetContract$InputData;
import com.revolut.retail.feature.payments.bank_transfer.api.domain.model.RemittanceRouteId;
import dej.o3;
import e8h.p0;
import efm.r;
import et6.y0;
import gim.i;
import hmf.k0;
import java.util.ArrayList;
import java.util.List;
import kkf.i0;
import kkf.j2;
import kl.t1;
import klf.j1;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import le3.b0;
import lfg.g0;
import mga.d0;
import mif.e0;
import om4.r0;
import p24.q;
import q97.b1;
import raf.n;
import rg3.o;
import rhj.l;
import rj9.j;
import ru5.z;
import rv1.v;
import rv6.u;
import ryd.w;
import ryj.x;
import s0d.m;
import s2e.k;
import s4b.g;
import tof.i7;
import vdl.c1;
import vkm.s1;
import vkm.v1;
import vkm.y;
import w4l.h;
import x8h.v0;
import xkf.e1;
import yhm.m;
import zh9.u0;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f251302w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f251303x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f251304y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Continuation continuation, Object obj2, int i) {
        super(3, continuation);
        this.u = i;
        this.f251304y = obj2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        switch (this.u) {
            case 0:
                c cVar = new c((Continuation) obj4, (f) this.f251304y, 0);
                cVar.f251302w = flowCollector;
                cVar.f251303x = obj3;
                return cVar.invokeSuspend(Unit.f186387a);
            case 1:
                c cVar2 = new c((Continuation) obj4, (com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.review.a) this.f251304y, 1);
                cVar2.f251302w = flowCollector;
                cVar2.f251303x = obj3;
                return cVar2.invokeSuspend(Unit.f186387a);
            case 2:
                c cVar3 = new c((Continuation) obj4, (r55.b) this.f251304y, 2);
                cVar3.f251302w = flowCollector;
                cVar3.f251303x = obj3;
                return cVar3.invokeSuspend(Unit.f186387a);
            case 3:
                c cVar4 = new c((Continuation) obj4, (n) this.f251304y, 3);
                cVar4.f251302w = flowCollector;
                cVar4.f251303x = obj3;
                return cVar4.invokeSuspend(Unit.f186387a);
            case 4:
                c cVar5 = new c((Continuation) obj4, (o) this.f251304y, 4);
                cVar5.f251302w = flowCollector;
                cVar5.f251303x = obj3;
                return cVar5.invokeSuspend(Unit.f186387a);
            case 5:
                c cVar6 = new c((Continuation) obj4, (com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.filters.a) this.f251304y, 5);
                cVar6.f251302w = flowCollector;
                cVar6.f251303x = obj3;
                return cVar6.invokeSuspend(Unit.f186387a);
            case 6:
                c cVar7 = new c((Continuation) obj4, (l) this.f251304y, 6);
                cVar7.f251302w = flowCollector;
                cVar7.f251303x = obj3;
                return cVar7.invokeSuspend(Unit.f186387a);
            case 7:
                c cVar8 = new c((Continuation) obj4, (j) this.f251304y, 7);
                cVar8.f251302w = flowCollector;
                cVar8.f251303x = obj3;
                return cVar8.invokeSuspend(Unit.f186387a);
            case 8:
                c cVar9 = new c((Continuation) obj4, (rlh.j) this.f251304y, 8);
                cVar9.f251302w = flowCollector;
                cVar9.f251303x = obj3;
                return cVar9.invokeSuspend(Unit.f186387a);
            case 9:
                c cVar10 = new c((Continuation) obj4, (rmf.e) this.f251304y, 9);
                cVar10.f251302w = flowCollector;
                cVar10.f251303x = obj3;
                return cVar10.invokeSuspend(Unit.f186387a);
            case 10:
                c cVar11 = new c((Continuation) obj4, (com.revolut.feature.wealth_discovery.impl.screener.screens.stats_filters.a) this.f251304y, 10);
                cVar11.f251302w = flowCollector;
                cVar11.f251303x = obj3;
                return cVar11.invokeSuspend(Unit.f186387a);
            case 11:
                c cVar12 = new c((Continuation) obj4, (rrj.o) this.f251304y, 11);
                cVar12.f251302w = flowCollector;
                cVar12.f251303x = obj3;
                return cVar12.invokeSuspend(Unit.f186387a);
            case 12:
                c cVar13 = new c((Continuation) obj4, (rs2.n) this.f251304y, 12);
                cVar13.f251302w = flowCollector;
                cVar13.f251303x = obj3;
                return cVar13.invokeSuspend(Unit.f186387a);
            case 13:
                c cVar14 = new c((Continuation) obj4, (z) this.f251304y, 13);
                cVar14.f251302w = flowCollector;
                cVar14.f251303x = obj3;
                return cVar14.invokeSuspend(Unit.f186387a);
            case 14:
                c cVar15 = new c((Continuation) obj4, (v) this.f251304y, 14);
                cVar15.f251302w = flowCollector;
                cVar15.f251303x = obj3;
                return cVar15.invokeSuspend(Unit.f186387a);
            case 15:
                c cVar16 = new c((Continuation) obj4, (u) this.f251304y, 15);
                cVar16.f251302w = flowCollector;
                cVar16.f251303x = obj3;
                return cVar16.invokeSuspend(Unit.f186387a);
            case 16:
                c cVar17 = new c((Continuation) obj4, (com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trending.a) this.f251304y, 16);
                cVar17.f251302w = flowCollector;
                cVar17.f251303x = obj3;
                return cVar17.invokeSuspend(Unit.f186387a);
            case 17:
                c cVar18 = new c((w) this.f251304y, (Continuation) obj4);
                cVar18.f251302w = flowCollector;
                cVar18.f251303x = (Throwable) obj3;
                return cVar18.invokeSuspend(Unit.f186387a);
            case 18:
                c cVar19 = new c((Continuation) obj4, (x) this.f251304y, 18);
                cVar19.f251302w = flowCollector;
                cVar19.f251303x = (Object[]) obj3;
                return cVar19.invokeSuspend(Unit.f186387a);
            case 19:
                c cVar20 = new c((Continuation) obj4, (m) this.f251304y, 19);
                cVar20.f251302w = flowCollector;
                cVar20.f251303x = obj3;
                return cVar20.invokeSuspend(Unit.f186387a);
            case 20:
                c cVar21 = new c((Continuation) obj4, (k) this.f251304y, 20);
                cVar21.f251302w = flowCollector;
                cVar21.f251303x = obj3;
                return cVar21.invokeSuspend(Unit.f186387a);
            case 21:
                c cVar22 = new c((Continuation) obj4, (com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.review.a) this.f251304y, 21);
                cVar22.f251302w = flowCollector;
                cVar22.f251303x = obj3;
                return cVar22.invokeSuspend(Unit.f186387a);
            case 22:
                c cVar23 = new c((Continuation) obj4, (g) this.f251304y, 22);
                cVar23.f251302w = flowCollector;
                cVar23.f251303x = obj3;
                return cVar23.invokeSuspend(Unit.f186387a);
            case 23:
                c cVar24 = new c((Continuation) obj4, (s57.m) this.f251304y, 23);
                cVar24.f251302w = flowCollector;
                cVar24.f251303x = obj3;
                return cVar24.invokeSuspend(Unit.f186387a);
            case 24:
                c cVar25 = new c((Continuation) obj4, (s6b.m) this.f251304y, 24);
                cVar25.f251302w = flowCollector;
                cVar25.f251303x = obj3;
                return cVar25.invokeSuspend(Unit.f186387a);
            case 25:
                c cVar26 = new c((Continuation) obj4, (s6e.z) this.f251304y, 25);
                cVar26.f251302w = flowCollector;
                cVar26.f251303x = obj3;
                return cVar26.invokeSuspend(Unit.f186387a);
            case 26:
                c cVar27 = new c((Continuation) obj4, (s78.m) this.f251304y, 26);
                cVar27.f251302w = flowCollector;
                cVar27.f251303x = obj3;
                return cVar27.invokeSuspend(Unit.f186387a);
            case 27:
                c cVar28 = new c((Continuation) obj4, (s85.k) this.f251304y, 27);
                cVar28.f251302w = flowCollector;
                cVar28.f251303x = obj3;
                return cVar28.invokeSuspend(Unit.f186387a);
            case 28:
                c cVar29 = new c((Continuation) obj4, (s86.l) this.f251304y, 28);
                cVar29.f251302w = flowCollector;
                cVar29.f251303x = obj3;
                return cVar29.invokeSuspend(Unit.f186387a);
            default:
                c cVar30 = new c((Continuation) obj4, (s8f.g) this.f251304y, 29);
                cVar30.f251302w = flowCollector;
                cVar30.f251303x = obj3;
                return cVar30.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        List listK;
        Object objA;
        String id10;
        r rVarT;
        int i = this.u;
        int i2 = 17;
        int i3 = 19;
        s1 s1Var = s1.f290118a;
        h hVar = h.f294642c;
        int i5 = 18;
        int i6 = 3;
        int i21 = 15;
        int i22 = 2;
        Object obj3 = this.f251304y;
        Continuation continuation = null;
        int i32 = 1;
        switch (i) {
            case 0:
                f fVar = (f) obj3;
                Object obj4 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f251302w;
                    yhm.r rVar = (yhm.r) this.f251303x;
                    xi0.b bVar = (xi0.b) rVar.f314201a;
                    xi0.b bVar2 = (xi0.b) rVar.f314202b;
                    RemittanceRouteId remittanceRouteId = (RemittanceRouteId) rVar.f314203c;
                    vkm.d dVarB = rd0.e.b(((k61.i) fVar.f251309p).h(bVar));
                    vkm.d dVarB2 = rd0.e.b(g3k.d.b(fVar.o, fVar.f251306l.getF102028a().f101977a, bVar2, bVar, remittanceRouteId, null, 96));
                    Continuation continuation2 = null;
                    q qVar = new q(i6, 20, continuation2);
                    this.f251302w = null;
                    this.f251303x = null;
                    this.v = 1;
                    vkm.q.w(flowCollector);
                    Object objG = e0.g(this, s1Var, new c1((Function3) qVar, continuation2, i21), flowCollector, new Flow[]{dVarB, dVarB2});
                    if (objG != fim.a.COROUTINE_SUSPENDED) {
                        objG = Unit.f186387a;
                    }
                    if (objG != fim.a.COROUTINE_SUSPENDED) {
                        objG = Unit.f186387a;
                    }
                    if (objG == obj4) {
                        return obj4;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f251302w;
                    Flow flowD = ((com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.review.a) obj3).A.d((d0) this.f251303x);
                    this.f251302w = null;
                    this.f251303x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, flowD, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector3 = this.f251302w;
                    l35.e eVar = (l35.e) ((Data) this.f251303x).getContent();
                    Flow gVar = (eVar == null || !(eVar instanceof l35.c)) ? new go.g(Boolean.FALSE, 2) : new b1(rd0.e.b(((r55.b) obj3).f251531b.d(h.f294642c)), 22);
                    this.f251302w = null;
                    this.f251303x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, gVar, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector4 = this.f251302w;
                    akg.n nVarA = ((n) obj3).o.a((w4l.k) this.f251303x);
                    this.f251302w = null;
                    this.f251303x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector4, nVarA, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector5 = this.f251302w;
                    y yVarE = rd0.e.e(((o) obj3).a((String) this.f251303x, new rd3.m(27)), h0.f322473a, new qtb.o(i6, 7, (Continuation) null));
                    this.f251302w = null;
                    this.f251303x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector5, yVarE, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 5:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector6 = this.f251302w;
                    w4l.k loadingStrategy = (w4l.k) this.f251303x;
                    vfg.r rVar2 = ((com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.filters.a) obj3).o;
                    rVar2.getClass();
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    g0 g0Var = rVar2.f288635a;
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    vkm.d dVarB3 = rd0.e.b(g0Var.f194892m.e(Unit.f186387a, loadingStrategy));
                    this.f251302w = null;
                    this.f251303x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector6, dVarB3, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 6:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector7 = this.f251302w;
                    Flow flowA = ((l) obj3).f254500q.a((w4l.k) this.f251303x, o3.PRIORITY_RANK);
                    this.f251302w = null;
                    this.f251303x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector7, flowA, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 7:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector8 = this.f251302w;
                    j jVar = (j) obj3;
                    xh9.a aVar8 = jVar.f254639q;
                    String transactionId = jVar.f254640r.f78881a;
                    ti9.g gVar2 = (ti9.g) aVar8;
                    gVar2.getClass();
                    Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                    vkm.d dVarB4 = rd0.e.b(nim.a.w(gVar2.n(), new te8.a(transactionId, 7)));
                    this.f251302w = null;
                    this.f251303x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector8, dVarB4, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 8:
                rlh.j jVar2 = (rlh.j) obj3;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector9 = this.f251302w;
                    w4l.k kVar = (w4l.k) this.f251303x;
                    tlh.a aVar10 = jVar2.f255063t;
                    Flow flowE = boh.f.e(nim.a.v(u0.m(ybl.k.j(aVar10.f272100b), ((v0) aVar10.f272099a).f()), new tjf.e(aVar10, 9)), new nyb.q(jVar2, kVar, i2));
                    this.f251302w = null;
                    this.f251303x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector9, flowE, this) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 9:
                rmf.e eVar2 = (rmf.e) obj3;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector10 = this.f251302w;
                    if (((j1) this.f251303x).a()) {
                        j2 j2Var = eVar2.v;
                        listK = zhm.v.k(new p(new kh4.f((SharedFlow) j2Var.f184769b.f185505g.getValue(), j2Var, 16), new i0(12), zhm.u.c(j2Var.f184770c), "JuniorUnblockInboundTransferSender"), k0.a(eVar2.C.a(), eVar2.f255294t.Z2(), eVar2.D.Z2()), eVar2.B.Z2(eVar2.f255284g), eVar2.u.a());
                    } else {
                        p pVarZ2 = eVar2.A.Z2();
                        ykf.b bVar3 = eVar2.f255297y;
                        klf.h0 h0Var = bVar3.f314617l;
                        p pVar = new p(vkm.q.Q(yh5.b.e(h0Var.d(), h0Var.j(), bVar3.f314618m.a()), new y4f.o(null, bVar3, i21)), new c0(23), zhm.u.c(bVar3), "PaymentLinkWidget");
                        xkf.b bVar4 = eVar2.f255290p;
                        klf.h0 h0Var2 = bVar4.f306677a;
                        t38.e eVar3 = new t38.e(h0Var2.d(), 24, h0Var2.j(), new xkf.a(bVar4, null));
                        f0 f0Var = f0.f322471a;
                        p pVar2 = new p(eVar3, new c0(23), f0Var, "ActivePaymentLink");
                        p pVarZ22 = eVar2.z.Z2();
                        xkf.c1 c1Var = eVar2.f255295w;
                        p pVar3 = new p(new wyd.f(c1Var.f306688a.d(), c1Var, 9), new xkf.c(8), f0Var, "PaymentLinkNote");
                        p pVarA = eVar2.f255293s.a();
                        e1 e1Var = eVar2.f255296x;
                        listK = zhm.v.k(pVarZ2, pVar, pVar2, pVarZ22, pVar3, pVarA, new p(new wyd.f(e1Var.f306696a.d(), e1Var, 10), new xkf.c(9), f0Var, "PaymentLinkStatusAndBeneficiary"), eVar2.f255292r.d(new kjk.x(7)), eVar2.f255291q.Z2());
                    }
                    int i102 = rmf.e.E;
                    Flow flowH = eVar2.h(listK);
                    this.f251302w = null;
                    this.f251303x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector10, flowH, this) == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 10:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector11 = this.f251302w;
                    com.revolut.feature.wealth_discovery.impl.screener.screens.stats_filters.a aVar13 = (com.revolut.feature.wealth_discovery.impl.screener.screens.stats_filters.a) obj3;
                    wkm.l lVarQ = vkm.q.Q(aVar13.f96285w, new r0(null, aVar13, (w4l.k) this.f251303x, 23));
                    this.f251302w = null;
                    this.f251303x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector11, lVarQ, this) == aVar12) {
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
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector12 = this.f251302w;
                    rrj.o oVar = (rrj.o) obj3;
                    r rVarSwitchMap = oVar.y2().switchMap(new rpi.d(new rrj.k(oVar, i6), i2));
                    pzi.a aVar15 = oVar.u;
                    CategoryBudgetContract$InputData categoryBudgetContract$InputData = oVar.f256869p;
                    String budgetingCategory = categoryBudgetContract$InputData.f101519a;
                    AccountId accountId = categoryBudgetContract$InputData.f101520b;
                    Intrinsics.checkNotNullParameter(budgetingCategory, "<this>");
                    qzi.l.Companion.getClass();
                    Intrinsics.checkNotNullParameter(budgetingCategory, "budgetingCategory");
                    try {
                        m.Companion companion = yhm.m.INSTANCE;
                        objA = qzi.l.valueOf(budgetingCategory);
                    } catch (Throwable th10) {
                        m.Companion companion2 = yhm.m.INSTANCE;
                        objA = yhm.o.a(th10);
                    }
                    if (objA instanceof yhm.n) {
                        objA = null;
                    }
                    int i105 = 14;
                    if (((qzi.l) objA) == qzi.l.OVERALL) {
                        r map = ((grj.f) aVar15).a(accountId).map(new rpi.d(new rpi.e(oVar, i5), i105));
                        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                        rVarT = nim.a.w(map, new rpi.e(i105));
                    } else {
                        r map2 = ((grj.f) aVar15).a(accountId).map(new rpi.d(new rpi.e(oVar, i5), i105));
                        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
                        r rVarA2 = oVar.A2();
                        ge3.e eVar4 = oVar.f256871r;
                        String strP = v13.d.p(categoryBudgetContract$InputData.f101519a);
                        AccountId.Joint joint = accountId instanceof AccountId.Joint ? (AccountId.Joint) accountId : null;
                        if (joint == null || (id10 = joint.f51413b) == null) {
                            id10 = null;
                        } else {
                            Intrinsics.checkNotNullParameter(id10, "id");
                        }
                        r map3 = ((b0) eVar4).e(strP, id10).map(new rpi.d(new rpi.e(oVar, i21), 13));
                        Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
                        rVarT = pd.b.t(kli.a.i(rVarA2, map2, map3), new rrj.k(oVar, i22));
                    }
                    Intrinsics.h(rVarSwitchMap);
                    r rVarOnErrorReturn = nim.a.w(kli.a.h(rVarSwitchMap, rVarT), new rpi.e(i3)).onErrorReturn(new rpi.d(new rpi.e(20), i5));
                    Intrinsics.checkNotNullExpressionValue(rVarOnErrorReturn, "onErrorReturn(...)");
                    vkm.d dVarB5 = rd0.e.b(rVarOnErrorReturn);
                    this.f251302w = null;
                    this.f251303x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector12, dVarB5, this) == aVar14) {
                        return aVar14;
                    }
                    break;
                } else {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 12:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector13 = this.f251302w;
                    Flow flowQ = vkm.q.q(new v1(new qg7.p((rs2.n) obj3, (Data) this.f251303x, continuation, i3)));
                    this.f251302w = null;
                    this.f251303x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector13, flowQ, this) == aVar16) {
                        return aVar16;
                    }
                } else {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 13:
                z zVar = (z) obj3;
                ActivityScreenContract$InputData activityScreenContract$InputData = zVar.f257438p;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector14 = this.f251302w;
                    Pair pair = (Pair) this.f251303x;
                    CryptoInvestmentsFeatureConfig.CurrencyMode currencyMode = (CryptoInvestmentsFeatureConfig.CurrencyMode) pair.f186385a;
                    i7 i7VarA = (i7) pair.f186386b;
                    dv5.l lVar = zVar.f257439q;
                    i7 i7Var = activityScreenContract$InputData.f;
                    if (i7Var != null && i7VarA != null) {
                        i7.Companion.getClass();
                        i7VarA = i7.c.a(i7Var, i7VarA);
                    } else if (i7Var != null) {
                        i7VarA = i7Var;
                    }
                    vkm.d dVarB6 = rd0.e.b(pt5.l.a(lVar, currencyMode, i7VarA, new ft5.a(activityScreenContract$InputData.f71429g, 6), 2));
                    this.f251302w = null;
                    this.f251303x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector14, dVarB6, this) == aVar17) {
                        return aVar17;
                    }
                } else {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 14:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector15 = this.f251302w;
                    Alias alias = (Alias) this.f251303x;
                    Flow flowV = alias != null ? nim.a.v(((v) obj3).f257680a.k(alias, null), new ro7.n(alias, 5)) : new go.g(new Data(null, null, false, 6, null), 2);
                    this.f251302w = null;
                    this.f251303x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector15, flowV, this) == aVar18) {
                        return aVar18;
                    }
                } else {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 15:
                u uVar = (u) obj3;
                gr6.h hVar2 = uVar.f257713p;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector16 = this.f251302w;
                    jhi.k kVarU = nim.a.u(new qkg.a(i22, i5, continuation), u0.m(u0.i(((y0) hVar2).f(hVar), ((y0) hVar2).d(), ((y0) hVar2).h()), u0.i(((y0) hVar2).i(), rd0.e.b(whf.b.a(uVar.f257716s, te0.w.h(uVar.u), null, null, null, 14)), rd0.e.b(whf.b.a(uVar.f257716s, te0.w.h(uVar.f257717t), null, null, null, 14)))));
                    this.f251302w = null;
                    this.f251303x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector16, kVarU, this) == aVar19) {
                        return aVar19;
                    }
                } else {
                    if (i109 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 16:
                com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trending.a aVar20 = (com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trending.a) obj3;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector17 = this.f251302w;
                    cw5.e eVar5 = (cw5.e) this.f251303x;
                    wkm.l lVarQ2 = vkm.q.Q(aVar20.f71575p.g(eVar5, cw5.d.CRYPTO, hVar), new r0(continuation, aVar20, eVar5, 25));
                    this.f251302w = null;
                    this.f251303x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector17, lVarQ2, this) == aVar21) {
                        return aVar21;
                    }
                } else {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 17:
                FlowCollector flowCollector18 = this.f251302w;
                Throwable th11 = (Throwable) this.f251303x;
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 == 0) {
                    yhm.o.b(obj2);
                    ryd.n nVar = w.Companion;
                    ((w) obj3).getClass();
                    if (!(th11 instanceof ryd.m)) {
                        throw th11;
                    }
                    Data dataP = zi0.c.P(new StatementUrlState.InPreparation(null, 1, null), false, null, 3);
                    this.f251302w = null;
                    this.f251303x = null;
                    this.v = 1;
                    if (flowCollector18.emit(dataP, this) == aVar22) {
                        return aVar22;
                    }
                } else {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 18:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector19 = this.f251302w;
                    Pair[] pairArr = (Pair[]) ((Object[]) this.f251303x);
                    ArrayList arrayList = new ArrayList();
                    for (Pair pair2 : pairArr) {
                        ryj.p pVar4 = (ryj.p) pair2.f186385a;
                        Data data = (Data) pair2.f186386b;
                        if (Intrinsics.f(pVar4, ryj.n.f258404a) || !ue0.e.n((List) data.getContent())) {
                            arrayList.add(pair2);
                        }
                    }
                    Pair[] pairArr2 = (Pair[]) arrayList.toArray(new Pair[0]);
                    this.f251302w = null;
                    this.f251303x = null;
                    this.v = 1;
                    if (flowCollector19.emit(pairArr2, this) == aVar23) {
                        return aVar23;
                    }
                } else {
                    if (i112 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 19:
                s0d.m mVar = (s0d.m) obj3;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                if (i113 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector20 = this.f251302w;
                    w4l.k loadingStrategy2 = (w4l.k) this.f251303x;
                    t1 t1Var = mVar.f258951p;
                    t1Var.getClass();
                    Intrinsics.checkNotNullParameter(loadingStrategy2, "loadingStrategy");
                    k0d.b bVar5 = (k0d.b) t1Var.f185240b;
                    Intrinsics.checkNotNullParameter(loadingStrategy2, "loadingStrategy");
                    akg.n nVarV = nim.a.v(bVar5.d.b(Unit.f186387a, loadingStrategy2), new kotlin.jvm.internal.h0() { // from class: p0d.a
                        @Override // kotlin.jvm.internal.h0, wim.p
                        public final Object get(Object obj5) {
                            return ((j0d.h) obj5).f170003a;
                        }
                    });
                    h0 h0Var3 = h0.f322473a;
                    j23.b bVarD = yh5.b.d(rd0.e.n(nVarV, h0Var3), rd0.e.n(mVar.f258952q.c(mVar.o.f85978a, loadingStrategy2), h0Var3));
                    this.f251302w = null;
                    this.f251303x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector20, bVarD, this) == aVar24) {
                        return aVar24;
                    }
                } else {
                    if (i113 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 20:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                int i114 = this.v;
                if (i114 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector21 = this.f251302w;
                    w4l.k kVar2 = (w4l.k) this.f251303x;
                    k kVar3 = (k) obj3;
                    l2e.a aVar26 = kVar3.f259299p;
                    StoreBrandDetailDiscountScreenContract$InputData storeBrandDetailDiscountScreenContract$InputData = kVar3.o;
                    vkm.d dVarA = aVar26.a(new t1e.u(storeBrandDetailDiscountScreenContract$InputData.f88671a, storeBrandDetailDiscountScreenContract$InputData.f88673c), kVar2);
                    this.f251302w = null;
                    this.f251303x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector21, dVarA, this) == aVar25) {
                        return aVar25;
                    }
                } else {
                    if (i114 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 21:
                com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.review.a aVar27 = (com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.review.a) obj3;
                Object obj5 = fim.a.COROUTINE_SUSPENDED;
                int i115 = this.v;
                if (i115 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector22 = this.f251302w;
                    akg.n nVarT = aVar27.f74431p.T();
                    vkm.d dVarB7 = rd0.e.b(aVar27.f74432q.k(false));
                    s47.r rVar3 = s47.r.f259798a;
                    this.f251302w = null;
                    this.f251303x = null;
                    this.v = 1;
                    vkm.q.w(flowCollector22);
                    Object objG2 = e0.g(this, s1Var, new c1(rVar3, continuation, i21), flowCollector22, new Flow[]{nVarT, dVarB7});
                    if (objG2 != fim.a.COROUTINE_SUSPENDED) {
                        objG2 = Unit.f186387a;
                    }
                    if (objG2 != fim.a.COROUTINE_SUSPENDED) {
                        objG2 = Unit.f186387a;
                    }
                    if (objG2 == obj5) {
                        return obj5;
                    }
                } else {
                    if (i115 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 22:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                int i116 = this.v;
                if (i116 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector23 = this.f251302w;
                    w4l.k loadingStrategy3 = (w4l.k) this.f251303x;
                    p2b.i iVar = ((g) obj3).o;
                    iVar.getClass();
                    Intrinsics.checkNotNullParameter(loadingStrategy3, "loadingStrategy");
                    usc.a aVar29 = iVar.d;
                    Intrinsics.checkNotNullParameter(loadingStrategy3, "loadingStrategy");
                    p0 p0Var = (p0) aVar29.f282889b;
                    p0Var.getClass();
                    Intrinsics.checkNotNullParameter(loadingStrategy3, "loadingStrategy");
                    akg.n nVarV2 = nim.a.v(p0Var.d.b(Unit.f186387a, loadingStrategy3), new p0g.b(11));
                    this.f251302w = null;
                    this.f251303x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector23, nVarV2, this) == aVar28) {
                        return aVar28;
                    }
                } else {
                    if (i116 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 23:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                int i117 = this.v;
                if (i117 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector24 = this.f251302w;
                    Flow gVar3 = !((Boolean) this.f251303x).booleanValue() ? new go.g(Boolean.FALSE, 2) : mo3.a.g(nim.a.v(((s57.m) obj3).f260038m.j(hVar), new kotlin.jvm.internal.h0() { // from class: s57.k
                        @Override // kotlin.jvm.internal.h0, wim.p
                        public final Object get(Object obj6) {
                            return Boolean.valueOf(((od0.i) obj6).d());
                        }
                    }), null, s57.l.f260030a, 1);
                    this.f251302w = null;
                    this.f251303x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector24, gVar3, this) == aVar30) {
                        return aVar30;
                    }
                } else {
                    if (i117 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 24:
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                int i118 = this.v;
                if (i118 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector25 = this.f251302w;
                    c6b.a aVar32 = ((s6b.m) obj3).o;
                    aVar32.getClass();
                    w4l.i loadingStrategy4 = w4l.i.f294643c;
                    Intrinsics.checkNotNullParameter(loadingStrategy4, "loadingStrategy");
                    y5b.j jVar3 = aVar32.f21752a;
                    jVar3.getClass();
                    Intrinsics.checkNotNullParameter(loadingStrategy4, "loadingStrategy");
                    vkm.d dVarB8 = jVar3.f.b(Unit.f186387a, loadingStrategy4);
                    this.f251302w = null;
                    this.f251303x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector25, dVarB8, this) == aVar31) {
                        return aVar31;
                    }
                } else {
                    if (i118 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 25:
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                int i119 = this.v;
                if (i119 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector26 = this.f251302w;
                    vkm.d dVarB9 = rd0.e.b(((s6e.z) obj3).n((AccountId) this.f251303x));
                    this.f251302w = null;
                    this.f251303x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector26, dVarB9, this) == aVar33) {
                        return aVar33;
                    }
                } else {
                    if (i119 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 26:
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                int i120 = this.v;
                if (i120 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector27 = this.f251302w;
                    vkm.d dVarB10 = rd0.e.b(((oqk.g0) ((s78.m) obj3).f260586b).d((Data) this.f251303x, false));
                    this.f251302w = null;
                    this.f251303x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector27, dVarB10, this) == aVar34) {
                        return aVar34;
                    }
                } else {
                    if (i120 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 27:
                s85.k kVar4 = (s85.k) obj3;
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                int i121 = this.v;
                if (i121 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector28 = this.f251302w;
                    vkm.d dVarB11 = rd0.e.b(te0.w.l(((y45.f) kVar4.f260895p).l(((s85.f) kVar4.t2()).f260889a, w4l.j.f294644c), kVar4.f260896q.b(((s85.f) kVar4.t2()).f260889a, h.f294642c)));
                    this.f251302w = null;
                    this.f251303x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector28, dVarB11, this) == aVar35) {
                        return aVar35;
                    }
                } else {
                    if (i121 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 28:
                s86.l lVar2 = (s86.l) obj3;
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                int i122 = this.v;
                if (i122 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector29 = this.f251302w;
                    vkm.d dVarB12 = rd0.e.b(nim.a.w(lVar2.f260912p.j0(true, false), new s86.j(lVar2)));
                    this.f251302w = null;
                    this.f251303x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector29, dVarB12, this) == aVar36) {
                        return aVar36;
                    }
                } else {
                    if (i122 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar37 = fim.a.COROUTINE_SUSPENDED;
                int i123 = this.v;
                if (i123 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector30 = this.f251302w;
                    s8f.g gVar4 = (s8f.g) obj3;
                    x5f.q qVar2 = gVar4.o;
                    String templateId = gVar4.f260987p.f91494a;
                    a6f.a allocationSourceStrategy = a6f.a.PREFER_PORTFOLIO;
                    qVar2.getClass();
                    Intrinsics.checkNotNullParameter(templateId, "templateId");
                    Intrinsics.checkNotNullParameter(allocationSourceStrategy, "allocationSourceStrategy");
                    Flow flowE2 = boh.f.e(qVar2.f302975b.d(templateId, allocationSourceStrategy), new x5f.l(qVar2, i32));
                    this.f251302w = null;
                    this.f251303x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector30, flowE2, this) == aVar37) {
                        return aVar37;
                    }
                } else {
                    if (i123 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(w wVar, Continuation continuation) {
        super(3, continuation);
        this.u = 17;
        this.f251304y = wVar;
    }
}
