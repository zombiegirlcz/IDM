package e8e;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferBroker;
import com.revolut.feature.wealth.api.domain.model.collectionquote.CollectionQuote;
import com.revolut.feature.wealth.api.domain.model.collectionquote.CollectionQuoteFee;
import com.revolut.feature.wealth.api.domain.model.collectionquote.CollectionQuoteFeeBreakdown;
import ip0.nb0;
import ip0.pb0;
import ip0.s7;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class y implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f123666a;

    public /* synthetic */ y(int i) {
        this.f123666a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        CollectionQuoteFee collectionQuoteFee = null;
        switch (this.f123666a) {
            case 0:
                Function0 function0 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(function0, "default");
                return new q(null, (List) function0.invoke());
            case 1:
                com.revolut.feature.wealth.impl.data.network.collections.a it8 = (com.revolut.feature.wealth.impl.data.network.collections.a) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                Intrinsics.checkNotNullParameter(it8, "<this>");
                List listC = it8.getCurrencies();
                ArrayList arrayList = new ArrayList(zhm.w.t(listC, 10));
                Iterator it9 = listC.iterator();
                while (it9.hasNext()) {
                    t61.a.A(xi0.b.Companion, (String) it9.next(), arrayList);
                }
                dj0.d dVarO = mo3.a.o(it8.getTotalAmount());
                dj0.d dVarO2 = mo3.a.o(it8.getTotalFee());
                dj0.d dVarO3 = mo3.a.o(it8.getTotalAmountAfterFee());
                dj0.d dVarO4 = mo3.a.o(it8.getAmountPerCurrency());
                jo3.a aVarB = it8.getAmountPerCurrencyBeforeFee();
                dj0.d dVarO5 = aVarB != null ? mo3.a.o(aVarB) : null;
                dj0.d dVarO6 = mo3.a.o(it8.getLowerLimitPerCurrency());
                dj0.d dVarO7 = mo3.a.o(it8.getLowerLimitTotal());
                o7h.j jVarD = it8.getFee();
                if (jVarD != null) {
                    Intrinsics.checkNotNullParameter(jVarD, "<this>");
                    List<o7h.i> breakdown = jVarD.getBreakdown();
                    ArrayList arrayList2 = new ArrayList(zhm.w.t(breakdown, 10));
                    for (o7h.i iVar : breakdown) {
                        Intrinsics.checkNotNullParameter(iVar, "<this>");
                        arrayList2.add(new CollectionQuoteFeeBreakdown(mo3.a.o(iVar.getSellCurrencyAmount()), iVar.getTitle(), iVar.getShortDescription(), iVar.getDescription()));
                    }
                    collectionQuoteFee = new CollectionQuoteFee(arrayList2);
                }
                return new CollectionQuote(arrayList, dVarO, dVarO2, dVarO3, dVarO4, dVarO5, dVarO6, dVarO7, collectionQuoteFee);
            case 2:
                List performance = (List) obj2;
                Intrinsics.checkNotNullParameter(performance, "performance");
                List<o7h.h> list = performance;
                ArrayList arrayList3 = new ArrayList(zhm.w.t(list, 10));
                for (o7h.h hVar : list) {
                    Intrinsics.checkNotNullParameter(hVar, "<this>");
                    String collectionKey = hVar.getCollectionKey();
                    xi0.a aVar = xi0.b.Companion;
                    String baseCurrency = hVar.getBaseCurrency();
                    aVar.getClass();
                    xi0.b bVarA = xi0.a.a(baseCurrency);
                    o7h.g performance2 = hVar.getPerformance();
                    Intrinsics.checkNotNullParameter(performance2, "<this>");
                    arrayList3.add(new xzg.g(collectionKey, bVarA, new xzg.j(new BigDecimal(performance2.getPercentageChange())), hVar.getTimestamp()));
                }
                return arrayList3;
            case 3:
                o7h.e it10 = (o7h.e) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                Intrinsics.checkNotNullParameter(it10, "<this>");
                String percentageChange = it10.getPercentageChange();
                List<o7h.f> points = it10.getPoints();
                ArrayList arrayList4 = new ArrayList(zhm.w.t(points, 10));
                for (o7h.f fVar : points) {
                    Intrinsics.checkNotNullParameter(fVar, "<this>");
                    arrayList4.add(new xzg.i(fVar.getTimestamp(), new BigDecimal(fVar.getRate()), fVar.getPercentageChange()));
                }
                return new xzg.h(percentageChange, arrayList4);
            case 4:
                o7h.k it11 = (o7h.k) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                Intrinsics.checkNotNullParameter(it11, "<this>");
                o7h.l layout = it11.getLayout();
                Intrinsics.checkNotNullParameter(layout, "<this>");
                List mainPage = layout.getMainPage();
                if (mainPage == null) {
                    mainPage = f0.f322471a;
                }
                List searchPage = layout.getSearchPage();
                if (searchPage == null) {
                    searchPage = f0.f322471a;
                }
                return new z2f.a(new z2f.b(mainPage, searchPage));
            case 5:
                o7h.d it12 = (o7h.d) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                Intrinsics.checkNotNullParameter(it12, "<this>");
                String collectionId = it12.getCollectionId();
                jo3.a fee2 = it12.getFee();
                dj0.d dVarO8 = fee2 != null ? mo3.a.o(fee2) : null;
                jo3.a totalAmount = it12.getTotalAmount();
                return new xzg.f(dVarO8, totalAmount != null ? mo3.a.o(totalAmount) : null, collectionId);
            case 6:
                String it13 = (String) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                xi0.b.Companion.getClass();
                return xi0.a.a(it13);
            case 7:
                List it14 = (List) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                List<r7h.a> list2 = it14;
                ArrayList arrayList5 = new ArrayList(zhm.w.t(list2, 10));
                for (r7h.a aVar2 : list2) {
                    Intrinsics.checkNotNullParameter(aVar2, "<this>");
                    xi0.a aVar3 = xi0.b.Companion;
                    String from = aVar2.getFrom();
                    aVar3.getClass();
                    arrayList5.add(new xzg.p(xi0.a.a(from), xi0.a.a(aVar2.getTo()), new BigDecimal(aVar2.getAsk()), new BigDecimal(aVar2.getBid()), new BigDecimal(aVar2.getMid())));
                }
                return arrayList5;
            case 8:
                c0h.b it15 = (c0h.b) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return it15.name();
            case 9:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                pb0 pb0VarB = nb0.b(pb0.Companion, "id_loading_add_debt", false, 0, false, 28);
                yp0.b.l(pb0VarB, 0, 0, 0, 0, null, false, 63);
                List listC2 = zhm.u.c(pb0VarB);
                IntRange intRange = new IntRange(1, 10, 1);
                ArrayList arrayList6 = new ArrayList(zhm.w.t(intRange, 10));
                vim.f it16 = intRange.iterator();
                while (it16.f289625c) {
                    pb0 pb0VarB2 = nb0.b(pb0.Companion, a0.d.n("LIST_ID_LOADING_ITEM_PREFIX_", it16.nextInt() - 1), false, 0, false, 30);
                    yp0.b.l(pb0VarB2, 0, 0, 0, 0, null, false, 63);
                    arrayList6.add(pb0VarB2);
                }
                return new e94.p(zhm.d0.E0(arrayList6, listC2));
            case 10:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return Boolean.TRUE;
            case 11:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 12:
                List midExchangeRates = (List) obj2;
                Intrinsics.checkNotNullParameter(midExchangeRates, "midExchangeRates");
                List list3 = midExchangeRates;
                ArrayList arrayList7 = new ArrayList(zhm.w.t(list3, 10));
                Iterator it17 = list3.iterator();
                while (it17.hasNext()) {
                    arrayList7.add(ofm.q.f0((qta.c) it17.next()));
                }
                return arrayList7;
            case 13:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                Pair pair2 = (Pair) pair.f186385a;
                Pair pair3 = (Pair) pair.f186386b;
                return new vf0.h(pair2.f186385a, pair2.f186386b, pair3.f186385a, pair3.f186386b);
            case 14:
                yja.b result = (yja.b) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                int i = eac.s.f124179a[result.ordinal()];
                if (i == 1 || i == 2) {
                    int i2 = jli.h.f175850a;
                } else {
                    if (i != 3 && i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    IllegalStateException illegalStateException = new IllegalStateException("Unexpected product article result " + result);
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                }
                return Unit.f186387a;
            case 15:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 16:
                Function0 getDefaultLoadingItems2 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems2, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems2.invoke();
            case 17:
                Function0 getDefaultLoadingItems3 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems3, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems3.invoke();
            case 18:
                Pair pair4 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair4, "<destruct>");
                List list4 = (List) pair4.f186385a;
                String str = (String) pair4.f186386b;
                if (kotlin.text.d0.W(kotlin.text.d0.F0(str).toString())) {
                    return list4;
                }
                ArrayList arrayList8 = new ArrayList();
                for (Object obj3 : list4) {
                    if (kotlin.text.d0.J(((TransferBroker) obj3).f91500a, str, true)) {
                        arrayList8.add(obj3);
                    }
                }
                return arrayList8;
            case 19:
                ListSubheaderDelegate.Model it18 = (ListSubheaderDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                Object obj4 = it18.f52715m;
                if (obj4 instanceof b1h.c) {
                    return (b1h.c) obj4;
                }
                return null;
            case 20:
                ReferralContactDelegate.Model it19 = (ReferralContactDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                Object obj5 = it19.f53167l;
                if (obj5 instanceof b1h.b) {
                    return (b1h.b) obj5;
                }
                return null;
            case 21:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 22:
                Pair it20 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return ((dj0.d) it20.f186385a).f115083b.f306286a;
            case 23:
                Pair it21 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                return Long.valueOf(((dj0.d) it21.f186385a).f115082a);
            case 24:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return null;
            case 25:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return new s7("TRANSFER_OUT_REVIEW_LOADING_FROM_LIST_ID", 0, 0, 0, 0, false, null, 126);
            case 26:
                List activeBookings = (List) obj2;
                Intrinsics.checkNotNullParameter(activeBookings, "activeBookings");
                return new hxf.f(activeBookings, f0.f322471a);
            case 27:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return ebh.c.a(5);
            case 28:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return ebh.c.a(5);
            default:
                ebi.d update = (ebi.d) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return update.f124366a.length() == 0 ? ebi.d.a(update, null, 3) : update;
        }
    }

    public /* synthetic */ y(Object obj2, int i) {
        this.f123666a = i;
    }
}
