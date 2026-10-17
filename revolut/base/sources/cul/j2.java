package cul;

import com.revolut.feature.trading_orders.common.models.AutoTopUpStatus;
import com.revolut.feature.trading_orders.common.models.FrequencySettings;
import com.revolut.feature.trading_orders.common.models.SourcePocketWrapper;
import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;
import com.revolut.retail.trading.core.domain.orders.OrderExpiry;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.trading.orders.ui.invest.placement.models.InvestOrderDraft;
import com.revolut.trading.orders.ui.invest.placement.models.OrderQuoteResult;
import com.revolut.trading.orders.ui.invest.placement.models.ProcessedInputAmount;
import com.revolut.trading.orders.ui.trade.model.ExtendedHoursStatus;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import knd.m1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class j2 extends gim.i implements Function2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f109123w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f109124x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f109125y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j2(ivh.c cVar, String str, String str2, Function1 function1, Function1 function12, Function1 function13, Continuation continuation) {
        super(2, continuation);
        this.u = 1;
        this.v = cVar;
        this.f109123w = str;
        this.f109124x = str2;
        this.f109125y = (gim.i) function1;
        this.z = function12;
        this.A = function13;
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                j2 j2Var = new j2(continuation, (com.revolut.trading.orders.ui.invest.placement.screens.edit.e) this.f109123w, (bfl.g) this.f109124x, (k4l.r0) this.f109125y, (Amount) this.z, (w) this.A);
                j2Var.v = obj2;
                return j2Var;
            case 1:
                return new j2((ivh.c) this.v, (String) this.f109123w, (String) this.f109124x, (Function1) this.f109125y, (Function1) this.z, (Function1) this.A, continuation);
            case 2:
                j2 j2Var2 = new j2((knd.p) this.f109123w, (knd.v) this.f109124x, (knd.k) this.f109125y, (knd.i) this.z, (knd.m) this.A, continuation, 2);
                j2Var2.v = obj2;
                return j2Var2;
            default:
                j2 j2Var3 = new j2((vyg.e) this.f109123w, (sxg.k) this.f109124x, (iwg.c) this.f109125y, (WidgetisedAnalyticsType) this.z, (eel.c) this.A, continuation, 3);
                j2Var3.v = obj2;
                return j2Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((j2) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r13v3, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Set setB;
        knd.g gVar;
        lzi.j jVar;
        int i = this.u;
        Object obj3 = this.A;
        Object obj4 = this.z;
        Object obj5 = this.f109125y;
        Object obj6 = this.f109123w;
        Object obj7 = this.f109124x;
        switch (i) {
            case 0:
                Pair pair = (Pair) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Pair pair2 = (Pair) pair.f186385a;
                Pair pair3 = (Pair) pair.f186386b;
                yhm.r rVar = (yhm.r) pair2.f186385a;
                yhm.r rVar2 = (yhm.r) pair2.f186386b;
                yhm.r rVar3 = (yhm.r) pair3.f186385a;
                Object obj8 = pair3.f186386b;
                Object obj9 = rVar.f314201a;
                Object obj10 = rVar.f314202b;
                Object obj11 = rVar.f314203c;
                Object obj12 = rVar2.f314201a;
                Object obj13 = rVar2.f314202b;
                Object obj14 = rVar2.f314203c;
                Object obj15 = rVar3.f314201a;
                Object obj16 = rVar3.f314202b;
                AutoTopUpStatus autoTopUpStatus = (AutoTopUpStatus) obj8;
                Pair pair4 = (Pair) rVar3.f314203c;
                OrderExpiry orderExpiry = (OrderExpiry) obj16;
                ExtendedHoursStatus extendedHoursStatus = (ExtendedHoursStatus) obj15;
                k4l.e0 orderLimits = (k4l.e0) obj14;
                k4l.q0 timeInForce = (k4l.q0) obj13;
                SourcePocketWrapper sourcePocketWrapper = (SourcePocketWrapper) obj12;
                OrderQuoteResult orderQuoteResult = (OrderQuoteResult) obj11;
                ProcessedInputAmount processedInputAmount = (ProcessedInputAmount) obj10;
                xi0.b displayCurrency = (xi0.b) obj9;
                Object obj17 = pair4.f186385a;
                Intrinsics.checkNotNullExpressionValue(obj17, "component1(...)");
                List availablePeriods = (List) pair4.f186386b;
                gul.o oVar = ((com.revolut.trading.orders.ui.invest.placement.screens.edit.e) obj6).T;
                bfl.g tradeSide = (bfl.g) obj7;
                k4l.r0 orderType = (k4l.r0) obj5;
                Amount amount = (Amount) obj4;
                FrequencySettings frequencySettings = (FrequencySettings) gj7.b.m((Optional) obj17);
                w wVar = (w) obj3;
                oVar.getClass();
                Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
                Intrinsics.checkNotNullParameter(orderType, "orderType");
                Intrinsics.checkNotNullParameter(displayCurrency, "displayCurrency");
                Intrinsics.checkNotNullParameter(processedInputAmount, "processedInputAmount");
                Intrinsics.checkNotNullParameter(orderQuoteResult, "orderQuoteResult");
                Intrinsics.checkNotNullParameter(sourcePocketWrapper, "sourcePocketWrapper");
                Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
                Intrinsics.checkNotNullParameter(orderLimits, "orderLimits");
                Intrinsics.checkNotNullParameter(extendedHoursStatus, "extendedHoursStatus");
                Intrinsics.checkNotNullParameter(orderExpiry, "orderExpiry");
                Intrinsics.checkNotNullParameter(autoTopUpStatus, "autoTopUpStatus");
                Intrinsics.checkNotNullParameter(availablePeriods, "availablePeriods");
                return new x(new InvestOrderDraft(tradeSide, orderType, displayCurrency, processedInputAmount, orderQuoteResult.f106858a, sourcePocketWrapper, timeInForce, orderLimits, (oi0.d.y(orderType) || oi0.d.D(orderType)) ? amount : null, extendedHoursStatus, orderExpiry, oi0.d.B(orderType) ? frequencySettings : null, autoTopUpStatus), availablePeriods, wVar);
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ivh.c.Z2((ivh.c) this.v, (String) obj6, (String) obj7, (gim.i) obj5, (Function1) obj4, (Function1) obj3, 32);
                return Unit.f186387a;
            case 2:
                knd.v vVar = (knd.v) obj7;
                List list = (List) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                knd.p pVar = (knd.p) obj6;
                boolean z = pVar instanceof knd.n;
                if (z) {
                    setB = zhm.y0.b(((knd.n) pVar).f186115a.f200981b);
                } else {
                    if (!(pVar instanceof knd.o)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$Interval = (AnalyticsSpendingPeriod$Interval) zhm.d0.M0(((knd.o) pVar).f186121b);
                    setB = analyticsSpendingPeriod$Interval != null ? zhm.y0.b(analyticsSpendingPeriod$Interval) : null;
                    if (setB == null) {
                        setB = zhm.h0.f322473a;
                    }
                }
                knd.k kVar = (knd.k) obj5;
                amd.i iVar = kVar != null ? kVar.f186101a : null;
                int i2 = iVar == null ? -1 : knd.q.f186124b[iVar.ordinal()];
                if (i2 == -1 || i2 == 1 || i2 == 2) {
                    iVar = amd.i.CATEGORIES;
                }
                List<knd.m1> list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    for (knd.m1 m1Var : list2) {
                        if (setB.contains(m1Var.f186113a) && (gVar = (knd.g) m1Var.f186114b.getContent()) != null) {
                            amd.i iVar2 = gVar.d;
                            int i3 = iVar2 == null ? -1 : knd.q.f186124b[iVar2.ordinal()];
                            if (i3 == -1 || i3 == 1 || i3 == 2) {
                                iVar2 = amd.i.CATEGORIES;
                            }
                            if (iVar2 != iVar) {
                                return null;
                            }
                        }
                    }
                }
                knd.i iVar3 = (knd.i) obj4;
                knd.m mVar = (knd.m) obj3;
                ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                for (Iterator it8 = list2.iterator(); it8.hasNext(); it8 = it8) {
                    final knd.m1 data = (knd.m1) it8.next();
                    final lnd.n nVar = vVar.i;
                    final yld.d screenType = iVar3.f186090a;
                    final lzi.i periodType = pVar.getPeriodType();
                    final long jA = pVar.a();
                    final xi0.b analyticsCurrency = mVar.d;
                    knd.n nVar2 = z ? (knd.n) pVar : null;
                    final AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$Interval2 = (nVar2 == null || (jVar = nVar2.f186115a) == null) ? null : jVar.f200982c;
                    Intrinsics.checkNotNullParameter(data, "data");
                    Intrinsics.checkNotNullParameter(screenType, "screenType");
                    Intrinsics.checkNotNullParameter(periodType, "periodType");
                    Intrinsics.checkNotNullParameter(analyticsCurrency, "analyticsCurrency");
                    arrayList.add((ind.e) iii.c.f(data.f186114b, new csl.a(data, periodType, jA, 6), new v1.l0(data, periodType, jA, 2), new Function3(nVar, screenType, data, periodType, jA, analyticsCurrency, analyticsSpendingPeriod$Interval2) { // from class: lnd.e

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ yld.d f197170a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ m1 f197171b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ lzi.i f197172c;
                        public final /* synthetic */ long d;
                        public final /* synthetic */ xi0.b e;
                        public final /* synthetic */ AnalyticsSpendingPeriod$Interval f;

                        {
                            this.f197170a = screenType;
                            this.f197171b = data;
                            this.f197172c = periodType;
                            this.d = jA;
                            this.e = analyticsCurrency;
                            this.f = analyticsSpendingPeriod$Interval2;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:38:0x012b  */
                        /* JADX WARN: Removed duplicated region for block: B:40:0x0135  */
                        @Override // kotlin.jvm.functions.Function3
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object invoke(java.lang.Object r13, java.lang.Object r14, java.lang.Object r15) {
                            /*
                                Method dump skipped, instruction units count: 344
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: lnd.e.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                        }
                    }));
                }
                return arrayList;
            default:
                sxg.k kVar2 = (sxg.k) obj7;
                List list3 = (List) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                vyg.e eVar = (vyg.e) obj6;
                int i5 = sxg.c.f266487a[eVar.ordinal()];
                if (i5 != 1) {
                    if (i5 == 2) {
                        return sxg.k.e(kVar2, list3, (iwg.c) obj5, (WidgetisedAnalyticsType) obj4, (eel.c) obj3);
                    }
                    if (i5 == 3) {
                        return sxg.k.d(kVar2, list3);
                    }
                    if (i5 == 4) {
                        return zi0.c.i(zhm.f0.f322471a);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj18 : list3) {
                    iwg.a aVar5 = ((mwg.f) obj18).f209453a;
                    Object arrayList2 = linkedHashMap.get(aVar5);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(aVar5, arrayList2);
                    }
                    ((List) arrayList2).add(obj18);
                }
                ArrayList arrayList3 = new ArrayList(linkedHashMap.size());
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    iwg.a aVar6 = (iwg.a) entry.getKey();
                    arrayList3.add(sxg.k.b(kVar2, aVar6, sxg.k.a(kVar2, (List) entry.getValue(), aVar6, eVar)));
                }
                return arrayList3.isEmpty() ? zi0.c.i(zhm.f0.f322471a) : nim.a.v(zh9.u0.k(arrayList3), new sx2.g(12));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j2(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f109123w = obj2;
        this.f109124x = obj3;
        this.f109125y = obj4;
        this.z = obj5;
        this.A = obj6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(Continuation continuation, com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar, bfl.g gVar, k4l.r0 r0Var, Amount amount, w wVar) {
        super(2, continuation);
        this.u = 0;
        this.f109123w = eVar;
        this.f109124x = gVar;
        this.f109125y = r0Var;
        this.z = amount;
        this.A = wVar;
    }
}
