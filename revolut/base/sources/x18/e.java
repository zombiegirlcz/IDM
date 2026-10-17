package x18;

import a83.o0;
import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import com.revolut.feature.defi.exchange.impl.domain.model.DeFiSwapQuoteParams;
import com.revolut.feature.incentive_reward.impl.model.lotteries.LotteryParams;
import com.revolut.feature.tab.accounts.api.model.spaces.SpaceContentModel;
import com.revolut.feature.tab.accounts.api.model.spaces.SubSpaceContentModel;
import com.revolut.feature.wealth.api.domain.model.transactions.InvestTransaction;
import com.revolut.retail.feature.marketnews.api.domain.model.WealthNewsCategory;
import com.revolut.retail.feature.ratedetails.impl.ui.RateDetailsScreenContract$InputData;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import com.revolut.shared.feature.wealth.models.transaction.TradingTransactionsFilter;
import dce.l0;
import dfj.s3;
import e7l.g;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import mif.e0;
import sgm.e3;
import tof.a3;
import tof.ba;
import tof.f5;
import tof.n1;
import vdl.c1;
import vkm.s1;
import vkm.v1;
import x8h.n0;
import xmd.p0;
import xmd.s0;
import y20.b1;
import zh9.u0;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.r0;
import zhm.y0;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f302331w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f302332x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f302333y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Continuation continuation, Object obj2, int i) {
        super(3, continuation);
        this.u = i;
        this.f302333y = obj2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                e eVar = new e((Continuation) obj4, (com.revolut.feature.invest.smart_notifications.impl.ui.screen.feed.b) this.f302333y, 0);
                eVar.f302331w = (FlowCollector) obj2;
                eVar.f302332x = obj3;
                return eVar.invokeSuspend(Unit.f186387a);
            case 1:
                e eVar2 = new e((Continuation) obj4, (x36.y) this.f302333y, 1);
                eVar2.f302331w = (FlowCollector) obj2;
                eVar2.f302332x = obj3;
                return eVar2.invokeSuspend(Unit.f186387a);
            case 2:
                e eVar3 = new e((Continuation) obj4, (x5f.c) this.f302333y, 2);
                eVar3.f302331w = (FlowCollector) obj2;
                eVar3.f302332x = obj3;
                return eVar3.invokeSuspend(Unit.f186387a);
            case 3:
                e eVar4 = new e((Continuation) obj4, (x8b.d) this.f302333y, 3);
                eVar4.f302331w = (FlowCollector) obj2;
                eVar4.f302332x = obj3;
                return eVar4.invokeSuspend(Unit.f186387a);
            case 4:
                e eVar5 = new e((Continuation) obj4, (x8h.k) this.f302333y, 4);
                eVar5.f302331w = (FlowCollector) obj2;
                eVar5.f302332x = obj3;
                return eVar5.invokeSuspend(Unit.f186387a);
            case 5:
                e eVar6 = new e((Continuation) obj4, (rul.e) this.f302333y, 5);
                eVar6.f302331w = (FlowCollector) obj2;
                eVar6.f302332x = obj3;
                return eVar6.invokeSuspend(Unit.f186387a);
            case 6:
                e eVar7 = new e((Continuation) obj4, (n0) this.f302333y, 6);
                eVar7.f302331w = (FlowCollector) obj2;
                eVar7.f302332x = obj3;
                return eVar7.invokeSuspend(Unit.f186387a);
            case 7:
                e eVar8 = new e((Continuation) obj4, (com.revolut.feature.apm.spin.impl.ui.settings.a) this.f302333y, 7);
                eVar8.f302331w = (FlowCollector) obj2;
                eVar8.f302332x = obj3;
                return eVar8.invokeSuspend(Unit.f186387a);
            case 8:
                e eVar9 = new e((Continuation) obj4, (com.revolut.retail.feature.esim.impl.ui.flows.home.c) this.f302333y, 8);
                eVar9.f302331w = (FlowCollector) obj2;
                eVar9.f302332x = obj3;
                return eVar9.invokeSuspend(Unit.f186387a);
            case 9:
                e eVar10 = new e((Continuation) obj4, (xg7.i) this.f302333y, 9);
                eVar10.f302331w = (FlowCollector) obj2;
                eVar10.f302332x = obj3;
                return eVar10.invokeSuspend(Unit.f186387a);
            case 10:
                e eVar11 = new e((Continuation) obj4, (vfe.a) this.f302333y, 10);
                eVar11.f302331w = (FlowCollector) obj2;
                eVar11.f302332x = (Object[]) obj3;
                return eVar11.invokeSuspend(Unit.f186387a);
            case 11:
                e eVar12 = new e((Continuation) obj4, (xid.l) this.f302333y, 11);
                eVar12.f302331w = (FlowCollector) obj2;
                eVar12.f302332x = obj3;
                return eVar12.invokeSuspend(Unit.f186387a);
            case 12:
                e eVar13 = new e((Continuation) obj4, (xkf.s) this.f302333y, 12);
                eVar13.f302331w = (FlowCollector) obj2;
                eVar13.f302332x = obj3;
                return eVar13.invokeSuspend(Unit.f186387a);
            case 13:
                e eVar14 = new e((Continuation) obj4, (xkf.w) this.f302333y, 13);
                eVar14.f302331w = (FlowCollector) obj2;
                eVar14.f302332x = obj3;
                return eVar14.invokeSuspend(Unit.f186387a);
            case 14:
                e eVar15 = new e((Continuation) obj4, (com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits_to_lose.a) this.f302333y, 14);
                eVar15.f302331w = (FlowCollector) obj2;
                eVar15.f302332x = obj3;
                return eVar15.invokeSuspend(Unit.f186387a);
            case 15:
                e eVar16 = new e((Continuation) obj4, (xlj.g) this.f302333y, 15);
                eVar16.f302331w = (FlowCollector) obj2;
                eVar16.f302332x = obj3;
                return eVar16.invokeSuspend(Unit.f186387a);
            case 16:
                e eVar17 = new e((Continuation) obj4, (s0) this.f302333y, 16);
                eVar17.f302331w = (FlowCollector) obj2;
                eVar17.f302332x = obj3;
                return eVar17.invokeSuspend(Unit.f186387a);
            case 17:
                e eVar18 = new e((Continuation) obj4, (yld.d[]) this.f302333y, 17);
                eVar18.f302331w = (FlowCollector) obj2;
                eVar18.f302332x = (Object[]) obj3;
                return eVar18.invokeSuspend(Unit.f186387a);
            case 18:
                e eVar19 = new e((Continuation) obj4, (xpk.m) this.f302333y, 18);
                eVar19.f302331w = (FlowCollector) obj2;
                eVar19.f302332x = obj3;
                return eVar19.invokeSuspend(Unit.f186387a);
            case 19:
                e eVar20 = new e((Continuation) obj4, (xsi.p) this.f302333y, 19);
                eVar20.f302331w = (FlowCollector) obj2;
                eVar20.f302332x = obj3;
                return eVar20.invokeSuspend(Unit.f186387a);
            case 20:
                e eVar21 = new e((Continuation) obj4, (xvf.m) this.f302333y, 20);
                eVar21.f302331w = (FlowCollector) obj2;
                eVar21.f302332x = obj3;
                return eVar21.invokeSuspend(Unit.f186387a);
            case 21:
                e eVar22 = new e((Continuation) obj4, (com.revolut.feature.rev_points.giftcards.impl.ui.screen.purchase.a) this.f302333y, 21);
                eVar22.f302331w = (FlowCollector) obj2;
                eVar22.f302332x = obj3;
                return eVar22.invokeSuspend(Unit.f186387a);
            case 22:
                e eVar23 = new e((b1) this.f302333y, (Continuation) obj4, 22);
                eVar23.f302331w = (y20.r) obj2;
                eVar23.f302332x = (List) obj3;
                return eVar23.invokeSuspend(Unit.f186387a);
            case 23:
                e eVar24 = new e((b1) this.f302333y, (Continuation) obj4, 23);
                eVar24.f302331w = (y20.q) obj2;
                eVar24.f302332x = (List) obj3;
                return eVar24.invokeSuspend(Unit.f186387a);
            case 24:
                e eVar25 = new e((b1) this.f302333y, (Continuation) obj4, 24);
                eVar25.f302331w = (y20.s) obj2;
                eVar25.f302332x = (List) obj3;
                return eVar25.invokeSuspend(Unit.f186387a);
            case 25:
                e eVar26 = new e((Continuation) obj4, (y45.a) this.f302333y, 25);
                eVar26.f302331w = (FlowCollector) obj2;
                eVar26.f302332x = obj3;
                return eVar26.invokeSuspend(Unit.f186387a);
            case 26:
                e eVar27 = new e((Continuation) obj4, (y45.h) this.f302333y, 26);
                eVar27.f302331w = (FlowCollector) obj2;
                eVar27.f302332x = obj3;
                return eVar27.invokeSuspend(Unit.f186387a);
            case 27:
                e eVar28 = new e((Continuation) obj4, (y45.n) this.f302333y, 27);
                eVar28.f302331w = (FlowCollector) obj2;
                eVar28.f302332x = obj3;
                return eVar28.invokeSuspend(Unit.f186387a);
            case 28:
                e eVar29 = new e((Continuation) obj4, (y45.o) this.f302333y, 28);
                eVar29.f302331w = (FlowCollector) obj2;
                eVar29.f302332x = obj3;
                return eVar29.invokeSuspend(Unit.f186387a);
            default:
                e eVar30 = new e((Continuation) obj4, (com.revolut.feature.revolut_x_balances.impl.fiat.a) this.f302333y, 29);
                eVar30.f302331w = (FlowCollector) obj2;
                eVar30.f302332x = obj3;
                return eVar30.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Flow eVar;
        Flow flowW;
        Flow flowE;
        Flow flowE2;
        n1 n1Var;
        Flow flowE3;
        Flow gVar;
        int i = this.u;
        s1 s1Var = s1.f290118a;
        int i2 = 6;
        int i3 = 19;
        w4l.i iVar = w4l.i.f294643c;
        int i5 = 4;
        w4l.h loadingStrategy = w4l.h.f294642c;
        int i6 = 0;
        int i21 = 5;
        Continuation continuation = null;
        Object obj3 = this.f302333y;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = (FlowCollector) this.f302331w;
                    Pair pair = (Pair) this.f302332x;
                    w4l.k kVar = (w4l.k) pair.f186385a;
                    vkm.d dVarB = rd0.e.b(m0k.e.b(((com.revolut.feature.invest.smart_notifications.impl.ui.screen.feed.b) obj3).f76444r, WealthNewsCategory.Stocks.f101808b, !r5.isEmpty(), null, d0.d1((Set) pair.f186386b), null, null, new Integer(5), kVar instanceof w4l.i, 52));
                    this.f302331w = null;
                    this.f302332x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, dVarB, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = (FlowCollector) this.f302331w;
                    DeFiSwapQuoteParams deFiSwapQuoteParams = (DeFiSwapQuoteParams) this.f302332x;
                    Flow flowP = deFiSwapQuoteParams != null ? kgm.i.p(((x36.y) obj3).f302688p, deFiSwapQuoteParams) : vkm.i.f290039a;
                    this.f302331w = null;
                    this.f302332x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, flowP, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                x5f.c cVar = (x5f.c) obj3;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector3 = (FlowCollector) this.f302331w;
                    Data data = (Data) this.f302332x;
                    od0.i iVar2 = (od0.i) data.getContent();
                    String str = iVar2 != null ? (String) iVar2.f224257a : null;
                    if (str == null) {
                        eVar = new go.g(new Data(null, data.getError(), data.getLoading(), 1, null), 2);
                    } else {
                        int i43 = 3;
                        eVar = new t38.e(new vkm.y(rd0.e.b(((aug.d) ((ktg.a) cVar.f302951c.f325162w.get())).a(str)), new v77.c(i43, i2, continuation)), 24, new vkm.y(rd0.e.b(cVar.f302950b.B(str, loadingStrategy)), new v77.c(i43, 7, continuation)), new wvg.i(cVar, continuation, 13));
                    }
                    this.f302331w = null;
                    this.f302332x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, eVar, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector4 = (FlowCollector) this.f302331w;
                    x8b.d dVar = (x8b.d) obj3;
                    Flow flowH = xam.a.h(new wo2.l(dVar, (xi0.b) this.f302332x, continuation, i21), rd0.e.b(nim.a.w(((ik3.c) dVar.f303309a).l(g.b.f123407a, loadingStrategy), new x64.a(i3))));
                    this.f302331w = null;
                    this.f302332x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector4, flowH, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector5 = (FlowCollector) this.f302331w;
                    Data data2 = (Data) this.f302332x;
                    Flow gVar2 = (data2.getLoading() || data2.getContent() != null) ? new go.g(data2, 2) : rd0.e.b(ue0.e.q(((x8h.k) obj3).f303354a.J(AccountId.Personal.f51414a, w4l.j.f294644c), y0.b(new Pair("DisplayCurrencyInteractorImpl", "getBaseCurrency"))));
                    this.f302331w = null;
                    this.f302332x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector5, gVar2, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 5:
                rul.e eVar2 = (rul.e) obj3;
                x8h.q qVar = (x8h.q) eVar2.f257630b;
                y2f.a aVar6 = (y2f.a) eVar2.f257629a;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector6 = (FlowCollector) this.f302331w;
                    tzg.g gVar3 = (tzg.g) this.f302332x;
                    if (gVar3 instanceof tzg.f) {
                        flowW = new vkm.y(new wda.l(2, 8, null), boh.f.e(y2f.a.c(aVar6, com.revolut.shared.feature.wealth.models.transaction.a.a(((tzg.f) gVar3).f275965a), null, 100, 10), new wma.e(1, qVar, x8h.q.class, "transactionsFlow", "transactionsFlow(Ljava/util/List;)Lkotlinx/coroutines/flow/Flow;", 0, 15)));
                    } else {
                        if (!(gVar3 instanceof tzg.e)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        tzg.e eVar3 = (tzg.e) gVar3;
                        TradingTransactionsFilter.TradingTransactionsFilterImpl tradingTransactionsFilterImplA = com.revolut.shared.feature.wealth.models.transaction.a.a(eVar3.f275962a);
                        InvestTransaction investTransaction = eVar3.f275964c;
                        long jO = ofm.q.o(investTransaction.getF85125a());
                        String id10 = investTransaction.getId();
                        flowW = zi0.c.w(boh.f.e(vkm.q.q(nim.a.v(u0.m(y2f.a.b(aVar6, tradingTransactionsFilterImplA, null, id10, jO, eVar3.f275963b, 34), y2f.a.a(aVar6, tradingTransactionsFilterImplA, null, id10, jO, eVar3.f275963b, 98)), new x8h.d(eVar3, 8))), new wma.e(1, qVar, x8h.q.class, "transactionsFlow", "transactionsFlow(Ljava/util/List;)Lkotlinx/coroutines/flow/Flow;", 0, 16)));
                    }
                    vkm.y yVarE = rd0.e.e(vkm.q.q(flowW), h0.f322473a, new v77.c(3, 8, continuation));
                    this.f302331w = null;
                    this.f302332x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector6, yVarE, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 6:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector7 = (FlowCollector) this.f302331w;
                    List listJ = ((TradingAccount) ((Optional) zi0.c.I((Data) this.f302332x)).get()).J();
                    ListIterator listIterator = listJ.listIterator(listJ.size());
                    while (listIterator.hasPrevious()) {
                        TradingAccount.Portfolio portfolio = (TradingAccount.Portfolio) listIterator.previous();
                        if (zhm.v.k(com.revolut.shared.feature.wealth.models.trading_accounts.a.ACTIVE, com.revolut.shared.feature.wealth.models.trading_accounts.a.SUSPENDED).contains(portfolio.f105211b)) {
                            ybl.d dVar2 = ((n0) obj3).e;
                            String string = portfolio.f105210a.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            vkm.d dVarE = ((ael.y) dVar2).e(string, loadingStrategy);
                            this.f302331w = null;
                            this.f302332x = null;
                            this.v = 1;
                            if (vkm.q.u(flowCollector7, dVarE, this) == aVar8) {
                                return aVar8;
                            }
                        }
                    }
                    throw new NoSuchElementException("List contains no element matching the predicate.");
                }
                if (i92 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                return Unit.f186387a;
            case 7:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector8 = (FlowCollector) this.f302331w;
                    vkm.y yVarE2 = rd0.e.e(zi0.c.w(vw1.b.c(((com.revolut.feature.apm.spin.impl.ui.settings.a) obj3).o.f304235l)), h0.f322473a, new v77.c(3, 10, continuation));
                    this.f302331w = null;
                    this.f302332x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector8, yVarE2, this) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 8:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector9 = (FlowCollector) this.f302331w;
                    v1 v1VarD = c8g.a.D(((com.revolut.retail.feature.esim.impl.ui.flows.home.c) obj3).f100685w.a(null, null, null, (7 & 8) != 0 ? w4l.h.f294642c : w4l.i.f294643c));
                    this.f302331w = null;
                    this.f302332x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector9, v1VarD, this) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 9:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector10 = (FlowCollector) this.f302331w;
                    xg7.i iVar3 = (xg7.i) obj3;
                    r10.q qVar2 = iVar3.o;
                    String code = iVar3.f305619p.f74880a;
                    qVar2.getClass();
                    Intrinsics.checkNotNullParameter(code, "code");
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    qf7.i iVar4 = (qf7.i) qVar2.f250849b;
                    iVar4.getClass();
                    Intrinsics.checkNotNullParameter(code, "code");
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    vkm.d dVarB2 = iVar4.f.b(new LotteryParams(code), loadingStrategy);
                    qd8.e eVar4 = new qd8.e((Object) code, (Object) iVar4, false, (Continuation) null, 2);
                    this.f302331w = null;
                    this.f302332x = null;
                    this.v = 1;
                    vkm.q.w(flowCollector10);
                    Object objCollect = dVarB2.collect(new akg.m(flowCollector10, eVar4, 5), this);
                    if (objCollect != aVar11) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect != aVar11) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 10:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector11 = (FlowCollector) this.f302331w;
                    vfe.a aVar13 = (vfe.a) obj3;
                    SpaceContentModel spaceContentModel = new SpaceContentModel(aVar13.f288607b, aVar13.f288606a, kotlin.collections.d.v0((SubSpaceContentModel[]) ((Object[]) this.f302332x)));
                    this.f302331w = null;
                    this.f302332x = null;
                    this.v = 1;
                    if (flowCollector11.emit(spaceContentModel, this) == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 11:
                xid.l lVar = (xid.l) obj3;
                jid.p pVar = lVar.f306337p;
                Object obj4 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector12 = (FlowCollector) this.f302331w;
                    String auctionId = lVar.o.f87145a;
                    pVar.getClass();
                    Intrinsics.checkNotNullParameter(auctionId, "offerId");
                    lvb.d dVar3 = pVar.f174446a;
                    Intrinsics.checkNotNullParameter(auctionId, "auctionId");
                    ivb.f fVar = dVar3.f200356a;
                    fVar.getClass();
                    Intrinsics.checkNotNullParameter(auctionId, "auctionId");
                    vkm.d dVarB3 = rd0.e.b(fVar.d.e(auctionId, iVar));
                    akg.n nVarV = nim.a.v(zi0.c.w(rd0.e.b(pVar.f174447b.c(true))), new jhi.a(23));
                    o0 o0Var = new o0(3, 24, continuation);
                    this.f302331w = null;
                    this.f302332x = null;
                    this.v = 1;
                    vkm.q.w(flowCollector12);
                    Object objG = e0.g(this, s1Var, new c1((Function3) o0Var, continuation, 15), flowCollector12, new Flow[]{dVarB3, nVarV});
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
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 12:
                xkf.s sVar = (xkf.s) obj3;
                Object obj5 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector13 = (FlowCollector) this.f302331w;
                    Pair pair2 = (Pair) this.f302332x;
                    a3 a3Var = (a3) pair2.f186385a;
                    do3.n nVar = (do3.n) pair2.f186386b;
                    f5 f5Var = a3Var.y0;
                    Continuation continuation2 = null;
                    String str2 = f5Var != null ? f5Var.f272749a : null;
                    if (str2 == null) {
                        sVar.getClass();
                        flowE = new go.g(f0.f322471a, 2);
                    } else {
                        flowE = rd0.e.e(mo3.a.g(rd0.e.b(sVar.f306768c.m(str2, false)), null, new xce.d(i3), 1), h0.f322473a, new c(3, 14, continuation2));
                    }
                    Flow flow = flowE;
                    sVar.getClass();
                    f5 f5Var2 = a3Var.y0;
                    String requestId = (f5Var2 == null || (n1Var = f5Var2.f272751c) == null) ? null : n1Var.f272940a;
                    if (requestId == null) {
                        flowE2 = new go.g(null, 2);
                    } else {
                        e3 e3Var = sVar.f306767b;
                        Intrinsics.checkNotNullParameter(requestId, "requestId");
                        zr8.h hVar = (zr8.h) ((zr8.b) e3Var.f262806b);
                        flowE2 = rd0.e.e(new vvh.e(mo3.a.g(rd0.e.b(nim.a.w(hVar.e.f(new zr8.a(), hVar.d.a(Unit.f186387a, false)), new uo7.k(requestId, i5))), null, new xce.d(20), 1), 9), h0.f322473a, new c(3, 15, continuation2));
                    }
                    Flow flow2 = flowE2;
                    i0e.p pVar2 = new i0e.p(sVar, a3Var, nVar, continuation2, 3);
                    this.f302331w = null;
                    this.f302332x = null;
                    this.v = 1;
                    vkm.q.w(flowCollector13);
                    Object objG2 = e0.g(this, s1Var, new c1((Function3) pVar2, continuation2, 15), flowCollector13, new Flow[]{flow, flow2});
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
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 13:
                xkf.w wVar = (xkf.w) obj3;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector14 = (FlowCollector) this.f302331w;
                    String id11 = (String) this.f302332x;
                    if (id11 == null) {
                        flowE3 = new go.g(f0.f322471a, 2);
                    } else {
                        fnc.s sVar2 = wVar.f306788b;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        e1a.f fVar2 = (e1a.f) sVar2.f136657b;
                        fVar2.getClass();
                        Intrinsics.checkNotNullParameter(id11, "id");
                        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                        flowE3 = rd0.e.e(mo3.a.g(boh.f.e(fVar2.d.b(id11, loadingStrategy), new ro7.n(wVar, 25)), null, xkf.v.f306778a, 1), h0.f322473a, new c(3, 16, continuation));
                    }
                    this.f302331w = null;
                    this.f302332x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector14, flowE3, this) == aVar14) {
                        return aVar14;
                    }
                } else {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 14:
                com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits_to_lose.a aVar15 = (com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits_to_lose.a) obj3;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector15 = (FlowCollector) this.f302331w;
                    w4l.k loadingStrategy2 = (w4l.k) this.f302332x;
                    vkm.d dVarB4 = rd0.e.b(aVar15.f103472q.v(loadingStrategy2));
                    wik.n nVar2 = (wik.n) aVar15.f103471p;
                    nVar2.getClass();
                    Intrinsics.checkNotNullParameter(loadingStrategy2, "loadingStrategy");
                    kjk.f0 f0Var = (kjk.f0) nVar2.f297927c;
                    f0Var.getClass();
                    Intrinsics.checkNotNullParameter(loadingStrategy2, "loadingStrategy");
                    w4l.f fVar3 = f0Var.o;
                    od0.i.Companion.getClass();
                    j23.b bVarD = yh5.b.d(dVarB4, c8g.a.D(rd0.e.b(fVar3.e(od0.h.a(null), loadingStrategy2))));
                    this.f302331w = null;
                    this.f302332x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector15, bVarD, this) == aVar16) {
                        return aVar16;
                    }
                } else {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 15:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector16 = (FlowCollector) this.f302331w;
                    xlj.g gVar4 = (xlj.g) obj3;
                    r10.r rVar = gVar4.f307024p;
                    String subscriptionId = gVar4.o.f101363a;
                    rVar.getClass();
                    Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
                    Flow flowE4 = boh.f.e(nim.a.v(((s3) rVar.f250851a).a(subscriptionId, iVar), new dee.x(14)), new l0(rVar, 8));
                    this.f302331w = null;
                    this.f302332x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector16, flowE4, this) == aVar17) {
                        return aVar17;
                    }
                } else {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 16:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector17 = (FlowCollector) this.f302331w;
                    w4l.k loadingStrategy3 = (w4l.k) this.f302332x;
                    s0 s0Var = (s0) obj3;
                    p0 p0Var = s0Var.f307196p;
                    qzi.i budgetingAccountType = s0Var.o.f87512a;
                    p0Var.getClass();
                    Intrinsics.checkNotNullParameter(budgetingAccountType, "budgetingAccountType");
                    Intrinsics.checkNotNullParameter(loadingStrategy3, "loadingStrategy");
                    Flow flowA = p0Var.f307190c.a(budgetingAccountType, loadingStrategy3);
                    uqj.b bVar = (uqj.b) p0Var.f307189b;
                    Intrinsics.checkNotNullParameter(loadingStrategy3, "loadingStrategy");
                    wpj.e eVar5 = (wpj.e) bVar.f282196b;
                    eVar5.getClass();
                    Intrinsics.checkNotNullParameter(loadingStrategy3, "loadingStrategy");
                    Flow flowE5 = boh.f.e(u0.m(flowA, nim.a.A(eVar5.d.b(Unit.f186387a, loadingStrategy3), new wp5.w(i21))), new xf0.j(p0Var, loadingStrategy3, i3));
                    this.f302331w = null;
                    this.f302332x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector17, flowE5, this) == aVar18) {
                        return aVar18;
                    }
                } else {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 17:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector18 = (FlowCollector) this.f302331w;
                    Map mapT = r0.t(kotlin.collections.d.A0((yld.d[]) obj3, (yld.c[]) ((Object[]) this.f302332x)));
                    this.f302331w = null;
                    this.f302332x = null;
                    this.v = 1;
                    if (flowCollector18.emit(mapT, this) == aVar19) {
                        return aVar19;
                    }
                } else {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 18:
                xpk.m mVar = (xpk.m) obj3;
                RateDetailsScreenContract$InputData rateDetailsScreenContract$InputData = mVar.f307998p;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector19 = (FlowCollector) this.f302331w;
                    if (((Boolean) this.f302332x).booleanValue()) {
                        u1d.a aVar21 = mVar.f308001s;
                        xpk.p pVar3 = mVar.f308002t;
                        xi0.b bVar2 = rateDetailsScreenContract$InputData.f103727a;
                        pVar3.getClass();
                        gVar = aVar21.e3(xpk.p.a(bVar2), new Pair(rateDetailsScreenContract$InputData.f103727a.f306286a, rateDetailsScreenContract$InputData.f103728b.f306286a));
                    } else {
                        gVar = new go.g(Boolean.FALSE, 2);
                    }
                    this.f302331w = null;
                    this.f302332x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector19, gVar, this) == aVar20) {
                        return aVar20;
                    }
                } else {
                    if (i109 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 19:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector20 = (FlowCollector) this.f302331w;
                    xsi.p pVar4 = (xsi.p) obj3;
                    akg.n nVarV2 = nim.a.v(vkm.q.r(new xlb.l(26), new vkm.y(new xnl.f(pVar4, continuation, 11), nim.a.v(rd0.e.b(com.revolut.domain.interactors.transactions.a.d(pVar4.f308539p, new ba(pVar4.o.f98703a.f272579a), null, null, null, null, 30)), new xrl.a(i21)))), new xrl.a(i2));
                    this.f302331w = null;
                    this.f302332x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector20, nVarV2, this) == aVar22) {
                        return aVar22;
                    }
                } else {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 20:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector21 = (FlowCollector) this.f302331w;
                    v1 v1Var = new v1(new c7i.d0((xvf.m) obj3, (axf.a) this.f302332x, continuation, i21));
                    this.f302331w = null;
                    this.f302332x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector21, v1Var, this) == aVar23) {
                        return aVar23;
                    }
                } else {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 21:
                com.revolut.feature.rev_points.giftcards.impl.ui.screen.purchase.a aVar24 = (com.revolut.feature.rev_points.giftcards.impl.ui.screen.purchase.a) obj3;
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector22 = (FlowCollector) this.f302331w;
                    vkm.d dVarB5 = rd0.e.b(aVar24.f83727p.c(false));
                    h0 h0Var = h0.f322473a;
                    j23.b bVarD2 = yh5.b.d(rd0.e.n(dVarB5, h0Var), rd0.e.n(aVar24.f83728q.d(aVar24.o.f83671a, iVar), h0Var));
                    this.f302331w = null;
                    this.f302332x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector22, bVarD2, this) == aVar25) {
                        return aVar25;
                    }
                } else {
                    if (i112 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 22:
                y20.r rVar2 = (y20.r) this.f302331w;
                List list = (List) this.f302332x;
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                if (i113 == 0) {
                    yhm.o.b(obj2);
                    uvl.c cVar2 = ((b1) obj3).i;
                    this.f302331w = null;
                    this.f302332x = null;
                    this.v = 1;
                    if (cVar2.r(list, rVar2, this) == aVar26) {
                        return aVar26;
                    }
                } else {
                    if (i113 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 23:
                y20.q qVar3 = (y20.q) this.f302331w;
                List list2 = (List) this.f302332x;
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                int i114 = this.v;
                if (i114 == 0) {
                    yhm.o.b(obj2);
                    uvl.c cVar3 = ((b1) obj3).i;
                    this.f302331w = null;
                    this.f302332x = null;
                    this.v = 1;
                    if (cVar3.r(list2, qVar3, this) == aVar27) {
                        return aVar27;
                    }
                } else {
                    if (i114 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 24:
                y20.s sVar3 = (y20.s) this.f302331w;
                List list3 = (List) this.f302332x;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                int i115 = this.v;
                if (i115 == 0) {
                    yhm.o.b(obj2);
                    uvl.c cVar4 = ((b1) obj3).i;
                    this.f302331w = null;
                    this.f302332x = null;
                    this.v = 1;
                    if (cVar4.r(list3, sVar3, this) == aVar28) {
                        return aVar28;
                    }
                } else {
                    if (i115 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 25:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                int i116 = this.v;
                if (i116 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector23 = (FlowCollector) this.f302331w;
                    vkm.d dVarB6 = rd0.e.b(((y45.a) obj3).f310787a.d((w4l.k) this.f302332x));
                    this.f302331w = null;
                    this.f302332x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector23, dVarB6, this) == aVar29) {
                        return aVar29;
                    }
                } else {
                    if (i116 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 26:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                int i117 = this.v;
                if (i117 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector24 = (FlowCollector) this.f302331w;
                    vkm.d dVarB7 = rd0.e.b(((y45.h) obj3).f310800a.d((w4l.k) this.f302332x));
                    this.f302331w = null;
                    this.f302332x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector24, dVarB7, this) == aVar30) {
                        return aVar30;
                    }
                } else {
                    if (i117 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 27:
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                int i118 = this.v;
                if (i118 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector25 = (FlowCollector) this.f302331w;
                    vkm.d dVarB8 = rd0.e.b(((y45.n) obj3).f310808a.d((w4l.k) this.f302332x));
                    this.f302331w = null;
                    this.f302332x = null;
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
            case 28:
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                int i119 = this.v;
                if (i119 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector26 = (FlowCollector) this.f302331w;
                    vkm.d dVarB9 = rd0.e.b(((y45.o) obj3).f310811a.d((w4l.k) this.f302332x));
                    this.f302331w = null;
                    this.f302332x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector26, dVarB9, this) == aVar32) {
                        return aVar32;
                    }
                } else {
                    if (i119 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                int i120 = this.v;
                if (i120 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector27 = (FlowCollector) this.f302331w;
                    xi0.b baseCurrency = (xi0.b) this.f302332x;
                    com.revolut.feature.revolut_x_balances.impl.fiat.a aVar34 = (com.revolut.feature.revolut_x_balances.impl.fiat.a) obj3;
                    r10.w wVar2 = aVar34.f84258q;
                    xi0.b currency = aVar34.o.f84249a;
                    Intrinsics.h(baseCurrency);
                    wVar2.getClass();
                    ur5.c cVar5 = (ur5.c) wVar2.f250865a;
                    Intrinsics.checkNotNullParameter(currency, "currency");
                    Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
                    vkm.d dVarB10 = rd0.e.b(nim.a.w(kli.a.h(ur5.a.a(cVar5, currency, baseCurrency, 4), ue0.e.E(pd.b.r(ur5.a.b(cVar5, currency, 2), new b58.f(wVar2, baseCurrency, i5)), new Data(f0.f322471a, null, false, 6, null))), new b5c.a(currency, baseCurrency, i6)));
                    this.f302331w = null;
                    this.f302332x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector27, dVarB10, this) == aVar33) {
                        return aVar33;
                    }
                } else {
                    if (i120 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(b1 b1Var, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f302333y = b1Var;
    }
}
