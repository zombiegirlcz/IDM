package vf0;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.q0;
import com.revolut.feature.crypto.exchange.fees.api.model.CryptoExchangeFeesV2;
import com.revolut.feature.crypto.exchange.fees.impl.model.CryptoExchangeFeesFacadeV2;
import com.revolut.feature.crypto.exchange.fees.impl.model.TieredPricingFacade;
import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import com.revolut.feature.rev_points.models.RevPointsTransaction;
import com.revolut.feature.travel.miles.api.model.TravelMilesAccount;
import com.revolut.feature.travel.miles.api.model.TravelMilesAccountV2;
import com.revolut.feature.travel.miles.api.model.TravelMilesAirline;
import com.revolut.feature.travel.miles.api.model.TravelMilesProvider;
import efm.d0;
import hfg.b0;
import hfg.j0;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m1c.f1;
import m1c.r1;
import zhm.f0;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f288465a;

    public /* synthetic */ p() {
        this.f288465a = 3;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object it8) {
        Object next;
        String str;
        switch (this.f288465a) {
            case 0:
                Object[] items = (Object[]) it8;
                Intrinsics.checkNotNullParameter(items, "items");
                return new w(items[0], items[1], items[2], items[3], items[4], items[5], items[6], items[7], items[8], items[9], items[10], items[11], items[12], items[13], items[14], items[15], items[16]);
            case 1:
                Object[] items2 = (Object[]) it8;
                Intrinsics.checkNotNullParameter(items2, "items");
                return new j(items2[0], items2[1], items2[2], items2[3], items2[4], items2[5], items2[6], items2[7], items2[8], items2[9], items2[10], items2[11], items2[12], items2[13], items2[14]);
            case 2:
                Object[] items3 = (Object[]) it8;
                Intrinsics.checkNotNullParameter(items3, "items");
                return new a0(items3[0], items3[1], items3[2], items3[3], items3[4], items3[5], items3[6], items3[7], items3[8], items3[9], items3[10]);
            case 3:
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                efm.r shared = (efm.r) it8;
                Intrinsics.checkNotNullParameter(shared, "shared");
                return shared.take(1L).concatWith(shared.throttleLast(100L, timeUnit));
            case 4:
                Intrinsics.checkNotNullParameter(it8, "it");
                throw new l(it8);
            case 5:
                Throwable err = (Throwable) it8;
                Intrinsics.checkNotNullParameter(err, "err");
                if (!(err instanceof l)) {
                    return d0.l(err);
                }
                Object obj2 = ((l) err).f288457a;
                Intrinsics.i(obj2, "null cannot be cast to non-null type T of com.revolut.core.extensions.rx.RxLoopExtensionsKt.repeatWhile");
                return d0.m(obj2);
            case 6:
                CryptoExchangeFeesFacadeV2 cryptoExchangeFeesFacade = (CryptoExchangeFeesFacadeV2) it8;
                Intrinsics.checkNotNullParameter(cryptoExchangeFeesFacade, "cryptoExchangeFeesFacade");
                double d = cryptoExchangeFeesFacade.f70828a;
                TieredPricingFacade tieredPricingFacade = cryptoExchangeFeesFacade.f70829b;
                return new CryptoExchangeFeesV2(d, tieredPricingFacade != null ? tieredPricingFacade.f70832a : null, tieredPricingFacade != null ? tieredPricingFacade.f70833b : null);
            case 7:
                List it9 = (List) it8;
                Intrinsics.checkNotNullParameter(it9, "it");
                return m72.b.x(it9, od0.i.Companion);
            case 8:
                List airlines = (List) it8;
                Intrinsics.checkNotNullParameter(airlines, "airlines");
                return zhm.d0.P0(airlines, new afa.a(new vea.b(8), 11));
            case 9:
                Pair pair = (Pair) it8;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list = (List) pair.f186385a;
                List<TravelMilesAirline> list2 = (List) pair.f186386b;
                ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                for (TravelMilesAirline travelMilesAirlineA : list2) {
                    Iterator it10 = list.iterator();
                    while (true) {
                        if (it10.hasNext()) {
                            next = it10.next();
                            if (Intrinsics.f(((TravelMilesAccountV2) next).f94087c.f94109a, travelMilesAirlineA.f94091g.f94103a)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    TravelMilesAccountV2 travelMilesAccountV2 = (TravelMilesAccountV2) next;
                    if (travelMilesAccountV2 != null) {
                        travelMilesAirlineA = TravelMilesAirline.a(travelMilesAirlineA, TravelMilesProvider.a(travelMilesAirlineA.f94091g, new TravelMilesAccount(travelMilesAccountV2.f94085a, travelMilesAccountV2.f94086b, travelMilesAccountV2.d)), null, 959);
                    }
                    arrayList.add(travelMilesAirlineA);
                }
                return arrayList;
            case 10:
                Pair pair2 = (Pair) it8;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                boolean zBooleanValue = ((Boolean) pair2.f186385a).booleanValue();
                List<TravelMilesAirline> list3 = (List) pair2.f186386b;
                if (zBooleanValue) {
                    return list3;
                }
                ArrayList arrayList2 = new ArrayList();
                for (TravelMilesAirline travelMilesAirline : list3) {
                    List list4 = travelMilesAirline.i;
                    TravelMilesAirline travelMilesAirlineA2 = null;
                    if (list4.size() != 1 || list4.get(0) != b0.GIFT_CARDS) {
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj3 : list4) {
                            if (((b0) obj3) != b0.GIFT_CARDS) {
                                arrayList3.add(obj3);
                            }
                        }
                        travelMilesAirlineA2 = TravelMilesAirline.a(travelMilesAirline, null, arrayList3, 767);
                    }
                    if (travelMilesAirlineA2 != null) {
                        arrayList2.add(travelMilesAirlineA2);
                    }
                }
                return arrayList2;
            case 11:
                Pair pair3 = (Pair) it8;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                boolean zBooleanValue2 = ((Boolean) pair3.f186385a).booleanValue();
                hfg.e eVar = (hfg.e) pair3.f186386b;
                if (zBooleanValue2) {
                    return eVar;
                }
                List list5 = eVar.k;
                if (list5.size() == 1 && list5.get(0) == b0.GIFT_CARDS) {
                    throw new UnsupportedOperationException("GIFT_CARDS redeem type is not supported because Giftcards are disabled");
                }
                ArrayList arrayList4 = new ArrayList();
                for (Object obj4 : list5) {
                    if (((b0) obj4) != b0.GIFT_CARDS) {
                        arrayList4.add(obj4);
                    }
                }
                return hfg.e.a(eVar, null, arrayList4, 15359);
            case 12:
                Intrinsics.checkNotNullParameter((lk0.e) it8, "it");
                return null;
            case 13:
                Intrinsics.checkNotNullParameter((lk0.e) it8, "it");
                return null;
            case 14:
                Intrinsics.checkNotNullParameter((lk0.g) it8, "it");
                return Boolean.valueOf(!r1.f196174a.isEmpty());
            case 15:
                lk0.e previousPage = (lk0.e) it8;
                Intrinsics.checkNotNullParameter(previousPage, "previousPage");
                Throwable th10 = previousPage.e;
                lk0.f fVar = previousPage.f196172b;
                if (th10 != null) {
                    return (j0) fVar;
                }
                if (previousPage.f196171a.size() < 20 || (str = previousPage.d) == null) {
                    return null;
                }
                j0 j0Var = (j0) fVar;
                return new j0(j0Var.f151853a, j0Var.f151854b, j0Var.f151855c, str, j0Var.e, j0Var.f);
            case 16:
                List transactionsData = (List) it8;
                Intrinsics.checkNotNullParameter(transactionsData, "transactionsData");
                List list6 = transactionsData;
                ArrayList arrayList5 = new ArrayList(zhm.w.t(list6, 10));
                Iterator it11 = list6.iterator();
                while (it11.hasNext()) {
                    arrayList5.add(RevPointsTransaction.a(((r1) it11.next()).f201449a, f1.MILES));
                }
                return arrayList5;
            case 17:
                Intrinsics.checkNotNullParameter((Function0) it8, "it");
                efm.r rVarF = z9h.n.f(null, null, true, 3, null);
                Intrinsics.checkNotNullExpressionValue(rVarF, "just(...)");
                return rVarF;
            case 18:
                List it12 = (List) it8;
                Intrinsics.checkNotNullParameter(it12, "it");
                return zhm.w.u(it12);
            case 19:
                Intrinsics.checkNotNullParameter((lk0.e) it8, "it");
                return null;
            case 20:
                lk0.e previousPage2 = (lk0.e) it8;
                Intrinsics.checkNotNullParameter(previousPage2, "previousPage");
                if (previousPage2.f196171a.isEmpty()) {
                    return null;
                }
                return new gfg.b(((gfg.b) previousPage2.f196172b).f143406a + 20);
            case 21:
                Intrinsics.checkNotNullParameter((Function0) it8, "it");
                return f0.f322471a;
            case 22:
                Function0 defaultLoadingItems = (Function0) it8;
                Intrinsics.checkNotNullParameter(defaultLoadingItems, "defaultLoadingItems");
                return (List) defaultLoadingItems.invoke();
            case 23:
                String str2 = (String) it8;
                if (str2 != null) {
                    return new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                }
                return null;
            case 24:
                String str3 = (String) it8;
                if (str3 != null) {
                    return new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                }
                return null;
            case 25:
                dj0.d dVar = (dj0.d) it8;
                if (dVar != null) {
                    return vg2.d.a(dVar);
                }
                return null;
            case 26:
                LocalDateTime localDateTime = (LocalDateTime) it8;
                if (localDateTime != null) {
                    return new TimeClause(oi0.d.R(localDateTime), new TimeClause.Format.Pretty(q0.ONLY_DATE), null, null, 12);
                }
                return null;
            case 27:
                LocalDateTime localDateTime2 = (LocalDateTime) it8;
                if (localDateTime2 != null) {
                    return new TimeClause(oi0.d.R(localDateTime2), new TimeClause.Format.Pretty(q0.ONLY_DATE), null, null, 12);
                }
                return null;
            case 28:
                Function0 defaultLoadingItems2 = (Function0) it8;
                Intrinsics.checkNotNullParameter(defaultLoadingItems2, "defaultLoadingItems");
                return (List) defaultLoadingItems2.invoke();
            default:
                PricingPlanSubscription it13 = (PricingPlanSubscription) it8;
                Intrinsics.checkNotNullParameter(it13, "it");
                return it13.f81129a;
        }
    }

    public /* synthetic */ p(int i) {
        this.f288465a = i;
    }

    public /* synthetic */ p(Object obj2, int i) {
        this.f288465a = i;
    }
}
