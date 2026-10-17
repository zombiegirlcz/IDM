package cul;

import com.revolut.data.model.Data;
import com.revolut.feature.trading_orders.common.models.AutoTopUpStatus;
import com.revolut.feature.trading_orders.common.models.FrequencySettings;
import com.revolut.feature.trading_orders.common.models.SourcePocket;
import com.revolut.feature.trading_orders.common.models.SourcePocketWrapper;
import com.revolut.retail.trading.core.domain.orders.TradingAutoTopUp;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import com.revolut.trading.orders.TradingOrdersApi$Toggles;
import com.revolut.trading.orders.ui.invest.placement.models.InvestOutputValue;
import com.revolut.trading.orders.ui.invest.placement.screens.edit.InvestOrderEditScreenContract$ModalStep;
import com.revolut.trading.orders.ui.trade.model.ExtendedHoursStatus;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes12.dex */
public final class y0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.trading.orders.ui.invest.placement.screens.edit.e f109207w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f109207w = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                y0 y0Var = new y0(this.f109207w, continuation, 0);
                y0Var.v = obj2;
                return y0Var;
            case 1:
                y0 y0Var2 = new y0(this.f109207w, continuation, 1);
                y0Var2.v = obj2;
                return y0Var2;
            case 2:
                y0 y0Var3 = new y0(this.f109207w, continuation, 2);
                y0Var3.v = obj2;
                return y0Var3;
            case 3:
                y0 y0Var4 = new y0(this.f109207w, continuation, 3);
                y0Var4.v = obj2;
                return y0Var4;
            case 4:
                y0 y0Var5 = new y0(this.f109207w, continuation, 4);
                y0Var5.v = obj2;
                return y0Var5;
            case 5:
                y0 y0Var6 = new y0(this.f109207w, continuation, 5);
                y0Var6.v = obj2;
                return y0Var6;
            case 6:
                y0 y0Var7 = new y0(this.f109207w, continuation, 6);
                y0Var7.v = obj2;
                return y0Var7;
            case 7:
                y0 y0Var8 = new y0(this.f109207w, continuation, 7);
                y0Var8.v = obj2;
                return y0Var8;
            case 8:
                y0 y0Var9 = new y0(this.f109207w, continuation, 8);
                y0Var9.v = obj2;
                return y0Var9;
            case 9:
                y0 y0Var10 = new y0(this.f109207w, continuation, 9);
                y0Var10.v = obj2;
                return y0Var10;
            case 10:
                y0 y0Var11 = new y0(this.f109207w, continuation, 10);
                y0Var11.v = obj2;
                return y0Var11;
            case 11:
                y0 y0Var12 = new y0(continuation, this.f109207w, 11);
                y0Var12.v = obj2;
                return y0Var12;
            case 12:
                y0 y0Var13 = new y0(this.f109207w, continuation, 12);
                y0Var13.v = obj2;
                return y0Var13;
            case 13:
                y0 y0Var14 = new y0(this.f109207w, continuation, 13);
                y0Var14.v = obj2;
                return y0Var14;
            case 14:
                y0 y0Var15 = new y0(continuation, this.f109207w, 14);
                y0Var15.v = obj2;
                return y0Var15;
            case 15:
                y0 y0Var16 = new y0(this.f109207w, continuation, 15);
                y0Var16.v = obj2;
                return y0Var16;
            case 16:
                y0 y0Var17 = new y0(this.f109207w, continuation, 16);
                y0Var17.v = obj2;
                return y0Var17;
            case 17:
                y0 y0Var18 = new y0(this.f109207w, continuation, 17);
                y0Var18.v = obj2;
                return y0Var18;
            case 18:
                y0 y0Var19 = new y0(this.f109207w, continuation, 18);
                y0Var19.v = obj2;
                return y0Var19;
            case 19:
                y0 y0Var20 = new y0(continuation, this.f109207w, 19);
                y0Var20.v = obj2;
                return y0Var20;
            case 20:
                y0 y0Var21 = new y0(this.f109207w, continuation, 20);
                y0Var21.v = obj2;
                return y0Var21;
            case 21:
                y0 y0Var22 = new y0(this.f109207w, continuation, 21);
                y0Var22.v = obj2;
                return y0Var22;
            default:
                y0 y0Var23 = new y0(this.f109207w, continuation, 22);
                y0Var23.v = obj2;
                return y0Var23;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((y0) create((InvestOutputValue) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((y0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((y0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((y0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((y0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((y0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((y0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((y0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((y0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((y0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((y0) create((yhm.r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((y0) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((y0) create((SourcePocketWrapper) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((y0) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((y0) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((y0) create((k4l.q0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((y0) create((k4l.q0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((y0) create((k4l.q0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((y0) create((kel.n) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((y0) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((y0) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((y0) create((SourcePocket) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((y0) create((SourcePocketWrapper) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Flow flowI;
        int i = this.u;
        int i2 = 8;
        int i3 = 0;
        ?? aVar = 0;
        aVar = 0;
        aVar = 0;
        aVar = 0;
        com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar = this.f109207w;
        switch (i) {
            case 0:
                InvestOutputValue investOutputValue = (InvestOutputValue) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                eVar.H2(eVar.m0, new x0(investOutputValue, i3));
                return Unit.f186387a;
            case 1:
                Data data = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                eVar.H2(eVar.m0, new w0(data, 10));
                return Unit.f186387a;
            case 2:
                Data data2 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                eVar.H2(eVar.m0, new w0(data2, 11));
                return Unit.f186387a;
            case 3:
                Data data3 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                eVar.H2(eVar.m0, new w0(data3, 12));
                return Unit.f186387a;
            case 4:
                Data data4 = (Data) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                eVar.H2(eVar.m0, new w0(data4, 13));
                return Unit.f186387a;
            case 5:
                Data data5 = (Data) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                eVar.H2(eVar.m0, new w0(data5, 14));
                return Unit.f186387a;
            case 6:
                Data data6 = (Data) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                eVar.H2(eVar.m0, new w0(data6, 15));
                return Unit.f186387a;
            case 7:
                Data data7 = (Data) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                eVar.H2(eVar.m0, new w0(data7, 16));
                return Unit.f186387a;
            case 8:
                Data data8 = (Data) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                eVar.H2(eVar.m0, new w0(data8, 17));
                return Unit.f186387a;
            case 9:
                Data data9 = (Data) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                eVar.H2(eVar.m0, new w0(data9, 18));
                return Unit.f186387a;
            case 10:
                yhm.r rVar = (yhm.r) this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bfl.g tradeSide = (bfl.g) rVar.f314201a;
                List list = (List) rVar.f314202b;
                nel.z instrumentType = ((nel.n) rVar.f314203c).f214597c;
                Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
                Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
                com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar2 = this.f109207w;
                if (!((jte.d) eVar2.i0).c(TradingOrdersApi$Toggles.StocksSellFlowImprovements.f106795c) || tradeSide == bfl.g.BUY) {
                    Optional optionalEmpty = Optional.empty();
                    Intrinsics.checkNotNullExpressionValue(optionalEmpty, "empty(...)");
                    flowI = zi0.c.i(optionalEmpty);
                } else {
                    flowI = rd0.e.e(new vkm.v1(new a31.w(eVar2, tradeSide, instrumentType, (Continuation) null, 14)), zhm.h0.f322473a, new c9k.k(3, 8, null));
                }
                return nim.a.v(flowI, new c1g.o(eVar2, 24, list, tradeSide));
            case 11:
                Pair pair = (Pair) this.v;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                yhm.r rVar2 = (yhm.r) pair.f186385a;
                Object obj3 = pair.f186386b;
                Object obj4 = rVar2.f314201a;
                Object obj5 = rVar2.f314202b;
                k4l.r0 orderType = (k4l.r0) obj3;
                boolean zBooleanValue = ((Boolean) rVar2.f314203c).booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
                boolean zBooleanValue3 = ((Boolean) obj4).booleanValue();
                eVar.O.getClass();
                Intrinsics.checkNotNullParameter(orderType, "orderType");
                return (zBooleanValue3 && oi0.d.y(orderType)) ? !zBooleanValue2 ? ExtendedHoursStatus.OptedOut.f107064a : new ExtendedHoursStatus.OptedIn(zBooleanValue) : ExtendedHoursStatus.Unavailable.f107065a;
            case 12:
                SourcePocketWrapper sourcePocketWrapper = (SourcePocketWrapper) this.v;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return nim.a.v(eVar.u.b3(), new cui.v(eVar, sourcePocketWrapper, 4));
            case 13:
                Pair pair2 = (Pair) this.v;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return nim.a.v(eVar.l3(), new c1g.o(eVar, 25, (k4l.r0) pair2.f186386b, (aul.b) pair2.f186385a));
            case 14:
                Pair pair3 = (Pair) this.v;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                yhm.r rVar3 = (yhm.r) pair3.f186385a;
                Pair pair4 = (Pair) pair3.f186386b;
                Object obj6 = rVar3.f314201a;
                Object obj7 = rVar3.f314202b;
                Object obj8 = rVar3.f314203c;
                Object obj9 = pair4.f186385a;
                wel.e portfolio = (wel.e) pair4.f186386b;
                AutoTopUpStatus autoTopUpStatus = (AutoTopUpStatus) obj9;
                SourcePocketWrapper sourcePocketWrapper2 = (SourcePocketWrapper) obj8;
                OrderQuote orderQuote = (OrderQuote) obj7;
                nel.n instrument = (nel.n) obj6;
                gul.e eVar3 = eVar.c0;
                eVar3.getClass();
                Intrinsics.checkNotNullParameter(instrument, "instrument");
                Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
                Intrinsics.checkNotNullParameter(sourcePocketWrapper2, "sourcePocketWrapper");
                Intrinsics.checkNotNullParameter(autoTopUpStatus, "autoTopUpStatus");
                Intrinsics.checkNotNullParameter(portfolio, "portfolio");
                TradingAutoTopUp tradingAutoTopUpA = bul.x.a(sourcePocketWrapper2, autoTopUpStatus);
                if (tradingAutoTopUpA != null) {
                    Amount amountV = d9.e1.v(orderQuote);
                    Intrinsics.checkNotNullParameter(amountV, "<this>");
                    eVar3.e().getClass();
                    if (l4i.a.d(amountV) && !tradingAutoTopUpA.equals(TradingAutoTopUp.CombinedBuyingPower.f104654a) && !(tradingAutoTopUpA instanceof TradingAutoTopUp.Holding)) {
                        if (!(tradingAutoTopUpA instanceof TradingAutoTopUp.Pocket)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        xi0.b bVar = instrument.i;
                        xi0.a aVar17 = xi0.b.Companion;
                        String str = instrument.f214596b;
                        aVar17.getClass();
                        aVar = new vrc.a(bVar, xi0.a.a(str), ((TradingAutoTopUp.Pocket) tradingAutoTopUpA).f104657a, null, Long.valueOf(eVar3.g(amountV).f115082a), null, portfolio.f296818a);
                    }
                }
                return Optional.ofNullable(aVar);
            case 15:
                k4l.q0 q0Var = (k4l.q0) this.v;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return nim.a.v(com.revolut.trading.orders.ui.invest.placement.screens.edit.e.a3(eVar, q0Var), new p0(7));
            case 16:
                k4l.q0 q0Var2 = (k4l.q0) this.v;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return nim.a.v(com.revolut.trading.orders.ui.invest.placement.screens.edit.e.a3(eVar, q0Var2), new p0(i2));
            case 17:
                k4l.q0 q0Var3 = (k4l.q0) this.v;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                int i5 = 22;
                return vkm.q.Q(eVar.m0.B(new cui.s(i5)), new a32.b((Continuation) aVar, eVar, q0Var3, i5));
            case 18:
                kel.n nVar = (kel.n) this.v;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return nim.a.v(eVar.m0.B(new p0(20)), new cui.v(eVar, nVar, 6));
            case 19:
                Pair pair5 = (Pair) this.v;
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                yhm.r rVar4 = (yhm.r) pair5.f186385a;
                Object obj10 = pair5.f186386b;
                Object obj11 = rVar4.f314201a;
                Object obj12 = rVar4.f314202b;
                List list2 = (List) obj10;
                bfl.e eVar4 = (bfl.e) rVar4.f314203c;
                List list3 = (List) obj12;
                FrequencySettings frequencySettings = (FrequencySettings) obj11;
                r10.a aVar23 = eVar.Q;
                LocalDate localDateS = aVar23.S(list3, eVar4);
                LocalDate localDate = aVar23.O().toLocalDate();
                List list4 = list3;
                ArrayList arrayList = new ArrayList(zhm.w.t(list4, 10));
                Iterator it8 = list4.iterator();
                while (it8.hasNext()) {
                    arrayList.add(((iel.p) it8.next()).f160803b);
                }
                LocalDate localDate2 = frequencySettings.f91773a;
                Intrinsics.h(localDate);
                return new InvestOrderEditScreenContract$ModalStep.ScheduleSettings(localDate2, localDateS, localDate, arrayList, frequencySettings.f91774b, list2);
            case 20:
                Pair pair6 = (Pair) this.v;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return ((vrl.l0) eVar.Z).a((List) pair6.f186385a, new xdf.g((nel.n) pair6.f186386b));
            case 21:
                SourcePocket sourcePocket = (SourcePocket) this.v;
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return xam.a.h(new chf.a(eVar, sourcePocket, aVar, 5), zh9.u0.m(eVar.T2(), ((vrl.e) eVar.f106925q).e(eVar.p0, w4l.h.f294642c)));
            default:
                wtl.e eVar5 = eVar.u;
                SourcePocketWrapper sourcePocketWrapper3 = (SourcePocketWrapper) this.v;
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return nim.a.u(new a1((Continuation) null, eVar, sourcePocketWrapper3), zh9.u0.m(zh9.u0.i(sourcePocketWrapper3.b() ? zh9.u0.m(nim.a.v(eVar5.b3(), new p0(29)), nim.a.v(eVar5.Z2(), new n2(0))) : nim.a.v(eVar5.b3(), new n2(1)), eVar.T2(), com.revolut.trading.orders.ui.invest.placement.screens.edit.e.Z2(eVar)), zh9.u0.i(eVar.b3(w4l.h.f294642c), eVar.m0.B(new n2(2)), ((vrl.e) eVar.f106925q).e(eVar.p0, w4l.h.f294642c))));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(Continuation continuation, com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar, int i) {
        super(2, continuation);
        this.u = i;
        this.f109207w = eVar;
    }
}
